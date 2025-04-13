package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.ti */
/* loaded from: classes3.dex */
public final class C5804ti {

    /* renamed from: a */
    @NonNull
    private final Dialog f55125a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC5541ok f55126b;

    public C5804ti(@NonNull Dialog dialog, @NonNull InterfaceC5541ok interfaceC5541ok) {
        this.f55125a = dialog;
        this.f55126b = interfaceC5541ok;
    }

    /* renamed from: a */
    public final void m28664a() {
        this.f55125a.dismiss();
        this.f55126b.mo27088c();
    }

    /* renamed from: b */
    public final void m28665b() {
        this.f55125a.dismiss();
    }
}
