package com.yandex.metrica.push.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.yandex.metrica.push.core.notification.C4503f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.push.impl.s0 */
/* loaded from: classes2.dex */
public class C4599s0 {
    @NonNull
    /* renamed from: a */
    public String m21731a(@Nullable String str, @NonNull C4503f c4503f) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FirebaseMessagingService.EXTRA_TOKEN, str);
            jSONObject.put("notifications_status", m21730a(c4503f));
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    @Nullable
    /* renamed from: a */
    private JSONObject m21730a(@NonNull C4503f c4503f) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enabled", c4503f.f47262c);
            jSONObject.put("system_notify_time", c4503f.m21400a());
            jSONObject.put("changed", c4503f.f47263d ? Boolean.TRUE : null);
            if (c4503f.f47260a.size() != 0) {
                JSONObject jSONObject2 = new JSONObject();
                for (C4503f.b bVar : c4503f.f47260a) {
                    jSONObject2.put(bVar.f47268a, m21729a(bVar));
                }
                jSONObject.put("groups", jSONObject2);
            }
            if (c4503f.f47261b.size() != 0) {
                JSONObject jSONObject3 = new JSONObject();
                for (C4503f.a aVar : c4503f.f47261b) {
                    jSONObject3.put(aVar.f47265a, m21728a(aVar));
                }
                jSONObject.put("channels", jSONObject3);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @NonNull
    /* renamed from: a */
    private JSONObject m21729a(@NonNull C4503f.b bVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enabled", bVar.f47270c);
        jSONObject.put("changed", bVar.f47271d ? Boolean.TRUE : null);
        JSONObject jSONObject2 = new JSONObject();
        for (C4503f.a aVar : bVar.f47269b) {
            jSONObject2.put(aVar.f47265a, m21728a(aVar));
        }
        jSONObject.put("channels", jSONObject2);
        return jSONObject;
    }

    @NonNull
    /* renamed from: a */
    private JSONObject m21728a(@NonNull C4503f.a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enabled", aVar.f47266b);
        jSONObject.put("changed", aVar.f47267c ? Boolean.TRUE : null);
        return jSONObject;
    }
}
