package io.reactivex.android.schedulers;

import android.os.Handler;
import android.os.Looper;
import io.reactivex.Scheduler;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class AndroidSchedulers {

    /* renamed from: a */
    public static final Scheduler f59589a;

    public static final class MainHolder {

        /* renamed from: a */
        public static final Scheduler f59590a = new HandlerScheduler(new Handler(Looper.getMainLooper()), false);
    }

    static {
        try {
            Scheduler scheduler = (Scheduler) new Callable<Scheduler>() { // from class: io.reactivex.android.schedulers.AndroidSchedulers.1
                @Override // java.util.concurrent.Callable
                public Scheduler call() throws Exception {
                    return MainHolder.f59590a;
                }
            }.call();
            if (scheduler == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            f59589a = scheduler;
        } catch (Throwable th) {
            throw ExceptionHelper.m31821e(th);
        }
    }

    public AndroidSchedulers() {
        throw new AssertionError("No instances.");
    }

    /* renamed from: a */
    public static Scheduler m31390a() {
        Scheduler scheduler = f59589a;
        Objects.requireNonNull(scheduler, "scheduler == null");
        return scheduler;
    }
}
