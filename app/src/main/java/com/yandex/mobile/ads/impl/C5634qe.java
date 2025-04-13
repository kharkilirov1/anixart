package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.model.AdUnitIdBiddingSettings;
import com.yandex.mobile.ads.base.model.BiddingSettings;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.qe */
/* loaded from: classes3.dex */
public final class C5634qe {

    /* renamed from: a */
    @NonNull
    private final ud0 f54029a = new ud0();

    @Nullable
    /* renamed from: a */
    public final AdUnitIdBiddingSettings m27701a(@NonNull JSONObject jSONObject) {
        String m24812b;
        try {
            try {
                m24812b = g70.m24812b("ad_unit_id", jSONObject);
            } catch (JSONException unused) {
                m24812b = g70.m24812b("block_id", jSONObject);
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("networks");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList(optJSONArray.length());
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    qd0 m28984a = this.f54029a.m28984a(optJSONArray.getJSONObject(i2));
                    if (m28984a != null) {
                        arrayList.add(m28984a);
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new AdUnitIdBiddingSettings(m24812b, jSONObject.toString(), arrayList);
                }
            }
        } catch (JSONException unused2) {
            n60.m26810c("Can't parse bidding block in bidding settings json", new Object[0]);
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public final BiddingSettings m27702b(@NonNull JSONObject jSONObject) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
            if (optJSONArray == null) {
                optJSONArray = jSONObject.optJSONArray("block_id_settings");
            }
            if (optJSONArray != null && optJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    AdUnitIdBiddingSettings m27701a = m27701a(optJSONArray.getJSONObject(i2));
                    if (m27701a != null) {
                        arrayList.add(m27701a);
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new BiddingSettings(arrayList);
                }
            }
        } catch (JSONException unused) {
            n60.m26810c("Can't parse bidding settings json", new Object[0]);
        }
        return null;
    }
}
