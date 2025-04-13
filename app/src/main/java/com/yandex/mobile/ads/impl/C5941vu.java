package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.vu */
/* loaded from: classes3.dex */
final class C5941vu {

    /* renamed from: c */
    private boolean f55880c;

    /* renamed from: e */
    private int f55882e;

    /* renamed from: a */
    private a f55878a = new a();

    /* renamed from: b */
    private a f55879b = new a();

    /* renamed from: d */
    private long f55881d = -9223372036854775807L;

    /* renamed from: com.yandex.mobile.ads.impl.vu$a */
    public static final class a {

        /* renamed from: a */
        private long f55883a;

        /* renamed from: b */
        private long f55884b;

        /* renamed from: c */
        private long f55885c;

        /* renamed from: d */
        private long f55886d;

        /* renamed from: e */
        private long f55887e;

        /* renamed from: f */
        private long f55888f;

        /* renamed from: g */
        private final boolean[] f55889g = new boolean[15];

        /* renamed from: h */
        private int f55890h;

        /* renamed from: a */
        public final long m29270a() {
            long j2 = this.f55887e;
            if (j2 == 0) {
                return 0L;
            }
            return this.f55888f / j2;
        }

        /* renamed from: b */
        public final long m29272b() {
            return this.f55888f;
        }

        /* renamed from: c */
        public final boolean m29273c() {
            long j2 = this.f55886d;
            if (j2 == 0) {
                return false;
            }
            return this.f55889g[(int) ((j2 - 1) % 15)];
        }

        /* renamed from: d */
        public final boolean m29274d() {
            return this.f55886d > 15 && this.f55890h == 0;
        }

        /* renamed from: e */
        public final void m29275e() {
            this.f55886d = 0L;
            this.f55887e = 0L;
            this.f55888f = 0L;
            this.f55890h = 0;
            Arrays.fill(this.f55889g, false);
        }

        /* renamed from: a */
        public final void m29271a(long j2) {
            long j3 = this.f55886d;
            if (j3 == 0) {
                this.f55883a = j2;
            } else if (j3 == 1) {
                long j4 = j2 - this.f55883a;
                this.f55884b = j4;
                this.f55888f = j4;
                this.f55887e = 1L;
            } else {
                long j5 = j2 - this.f55885c;
                int i2 = (int) (j3 % 15);
                if (Math.abs(j5 - this.f55884b) <= 1000000) {
                    this.f55887e++;
                    this.f55888f += j5;
                    boolean[] zArr = this.f55889g;
                    if (zArr[i2]) {
                        zArr[i2] = false;
                        this.f55890h--;
                    }
                } else {
                    boolean[] zArr2 = this.f55889g;
                    if (!zArr2[i2]) {
                        zArr2[i2] = true;
                        this.f55890h++;
                    }
                }
            }
            this.f55886d++;
            this.f55885c = j2;
        }
    }

    /* renamed from: a */
    public final void m29264a(long j2) {
        this.f55878a.m29271a(j2);
        if (this.f55878a.m29274d()) {
            this.f55880c = false;
        } else if (this.f55881d != -9223372036854775807L) {
            if (!this.f55880c || this.f55879b.m29273c()) {
                this.f55879b.m29275e();
                this.f55879b.m29271a(this.f55881d);
            }
            this.f55880c = true;
            this.f55879b.m29271a(j2);
        }
        if (this.f55880c && this.f55879b.m29274d()) {
            a aVar = this.f55878a;
            this.f55878a = this.f55879b;
            this.f55879b = aVar;
            this.f55880c = false;
        }
        this.f55881d = j2;
        this.f55882e = this.f55878a.m29274d() ? 0 : this.f55882e + 1;
    }

    /* renamed from: b */
    public final float m29265b() {
        if (this.f55878a.m29274d()) {
            return (float) (1.0E9d / this.f55878a.m29270a());
        }
        return -1.0f;
    }

    /* renamed from: c */
    public final int m29266c() {
        return this.f55882e;
    }

    /* renamed from: d */
    public final long m29267d() {
        if (this.f55878a.m29274d()) {
            return this.f55878a.m29272b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: e */
    public final boolean m29268e() {
        return this.f55878a.m29274d();
    }

    /* renamed from: f */
    public final void m29269f() {
        this.f55878a.m29275e();
        this.f55879b.m29275e();
        this.f55880c = false;
        this.f55881d = -9223372036854775807L;
        this.f55882e = 0;
    }

    /* renamed from: a */
    public final long m29263a() {
        if (this.f55878a.m29274d()) {
            return this.f55878a.m29270a();
        }
        return -9223372036854775807L;
    }
}
