package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class s21 implements InterfaceC5466n<r21> {

    /* renamed from: a */
    @NonNull
    private final w01 f54485a;

    /* renamed from: b */
    @NonNull
    private final a31 f54486b;

    public s21(@NonNull w01 w01Var, @NonNull a31 a31Var) {
        this.f54485a = w01Var;
        this.f54486b = a31Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5466n
    /* renamed from: a */
    public final void mo22935a(@NonNull View view, @NonNull r21 r21Var) {
        r21 r21Var2 = r21Var;
        this.f54485a.m29359a(r21Var2.m27825b());
        this.f54486b.m22371a(view, r21Var2);
    }
}
