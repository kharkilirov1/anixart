package com.yandex.metrica.impl.p023ob;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.util.Log;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.C3130i;
import com.yandex.metrica.C4481j;
import com.yandex.metrica.C4483l;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.impl.p023ob.C4429y;
import com.yandex.metrica.profile.UserProfile;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.vg */
/* loaded from: classes2.dex */
public final class C4368vg extends C4160ng {

    /* renamed from: i */
    @NonNull
    private final C4264rg f46710i;

    /* renamed from: j */
    private final C4446yg f46711j;

    /* renamed from: k */
    private final C4420xg f46712k;

    /* renamed from: l */
    @NonNull
    private final C3359I2 f46713l;

    /* renamed from: com.yandex.metrica.impl.ob.vg$A */
    public class A implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C4429y.c f46714a;

        public A(C4429y.c cVar) {
            this.f46714a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4368vg.m20945a(C4368vg.this).mo18455a(this.f46714a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$B */
    public class B implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f46716a;

        public B(String str) {
            this.f46716a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4368vg.m20945a(C4368vg.this).reportEvent(this.f46716a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$C */
    public class C implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f46718a;

        /* renamed from: b */
        public final /* synthetic */ String f46719b;

        public C(String str, String str2) {
            this.f46718a = str;
            this.f46719b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4368vg.m20945a(C4368vg.this).reportEvent(this.f46718a, this.f46719b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$D */
    public class D implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f46721a;

        /* renamed from: b */
        public final /* synthetic */ List f46722b;

        public D(String str, List list) {
            this.f46721a = str;
            this.f46722b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4368vg.m20945a(C4368vg.this).reportEvent(this.f46721a, C3658U2.m19205a(this.f46722b));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$E */
    public class E implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f46724a;

        /* renamed from: b */
        public final /* synthetic */ Throwable f46725b;

        public E(String str, Throwable th) {
            this.f46724a = str;
            this.f46725b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4368vg.m20945a(C4368vg.this).reportError(this.f46724a, this.f46725b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$a, reason: case insensitive filesystem */
    public class RunnableC7025a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f46727a;

        /* renamed from: b */
        public final /* synthetic */ String f46728b;

        /* renamed from: c */
        public final /* synthetic */ Throwable f46729c;

        public RunnableC7025a(String str, String str2, Throwable th) {
            this.f46727a = str;
            this.f46728b = str2;
            this.f46729c = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4368vg.m20945a(C4368vg.this).reportError(this.f46727a, this.f46728b, this.f46729c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$b, reason: case insensitive filesystem */
    public class RunnableC7026b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Throwable f46731a;

        public RunnableC7026b(Throwable th) {
            this.f46731a = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4368vg.m20945a(C4368vg.this).reportUnhandledException(this.f46731a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$c, reason: case insensitive filesystem */
    public class RunnableC7027c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f46733a;

        public RunnableC7027c(String str) {
            this.f46733a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4368vg.m20945a(C4368vg.this).mo18353c(this.f46733a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$d, reason: case insensitive filesystem */
    public class RunnableC7028d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Intent f46735a;

        public RunnableC7028d(Intent intent) {
            this.f46735a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4368vg.m20947c(C4368vg.this).m20773a().m20611a(this.f46735a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$e, reason: case insensitive filesystem */
    public class RunnableC7029e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f46737a;

        public RunnableC7029e(String str) {
            this.f46737a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4368vg.m20947c(C4368vg.this).m20773a().m20612a(this.f46737a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$f */
    public class f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Intent f46739a;

        public f(Intent intent) {
            this.f46739a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4368vg.m20947c(C4368vg.this).m20773a().m20611a(this.f46739a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$g */
    public class g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f46741a;

        public g(String str) {
            this.f46741a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4368vg.m20945a(C4368vg.this).mo18456a(this.f46741a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$h */
    public class h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Location f46743a;

        public h(Location location) {
            this.f46743a = location;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4316tg m20461e = C4368vg.this.m20461e();
            Location location = this.f46743a;
            Objects.requireNonNull(m20461e);
            C4095l3.m20319a(location);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$i */
    public class i implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ boolean f46745a;

        public i(boolean z) {
            this.f46745a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4316tg m20461e = C4368vg.this.m20461e();
            boolean z = this.f46745a;
            Objects.requireNonNull(m20461e);
            C4095l3.m20322a(z);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$j */
    public class j implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ boolean f46747a;

        public j(boolean z) {
            this.f46747a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4316tg m20461e = C4368vg.this.m20461e();
            boolean z = this.f46747a;
            Objects.requireNonNull(m20461e);
            C4095l3.m20322a(z);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$k */
    public class k implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f46749a;

        /* renamed from: b */
        public final /* synthetic */ YandexMetricaConfig f46750b;

        /* renamed from: c */
        public final /* synthetic */ C4483l f46751c;

        public k(Context context, YandexMetricaConfig yandexMetricaConfig, C4483l c4483l) {
            this.f46749a = context;
            this.f46750b = yandexMetricaConfig;
            this.f46751c = c4483l;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4316tg m20461e = C4368vg.this.m20461e();
            Context context = this.f46749a;
            Objects.requireNonNull(m20461e);
            C4095l3.m20318a(context).m20340b(this.f46750b, C4368vg.this.m20459c().m20853a(this.f46751c));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$l */
    public class l implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ boolean f46753a;

        public l(boolean z) {
            this.f46753a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4316tg m20461e = C4368vg.this.m20461e();
            boolean z = this.f46753a;
            Objects.requireNonNull(m20461e);
            C4095l3.m20326c(z);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$m */
    public class m implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f46755a;

        public m(String str) {
            this.f46755a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4316tg m20461e = C4368vg.this.m20461e();
            String str = this.f46755a;
            Objects.requireNonNull(m20461e);
            C4095l3.m20320a(str);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$n */
    public class n implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ UserProfile f46757a;

        public n(UserProfile userProfile) {
            this.f46757a = userProfile;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4368vg.m20945a(C4368vg.this).reportUserProfile(this.f46757a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$o */
    public class o implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Revenue f46759a;

        public o(Revenue revenue) {
            this.f46759a = revenue;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4368vg.m20945a(C4368vg.this).reportRevenue(this.f46759a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$p */
    public class p implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ECommerceEvent f46761a;

        public p(ECommerceEvent eCommerceEvent) {
            this.f46761a = eCommerceEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4368vg.m20945a(C4368vg.this).reportECommerce(this.f46761a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$q */
    public class q implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ DeferredDeeplinkParametersListener f46763a;

        public q(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
            this.f46763a = deferredDeeplinkParametersListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            Objects.requireNonNull(C4368vg.this.m20461e());
            C4095l3.m20332k().m20336a(this.f46763a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$r */
    public class r implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ DeferredDeeplinkListener f46765a;

        public r(DeferredDeeplinkListener deferredDeeplinkListener) {
            this.f46765a = deferredDeeplinkListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            Objects.requireNonNull(C4368vg.this.m20461e());
            C4095l3.m20332k().m20335a(this.f46765a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$s */
    public class s implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AppMetricaDeviceIDListener f46767a;

        public s(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
            this.f46767a = appMetricaDeviceIDListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            Objects.requireNonNull(C4368vg.this.m20461e());
            C4095l3.m20332k().m20339b(this.f46767a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$t */
    public class t implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f46769a;

        /* renamed from: b */
        public final /* synthetic */ String f46770b;

        public t(String str, String str2) {
            this.f46769a = str;
            this.f46770b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4316tg m20461e = C4368vg.this.m20461e();
            String str = this.f46769a;
            String str2 = this.f46770b;
            Objects.requireNonNull(m20461e);
            C4095l3.m20321a(str, str2);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$u */
    public class u implements Runnable {
        public u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4368vg.m20945a(C4368vg.this).mo18454a(C4368vg.this.m20464h());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$v */
    public class v implements Runnable {
        public v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4368vg.m20945a(C4368vg.this).sendEventsBuffer();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$w */
    public class w implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f46774a;

        /* renamed from: b */
        public final /* synthetic */ String f46775b;

        public w(String str, String str2) {
            this.f46774a = str;
            this.f46775b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4368vg.m20945a(C4368vg.this).mo18347a(this.f46774a, this.f46775b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$x */
    public class x implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f46777a;

        public x(String str) {
            this.f46777a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4368vg.m20945a(C4368vg.this).mo18352b(this.f46777a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$y */
    public class y implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Activity f46779a;

        public y(Activity activity) {
            this.f46779a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4368vg.this.f46713l.m18249b(this.f46779a, C4368vg.m20945a(C4368vg.this));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$z */
    public class z implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Activity f46781a;

        public z(Activity activity) {
            this.f46781a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4368vg.this.f46713l.m18247a(this.f46781a, C4368vg.m20945a(C4368vg.this));
        }
    }

    public C4368vg(@NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        this(new C4316tg(), interfaceExecutorC4297sn, new C4446yg(), new C4420xg(), new C3733X2());
    }

    /* renamed from: a */
    public void m20952a(@NonNull Context context, @NonNull YandexMetricaConfig yandexMetricaConfig) {
        this.f46711j.m21213a(context, yandexMetricaConfig);
        C4483l m21151a = this.f46712k.m21151a(yandexMetricaConfig instanceof C4483l ? (C4483l) yandexMetricaConfig : new C4483l(yandexMetricaConfig));
        C4481j m20463g = m20463g();
        Objects.requireNonNull(m20463g);
        m20463g.f47163e.m20042a(context);
        Boolean bool = m21151a.sessionsAutoTrackingEnabled;
        Boolean bool2 = Boolean.TRUE;
        if (bool == null) {
            bool = bool2;
        }
        if (bool.booleanValue()) {
            m20463g.f47162d.m18246a(true);
        }
        Objects.requireNonNull(m20463g.f47159a);
        C4095l3.m20318a(context).m20341b(m21151a);
        ((C4271rn) m20460d()).execute(new k(context, yandexMetricaConfig, m21151a));
        Objects.requireNonNull(m20461e());
        C4095l3.m20331j();
    }

    /* renamed from: c */
    public void m20974c(@Nullable Activity activity) {
        m20457a().mo18360a(null);
        Objects.requireNonNull(this.f46711j);
        Objects.requireNonNull(m20463g());
        ((C4271rn) m20460d()).execute(new y(activity));
    }

    /* renamed from: d */
    public void m20977d(@NonNull String str) {
        m20457a().mo18360a(null);
        this.f46711j.m21223c(str);
        Objects.requireNonNull(m20463g());
        ((C4271rn) m20460d()).execute(new RunnableC7027c(str));
    }

    /* renamed from: e */
    public void m20978e(@NonNull String str) {
        m20457a().mo18360a(null);
        this.f46711j.m21220a(str);
        ((C4271rn) m20460d()).execute(new g(str));
    }

    /* renamed from: f */
    public void m20979f(@Nullable String str) {
        Objects.requireNonNull(this.f46711j);
        Objects.requireNonNull(m20463g());
        ((C4271rn) m20460d()).execute(new m(str));
    }

    /* renamed from: i */
    public void m20980i() {
        m20457a().mo18360a(null);
        Objects.requireNonNull(this.f46711j);
        Objects.requireNonNull(m20463g());
        ((C4271rn) m20460d()).execute(new v());
    }

    private C4368vg(@NonNull C4316tg c4316tg, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull C4446yg c4446yg, @NonNull C4420xg c4420xg, @NonNull C3733X2 c3733x2) {
        this(c4316tg, interfaceExecutorC4297sn, c4446yg, c4420xg, new C4134mg(c4316tg), new C4264rg(c4316tg), c3733x2, new C4481j(c4316tg, c3733x2), C4238qg.m20589a(), C3755Y.m19410g().m19416f(), C3755Y.m19410g().m19420k(), C3755Y.m19410g().m19415e());
    }

    /* renamed from: b */
    public void m20972b(@NonNull String str) {
        m20457a().mo18360a(null);
        this.f46711j.reportEvent(str);
        Objects.requireNonNull(m20463g());
        ((C4271rn) m20460d()).execute(new B(str));
    }

    @VisibleForTesting
    public C4368vg(@NonNull C4316tg c4316tg, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull C4446yg c4446yg, @NonNull C4420xg c4420xg, @NonNull C4134mg c4134mg, @NonNull C4264rg c4264rg, @NonNull C3733X2 c3733x2, @NonNull C4481j c4481j, @NonNull C4238qg c4238qg, @NonNull C4326u0 c4326u0, @NonNull C3359I2 c3359i2, @NonNull C4014i0 c4014i0) {
        super(c4316tg, interfaceExecutorC4297sn, c4134mg, c3733x2, c4481j, c4238qg, c4326u0, c4014i0);
        this.f46712k = c4420xg;
        this.f46711j = c4446yg;
        this.f46710i = c4264rg;
        this.f46713l = c3359i2;
    }

    /* renamed from: b */
    public void m20973b(@NonNull String str, @Nullable String str2) {
        m20457a().mo18360a(null);
        this.f46711j.reportEvent(str, str2);
        Objects.requireNonNull(m20463g());
        ((C4271rn) m20460d()).execute(new C(str, str2));
    }

    /* renamed from: c */
    public void m20976c(@NonNull String str, @Nullable String str2) {
        m20457a().mo18360a(null);
        if (!this.f46711j.m21226f(str)) {
            Log.w("AppMetrica", "Impossible to report event because parameters are invalid.");
            return;
        }
        Objects.requireNonNull(m20463g());
        ((C4271rn) m20460d()).execute(new w(str, str2));
    }

    /* renamed from: b */
    public void m20970b(@NonNull Activity activity) {
        Intent intent = null;
        m20457a().mo18360a(null);
        this.f46711j.m21222c(activity);
        Objects.requireNonNull(m20463g());
        if (activity != null) {
            try {
                intent = activity.getIntent();
            } catch (Throwable unused) {
            }
        }
        ((C4271rn) m20460d()).execute(new RunnableC7028d(intent));
    }

    /* renamed from: c */
    public void m20975c(@NonNull String str) {
        if (this.f46710i.m20662a().m20772b() && this.f46711j.m21227g(str)) {
            Objects.requireNonNull(m20463g());
            ((C4271rn) m20460d()).execute(new x(str));
        }
    }

    /* renamed from: c */
    public static C4301t1 m20947c(C4368vg c4368vg) {
        Objects.requireNonNull(c4368vg.m20461e());
        return C4095l3.m20332k().m20344d();
    }

    /* renamed from: a */
    public void m20949a(@Nullable Activity activity) {
        m20457a().mo18360a(null);
        Objects.requireNonNull(this.f46711j);
        Objects.requireNonNull(m20463g());
        ((C4271rn) m20460d()).execute(new z(activity));
    }

    /* renamed from: b */
    public void m20971b(@NonNull Context context, boolean z2) {
        this.f46711j.m21221b(context);
        m20463g().f47163e.m20042a(context);
        ((C4271rn) m20460d()).execute(new l(z2));
    }

    /* renamed from: a */
    public void m20950a(@NonNull Application application) {
        m20457a().mo18360a(null);
        this.f46711j.m21210a(application);
        C4481j m20463g = m20463g();
        m20463g.f47161c.m21168a(application);
        C4429y.c m18246a = m20463g.f47162d.m18246a(false);
        ((C4271rn) m20460d()).execute(new A(m18246a));
    }

    /* renamed from: a */
    public void m20967a(@NonNull String str, @Nullable Map<String, Object> map) {
        m20457a().mo18360a(null);
        this.f46711j.reportEvent(str, map);
        Objects.requireNonNull(m20463g());
        List m19203a = C3658U2.m19203a((Map) map);
        ((C4271rn) m20460d()).execute(new D(str, m19203a));
    }

    /* renamed from: a */
    public void m20966a(@NonNull String str, @Nullable Throwable th) {
        m20457a().mo18360a(null);
        this.f46711j.reportError(str, th);
        Objects.requireNonNull(m20463g());
        if (th == null) {
            th = new C3612S6();
            th.fillInStackTrace();
        }
        ((C4271rn) m20460d()).execute(new E(str, th));
    }

    /* renamed from: a */
    public void m20965a(@NonNull String str, @Nullable String str2, @Nullable Throwable th) {
        m20457a().mo18360a(null);
        this.f46711j.reportError(str, str2, th);
        ((C4271rn) m20460d()).execute(new RunnableC7025a(str, str2, th));
    }

    /* renamed from: a */
    public void m20968a(@NonNull Throwable th) {
        m20457a().mo18360a(null);
        this.f46711j.reportUnhandledException(th);
        Objects.requireNonNull(m20463g());
        ((C4271rn) m20460d()).execute(new RunnableC7026b(th));
    }

    /* renamed from: a */
    public void m20963a(@NonNull String str) {
        m20457a().mo18360a(null);
        this.f46711j.m21225e(str);
        Objects.requireNonNull(m20463g());
        ((C4271rn) m20460d()).execute(new RunnableC7029e(str));
    }

    /* renamed from: a */
    public void m20954a(@NonNull Intent intent) {
        m20457a().mo18360a(null);
        this.f46711j.m21215a(intent);
        Objects.requireNonNull(m20463g());
        ((C4271rn) m20460d()).execute(new f(intent));
    }

    /* renamed from: a */
    public void m20955a(@Nullable Location location) {
        Objects.requireNonNull(this.f46711j);
        Objects.requireNonNull(m20463g());
        ((C4271rn) m20460d()).execute(new h(location));
    }

    /* renamed from: a */
    public void m20969a(boolean z2) {
        Objects.requireNonNull(this.f46711j);
        Objects.requireNonNull(m20463g());
        ((C4271rn) m20460d()).execute(new i(z2));
    }

    /* renamed from: a */
    public void m20953a(@NonNull Context context, boolean z2) {
        this.f46711j.m21211a(context);
        m20463g().f47163e.m20042a(context);
        ((C4271rn) m20460d()).execute(new j(z2));
    }

    /* renamed from: a */
    public void m20962a(@NonNull UserProfile userProfile) {
        m20457a().mo18360a(null);
        this.f46711j.reportUserProfile(userProfile);
        Objects.requireNonNull(m20463g());
        ((C4271rn) m20460d()).execute(new n(userProfile));
    }

    /* renamed from: a */
    public void m20960a(@NonNull Revenue revenue) {
        m20457a().mo18360a(null);
        this.f46711j.reportRevenue(revenue);
        Objects.requireNonNull(m20463g());
        ((C4271rn) m20460d()).execute(new o(revenue));
    }

    /* renamed from: a */
    public void m20961a(@NonNull ECommerceEvent eCommerceEvent) {
        m20457a().mo18360a(null);
        this.f46711j.reportECommerce(eCommerceEvent);
        Objects.requireNonNull(m20463g());
        ((C4271rn) m20460d()).execute(new p(eCommerceEvent));
    }

    /* renamed from: a */
    public void m20959a(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        m20457a().mo18360a(null);
        this.f46711j.m21219a(deferredDeeplinkParametersListener);
        Objects.requireNonNull(m20463g());
        ((C4271rn) m20460d()).execute(new q(deferredDeeplinkParametersListener));
    }

    /* renamed from: a */
    public void m20958a(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        m20457a().mo18360a(null);
        this.f46711j.m21218a(deferredDeeplinkListener);
        Objects.requireNonNull(m20463g());
        ((C4271rn) m20460d()).execute(new r(deferredDeeplinkListener));
    }

    /* renamed from: a */
    public void m20957a(@NonNull AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        m20457a().mo18360a(null);
        this.f46711j.m21217a(appMetricaDeviceIDListener);
        Objects.requireNonNull(m20463g());
        ((C4271rn) m20460d()).execute(new s(appMetricaDeviceIDListener));
    }

    @NonNull
    /* renamed from: a */
    public IReporter m20948a(@NonNull Context context, @NonNull String str) {
        this.f46711j.m21214a(context, str);
        m20458b().m20042a(context);
        return m20462f().m20593a(context, str);
    }

    /* renamed from: a */
    public void m20951a(@NonNull Context context, @NonNull ReporterConfig reporterConfig) {
        this.f46711j.m21212a(context, reporterConfig);
        C3130i c3130i = new C3130i(reporterConfig);
        m20463g().f47163e.m20042a(context);
        m20462f().m20592a(context, c3130i);
    }

    /* renamed from: a */
    public void m20964a(@NonNull String str, @Nullable String str2) {
        this.f46711j.m21224d(str);
        Objects.requireNonNull(m20463g());
        ((C4271rn) m20460d()).execute(new t(str, str2));
    }

    /* renamed from: a */
    public void m20956a(@NonNull WebView webView) {
        m20457a().mo18360a(null);
        this.f46711j.m21216a(webView);
        m20463g().f47160b.m19379a(webView, this);
        ((C4271rn) m20460d()).execute(new u());
    }

    /* renamed from: a */
    public static InterfaceC3656U0 m20945a(C4368vg c4368vg) {
        Objects.requireNonNull(c4368vg.m20461e());
        return C4095l3.m20332k().m20344d().m20774b();
    }
}
