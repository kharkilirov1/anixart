package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class b41 extends C5713rv {

    /* renamed from: b */
    private final long f48754b;

    public b41(C5598pn c5598pn, long j2) {
        super(c5598pn);
        C5220ia.m25473a(c5598pn.getPosition() >= j2);
        this.f48754b = j2;
    }

    @Override // com.yandex.mobile.ads.impl.C5713rv, com.yandex.mobile.ads.impl.InterfaceC5458mt
    /* renamed from: a */
    public final long mo22717a() {
        return super.mo22717a() - this.f48754b;
    }

    @Override // com.yandex.mobile.ads.impl.C5713rv, com.yandex.mobile.ads.impl.InterfaceC5458mt
    /* renamed from: e */
    public final long mo22718e() {
        return super.mo22718e() - this.f48754b;
    }

    @Override // com.yandex.mobile.ads.impl.C5713rv, com.yandex.mobile.ads.impl.InterfaceC5458mt
    public final long getPosition() {
        return super.getPosition() - this.f48754b;
    }
}
