package com.google.android.datatransport.runtime.dagger.internal;

import javax.inject.Provider;

/* loaded from: classes.dex */
public final class SingleCheck<T> implements Provider<T> {

    /* renamed from: b */
    public static final Object f9210b = new Object();

    /* renamed from: a */
    public volatile Object f9211a;

    @Override // javax.inject.Provider
    public T get() {
        T t = (T) this.f9211a;
        return t == f9210b ? (T) this.f9211a : t;
    }
}
