/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/* Generated By:JavaCC: Do not edit this line. SSPTParserTokenManager.java */
package org.apache.camel.component.sql.stored.template.generated;

/** Token Manager. */
public class SSPTParserTokenManager implements SSPTParserConstants {

    /** Debug output. */
    public java.io.PrintStream debugStream = System.out;

    /** Set debug output. */
    public void setDebugStream(java.io.PrintStream ds) {
        debugStream = ds;
    }

    private final int jjStopStringLiteralDfa_0(int pos, long active0) {
        switch (pos) {
            case 0:
                if ((active0 & 0xcL) != 0L) {
                    jjmatchedKind = 17;
                    return 15;
                }
                if ((active0 & 0x2L) != 0L)
                    return 25;
                return -1;
            case 1:
                if ((active0 & 0xcL) != 0L) {
                    jjmatchedKind = 17;
                    jjmatchedPos = 1;
                    return 15;
                }
                return -1;
            case 2:
                if ((active0 & 0xcL) != 0L) {
                    jjmatchedKind = 17;
                    jjmatchedPos = 2;
                    return 15;
                }
                return -1;
            case 3:
                if ((active0 & 0x8L) != 0L) {
                    jjmatchedKind = 17;
                    jjmatchedPos = 3;
                    return 15;
                }
                return -1;
            case 4:
                if ((active0 & 0x8L) != 0L) {
                    jjmatchedKind = 17;
                    jjmatchedPos = 4;
                    return 15;
                }
                return -1;
            default:
                return -1;
        }
    }

    private final int jjStartNfa_0(int pos, long active0) {
        return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
    }

    private int jjStopAtPos(int pos, int kind) {
        jjmatchedKind = kind;
        jjmatchedPos = pos;
        return pos + 1;
    }

    private int jjMoveStringLiteralDfa0_0() {
        switch (curChar) {
            case 32:
                return jjStartNfaWithStates_0(0, 1, 25);
            case 73:
                return jjMoveStringLiteralDfa1_0(0x8L);
            case 79:
                return jjMoveStringLiteralDfa1_0(0x4L);
            default:
                return jjMoveNfa_0(8, 0);
        }
    }

    private int jjMoveStringLiteralDfa1_0(long active0) {
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(0, active0);
            return 1;
        }
        switch (curChar) {
            case 78:
                return jjMoveStringLiteralDfa2_0(active0, 0x8L);
            case 85:
                return jjMoveStringLiteralDfa2_0(active0, 0x4L);
            default:
                break;
        }
        return jjStartNfa_0(0, active0);
    }

    private int jjMoveStringLiteralDfa2_0(long old0, long active0) {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(0, old0);
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(1, active0);
            return 2;
        }
        switch (curChar) {
            case 79:
                return jjMoveStringLiteralDfa3_0(active0, 0x8L);
            case 84:
                return jjMoveStringLiteralDfa3_0(active0, 0x4L);
            default:
                break;
        }
        return jjStartNfa_0(1, active0);
    }

    private int jjMoveStringLiteralDfa3_0(long old0, long active0) {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(1, old0);
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(2, active0);
            return 3;
        }
        switch (curChar) {
            case 32:
                if ((active0 & 0x4L) != 0L)
                    return jjStopAtPos(3, 2);
                break;
            case 85:
                return jjMoveStringLiteralDfa4_0(active0, 0x8L);
            default:
                break;
        }
        return jjStartNfa_0(2, active0);
    }

    private int jjMoveStringLiteralDfa4_0(long old0, long active0) {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(2, old0);
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(3, active0);
            return 4;
        }
        switch (curChar) {
            case 84:
                return jjMoveStringLiteralDfa5_0(active0, 0x8L);
            default:
                break;
        }
        return jjStartNfa_0(3, active0);
    }

    private int jjMoveStringLiteralDfa5_0(long old0, long active0) {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(3, old0);
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(4, active0);
            return 5;
        }
        switch (curChar) {
            case 32:
                if ((active0 & 0x8L) != 0L)
                    return jjStopAtPos(5, 3);
                break;
            default:
                break;
        }
        return jjStartNfa_0(4, active0);
    }

    private int jjStartNfaWithStates_0(int pos, int kind, int state) {
        jjmatchedKind = kind;
        jjmatchedPos = pos;
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            return pos + 1;
        }
        return jjMoveNfa_0(state, pos + 1);
    }

    private int jjMoveNfa_0(int startState, int curPos) {
        int startsAt = 0;
        jjnewStateCnt = 25;
        int i = 1;
        jjstateSet[0] = startState;
        int kind = 0x7fffffff;
        for (;;) {
            if (++jjround == 0x7fffffff)
                ReInitRounds();
            if (curChar < 64) {
                long l = 1L << curChar;
                do {
                    switch (jjstateSet[--i]) {
                        case 8:
                            if ((0x7ff609c00000000L & l) != 0L) {
                                if (kind > 17)
                                    kind = 17;
                                jjCheckNAdd(15);
                            } else if ((0x100002600L & l) != 0L) {
                                if (kind > 9)
                                    kind = 9;
                                jjCheckNAddStates(0, 5);
                            } else if (curChar == 40) {
                                if (kind > 12)
                                    kind = 12;
                                jjCheckNAddTwoStates(17, 19);
                            } else if (curChar == 41) {
                                if (kind > 13)
                                    kind = 13;
                                jjCheckNAdd(4);
                            } else if (curChar == 44) {
                                if (kind > 11)
                                    kind = 11;
                                jjCheckNAdd(2);
                            }
                            if ((0x3ff200000000000L & l) != 0L) {
                                if (kind > 5)
                                    kind = 5;
                                jjCheckNAdd(0);
                            } else if (curChar == 39)
                                jjCheckNAdd(13);
                            else if (curChar == 58)
                                jjstateSet[jjnewStateCnt++] = 9;
                            else if (curChar == 36)
                                jjstateSet[jjnewStateCnt++] = 5;
                            break;
                        case 25:
                            if ((0x100002600L & l) != 0L)
                                jjCheckNAddTwoStates(24, 3);
                            else if (curChar == 41) {
                                if (kind > 13)
                                    kind = 13;
                                jjCheckNAdd(4);
                            } else if (curChar == 40) {
                                if (kind > 12)
                                    kind = 12;
                                jjCheckNAdd(19);
                            } else if (curChar == 44) {
                                if (kind > 11)
                                    kind = 11;
                                jjCheckNAdd(2);
                            }
                            if ((0x100002600L & l) != 0L)
                                jjCheckNAddTwoStates(22, 23);
                            if ((0x100002600L & l) != 0L)
                                jjCheckNAddTwoStates(21, 1);
                            break;
                        case 0:
                            if ((0x3ff200000000000L & l) == 0L)
                                break;
                            if (kind > 5)
                                kind = 5;
                            jjCheckNAdd(0);
                            break;
                        case 1:
                            if (curChar != 44)
                                break;
                            kind = 11;
                            jjCheckNAdd(2);
                            break;
                        case 2:
                            if ((0x100002600L & l) == 0L)
                                break;
                            if (kind > 11)
                                kind = 11;
                            jjCheckNAdd(2);
                            break;
                        case 3:
                            if (curChar != 41)
                                break;
                            if (kind > 13)
                                kind = 13;
                            jjCheckNAdd(4);
                            break;
                        case 4:
                            if ((0x100002600L & l) == 0L)
                                break;
                            if (kind > 13)
                                kind = 13;
                            jjCheckNAdd(4);
                            break;
                        case 6:
                            if ((0x7ff609d00000000L & l) != 0L)
                                jjAddStates(6, 7);
                            break;
                        case 9:
                            if (curChar == 35)
                                jjCheckNAdd(10);
                            break;
                        case 10:
                            if ((0x7ff609c00000000L & l) == 0L)
                                break;
                            if (kind > 15)
                                kind = 15;
                            jjCheckNAdd(10);
                            break;
                        case 11:
                            if (curChar == 58)
                                jjstateSet[jjnewStateCnt++] = 9;
                            break;
                        case 12:
                            if (curChar == 39)
                                jjCheckNAdd(13);
                            break;
                        case 13:
                            if ((0x7ff609c00000000L & l) != 0L)
                                jjCheckNAddTwoStates(13, 14);
                            break;
                        case 14:
                            if (curChar == 39 && kind > 16)
                                kind = 16;
                            break;
                        case 15:
                            if ((0x7ff609c00000000L & l) == 0L)
                                break;
                            if (kind > 17)
                                kind = 17;
                            jjCheckNAdd(15);
                            break;
                        case 16:
                            if (curChar != 40)
                                break;
                            if (kind > 12)
                                kind = 12;
                            jjCheckNAddTwoStates(17, 19);
                            break;
                        case 17:
                            if ((0x3ff200000000000L & l) != 0L)
                                jjCheckNAddTwoStates(17, 18);
                            break;
                        case 18:
                            if (curChar == 41 && kind > 4)
                                kind = 4;
                            break;
                        case 19:
                            if ((0x100002600L & l) == 0L)
                                break;
                            if (kind > 12)
                                kind = 12;
                            jjCheckNAdd(19);
                            break;
                        case 20:
                            if ((0x100002600L & l) == 0L)
                                break;
                            if (kind > 9)
                                kind = 9;
                            jjCheckNAddStates(0, 5);
                            break;
                        case 21:
                            if ((0x100002600L & l) != 0L)
                                jjCheckNAddTwoStates(21, 1);
                            break;
                        case 22:
                            if ((0x100002600L & l) != 0L)
                                jjCheckNAddTwoStates(22, 23);
                            break;
                        case 23:
                            if (curChar != 40)
                                break;
                            if (kind > 12)
                                kind = 12;
                            jjCheckNAdd(19);
                            break;
                        case 24:
                            if ((0x100002600L & l) != 0L)
                                jjCheckNAddTwoStates(24, 3);
                            break;
                        default:
                            break;
                    }
                } while (i != startsAt);
            } else if (curChar < 128) {
                long l = 1L << (curChar & 077);
                do {
                    switch (jjstateSet[--i]) {
                        case 8:
                        case 15:
                            if ((0x2ffffffeaffffffeL & l) == 0L)
                                break;
                            if (kind > 17)
                                kind = 17;
                            jjCheckNAdd(15);
                            break;
                        case 5:
                            if (curChar == 123)
                                jjCheckNAdd(6);
                            break;
                        case 6:
                            if ((0x2ffffffeaffffffeL & l) != 0L)
                                jjCheckNAddTwoStates(6, 7);
                            break;
                        case 7:
                            if (curChar == 125 && kind > 14)
                                kind = 14;
                            break;
                        case 10:
                            if ((0x2ffffffeaffffffeL & l) == 0L)
                                break;
                            if (kind > 15)
                                kind = 15;
                            jjstateSet[jjnewStateCnt++] = 10;
                            break;
                        case 13:
                            if ((0x2ffffffeaffffffeL & l) != 0L)
                                jjAddStates(8, 9);
                            break;
                        default:
                            break;
                    }
                } while (i != startsAt);
            } else {
                int i2 = (curChar & 0xff) >> 6;
                long l2 = 1L << (curChar & 077);
                do {
                    switch (jjstateSet[--i]) {
                        default:
                            break;
                    }
                } while (i != startsAt);
            }
            if (kind != 0x7fffffff) {
                jjmatchedKind = kind;
                jjmatchedPos = curPos;
                kind = 0x7fffffff;
            }
            ++curPos;
            if ((i = jjnewStateCnt) == (startsAt = 25 - (jjnewStateCnt = startsAt)))
                return curPos;
            try {
                curChar = input_stream.readChar();
            } catch (java.io.IOException e) {
                return curPos;
            }
        }
    }

    static final int[] jjnextStates = {
            21, 1, 22, 23, 24, 3, 6, 7, 13, 14,
    };

    /** Token literal values. */
    public static final String[] jjstrLiteralImages = {
            "", "\40", "\117\125\124\40", "\111\116\117\125\124\40", null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, };

    /** Lexer state names. */
    public static final String[] lexStateNames = {
            "DEFAULT",
    };
    protected SimpleCharStream input_stream;
    private final int[] jjrounds = new int[25];
    private final int[] jjstateSet = new int[50];
    protected char curChar;

    /** Constructor. */
    public SSPTParserTokenManager(SimpleCharStream stream) {
        if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
        input_stream = stream;
    }

    /** Constructor. */
    public SSPTParserTokenManager(SimpleCharStream stream, int lexState) {
        this(stream);
        SwitchTo(lexState);
    }

    /** Reinitialise parser. */
    public void ReInit(SimpleCharStream stream) {
        jjmatchedPos = jjnewStateCnt = 0;
        curLexState = defaultLexState;
        input_stream = stream;
        ReInitRounds();
    }

    private void ReInitRounds() {
        int i;
        jjround = 0x80000001;
        for (i = 25; i-- > 0;)
            jjrounds[i] = 0x80000000;
    }

    /** Reinitialise parser. */
    public void ReInit(SimpleCharStream stream, int lexState) {
        ReInit(stream);
        SwitchTo(lexState);
    }

    /** Switch to specified lex state. */
    public void SwitchTo(int lexState) {
        if (lexState >= 1 || lexState < 0)
            throw new TokenMgrError(
                    "Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.",
                    TokenMgrError.INVALID_LEXICAL_STATE);
        else
            curLexState = lexState;
    }

    protected Token jjFillToken() {
        final Token t;
        final String curTokenImage;
        final int beginLine;
        final int endLine;
        final int beginColumn;
        final int endColumn;
        String im = jjstrLiteralImages[jjmatchedKind];
        curTokenImage = (im == null) ? input_stream.GetImage() : im;
        beginLine = input_stream.getBeginLine();
        beginColumn = input_stream.getBeginColumn();
        endLine = input_stream.getEndLine();
        endColumn = input_stream.getEndColumn();
        t = Token.newToken(jjmatchedKind, curTokenImage);

        t.beginLine = beginLine;
        t.endLine = endLine;
        t.beginColumn = beginColumn;
        t.endColumn = endColumn;

        return t;
    }

    int curLexState = 0;
    int defaultLexState = 0;
    int jjnewStateCnt;
    int jjround;
    int jjmatchedPos;
    int jjmatchedKind;

    /** Get the next Token. */
    public Token getNextToken() {
        Token matchedToken;
        int curPos = 0;

        EOFLoop: for (;;) {
            try {
                curChar = input_stream.BeginToken();
            } catch (java.io.IOException e) {
                jjmatchedKind = 0;
                matchedToken = jjFillToken();
                return matchedToken;
            }

            jjmatchedKind = 0x7fffffff;
            jjmatchedPos = 0;
            curPos = jjMoveStringLiteralDfa0_0();
            if (jjmatchedKind != 0x7fffffff) {
                if (jjmatchedPos + 1 < curPos)
                    input_stream.backup(curPos - jjmatchedPos - 1);
                matchedToken = jjFillToken();
                return matchedToken;
            }
            int error_line = input_stream.getEndLine();
            int error_column = input_stream.getEndColumn();
            String error_after = null;
            boolean EOFSeen = false;
            try {
                input_stream.readChar();
                input_stream.backup(1);
            } catch (java.io.IOException e1) {
                EOFSeen = true;
                error_after = curPos <= 1 ? "" : input_stream.GetImage();
                if (curChar == '\n' || curChar == '\r') {
                    error_line++;
                    error_column = 0;
                } else
                    error_column++;
            }
            if (!EOFSeen) {
                input_stream.backup(1);
                error_after = curPos <= 1 ? "" : input_stream.GetImage();
            }
            throw new TokenMgrError(
                    EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
        }
    }

    private void jjCheckNAdd(int state) {
        if (jjrounds[state] != jjround) {
            jjstateSet[jjnewStateCnt++] = state;
            jjrounds[state] = jjround;
        }
    }

    private void jjAddStates(int start, int end) {
        do {
            jjstateSet[jjnewStateCnt++] = jjnextStates[start];
        } while (start++ != end);
    }

    private void jjCheckNAddTwoStates(int state1, int state2) {
        jjCheckNAdd(state1);
        jjCheckNAdd(state2);
    }

    private void jjCheckNAddStates(int start, int end) {
        do {
            jjCheckNAdd(jjnextStates[start]);
        } while (start++ != end);
    }

}
