package com.yandex.metrica.impl.p023ob;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.metrica.impl.p023ob.AbstractC3632T1;
import com.yandex.metrica.impl.p023ob.C3710W4;
import com.yandex.metrica.impl.p023ob.C4352v0;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.V4 */
/* loaded from: classes2.dex */
public class C3685V4 extends AbstractC3732X1<C4135mh, C4352v0.a> {

    /* renamed from: o */
    @NonNull
    private final InterfaceC3760Y4 f44201o;

    /* renamed from: p */
    @NonNull
    private final C4066k0 f44202p;

    /* renamed from: q */
    @NonNull
    private final C3785Z4 f44203q;

    /* renamed from: r */
    @NonNull
    private final C3710W4.b f44204r;

    /* renamed from: s */
    @NonNull
    private final InterfaceC3529Om f44205s;

    /* renamed from: t */
    @NonNull
    private C4374vm f44206t;

    /* renamed from: u */
    @NonNull
    private final String f44207u;

    /* renamed from: v */
    @NonNull
    private final C3365I8 f44208v;

    /* renamed from: w */
    @Nullable
    private C3735X4 f44209w;

    public C3685V4(@NonNull InterfaceC3760Y4 interfaceC3760Y4, @NonNull C4066k0 c4066k0, @NonNull C3785Z4 c3785z4, @NonNull C3365I8 c3365i8) {
        this(interfaceC3760Y4, c4066k0, c3785z4, c3365i8, new C3710W4.b(), new C3504Nm(), new C4374vm(), new C4135mh(), new C4300t0());
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: A */
    public boolean mo18504A() {
        return super.mo18504A() & (!m19126m());
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: a */
    public void mo18427a(@NonNull Uri.Builder builder) {
        C4135mh c4135mh = (C4135mh) this.f44039j;
        C3735X4 c3735x4 = this.f44209w;
        Objects.requireNonNull(c4135mh);
        builder.appendPath("diagnostic");
        builder.appendQueryParameter("deviceid", c3735x4.m19751g());
        builder.appendQueryParameter("uuid", c3735x4.m19768x());
        builder.appendQueryParameter("app_platform", "android");
        builder.appendQueryParameter("analytics_sdk_version_name", "5.0.0");
        builder.appendQueryParameter("analytics_sdk_build_number", "45001354");
        builder.appendQueryParameter("analytics_sdk_build_type", c3735x4.m19755k());
        if (c3735x4.m19755k().contains("source") && !TextUtils.isEmpty("f6c3700f69aeb2f115563bfb01aee99b5faed63c")) {
            builder.appendQueryParameter("commit_hash", "f6c3700f69aeb2f115563bfb01aee99b5faed63c");
        }
        builder.appendQueryParameter("app_version_name", c3735x4.m19750f());
        builder.appendQueryParameter("app_build_number", c3735x4.m19742b());
        builder.appendQueryParameter("model", c3735x4.m19758n());
        builder.appendQueryParameter("manufacturer", c3735x4.m19757m());
        builder.appendQueryParameter("os_version", c3735x4.m19760p());
        builder.appendQueryParameter("os_api_level", String.valueOf(c3735x4.m19759o()));
        builder.appendQueryParameter("screen_width", String.valueOf(c3735x4.m19766v()));
        builder.appendQueryParameter("screen_height", String.valueOf(c3735x4.m19765u()));
        builder.appendQueryParameter("screen_dpi", String.valueOf(c3735x4.m19764t()));
        builder.appendQueryParameter("scalefactor", String.valueOf(c3735x4.m19763s()));
        builder.appendQueryParameter("locale", c3735x4.m19756l());
        builder.appendQueryParameter("device_type", c3735x4.m19754j());
        builder.appendQueryParameter("app_id", c3735x4.m19761q());
        builder.appendQueryParameter("api_key_128", c3735x4.m19383C());
        builder.appendQueryParameter("app_debuggable", c3735x4.m19968A());
        builder.appendQueryParameter("is_rooted", c3735x4.m19753i());
        builder.appendQueryParameter("app_framework", c3735x4.m19744c());
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    @NonNull
    /* renamed from: b */
    public AbstractC3632T1.a mo18428b() {
        return AbstractC3632T1.a.DIAGNOSTIC;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: b */
    public void mo18429b(@Nullable Throwable th) {
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: o */
    public boolean mo18431o() {
        C3735X4 mo19137a = this.f44201o.mo19137a();
        this.f44209w = mo19137a;
        if (!(mo19137a.m19769y() && !C3658U2.m19217b(this.f44209w.m19384D()))) {
            return false;
        }
        m19114a(this.f44209w.m19384D());
        C3710W4.b bVar = this.f44204r;
        C4066k0 c4066k0 = this.f44202p;
        C3735X4 c3735x4 = this.f44209w;
        C3785Z4 c3785z4 = this.f44203q;
        C3365I8 c3365i8 = this.f44208v;
        Objects.requireNonNull(bVar);
        byte[] m19351a = new C3710W4(c4066k0, c3735x4, c3785z4, new C4018i4(c3365i8), new C3480Mn(RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE, "diagnostic event name", AbstractC4478zm.m21311a()), new C3480Mn(204800, "diagnostic event value", AbstractC4478zm.m21311a()), new C3504Nm()).m19351a();
        byte[] bArr = null;
        try {
            Objects.requireNonNull(this.f44206t);
            bArr = C3681V0.m19267b(m19351a);
        } catch (Throwable unused) {
        }
        if (!C3658U2.m19214a(bArr)) {
            m19112a("Content-Encoding", "gzip");
            m19351a = bArr;
        }
        mo19115a(m19351a);
        return true;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: p */
    public boolean mo19128p() {
        boolean mo19128p = super.mo19128p();
        m19111a(this.f44205s.mo18643a());
        return mo19128p;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: r */
    public boolean mo18432r() {
        C4352v0.a m19377B = m19377B();
        return m19377B != null && "accepted".equals(m19377B.f46665a);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: t */
    public void mo18434t() {
    }

    @VisibleForTesting
    public C3685V4(@NonNull InterfaceC3760Y4 interfaceC3760Y4, @NonNull C4066k0 c4066k0, @NonNull C3785Z4 c3785z4, @NonNull C3365I8 c3365i8, @NonNull C3710W4.b bVar, @NonNull InterfaceC3529Om interfaceC3529Om, @NonNull C4374vm c4374vm, @NonNull C4135mh c4135mh, @NonNull C4300t0 c4300t0) {
        super(c4300t0, c4135mh);
        this.f44201o = interfaceC3760Y4;
        this.f44202p = c4066k0;
        this.f44203q = c3785z4;
        this.f44208v = c3365i8;
        this.f44204r = bVar;
        this.f44205s = interfaceC3529Om;
        this.f44206t = c4374vm;
        this.f44207u = C3685V4.class.getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    @NonNull
    /* renamed from: a */
    public String mo18426a() {
        return this.f44207u;
    }
}
