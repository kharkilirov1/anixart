package com.yandex.div.json;

import com.yandex.div.json.templates.TemplateProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p036m.C6862a;

/* compiled from: ParsingEnvironmentExtensions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/json/KeyWatchingTemplateProvider;", "Lcom/yandex/div/json/templates/TemplateProvider;", "Lcom/yandex/div/json/JsonTemplate;", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class KeyWatchingTemplateProvider implements TemplateProvider<JsonTemplate<?>> {
    @Override // com.yandex.div.json.templates.TemplateProvider
    /* renamed from: a */
    public /* synthetic */ JsonTemplate<?> mo17515a(String str, JSONObject jSONObject) {
        return C6862a.m34502a(this, str, jSONObject);
    }

    @Override // com.yandex.div.json.templates.TemplateProvider
    @Nullable
    public JsonTemplate<?> get(@NotNull String str) {
        throw null;
    }
}
