package com.google.gson.internal.reflect;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
final class UnsafeReflectionAccessor extends ReflectionAccessor {

    /* renamed from: d */
    public static Class f23872d;

    /* renamed from: b */
    public final Object f23873b;

    /* renamed from: c */
    public final Field f23874c;

    public UnsafeReflectionAccessor() {
        Object obj;
        Field field = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f23872d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Exception unused) {
            obj = null;
        }
        this.f23873b = obj;
        try {
            field = AccessibleObject.class.getDeclaredField("override");
        } catch (Exception unused2) {
        }
        this.f23874c = field;
    }

    @Override // com.google.gson.internal.reflect.ReflectionAccessor
    /* renamed from: a */
    public void mo12942a(AccessibleObject accessibleObject) {
        boolean z = false;
        if (this.f23873b != null && this.f23874c != null) {
            try {
                f23872d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f23873b, accessibleObject, Long.valueOf(((Long) f23872d.getMethod("objectFieldOffset", Field.class).invoke(this.f23873b, this.f23874c)).longValue()), Boolean.TRUE);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (z) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e2) {
            throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e2);
        }
    }
}
