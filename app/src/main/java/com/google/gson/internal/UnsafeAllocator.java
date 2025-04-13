package com.google.gson.internal;

import java.lang.reflect.Modifier;
import p000a.C0000a;

/* loaded from: classes2.dex */
public abstract class UnsafeAllocator {
    /* renamed from: a */
    public static void m12893a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder m24u = C0000a.m24u("Interface can't be instantiated! Interface name: ");
            m24u.append(cls.getName());
            throw new UnsupportedOperationException(m24u.toString());
        }
        if (Modifier.isAbstract(modifiers)) {
            StringBuilder m24u2 = C0000a.m24u("Abstract class can't be instantiated! Class name: ");
            m24u2.append(cls.getName());
            throw new UnsupportedOperationException(m24u2.toString());
        }
    }

    /* renamed from: b */
    public abstract <T> T mo12894b(Class<T> cls) throws Exception;
}
