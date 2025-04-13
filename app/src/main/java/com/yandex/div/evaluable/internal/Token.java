package com.yandex.div.evaluable.internal;

import androidx.room.util.C0576a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Token.kt */
@Metadata(m31883d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\t\u0007\b\t\n\u000b\f\r\u000e\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token;", "", "Bracket", "Function", "Operand", "Operator", "StringTemplate", "Lcom/yandex/div/evaluable/internal/Token$Operand;", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "Lcom/yandex/div/evaluable/internal/Token$Function;", "Lcom/yandex/div/evaluable/internal/Token$Function$ArgumentDelimiter;", "Lcom/yandex/div/evaluable/internal/Token$StringTemplate$Start;", "Lcom/yandex/div/evaluable/internal/Token$StringTemplate$End;", "Lcom/yandex/div/evaluable/internal/Token$StringTemplate$StartOfExpression;", "Lcom/yandex/div/evaluable/internal/Token$StringTemplate$EndOfExpression;", "Lcom/yandex/div/evaluable/internal/Token$Bracket;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface Token {

    /* compiled from: Token.kt */
    @Metadata(m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Bracket;", "Lcom/yandex/div/evaluable/internal/Token;", "LeftRound", "RightRound", "Lcom/yandex/div/evaluable/internal/Token$Bracket$LeftRound;", "Lcom/yandex/div/evaluable/internal/Token$Bracket$RightRound;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1}, m31888xi = 48)
    public interface Bracket extends Token {

        /* compiled from: Token.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Bracket$LeftRound;", "Lcom/yandex/div/evaluable/internal/Token$Bracket;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class LeftRound implements Bracket {

            /* renamed from: a */
            @NotNull
            public static final LeftRound f33604a = new LeftRound();

            @NotNull
            public String toString() {
                return "(";
            }
        }

        /* compiled from: Token.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Bracket$RightRound;", "Lcom/yandex/div/evaluable/internal/Token$Bracket;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class RightRound implements Bracket {

            /* renamed from: a */
            @NotNull
            public static final RightRound f33605a = new RightRound();

            @NotNull
            public String toString() {
                return ")";
            }
        }
    }

    /* compiled from: Token.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Function;", "Lcom/yandex/div/evaluable/internal/Token;", "ArgumentDelimiter", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final /* data */ class Function implements Token {

        /* renamed from: a */
        @NotNull
        public final String f33606a;

        /* compiled from: Token.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Function$ArgumentDelimiter;", "Lcom/yandex/div/evaluable/internal/Token;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class ArgumentDelimiter implements Token {

            /* renamed from: a */
            @NotNull
            public static final ArgumentDelimiter f33607a = new ArgumentDelimiter();

            @NotNull
            public String toString() {
                return ",";
            }
        }

        public Function(@NotNull String str) {
            this.f33606a = str;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Function) && Intrinsics.m32174c(this.f33606a, ((Function) obj).f33606a);
        }

        public int hashCode() {
            return this.f33606a.hashCode();
        }

        @NotNull
        public String toString() {
            return C0576a.m4118q(C0000a.m24u("Function(name="), this.f33606a, ')');
        }
    }

    /* compiled from: Token.kt */
    @Metadata(m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0003\u0004\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operand;", "Lcom/yandex/div/evaluable/internal/Token;", "Literal", "Variable", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal;", "Lcom/yandex/div/evaluable/internal/Token$Operand$Variable;", "Lcom/yandex/div/evaluable/internal/Token$StringTemplate;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1}, m31888xi = 48)
    public interface Operand extends Token {

        /* compiled from: Token.kt */
        @Metadata(m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operand$Literal;", "Lcom/yandex/div/evaluable/internal/Token$Operand;", "Bool", "Num", "Str", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal$Num;", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal$Bool;", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal$Str;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1}, m31888xi = 48)
        public interface Literal extends Operand {

            /* compiled from: Token.kt */
            @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operand$Literal$Bool;", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal;", "value", "", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
            @JvmInline
            public static final class Bool implements Literal {

                /* renamed from: a, reason: from toString */
                public final boolean value;

                public boolean equals(Object obj) {
                    return (obj instanceof Bool) && this.value == ((Bool) obj).value;
                }

                public int hashCode() {
                    boolean z = this.value;
                    if (z) {
                        return 1;
                    }
                    return z ? 1 : 0;
                }

                public String toString() {
                    return "Bool(value=" + this.value + ')';
                }
            }

            /* compiled from: Token.kt */
            @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operand$Literal$Num;", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal;", "value", "", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
            @JvmInline
            public static final class Num implements Literal {

                /* renamed from: a, reason: from toString */
                @NotNull
                public final Number value;

                public boolean equals(Object obj) {
                    return (obj instanceof Num) && Intrinsics.m32174c(this.value, ((Num) obj).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Num(value=" + this.value + ')';
                }
            }

            /* compiled from: Token.kt */
            @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operand$Literal$Str;", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal;", "value", "", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
            @JvmInline
            public static final class Str implements Literal {

                /* renamed from: a */
                @NotNull
                public final String f33610a;

                public boolean equals(Object obj) {
                    return (obj instanceof Str) && Intrinsics.m32174c(this.f33610a, ((Str) obj).f33610a);
                }

                public int hashCode() {
                    return this.f33610a.hashCode();
                }

                public String toString() {
                    return C0000a.m15l("Str(value=", this.f33610a, ')');
                }
            }
        }

        /* compiled from: Token.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operand$Variable;", "Lcom/yandex/div/evaluable/internal/Token$Operand;", "name", "", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
        @JvmInline
        public static final class Variable implements Operand {

            /* renamed from: a */
            @NotNull
            public final String f33611a;

            public boolean equals(Object obj) {
                return (obj instanceof Variable) && Intrinsics.m32174c(this.f33611a, ((Variable) obj).f33611a);
            }

            public int hashCode() {
                return this.f33611a.hashCode();
            }

            public String toString() {
                return C0000a.m15l("Variable(name=", this.f33611a, ')');
            }
        }
    }

    /* compiled from: Token.kt */
    @Metadata(m31883d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator;", "Lcom/yandex/div/evaluable/internal/Token;", "Binary", "TernaryElse", "TernaryIf", "TernaryIfElse", "Unary", "Lcom/yandex/div/evaluable/internal/Token$Operator$Unary;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "Lcom/yandex/div/evaluable/internal/Token$Operator$TernaryIf;", "Lcom/yandex/div/evaluable/internal/Token$Operator$TernaryElse;", "Lcom/yandex/div/evaluable/internal/Token$Operator$TernaryIfElse;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1}, m31888xi = 48)
    public interface Operator extends Token {

        /* compiled from: Token.kt */
        @Metadata(m31883d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "Comparison", "Equality", "Factor", "Logical", "Power", "Sum", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Power;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1}, m31888xi = 48)
        public interface Binary extends Operator {

            /* compiled from: Token.kt */
            @Metadata(m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "Greater", "GreaterOrEqual", "Less", "LessOrEqual", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison$Greater;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison$GreaterOrEqual;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison$Less;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison$LessOrEqual;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1}, m31888xi = 48)
            public interface Comparison extends Binary {

                /* compiled from: Token.kt */
                @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison$Greater;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
                public static final class Greater implements Comparison {

                    /* renamed from: a */
                    @NotNull
                    public static final Greater f33612a = new Greater();

                    @NotNull
                    public String toString() {
                        return ">";
                    }
                }

                /* compiled from: Token.kt */
                @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison$GreaterOrEqual;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
                public static final class GreaterOrEqual implements Comparison {

                    /* renamed from: a */
                    @NotNull
                    public static final GreaterOrEqual f33613a = new GreaterOrEqual();

                    @NotNull
                    public String toString() {
                        return ">=";
                    }
                }

                /* compiled from: Token.kt */
                @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison$Less;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
                public static final class Less implements Comparison {

                    /* renamed from: a */
                    @NotNull
                    public static final Less f33614a = new Less();

                    @NotNull
                    public String toString() {
                        return "<";
                    }
                }

                /* compiled from: Token.kt */
                @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison$LessOrEqual;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
                public static final class LessOrEqual implements Comparison {

                    /* renamed from: a */
                    @NotNull
                    public static final LessOrEqual f33615a = new LessOrEqual();

                    @NotNull
                    public String toString() {
                        return "<=";
                    }
                }
            }

            /* compiled from: Token.kt */
            @Metadata(m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "Equal", "NotEqual", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality$Equal;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality$NotEqual;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1}, m31888xi = 48)
            public interface Equality extends Binary {

                /* compiled from: Token.kt */
                @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality$Equal;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
                public static final class Equal implements Equality {

                    /* renamed from: a */
                    @NotNull
                    public static final Equal f33616a = new Equal();

                    @NotNull
                    public String toString() {
                        return "==";
                    }
                }

                /* compiled from: Token.kt */
                @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality$NotEqual;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
                public static final class NotEqual implements Equality {

                    /* renamed from: a */
                    @NotNull
                    public static final NotEqual f33617a = new NotEqual();

                    @NotNull
                    public String toString() {
                        return "!=";
                    }
                }
            }

            /* compiled from: Token.kt */
            @Metadata(m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "Division", "Modulo", "Multiplication", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor$Multiplication;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor$Division;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor$Modulo;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1}, m31888xi = 48)
            public interface Factor extends Binary {

                /* compiled from: Token.kt */
                @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor$Division;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
                public static final class Division implements Factor {

                    /* renamed from: a */
                    @NotNull
                    public static final Division f33618a = new Division();

                    @NotNull
                    public String toString() {
                        return "/";
                    }
                }

                /* compiled from: Token.kt */
                @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor$Modulo;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
                public static final class Modulo implements Factor {

                    /* renamed from: a */
                    @NotNull
                    public static final Modulo f33619a = new Modulo();

                    @NotNull
                    public String toString() {
                        return "%";
                    }
                }

                /* compiled from: Token.kt */
                @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor$Multiplication;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
                public static final class Multiplication implements Factor {

                    /* renamed from: a */
                    @NotNull
                    public static final Multiplication f33620a = new Multiplication();

                    @NotNull
                    public String toString() {
                        return "*";
                    }
                }
            }

            /* compiled from: Token.kt */
            @Metadata(m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "And", "Or", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical$And;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical$Or;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1}, m31888xi = 48)
            public interface Logical extends Binary {

                /* compiled from: Token.kt */
                @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical$And;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
                public static final class And implements Logical {

                    /* renamed from: a */
                    @NotNull
                    public static final And f33621a = new And();

                    @NotNull
                    public String toString() {
                        return "&&";
                    }
                }

                /* compiled from: Token.kt */
                @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical$Or;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
                /* renamed from: com.yandex.div.evaluable.internal.Token$Operator$Binary$Logical$Or */
                public static final class C2893Or implements Logical {

                    /* renamed from: a */
                    @NotNull
                    public static final C2893Or f33622a = new C2893Or();

                    @NotNull
                    public String toString() {
                        return "||";
                    }
                }
            }

            /* compiled from: Token.kt */
            @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Power;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
            public static final class Power implements Binary {

                /* renamed from: a */
                @NotNull
                public static final Power f33623a = new Power();

                @NotNull
                public String toString() {
                    return "^";
                }
            }

            /* compiled from: Token.kt */
            @Metadata(m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "Minus", "Plus", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum$Plus;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum$Minus;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1}, m31888xi = 48)
            public interface Sum extends Binary {

                /* compiled from: Token.kt */
                @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum$Minus;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
                public static final class Minus implements Sum {

                    /* renamed from: a */
                    @NotNull
                    public static final Minus f33624a = new Minus();

                    @NotNull
                    public String toString() {
                        return "-";
                    }
                }

                /* compiled from: Token.kt */
                @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum$Plus;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
                public static final class Plus implements Sum {

                    /* renamed from: a */
                    @NotNull
                    public static final Plus f33625a = new Plus();

                    @NotNull
                    public String toString() {
                        return "+";
                    }
                }
            }
        }

        /* compiled from: Token.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$TernaryElse;", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class TernaryElse implements Operator {

            /* renamed from: a */
            @NotNull
            public static final TernaryElse f33626a = new TernaryElse();

            @NotNull
            public String toString() {
                return ":";
            }
        }

        /* compiled from: Token.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$TernaryIf;", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class TernaryIf implements Operator {

            /* renamed from: a */
            @NotNull
            public static final TernaryIf f33627a = new TernaryIf();

            @NotNull
            public String toString() {
                return "?";
            }
        }

        /* compiled from: Token.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$TernaryIfElse;", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class TernaryIfElse implements Operator {

            /* renamed from: a */
            @NotNull
            public static final TernaryIfElse f33628a = new TernaryIfElse();
        }

        /* compiled from: Token.kt */
        @Metadata(m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Unary;", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "Minus", "Not", "Plus", "Lcom/yandex/div/evaluable/internal/Token$Operator$Unary$Plus;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Unary$Minus;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Unary$Not;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1}, m31888xi = 48)
        public interface Unary extends Operator {

            /* compiled from: Token.kt */
            @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Unary$Minus;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Unary;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
            public static final class Minus implements Unary {

                /* renamed from: a */
                @NotNull
                public static final Minus f33629a = new Minus();

                @NotNull
                public String toString() {
                    return "-";
                }
            }

            /* compiled from: Token.kt */
            @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Unary$Not;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Unary;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
            public static final class Not implements Unary {

                /* renamed from: a */
                @NotNull
                public static final Not f33630a = new Not();

                @NotNull
                public String toString() {
                    return "!";
                }
            }

            /* compiled from: Token.kt */
            @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Unary$Plus;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Unary;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
            public static final class Plus implements Unary {

                /* renamed from: a */
                @NotNull
                public static final Plus f33631a = new Plus();

                @NotNull
                public String toString() {
                    return "+";
                }
            }
        }
    }

    /* compiled from: Token.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$StringTemplate;", "Lcom/yandex/div/evaluable/internal/Token$Operand;", "End", "EndOfExpression", "Start", "StartOfExpression", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class StringTemplate implements Operand {

        /* compiled from: Token.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$StringTemplate$End;", "Lcom/yandex/div/evaluable/internal/Token;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class End implements Token {

            /* renamed from: a */
            @NotNull
            public static final End f33632a = new End();
        }

        /* compiled from: Token.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$StringTemplate$EndOfExpression;", "Lcom/yandex/div/evaluable/internal/Token;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class EndOfExpression implements Token {

            /* renamed from: a */
            @NotNull
            public static final EndOfExpression f33633a = new EndOfExpression();
        }

        /* compiled from: Token.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$StringTemplate$Start;", "Lcom/yandex/div/evaluable/internal/Token;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Start implements Token {

            /* renamed from: a */
            @NotNull
            public static final Start f33634a = new Start();
        }

        /* compiled from: Token.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Token$StringTemplate$StartOfExpression;", "Lcom/yandex/div/evaluable/internal/Token;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class StartOfExpression implements Token {

            /* renamed from: a */
            @NotNull
            public static final StartOfExpression f33635a = new StartOfExpression();
        }
    }
}
