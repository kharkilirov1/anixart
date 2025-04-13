package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class l80 {

    /* renamed from: d */
    public static final C5383b f52282d;

    /* renamed from: e */
    public static final C5383b f52283e;

    /* renamed from: a */
    private final ExecutorService f52284a;

    /* renamed from: b */
    @Nullable
    private HandlerC5384c<? extends InterfaceC5385d> f52285b;

    /* renamed from: c */
    @Nullable
    private IOException f52286c;

    /* renamed from: com.yandex.mobile.ads.impl.l80$a */
    public interface InterfaceC5382a<T extends InterfaceC5385d> {
        /* renamed from: a */
        C5383b mo26372a(T t, long j2, long j3, IOException iOException, int i2);

        /* renamed from: a */
        void mo26373a(T t, long j2, long j3);

        /* renamed from: a */
        void mo26374a(T t, long j2, long j3, boolean z);
    }

    /* renamed from: com.yandex.mobile.ads.impl.l80$b */
    public static final class C5383b {

        /* renamed from: a */
        private final int f52287a;

        /* renamed from: b */
        private final long f52288b;

        public /* synthetic */ C5383b(int i2, long j2, int i3) {
            this(i2, j2);
        }

        private C5383b(int i2, long j2) {
            this.f52287a = i2;
            this.f52288b = j2;
        }

        /* renamed from: a */
        public final boolean m26377a() {
            int i2 = this.f52287a;
            return i2 == 0 || i2 == 1;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.l80$d */
    public interface InterfaceC5385d {
        /* renamed from: a */
        void mo26381a() throws IOException;

        /* renamed from: b */
        void mo26382b();
    }

    /* renamed from: com.yandex.mobile.ads.impl.l80$e */
    public interface InterfaceC5386e {
        /* renamed from: b */
        void mo26383b();
    }

    /* renamed from: com.yandex.mobile.ads.impl.l80$f */
    public static final class RunnableC5387f implements Runnable {

        /* renamed from: b */
        private final InterfaceC5386e f52299b;

        public RunnableC5387f(InterfaceC5386e interfaceC5386e) {
            this.f52299b = interfaceC5386e;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f52299b.mo26383b();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.l80$g */
    public static final class C5388g extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C5388g(java.lang.Throwable r3) {
            /*
                r2 = this;
                java.lang.String r0 = "Unexpected "
                java.lang.StringBuilder r0 = com.yandex.mobile.ads.impl.l60.m26356a(r0)
                java.lang.Class r1 = r3.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.l80.C5388g.<init>(java.lang.Throwable):void");
        }
    }

    static {
        long j2 = -9223372036854775807L;
        int i2 = 0;
        f52282d = new C5383b(2, j2, i2);
        f52283e = new C5383b(3, j2, i2);
    }

    public l80(String str) {
        this.f52284a = s91.m28128c("ExoPlayer:Loader:" + str);
    }

    /* renamed from: c */
    public final boolean m26370c() {
        return this.f52286c != null;
    }

    /* renamed from: d */
    public final boolean m26371d() {
        return this.f52285b != null;
    }

    @SuppressLint
    /* renamed from: com.yandex.mobile.ads.impl.l80$c */
    public final class HandlerC5384c<T extends InterfaceC5385d> extends Handler implements Runnable {

        /* renamed from: b */
        public final int f52289b;

        /* renamed from: c */
        private final T f52290c;

        /* renamed from: d */
        private final long f52291d;

        /* renamed from: e */
        @Nullable
        private InterfaceC5382a<T> f52292e;

        /* renamed from: f */
        @Nullable
        private IOException f52293f;

        /* renamed from: g */
        private int f52294g;

        /* renamed from: h */
        @Nullable
        private Thread f52295h;

        /* renamed from: i */
        private boolean f52296i;

        /* renamed from: j */
        private volatile boolean f52297j;

        public HandlerC5384c(Looper looper, T t, InterfaceC5382a<T> interfaceC5382a, int i2, long j2) {
            super(looper);
            this.f52290c = t;
            this.f52292e = interfaceC5382a;
            this.f52289b = i2;
            this.f52291d = j2;
        }

        /* renamed from: a */
        public final void m26378a(int i2) throws IOException {
            IOException iOException = this.f52293f;
            if (iOException != null && this.f52294g > i2) {
                throw iOException;
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.f52297j) {
                return;
            }
            int i2 = message.what;
            if (i2 == 0) {
                this.f52293f = null;
                ExecutorService executorService = l80.this.f52284a;
                HandlerC5384c handlerC5384c = l80.this.f52285b;
                Objects.requireNonNull(handlerC5384c);
                executorService.execute(handlerC5384c);
                return;
            }
            if (i2 == 3) {
                throw ((Error) message.obj);
            }
            l80.this.f52285b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.f52291d;
            InterfaceC5382a<T> interfaceC5382a = this.f52292e;
            Objects.requireNonNull(interfaceC5382a);
            if (this.f52296i) {
                interfaceC5382a.mo26374a(this.f52290c, elapsedRealtime, j2, false);
                return;
            }
            int i3 = message.what;
            if (i3 == 1) {
                try {
                    interfaceC5382a.mo26373a(this.f52290c, elapsedRealtime, j2);
                    return;
                } catch (RuntimeException e2) {
                    d90.m23838a("LoadTask", "Unexpected exception handling load completed", e2);
                    l80.this.f52286c = new C5388g(e2);
                    return;
                }
            }
            if (i3 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f52293f = iOException;
            int i4 = this.f52294g + 1;
            this.f52294g = i4;
            C5383b mo26372a = interfaceC5382a.mo26372a(this.f52290c, elapsedRealtime, j2, iOException, i4);
            if (mo26372a.f52287a == 3) {
                l80.this.f52286c = this.f52293f;
            } else if (mo26372a.f52287a != 2) {
                if (mo26372a.f52287a == 1) {
                    this.f52294g = 1;
                }
                m26379a(mo26372a.f52288b != -9223372036854775807L ? mo26372a.f52288b : Math.min((this.f52294g - 1) * 1000, 5000));
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = !this.f52296i;
                    this.f52295h = Thread.currentThread();
                }
                if (z) {
                    s61.m28074a("load:" + this.f52290c.getClass().getSimpleName());
                    try {
                        this.f52290c.mo26381a();
                        s61.m28073a();
                    } catch (Throwable th) {
                        s61.m28073a();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f52295h = null;
                    Thread.interrupted();
                }
                if (this.f52297j) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e2) {
                if (this.f52297j) {
                    return;
                }
                obtainMessage(2, e2).sendToTarget();
            } catch (OutOfMemoryError e3) {
                if (this.f52297j) {
                    return;
                }
                d90.m23838a("LoadTask", "OutOfMemory error loading stream", e3);
                obtainMessage(2, new C5388g(e3)).sendToTarget();
            } catch (Error e4) {
                if (!this.f52297j) {
                    d90.m23838a("LoadTask", "Unexpected error loading stream", e4);
                    obtainMessage(3, e4).sendToTarget();
                }
                throw e4;
            } catch (Exception e5) {
                if (this.f52297j) {
                    return;
                }
                d90.m23838a("LoadTask", "Unexpected exception loading stream", e5);
                obtainMessage(2, new C5388g(e5)).sendToTarget();
            }
        }

        /* renamed from: a */
        public final void m26379a(long j2) {
            C5220ia.m25476b(l80.this.f52285b == null);
            l80.this.f52285b = this;
            if (j2 > 0) {
                sendEmptyMessageDelayed(0, j2);
                return;
            }
            this.f52293f = null;
            ExecutorService executorService = l80.this.f52284a;
            HandlerC5384c handlerC5384c = l80.this.f52285b;
            Objects.requireNonNull(handlerC5384c);
            executorService.execute(handlerC5384c);
        }

        /* renamed from: a */
        public final void m26380a(boolean z) {
            this.f52297j = z;
            this.f52293f = null;
            if (hasMessages(0)) {
                this.f52296i = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f52296i = true;
                    this.f52290c.mo26382b();
                    Thread thread = this.f52295h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                l80.this.f52285b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                InterfaceC5382a<T> interfaceC5382a = this.f52292e;
                Objects.requireNonNull(interfaceC5382a);
                interfaceC5382a.mo26374a(this.f52290c, elapsedRealtime, elapsedRealtime - this.f52291d, true);
                this.f52292e = null;
            }
        }
    }

    /* renamed from: b */
    public final void m26369b() {
        this.f52286c = null;
    }

    /* renamed from: a */
    public static C5383b m26360a(long j2, boolean z) {
        return new C5383b(z ? 1 : 0, j2, 0);
    }

    /* renamed from: a */
    public final <T extends InterfaceC5385d> long m26365a(T t, InterfaceC5382a<T> interfaceC5382a, int i2) {
        Looper looper = (Looper) C5220ia.m25474b(Looper.myLooper());
        this.f52286c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC5384c(looper, t, interfaceC5382a, i2, elapsedRealtime).m26379a(0L);
        return elapsedRealtime;
    }

    /* renamed from: a */
    public final void m26366a() {
        ((HandlerC5384c) C5220ia.m25474b(this.f52285b)).m26380a(false);
    }

    /* renamed from: a */
    public final void m26368a(@Nullable InterfaceC5386e interfaceC5386e) {
        HandlerC5384c<? extends InterfaceC5385d> handlerC5384c = this.f52285b;
        if (handlerC5384c != null) {
            handlerC5384c.m26380a(true);
        }
        if (interfaceC5386e != null) {
            this.f52284a.execute(new RunnableC5387f(interfaceC5386e));
        }
        this.f52284a.shutdown();
    }

    /* renamed from: a */
    public final void m26367a(int i2) throws IOException {
        IOException iOException = this.f52286c;
        if (iOException == null) {
            HandlerC5384c<? extends InterfaceC5385d> handlerC5384c = this.f52285b;
            if (handlerC5384c != null) {
                if (i2 == Integer.MIN_VALUE) {
                    i2 = handlerC5384c.f52289b;
                }
                handlerC5384c.m26378a(i2);
                return;
            }
            return;
        }
        throw iOException;
    }
}
