package com.yandex.div.data;

import com.yandex.div.data.ErrorsCollectorEnvironment;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.TemplateProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ErrorsCollectorEnvironment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/data/ErrorsCollectorEnvironment;", "Lcom/yandex/div/json/ParsingEnvironment;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ErrorsCollectorEnvironment implements ParsingEnvironment {

    /* renamed from: a */
    @NotNull
    public final ParsingErrorLogger f33094a;

    /* renamed from: c */
    @NotNull
    public final TemplateProvider<JsonTemplate<?>> f33096c;

    /* renamed from: b */
    @NotNull
    public final List<Exception> f33095b = new ArrayList();

    /* renamed from: d */
    @NotNull
    public final ParsingErrorLogger f33097d = new ParsingErrorLogger() { // from class: k.a
        @Override // com.yandex.div.json.ParsingErrorLogger
        /* renamed from: a */
        public final void mo17368a(Exception e2) {
            ErrorsCollectorEnvironment this$0 = ErrorsCollectorEnvironment.this;
            Intrinsics.m32179h(this$0, "this$0");
            Intrinsics.m32179h(e2, "e");
            this$0.f33095b.add(e2);
            this$0.f33094a.mo17368a(e2);
        }

        @Override // com.yandex.div.json.ParsingErrorLogger
        /* renamed from: b */
        public void mo17369b(Exception exc, String str) {
            mo17368a(exc);
        }
    };

    public ErrorsCollectorEnvironment(@NotNull ParsingEnvironment parsingEnvironment) {
        this.f33094a = parsingEnvironment.getF33097d();
        this.f33096c = parsingEnvironment.mo17207b();
    }

    @Override // com.yandex.div.json.ParsingEnvironment
    @NotNull
    /* renamed from: a, reason: from getter */
    public ParsingErrorLogger getF33097d() {
        return this.f33097d;
    }

    @Override // com.yandex.div.json.ParsingEnvironment
    @NotNull
    /* renamed from: b */
    public TemplateProvider<JsonTemplate<?>> mo17207b() {
        return this.f33096c;
    }
}
