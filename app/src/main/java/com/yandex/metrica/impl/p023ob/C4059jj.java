package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C4452ym;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.jj */
/* loaded from: classes2.dex */
public class C4059jj {

    /* renamed from: a */
    private static final Set<String> f45489a;

    static {
        HashSet hashSet = new HashSet();
        f45489a = hashSet;
        hashSet.add("get_ad");
        hashSet.add("report");
        hashSet.add("report_ad");
        hashSet.add("location");
        hashSet.add("startup");
        hashSet.add("diagnostic");
        hashSet.add("mediascope");
    }

    /* renamed from: a */
    public void m20160a(@NonNull C4371vj c4371vj, @NonNull C4452ym.a aVar) {
        String str;
        List<String> m20159a;
        String str2 = "";
        try {
            Object jSONObject = new JSONObject();
            try {
                jSONObject = aVar.get("query_hosts");
            } catch (Throwable unused) {
            }
            JSONObject optJSONObject = ((JSONObject) jSONObject).optJSONObject("list");
            if (optJSONObject != null) {
                try {
                    str = optJSONObject.getJSONObject("get_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused2) {
                    str = "";
                }
                if (!TextUtils.isEmpty(str)) {
                    c4371vj.m21037f(str);
                }
                List<String> m20159a2 = m20159a(optJSONObject, "report");
                if (!C3658U2.m19217b(m20159a2)) {
                    c4371vj.m21038f(m20159a2);
                }
                try {
                    str2 = optJSONObject.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused3) {
                }
                if (!TextUtils.isEmpty(str2)) {
                    c4371vj.m21040g(str2);
                }
                List<String> m20159a3 = m20159a(optJSONObject, "location");
                if (!C3658U2.m19217b(m20159a3)) {
                    c4371vj.m21029c(m20159a3);
                }
                List<String> m20159a4 = m20159a(optJSONObject, "startup");
                if (!C3658U2.m19217b(m20159a4)) {
                    c4371vj.m21044h(m20159a4);
                }
                List<String> m20159a5 = m20159a(optJSONObject, "diagnostic");
                if (!C3658U2.m19217b(m20159a5)) {
                    c4371vj.m21019a(m20159a5);
                }
                List<String> m20159a6 = m20159a(optJSONObject, "mediascope");
                if (!C3658U2.m19217b(m20159a6)) {
                    c4371vj.m21035e(m20159a6);
                }
                HashMap hashMap = new HashMap();
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!f45489a.contains(next) && (m20159a = m20159a(optJSONObject, next)) != null) {
                        hashMap.put(next, m20159a);
                    }
                }
                c4371vj.m21020a(hashMap);
            }
        } catch (Throwable unused4) {
        }
    }

    /* renamed from: a */
    private List<String> m20159a(JSONObject jSONObject, String str) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject != null) {
                return C4452ym.m21255b(optJSONObject.getJSONArray("urls"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
