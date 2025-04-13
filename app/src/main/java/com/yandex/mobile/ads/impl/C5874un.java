package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import com.yandex.mobile.ads.impl.pb0;

/* renamed from: com.yandex.mobile.ads.impl.un */
/* loaded from: classes3.dex */
public final class C5874un implements g80 {

    /* renamed from: a */
    private final long f55569a;

    /* renamed from: b */
    private final long f55570b;

    /* renamed from: c */
    private final float f55571c;

    /* renamed from: d */
    private long f55572d;

    /* renamed from: e */
    private long f55573e;

    /* renamed from: f */
    private long f55574f;

    /* renamed from: g */
    private long f55575g;

    /* renamed from: h */
    private long f55576h;

    /* renamed from: i */
    private long f55577i;

    /* renamed from: j */
    private float f55578j;

    /* renamed from: k */
    private float f55579k;

    /* renamed from: l */
    private float f55580l;

    /* renamed from: m */
    private long f55581m;

    /* renamed from: n */
    private long f55582n;

    /* renamed from: o */
    private long f55583o;

    /* renamed from: com.yandex.mobile.ads.impl.un$a */
    public static final class a {

        /* renamed from: a */
        private long f55584a = s91.m28096a(20L);

        /* renamed from: b */
        private long f55585b = s91.m28096a(500L);

        /* renamed from: c */
        private float f55586c = 0.999f;

        /* renamed from: a */
        public final C5874un m29056a() {
            return new C5874un(this.f55584a, this.f55585b, this.f55586c, 0);
        }
    }

    public /* synthetic */ C5874un(long j2, long j3, float f2, int i2) {
        this(j2, j3, f2);
    }

    /* renamed from: b */
    private void m29050b() {
        long j2 = this.f55572d;
        if (j2 != -9223372036854775807L) {
            long j3 = this.f55573e;
            if (j3 != -9223372036854775807L) {
                j2 = j3;
            }
            long j4 = this.f55575g;
            if (j4 != -9223372036854775807L && j2 < j4) {
                j2 = j4;
            }
            long j5 = this.f55576h;
            if (j5 != -9223372036854775807L && j2 > j5) {
                j2 = j5;
            }
        } else {
            j2 = -9223372036854775807L;
        }
        if (this.f55574f == j2) {
            return;
        }
        this.f55574f = j2;
        this.f55577i = j2;
        this.f55582n = -9223372036854775807L;
        this.f55583o = -9223372036854775807L;
        this.f55581m = -9223372036854775807L;
    }

    /* renamed from: a */
    public final void m29054a(pb0.C5579e c5579e) {
        this.f55572d = s91.m28096a(c5579e.f53467a);
        this.f55575g = s91.m28096a(c5579e.f53468b);
        this.f55576h = s91.m28096a(c5579e.f53469c);
        float f2 = c5579e.f53470d;
        if (f2 == -3.4028235E38f) {
            f2 = 0.97f;
        }
        this.f55579k = f2;
        float f3 = c5579e.f53471e;
        if (f3 == -3.4028235E38f) {
            f3 = 1.03f;
        }
        this.f55578j = f3;
        if (f2 == 1.0f && f3 == 1.0f) {
            this.f55572d = -9223372036854775807L;
        }
        m29050b();
    }

    /* renamed from: c */
    public final void m29055c() {
        long j2 = this.f55577i;
        if (j2 == -9223372036854775807L) {
            return;
        }
        long j3 = j2 + this.f55570b;
        this.f55577i = j3;
        long j4 = this.f55576h;
        if (j4 != -9223372036854775807L && j3 > j4) {
            this.f55577i = j4;
        }
        this.f55581m = -9223372036854775807L;
    }

    private C5874un(long j2, long j3, float f2) {
        this.f55569a = j2;
        this.f55570b = j3;
        this.f55571c = f2;
        this.f55572d = -9223372036854775807L;
        this.f55573e = -9223372036854775807L;
        this.f55575g = -9223372036854775807L;
        this.f55576h = -9223372036854775807L;
        this.f55579k = 0.97f;
        this.f55578j = 1.03f;
        this.f55580l = 1.0f;
        this.f55581m = -9223372036854775807L;
        this.f55574f = -9223372036854775807L;
        this.f55577i = -9223372036854775807L;
        this.f55582n = -9223372036854775807L;
        this.f55583o = -9223372036854775807L;
    }

    /* renamed from: a */
    public final void m29053a(long j2) {
        this.f55573e = j2;
        m29050b();
    }

    /* renamed from: a */
    public final float m29051a(long j2, long j3) {
        if (this.f55572d == -9223372036854775807L) {
            return 1.0f;
        }
        long j4 = j2 - j3;
        long j5 = this.f55582n;
        if (j5 == -9223372036854775807L) {
            this.f55582n = j4;
            this.f55583o = 0L;
        } else {
            float f2 = this.f55571c;
            long max = Math.max(j4, (long) (((1.0f - f2) * j4) + (j5 * f2)));
            this.f55582n = max;
            long abs = Math.abs(j4 - max);
            long j6 = this.f55583o;
            float f3 = this.f55571c;
            this.f55583o = (long) (((1.0f - f3) * abs) + (j6 * f3));
        }
        if (this.f55581m != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f55581m < 1000) {
            return this.f55580l;
        }
        this.f55581m = SystemClock.elapsedRealtime();
        long j7 = (this.f55583o * 3) + this.f55582n;
        if (this.f55577i > j7) {
            float m28096a = s91.m28096a(1000L);
            long[] jArr = {j7, this.f55574f, this.f55577i - (((long) ((this.f55580l - 1.0f) * m28096a)) + ((long) ((this.f55578j - 1.0f) * m28096a)))};
            for (int i2 = 1; i2 < 3; i2++) {
                long j8 = jArr[i2];
                if (j8 > j7) {
                    j7 = j8;
                }
            }
            this.f55577i = j7;
        } else {
            long max2 = j2 - ((long) (Math.max(0.0f, this.f55580l - 1.0f) / 1.0E-7f));
            long j9 = this.f55577i;
            int i3 = s91.f54530a;
            long max3 = Math.max(j9, Math.min(max2, j7));
            this.f55577i = max3;
            long j10 = this.f55576h;
            if (j10 != -9223372036854775807L && max3 > j10) {
                this.f55577i = j10;
            }
        }
        long j11 = j2 - this.f55577i;
        if (Math.abs(j11) < this.f55569a) {
            this.f55580l = 1.0f;
        } else {
            float f4 = this.f55579k;
            float f5 = this.f55578j;
            int i4 = s91.f54530a;
            this.f55580l = Math.max(f4, Math.min((j11 * 1.0E-7f) + 1.0f, f5));
        }
        return this.f55580l;
    }

    /* renamed from: a */
    public final long m29052a() {
        return this.f55577i;
    }
}
