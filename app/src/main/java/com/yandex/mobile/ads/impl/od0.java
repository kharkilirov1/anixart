package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.model.MediationData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class od0 implements dx0<MediationData> {

    /* renamed from: a */
    @NonNull
    private final nm0 f53257a = new nm0();

    /* renamed from: b */
    @NonNull
    private final ud0 f53258b = new ud0();

    @Override // com.yandex.mobile.ads.impl.dx0
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final MediationData mo23954a(@NonNull sw0 sw0Var) {
        String mo26691a = this.f53257a.mo26691a(sw0Var);
        if (TextUtils.isEmpty(mo26691a)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(mo26691a);
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("passback_parameters");
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject2.getString(next));
                }
                if (hashMap.isEmpty()) {
                    return null;
                }
                JSONArray jSONArray = jSONObject.getJSONArray("networks");
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    qd0 m28984a = this.f53258b.m28984a(jSONArray.getJSONObject(i2));
                    if (m28984a != null) {
                        arrayList.add(m28984a);
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new MediationData(arrayList, hashMap);
            } catch (JSONException e2) {
                n60.m26808a(e2, "Can't parse mediation passback_parameters", new Object[0]);
                throw new JSONException(e2.getMessage());
            }
        } catch (JSONException e3) {
            n60.m26808a(e3, "Can't parse mediation data response", new Object[0]);
            return null;
        }
    }
}
