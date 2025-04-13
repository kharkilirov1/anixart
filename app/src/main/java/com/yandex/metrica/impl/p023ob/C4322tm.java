package com.yandex.metrica.impl.p023ob;

import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.tm */
/* loaded from: classes2.dex */
public final class C4322tm {

    /* renamed from: a */
    private static final BigInteger f46564a = BigInteger.valueOf(Long.MAX_VALUE);

    /* renamed from: b */
    private static final BigInteger f46565b = BigInteger.valueOf(Long.MIN_VALUE);

    /* renamed from: a */
    public static final Pair m20848a(BigDecimal bigDecimal) {
        int i2 = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        Intrinsics.m32178g(unscaledValue, "value.unscaledValue()");
        while (true) {
            if (unscaledValue.compareTo(f46564a) <= 0 && unscaledValue.compareTo(f46565b) >= 0) {
                return new Pair(Long.valueOf(unscaledValue.longValue()), Integer.valueOf(i2));
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            Intrinsics.m32178g(unscaledValue, "bigIntMantissa.divide(BigInteger.TEN)");
            i2++;
        }
    }
}
