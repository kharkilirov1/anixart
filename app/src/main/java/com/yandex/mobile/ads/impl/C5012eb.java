package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.eb */
/* loaded from: classes3.dex */
public final class C5012eb {

    /* renamed from: a */
    @NotNull
    private final C5850ua f49855a;

    public C5012eb(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        this.f49855a = new C5850ua(context, new b80());
    }

    @NotNull
    /* renamed from: a */
    public final ArrayList m24052a(@NotNull JSONObject jsonNative) throws JSONException, ni0 {
        Intrinsics.m32179h(jsonNative, "jsonNative");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jsonNative.getJSONArray("assets");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            boolean z = jSONObject.getBoolean("required");
            try {
                C5276ja m28917a = this.f49855a.m28917a(jSONObject);
                Intrinsics.m32178g(m28917a, "mAssetJsonParser.parseAsset(jsonAsset)");
                arrayList.add(m28917a);
            } catch (Throwable th) {
                if (z) {
                    throw th;
                }
            }
        }
        return arrayList;
    }
}
