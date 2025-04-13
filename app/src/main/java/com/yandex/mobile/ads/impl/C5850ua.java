package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.ua */
/* loaded from: classes3.dex */
public final class C5850ua {

    /* renamed from: a */
    @NonNull
    private final Context f55428a;

    /* renamed from: b */
    @NonNull
    private final b80 f55429b;

    public C5850ua(@NonNull Context context, @NonNull b80 b80Var) {
        this.f55428a = context.getApplicationContext();
        this.f55429b = b80Var;
    }

    @NonNull
    /* renamed from: a */
    public final C5276ja m28917a(@NonNull JSONObject jSONObject) throws JSONException, ni0 {
        InterfaceC5908va c5496ni;
        if (!yj0.m29948a(jSONObject, "name", "type", "clickable", "required", "value")) {
            throw new ni0("Native Ad json has not required attributes");
        }
        String m29759a = xj0.m29759a("type", jSONObject);
        String m29759a2 = xj0.m29759a("name", jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject("link");
        a80 m22740a = optJSONObject != null ? this.f55429b.m22740a(optJSONObject) : null;
        Context context = this.f55428a;
        Objects.requireNonNull(m29759a2);
        if (m29759a2.equals("close_button")) {
            c5496ni = new C5496ni();
        } else if (m29759a2.equals("feedback")) {
            c5496ni = new C5460mu(new c20());
        } else {
            Objects.requireNonNull(m29759a);
            switch (m29759a) {
                case "number":
                    c5496ni = new en0();
                    break;
                case "string":
                    c5496ni = new q41();
                    break;
                case "image":
                    c5496ni = new c20();
                    break;
                case "media":
                    c5496ni = new kc0(context);
                    break;
                default:
                    n60.m26810c("Asset type doesn't supported", new Object[0]);
                    throw new ni0("Native Ad json has not required attributes");
            }
        }
        return new C5276ja(m29759a2, m29759a, c5496ni.mo23010a(jSONObject), m22740a, jSONObject.getBoolean("clickable"), jSONObject.getBoolean("required"));
    }
}
