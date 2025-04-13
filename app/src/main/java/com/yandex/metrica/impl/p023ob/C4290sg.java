package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.C4484p;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.impl.interact.CellularNetworkInfo;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.sg */
/* loaded from: classes2.dex */
public class C4290sg {

    /* renamed from: a */
    @NonNull
    private final C4316tg f46374a;

    /* renamed from: b */
    @NonNull
    private final InterfaceExecutorC4297sn f46375b;

    /* renamed from: c */
    @NonNull
    private final C4134mg f46376c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC4350uo<Context> f46377d;

    /* renamed from: e */
    @NonNull
    private final InterfaceC4350uo<String> f46378e;

    /* renamed from: f */
    @NonNull
    private final C3554Pm f46379f;

    /* renamed from: com.yandex.metrica.impl.ob.sg$a */
    public class a extends AbstractRunnableC3429Km {

        /* renamed from: a */
        public final /* synthetic */ Context f46380a;

        /* renamed from: b */
        public final /* synthetic */ IIdentifierCallback f46381b;

        /* renamed from: c */
        public final /* synthetic */ List f46382c;

        public a(Context context, IIdentifierCallback iIdentifierCallback, List list) {
            this.f46380a = context;
            this.f46381b = iIdentifierCallback;
            this.f46382c = list;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractRunnableC3429Km
        /* renamed from: a */
        public void mo18463a() throws Exception {
            C4316tg c4316tg = C4290sg.this.f46374a;
            Context context = this.f46380a;
            Objects.requireNonNull(c4316tg);
            C4095l3.m20318a(context).m20337a(this.f46381b, this.f46382c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$b */
    public class b extends AbstractCallableC3404Jm<String> {
        public b() {
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractCallableC3404Jm
        /* renamed from: a */
        public String mo18416a() throws Exception {
            Objects.requireNonNull(C4290sg.this.f46374a);
            C4095l3 m20332k = C4095l3.m20332k();
            if (m20332k == null) {
                return null;
            }
            return m20332k.m20345e().mo19807a();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$c */
    public class c extends AbstractCallableC3404Jm<Boolean> {
        public c() {
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractCallableC3404Jm
        /* renamed from: a */
        public Boolean mo18416a() throws Exception {
            Objects.requireNonNull(C4290sg.this.f46374a);
            C4095l3 m20332k = C4095l3.m20332k();
            if (m20332k == null) {
                return null;
            }
            return m20332k.m20345e().mo19810b();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$d */
    public class d extends AbstractRunnableC3429Km {

        /* renamed from: a */
        public final /* synthetic */ int f46386a;

        /* renamed from: b */
        public final /* synthetic */ String f46387b;

        /* renamed from: c */
        public final /* synthetic */ String f46388c;

        /* renamed from: d */
        public final /* synthetic */ Map f46389d;

        public d(int i2, String str, String str2, Map map) {
            this.f46386a = i2;
            this.f46387b = str;
            this.f46388c = str2;
            this.f46389d = map;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractRunnableC3429Km
        /* renamed from: a */
        public void mo18463a() throws Exception {
            C4290sg.m20701b(C4290sg.this).mo18343a(this.f46386a, this.f46387b, this.f46388c, this.f46389d);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$e */
    public class e extends AbstractRunnableC3429Km {
        public e() {
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractRunnableC3429Km
        /* renamed from: a */
        public void mo18463a() throws Exception {
            C4290sg.m20701b(C4290sg.this).sendEventsBuffer();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$f */
    public class f extends AbstractRunnableC3429Km {

        /* renamed from: a */
        public final /* synthetic */ boolean f46392a;

        public f(boolean z) {
            this.f46392a = z;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractRunnableC3429Km
        /* renamed from: a */
        public void mo18463a() throws Exception {
            C4316tg c4316tg = C4290sg.this.f46374a;
            boolean z = this.f46392a;
            Objects.requireNonNull(c4316tg);
            C4095l3.m20324b(z);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$g */
    public class g extends AbstractRunnableC3429Km {

        /* renamed from: a */
        public final /* synthetic */ C4484p.Ucc f46394a;

        /* renamed from: b */
        public final /* synthetic */ boolean f46395b;

        /* renamed from: com.yandex.metrica.impl.ob.sg$g$a */
        public class a implements InterfaceC3528Ol {
            public a() {
            }

            @Override // com.yandex.metrica.impl.p023ob.InterfaceC3528Ol
            public void onError(@NonNull String str) {
                g.this.f46394a.onError(str);
            }

            @Override // com.yandex.metrica.impl.p023ob.InterfaceC3528Ol
            public void onResult(@NonNull JSONObject jSONObject) {
                g.this.f46394a.onResult(jSONObject);
            }
        }

        public g(C4484p.Ucc ucc, boolean z) {
            this.f46394a = ucc;
            this.f46395b = z;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractRunnableC3429Km
        /* renamed from: a */
        public void mo18463a() throws Exception {
            C4290sg.m20701b(C4290sg.this).mo18453a(new a(), this.f46395b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$h */
    public class h extends AbstractRunnableC3429Km {

        /* renamed from: a */
        public final /* synthetic */ Context f46398a;

        /* renamed from: b */
        public final /* synthetic */ Map f46399b;

        public h(Context context, Map map) {
            this.f46398a = context;
            this.f46399b = map;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractRunnableC3429Km
        /* renamed from: a */
        public void mo18463a() throws Exception {
            C4316tg c4316tg = C4290sg.this.f46374a;
            Context context = this.f46398a;
            Objects.requireNonNull(c4316tg);
            C4095l3.m20318a(context).m20338a(this.f46399b);
        }
    }

    public C4290sg(@NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull C4316tg c4316tg) {
        this(interfaceExecutorC4297sn, c4316tg, new C4134mg(c4316tg), new C4272ro(new C4246qo("Context")), new C4272ro(new C4246qo("Event name")), new C3554Pm());
    }

    @Nullable
    /* renamed from: b */
    public Future<String> m20710b() {
        return ((C4271rn) this.f46375b).m20671a(new b());
    }

    @Nullable
    /* renamed from: c */
    public Future<Boolean> m20712c() {
        return ((C4271rn) this.f46375b).m20671a(new c());
    }

    @Nullable
    /* renamed from: d */
    public String m20713d(@NonNull Context context) {
        this.f46377d.mo18360a(context);
        Objects.requireNonNull(this.f46374a);
        return C4095l3.m20318a(context).m20334a();
    }

    public C4290sg(@NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull C4316tg c4316tg, @NonNull C4134mg c4134mg, @NonNull InterfaceC4350uo<Context> interfaceC4350uo, @NonNull InterfaceC4350uo<String> interfaceC4350uo2, @NonNull C3554Pm c3554Pm) {
        this.f46374a = c4316tg;
        this.f46375b = interfaceExecutorC4297sn;
        this.f46376c = c4134mg;
        this.f46377d = interfaceC4350uo;
        this.f46378e = interfaceC4350uo2;
        this.f46379f = c3554Pm;
    }

    /* renamed from: a */
    public void m20704a(@NonNull Context context, @NonNull IIdentifierCallback iIdentifierCallback, @NonNull List<String> list) {
        this.f46377d.mo18360a(context);
        ((C4271rn) this.f46375b).execute(new a(context, iIdentifierCallback, list));
    }

    @Nullable
    /* renamed from: b */
    public String m20709b(@NonNull Context context) {
        this.f46377d.mo18360a(context);
        Objects.requireNonNull(this.f46374a);
        return C4095l3.m20318a(context).m20342c();
    }

    @NonNull
    /* renamed from: c */
    public String m20711c(@NonNull Context context) {
        this.f46377d.mo18360a(context);
        return context.getPackageName();
    }

    /* renamed from: a */
    public boolean m20708a() {
        Objects.requireNonNull(this.f46374a);
        return C4095l3.m20329h();
    }

    /* renamed from: d */
    public void m20714d() {
        this.f46376c.mo18360a(null);
        ((C4271rn) this.f46375b).execute(new e());
    }

    /* renamed from: b */
    public static InterfaceC3656U0 m20701b(C4290sg c4290sg) {
        Objects.requireNonNull(c4290sg.f46374a);
        return C4095l3.m20332k().m20344d().m20774b();
    }

    @NonNull
    /* renamed from: a */
    public String m20702a(Context context) {
        this.f46377d.mo18360a(context);
        return this.f46379f.m18769a(context) ? new CellularNetworkInfo(context).getCelluralInfo() : "";
    }

    /* renamed from: a */
    public void m20703a(int i2, @NonNull String str, @Nullable String str2, @Nullable Map<String, String> map) {
        this.f46376c.mo18360a(null);
        this.f46378e.mo18360a(str);
        ((C4271rn) this.f46375b).execute(new d(i2, str, str2, map));
    }

    /* renamed from: a */
    public void m20706a(@NonNull Context context, boolean z) {
        this.f46377d.mo18360a(context);
        ((C4271rn) this.f46375b).execute(new f(z));
    }

    /* renamed from: a */
    public void m20707a(@NonNull C4484p.Ucc ucc, boolean z) {
        Objects.requireNonNull(this.f46374a);
        if (!C4095l3.m20330i()) {
            ucc.onError("Main API key is not activated");
            return;
        }
        ((C4271rn) this.f46375b).execute(new g(ucc, z));
    }

    /* renamed from: a */
    public void m20705a(@NonNull Context context, @Nullable Map<String, Object> map) {
        this.f46377d.mo18360a(context);
        ((C4271rn) this.f46375b).execute(new h(context, map));
    }
}
