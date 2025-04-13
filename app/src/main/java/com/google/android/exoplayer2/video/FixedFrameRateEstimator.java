package com.google.android.exoplayer2.video;

import java.util.Arrays;

/* loaded from: classes.dex */
final class FixedFrameRateEstimator {

    /* renamed from: c */
    public boolean f14802c;

    /* renamed from: e */
    public int f14804e;

    /* renamed from: a */
    public Matcher f14800a = new Matcher();

    /* renamed from: b */
    public Matcher f14801b = new Matcher();

    /* renamed from: d */
    public long f14803d = -9223372036854775807L;

    public static final class Matcher {

        /* renamed from: a */
        public long f14805a;

        /* renamed from: b */
        public long f14806b;

        /* renamed from: c */
        public long f14807c;

        /* renamed from: d */
        public long f14808d;

        /* renamed from: e */
        public long f14809e;

        /* renamed from: f */
        public long f14810f;

        /* renamed from: g */
        public final boolean[] f14811g = new boolean[15];

        /* renamed from: h */
        public int f14812h;

        /* renamed from: a */
        public boolean m7783a() {
            return this.f14808d > 15 && this.f14812h == 0;
        }

        /* renamed from: b */
        public void m7784b(long j2) {
            long j3 = this.f14808d;
            if (j3 == 0) {
                this.f14805a = j2;
            } else if (j3 == 1) {
                long j4 = j2 - this.f14805a;
                this.f14806b = j4;
                this.f14810f = j4;
                this.f14809e = 1L;
            } else {
                long j5 = j2 - this.f14807c;
                int i2 = (int) (j3 % 15);
                if (Math.abs(j5 - this.f14806b) <= 1000000) {
                    this.f14809e++;
                    this.f14810f += j5;
                    boolean[] zArr = this.f14811g;
                    if (zArr[i2]) {
                        zArr[i2] = false;
                        this.f14812h--;
                    }
                } else {
                    boolean[] zArr2 = this.f14811g;
                    if (!zArr2[i2]) {
                        zArr2[i2] = true;
                        this.f14812h++;
                    }
                }
            }
            this.f14808d++;
            this.f14807c = j2;
        }

        /* renamed from: c */
        public void m7785c() {
            this.f14808d = 0L;
            this.f14809e = 0L;
            this.f14810f = 0L;
            this.f14812h = 0;
            Arrays.fill(this.f14811g, false);
        }
    }

    /* renamed from: a */
    public boolean m7782a() {
        return this.f14800a.m7783a();
    }
}
