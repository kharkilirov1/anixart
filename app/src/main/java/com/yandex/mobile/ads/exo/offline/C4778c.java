package com.yandex.mobile.ads.exo.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.C1176a;
import com.swiftsoft.anixartd.p015ui.fragment.main.recommendation.C2722a;
import com.yandex.mobile.ads.exo.offline.C4776a;
import com.yandex.mobile.ads.exo.offline.InterfaceC4779d;
import com.yandex.mobile.ads.exo.scheduler.Requirements;
import com.yandex.mobile.ads.impl.C4809ag;
import com.yandex.mobile.ads.impl.C5220ia;
import com.yandex.mobile.ads.impl.C5352kq;
import com.yandex.mobile.ads.impl.C5450mn;
import com.yandex.mobile.ads.impl.InterfaceC4978dm;
import com.yandex.mobile.ads.impl.InterfaceC5298jq;
import com.yandex.mobile.ads.impl.InterfaceC5409lq;
import com.yandex.mobile.ads.impl.InterfaceC5970wf;
import com.yandex.mobile.ads.impl.d90;
import com.yandex.mobile.ads.impl.ki1;
import com.yandex.mobile.ads.impl.l60;
import com.yandex.mobile.ads.impl.ow0;
import com.yandex.mobile.ads.impl.qj1;
import com.yandex.mobile.ads.impl.s91;
import com.yandex.mobile.ads.impl.w31;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;

/* renamed from: com.yandex.mobile.ads.exo.offline.c */
/* loaded from: classes2.dex */
public final class C4778c {

    /* renamed from: j */
    public static final Requirements f48211j = new Requirements(1);

    /* renamed from: a */
    private final b f48212a;

    /* renamed from: b */
    private final CopyOnWriteArraySet<c> f48213b;

    /* renamed from: c */
    private int f48214c;

    /* renamed from: d */
    private boolean f48215d;

    /* renamed from: e */
    private int f48216e;

    /* renamed from: f */
    private int f48217f;

    /* renamed from: g */
    private int f48218g;

    /* renamed from: h */
    private boolean f48219h;

    /* renamed from: i */
    private List<C4777b> f48220i;

    /* renamed from: com.yandex.mobile.ads.exo.offline.c$a */
    public static final class a {

        /* renamed from: a */
        public final C4777b f48221a;

        /* renamed from: b */
        public final boolean f48222b;

        /* renamed from: c */
        public final List<C4777b> f48223c;

        public a(C4777b c4777b, boolean z, ArrayList arrayList, @Nullable Exception exc) {
            this.f48221a = c4777b;
            this.f48222b = z;
            this.f48223c = arrayList;
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.offline.c$c */
    public interface c {
        /* renamed from: a */
        void mo22309a(C4778c c4778c, C4777b c4777b);
    }

    /* renamed from: com.yandex.mobile.ads.exo.offline.c$d */
    public static class d extends Thread implements InterfaceC4779d.a {

        /* renamed from: b */
        private final DownloadRequest f48235b;

        /* renamed from: c */
        private final InterfaceC4779d f48236c;

        /* renamed from: d */
        private final C5352kq f48237d;

        /* renamed from: e */
        private final boolean f48238e;

        /* renamed from: f */
        private final int f48239f;

        /* renamed from: g */
        @Nullable
        private volatile b f48240g;

        /* renamed from: h */
        private volatile boolean f48241h;

        /* renamed from: i */
        @Nullable
        private Exception f48242i;

        /* renamed from: j */
        private long f48243j;

        public /* synthetic */ d(DownloadRequest downloadRequest, InterfaceC4779d interfaceC4779d, C5352kq c5352kq, boolean z, int i2, b bVar, int i3) {
            this(downloadRequest, interfaceC4779d, c5352kq, z, i2, bVar);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.f48238e) {
                    this.f48236c.remove();
                } else {
                    long j2 = -1;
                    int i2 = 0;
                    while (!this.f48241h) {
                        try {
                            this.f48236c.mo22316a(this);
                            break;
                        } catch (IOException e2) {
                            if (!this.f48241h) {
                                long j3 = this.f48237d.f52054a;
                                if (j3 != j2) {
                                    j2 = j3;
                                    i2 = 0;
                                }
                                i2++;
                                if (i2 > this.f48239f) {
                                    throw e2;
                                }
                                Thread.sleep(Math.min((i2 - 1) * 1000, 5000));
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e3) {
                this.f48242i = e3;
            }
            b bVar = this.f48240g;
            if (bVar != null) {
                bVar.obtainMessage(9, this).sendToTarget();
            }
        }

        private d(DownloadRequest downloadRequest, InterfaceC4779d interfaceC4779d, C5352kq c5352kq, boolean z, int i2, b bVar) {
            this.f48235b = downloadRequest;
            this.f48236c = interfaceC4779d;
            this.f48237d = c5352kq;
            this.f48238e = z;
            this.f48239f = i2;
            this.f48240g = bVar;
            this.f48243j = -1L;
        }

        /* renamed from: a */
        public final void m22315a(boolean z) {
            if (z) {
                this.f48240g = null;
            }
            if (this.f48241h) {
                return;
            }
            this.f48241h = true;
            this.f48236c.cancel();
            interrupt();
        }

        /* renamed from: a */
        public final void m22314a(long j2, long j3, float f2) {
            this.f48237d.f52054a = j3;
            this.f48237d.f52055b = f2;
            if (j2 != this.f48243j) {
                this.f48243j = j2;
                b bVar = this.f48240g;
                if (bVar != null) {
                    bVar.obtainMessage(10, (int) (j2 >> 32), (int) j2, this).sendToTarget();
                }
            }
        }
    }

    public C4778c(Context context, w31 w31Var, InterfaceC5970wf interfaceC5970wf, InterfaceC4978dm.a aVar, ExecutorService executorService) {
        this(context, new C4776a(w31Var), new C5450mn(new C4809ag.b().m22496a(interfaceC5970wf).m22495a(aVar), executorService));
    }

    /* renamed from: b */
    private boolean m22295b() {
        boolean z;
        if (!this.f48215d && this.f48218g != 0) {
            for (int i2 = 0; i2 < this.f48220i.size(); i2++) {
                if (this.f48220i.get(i2).f48204b == 0) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z2 = this.f48219h != z;
        this.f48219h = z;
        return z2;
    }

    /* renamed from: a */
    public final void m22299a(ki1 ki1Var) {
        this.f48213b.add(ki1Var);
    }

    /* renamed from: a */
    public final void m22298a(c cVar) {
        this.f48213b.remove(cVar);
    }

    /* renamed from: a */
    public final void m22297a(DownloadRequest downloadRequest) {
        this.f48214c++;
        this.f48212a.obtainMessage(6, 0, 0, downloadRequest).sendToTarget();
    }

    public C4778c(Context context, C4776a c4776a, C5450mn c5450mn) {
        context.getApplicationContext();
        this.f48216e = 3;
        this.f48217f = 5;
        this.f48215d = true;
        this.f48220i = Collections.emptyList();
        this.f48213b = new CopyOnWriteArraySet<>();
        Handler m28121b = s91.m28121b(new C1176a(this, 1));
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        b bVar = new b(handlerThread, c4776a, c5450mn, m28121b, this.f48216e, this.f48217f, this.f48215d);
        this.f48212a = bVar;
        int m27121a = new ow0(context, new C2722a(this, 7)).m27121a();
        this.f48218g = m27121a;
        this.f48214c = 1;
        bVar.obtainMessage(0, m27121a, 0).sendToTarget();
    }

    /* renamed from: a */
    public final void m22300a(String str) {
        this.f48214c++;
        this.f48212a.obtainMessage(7, str).sendToTarget();
    }

    /* renamed from: a */
    public final void m22296a() {
        if (this.f48215d) {
            this.f48215d = false;
            this.f48214c++;
            this.f48212a.obtainMessage(1, 0, 0).sendToTarget();
            boolean m22295b = m22295b();
            Iterator<c> it = this.f48213b.iterator();
            while (it.hasNext()) {
                Objects.requireNonNull(it.next());
            }
            if (m22295b) {
                Iterator<c> it2 = this.f48213b.iterator();
                while (it2.hasNext()) {
                    Objects.requireNonNull(it2.next());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m22291a(ow0 ow0Var, int i2) {
        Objects.requireNonNull(ow0Var);
        if (this.f48218g != i2) {
            this.f48218g = i2;
            this.f48214c++;
            this.f48212a.obtainMessage(2, i2, 0).sendToTarget();
        }
        boolean m22295b = m22295b();
        Iterator<c> it = this.f48213b.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
        }
        if (m22295b) {
            Iterator<c> it2 = this.f48213b.iterator();
            while (it2.hasNext()) {
                Objects.requireNonNull(it2.next());
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.offline.c$b */
    public static final class b extends Handler {

        /* renamed from: a */
        private final HandlerThread f48224a;

        /* renamed from: b */
        private final qj1 f48225b;

        /* renamed from: c */
        private final InterfaceC5409lq f48226c;

        /* renamed from: d */
        private final Handler f48227d;

        /* renamed from: e */
        private final ArrayList<C4777b> f48228e;

        /* renamed from: f */
        private final HashMap<String, d> f48229f;

        /* renamed from: g */
        private int f48230g;

        /* renamed from: h */
        private boolean f48231h;

        /* renamed from: i */
        private int f48232i;

        /* renamed from: j */
        private int f48233j;

        /* renamed from: k */
        private int f48234k;

        public b(HandlerThread handlerThread, C4776a c4776a, C5450mn c5450mn, Handler handler, int i2, int i3, boolean z) {
            super(handlerThread.getLooper());
            this.f48224a = handlerThread;
            this.f48225b = c4776a;
            this.f48226c = c5450mn;
            this.f48227d = handler;
            this.f48232i = i2;
            this.f48233j = i3;
            this.f48231h = z;
            this.f48228e = new ArrayList<>();
            this.f48229f = new HashMap<>();
        }

        /* renamed from: a */
        private void m22306a() {
            ArrayList arrayList = new ArrayList();
            try {
                InterfaceC5298jq m22282a = ((C4776a) this.f48225b).m22282a(3, 4);
                while (true) {
                    try {
                        C4776a.a aVar = (C4776a.a) m22282a;
                        if (!aVar.moveToPosition(aVar.getPosition() + 1)) {
                            break;
                        } else {
                            arrayList.add(((C4776a.a) m22282a).m22290a());
                        }
                    } finally {
                    }
                }
                ((C4776a.a) m22282a).close();
            } catch (IOException unused) {
                d90.m23839b("DownloadManager", "Failed to load downloads.");
            }
            for (int i2 = 0; i2 < this.f48228e.size(); i2++) {
                ArrayList<C4777b> arrayList2 = this.f48228e;
                C4777b c4777b = arrayList2.get(i2);
                arrayList2.set(i2, new C4777b(c4777b.f48203a, 5, c4777b.f48205c, System.currentTimeMillis(), c4777b.f48207e, 0, 0, c4777b.f48210h));
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ArrayList<C4777b> arrayList3 = this.f48228e;
                C4777b c4777b2 = (C4777b) arrayList.get(i3);
                arrayList3.add(new C4777b(c4777b2.f48203a, 5, c4777b2.f48205c, System.currentTimeMillis(), c4777b2.f48207e, 0, 0, c4777b2.f48210h));
            }
            Collections.sort(this.f48228e, C4781f.f48252c);
            try {
                ((C4776a) this.f48225b).m22288c();
            } catch (IOException e2) {
                d90.m23838a("DownloadManager", "Failed to update index.", e2);
            }
            ArrayList arrayList4 = new ArrayList(this.f48228e);
            for (int i4 = 0; i4 < this.f48228e.size(); i4++) {
                this.f48227d.obtainMessage(2, new a(this.f48228e.get(i4), false, arrayList4, null)).sendToTarget();
            }
            m22308b();
        }

        /* renamed from: b */
        private void m22308b() {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f48228e.size(); i3++) {
                C4777b c4777b = this.f48228e.get(i3);
                d dVar = this.f48229f.get(c4777b.f48203a.f48179a);
                int i4 = c4777b.f48204b;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            Objects.requireNonNull(dVar);
                            C5220ia.m25476b(!dVar.f48238e);
                            if (!(!this.f48231h && this.f48230g == 0) || i2 >= this.f48232i) {
                                m22304a(c4777b, 0, 0);
                                dVar.m22315a(false);
                            }
                        } else {
                            if (i4 != 5 && i4 != 7) {
                                throw new IllegalStateException();
                            }
                            if (dVar == null) {
                                d dVar2 = new d(c4777b.f48203a, ((C5450mn) this.f48226c).m26695a(c4777b.f48203a), c4777b.f48210h, true, this.f48233j, this, 0);
                                this.f48229f.put(c4777b.f48203a.f48179a, dVar2);
                                dVar2.start();
                            } else if (!dVar.f48238e) {
                                dVar.m22315a(false);
                            }
                        }
                    } else if (dVar != null) {
                        C5220ia.m25476b(!dVar.f48238e);
                        dVar.m22315a(false);
                    }
                } else if (dVar != null) {
                    C5220ia.m25476b(!dVar.f48238e);
                    dVar.m22315a(false);
                } else if (!(!this.f48231h && this.f48230g == 0) || this.f48234k >= this.f48232i) {
                    dVar = null;
                } else {
                    C4777b m22304a = m22304a(c4777b, 2, 0);
                    dVar = new d(m22304a.f48203a, ((C5450mn) this.f48226c).m26695a(m22304a.f48203a), m22304a.f48210h, false, this.f48233j, this, 0);
                    this.f48229f.put(m22304a.f48203a.f48179a, dVar);
                    int i5 = this.f48234k;
                    this.f48234k = i5 + 1;
                    if (i5 == 0) {
                        sendEmptyMessageDelayed(11, 5000L);
                    }
                    dVar.start();
                }
                if (dVar != null && !dVar.f48238e) {
                    i2++;
                }
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            long j2;
            InterfaceC5298jq interfaceC5298jq = null;
            r10 = 0;
            int i2 = 0;
            switch (message.what) {
                case 0:
                    this.f48230g = message.arg1;
                    try {
                        ((C4776a) this.f48225b).m22287b();
                        interfaceC5298jq = ((C4776a) this.f48225b).m22282a(0, 1, 2, 5, 7);
                    } catch (IOException e2) {
                        d90.m23838a("DownloadManager", "Failed to load index.", e2);
                        this.f48228e.clear();
                    } finally {
                        s91.m28107a((Closeable) interfaceC5298jq);
                    }
                    while (true) {
                        C4776a.a aVar = (C4776a.a) interfaceC5298jq;
                        if (!aVar.moveToPosition(aVar.getPosition() + 1)) {
                            this.f48227d.obtainMessage(0, new ArrayList(this.f48228e)).sendToTarget();
                            m22308b();
                            i2 = 1;
                            this.f48227d.obtainMessage(1, i2, this.f48229f.size()).sendToTarget();
                            return;
                        }
                        this.f48228e.add(((C4776a.a) interfaceC5298jq).m22290a());
                    }
                case 1:
                    this.f48231h = message.arg1 != 0;
                    m22308b();
                    i2 = 1;
                    this.f48227d.obtainMessage(1, i2, this.f48229f.size()).sendToTarget();
                    return;
                case 2:
                    this.f48230g = message.arg1;
                    m22308b();
                    i2 = 1;
                    this.f48227d.obtainMessage(1, i2, this.f48229f.size()).sendToTarget();
                    return;
                case 3:
                    String str = (String) message.obj;
                    int i3 = message.arg1;
                    if (str == null) {
                        for (int i4 = 0; i4 < this.f48228e.size(); i4++) {
                            C4777b c4777b = this.f48228e.get(i4);
                            if (i3 == 0) {
                                if (c4777b.f48204b == 1) {
                                    m22304a(c4777b, 0, 0);
                                }
                            } else if (i3 != c4777b.f48208f) {
                                int i5 = c4777b.f48204b;
                                m22303a(new C4777b(c4777b.f48203a, (i5 == 0 || i5 == 2) ? 1 : i5, c4777b.f48205c, System.currentTimeMillis(), c4777b.f48207e, i3, 0, c4777b.f48210h));
                            }
                        }
                        try {
                            ((C4776a) this.f48225b).m22283a(i3);
                        } catch (IOException e3) {
                            d90.m23838a("DownloadManager", "Failed to set manual stop reason", e3);
                        }
                    } else {
                        C4777b m22305a = m22305a(str, false);
                        if (m22305a == null) {
                            try {
                                ((C4776a) this.f48225b).m22284a(i3, str);
                            } catch (IOException e4) {
                                d90.m23838a("DownloadManager", "Failed to set manual stop reason: " + str, e4);
                            }
                        } else if (i3 == 0) {
                            if (m22305a.f48204b == 1) {
                                m22304a(m22305a, 0, 0);
                            }
                        } else if (i3 != m22305a.f48208f) {
                            int i6 = m22305a.f48204b;
                            m22303a(new C4777b(m22305a.f48203a, (i6 == 0 || i6 == 2) ? 1 : i6, m22305a.f48205c, System.currentTimeMillis(), m22305a.f48207e, i3, 0, m22305a.f48210h));
                        }
                    }
                    m22308b();
                    i2 = 1;
                    this.f48227d.obtainMessage(1, i2, this.f48229f.size()).sendToTarget();
                    return;
                case 4:
                    this.f48232i = message.arg1;
                    m22308b();
                    i2 = 1;
                    this.f48227d.obtainMessage(1, i2, this.f48229f.size()).sendToTarget();
                    return;
                case 5:
                    this.f48233j = message.arg1;
                    i2 = 1;
                    this.f48227d.obtainMessage(1, i2, this.f48229f.size()).sendToTarget();
                    return;
                case 6:
                    DownloadRequest downloadRequest = (DownloadRequest) message.obj;
                    int i7 = message.arg1;
                    C4777b m22305a2 = m22305a(downloadRequest.f48179a, true);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (m22305a2 != null) {
                        int i8 = m22305a2.f48204b;
                        if (i8 != 5) {
                            if (!(i8 == 3 || i8 == 4)) {
                                j2 = m22305a2.f48205c;
                                m22303a(new C4777b(m22305a2.f48203a.m22268a(downloadRequest), (i8 != 5 || i8 == 7) ? 7 : i7 != 0 ? 1 : 0, j2, currentTimeMillis, i7));
                            }
                        }
                        j2 = currentTimeMillis;
                        m22303a(new C4777b(m22305a2.f48203a.m22268a(downloadRequest), (i8 != 5 || i8 == 7) ? 7 : i7 != 0 ? 1 : 0, j2, currentTimeMillis, i7));
                    } else {
                        m22303a(new C4777b(downloadRequest, i7 != 0 ? 1 : 0, currentTimeMillis, currentTimeMillis, i7));
                    }
                    m22308b();
                    i2 = 1;
                    this.f48227d.obtainMessage(1, i2, this.f48229f.size()).sendToTarget();
                    return;
                case 7:
                    String str2 = (String) message.obj;
                    C4777b m22305a3 = m22305a(str2, true);
                    if (m22305a3 == null) {
                        d90.m23839b("DownloadManager", "Failed to remove nonexistent download: " + str2);
                    } else {
                        m22304a(m22305a3, 5, 0);
                        m22308b();
                    }
                    i2 = 1;
                    this.f48227d.obtainMessage(1, i2, this.f48229f.size()).sendToTarget();
                    return;
                case 8:
                    m22306a();
                    i2 = 1;
                    this.f48227d.obtainMessage(1, i2, this.f48229f.size()).sendToTarget();
                    return;
                case 9:
                    d dVar = (d) message.obj;
                    String str3 = dVar.f48235b.f48179a;
                    this.f48229f.remove(str3);
                    boolean z = dVar.f48238e;
                    if (!z) {
                        int i9 = this.f48234k - 1;
                        this.f48234k = i9;
                        if (i9 == 0) {
                            removeMessages(11);
                        }
                    }
                    if (dVar.f48241h) {
                        m22308b();
                    } else {
                        Exception exc = dVar.f48242i;
                        if (exc != null) {
                            StringBuilder m26356a = l60.m26356a("Task failed: ");
                            m26356a.append(dVar.f48235b);
                            m26356a.append(", ");
                            m26356a.append(z);
                            d90.m23838a("DownloadManager", m26356a.toString(), exc);
                        }
                        C4777b m22305a4 = m22305a(str3, false);
                        Objects.requireNonNull(m22305a4);
                        int i10 = m22305a4.f48204b;
                        if (i10 == 2) {
                            C5220ia.m25476b(!z);
                            C4777b c4777b2 = new C4777b(m22305a4.f48203a, exc == null ? 3 : 4, m22305a4.f48205c, System.currentTimeMillis(), m22305a4.f48207e, m22305a4.f48208f, exc == null ? 0 : 1, m22305a4.f48210h);
                            this.f48228e.remove(m22302a(c4777b2.f48203a.f48179a));
                            try {
                                ((C4776a) this.f48225b).m22285a(c4777b2);
                            } catch (IOException e5) {
                                d90.m23838a("DownloadManager", "Failed to update index.", e5);
                            }
                            this.f48227d.obtainMessage(2, new a(c4777b2, false, new ArrayList(this.f48228e), exc)).sendToTarget();
                        } else {
                            if (i10 != 5 && i10 != 7) {
                                throw new IllegalStateException();
                            }
                            C5220ia.m25476b(z);
                            if (m22305a4.f48204b == 7) {
                                int i11 = m22305a4.f48208f;
                                m22304a(m22305a4, i11 == 0 ? 0 : 1, i11);
                                m22308b();
                            } else {
                                this.f48228e.remove(m22302a(m22305a4.f48203a.f48179a));
                                try {
                                    ((C4776a) this.f48225b).m22289c(m22305a4.f48203a.f48179a);
                                } catch (IOException unused) {
                                    d90.m23839b("DownloadManager", "Failed to remove from database");
                                }
                                this.f48227d.obtainMessage(2, new a(m22305a4, true, new ArrayList(this.f48228e), null)).sendToTarget();
                            }
                        }
                        m22308b();
                    }
                    this.f48227d.obtainMessage(1, i2, this.f48229f.size()).sendToTarget();
                    return;
                case 10:
                    d dVar2 = (d) message.obj;
                    int i12 = message.arg1;
                    int i13 = message.arg2;
                    int i14 = s91.f54530a;
                    long j3 = ((i12 & 4294967295L) << 32) | (4294967295L & i13);
                    C4777b m22305a5 = m22305a(dVar2.f48235b.f48179a, false);
                    Objects.requireNonNull(m22305a5);
                    if (j3 == m22305a5.f48207e || j3 == -1) {
                        return;
                    }
                    m22303a(new C4777b(m22305a5.f48203a, m22305a5.f48204b, m22305a5.f48205c, System.currentTimeMillis(), j3, m22305a5.f48208f, m22305a5.f48209g, m22305a5.f48210h));
                    return;
                case 11:
                    for (int i15 = 0; i15 < this.f48228e.size(); i15++) {
                        C4777b c4777b3 = this.f48228e.get(i15);
                        if (c4777b3.f48204b == 2) {
                            try {
                                ((C4776a) this.f48225b).m22285a(c4777b3);
                            } catch (IOException e6) {
                                d90.m23838a("DownloadManager", "Failed to update index.", e6);
                            }
                        }
                    }
                    sendEmptyMessageDelayed(11, 5000L);
                    return;
                case 12:
                    Iterator<d> it = this.f48229f.values().iterator();
                    while (it.hasNext()) {
                        it.next().m22315a(true);
                    }
                    try {
                        ((C4776a) this.f48225b).m22287b();
                    } catch (IOException e7) {
                        d90.m23838a("DownloadManager", "Failed to update index.", e7);
                    }
                    this.f48228e.clear();
                    this.f48224a.quit();
                    synchronized (this) {
                        notifyAll();
                    }
                    return;
                default:
                    throw new IllegalStateException();
            }
        }

        /* renamed from: a */
        private C4777b m22304a(C4777b c4777b, int i2, int i3) {
            C5220ia.m25476b((i2 == 3 || i2 == 4) ? false : true);
            return m22303a(new C4777b(c4777b.f48203a, i2, c4777b.f48205c, System.currentTimeMillis(), c4777b.f48207e, i3, 0, c4777b.f48210h));
        }

        /* renamed from: a */
        private C4777b m22303a(C4777b c4777b) {
            int i2 = c4777b.f48204b;
            C5220ia.m25476b((i2 == 3 || i2 == 4) ? false : true);
            int m22302a = m22302a(c4777b.f48203a.f48179a);
            if (m22302a == -1) {
                this.f48228e.add(c4777b);
                Collections.sort(this.f48228e, C4781f.f48253d);
            } else {
                boolean z = c4777b.f48205c != this.f48228e.get(m22302a).f48205c;
                this.f48228e.set(m22302a, c4777b);
                if (z) {
                    Collections.sort(this.f48228e, C4781f.f48254e);
                }
            }
            try {
                ((C4776a) this.f48225b).m22285a(c4777b);
            } catch (IOException e2) {
                d90.m23838a("DownloadManager", "Failed to update index.", e2);
            }
            this.f48227d.obtainMessage(2, new a(c4777b, false, new ArrayList(this.f48228e), null)).sendToTarget();
            return c4777b;
        }

        @Nullable
        /* renamed from: a */
        private C4777b m22305a(String str, boolean z) {
            int m22302a = m22302a(str);
            if (m22302a != -1) {
                return this.f48228e.get(m22302a);
            }
            if (!z) {
                return null;
            }
            try {
                return ((C4776a) this.f48225b).m22286b(str);
            } catch (IOException e2) {
                d90.m23838a("DownloadManager", "Failed to load download: " + str, e2);
                return null;
            }
        }

        /* renamed from: a */
        private int m22302a(String str) {
            for (int i2 = 0; i2 < this.f48228e.size(); i2++) {
                if (this.f48228e.get(i2).f48203a.f48179a.equals(str)) {
                    return i2;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static int m22301a(C4777b c4777b, C4777b c4777b2) {
            long j2 = c4777b.f48205c;
            long j3 = c4777b2.f48205c;
            int i2 = s91.f54530a;
            if (j2 < j3) {
                return -1;
            }
            return j2 == j3 ? 0 : 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m22292a(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            this.f48220i = Collections.unmodifiableList((List) message.obj);
            boolean m22295b = m22295b();
            Iterator<c> it = this.f48213b.iterator();
            while (it.hasNext()) {
                Objects.requireNonNull(it.next());
            }
            if (m22295b) {
                Iterator<c> it2 = this.f48213b.iterator();
                while (it2.hasNext()) {
                    Objects.requireNonNull(it2.next());
                }
            }
        } else if (i2 == 1) {
            int i3 = message.arg1;
            int i4 = message.arg2;
            int i5 = this.f48214c - i3;
            this.f48214c = i5;
            if (i4 == 0 && i5 == 0) {
                Iterator<c> it3 = this.f48213b.iterator();
                while (it3.hasNext()) {
                    Objects.requireNonNull(it3.next());
                }
            }
        } else if (i2 == 2) {
            a aVar = (a) message.obj;
            this.f48220i = Collections.unmodifiableList(aVar.f48223c);
            C4777b c4777b = aVar.f48221a;
            boolean m22295b2 = m22295b();
            if (aVar.f48222b) {
                Iterator<c> it4 = this.f48213b.iterator();
                while (it4.hasNext()) {
                    Objects.requireNonNull(it4.next());
                }
            } else {
                Iterator<c> it5 = this.f48213b.iterator();
                while (it5.hasNext()) {
                    it5.next().mo22309a(this, c4777b);
                }
            }
            if (m22295b2) {
                Iterator<c> it6 = this.f48213b.iterator();
                while (it6.hasNext()) {
                    Objects.requireNonNull(it6.next());
                }
            }
        } else {
            throw new IllegalStateException();
        }
        return true;
    }
}
