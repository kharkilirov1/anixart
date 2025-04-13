package dagger.android;

import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;
import java.util.ArrayList;
import java.util.Map;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class DispatchingAndroidInjector<T> implements AndroidInjector<T> {

    /* renamed from: a */
    public final Map<String, Provider<AndroidInjector.Factory<?>>> f58000a;

    public static final class InvalidInjectorBindingException extends RuntimeException {
        public InvalidInjectorBindingException(String str, ClassCastException classCastException) {
            super(str, classCastException);
        }
    }

    @Override // dagger.android.AndroidInjector
    /* renamed from: a */
    public void mo30782a(T t) {
        boolean z;
        Provider<AndroidInjector.Factory<?>> provider = this.f58000a.get(t.getClass().getName());
        if (provider == null) {
            z = false;
        } else {
            AndroidInjector.Factory<?> factory = provider.get();
            try {
                AndroidInjector<?> mo30783a = factory.mo30783a(t);
                Preconditions.m30794b(mo30783a, "%s.create(I) should not return null.", factory.getClass());
                mo30783a.mo30782a(t);
                z = true;
            } catch (ClassCastException e2) {
                throw new InvalidInjectorBindingException(String.format("%s does not implement AndroidInjector.Factory<%s>", factory.getClass().getCanonicalName(), t.getClass().getCanonicalName()), e2);
            }
        }
        if (z) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls = t.getClass(); cls != null; cls = cls.getSuperclass()) {
            if (this.f58000a.containsKey(cls.getCanonicalName())) {
                arrayList.add(cls.getCanonicalName());
            }
        }
        throw new IllegalArgumentException(arrayList.isEmpty() ? String.format("No injector factory bound for Class<%s>", t.getClass().getCanonicalName()) : String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", t.getClass().getCanonicalName(), arrayList));
    }
}
