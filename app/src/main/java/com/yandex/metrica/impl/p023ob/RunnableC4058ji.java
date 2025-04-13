package com.yandex.metrica.impl.p023ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.MetricaService;
import com.yandex.metrica.impl.p023ob.C3457M0;
import com.yandex.metrica.impl.p023ob.InterfaceC3954fi;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.ji */
/* loaded from: classes2.dex */
public class RunnableC4058ji implements Runnable, InterfaceC3980gi {

    /* renamed from: a */
    private final ServiceConnection f45460a;

    /* renamed from: b */
    private final Handler f45461b;

    /* renamed from: c */
    @NonNull
    private final Runnable f45462c;

    /* renamed from: d */
    private final HashMap<String, InterfaceC3850bi> f45463d;

    /* renamed from: e */
    private final Context f45464e;

    /* renamed from: f */
    private volatile boolean f45465f;

    /* renamed from: g */
    @Nullable
    private ServerSocket f45466g;

    /* renamed from: h */
    @Nullable
    private C3275Ei f45467h;

    /* renamed from: i */
    @Nullable
    private C4375vn f45468i;

    /* renamed from: j */
    @NonNull
    private final InterfaceC3706W0 f45469j;

    /* renamed from: k */
    @NonNull
    private final C3457M0.d f45470k;

    /* renamed from: l */
    @NonNull
    private final C3798Zh f45471l;

    /* renamed from: m */
    @NonNull
    private final C3798Zh f45472m;

    /* renamed from: n */
    @NonNull
    private final InterfaceC3954fi f45473n;

    /* renamed from: o */
    @NonNull
    private final C4479zn f45474o;

    /* renamed from: p */
    @NonNull
    private final InterfaceC3703Vm<C3275Ei, List<Integer>> f45475p;

    /* renamed from: q */
    @NonNull
    private final C3773Yh f45476q;

    /* renamed from: r */
    @NonNull
    private final C4032ii f45477r;

    /* renamed from: s */
    private final String f45478s;

    /* renamed from: com.yandex.metrica.impl.ob.ji$a */
    public class a implements ServiceConnection {
        public a(RunnableC4058ji runnableC4058ji) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ji$b */
    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 100) {
                return;
            }
            RunnableC4058ji.this.m20157c();
            try {
                RunnableC4058ji.this.f45464e.unbindService(RunnableC4058ji.this.f45460a);
            } catch (Throwable unused) {
                RunnableC4058ji.this.f45469j.reportEvent("socket_unbind_has_thrown_exception");
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ji$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RunnableC4058ji runnableC4058ji = RunnableC4058ji.this;
            RunnableC4058ji.m20138a(runnableC4058ji, runnableC4058ji.f45467h);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ji$d */
    public class d extends HashMap<String, InterfaceC3850bi> {

        /* renamed from: com.yandex.metrica.impl.ob.ji$d$a */
        public class a implements InterfaceC3850bi {
            public a() {
            }

            @Override // com.yandex.metrica.impl.p023ob.InterfaceC3850bi
            @NonNull
            /* renamed from: a */
            public AbstractC3824ai mo19661a(@NonNull Socket socket, @NonNull Uri uri, @NonNull C4006hi c4006hi) {
                RunnableC4058ji runnableC4058ji = RunnableC4058ji.this;
                return new C3574Qh(socket, uri, runnableC4058ji, runnableC4058ji.f45467h, RunnableC4058ji.this.f45476q.m19481a(), c4006hi);
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.ji$d$b */
        public class b implements InterfaceC3850bi {
            public b() {
            }

            @Override // com.yandex.metrica.impl.p023ob.InterfaceC3850bi
            @NonNull
            /* renamed from: a */
            public AbstractC3824ai mo19661a(@NonNull Socket socket, @NonNull Uri uri, @NonNull C4006hi c4006hi) {
                RunnableC4058ji runnableC4058ji = RunnableC4058ji.this;
                return new C3902di(socket, uri, runnableC4058ji, runnableC4058ji.f45467h, c4006hi);
            }
        }

        public d() {
            put("p", new a());
            put("i", new b());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ji$e */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RunnableC4058ji.m20146f(RunnableC4058ji.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ji$f */
    public enum f {
        OK,
        SHOULD_RETRY,
        ORDINARY_FAIL
    }

    public RunnableC4058ji(@NonNull Context context, @NonNull C3575Qi c3575Qi, @NonNull InterfaceC3954fi interfaceC3954fi, @NonNull InterfaceC3703Vm<C3275Ei, List<Integer>> interfaceC3703Vm, @NonNull C3723Wh c3723Wh, @NonNull C3723Wh c3723Wh2, @NonNull String str) {
        this(context, c3575Qi, C3532P0.m18696i().m18706h(), C3532P0.m18696i().m18716s(), C3524Oh.m18679a(), new C3798Zh("open", c3723Wh), new C3798Zh("port_already_in_use", c3723Wh2), new C3773Yh(context, c3575Qi), new C4032ii(), interfaceC3954fi, interfaceC3703Vm, str);
    }

    /* renamed from: f */
    public static void m20146f(RunnableC4058ji runnableC4058ji) {
        Objects.requireNonNull(runnableC4058ji);
        Intent intent = new Intent(runnableC4058ji.f45464e, (Class<?>) MetricaService.class);
        intent.setAction("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER");
        try {
            if (!runnableC4058ji.f45464e.bindService(intent, runnableC4058ji.f45460a, 1)) {
                runnableC4058ji.f45469j.reportEvent("socket_bind_has_failed");
            }
        } catch (Throwable unused) {
            runnableC4058ji.f45469j.reportEvent("socket_bind_has_thrown_exception");
        }
        C4375vn m21317b = runnableC4058ji.f45474o.m21317b(runnableC4058ji);
        runnableC4058ji.f45468i = m21317b;
        m21317b.start();
        runnableC4058ji.f45477r.m20064d();
    }

    @Override // java.lang.Runnable
    public void run() {
        Socket socket;
        ServerSocket serverSocket;
        synchronized (this) {
            C3275Ei c3275Ei = this.f45467h;
            if (c3275Ei != null && m20135a(c3275Ei) == f.SHOULD_RETRY) {
                this.f45465f = false;
                long j2 = this.f45467h.f42824j;
                C4271rn c4271rn = (C4271rn) this.f45474o.m21316b();
                c4271rn.m20672a(this.f45462c);
                c4271rn.m20674a(this.f45462c, j2, TimeUnit.SECONDS);
                return;
            }
            if (C3658U2.m19211a(26)) {
                TrafficStats.setThreadStatsTag(40230);
            }
            if (this.f45466g != null) {
                while (this.f45465f) {
                    synchronized (this) {
                        socket = null;
                        serverSocket = this.f45465f ? this.f45466g : null;
                    }
                    if (serverSocket != null) {
                        try {
                            socket = serverSocket.accept();
                            C4006hi c4006hi = new C4006hi(new C3504Nm(), new C3479Mm());
                            if (C3658U2.m19211a(26)) {
                                TrafficStats.tagSocket(socket);
                            }
                            new C3876ci(socket, this, this.f45463d, c4006hi).m19680a();
                            if (socket == null) {
                            }
                        } catch (Throwable unused) {
                            if (socket == null) {
                            }
                        }
                        try {
                            socket.close();
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private synchronized void m20143c(@NonNull C3275Ei c3275Ei) {
        if (!this.f45465f && this.f45470k.m18547a(c3275Ei.f42820f)) {
            this.f45465f = true;
        }
    }

    /* renamed from: a */
    public void m20147a() {
        this.f45461b.removeMessages(100);
        this.f45477r.m20065e();
    }

    /* renamed from: b */
    public synchronized void m20154b() {
        if (this.f45465f) {
            m20147a();
            Handler handler = this.f45461b;
            handler.sendMessageDelayed(handler.obtainMessage(100), TimeUnit.SECONDS.toMillis(this.f45467h.f42815a));
            this.f45477r.m20063c();
        }
    }

    /* renamed from: a */
    public synchronized void m20148a(@NonNull C3575Qi c3575Qi) {
        C3275Ei m18832M = c3575Qi.m18832M();
        synchronized (this) {
            if (m18832M != null) {
                m20143c(m18832M);
            }
        }
    }

    @VisibleForTesting
    public RunnableC4058ji(@NonNull Context context, @NonNull C3575Qi c3575Qi, @NonNull C3457M0 c3457m0, @NonNull C4479zn c4479zn, @NonNull InterfaceC3706W0 interfaceC3706W0, @NonNull C3798Zh c3798Zh, @NonNull C3798Zh c3798Zh2, @NonNull C3773Yh c3773Yh, @NonNull C4032ii c4032ii, @NonNull InterfaceC3954fi interfaceC3954fi, @NonNull InterfaceC3703Vm<C3275Ei, List<Integer>> interfaceC3703Vm, @NonNull String str) {
        this.f45460a = new a(this);
        this.f45461b = new b(Looper.getMainLooper());
        this.f45462c = new c();
        this.f45463d = new d();
        this.f45464e = context;
        this.f45469j = interfaceC3706W0;
        this.f45471l = c3798Zh;
        this.f45472m = c3798Zh2;
        this.f45473n = interfaceC3954fi;
        this.f45475p = interfaceC3703Vm;
        this.f45474o = c4479zn;
        this.f45476q = c3773Yh;
        this.f45477r = c4032ii;
        String format = String.format("[YandexUID%sServer]", str);
        this.f45478s = format;
        this.f45470k = c3457m0.m18539a(new e(), c4479zn.m21316b(), format);
        m20141b(c3575Qi.m18832M());
        C3275Ei c3275Ei = this.f45467h;
        if (c3275Ei != null) {
            m20143c(c3275Ei);
        }
    }

    @VisibleForTesting
    /* renamed from: c */
    public synchronized void m20157c() {
        try {
            this.f45465f = false;
            C4375vn c4375vn = this.f45468i;
            if (c4375vn != null) {
                c4375vn.m21067d();
                this.f45468i = null;
            }
            ServerSocket serverSocket = this.f45466g;
            if (serverSocket != null) {
                serverSocket.close();
                this.f45466g = null;
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    public static void m20138a(RunnableC4058ji runnableC4058ji, C3275Ei c3275Ei) {
        synchronized (runnableC4058ji) {
            if (c3275Ei != null) {
                runnableC4058ji.m20143c(c3275Ei);
            }
        }
    }

    @NonNull
    /* renamed from: a */
    private synchronized f m20135a(@NonNull C3275Ei c3275Ei) {
        f fVar;
        Integer num;
        Throwable th;
        InterfaceC3954fi.a e2;
        Iterator<Integer> it = this.f45475p.mo17917a(c3275Ei).iterator();
        Integer num2 = null;
        fVar = f.ORDINARY_FAIL;
        while (this.f45466g == null && it.hasNext()) {
            try {
                num = it.next();
                if (num != null) {
                    try {
                        this.f45466g = this.f45473n.mo18990a(num.intValue());
                        fVar = f.OK;
                        this.f45471l.m19524a(this, num.intValue(), c3275Ei);
                    } catch (InterfaceC3954fi.a e3) {
                        e2 = e3;
                        String message = e2.getMessage();
                        Throwable cause = e2.getCause();
                        if (cause != null && message != null) {
                            Map<String, Object> m20137a = m20137a(num);
                            ((HashMap) m20137a).put("exception", Log.getStackTraceString(cause));
                            this.f45469j.reportEvent(m20140b(message), m20137a);
                        }
                        num2 = num;
                    } catch (BindException unused) {
                        num2 = num;
                        fVar = f.SHOULD_RETRY;
                        this.f45472m.m19524a(this, num2.intValue(), c3275Ei);
                    } catch (Throwable th2) {
                        th = th2;
                        Map<String, Object> m20137a2 = m20137a(num);
                        ((HashMap) m20137a2).put("exception", Log.getStackTraceString(th));
                        this.f45469j.reportEvent(m20140b("open_error"), m20137a2);
                        num2 = num;
                    }
                }
            } catch (InterfaceC3954fi.a e4) {
                num = num2;
                e2 = e4;
            } catch (BindException unused2) {
            } catch (Throwable th3) {
                num = num2;
                th = th3;
            }
            num2 = num;
        }
        return fVar;
    }

    /* renamed from: b */
    private void m20141b(@Nullable C3275Ei c3275Ei) {
        this.f45467h = c3275Ei;
        if (c3275Ei != null) {
            this.f45470k.m18545a(c3275Ei.f42819e);
        }
    }

    /* renamed from: b */
    public void m20155b(int i2, @NonNull C4006hi c4006hi) {
        this.f45469j.reportEvent(m20140b("sync_succeed"), m20136a(i2, c4006hi));
    }

    /* renamed from: b */
    public synchronized void m20156b(@NonNull C3575Qi c3575Qi) {
        this.f45476q.m19482a(c3575Qi);
        C3275Ei m18832M = c3575Qi.m18832M();
        if (m18832M != null) {
            this.f45467h = m18832M;
            this.f45470k.m18545a(m18832M.f42819e);
            m20143c(m18832M);
        } else {
            m20157c();
            m20141b((C3275Ei) null);
        }
    }

    /* renamed from: b */
    private String m20140b(@NonNull String str) {
        return C0000a.m14k("socket_", str);
    }

    /* renamed from: a */
    private Map<String, Object> m20137a(@Nullable Integer num) {
        HashMap hashMap = new HashMap();
        hashMap.put("port", num == null ? "" : String.valueOf(num));
        return hashMap;
    }

    /* renamed from: a */
    private Map<String, Object> m20136a(int i2, @NonNull C4006hi c4006hi) {
        Map<String, Object> m20137a = m20137a(Integer.valueOf(i2));
        HashMap hashMap = (HashMap) m20137a;
        hashMap.put("idle_interval", Double.valueOf(this.f45477r.m20062b()));
        hashMap.put("background_interval", Double.valueOf(this.f45477r.m20061a()));
        hashMap.put("request_read_time", Long.valueOf(c4006hi.m20021d()));
        hashMap.put("response_form_time", Long.valueOf(c4006hi.m20022e()));
        hashMap.put("response_send_time", Long.valueOf(c4006hi.m20023f()));
        return m20137a;
    }

    /* renamed from: a */
    public void m20151a(@NonNull String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("uri", str2);
        this.f45469j.reportEvent("socket_" + str, hashMap);
    }

    /* renamed from: a */
    public void m20149a(@NonNull String str) {
        this.f45469j.reportEvent(m20140b(str));
    }

    /* renamed from: a */
    public void m20152a(@NonNull String str, Throwable th) {
        this.f45469j.reportError(m20140b(str), th);
    }

    /* renamed from: a */
    public void m20150a(@NonNull String str, @Nullable Integer num) {
        this.f45469j.reportEvent(m20140b(str), m20137a(num));
    }

    /* renamed from: a */
    public void m20153a(@NonNull Map<String, Object> map, int i2, @NonNull C4006hi c4006hi) {
        Map<String, Object> m20136a = m20136a(i2, c4006hi);
        ((HashMap) m20136a).put("params", map);
        this.f45469j.reportEvent(m20140b("reversed_sync_succeed"), m20136a);
    }
}
