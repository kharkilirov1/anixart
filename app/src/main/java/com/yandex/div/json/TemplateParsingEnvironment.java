package com.yandex.div.json;

import androidx.collection.ArrayMap;
import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.internal.parser.JsonTopologicalSorting;
import com.yandex.div.internal.parser.ParsingEnvironmentImpl;
import com.yandex.div.internal.parser.TemplateParsingErrorLogger;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.templates.CachingTemplateProvider;
import com.yandex.div.json.templates.InMemoryTemplateProvider;
import com.yandex.div.json.templates.TemplateProvider;
import com.yandex.div2.DivTemplate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p036m.C6862a;

/* compiled from: TemplateParsingEnvironment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div/json/TemplateParsingEnvironment;", "Lcom/yandex/div/json/JsonTemplate;", "T", "Lcom/yandex/div/json/ParsingEnvironment;", "TemplateFactory", "TemplateParsingResult", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class TemplateParsingEnvironment<T extends JsonTemplate<?>> implements ParsingEnvironment {

    /* renamed from: a */
    @NotNull
    public final ParsingErrorLogger f34328a;

    /* renamed from: b */
    @NotNull
    public final CachingTemplateProvider<T> f34329b;

    /* renamed from: c */
    @NotNull
    public final TemplateProvider<T> f34330c;

    /* compiled from: TemplateParsingEnvironment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/json/TemplateParsingEnvironment$TemplateFactory;", "T", "", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public interface TemplateFactory<T> {
        /* renamed from: e */
        T mo17530e(@NotNull ParsingEnvironment parsingEnvironment, boolean z, @NotNull JSONObject jSONObject) throws JSONException;
    }

    /* compiled from: TemplateParsingEnvironment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/json/TemplateParsingEnvironment$TemplateParsingResult;", "T", "", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class TemplateParsingResult<T> {
    }

    @JvmOverloads
    public TemplateParsingEnvironment(@NotNull ParsingErrorLogger parsingErrorLogger, @NotNull CachingTemplateProvider<T> cachingTemplateProvider) {
        this.f34328a = parsingErrorLogger;
        this.f34329b = cachingTemplateProvider;
        this.f34330c = cachingTemplateProvider;
    }

    @Override // com.yandex.div.json.ParsingEnvironment
    @NotNull
    /* renamed from: a, reason: from getter */
    public ParsingErrorLogger getF33840b() {
        return this.f34328a;
    }

    @Override // com.yandex.div.json.ParsingEnvironment
    @NotNull
    /* renamed from: b */
    public TemplateProvider<T> mo17207b() {
        return this.f34330c;
    }

    /* renamed from: c */
    public final void m17529c(@NotNull JSONObject jSONObject) {
        final ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        try {
            Map<String, Set<String>> m17367c = JsonTopologicalSorting.f33826a.m17367c(jSONObject, this.f34328a, this);
            CachingTemplateProvider<T> cachingTemplateProvider = this.f34329b;
            Objects.requireNonNull(cachingTemplateProvider);
            InMemoryTemplateProvider<T> inMemoryTemplateProvider = cachingTemplateProvider.f34359a;
            Objects.requireNonNull(inMemoryTemplateProvider);
            arrayMap.putAll(inMemoryTemplateProvider.f34361a);
            TemplateProvider<JsonTemplate<?>> templateProvider = new TemplateProvider<JsonTemplate<?>>() { // from class: com.yandex.div.json.templates.TemplateProvider$Companion$wrap$1
                @Override // com.yandex.div.json.templates.TemplateProvider
                /* renamed from: a */
                public /* synthetic */ JsonTemplate<?> mo17515a(String str, JSONObject jSONObject2) {
                    return C6862a.m34502a(this, str, jSONObject2);
                }

                @Override // com.yandex.div.json.templates.TemplateProvider
                @Nullable
                public JsonTemplate<?> get(@NotNull String str) {
                    return arrayMap.get(str);
                }
            };
            for (Map.Entry entry : ((LinkedHashMap) m17367c).entrySet()) {
                String str = (String) entry.getKey();
                Set set = (Set) entry.getValue();
                try {
                    ParsingEnvironmentImpl parsingEnvironmentImpl = new ParsingEnvironmentImpl(templateProvider, new TemplateParsingErrorLogger(this.f34328a, str));
                    TemplateFactory<DivTemplate> templateFactory = ((DivParsingEnvironment) this).f33093e;
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                    Intrinsics.m32178g(jSONObject2, "json.getJSONObject(name)");
                    arrayMap.put(str, templateFactory.mo17530e(parsingEnvironmentImpl, true, jSONObject2));
                    if (!set.isEmpty()) {
                        arrayMap2.put(str, set);
                    }
                } catch (ParsingException e2) {
                    this.f34328a.mo17369b(e2, str);
                }
            }
        } catch (Exception e3) {
            this.f34328a.mo17368a(e3);
        }
        CachingTemplateProvider<T> cachingTemplateProvider2 = this.f34329b;
        Objects.requireNonNull(cachingTemplateProvider2);
        Iterator it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            InMemoryTemplateProvider<T> inMemoryTemplateProvider2 = cachingTemplateProvider2.f34359a;
            String templateId = (String) entry2.getKey();
            JsonTemplate jsonTemplate = (JsonTemplate) entry2.getValue();
            Objects.requireNonNull(inMemoryTemplateProvider2);
            Intrinsics.m32179h(templateId, "templateId");
            Intrinsics.m32179h(jsonTemplate, "jsonTemplate");
            inMemoryTemplateProvider2.f34361a.put(templateId, jsonTemplate);
        }
    }
}
