package com.google.firebase.components;

import androidx.annotation.GuardedBy;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* loaded from: classes2.dex */
class OptionalProvider<T> implements Provider<T>, Deferred<T> {

    /* renamed from: c */
    public static final /* synthetic */ int f22511c = 0;

    /* renamed from: a */
    @GuardedBy
    public Deferred.DeferredHandler<T> f22512a;

    /* renamed from: b */
    public volatile Provider<T> f22513b;

    public OptionalProvider(Deferred.DeferredHandler<T> deferredHandler, Provider<T> provider) {
        this.f22512a = deferredHandler;
        this.f22513b = provider;
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        return this.f22513b.get();
    }
}
