package dagger.android;

import dagger.BindsInstance;

/* loaded from: classes3.dex */
public interface AndroidInjector<T> {

    @Deprecated
    public static abstract class Builder<T> implements Factory<T> {
        @Override // dagger.android.AndroidInjector.Factory
        /* renamed from: a */
        public final AndroidInjector<T> mo30783a(T t) {
            m30785c(t);
            return m30784b();
        }

        /* renamed from: b */
        public abstract AndroidInjector<T> m30784b();

        @BindsInstance
        /* renamed from: c */
        public abstract void m30785c(T t);
    }

    public interface Factory<T> {
        /* renamed from: a */
        AndroidInjector<T> mo30783a(@BindsInstance T t);
    }

    /* renamed from: a */
    void mo30782a(T t);
}
