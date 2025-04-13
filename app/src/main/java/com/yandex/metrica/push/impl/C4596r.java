package com.yandex.metrica.push.impl;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.common.CoreConstants;
import com.yandex.metrica.push.common.utils.CoreUtils;
import com.yandex.metrica.push.common.utils.InternalLogger;
import com.yandex.metrica.push.common.utils.PublicLogger;
import com.yandex.metrica.push.common.utils.TrackersHub;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.push.impl.r */
/* loaded from: classes2.dex */
public class C4596r {

    /* renamed from: a */
    @NonNull
    private final Context f47492a;

    /* renamed from: b */
    @Nullable
    private final String f47493b;

    /* renamed from: c */
    private final boolean f47494c;

    /* renamed from: d */
    @Nullable
    private final String f47495d;

    /* renamed from: e */
    @Nullable
    private final C4598s f47496e;

    /* renamed from: f */
    @NonNull
    private final Bundle f47497f;

    /* renamed from: g */
    @NonNull
    private final String f47498g;

    /* renamed from: h */
    private final long f47499h;

    /* renamed from: i */
    @Nullable
    private final C4590o f47500i;

    /* renamed from: j */
    @Nullable
    private final String f47501j;

    /* renamed from: k */
    @Nullable
    private final C4592p f47502k;

    /* renamed from: l */
    @Nullable
    private final Long f47503l;

    public C4596r(@NonNull Context context, @NonNull Bundle bundle) {
        this.f47492a = context;
        this.f47497f = bundle;
        this.f47498g = bundle.getString(CoreConstants.EXTRA_TRANSPORT, CoreConstants.Transport.UNKNOWN);
        JSONObject m21652a = m21652a(bundle);
        this.f47493b = C4605v0.m21739d(m21652a, "a");
        this.f47494c = C4605v0.m21736a(m21652a, "b", false);
        this.f47495d = C4605v0.m21739d(m21652a, "c");
        C4598s m21651a = m21651a(context, m21652a);
        this.f47496e = m21651a;
        this.f47499h = m21651a == null ? System.currentTimeMillis() : m21651a.m21679I().longValue();
        this.f47500i = m21653b(m21652a);
        this.f47501j = C4605v0.m21739d(m21652a, "e");
        this.f47502k = m21654c(m21652a);
        this.f47503l = C4605v0.m21738c(m21652a, "h");
    }

    @Nullable
    /* renamed from: a */
    public static JSONObject m21652a(@NonNull Bundle bundle) {
        try {
            return new JSONObject(CoreUtils.extractRootElement(bundle));
        } catch (Throwable unused) {
            PublicLogger.m21386w("Ignore parse push message exception", new Object[0]);
            return null;
        }
    }

    @Nullable
    /* renamed from: b */
    private C4590o m21653b(@Nullable JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("f")) {
            try {
                return new C4590o(jSONObject.getJSONObject("f"));
            } catch (Throwable th) {
                InternalLogger.m21369e(th, "Error parsing filters", new Object[0]);
                TrackersHub.getInstance().reportError("Error parsing filters", th);
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: c */
    private C4592p m21654c(@Nullable JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("g")) {
            try {
                return new C4592p(jSONObject.getJSONObject("g"));
            } catch (Throwable th) {
                InternalLogger.m21369e(th, "Error parsing lazy push json", new Object[0]);
                TrackersHub.getInstance().reportError("Error parsing lazy push json", th);
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: d */
    public String m21659d() {
        return this.f47493b;
    }

    @Nullable
    /* renamed from: e */
    public String m21660e() {
        return this.f47495d;
    }

    @Nullable
    /* renamed from: f */
    public String m21661f() {
        return this.f47501j;
    }

    @Nullable
    /* renamed from: g */
    public Long m21662g() {
        return this.f47503l;
    }

    /* renamed from: h */
    public long m21663h() {
        return this.f47499h;
    }

    @NonNull
    /* renamed from: i */
    public String m21664i() {
        return this.f47498g;
    }

    /* renamed from: j */
    public boolean m21665j() {
        return this.f47494c;
    }

    @Nullable
    /* renamed from: a */
    private C4598s m21651a(@NonNull Context context, @Nullable JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("d")) {
            try {
                return new C4598s(context, jSONObject.getJSONObject("d"), new C4518D0(context));
            } catch (Throwable th) {
                PublicLogger.m21384e(th, "Error parsing push notification", new Object[0]);
                TrackersHub.getInstance().reportError("Error parsing push notification", th);
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public C4592p m21657b() {
        return this.f47502k;
    }

    @Nullable
    /* renamed from: c */
    public C4598s m21658c() {
        return this.f47496e;
    }

    @Nullable
    /* renamed from: a */
    public C4590o m21655a() {
        return this.f47500i;
    }

    @NonNull
    /* renamed from: a */
    public C4596r m21656a(@Nullable JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return this;
        }
        Bundle bundle = new Bundle(this.f47497f);
        try {
            jSONObject2 = new JSONObject(CoreUtils.extractRootElement(this.f47497f));
        } catch (Throwable unused) {
            PublicLogger.m21386w("Ignore parse push message exception", new Object[0]);
            jSONObject2 = null;
        }
        JSONObject m21735a = C4605v0.m21735a(jSONObject2, jSONObject.optJSONObject("yamp"));
        if (m21735a != null) {
            bundle.putString("yamp", m21735a.toString());
        }
        return new C4596r(this.f47492a, bundle);
    }
}
