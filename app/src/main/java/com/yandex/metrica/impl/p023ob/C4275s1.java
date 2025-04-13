package com.yandex.metrica.impl.p023ob;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.C3089a;
import com.yandex.metrica.C4483l;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.PreloadInfo;
import com.yandex.metrica.impl.p023ob.C3987h;
import com.yandex.metrica.impl.p023ob.C4429y;
import com.yandex.metrica.impl.p023ob.C4455z;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.s1 */
/* loaded from: classes2.dex */
public class C4275s1 extends AbstractC3381J implements InterfaceC3656U0 {

    /* renamed from: p */
    @NonNull
    private final C3089a f46323p;

    /* renamed from: q */
    @NonNull
    private final C3223Cg f46324q;

    /* renamed from: r */
    @NonNull
    private final C4483l f46325r;

    /* renamed from: s */
    @NonNull
    private final C3375Ii f46326s;

    /* renamed from: t */
    @NonNull
    private C3987h f46327t;

    /* renamed from: u */
    @NonNull
    private final C3802Zl f46328u;

    /* renamed from: v */
    @NonNull
    private final C4455z f46329v;

    /* renamed from: w */
    private final AtomicBoolean f46330w;

    /* renamed from: x */
    private final C3260E3 f46331x;

    /* renamed from: y */
    @NonNull
    private final C3588R7 f46332y;

    /* renamed from: z */
    private static final InterfaceC4350uo<String> f46322z = new C4272ro(new C4220po("Referral url"));

    /* renamed from: A */
    private static final Long f46321A = Long.valueOf(TimeUnit.SECONDS.toMillis(5));

    /* renamed from: com.yandex.metrica.impl.ob.s1$a */
    public class a implements C3987h.b {

        /* renamed from: a */
        public final /* synthetic */ InterfaceExecutorC4297sn f46333a;

        /* renamed from: b */
        public final /* synthetic */ C4145n1 f46334b;

        /* renamed from: c */
        public final /* synthetic */ C3608S2 f46335c;

        /* renamed from: d */
        public final /* synthetic */ C3608S2 f46336d;

        /* renamed from: com.yandex.metrica.impl.ob.s1$a$a, reason: collision with other inner class name */
        public class RunnableC7007a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C3917e7 f46338a;

            public RunnableC7007a(C3917e7 c3917e7) {
                this.f46338a = c3917e7;
            }

            @Override // java.lang.Runnable
            public void run() {
                C4275s1.this.mo18344a(this.f46338a);
                if (a.this.f46334b.m20408a(this.f46338a.f45020a.f45943f)) {
                    a.this.f46335c.mo19074a().mo18344a(this.f46338a);
                }
                if (a.this.f46334b.m20409b(this.f46338a.f45020a.f45943f)) {
                    a.this.f46336d.mo19074a().mo18344a(this.f46338a);
                }
            }
        }

        public a(InterfaceExecutorC4297sn interfaceExecutorC4297sn, C4145n1 c4145n1, C3608S2 c3608s2, C3608S2 c3608s22) {
            this.f46333a = interfaceExecutorC4297sn;
            this.f46334b = c4145n1;
            this.f46335c = c3608s2;
            this.f46336d = c3608s22;
        }

        @Override // com.yandex.metrica.impl.p023ob.C3987h.b
        /* renamed from: a */
        public void mo19992a() {
            C3917e7 m17998a = C4275s1.this.f46331x.m17998a();
            ((C4271rn) this.f46333a).execute(new RunnableC7007a(m17998a));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.s1$b */
    public class b implements C3089a.a {
        public b() {
        }

        @Override // com.yandex.metrica.C3089a.a
        /* renamed from: a */
        public void mo17773a() {
            C4275s1 c4275s1 = C4275s1.this;
            c4275s1.f43161i.m20413a(c4275s1.f43154b.m19135a());
        }

        @Override // com.yandex.metrica.C3089a.a
        /* renamed from: b */
        public void mo17774b() {
            C4275s1 c4275s1 = C4275s1.this;
            c4275s1.f43161i.m20432b(c4275s1.f43154b.m19135a());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.s1$c */
    public static class c {
        /* renamed from: a */
        public C3802Zl m20684a(@NonNull Context context, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull C3291F9 c3291f9, @NonNull C4275s1 c4275s1, @NonNull C3375Ii c3375Ii) {
            return new C3802Zl(context, c3291f9, c4275s1, interfaceExecutorC4297sn, c3375Ii.m18332d());
        }
    }

    @VisibleForTesting
    @WorkerThread
    public C4275s1(@NonNull Context context, @NonNull C3659U3 c3659u3, @NonNull C4483l c4483l, @NonNull C4146n2 c4146n2, @NonNull C3588R7 c3588r7, @NonNull C3375Ii c3375Ii, @NonNull C3608S2 c3608s2, @NonNull C3608S2 c3608s22, @NonNull C3291F9 c3291f9, @NonNull C3223Cg c3223Cg, @NonNull C3755Y c3755y, @NonNull C3407K0 c3407k0) {
        this(context, c4483l, c4146n2, c3588r7, new C4068k2(c3659u3, new CounterConfiguration(c4483l, CounterConfiguration.EnumC3079b.MAIN), c4483l.userProfileID), new C3089a(c4483l.sessionTimeout == null ? TimeUnit.SECONDS.toMillis(10L) : r0.intValue()), c3223Cg, c3375Ii, new C4145n1(), c3755y.m19419j(), c3608s2, c3608s22, c3291f9, c3755y.m19413c(), c3407k0, new c(), new C4455z(), new C4421xh(), new C4395wh(c4483l.appVersion, c4483l.f47167a), new C3813a7(c3407k0), new C3289F7(), new C3164A7(), new C4333u7(), new C4281s7());
    }

    /* renamed from: h */
    private void m20682h() {
        this.f43161i.m20413a(this.f43154b.m19135a());
        this.f46323p.m17771b(new b(), f46321A.longValue());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    /* renamed from: a */
    public void mo18459a(boolean z) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3656U0
    /* renamed from: b */
    public void mo18460b(@Nullable Activity activity) {
        if (this.f46329v.m21279a(activity, C4455z.a.PAUSED)) {
            m18355d(activity != null ? activity.getClass().getSimpleName() : null);
            this.f46323p.m17770a();
            if (activity != null) {
                this.f46328u.m19531a(activity);
            }
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3381J, com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    /* renamed from: c */
    public void mo18354c(String str, String str2) {
        super.mo18354c(str, str2);
        this.f46332y.m18941a(this.f43154b.f45593c.m18183a());
    }

    /* renamed from: g */
    public final void m20683g() {
        if (this.f46330w.compareAndSet(false, true)) {
            this.f46327t.m19991c();
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3656U0
    /* renamed from: a */
    public void mo18457a(@NonNull String str, boolean z) {
        if (this.f43155c.m21337c()) {
            this.f43155c.m21333b("App opened via deeplink: " + m18358f(str));
        }
        this.f43161i.m20420a(C3382J0.m18365a("open", str, z, this.f43155c), this.f43154b);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    /* renamed from: b */
    public void mo18462b(boolean z) {
        this.f43154b.m19136b().m17759k(z);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4062jm
    /* renamed from: b */
    public void mo18461b(@NonNull JSONObject jSONObject) {
        C4146n2 c4146n2 = this.f43161i;
        C3379Im c3379Im = this.f43155c;
        List<Integer> list = C3382J0.f43175i;
        c4146n2.m20420a(new C3605S(jSONObject.toString(), "view_tree", EnumC4067k1.EVENT_TYPE_VIEW_TREE.m20218b(), 0, c3379Im), this.f43154b);
    }

    @VisibleForTesting
    @WorkerThread
    public C4275s1(@NonNull Context context, @NonNull C4483l c4483l, @NonNull C4146n2 c4146n2, @NonNull C3588R7 c3588r7, @NonNull C4068k2 c4068k2, @NonNull C3089a c3089a, @NonNull C3223Cg c3223Cg, @NonNull C3375Ii c3375Ii, @NonNull C4145n1 c4145n1, @NonNull InterfaceC3354Hm interfaceC3354Hm, @NonNull C3608S2 c3608s2, @NonNull C3608S2 c3608s22, @NonNull C3291F9 c3291f9, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull C3407K0 c3407k0, @NonNull c cVar, @NonNull C4455z c4455z, @NonNull C4421xh c4421xh, @NonNull C4395wh c4395wh, @NonNull C3813a7 c3813a7, @NonNull C3289F7 c3289f7, @NonNull C3164A7 c3164a7, @NonNull C4333u7 c4333u7, @NonNull C4281s7 c4281s7) {
        super(context, c4146n2, c4068k2, c3407k0, interfaceC3354Hm, c4421xh.m21153a(c4146n2.m20431b(), c4483l.apiKey, true), c4395wh, c3289f7, c3164a7, c4333u7, c4281s7, c3813a7);
        this.f46330w = new AtomicBoolean(false);
        this.f46331x = new C3260E3();
        this.f43154b.m20221a(m20679a(c4483l));
        this.f46323p = c3089a;
        this.f46324q = c3223Cg;
        this.f46332y = c3588r7;
        this.f46325r = c4483l;
        this.f46329v = c4455z;
        C3802Zl m20684a = cVar.m20684a(context, interfaceExecutorC4297sn, c3291f9, this, c3375Ii);
        this.f46328u = m20684a;
        this.f46326s = c3375Ii;
        c3375Ii.m18325a(m20684a);
        m20681a(c4483l.nativeCrashReporting, this.f43154b);
        c3375Ii.m18329b();
        c3223Cg.m17938a();
        this.f46327t = m20680a(interfaceExecutorC4297sn, c4145n1, c3608s2, c3608s22);
        if (C4013i.m20035a(c4483l.f47177k)) {
            m20683g();
        }
        m20682h();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3656U0
    /* renamed from: a */
    public void mo18456a(@NonNull String str) {
        ((C4272ro) f46322z).mo18360a(str);
        this.f43161i.m20420a(C3382J0.m18365a("referral", str, false, this.f43155c), this.f43154b);
        if (this.f43155c.m21337c()) {
            this.f43155c.m21333b("Referral URL received: " + m18358f(str));
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3656U0
    /* renamed from: a */
    public void mo18455a(@NonNull C4429y.c cVar) {
        if (cVar == C4429y.c.WATCHING) {
            if (this.f43155c.m21337c()) {
                this.f43155c.m21333b("Enable activity auto tracking");
            }
        } else if (this.f43155c.m21337c()) {
            C3379Im c3379Im = this.f43155c;
            StringBuilder m24u = C0000a.m24u("Could not enable activity auto tracking. ");
            m24u.append(cVar.f46969a);
            c3379Im.m21335c(m24u.toString());
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3656U0
    /* renamed from: a */
    public void mo18451a(@Nullable Activity activity) {
        if (this.f46329v.m21279a(activity, C4455z.a.RESUMED)) {
            m18356e(activity != null ? activity.getClass().getSimpleName() : null);
            this.f46323p.m17772c();
            if (activity != null) {
                this.f46328u.m19533b(activity);
            }
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    /* renamed from: a */
    public void mo18452a(@Nullable Location location) {
        this.f43154b.m19136b().m17754d(location);
        if (this.f43155c.m21337c()) {
            this.f43155c.m21330a("Set location: %s", location);
        }
    }

    @NonNull
    /* renamed from: a */
    private C3987h m20680a(@NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull C4145n1 c4145n1, @NonNull C3608S2 c3608s2, @NonNull C3608S2 c3608s22) {
        return new C3987h(new a(interfaceExecutorC4297sn, c4145n1, c3608s2, c3608s22));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4062jm
    /* renamed from: a */
    public void mo18458a(@NonNull JSONObject jSONObject) {
        C4146n2 c4146n2 = this.f43161i;
        C3379Im c3379Im = this.f43155c;
        List<Integer> list = C3382J0.f43175i;
        c4146n2.m20420a(new C3605S(jSONObject.toString(), "view_tree", EnumC4067k1.EVENT_TYPE_RAW_VIEW_TREE.m20218b(), 0, c3379Im), this.f43154b);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3656U0
    /* renamed from: a */
    public void mo18453a(@NonNull InterfaceC3528Ol interfaceC3528Ol, boolean z) {
        this.f46328u.m19532a(interfaceC3528Ol, z);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3656U0
    /* renamed from: a */
    public void mo18454a(@NonNull C3733X2 c3733x2) {
        c3733x2.m19380a(this.f43155c);
    }

    @WorkerThread
    /* renamed from: a */
    private void m20681a(@Nullable Boolean bool, C4068k2 c4068k2) {
        Boolean bool2 = Boolean.TRUE;
        if (bool == null) {
            bool = bool2;
        }
        boolean booleanValue = bool.booleanValue();
        this.f46332y.m18942a(booleanValue, c4068k2.m19136b().m17753c(), c4068k2.f45593c.m18183a());
        if (this.f43155c.m21337c()) {
            this.f43155c.m21330a("Set report native crashes enabled: %b", Boolean.valueOf(booleanValue));
        }
    }

    @NonNull
    /* renamed from: a */
    private C3546Pe m20679a(@NonNull C4483l c4483l) {
        PreloadInfo preloadInfo = c4483l.preloadInfo;
        C3379Im c3379Im = this.f43155c;
        Boolean bool = c4483l.f47175i;
        Boolean bool2 = Boolean.FALSE;
        if (bool == null) {
            bool = bool2;
        }
        return new C3546Pe(preloadInfo, c3379Im, bool.booleanValue());
    }
}
