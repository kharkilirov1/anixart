package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class HalfSerializer {
    public HalfSerializer() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static void m31822a(Observer<?> observer, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable m31818b = ExceptionHelper.m31818b(atomicThrowable);
            if (m31818b != null) {
                observer.onError(m31818b);
            } else {
                observer.onComplete();
            }
        }
    }

    /* renamed from: b */
    public static void m31823b(Subscriber<?> subscriber, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable m31818b = ExceptionHelper.m31818b(atomicThrowable);
            if (m31818b != null) {
                subscriber.onError(m31818b);
            } else {
                subscriber.onComplete();
            }
        }
    }

    /* renamed from: c */
    public static void m31824c(Observer<?> observer, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!ExceptionHelper.m31817a(atomicThrowable, th)) {
            RxJavaPlugins.m31848b(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            observer.onError(ExceptionHelper.m31818b(atomicThrowable));
        }
    }

    /* renamed from: d */
    public static void m31825d(Subscriber<?> subscriber, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!ExceptionHelper.m31817a(atomicThrowable, th)) {
            RxJavaPlugins.m31848b(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            subscriber.onError(ExceptionHelper.m31818b(atomicThrowable));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static <T> void m31826e(Observer<? super T> observer, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            observer.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable m31818b = ExceptionHelper.m31818b(atomicThrowable);
                if (m31818b != null) {
                    observer.onError(m31818b);
                } else {
                    observer.onComplete();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static <T> void m31827f(Subscriber<? super T> subscriber, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            subscriber.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable m31818b = ExceptionHelper.m31818b(atomicThrowable);
                if (m31818b != null) {
                    subscriber.onError(m31818b);
                } else {
                    subscriber.onComplete();
                }
            }
        }
    }
}
