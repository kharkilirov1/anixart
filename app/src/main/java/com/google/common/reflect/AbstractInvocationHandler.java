package com.google.common.reflect;

import com.google.common.annotations.Beta;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
/* loaded from: classes2.dex */
public abstract class AbstractInvocationHandler implements InvocationHandler {

    /* renamed from: a */
    public static final Object[] f21985a = new Object[0];

    /* renamed from: a */
    public abstract Object m12094a(Object obj, Method method, Object[] objArr) throws Throwable;

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, @NullableDecl Object[] objArr) throws Throwable {
        if (objArr == null) {
            objArr = f21985a;
        }
        if (objArr.length == 0 && method.getName().equals("hashCode")) {
            return Integer.valueOf(hashCode());
        }
        if (objArr.length != 1 || !method.getName().equals("equals") || method.getParameterTypes()[0] != Object.class) {
            return (objArr.length == 0 && method.getName().equals("toString")) ? toString() : m12094a(obj, method, objArr);
        }
        Object obj2 = objArr[0];
        if (obj2 == null) {
            return Boolean.FALSE;
        }
        if (obj == obj2) {
            return Boolean.TRUE;
        }
        Class<?> cls = obj.getClass();
        return Boolean.valueOf((cls.isInstance(obj2) || (Proxy.isProxyClass(obj2.getClass()) && Arrays.equals(obj2.getClass().getInterfaces(), cls.getInterfaces()))) && equals(Proxy.getInvocationHandler(obj2)));
    }

    public String toString() {
        return super.toString();
    }
}
