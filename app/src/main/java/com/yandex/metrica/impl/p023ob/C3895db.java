package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3196Be;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.db */
/* loaded from: classes2.dex */
public class C3895db implements InterfaceC3766Ya<C3196Be> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3766Ya
    @NonNull
    /* renamed from: a */
    public JSONObject mo19144a(@Nullable C3196Be c3196Be) {
        C3196Be c3196Be2 = c3196Be;
        JSONObject jSONObject = new JSONObject();
        if (c3196Be2 != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<C3196Be.a> it = c3196Be2.f42624b.iterator();
                while (it.hasNext()) {
                    C3196Be.a next = it.next();
                    jSONArray.put(next == null ? null : new JSONObject().putOpt("tracking_id", next.f42625a).put("additional_parameters", next.f42626b).put("source", next.f42627c.m17995a()));
                }
                JSONObject put = jSONObject.put("candidates", jSONArray);
                C3446Le c3446Le = c3196Be2.f42623a;
                put.put("chosen", new JSONObject().putOpt("tracking_id", c3446Le.f43331a).put("additional_parameters", c3446Le.f43332b).put("source", c3446Le.f43335e.m17995a()).put("auto_tracking_enabled", c3446Le.f43334d));
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }
}
