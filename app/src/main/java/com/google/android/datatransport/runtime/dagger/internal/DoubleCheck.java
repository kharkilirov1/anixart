package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class DoubleCheck<T> implements Provider<T>, Lazy<T> {

    /* renamed from: c */
    public static final Object f9203c = new Object();

    /* renamed from: a */
    public volatile Provider<T> f9204a;

    /* renamed from: b */
    public volatile Object f9205b = f9203c;

    public DoubleCheck(Provider<T> provider) {
        this.f9204a = provider;
    }

    /* renamed from: a */
    public static Object m5541a(Object obj, Object obj2) {
        if (!((obj == f9203c || (obj instanceof MemoizedSentinel)) ? false : true) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public T get() {
        T t = (T) this.f9205b;
        Object obj = f9203c;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f9205b;
                if (t == obj) {
                    t = this.f9204a.get();
                    m5541a(this.f9205b, t);
                    this.f9205b = t;
                    this.f9204a = null;
                }
            }
        }
        return t;
    }
}
