package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestrictTo
/* loaded from: classes.dex */
public class Lifecycling {

    /* renamed from: a */
    public static Map<Class<?>, Integer> f4610a = new HashMap();

    /* renamed from: b */
    public static Map<Class<?>, List<Constructor<? extends GeneratedAdapter>>> f4611b = new HashMap();

    /* renamed from: androidx.lifecycle.Lifecycling$1 */
    class C04021 implements GenericLifecycleObserver {
        @Override // androidx.lifecycle.LifecycleEventObserver
        /* renamed from: c */
        public void mo304c(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
            throw null;
        }
    }

    /* renamed from: a */
    public static GeneratedAdapter m3204a(Constructor<? extends GeneratedAdapter> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: b */
    public static String m3205b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: c */
    public static int m3206c(Class<?> cls) {
        Constructor<?> constructor;
        boolean z;
        ArrayList arrayList;
        Integer num = (Integer) ((HashMap) f4610a).get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i2 = 1;
        if (cls.getCanonicalName() != null) {
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String m3205b = m3205b(canonicalName);
                if (!name.isEmpty()) {
                    m3205b = name + "." + m3205b;
                }
                constructor = Class.forName(m3205b).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException(e2);
            }
            if (constructor != null) {
                ((HashMap) f4611b).put(cls, Collections.singletonList(constructor));
            } else {
                ClassesInfoCache classesInfoCache = ClassesInfoCache.f4546c;
                Boolean bool = classesInfoCache.f4548b.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                classesInfoCache.f4548b.put(cls, Boolean.FALSE);
                                z = false;
                                break;
                            }
                            if (((OnLifecycleEvent) declaredMethods[i3].getAnnotation(OnLifecycleEvent.class)) != null) {
                                classesInfoCache.m3174a(cls, declaredMethods);
                                z = true;
                                break;
                            }
                            i3++;
                        }
                    } catch (NoClassDefFoundError e3) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
                    }
                }
                if (!z) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    if (superclass != null && LifecycleObserver.class.isAssignableFrom(superclass)) {
                        arrayList = m3206c(superclass) != 1 ? new ArrayList((Collection) ((HashMap) f4611b).get(superclass)) : null;
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length2) {
                            Class<?> cls2 = interfaces[i4];
                            if (cls2 != null && LifecycleObserver.class.isAssignableFrom(cls2)) {
                                if (m3206c(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.addAll((Collection) ((HashMap) f4611b).get(cls2));
                            }
                            i4++;
                        } else if (arrayList != null) {
                            ((HashMap) f4611b).put(cls, arrayList);
                        }
                    }
                }
            }
            i2 = 2;
        }
        ((HashMap) f4610a).put(cls, Integer.valueOf(i2));
        return i2;
    }
}
