package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import androidx.room.util.C0576a;

/* loaded from: classes.dex */
public final class MpegAudioUtil {

    /* renamed from: a */
    public static final String[] f10481a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b */
    public static final int[] f10482b = {44100, 48000, 32000};

    /* renamed from: c */
    public static final int[] f10483c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d */
    public static final int[] f10484d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e */
    public static final int[] f10485e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f */
    public static final int[] f10486f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g */
    public static final int[] f10487g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class Header {

        /* renamed from: a */
        public int f10488a;

        /* renamed from: b */
        @Nullable
        public String f10489b;

        /* renamed from: c */
        public int f10490c;

        /* renamed from: d */
        public int f10491d;

        /* renamed from: e */
        public int f10492e;

        /* renamed from: f */
        public int f10493f;

        /* renamed from: g */
        public int f10494g;

        /* renamed from: a */
        public boolean m6225a(int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (!MpegAudioUtil.m6223c(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
                return false;
            }
            this.f10488a = i3;
            this.f10489b = MpegAudioUtil.f10481a[3 - i4];
            int i7 = MpegAudioUtil.f10482b[i6];
            this.f10491d = i7;
            if (i3 == 2) {
                this.f10491d = i7 / 2;
            } else if (i3 == 0) {
                this.f10491d = i7 / 4;
            }
            int i8 = (i2 >>> 9) & 1;
            this.f10494g = MpegAudioUtil.m6222b(i3, i4);
            if (i4 == 3) {
                int i9 = i3 == 3 ? MpegAudioUtil.f10483c[i5 - 1] : MpegAudioUtil.f10484d[i5 - 1];
                this.f10493f = i9;
                this.f10490c = (((i9 * 12) / this.f10491d) + i8) * 4;
            } else {
                if (i3 == 3) {
                    int i10 = i4 == 2 ? MpegAudioUtil.f10485e[i5 - 1] : MpegAudioUtil.f10486f[i5 - 1];
                    this.f10493f = i10;
                    this.f10490c = ((i10 * 144) / this.f10491d) + i8;
                } else {
                    int i11 = MpegAudioUtil.f10487g[i5 - 1];
                    this.f10493f = i11;
                    this.f10490c = (((i4 == 1 ? 72 : 144) * i11) / this.f10491d) + i8;
                }
            }
            this.f10492e = ((i2 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    /* renamed from: a */
    public static int m6221a(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (!m6223c(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f10482b[i6];
        if (i3 == 2) {
            i7 /= 2;
        } else if (i3 == 0) {
            i7 /= 4;
        }
        int i8 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? f10483c[i5 - 1] : f10484d[i5 - 1]) * 12) / i7) + i8) * 4;
        }
        int i9 = i3 == 3 ? i4 == 2 ? f10485e[i5 - 1] : f10486f[i5 - 1] : f10487g[i5 - 1];
        if (i3 == 3) {
            return C0576a.m4105d(i9, 144, i7, i8);
        }
        return C0576a.m4105d(i4 == 1 ? 72 : 144, i9, i7, i8);
    }

    /* renamed from: b */
    public static int m6222b(int i2, int i3) {
        if (i3 == 1) {
            return i2 == 3 ? 1152 : 576;
        }
        if (i3 == 2) {
            return 1152;
        }
        if (i3 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public static boolean m6223c(int i2) {
        return (i2 & (-2097152)) == -2097152;
    }

    /* renamed from: d */
    public static int m6224d(int i2) {
        int i3;
        int i4;
        if (!m6223c(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0) {
            return -1;
        }
        int i5 = (i2 >>> 12) & 15;
        int i6 = (i2 >>> 10) & 3;
        if (i5 == 0 || i5 == 15 || i6 == 3) {
            return -1;
        }
        return m6222b(i3, i4);
    }
}
