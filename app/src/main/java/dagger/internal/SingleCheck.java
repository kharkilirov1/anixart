package dagger.internal;

import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class SingleCheck<T> implements Provider<T> {

    /* renamed from: b */
    public static final Object f58009b = new Object();

    /* renamed from: a */
    public volatile Object f58010a;

    @Override // javax.inject.Provider
    public T get() {
        T t = (T) this.f58010a;
        return t == f58009b ? (T) this.f58010a : t;
    }
}
