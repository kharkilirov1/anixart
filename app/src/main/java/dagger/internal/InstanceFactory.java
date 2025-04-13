package dagger.internal;

import dagger.Lazy;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class InstanceFactory<T> implements Factory<T>, Lazy<T> {

    /* renamed from: a */
    public final T f58005a;

    public InstanceFactory(T t) {
        this.f58005a = t;
    }

    /* renamed from: a */
    public static <T> Factory<T> m30792a(T t) {
        Objects.requireNonNull(t, "instance cannot be null");
        return new InstanceFactory(t);
    }

    @Override // javax.inject.Provider
    public T get() {
        return this.f58005a;
    }
}
