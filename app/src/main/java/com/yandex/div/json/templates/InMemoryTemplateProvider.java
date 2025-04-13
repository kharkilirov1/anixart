package com.yandex.div.json.templates;

import androidx.collection.ArrayMap;
import com.yandex.div.json.JsonTemplate;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p036m.C6862a;

/* compiled from: InMemoryTemplateProvider.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/json/templates/InMemoryTemplateProvider;", "Lcom/yandex/div/json/JsonTemplate;", "T", "Lcom/yandex/div/json/templates/TemplateProvider;", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class InMemoryTemplateProvider<T extends JsonTemplate<?>> implements TemplateProvider<T> {

    /* renamed from: a */
    @NotNull
    public final Map<String, T> f34361a = new ArrayMap();

    @Override // com.yandex.div.json.templates.TemplateProvider
    /* renamed from: a */
    public /* synthetic */ JsonTemplate mo17515a(String str, JSONObject jSONObject) {
        return C6862a.m34502a(this, str, jSONObject);
    }

    @Override // com.yandex.div.json.templates.TemplateProvider
    @Nullable
    public T get(@NotNull String str) {
        return this.f34361a.get(str);
    }
}
