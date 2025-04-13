package dagger.internal;

import dagger.Lazy;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class ProviderOfLazy<T> implements Provider<Lazy<T>> {
    @Override // javax.inject.Provider
    public Object get() {
        return DoubleCheck.m30790a(null);
    }
}
