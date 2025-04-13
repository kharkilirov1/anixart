package com.yandex.mobile.ads.impl;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.d3 */
/* loaded from: classes3.dex */
public final class C4954d3 {

    /* renamed from: a */
    @NotNull
    private final C5996wy f49552a;

    public C4954d3(@NotNull C5996wy hostValidator) {
        Intrinsics.m32179h(hostValidator, "hostValidator");
        this.f49552a = hostValidator;
    }

    @Nullable
    /* renamed from: a */
    public final String m23796a(@NotNull JSONObject jsonObject) {
        Intrinsics.m32179h(jsonObject, "jsonObject");
        String optString = jsonObject.optString("dev_ad_host", null);
        Objects.requireNonNull(this.f49552a);
        if (C5996wy.m29585a(optString)) {
            return optString;
        }
        return null;
    }
}
