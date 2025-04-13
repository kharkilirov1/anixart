package com.google.common.util.concurrent;

import androidx.room.util.C0576a;
import com.google.common.annotations.GwtCompatible;
import com.google.j2objc.annotations.ReflectionSupport;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@ReflectionSupport
@GwtCompatible
/* loaded from: classes2.dex */
abstract class InterruptibleTask<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: b */
    public static final Runnable f22192b = new DoNothingRunnable(null);

    /* renamed from: c */
    public static final Runnable f22193c = new DoNothingRunnable(null);

    /* renamed from: d */
    public static final Runnable f22194d = new DoNothingRunnable(null);

    public static final class DoNothingRunnable implements Runnable {
        public DoNothingRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public DoNothingRunnable(C20111 c20111) {
        }
    }

    /* renamed from: a */
    public abstract void mo12179a(@NullableDecl T t, @NullableDecl Throwable th);

    /* renamed from: b */
    public final void m12197b() {
        Runnable runnable = get();
        if ((runnable instanceof Thread) && compareAndSet(runnable, f22193c)) {
            try {
                ((Thread) runnable).interrupt();
            } finally {
                if (getAndSet(f22192b) == f22194d) {
                    LockSupport.unpark((Thread) runnable);
                }
            }
        }
    }

    /* renamed from: c */
    public abstract boolean mo12180c();

    /* renamed from: d */
    public abstract T mo12177d() throws Exception;

    /* renamed from: e */
    public abstract String mo12178e();

    @Override // java.lang.Runnable
    public final void run() {
        T mo12177d;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            boolean z = !mo12180c();
            if (z) {
                try {
                    mo12177d = mo12177d();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, f22192b)) {
                        Runnable runnable = get();
                        boolean z2 = false;
                        int i2 = 0;
                        while (true) {
                            Runnable runnable2 = f22193c;
                            if (runnable != runnable2 && runnable != f22194d) {
                                break;
                            }
                            i2++;
                            if (i2 > 1000) {
                                Runnable runnable3 = f22194d;
                                if (runnable == runnable3 || compareAndSet(runnable2, runnable3)) {
                                    z2 = Thread.interrupted() || z2;
                                    LockSupport.park(this);
                                }
                            } else {
                                Thread.yield();
                            }
                            runnable = get();
                        }
                        if (z2) {
                            currentThread.interrupt();
                        }
                    }
                    if (z) {
                        mo12179a(null, th);
                        return;
                    }
                    return;
                }
            } else {
                mo12177d = null;
            }
            if (!compareAndSet(currentThread, f22192b)) {
                Runnable runnable4 = get();
                boolean z3 = false;
                int i3 = 0;
                while (true) {
                    Runnable runnable5 = f22193c;
                    if (runnable4 != runnable5 && runnable4 != f22194d) {
                        break;
                    }
                    i3++;
                    if (i3 > 1000) {
                        Runnable runnable6 = f22194d;
                        if (runnable4 == runnable6 || compareAndSet(runnable5, runnable6)) {
                            z3 = Thread.interrupted() || z3;
                            LockSupport.park(this);
                        }
                    } else {
                        Thread.yield();
                    }
                    runnable4 = get();
                }
                if (z3) {
                    currentThread.interrupt();
                }
            }
            if (z) {
                mo12179a(mo12177d, null);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == f22192b) {
            str = "running=[DONE]";
        } else if (runnable == f22193c) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            str = C0576a.m4115n(C0576a.m4106e(name, 21), "running=[RUNNING ON ", name, "]");
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String mo12178e = mo12178e();
        return C0576a.m4115n(C0576a.m4106e(mo12178e, C0576a.m4106e(str, 2)), str, ", ", mo12178e);
    }
}
