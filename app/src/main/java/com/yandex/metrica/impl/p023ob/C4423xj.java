package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3699Vi;
import com.yandex.metrica.impl.p023ob.C4082kg;
import com.yandex.metrica.impl.p023ob.C4452ym;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.xj */
/* loaded from: classes2.dex */
public class C4423xj {

    /* renamed from: a */
    private static final C4082kg.t f46949a = new C4082kg.t();

    /* renamed from: a */
    public C3699Vi m21159a(@NonNull C4452ym.a aVar, @NonNull String str) {
        C3699Vi.a aVar2;
        JSONObject optJSONObject = aVar.optJSONObject(str);
        C3699Vi.a aVar3 = null;
        if (optJSONObject == null) {
            return null;
        }
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("cell");
        if (optJSONObject2 != null) {
            C4082kg.t tVar = f46949a;
            aVar2 = new C3699Vi.a(optJSONObject2.optInt("refresh_event_count", tVar.f45783b), optJSONObject2.optLong("refresh_period_seconds", tVar.f45784c));
        } else {
            aVar2 = null;
        }
        JSONObject optJSONObject3 = optJSONObject.optJSONObject("wifi");
        if (optJSONObject3 != null) {
            C4082kg.t tVar2 = f46949a;
            aVar3 = new C3699Vi.a(optJSONObject3.optInt("refresh_event_count", tVar2.f45783b), optJSONObject3.optLong("refresh_period_seconds", tVar2.f45784c));
        }
        return new C3699Vi(aVar2, aVar3);
    }
}
