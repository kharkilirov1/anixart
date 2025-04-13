package com.google.android.play.core.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzbw {
    /* renamed from: a */
    public static <T> zzbu<T> m10867a(Object obj, String str, Class<T> cls) {
        return new zzbu<>(obj, m10872f(obj, str), cls);
    }

    /* renamed from: b */
    public static <T> zzbv<T> m10868b(Object obj, String str, Class<T> cls) {
        return new zzbv<>(obj, m10872f(obj, str), cls);
    }

    /* renamed from: c */
    public static <R, P0> R m10869c(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p0) {
        try {
            return cls.cast(m10873g(obj.getClass(), str, cls2).invoke(obj, p0));
        } catch (Exception e2) {
            throw new zzbx(String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e2);
        }
    }

    /* renamed from: d */
    public static <R, P0, P1, P2> R m10870d(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p0, Class<P1> cls3, P1 p1, Class<P2> cls4, P2 p2) {
        try {
            return cls.cast(m10873g(obj.getClass(), str, cls2, cls3, cls4).invoke(obj, p0, p1, p2));
        } catch (Exception e2) {
            throw new zzbx(String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e2);
        }
    }

    /* renamed from: e */
    public static <R, P0> R m10871e(Class cls, String str, Class<R> cls2, Class<P0> cls3, P0 p0) {
        try {
            return cls2.cast(m10873g(cls, "isDexOptNeeded", cls3).invoke(null, p0));
        } catch (Exception e2) {
            throw new zzbx(String.format("Failed to invoke static method %s on type %s", "isDexOptNeeded", cls), e2);
        }
    }

    /* renamed from: f */
    public static Field m10872f(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new zzbx(String.format("Failed to find a field named %s on an object of instance %s", str, obj.getClass().getName()));
    }

    /* renamed from: g */
    public static Method m10873g(Class<?> cls, String str, Class<?>... clsArr) {
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new zzbx(String.format("Could not find a method named %s with parameters %s in type %s", str, Arrays.asList(clsArr), cls));
    }
}
