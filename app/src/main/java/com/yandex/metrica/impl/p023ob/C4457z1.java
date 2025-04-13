package com.yandex.metrica.impl.p023ob;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.MetricaService;

/* renamed from: com.yandex.metrica.impl.ob.z1 */
/* loaded from: classes2.dex */
public class C4457z1 implements InterfaceC4431y1 {

    /* renamed from: a */
    private InterfaceExecutorC4297sn f47048a;

    /* renamed from: b */
    private InterfaceC4431y1 f47049b;

    /* renamed from: c */
    @NonNull
    private final C4171o1 f47050c;

    /* renamed from: d */
    private boolean f47051d;

    /* renamed from: com.yandex.metrica.impl.ob.z1$a */
    public class a extends AbstractRunnableC3429Km {

        /* renamed from: a */
        public final /* synthetic */ Bundle f47052a;

        public a(Bundle bundle) {
            this.f47052a = bundle;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractRunnableC3429Km
        /* renamed from: a */
        public void mo18463a() throws Exception {
            C4457z1.this.f47049b.mo17873b(this.f47052a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$b */
    public class b extends AbstractRunnableC3429Km {

        /* renamed from: a */
        public final /* synthetic */ Bundle f47054a;

        public b(Bundle bundle) {
            this.f47054a = bundle;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractRunnableC3429Km
        /* renamed from: a */
        public void mo18463a() throws Exception {
            C4457z1.this.f47049b.mo17867a(this.f47054a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$c */
    public class c extends AbstractRunnableC3429Km {

        /* renamed from: a */
        public final /* synthetic */ Configuration f47056a;

        public c(Configuration configuration) {
            this.f47056a = configuration;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractRunnableC3429Km
        /* renamed from: a */
        public void mo18463a() throws Exception {
            C4457z1.this.f47049b.onConfigurationChanged(this.f47056a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$d */
    public class d extends AbstractRunnableC3429Km {
        public d() {
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractRunnableC3429Km
        /* renamed from: a */
        public void mo18463a() {
            synchronized (C4457z1.this) {
                if (C4457z1.this.f47051d) {
                    C4457z1.this.f47050c.m20473e();
                    C4457z1.this.f47049b.mo17862a();
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$e */
    public class e extends AbstractRunnableC3429Km {

        /* renamed from: a */
        public final /* synthetic */ Intent f47059a;

        /* renamed from: b */
        public final /* synthetic */ int f47060b;

        public e(Intent intent, int i2) {
            this.f47059a = intent;
            this.f47060b = i2;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractRunnableC3429Km
        /* renamed from: a */
        public void mo18463a() {
            C4457z1.this.f47049b.mo17865a(this.f47059a, this.f47060b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$f */
    public class f extends AbstractRunnableC3429Km {

        /* renamed from: a */
        public final /* synthetic */ Intent f47062a;

        /* renamed from: b */
        public final /* synthetic */ int f47063b;

        /* renamed from: c */
        public final /* synthetic */ int f47064c;

        public f(Intent intent, int i2, int i3) {
            this.f47062a = intent;
            this.f47063b = i2;
            this.f47064c = i3;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractRunnableC3429Km
        /* renamed from: a */
        public void mo18463a() {
            C4457z1.this.f47049b.mo17866a(this.f47062a, this.f47063b, this.f47064c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$g */
    public class g extends AbstractRunnableC3429Km {

        /* renamed from: a */
        public final /* synthetic */ Intent f47066a;

        public g(Intent intent) {
            this.f47066a = intent;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractRunnableC3429Km
        /* renamed from: a */
        public void mo18463a() {
            C4457z1.this.f47049b.mo17864a(this.f47066a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$h */
    public class h extends AbstractRunnableC3429Km {

        /* renamed from: a */
        public final /* synthetic */ Intent f47068a;

        public h(Intent intent) {
            this.f47068a = intent;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractRunnableC3429Km
        /* renamed from: a */
        public void mo18463a() {
            C4457z1.this.f47049b.mo17874c(this.f47068a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$i */
    public class i extends AbstractRunnableC3429Km {

        /* renamed from: a */
        public final /* synthetic */ Intent f47070a;

        public i(Intent intent) {
            this.f47070a = intent;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractRunnableC3429Km
        /* renamed from: a */
        public void mo18463a() {
            C4457z1.this.f47049b.mo17872b(this.f47070a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$j */
    public class j extends AbstractRunnableC3429Km {

        /* renamed from: a */
        public final /* synthetic */ String f47072a;

        /* renamed from: b */
        public final /* synthetic */ int f47073b;

        /* renamed from: c */
        public final /* synthetic */ String f47074c;

        /* renamed from: d */
        public final /* synthetic */ Bundle f47075d;

        public j(String str, int i2, String str2, Bundle bundle) {
            this.f47072a = str;
            this.f47073b = i2;
            this.f47074c = str2;
            this.f47075d = bundle;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractRunnableC3429Km
        /* renamed from: a */
        public void mo18463a() throws RemoteException {
            C4457z1.this.f47049b.mo17870a(this.f47072a, this.f47073b, this.f47074c, this.f47075d);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$k */
    public class k extends AbstractRunnableC3429Km {

        /* renamed from: a */
        public final /* synthetic */ Bundle f47077a;

        public k(Bundle bundle) {
            this.f47077a = bundle;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractRunnableC3429Km
        /* renamed from: a */
        public void mo18463a() throws Exception {
            C4457z1.this.f47049b.reportData(this.f47077a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$l */
    public class l extends AbstractRunnableC3429Km {

        /* renamed from: a */
        public final /* synthetic */ int f47079a;

        /* renamed from: b */
        public final /* synthetic */ Bundle f47080b;

        public l(int i2, Bundle bundle) {
            this.f47079a = i2;
            this.f47080b = bundle;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractRunnableC3429Km
        /* renamed from: a */
        public void mo18463a() throws Exception {
            C4457z1.this.f47049b.mo17863a(this.f47079a, this.f47080b);
        }
    }

    public C4457z1(@NonNull InterfaceC4431y1 interfaceC4431y1) {
        this(C3532P0.m18696i().m18716s().m21319d(), interfaceC4431y1, C3532P0.m18696i().m18707j());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3508O1
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        ((C4271rn) this.f47048a).execute(new c(configuration));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4431y1
    public void reportData(Bundle bundle) {
        ((C4271rn) this.f47048a).execute(new k(bundle));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3508O1
    /* renamed from: a */
    public synchronized void mo17862a() {
        this.f47051d = true;
        ((C4271rn) this.f47048a).execute(new d());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3508O1
    /* renamed from: b */
    public void mo17872b(Intent intent) {
        ((C4271rn) this.f47048a).execute(new i(intent));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3508O1
    /* renamed from: c */
    public void mo17874c(Intent intent) {
        ((C4271rn) this.f47048a).execute(new h(intent));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3508O1
    /* renamed from: b */
    public void mo17871b() {
        ((C4271rn) this.f47048a).m20677d();
        synchronized (this) {
            this.f47050c.m20474f();
            this.f47051d = false;
        }
        this.f47049b.mo17871b();
    }

    @VisibleForTesting
    public C4457z1(@NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull InterfaceC4431y1 interfaceC4431y1, @NonNull C4171o1 c4171o1) {
        this.f47051d = false;
        this.f47048a = interfaceExecutorC4297sn;
        this.f47049b = interfaceC4431y1;
        this.f47050c = c4171o1;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3508O1
    /* renamed from: a */
    public void mo17865a(Intent intent, int i2) {
        ((C4271rn) this.f47048a).execute(new e(intent, i2));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3508O1
    /* renamed from: a */
    public void mo17866a(Intent intent, int i2, int i3) {
        ((C4271rn) this.f47048a).execute(new f(intent, i2, i3));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3508O1
    /* renamed from: a */
    public void mo17864a(Intent intent) {
        ((C4271rn) this.f47048a).execute(new g(intent));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4431y1
    /* renamed from: a */
    public void mo17870a(String str, int i2, String str2, Bundle bundle) {
        ((C4271rn) this.f47048a).execute(new j(str, i2, str2, bundle));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4431y1
    /* renamed from: a */
    public void mo17863a(int i2, Bundle bundle) {
        ((C4271rn) this.f47048a).execute(new l(i2, bundle));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4431y1
    /* renamed from: a */
    public void mo17867a(@NonNull Bundle bundle) {
        ((C4271rn) this.f47048a).execute(new b(bundle));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4431y1
    /* renamed from: a */
    public void mo17868a(@NonNull MetricaService.InterfaceC3085e interfaceC3085e) {
        this.f47049b.mo17868a(interfaceC3085e);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4431y1
    /* renamed from: b */
    public void mo17873b(@NonNull Bundle bundle) {
        ((C4271rn) this.f47048a).execute(new a(bundle));
    }
}
