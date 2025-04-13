package dagger.internal;

import dagger.Lazy;
import java.util.Objects;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class DoubleCheck<T> implements Provider<T>, Lazy<T> {

    /* renamed from: c */
    public static final Object f58002c = new Object();

    /* renamed from: a */
    public volatile Provider<T> f58003a;

    /* renamed from: b */
    public volatile Object f58004b = f58002c;

    public DoubleCheck(Provider<T> provider) {
        this.f58003a = provider;
    }

    /* renamed from: a */
    public static <P extends Provider<T>, T> Lazy<T> m30790a(P p) {
        if (p instanceof Lazy) {
            return (Lazy) p;
        }
        Objects.requireNonNull(p);
        return new DoubleCheck(p);
    }

    /* renamed from: b */
    public static Object m30791b(Object obj, Object obj2) {
        if (!(obj != f58002c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public T get() {
        T t = (T) this.f58004b;
        Object obj = f58002c;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f58004b;
                if (t == obj) {
                    t = this.f58003a.get();
                    m30791b(this.f58004b, t);
                    this.f58004b = t;
                    this.f58003a = null;
                }
            }
        }
        return t;
    }
}
