package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Gk */
/* loaded from: classes2.dex */
public class C3327Gk implements InterfaceC4009hl {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4009hl
    @NonNull
    /* renamed from: a */
    public JSONObject mo18175a(@NonNull Object obj) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cxts", obj);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
