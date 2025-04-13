package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public enum rg1 implements e70 {
    f54307b("default"),
    f54308c("loading"),
    f54309d("hidden");


    /* renamed from: a */
    private final String f54311a;

    rg1(String str) {
        this.f54311a = str;
    }

    @Override // com.yandex.mobile.ads.impl.e70
    @NonNull
    /* renamed from: a */
    public final String mo23814a() {
        return String.format("state: %s", JSONObject.quote(this.f54311a));
    }
}
