package com.google.common.eventbus;

import com.google.common.base.Strings;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Primitives;
import com.google.common.reflect.TypeToken;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class SubscriberRegistry {

    /* renamed from: a */
    public static final LoadingCache<Class<?>, ImmutableList<Method>> f21675a;

    /* renamed from: b */
    public static final LoadingCache<Class<?>, ImmutableSet<Class<?>>> f21676b;

    public static final class MethodIdentifier {

        /* renamed from: a */
        public final String f21677a;

        /* renamed from: b */
        public final List<Class<?>> f21678b;

        public MethodIdentifier(Method method) {
            this.f21677a = method.getName();
            this.f21678b = Arrays.asList(method.getParameterTypes());
        }

        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof MethodIdentifier)) {
                return false;
            }
            MethodIdentifier methodIdentifier = (MethodIdentifier) obj;
            return this.f21677a.equals(methodIdentifier.f21677a) && this.f21678b.equals(methodIdentifier.f21678b);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f21677a, this.f21678b});
        }
    }

    static {
        CacheBuilder cacheBuilder = new CacheBuilder();
        cacheBuilder.m11233b();
        f21675a = cacheBuilder.m11232a(new CacheLoader<Class<?>, ImmutableList<Method>>() { // from class: com.google.common.eventbus.SubscriberRegistry.1
            @Override // com.google.common.cache.CacheLoader
            /* renamed from: a */
            public ImmutableList<Method> mo11237a(Class<?> cls) throws Exception {
                LoadingCache<Class<?>, ImmutableList<Method>> loadingCache = SubscriberRegistry.f21675a;
                Set mo12114M = new TypeToken.TypeSet().mo12114M();
                HashMap hashMap = new HashMap();
                Iterator it = mo12114M.iterator();
                while (it.hasNext()) {
                    for (Method method : ((Class) it.next()).getDeclaredMethods()) {
                        if (method.isAnnotationPresent(Subscribe.class) && !method.isSynthetic()) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            boolean z = parameterTypes.length == 1;
                            int length = parameterTypes.length;
                            if (!z) {
                                throw new IllegalArgumentException(Strings.m11218b("Method %s has @Subscribe annotation but has %s parameters. Subscriber methods must have exactly 1 parameter.", method, Integer.valueOf(length)));
                            }
                            boolean z2 = !parameterTypes[0].isPrimitive();
                            String name = parameterTypes[0].getName();
                            Class<?> cls2 = parameterTypes[0];
                            Map<Class<?>, Class<?>> map = Primitives.f21959a;
                            Objects.requireNonNull(cls2);
                            Class<?> cls3 = Primitives.f21959a.get(cls2);
                            if (cls3 != null) {
                                cls2 = cls3;
                            }
                            String simpleName = cls2.getSimpleName();
                            if (!z2) {
                                throw new IllegalArgumentException(Strings.m11218b("@Subscribe method %s's parameter is %s. Subscriber methods cannot accept primitives. Consider changing the parameter to %s.", method, name, simpleName));
                            }
                            MethodIdentifier methodIdentifier = new MethodIdentifier(method);
                            if (!hashMap.containsKey(methodIdentifier)) {
                                hashMap.put(methodIdentifier, method);
                            }
                        }
                    }
                }
                return ImmutableList.m11634y(hashMap.values());
            }
        });
        CacheBuilder cacheBuilder2 = new CacheBuilder();
        cacheBuilder2.m11233b();
        f21676b = cacheBuilder2.m11232a(new CacheLoader<Class<?>, ImmutableSet<Class<?>>>() { // from class: com.google.common.eventbus.SubscriberRegistry.2
            @Override // com.google.common.cache.CacheLoader
            /* renamed from: a */
            public ImmutableSet<Class<?>> mo11237a(Class<?> cls) throws Exception {
                return ImmutableSet.m11676x(new TypeToken.TypeSet().mo12114M());
            }
        });
    }

    public SubscriberRegistry(EventBus eventBus) {
        new ConcurrentHashMap();
    }
}
