package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.internal.reflect.ReflectionAccessor;
import com.google.gson.reflect.TypeToken;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class ConstructorConstructor {

    /* renamed from: a */
    public final Map<Type, InstanceCreator<?>> f23683a;

    /* renamed from: b */
    public final ReflectionAccessor f23684b = ReflectionAccessor.f23871a;

    public ConstructorConstructor(Map<Type, InstanceCreator<?>> map) {
        this.f23683a = map;
    }

    /* renamed from: a */
    public <T> ObjectConstructor<T> m12865a(TypeToken<T> typeToken) {
        ObjectConstructor<T> objectConstructor;
        final Type type = typeToken.f23886b;
        final Class<? super T> cls = typeToken.f23885a;
        final InstanceCreator<?> instanceCreator = this.f23683a.get(type);
        if (instanceCreator != null) {
            return new ObjectConstructor<T>(this) { // from class: com.google.gson.internal.ConstructorConstructor.1
                @Override // com.google.gson.internal.ObjectConstructor
                /* renamed from: a */
                public T mo12866a() {
                    return (T) instanceCreator.m12839a(type);
                }
            };
        }
        final InstanceCreator<?> instanceCreator2 = this.f23683a.get(cls);
        if (instanceCreator2 != null) {
            return new ObjectConstructor<T>(this) { // from class: com.google.gson.internal.ConstructorConstructor.2
                @Override // com.google.gson.internal.ObjectConstructor
                /* renamed from: a */
                public T mo12866a() {
                    return (T) instanceCreator2.m12839a(type);
                }
            };
        }
        ObjectConstructor<T> objectConstructor2 = null;
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f23684b.mo12942a(declaredConstructor);
            }
            objectConstructor = (ObjectConstructor<T>) new ObjectConstructor<Object>(this) { // from class: com.google.gson.internal.ConstructorConstructor.3
                @Override // com.google.gson.internal.ObjectConstructor
                /* renamed from: a */
                public Object mo12866a() {
                    try {
                        return declaredConstructor.newInstance(null);
                    } catch (IllegalAccessException e2) {
                        throw new AssertionError(e2);
                    } catch (InstantiationException e3) {
                        StringBuilder m24u = C0000a.m24u("Failed to invoke ");
                        m24u.append(declaredConstructor);
                        m24u.append(" with no args");
                        throw new RuntimeException(m24u.toString(), e3);
                    } catch (InvocationTargetException e4) {
                        StringBuilder m24u2 = C0000a.m24u("Failed to invoke ");
                        m24u2.append(declaredConstructor);
                        m24u2.append(" with no args");
                        throw new RuntimeException(m24u2.toString(), e4.getTargetException());
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            objectConstructor = null;
        }
        if (objectConstructor != null) {
            return objectConstructor;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            objectConstructor2 = SortedSet.class.isAssignableFrom(cls) ? (ObjectConstructor<T>) new ObjectConstructor<Object>(this) { // from class: com.google.gson.internal.ConstructorConstructor.4
                @Override // com.google.gson.internal.ObjectConstructor
                /* renamed from: a */
                public Object mo12866a() {
                    return new TreeSet();
                }
            } : EnumSet.class.isAssignableFrom(cls) ? (ObjectConstructor<T>) new ObjectConstructor<Object>(this) { // from class: com.google.gson.internal.ConstructorConstructor.5
                @Override // com.google.gson.internal.ObjectConstructor
                /* renamed from: a */
                public Object mo12866a() {
                    Type type2 = type;
                    if (!(type2 instanceof ParameterizedType)) {
                        StringBuilder m24u = C0000a.m24u("Invalid EnumSet type: ");
                        m24u.append(type.toString());
                        throw new JsonIOException(m24u.toString());
                    }
                    Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                    if (type3 instanceof Class) {
                        return EnumSet.noneOf((Class) type3);
                    }
                    StringBuilder m24u2 = C0000a.m24u("Invalid EnumSet type: ");
                    m24u2.append(type.toString());
                    throw new JsonIOException(m24u2.toString());
                }
            } : Set.class.isAssignableFrom(cls) ? (ObjectConstructor<T>) new ObjectConstructor<Object>(this) { // from class: com.google.gson.internal.ConstructorConstructor.6
                @Override // com.google.gson.internal.ObjectConstructor
                /* renamed from: a */
                public Object mo12866a() {
                    return new LinkedHashSet();
                }
            } : Queue.class.isAssignableFrom(cls) ? (ObjectConstructor<T>) new ObjectConstructor<Object>(this) { // from class: com.google.gson.internal.ConstructorConstructor.7
                @Override // com.google.gson.internal.ObjectConstructor
                /* renamed from: a */
                public Object mo12866a() {
                    return new ArrayDeque();
                }
            } : (ObjectConstructor<T>) new ObjectConstructor<Object>(this) { // from class: com.google.gson.internal.ConstructorConstructor.8
                @Override // com.google.gson.internal.ObjectConstructor
                /* renamed from: a */
                public Object mo12866a() {
                    return new ArrayList();
                }
            };
        } else if (Map.class.isAssignableFrom(cls)) {
            objectConstructor2 = ConcurrentNavigableMap.class.isAssignableFrom(cls) ? (ObjectConstructor<T>) new ObjectConstructor<Object>(this) { // from class: com.google.gson.internal.ConstructorConstructor.9
                @Override // com.google.gson.internal.ObjectConstructor
                /* renamed from: a */
                public Object mo12866a() {
                    return new ConcurrentSkipListMap();
                }
            } : ConcurrentMap.class.isAssignableFrom(cls) ? (ObjectConstructor<T>) new ObjectConstructor<Object>(this) { // from class: com.google.gson.internal.ConstructorConstructor.10
                @Override // com.google.gson.internal.ObjectConstructor
                /* renamed from: a */
                public Object mo12866a() {
                    return new ConcurrentHashMap();
                }
            } : SortedMap.class.isAssignableFrom(cls) ? (ObjectConstructor<T>) new ObjectConstructor<Object>(this) { // from class: com.google.gson.internal.ConstructorConstructor.11
                @Override // com.google.gson.internal.ObjectConstructor
                /* renamed from: a */
                public Object mo12866a() {
                    return new TreeMap();
                }
            } : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new TypeToken(((ParameterizedType) type).getActualTypeArguments()[0]).f23885a)) ? (ObjectConstructor<T>) new ObjectConstructor<Object>(this) { // from class: com.google.gson.internal.ConstructorConstructor.13
                @Override // com.google.gson.internal.ObjectConstructor
                /* renamed from: a */
                public Object mo12866a() {
                    return new LinkedTreeMap(LinkedTreeMap.f23735i);
                }
            } : (ObjectConstructor<T>) new ObjectConstructor<Object>(this) { // from class: com.google.gson.internal.ConstructorConstructor.12
                @Override // com.google.gson.internal.ObjectConstructor
                /* renamed from: a */
                public Object mo12866a() {
                    return new LinkedHashMap();
                }
            };
        }
        return objectConstructor2 != null ? objectConstructor2 : (ObjectConstructor<T>) new ObjectConstructor<Object>(this) { // from class: com.google.gson.internal.ConstructorConstructor.14

            /* renamed from: a */
            public final UnsafeAllocator f23687a;

            {
                UnsafeAllocator c22754;
                try {
                    Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls2.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    c22754 = new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.1

                        /* renamed from: a */
                        public final /* synthetic */ Method f23760a;

                        /* renamed from: b */
                        public final /* synthetic */ Object f23761b;

                        public C22721(Method method, Object obj) {
                            r1 = method;
                            r2 = obj;
                        }

                        @Override // com.google.gson.internal.UnsafeAllocator
                        /* renamed from: b */
                        public <T> T mo12894b(Class<T> cls3) throws Exception {
                            UnsafeAllocator.m12893a(cls3);
                            return (T) r1.invoke(r2, cls3);
                        }
                    };
                } catch (Exception unused2) {
                    try {
                        try {
                            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                            declaredMethod.setAccessible(true);
                            int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                            declaredMethod2.setAccessible(true);
                            c22754 = new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.2

                                /* renamed from: a */
                                public final /* synthetic */ Method f23762a;

                                /* renamed from: b */
                                public final /* synthetic */ int f23763b;

                                public C22732(Method declaredMethod22, int intValue2) {
                                    r1 = declaredMethod22;
                                    r2 = intValue2;
                                }

                                @Override // com.google.gson.internal.UnsafeAllocator
                                /* renamed from: b */
                                public <T> T mo12894b(Class<T> cls3) throws Exception {
                                    UnsafeAllocator.m12893a(cls3);
                                    return (T) r1.invoke(null, cls3, Integer.valueOf(r2));
                                }
                            };
                        } catch (Exception unused3) {
                            Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                            declaredMethod3.setAccessible(true);
                            c22754 = new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.3

                                /* renamed from: a */
                                public final /* synthetic */ Method f23764a;

                                public C22743(Method declaredMethod32) {
                                    r1 = declaredMethod32;
                                }

                                @Override // com.google.gson.internal.UnsafeAllocator
                                /* renamed from: b */
                                public <T> T mo12894b(Class<T> cls3) throws Exception {
                                    UnsafeAllocator.m12893a(cls3);
                                    return (T) r1.invoke(null, cls3, Object.class);
                                }
                            };
                        }
                    } catch (Exception unused4) {
                        c22754 = new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.4
                            @Override // com.google.gson.internal.UnsafeAllocator
                            /* renamed from: b */
                            public <T> T mo12894b(Class<T> cls3) {
                                throw new UnsupportedOperationException("Cannot allocate " + cls3);
                            }
                        };
                    }
                }
                this.f23687a = c22754;
            }

            @Override // com.google.gson.internal.ObjectConstructor
            /* renamed from: a */
            public Object mo12866a() {
                try {
                    return this.f23687a.mo12894b(cls);
                } catch (Exception e2) {
                    StringBuilder m24u = C0000a.m24u("Unable to invoke no-args constructor for ");
                    m24u.append(type);
                    m24u.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
                    throw new RuntimeException(m24u.toString(), e2);
                }
            }
        };
    }

    public String toString() {
        return this.f23683a.toString();
    }
}
