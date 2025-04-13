package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.AbstractC4992dx;
import com.yandex.mobile.ads.impl.C5518o0;
import com.yandex.mobile.ads.impl.ik0;
import com.yandex.mobile.ads.nativeads.NativeAd;

/* loaded from: classes3.dex */
public final class jl1<T extends AbstractC4992dx<T>> implements InterfaceC5148gw<T> {

    /* renamed from: a */
    @NonNull
    private final AbstractC5462mw<T> f51639a;

    /* renamed from: b */
    @NonNull
    private final ck1 f51640b;

    /* renamed from: c */
    @NonNull
    private final ik0 f51641c;

    /* renamed from: d */
    @NonNull
    private final C5101g2 f51642d;

    /* renamed from: e */
    @NonNull
    private final aj0 f51643e;

    /* renamed from: f */
    @NonNull
    private final C5890uw f51644f;

    /* renamed from: g */
    @Nullable
    private AdResponse<String> f51645g;

    /* renamed from: h */
    @Nullable
    private NativeAd f51646h;

    /* renamed from: i */
    private boolean f51647i;

    /* renamed from: com.yandex.mobile.ads.impl.jl1$b */
    public final class C5291b implements ik0.InterfaceC5236b {
        private C5291b() {
        }

        @Override // com.yandex.mobile.ads.impl.ik0.InterfaceC5236b
        /* renamed from: a */
        public final void mo24208a(@NonNull NativeAd nativeAd) {
            if (jl1.this.f51647i) {
                return;
            }
            jl1.this.f51646h = nativeAd;
            jl1.this.f51639a.mo21780p();
        }

        public /* synthetic */ C5291b(jl1 jl1Var, int i2) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.ik0.InterfaceC5236b
        /* renamed from: a */
        public final void mo24207a(@NonNull C5563p2 c5563p2) {
            if (jl1.this.f51647i) {
                return;
            }
            jl1.this.f51646h = null;
            jl1.this.f51639a.mo21797b(c5563p2);
        }
    }

    public jl1(@NonNull AbstractC5462mw<T> abstractC5462mw) {
        this.f51639a = abstractC5462mw;
        Context m28621i = abstractC5462mw.m28621i();
        C5101g2 m28616d = abstractC5462mw.m28616d();
        this.f51642d = m28616d;
        this.f51643e = new aj0(m28616d);
        C5724s3 m28617e = abstractC5462mw.m28617e();
        this.f51640b = new ck1(m28616d);
        this.f51641c = new ik0(m28621i, m28616d, m28617e);
        this.f51644f = new C5890uw();
    }

    /* renamed from: com.yandex.mobile.ads.impl.jl1$a */
    public final class C5290a implements zw0 {

        /* renamed from: a */
        @NonNull
        private final Context f51648a;

        /* renamed from: b */
        @NonNull
        private final AdResponse<String> f51649b;

        public C5290a(Context context, @NonNull AdResponse<String> adResponse) {
            this.f51648a = context.getApplicationContext();
            this.f51649b = adResponse;
        }

        @Override // com.yandex.mobile.ads.impl.zw0
        /* renamed from: a */
        public final void mo24204a(@NonNull qi0 qi0Var) {
            bj0 bj0Var = new bj0(qi0Var);
            jl1.this.f51640b.m23304a(this.f51648a, this.f51649b, jl1.this.f51643e);
            jl1.this.f51640b.m23305a(this.f51648a, this.f51649b, bj0Var);
        }

        @Override // com.yandex.mobile.ads.impl.zw0
        /* renamed from: a */
        public final void mo24203a() {
            jl1.this.f51640b.m23304a(this.f51648a, this.f51649b, jl1.this.f51643e);
            jl1.this.f51640b.m23305a(this.f51648a, this.f51649b, (bj0) null);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5148gw
    /* renamed from: a */
    public final void mo24989a(@NonNull Context context) {
        this.f51647i = true;
        this.f51645g = null;
        this.f51646h = null;
        this.f51641c.m25555a();
        n60.m26811d("YandexNativeInterstitialController invalidate", new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5148gw
    /* renamed from: a */
    public final void mo24990a(@NonNull Context context, @NonNull AdResponse<String> adResponse) {
        if (this.f51647i) {
            return;
        }
        this.f51645g = adResponse;
        this.f51641c.m25556a(adResponse, new C5291b(this, 0), new C5290a(context, adResponse));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5148gw
    /* renamed from: a */
    public final void mo24991a(@NonNull T t) {
        AdResponse<String> adResponse = this.f51645g;
        if (adResponse == null || this.f51646h == null) {
            return;
        }
        C5518o0 c5518o0 = new C5518o0(new C5518o0.a(adResponse).m26975a(this.f51642d.m24790l()).m26977a(this.f51646h));
        this.f51644f.m29144a(t.m27310c(), c5518o0, t.m30346h());
        this.f51645g = null;
        this.f51646h = null;
    }
}
