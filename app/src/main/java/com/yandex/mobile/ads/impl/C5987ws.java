package com.yandex.mobile.ads.impl;

import android.view.TextureView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.rq0;
import java.util.List;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.ws */
/* loaded from: classes3.dex */
public final class C5987ws implements tk0 {

    /* renamed from: a */
    @NonNull
    private final InterfaceC5090fs f56235a;

    /* renamed from: b */
    @NonNull
    private final fc0 f56236b;

    /* renamed from: c */
    @NonNull
    private final af1 f56237c;

    /* renamed from: d */
    @NonNull
    private final sk0 f56238d;

    /* renamed from: e */
    @NonNull
    private final a f56239e;

    /* renamed from: f */
    @NonNull
    private final if1 f56240f;

    /* renamed from: g */
    @NonNull
    private final C5549os f56241g;

    /* renamed from: h */
    @Nullable
    private il0 f56242h;

    /* renamed from: i */
    @Nullable
    private fd1 f56243i;

    /* renamed from: j */
    private boolean f56244j;

    /* renamed from: k */
    private boolean f56245k;

    public C5987ws(@NonNull InterfaceC5090fs interfaceC5090fs, @NonNull fc0 fc0Var, @NonNull af1 af1Var) {
        this.f56235a = interfaceC5090fs;
        this.f56236b = fc0Var;
        this.f56237c = af1Var;
        a aVar = new a(this, 0);
        this.f56239e = aVar;
        interfaceC5090fs.mo25687b(aVar);
        if1 if1Var = new if1();
        this.f56240f = if1Var;
        this.f56241g = new C5549os(aVar);
        interfaceC5090fs.mo25687b(if1Var);
        this.f56238d = new sk0();
    }

    /* renamed from: g */
    public final boolean m29553g() {
        return this.f56244j;
    }

    /* renamed from: h */
    public final boolean m29554h() {
        return ((AbstractC5021ee) this.f56235a).m24130b();
    }

    /* renamed from: i */
    public final void m29555i() {
        if (this.f56244j) {
            return;
        }
        this.f56235a.setPlayWhenReady(false);
    }

    /* renamed from: j */
    public final void m29556j() {
        if (!this.f56244j) {
            this.f56235a.setPlayWhenReady(true);
        }
        if (this.f56245k) {
            m29555i();
        }
    }

    /* renamed from: k */
    public final void m29557k() {
        if (this.f56244j || this.f56245k) {
            return;
        }
        this.f56235a.setPlayWhenReady(true);
    }

    /* renamed from: l */
    public final void m29558l() {
        if (this.f56244j) {
            return;
        }
        fd1 fd1Var = this.f56243i;
        if (fd1Var != null && this.f56242h != null) {
            fd1Var.mo24554e();
        }
        this.f56244j = true;
        this.f56245k = false;
        this.f56241g.m27105b();
        this.f56235a.setVideoTextureView(null);
        this.f56240f.m25531a((TextureView) null);
        this.f56235a.mo25685a(this.f56239e);
        this.f56235a.mo25685a(this.f56240f);
        this.f56235a.release();
    }

    /* renamed from: a */
    public final void m29545a(@Nullable TextureView textureView) {
        if (this.f56244j) {
            return;
        }
        this.f56240f.m25531a(textureView);
        this.f56235a.setVideoTextureView(textureView);
    }

    /* renamed from: b */
    public final void m29548b() {
        this.f56245k = false;
    }

    /* renamed from: c */
    public final long m29549c() {
        return this.f56235a.getDuration();
    }

    /* renamed from: d */
    public final long m29550d() {
        return this.f56235a.getCurrentPosition();
    }

    /* renamed from: e */
    public final float m29551e() {
        return this.f56235a.getVolume();
    }

    /* renamed from: f */
    public final void m29552f() {
        if (this.f56244j) {
            return;
        }
        this.f56244j = true;
        this.f56245k = false;
        this.f56241g.m27105b();
        this.f56235a.setVideoTextureView(null);
        this.f56240f.m25531a((TextureView) null);
        this.f56235a.mo25685a(this.f56239e);
        this.f56235a.mo25685a(this.f56240f);
        this.f56235a.release();
    }

    /* renamed from: com.yandex.mobile.ads.impl.ws$a */
    public class a implements rq0.InterfaceC5706b {

        /* renamed from: a */
        private boolean f56246a;

        /* renamed from: b */
        private boolean f56247b;

        /* renamed from: c */
        private boolean f56248c;

        private a() {
            this.f56247b = false;
            this.f56248c = false;
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        /* renamed from: a */
        public /* synthetic */ void mo23438a() {
            up1.m29069a(this);
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        /* renamed from: a */
        public /* synthetic */ void mo23439a(int i2) {
            up1.m29070b(this, i2);
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        /* renamed from: a */
        public /* synthetic */ void mo23443a(Metadata metadata) {
            up1.m29071c(this, metadata);
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        /* renamed from: a */
        public /* synthetic */ void mo23444a(C5043es c5043es) {
            up1.m29072d(this, c5043es);
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        /* renamed from: a */
        public /* synthetic */ void mo23445a(lf1 lf1Var) {
            up1.m29073e(this, lf1Var);
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        /* renamed from: a */
        public /* synthetic */ void mo23446a(nq0 nq0Var) {
            up1.m29074f(this, nq0Var);
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        /* renamed from: a */
        public /* synthetic */ void mo23447a(pb0 pb0Var, int i2) {
            up1.m29075g(this, pb0Var, i2);
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        /* renamed from: a */
        public /* synthetic */ void mo23451a(rq0.C5705a c5705a) {
            up1.m29076h(this, c5705a);
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        /* renamed from: a */
        public /* synthetic */ void mo23452a(rq0.C5707c c5707c, rq0.C5707c c5707c2, int i2) {
            up1.m29077i(this, c5707c, c5707c2, i2);
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        /* renamed from: a */
        public /* synthetic */ void mo23454a(sb0 sb0Var) {
            up1.m29078j(this, sb0Var);
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        /* renamed from: a */
        public /* synthetic */ void mo23455a(t71 t71Var) {
            up1.m29079k(this, t71Var);
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        /* renamed from: a */
        public /* synthetic */ void mo23457a(C5871ul c5871ul) {
            up1.m29080l(this, c5871ul);
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        /* renamed from: a */
        public /* synthetic */ void mo23458a(C5875uo c5875uo) {
            up1.m29081m(this, c5875uo);
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        /* renamed from: a */
        public /* synthetic */ void mo23464a(boolean z, int i2) {
            up1.m29082n(this, z, i2);
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        /* renamed from: b */
        public /* synthetic */ void mo23465b() {
            up1.m29083o(this);
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        /* renamed from: b */
        public final void mo23468b(@Nullable C5043es c5043es) {
            ed1 ed1Var;
            this.f56246a = false;
            C5987ws.this.f56241g.m27105b();
            C5987ws.this.f56235a.stop();
            C5987ws.this.f56237c.m22483a(c5043es != null ? c5043es.getMessage() : null);
            if (C5987ws.this.f56243i == null || C5987ws.this.f56242h == null) {
                return;
            }
            if (c5043es != null) {
                Objects.requireNonNull(C5987ws.this.f56238d);
                ed1Var = sk0.m28284a(c5043es);
            } else {
                ed1Var = new ed1(29, new C5350ko());
            }
            fd1 fd1Var = C5987ws.this.f56243i;
            uc1 unused = C5987ws.this.f56242h;
            fd1Var.mo24550a(ed1Var);
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        /* renamed from: c */
        public /* synthetic */ void mo23474c() {
            up1.m29085q(this);
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        public /* synthetic */ void onCues(List list) {
            up1.m29086r(this, list);
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        public /* synthetic */ void onIsLoadingChanged(boolean z) {
            up1.m29087s(this, z);
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        public final void onIsPlayingChanged(boolean z) {
            if (!z) {
                if (this.f56247b) {
                    return;
                }
                this.f56248c = true;
                if (C5987ws.this.f56243i == null || C5987ws.this.f56242h == null) {
                    return;
                }
                fd1 fd1Var = C5987ws.this.f56243i;
                uc1 unused = C5987ws.this.f56242h;
                fd1Var.mo24558i();
                return;
            }
            if (!this.f56246a) {
                if (C5987ws.this.f56243i == null || C5987ws.this.f56242h == null) {
                    return;
                }
                this.f56246a = true;
                fd1 fd1Var2 = C5987ws.this.f56243i;
                uc1 unused2 = C5987ws.this.f56242h;
                fd1Var2.mo24552c();
                return;
            }
            if (this.f56248c) {
                this.f56248c = false;
                if (C5987ws.this.f56243i == null || C5987ws.this.f56242h == null) {
                    return;
                }
                fd1 fd1Var3 = C5987ws.this.f56243i;
                uc1 unused3 = C5987ws.this.f56242h;
                fd1Var3.mo24555f();
            }
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i2) {
            up1.m29089u(this, z, i2);
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        public final void onPlaybackStateChanged(int i2) {
            if (i2 == 3) {
                C5987ws.this.f56241g.m27105b();
                if (C5987ws.this.f56243i != null && C5987ws.this.f56242h != null) {
                    fd1 fd1Var = C5987ws.this.f56243i;
                    uc1 unused = C5987ws.this.f56242h;
                    fd1Var.mo24557h();
                }
                if (this.f56247b) {
                    this.f56247b = false;
                    if (C5987ws.this.f56243i == null || C5987ws.this.f56242h == null) {
                        return;
                    }
                    fd1 fd1Var2 = C5987ws.this.f56243i;
                    uc1 unused2 = C5987ws.this.f56242h;
                    fd1Var2.mo24549a();
                    return;
                }
                return;
            }
            if (i2 == 2) {
                this.f56247b = true;
                if (C5987ws.this.f56243i == null || C5987ws.this.f56242h == null) {
                    return;
                }
                fd1 fd1Var3 = C5987ws.this.f56243i;
                uc1 unused3 = C5987ws.this.f56242h;
                fd1Var3.mo24551b();
                return;
            }
            if (i2 == 4) {
                this.f56246a = false;
                if (C5987ws.this.f56243i == null || C5987ws.this.f56242h == null) {
                    return;
                }
                fd1 fd1Var4 = C5987ws.this.f56243i;
                uc1 unused4 = C5987ws.this.f56242h;
                fd1Var4.mo24553d();
            }
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i2) {
            up1.m29091w(this, i2);
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        public /* synthetic */ void onPlayerStateChanged(boolean z, int i2) {
            up1.m29092x(this, z, i2);
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        public /* synthetic */ void onRenderedFirstFrame() {
            up1.m29093y(this);
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
            up1.m29094z(this, z);
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        public /* synthetic */ void onSurfaceSizeChanged(int i2, int i3) {
            up1.m29067A(this, i2, i3);
        }

        @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
        public /* synthetic */ void onVolumeChanged(float f2) {
            up1.m29068B(this, f2);
        }

        public /* synthetic */ a(C5987ws c5987ws, int i2) {
            this();
        }
    }

    /* renamed from: a */
    public final void m29543a(float f2) {
        if (this.f56244j) {
            return;
        }
        this.f56235a.setVolume(f2);
        fd1 fd1Var = this.f56243i;
        if (fd1Var == null || this.f56242h == null) {
            return;
        }
        fd1Var.onVolumeChanged(f2);
    }

    /* renamed from: a */
    public final void m29547a(@NonNull il0 il0Var) {
        this.f56242h = il0Var;
        if (this.f56244j) {
            return;
        }
        ws0 m24542a = this.f56236b.m24542a(il0Var);
        this.f56235a.setPlayWhenReady(false);
        this.f56235a.mo24727a(m24542a);
        this.f56235a.prepare();
        this.f56241g.m27104a();
    }

    /* renamed from: a */
    public final void m29542a() {
        this.f56245k = true;
        m29555i();
    }

    /* renamed from: a */
    public final void m29546a(@Nullable fd1 fd1Var) {
        this.f56243i = fd1Var;
    }

    /* renamed from: a */
    public final void m29544a(@Nullable int i2) {
        if (this.f56244j) {
            return;
        }
        this.f56240f.m25532b(i2);
    }
}
