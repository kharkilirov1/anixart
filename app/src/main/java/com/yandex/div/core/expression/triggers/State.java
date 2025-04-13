package com.yandex.div.core.expression.triggers;

import kotlin.Metadata;

/* compiled from: ConditionPart.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/core/expression/triggers/State;", "", "Companion", "End", "EndOfString", "Function", "Input", "QuotedString", "QuotedStringEscaped", "Raw", "Start", "Variable", "Lcom/yandex/div/core/expression/triggers/State$Start;", "Lcom/yandex/div/core/expression/triggers/State$Raw;", "Lcom/yandex/div/core/expression/triggers/State$Variable;", "Lcom/yandex/div/core/expression/triggers/State$Function;", "Lcom/yandex/div/core/expression/triggers/State$QuotedString;", "Lcom/yandex/div/core/expression/triggers/State$QuotedStringEscaped;", "Lcom/yandex/div/core/expression/triggers/State$EndOfString;", "Lcom/yandex/div/core/expression/triggers/State$End;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
interface State {

    /* compiled from: ConditionPart.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/expression/triggers/State$Companion;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {

        /* compiled from: ConditionPart.kt */
        @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[Input.values().length];
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[5] = 5;
                iArr[4] = 6;
                iArr[6] = 7;
            }
        }
    }

    /* compiled from: ConditionPart.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/expression/triggers/State$End;", "Lcom/yandex/div/core/expression/triggers/State;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class End implements State {
    }

    /* compiled from: ConditionPart.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/expression/triggers/State$EndOfString;", "Lcom/yandex/div/core/expression/triggers/State;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class EndOfString implements State {
    }

    /* compiled from: ConditionPart.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/expression/triggers/State$Function;", "Lcom/yandex/div/core/expression/triggers/State;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Function implements State {
    }

    /* compiled from: ConditionPart.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m31884d2 = {"Lcom/yandex/div/core/expression/triggers/State$Input;", "", "Companion", "Letter", "VarSpecial", "OpeningBracket", "Other", "SingleQuote", "EscapeCharacter", "EndOfLine", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum Input {
        Letter,
        VarSpecial,
        OpeningBracket,
        Other,
        SingleQuote,
        EscapeCharacter,
        EndOfLine;

        /* compiled from: ConditionPart.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/expression/triggers/State$Input$Companion;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
        }
    }

    /* compiled from: ConditionPart.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/expression/triggers/State$QuotedString;", "Lcom/yandex/div/core/expression/triggers/State;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class QuotedString implements State {

        /* compiled from: ConditionPart.kt */
        @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[Input.values().length];
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 5;
                iArr[5] = 6;
                iArr[6] = 7;
            }
        }
    }

    /* compiled from: ConditionPart.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/expression/triggers/State$QuotedStringEscaped;", "Lcom/yandex/div/core/expression/triggers/State;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class QuotedStringEscaped implements State {

        /* compiled from: ConditionPart.kt */
        @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[Input.values().length];
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[5] = 5;
                iArr[4] = 6;
                iArr[6] = 7;
            }
        }
    }

    /* compiled from: ConditionPart.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/expression/triggers/State$Raw;", "Lcom/yandex/div/core/expression/triggers/State;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Raw implements State {

        /* compiled from: ConditionPart.kt */
        @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[Input.values().length];
                iArr[3] = 1;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[5] = 4;
                iArr[0] = 5;
                iArr[4] = 6;
                iArr[6] = 7;
            }
        }
    }

    /* compiled from: ConditionPart.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/expression/triggers/State$Start;", "Lcom/yandex/div/core/expression/triggers/State;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Start implements State {
    }

    /* compiled from: ConditionPart.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/expression/triggers/State$Variable;", "Lcom/yandex/div/core/expression/triggers/State;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Variable implements State {

        /* compiled from: ConditionPart.kt */
        @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[Input.values().length];
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[5] = 5;
                iArr[4] = 6;
                iArr[6] = 7;
            }
        }
    }
}
