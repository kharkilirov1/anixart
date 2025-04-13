package com.yandex.metrica.impl.p023ob;

import android.util.Pair;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3200Bi;
import com.yandex.metrica.impl.p023ob.C4452ym;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.qj */
/* loaded from: classes2.dex */
public class C4241qj {

    /* renamed from: a */
    private static final Map<String, C3200Bi.a> f46250a = Collections.unmodifiableMap(new a());

    /* renamed from: com.yandex.metrica.impl.ob.qj$a */
    public class a extends HashMap<String, C3200Bi.a> {
        public a() {
            put("wifi", C3200Bi.a.WIFI);
            put("cell", C3200Bi.a.CELL);
        }
    }

    /* renamed from: a */
    public void m20601a(@NonNull C4371vj c4371vj, @NonNull C4452ym.a aVar) {
        JSONArray optJSONArray;
        JSONObject optJSONObject = aVar.optJSONObject("requests");
        if (optJSONObject == null || !optJSONObject.has("list") || (optJSONArray = optJSONObject.optJSONArray("list")) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            try {
                arrayList.add(m20600a(optJSONArray.getJSONObject(i2)));
            } catch (Throwable unused) {
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        c4371vj.m21041g(arrayList);
    }

    @NonNull
    /* renamed from: a */
    private C3200Bi m20600a(@NonNull JSONObject jSONObject) throws JSONException {
        int i2;
        JSONObject jSONObject2 = jSONObject.getJSONObject("headers");
        ArrayList arrayList = new ArrayList(jSONObject2.length());
        Iterator<String> keys = jSONObject2.keys();
        while (true) {
            i2 = 0;
            if (!keys.hasNext()) {
                break;
            }
            String next = keys.next();
            JSONArray jSONArray = jSONObject2.getJSONArray(next);
            while (i2 < jSONArray.length()) {
                arrayList.add(new Pair(next, jSONArray.getString(i2)));
                i2++;
            }
        }
        String m21267e = C4452ym.m21267e(jSONObject, "id");
        String m21267e2 = C4452ym.m21267e(jSONObject, "url");
        String m21267e3 = C4452ym.m21267e(jSONObject, "method");
        Long valueOf = Long.valueOf(jSONObject.getLong("delay_seconds"));
        ArrayList arrayList2 = new ArrayList();
        if (jSONObject.has("accept_network_types")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("accept_network_types");
            while (i2 < jSONArray2.length()) {
                arrayList2.add(f46250a.get(jSONArray2.getString(i2)));
                i2++;
            }
        }
        return new C3200Bi(m21267e, m21267e2, m21267e3, arrayList, valueOf, arrayList2);
    }
}
