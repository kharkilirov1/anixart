package com.yandex.metrica.impl.p023ob;

import android.content.ContentValues;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Ee */
/* loaded from: classes2.dex */
public final class C3271Ee implements InterfaceC3910e0<C3446Le> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3910e0, kotlin.jvm.functions.Function1
    public Object invoke(ContentValues contentValues) {
        ContentValues contentValues2 = contentValues;
        String asString = contentValues2.getAsString("tracking_id");
        C3446Le c3446Le = null;
        if (TextUtils.isEmpty(asString)) {
            C3184B2.m17883b("Tracking id is empty", new Object[0]);
        } else {
            try {
                String asString2 = contentValues2.getAsString("additional_params");
                if (TextUtils.isEmpty(asString2)) {
                    C3184B2.m17883b("No additional params", new Object[0]);
                } else {
                    JSONObject jSONObject = new JSONObject(asString2);
                    if (jSONObject.length() == 0) {
                        C3184B2.m17883b("Additional params are empty", new Object[0]);
                    } else {
                        C3184B2.m17877a("Successfully parsed preload info. Tracking id = %s, additionalParams = %s", asString, jSONObject);
                        c3446Le = new C3446Le(asString, jSONObject, true, false, EnumC3257E0.RETAIL);
                    }
                }
            } catch (Throwable th) {
                C3184B2.m17878a(th, "Could not parse additional parameters", new Object[0]);
            }
        }
        return c3446Le;
    }
}
