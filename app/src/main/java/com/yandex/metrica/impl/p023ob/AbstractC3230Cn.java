package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.Cn */
/* loaded from: classes2.dex */
abstract class AbstractC3230Cn<T> implements InterfaceC3555Pn<T> {

    /* renamed from: a */
    private final int f42681a;

    /* renamed from: b */
    private final String f42682b;

    /* renamed from: c */
    @NonNull
    public final C3379Im f42683c;

    public AbstractC3230Cn(int i2, @NonNull String str, @NonNull C3379Im c3379Im) {
        this.f42681a = i2;
        this.f42682b = str;
        this.f42683c = c3379Im;
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: a */
    public String m17942a() {
        return this.f42682b;
    }

    @VisibleForTesting
    /* renamed from: b */
    public int m17943b() {
        return this.f42681a;
    }
}
