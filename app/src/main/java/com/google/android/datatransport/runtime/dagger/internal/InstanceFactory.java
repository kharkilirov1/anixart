package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import java.util.Objects;

/* loaded from: classes.dex */
public final class InstanceFactory<T> implements Factory<T>, Lazy<T> {

    /* renamed from: a */
    public final T f9206a;

    public InstanceFactory(T t) {
        this.f9206a = t;
    }

    /* renamed from: a */
    public static <T> Factory<T> m5542a(T t) {
        Objects.requireNonNull(t, "instance cannot be null");
        return new InstanceFactory(t);
    }

    @Override // javax.inject.Provider
    public T get() {
        return this.f9206a;
    }
}
