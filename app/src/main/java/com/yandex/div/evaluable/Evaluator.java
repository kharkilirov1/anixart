package com.yandex.div.evaluable;

import com.yandex.div.evaluable.internal.Token;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Evaluator.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/evaluable/Evaluator;", "", "Companion", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class Evaluator {

    /* renamed from: c */
    @NotNull
    public static final Companion f33163c = new Companion(null);

    /* renamed from: a */
    @NotNull
    public final VariableProvider f33164a;

    /* renamed from: b */
    @NotNull
    public final FunctionProvider f33165b;

    /* compiled from: Evaluator.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/Evaluator$Companion;", "", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
        
            if (r4 == r0.longValue()) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.m32174c(r19, -1L) != false) goto L21;
         */
        @org.jetbrains.annotations.NotNull
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object m17228a(@org.jetbrains.annotations.NotNull com.yandex.div.evaluable.internal.Token.Operator.Binary.Factor r17, @org.jetbrains.annotations.NotNull java.lang.Object r18, @org.jetbrains.annotations.NotNull java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 433
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.evaluable.Evaluator.Companion.m17228a(com.yandex.div.evaluable.internal.Token$Operator$Binary$Factor, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        @NotNull
        /* renamed from: b */
        public final Object m17229b(@NotNull Token.Operator.Binary.Sum operator, @NotNull Object left, @NotNull Object right) {
            double doubleValue;
            Intrinsics.m32179h(operator, "operator");
            Intrinsics.m32179h(left, "left");
            Intrinsics.m32179h(right, "right");
            if ((left instanceof String) && (right instanceof String)) {
                if (!(operator instanceof Token.Operator.Binary.Sum.Plus)) {
                    EvaluableExceptionKt.m17219b(operator, left, right);
                    throw null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(left);
                sb.append(right);
                return sb.toString();
            }
            if (!(left instanceof Long) || !(right instanceof Long)) {
                if (!(left instanceof Double) || !(right instanceof Double)) {
                    EvaluableExceptionKt.m17219b(operator, left, right);
                    throw null;
                }
                if (operator instanceof Token.Operator.Binary.Sum.Plus) {
                    doubleValue = ((Number) right).doubleValue() + ((Number) left).doubleValue();
                } else {
                    if (!(operator instanceof Token.Operator.Binary.Sum.Minus)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    doubleValue = ((Number) left).doubleValue() - ((Number) right).doubleValue();
                }
                return Double.valueOf(doubleValue);
            }
            if (operator instanceof Token.Operator.Binary.Sum.Plus) {
                Number number = (Number) left;
                Number number2 = (Number) right;
                long longValue = number2.longValue() + number.longValue();
                if (((number.longValue() ^ longValue) & (number2.longValue() ^ longValue)) >= 0) {
                    return Long.valueOf(longValue);
                }
                throw new IntegerOverflow(left + " + " + right, null, 2);
            }
            if (!(operator instanceof Token.Operator.Binary.Sum.Minus)) {
                throw new NoWhenBranchMatchedException();
            }
            Number number3 = (Number) left;
            Number number4 = (Number) right;
            long longValue2 = number3.longValue() - number4.longValue();
            if (((number3.longValue() ^ number4.longValue()) & (number3.longValue() ^ longValue2)) >= 0) {
                return Long.valueOf(longValue2);
            }
            throw new IntegerOverflow(left + " - " + right, null, 2);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public Evaluator(@NotNull VariableProvider variableProvider, @NotNull FunctionProvider functionProvider) {
        Intrinsics.m32179h(functionProvider, "functionProvider");
        this.f33164a = variableProvider;
        this.f33165b = functionProvider;
    }

    /* renamed from: a */
    public final <T> T m17226a(@NotNull Evaluable expr) throws EvaluableException {
        Intrinsics.m32179h(expr, "expr");
        try {
            return (T) expr.m17214a(this);
        } catch (EvaluableException e2) {
            throw e2;
        } catch (Exception e3) {
            String message = e3.getMessage();
            if (message == null) {
                message = "";
            }
            throw new EvaluableException(message, e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r5.compareTo(r6) <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0022, code lost:
    
        if (r5.compareTo(r6) >= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        if (r5.compareTo(r6) > 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r5.compareTo(r6) < 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        return java.lang.Boolean.valueOf(r1);
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T extends java.lang.Comparable<? super T>> java.lang.Object m17227b(com.yandex.div.evaluable.internal.Token.Operator.Binary.Comparison r4, T r5, T r6) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.yandex.div.evaluable.internal.Token.Operator.Binary.Comparison.Less
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lf
            int r4 = r5.compareTo(r6)
            if (r4 >= 0) goto Ld
            goto L2f
        Ld:
            r1 = 0
            goto L2f
        Lf:
            boolean r0 = r4 instanceof com.yandex.div.evaluable.internal.Token.Operator.Binary.Comparison.LessOrEqual
            if (r0 == 0) goto L1a
            int r4 = r5.compareTo(r6)
            if (r4 > 0) goto Ld
            goto L2f
        L1a:
            boolean r0 = r4 instanceof com.yandex.div.evaluable.internal.Token.Operator.Binary.Comparison.GreaterOrEqual
            if (r0 == 0) goto L25
            int r4 = r5.compareTo(r6)
            if (r4 < 0) goto Ld
            goto L2f
        L25:
            boolean r4 = r4 instanceof com.yandex.div.evaluable.internal.Token.Operator.Binary.Comparison.Greater
            if (r4 == 0) goto L34
            int r4 = r5.compareTo(r6)
            if (r4 <= 0) goto Ld
        L2f:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            return r4
        L34:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.evaluable.Evaluator.m17227b(com.yandex.div.evaluable.internal.Token$Operator$Binary$Comparison, java.lang.Comparable, java.lang.Comparable):java.lang.Object");
    }
}
