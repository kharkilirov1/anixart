package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3834b2;
import com.yandex.metrica.impl.p023ob.C4108lg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Lh */
/* loaded from: classes2.dex */
public class C3449Lh {

    /* renamed from: a */
    private static final Map<C4108lg.e.b.a, String> f43350a = Collections.unmodifiableMap(new a());

    /* renamed from: b */
    private static final Map<C3834b2.d, String> f43351b = Collections.unmodifiableMap(new b());

    /* renamed from: com.yandex.metrica.impl.ob.Lh$a */
    public class a extends HashMap<C4108lg.e.b.a, String> {
        public a() {
            put(C4108lg.e.b.a.COMPLETE, "complete");
            put(C4108lg.e.b.a.ERROR, "error");
            put(C4108lg.e.b.a.OFFLINE, "offline");
            put(C4108lg.e.b.a.INCOMPATIBLE_NETWORK_TYPE, "incompatible_network_type");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Lh$b */
    public class b extends HashMap<C3834b2.d, String> {
        public b() {
            put(C3834b2.d.WIFI, "wifi");
            put(C3834b2.d.CELL, "cell");
            put(C3834b2.d.OFFLINE, "offline");
            put(C3834b2.d.UNDEFINED, "undefined");
        }
    }

    /* renamed from: a */
    public String m18511a(@NonNull C4108lg.e.b bVar) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("id", bVar.m20383d().f45902a);
            jSONObject.putOpt("url", bVar.m20383d().f45903b);
            jSONObject.putOpt("status", f43350a.get(bVar.m20387h()));
            jSONObject.putOpt("code", bVar.m20385f());
            if (!C3658U2.m19214a(bVar.m20384e())) {
                jSONObject.putOpt("body", Base64.encodeToString(bVar.m20384e(), 0));
            } else if (!C3658U2.m19214a(bVar.m20381b())) {
                jSONObject.putOpt("body", Base64.encodeToString(bVar.m20381b(), 0));
            }
            jSONObject.putOpt("headers", m18510a(bVar.m20386g()));
            Throwable m20382c = bVar.m20382c();
            if (m20382c != null) {
                str = m20382c.toString() + "\n" + Log.getStackTraceString(m20382c);
            } else {
                str = null;
            }
            jSONObject.putOpt("error", str);
            jSONObject.putOpt("network_type", f43351b.get(bVar.m20375a()));
            return jSONObject.toString();
        } catch (Throwable th) {
            return th.toString();
        }
    }

    @Nullable
    /* renamed from: a */
    private JSONObject m18510a(@Nullable Map<String, List<String>> map) throws JSONException {
        if (C3658U2.m19218b(map)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!C3658U2.m19217b(entry.getValue())) {
                List<String> value = entry.getValue();
                if (value.size() > 10) {
                    ArrayList arrayList = new ArrayList(10);
                    for (int i2 = 0; i2 < 10; i2++) {
                        arrayList.add(value.get(i2));
                    }
                    value = arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : value) {
                    if (!TextUtils.isEmpty(str)) {
                        arrayList2.add(C3658U2.m19200a(str, 100));
                    }
                }
                jSONObject.putOpt(key, TextUtils.join(",", arrayList2));
            }
        }
        return jSONObject;
    }
}
