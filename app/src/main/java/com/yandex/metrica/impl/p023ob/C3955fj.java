package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4082kg;
import com.yandex.metrica.impl.p023ob.C4452ym;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.fj */
/* loaded from: classes2.dex */
public class C3955fj {

    /* renamed from: a */
    @NonNull
    private final C3972ga f45138a;

    public C3955fj() {
        this(new C3972ga());
    }

    /* renamed from: a */
    public void m19914a(@NonNull C4371vj c4371vj, @NonNull C4452ym.a aVar) {
        JSONArray optJSONArray;
        JSONObject optJSONObject = aVar.optJSONObject("diagnostics");
        if (optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray("functionalities")) == null) {
            return;
        }
        C3716Wa c3716Wa = null;
        C3716Wa c3716Wa2 = null;
        C3716Wa c3716Wa3 = null;
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            try {
                JSONObject jSONObject = optJSONArray.getJSONObject(i2);
                String string = jSONObject.getString("tag");
                C3972ga c3972ga = this.f45138a;
                C4082kg.e eVar = new C4082kg.e();
                eVar.f45680b = jSONObject.getLong("expiration_timestamp");
                eVar.f45681c = jSONObject.optInt("interval", eVar.f45681c);
                C3716Wa mo17817a = c3972ga.mo17817a(eVar);
                if ("activation".equals(string)) {
                    c3716Wa = mo17817a;
                } else if ("clids_info".equals(string)) {
                    c3716Wa2 = mo17817a;
                } else if ("preload_info".equals(string)) {
                    c3716Wa3 = mo17817a;
                }
            } catch (Throwable unused) {
            }
        }
        c4371vj.m21007a(new C3741Xa(c3716Wa, c3716Wa2, c3716Wa3));
    }

    @VisibleForTesting
    public C3955fj(@NonNull C3972ga c3972ga) {
        this.f45138a = c3972ga;
    }
}
