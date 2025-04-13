package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* loaded from: classes2.dex */
public class Lazy<T> implements Provider<T> {

    /* renamed from: c */
    public static final Object f22506c = new Object();

    /* renamed from: a */
    public volatile Object f22507a = f22506c;

    /* renamed from: b */
    public volatile Provider<T> f22508b;

    public Lazy(Provider<T> provider) {
        this.f22508b = provider;
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        T t = (T) this.f22507a;
        Object obj = f22506c;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f22507a;
                if (t == obj) {
                    t = this.f22508b.get();
                    this.f22507a = t;
                    this.f22508b = null;
                }
            }
        }
        return t;
    }
}
