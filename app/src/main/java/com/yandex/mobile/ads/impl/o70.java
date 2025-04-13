package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class o70<V extends ViewGroup> {

    /* renamed from: a */
    @LayoutRes
    private final int f53178a;

    /* renamed from: b */
    @NonNull
    private final Class<V> f53179b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC5651qo<V> f53180c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC5701ro f53181d;

    public o70(@LayoutRes int i2, @NonNull Class cls, @NonNull C5540oj c5540oj, @NonNull InterfaceC5701ro interfaceC5701ro) {
        this.f53178a = i2;
        this.f53179b = cls;
        this.f53180c = c5540oj;
        this.f53181d = interfaceC5701ro;
    }

    @NonNull
    /* renamed from: a */
    public final InterfaceC5651qo<V> m27011a() {
        return this.f53180c;
    }

    @NonNull
    /* renamed from: b */
    public final InterfaceC5701ro m27012b() {
        return this.f53181d;
    }

    @LayoutRes
    /* renamed from: c */
    public final int m27013c() {
        return this.f53178a;
    }

    @NonNull
    /* renamed from: d */
    public final Class<V> m27014d() {
        return this.f53179b;
    }
}
