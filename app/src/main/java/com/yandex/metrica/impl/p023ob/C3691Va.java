package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3535P3;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Va */
/* loaded from: classes2.dex */
public class C3691Va implements InterfaceC3766Ya<C3535P3> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3766Ya
    @NonNull
    /* renamed from: a */
    public JSONObject mo19144a(@Nullable C3535P3 c3535p3) {
        C3535P3 c3535p32 = c3535p3;
        JSONObject jSONObject = new JSONObject();
        if (c3535p32 != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<C3535P3.a> it = c3535p32.mo17902a().iterator();
                while (it.hasNext()) {
                    jSONArray.put(m19270a(it.next()));
                }
                jSONObject.putOpt("chosen", m19270a(c3535p32.m18728c())).putOpt("candidates", jSONArray);
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }

    @Nullable
    /* renamed from: a */
    private JSONObject m19270a(@Nullable C3535P3.a aVar) throws JSONException {
        if (aVar == null) {
            return null;
        }
        return new JSONObject().putOpt("clids", C4452ym.m21269e(aVar.m18729b())).putOpt("source", aVar.mo18022a().m17995a());
    }
}
