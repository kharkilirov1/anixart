package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.qd0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class ud0 {

    /* renamed from: a */
    @NonNull
    private final pd0 f55480a = new pd0();

    @Nullable
    /* renamed from: a */
    public final qd0 m28984a(@NonNull JSONObject jSONObject) {
        try {
            String m24812b = g70.m24812b("adapter", jSONObject);
            JSONObject jSONObject2 = jSONObject.getJSONObject("network_data");
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject2.getString(next));
            }
            if (!hashMap.isEmpty()) {
                qd0.C5631a c5631a = new qd0.C5631a(m24812b, hashMap);
                ArrayList m24813c = g70.m24813c("click_tracking_urls", jSONObject);
                ArrayList m24813c2 = g70.m24813c("impression_tracking_urls", jSONObject);
                ArrayList m24813c3 = g70.m24813c("ad_response_tracking_urls", jSONObject);
                c5631a.m27692b(m24813c).m27693c(m24813c2).m27688a(m24813c3).m27691a(g70.m24811a(jSONObject));
                if (jSONObject.has("impression_data")) {
                    Objects.requireNonNull(this.f55480a);
                    c5631a.m27690a(pd0.m27314a(jSONObject));
                }
                return c5631a.m27689a();
            }
        } catch (JSONException e2) {
            n60.m26808a(e2, "Can't parse mediation network", new Object[0]);
        }
        return null;
    }
}
