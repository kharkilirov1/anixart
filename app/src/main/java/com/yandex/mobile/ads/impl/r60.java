package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes3.dex */
final class r60 {

    /* renamed from: a */
    @NonNull
    private final AdResponse<?> f54209a;

    /* renamed from: b */
    @NonNull
    private final C5612q0 f54210b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC5541ok f54211c;

    public r60(@NonNull AdResponse<?> adResponse, @NonNull C5612q0 c5612q0, @NonNull InterfaceC5541ok interfaceC5541ok) {
        this.f54209a = adResponse;
        this.f54210b = c5612q0;
        this.f54211c = interfaceC5541ok;
    }

    /* renamed from: a */
    public final C5973wi m27855a(@NonNull rh0 rh0Var, @NonNull C5502nm c5502nm) {
        return new C5973wi(this.f54209a, this.f54210b, new ah1(), this.f54211c, rh0Var, c5502nm);
    }
}
