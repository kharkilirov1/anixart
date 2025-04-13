package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdView;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class m90 {

    /* renamed from: a */
    @NonNull
    private final s90 f52606a = s90.m28081a();

    /* renamed from: b */
    @NonNull
    private final i40 f52607b;

    /* renamed from: c */
    @NonNull
    private final t30 f52608c;

    /* renamed from: d */
    @NonNull
    private final C5666r1 f52609d;

    /* renamed from: e */
    @NonNull
    private final r90 f52610e;

    /* renamed from: f */
    @NonNull
    private final ad1 f52611f;

    /* renamed from: com.yandex.mobile.ads.impl.m90$a */
    public class C5431a implements InterfaceC5722s1 {
        private C5431a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5722s1
        /* renamed from: a */
        public final void mo24858a() {
            m90.this.f52610e.onInstreamAdBreakPrepared();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5722s1
        /* renamed from: b */
        public final void mo24862b() {
            m90.this.f52610e.onInstreamAdBreakStarted();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5722s1
        /* renamed from: d */
        public final void mo24865d() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5722s1
        /* renamed from: e */
        public final void mo24866e() {
            m90.this.f52610e.onInstreamAdBreakCompleted();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5722s1
        /* renamed from: g */
        public final void mo24868g() {
            m90.this.f52610e.onInstreamAdBreakError("Ad player returned error");
        }

        public /* synthetic */ C5431a(m90 m90Var, int i2) {
            this();
        }
    }

    public m90(@NonNull Context context, @NonNull m50 m50Var, @NonNull t30 t30Var, @NonNull C5898v1 c5898v1, @NonNull r90 r90Var) {
        this.f52608c = t30Var;
        this.f52610e = r90Var;
        i40 i40Var = new i40();
        this.f52607b = i40Var;
        this.f52609d = new C5666r1(context, m50Var, t30Var, new f40(context, i40Var, new t90(), t30Var), i40Var, c5898v1);
        this.f52611f = new ad1();
    }

    /* renamed from: b */
    public final void m26596b() {
        h40 m25440a = this.f52607b.m25440a();
        if ((m25440a == null || m25440a.m25051b() == null) ? false : true) {
            this.f52609d.m27810a();
        }
    }

    /* renamed from: c */
    public final void m26597c() {
        this.f52608c.m28442a();
        this.f52609d.m27811a(new C5431a(this, 0));
        this.f52609d.m27815d();
    }

    /* renamed from: d */
    public final void m26598d() {
        h40 m25440a = this.f52607b.m25440a();
        if ((m25440a == null || m25440a.m25051b() == null) ? false : true) {
            this.f52609d.m27817f();
        }
    }

    /* renamed from: a */
    public final void m26594a(@Nullable xc1 xc1Var) {
        zc1 zc1Var;
        if (xc1Var != null) {
            Objects.requireNonNull(this.f52611f);
            zc1Var = ad1.m22466a(xc1Var);
        } else {
            zc1Var = null;
        }
        this.f52609d.m27812a(zc1Var);
    }

    /* renamed from: a */
    public final void m26593a() {
        this.f52609d.m27813b();
        this.f52608c.m28446b();
        this.f52607b.m25442b();
    }

    /* renamed from: a */
    public final void m26595a(@NonNull InstreamAdView instreamAdView) {
        m90 m28082a = this.f52606a.m28082a(instreamAdView);
        if (!equals(m28082a)) {
            if (m28082a != null) {
                m28082a.f52609d.m27814c();
                m28082a.f52607b.m25442b();
            }
            if (this.f52606a.m28084a(this)) {
                this.f52609d.m27814c();
                this.f52607b.m25442b();
            }
            this.f52606a.m28083a(instreamAdView, this);
        }
        this.f52607b.m25441a(instreamAdView, Collections.emptyList());
        this.f52608c.m28442a();
        this.f52609d.m27818g();
    }
}
