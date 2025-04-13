package com.yandex.div.internal.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* compiled from: JsonNode.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/util/JsonArray;", "Lcom/yandex/div/internal/util/JsonNode;", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class JsonArray extends JsonNode {

    /* renamed from: a */
    @NotNull
    public final JSONArray f33884a;

    public JsonArray(@NotNull JSONArray jSONArray) {
        super(null);
        this.f33884a = jSONArray;
    }

    @Override // com.yandex.div.internal.util.JsonNode
    @NotNull
    /* renamed from: a */
    public String mo17386a() {
        String jSONArray = this.f33884a.toString();
        Intrinsics.m32178g(jSONArray, "value.toString()");
        return jSONArray;
    }
}
