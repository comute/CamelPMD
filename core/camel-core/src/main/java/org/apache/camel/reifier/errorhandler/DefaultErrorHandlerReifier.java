package org.apache.camel.reifier.errorhandler;

import java.util.concurrent.ScheduledExecutorService;

import org.apache.camel.CamelContext;
import org.apache.camel.ErrorHandlerFactory;
import org.apache.camel.Processor;
import org.apache.camel.builder.DefaultErrorHandlerBuilder;
import org.apache.camel.processor.errorhandler.DefaultErrorHandler;
import org.apache.camel.spi.ExecutorServiceManager;
import org.apache.camel.spi.RouteContext;
import org.apache.camel.spi.ThreadPoolProfile;

public class DefaultErrorHandlerReifier<T extends DefaultErrorHandlerBuilder> extends ErrorHandlerReifier<T> {

    public DefaultErrorHandlerReifier(ErrorHandlerFactory definition) {
        super((T) definition);
    }

    public Processor createErrorHandler(RouteContext routeContext, Processor processor) throws Exception {
        DefaultErrorHandler answer = new DefaultErrorHandler(
                routeContext.getCamelContext(),
                processor,
                definition.getLogger(),
                definition.getOnRedelivery(),
                definition.getRedeliveryPolicy(),
                definition.getExceptionPolicyStrategy(),
                definition.getRetryWhilePolicy(routeContext.getCamelContext()),
                getExecutorService(routeContext.getCamelContext()),
                definition.getOnPrepareFailure(),
                definition.getOnExceptionOccurred());
        // configure error handler before we can use it
        configure(routeContext, answer);
        return answer;
    }

    protected synchronized ScheduledExecutorService getExecutorService(CamelContext camelContext) {
        ScheduledExecutorService executorService = definition.getExecutorService();
        String executorServiceRef = definition.getExecutorServiceRef();
        if (executorService == null || executorService.isShutdown()) {
            // camel context will shutdown the executor when it shutdown so no need to shut it down when stopping
            if (executorServiceRef != null) {
                executorService = camelContext.getRegistry().lookupByNameAndType(executorServiceRef, ScheduledExecutorService.class);
                if (executorService == null) {
                    ExecutorServiceManager manager = camelContext.getExecutorServiceManager();
                    ThreadPoolProfile profile = manager.getThreadPoolProfile(executorServiceRef);
                    executorService = manager.newScheduledThreadPool(this, executorServiceRef, profile);
                }
                if (executorService == null) {
                    throw new IllegalArgumentException("ExecutorServiceRef " + executorServiceRef + " not found in registry.");
                }
            } else {
                // no explicit configured thread pool, so leave it up to the error handler to decide if it need
                // a default thread pool from CamelContext#getErrorHandlerExecutorService
                executorService = null;
            }
            // TODO: ErrorHandler: no modification to the model should be done
            definition.setExecutorService(executorService);
        }
        return executorService;
    }

}
