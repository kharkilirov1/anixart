package com.yandex.div.evaluable;

import com.yandex.div.evaluable.internal.Token;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.DateTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: EvaluableException.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div-evaluable"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class EvaluableExceptionKt {
    @NotNull
    /* renamed from: a */
    public static final String m17218a(@NotNull String name, @NotNull List<? extends Object> list) {
        Intrinsics.m32179h(name, "name");
        return CollectionsKt.m31989B(list, null, Intrinsics.m32187p(name, "("), ")", 0, null, new Function1<Object, CharSequence>() { // from class: com.yandex.div.evaluable.EvaluableExceptionKt$functionToMessageFormat$1
            @Override // kotlin.jvm.functions.Function1
            public CharSequence invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return EvaluableExceptionKt.m17224g(it);
            }
        }, 25, null);
    }

    @NotNull
    /* renamed from: b */
    public static final Void m17219b(@NotNull Token.Operator.Binary operator, @NotNull Object left, @NotNull Object right) {
        String m32187p;
        EvaluableType evaluableType;
        EvaluableType evaluableType2 = EvaluableType.COLOR;
        EvaluableType evaluableType3 = EvaluableType.DATETIME;
        EvaluableType evaluableType4 = EvaluableType.STRING;
        EvaluableType evaluableType5 = EvaluableType.BOOLEAN;
        EvaluableType evaluableType6 = EvaluableType.NUMBER;
        EvaluableType evaluableType7 = EvaluableType.INTEGER;
        Intrinsics.m32179h(operator, "operator");
        Intrinsics.m32179h(left, "left");
        Intrinsics.m32179h(right, "right");
        String str = m17224g(left) + ' ' + operator + ' ' + m17224g(right);
        if (Intrinsics.m32174c(left.getClass(), right.getClass())) {
            if (left instanceof Long) {
                evaluableType2 = evaluableType7;
            } else if (left instanceof Double) {
                evaluableType2 = evaluableType6;
            } else if (left instanceof Boolean) {
                evaluableType2 = evaluableType5;
            } else if (left instanceof String) {
                evaluableType2 = evaluableType4;
            } else if (left instanceof DateTime) {
                evaluableType2 = evaluableType3;
            } else if (!(left instanceof Color)) {
                throw new EvaluableException(Intrinsics.m32187p("Unable to find type for ", left.getClass().getName()), null, 2);
            }
            m32187p = Intrinsics.m32187p(evaluableType2.f33162b, " type");
        } else {
            StringBuilder m24u = C0000a.m24u("different types: ");
            if (left instanceof Long) {
                evaluableType = evaluableType7;
            } else if (left instanceof Double) {
                evaluableType = evaluableType6;
            } else if (left instanceof Boolean) {
                evaluableType = evaluableType5;
            } else if (left instanceof String) {
                evaluableType = evaluableType4;
            } else if (left instanceof DateTime) {
                evaluableType = evaluableType3;
            } else {
                if (!(left instanceof Color)) {
                    throw new EvaluableException(Intrinsics.m32187p("Unable to find type for ", left.getClass().getName()), null, 2);
                }
                evaluableType = evaluableType2;
            }
            m24u.append(evaluableType.f33162b);
            m24u.append(" and ");
            if (right instanceof Long) {
                evaluableType2 = evaluableType7;
            } else if (right instanceof Double) {
                evaluableType2 = evaluableType6;
            } else if (right instanceof Boolean) {
                evaluableType2 = evaluableType5;
            } else if (right instanceof String) {
                evaluableType2 = evaluableType4;
            } else if (right instanceof DateTime) {
                evaluableType2 = evaluableType3;
            } else if (!(right instanceof Color)) {
                throw new EvaluableException(Intrinsics.m32187p("Unable to find type for ", right.getClass().getName()), null, 2);
            }
            m24u.append(evaluableType2.f33162b);
            m32187p = m24u.toString();
        }
        m17221d(str, "Operator '" + operator + "' cannot be applied to " + m32187p + '.', null, 4);
        throw null;
    }

    @NotNull
    /* renamed from: c */
    public static final Void m17220c(@NotNull String expression, @NotNull String reason, @Nullable Exception exc) {
        Intrinsics.m32179h(expression, "expression");
        Intrinsics.m32179h(reason, "reason");
        throw new EvaluableException("Failed to evaluate [" + expression + "]. " + reason, exc);
    }

    /* renamed from: d */
    public static /* synthetic */ Void m17221d(String str, String str2, Exception exc, int i2) {
        m17220c(str, str2, null);
        throw null;
    }

    @NotNull
    /* renamed from: e */
    public static final Void m17222e(@NotNull String name, @NotNull List<? extends Object> args, @NotNull String reason, @Nullable Exception exc) {
        Intrinsics.m32179h(name, "name");
        Intrinsics.m32179h(args, "args");
        Intrinsics.m32179h(reason, "reason");
        m17220c(m17218a(name, args), reason, exc);
        throw null;
    }

    /* renamed from: f */
    public static /* synthetic */ Void m17223f(String str, List list, String str2, Exception exc, int i2) {
        m17222e(str, list, str2, null);
        throw null;
    }

    @NotNull
    /* renamed from: g */
    public static final String m17224g(@NotNull Object obj) {
        if (!(obj instanceof String)) {
            return obj.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append('\'');
        sb.append(obj);
        sb.append('\'');
        return sb.toString();
    }

    @NotNull
    /* renamed from: h */
    public static final String m17225h(@NotNull List<? extends Object> list) {
        return CollectionsKt.m31989B(list, ", ", null, null, 0, null, new Function1<Object, CharSequence>() { // from class: com.yandex.div.evaluable.EvaluableExceptionKt$toMessageFormat$1
            @Override // kotlin.jvm.functions.Function1
            public CharSequence invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return EvaluableExceptionKt.m17224g(it);
            }
        }, 30, null);
    }
}
