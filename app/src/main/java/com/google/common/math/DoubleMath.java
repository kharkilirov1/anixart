package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import java.math.RoundingMode;

@GwtCompatible
/* loaded from: classes2.dex */
public final class DoubleMath {

    /* renamed from: com.google.common.math.DoubleMath$1 */
    public static /* synthetic */ class C19031 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21881a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f21881a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21881a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21881a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21881a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21881a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21881a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21881a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21881a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        Math.log(2.0d);
    }
}
