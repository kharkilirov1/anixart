package com.yandex.div.json.templates;

import com.yandex.div.json.JsonTemplate;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p036m.C6862a;

/* compiled from: CachingTemplateProvider.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/json/templates/CachingTemplateProvider;", "Lcom/yandex/div/json/JsonTemplate;", "T", "Lcom/yandex/div/json/templates/TemplateProvider;", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class CachingTemplateProvider<T extends JsonTemplate<?>> implements TemplateProvider<T> {

    /* renamed from: a */
    @NotNull
    public final InMemoryTemplateProvider<T> f34359a;

    /* renamed from: b */
    @NotNull
    public TemplateProvider<? extends T> f34360b;

    public CachingTemplateProvider(@NotNull InMemoryTemplateProvider<T> inMemoryTemplateProvider, @NotNull TemplateProvider<? extends T> templateProvider) {
        this.f34359a = inMemoryTemplateProvider;
        this.f34360b = templateProvider;
    }

    @Override // com.yandex.div.json.templates.TemplateProvider
    /* renamed from: a */
    public /* synthetic */ JsonTemplate mo17515a(String str, JSONObject jSONObject) {
        return C6862a.m34502a(this, str, jSONObject);
    }

    @Override // com.yandex.div.json.templates.TemplateProvider
    @Nullable
    public T get(@NotNull String str) {
        T t = this.f34359a.f34361a.get(str);
        if (t == null) {
            t = this.f34360b.get(str);
            if (t == null) {
                return null;
            }
            InMemoryTemplateProvider<T> inMemoryTemplateProvider = this.f34359a;
            Objects.requireNonNull(inMemoryTemplateProvider);
            inMemoryTemplateProvider.f34361a.put(str, t);
        }
        return t;
    }
}
