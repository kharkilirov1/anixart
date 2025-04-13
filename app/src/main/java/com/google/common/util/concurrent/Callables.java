package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Supplier;
import java.util.Objects;
import java.util.concurrent.Callable;

@GwtCompatible
/* loaded from: classes2.dex */
public final class Callables {

    /* renamed from: com.google.common.util.concurrent.Callables$1 */
    class CallableC19711 implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }
    }

    /* renamed from: com.google.common.util.concurrent.Callables$2 */
    class C19722 implements AsyncCallable<Object> {
    }

    /* renamed from: com.google.common.util.concurrent.Callables$3 */
    class CallableC19733 implements Callable<Object> {

        /* renamed from: b */
        public final /* synthetic */ Supplier f22132b;

        /* renamed from: c */
        public final /* synthetic */ Callable f22133c;

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            boolean m12174a = Callables.m12174a((String) this.f22132b.get(), currentThread);
            try {
                return this.f22133c.call();
            } finally {
                if (m12174a) {
                    Callables.m12174a(name, currentThread);
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m12174a(String str, Thread thread) {
        try {
            thread.setName(str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @GwtIncompatible
    /* renamed from: b */
    public static Runnable m12175b(final Runnable runnable, final Supplier<String> supplier) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(runnable);
        return new Runnable() { // from class: com.google.common.util.concurrent.Callables.4
            @Override // java.lang.Runnable
            public void run() {
                Thread currentThread = Thread.currentThread();
                String name = currentThread.getName();
                boolean m12174a = Callables.m12174a((String) Supplier.this.get(), currentThread);
                try {
                    runnable.run();
                } finally {
                    if (m12174a) {
                        Callables.m12174a(name, currentThread);
                    }
                }
            }
        };
    }
}
