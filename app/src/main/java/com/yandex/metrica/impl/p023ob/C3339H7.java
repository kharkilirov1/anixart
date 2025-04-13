package com.yandex.metrica.impl.p023ob;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p023ob.C3605S;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.H7 */
/* loaded from: classes2.dex */
public class C3339H7 {

    /* renamed from: a */
    private final byte[] f43033a;

    /* renamed from: b */
    private final String f43034b;

    /* renamed from: c */
    private final int f43035c;

    /* renamed from: d */
    @NonNull
    private final HashMap<C3605S.a, Integer> f43036d;

    /* renamed from: e */
    private final String f43037e;

    /* renamed from: f */
    private final Integer f43038f;

    /* renamed from: g */
    private final String f43039g;

    /* renamed from: h */
    private final String f43040h;

    /* renamed from: i */
    @NonNull
    private final CounterConfiguration.EnumC3079b f43041i;

    /* renamed from: j */
    @Nullable
    private final String f43042j;

    public C3339H7(@NonNull String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f43033a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f43034b = jSONObject2.getString("name");
        this.f43035c = jSONObject2.getInt("bytes_truncated");
        this.f43042j = C4452ym.m21267e(jSONObject2, "environment");
        String optString = jSONObject2.optString("trimmed_fields");
        this.f43036d = new HashMap<>();
        if (optString != null) {
            try {
                HashMap<String, String> m21265d = C4452ym.m21265d(optString);
                if (m21265d != null) {
                    for (Map.Entry<String, String> entry : m21265d.entrySet()) {
                        this.f43036d.put(C3605S.a.valueOf(entry.getKey()), Integer.valueOf(Integer.parseInt(entry.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f43037e = jSONObject3.getString("package_name");
        this.f43038f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.f43039g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f43040h = jSONObject4.getString("api_key");
        this.f43041i = m18189a(jSONObject4);
    }

    /* renamed from: a */
    public String m18190a() {
        return this.f43040h;
    }

    /* renamed from: b */
    public int m18191b() {
        return this.f43035c;
    }

    /* renamed from: c */
    public byte[] m18192c() {
        return this.f43033a;
    }

    @Nullable
    /* renamed from: d */
    public String m18193d() {
        return this.f43042j;
    }

    /* renamed from: e */
    public String m18194e() {
        return this.f43034b;
    }

    /* renamed from: f */
    public String m18195f() {
        return this.f43037e;
    }

    /* renamed from: g */
    public Integer m18196g() {
        return this.f43038f;
    }

    /* renamed from: h */
    public String m18197h() {
        return this.f43039g;
    }

    @NonNull
    /* renamed from: i */
    public CounterConfiguration.EnumC3079b m18198i() {
        return this.f43041i;
    }

    @NonNull
    /* renamed from: j */
    public HashMap<C3605S.a, Integer> m18199j() {
        return this.f43036d;
    }

    /* renamed from: k */
    public String m18200k() throws JSONException {
        HashMap hashMap = new HashMap();
        for (Map.Entry<C3605S.a, Integer> entry : this.f43036d.entrySet()) {
            hashMap.put(entry.getKey().name(), entry.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f43038f).put("psid", this.f43039g).put("package_name", this.f43037e)).put("reporter_configuration", new JSONObject().put("api_key", this.f43040h).put("reporter_type", this.f43041i.f42243b)).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f43033a, 0)).put("name", this.f43034b).put("bytes_truncated", this.f43035c).put("trimmed_fields", C4452ym.m21272g(hashMap)).putOpt("environment", this.f43042j)).toString();
    }

    @NonNull
    @Deprecated
    /* renamed from: a */
    private CounterConfiguration.EnumC3079b m18189a(@NonNull JSONObject jSONObject) throws JSONException {
        return jSONObject.has("reporter_type") ? CounterConfiguration.EnumC3079b.m17764a(jSONObject.getString("reporter_type")) : jSONObject.getBoolean("is_commutation") ? CounterConfiguration.EnumC3079b.COMMUTATION : CounterConfiguration.EnumC3079b.MAIN;
    }

    public C3339H7(@NonNull C4066k0 c4066k0, @NonNull C3634T3 c3634t3, @Nullable HashMap<C3605S.a, Integer> hashMap) {
        this.f43033a = c4066k0.m20215q();
        this.f43034b = c4066k0.m20205g();
        this.f43035c = c4066k0.m20202d();
        if (hashMap != null) {
            this.f43036d = hashMap;
        } else {
            this.f43036d = new HashMap<>();
        }
        C3659U3 m19135a = c3634t3.m19135a();
        this.f43037e = m19135a.m19232f();
        this.f43038f = m19135a.m19233g();
        this.f43039g = m19135a.m19234h();
        CounterConfiguration m19136b = c3634t3.m19136b();
        this.f43040h = m19136b.m17753c();
        this.f43041i = CounterConfiguration.EnumC3079b.m17764a(m19136b.f42234b.getAsString("CFG_REPORTER_TYPE"));
        this.f43042j = c4066k0.m20206h();
    }
}
