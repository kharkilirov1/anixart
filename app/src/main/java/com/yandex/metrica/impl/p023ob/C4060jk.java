package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4082kg;
import java.util.Collection;

/* renamed from: com.yandex.metrica.impl.ob.jk */
/* loaded from: classes2.dex */
class C4060jk extends AbstractC3600Rj {

    /* renamed from: a */
    @Nullable
    private final TelephonyManager f45490a;

    /* renamed from: b */
    private PhoneStateListener f45491b;

    /* renamed from: c */
    private boolean f45492c;

    /* renamed from: d */
    private C3575Qi f45493d;

    /* renamed from: e */
    @Nullable
    private C3668Uc f45494e;

    /* renamed from: f */
    private final C3506O<C3177Ak> f45495f;

    /* renamed from: g */
    private final C3506O<Collection<C3700Vj>> f45496g;

    /* renamed from: h */
    @NonNull
    private final InterfaceExecutorC4297sn f45497h;

    /* renamed from: i */
    private final Context f45498i;

    /* renamed from: j */
    private final C3750Xj f45499j;

    /* renamed from: k */
    private final C4372vk f45500k;

    /* renamed from: l */
    private final C3625Sj f45501l;

    /* renamed from: m */
    @NonNull
    private final C4106le f45502m;

    /* renamed from: n */
    @NonNull
    private C3950fe f45503n;

    /* renamed from: o */
    @NonNull
    private InterfaceC4138mk f45504o;

    /* renamed from: p */
    @NonNull
    private final InterfaceC3976ge f45505p;

    /* renamed from: q */
    @NonNull
    private final C3285F3 f45506q;

    /* renamed from: com.yandex.metrica.impl.ob.jk$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4060jk.this.f45491b = new d(C4060jk.this, null);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.jk$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C4060jk.this.f45492c) {
                return;
            }
            C4060jk.this.f45492c = true;
            if (C4060jk.this.f45491b == null || C4060jk.this.f45490a == null) {
                return;
            }
            try {
                C4060jk.this.f45490a.listen(C4060jk.this.f45491b, 256);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.jk$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C4060jk.this.f45492c) {
                C4060jk.this.f45492c = false;
                C4060jk.this.f45506q.m18027a(C4060jk.this);
                if (C4060jk.this.f45491b == null || C4060jk.this.f45490a == null) {
                    return;
                }
                try {
                    C4060jk.this.f45490a.listen(C4060jk.this.f45491b, 0);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.jk$d */
    public class d extends PhoneStateListener {
        private d() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);
            C4060jk.m20164a(C4060jk.this, signalStrength);
        }

        public /* synthetic */ d(C4060jk c4060jk, a aVar) {
            this();
        }
    }

    public C4060jk(@NonNull Context context, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        this(context, new C4106le(), interfaceExecutorC4297sn);
    }

    /* renamed from: e */
    public Context m20171e() {
        return this.f45498i;
    }

    @Nullable
    /* renamed from: f */
    public TelephonyManager m20172f() {
        return this.f45490a;
    }

    @VisibleForTesting
    /* renamed from: g */
    public synchronized C3177Ak m20173g() {
        C3700Vj m17840b;
        if (this.f45495f.m18650b() || this.f45495f.m18652d()) {
            C3177Ak c3177Ak = new C3177Ak(this.f45499j, this.f45500k, this.f45501l);
            C3700Vj m17840b2 = c3177Ak.m17840b();
            if (m17840b2 != null && m17840b2.m19311p() == null && !this.f45495f.m18650b() && (m17840b = this.f45495f.m18647a().m17840b()) != null) {
                c3177Ak.m17840b().m19296a(m17840b.m19311p());
            }
            this.f45495f.m18649a(c3177Ak);
        }
        return this.f45495f.m18647a();
    }

    public C4060jk(@NonNull Context context, @NonNull C4106le c4106le, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        this(context, c4106le, new C3950fe(c4106le.m20356a()), interfaceExecutorC4297sn, C3658U2.m19211a(17) ? new C3650Tj() : new C3675Uj(), new C3808a2(), C3285F3.m18024a());
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3600Rj
    /* renamed from: b */
    public synchronized void mo19054b() {
        ((C4271rn) this.f45497h).execute(new c());
    }

    /* renamed from: c */
    public synchronized boolean m20169c() {
        boolean z;
        C3668Uc c3668Uc = this.f45494e;
        if (c3668Uc != null) {
            z = c3668Uc.f44143l;
        }
        return z;
    }

    /* renamed from: d */
    public synchronized boolean m20170d() {
        C3575Qi c3575Qi;
        synchronized (this) {
            c3575Qi = this.f45493d;
        }
        return (c3575Qi != null) && c3575Qi.m18848f().f46420t;
        return (c3575Qi != null) && c3575Qi.m18848f().f46420t;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3600Rj
    /* renamed from: a */
    public synchronized void mo19049a() {
        ((C4271rn) this.f45497h).execute(new b());
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3600Rj
    /* renamed from: a */
    public synchronized void mo19050a(InterfaceC3202Bk interfaceC3202Bk) {
        if (interfaceC3202Bk != null) {
            interfaceC3202Bk.mo17805a(m20173g());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003f A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #2 {, blocks: (B:9:0x0004, B:11:0x000c, B:13:0x008e, B:16:0x0014, B:18:0x0025, B:20:0x002f, B:27:0x003c, B:29:0x003f, B:32:0x0049, B:34:0x004f, B:36:0x0055, B:38:0x0063, B:40:0x0066, B:50:0x006a, B:51:0x006b, B:52:0x006c, B:54:0x0072, B:57:0x008b, B:58:0x007d, B:60:0x0086, B:22:0x0030, B:24:0x0035), top: B:8:0x0004, outer: #3, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004f A[Catch: all -> 0x009b, LOOP:0: B:34:0x004f->B:40:0x0066, LOOP_START, PHI: r5
      0x004f: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:33:0x004d, B:40:0x0066] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {, blocks: (B:9:0x0004, B:11:0x000c, B:13:0x008e, B:16:0x0014, B:18:0x0025, B:20:0x002f, B:27:0x003c, B:29:0x003f, B:32:0x0049, B:34:0x004f, B:36:0x0055, B:38:0x0063, B:40:0x0066, B:50:0x006a, B:51:0x006b, B:52:0x006c, B:54:0x0072, B:57:0x008b, B:58:0x007d, B:60:0x0086, B:22:0x0030, B:24:0x0035), top: B:8:0x0004, outer: #3, inners: #1 }] */
    @Override // com.yandex.metrica.impl.p023ob.AbstractC3600Rj
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void mo19052a(com.yandex.metrica.impl.p023ob.InterfaceC3725Wj r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            if (r9 == 0) goto La1
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L9e
            com.yandex.metrica.impl.ob.O<java.util.Collection<com.yandex.metrica.impl.ob.Vj>> r0 = r8.f45496g     // Catch: java.lang.Throwable -> L9b
            boolean r0 = r0.m18650b()     // Catch: java.lang.Throwable -> L9b
            if (r0 != 0) goto L14
            com.yandex.metrica.impl.ob.O<java.util.Collection<com.yandex.metrica.impl.ob.Vj>> r0 = r8.f45496g     // Catch: java.lang.Throwable -> L9b
            boolean r0 = r0.m18652d()     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L8e
        L14:
            com.yandex.metrica.impl.ob.O<java.util.Collection<com.yandex.metrica.impl.ob.Vj>> r0 = r8.f45496g     // Catch: java.lang.Throwable -> L9b
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9b
            r1.<init>()     // Catch: java.lang.Throwable -> L9b
            r2 = 17
            boolean r2 = com.yandex.metrica.impl.p023ob.C3658U2.m19211a(r2)     // Catch: java.lang.Throwable -> L9b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L6c
            com.yandex.metrica.impl.ob.ge r2 = r8.f45505p     // Catch: java.lang.Throwable -> L9b
            android.content.Context r5 = r8.f45498i     // Catch: java.lang.Throwable -> L9b
            boolean r2 = r2.mo19401a(r5)     // Catch: java.lang.Throwable -> L9b
            if (r2 == 0) goto L6c
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L9b
            com.yandex.metrica.impl.ob.Uc r2 = r8.f45494e     // Catch: java.lang.Throwable -> L69
            r5 = 0
            if (r2 == 0) goto L3b
            boolean r2 = r2.f44142k     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L3b
            r2 = 1
            goto L3c
        L3b:
            r2 = 0
        L3c:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L9b
            if (r2 == 0) goto L6c
            android.telephony.TelephonyManager r2 = r8.f45490a     // Catch: java.lang.Throwable -> L9b
            if (r2 == 0) goto L48
            java.util.List r2 = r2.getAllCellInfo()     // Catch: java.lang.Throwable -> L48
            goto L49
        L48:
            r2 = r3
        L49:
            boolean r6 = com.yandex.metrica.impl.p023ob.C3658U2.m19217b(r2)     // Catch: java.lang.Throwable -> L9b
            if (r6 != 0) goto L6c
        L4f:
            int r6 = r2.size()     // Catch: java.lang.Throwable -> L9b
            if (r5 >= r6) goto L6c
            java.lang.Object r6 = r2.get(r5)     // Catch: java.lang.Throwable -> L9b
            android.telephony.CellInfo r6 = (android.telephony.CellInfo) r6     // Catch: java.lang.Throwable -> L9b
            com.yandex.metrica.impl.ob.mk r7 = r8.f45504o     // Catch: java.lang.Throwable -> L9b
            com.yandex.metrica.impl.ob.Vj r6 = r7.mo19167a(r6)     // Catch: java.lang.Throwable -> L9b
            if (r6 == 0) goto L66
            r1.add(r6)     // Catch: java.lang.Throwable -> L9b
        L66:
            int r5 = r5 + 1
            goto L4f
        L69:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L9b
            throw r9     // Catch: java.lang.Throwable -> L9b
        L6c:
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L9b
            if (r2 >= r4) goto L86
            com.yandex.metrica.impl.ob.Ak r1 = r8.m20173g()     // Catch: java.lang.Throwable -> L9b
            com.yandex.metrica.impl.ob.Vj r1 = r1.m17840b()     // Catch: java.lang.Throwable -> L9b
            if (r1 != 0) goto L7d
            goto L8b
        L7d:
            java.util.List r1 = java.util.Collections.singletonList(r1)     // Catch: java.lang.Throwable -> L9b
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch: java.lang.Throwable -> L9b
            goto L8a
        L86:
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch: java.lang.Throwable -> L9b
        L8a:
            r3 = r1
        L8b:
            r0.m18649a(r3)     // Catch: java.lang.Throwable -> L9b
        L8e:
            com.yandex.metrica.impl.ob.O<java.util.Collection<com.yandex.metrica.impl.ob.Vj>> r0 = r8.f45496g     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r0 = r0.m18647a()     // Catch: java.lang.Throwable -> L9b
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L9e
            r9.mo18743a(r0)     // Catch: java.lang.Throwable -> L9e
            goto La1
        L9b:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L9e
            throw r9     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        La1:
            monitor-exit(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4060jk.mo19052a(com.yandex.metrica.impl.ob.Wj):void");
    }

    public C4060jk(@NonNull Context context, @NonNull C4106le c4106le, @NonNull C3950fe c3950fe, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull InterfaceC4138mk interfaceC4138mk, @NonNull C3808a2 c3808a2, @NonNull C3285F3 c3285f3) {
        TelephonyManager telephonyManager;
        this.f45492c = false;
        C4082kg.c cVar = C3506O.f43524e;
        long j2 = cVar.f45673b;
        this.f45495f = new C3506O<>(j2, j2 * 2);
        long j3 = cVar.f45673b;
        this.f45496g = new C3506O<>(j3, 2 * j3);
        this.f45498i = context;
        try {
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
        } catch (Throwable unused) {
            telephonyManager = null;
        }
        this.f45490a = telephonyManager;
        this.f45505p = m20163a(c3950fe, c3808a2);
        this.f45497h = interfaceExecutorC4297sn;
        ((C4271rn) interfaceExecutorC4297sn).execute(new a());
        this.f45499j = new C3750Xj(this, c3950fe);
        this.f45500k = new C4372vk(this, c3950fe);
        this.f45501l = new C3625Sj(this);
        this.f45502m = c4106le;
        this.f45503n = c3950fe;
        this.f45504o = interfaceC4138mk;
        this.f45506q = c3285f3;
    }

    /* renamed from: a */
    public static void m20164a(C4060jk c4060jk, SignalStrength signalStrength) {
        C3700Vj m17840b;
        int evdoDbm;
        synchronized (c4060jk) {
            if (!c4060jk.f45495f.m18650b() && !c4060jk.f45495f.m18652d() && (m17840b = c4060jk.f45495f.m18647a().m17840b()) != null) {
                if (signalStrength.isGsm()) {
                    evdoDbm = 99 == signalStrength.getGsmSignalStrength() ? -1 : (r4 * 2) - 113;
                } else {
                    int cdmaDbm = signalStrength.getCdmaDbm();
                    evdoDbm = signalStrength.getEvdoDbm();
                    if (-120 == evdoDbm) {
                        evdoDbm = cdmaDbm;
                    } else if (-120 != cdmaDbm) {
                        evdoDbm = Math.min(cdmaDbm, evdoDbm);
                    }
                }
                m17840b.m19296a(Integer.valueOf(evdoDbm));
            }
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3600Rj
    /* renamed from: a */
    public void mo19051a(@NonNull C3575Qi c3575Qi) {
        this.f45493d = c3575Qi;
        this.f45502m.m20357a(c3575Qi);
        this.f45503n.m19899a(this.f45502m.m20356a());
        this.f45504o.mo18922a(c3575Qi.m18848f());
        if (c3575Qi.m18846d() != null) {
            this.f45495f.m18648a(c3575Qi.m18846d().f46203a, c3575Qi.m18846d().f46203a * 2);
            this.f45496g.m18648a(c3575Qi.m18846d().f46203a, c3575Qi.m18846d().f46203a * 2);
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3693Vc
    /* renamed from: a */
    public synchronized void mo19274a(@Nullable C3668Uc c3668Uc) {
        this.f45494e = c3668Uc;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3600Rj
    /* renamed from: a */
    public void mo19053a(boolean z) {
        this.f45502m.m20358a(z);
        this.f45503n.m19899a(this.f45502m.m20356a());
    }

    @NonNull
    /* renamed from: a */
    private static InterfaceC3976ge m20163a(@NonNull C3950fe c3950fe, @NonNull C3808a2 c3808a2) {
        if (C3658U2.m19211a(29)) {
            return c3808a2.m19565c(c3950fe);
        }
        return c3808a2.m19564b(c3950fe);
    }
}
