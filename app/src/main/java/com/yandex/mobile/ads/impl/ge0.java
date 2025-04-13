package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.C6152d;
import com.yandex.mobile.ads.instream.C6153e;

/* loaded from: classes3.dex */
public final class ge0 implements InterfaceC5426m5, ir0, InterfaceC5722s1 {

    /* renamed from: a */
    @NonNull
    private final fe0 f50557a;

    /* renamed from: b */
    @NonNull
    private final gr0 f50558b;

    /* renamed from: c */
    @NonNull
    private final C6152d f50559c;

    /* renamed from: d */
    @NonNull
    private final C5898v1 f50560d;

    /* renamed from: e */
    @NonNull
    private final C5120a f50561e;

    /* renamed from: f */
    @NonNull
    private final tb1 f50562f;

    /* renamed from: g */
    @Nullable
    private InterfaceC5473n5 f50563g;

    /* renamed from: h */
    @Nullable
    private C5666r1 f50564h;

    /* renamed from: com.yandex.mobile.ads.impl.ge0$a */
    public class C5120a implements ve1 {
        private C5120a() {
        }

        @Override // com.yandex.mobile.ads.impl.ve1
        /* renamed from: a */
        public final void mo24869a() {
            ge0.this.f50558b.m24962b();
            if (ge0.this.f50564h != null) {
                ge0.this.f50564h.m27814c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.ve1
        public final void onVideoCompleted() {
            ge0.m24853a(ge0.this);
            ge0.this.f50558b.m24962b();
            ge0.this.f50559c.m30386a(null);
            if (ge0.this.f50563g != null) {
                ge0.this.f50563g.mo26028c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.ve1
        public final void onVideoError() {
            ge0.this.f50558b.m24962b();
            ge0.this.f50559c.m30386a(null);
            if (ge0.this.f50564h != null) {
                ge0.this.f50564h.m27814c();
            }
            if (ge0.this.f50563g != null) {
                ge0.this.f50563g.mo26024a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.ve1
        public final void onVideoPaused() {
            ge0.this.f50558b.m24962b();
        }

        @Override // com.yandex.mobile.ads.impl.ve1
        public final void onVideoResumed() {
            ge0.this.f50558b.m24960a();
        }

        public /* synthetic */ C5120a(ge0 ge0Var, int i2) {
            this();
        }
    }

    public ge0(@NonNull Context context, @NonNull w30 w30Var, @NonNull C5898v1 c5898v1, @NonNull t30 t30Var, @NonNull f40 f40Var, @NonNull i40 i40Var, @NonNull C6153e c6153e, @NonNull C6152d c6152d) {
        this.f50559c = c6152d;
        this.f50560d = c5898v1;
        tb1 tb1Var = new tb1();
        this.f50562f = tb1Var;
        this.f50557a = new fe0(context, c5898v1, t30Var, f40Var, i40Var, tb1Var);
        this.f50561e = new C5120a(this, 0);
        this.f50558b = new hr0(c6153e, c5898v1).m25358a(w30Var, this);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5722s1
    /* renamed from: a */
    public final void mo24858a() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5426m5
    /* renamed from: a */
    public final void mo24860a(@Nullable InterfaceC5473n5 interfaceC5473n5) {
        this.f50563g = interfaceC5473n5;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5722s1
    /* renamed from: b */
    public final void mo24862b() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5426m5
    /* renamed from: f */
    public final void mo24867f() {
        this.f50558b.m24962b();
        C5666r1 c5666r1 = this.f50564h;
        if (c5666r1 != null) {
            c5666r1.m27814c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5722s1
    /* renamed from: g */
    public final void mo24868g() {
        this.f50564h = null;
        this.f50559c.m30390e();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5426m5
    public final void prepare() {
        InterfaceC5473n5 interfaceC5473n5 = this.f50563g;
        if (interfaceC5473n5 != null) {
            interfaceC5473n5.mo26027b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5426m5
    public final void resume() {
        boolean z = this.f50564h != null;
        boolean m29167a = this.f50560d.m29167a();
        if (!z) {
            this.f50559c.m30390e();
        } else if (m29167a) {
            this.f50559c.m30388c();
            this.f50564h.m27817f();
        } else {
            this.f50559c.m30390e();
            this.f50564h.m27815d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5426m5
    public final void start() {
        this.f50559c.m30386a(this.f50561e);
        this.f50559c.m30390e();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5426m5
    /* renamed from: a */
    public final void mo24861a(@Nullable tb1 tb1Var) {
        this.f50562f.m28583a(tb1Var);
    }

    /* renamed from: b */
    public final void m24863b(@NonNull m50 m50Var) {
        C5666r1 m24568a = this.f50557a.m24568a(m50Var);
        C5666r1 c5666r1 = this.f50564h;
        if (m24568a != c5666r1 && c5666r1 != null) {
            c5666r1.m27811a((InterfaceC5722s1) null);
            this.f50564h.m27816e();
        }
        this.f50564h = m24568a;
        m24568a.m27811a(this);
        this.f50564h.m27815d();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5426m5
    /* renamed from: c */
    public final void mo24864c() {
        this.f50558b.m24962b();
        C5666r1 c5666r1 = this.f50564h;
        if (c5666r1 != null) {
            c5666r1.m27813b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5722s1
    /* renamed from: d */
    public final void mo24865d() {
        this.f50559c.m30388c();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5722s1
    /* renamed from: e */
    public final void mo24866e() {
        this.f50564h = null;
        this.f50559c.m30390e();
    }

    /* renamed from: a */
    public final void m24859a(@NonNull m50 m50Var) {
        C5666r1 m24568a = this.f50557a.m24568a(m50Var);
        C5666r1 c5666r1 = this.f50564h;
        if (m24568a != c5666r1 && c5666r1 != null) {
            c5666r1.m27811a((InterfaceC5722s1) null);
            this.f50564h.m27816e();
        }
        this.f50564h = m24568a;
        m24568a.m27811a(this);
        this.f50564h.m27818g();
    }

    /* renamed from: a */
    public static void m24853a(ge0 ge0Var) {
        C5666r1 c5666r1 = ge0Var.f50564h;
        if (c5666r1 != null) {
            c5666r1.m27811a((InterfaceC5722s1) null);
            ge0Var.f50564h.m27816e();
        }
    }
}
