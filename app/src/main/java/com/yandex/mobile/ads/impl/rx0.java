package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class rx0 implements InterfaceC5541ok, nx0 {

    /* renamed from: a */
    @NonNull
    private final Context f54457a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC5541ok f54458b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC5922vi f54459c;

    /* renamed from: d */
    private boolean f54460d;

    public rx0(@NonNull Context context, @NonNull C5505np c5505np, @NonNull InterfaceC5541ok interfaceC5541ok) {
        this.f54457a = context;
        this.f54458b = interfaceC5541ok;
        this.f54459c = c5505np;
    }

    @Override // com.yandex.mobile.ads.impl.nx0
    /* renamed from: a */
    public final void mo25995a() {
        this.f54460d = true;
        ((C5505np) this.f54459c).m26936a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5541ok
    /* renamed from: c */
    public final void mo27088c() {
        if (this.f54460d) {
            this.f54458b.mo27088c();
            return;
        }
        ((C5505np) this.f54459c).m26937a(this.f54457a);
    }
}
