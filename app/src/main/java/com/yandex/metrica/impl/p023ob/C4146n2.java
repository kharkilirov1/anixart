package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.impl.p023ob.C4172o2;
import com.yandex.metrica.rtm.wrapper.InterfaceC4627k;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.n2 */
/* loaded from: classes2.dex */
public class C4146n2 implements InterfaceC3781Z0 {

    /* renamed from: a */
    private final Context f45969a;

    /* renamed from: b */
    private C4405x1 f45970b;

    /* renamed from: c */
    private C4275s1 f45971c;

    /* renamed from: d */
    @NonNull
    private final C3832b0 f45972d;

    /* renamed from: e */
    private InterfaceC3425Ki f45973e;

    /* renamed from: f */
    private final C4411x7 f45974f;

    /* renamed from: g */
    @NonNull
    private final C3891d7 f45975g;

    /* renamed from: h */
    private final C4172o2 f45976h = new C4172o2(this);

    /* renamed from: com.yandex.metrica.impl.ob.n2$a */
    public class a implements C4172o2.e {

        /* renamed from: a */
        public final /* synthetic */ Map f45977a;

        /* renamed from: b */
        public final /* synthetic */ C4068k2 f45978b;

        public a(Map map, C4068k2 c4068k2) {
            this.f45977a = map;
            this.f45978b = c4068k2;
        }

        @Override // com.yandex.metrica.impl.p023ob.C4172o2.e
        /* renamed from: a */
        public C4066k0 mo20443a(C4066k0 c4066k0) {
            C4146n2 c4146n2 = C4146n2.this;
            C4066k0 mo19071f = c4066k0.mo19071f(C4452ym.m21272g(this.f45977a));
            C4068k2 c4068k2 = this.f45978b;
            Objects.requireNonNull(c4146n2);
            if (C3382J0.m18376f(mo19071f.f45524e)) {
                mo19071f.m20200c(c4068k2.f45593c.m18183a());
            }
            return mo19071f;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.n2$b */
    public class b implements C4172o2.e {

        /* renamed from: a */
        public final /* synthetic */ C3822ag f45980a;

        public b(C4146n2 c4146n2, C3822ag c3822ag) {
            this.f45980a = c3822ag;
        }

        @Override // com.yandex.metrica.impl.p023ob.C4172o2.e
        /* renamed from: a */
        public C4066k0 mo20443a(C4066k0 c4066k0) {
            return c4066k0.mo19071f(new String(Base64.encode(AbstractC3909e.m19777a(this.f45980a), 0)));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.n2$c */
    public class c implements C4172o2.e {

        /* renamed from: a */
        public final /* synthetic */ String f45981a;

        public c(C4146n2 c4146n2, String str) {
            this.f45981a = str;
        }

        @Override // com.yandex.metrica.impl.p023ob.C4172o2.e
        /* renamed from: a */
        public C4066k0 mo20443a(C4066k0 c4066k0) {
            return c4066k0.mo19071f(this.f45981a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.n2$d */
    public class d implements C4172o2.e {

        /* renamed from: a */
        public final /* synthetic */ C4224q2 f45982a;

        public d(C4146n2 c4146n2, C4224q2 c4224q2) {
            this.f45982a = c4224q2;
        }

        @Override // com.yandex.metrica.impl.p023ob.C4172o2.e
        /* renamed from: a */
        public C4066k0 mo20443a(C4066k0 c4066k0) {
            Pair<byte[], Integer> m20568a = this.f45982a.m20568a();
            C4066k0 mo19071f = c4066k0.mo19071f(new String(Base64.encode((byte[]) m20568a.first, 0)));
            mo19071f.f45527h = ((Integer) m20568a.second).intValue();
            return mo19071f;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.n2$e */
    public class e implements C4172o2.e {

        /* renamed from: a */
        public final /* synthetic */ C4311tb f45983a;

        public e(C4146n2 c4146n2, C4311tb c4311tb) {
            this.f45983a = c4311tb;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.yandex.metrica.impl.p023ob.C4172o2.e
        /* renamed from: a */
        public C4066k0 mo20443a(C4066k0 c4066k0) {
            C4066k0 mo19071f = c4066k0.mo19071f(C3681V0.m19261a(AbstractC3909e.m19777a((AbstractC3909e) this.f45983a.f46509a)));
            mo19071f.f45527h = this.f45983a.f46510b.mo18020a();
            return mo19071f;
        }
    }

    @VisibleForTesting
    public C4146n2(C3659U3 c3659u3, Context context, @NonNull C4405x1 c4405x1, @NonNull C4411x7 c4411x7, @NonNull C3891d7 c3891d7) {
        this.f45970b = c4405x1;
        this.f45969a = context;
        this.f45972d = new C3832b0(c3659u3);
        this.f45974f = c4411x7;
        this.f45975g = c3891d7;
    }

    /* renamed from: a */
    public void m20423a(@Nullable C4275s1 c4275s1) {
        this.f45971c = c4275s1;
    }

    /* renamed from: b */
    public void m20433b(C4068k2 c4068k2) {
        C3546Pe c3546Pe = c4068k2.f45594d;
        String m20224e = c4068k2.m20224e();
        C3379Im m20410a = m20410a(c4068k2);
        List<Integer> list = C3382J0.f43175i;
        JSONObject jSONObject = new JSONObject();
        if (c3546Pe != null) {
            c3546Pe.m18754a(jSONObject);
        }
        m20420a(new C3605S(jSONObject.toString(), "", EnumC4067k1.EVENT_TYPE_ACTIVATION.m20218b(), 0, m20410a).mo19069d(m20224e), c4068k2);
    }

    /* renamed from: c */
    public void m20438c(C4068k2 c4068k2) {
        C4066k0 c4066k0 = new C4066k0();
        c4066k0.f45524e = EnumC4067k1.EVENT_TYPE_APP_ENVIRONMENT_CLEARED.m20218b();
        m20411a(new C4172o2.f(c4066k0, c4068k2));
    }

    /* renamed from: d */
    public void m20439d() {
        this.f45970b.m21136g();
    }

    /* renamed from: e */
    public void m20440e() {
        this.f45970b.m21135f();
    }

    /* renamed from: f */
    public void m20441f() {
        this.f45970b.m21129a();
    }

    /* renamed from: g */
    public void m20442g() {
        this.f45970b.m21132c();
    }

    /* renamed from: a */
    public void m20418a(InterfaceC3425Ki interfaceC3425Ki) {
        this.f45973e = interfaceC3425Ki;
        this.f45972d.m20219a(interfaceC3425Ki);
    }

    /* renamed from: a */
    public void m20424a(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        if (C3658U2.m19212a(bool)) {
            this.f45972d.m19136b().m17759k(bool.booleanValue());
        }
        if (C3658U2.m19212a(bool2)) {
            this.f45972d.m19136b().m17761m(bool2.booleanValue());
        }
        if (C3658U2.m19212a(bool3)) {
            CounterConfiguration m19136b = this.f45972d.m19136b();
            boolean booleanValue = bool3.booleanValue();
            synchronized (m19136b) {
                m19136b.f42234b.put("CFG_LOCATION_ALLOWED_BY_BRIDGE", Boolean.valueOf(booleanValue));
            }
        }
        C4066k0 c4066k0 = new C4066k0();
        c4066k0.f45524e = EnumC4067k1.EVENT_TYPE_UPDATE_PRE_ACTIVATION_CONFIG.m20218b();
        m20420a(c4066k0, this.f45972d);
    }

    /* renamed from: c */
    public C4405x1 m20437c() {
        return this.f45970b;
    }

    /* renamed from: b */
    public Future<Void> m20432b(@NonNull C3659U3 c3659u3) {
        return this.f45976h.queueResumeUserSession(c3659u3);
    }

    /* renamed from: b */
    public void m20435b(String str) {
        this.f45972d.m19135a().m19228b(str);
    }

    /* renamed from: b */
    public void m20434b(@NonNull C4203p7 c4203p7, C4068k2 c4068k2) {
        this.f45970b.m21135f();
        m20411a(this.f45975g.m19711a(c4203p7, c4068k2));
    }

    /* renamed from: a */
    public void m20426a(@Nullable String str, C4068k2 c4068k2) {
        try {
            m20420a(C3382J0.m18372c(C3681V0.m19261a(AbstractC3909e.m19777a(this.f45974f.mo17818b(new C3439L7(str == null ? new byte[0] : str.getBytes("UTF-8"), new C3414K7(EnumC3514O7.USER, null))))), m20410a(c4068k2)), c4068k2);
        } catch (UnsupportedEncodingException unused) {
        }
    }

    /* renamed from: b */
    public void m20436b(@Nullable String str, @NonNull C4068k2 c4068k2) {
        m20411a(new C4172o2.f(C3605S.m19059a(str, m20410a(c4068k2)), c4068k2).m20487a(new c(this, str)));
    }

    /* renamed from: a */
    public Future<Void> m20414a(C4066k0 c4066k0, C4068k2 c4068k2, Map<String, Object> map) {
        EnumC4067k1 enumC4067k1 = EnumC4067k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        this.f45970b.m21135f();
        C4172o2.f fVar = new C4172o2.f(c4066k0, c4068k2);
        if (!C3658U2.m19218b(map)) {
            fVar.m20487a(new a(map, c4068k2));
        }
        return m20411a(fVar);
    }

    @NonNull
    /* renamed from: b */
    public InterfaceC4627k m20431b() {
        return this.f45976h;
    }

    /* renamed from: a */
    public Future<Void> m20413a(@NonNull C3659U3 c3659u3) {
        return this.f45976h.queuePauseUserSession(c3659u3);
    }

    /* renamed from: a */
    public void m20429a(@NonNull List<String> list, @NonNull ResultReceiver resultReceiver, @Nullable Map<String, String> map) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.impl.IdentifiersData", new C3937f1(list, map, resultReceiver));
        EnumC4067k1 enumC4067k1 = EnumC4067k1.EVENT_TYPE_STARTUP;
        int i2 = AbstractC4478zm.f47145e;
        C3379Im m18338g = C3379Im.m18338g();
        List<Integer> list2 = C3382J0.f43175i;
        m20420a(new C3605S("", "", enumC4067k1.m20218b(), 0, m18338g).m20199c(bundle), this.f45972d);
    }

    /* renamed from: a */
    public void m20420a(C4066k0 c4066k0, C4068k2 c4068k2) {
        if (C3382J0.m18376f(c4066k0.f45524e)) {
            c4066k0.m20200c(c4068k2.f45593c.m18183a());
        }
        m20414a(c4066k0, c4068k2, (Map<String, Object>) null);
    }

    /* renamed from: a */
    public void m20417a(@NonNull ResultReceiverC3323Gg resultReceiverC3323Gg) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.impl.referrer.common.ReferrerResultReceiver", resultReceiverC3323Gg);
        int i2 = AbstractC4478zm.f47145e;
        C3379Im m18338g = C3379Im.m18338g();
        List<Integer> list = C3382J0.f43175i;
        m20420a(new C3605S("", "", EnumC4067k1.EVENT_TYPE_REQUEST_REFERRER.m20218b(), 0, m18338g).m20199c(bundle), this.f45972d);
    }

    /* renamed from: a */
    public void m20428a(List<String> list) {
        this.f45972d.m19135a().m19224a(list);
    }

    /* renamed from: a */
    public void m20430a(Map<String, String> map) {
        this.f45972d.m19135a().m19225a(map);
    }

    /* renamed from: a */
    public void m20425a(String str) {
        this.f45972d.m19135a().m19223a(str);
    }

    /* renamed from: a */
    public void m20421a(@NonNull C4203p7 c4203p7, @NonNull C4068k2 c4068k2) {
        this.f45970b.m21135f();
        C4172o2.f m19711a = this.f45975g.m19711a(c4203p7, c4068k2);
        m19711a.m20486a().m20219a(this.f45973e);
        this.f45976h.sendCrash(m19711a);
    }

    /* renamed from: a */
    public void m20427a(String str, String str2, C4068k2 c4068k2) {
        C4066k0 c4066k0 = new C4066k0();
        c4066k0.f45524e = EnumC4067k1.EVENT_TYPE_APP_ENVIRONMENT_UPDATED.m20218b();
        m20411a(new C4172o2.f(c4066k0.m20195a(str, str2), c4068k2));
    }

    /* renamed from: a */
    public void m20419a(@NonNull C3822ag c3822ag, @NonNull C4068k2 c4068k2) {
        C4066k0 c4066k0 = new C4066k0();
        c4066k0.f45524e = EnumC4067k1.EVENT_TYPE_SEND_USER_PROFILE.m20218b();
        m20411a(new C4172o2.f(c4066k0, c4068k2).m20487a(new b(this, c3822ag)));
    }

    /* renamed from: a */
    public void m20422a(@NonNull C4224q2 c4224q2, @NonNull C4068k2 c4068k2) {
        C3605S c3605s = new C3605S(m20410a(c4068k2));
        c3605s.f45524e = EnumC4067k1.EVENT_TYPE_SEND_REVENUE_EVENT.m20218b();
        m20411a(new C4172o2.f(c3605s, c4068k2).m20487a(new d(this, c4224q2)));
    }

    /* renamed from: a */
    public void m20416a(@NonNull InterfaceC3293Fb interfaceC3293Fb, @NonNull C4068k2 c4068k2) {
        for (C4311tb<C3596Rf, InterfaceC3305Fn> c4311tb : interfaceC3293Fb.toProto()) {
            C3605S c3605s = new C3605S(m20410a(c4068k2));
            c3605s.f45524e = EnumC4067k1.EVENT_TYPE_SEND_ECOMMERCE_EVENT.m20218b();
            m20411a(new C4172o2.f(c3605s, c4068k2).m20487a(new e(this, c4311tb)));
        }
    }

    /* renamed from: a */
    public void m20415a(IMetricaService iMetricaService, C4066k0 c4066k0, C4068k2 c4068k2) throws RemoteException {
        iMetricaService.reportData(c4066k0.m20196b(c4068k2.m20222c()));
        C4275s1 c4275s1 = this.f45971c;
        if (c4275s1 == null || c4275s1.f43154b.mo19628f()) {
            this.f45970b.m21136g();
        }
    }

    /* renamed from: a */
    private Future<Void> m20411a(C4172o2.f fVar) {
        fVar.m20486a().m20219a(this.f45973e);
        return this.f45976h.queueReport(fVar);
    }

    /* renamed from: a */
    public Context m20412a() {
        return this.f45969a;
    }

    @NonNull
    /* renamed from: a */
    private C3379Im m20410a(@NonNull C4068k2 c4068k2) {
        return AbstractC4478zm.m21313b(c4068k2.m19136b().m17753c());
    }
}
