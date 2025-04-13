package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.Thread;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.yandex.metrica.impl.ob.P1 */
/* loaded from: classes2.dex */
class C3533P1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: f */
    private static final AtomicBoolean f43611f = new AtomicBoolean();

    /* renamed from: a */
    @NonNull
    private final List<InterfaceC4021i7> f43612a;

    /* renamed from: b */
    @Nullable
    private final Thread.UncaughtExceptionHandler f43613b;

    /* renamed from: c */
    @NonNull
    private final C3260E3 f43614c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC3354Hm f43615d;

    /* renamed from: e */
    @NonNull
    private final C3210C3 f43616e;

    @VisibleForTesting
    public C3533P1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, @NonNull List<InterfaceC4021i7> list, @NonNull InterfaceC3354Hm interfaceC3354Hm, @NonNull C3210C3 c3210c3, @NonNull C3260E3 c3260e3) {
        this.f43612a = list;
        this.f43613b = uncaughtExceptionHandler;
        this.f43615d = interfaceC3354Hm;
        this.f43616e = c3210c3;
        this.f43614c = c3260e3;
    }

    /* renamed from: a */
    public static boolean m18724a() {
        return f43611f.get();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        try {
            f43611f.set(true);
            C3917e7 c3917e7 = new C3917e7(this.f43616e.mo17917a(thread), this.f43614c.m17999a(thread), ((C3254Dm) this.f43615d).m17984b());
            Iterator<InterfaceC4021i7> it = this.f43612a.iterator();
            while (it.hasNext()) {
                it.next().mo19951a(th, c3917e7);
            }
        } finally {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f43613b;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
