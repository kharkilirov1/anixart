package com.yandex.mobile.ads.impl;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.fc */
/* loaded from: classes3.dex */
public final class C5071fc {

    /* renamed from: a */
    @NotNull
    private final C5483nd f50200a;

    public /* synthetic */ C5071fc() {
        this(new C5483nd());
    }

    @Nullable
    /* renamed from: a */
    public final String m24541a(@NotNull JSONObject jsonObject) {
        Intrinsics.m32179h(jsonObject, "jsonObject");
        String jSONObject = jsonObject.toString();
        Intrinsics.m32178g(jSONObject, "jsonObject.toString()");
        Objects.requireNonNull(this.f50200a);
        return C5483nd.m26844a(jSONObject);
    }

    public C5071fc(@NotNull C5483nd base64Encoder) {
        Intrinsics.m32179h(base64Encoder, "base64Encoder");
        this.f50200a = base64Encoder;
    }
}
