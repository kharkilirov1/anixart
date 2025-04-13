package com.yandex.metrica.impl.p023ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.IMetricaService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.x1 */
/* loaded from: classes2.dex */
public class C4405x1 {

    /* renamed from: j */
    public static final long f46912j = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a */
    private final Context f46913a;

    /* renamed from: b */
    private final InterfaceExecutorC4297sn f46914b;

    /* renamed from: c */
    private boolean f46915c;

    /* renamed from: d */
    private final List<c> f46916d;

    /* renamed from: e */
    private IMetricaService f46917e;

    /* renamed from: f */
    private final Object f46918f;

    /* renamed from: g */
    @NonNull
    private final C3433L1 f46919g;

    /* renamed from: h */
    private final Runnable f46920h;

    /* renamed from: i */
    private final ServiceConnection f46921i;

    /* renamed from: com.yandex.metrica.impl.ob.x1$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4405x1.m21126a(C4405x1.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.x1$b */
    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (C4405x1.this) {
                C4405x1.this.f46917e = IMetricaService.AbstractBinderC3080a.m17768i(iBinder);
            }
            C4405x1.m21127b(C4405x1.this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            synchronized (C4405x1.this) {
                C4405x1.this.f46917e = null;
            }
            C4405x1.m21128c(C4405x1.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.x1$c */
    public interface c {
        void onServiceConnected();

        void onServiceDisconnected();
    }

    public C4405x1(Context context, InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        this(context, interfaceExecutorC4297sn, C3755Y.m19410g().m19418i());
    }

    /* renamed from: c */
    public static void m21128c(C4405x1 c4405x1) {
        Iterator<c> it = c4405x1.f46916d.iterator();
        while (it.hasNext()) {
            it.next().onServiceDisconnected();
        }
    }

    /* renamed from: b */
    public synchronized void m21131b() {
        if (this.f46917e == null) {
            Intent m18186b = C3334H2.m18186b(this.f46913a);
            try {
                this.f46919g.m18474a(this.f46913a);
                this.f46913a.bindService(m18186b, this.f46921i, 1);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    public synchronized IMetricaService m21133d() {
        return this.f46917e;
    }

    /* renamed from: e */
    public synchronized boolean m21134e() {
        return this.f46917e != null;
    }

    /* renamed from: f */
    public void m21135f() {
        synchronized (this.f46918f) {
            ((C4271rn) this.f46914b).m20672a(this.f46920h);
        }
    }

    /* renamed from: g */
    public void m21136g() {
        InterfaceExecutorC4297sn interfaceExecutorC4297sn = this.f46914b;
        synchronized (this.f46918f) {
            C4271rn c4271rn = (C4271rn) interfaceExecutorC4297sn;
            c4271rn.m20672a(this.f46920h);
            if (!this.f46915c) {
                c4271rn.m20673a(this.f46920h, f46912j);
            }
        }
    }

    /* renamed from: a */
    public static void m21126a(C4405x1 c4405x1) {
        synchronized (c4405x1) {
            if (c4405x1.f46913a != null && c4405x1.m21134e()) {
                try {
                    c4405x1.f46917e = null;
                    c4405x1.f46913a.unbindService(c4405x1.f46921i);
                } catch (Throwable unused) {
                }
            }
            c4405x1.f46917e = null;
            Iterator<c> it = c4405x1.f46916d.iterator();
            while (it.hasNext()) {
                it.next().onServiceDisconnected();
            }
        }
    }

    @VisibleForTesting
    public C4405x1(@NonNull Context context, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull C3433L1 c3433l1) {
        this.f46916d = new CopyOnWriteArrayList();
        this.f46917e = null;
        this.f46918f = new Object();
        this.f46920h = new a();
        this.f46921i = new b();
        this.f46913a = context.getApplicationContext();
        this.f46914b = interfaceExecutorC4297sn;
        this.f46915c = false;
        this.f46919g = c3433l1;
    }

    /* renamed from: c */
    public void m21132c() {
        synchronized (this.f46918f) {
            this.f46915c = true;
            m21135f();
        }
    }

    /* renamed from: b */
    public static void m21127b(C4405x1 c4405x1) {
        Iterator<c> it = c4405x1.f46916d.iterator();
        while (it.hasNext()) {
            it.next().onServiceConnected();
        }
    }

    /* renamed from: a */
    public void m21130a(c cVar) {
        this.f46916d.add(cVar);
    }

    /* renamed from: a */
    public void m21129a() {
        synchronized (this.f46918f) {
            this.f46915c = false;
            m21136g();
        }
    }
}
