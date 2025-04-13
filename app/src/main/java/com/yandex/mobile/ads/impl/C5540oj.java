package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.oj */
/* loaded from: classes3.dex */
public final class C5540oj<V extends ViewGroup> implements InterfaceC5651qo<V> {

    /* renamed from: a */
    @NonNull
    private final InterfaceC5651qo<V>[] f53277a;

    @SafeVarargs
    public C5540oj(@NonNull InterfaceC5651qo<V>... interfaceC5651qoArr) {
        this.f53277a = interfaceC5651qoArr;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: a */
    public final void mo22712a(@NonNull V v) {
        for (InterfaceC5651qo<V> interfaceC5651qo : this.f53277a) {
            interfaceC5651qo.mo22712a(v);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: c */
    public final void mo22713c() {
        for (InterfaceC5651qo<V> interfaceC5651qo : this.f53277a) {
            interfaceC5651qo.mo22713c();
        }
    }
}
