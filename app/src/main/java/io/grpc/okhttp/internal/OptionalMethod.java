package io.grpc.okhttp.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class OptionalMethod<T> {

    /* renamed from: a */
    public final Class<?> f59367a;

    /* renamed from: b */
    public final String f59368b;

    /* renamed from: c */
    public final Class[] f59369c;

    public OptionalMethod(Class<?> cls, String str, Class... clsArr) {
        this.f59367a = cls;
        this.f59368b = str;
        this.f59369c = clsArr;
    }

    /* renamed from: b */
    public static Method m31285b(Class<?> cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return m31285b(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public final Method m31286a(Class<?> cls) {
        Method m31285b;
        Class<?> cls2;
        String str = this.f59368b;
        if (str == null || !((m31285b = m31285b(cls, str, this.f59369c)) == null || (cls2 = this.f59367a) == null || cls2.isAssignableFrom(m31285b.getReturnType()))) {
            return null;
        }
        return m31285b;
    }

    /* renamed from: c */
    public Object m31287c(T t, Object... objArr) throws InvocationTargetException {
        Method m31286a = m31286a(t.getClass());
        if (m31286a == null) {
            StringBuilder m24u = C0000a.m24u("Method ");
            m24u.append(this.f59368b);
            m24u.append(" not supported for object ");
            m24u.append(t);
            throw new AssertionError(m24u.toString());
        }
        try {
            return m31286a.invoke(t, objArr);
        } catch (IllegalAccessException e2) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + m31286a);
            assertionError.initCause(e2);
            throw assertionError;
        }
    }

    /* renamed from: d */
    public Object m31288d(T t, Object... objArr) {
        try {
            Method m31286a = m31286a(t.getClass());
            if (m31286a == null) {
                return null;
            }
            try {
                return m31286a.invoke(t, objArr);
            } catch (IllegalAccessException unused) {
                return null;
            }
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: e */
    public Object m31289e(T t, Object... objArr) {
        try {
            return m31287c(t, objArr);
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
