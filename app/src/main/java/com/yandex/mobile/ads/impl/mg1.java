package com.yandex.mobile.ads.impl;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mg1 {
    @NotNull
    /* renamed from: a */
    public static JSONObject m26672a(@NotNull lg1 viewSizeInfo) {
        Intrinsics.m32179h(viewSizeInfo, "viewSizeInfo");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("width", viewSizeInfo.m26455d().m26125b());
        jSONObject2.put("height", viewSizeInfo.m26455d().m26124a());
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("width", viewSizeInfo.m26453b().m28909b());
        jSONObject3.put("height", viewSizeInfo.m26453b().m28908a());
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        jSONObject4.put("value", viewSizeInfo.m26454c().m25099b().m25478b());
        String name = viewSizeInfo.m26454c().m25099b().m25477a().name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        Intrinsics.m32178g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        jSONObject4.put("mode", lowerCase);
        jSONObject5.put("value", viewSizeInfo.m26454c().m25098a().m25478b());
        String lowerCase2 = viewSizeInfo.m26454c().m25098a().m25477a().name().toLowerCase(locale);
        Intrinsics.m32178g(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        jSONObject5.put("mode", lowerCase2);
        jSONObject6.put("width", jSONObject4);
        jSONObject6.put("height", jSONObject5);
        JSONObject jSONObject7 = new JSONObject(viewSizeInfo.m26452a());
        jSONObject.put("view", jSONObject2);
        jSONObject.put("layout_params", jSONObject3);
        jSONObject.put("measured", jSONObject6);
        jSONObject.put("additional_info", jSONObject7);
        return jSONObject;
    }
}
