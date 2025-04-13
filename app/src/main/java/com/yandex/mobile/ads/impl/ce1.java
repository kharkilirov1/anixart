package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class ce1 implements View.OnClickListener {

    /* renamed from: a */
    @NonNull
    private final a80 f49218a;

    /* renamed from: b */
    @NonNull
    private final C6077yh f49219b;

    /* renamed from: c */
    @Nullable
    private final C5083fl f49220c;

    public ce1(@NonNull a80 a80Var, @NonNull C6077yh c6077yh, @Nullable C5083fl c5083fl) {
        this.f49218a = a80Var;
        this.f49219b = c6077yh;
        this.f49220c = c5083fl;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NonNull View view) {
        a80 a80Var;
        if (this.f49220c != null) {
            a80Var = new a80(this.f49218a.m22400a(), this.f49218a.m22402c(), this.f49218a.m22403d(), this.f49220c.m24612b(), this.f49218a.m22401b());
        } else {
            a80Var = this.f49218a;
        }
        this.f49219b.m29939a(a80Var).onClick(view);
    }
}
