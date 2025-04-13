package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class Throwables {

    /* renamed from: a */
    @NullableDecl
    @GwtIncompatible
    public static final Object f20605a;

    /* renamed from: b */
    @NullableDecl
    @GwtIncompatible
    public static final Method f20606b;

    /* renamed from: c */
    @NullableDecl
    @GwtIncompatible
    public static final Method f20607c;

    /* renamed from: com.google.common.base.Throwables$1 */
    class C15781 extends AbstractList<StackTraceElement> {
        @Override // java.util.AbstractList, java.util.List
        public Object get(int i2) {
            return (StackTraceElement) Throwables.m11220a(Throwables.f20606b, Throwables.f20605a, new Object[]{null, Integer.valueOf(i2)});
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return ((Integer) Throwables.m11220a(Throwables.f20607c, Throwables.f20605a, new Object[]{null})).intValue();
        }
    }

    static {
        Object m11221b = m11221b();
        f20605a = m11221b;
        Method method = null;
        f20606b = m11221b == null ? null : m11222c("getStackTraceElement", Throwable.class, Integer.TYPE);
        if (m11221b != null) {
            try {
                Method m11222c = m11222c("getStackTraceDepth", Throwable.class);
                if (m11222c != null) {
                    m11222c.invoke(m11221b(), new Throwable());
                    method = m11222c;
                }
            } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            }
        }
        f20607c = method;
    }

    /* renamed from: a */
    public static Object m11220a(Method method, Object obj, Object[] objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            m11223d(e3.getCause());
            throw null;
        }
    }

    @NullableDecl
    @GwtIncompatible
    /* renamed from: b */
    public static Object m11221b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    @NullableDecl
    @GwtIncompatible
    /* renamed from: c */
    public static Method m11222c(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    @Deprecated
    /* renamed from: d */
    public static RuntimeException m11223d(Throwable th) {
        m11225f(th);
        throw new RuntimeException(th);
    }

    @GwtIncompatible
    /* renamed from: e */
    public static <X extends Throwable> void m11224e(@NullableDecl Throwable th, Class<X> cls) throws Throwable {
        if (cls.isInstance(th)) {
            throw cls.cast(th);
        }
        m11225f(th);
    }

    /* renamed from: f */
    public static void m11225f(Throwable th) {
        java.util.Objects.requireNonNull(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }
}
