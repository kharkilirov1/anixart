package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@CanIgnoreReturnValue
@GwtCompatible
/* loaded from: classes2.dex */
final class MathPreconditions {
    /* renamed from: a */
    public static void m12063a(boolean z, String str, int i2, int i3) {
        if (z) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 36);
        sb.append("overflow: ");
        sb.append(str);
        sb.append("(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(")");
        throw new ArithmeticException(sb.toString());
    }

    /* renamed from: b */
    public static void m12064b(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
