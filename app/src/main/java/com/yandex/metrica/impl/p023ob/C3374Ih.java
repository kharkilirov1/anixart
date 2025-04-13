package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C4452ym;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Ih */
/* loaded from: classes2.dex */
public class C3374Ih {
    @NonNull
    /* renamed from: a */
    public List<C3349Hh> m18318a(@NonNull String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray optJSONArray = new C4452ym.a(str).optJSONArray("sdk_list");
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject jSONObject = optJSONArray.getJSONObject(i2);
                    String optString = jSONObject.optString("name");
                    if (!TextUtils.isEmpty(optString)) {
                        JSONArray optJSONArray2 = jSONObject.optJSONArray("classes");
                        ArrayList arrayList2 = new ArrayList();
                        if (optJSONArray2 != null) {
                            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                                try {
                                    String optString2 = optJSONArray2.getJSONObject(i3).optString("name");
                                    if (!TextUtils.isEmpty(optString2)) {
                                        arrayList2.add(optString2);
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        if (!C3658U2.m19217b(arrayList2)) {
                            arrayList.add(new C3349Hh(optString, arrayList2));
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return arrayList;
    }
}
