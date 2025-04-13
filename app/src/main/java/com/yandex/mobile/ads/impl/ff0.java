package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import androidx.room.util.C0576a;

/* loaded from: classes3.dex */
public final class ff0 {

    /* renamed from: a */
    private static final String[] f50238a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b */
    private static final int[] f50239b = {44100, 48000, 32000};

    /* renamed from: c */
    private static final int[] f50240c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d */
    private static final int[] f50241d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e */
    private static final int[] f50242e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f */
    private static final int[] f50243f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g */
    private static final int[] f50244g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: com.yandex.mobile.ads.impl.ff0$a */
    public static final class C5076a {

        /* renamed from: a */
        public int f50245a;

        /* renamed from: b */
        @Nullable
        public String f50246b;

        /* renamed from: c */
        public int f50247c;

        /* renamed from: d */
        public int f50248d;

        /* renamed from: e */
        public int f50249e;

        /* renamed from: f */
        public int f50250f;

        /* renamed from: g */
        public int f50251g;

        /* renamed from: a */
        public final boolean m24582a(int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (!ff0.m24572a(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
                return false;
            }
            this.f50245a = i3;
            this.f50246b = ff0.f50238a[3 - i4];
            int i7 = ff0.f50239b[i6];
            this.f50248d = i7;
            if (i3 == 2) {
                this.f50248d = i7 / 2;
            } else if (i3 == 0) {
                this.f50248d = i7 / 4;
            }
            int i8 = (i2 >>> 9) & 1;
            this.f50251g = ff0.m24571a(i3, i4);
            if (i4 == 3) {
                int i9 = i3 == 3 ? ff0.f50240c[i5 - 1] : ff0.f50241d[i5 - 1];
                this.f50250f = i9;
                this.f50247c = (((i9 * 12) / this.f50248d) + i8) * 4;
            } else {
                if (i3 == 3) {
                    int i10 = i4 == 2 ? ff0.f50242e[i5 - 1] : ff0.f50243f[i5 - 1];
                    this.f50250f = i10;
                    this.f50247c = ((i10 * 144) / this.f50248d) + i8;
                } else {
                    int i11 = ff0.f50244g[i5 - 1];
                    this.f50250f = i11;
                    this.f50247c = (((i4 == 1 ? 72 : 144) * i11) / this.f50248d) + i8;
                }
            }
            this.f50249e = ((i2 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m24572a(int i2) {
        return (i2 & (-2097152)) == -2097152;
    }

    /* renamed from: a */
    public static int m24571a(int i2, int i3) {
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    return 384;
                }
                throw new IllegalArgumentException();
            }
        } else if (i2 != 3) {
            return 576;
        }
        return 1152;
    }

    /* renamed from: b */
    public static int m24574b(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (!((i2 & (-2097152)) == -2097152) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f50239b[i6];
        if (i3 == 2) {
            i7 /= 2;
        } else if (i3 == 0) {
            i7 /= 4;
        }
        int i8 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? f50240c[i5 - 1] : f50241d[i5 - 1]) * 12) / i7) + i8) * 4;
        }
        int i9 = i3 == 3 ? i4 == 2 ? f50242e[i5 - 1] : f50243f[i5 - 1] : f50244g[i5 - 1];
        if (i3 == 3) {
            return C0576a.m4105d(i9, 144, i7, i8);
        }
        return C0576a.m4105d(i4 == 1 ? 72 : 144, i9, i7, i8);
    }

    /* renamed from: c */
    public static int m24576c(int i2) {
        int i3;
        int i4;
        if (!((i2 & (-2097152)) == -2097152) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0) {
            return -1;
        }
        int i5 = (i2 >>> 12) & 15;
        int i6 = (i2 >>> 10) & 3;
        if (i5 == 0 || i5 == 15 || i6 == 3) {
            return -1;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    return 384;
                }
                throw new IllegalArgumentException();
            }
        } else if (i3 != 3) {
            return 576;
        }
        return 1152;
    }
}
