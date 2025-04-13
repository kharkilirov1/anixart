package io.grpc;

import io.grpc.NameResolverRegistry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* loaded from: classes3.dex */
final class ServiceProviders {

    public interface PriorityAccessor<T> {
        /* renamed from: a */
        int mo30894a(T t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ServiceLoader] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ServiceLoader] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList] */
    /* renamed from: a */
    public static <T> List<T> m30940a(Class<T> cls, Iterable<Class<?>> iterable, ClassLoader classLoader, final PriorityAccessor<T> priorityAccessor) {
        boolean z;
        ?? load;
        try {
            Class.forName("android.app.Application", false, classLoader);
            z = true;
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            load = new ArrayList();
            for (Class<?> cls2 : iterable) {
                try {
                    load.add(cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
            }
        } else {
            load = ServiceLoader.load(cls, classLoader);
            if (!load.iterator().hasNext()) {
                load = ServiceLoader.load(cls);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : load) {
            if (((NameResolverRegistry.NameResolverPriorityAccessor) priorityAccessor).m30932b(obj)) {
                arrayList.add(obj);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new Comparator<T>() { // from class: io.grpc.ServiceProviders.1
            @Override // java.util.Comparator
            public int compare(T t, T t2) {
                int mo30894a = PriorityAccessor.this.mo30894a(t) - PriorityAccessor.this.mo30894a(t2);
                return mo30894a != 0 ? mo30894a : t.getClass().getName().compareTo(t2.getClass().getName());
            }
        }));
        return Collections.unmodifiableList(arrayList);
    }
}
