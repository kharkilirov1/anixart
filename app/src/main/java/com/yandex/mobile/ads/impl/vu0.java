package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class vu0 {
    @Nullable
    /* renamed from: a */
    public static <T> T m29277a(@NonNull Class<T> cls, @NonNull Object... objArr) {
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            clsArr[i2] = objArr[i2].getClass();
        }
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(clsArr);
            boolean isAccessible = declaredConstructor.isAccessible();
            if (!isAccessible) {
                declaredConstructor.setAccessible(true);
            }
            T newInstance = declaredConstructor.newInstance(objArr);
            if (!isAccessible) {
                declaredConstructor.setAccessible(false);
            }
            return newInstance;
        } catch (Exception unused) {
            n60.m26810c("Can not instantiate instance of %s with constructor arguments: %s", cls.getCanonicalName(), Arrays.toString(objArr));
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    private static Object m29278a(@Nullable Object obj, @NonNull Class<?> cls, @NonNull String str, @NonNull Class<?>[] clsArr, @NonNull Object... objArr) {
        Object obj2;
        Method method;
        loop0: while (true) {
            obj2 = null;
            if (cls == null) {
                method = null;
                break;
            }
            try {
                Method[] declaredMethods = cls.getDeclaredMethods();
                int length = declaredMethods.length;
                for (int i2 = 0; i2 < length; i2++) {
                    method = declaredMethods[i2];
                    if (str.equals(method.getName()) && m29280a(method, clsArr)) {
                        break loop0;
                    }
                }
                cls = cls.getSuperclass();
            } catch (Exception unused) {
                n60.m26813f("Method %s(...) isn't found when using reflection", str);
                return obj2;
            }
        }
        if (method == null) {
            return null;
        }
        method.setAccessible(true);
        obj2 = method.invoke(obj, objArr);
        method.setAccessible(false);
        return obj2;
    }

    /* renamed from: a */
    private static boolean m29280a(@NonNull Method method, @NonNull Class<?>[] clsArr) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != clsArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            if (!parameterTypes[i2].isAssignableFrom(clsArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    /* renamed from: a */
    public static Object m29279a(@NonNull Object obj, @NonNull String str, @NonNull Object... objArr) {
        Class[] clsArr = new Class[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            clsArr[i2] = objArr[i2].getClass();
        }
        return m29278a(obj, obj.getClass(), str, clsArr, objArr);
    }

    @Nullable
    /* renamed from: a */
    public static Object m29276a(@NonNull Class cls, @NonNull String str, @NonNull Object... objArr) {
        Class[] clsArr = new Class[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            clsArr[i2] = objArr[i2].getClass();
        }
        return m29278a(null, cls, str, clsArr, objArr);
    }
}
