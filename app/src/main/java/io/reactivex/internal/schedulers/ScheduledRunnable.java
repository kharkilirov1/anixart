package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, Disposable {

    /* renamed from: c */
    public static final Object f62675c = new Object();

    /* renamed from: d */
    public static final Object f62676d = new Object();

    /* renamed from: e */
    public static final Object f62677e = new Object();

    /* renamed from: f */
    public static final Object f62678f = new Object();

    /* renamed from: b */
    public final Runnable f62679b;

    public ScheduledRunnable(Runnable runnable, DisposableContainer disposableContainer) {
        super(3);
        this.f62679b = runnable;
        lazySet(0, disposableContainer);
    }

    /* renamed from: a */
    public void m31772a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f62678f) {
                return;
            }
            if (obj == f62676d) {
                future.cancel(false);
                return;
            } else if (obj == f62677e) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f62678f || obj5 == (obj3 = f62676d) || obj5 == (obj4 = f62677e)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == f62678f || obj == (obj2 = f62675c) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((DisposableContainer) obj).mo31394c(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean compareAndSet;
        Object obj4;
        Object obj5;
        lazySet(2, Thread.currentThread());
        try {
            this.f62679b.run();
        } finally {
            try {
                lazySet(2, null);
                obj4 = get(0);
                if (obj4 != f62675c) {
                    ((DisposableContainer) obj4).mo31394c(this);
                }
                do {
                    obj5 = get(1);
                    if (obj5 != f62676d) {
                        return;
                    } else {
                        return;
                    }
                } while (!compareAndSet(1, obj5, f62678f));
            } catch (Throwable th) {
                do {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    }
                } while (!compareAndSet);
            }
        }
        lazySet(2, null);
        obj4 = get(0);
        if (obj4 != f62675c && compareAndSet(0, obj4, f62678f) && obj4 != null) {
            ((DisposableContainer) obj4).mo31394c(this);
        }
        do {
            obj5 = get(1);
            if (obj5 != f62676d || obj5 == f62677e) {
                return;
            }
        } while (!compareAndSet(1, obj5, f62678f));
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        Object obj = get(0);
        return obj == f62675c || obj == f62678f;
    }
}
