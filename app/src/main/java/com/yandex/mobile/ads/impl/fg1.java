package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class fg1 implements InterfaceC6027xh {

    /* renamed from: a */
    @NonNull
    private final View f50263a;

    public fg1(@NonNull View view) {
        this.f50263a = view;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6027xh
    /* renamed from: a */
    public final void mo23878a(@NonNull a80 a80Var, @NonNull C6077yh c6077yh) {
        wi0 wi0Var = new wi0(this.f50263a.getContext(), c6077yh.m29939a(a80Var));
        this.f50263a.setOnTouchListener(wi0Var);
        this.f50263a.setOnClickListener(wi0Var);
    }
}
