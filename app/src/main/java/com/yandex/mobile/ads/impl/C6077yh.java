package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.nativeads.AbstractC6202c;
import com.yandex.mobile.ads.nativeads.C6264w;

/* renamed from: com.yandex.mobile.ads.impl.yh */
/* loaded from: classes3.dex */
public final class C6077yh {

    /* renamed from: a */
    @NonNull
    private final C5276ja f56850a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC5000e2 f56851b;

    /* renamed from: c */
    @NonNull
    private final C6264w f56852c;

    /* renamed from: d */
    @NonNull
    private final bv0 f56853d;

    /* renamed from: e */
    @NonNull
    private final InterfaceC5512nv f56854e;

    public C6077yh(@NonNull C5276ja c5276ja, @NonNull InterfaceC5000e2 interfaceC5000e2, @NonNull C6264w c6264w, @NonNull bv0 bv0Var, @NonNull InterfaceC5512nv interfaceC5512nv) {
        this.f56850a = c5276ja;
        this.f56851b = interfaceC5000e2;
        this.f56852c = c6264w;
        this.f56853d = bv0Var;
        this.f56854e = interfaceC5512nv;
    }

    @NonNull
    /* renamed from: a */
    public final View.OnClickListener m29939a(@NonNull a80 a80Var) {
        AbstractC6202c m30756g = this.f56852c.m30756g();
        C5276ja c5276ja = this.f56850a;
        InterfaceC5000e2 interfaceC5000e2 = this.f56851b;
        C6264w c6264w = this.f56852c;
        return m30756g.mo30537a(this.f56854e, this.f56853d, interfaceC5000e2, c6264w, c5276ja, a80Var);
    }
}
