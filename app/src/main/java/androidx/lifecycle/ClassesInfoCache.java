package androidx.lifecycle;

import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p000a.C0000a;

@Deprecated
/* loaded from: classes.dex */
final class ClassesInfoCache {

    /* renamed from: c */
    public static ClassesInfoCache f4546c = new ClassesInfoCache();

    /* renamed from: a */
    public final Map<Class<?>, CallbackInfo> f4547a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, Boolean> f4548b = new HashMap();

    @Deprecated
    public static class CallbackInfo {

        /* renamed from: a */
        public final Map<Lifecycle.Event, List<MethodReference>> f4549a = new HashMap();

        /* renamed from: b */
        public final Map<MethodReference, Lifecycle.Event> f4550b;

        public CallbackInfo(Map<MethodReference, Lifecycle.Event> map) {
            this.f4550b = map;
            for (Map.Entry<MethodReference, Lifecycle.Event> entry : map.entrySet()) {
                Lifecycle.Event value = entry.getValue();
                List<MethodReference> list = this.f4549a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f4549a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: a */
        public static void m3177a(List<MethodReference> list, LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    MethodReference methodReference = list.get(size);
                    Objects.requireNonNull(methodReference);
                    try {
                        int i2 = methodReference.f4551a;
                        if (i2 == 0) {
                            methodReference.f4552b.invoke(obj, new Object[0]);
                        } else if (i2 == 1) {
                            methodReference.f4552b.invoke(obj, lifecycleOwner);
                        } else if (i2 == 2) {
                            methodReference.f4552b.invoke(obj, lifecycleOwner, event);
                        }
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    } catch (InvocationTargetException e3) {
                        throw new RuntimeException("Failed to call observer method", e3.getCause());
                    }
                }
            }
        }
    }

    @Deprecated
    public static final class MethodReference {

        /* renamed from: a */
        public final int f4551a;

        /* renamed from: b */
        public final Method f4552b;

        public MethodReference(int i2, Method method) {
            this.f4551a = i2;
            this.f4552b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodReference)) {
                return false;
            }
            MethodReference methodReference = (MethodReference) obj;
            return this.f4551a == methodReference.f4551a && this.f4552b.getName().equals(methodReference.f4552b.getName());
        }

        public int hashCode() {
            return this.f4552b.getName().hashCode() + (this.f4551a * 31);
        }
    }

    /* renamed from: a */
    public final CallbackInfo m3174a(Class<?> cls, @Nullable Method[] methodArr) {
        int i2;
        CallbackInfo m3175b;
        Class<?> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (m3175b = m3175b(superclass)) != null) {
            hashMap.putAll(m3175b.f4550b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<MethodReference, Lifecycle.Event> entry : m3175b(cls2).f4550b.entrySet()) {
                m3176c(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(LifecycleOwner.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i2 = 1;
                }
                Lifecycle.Event value = onLifecycleEvent.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(Lifecycle.Event.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != Lifecycle.Event.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i2 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m3176c(hashMap, new MethodReference(i2, method), value, cls);
                z = true;
            }
        }
        CallbackInfo callbackInfo = new CallbackInfo(hashMap);
        this.f4547a.put(cls, callbackInfo);
        this.f4548b.put(cls, Boolean.valueOf(z));
        return callbackInfo;
    }

    /* renamed from: b */
    public CallbackInfo m3175b(Class<?> cls) {
        CallbackInfo callbackInfo = this.f4547a.get(cls);
        return callbackInfo != null ? callbackInfo : m3174a(cls, null);
    }

    /* renamed from: c */
    public final void m3176c(Map<MethodReference, Lifecycle.Event> map, MethodReference methodReference, Lifecycle.Event event, Class<?> cls) {
        Lifecycle.Event event2 = map.get(methodReference);
        if (event2 == null || event == event2) {
            if (event2 == null) {
                map.put(methodReference, event);
                return;
            }
            return;
        }
        Method method = methodReference.f4552b;
        StringBuilder m24u = C0000a.m24u("Method ");
        m24u.append(method.getName());
        m24u.append(" in ");
        m24u.append(cls.getName());
        m24u.append(" already declared with different @OnLifecycleEvent value: previous value ");
        m24u.append(event2);
        m24u.append(", new value ");
        m24u.append(event);
        throw new IllegalArgumentException(m24u.toString());
    }
}
