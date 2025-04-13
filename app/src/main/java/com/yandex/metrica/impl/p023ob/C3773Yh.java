package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Yh */
/* loaded from: classes2.dex */
class C3773Yh {

    /* renamed from: a */
    @NonNull
    private final C3922ec f44589a;

    /* renamed from: b */
    @NonNull
    private final Context f44590b;

    /* renamed from: c */
    @Nullable
    private String f44591c;

    /* renamed from: d */
    @Nullable
    private String f44592d;

    /* renamed from: e */
    private boolean f44593e;

    /* renamed from: f */
    @NonNull
    private C3575Qi f44594f;

    public C3773Yh(@NonNull Context context, @NonNull C3575Qi c3575Qi) {
        this(context, c3575Qi, C3532P0.m18696i().m18717t());
    }

    @NonNull
    /* renamed from: a */
    public String m19481a() {
        C3818ac c3818ac;
        C3818ac c3818ac2;
        JSONObject jSONObject = new JSONObject();
        if (!this.f44593e) {
            C3974gc m19805a = this.f44589a.m19805a(this.f44590b);
            C3844bc m19958a = m19805a.m19958a();
            String str = null;
            this.f44591c = (!m19958a.m19650a() || (c3818ac2 = m19958a.f44822a) == null) ? null : c3818ac2.f44734b;
            C3844bc m19959b = m19805a.m19959b();
            if (m19959b.m19650a() && (c3818ac = m19959b.f44822a) != null) {
                str = c3818ac.f44734b;
            }
            this.f44592d = str;
            this.f44593e = true;
        }
        try {
            m19480a(jSONObject, "uuid", this.f44594f.m18841V());
            m19480a(jSONObject, "device_id", this.f44594f.m18851i());
            m19480a(jSONObject, "google_aid", this.f44591c);
            m19480a(jSONObject, "huawei_aid", this.f44592d);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    @VisibleForTesting
    public C3773Yh(@NonNull Context context, @NonNull C3575Qi c3575Qi, @NonNull C3922ec c3922ec) {
        this.f44593e = false;
        this.f44590b = context;
        this.f44594f = c3575Qi;
        this.f44589a = c3922ec;
    }

    /* renamed from: a */
    public void m19482a(@NonNull C3575Qi c3575Qi) {
        this.f44594f = c3575Qi;
    }

    /* renamed from: a */
    private void m19480a(@NonNull JSONObject jSONObject, @NonNull String str, @Nullable String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }
}
