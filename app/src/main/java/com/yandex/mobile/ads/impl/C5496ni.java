package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.ni */
/* loaded from: classes3.dex */
public final class C5496ni implements InterfaceC5908va<C5445mi> {
    @Override // com.yandex.mobile.ads.impl.InterfaceC5908va
    @NonNull
    /* renamed from: a */
    public final C5445mi mo23010a(@NonNull JSONObject jSONObject) throws JSONException, ni0 {
        return (jSONObject.has("value") && jSONObject.isNull("value")) ? new C5445mi(2, null) : new C5445mi(1, xj0.m29759a("value", jSONObject));
    }
}
