package com.yandex.metrica.impl.p023ob;

import android.app.NotificationManager;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.profile.UserProfile;
import com.yandex.metrica.profile.UserProfileUpdate;
import com.yandex.metrica.rtm.wrapper.InterfaceC4620d;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.J */
/* loaded from: classes2.dex */
public abstract class AbstractC3381J implements InterfaceC3606S0 {

    /* renamed from: n */
    private static final Collection<Integer> f43151n = new HashSet(Arrays.asList(14, 15));

    /* renamed from: o */
    private static final InterfaceC4350uo<C3822ag> f43152o = new a();

    /* renamed from: a */
    public final Context f43153a;

    /* renamed from: b */
    public final C4068k2 f43154b;

    /* renamed from: c */
    @NonNull
    public final C3379Im f43155c;

    /* renamed from: d */
    @NonNull
    public final C4426xm f43156d;

    /* renamed from: e */
    @NonNull
    public final C3289F7 f43157e;

    /* renamed from: f */
    @NonNull
    public final C3164A7 f43158f;

    /* renamed from: g */
    @NonNull
    public final C4333u7 f43159g;

    /* renamed from: h */
    @NonNull
    private final C4281s7 f43160h;

    /* renamed from: i */
    public final C4146n2 f43161i;

    /* renamed from: j */
    private C4093l1 f43162j;

    /* renamed from: k */
    private final InterfaceC3354Hm f43163k;

    /* renamed from: l */
    @NonNull
    private final C3407K0 f43164l;

    /* renamed from: m */
    @NonNull
    private final C3813a7 f43165m;

    /* renamed from: com.yandex.metrica.impl.ob.J$a */
    public class a implements InterfaceC4350uo<C3822ag> {
        @Override // com.yandex.metrica.impl.p023ob.InterfaceC4350uo
        /* renamed from: a */
        public C4298so mo18360a(@NonNull C3822ag c3822ag) {
            return C3658U2.m19215a((Object[]) c3822ag.f44744b) ? C4298so.m20770a(this, "attributes list is empty") : C4298so.m20769a(this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.J$b */
    public static final class b {

        /* renamed from: a */
        private static final InterfaceC4350uo<Revenue> f43166a = new C4454yo();

        /* renamed from: a */
        public static InterfaceC4350uo<Revenue> m18361a() {
            return f43166a;
        }
    }

    public AbstractC3381J(Context context, C4146n2 c4146n2, @NonNull C4068k2 c4068k2, @NonNull C3407K0 c3407k0, @NonNull InterfaceC3354Hm interfaceC3354Hm, @NonNull InterfaceC4620d interfaceC4620d, @NonNull C4395wh c4395wh, @NonNull C3289F7 c3289f7, @NonNull C3164A7 c3164a7, @NonNull C4333u7 c4333u7, @NonNull C4281s7 c4281s7, @NonNull C3813a7 c3813a7) {
        this.f43153a = context.getApplicationContext();
        this.f43161i = c4146n2;
        this.f43154b = c4068k2;
        this.f43164l = c3407k0;
        this.f43157e = c3289f7;
        this.f43158f = c3164a7;
        this.f43159g = c4333u7;
        this.f43160h = c4281s7;
        this.f43165m = c3813a7;
        C3379Im m21313b = AbstractC4478zm.m21313b(c4068k2.m19136b().m17753c());
        this.f43155c = m21313b;
        c4068k2.m20220a(new C3455Ln(m21313b, "Crash Environment"));
        C4426xm m21312a = AbstractC4478zm.m21312a(c4068k2.m19136b().m17753c());
        this.f43156d = m21312a;
        if (C4013i.m20035a(c4068k2.m19136b().f42234b.getAsBoolean("CFG_IS_LOG_ENABLED"))) {
            m21313b.m21339e();
            m21312a.m21339e();
        }
        this.f43163k = interfaceC3354Hm;
    }

    /* renamed from: a */
    public void m18345a(C4093l1 c4093l1) {
        this.f43162j = c4093l1;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3606S0, com.yandex.metrica.impl.p023ob.InterfaceC3706W0, com.yandex.metrica.InterfaceC3126g
    /* renamed from: b */
    public void mo17792b(@Nullable String str, @Nullable String str2) {
        C3379Im c3379Im = this.f43155c;
        List<Integer> list = C3382J0.f43175i;
        this.f43161i.m20420a(new C3605S(str2, str, EnumC4067k1.EVENT_TYPE_STATBOX.m20218b(), 0, c3379Im), this.f43154b);
        if (this.f43155c.m21337c()) {
            StringBuilder sb = new StringBuilder("Statbox event received ");
            sb.append(" with name: ");
            sb.append(m18358f(str));
            sb.append(" with value: ");
            String m18358f = m18358f(str2);
            if (m18358f.length() > 100) {
                sb.append(m18358f.substring(0, 100));
                sb.append("...");
            } else {
                sb.append(m18358f);
            }
            this.f43155c.m21333b(sb.toString());
        }
    }

    /* renamed from: c */
    public void mo18354c(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f43154b.f45593c.m18184a(str, str2);
        } else if (this.f43155c.m21337c()) {
            this.f43155c.m21336c("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3606S0, com.yandex.metrica.impl.p023ob.InterfaceC3706W0, com.yandex.metrica.InterfaceC3126g
    /* renamed from: d */
    public void mo17793d(@NonNull String str, @Nullable String str2) {
        List<Integer> list = C3382J0.f43175i;
        this.f43161i.m20420a(new C4066k0(str2, str, EnumC4067k1.EVENT_TYPE_DIAGNOSTIC.m20218b(), new C3504Nm()), this.f43154b);
    }

    /* renamed from: e */
    public void m18356e(String str) {
        this.f43161i.m20440e();
        this.f43162j.m20313b();
        C4146n2 c4146n2 = this.f43161i;
        C3379Im c3379Im = this.f43155c;
        List<Integer> list = C3382J0.f43175i;
        c4146n2.m20420a(new C3605S("", str, EnumC4067k1.EVENT_TYPE_START.m20218b(), c3379Im), this.f43154b);
        this.f43154b.m20226h();
    }

    /* renamed from: f */
    public void m18359f() {
        this.f43161i.m20433b(this.f43154b);
    }

    @Override // com.yandex.metrica.IReporter
    @NonNull
    public IPluginReporter getPluginExtension() {
        return this;
    }

    @Override // com.yandex.metrica.IReporter
    public void pauseSession() {
        if (this.f43155c.m21337c()) {
            this.f43155c.m21333b("Pause session");
        }
        m18355d(null);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        if (this.f43155c.m21337c()) {
            C3379Im c3379Im = this.f43155c;
            StringBuilder m24u = C0000a.m24u("E-commerce event received: ");
            m24u.append(eCommerceEvent.getPublicDescription());
            c3379Im.m21333b(m24u.toString());
        }
        this.f43161i.m20416a(eCommerceEvent, this.f43154b);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@NonNull String str, @Nullable Throwable th) {
        C4047j7 c4047j7 = new C4047j7(str, m18341a(th));
        C4146n2 c4146n2 = this.f43161i;
        byte[] m19777a = AbstractC3909e.m19777a(this.f43158f.mo17818b(c4047j7));
        C3379Im c3379Im = this.f43155c;
        List<Integer> list = C3382J0.f43175i;
        c4146n2.m20420a(new C3605S(m19777a, str, EnumC4067k1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF.m20218b(), c3379Im), this.f43154b);
        if (this.f43155c.m21337c()) {
            this.f43155c.m21330a("Error received: %s", m18358f(str));
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@NonNull String str) {
        if (this.f43155c.m21337c() && this.f43155c.m21337c()) {
            this.f43155c.m21333b("Event received: " + m18358f(str));
        }
        C3379Im c3379Im = this.f43155c;
        List<Integer> list = C3382J0.f43175i;
        this.f43161i.m20420a(new C3605S("", str, EnumC4067k1.EVENT_TYPE_REGULAR.m20218b(), 0, c3379Im), this.f43154b);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportRevenue(@NonNull Revenue revenue) {
        C4298so mo18360a = b.m18361a().mo18360a(revenue);
        if (!mo18360a.m20772b()) {
            if (this.f43155c.m21337c()) {
                C3379Im c3379Im = this.f43155c;
                StringBuilder m24u = C0000a.m24u("Passed revenue is not valid. Reason: ");
                m24u.append(mo18360a.m20771a());
                c3379Im.m21335c(m24u.toString());
                return;
            }
            return;
        }
        this.f43161i.m20422a(new C4224q2(revenue, this.f43155c), this.f43154b);
        if (this.f43155c.m21337c()) {
            StringBuilder sb = new StringBuilder("Revenue received ");
            sb.append("for productID: ");
            sb.append(m18358f(revenue.productID));
            sb.append(" of quantity: ");
            Integer num = revenue.quantity;
            if (num != null) {
                sb.append(num);
            } else {
                sb.append("<null>");
            }
            sb.append(" with price");
            if (revenue.priceMicros != null) {
                sb.append(" (in micros): ");
                sb.append(revenue.priceMicros);
            } else {
                sb.append(": ");
                sb.append(revenue.price);
            }
            sb.append(" ");
            sb.append(revenue.currency);
            this.f43155c.m21333b(sb.toString());
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUnhandledException(@NonNull Throwable th) {
        C4203p7 m20571a = C4229q7.m20571a(th, new C3917e7(null, null, ((C3254Dm) this.f43163k).m17984b()), null, this.f43164l.m18424a(), this.f43164l.m18425b());
        this.f43161i.m20434b(m20571a, this.f43154b);
        m18351b(m20571a);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUserProfile(@NonNull UserProfile userProfile) {
        C3322Gf c3322Gf = new C3322Gf();
        Iterator<UserProfileUpdate<? extends InterfaceC3347Hf>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            AbstractC4445yf abstractC4445yf = (AbstractC4445yf) it.next().getUserProfileUpdatePatcher();
            abstractC4445yf.m21205a(this.f43155c);
            abstractC4445yf.mo17904a(c3322Gf);
        }
        C3822ag m18170c = c3322Gf.m18170c();
        C4298so mo18360a = f43152o.mo18360a(m18170c);
        if (mo18360a.m20772b()) {
            this.f43161i.m20419a(m18170c, this.f43154b);
            if (this.f43155c.m21337c()) {
                this.f43155c.m21333b("User profile received");
                return;
            }
            return;
        }
        if (this.f43155c.m21337c()) {
            C3379Im c3379Im = this.f43155c;
            StringBuilder m24u = C0000a.m24u("UserInfo wasn't sent because ");
            m24u.append(mo18360a.m20771a());
            c3379Im.m21335c(m24u.toString());
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void resumeSession() {
        m18356e(null);
        if (this.f43155c.m21337c()) {
            this.f43155c.m21333b("Resume session");
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void sendEventsBuffer() {
        C4146n2 c4146n2 = this.f43161i;
        EnumC4067k1 enumC4067k1 = EnumC4067k1.EVENT_TYPE_PURGE_BUFFER;
        C3379Im c3379Im = this.f43155c;
        List<Integer> list = C3382J0.f43175i;
        c4146n2.m20420a(new C3605S("", "", enumC4067k1.m20218b(), 0, c3379Im), this.f43154b);
    }

    @Override // com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z) {
        this.f43154b.m19136b().m17761m(z);
    }

    @Override // com.yandex.metrica.IReporter
    public void setUserProfileID(@Nullable String str) {
        this.f43161i.m20436b(str, this.f43154b);
        if (this.f43155c.m21337c()) {
            this.f43155c.m21333b("Set user profile ID: " + m18358f(str));
        }
    }

    /* renamed from: a */
    public void m18349a(Map<String, String> map) {
        if (C3658U2.m19218b(map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            mo18354c(entry.getKey(), entry.getValue());
        }
    }

    @NonNull
    /* renamed from: f */
    public String m18358f(@Nullable String str) {
        return str == null ? "<null>" : str.isEmpty() ? "<empty>" : str;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3606S0
    /* renamed from: a */
    public void mo18343a(int i2, String str, String str2, Map<String, String> map) {
        if (!f43151n.contains(Integer.valueOf(i2)) && i2 >= 1 && i2 <= 99) {
            return;
        }
        HashMap hashMap = map == null ? null : new HashMap(map);
        C3379Im c3379Im = this.f43155c;
        List<Integer> list = C3382J0.f43175i;
        this.f43161i.m20420a(new C3605S(str2, str, EnumC4067k1.EVENT_TYPE_CUSTOM_EVENT.m20218b(), i2, c3379Im).m20200c(C4452ym.m21272g(hashMap)), this.f43154b);
    }

    /* renamed from: d */
    public void m18355d(String str) {
        if (this.f43154b.mo19628f()) {
            return;
        }
        this.f43161i.m20439d();
        this.f43162j.m20312a();
        this.f43154b.m20225g();
        C4146n2 c4146n2 = this.f43161i;
        C3379Im c3379Im = this.f43155c;
        List<Integer> list = C3382J0.f43175i;
        c4146n2.m20420a(new C3605S("", str, EnumC4067k1.EVENT_TYPE_UPDATE_FOREGROUND_TIME.m20218b(), 0, c3379Im), this.f43154b);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3606S0
    /* renamed from: c */
    public void mo18353c(@Nullable String str) {
        this.f43161i.m20426a(str, this.f43154b);
        if (this.f43155c.m21337c()) {
            this.f43155c.m21333b("Error received: native");
        }
    }

    /* renamed from: e */
    private void m18342e(String str, String str2) {
        if (this.f43155c.m21337c()) {
            this.f43155c.m21333b("Event received: " + m18358f(str) + ". With value: " + m18358f(str2));
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@NonNull String str, @Nullable String str2) {
        reportError(str, str2, (Throwable) null);
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        String m20447b;
        C4203p7 m19571a = this.f43165m.m19571a(pluginErrorDetails);
        C4146n2 c4146n2 = this.f43161i;
        C4151n7 c4151n7 = m19571a.f46120a;
        String str = "";
        if (c4151n7 != null && (m20447b = c4151n7.m20447b()) != null) {
            str = m20447b;
        }
        byte[] m19777a = AbstractC3909e.m19777a(this.f43157e.mo17818b(m19571a));
        C3379Im c3379Im = this.f43155c;
        List<Integer> list = C3382J0.f43175i;
        c4146n2.m20420a(new C3605S(m19777a, str, EnumC4067k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.m20218b(), c3379Im), this.f43154b);
        if (this.f43155c.m21337c()) {
            this.f43155c.m21330a("Crash from plugin received: %s", m18358f(pluginErrorDetails.getMessage()));
        }
    }

    @NonNull
    /* renamed from: a */
    private C4203p7 m18341a(@Nullable Throwable th) {
        Throwable th2;
        StackTraceElement[] stackTraceElementArr;
        if (th == null) {
            stackTraceElementArr = null;
            th2 = null;
        } else if (th instanceof C3612S6) {
            stackTraceElementArr = th.getStackTrace();
            th2 = null;
        } else {
            th2 = th;
            stackTraceElementArr = null;
        }
        return C4229q7.m20571a(th2, new C3917e7(null, null, ((C3254Dm) this.f43163k).m17984b()), stackTraceElementArr != null ? Arrays.asList(stackTraceElementArr) : null, this.f43164l.m18424a(), this.f43164l.m18425b());
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th) {
        this.f43161i.m20420a(C3382J0.m18366a(str2, AbstractC3909e.m19777a(this.f43159g.mo17818b(new C3995h7(new C4047j7(str2, m18341a(th)), str))), this.f43155c), this.f43154b);
        if (this.f43155c.m21337c()) {
            this.f43155c.m21330a("Error received: id: %s, message: %s", m18358f(str), m18358f(str2));
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@NonNull String str, String str2) {
        if (this.f43155c.m21337c()) {
            m18342e(str, str2);
        }
        C3379Im c3379Im = this.f43155c;
        List<Integer> list = C3382J0.f43175i;
        this.f43161i.m20420a(new C3605S(str2, str, EnumC4067k1.EVENT_TYPE_REGULAR.m20218b(), 0, c3379Im), this.f43154b);
    }

    /* renamed from: e */
    public boolean m18357e() {
        boolean z = !this.f43154b.mo19628f();
        if (z) {
            C3379Im c3379Im = this.f43155c;
            List<Integer> list = C3382J0.f43175i;
            this.f43161i.m20420a(new C3605S("", "", EnumC4067k1.EVENT_TYPE_UPDATE_FOREGROUND_TIME.m20218b(), 0, c3379Im), this.f43154b);
        }
        return z;
    }

    /* renamed from: b */
    public void m18351b(@NonNull C4203p7 c4203p7) {
        if (this.f43155c.m21337c()) {
            this.f43155c.m21333b("Unhandled exception received: " + c4203p7.toString());
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        HashMap hashMap = C3658U2.m19218b(map) ? null : new HashMap(map);
        C4146n2 c4146n2 = this.f43161i;
        C3379Im c3379Im = this.f43155c;
        List<Integer> list = C3382J0.f43175i;
        c4146n2.m20414a(new C3605S("", str, EnumC4067k1.EVENT_TYPE_REGULAR.m20218b(), 0, c3379Im), this.f43154b, hashMap);
        if (this.f43155c.m21337c()) {
            m18342e(str, hashMap != null ? hashMap.toString() : null);
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3833b1
    /* renamed from: a */
    public void mo18346a(@NonNull C4203p7 c4203p7) {
        this.f43161i.m20421a(c4203p7, this.f43154b);
        m18351b(c4203p7);
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        C3813a7 c3813a7 = this.f43165m;
        Objects.requireNonNull(c3813a7);
        this.f43161i.m20420a(C3382J0.m18366a(str, AbstractC3909e.m19777a(this.f43158f.mo17818b(new C4047j7(str, pluginErrorDetails != null ? c3813a7.m19571a(pluginErrorDetails) : null))), this.f43155c), this.f43154b);
        if (this.f43155c.m21337c()) {
            this.f43155c.m21330a("Error from plugin received: %s", m18358f(str));
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3833b1
    /* renamed from: a */
    public void mo18344a(@NonNull C3917e7 c3917e7) {
        C3943f7 c3943f7 = new C3943f7(c3917e7, this.f43164l.m18424a(), this.f43164l.m18425b());
        C4146n2 c4146n2 = this.f43161i;
        byte[] m19777a = AbstractC3909e.m19777a(this.f43160h.mo17818b(c3943f7));
        C3379Im c3379Im = this.f43155c;
        List<Integer> list = C3382J0.f43175i;
        c4146n2.m20420a(new C3605S(m19777a, "", EnumC4067k1.EVENT_TYPE_ANR.m20218b(), c3379Im), this.f43154b);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3706W0
    /* renamed from: b */
    public void mo18350b() {
        Object systemService;
        Integer valueOf;
        C4146n2 c4146n2 = this.f43161i;
        Context context = this.f43153a;
        C4066k0 c4066k0 = new C4066k0();
        c4066k0.f45520a = "";
        C3532P0 m18696i = C3532P0.m18696i();
        Intrinsics.m32178g(m18696i, "GlobalServiceLocator.getInstance()");
        C3456M m18702d = m18696i.m18702d();
        Intrinsics.m32178g(m18702d, "GlobalServiceLocator.get…nce().batteryInfoProvider");
        Integer m18533a = m18702d.m18533a();
        long elapsedRealtime = SystemClock.elapsedRealtime() / 1000;
        if (C3658U2.m19211a(23)) {
            try {
                systemService = context.getSystemService("notification");
            } catch (Throwable unused) {
            }
            if (systemService != null) {
                valueOf = Integer.valueOf(((NotificationManager) systemService).getCurrentInterruptionFilter());
                JSONObject put = new JSONObject().put("dfid", new JSONObject().putOpt("battery", m18533a).put("boot_time_seconds", elapsedRealtime).putOpt("notification_filter", valueOf));
                Intrinsics.m32178g(put, "JSONObject()\n           …tionFilter)\n            )");
                c4066k0.f45524e = EnumC4067k1.EVENT_TYPE_IDENTITY_LIGHT.m20218b();
                c4066k0.f45521b = put.toString();
                c4146n2.m20420a(c4066k0, this.f43154b);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
        }
        valueOf = null;
        JSONObject put2 = new JSONObject().put("dfid", new JSONObject().putOpt("battery", m18533a).put("boot_time_seconds", elapsedRealtime).putOpt("notification_filter", valueOf));
        Intrinsics.m32178g(put2, "JSONObject()\n           …tionFilter)\n            )");
        c4066k0.f45524e = EnumC4067k1.EVENT_TYPE_IDENTITY_LIGHT.m20218b();
        c4066k0.f45521b = put2.toString();
        c4146n2.m20420a(c4066k0, this.f43154b);
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        C3813a7 c3813a7 = this.f43165m;
        Objects.requireNonNull(c3813a7);
        this.f43161i.m20420a(C3382J0.m18366a(str2, AbstractC3909e.m19777a(this.f43159g.mo17818b(new C3995h7(new C4047j7(str2, pluginErrorDetails != null ? c3813a7.m19571a(pluginErrorDetails) : null), str))), this.f43155c), this.f43154b);
        if (this.f43155c.m21337c()) {
            this.f43155c.m21330a("Error with identifier: %s from plugin received: %s", str, m18358f(str2));
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3706W0
    /* renamed from: a */
    public void mo18348a(@NonNull String str, @NonNull JSONObject jSONObject) {
        C4146n2 c4146n2 = this.f43161i;
        C4066k0 c4066k0 = new C4066k0();
        c4066k0.f45520a = str;
        c4066k0.f45524e = EnumC4067k1.EVENT_TYPE_APPMETRICA_DIAGNOSTICS.m20218b();
        c4066k0.f45521b = jSONObject.toString();
        c4146n2.m20420a(c4066k0, this.f43154b);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3606S0
    /* renamed from: a */
    public void mo18347a(@NonNull String str, @Nullable String str2) {
        m18342e(str, str2);
        C3379Im c3379Im = this.f43155c;
        List<Integer> list = C3382J0.f43175i;
        this.f43161i.m20420a(new C3605S(str2, str, EnumC4067k1.EVENT_TYPE_REGULAR.m20218b(), 0, c3379Im).m20191a(EnumC3357I0.JS), this.f43154b);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3606S0
    /* renamed from: b */
    public void mo18352b(@NonNull String str) {
        this.f43161i.m20420a(C4066k0.m20184a(str), this.f43154b);
    }
}
