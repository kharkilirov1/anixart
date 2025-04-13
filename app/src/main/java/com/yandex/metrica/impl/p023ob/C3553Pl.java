package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Pl */
/* loaded from: classes2.dex */
public class C3553Pl implements InterfaceC4087kl {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4087kl
    /* renamed from: a */
    public void mo18598a(@NonNull JSONObject jSONObject, @NonNull Object obj, @NonNull String str) {
        try {
            jSONObject.getJSONArray("ssh").getJSONObject(0).put(str, obj);
        } catch (Throwable unused) {
        }
    }
}
