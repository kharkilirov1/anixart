package com.yandex.metrica.impl.p023ob;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.yandex.metrica.impl.ob.h */
/* loaded from: classes2.dex */
public class C3987h {

    /* renamed from: f */
    private static final long f45233f = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a */
    private final b f45234a;

    /* renamed from: b */
    private final Handler f45235b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final Thread f45236c = new c();

    /* renamed from: d */
    private final AtomicBoolean f45237d = new AtomicBoolean();

    /* renamed from: e */
    private final Runnable f45238e = new a();

    /* renamed from: com.yandex.metrica.impl.ob.h$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3987h.this.f45237d.set(true);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.h$b */
    public interface b {
        @WorkerThread
        /* renamed from: a */
        void mo19992a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.h$c */
    public class c extends Thread {
        public c() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z = false;
            int i2 = 0;
            while (!isInterrupted()) {
                if (!z) {
                    C3987h.this.f45237d.set(false);
                    C3987h.this.f45235b.post(C3987h.this.f45238e);
                    i2 = 0;
                }
                try {
                    Thread.sleep(C3987h.f45233f);
                    if (C3987h.this.f45237d.get()) {
                        z = false;
                    } else {
                        i2++;
                        if (i2 == 4 && !Debug.isDebuggerConnected()) {
                            C3987h.this.m19990b();
                        }
                        z = true;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    public C3987h(b bVar) {
        this.f45234a = bVar;
    }

    @VisibleForTesting
    /* renamed from: b */
    public void m19990b() {
        this.f45234a.mo19992a();
    }

    /* renamed from: c */
    public void m19991c() {
        try {
            this.f45236c.setName("CR-WatchDog");
        } catch (SecurityException unused) {
        }
        this.f45236c.start();
    }
}
