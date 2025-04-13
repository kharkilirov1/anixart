package com.yandex.mobile.ads.exo.drm;

import com.fasterxml.jackson.core.JsonPointer;
import com.yandex.mobile.ads.impl.d90;
import com.yandex.mobile.ads.impl.l60;
import com.yandex.mobile.ads.impl.s91;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.exo.drm.a */
/* loaded from: classes2.dex */
final class C4714a {
    /* renamed from: a */
    public static byte[] m22091a(byte[] bArr) {
        if (s91.f54530a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(s91.m28103a(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                if (i2 != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                sb.append("{\"k\":\"");
                sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', JsonPointer.SEPARATOR));
                sb.append("\",\"kid\":\"");
                sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', JsonPointer.SEPARATOR));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return s91.m28124b(sb.toString());
        } catch (JSONException e2) {
            StringBuilder m26356a = l60.m26356a("Failed to adjust response data: ");
            m26356a.append(s91.m28103a(bArr));
            d90.m23838a("ClearKeyUtil", m26356a.toString(), e2);
            return bArr;
        }
    }
}
