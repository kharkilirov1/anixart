package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.C3130i;
import com.yandex.metrica.C4481j;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.pg */
/* loaded from: classes2.dex */
public class C4212pg implements InterfaceC3706W0 {

    /* renamed from: a */
    @NonNull
    private final C4316tg f46143a;

    /* renamed from: b */
    @NonNull
    private final C3198Bg f46144b;

    /* renamed from: c */
    @NonNull
    private final InterfaceExecutorC4297sn f46145c;

    /* renamed from: d */
    @NonNull
    private final Context f46146d;

    /* renamed from: e */
    @NonNull
    private final C4420xg f46147e;

    /* renamed from: f */
    @NonNull
    private final C3130i f46148f;

    /* renamed from: g */
    @NonNull
    private final C4481j f46149g;

    /* renamed from: h */
    @NonNull
    private final C4186og f46150h;

    /* renamed from: com.yandex.metrica.impl.ob.pg$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f46151a;

        /* renamed from: b */
        public final /* synthetic */ String f46152b;

        public a(String str, String str2) {
            this.f46151a = str;
            this.f46152b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4212pg.this.m20554a().mo17792b(this.f46151a, this.f46152b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$b */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f46154a;

        /* renamed from: b */
        public final /* synthetic */ String f46155b;

        public b(String str, String str2) {
            this.f46154a = str;
            this.f46155b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4212pg.this.m20554a().mo17793d(this.f46154a, this.f46155b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$c */
    public class c implements InterfaceC3778Ym<InterfaceC3706W0> {

        /* renamed from: a */
        public final /* synthetic */ C4316tg f46157a;

        /* renamed from: b */
        public final /* synthetic */ Context f46158b;

        /* renamed from: c */
        public final /* synthetic */ C3130i f46159c;

        public c(C4316tg c4316tg, Context context, C3130i c3130i) {
            this.f46157a = c4316tg;
            this.f46158b = context;
            this.f46159c = c3130i;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3778Ym
        /* renamed from: a */
        public InterfaceC3706W0 mo19487a() {
            C4316tg c4316tg = this.f46157a;
            Context context = this.f46158b;
            C3130i c3130i = this.f46159c;
            Objects.requireNonNull(c4316tg);
            return C4095l3.m20318a(context).m20333a(c3130i);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$d */
    public class d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f46160a;

        public d(String str) {
            this.f46160a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4212pg.this.m20554a().reportEvent(this.f46160a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$e */
    public class e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f46162a;

        /* renamed from: b */
        public final /* synthetic */ String f46163b;

        public e(String str, String str2) {
            this.f46162a = str;
            this.f46163b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4212pg.this.m20554a().reportEvent(this.f46162a, this.f46163b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$f */
    public class f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f46165a;

        /* renamed from: b */
        public final /* synthetic */ List f46166b;

        public f(String str, List list) {
            this.f46165a = str;
            this.f46166b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4212pg.this.m20554a().reportEvent(this.f46165a, C3658U2.m19205a(this.f46166b));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$g */
    public class g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f46168a;

        /* renamed from: b */
        public final /* synthetic */ Throwable f46169b;

        public g(String str, Throwable th) {
            this.f46168a = str;
            this.f46169b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4212pg.this.m20554a().reportError(this.f46168a, this.f46169b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$h */
    public class h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f46171a;

        /* renamed from: b */
        public final /* synthetic */ String f46172b;

        /* renamed from: c */
        public final /* synthetic */ Throwable f46173c;

        public h(String str, String str2, Throwable th) {
            this.f46171a = str;
            this.f46172b = str2;
            this.f46173c = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4212pg.this.m20554a().reportError(this.f46171a, this.f46172b, this.f46173c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$i */
    public class i implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Throwable f46175a;

        public i(Throwable th) {
            this.f46175a = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4212pg.this.m20554a().reportUnhandledException(this.f46175a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$j */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4212pg.this.m20554a().resumeSession();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$k */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4212pg.this.m20554a().pauseSession();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$l */
    public class l implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f46179a;

        public l(String str) {
            this.f46179a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4212pg.this.m20554a().setUserProfileID(this.f46179a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$m */
    public class m implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C4203p7 f46181a;

        public m(C4203p7 c4203p7) {
            this.f46181a = c4203p7;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4212pg.this.m20554a().mo18346a(this.f46181a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$n */
    public class n implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ UserProfile f46183a;

        public n(UserProfile userProfile) {
            this.f46183a = userProfile;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4212pg.this.m20554a().reportUserProfile(this.f46183a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$o */
    public class o implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Revenue f46185a;

        public o(Revenue revenue) {
            this.f46185a = revenue;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4212pg.this.m20554a().reportRevenue(this.f46185a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$p */
    public class p implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ECommerceEvent f46187a;

        public p(ECommerceEvent eCommerceEvent) {
            this.f46187a = eCommerceEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4212pg.this.m20554a().reportECommerce(this.f46187a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$q */
    public class q implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ boolean f46189a;

        public q(boolean z) {
            this.f46189a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4212pg.this.m20554a().setStatisticsSending(this.f46189a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$r */
    public class r implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C3130i f46191a;

        public r(C3130i c3130i) {
            this.f46191a = c3130i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4212pg.m20553a(C4212pg.this, this.f46191a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$s */
    public class s implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C3130i f46193a;

        public s(C3130i c3130i) {
            this.f46193a = c3130i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4212pg.m20553a(C4212pg.this, this.f46193a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$t */
    public class t implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C3917e7 f46195a;

        public t(C3917e7 c3917e7) {
            this.f46195a = c3917e7;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4212pg.this.m20554a().mo18344a(this.f46195a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$u */
    public class u implements Runnable {
        public u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4212pg.this.m20554a().mo18350b();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$v */
    public class v implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f46198a;

        /* renamed from: b */
        public final /* synthetic */ JSONObject f46199b;

        public v(String str, JSONObject jSONObject) {
            this.f46198a = str;
            this.f46199b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4212pg.this.m20554a().mo18348a(this.f46198a, this.f46199b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$w */
    public class w implements Runnable {
        public w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4212pg.this.m20554a().sendEventsBuffer();
        }
    }

    public C4212pg(@NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull Context context, @NonNull String str) {
        this(interfaceExecutorC4297sn, context.getApplicationContext(), str, new C4316tg());
    }

    @NonNull
    @WorkerThread
    /* renamed from: a */
    public final InterfaceC3706W0 m20554a() {
        C4316tg c4316tg = this.f46143a;
        Context context = this.f46146d;
        C3130i c3130i = this.f46148f;
        Objects.requireNonNull(c4316tg);
        return C4095l3.m20318a(context).m20333a(c3130i);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3706W0
    /* renamed from: b */
    public void mo18350b() {
        Objects.requireNonNull(this.f46149g);
        ((C4271rn) this.f46145c).execute(new u());
    }

    /* renamed from: d */
    public void m20556d(@NonNull String str) {
        C3130i c3130i = new C3130i(new C3130i.a(str));
        Objects.requireNonNull(this.f46149g);
        ((C4271rn) this.f46145c).execute(new r(c3130i));
    }

    @Override // com.yandex.metrica.IReporter
    @NonNull
    public IPluginReporter getPluginExtension() {
        return this.f46150h;
    }

    @Override // com.yandex.metrica.IReporter
    public void pauseSession() {
        Objects.requireNonNull(this.f46144b);
        Objects.requireNonNull(this.f46149g);
        ((C4271rn) this.f46145c).execute(new k());
    }

    @Override // com.yandex.metrica.IReporter
    public void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        this.f46144b.reportECommerce(eCommerceEvent);
        Objects.requireNonNull(this.f46149g);
        ((C4271rn) this.f46145c).execute(new p(eCommerceEvent));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@NonNull String str, @Nullable Throwable th) {
        this.f46144b.reportError(str, th);
        Objects.requireNonNull(this.f46149g);
        if (th == null) {
            th = new C3612S6();
            th.fillInStackTrace();
        }
        ((C4271rn) this.f46145c).execute(new g(str, th));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@NonNull String str) {
        this.f46144b.reportEvent(str);
        Objects.requireNonNull(this.f46149g);
        ((C4271rn) this.f46145c).execute(new d(str));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportRevenue(@NonNull Revenue revenue) {
        this.f46144b.reportRevenue(revenue);
        Objects.requireNonNull(this.f46149g);
        ((C4271rn) this.f46145c).execute(new o(revenue));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUnhandledException(@NonNull Throwable th) {
        this.f46144b.reportUnhandledException(th);
        Objects.requireNonNull(this.f46149g);
        ((C4271rn) this.f46145c).execute(new i(th));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUserProfile(@NonNull UserProfile userProfile) {
        this.f46144b.reportUserProfile(userProfile);
        Objects.requireNonNull(this.f46149g);
        ((C4271rn) this.f46145c).execute(new n(userProfile));
    }

    @Override // com.yandex.metrica.IReporter
    public void resumeSession() {
        Objects.requireNonNull(this.f46144b);
        Objects.requireNonNull(this.f46149g);
        ((C4271rn) this.f46145c).execute(new j());
    }

    @Override // com.yandex.metrica.IReporter
    public void sendEventsBuffer() {
        Objects.requireNonNull(this.f46144b);
        Objects.requireNonNull(this.f46149g);
        ((C4271rn) this.f46145c).execute(new w());
    }

    @Override // com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z) {
        Objects.requireNonNull(this.f46144b);
        Objects.requireNonNull(this.f46149g);
        ((C4271rn) this.f46145c).execute(new q(z));
    }

    @Override // com.yandex.metrica.IReporter
    public void setUserProfileID(@Nullable String str) {
        Objects.requireNonNull(this.f46144b);
        Objects.requireNonNull(this.f46149g);
        ((C4271rn) this.f46145c).execute(new l(str));
    }

    private C4212pg(@NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull Context context, @NonNull String str, @NonNull C4316tg c4316tg) {
        this(interfaceExecutorC4297sn, context, new C3198Bg(), c4316tg, new C4420xg(), new C4481j(c4316tg, new C3733X2()), new C3130i(new C3130i.a(str)));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3706W0, com.yandex.metrica.InterfaceC3126g
    /* renamed from: b */
    public void mo17792b(@Nullable String str, @Nullable String str2) {
        Objects.requireNonNull(this.f46144b);
        Objects.requireNonNull(this.f46149g);
        ((C4271rn) this.f46145c).execute(new a(str, str2));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3833b1
    /* renamed from: a */
    public void mo18346a(@NonNull C4203p7 c4203p7) {
        Objects.requireNonNull(this.f46149g);
        ((C4271rn) this.f46145c).execute(new m(c4203p7));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@NonNull String str, @Nullable String str2) {
        this.f46144b.reportEvent(str, str2);
        Objects.requireNonNull(this.f46149g);
        ((C4271rn) this.f46145c).execute(new e(str, str2));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3706W0, com.yandex.metrica.InterfaceC3126g
    /* renamed from: d */
    public void mo17793d(@NonNull String str, @Nullable String str2) {
        this.f46144b.mo17793d(str, str2);
        Objects.requireNonNull(this.f46149g);
        ((C4271rn) this.f46145c).execute(new b(str, str2));
    }

    private C4212pg(@NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull Context context, @NonNull C3198Bg c3198Bg, @NonNull C4316tg c4316tg, @NonNull C4420xg c4420xg, @NonNull C4481j c4481j, @NonNull C3130i c3130i) {
        this(interfaceExecutorC4297sn, context, c3198Bg, c4316tg, c4420xg, c4481j, c3130i, new C4186og(c3198Bg.m17833a(), c4481j, interfaceExecutorC4297sn, new c(c4316tg, context, c3130i)));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@NonNull String str, @Nullable String str2) {
        reportError(str, str2, null);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3833b1
    /* renamed from: a */
    public void mo18344a(@NonNull C3917e7 c3917e7) {
        Objects.requireNonNull(this.f46149g);
        ((C4271rn) this.f46145c).execute(new t(c3917e7));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th) {
        this.f46144b.reportError(str, str2, th);
        ((C4271rn) this.f46145c).execute(new h(str, str2, th));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        this.f46144b.reportEvent(str, map);
        Objects.requireNonNull(this.f46149g);
        List m19203a = C3658U2.m19203a((Map) map);
        ((C4271rn) this.f46145c).execute(new f(str, m19203a));
    }

    @VisibleForTesting
    public C4212pg(@NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull Context context, @NonNull C3198Bg c3198Bg, @NonNull C4316tg c4316tg, @NonNull C4420xg c4420xg, @NonNull C4481j c4481j, @NonNull C3130i c3130i, @NonNull C4186og c4186og) {
        this.f46145c = interfaceExecutorC4297sn;
        this.f46146d = context;
        this.f46144b = c3198Bg;
        this.f46143a = c4316tg;
        this.f46147e = c4420xg;
        this.f46149g = c4481j;
        this.f46148f = c3130i;
        this.f46150h = c4186og;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3706W0
    /* renamed from: a */
    public void mo18348a(@NonNull String str, @NonNull JSONObject jSONObject) {
        Objects.requireNonNull(this.f46149g);
        ((C4271rn) this.f46145c).execute(new v(str, jSONObject));
    }

    /* renamed from: a */
    public void m20555a(@NonNull C3130i c3130i) {
        C3130i m21150a = this.f46147e.m21150a(c3130i);
        Objects.requireNonNull(this.f46149g);
        ((C4271rn) this.f46145c).execute(new s(m21150a));
    }

    /* renamed from: a */
    public static void m20553a(C4212pg c4212pg, C3130i c3130i) {
        C4316tg c4316tg = c4212pg.f46143a;
        Context context = c4212pg.f46146d;
        Objects.requireNonNull(c4316tg);
        C4095l3.m20318a(context).m20343c(c3130i);
    }
}
