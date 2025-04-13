package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class p70<V extends ViewGroup> {

    /* renamed from: a */
    @Nullable
    private InterfaceC5651qo<V> f53402a;

    /* renamed from: a */
    public final void m27182a(@NonNull ViewGroup viewGroup) {
        viewGroup.removeAllViews();
        InterfaceC5651qo<V> interfaceC5651qo = this.f53402a;
        if (interfaceC5651qo != null) {
            interfaceC5651qo.mo22713c();
        }
    }

    /* renamed from: a */
    public final void m27183a(@NonNull ViewGroup viewGroup, @NonNull V v, @NonNull o70<V> o70Var) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        viewGroup.removeAllViews();
        viewGroup.addView(v, layoutParams);
        InterfaceC5651qo<V> m27011a = o70Var.m27011a();
        this.f53402a = m27011a;
        m27011a.mo22712a(v);
    }
}
