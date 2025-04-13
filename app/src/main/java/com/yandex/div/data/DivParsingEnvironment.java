package com.yandex.div.data;

import com.yandex.div.json.TemplateParsingEnvironment;
import com.yandex.div.json.templates.CachingTemplateProvider;
import com.yandex.div.json.templates.TemplateProvider;
import com.yandex.div2.DivTemplate;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivParsingEnvironment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/data/DivParsingEnvironment;", "Lcom/yandex/div/json/TemplateParsingEnvironment;", "Lcom/yandex/div2/DivTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivParsingEnvironment extends TemplateParsingEnvironment<DivTemplate> {

    /* renamed from: d */
    @NotNull
    public final CachingTemplateProvider<DivTemplate> f33092d;

    /* renamed from: e */
    @NotNull
    public final TemplateParsingEnvironment.TemplateFactory<DivTemplate> f33093e;

    /* JADX WARN: Illegal instructions before constructor call */
    @kotlin.jvm.JvmOverloads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DivParsingEnvironment(@org.jetbrains.annotations.NotNull com.yandex.div.json.ParsingErrorLogger r4) {
        /*
            r3 = this;
            com.yandex.div.json.templates.CachingTemplateProvider r0 = new com.yandex.div.json.templates.CachingTemplateProvider
            com.yandex.div.json.templates.InMemoryTemplateProvider r1 = new com.yandex.div.json.templates.InMemoryTemplateProvider
            r1.<init>()
            com.yandex.div.json.templates.TemplateProvider$Companion$empty$1 r2 = new com.yandex.div.json.templates.TemplateProvider$Companion$empty$1
            r2.<init>()
            r0.<init>(r1, r2)
            r3.<init>(r4, r0)
            r3.f33092d = r0
            j.a r4 = p031j.C6523a.f63008C
            r3.f33093e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.data.DivParsingEnvironment.<init>(com.yandex.div.json.ParsingErrorLogger):void");
    }

    @Override // com.yandex.div.json.TemplateParsingEnvironment, com.yandex.div.json.ParsingEnvironment
    /* renamed from: b */
    public TemplateProvider mo17207b() {
        return this.f33092d;
    }
}
