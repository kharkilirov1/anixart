package com.google.common.math;

import com.fasterxml.jackson.core.util.TextBuffer;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.primitives.Ints;
import com.yandex.mobile.ads.C4632R;
import java.math.RoundingMode;

@GwtCompatible
/* loaded from: classes2.dex */
public final class IntMath {

    /* renamed from: a */
    public static final int[] f21882a = {1, 1, 2, 6, 24, C4632R.styleable.AppCompatTheme_windowFixedHeightMajor, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* renamed from: b */
    @VisibleForTesting
    public static int[] f21883b = {Integer.MAX_VALUE, Integer.MAX_VALUE, TextBuffer.MAX_SEGMENT_LEN, 2345, 477, 193, C4632R.styleable.AppCompatTheme_textColorAlertDialogListItem, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* renamed from: com.google.common.math.IntMath$1 */
    public static /* synthetic */ class C19041 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21884a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f21884a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21884a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21884a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21884a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21884a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21884a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21884a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21884a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: a */
    public static int m12058a(int i2, int i3) {
        long j2 = i2 * i3;
        int i4 = (int) j2;
        MathPreconditions.m12063a(j2 == ((long) i4), "checkedMultiply", i2, i3);
        return i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (((r7 == java.math.RoundingMode.HALF_EVEN) & ((r0 & 1) != 0)) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        if (r1 > 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
    
        if (r5 > 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (r5 < 0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m12059b(int r5, int r6, java.math.RoundingMode r7) {
        /*
            java.util.Objects.requireNonNull(r7)
            if (r6 == 0) goto L5c
            int r0 = r5 / r6
            int r1 = r6 * r0
            int r1 = r5 - r1
            if (r1 != 0) goto Le
            return r0
        Le:
            r5 = r5 ^ r6
            int r5 = r5 >> 31
            r2 = 1
            r5 = r5 | r2
            int[] r3 = com.google.common.math.IntMath.C19041.f21884a
            int r4 = r7.ordinal()
            r3 = r3[r4]
            r4 = 0
            switch(r3) {
                case 1: goto L50;
                case 2: goto L57;
                case 3: goto L4d;
                case 4: goto L58;
                case 5: goto L4a;
                case 6: goto L25;
                case 7: goto L25;
                case 8: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L25:
            int r1 = java.lang.Math.abs(r1)
            int r6 = java.lang.Math.abs(r6)
            int r6 = r6 - r1
            int r1 = r1 - r6
            if (r1 != 0) goto L47
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_UP
            if (r7 == r6) goto L58
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_EVEN
            if (r7 != r6) goto L3b
            r6 = 1
            goto L3c
        L3b:
            r6 = 0
        L3c:
            r7 = r0 & 1
            if (r7 == 0) goto L42
            r7 = 1
            goto L43
        L42:
            r7 = 0
        L43:
            r6 = r6 & r7
            if (r6 == 0) goto L57
            goto L58
        L47:
            if (r1 <= 0) goto L57
            goto L58
        L4a:
            if (r5 <= 0) goto L57
            goto L58
        L4d:
            if (r5 >= 0) goto L57
            goto L58
        L50:
            if (r1 != 0) goto L53
            goto L54
        L53:
            r2 = 0
        L54:
            com.google.common.math.MathPreconditions.m12064b(r2)
        L57:
            r2 = 0
        L58:
            if (r2 == 0) goto L5b
            int r0 = r0 + r5
        L5b:
            return r0
        L5c:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "/ by zero"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.math.IntMath.m12059b(int, int, java.math.RoundingMode):int");
    }

    /* renamed from: c */
    public static int m12060c(int i2, RoundingMode roundingMode) {
        if (i2 <= 0) {
            StringBuilder sb = new StringBuilder("x".length() + 26);
            sb.append("x");
            sb.append(" (");
            sb.append(i2);
            sb.append(") must be > 0");
            throw new IllegalArgumentException(sb.toString());
        }
        switch (C19041.f21884a[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.m12064b((i2 > 0) & (((i2 + (-1)) & i2) == 0));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i2 - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
                return (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - i2))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i2);
    }

    @Beta
    /* renamed from: d */
    public static int m12061d(int i2, int i3) {
        return Ints.m12084f(i2 + i3);
    }
}
