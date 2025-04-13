package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.impl.p023ob.C3605S;
import com.yandex.metrica.impl.p023ob.C4405x1;
import com.yandex.metrica.rtm.wrapper.InterfaceC4627k;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.o2 */
/* loaded from: classes2.dex */
public class C4172o2 implements C4405x1.c, InterfaceC4627k {

    /* renamed from: a */
    private final InterfaceC3781Z0 f46031a;

    /* renamed from: b */
    private final C4405x1 f46032b;

    /* renamed from: c */
    private final Object f46033c;

    /* renamed from: d */
    private final InterfaceExecutorC4297sn f46034d;

    /* renamed from: e */
    @NonNull
    private final C3687V6 f46035e;

    /* renamed from: com.yandex.metrica.impl.ob.o2$a */
    public class a extends g {

        /* renamed from: b */
        public final /* synthetic */ C3659U3 f46036b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3659U3 c3659u3) {
            super(C4172o2.this, null);
            this.f46036b = c3659u3;
        }

        @Override // com.yandex.metrica.impl.p023ob.C4172o2.g
        /* renamed from: a */
        public void mo20479a(@NonNull IMetricaService iMetricaService) throws RemoteException {
            InterfaceC3781Z0 interfaceC3781Z0 = C4172o2.this.f46031a;
            C3659U3 c3659u3 = this.f46036b;
            Objects.requireNonNull((C4146n2) interfaceC3781Z0);
            Bundle bundle = new Bundle();
            synchronized (c3659u3) {
                bundle.putParcelable("PROCESS_CFG_OBJ", c3659u3);
            }
            iMetricaService.mo17767b(bundle);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$b */
    public class b extends g {

        /* renamed from: b */
        public final /* synthetic */ C3659U3 f46038b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3659U3 c3659u3) {
            super(C4172o2.this, null);
            this.f46038b = c3659u3;
        }

        @Override // com.yandex.metrica.impl.p023ob.C4172o2.g
        /* renamed from: a */
        public void mo20479a(@NonNull IMetricaService iMetricaService) throws RemoteException {
            InterfaceC3781Z0 interfaceC3781Z0 = C4172o2.this.f46031a;
            C3659U3 c3659u3 = this.f46038b;
            Objects.requireNonNull((C4146n2) interfaceC3781Z0);
            Bundle bundle = new Bundle();
            synchronized (c3659u3) {
                bundle.putParcelable("PROCESS_CFG_OBJ", c3659u3);
            }
            iMetricaService.mo17766a(bundle);
        }
    }

    @VisibleForTesting
    /* renamed from: com.yandex.metrica.impl.ob.o2$c */
    public class c extends d {

        /* renamed from: d */
        private boolean f46040d;

        /* renamed from: e */
        private final C3254Dm f46041e;

        @VisibleForTesting
        public c(@NonNull f fVar, @NonNull C3254Dm c3254Dm) {
            super(fVar);
            this.f46040d = false;
            this.f46041e = c3254Dm;
        }

        @Override // com.yandex.metrica.impl.p023ob.C4172o2.g
        /* renamed from: b */
        public boolean mo20483b() {
            f fVar = this.f46043b;
            if (fVar.m20490b().f45527h != 0) {
                C4172o2.this.f46035e.m19269a(fVar);
                return false;
            }
            Context m20412a = ((C4146n2) C4172o2.this.f46031a).m20412a();
            Intent m18186b = C3334H2.m18186b(m20412a);
            fVar.m20490b().f45524e = EnumC4067k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.m20218b();
            m18186b.putExtras(fVar.m20490b().m20196b(fVar.m20486a().m20222c()));
            try {
                m20412a.startService(m18186b);
                return false;
            } catch (Throwable unused) {
                C4172o2.this.f46035e.m19269a(fVar);
                return false;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
        
            if (r2.m17984b().endsWith(":Metrica") != false) goto L16;
         */
        @Override // com.yandex.metrica.impl.p023ob.C4172o2.g
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public synchronized java.lang.Void call() {
            /*
                r4 = this;
                monitor-enter(r4)
                boolean r0 = r4.f46040d     // Catch: java.lang.Throwable -> L40
                r1 = 0
                if (r0 == 0) goto L8
                monitor-exit(r4)
                return r1
            L8:
                r0 = 1
                r4.f46040d = r0     // Catch: java.lang.Throwable -> L40
                com.yandex.metrica.impl.ob.Dm r2 = r4.f46041e     // Catch: java.lang.Throwable -> L40
                java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Throwable -> L40
                java.lang.String r3 = r2.m17984b()     // Catch: java.lang.Throwable -> L27
                boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L27
                if (r3 != 0) goto L27
                java.lang.String r2 = r2.m17984b()     // Catch: java.lang.Throwable -> L27
                java.lang.String r3 = ":Metrica"
                boolean r2 = r2.endsWith(r3)     // Catch: java.lang.Throwable -> L27
                if (r2 == 0) goto L27
                goto L28
            L27:
                r0 = 0
            L28:
                if (r0 == 0) goto L31
                com.yandex.metrica.impl.ob.o2$f r0 = r4.f46043b     // Catch: java.lang.Throwable -> L40
                r4.m20482a(r0)     // Catch: java.lang.Throwable -> L40
                monitor-exit(r4)
                return r1
            L31:
                com.yandex.metrica.impl.ob.o2 r0 = com.yandex.metrica.impl.p023ob.C4172o2.this     // Catch: java.lang.Throwable -> L40
                com.yandex.metrica.impl.ob.x1 r0 = com.yandex.metrica.impl.p023ob.C4172o2.m20476b(r0)     // Catch: java.lang.Throwable -> L40
                r0.m21136g()     // Catch: java.lang.Throwable -> L40
                java.lang.Void r0 = super.call()     // Catch: java.lang.Throwable -> L40
                monitor-exit(r4)
                return r0
            L40:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4172o2.c.call():java.lang.Void");
        }

        /* renamed from: a */
        public void m20482a(@NonNull f fVar) {
            C4172o2.this.f46035e.m19269a(fVar);
        }
    }

    @VisibleForTesting
    /* renamed from: com.yandex.metrica.impl.ob.o2$d */
    public class d extends g {

        /* renamed from: b */
        public final f f46043b;

        @VisibleForTesting
        public d(f fVar) {
            super(C4172o2.this, null);
            this.f46043b = fVar;
        }

        @Override // com.yandex.metrica.impl.p023ob.C4172o2.g
        /* renamed from: a */
        public void mo20479a(@NonNull IMetricaService iMetricaService) throws RemoteException {
            f fVar = this.f46043b;
            ((C4146n2) C4172o2.this.f46031a).m20415a(iMetricaService, fVar.m20493e(), fVar.f46046b);
        }

        @Override // com.yandex.metrica.impl.p023ob.C4172o2.g
        /* renamed from: a */
        public void mo20484a(Throwable th) {
        }

        @Override // com.yandex.metrica.impl.p023ob.C4172o2.g, java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Void call() throws Exception {
            return call();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$e */
    public interface e {
        /* renamed from: a */
        C4066k0 mo20443a(C4066k0 c4066k0);
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$f */
    public static class f {

        /* renamed from: a */
        private C4066k0 f46045a;

        /* renamed from: b */
        private C4068k2 f46046b;

        /* renamed from: c */
        private boolean f46047c = false;

        /* renamed from: d */
        private e f46048d;

        /* renamed from: e */
        @Nullable
        private HashMap<C3605S.a, Integer> f46049e;

        public f(C4066k0 c4066k0, C4068k2 c4068k2) {
            this.f46045a = c4066k0;
            this.f46046b = new C4068k2(new C3659U3(c4068k2.m19135a()), new CounterConfiguration(c4068k2.m19136b()), c4068k2.m20224e());
        }

        /* renamed from: b */
        public C4066k0 m20490b() {
            return this.f46045a;
        }

        /* renamed from: c */
        public HashMap<C3605S.a, Integer> m20491c() {
            return this.f46049e;
        }

        /* renamed from: d */
        public boolean m20492d() {
            return this.f46047c;
        }

        /* renamed from: e */
        public C4066k0 m20493e() {
            e eVar = this.f46048d;
            return eVar != null ? eVar.mo20443a(this.f46045a) : this.f46045a;
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("ReportToSend{mReport=");
            m24u.append(this.f46045a);
            m24u.append(", mEnvironment=");
            m24u.append(this.f46046b);
            m24u.append(", mCrash=");
            m24u.append(this.f46047c);
            m24u.append(", mAction=");
            m24u.append(this.f46048d);
            m24u.append(", mTrimmedFields=");
            m24u.append(this.f46049e);
            m24u.append('}');
            return m24u.toString();
        }

        /* renamed from: a */
        public f m20487a(e eVar) {
            this.f46048d = eVar;
            return this;
        }

        /* renamed from: a */
        public f m20488a(@NonNull HashMap<C3605S.a, Integer> hashMap) {
            this.f46049e = hashMap;
            return this;
        }

        /* renamed from: a */
        public f m20489a(boolean z) {
            this.f46047c = z;
            return this;
        }

        /* renamed from: a */
        public C4068k2 m20486a() {
            return this.f46046b;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$g */
    public abstract class g implements Callable<Void> {
        private g() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            int i2 = 0;
            do {
                try {
                    IMetricaService m21133d = C4172o2.this.f46032b.m21133d();
                    if (m21133d != null) {
                        try {
                            mo20479a(m21133d);
                            return null;
                        } catch (RemoteException unused) {
                        }
                    }
                    i2++;
                    if (!mo20483b() || C3533P1.m18724a()) {
                        break;
                    }
                } catch (Throwable th) {
                    mo20484a(th);
                    return null;
                }
            } while (i2 < 20);
            return null;
        }

        /* renamed from: a */
        public abstract void mo20479a(@NonNull IMetricaService iMetricaService) throws RemoteException;

        /* renamed from: a */
        public void mo20484a(Throwable th) {
        }

        /* renamed from: b */
        public boolean mo20483b() {
            C4172o2.this.f46032b.m21131b();
            synchronized (C4172o2.this.f46033c) {
                if (!C4172o2.this.f46032b.m21134e()) {
                    try {
                        C4172o2.this.f46033c.wait(500L, 0);
                    } catch (InterruptedException unused) {
                        C4172o2.this.f46033c.notifyAll();
                    }
                }
            }
            return true;
        }

        public /* synthetic */ g(C4172o2 c4172o2, a aVar) {
            this();
        }
    }

    @VisibleForTesting
    /* renamed from: com.yandex.metrica.impl.ob.o2$h */
    public class h extends g {

        /* renamed from: b */
        private final int f46051b;

        /* renamed from: c */
        private final Bundle f46052c;

        @VisibleForTesting
        public h(C4172o2 c4172o2, @NonNull int i2, Bundle bundle) {
            super(c4172o2, null);
            this.f46051b = i2;
            this.f46052c = bundle;
        }

        @Override // com.yandex.metrica.impl.p023ob.C4172o2.g
        /* renamed from: a */
        public void mo20479a(@NonNull IMetricaService iMetricaService) throws RemoteException {
            iMetricaService.mo17765a(this.f46051b, this.f46052c);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4172o2(com.yandex.metrica.impl.p023ob.InterfaceC3781Z0 r4) {
        /*
            r3 = this;
            com.yandex.metrica.impl.ob.Y r0 = com.yandex.metrica.impl.p023ob.C3755Y.m19410g()
            com.yandex.metrica.impl.ob.qn r0 = r0.m19414d()
            com.yandex.metrica.impl.ob.sn r0 = r0.m20609d()
            com.yandex.metrica.impl.ob.V6 r1 = new com.yandex.metrica.impl.ob.V6
            com.yandex.metrica.impl.ob.n2 r4 = (com.yandex.metrica.impl.p023ob.C4146n2) r4
            android.content.Context r2 = r4.m20412a()
            r1.<init>(r2)
            r3.<init>(r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4172o2.<init>(com.yandex.metrica.impl.ob.Z0):void");
    }

    @Override // com.yandex.metrica.impl.p023ob.C4405x1.c
    public void onServiceConnected() {
        synchronized (this.f46033c) {
            this.f46033c.notifyAll();
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.C4405x1.c
    public void onServiceDisconnected() {
    }

    public Future<Void> queuePauseUserSession(@NonNull C3659U3 c3659u3) {
        return ((C4271rn) this.f46034d).m20671a(new b(c3659u3));
    }

    public Future<Void> queueReport(f fVar) {
        return ((C4271rn) this.f46034d).m20671a(fVar.m20492d() ? new c(fVar, C3755Y.m19410g().m19417h()) : new d(fVar));
    }

    public Future<Void> queueResumeUserSession(@NonNull C3659U3 c3659u3) {
        return ((C4271rn) this.f46034d).m20671a(new a(c3659u3));
    }

    public void reportData(int i2, @NonNull Bundle bundle) {
        ((C4271rn) this.f46034d).m20671a(new h(this, i2, bundle));
    }

    public void sendCrash(@NonNull f fVar) {
        c cVar = new c(fVar, C3755Y.m19410g().m19417h());
        if (this.f46032b.m21134e()) {
            try {
                ((FutureTask) ((C4271rn) this.f46034d).m20671a(cVar)).get(4L, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        if (cVar.f46040d) {
            return;
        }
        try {
            cVar.call();
        } catch (Throwable unused2) {
        }
    }

    public C4172o2(@NonNull InterfaceC3781Z0 interfaceC3781Z0, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull C3687V6 c3687v6) {
        this.f46033c = new Object();
        this.f46031a = interfaceC3781Z0;
        this.f46034d = interfaceExecutorC4297sn;
        this.f46035e = c3687v6;
        C4405x1 m20437c = ((C4146n2) interfaceC3781Z0).m20437c();
        this.f46032b = m20437c;
        m20437c.m21130a(this);
    }
}
