package com.google.gson.internal.reflect;

import com.google.gson.internal.JavaVersion;
import java.lang.reflect.AccessibleObject;

/* loaded from: classes2.dex */
public abstract class ReflectionAccessor {

    /* renamed from: a */
    public static final ReflectionAccessor f23871a;

    static {
        f23871a = JavaVersion.f23703a < 9 ? new PreJava9ReflectionAccessor() : new UnsafeReflectionAccessor();
    }

    /* renamed from: a */
    public abstract void mo12942a(AccessibleObject accessibleObject);
}
