package com.airbnb.epoxy;

import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import java.util.Map;
import p000a.C0000a;

/* loaded from: classes.dex */
class ControllerHelperLookup {

    /* renamed from: a */
    public static final Map<Class<?>, Constructor<?>> f6887a = new LinkedHashMap();

    /* renamed from: b */
    public static final NoOpControllerHelper f6888b = new NoOpControllerHelper();

    @Nullable
    /* renamed from: a */
    public static Constructor<?> m4508a(Class<?> cls) {
        Constructor<?> m4508a;
        Map<Class<?>, Constructor<?>> map = f6887a;
        Constructor<?> constructor = (Constructor) ((LinkedHashMap) map).get(cls);
        if (constructor != null || map.containsKey(cls)) {
            return constructor;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.")) {
            return null;
        }
        try {
            m4508a = Class.forName(name + "_EpoxyHelper").getConstructor(cls);
        } catch (ClassNotFoundException unused) {
            m4508a = m4508a(cls.getSuperclass());
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(C0000a.m14k("Unable to find Epoxy Helper constructor for ", name), e2);
        }
        f6887a.put(cls, m4508a);
        return m4508a;
    }
}
