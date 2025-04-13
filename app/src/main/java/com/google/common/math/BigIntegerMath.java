package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.math.BigInteger;
import java.math.RoundingMode;

@GwtCompatible
/* loaded from: classes2.dex */
public final class BigIntegerMath {

    /* renamed from: a */
    public static final /* synthetic */ int f21879a = 0;

    /* renamed from: com.google.common.math.BigIntegerMath$1 */
    public static /* synthetic */ class C19021 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21880a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f21880a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21880a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21880a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21880a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21880a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21880a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21880a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21880a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @GwtIncompatible
    public static class BigIntegerToDoubleRounder extends ToDoubleRounder<BigInteger> {
    }

    static {
        new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);
        Math.log(10.0d);
        Math.log(2.0d);
    }
}
