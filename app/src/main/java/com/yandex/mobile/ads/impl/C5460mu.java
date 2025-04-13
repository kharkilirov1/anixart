package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.mu */
/* loaded from: classes3.dex */
public final class C5460mu implements InterfaceC5908va<C5413lu> {

    /* renamed from: a */
    @NonNull
    private final c20 f52814a;

    public C5460mu(@NonNull c20 c20Var) {
        this.f52814a = c20Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5908va
    @NonNull
    /* renamed from: a */
    public final C5413lu mo23010a(@NonNull JSONObject jSONObject) throws JSONException, ni0 {
        if (jSONObject.has("value")) {
            return new C5413lu(jSONObject.isNull("value") ? null : this.f52814a.mo23010a(jSONObject));
        }
        n60.m26810c("FeedbackValue asset has not value", new Object[0]);
        throw new ni0("Native Ad json has not required attributes");
    }
}
