package com.bumptech.glide.module;

import java.lang.reflect.InvocationTargetException;

@Deprecated
/* loaded from: classes.dex */
public final class ManifestParser {
    /* renamed from: a */
    public static GlideModule m5241a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance instanceof GlideModule) {
                    return (GlideModule) newInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + newInstance);
            } catch (IllegalAccessException e2) {
                m5242b(cls, e2);
                throw null;
            } catch (InstantiationException e3) {
                m5242b(cls, e3);
                throw null;
            } catch (NoSuchMethodException e4) {
                m5242b(cls, e4);
                throw null;
            } catch (InvocationTargetException e5) {
                m5242b(cls, e5);
                throw null;
            }
        } catch (ClassNotFoundException e6) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e6);
        }
    }

    /* renamed from: b */
    public static void m5242b(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }
}
