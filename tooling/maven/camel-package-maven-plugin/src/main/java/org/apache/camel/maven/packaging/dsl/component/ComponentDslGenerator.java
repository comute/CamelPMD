package org.apache.camel.maven.packaging.dsl.component;

import java.util.Objects;

import org.apache.camel.maven.packaging.model.ComponentModel;
import org.apache.camel.tooling.util.srcgen.JavaClass;

public class ComponentDslGenerator {
    private static final String COMPONENT_DSL_PACKAGE_NAME = "org.apache.camel.builder.component";
    private static final String BUILDER_FACTORY_SUFFIX = "BuilderFactory";

    private final ComponentModel componentModel;
    private JavaClass javaClass;
    private ComponentDslGenerator(final ComponentModel componentModel, final ClassLoader classLoader) {
        this.componentModel = componentModel;

        javaClass = new JavaClass(classLoader);
        // generate java class
        generateJavaClass();
    }

    public static ComponentDslGenerator createDslJavaClassFromComponentModel(final ComponentModel componentModel, final ClassLoader classLoader) {
        Objects.requireNonNull(componentModel);
        Objects.requireNonNull(classLoader);

        return new ComponentDslGenerator(componentModel, classLoader);
    }

    public String printClassAsString() {
        return javaClass.printClass(true);
    }

    @Override
    public String toString() {
        return printClassAsString();
    }

    private void generateJavaClass() {
        setPackage();
        setImports();
        setBuilderFactoryClassNameAndType();
        ComponentDslInnerBuilderGenerator.generateInnerClass(javaClass.addNestedType(), componentModel);
    }

    private void setPackage() {
        javaClass.setPackage(COMPONENT_DSL_PACKAGE_NAME + ".dsl");
    }

    private void setImports() {
        javaClass.addImport("org.apache.camel.Component");
        javaClass.addImport("org.apache.camel.builder.component.AbstractComponentBuilder");
        javaClass.addImport("org.apache.camel.builder.component.ComponentBuilder");
        javaClass.addImport(componentModel.getJavaType());
    }

    private void setBuilderFactoryClassNameAndType() {
        final String className = componentModel.getShortJavaType() + BUILDER_FACTORY_SUFFIX;
        javaClass.setName(className);

    }
}
