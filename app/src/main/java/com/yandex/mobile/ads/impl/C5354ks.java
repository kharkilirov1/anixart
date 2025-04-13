package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.embedded.guava.collect.C4693m0;
import com.yandex.mobile.ads.exo.drm.InterfaceC4718e;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.C6033xn;
import com.yandex.mobile.ads.impl.bc0;
import com.yandex.mobile.ads.impl.d71;
import com.yandex.mobile.ads.impl.ec0;
import com.yandex.mobile.ads.impl.k61;
import com.yandex.mobile.ads.impl.pb0;
import com.yandex.mobile.ads.impl.vb0;
import com.yandex.mobile.ads.impl.vq0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.yandex.mobile.ads.impl.ks */
/* loaded from: classes3.dex */
final class C5354ks implements Handler.Callback, vb0.InterfaceC5910a, d71.InterfaceC4959a, ec0.InterfaceC5019d, C6033xn.a, vq0.InterfaceC5935a {

    /* renamed from: A */
    private boolean f52066A;

    /* renamed from: B */
    private boolean f52067B;

    /* renamed from: C */
    private boolean f52068C;

    /* renamed from: D */
    private boolean f52069D;

    /* renamed from: E */
    private boolean f52070E;

    /* renamed from: F */
    private int f52071F;

    /* renamed from: H */
    private boolean f52073H;

    /* renamed from: I */
    private boolean f52074I;

    /* renamed from: J */
    private boolean f52075J;

    /* renamed from: K */
    private int f52076K;

    /* renamed from: L */
    @Nullable
    private g f52077L;

    /* renamed from: M */
    private long f52078M;

    /* renamed from: N */
    private int f52079N;

    /* renamed from: O */
    private boolean f52080O;

    /* renamed from: P */
    @Nullable
    private C5043es f52081P;

    /* renamed from: b */
    private final cv0[] f52083b;

    /* renamed from: c */
    private final Set<cv0> f52084c;

    /* renamed from: d */
    private final dv0[] f52085d;

    /* renamed from: e */
    private final d71 f52086e;

    /* renamed from: f */
    private final e71 f52087f;

    /* renamed from: g */
    private final h80 f52088g;

    /* renamed from: h */
    private final InterfaceC5793tc f52089h;

    /* renamed from: i */
    private final InterfaceC4944cy f52090i;

    /* renamed from: j */
    private final HandlerThread f52091j;

    /* renamed from: k */
    private final Looper f52092k;

    /* renamed from: l */
    private final k61.C5323d f52093l;

    /* renamed from: m */
    private final k61.C5321b f52094m;

    /* renamed from: n */
    private final long f52095n;

    /* renamed from: o */
    private final boolean f52096o;

    /* renamed from: p */
    private final C6033xn f52097p;

    /* renamed from: q */
    private final ArrayList<c> f52098q;

    /* renamed from: r */
    private final InterfaceC4972di f52099r;

    /* renamed from: s */
    private final e f52100s;

    /* renamed from: t */
    private final zb0 f52101t;

    /* renamed from: u */
    private final ec0 f52102u;

    /* renamed from: v */
    private final g80 f52103v;

    /* renamed from: w */
    private final long f52104w;

    /* renamed from: x */
    private f01 f52105x;

    /* renamed from: y */
    private lq0 f52106y;

    /* renamed from: z */
    private d f52107z;

    /* renamed from: G */
    private boolean f52072G = false;

    /* renamed from: Q */
    private long f52082Q = -9223372036854775807L;

    /* renamed from: com.yandex.mobile.ads.impl.ks$a */
    public static final class a {

        /* renamed from: a */
        private final List<ec0.C5018c> f52108a;

        /* renamed from: b */
        private final x01 f52109b;

        /* renamed from: c */
        private final int f52110c;

        /* renamed from: d */
        private final long f52111d;

        public /* synthetic */ a(ArrayList arrayList, x01 x01Var, int i2, long j2) {
            this(i2, j2, x01Var, arrayList);
        }

        private a(int i2, long j2, x01 x01Var, ArrayList arrayList) {
            this.f52108a = arrayList;
            this.f52109b = x01Var;
            this.f52110c = i2;
            this.f52111d = j2;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ks$b */
    public static class b {
    }

    /* renamed from: com.yandex.mobile.ads.impl.ks$c */
    public static final class c implements Comparable<c> {
        public c() {
            throw null;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            Objects.requireNonNull(cVar);
            return 0;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ks$d */
    public static final class d {

        /* renamed from: a */
        private boolean f52112a;

        /* renamed from: b */
        public lq0 f52113b;

        /* renamed from: c */
        public int f52114c;

        /* renamed from: d */
        public boolean f52115d;

        /* renamed from: e */
        public int f52116e;

        /* renamed from: f */
        public boolean f52117f;

        /* renamed from: g */
        public int f52118g;

        public d(lq0 lq0Var) {
            this.f52113b = lq0Var;
        }

        /* renamed from: b */
        public final void m26251b(int i2) {
            this.f52112a = true;
            this.f52117f = true;
            this.f52118g = i2;
        }

        /* renamed from: c */
        public final void m26252c(int i2) {
            if (this.f52115d && this.f52116e != 5) {
                C5220ia.m25473a(i2 == 5);
                return;
            }
            this.f52112a = true;
            this.f52115d = true;
            this.f52116e = i2;
        }

        /* renamed from: a */
        public final void m26249a(int i2) {
            this.f52112a |= i2 > 0;
            this.f52114c += i2;
        }

        /* renamed from: a */
        public final void m26250a(lq0 lq0Var) {
            this.f52112a |= this.f52113b != lq0Var;
            this.f52113b = lq0Var;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ks$e */
    public interface e {
        /* renamed from: a */
        void mo23925a(d dVar);
    }

    /* renamed from: com.yandex.mobile.ads.impl.ks$f */
    public static final class f {

        /* renamed from: a */
        public final bc0.C4858b f52119a;

        /* renamed from: b */
        public final long f52120b;

        /* renamed from: c */
        public final long f52121c;

        /* renamed from: d */
        public final boolean f52122d;

        /* renamed from: e */
        public final boolean f52123e;

        /* renamed from: f */
        public final boolean f52124f;

        public f(bc0.C4858b c4858b, long j2, long j3, boolean z, boolean z2, boolean z3) {
            this.f52119a = c4858b;
            this.f52120b = j2;
            this.f52121c = j3;
            this.f52122d = z;
            this.f52123e = z2;
            this.f52124f = z3;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ks$g */
    public static final class g {

        /* renamed from: a */
        public final k61 f52125a;

        /* renamed from: b */
        public final int f52126b;

        /* renamed from: c */
        public final long f52127c;

        public g(k61 k61Var, int i2, long j2) {
            this.f52125a = k61Var;
            this.f52126b = i2;
            this.f52127c = j2;
        }
    }

    public C5354ks(cv0[] cv0VarArr, d71 d71Var, e71 e71Var, h80 h80Var, InterfaceC5793tc interfaceC5793tc, int i2, InterfaceC5569p8 interfaceC5569p8, f01 f01Var, C5874un c5874un, long j2, boolean z, Looper looper, f51 f51Var, e eVar, uq0 uq0Var) {
        this.f52100s = eVar;
        this.f52083b = cv0VarArr;
        this.f52086e = d71Var;
        this.f52087f = e71Var;
        this.f52088g = h80Var;
        this.f52089h = interfaceC5793tc;
        this.f52071F = i2;
        this.f52105x = f01Var;
        this.f52103v = c5874un;
        this.f52104w = j2;
        this.f52067B = z;
        this.f52099r = f51Var;
        this.f52095n = h80Var.mo25082e();
        this.f52096o = h80Var.mo25076a();
        lq0 m26519a = lq0.m26519a(e71Var);
        this.f52106y = m26519a;
        this.f52107z = new d(m26519a);
        this.f52085d = new dv0[cv0VarArr.length];
        for (int i3 = 0; i3 < cv0VarArr.length; i3++) {
            cv0VarArr[i3].mo23520a(i3, uq0Var);
            this.f52085d[i3] = cv0VarArr[i3].mo23534n();
        }
        this.f52097p = new C6033xn(this, f51Var);
        this.f52098q = new ArrayList<>();
        this.f52084c = C4693m0.m22041a();
        this.f52093l = new k61.C5323d();
        this.f52094m = new k61.C5321b();
        d71Var.m23824a(this, interfaceC5793tc);
        this.f52080O = true;
        Handler handler = new Handler(looper);
        this.f52101t = new zb0(interfaceC5569p8, handler);
        this.f52102u = new ec0(this, interfaceC5569p8, handler, uq0Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f52091j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f52092k = looper2;
        this.f52090i = f51Var.mo23885a(looper2, this);
    }

    /* renamed from: c */
    private void m26220c(boolean z) {
        if (z == this.f52075J) {
            return;
        }
        this.f52075J = z;
        if (z || !this.f52106y.f52507o) {
            return;
        }
        this.f52090i.mo23552a(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ Boolean m26222e() {
        return Boolean.valueOf(this.f52066A);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m26224f() {
        /*
            r8 = this;
            com.yandex.mobile.ads.impl.zb0 r0 = r8.f52101t
            com.yandex.mobile.ads.impl.wb0 r0 = r0.m30140d()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
            goto L1e
        Lc:
            boolean r4 = r0.f56090d
            if (r4 != 0) goto L12
            r4 = r2
            goto L18
        L12:
            com.yandex.mobile.ads.impl.vb0 r0 = r0.f56087a
            long r4 = r0.getNextLoadPositionUs()
        L18:
            r6 = -9223372036854775808
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L20
        L1e:
            r0 = 0
            goto L21
        L20:
            r0 = 1
        L21:
            if (r0 != 0) goto L24
            goto L65
        L24:
            com.yandex.mobile.ads.impl.zb0 r0 = r8.f52101t
            com.yandex.mobile.ads.impl.wb0 r0 = r0.m30140d()
            boolean r1 = r0.f56090d
            if (r1 != 0) goto L30
            r4 = r2
            goto L36
        L30:
            com.yandex.mobile.ads.impl.vb0 r1 = r0.f56087a
            long r4 = r1.getNextLoadPositionUs()
        L36:
            com.yandex.mobile.ads.impl.zb0 r1 = r8.f52101t
            com.yandex.mobile.ads.impl.wb0 r1 = r1.m30140d()
            if (r1 != 0) goto L3f
            goto L4a
        L3f:
            long r6 = r8.f52078M
            long r6 = r1.m29449c(r6)
            long r4 = r4 - r6
            long r2 = java.lang.Math.max(r2, r4)
        L4a:
            com.yandex.mobile.ads.impl.zb0 r1 = r8.f52101t
            com.yandex.mobile.ads.impl.wb0 r1 = r1.m30141e()
            if (r0 != r1) goto L53
            goto L57
        L53:
            com.yandex.mobile.ads.impl.yb0 r0 = r0.f56092f
            long r0 = r0.f56789b
        L57:
            com.yandex.mobile.ads.impl.h80 r0 = r8.f52088g
            com.yandex.mobile.ads.impl.xn r1 = r8.f52097p
            com.yandex.mobile.ads.impl.nq0 r1 = r1.getPlaybackParameters()
            float r1 = r1.f53072a
            boolean r1 = r0.mo25077a(r2, r1)
        L65:
            r8.f52070E = r1
            if (r1 == 0) goto L74
            com.yandex.mobile.ads.impl.zb0 r0 = r8.f52101t
            com.yandex.mobile.ads.impl.wb0 r0 = r0.m30140d()
            long r1 = r8.f52078M
            r0.m29443a(r1)
        L74:
            r8.m26233s()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5354ks.m26224f():void");
    }

    /* renamed from: g */
    private void m26225g() throws C5043es {
        m26191a(this.f52102u.m24098a(), true);
    }

    /* renamed from: j */
    private void m26226j() {
        this.f52107z.m26249a(1);
        m26206a(false, false, false, true);
        this.f52088g.mo25083f();
        m26211b(this.f52106y.f52493a.m26043c() ? 4 : 2);
        this.f52102u.m24104a(this.f52089h.mo25255a());
        this.f52090i.mo23552a(2);
    }

    /* renamed from: l */
    private void m26227l() {
        m26206a(true, false, true, false);
        this.f52088g.mo25079b();
        m26211b(1);
        this.f52091j.quit();
        synchronized (this) {
            this.f52066A = true;
            notifyAll();
        }
    }

    /* renamed from: m */
    private boolean m26228m() throws C5043es {
        wb0 m30142f = this.f52101t.m30142f();
        e71 m29453f = m30142f.m29453f();
        int i2 = 0;
        boolean z = false;
        while (true) {
            cv0[] cv0VarArr = this.f52083b;
            if (i2 >= cv0VarArr.length) {
                return !z;
            }
            cv0 cv0Var = cv0VarArr[i2];
            if (m26215b(cv0Var)) {
                boolean z2 = cv0Var.mo23527g() != m30142f.f56089c[i2];
                if (!m29453f.m24039a(i2) || z2) {
                    if (!cv0Var.mo23531k()) {
                        InterfaceC5939vs interfaceC5939vs = m29453f.f49832c[i2];
                        int length = interfaceC5939vs != null ? interfaceC5939vs.length() : 0;
                        C5606pv[] c5606pvArr = new C5606pv[length];
                        for (int i3 = 0; i3 < length; i3++) {
                            c5606pvArr[i3] = interfaceC5939vs.mo22393a(i3);
                        }
                        cv0Var.mo23523a(c5606pvArr, m30142f.f56089c[i2], m30142f.m29450d(), m30142f.m29448c());
                    } else if (cv0Var.mo22247a()) {
                        m26188a(cv0Var);
                    } else {
                        z = true;
                    }
                }
            }
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068 A[SYNTHETIC] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m26229n() throws com.yandex.mobile.ads.impl.C5043es {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5354ks.m26229n():void");
    }

    /* renamed from: o */
    private void m26230o() {
        wb0 m30141e = this.f52101t.m30141e();
        this.f52068C = m30141e != null && m30141e.f56092f.f56795h && this.f52067B;
    }

    /* renamed from: p */
    private boolean m26231p() {
        lq0 lq0Var = this.f52106y;
        return lq0Var.f52504l && lq0Var.f52505m == 0;
    }

    /* renamed from: r */
    private void m26232r() throws C5043es {
        this.f52097p.m29774b();
        for (cv0 cv0Var : this.f52083b) {
            if (m26215b(cv0Var) && cv0Var.mo23525c() == 2) {
                cv0Var.stop();
            }
        }
    }

    /* renamed from: s */
    private void m26233s() {
        wb0 m30140d = this.f52101t.m30140d();
        boolean z = this.f52070E || (m30140d != null && m30140d.f56087a.isLoading());
        lq0 lq0Var = this.f52106y;
        if (z != lq0Var.f52499g) {
            this.f52106y = new lq0(lq0Var.f52493a, lq0Var.f52494b, lq0Var.f52495c, lq0Var.f52496d, lq0Var.f52497e, lq0Var.f52498f, z, lq0Var.f52500h, lq0Var.f52501i, lq0Var.f52502j, lq0Var.f52503k, lq0Var.f52504l, lq0Var.f52505m, lq0Var.f52506n, lq0Var.f52508p, lq0Var.f52509q, lq0Var.f52510r, lq0Var.f52507o);
        }
    }

    /* renamed from: t */
    private void m26234t() throws C5043es {
        C5354ks c5354ks;
        C5354ks c5354ks2;
        c cVar;
        long j2;
        wb0 m30141e = this.f52101t.m30141e();
        if (m30141e == null) {
            return;
        }
        long readDiscontinuity = m30141e.f56090d ? m30141e.f56087a.readDiscontinuity() : -9223372036854775807L;
        if (readDiscontinuity != -9223372036854775807L) {
            m26187a(readDiscontinuity);
            if (readDiscontinuity != this.f52106y.f52510r) {
                lq0 lq0Var = this.f52106y;
                this.f52106y = m26183a(lq0Var.f52494b, readDiscontinuity, lq0Var.f52495c, readDiscontinuity, true, 5);
            }
            c5354ks = this;
        } else {
            long m29770a = this.f52097p.m29770a(m30141e != this.f52101t.m30142f());
            this.f52078M = m29770a;
            long m29449c = m30141e.m29449c(m29770a);
            long j3 = this.f52106y.f52510r;
            if (this.f52098q.isEmpty() || this.f52106y.f52494b.m29735a()) {
                c5354ks = this;
            } else {
                if (this.f52080O) {
                    j3--;
                    this.f52080O = false;
                }
                lq0 lq0Var2 = this.f52106y;
                int mo23970a = lq0Var2.f52493a.mo23970a(lq0Var2.f52494b.f56449a);
                int min = Math.min(this.f52079N, this.f52098q.size());
                if (min > 0) {
                    cVar = this.f52098q.get(min - 1);
                    c5354ks2 = this;
                    c5354ks = c5354ks2;
                } else {
                    c5354ks2 = this;
                    cVar = null;
                    c5354ks = this;
                }
                while (cVar != null && (mo23970a < 0 || (mo23970a == 0 && 0 > j3))) {
                    min--;
                    if (min > 0) {
                        cVar = c5354ks2.f52098q.get(min - 1);
                    } else {
                        c5354ks2 = c5354ks2;
                        cVar = null;
                        c5354ks = c5354ks;
                    }
                }
                if (min < c5354ks2.f52098q.size()) {
                    c5354ks2.f52098q.get(min);
                }
                c5354ks2.f52079N = min;
            }
            c5354ks.f52106y.f52510r = m29449c;
        }
        wb0 m30140d = c5354ks.f52101t.m30140d();
        lq0 lq0Var3 = c5354ks.f52106y;
        if (m30140d.f56090d) {
            long bufferedPositionUs = m30140d.f56091e ? m30140d.f56087a.getBufferedPositionUs() : Long.MIN_VALUE;
            j2 = bufferedPositionUs == Long.MIN_VALUE ? m30140d.f56092f.f56792e : bufferedPositionUs;
        } else {
            j2 = m30140d.f56092f.f56789b;
        }
        lq0Var3.f52508p = j2;
        lq0 lq0Var4 = c5354ks.f52106y;
        long j4 = lq0Var4.f52508p;
        wb0 m30140d2 = c5354ks.f52101t.m30140d();
        lq0Var4.f52509q = m30140d2 == null ? 0L : Math.max(0L, j4 - m30140d2.m29449c(c5354ks.f52078M));
        lq0 lq0Var5 = c5354ks.f52106y;
        if (lq0Var5.f52504l && lq0Var5.f52497e == 3 && c5354ks.m26208a(lq0Var5.f52493a, lq0Var5.f52494b)) {
            lq0 lq0Var6 = c5354ks.f52106y;
            if (lq0Var6.f52506n.f53072a == 1.0f) {
                g80 g80Var = c5354ks.f52103v;
                long m26180a = c5354ks.m26180a(lq0Var6.f52493a, lq0Var6.f52494b.f56449a, lq0Var6.f52510r);
                long j5 = c5354ks.f52106y.f52508p;
                wb0 m30140d3 = c5354ks.f52101t.m30140d();
                float m29051a = ((C5874un) g80Var).m29051a(m26180a, m30140d3 != null ? Math.max(0L, j5 - m30140d3.m29449c(c5354ks.f52078M)) : 0L);
                if (c5354ks.f52097p.getPlaybackParameters().f53072a != m29051a) {
                    c5354ks.f52097p.mo27884a(new nq0(m29051a, c5354ks.f52106y.f52506n.f53073b));
                    c5354ks.m26198a(c5354ks.f52106y.f52506n, c5354ks.f52097p.getPlaybackParameters().f53072a, false, false);
                }
            }
        }
    }

    /* renamed from: d */
    public final Looper m26239d() {
        return this.f52092k;
    }

    /* renamed from: h */
    public final void m26240h() {
        this.f52090i.mo23552a(22);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        wb0 m30142f;
        try {
            switch (message.what) {
                case 0:
                    m26226j();
                    break;
                case 1:
                    m26203a(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    m26210b();
                    break;
                case 3:
                    m26195a((g) message.obj);
                    break;
                case 4:
                    m26212b((nq0) message.obj);
                    break;
                case 5:
                    this.f52105x = (f01) message.obj;
                    break;
                case 6:
                    m26205a(false, true);
                    break;
                case 7:
                    m26227l();
                    return true;
                case 8:
                    m26218c((vb0) message.obj);
                    break;
                case 9:
                    m26213b((vb0) message.obj);
                    break;
                case 10:
                    m26229n();
                    break;
                case 11:
                    m26185a(message.arg1);
                    break;
                case 12:
                    m26223e(message.arg1 != 0);
                    break;
                case 13:
                    m26204a(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    vq0 vq0Var = (vq0) message.obj;
                    Objects.requireNonNull(vq0Var);
                    if (vq0Var.m29251a() != this.f52092k) {
                        this.f52090i.mo23550a(15, vq0Var).mo23559a();
                        break;
                    } else {
                        synchronized (vq0Var) {
                        }
                        try {
                            vq0Var.m29257c().mo24074a(vq0Var.m29258d(), vq0Var.m29256b());
                            vq0Var.m29255a(true);
                            int i2 = this.f52106y.f52497e;
                            if (i2 == 3 || i2 == 2) {
                                this.f52090i.mo23552a(2);
                                break;
                            }
                        } catch (Throwable th) {
                            vq0Var.m29255a(true);
                            throw th;
                        }
                    }
                case 15:
                    m26219c((vq0) message.obj);
                    break;
                case 16:
                    nq0 nq0Var = (nq0) message.obj;
                    m26198a(nq0Var, nq0Var.f53072a, true, false);
                    break;
                case 17:
                    m26192a((a) message.obj);
                    break;
                case 18:
                    m26193a((a) message.obj, message.arg1);
                    break;
                case 19:
                    m26194a((b) message.obj);
                    break;
                case 20:
                    m26186a(message.arg1, message.arg2, (x01) message.obj);
                    break;
                case 21:
                    m26200a((x01) message.obj);
                    break;
                case 22:
                    m26225g();
                    break;
                case 23:
                    m26221d(message.arg1 != 0);
                    break;
                case 24:
                    m26220c(message.arg1 == 1);
                    break;
                case 25:
                    m26214b(true);
                    break;
                default:
                    return false;
            }
        } catch (InterfaceC4718e.a e2) {
            m26201a(e2, e2.f48019a);
        } catch (C5035em e3) {
            m26201a(e3, e3.f50013a);
        } catch (ep0 e4) {
            int i3 = e4.f50032b;
            if (i3 == 1) {
                r0 = e4.f50031a ? 3001 : 3003;
            } else if (i3 == 4) {
                r0 = e4.f50031a ? 3002 : 3004;
            }
            m26201a(e4, r0);
        } catch (C5043es e5) {
            e = e5;
            if (e.f50041c == 1 && (m30142f = this.f52101t.m30142f()) != null) {
                e = e.m24250a(m30142f.f56092f.f56788a);
            }
            if (e.f50047i && this.f52081P == null) {
                d90.m23840b("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f52081P = e;
                InterfaceC4944cy interfaceC4944cy = this.f52090i;
                interfaceC4944cy.mo23554a(interfaceC4944cy.mo23550a(25, e));
            } else {
                C5043es c5043es = this.f52081P;
                if (c5043es != null) {
                    c5043es.addSuppressed(e);
                    e = this.f52081P;
                }
                d90.m23838a("ExoPlayerImplInternal", "Playback error", e);
                m26205a(true, false);
                this.f52106y = this.f52106y.m26523a(e);
            }
        } catch (IOException e6) {
            m26201a(e6, 2000);
        } catch (RuntimeException e7) {
            C5043es m24247a = C5043es.m24247a(e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            d90.m23838a("ExoPlayerImplInternal", "Playback error", m24247a);
            m26205a(true, false);
            this.f52106y = this.f52106y.m26523a(m24247a);
        }
        this.f52107z.m26250a(this.f52106y);
        if (this.f52107z.f52112a) {
            this.f52100s.mo23925a(this.f52107z);
            this.f52107z = new d(this.f52106y);
        }
        return true;
    }

    /* renamed from: i */
    public final void m26241i() {
        this.f52090i.mo23556b(0).mo23559a();
    }

    /* renamed from: k */
    public final synchronized boolean m26242k() {
        boolean z;
        if (!this.f52066A && this.f52091j.isAlive()) {
            this.f52090i.mo23552a(7);
            long j2 = this.f52104w;
            synchronized (this) {
                long mo23887c = this.f52099r.mo23887c() + j2;
                boolean z2 = false;
                while (!m26222e().booleanValue() && j2 > 0) {
                    try {
                        this.f52099r.mo23886b();
                        wait(j2);
                    } catch (InterruptedException unused) {
                        z2 = true;
                    }
                    j2 = mo23887c - this.f52099r.mo23887c();
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                z = this.f52066A;
            }
            return z;
        }
        return true;
    }

    /* renamed from: q */
    public final void m26243q() {
        this.f52090i.mo23556b(6).mo23559a();
    }

    /* renamed from: d */
    private void m26221d(boolean z) throws C5043es {
        this.f52067B = z;
        m26230o();
        if (!this.f52068C || this.f52101t.m30142f() == this.f52101t.m30141e()) {
            return;
        }
        m26214b(true);
        m26202a(false);
    }

    /* renamed from: e */
    private void m26223e(boolean z) throws C5043es {
        this.f52072G = z;
        if (!this.f52101t.m30135a(this.f52106y.f52493a, z)) {
            m26214b(true);
        }
        m26202a(false);
    }

    @Override // com.yandex.mobile.ads.impl.n01.InterfaceC5468a
    /* renamed from: a */
    public final void mo23268a(vb0 vb0Var) {
        this.f52090i.mo23550a(9, vb0Var).mo23559a();
    }

    /* renamed from: b */
    public final synchronized void m26238b(vq0 vq0Var) {
        if (!this.f52066A && this.f52091j.isAlive()) {
            this.f52090i.mo23550a(14, vq0Var).mo23559a();
            return;
        }
        d90.m23842d("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        vq0Var.m29255a(false);
    }

    /* renamed from: a */
    public final void m26237a(boolean z, int i2) {
        this.f52090i.mo23549a(z ? 1 : 0, i2).mo23559a();
    }

    /* renamed from: c */
    private void m26219c(vq0 vq0Var) {
        Looper m29251a = vq0Var.m29251a();
        if (!m29251a.getThread().isAlive()) {
            d90.m23842d("TAG", "Trying to send message on a dead thread.");
            vq0Var.m29255a(false);
        } else {
            this.f52099r.mo23885a(m29251a, null).mo23555a(new hn1(this, vq0Var, 5));
        }
    }

    /* renamed from: b */
    private void m26211b(int i2) {
        lq0 lq0Var = this.f52106y;
        if (lq0Var.f52497e != i2) {
            if (i2 != 2) {
                this.f52082Q = -9223372036854775807L;
            }
            this.f52106y = lq0Var.m26520a(i2);
        }
    }

    /* renamed from: a */
    public final void m26235a(int i2, long j2, x01 x01Var, ArrayList arrayList) {
        this.f52090i.mo23550a(17, new a(arrayList, x01Var, i2, j2)).mo23559a();
    }

    /* renamed from: b */
    private void m26214b(boolean z) throws C5043es {
        bc0.C4858b c4858b = this.f52101t.m30141e().f56092f.f56788a;
        long m26179a = m26179a(c4858b, this.f52106y.f52510r, true, false);
        if (m26179a != this.f52106y.f52510r) {
            lq0 lq0Var = this.f52106y;
            this.f52106y = m26183a(c4858b, m26179a, lq0Var.f52495c, lq0Var.f52496d, z, 5);
        }
    }

    @Override // com.yandex.mobile.ads.impl.vb0.InterfaceC5910a
    /* renamed from: a, reason: avoid collision after fix types in other method */
    public final void mo29210a(vb0 vb0Var) {
        this.f52090i.mo23550a(8, vb0Var).mo23559a();
    }

    @Override // com.yandex.mobile.ads.impl.d71.InterfaceC4959a
    /* renamed from: a */
    public final void mo23830a() {
        this.f52090i.mo23552a(10);
    }

    /* renamed from: c */
    private long m26216c() {
        wb0 m30142f = this.f52101t.m30142f();
        if (m30142f == null) {
            return 0L;
        }
        long m29448c = m30142f.m29448c();
        if (!m30142f.f56090d) {
            return m29448c;
        }
        int i2 = 0;
        while (true) {
            cv0[] cv0VarArr = this.f52083b;
            if (i2 >= cv0VarArr.length) {
                return m29448c;
            }
            if (m26215b(cv0VarArr[i2]) && this.f52083b[i2].mo23527g() == m30142f.f56089c[i2]) {
                long mo23530j = this.f52083b[i2].mo23530j();
                if (mo23530j == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                m29448c = Math.max(mo23530j, m29448c);
            }
            i2++;
        }
    }

    /* renamed from: a */
    public final void m26236a(nq0 nq0Var) {
        this.f52090i.mo23550a(16, nq0Var).mo23559a();
    }

    /* renamed from: a */
    private void m26201a(IOException iOException, int i2) {
        C5043es m24245a = C5043es.m24245a(iOException, i2);
        wb0 m30141e = this.f52101t.m30141e();
        if (m30141e != null) {
            m24245a = m24245a.m24250a(m30141e.f56092f.f56788a);
        }
        d90.m23838a("ExoPlayerImplInternal", "Playback error", m24245a);
        m26205a(false, false);
        this.f52106y = this.f52106y.m26523a(m24245a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x0412, code lost:
    
        if (m26231p() == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x051c, code lost:
    
        if ((r4.f56090d && (r6 == -9223372036854775807L || r44.f52106y.f52510r < r6 || !m26231p())) != false) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0521, code lost:
    
        r44.f52069D = m26231p();
        m26211b(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x052c, code lost:
    
        if (r44.f52069D == false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x052e, code lost:
    
        r4 = r44.f52101t.m30141e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0534, code lost:
    
        if (r4 == null) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0536, code lost:
    
        r6 = r4.m29453f().f49832c;
        r7 = r6.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x053e, code lost:
    
        if (r8 >= r7) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0540, code lost:
    
        r9 = r6[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0542, code lost:
    
        if (r9 == null) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0544, code lost:
    
        r9.mo24852g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0547, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x054a, code lost:
    
        r4 = r4.m29446b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x054f, code lost:
    
        ((com.yandex.mobile.ads.impl.C5874un) r44.f52103v).m29055c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0556, code lost:
    
        m26232r();
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x051f, code lost:
    
        if (r4 == false) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x04b9, code lost:
    
        if (r6.mo25078a(r29, r44.f52097p.getPlaybackParameters().f53072a, r44.f52069D, r33) != false) goto L294;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02fa A[EDGE_INSN: B:68:0x02fa->B:69:0x02fa BREAK  A[LOOP:0: B:37:0x0253->B:65:0x02d7], SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m26210b() throws com.yandex.mobile.ads.impl.C5043es, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5354ks.m26210b():void");
    }

    /* renamed from: c */
    private void m26218c(vb0 vb0Var) throws C5043es {
        if (this.f52101t.m30136a(vb0Var)) {
            wb0 m30140d = this.f52101t.m30140d();
            m30140d.m29442a(this.f52097p.getPlaybackParameters().f53072a, this.f52106y.f52493a);
            this.f52088g.mo25075a(this.f52083b, m30140d.m29453f().f49832c);
            if (m30140d == this.f52101t.m30141e()) {
                m26187a(m30140d.f56092f.f56789b);
                m26207a(new boolean[this.f52083b.length]);
                lq0 lq0Var = this.f52106y;
                bc0.C4858b c4858b = lq0Var.f52494b;
                long j2 = m30140d.f56092f.f56789b;
                this.f52106y = m26183a(c4858b, j2, lq0Var.f52495c, j2, false, 5);
            }
            m26224f();
        }
    }

    /* renamed from: a */
    private void m26192a(a aVar) throws C5043es {
        this.f52107z.m26249a(1);
        if (aVar.f52110c != -1) {
            this.f52077L = new g(new jr0(aVar.f52108a, aVar.f52109b), aVar.f52110c, aVar.f52111d);
        }
        m26191a(this.f52102u.m24102a(aVar.f52108a, aVar.f52109b), false);
    }

    /* renamed from: a */
    private void m26193a(a aVar, int i2) throws C5043es {
        this.f52107z.m26249a(1);
        ec0 ec0Var = this.f52102u;
        if (i2 == -1) {
            i2 = ec0Var.m24106b();
        }
        m26191a(ec0Var.m24100a(i2, aVar.f52108a, aVar.f52109b), false);
    }

    /* renamed from: a */
    private void m26194a(b bVar) throws C5043es {
        this.f52107z.m26249a(1);
        ec0 ec0Var = this.f52102u;
        Objects.requireNonNull(bVar);
        m26191a(ec0Var.m24108d(), false);
    }

    /* renamed from: a */
    private void m26186a(int i2, int i3, x01 x01Var) throws C5043es {
        this.f52107z.m26249a(1);
        m26191a(this.f52102u.m24099a(i2, i3, x01Var), false);
    }

    /* renamed from: a */
    private void m26200a(x01 x01Var) throws C5043es {
        this.f52107z.m26249a(1);
        m26191a(this.f52102u.m24101a(x01Var), false);
    }

    /* renamed from: a */
    private void m26203a(boolean z, int i2, boolean z2, int i3) throws C5043es {
        this.f52107z.m26249a(z2 ? 1 : 0);
        this.f52107z.m26251b(i3);
        lq0 lq0Var = this.f52106y;
        this.f52106y = new lq0(lq0Var.f52493a, lq0Var.f52494b, lq0Var.f52495c, lq0Var.f52496d, lq0Var.f52497e, lq0Var.f52498f, lq0Var.f52499g, lq0Var.f52500h, lq0Var.f52501i, lq0Var.f52502j, lq0Var.f52503k, z, i2, lq0Var.f52506n, lq0Var.f52508p, lq0Var.f52509q, lq0Var.f52510r, lq0Var.f52507o);
        this.f52069D = false;
        for (wb0 m30141e = this.f52101t.m30141e(); m30141e != null; m30141e = m30141e.m29446b()) {
            for (InterfaceC5939vs interfaceC5939vs : m30141e.m29453f().f49832c) {
                if (interfaceC5939vs != null) {
                    interfaceC5939vs.mo24847a(z);
                }
            }
        }
        if (!m26231p()) {
            m26232r();
            m26234t();
            return;
        }
        int i4 = this.f52106y.f52497e;
        if (i4 != 3) {
            if (i4 == 2) {
                this.f52090i.mo23552a(2);
                return;
            }
            return;
        }
        this.f52069D = false;
        this.f52097p.m29771a();
        for (cv0 cv0Var : this.f52083b) {
            if (m26215b(cv0Var)) {
                cv0Var.start();
            }
        }
        this.f52090i.mo23552a(2);
    }

    /* renamed from: a */
    private void m26185a(int i2) throws C5043es {
        this.f52071F = i2;
        if (!this.f52101t.m30133a(this.f52106y.f52493a, i2)) {
            m26214b(true);
        }
        m26202a(false);
    }

    /* renamed from: a */
    private long m26180a(k61 k61Var, Object obj, long j2) {
        long elapsedRealtime;
        k61Var.mo23974a(k61Var.mo23973a(obj, this.f52094m).f51851c, this.f52093l, 0L);
        k61.C5323d c5323d = this.f52093l;
        if (c5323d.f51869f != -9223372036854775807L && c5323d.m26065a()) {
            k61.C5323d c5323d2 = this.f52093l;
            if (c5323d2.f51872i) {
                long j3 = c5323d2.f51870g;
                int i2 = s91.f54530a;
                if (j3 == -9223372036854775807L) {
                    elapsedRealtime = System.currentTimeMillis();
                } else {
                    elapsedRealtime = j3 + SystemClock.elapsedRealtime();
                }
                return s91.m28096a(elapsedRealtime - this.f52093l.f51869f) - (j2 + this.f52094m.f51853e);
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    private boolean m26208a(k61 k61Var, bc0.C4858b c4858b) {
        if (c4858b.m29735a() || k61Var.m26043c()) {
            return false;
        }
        k61Var.mo23974a(k61Var.mo23973a(c4858b.f56449a, this.f52094m).f51851c, this.f52093l, 0L);
        if (!this.f52093l.m26065a()) {
            return false;
        }
        k61.C5323d c5323d = this.f52093l;
        return c5323d.f51872i && c5323d.f51869f != -9223372036854775807L;
    }

    /* renamed from: a */
    private void m26195a(g gVar) throws C5043es {
        long j2;
        long j3;
        boolean z;
        bc0.C4858b c4858b;
        long j4;
        long j5;
        long j6;
        lq0 lq0Var;
        int i2;
        this.f52107z.m26249a(1);
        Pair m26182a = m26182a(this.f52106y.f52493a, gVar, this.f52071F, this.f52072G, this.f52093l, this.f52094m);
        if (m26182a == null) {
            Pair<bc0.C4858b, Long> m26181a = m26181a(this.f52106y.f52493a);
            c4858b = (bc0.C4858b) m26181a.first;
            long longValue = ((Long) m26181a.second).longValue();
            z = !this.f52106y.f52493a.m26043c();
            j2 = longValue;
            j3 = -9223372036854775807L;
        } else {
            Object obj = m26182a.first;
            long longValue2 = ((Long) m26182a.second).longValue();
            long j7 = gVar.f52127c == -9223372036854775807L ? -9223372036854775807L : longValue2;
            bc0.C4858b m30127a = this.f52101t.m30127a(this.f52106y.f52493a, obj, longValue2);
            if (m30127a.m29735a()) {
                this.f52106y.f52493a.mo23973a(m30127a.f56449a, this.f52094m);
                longValue2 = this.f52094m.m26059d(m30127a.f56450b) == m30127a.f56451c ? this.f52094m.m26054b() : 0L;
            } else if (gVar.f52127c != -9223372036854775807L) {
                j2 = longValue2;
                j3 = j7;
                z = false;
                c4858b = m30127a;
            }
            j2 = longValue2;
            j3 = j7;
            z = true;
            c4858b = m30127a;
        }
        try {
            if (this.f52106y.f52493a.m26043c()) {
                this.f52077L = gVar;
            } else if (m26182a == null) {
                if (this.f52106y.f52497e != 1) {
                    m26211b(4);
                }
                m26206a(false, true, false, true);
            } else {
                if (c4858b.equals(this.f52106y.f52494b)) {
                    wb0 m30141e = this.f52101t.m30141e();
                    long mo23265a = (m30141e == null || !m30141e.f56090d || j2 == 0) ? j2 : m30141e.f56087a.mo23265a(j2, this.f52105x);
                    if (s91.m28119b(mo23265a) == s91.m28119b(this.f52106y.f52510r) && ((i2 = (lq0Var = this.f52106y).f52497e) == 2 || i2 == 3)) {
                        long j8 = lq0Var.f52510r;
                        this.f52106y = m26183a(c4858b, j8, j3, j8, z, 2);
                        return;
                    }
                    j5 = mo23265a;
                } else {
                    j5 = j2;
                }
                long m26179a = m26179a(c4858b, j5, this.f52101t.m30141e() != this.f52101t.m30142f(), this.f52106y.f52497e == 4);
                boolean z2 = z | (j2 != m26179a);
                try {
                    lq0 lq0Var2 = this.f52106y;
                    k61 k61Var = lq0Var2.f52493a;
                    m26189a(k61Var, c4858b, k61Var, lq0Var2.f52494b, j3);
                    z = z2;
                    j6 = m26179a;
                    this.f52106y = m26183a(c4858b, j6, j3, j6, z, 2);
                } catch (Throwable th) {
                    th = th;
                    z = z2;
                    j4 = m26179a;
                    this.f52106y = m26183a(c4858b, j4, j3, j4, z, 2);
                    throw th;
                }
            }
            j6 = j2;
            this.f52106y = m26183a(c4858b, j6, j3, j6, z, 2);
        } catch (Throwable th2) {
            th = th2;
            j4 = j2;
        }
    }

    /* renamed from: a */
    private long m26179a(bc0.C4858b c4858b, long j2, boolean z, boolean z2) throws C5043es {
        long j3;
        wb0 wb0Var;
        m26232r();
        this.f52069D = false;
        if (z2 || this.f52106y.f52497e == 3) {
            m26211b(2);
        }
        wb0 m30141e = this.f52101t.m30141e();
        wb0 wb0Var2 = m30141e;
        while (wb0Var2 != null && !c4858b.equals(wb0Var2.f56092f.f56788a)) {
            wb0Var2 = wb0Var2.m29446b();
        }
        if (z || m30141e != wb0Var2 || (wb0Var2 != null && wb0Var2.m29451d(j2) < 0)) {
            for (cv0 cv0Var : this.f52083b) {
                m26188a(cv0Var);
            }
            if (wb0Var2 != null) {
                while (this.f52101t.m30141e() != wb0Var2) {
                    this.f52101t.m30128a();
                }
                this.f52101t.m30137a(wb0Var2);
                wb0Var2.m29455h();
                m26207a(new boolean[this.f52083b.length]);
            }
        }
        if (wb0Var2 != null) {
            this.f52101t.m30137a(wb0Var2);
            if (!wb0Var2.f56090d) {
                yb0 yb0Var = wb0Var2.f56092f;
                if (j2 == yb0Var.f56789b) {
                    wb0Var = wb0Var2;
                } else {
                    wb0Var = wb0Var2;
                    yb0Var = new yb0(yb0Var.f56788a, j2, yb0Var.f56790c, yb0Var.f56791d, yb0Var.f56792e, yb0Var.f56793f, yb0Var.f56794g, yb0Var.f56795h, yb0Var.f56796i);
                }
                wb0Var.f56092f = yb0Var;
            } else {
                wb0 wb0Var3 = wb0Var2;
                if (wb0Var3.f56091e) {
                    j3 = wb0Var3.f56087a.seekToUs(j2);
                    wb0Var3.f56087a.discardBuffer(j3 - this.f52095n, this.f52096o);
                    m26187a(j3);
                    m26224f();
                }
            }
            j3 = j2;
            m26187a(j3);
            m26224f();
        } else {
            this.f52101t.m30139c();
            m26187a(j2);
            j3 = j2;
        }
        m26202a(false);
        this.f52090i.mo23552a(2);
        return j3;
    }

    /* renamed from: a */
    private void m26187a(long j2) throws C5043es {
        wb0 m30141e = this.f52101t.m30141e();
        long m29451d = m30141e == null ? j2 + 1000000000000L : m30141e.m29451d(j2);
        this.f52078M = m29451d;
        this.f52097p.m29772a(m29451d);
        for (cv0 cv0Var : this.f52083b) {
            if (m26215b(cv0Var)) {
                cv0Var.mo23521a(this.f52078M);
            }
        }
        for (wb0 m30141e2 = this.f52101t.m30141e(); m30141e2 != null; m30141e2 = m30141e2.m29446b()) {
            for (InterfaceC5939vs interfaceC5939vs : m30141e2.m29453f().f49832c) {
                if (interfaceC5939vs != null) {
                    interfaceC5939vs.mo24851f();
                }
            }
        }
    }

    /* renamed from: a */
    private void m26204a(boolean z, @Nullable AtomicBoolean atomicBoolean) {
        if (this.f52073H != z) {
            this.f52073H = z;
            if (!z) {
                for (cv0 cv0Var : this.f52083b) {
                    if (!m26215b(cv0Var) && this.f52084c.remove(cv0Var)) {
                        cv0Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* renamed from: a */
    private void m26205a(boolean z, boolean z2) {
        m26206a(z || !this.f52073H, false, true, false);
        this.f52107z.m26249a(z2 ? 1 : 0);
        this.f52088g.mo25081d();
        m26211b(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dd  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m26206a(boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5354ks.m26206a(boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: b */
    private void m26212b(nq0 nq0Var) throws C5043es {
        this.f52097p.mo27884a(nq0Var);
        nq0 playbackParameters = this.f52097p.getPlaybackParameters();
        m26198a(playbackParameters, playbackParameters.f53072a, true, true);
    }

    /* renamed from: b */
    private void m26213b(vb0 vb0Var) {
        if (this.f52101t.m30136a(vb0Var)) {
            this.f52101t.m30132a(this.f52078M);
            m26224f();
        }
    }

    /* renamed from: b */
    private static boolean m26215b(cv0 cv0Var) {
        return cv0Var.mo23525c() != 0;
    }

    /* renamed from: a */
    private Pair<bc0.C4858b, Long> m26181a(k61 k61Var) {
        long j2 = 0;
        if (k61Var.m26043c()) {
            return Pair.create(lq0.m26518a(), 0L);
        }
        Pair<Object, Long> m26041a = k61Var.m26041a(this.f52093l, this.f52094m, k61Var.mo23971a(this.f52072G), -9223372036854775807L);
        bc0.C4858b m30127a = this.f52101t.m30127a(k61Var, m26041a.first, 0L);
        long longValue = ((Long) m26041a.second).longValue();
        if (m30127a.m29735a()) {
            k61Var.mo23973a(m30127a.f56449a, this.f52094m);
            if (m30127a.f56451c == this.f52094m.m26059d(m30127a.f56450b)) {
                j2 = this.f52094m.m26054b();
            }
        } else {
            j2 = longValue;
        }
        return Pair.create(m30127a, Long.valueOf(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m26199a(vq0 vq0Var) {
        try {
            synchronized (vq0Var) {
            }
            try {
                vq0Var.m29257c().mo24074a(vq0Var.m29258d(), vq0Var.m29256b());
            } finally {
                vq0Var.m29255a(true);
            }
        } catch (C5043es e2) {
            d90.m23838a("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    private void m26190a(k61 k61Var, k61 k61Var2) {
        if (k61Var.m26043c() && k61Var2.m26043c()) {
            return;
        }
        int size = this.f52098q.size() - 1;
        if (size < 0) {
            Collections.sort(this.f52098q);
        } else {
            Objects.requireNonNull(this.f52098q.get(size));
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0379, code lost:
    
        if (r0.mo23973a(r1, r37.f52094m).f51854f != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0407, code lost:
    
        if (r1.mo23973a(r2, r37.f52094m).f51854f != false) goto L211;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x022b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0418  */
    /* JADX WARN: Type inference failed for: r18v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v15, types: [com.yandex.mobile.ads.impl.bc0$b] */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v17 */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v27 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m26191a(com.yandex.mobile.ads.impl.k61 r38, boolean r39) throws com.yandex.mobile.ads.impl.C5043es {
        /*
            Method dump skipped, instructions count: 1097
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5354ks.m26191a(com.yandex.mobile.ads.impl.k61, boolean):void");
    }

    /* renamed from: a */
    private void m26189a(k61 k61Var, bc0.C4858b c4858b, k61 k61Var2, bc0.C4858b c4858b2, long j2) {
        if (!m26208a(k61Var, c4858b)) {
            nq0 nq0Var = c4858b.m29735a() ? nq0.f53071d : this.f52106y.f52506n;
            if (this.f52097p.getPlaybackParameters().equals(nq0Var)) {
                return;
            }
            this.f52097p.mo27884a(nq0Var);
            return;
        }
        k61Var.mo23974a(k61Var.mo23973a(c4858b.f56449a, this.f52094m).f51851c, this.f52093l, 0L);
        g80 g80Var = this.f52103v;
        pb0.C5579e c5579e = this.f52093l.f51874k;
        int i2 = s91.f54530a;
        ((C5874un) g80Var).m29054a(c5579e);
        if (j2 != -9223372036854775807L) {
            ((C5874un) this.f52103v).m29053a(m26180a(k61Var, c4858b.f56449a, j2));
            return;
        }
        if (s91.m28112a(k61Var2.m26043c() ? null : k61Var2.mo23974a(k61Var2.mo23973a(c4858b2.f56449a, this.f52094m).f51851c, this.f52093l, 0L).f51864a, this.f52093l.f51864a)) {
            return;
        }
        ((C5874un) this.f52103v).m29053a(-9223372036854775807L);
    }

    /* renamed from: a */
    private void m26198a(nq0 nq0Var, float f2, boolean z, boolean z2) throws C5043es {
        int i2;
        C5354ks c5354ks = this;
        if (z) {
            if (z2) {
                c5354ks.f52107z.m26249a(1);
            }
            lq0 lq0Var = c5354ks.f52106y;
            c5354ks = this;
            c5354ks.f52106y = new lq0(lq0Var.f52493a, lq0Var.f52494b, lq0Var.f52495c, lq0Var.f52496d, lq0Var.f52497e, lq0Var.f52498f, lq0Var.f52499g, lq0Var.f52500h, lq0Var.f52501i, lq0Var.f52502j, lq0Var.f52503k, lq0Var.f52504l, lq0Var.f52505m, nq0Var, lq0Var.f52508p, lq0Var.f52509q, lq0Var.f52510r, lq0Var.f52507o);
        }
        float f3 = nq0Var.f53072a;
        wb0 m30141e = c5354ks.f52101t.m30141e();
        while (true) {
            i2 = 0;
            if (m30141e == null) {
                break;
            }
            InterfaceC5939vs[] interfaceC5939vsArr = m30141e.m29453f().f49832c;
            int length = interfaceC5939vsArr.length;
            while (i2 < length) {
                InterfaceC5939vs interfaceC5939vs = interfaceC5939vsArr[i2];
                if (interfaceC5939vs != null) {
                    interfaceC5939vs.mo24846a(f3);
                }
                i2++;
            }
            m30141e = m30141e.m29446b();
        }
        cv0[] cv0VarArr = c5354ks.f52083b;
        int length2 = cv0VarArr.length;
        while (i2 < length2) {
            cv0 cv0Var = cv0VarArr[i2];
            if (cv0Var != null) {
                cv0Var.mo23519a(f2, nq0Var.f53072a);
            }
            i2++;
        }
    }

    @CheckResult
    /* renamed from: a */
    private lq0 m26183a(bc0.C4858b c4858b, long j2, long j3, long j4, boolean z, int i2) {
        List<Metadata> list;
        x61 x61Var;
        e71 e71Var;
        x61 m29452e;
        e71 m29453f;
        e71 e71Var2;
        this.f52080O = (!this.f52080O && j2 == this.f52106y.f52510r && c4858b.equals(this.f52106y.f52494b)) ? false : true;
        m26230o();
        lq0 lq0Var = this.f52106y;
        x61 x61Var2 = lq0Var.f52500h;
        e71 e71Var3 = lq0Var.f52501i;
        List<Metadata> list2 = lq0Var.f52502j;
        if (this.f52102u.m24107c()) {
            wb0 m30141e = this.f52101t.m30141e();
            if (m30141e == null) {
                m29452e = x61.f56383d;
            } else {
                m29452e = m30141e.m29452e();
            }
            x61 x61Var3 = m29452e;
            if (m30141e == null) {
                m29453f = this.f52087f;
            } else {
                m29453f = m30141e.m29453f();
            }
            e71 e71Var4 = m29453f;
            InterfaceC5939vs[] interfaceC5939vsArr = e71Var4.f49832c;
            AbstractC4698p.a aVar = new AbstractC4698p.a();
            boolean z2 = false;
            for (InterfaceC5939vs interfaceC5939vs : interfaceC5939vsArr) {
                if (interfaceC5939vs != null) {
                    Metadata metadata = interfaceC5939vs.mo22393a(0).f53818j;
                    if (metadata == null) {
                        aVar.m22060b(new Metadata(new Metadata.Entry[0]));
                    } else {
                        aVar.m22060b(metadata);
                        z2 = true;
                    }
                }
            }
            AbstractC4698p m22058a = z2 ? aVar.m22058a() : AbstractC4698p.m22055i();
            if (m30141e != null) {
                yb0 yb0Var = m30141e.f56092f;
                long j5 = yb0Var.f56790c;
                if (j5 != j3) {
                    if (j3 == j5) {
                        e71Var2 = e71Var4;
                    } else {
                        e71Var2 = e71Var4;
                        yb0Var = new yb0(yb0Var.f56788a, yb0Var.f56789b, j3, yb0Var.f56791d, yb0Var.f56792e, yb0Var.f56793f, yb0Var.f56794g, yb0Var.f56795h, yb0Var.f56796i);
                    }
                    m30141e.f56092f = yb0Var;
                    x61Var = x61Var3;
                    list = m22058a;
                    e71Var = e71Var2;
                }
            }
            e71Var2 = e71Var4;
            x61Var = x61Var3;
            list = m22058a;
            e71Var = e71Var2;
        } else if (c4858b.equals(this.f52106y.f52494b)) {
            list = list2;
            x61Var = x61Var2;
            e71Var = e71Var3;
        } else {
            x61Var = x61.f56383d;
            e71Var = this.f52087f;
            list = AbstractC4698p.m22055i();
        }
        if (z) {
            this.f52107z.m26252c(i2);
        }
        lq0 lq0Var2 = this.f52106y;
        long j6 = lq0Var2.f52508p;
        wb0 m30140d = this.f52101t.m30140d();
        return lq0Var2.m26522a(c4858b, j2, j3, j4, m30140d == null ? 0L : Math.max(0L, j6 - m30140d.m29449c(this.f52078M)), x61Var, e71Var, list);
    }

    /* renamed from: a */
    private void m26207a(boolean[] zArr) throws C5043es {
        wb0 m30142f = this.f52101t.m30142f();
        e71 m29453f = m30142f.m29453f();
        for (int i2 = 0; i2 < this.f52083b.length; i2++) {
            if (!m29453f.m24039a(i2) && this.f52084c.remove(this.f52083b[i2])) {
                this.f52083b[i2].reset();
            }
        }
        for (int i3 = 0; i3 < this.f52083b.length; i3++) {
            if (m29453f.m24039a(i3)) {
                boolean z = zArr[i3];
                cv0 cv0Var = this.f52083b[i3];
                if (!m26215b(cv0Var)) {
                    wb0 m30142f2 = this.f52101t.m30142f();
                    boolean z2 = m30142f2 == this.f52101t.m30141e();
                    e71 m29453f2 = m30142f2.m29453f();
                    ev0 ev0Var = m29453f2.f49831b[i3];
                    InterfaceC5939vs interfaceC5939vs = m29453f2.f49832c[i3];
                    int length = interfaceC5939vs != null ? interfaceC5939vs.length() : 0;
                    C5606pv[] c5606pvArr = new C5606pv[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        c5606pvArr[i4] = interfaceC5939vs.mo22393a(i4);
                    }
                    boolean z3 = m26231p() && this.f52106y.f52497e == 3;
                    boolean z4 = !z && z3;
                    this.f52076K++;
                    this.f52084c.add(cv0Var);
                    cv0Var.mo23522a(ev0Var, c5606pvArr, m30142f2.f56089c[i3], this.f52078M, z4, z2, m30142f2.m29450d(), m30142f2.m29448c());
                    cv0Var.mo24074a(11, new C5300js(this));
                    this.f52097p.m29775b(cv0Var);
                    if (z3) {
                        cv0Var.start();
                    }
                }
            }
        }
        m30142f.f56093g = true;
    }

    /* renamed from: a */
    private void m26202a(boolean z) {
        long j2;
        wb0 m30140d = this.f52101t.m30140d();
        bc0.C4858b c4858b = m30140d == null ? this.f52106y.f52494b : m30140d.f56092f.f56788a;
        boolean z2 = !this.f52106y.f52503k.equals(c4858b);
        if (z2) {
            this.f52106y = this.f52106y.m26521a(c4858b);
        }
        lq0 lq0Var = this.f52106y;
        if (m30140d == null) {
            j2 = lq0Var.f52510r;
        } else if (!m30140d.f56090d) {
            j2 = m30140d.f56092f.f56789b;
        } else {
            long bufferedPositionUs = m30140d.f56091e ? m30140d.f56087a.getBufferedPositionUs() : Long.MIN_VALUE;
            j2 = bufferedPositionUs == Long.MIN_VALUE ? m30140d.f56092f.f56792e : bufferedPositionUs;
        }
        lq0Var.f52508p = j2;
        lq0 lq0Var2 = this.f52106y;
        long j3 = lq0Var2.f52508p;
        wb0 m30140d2 = this.f52101t.m30140d();
        lq0Var2.f52509q = m30140d2 != null ? Math.max(0L, j3 - m30140d2.m29449c(this.f52078M)) : 0L;
        if ((z2 || z) && m30140d != null && m30140d.f56090d) {
            this.f52088g.mo25075a(this.f52083b, m30140d.m29453f().f49832c);
        }
    }

    @Nullable
    /* renamed from: a */
    private static Pair m26182a(k61 k61Var, g gVar, int i2, boolean z, k61.C5323d c5323d, k61.C5321b c5321b) {
        Pair<Object, Long> m26041a;
        k61 k61Var2 = gVar.f52125a;
        if (k61Var.m26043c()) {
            return null;
        }
        if (k61Var2.m26043c()) {
            k61Var2 = k61Var;
        }
        try {
            m26041a = k61Var2.m26041a(c5323d, c5321b, gVar.f52126b, gVar.f52127c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (k61Var.equals(k61Var2)) {
            return m26041a;
        }
        if (k61Var.mo23970a(m26041a.first) != -1) {
            return (k61Var2.mo23973a(m26041a.first, c5321b).f51854f && k61Var2.mo23974a(c5321b.f51851c, c5323d, 0L).f51878o == k61Var2.mo23970a(m26041a.first)) ? k61Var.m26041a(c5323d, c5321b, k61Var.mo23973a(m26041a.first, c5321b).f51851c, gVar.f52127c) : m26041a;
        }
        Object m26184a = m26184a(c5323d, c5321b, i2, z, m26041a.first, k61Var2, k61Var);
        if (m26184a != null) {
            return k61Var.m26041a(c5323d, c5321b, k61Var.mo23973a(m26184a, c5321b).f51851c, -9223372036854775807L);
        }
        return null;
    }

    @Nullable
    /* renamed from: a */
    public static Object m26184a(k61.C5323d c5323d, k61.C5321b c5321b, int i2, boolean z, Object obj, k61 k61Var, k61 k61Var2) {
        int mo23970a = k61Var.mo23970a(obj);
        int mo25934a = k61Var.mo25934a();
        int i3 = mo23970a;
        int i4 = -1;
        for (int i5 = 0; i5 < mo25934a && i4 == -1; i5++) {
            i3 = k61Var.m26040a(i3, c5321b, c5323d, i2, z);
            if (i3 == -1) {
                break;
            }
            i4 = k61Var2.mo23970a(k61Var.mo23975a(i3));
        }
        if (i4 == -1) {
            return null;
        }
        return k61Var2.mo23975a(i4);
    }

    /* renamed from: a */
    private void m26188a(cv0 cv0Var) throws C5043es {
        if (cv0Var.mo23525c() != 0) {
            this.f52097p.m29773a(cv0Var);
            if (cv0Var.mo23525c() == 2) {
                cv0Var.stop();
            }
            cv0Var.mo23524b();
            this.f52076K--;
        }
    }
}
