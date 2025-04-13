package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class f20 {

    /* renamed from: a */
    @NotNull
    private final v10 f50102a = new v10(new e91());

    @NotNull
    /* renamed from: a */
    public final ArrayList m24293a(@NotNull JSONArray jsonArray) {
        Intrinsics.m32179h(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            z10 m29168a = this.f50102a.m29168a(jsonArray.getJSONObject(i2));
            Intrinsics.m32178g(m29168a, "imageParser.parseValue(jsonArray.getJSONObject(i))");
            arrayList.add(m29168a);
        }
        return arrayList;
    }
}
