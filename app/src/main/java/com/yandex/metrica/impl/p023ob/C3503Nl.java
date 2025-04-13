package com.yandex.metrica.impl.p023ob;

import android.app.Activity;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Nl */
/* loaded from: classes2.dex */
public class C3503Nl implements InterfaceC4113ll {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4113ll
    @NonNull
    /* renamed from: a */
    public JSONObject mo18642a(@NonNull Activity activity, long j2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sid", activity.getClass().getName()).put("cid", j2);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
