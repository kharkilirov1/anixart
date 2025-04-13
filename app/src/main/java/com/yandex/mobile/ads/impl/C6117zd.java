package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.zd */
/* loaded from: classes3.dex */
public class C6117zd implements InterfaceC5418lz {

    /* renamed from: a */
    private final yo0 f57117a;

    public C6117zd(@NonNull yo0 yo0Var) {
        this.f57117a = yo0Var;
        yo0Var.setId(2);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5418lz
    /* renamed from: a */
    public void mo26546a(@NonNull String str) {
        this.f57117a.m25133a(str);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5418lz
    public void invalidate() {
        this.f57117a.mo25136e();
    }

    /* renamed from: a */
    public void mo30150a(@NonNull InterfaceC5719rz interfaceC5719rz) {
        this.f57117a.setHtmlWebViewListener(interfaceC5719rz);
    }
}
