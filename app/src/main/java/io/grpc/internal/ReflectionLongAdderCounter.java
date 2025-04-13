package io.grpc.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class ReflectionLongAdderCounter implements LongCounter {

    /* renamed from: b */
    public static final Logger f58962b = Logger.getLogger(ReflectionLongAdderCounter.class.getName());

    /* renamed from: c */
    public static final Constructor<?> f58963c;

    /* renamed from: d */
    public static final Method f58964d;

    /* renamed from: e */
    public static final Method f58965e;

    /* renamed from: f */
    public static final RuntimeException f58966f;

    /* renamed from: g */
    public static final Object[] f58967g;

    /* renamed from: a */
    public final Object f58968a;

    static {
        Method method;
        Method method2;
        Constructor<?> constructor;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
            try {
                method2 = cls.getMethod("sum", new Class[0]);
                try {
                    Constructor<?>[] constructors = cls.getConstructors();
                    int length = constructors.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            constructor = null;
                            break;
                        }
                        constructor = constructors[i2];
                        if (constructor.getParameterTypes().length == 0) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    th = null;
                } catch (Throwable th) {
                    th = th;
                    f58962b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                    constructor = null;
                    if (th == null) {
                    }
                    f58963c = null;
                    f58964d = null;
                    f58965e = null;
                    f58966f = new RuntimeException(th);
                    f58967g = new Object[]{1L};
                }
            } catch (Throwable th2) {
                th = th2;
                method2 = null;
            }
        } catch (Throwable th3) {
            th = th3;
            method = null;
            method2 = null;
        }
        if (th == null || constructor == null) {
            f58963c = null;
            f58964d = null;
            f58965e = null;
            f58966f = new RuntimeException(th);
        } else {
            f58963c = constructor;
            f58964d = method;
            f58965e = method2;
            f58966f = null;
        }
        f58967g = new Object[]{1L};
    }

    public ReflectionLongAdderCounter() {
        RuntimeException runtimeException = f58966f;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f58968a = f58963c.newInstance(new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // io.grpc.internal.LongCounter
    /* renamed from: a */
    public void mo31037a(long j2) {
        try {
            f58964d.invoke(this.f58968a, j2 == 1 ? f58967g : new Object[]{Long.valueOf(j2)});
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
