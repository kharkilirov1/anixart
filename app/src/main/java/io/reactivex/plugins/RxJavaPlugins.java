package io.reactivex.plugins;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class RxJavaPlugins {
    public RxJavaPlugins() {
        throw new IllegalStateException("No instances!");
    }

    @NonNull
    /* renamed from: a */
    public static Scheduler m31847a(@NonNull Callable<Scheduler> callable) {
        try {
            Scheduler call = callable.call();
            Objects.requireNonNull(call, "Scheduler Callable result can't be null");
            return call;
        } catch (Throwable th) {
            throw ExceptionHelper.m31821e(th);
        }
    }

    /* renamed from: b */
    public static void m31848b(@NonNull Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else {
            boolean z = true;
            if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
                z = false;
            }
            if (!z) {
                th = new UndeliverableException(th);
            }
        }
        th.printStackTrace();
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
