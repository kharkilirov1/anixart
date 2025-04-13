package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.yandex.metrica.impl.p023ob.C4082kg;
import com.yandex.metrica.impl.p023ob.C4452ym;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.tj */
/* loaded from: classes2.dex */
public class C4319tj {
    /* renamed from: a */
    public void m20839a(@NonNull C4371vj c4371vj, @NonNull C4452ym.a aVar) {
        JSONObject optJSONObject;
        if (!c4371vj.m20995O() || (optJSONObject = aVar.optJSONObject("socket")) == null) {
            return;
        }
        C4082kg.p pVar = new C4082kg.p();
        long optLong = optJSONObject.optLong("seconds_to_live");
        long optLong2 = optJSONObject.optLong("first_delay_seconds", pVar.f45773f);
        int optInt = optJSONObject.optInt("launch_delay_seconds", pVar.f45774g);
        long optLong3 = optJSONObject.optLong("open_event_interval_seconds", pVar.f45775h);
        long optLong4 = optJSONObject.optLong("min_failed_request_interval_seconds", pVar.f45776i);
        long optLong5 = optJSONObject.optLong("min_successful_request_interval_seconds", pVar.f45777j);
        long optLong6 = optJSONObject.optLong("open_retry_interval_seconds", pVar.f45778k);
        String optString = optJSONObject.optString(FirebaseMessagingService.EXTRA_TOKEN);
        JSONArray optJSONArray = optJSONObject.optJSONArray("ports_https");
        JSONArray jSONArray = new JSONArray();
        if (optJSONArray == null) {
            optJSONArray = jSONArray;
        }
        JSONArray optJSONArray2 = optJSONObject.optJSONArray("ports_http");
        JSONArray jSONArray2 = new JSONArray();
        if (optJSONArray2 == null) {
            optJSONArray2 = jSONArray2;
        }
        boolean z = optJSONArray.length() > 0 || optJSONArray2.length() > 0;
        if (optLong <= 0 || TextUtils.isEmpty(optString) || !z) {
            return;
        }
        List<Integer> m20838a = m20838a(optJSONArray);
        List<Integer> m20838a2 = m20838a(optJSONArray2);
        if (((ArrayList) m20838a).isEmpty() && ((ArrayList) m20838a2).isEmpty()) {
            return;
        }
        c4371vj.m21001a(new C3275Ei(optLong, optString, m20838a, m20838a2, optLong2, optInt, optLong3, optLong4, optLong5, optLong6));
    }

    @NonNull
    /* renamed from: a */
    private List<Integer> m20838a(@NonNull JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            int optInt = jSONArray.optInt(i2);
            if (optInt != 0) {
                arrayList.add(Integer.valueOf(optInt));
            }
        }
        return arrayList;
    }
}
