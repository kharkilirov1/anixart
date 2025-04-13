package io.reactivex.internal.util;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ExceptionHelper {

    /* renamed from: a */
    public static final Throwable f62793a = new Termination();

    public static final class Termination extends Throwable {
        public Termination() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }
    }

    public ExceptionHelper() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static <T> boolean m31817a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        do {
            th2 = atomicReference.get();
            if (th2 == f62793a) {
                return false;
            }
        } while (!atomicReference.compareAndSet(th2, th2 == null ? th : new CompositeException(th2, th)));
        return true;
    }

    /* renamed from: b */
    public static <T> Throwable m31818b(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = f62793a;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    /* renamed from: c */
    public static <E extends Throwable> Exception m31819c(Throwable th) throws Throwable {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        throw th;
    }

    /* renamed from: d */
    public static String m31820d(long j2, TimeUnit timeUnit) {
        return "The source did not signal an event for " + j2 + " " + timeUnit.toString().toLowerCase() + " and has been terminated.";
    }

    /* renamed from: e */
    public static RuntimeException m31821e(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }
}
