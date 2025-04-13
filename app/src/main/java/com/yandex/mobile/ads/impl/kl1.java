package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.C5518o0;
import com.yandex.mobile.ads.impl.ik0;
import com.yandex.mobile.ads.nativeads.NativeAd;

/* loaded from: classes3.dex */
public final class kl1 implements InterfaceC5148gw<tx0> {

    /* renamed from: a */
    @NonNull
    private final yx0 f52018a;

    /* renamed from: b */
    @NonNull
    private final ck1 f52019b;

    /* renamed from: c */
    @NonNull
    private final ik0 f52020c;

    /* renamed from: d */
    @NonNull
    private final C5101g2 f52021d;

    /* renamed from: e */
    @NonNull
    private final aj0 f52022e;

    /* renamed from: f */
    @NonNull
    private final C5890uw f52023f;

    /* renamed from: g */
    @Nullable
    private AdResponse<String> f52024g;

    /* renamed from: h */
    @Nullable
    private NativeAd f52025h;

    /* renamed from: i */
    private boolean f52026i;

    /* renamed from: com.yandex.mobile.ads.impl.kl1$b */
    public final class C5347b implements ik0.InterfaceC5236b {
        private C5347b() {
        }

        @Override // com.yandex.mobile.ads.impl.ik0.InterfaceC5236b
        /* renamed from: a */
        public final void mo24208a(@NonNull NativeAd nativeAd) {
            if (kl1.this.f52026i) {
                return;
            }
            kl1.this.f52025h = nativeAd;
            kl1.this.f52018a.mo21780p();
        }

        public /* synthetic */ C5347b(kl1 kl1Var, int i2) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.ik0.InterfaceC5236b
        /* renamed from: a */
        public final void mo24207a(@NonNull C5563p2 c5563p2) {
            if (kl1.this.f52026i) {
                return;
            }
            kl1.this.f52025h = null;
            kl1.this.f52018a.mo21797b(c5563p2);
        }
    }

    public kl1(@NonNull yx0 yx0Var) {
        this.f52018a = yx0Var;
        Context m28621i = yx0Var.m28621i();
        C5101g2 m28616d = yx0Var.m28616d();
        this.f52021d = m28616d;
        this.f52022e = new aj0(m28616d);
        C5724s3 m28617e = yx0Var.m28617e();
        this.f52019b = new ck1(m28616d);
        this.f52020c = new ik0(m28621i, m28616d, m28617e);
        this.f52023f = new C5890uw();
    }

    /* renamed from: com.yandex.mobile.ads.impl.kl1$a */
    public final class C5346a implements zw0 {

        /* renamed from: a */
        @NonNull
        private final Context f52027a;

        /* renamed from: b */
        @NonNull
        private final AdResponse<String> f52028b;

        public C5346a(Context context, @NonNull AdResponse<String> adResponse) {
            this.f52027a = context.getApplicationContext();
            this.f52028b = adResponse;
        }

        @Override // com.yandex.mobile.ads.impl.zw0
        /* renamed from: a */
        public final void mo24204a(@NonNull qi0 qi0Var) {
            bj0 bj0Var = new bj0(qi0Var);
            kl1.this.f52019b.m23304a(this.f52027a, this.f52028b, kl1.this.f52022e);
            kl1.this.f52019b.m23305a(this.f52027a, this.f52028b, bj0Var);
        }

        @Override // com.yandex.mobile.ads.impl.zw0
        /* renamed from: a */
        public final void mo24203a() {
            kl1.this.f52019b.m23304a(this.f52027a, this.f52028b, kl1.this.f52022e);
            kl1.this.f52019b.m23305a(this.f52027a, this.f52028b, (bj0) null);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5148gw
    /* renamed from: a */
    public final void mo24991a(@NonNull tx0 tx0Var) {
        tx0 tx0Var2 = tx0Var;
        AdResponse<String> adResponse = this.f52024g;
        if (adResponse == null || this.f52025h == null) {
            return;
        }
        C5518o0 c5518o0 = new C5518o0(new C5518o0.a(adResponse).m26975a(this.f52021d.m24790l()).m26977a(this.f52025h));
        this.f52023f.m29144a(tx0Var2.m27310c(), c5518o0, tx0Var2.m30346h());
        this.f52024g = null;
        this.f52025h = null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5148gw
    /* renamed from: a */
    public final void mo24989a(@NonNull Context context) {
        this.f52026i = true;
        this.f52024g = null;
        this.f52025h = null;
        this.f52020c.m25555a();
        n60.m26811d("YandexNativeRewardedController invalidate", new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5148gw
    /* renamed from: a */
    public final void mo24990a(@NonNull Context context, @NonNull AdResponse<String> adResponse) {
        if (this.f52026i) {
            return;
        }
        this.f52024g = adResponse;
        this.f52020c.m25556a(adResponse, new C5347b(this, 0), new C5346a(context, adResponse));
    }
}
