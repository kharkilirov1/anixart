package dagger.internal;

import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class DelegateFactory<T> implements Factory<T> {

    /* renamed from: a */
    public Provider<T> f58001a;

    @Override // javax.inject.Provider
    public T get() {
        Provider<T> provider = this.f58001a;
        if (provider != null) {
            return provider.get();
        }
        throw new IllegalStateException();
    }
}
