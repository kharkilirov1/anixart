package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.MetricaService;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.impl.p023ob.C3575Qi;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.B1 */
/* loaded from: classes2.dex */
public class C3183B1 implements InterfaceC4431y1 {

    /* renamed from: A */
    @NonNull
    private final C4432y2 f42580A;

    /* renamed from: a */
    @Nullable
    private C3575Qi f42581a;

    /* renamed from: b */
    private boolean f42582b;

    /* renamed from: c */
    @NonNull
    private final Context f42583c;

    /* renamed from: d */
    @NonNull
    private volatile MetricaService.InterfaceC3085e f42584d;

    /* renamed from: e */
    @NonNull
    private final C3928ei f42585e;

    /* renamed from: f */
    @NonNull
    private C3989h1 f42586f;

    /* renamed from: g */
    @NonNull
    private final C3432L0 f42587g;

    /* renamed from: h */
    @NonNull
    private C3236D4 f42588h;

    /* renamed from: i */
    @NonNull
    private final C3458M1 f42589i;

    /* renamed from: j */
    @Nullable
    private C3245Dd f42590j;

    /* renamed from: k */
    @NonNull
    private C3366I9 f42591k;

    /* renamed from: l */
    @NonNull
    private C3938f2 f42592l;

    /* renamed from: m */
    @NonNull
    private final C3507O0 f42593m;

    /* renamed from: n */
    @NonNull
    private final C3947fb f42594n;

    /* renamed from: o */
    @NonNull
    private final C3285F3 f42595o;

    /* renamed from: p */
    @Nullable
    private C3314G7 f42596p;

    /* renamed from: q */
    @NonNull
    private final InterfaceC3712W6 f42597q;

    /* renamed from: r */
    @NonNull
    private final C4048j8 f42598r;

    /* renamed from: s */
    @NonNull
    private final C3256E f42599s;

    /* renamed from: t */
    @NonNull
    private final InterfaceExecutorC4297sn f42600t;

    /* renamed from: u */
    @NonNull
    private final C3408K1 f42601u;

    /* renamed from: v */
    @NonNull
    private InterfaceC3678Um<String> f42602v;

    /* renamed from: w */
    @NonNull
    private InterfaceC3678Um<File> f42603w;

    /* renamed from: x */
    @Nullable
    private InterfaceC3464M7<String> f42604x;

    /* renamed from: y */
    private InterfaceExecutorC4297sn f42605y;

    /* renamed from: z */
    @NonNull
    private C3964g2 f42606z;

    /* renamed from: com.yandex.metrica.impl.ob.B1$a */
    public class a implements InterfaceC3678Um<File> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3678Um
        @WorkerThread
        /* renamed from: b */
        public void mo17875b(@NonNull File file) {
            C3183B1.this.m17869a(file);
        }
    }

    @MainThread
    public C3183B1(@NonNull Context context, @NonNull MetricaService.InterfaceC3085e interfaceC3085e) {
        this(context, interfaceC3085e, new C3386J4(context));
    }

    /* renamed from: d */
    public static void m17857d(C3183B1 c3183b1) {
        C3245Dd c3245Dd = c3183b1.f42590j;
        if (c3245Dd != null) {
            c3245Dd.m17964a(c3183b1);
        }
    }

    /* renamed from: e */
    public static void m17858e(C3183B1 c3183b1) {
        C3245Dd c3245Dd = c3183b1.f42590j;
        if (c3245Dd != null) {
            c3245Dd.m17966b(c3183b1);
        }
    }

    /* renamed from: g */
    public static void m17860g(C3183B1 c3183b1) {
        if (c3183b1.f42581a != null) {
            C3532P0.m18696i().m18714q().m17977a(c3183b1.f42581a);
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3508O1
    @WorkerThread
    /* renamed from: b */
    public void mo17872b(Intent intent) {
        this.f42589i.mo17872b(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if ("com.yandex.metrica.IMetricaService".equals(action) && data != null && data.getPath().equals("/client")) {
                int parseInt = Integer.parseInt(data.getQueryParameter("pid"));
                this.f42588h.m17950a(encodedAuthority, parseInt, data.getQueryParameter("psid"));
                this.f42599s.m17989a(parseInt);
            }
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3508O1
    @WorkerThread
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        C4197p1.m20517a(this.f42583c).m20521b(configuration);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4431y1
    @WorkerThread
    public void reportData(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        this.f42586f.m19994a();
        this.f42592l.m19841a(C4066k0.m20176a(bundle), bundle);
    }

    @MainThread
    private C3183B1(@NonNull Context context, @NonNull MetricaService.InterfaceC3085e interfaceC3085e, @NonNull C3386J4 c3386j4) {
        this(context, interfaceC3085e, new C3236D4(context, c3386j4), new C3458M1(), new C3432L0(), new C3507O0(), new C3947fb(context), C3285F3.m18024a(), new C3928ei(context), C3532P0.m18696i().m18701c(), C3532P0.m18696i().m18707j().m20471c(), C4048j8.m20082a(), C3532P0.m18696i().m18716s().m21321f(), C3532P0.m18696i().m18716s().m21316b(), new C3408K1(), C3532P0.m18696i().m18713p());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3508O1
    @WorkerThread
    /* renamed from: a */
    public void mo17862a() {
        C3532P0.m18696i().m18697a().m21068a();
        if (this.f42582b) {
            C4197p1.m20517a(this.f42583c).m20521b(this.f42583c.getResources().getConfiguration());
        } else {
            this.f42591k = C3532P0.m18696i().m18718u();
            this.f42593m.m18653a(this.f42583c);
            C3532P0.m18696i().m18723z();
            C3454Lm.m18520c().m18523d();
            this.f42590j = new C3245Dd(C3897dd.m19718a(this.f42583c), C3835b3.m19636a(this.f42583c), this.f42591k);
            this.f42581a = new C3575Qi.b(this.f42583c).m18918a();
            C3532P0.m18696i().m18721x().m19509a(this.f42581a);
            this.f42589i.m18556b(new C3283F1(this));
            this.f42589i.m18557c(new C3308G1(this));
            this.f42589i.m18558d(new C3333H1(this));
            this.f42589i.m18559e(new C3358I1(this));
            this.f42589i.m18555a(new C3383J1(this));
            this.f42595o.m18028a(this, C3410K3.class, C3385J3.m18378a(new C3233D1(this)).m18381a(new C3208C1(this)).m18382a());
            C3532P0.m18696i().m18717t().m19808a(this.f42583c, this.f42581a);
            this.f42586f = new C3989h1(this.f42591k, this.f42581a.m18863u(), new C3504Nm(), new C3583R2(), C3524Oh.m18679a());
            C3575Qi c3575Qi = this.f42581a;
            if (c3575Qi != null) {
                this.f42585e.m19824b(c3575Qi);
            }
            m17851a(this.f42581a);
            C3408K1 c3408k1 = this.f42601u;
            Context context = this.f42583c;
            C3236D4 c3236d4 = this.f42588h;
            Objects.requireNonNull(c3408k1);
            this.f42592l = new C3938f2(context, c3236d4, C3532P0.m18696i().m18716s().m21321f(), new C3432L0());
            YandexMetrica.getReporter(this.f42583c, "20799a27-fa80-4b36-b2db-0f8141f24180");
            File m18469a = this.f42587g.m18469a(this.f42583c, "appmetrica_crashes");
            if (m18469a != null) {
                C3408K1 c3408k12 = this.f42601u;
                InterfaceC3678Um<File> interfaceC3678Um = this.f42603w;
                Objects.requireNonNull(c3408k12);
                this.f42596p = new C3314G7(m18469a, interfaceC3678Um);
                ((C4271rn) this.f42600t).execute(new RunnableC3865c7(this.f42583c, m18469a, this.f42603w));
                this.f42596p.m18130a();
            }
            if (C3658U2.m19211a(21)) {
                C3408K1 c3408k13 = this.f42601u;
                C3938f2 c3938f2 = this.f42592l;
                Objects.requireNonNull(c3408k13);
                this.f42604x = new C3840b8(new C3892d8(c3938f2));
                this.f42602v = new C3258E1(this);
                if (this.f42598r.m20083b()) {
                    this.f42604x.mo18573a();
                    ((C4271rn) this.f42605y).m20674a(new RunnableC4152n8(), 1L, TimeUnit.MINUTES);
                }
            }
            C3532P0.m18696i().m18705g().m18734a(this.f42581a);
            this.f42582b = true;
        }
        if (C3658U2.m19211a(21)) {
            this.f42597q.mo19352a(this.f42602v);
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3508O1
    @WorkerThread
    /* renamed from: c */
    public void mo17874c(Intent intent) {
        this.f42589i.mo17874c(intent);
    }

    @WorkerThread
    /* renamed from: c */
    private Integer m17856c(@NonNull Bundle bundle) {
        C3659U3 c3659u3;
        bundle.setClassLoader(C3659U3.class.getClassLoader());
        String str = C3659U3.f44128c;
        try {
            c3659u3 = (C3659U3) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            c3659u3 = null;
        }
        if (c3659u3 == null) {
            return null;
        }
        return c3659u3.m19233g();
    }

    /* renamed from: b */
    public static void m17853b(C3183B1 c3183b1) {
        c3183b1.f42585e.m19823b();
    }

    @MainThread
    @VisibleForTesting
    public C3183B1(@NonNull Context context, @NonNull MetricaService.InterfaceC3085e interfaceC3085e, @NonNull C3236D4 c3236d4, @NonNull C3458M1 c3458m1, @NonNull C3432L0 c3432l0, @NonNull C3507O0 c3507o0, @NonNull C3947fb c3947fb, @NonNull C3285F3 c3285f3, @NonNull C3928ei c3928ei, @NonNull C3256E c3256e, @NonNull InterfaceC3712W6 interfaceC3712W6, @NonNull C4048j8 c4048j8, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn2, @NonNull C3408K1 c3408k1, @NonNull C4432y2 c4432y2) {
        this.f42582b = false;
        this.f42603w = new a();
        this.f42583c = context;
        this.f42584d = interfaceC3085e;
        this.f42588h = c3236d4;
        this.f42589i = c3458m1;
        this.f42587g = c3432l0;
        this.f42593m = c3507o0;
        this.f42594n = c3947fb;
        this.f42595o = c3285f3;
        this.f42585e = c3928ei;
        this.f42599s = c3256e;
        this.f42600t = interfaceExecutorC4297sn;
        this.f42605y = interfaceExecutorC4297sn2;
        this.f42601u = c3408k1;
        this.f42597q = interfaceC3712W6;
        this.f42598r = c4048j8;
        this.f42606z = new C3964g2(this, context);
        this.f42580A = c4432y2;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3508O1
    @MainThread
    /* renamed from: b */
    public void mo17871b() {
        if (C3658U2.m19211a(21)) {
            this.f42597q.mo19353b(this.f42602v);
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4431y1
    @WorkerThread
    /* renamed from: b */
    public void mo17873b(@NonNull Bundle bundle) {
        Integer m17856c = m17856c(bundle);
        if (m17856c != null) {
            this.f42599s.m17993c(m17856c.intValue());
        }
    }

    /* renamed from: b */
    private void m17852b(Intent intent, int i2) {
        if (intent != null) {
            intent.getExtras().setClassLoader(CounterConfiguration.class.getClassLoader());
            if (!(intent.getData() == null)) {
                Bundle extras = intent.getExtras();
                C3634T3 c3634t3 = new C3634T3(extras);
                if (!C3634T3.m19134a(c3634t3, this.f42583c)) {
                    C4066k0 m20176a = C4066k0.m20176a(extras);
                    if (!((EnumC4067k1.EVENT_TYPE_UNDEFINED.m20218b() == m20176a.f45524e) | (m20176a.f45520a == null))) {
                        try {
                            this.f42592l.m19839a(C3211C4.m17918a(c3634t3), m20176a, new C3734X3(c3634t3));
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
        this.f42584d.mo17769a(i2);
    }

    /* renamed from: b */
    public static void m17854b(C3183B1 c3183b1, C3575Qi c3575Qi) {
        C3245Dd c3245Dd = c3183b1.f42590j;
        if (c3245Dd != null) {
            c3245Dd.m17963a(c3575Qi);
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3508O1
    @WorkerThread
    /* renamed from: a */
    public void mo17865a(Intent intent, int i2) {
        m17852b(intent, i2);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3508O1
    @WorkerThread
    /* renamed from: a */
    public void mo17866a(Intent intent, int i2, int i3) {
        m17852b(intent, i3);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3508O1
    @WorkerThread
    /* renamed from: a */
    public void mo17864a(Intent intent) {
        this.f42589i.mo17864a(intent);
    }

    /* renamed from: a */
    public static void m17850a(C3183B1 c3183b1, C3575Qi c3575Qi) {
        c3183b1.f42581a = c3575Qi;
        C3213C6 c3213c6 = new C3213C6(c3183b1.f42583c);
        ((C4271rn) c3183b1.f42605y).execute(new RunnableC3158A1(c3183b1, c3213c6));
        C3245Dd c3245Dd = c3183b1.f42590j;
        if (c3245Dd != null) {
            c3245Dd.m17963a(c3575Qi);
        }
        c3183b1.f42586f.m19995a(c3183b1.f42581a.m18863u());
        c3183b1.f42594n.m19897a(c3575Qi);
        c3183b1.f42585e.m19824b(c3575Qi);
    }

    /* renamed from: a */
    public static void m17849a(C3183B1 c3183b1, Intent intent) {
        c3183b1.f42585e.m19820a();
        c3183b1.f42580A.m21178a(C4452ym.m21270f(intent.getStringExtra("screen_size")));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4431y1
    @WorkerThread
    @Deprecated
    /* renamed from: a */
    public void mo17870a(String str, int i2, String str2, Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        this.f42592l.m19841a(new C4066k0(str2, str, i2, new C3504Nm()), bundle);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4431y1
    @WorkerThread
    /* renamed from: a */
    public void mo17863a(int i2, Bundle bundle) {
        this.f42606z.m19924a(i2, bundle);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4431y1
    @WorkerThread
    /* renamed from: a */
    public void mo17867a(@NonNull Bundle bundle) {
        Integer m17856c = m17856c(bundle);
        if (m17856c != null) {
            this.f42599s.m17991b(m17856c.intValue());
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4431y1
    /* renamed from: a */
    public void mo17868a(@NonNull MetricaService.InterfaceC3085e interfaceC3085e) {
        this.f42584d = interfaceC3085e;
    }

    @WorkerThread
    /* renamed from: a */
    public void m17869a(@NonNull File file) {
        this.f42592l.m19842a(file);
    }

    @WorkerThread
    /* renamed from: a */
    private void m17851a(@NonNull C3575Qi c3575Qi) {
        C3245Dd c3245Dd = this.f42590j;
        if (c3245Dd != null) {
            c3245Dd.m17963a(c3575Qi);
        }
    }
}
