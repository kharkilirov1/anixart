package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.C3130i;
import com.yandex.metrica.C4483l;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.n3 */
/* loaded from: classes2.dex */
public class C4147n3 implements InterfaceC3885d1 {

    /* renamed from: n */
    private static final EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason> f45984n;

    /* renamed from: a */
    @NonNull
    private final Context f45985a;

    /* renamed from: b */
    @NonNull
    private final C3291F9 f45986b;

    /* renamed from: c */
    @NonNull
    private final C3375Ii f45987c;

    /* renamed from: d */
    @NonNull
    private final C3248Dg f45988d;

    /* renamed from: e */
    @NonNull
    private final C3659U3 f45989e;

    /* renamed from: f */
    @NonNull
    private final C4094l2 f45990f;

    /* renamed from: g */
    @NonNull
    private final C4146n2 f45991g;

    /* renamed from: h */
    @NonNull
    private final C4326u0 f45992h;

    /* renamed from: i */
    @NonNull
    private final C3817ab f45993i;

    /* renamed from: j */
    @NonNull
    private final C3206C f45994j;

    /* renamed from: k */
    @NonNull
    private final C3359I2 f45995k;

    /* renamed from: l */
    @Nullable
    private volatile C4301t1 f45996l;

    /* renamed from: m */
    @Nullable
    private IIdentifierCallback f45997m;

    /* renamed from: com.yandex.metrica.impl.ob.n3$a */
    public class a implements IIdentifierCallback {

        /* renamed from: a */
        public final /* synthetic */ AppMetricaDeviceIDListener f45998a;

        public a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
            this.f45998a = appMetricaDeviceIDListener;
        }

        @Override // com.yandex.metrica.IIdentifierCallback
        public void onReceive(Map<String, String> map) {
            C4147n3.m20444a(C4147n3.this, (IIdentifierCallback) null);
            this.f45998a.onLoaded(map.get("appmetrica_device_id_hash"));
        }

        @Override // com.yandex.metrica.IIdentifierCallback
        public void onRequestError(IIdentifierCallback.Reason reason) {
            C4147n3.m20444a(C4147n3.this, (IIdentifierCallback) null);
            this.f45998a.onError((AppMetricaDeviceIDListener.Reason) C4147n3.f45984n.get(reason));
        }
    }

    static {
        EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason> enumMap = new EnumMap<>((Class<IIdentifierCallback.Reason>) IIdentifierCallback.Reason.class);
        f45984n = enumMap;
        enumMap.put((EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason>) IIdentifierCallback.Reason.UNKNOWN, (IIdentifierCallback.Reason) AppMetricaDeviceIDListener.Reason.UNKNOWN);
        enumMap.put((EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason>) IIdentifierCallback.Reason.INVALID_RESPONSE, (IIdentifierCallback.Reason) AppMetricaDeviceIDListener.Reason.INVALID_RESPONSE);
        enumMap.put((EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason>) IIdentifierCallback.Reason.NETWORK, (IIdentifierCallback.Reason) AppMetricaDeviceIDListener.Reason.NETWORK);
    }

    @WorkerThread
    public C4147n3(@NonNull Context context, @NonNull InterfaceC3859c1 interfaceC3859c1) {
        this(context.getApplicationContext(), interfaceC3859c1, new C3291F9(C3567Qa.m18783a(context.getApplicationContext()).m18795c()));
    }

    /* renamed from: a */
    public static /* synthetic */ IIdentifierCallback m20444a(C4147n3 c4147n3, IIdentifierCallback iIdentifierCallback) {
        c4147n3.f45997m = null;
        return null;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3756Y0
    @NonNull
    @AnyThread
    /* renamed from: b */
    public InterfaceC3731X0 mo18639b() {
        return this.f45990f;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3885d1
    @WorkerThread
    /* renamed from: c */
    public void mo18767c(@NonNull C3130i c3130i) {
        this.f45990f.m20316c(c3130i);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3885d1
    @Nullable
    @AnyThread
    /* renamed from: d */
    public C4301t1 mo18768d() {
        return this.f45996l;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    @WorkerThread
    public void setStatisticsSending(boolean z) {
        this.f45996l.m20774b().setStatisticsSending(z);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    @WorkerThread
    public void setUserProfileID(@Nullable String str) {
        this.f45996l.m20774b().setUserProfileID(str);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3885d1
    @WorkerThread
    /* renamed from: a */
    public void mo18765a(@NonNull YandexMetricaConfig yandexMetricaConfig, @NonNull C4483l c4483l) {
        this.f45993i.m19573a(this.f45985a, this.f45987c).m19506a(yandexMetricaConfig, this.f45987c.m18331c());
        C3379Im m21313b = AbstractC4478zm.m21313b(c4483l.apiKey);
        C4426xm m21312a = AbstractC4478zm.m21312a(c4483l.apiKey);
        Objects.requireNonNull(this.f45992h);
        if (this.f45996l != null) {
            if (m21313b.m21337c()) {
                m21313b.m21335c("Appmetrica already has been activated!");
                return;
            }
            return;
        }
        this.f45988d.m17968a();
        this.f45987c.m18324a(m21313b);
        this.f45987c.m18327a(c4483l.f47170d);
        this.f45987c.m18328a(c4483l.f47168b);
        this.f45987c.m18326a(c4483l.f47169c);
        if (C3658U2.m19212a((Object) c4483l.f47169c)) {
            this.f45987c.m18330b("api");
        }
        this.f45989e.m19227b(c4483l);
        this.f45991g.m20424a(c4483l.locationTracking, c4483l.statisticsSending, (Boolean) null);
        C4275s1 m20315a = this.f45990f.m20315a(c4483l, false, this.f45986b);
        this.f45996l = new C4301t1(m20315a, new C4248r0(m20315a));
        this.f45994j.m17913a(this.f45996l.m20773a());
        this.f45995k.m18248a(m20315a);
        this.f45987c.m18334g();
        Log.i("AppMetrica", "Activate AppMetrica with APIKey " + C3658U2.m19199a(c4483l.apiKey));
        if (Boolean.TRUE.equals(c4483l.logs)) {
            m21313b.m21339e();
            m21312a.m21339e();
            C3379Im.m18338g().m21339e();
            C4426xm.m21163g().m21339e();
            return;
        }
        m21313b.m21338d();
        m21312a.m21338d();
        C3379Im.m18338g().m21338d();
        C4426xm.m21163g().m21338d();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    @WorkerThread
    /* renamed from: b */
    public void mo18462b(boolean z) {
        this.f45996l.m20774b().mo18462b(z);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3885d1
    @Nullable
    @AnyThread
    /* renamed from: c */
    public String mo18766c() {
        return this.f45987c.m18329b();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    @WorkerThread
    /* renamed from: c */
    public void mo18354c(String str, String str2) {
        this.f45996l.m20774b().mo18354c(str, str2);
    }

    @WorkerThread
    private C4147n3(@NonNull Context context, @NonNull InterfaceC3859c1 interfaceC3859c1, @NonNull C3291F9 c3291f9) {
        this(context, interfaceC3859c1, c3291f9, new C3730X(context), new C4173o3(), C3755Y.m19410g(), new C3817ab());
    }

    @VisibleForTesting
    @WorkerThread
    public C4147n3(@NonNull Context context, @NonNull InterfaceC3859c1 interfaceC3859c1, @NonNull C3291F9 c3291f9, @NonNull C3730X c3730x, @NonNull C4173o3 c4173o3, @NonNull C3755Y c3755y, @NonNull C3817ab c3817ab) {
        this.f45985a = context;
        this.f45986b = c3291f9;
        Handler mo18691c = interfaceC3859c1.mo18691c();
        C3659U3 m20496a = c4173o3.m20496a(context, c4173o3.m20498a(mo18691c, this));
        this.f45989e = m20496a;
        C4326u0 m19416f = c3755y.m19416f();
        this.f45992h = m19416f;
        C4146n2 m20499a = c4173o3.m20499a(m20496a, context, interfaceC3859c1.mo18690b());
        this.f45991g = m20499a;
        m19416f.m20854a(m20499a);
        c3730x.m18775a(context);
        C3375Ii m20495a = c4173o3.m20495a(context, m20499a, c3291f9, mo18691c);
        this.f45987c = m20495a;
        this.f45994j = interfaceC3859c1.mo18687a();
        this.f45993i = c3817ab;
        m20499a.m20418a(m20495a);
        this.f45988d = c4173o3.m20494a(m20499a, c3291f9, mo18691c);
        this.f45990f = c4173o3.m20497a(context, m20496a, m20499a, mo18691c, m20495a);
        this.f45995k = c3755y.m19420k();
    }

    @Override // com.yandex.metrica.impl.p023ob.ResultReceiverC4144n0.a
    @AnyThread
    /* renamed from: a */
    public void mo18335a(int i2, @NonNull Bundle bundle) {
        this.f45987c.m18322a(bundle, (InterfaceC4448yi) null);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3885d1
    @WorkerThread
    /* renamed from: a */
    public void mo18763a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f45988d.m17970a(deferredDeeplinkParametersListener);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3885d1
    @WorkerThread
    /* renamed from: a */
    public void mo18762a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f45988d.m17969a(deferredDeeplinkListener);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3885d1
    @WorkerThread
    /* renamed from: a */
    public void mo18761a(@NonNull AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        a aVar = new a(appMetricaDeviceIDListener);
        this.f45997m = aVar;
        this.f45987c.m18323a(aVar, Collections.singletonList("appmetrica_device_id_hash"), this.f45989e.m19222a());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3885d1
    @NonNull
    @WorkerThread
    /* renamed from: a */
    public InterfaceC3706W0 mo18759a(@NonNull C3130i c3130i) {
        return this.f45990f.mo18638b(c3130i);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3885d1
    @Nullable
    @AnyThread
    /* renamed from: a */
    public String mo18760a() {
        return this.f45987c.m18333e();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3885d1
    @WorkerThread
    /* renamed from: a */
    public void mo18764a(IIdentifierCallback iIdentifierCallback, @NonNull List<String> list) {
        this.f45987c.m18323a(iIdentifierCallback, list, this.f45989e.m19222a());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    @WorkerThread
    /* renamed from: a */
    public void mo18452a(@Nullable Location location) {
        this.f45996l.m20774b().mo18452a(location);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    @WorkerThread
    /* renamed from: a */
    public void mo18459a(boolean z) {
        this.f45996l.m20774b().mo18459a(z);
    }
}
