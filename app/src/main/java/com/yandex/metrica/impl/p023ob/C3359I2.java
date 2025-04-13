package com.yandex.metrica.impl.p023ob;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4429y;
import com.yandex.metrica.impl.p023ob.C4455z;

/* renamed from: com.yandex.metrica.impl.ob.I2 */
/* loaded from: classes2.dex */
public class C3359I2 {

    /* renamed from: a */
    @NonNull
    private final InterfaceC3706W0 f43082a;

    /* renamed from: b */
    @NonNull
    private final C4429y f43083b;

    /* renamed from: c */
    @NonNull
    private final C4244qm<C4275s1> f43084c;

    /* renamed from: d */
    @NonNull
    private final C4429y.b f43085d;

    /* renamed from: e */
    @NonNull
    private final C4429y.b f43086e;

    /* renamed from: f */
    @NonNull
    private final C4455z f43087f;

    /* renamed from: g */
    @NonNull
    private final C4403x f43088g;

    /* renamed from: com.yandex.metrica.impl.ob.I2$a */
    public class a implements C4429y.b {

        /* renamed from: com.yandex.metrica.impl.ob.I2$a$a, reason: collision with other inner class name */
        public class C6995a implements InterfaceC3757Y1<C4275s1> {

            /* renamed from: a */
            public final /* synthetic */ Activity f43090a;

            public C6995a(Activity activity) {
                this.f43090a = activity;
            }

            @Override // com.yandex.metrica.impl.p023ob.InterfaceC3757Y1
            /* renamed from: b */
            public void mo17914b(@NonNull C4275s1 c4275s1) {
                C3359I2.m18244a(C3359I2.this, this.f43090a, c4275s1);
            }
        }

        public a() {
        }

        @Override // com.yandex.metrica.impl.p023ob.C4429y.b
        @MainThread
        /* renamed from: a */
        public void mo17912a(@NonNull Activity activity, @NonNull C4429y.a aVar) {
            C3359I2.this.f43084c.m20604a((InterfaceC3757Y1) new C6995a(activity));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.I2$b */
    public class b implements C4429y.b {

        /* renamed from: com.yandex.metrica.impl.ob.I2$b$a */
        public class a implements InterfaceC3757Y1<C4275s1> {

            /* renamed from: a */
            public final /* synthetic */ Activity f43093a;

            public a(Activity activity) {
                this.f43093a = activity;
            }

            @Override // com.yandex.metrica.impl.p023ob.InterfaceC3757Y1
            /* renamed from: b */
            public void mo17914b(@NonNull C4275s1 c4275s1) {
                C3359I2.m18245b(C3359I2.this, this.f43093a, c4275s1);
            }
        }

        public b() {
        }

        @Override // com.yandex.metrica.impl.p023ob.C4429y.b
        @MainThread
        /* renamed from: a */
        public void mo17912a(@NonNull Activity activity, @NonNull C4429y.a aVar) {
            C3359I2.this.f43084c.m20604a((InterfaceC3757Y1) new a(activity));
        }
    }

    public C3359I2(@NonNull C4429y c4429y, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull C4403x c4403x) {
        this(C3524Oh.m18679a(), c4429y, c4403x, new C4244qm(interfaceExecutorC4297sn), new C4455z());
    }

    /* renamed from: b */
    public void m18249b(@Nullable Activity activity, @NonNull InterfaceC3656U0 interfaceC3656U0) {
        if (activity != null) {
            this.f43088g.m21122a(activity);
        }
        if (this.f43087f.m21279a(activity, C4455z.a.RESUMED)) {
            interfaceC3656U0.mo18451a(activity);
        }
    }

    @NonNull
    /* renamed from: a */
    public C4429y.c m18246a(boolean z) {
        this.f43083b.m21170a(this.f43085d, C4429y.a.RESUMED);
        this.f43083b.m21170a(this.f43086e, C4429y.a.PAUSED);
        C4429y.c m21167a = this.f43083b.m21167a();
        if (m21167a == C4429y.c.WATCHING) {
            this.f43082a.reportEvent(z ? "session_auto_tracking_listener_registered_auto" : "session_auto_tracking_listener_registered_manual");
        }
        return m21167a;
    }

    @VisibleForTesting
    public C3359I2(@NonNull InterfaceC3706W0 interfaceC3706W0, @NonNull C4429y c4429y, @NonNull C4403x c4403x, @NonNull C4244qm<C4275s1> c4244qm, @NonNull C4455z c4455z) {
        this.f43083b = c4429y;
        this.f43082a = interfaceC3706W0;
        this.f43088g = c4403x;
        this.f43084c = c4244qm;
        this.f43087f = c4455z;
        this.f43085d = new a();
        this.f43086e = new b();
    }

    /* renamed from: b */
    public static void m18245b(C3359I2 c3359i2, Activity activity, InterfaceC3656U0 interfaceC3656U0) {
        if (c3359i2.f43087f.m21279a(activity, C4455z.a.PAUSED)) {
            ((C4275s1) interfaceC3656U0).mo18460b(activity);
        }
    }

    /* renamed from: a */
    public void m18247a(@Nullable Activity activity, @NonNull InterfaceC3656U0 interfaceC3656U0) {
        if (activity != null) {
            this.f43088g.m21122a(activity);
        }
        if (this.f43087f.m21279a(activity, C4455z.a.PAUSED)) {
            interfaceC3656U0.mo18460b(activity);
        }
    }

    /* renamed from: a */
    public void m18248a(@NonNull C4275s1 c4275s1) {
        this.f43084c.m20605a((C4244qm<C4275s1>) c4275s1);
    }

    /* renamed from: a */
    public static void m18244a(C3359I2 c3359i2, Activity activity, InterfaceC3656U0 interfaceC3656U0) {
        if (c3359i2.f43087f.m21279a(activity, C4455z.a.RESUMED)) {
            ((C4275s1) interfaceC3656U0).mo18451a(activity);
        }
    }
}
