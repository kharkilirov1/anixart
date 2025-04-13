package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.impl.C4786a0;
import com.yandex.mobile.ads.impl.C5101g2;
import com.yandex.mobile.ads.impl.InterfaceC5880ur;
import com.yandex.mobile.ads.impl.a80;
import com.yandex.mobile.ads.impl.ci0;
import com.yandex.mobile.ads.impl.m20;
import com.yandex.mobile.ads.impl.n60;
import com.yandex.mobile.ads.impl.sv0;

/* renamed from: com.yandex.mobile.ads.nativeads.k */
/* loaded from: classes3.dex */
public final class C6218k implements InterfaceC5880ur, m20.InterfaceC5423a {

    /* renamed from: a */
    @NonNull
    private final C4786a0 f57716a;

    /* renamed from: b */
    @NonNull
    private final ci0 f57717b;

    public C6218k(@NonNull Context context, @NonNull C5101g2 c5101g2) {
        ci0 ci0Var = new ci0();
        this.f57717b = ci0Var;
        this.f57716a = new C4786a0(context, c5101g2, ci0Var);
    }

    /* renamed from: a */
    public final void m30567a(@Nullable NativeAdEventListener nativeAdEventListener) {
        this.f57717b.m23285a(nativeAdEventListener);
    }

    /* renamed from: b */
    public final void m30568b() {
        n60.m26809b("onAdClicked", new Object[0]);
        this.f57716a.m22337a();
    }

    /* renamed from: c */
    public final void m30569c() {
        this.f57716a.m22343e();
    }

    /* renamed from: d */
    public final void m30570d() {
        this.f57717b.onLeftApplication();
        this.f57716a.m22342d();
    }

    /* renamed from: e */
    public final void m30571e() {
        this.f57717b.onLeftApplication();
        this.f57716a.m22344f();
    }

    /* renamed from: f */
    public final void m30572f() {
        this.f57716a.m22340b();
    }

    /* renamed from: g */
    public final void m30573g() {
        this.f57717b.onLeftApplication();
        this.f57716a.m22341c();
    }

    /* renamed from: a */
    public final void m30566a(@NonNull sv0.InterfaceC5763a interfaceC5763a) {
        this.f57716a.m22339a(interfaceC5763a);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5880ur
    /* renamed from: a */
    public final void mo26794a() {
        this.f57717b.m23284a();
    }

    /* renamed from: a */
    public final void m30565a(@NonNull a80 a80Var) {
        this.f57716a.m22338a(a80Var.m22402c());
    }

    @Override // com.yandex.mobile.ads.impl.m20.InterfaceC5423a
    /* renamed from: a */
    public final void mo21751a(@Nullable AdImpressionData adImpressionData) {
        this.f57717b.m23286b(adImpressionData);
    }
}
