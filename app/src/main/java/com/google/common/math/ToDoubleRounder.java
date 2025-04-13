package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import java.lang.Comparable;
import java.lang.Number;
import java.math.RoundingMode;

@GwtIncompatible
/* loaded from: classes2.dex */
abstract class ToDoubleRounder<X extends Number & Comparable<X>> {

    /* renamed from: com.google.common.math.ToDoubleRounder$1 */
    public static /* synthetic */ class C19101 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21889a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f21889a = iArr;
            try {
                iArr[RoundingMode.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21889a[RoundingMode.HALF_EVEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21889a[RoundingMode.HALF_DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21889a[RoundingMode.HALF_UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21889a[RoundingMode.FLOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21889a[RoundingMode.CEILING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21889a[RoundingMode.UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21889a[RoundingMode.UNNECESSARY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }
}
