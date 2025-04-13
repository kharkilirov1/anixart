package com.yandex.mobile.ads.impl;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.xb */
/* loaded from: classes3.dex */
final class C6020xb {

    /* renamed from: A */
    private long f56417A;

    /* renamed from: B */
    private long f56418B;

    /* renamed from: C */
    private long f56419C;

    /* renamed from: D */
    private boolean f56420D;

    /* renamed from: E */
    private long f56421E;

    /* renamed from: F */
    private long f56422F;

    /* renamed from: a */
    private final a f56423a;

    /* renamed from: b */
    private final long[] f56424b;

    /* renamed from: c */
    @Nullable
    private AudioTrack f56425c;

    /* renamed from: d */
    private int f56426d;

    /* renamed from: e */
    private int f56427e;

    /* renamed from: f */
    @Nullable
    private C5966wb f56428f;

    /* renamed from: g */
    private int f56429g;

    /* renamed from: h */
    private boolean f56430h;

    /* renamed from: i */
    private long f56431i;

    /* renamed from: j */
    private float f56432j;

    /* renamed from: k */
    private boolean f56433k;

    /* renamed from: l */
    private long f56434l;

    /* renamed from: m */
    private long f56435m;

    /* renamed from: n */
    @Nullable
    private Method f56436n;

    /* renamed from: o */
    private long f56437o;

    /* renamed from: p */
    private boolean f56438p;

    /* renamed from: q */
    private boolean f56439q;

    /* renamed from: r */
    private long f56440r;

    /* renamed from: s */
    private long f56441s;

    /* renamed from: t */
    private long f56442t;

    /* renamed from: u */
    private long f56443u;

    /* renamed from: v */
    private int f56444v;

    /* renamed from: w */
    private int f56445w;

    /* renamed from: x */
    private long f56446x;

    /* renamed from: y */
    private long f56447y;

    /* renamed from: z */
    private long f56448z;

    /* renamed from: com.yandex.mobile.ads.impl.xb$a */
    public interface a {
        /* renamed from: a */
        void mo24697a(int i2, long j2);

        /* renamed from: a */
        void mo24698a(long j2);

        /* renamed from: a */
        void mo24699a(long j2, long j3, long j4, long j5);

        /* renamed from: b */
        void mo24700b(long j2);

        /* renamed from: b */
        void mo24701b(long j2, long j3, long j4, long j5);
    }

    public C6020xb(a aVar) {
        this.f56423a = (a) C5220ia.m25469a(aVar);
        if (s91.f54530a >= 18) {
            try {
                this.f56436n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f56424b = new long[10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if ((com.yandex.mobile.ads.impl.s91.f54530a < 23 && (r5 == 5 || r5 == 6)) != false) goto L15;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m29724a(android.media.AudioTrack r3, boolean r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            r2.f56425c = r3
            r2.f56426d = r6
            r2.f56427e = r7
            com.yandex.mobile.ads.impl.wb r0 = new com.yandex.mobile.ads.impl.wb
            r0.<init>(r3)
            r2.f56428f = r0
            int r3 = r3.getSampleRate()
            r2.f56429g = r3
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L29
            int r4 = com.yandex.mobile.ads.impl.s91.f54530a
            r1 = 23
            if (r4 >= r1) goto L25
            r4 = 5
            if (r5 == r4) goto L23
            r4 = 6
            if (r5 != r4) goto L25
        L23:
            r4 = 1
            goto L26
        L25:
            r4 = 0
        L26:
            if (r4 == 0) goto L29
            goto L2a
        L29:
            r3 = 0
        L2a:
            r2.f56430h = r3
            boolean r3 = com.yandex.mobile.ads.impl.s91.m28134e(r5)
            r2.f56439q = r3
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L40
            int r7 = r7 / r6
            long r6 = (long) r7
            long r6 = r2.m29721a(r6)
            goto L41
        L40:
            r6 = r4
        L41:
            r2.f56431i = r6
            r6 = 0
            r2.f56441s = r6
            r2.f56442t = r6
            r2.f56443u = r6
            r2.f56438p = r0
            r2.f56446x = r4
            r2.f56447y = r4
            r2.f56440r = r6
            r2.f56437o = r6
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.f56432j = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C6020xb.m29724a(android.media.AudioTrack, boolean, int, int, int):void");
    }

    /* renamed from: b */
    public final boolean m29726b() {
        AudioTrack audioTrack = this.f56425c;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    /* renamed from: c */
    public final void m29727c(long j2) {
        this.f56448z = m29720a();
        this.f56446x = SystemClock.elapsedRealtime() * 1000;
        this.f56417A = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m29730d(long r6) {
        /*
            r5 = this;
            long r0 = r5.m29720a()
            r2 = 0
            r3 = 1
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 > 0) goto L29
            boolean r6 = r5.f56430h
            if (r6 == 0) goto L26
            android.media.AudioTrack r6 = r5.f56425c
            java.util.Objects.requireNonNull(r6)
            int r6 = r6.getPlayState()
            r7 = 2
            if (r6 != r7) goto L26
            long r6 = r5.m29720a()
            r0 = 0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 != 0) goto L26
            r6 = 1
            goto L27
        L26:
            r6 = 0
        L27:
            if (r6 == 0) goto L2a
        L29:
            r2 = 1
        L2a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C6020xb.m29730d(long):boolean");
    }

    /* renamed from: e */
    public final void m29731e() {
        C5966wb c5966wb = this.f56428f;
        Objects.requireNonNull(c5966wb);
        c5966wb.m29434f();
    }

    /* renamed from: f */
    public final boolean m29733f(long j2) {
        AudioTrack audioTrack = this.f56425c;
        Objects.requireNonNull(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.f56430h) {
            if (playState == 2) {
                this.f56438p = false;
                return false;
            }
            if (playState == 1 && m29720a() == 0) {
                return false;
            }
        }
        boolean z = this.f56438p;
        boolean m29730d = m29730d(j2);
        this.f56438p = m29730d;
        if (z && !m29730d && playState != 1) {
            this.f56423a.mo24697a(this.f56427e, s91.m28119b(this.f56431i));
        }
        return true;
    }

    /* renamed from: b */
    public final int m29725b(long j2) {
        return this.f56427e - ((int) (j2 - (m29720a() * this.f56426d)));
    }

    /* renamed from: c */
    public final boolean m29728c() {
        this.f56434l = 0L;
        this.f56445w = 0;
        this.f56444v = 0;
        this.f56435m = 0L;
        this.f56419C = 0L;
        this.f56422F = 0L;
        this.f56433k = false;
        if (this.f56446x != -9223372036854775807L) {
            return false;
        }
        C5966wb c5966wb = this.f56428f;
        Objects.requireNonNull(c5966wb);
        c5966wb.m29434f();
        return true;
    }

    /* renamed from: e */
    public final boolean m29732e(long j2) {
        return this.f56447y != -9223372036854775807L && j2 > 0 && SystemClock.elapsedRealtime() - this.f56447y >= 200;
    }

    /* renamed from: d */
    public final void m29729d() {
        this.f56434l = 0L;
        this.f56445w = 0;
        this.f56444v = 0;
        this.f56435m = 0L;
        this.f56419C = 0L;
        this.f56422F = 0L;
        this.f56433k = false;
        this.f56425c = null;
        this.f56428f = null;
    }

    /* renamed from: a */
    public final void m29723a(float f2) {
        this.f56432j = f2;
        C5966wb c5966wb = this.f56428f;
        if (c5966wb != null) {
            c5966wb.m29434f();
        }
    }

    /* renamed from: a */
    public final long m29722a(boolean z) {
        long j2;
        long j3;
        Method method;
        AudioTrack audioTrack = this.f56425c;
        Objects.requireNonNull(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            long m29721a = m29721a(m29720a());
            if (m29721a != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f56435m >= 30000) {
                    long[] jArr = this.f56424b;
                    int i2 = this.f56444v;
                    jArr[i2] = m29721a - nanoTime;
                    this.f56444v = (i2 + 1) % 10;
                    int i3 = this.f56445w;
                    if (i3 < 10) {
                        this.f56445w = i3 + 1;
                    }
                    this.f56435m = nanoTime;
                    this.f56434l = 0L;
                    int i4 = 0;
                    while (true) {
                        int i5 = this.f56445w;
                        if (i4 >= i5) {
                            break;
                        }
                        this.f56434l = (this.f56424b[i4] / i5) + this.f56434l;
                        i4++;
                    }
                }
                if (!this.f56430h) {
                    C5966wb c5966wb = this.f56428f;
                    Objects.requireNonNull(c5966wb);
                    if (c5966wb.m29429a(nanoTime)) {
                        long m29431c = c5966wb.m29431c();
                        long m29430b = c5966wb.m29430b();
                        if (Math.abs(m29431c - nanoTime) > 5000000) {
                            this.f56423a.mo24701b(m29430b, m29431c, nanoTime, m29721a);
                            c5966wb.m29433e();
                        } else if (Math.abs(m29721a(m29430b) - m29721a) > 5000000) {
                            this.f56423a.mo24699a(m29430b, m29431c, nanoTime, m29721a);
                            c5966wb.m29433e();
                        } else {
                            c5966wb.m29428a();
                        }
                    }
                    if (this.f56439q && (method = this.f56436n) != null && nanoTime - this.f56440r >= 500000) {
                        try {
                            AudioTrack audioTrack2 = this.f56425c;
                            Objects.requireNonNull(audioTrack2);
                            Integer num = (Integer) method.invoke(audioTrack2, new Object[0]);
                            int i6 = s91.f54530a;
                            long intValue = (num.intValue() * 1000) - this.f56431i;
                            this.f56437o = intValue;
                            long max = Math.max(intValue, 0L);
                            this.f56437o = max;
                            if (max > 5000000) {
                                this.f56423a.mo24700b(max);
                                this.f56437o = 0L;
                            }
                        } catch (Exception unused) {
                            this.f56436n = null;
                        }
                        this.f56440r = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        C5966wb c5966wb2 = this.f56428f;
        Objects.requireNonNull(c5966wb2);
        boolean m29432d = c5966wb2.m29432d();
        if (m29432d) {
            long m29721a2 = m29721a(c5966wb2.m29430b());
            long m29431c2 = nanoTime2 - c5966wb2.m29431c();
            float f2 = this.f56432j;
            int i7 = s91.f54530a;
            if (f2 != 1.0f) {
                m29431c2 = Math.round(m29431c2 * f2);
            }
            j3 = m29431c2 + m29721a2;
        } else {
            if (this.f56445w == 0) {
                j2 = m29721a(m29720a());
            } else {
                j2 = this.f56434l + nanoTime2;
            }
            j3 = j2;
            if (!z) {
                j3 = Math.max(0L, j3 - this.f56437o);
            }
        }
        if (this.f56420D != m29432d) {
            this.f56422F = this.f56419C;
            this.f56421E = this.f56418B;
        }
        long j4 = nanoTime2 - this.f56422F;
        if (j4 < 1000000) {
            long j5 = this.f56421E;
            float f3 = this.f56432j;
            int i8 = s91.f54530a;
            long round = f3 == 1.0f ? j4 : Math.round(j4 * f3);
            long j6 = (j4 * 1000) / 1000000;
            j3 = (((1000 - j6) * (round + j5)) + (j3 * j6)) / 1000;
        }
        if (!this.f56433k) {
            long j7 = this.f56418B;
            if (j3 > j7) {
                this.f56433k = true;
                long m28119b = s91.m28119b(j3 - j7);
                float f4 = this.f56432j;
                if (f4 != 1.0f) {
                    m28119b = Math.round(m28119b / f4);
                }
                this.f56423a.mo24698a(System.currentTimeMillis() - s91.m28119b(m28119b));
            }
        }
        this.f56419C = nanoTime2;
        this.f56418B = j3;
        this.f56420D = m29432d;
        return j3;
    }

    /* renamed from: a */
    private long m29721a(long j2) {
        return (j2 * 1000000) / this.f56429g;
    }

    /* renamed from: a */
    private long m29720a() {
        AudioTrack audioTrack = this.f56425c;
        Objects.requireNonNull(audioTrack);
        if (this.f56446x != -9223372036854775807L) {
            return Math.min(this.f56417A, this.f56448z + ((((SystemClock.elapsedRealtime() * 1000) - this.f56446x) * this.f56429g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f56430h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f56443u = this.f56441s;
            }
            playbackHeadPosition += this.f56443u;
        }
        if (s91.f54530a <= 29) {
            if (playbackHeadPosition == 0 && this.f56441s > 0 && playState == 3) {
                if (this.f56447y == -9223372036854775807L) {
                    this.f56447y = SystemClock.elapsedRealtime();
                }
                return this.f56441s;
            }
            this.f56447y = -9223372036854775807L;
        }
        if (this.f56441s > playbackHeadPosition) {
            this.f56442t++;
        }
        this.f56441s = playbackHeadPosition;
        return playbackHeadPosition + (this.f56442t << 32);
    }
}
