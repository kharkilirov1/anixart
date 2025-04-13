package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.Callable;

@Beta
@GwtIncompatible
/* loaded from: classes2.dex */
public final class SimpleTimeLimiter implements TimeLimiter {

    /* renamed from: com.google.common.util.concurrent.SimpleTimeLimiter$1 */
    class C20331 implements InvocationHandler {

        /* renamed from: com.google.common.util.concurrent.SimpleTimeLimiter$1$1, reason: invalid class name */
        public class AnonymousClass1 implements Callable<Object> {

            /* renamed from: b */
            public final /* synthetic */ Method f22230b;

            /* renamed from: c */
            public final /* synthetic */ Object[] f22231c;

            /* renamed from: d */
            public final /* synthetic */ C20331 f22232d;

            @Override // java.util.concurrent.Callable
            public Object call() throws Exception {
                try {
                    Method method = this.f22230b;
                    Objects.requireNonNull(this.f22232d);
                    return method.invoke(null, this.f22231c);
                } catch (InvocationTargetException e2) {
                    SimpleTimeLimiter.m12207a(e2, false);
                    throw null;
                }
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            throw null;
        }
    }

    /* renamed from: a */
    public static Exception m12207a(Exception exc, boolean z) throws Exception {
        Throwable cause = exc.getCause();
        if (cause == null) {
            throw exc;
        }
        if (z) {
            StackTraceElement[] stackTrace = cause.getStackTrace();
            StackTraceElement[] stackTrace2 = exc.getStackTrace();
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) StackTraceElement.class, stackTrace.length + stackTrace2.length);
            System.arraycopy(stackTrace, 0, objArr, 0, stackTrace.length);
            System.arraycopy(stackTrace2, 0, objArr, stackTrace.length, stackTrace2.length);
            cause.setStackTrace((StackTraceElement[]) objArr);
        }
        if (cause instanceof Exception) {
            throw ((Exception) cause);
        }
        if (cause instanceof Error) {
            throw ((Error) cause);
        }
        throw exc;
    }
}
