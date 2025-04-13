package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.nativeads.C6264w;

/* loaded from: classes3.dex */
public final class ai0 implements View.OnClickListener {

    /* renamed from: a */
    @NonNull
    private final C5276ja f48590a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC5000e2 f48591b;

    /* renamed from: c */
    @NonNull
    private final C6264w f48592c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC5512nv f48593d;

    /* renamed from: e */
    @NonNull
    private final bv0 f48594e;

    /* renamed from: f */
    @Nullable
    private final a80 f48595f;

    public ai0(@NonNull InterfaceC5512nv interfaceC5512nv, @NonNull bv0 bv0Var, @NonNull InterfaceC5000e2 interfaceC5000e2, @NonNull C6264w c6264w, @NonNull C5276ja c5276ja, @Nullable a80 a80Var) {
        this.f48590a = c5276ja;
        this.f48591b = interfaceC5000e2;
        this.f48592c = c6264w;
        this.f48594e = bv0Var;
        this.f48595f = a80Var;
        this.f48593d = interfaceC5512nv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long m22938a = this.f48594e.m22938a();
        a80 a80Var = this.f48595f;
        if (a80Var == null || m22938a < a80Var.m22401b() || !this.f48590a.m25827e()) {
            return;
        }
        this.f48593d.mo26321a();
        this.f48591b.mo23790a(view, this.f48590a, this.f48595f, this.f48592c);
    }
}
