package com.yandex.metrica.impl.p023ob;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.U */
/* loaded from: classes2.dex */
public class C3655U {

    /* renamed from: a */
    @NonNull
    private final C3963g1 f44108a;

    /* renamed from: b */
    @NonNull
    private final C3963g1 f44109b;

    /* renamed from: c */
    @NonNull
    private final C3963g1 f44110c;

    /* renamed from: d */
    @NonNull
    private final C3963g1 f44111d;

    /* renamed from: e */
    @NonNull
    private final C3963g1 f44112e;

    /* renamed from: f */
    @NonNull
    private final C3963g1 f44113f;

    /* renamed from: g */
    @NonNull
    private final C3963g1 f44114g;

    /* renamed from: h */
    @NonNull
    private final C3963g1 f44115h;

    /* renamed from: i */
    @NonNull
    private final C3963g1 f44116i;

    /* renamed from: j */
    @NonNull
    private final C3963g1 f44117j;

    /* renamed from: k */
    @NonNull
    private final C3963g1 f44118k;

    /* renamed from: l */
    private final long f44119l;

    /* renamed from: m */
    @Nullable
    private final C3378Il f44120m;

    /* renamed from: n */
    @NonNull
    private final C3741Xa f44121n;

    /* renamed from: o */
    private final long f44122o;

    /* renamed from: p */
    @NonNull
    private final C4422xi f44123p;

    public C3655U(@NonNull C3575Qi c3575Qi, @NonNull C3974gc c3974gc, @Nullable Map<String, String> map) {
        this(m19172a(c3575Qi.m18841V()), m19172a(c3575Qi.m18851i()), m19172a(c3575Qi.m18853k()), m19172a(c3575Qi.m18826G()), m19172a(c3575Qi.m18859q()), m19172a(C4452ym.m21239a(C4452ym.m21241a(c3575Qi.m18857o()))), m19172a(C4452ym.m21239a(map)), new C3963g1(c3974gc.m19958a().f44822a == null ? null : c3974gc.m19958a().f44822a.f44734b, c3974gc.m19958a().f44823b, c3974gc.m19958a().f44824c), new C3963g1(c3974gc.m19959b().f44822a == null ? null : c3974gc.m19959b().f44822a.f44734b, c3974gc.m19959b().f44823b, c3974gc.m19959b().f44824c), new C3963g1(c3974gc.m19960c().f44822a != null ? c3974gc.m19960c().f44822a.f44734b : null, c3974gc.m19960c().f44823b, c3974gc.m19960c().f44824c), m19172a(C4452ym.m21253b(c3575Qi.m18850h())), new C3378Il(c3575Qi), c3575Qi.m18855m(), C4013i.m20027a(), c3575Qi.m18822C() + c3575Qi.m18834O().m19166a(), m19174a(c3575Qi.m18848f().f46425y));
    }

    @NonNull
    /* renamed from: a */
    public C3963g1 m19177a() {
        return this.f44114g;
    }

    @NonNull
    /* renamed from: b */
    public C3963g1 m19178b() {
        return this.f44118k;
    }

    @NonNull
    /* renamed from: c */
    public C3963g1 m19179c() {
        return this.f44109b;
    }

    @NonNull
    /* renamed from: d */
    public C3963g1 m19181d() {
        return this.f44110c;
    }

    @NonNull
    /* renamed from: e */
    public C3741Xa m19182e() {
        return this.f44121n;
    }

    @NonNull
    /* renamed from: f */
    public C4422xi m19183f() {
        return this.f44123p;
    }

    @NonNull
    /* renamed from: g */
    public C3963g1 m19184g() {
        return this.f44115h;
    }

    @NonNull
    /* renamed from: h */
    public C3963g1 m19185h() {
        return this.f44112e;
    }

    @NonNull
    /* renamed from: i */
    public C3963g1 m19186i() {
        return this.f44116i;
    }

    /* renamed from: j */
    public long m19187j() {
        return this.f44122o;
    }

    @NonNull
    /* renamed from: k */
    public C3963g1 m19188k() {
        return this.f44111d;
    }

    @NonNull
    /* renamed from: l */
    public C3963g1 m19189l() {
        return this.f44113f;
    }

    /* renamed from: m */
    public long m19190m() {
        return this.f44119l;
    }

    @Nullable
    /* renamed from: n */
    public C3378Il m19191n() {
        return this.f44120m;
    }

    @NonNull
    /* renamed from: o */
    public C3963g1 m19192o() {
        return this.f44108a;
    }

    @NonNull
    /* renamed from: p */
    public C3963g1 m19193p() {
        return this.f44117j;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ClientIdentifiersHolder{mUuidData=");
        m24u.append(this.f44108a);
        m24u.append(", mDeviceIdData=");
        m24u.append(this.f44109b);
        m24u.append(", mDeviceIdHashData=");
        m24u.append(this.f44110c);
        m24u.append(", mReportAdUrlData=");
        m24u.append(this.f44111d);
        m24u.append(", mGetAdUrlData=");
        m24u.append(this.f44112e);
        m24u.append(", mResponseClidsData=");
        m24u.append(this.f44113f);
        m24u.append(", mClientClidsForRequestData=");
        m24u.append(this.f44114g);
        m24u.append(", mGaidData=");
        m24u.append(this.f44115h);
        m24u.append(", mHoaidData=");
        m24u.append(this.f44116i);
        m24u.append(", yandexAdvIdData=");
        m24u.append(this.f44117j);
        m24u.append(", customSdkHostsData=");
        m24u.append(this.f44118k);
        m24u.append(", customSdkHosts=");
        m24u.append(this.f44118k);
        m24u.append(", mServerTimeOffset=");
        m24u.append(this.f44119l);
        m24u.append(", mUiAccessConfig=");
        m24u.append(this.f44120m);
        m24u.append(", diagnosticsConfigsHolder=");
        m24u.append(this.f44121n);
        m24u.append(", nextStartupTime=");
        m24u.append(this.f44122o);
        m24u.append(", features=");
        m24u.append(this.f44123p);
        m24u.append('}');
        return m24u.toString();
    }

    @NonNull
    /* renamed from: a */
    private static Bundle m19169a(@NonNull Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("value", parcelable);
        return bundle;
    }

    @Nullable
    /* renamed from: b */
    private static C3378Il m19175b(@NonNull Bundle bundle) {
        return (C3378Il) m19170a(bundle.getBundle("UiAccessConfig"), C3378Il.class.getClassLoader());
    }

    /* renamed from: c */
    public void m19180c(@NonNull Bundle bundle) {
        bundle.putBundle("Uuid", m19169a(this.f44108a));
        bundle.putBundle("DeviceId", m19169a(this.f44109b));
        bundle.putBundle("DeviceIdHash", m19169a(this.f44110c));
        bundle.putBundle("AdUrlReport", m19169a(this.f44111d));
        bundle.putBundle("AdUrlGet", m19169a(this.f44112e));
        bundle.putBundle("Clids", m19169a(this.f44113f));
        bundle.putBundle("RequestClids", m19169a(this.f44114g));
        bundle.putBundle("GAID", m19169a(this.f44115h));
        bundle.putBundle("HOAID", m19169a(this.f44116i));
        bundle.putBundle("YANDEX_ADV_ID", m19169a(this.f44117j));
        bundle.putBundle("CUSTOM_SDK_HOSTS", m19169a(this.f44118k));
        bundle.putBundle("UiAccessConfig", m19169a(this.f44120m));
        bundle.putBundle("DiagnosticsConfigsHolder", m19169a(this.f44121n));
        bundle.putLong("ServerTimeOffset", this.f44119l);
        bundle.putLong("NextStartupTime", this.f44122o);
        bundle.putBundle("features", m19169a(this.f44123p));
    }

    @Nullable
    /* renamed from: a */
    private static Parcelable m19170a(@Nullable Bundle bundle, @Nullable ClassLoader classLoader) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return bundle.getParcelable("value");
    }

    @NonNull
    /* renamed from: b */
    private static C3963g1 m19176b(@NonNull Bundle bundle, @NonNull String str) {
        C3963g1 c3963g1 = (C3963g1) m19170a(bundle.getBundle(str), C3963g1.class.getClassLoader());
        return c3963g1 == null ? new C3963g1(null, EnumC3911e1.UNKNOWN, "bundle serialization error") : c3963g1;
    }

    @NonNull
    /* renamed from: a */
    private static C3741Xa m19171a(@NonNull Bundle bundle) {
        C3741Xa c3741Xa = (C3741Xa) m19170a(bundle.getBundle("DiagnosticsConfigsHolder"), C3741Xa.class.getClassLoader());
        return c3741Xa == null ? new C3741Xa() : c3741Xa;
    }

    @NonNull
    /* renamed from: a */
    private static C4422xi m19173a(@NonNull Bundle bundle, @NonNull String str) {
        C4422xi c4422xi = (C4422xi) m19170a(bundle.getBundle(str), C4422xi.class.getClassLoader());
        return c4422xi == null ? new C4422xi(null, EnumC3911e1.UNKNOWN, "bundle serialization error") : c4422xi;
    }

    @NonNull
    /* renamed from: a */
    private static C3963g1 m19172a(@Nullable String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        return new C3963g1(str, isEmpty ? EnumC3911e1.UNKNOWN : EnumC3911e1.OK, isEmpty ? "no identifier in startup state" : null);
    }

    @NonNull
    /* renamed from: a */
    private static C4422xi m19174a(@Nullable Boolean bool) {
        boolean z = bool != null;
        return new C4422xi(bool, z ? EnumC3911e1.OK : EnumC3911e1.UNKNOWN, z ? null : "no identifier in startup state");
    }

    public C3655U(@NonNull Bundle bundle) {
        this(m19176b(bundle, "Uuid"), m19176b(bundle, "DeviceId"), m19176b(bundle, "DeviceIdHash"), m19176b(bundle, "AdUrlReport"), m19176b(bundle, "AdUrlGet"), m19176b(bundle, "Clids"), m19176b(bundle, "RequestClids"), m19176b(bundle, "GAID"), m19176b(bundle, "HOAID"), m19176b(bundle, "YANDEX_ADV_ID"), m19176b(bundle, "CUSTOM_SDK_HOSTS"), m19175b(bundle), m19171a(bundle), bundle.getLong("ServerTimeOffset"), bundle.getLong("NextStartupTime"), m19173a(bundle, "features"));
    }

    public C3655U(@NonNull C3963g1 c3963g1, @NonNull C3963g1 c3963g12, @NonNull C3963g1 c3963g13, @NonNull C3963g1 c3963g14, @NonNull C3963g1 c3963g15, @NonNull C3963g1 c3963g16, @NonNull C3963g1 c3963g17, @NonNull C3963g1 c3963g18, @NonNull C3963g1 c3963g19, @NonNull C3963g1 c3963g110, @NonNull C3963g1 c3963g111, @Nullable C3378Il c3378Il, @NonNull C3741Xa c3741Xa, long j2, long j3, @NonNull C4422xi c4422xi) {
        this.f44108a = c3963g1;
        this.f44109b = c3963g12;
        this.f44110c = c3963g13;
        this.f44111d = c3963g14;
        this.f44112e = c3963g15;
        this.f44113f = c3963g16;
        this.f44114g = c3963g17;
        this.f44115h = c3963g18;
        this.f44116i = c3963g19;
        this.f44117j = c3963g110;
        this.f44118k = c3963g111;
        this.f44120m = c3378Il;
        this.f44121n = c3741Xa;
        this.f44119l = j2;
        this.f44122o = j3;
        this.f44123p = c4422xi;
    }
}
