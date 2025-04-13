package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.od */
/* loaded from: classes3.dex */
public final class C5534od {

    /* renamed from: a */
    @NonNull
    private final C5435md f53256a = new C5435md();

    @NonNull
    /* renamed from: a */
    public final String m27077a(@NonNull String str, @NonNull JSONObject jSONObject) throws JSONException, ni0 {
        String m29759a = xj0.m29759a(str, jSONObject);
        Objects.requireNonNull(this.f53256a);
        String m26615a = C5435md.m26615a(m29759a);
        if (TextUtils.isEmpty(m26615a)) {
            throw new ni0("Native Ad json has attribute with broken base64 encoding");
        }
        return m26615a;
    }
}
