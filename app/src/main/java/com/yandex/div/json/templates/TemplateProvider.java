package com.yandex.div.json.templates;

import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: TemplateProvider.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000*\u000e\b\u0000\u0010\u0002 \u0001*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003:\u0001\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/json/templates/TemplateProvider;", "Lcom/yandex/div/json/JsonTemplate;", "T", "", "Companion", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface TemplateProvider<T extends JsonTemplate<?>> {

    /* compiled from: TemplateProvider.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/json/templates/TemplateProvider$Companion;", "", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f34362a = new Companion();
    }

    @NotNull
    /* renamed from: a */
    T mo17515a(@NotNull String str, @NotNull JSONObject jSONObject) throws ParsingException;

    @Nullable
    T get(@NotNull String str);
}
