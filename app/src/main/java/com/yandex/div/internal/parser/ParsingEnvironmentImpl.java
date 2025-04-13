package com.yandex.div.internal.parser;

import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.TemplateProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ParsingEnvironmentImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/parser/ParsingEnvironmentImpl;", "Lcom/yandex/div/json/ParsingEnvironment;", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ParsingEnvironmentImpl implements ParsingEnvironment {

    /* renamed from: a */
    @NotNull
    public final TemplateProvider<JsonTemplate<?>> f33839a;

    /* renamed from: b */
    @NotNull
    public final ParsingErrorLogger f33840b;

    /* JADX WARN: Multi-variable type inference failed */
    public ParsingEnvironmentImpl(@NotNull TemplateProvider<? extends JsonTemplate<?>> templateProvider, @NotNull ParsingErrorLogger parsingErrorLogger) {
        this.f33839a = templateProvider;
        this.f33840b = parsingErrorLogger;
    }

    @Override // com.yandex.div.json.ParsingEnvironment
    @NotNull
    /* renamed from: a, reason: from getter */
    public ParsingErrorLogger getF33840b() {
        return this.f33840b;
    }

    @Override // com.yandex.div.json.ParsingEnvironment
    @NotNull
    /* renamed from: b */
    public TemplateProvider<JsonTemplate<?>> mo17207b() {
        return this.f33839a;
    }
}
