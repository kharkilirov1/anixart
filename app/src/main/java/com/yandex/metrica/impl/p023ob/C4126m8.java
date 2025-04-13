package com.yandex.metrica.impl.p023ob;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.CounterConfiguration;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.m8 */
/* loaded from: classes2.dex */
class C4126m8 {

    /* renamed from: a */
    private static String[] f45944a = {"arg_ak", "arg_pn", "arg_pd", "arg_ps", "arg_rt"};

    @Nullable
    /* renamed from: a */
    public C3211C4 m20394a(@NonNull String str) {
        try {
            return m20393a(new JSONObject(new String(Base64.decode(str, 0))).getJSONObject("arg_cd"));
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    private C3211C4 m20393a(@NonNull JSONObject jSONObject) {
        try {
            for (String str : f45944a) {
                if (!jSONObject.has(str)) {
                    return null;
                }
            }
            int i2 = jSONObject.getInt("arg_pd");
            if (i2 == 0) {
                i2 = Integer.parseInt(jSONObject.getString("arg_pd"));
            }
            return new C3211C4(jSONObject.getString("arg_ak"), jSONObject.getString("arg_pn"), Integer.valueOf(i2), jSONObject.getString("arg_ps"), CounterConfiguration.EnumC3079b.m17764a(jSONObject.getString("arg_rt")));
        } catch (Exception unused) {
            return null;
        }
    }
}
