package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.On */
/* loaded from: classes2.dex */
public class C3530On<T> implements InterfaceC3555Pn<T> {

    /* renamed from: a */
    @NonNull
    private final InterfaceC3555Pn<T> f43581a;

    public C3530On(@NonNull InterfaceC3555Pn<T> interfaceC3555Pn, @Nullable T t) {
        this.f43581a = interfaceC3555Pn;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3555Pn
    @Nullable
    /* renamed from: a */
    public T mo17985a(@Nullable T t) {
        return t != this.f43581a.mo17985a(t) ? "<truncated data was not sent, see METRIKALIB-4568>" : t;
    }
}
