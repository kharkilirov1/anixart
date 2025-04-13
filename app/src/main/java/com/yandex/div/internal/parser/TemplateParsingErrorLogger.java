package com.yandex.div.internal.parser;

import com.yandex.div.json.ParsingErrorLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TemplateParsingErrorLogger.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/parser/TemplateParsingErrorLogger;", "Lcom/yandex/div/json/ParsingErrorLogger;", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class TemplateParsingErrorLogger implements ParsingErrorLogger {

    /* renamed from: b */
    @NotNull
    public final ParsingErrorLogger f33841b;

    /* renamed from: c */
    @NotNull
    public final String f33842c;

    public TemplateParsingErrorLogger(@NotNull ParsingErrorLogger logger, @NotNull String templateId) {
        Intrinsics.m32179h(logger, "logger");
        Intrinsics.m32179h(templateId, "templateId");
        this.f33841b = logger;
        this.f33842c = templateId;
    }

    @Override // com.yandex.div.json.ParsingErrorLogger
    /* renamed from: a */
    public void mo17368a(@NotNull Exception e2) {
        Intrinsics.m32179h(e2, "e");
        this.f33841b.mo17369b(e2, this.f33842c);
    }

    @Override // com.yandex.div.json.ParsingErrorLogger
    /* renamed from: b */
    public void mo17369b(Exception exc, String str) {
        mo17368a(exc);
    }
}
