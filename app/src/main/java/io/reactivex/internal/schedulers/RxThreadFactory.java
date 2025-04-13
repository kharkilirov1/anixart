package io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class RxThreadFactory extends AtomicLong implements ThreadFactory {

    /* renamed from: b */
    public final String f62672b;

    /* renamed from: c */
    public final int f62673c;

    /* renamed from: d */
    public final boolean f62674d;

    public static final class RxCustomThread extends Thread implements NonBlockingThread {
        public RxCustomThread(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public RxThreadFactory(String str) {
        this.f62672b = str;
        this.f62673c = 5;
        this.f62674d = false;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f62672b + '-' + incrementAndGet();
        Thread rxCustomThread = this.f62674d ? new RxCustomThread(runnable, str) : new Thread(runnable, str);
        rxCustomThread.setPriority(this.f62673c);
        rxCustomThread.setDaemon(true);
        return rxCustomThread;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return C0000a.m20q(C0000a.m24u("RxThreadFactory["), this.f62672b, "]");
    }

    public RxThreadFactory(String str, int i2) {
        this.f62672b = str;
        this.f62673c = i2;
        this.f62674d = false;
    }

    public RxThreadFactory(String str, int i2, boolean z) {
        this.f62672b = str;
        this.f62673c = i2;
        this.f62674d = z;
    }
}
