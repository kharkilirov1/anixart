package com.yandex.div.json;

import com.yandex.div.json.JSONSerializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: JsonTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "T", "", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface JsonTemplate<T extends JSONSerializable> {
    @NotNull
    /* renamed from: a */
    T mo17514a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject);
}
