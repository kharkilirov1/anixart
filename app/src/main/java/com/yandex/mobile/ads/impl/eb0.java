package com.yandex.mobile.ads.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.exo.video.PlaceholderSurface;
import com.yandex.mobile.ads.impl.bb0;
import com.yandex.mobile.ads.impl.hf1;
import com.yandex.mobile.ads.impl.sa0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class eb0 extends ya0 {

    /* renamed from: q1 */
    private static final fb0 f49856q1 = ct0.m23516h();

    /* renamed from: r1 */
    private static final int[] f49857r1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: s1 */
    private static boolean f49858s1;

    /* renamed from: t1 */
    private static boolean f49859t1;

    /* renamed from: H0 */
    private final Context f49860H0;

    /* renamed from: I0 */
    private final ne1 f49861I0;

    /* renamed from: J0 */
    private final hf1.C5183a f49862J0;

    /* renamed from: K0 */
    private final long f49863K0;

    /* renamed from: L0 */
    private final int f49864L0;

    /* renamed from: M0 */
    private final boolean f49865M0;

    /* renamed from: N0 */
    private C5013a f49866N0;

    /* renamed from: O0 */
    private boolean f49867O0;

    /* renamed from: P0 */
    private boolean f49868P0;

    /* renamed from: Q0 */
    @Nullable
    private Surface f49869Q0;

    /* renamed from: R0 */
    @Nullable
    private PlaceholderSurface f49870R0;

    /* renamed from: S0 */
    private boolean f49871S0;

    /* renamed from: T0 */
    private int f49872T0;

    /* renamed from: U0 */
    private boolean f49873U0;

    /* renamed from: V0 */
    private boolean f49874V0;

    /* renamed from: W0 */
    private boolean f49875W0;

    /* renamed from: X0 */
    private long f49876X0;

    /* renamed from: Y0 */
    private long f49877Y0;

    /* renamed from: Z0 */
    private long f49878Z0;

    /* renamed from: a1 */
    private int f49879a1;

    /* renamed from: b1 */
    private int f49880b1;

    /* renamed from: c1 */
    private int f49881c1;

    /* renamed from: d1 */
    private long f49882d1;

    /* renamed from: e1 */
    private long f49883e1;

    /* renamed from: f1 */
    private long f49884f1;

    /* renamed from: g1 */
    private int f49885g1;

    /* renamed from: h1 */
    private int f49886h1;

    /* renamed from: i1 */
    private int f49887i1;

    /* renamed from: j1 */
    private int f49888j1;

    /* renamed from: k1 */
    private float f49889k1;

    /* renamed from: l1 */
    @Nullable
    private lf1 f49890l1;

    /* renamed from: m1 */
    private boolean f49891m1;

    /* renamed from: n1 */
    private int f49892n1;

    /* renamed from: o1 */
    @Nullable
    public C5014b f49893o1;

    /* renamed from: p1 */
    @Nullable
    private me1 f49894p1;

    /* renamed from: com.yandex.mobile.ads.impl.eb0$a */
    public static final class C5013a {

        /* renamed from: a */
        public final int f49895a;

        /* renamed from: b */
        public final int f49896b;

        /* renamed from: c */
        public final int f49897c;

        public C5013a(int i2, int i3, int i4) {
            this.f49895a = i2;
            this.f49896b = i3;
            this.f49897c = i4;
        }
    }

    @RequiresApi
    /* renamed from: com.yandex.mobile.ads.impl.eb0$b */
    public final class C5014b implements sa0.InterfaceC5736c, Handler.Callback {

        /* renamed from: b */
        private final Handler f49898b;

        public C5014b(sa0 sa0Var) {
            Handler m28099a = s91.m28099a((Handler.Callback) this);
            this.f49898b = m28099a;
            sa0Var.mo24024a(this, m28099a);
        }

        @Override // com.yandex.mobile.ads.impl.sa0.InterfaceC5736c
        /* renamed from: a */
        public final void mo24090a(long j2) {
            if (s91.f54530a < 30) {
                this.f49898b.sendMessageAtFrontOfQueue(Message.obtain(this.f49898b, 0, (int) (j2 >> 32), (int) j2));
                return;
            }
            eb0 eb0Var = eb0.this;
            if (this != eb0Var.f49893o1) {
                return;
            }
            if (j2 == Long.MAX_VALUE) {
                eb0.m24060a(eb0Var);
                return;
            }
            try {
                eb0Var.m24085e(j2);
            } catch (C5043es e2) {
                eb0.this.m29906a(e2);
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i2 = message.arg1;
            int i3 = message.arg2;
            int i4 = s91.f54530a;
            long j2 = ((i2 & 4294967295L) << 32) | (4294967295L & i3);
            eb0 eb0Var = eb0.this;
            if (this != eb0Var.f49893o1) {
                return true;
            }
            if (j2 == Long.MAX_VALUE) {
                eb0.m24060a(eb0Var);
                return true;
            }
            try {
                eb0Var.m24085e(j2);
                return true;
            } catch (C5043es e2) {
                eb0.this.m29906a(e2);
                return true;
            }
        }
    }

    public eb0(Context context, C6083yn c6083yn, ab0 ab0Var, @Nullable Handler handler, @Nullable hf1 hf1Var) {
        super(2, c6083yn, ab0Var, 30.0f);
        this.f49863K0 = 5000L;
        this.f49864L0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.f49860H0 = applicationContext;
        this.f49861I0 = new ne1(applicationContext);
        this.f49862J0 = new hf1.C5183a(handler, hf1Var);
        this.f49865M0 = m24055T();
        this.f49877Y0 = -9223372036854775807L;
        this.f49886h1 = -1;
        this.f49887i1 = -1;
        this.f49889k1 = -1.0f;
        this.f49872T0 = 1;
        this.f49892n1 = 0;
        m24054S();
    }

    /* renamed from: R */
    private void m24053R() {
        sa0 m29897C;
        this.f49873U0 = false;
        if (s91.f54530a < 23 || !this.f49891m1 || (m29897C = m29897C()) == null) {
            return;
        }
        this.f49893o1 = new C5014b(m29897C);
    }

    /* renamed from: S */
    private void m24054S() {
        this.f49890l1 = null;
    }

    /* renamed from: T */
    private static boolean m24055T() {
        return f49856q1.m24459Z0().equals(s91.f54532c);
    }

    /* renamed from: U */
    private static boolean m24056U() {
        int i2 = s91.f54530a;
        if (i2 <= 28) {
            fb0 fb0Var = f49856q1;
            String m24514r = fb0Var.m24514r();
            String str = s91.f54531b;
            if (m24514r.equals(str) || fb0Var.m24407I().equals(str) || fb0Var.m24413K().equals(str) || fb0Var.m24410J().equals(str) || fb0Var.m24432Q0().equals(str) || fb0Var.m24429P0().equals(str) || fb0Var.m24474d1().equals(str) || fb0Var.m24477e1().equals(str)) {
                return true;
            }
        }
        if (i2 <= 27 && f49856q1.m24530w0().equals(s91.f54531b)) {
            return true;
        }
        if (i2 > 26) {
            return false;
        }
        fb0 fb0Var2 = f49856q1;
        String m24461a = fb0Var2.m24461a();
        String str2 = s91.f54531b;
        if (!m24461a.equals(str2) && !fb0Var2.m24465b().equals(str2) && !fb0Var2.m24469c().equals(str2) && !fb0Var2.m24472d().equals(str2) && !fb0Var2.m24475e().equals(str2) && !fb0Var2.m24478f().equals(str2) && !fb0Var2.m24481g().equals(str2) && !fb0Var2.m24484h().equals(str2) && !fb0Var2.m24487i().equals(str2) && !fb0Var2.m24490j().equals(str2) && !fb0Var2.m24493k().equals(str2) && !fb0Var2.m24496l().equals(str2) && !fb0Var2.m24499m().equals(str2) && !fb0Var2.m24517s().equals(str2) && !fb0Var2.m24520t().equals(str2) && !fb0Var2.m24523u().equals(str2) && !fb0Var2.m24526v().equals(str2) && !fb0Var2.m24529w().equals(str2) && !fb0Var2.m24535y().equals(str2) && !fb0Var2.m24538z().equals(str2) && !fb0Var2.m24383A().equals(str2) && !fb0Var2.m24386B().equals(str2) && !fb0Var2.m24389C().equals(str2) && !fb0Var2.m24392D().equals(str2) && !fb0Var2.m24395E().equals(str2) && !fb0Var2.m24398F().equals(str2) && !fb0Var2.m24401G().equals(str2) && !fb0Var2.m24404H().equals(str2) && !fb0Var2.m24416L().equals(str2) && !fb0Var2.m24419M().equals(str2) && !fb0Var2.m24422N().equals(str2) && !fb0Var2.m24425O().equals(str2) && !fb0Var2.m24428P().equals(str2) && !fb0Var2.m24431Q().equals(str2) && !fb0Var2.m24434R().equals(str2) && !fb0Var2.m24437S().equals(str2) && !fb0Var2.m24440T().equals(str2) && !fb0Var2.m24443U().equals(str2) && !fb0Var2.m24446V().equals(str2) && !fb0Var2.m24449W().equals(str2) && !fb0Var2.m24452X().equals(str2) && !fb0Var2.m24455Y().equals(str2) && !fb0Var2.m24458Z().equals(str2) && !fb0Var2.m24462a0().equals(str2) && !fb0Var2.m24466b0().equals(str2) && !fb0Var2.m24470c0().equals(str2) && !fb0Var2.m24473d0().equals(str2) && !fb0Var2.m24476e0().equals(str2) && !fb0Var2.m24479f0().equals(str2) && !fb0Var2.m24482g0().equals(str2) && !fb0Var2.m24485h0().equals(str2) && !fb0Var2.m24488i0().equals(str2) && !fb0Var2.m24491j0().equals(str2) && !fb0Var2.m24494k0().equals(str2) && !fb0Var2.m24497l0().equals(str2) && !fb0Var2.m24500m0().equals(str2) && !fb0Var2.m24503n0().equals(str2) && !fb0Var2.m24506o0().equals(str2) && !fb0Var2.m24509p0().equals(str2) && !fb0Var2.m24512q0().equals(str2) && !fb0Var2.m24515r0().equals(str2) && !fb0Var2.m24518s0().equals(str2) && !fb0Var2.m24521t0().equals(str2) && !fb0Var2.m24524u0().equals(str2) && !fb0Var2.m24527v0().equals(str2) && !fb0Var2.m24533x0().equals(str2) && !fb0Var2.m24536y0().equals(str2) && !fb0Var2.m24539z0().equals(str2) && !fb0Var2.m24384A0().equals(str2) && !fb0Var2.m24387B0().equals(str2) && !fb0Var2.m24390C0().equals(str2) && !fb0Var2.m24393D0().equals(str2) && !fb0Var2.m24396E0().equals(str2) && !fb0Var2.m24399F0().equals(str2) && !fb0Var2.m24405H0().equals(str2) && !fb0Var2.m24408I0().equals(str2) && !fb0Var2.m24414K0().equals(str2) && !fb0Var2.m24417L0().equals(str2) && !fb0Var2.m24420M0().equals(str2) && !fb0Var2.m24423N0().equals(str2) && !fb0Var2.m24426O0().equals(str2) && !fb0Var2.m24435R0().equals(str2) && !fb0Var2.m24438S0().equals(str2) && !fb0Var2.m24441T0().equals(str2) && !fb0Var2.m24444U0().equals(str2) && !fb0Var2.m24447V0().equals(str2) && !fb0Var2.m24450W0().equals(str2) && !fb0Var2.m24453X0().equals(str2) && !fb0Var2.m24456Y0().equals(str2) && !fb0Var2.m24463a1().equals(str2) && !fb0Var2.m24467b1().equals(str2) && !fb0Var2.m24480f1().equals(str2) && !fb0Var2.m24483g1().equals(str2) && !fb0Var2.m24486h1().equals(str2) && !fb0Var2.m24489i1().equals(str2) && !fb0Var2.m24492j1().equals(str2) && !fb0Var2.m24495k1().equals(str2) && !fb0Var2.m24498l1().equals(str2) && !fb0Var2.m24501m1().equals(str2) && !fb0Var2.m24504n1().equals(str2) && !fb0Var2.m24507o1().equals(str2) && !fb0Var2.m24510p1().equals(str2) && !fb0Var2.m24513q1().equals(str2) && !fb0Var2.m24516r1().equals(str2) && !fb0Var2.m24519s1().equals(str2) && !fb0Var2.m24522t1().equals(str2) && !fb0Var2.m24525u1().equals(str2) && !fb0Var2.m24528v1().equals(str2) && !fb0Var2.m24531w1().equals(str2) && !fb0Var2.m24534x1().equals(str2) && !fb0Var2.m24537y1().equals(str2) && !fb0Var2.m24540z1().equals(str2) && !fb0Var2.m24385A1().equals(str2) && !fb0Var2.m24388B1().equals(str2) && !fb0Var2.m24391C1().equals(str2) && !fb0Var2.m24394D1().equals(str2) && !fb0Var2.m24397E1().equals(str2) && !fb0Var2.m24403G1().equals(str2) && !fb0Var2.m24406H1().equals(str2) && !fb0Var2.m24409I1().equals(str2) && !fb0Var2.m24400F1().equals(str2) && !fb0Var2.m24412J1().equals(str2) && !fb0Var2.m24415K1().equals(str2) && !fb0Var2.m24418L1().equals(str2) && !fb0Var2.m24421M1().equals(str2) && !fb0Var2.m24424N1().equals(str2) && !fb0Var2.m24427O1().equals(str2) && !fb0Var2.m24430P1().equals(str2) && !fb0Var2.m24433Q1().equals(str2) && !fb0Var2.m24436R1().equals(str2) && !fb0Var2.m24439S1().equals(str2) && !fb0Var2.m24442T1().equals(str2) && !fb0Var2.m24445U1().equals(str2) && !fb0Var2.m24448V1().equals(str2) && !fb0Var2.m24451W1().equals(str2) && !fb0Var2.m24454X1().equals(str2) && !fb0Var2.m24457Y1().equals(str2) && !fb0Var2.m24460Z1().equals(str2) && !fb0Var2.m24464a2().equals(str2) && !fb0Var2.m24468b2().equals(str2)) {
            String m24502n = fb0Var2.m24502n();
            String str3 = s91.f54533d;
            if (!m24502n.equals(str3) && !fb0Var2.m24505o().equals(str3) && !fb0Var2.m24402G0().equals(str3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: V */
    private void m24057V() {
        int i2 = this.f49886h1;
        if (i2 == -1 && this.f49887i1 == -1) {
            return;
        }
        lf1 lf1Var = this.f49890l1;
        if (lf1Var != null && lf1Var.f52381a == i2 && lf1Var.f52382b == this.f49887i1 && lf1Var.f52383c == this.f49888j1 && lf1Var.f52384d == this.f49889k1) {
            return;
        }
        lf1 lf1Var2 = new lf1(this.f49886h1, this.f49887i1, this.f49888j1, this.f49889k1);
        this.f49890l1 = lf1Var2;
        this.f49862J0.m25186b(lf1Var2);
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: E */
    public final boolean mo24064E() {
        return this.f49891m1 && s91.f54530a < 23;
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: J */
    public final void mo24065J() {
        m24053R();
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    @CallSuper
    /* renamed from: N */
    public final void mo24066N() {
        super.mo24066N();
        this.f49881c1 = 0;
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    @CallSuper
    /* renamed from: b */
    public final void mo24083b(C5752sm c5752sm) throws C5043es {
        boolean z = this.f49891m1;
        if (!z) {
            this.f49881c1++;
        }
        if (s91.f54530a >= 23 || !z) {
            return;
        }
        m24085e(c5752sm.f54759e);
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    @CallSuper
    /* renamed from: c */
    public final void mo24084c(long j2) {
        super.mo24084c(j2);
        if (this.f49891m1) {
            return;
        }
        this.f49881c1--;
    }

    @Override // com.yandex.mobile.ads.impl.ya0, com.yandex.mobile.ads.impl.cv0
    /* renamed from: d */
    public final boolean mo22248d() {
        PlaceholderSurface placeholderSurface;
        if (super.mo22248d() && (this.f49873U0 || (((placeholderSurface = this.f49870R0) != null && this.f49869Q0 == placeholderSurface) || m29897C() == null || this.f49891m1))) {
            this.f49877Y0 = -9223372036854775807L;
            return true;
        }
        if (this.f49877Y0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f49877Y0) {
            return true;
        }
        this.f49877Y0 = -9223372036854775807L;
        return false;
    }

    /* renamed from: e */
    public final void m24085e(long j2) throws C5043es {
        m29907d(j2);
        m24057V();
        this.f56715B0.f54080e++;
        this.f49875W0 = true;
        if (!this.f49873U0) {
            this.f49873U0 = true;
            this.f49862J0.m25181a(this.f49869Q0);
            this.f49871S0 = true;
        }
        mo24084c(j2);
    }

    /* renamed from: f */
    public final void m24086f(long j2) {
        C5647qm c5647qm = this.f56715B0;
        c5647qm.f54086k += j2;
        c5647qm.f54087l++;
        this.f49884f1 += j2;
        this.f49885g1++;
    }

    @Override // com.yandex.mobile.ads.impl.cv0, com.yandex.mobile.ads.impl.dv0
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.yandex.mobile.ads.impl.ya0, com.yandex.mobile.ads.impl.AbstractC5074fe
    /* renamed from: u */
    public final void mo22249u() {
        this.f49890l1 = null;
        m24053R();
        this.f49871S0 = false;
        this.f49893o1 = null;
        try {
            super.mo22249u();
        } finally {
            this.f49862J0.m25183a(this.f56715B0);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ya0, com.yandex.mobile.ads.impl.AbstractC5074fe
    @TargetApi
    /* renamed from: v */
    public final void mo24087v() {
        try {
            super.mo24087v();
            PlaceholderSurface placeholderSurface = this.f49870R0;
            if (placeholderSurface != null) {
                if (this.f49869Q0 == placeholderSurface) {
                    this.f49869Q0 = null;
                }
                placeholderSurface.release();
                this.f49870R0 = null;
            }
        } catch (Throwable th) {
            if (this.f49870R0 != null) {
                Surface surface = this.f49869Q0;
                PlaceholderSurface placeholderSurface2 = this.f49870R0;
                if (surface == placeholderSurface2) {
                    this.f49869Q0 = null;
                }
                placeholderSurface2.release();
                this.f49870R0 = null;
            }
            throw th;
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5074fe
    /* renamed from: w */
    public final void mo24088w() {
        this.f49879a1 = 0;
        this.f49878Z0 = SystemClock.elapsedRealtime();
        this.f49883e1 = SystemClock.elapsedRealtime() * 1000;
        this.f49884f1 = 0L;
        this.f49885g1 = 0;
        this.f49861I0.m26868b();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5074fe
    /* renamed from: x */
    public final void mo24089x() {
        this.f49877Y0 = -9223372036854775807L;
        if (this.f49879a1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f49862J0.m25180a(this.f49879a1, elapsedRealtime - this.f49878Z0);
            this.f49879a1 = 0;
            this.f49878Z0 = elapsedRealtime;
        }
        int i2 = this.f49885g1;
        if (i2 != 0) {
            this.f49862J0.m25189c(i2, this.f49884f1);
            this.f49884f1 = 0L;
            this.f49885g1 = 0;
        }
        this.f49861I0.m26871c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
    
        if ((((r5 > (-30000) ? 1 : (r5 == (-30000) ? 0 : -1)) < 0) && r17 > 100000) != false) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0154  */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v27 */
    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo24081a(long r27, long r29, @androidx.annotation.Nullable com.yandex.mobile.ads.impl.sa0 r31, @androidx.annotation.Nullable java.nio.ByteBuffer r32, int r33, int r34, int r35, long r36, boolean r38, boolean r39, com.yandex.mobile.ads.impl.C5606pv r40) throws com.yandex.mobile.ads.impl.C5043es {
        /*
            Method dump skipped, instructions count: 815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.eb0.mo24081a(long, long, com.yandex.mobile.ads.impl.sa0, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, com.yandex.mobile.ads.impl.pv):boolean");
    }

    /* renamed from: b */
    private boolean m24063b(wa0 wa0Var) {
        boolean z;
        if (s91.f54530a >= 23 && !this.f49891m1) {
            if (wa0Var.f56065a.startsWith(f49856q1.m24471c1())) {
                z = false;
            } else {
                synchronized (eb0.class) {
                    if (!f49858s1) {
                        f49859t1 = m24056U();
                        f49858s1 = true;
                    }
                }
                z = f49859t1;
            }
            if (!z && (!wa0Var.f56070f || PlaceholderSurface.m22329a(this.f49860H0))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int m24062b(C5606pv c5606pv, wa0 wa0Var) {
        if (c5606pv.f53821m != -1) {
            int size = c5606pv.f53822n.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += c5606pv.f53822n.get(i3).length;
            }
            return c5606pv.f53821m + i2;
        }
        return m24058a(c5606pv, wa0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: a */
    public final int mo24068a(ab0 ab0Var, C5606pv c5606pv) throws bb0.C4851b {
        boolean z;
        int i2 = 0;
        if (!he0.m25144d(c5606pv.f53820l)) {
            return co1.m23502a(0);
        }
        boolean z2 = c5606pv.f53823o != null;
        AbstractC4698p m24059a = m24059a(ab0Var, c5606pv, z2, false);
        if (z2 && m24059a.isEmpty()) {
            m24059a = m24059a(ab0Var, c5606pv, false, false);
        }
        if (m24059a.isEmpty()) {
            return co1.m23502a(1);
        }
        int i3 = c5606pv.f53807E;
        if (!(i3 == 0 || i3 == 2)) {
            return co1.m23502a(2);
        }
        wa0 wa0Var = (wa0) m24059a.get(0);
        boolean m29424a = wa0Var.m29424a(c5606pv);
        if (!m29424a) {
            for (int i4 = 1; i4 < m24059a.size(); i4++) {
                wa0 wa0Var2 = (wa0) m24059a.get(i4);
                if (wa0Var2.m29424a(c5606pv)) {
                    wa0Var = wa0Var2;
                    z = false;
                    m29424a = true;
                    break;
                }
            }
        }
        z = true;
        int i5 = m29424a ? 4 : 3;
        int i6 = wa0Var.m29425b(c5606pv) ? 16 : 8;
        int i7 = wa0Var.f56071g ? 64 : 0;
        int i8 = z ? 128 : 0;
        if (m29424a) {
            AbstractC4698p m24059a2 = m24059a(ab0Var, c5606pv, z2, true);
            if (!m24059a2.isEmpty()) {
                wa0 wa0Var3 = (wa0) bb0.m22768a(m24059a2, c5606pv).get(0);
                if (wa0Var3.m29424a(c5606pv) && wa0Var3.m29425b(c5606pv)) {
                    i2 = 32;
                }
            }
        }
        return i5 | i6 | i2 | i7 | i8;
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: a */
    public final ArrayList mo24073a(ab0 ab0Var, C5606pv c5606pv, boolean z) throws bb0.C4851b {
        return bb0.m22768a(m24059a(ab0Var, c5606pv, z, this.f49891m1), c5606pv);
    }

    /* renamed from: a */
    private static AbstractC4698p m24059a(ab0 ab0Var, C5606pv c5606pv, boolean z, boolean z2) throws bb0.C4851b {
        String str = c5606pv.f53820l;
        if (str == null) {
            return AbstractC4698p.m22055i();
        }
        List<wa0> mo22450a = ab0Var.mo22450a(str, z, z2);
        String m22767a = bb0.m22767a(c5606pv);
        if (m22767a == null) {
            return AbstractC4698p.m22050a((Collection) mo22450a);
        }
        List<wa0> mo22450a2 = ab0Var.mo22450a(m22767a, z, z2);
        int i2 = AbstractC4698p.f47900c;
        return new AbstractC4698p.a().m22059b((List) mo22450a).m22059b((List) mo22450a2).m22058a();
    }

    @Override // com.yandex.mobile.ads.impl.ya0, com.yandex.mobile.ads.impl.AbstractC5074fe
    /* renamed from: a */
    public final void mo24080a(boolean z, boolean z2) throws C5043es {
        super.mo24080a(z, z2);
        boolean z3 = m24563p().f50068a;
        C5220ia.m25476b((z3 && this.f49892n1 == 0) ? false : true);
        if (this.f49891m1 != z3) {
            this.f49891m1 = z3;
            m29903L();
        }
        this.f49862J0.m25187b(this.f56715B0);
        this.f49874V0 = z2;
        this.f49875W0 = false;
    }

    @Override // com.yandex.mobile.ads.impl.ya0, com.yandex.mobile.ads.impl.AbstractC5074fe
    /* renamed from: a */
    public final void mo22245a(long j2, boolean z) throws C5043es {
        super.mo22245a(j2, z);
        m24053R();
        this.f49861I0.m26864a();
        this.f49882d1 = -9223372036854775807L;
        this.f49876X0 = -9223372036854775807L;
        this.f49880b1 = 0;
        if (z) {
            this.f49877Y0 = this.f49863K0 > 0 ? SystemClock.elapsedRealtime() + this.f49863K0 : -9223372036854775807L;
        } else {
            this.f49877Y0 = -9223372036854775807L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [android.view.Surface] */
    @Override // com.yandex.mobile.ads.impl.AbstractC5074fe, com.yandex.mobile.ads.impl.vq0.InterfaceC5936b
    /* renamed from: a */
    public final void mo24074a(int i2, @Nullable Object obj) throws C5043es {
        if (i2 != 1) {
            if (i2 == 7) {
                this.f49894p1 = (me1) obj;
                return;
            }
            if (i2 == 10) {
                int intValue = ((Integer) obj).intValue();
                if (this.f49892n1 != intValue) {
                    this.f49892n1 = intValue;
                    if (this.f49891m1) {
                        m29903L();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    return;
                }
                this.f49861I0.m26866a(((Integer) obj).intValue());
                return;
            } else {
                this.f49872T0 = ((Integer) obj).intValue();
                sa0 m29897C = m29897C();
                if (m29897C != null) {
                    m29897C.mo24018a(this.f49872T0);
                    return;
                }
                return;
            }
        }
        PlaceholderSurface placeholderSurface = obj instanceof Surface ? (Surface) obj : null;
        if (placeholderSurface == null) {
            PlaceholderSurface placeholderSurface2 = this.f49870R0;
            if (placeholderSurface2 != null) {
                placeholderSurface = placeholderSurface2;
            } else {
                wa0 m29898D = m29898D();
                if (m29898D != null && m24063b(m29898D)) {
                    placeholderSurface = PlaceholderSurface.m22328a(this.f49860H0, m29898D.f56070f);
                    this.f49870R0 = placeholderSurface;
                }
            }
        }
        if (this.f49869Q0 != placeholderSurface) {
            this.f49869Q0 = placeholderSurface;
            this.f49861I0.m26867a(placeholderSurface);
            this.f49871S0 = false;
            int mo23525c = mo23525c();
            sa0 m29897C2 = m29897C();
            if (m29897C2 != null) {
                if (s91.f54530a >= 23 && placeholderSurface != null && !this.f49867O0) {
                    m29897C2.mo24023a(placeholderSurface);
                } else {
                    m29903L();
                    m29902I();
                }
            }
            if (placeholderSurface != null && placeholderSurface != this.f49870R0) {
                lf1 lf1Var = this.f49890l1;
                if (lf1Var != null) {
                    this.f49862J0.m25186b(lf1Var);
                }
                m24053R();
                if (mo23525c == 2) {
                    this.f49877Y0 = this.f49863K0 > 0 ? SystemClock.elapsedRealtime() + this.f49863K0 : -9223372036854775807L;
                    return;
                }
                return;
            }
            this.f49890l1 = null;
            m24053R();
            return;
        }
        if (placeholderSurface == null || placeholderSurface == this.f49870R0) {
            return;
        }
        lf1 lf1Var2 = this.f49890l1;
        if (lf1Var2 != null) {
            this.f49862J0.m25186b(lf1Var2);
        }
        if (this.f49871S0) {
            this.f49862J0.m25181a(this.f49869Q0);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: a */
    public final boolean mo24082a(wa0 wa0Var) {
        return this.f49869Q0 != null || m24063b(wa0Var);
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    @TargetApi
    /* renamed from: a */
    public final sa0.C5734a mo24069a(wa0 wa0Var, C5606pv c5606pv, @Nullable MediaCrypto mediaCrypto, float f2) {
        String str;
        C5013a c5013a;
        Point point;
        boolean z;
        Pair<Integer, Integer> m22776b;
        int m24058a;
        PlaceholderSurface placeholderSurface = this.f49870R0;
        if (placeholderSurface != null && placeholderSurface.f48259a != wa0Var.f56070f) {
            if (this.f49869Q0 == placeholderSurface) {
                this.f49869Q0 = null;
            }
            placeholderSurface.release();
            this.f49870R0 = null;
        }
        String str2 = wa0Var.f56067c;
        C5606pv[] m24566s = m24566s();
        int i2 = c5606pv.f53825q;
        int i3 = c5606pv.f53826r;
        int m24062b = m24062b(c5606pv, wa0Var);
        if (m24566s.length == 1) {
            if (m24062b != -1 && (m24058a = m24058a(c5606pv, wa0Var)) != -1) {
                m24062b = Math.min((int) (m24062b * 1.5f), m24058a);
            }
            c5013a = new C5013a(i2, i3, m24062b);
            str = str2;
        } else {
            int length = m24566s.length;
            boolean z2 = false;
            for (int i4 = 0; i4 < length; i4++) {
                C5606pv c5606pv2 = m24566s[i4];
                if (c5606pv.f53832x != null && c5606pv2.f53832x == null) {
                    c5606pv2 = c5606pv2.m27508a().m27546a(c5606pv.f53832x).m27550a();
                }
                if (wa0Var.m29421a(c5606pv, c5606pv2).f55565d != 0) {
                    int i5 = c5606pv2.f53825q;
                    z2 |= i5 == -1 || c5606pv2.f53826r == -1;
                    i2 = Math.max(i2, i5);
                    i3 = Math.max(i3, c5606pv2.f53826r);
                    m24062b = Math.max(m24062b, m24062b(c5606pv2, wa0Var));
                }
            }
            if (z2) {
                d90.m23842d("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i2 + "x" + i3);
                int i6 = c5606pv.f53826r;
                int i7 = c5606pv.f53825q;
                boolean z3 = i6 > i7;
                int i8 = z3 ? i6 : i7;
                if (z3) {
                    i6 = i7;
                }
                float f3 = i6 / i8;
                int[] iArr = f49857r1;
                int length2 = iArr.length;
                int i9 = 0;
                while (i9 < length2) {
                    int i10 = length2;
                    int i11 = iArr[i9];
                    int[] iArr2 = iArr;
                    int i12 = (int) (i11 * f3);
                    if (i11 <= i8 || i12 <= i6) {
                        break;
                    }
                    int i13 = i6;
                    float f4 = f3;
                    if (s91.f54530a >= 21) {
                        int i14 = z3 ? i12 : i11;
                        if (!z3) {
                            i11 = i12;
                        }
                        Point m29420a = wa0Var.m29420a(i14, i11);
                        str = str2;
                        if (wa0Var.m29423a(m29420a.x, m29420a.y, c5606pv.f53827s)) {
                            point = m29420a;
                            break;
                        }
                        i9++;
                        length2 = i10;
                        iArr = iArr2;
                        i6 = i13;
                        f3 = f4;
                        str2 = str;
                    } else {
                        str = str2;
                        try {
                            int m28087a = s91.m28087a(i11, 16) * 16;
                            int m28087a2 = s91.m28087a(i12, 16) * 16;
                            if (m28087a * m28087a2 <= bb0.m22762a()) {
                                int i15 = z3 ? m28087a2 : m28087a;
                                if (!z3) {
                                    m28087a = m28087a2;
                                }
                                point = new Point(i15, m28087a);
                            } else {
                                i9++;
                                length2 = i10;
                                iArr = iArr2;
                                i6 = i13;
                                f3 = f4;
                                str2 = str;
                            }
                        } catch (bb0.C4851b unused) {
                        }
                    }
                }
                str = str2;
                point = null;
                if (point != null) {
                    i2 = Math.max(i2, point.x);
                    i3 = Math.max(i3, point.y);
                    m24062b = Math.max(m24062b, m24058a(c5606pv.m27508a().m27572q(i2).m27562g(i3).m27550a(), wa0Var));
                    d90.m23842d("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i2 + "x" + i3);
                }
            } else {
                str = str2;
            }
            c5013a = new C5013a(i2, i3, m24062b);
        }
        this.f49866N0 = c5013a;
        boolean z4 = this.f49865M0;
        int i16 = this.f49891m1 ? this.f49892n1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", c5606pv.f53825q);
        mediaFormat.setInteger("height", c5606pv.f53826r);
        List<byte[]> list = c5606pv.f53822n;
        for (int i17 = 0; i17 < list.size(); i17++) {
            mediaFormat.setByteBuffer(k60.m26036a("csd-", i17), ByteBuffer.wrap(list.get(i17)));
        }
        float f5 = c5606pv.f53827s;
        if (f5 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f5);
        }
        ob0.m27064a(mediaFormat, "rotation-degrees", c5606pv.f53828t);
        C5130gj c5130gj = c5606pv.f53832x;
        if (c5130gj != null) {
            ob0.m27064a(mediaFormat, "color-transfer", c5130gj.f50627c);
            ob0.m27064a(mediaFormat, "color-standard", c5130gj.f50625a);
            ob0.m27064a(mediaFormat, "color-range", c5130gj.f50626b);
            byte[] bArr = c5130gj.f50628d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c5606pv.f53820l) && (m22776b = bb0.m22776b(c5606pv)) != null) {
            ob0.m27064a(mediaFormat, "profile", ((Integer) m22776b.first).intValue());
        }
        mediaFormat.setInteger("max-width", c5013a.f49895a);
        mediaFormat.setInteger("max-height", c5013a.f49896b);
        ob0.m27064a(mediaFormat, "max-input-size", c5013a.f49897c);
        if (s91.f54530a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f2 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f2);
            }
        }
        if (z4) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i16 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i16);
        }
        if (this.f49869Q0 == null) {
            if (m24063b(wa0Var)) {
                if (this.f49870R0 == null) {
                    this.f49870R0 = PlaceholderSurface.m22328a(this.f49860H0, wa0Var.f56070f);
                }
                this.f49869Q0 = this.f49870R0;
            } else {
                throw new IllegalStateException();
            }
        }
        return sa0.C5734a.m28137a(wa0Var, mediaFormat, c5606pv, this.f49869Q0, mediaCrypto);
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: a */
    public final C5873um mo24071a(wa0 wa0Var, C5606pv c5606pv, C5606pv c5606pv2) {
        C5873um m29421a = wa0Var.m29421a(c5606pv, c5606pv2);
        int i2 = m29421a.f55566e;
        int i3 = c5606pv2.f53825q;
        C5013a c5013a = this.f49866N0;
        if (i3 > c5013a.f49895a || c5606pv2.f53826r > c5013a.f49896b) {
            i2 |= 256;
        }
        if (m24062b(c5606pv2, wa0Var) > this.f49866N0.f49897c) {
            i2 |= 64;
        }
        int i4 = i2;
        return new C5873um(wa0Var.f56065a, c5606pv, c5606pv2, i4 != 0 ? 0 : m29421a.f55565d, i4);
    }

    @Override // com.yandex.mobile.ads.impl.ya0, com.yandex.mobile.ads.impl.AbstractC5074fe, com.yandex.mobile.ads.impl.cv0
    /* renamed from: a */
    public final void mo23519a(float f2, float f3) throws C5043es {
        super.mo23519a(f2, f3);
        this.f49861I0.m26869b(f2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007b, code lost:
    
        if (r3.equals("video/av01") == false) goto L18;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m24058a(com.yandex.mobile.ads.impl.C5606pv r10, com.yandex.mobile.ads.impl.wa0 r11) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.eb0.m24058a(com.yandex.mobile.ads.impl.pv, com.yandex.mobile.ads.impl.wa0):int");
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: a */
    public final float mo24067a(float f2, C5606pv[] c5606pvArr) {
        float f3 = -1.0f;
        for (C5606pv c5606pv : c5606pvArr) {
            float f4 = c5606pv.f53827s;
            if (f4 != -1.0f) {
                f3 = Math.max(f3, f4);
            }
        }
        if (f3 == -1.0f) {
            return -1.0f;
        }
        return f3 * f2;
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: a */
    public final void mo24079a(String str, long j2, long j3) {
        boolean z;
        this.f49862J0.m25185a(str, j2, j3);
        if (str.startsWith(f49856q1.m24471c1())) {
            z = false;
        } else {
            synchronized (eb0.class) {
                if (!f49858s1) {
                    f49859t1 = m24056U();
                    f49858s1 = true;
                }
            }
            z = f49859t1;
        }
        this.f49867O0 = z;
        wa0 m29898D = m29898D();
        Objects.requireNonNull(m29898D);
        this.f49868P0 = m29898D.m29422a();
        if (s91.f54530a < 23 || !this.f49891m1) {
            return;
        }
        sa0 m29897C = m29897C();
        Objects.requireNonNull(m29897C);
        this.f49893o1 = new C5014b(m29897C);
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: a */
    public final void mo24078a(String str) {
        this.f49862J0.m25184a(str);
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: a */
    public final void mo24077a(Exception exc) {
        d90.m23838a("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f49862J0.m25188b(exc);
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    @Nullable
    /* renamed from: a */
    public final C5873um mo24070a(C5658qv c5658qv) throws C5043es {
        C5873um mo24070a = super.mo24070a(c5658qv);
        this.f49862J0.m25182a(c5658qv.f54140b, mo24070a);
        return mo24070a;
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: a */
    public final void mo24075a(C5606pv c5606pv, @Nullable MediaFormat mediaFormat) {
        int integer;
        int integer2;
        sa0 m29897C = m29897C();
        if (m29897C != null) {
            m29897C.mo24018a(this.f49872T0);
        }
        if (this.f49891m1) {
            this.f49886h1 = c5606pv.f53825q;
            this.f49887i1 = c5606pv.f53826r;
        } else {
            Objects.requireNonNull(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.f49886h1 = integer;
            if (z) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.f49887i1 = integer2;
        }
        float f2 = c5606pv.f53829u;
        this.f49889k1 = f2;
        if (s91.f54530a >= 21) {
            int i2 = c5606pv.f53828t;
            if (i2 == 90 || i2 == 270) {
                int i3 = this.f49886h1;
                this.f49886h1 = this.f49887i1;
                this.f49887i1 = i3;
                this.f49889k1 = 1.0f / f2;
            }
        } else {
            this.f49888j1 = c5606pv.f53828t;
        }
        this.f49861I0.m26865a(c5606pv.f53827s);
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    @TargetApi
    /* renamed from: a */
    public final void mo24076a(C5752sm c5752sm) throws C5043es {
        if (this.f49868P0) {
            ByteBuffer byteBuffer = c5752sm.f54760f;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    sa0 m29897C = m29897C();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    m29897C.mo24022a(bundle);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m24060a(eb0 eb0Var) {
        eb0Var.m29905P();
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: a */
    public final va0 mo24072a(IllegalStateException illegalStateException, @Nullable wa0 wa0Var) {
        return new db0(illegalStateException, wa0Var, this.f49869Q0);
    }
}
