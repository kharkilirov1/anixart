package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C4082kg;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Aj */
/* loaded from: classes2.dex */
class C3176Aj {
    @NonNull
    /* renamed from: a */
    public C4082kg.x[] m17838a(@Nullable JSONArray jSONArray) {
        JSONObject jSONObject;
        Integer m21260c;
        Integer num;
        String m21267e;
        if (jSONArray == null) {
            return new C4082kg.x[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                jSONObject = jSONArray.getJSONObject(i2);
                m21260c = C4452ym.m21260c(jSONObject, "type");
            } catch (Throwable unused) {
            }
            if (m21260c != null) {
                int intValue = m21260c.intValue();
                if (intValue == 0) {
                    num = 0;
                } else if (intValue == 1) {
                    num = 1;
                } else if (intValue == 2) {
                    num = 2;
                } else if (intValue == 3) {
                    num = 3;
                }
                m21267e = C4452ym.m21267e(jSONObject, "value");
                if (num != null && m21267e != null) {
                    C4082kg.x xVar = new C4082kg.x();
                    xVar.f45812b = num.intValue();
                    xVar.f45813c = m21267e;
                    arrayList.add(xVar);
                }
            }
            num = null;
            m21267e = C4452ym.m21267e(jSONObject, "value");
            if (num != null) {
                C4082kg.x xVar2 = new C4082kg.x();
                xVar2.f45812b = num.intValue();
                xVar2.f45813c = m21267e;
                arrayList.add(xVar2);
            }
        }
        return (C4082kg.x[]) arrayList.toArray(new C4082kg.x[0]);
    }
}
