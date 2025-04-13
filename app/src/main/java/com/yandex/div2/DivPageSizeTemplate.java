package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivPercentageSize;
import com.yandex.div2.DivPercentageSizeTemplate;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivPageSizeTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivPageSizeTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivPageSize;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivPageSizeTemplate implements JSONSerializable, JsonTemplate<DivPageSize> {

    /* renamed from: b */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivPercentageSize> f37743b = new Function3<String, JSONObject, ParsingEnvironment, DivPercentageSize>() { // from class: com.yandex.div2.DivPageSizeTemplate$Companion$PAGE_WIDTH_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public DivPercentageSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivPercentageSize.Companion companion = DivPercentageSize.f38017b;
            Function2<ParsingEnvironment, JSONObject, DivPercentageSize> function2 = DivPercentageSize.f38018c;
            parsingEnvironment2.getF34328a();
            return (DivPercentageSize) JsonParser.m17313e(jSONObject2, str2, function2, C2904b.f33858e, parsingEnvironment2);
        }
    };

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivPercentageSizeTemplate> f37744a;

    /* compiled from: DivPageSizeTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivPageSizeTemplate$Companion;", "", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        DivPageSizeTemplate$Companion$TYPE_READER$1 divPageSizeTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivPageSizeTemplate$Companion$TYPE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                Object m17742d = C3033a.m17742d(str2, "key", jSONObject2, "json", parsingEnvironment, "env", jSONObject2, str2);
                if (m17742d != null) {
                    return (String) m17742d;
                }
                throw ParsingExceptionKt.m17523h(jSONObject2, str2);
            }
        };
        DivPageSizeTemplate$Companion$CREATOR$1 divPageSizeTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivPageSizeTemplate>() { // from class: com.yandex.div2.DivPageSizeTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivPageSizeTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivPageSizeTemplate(env, null, false, it);
            }
        };
    }

    public DivPageSizeTemplate(@NotNull ParsingEnvironment env, @Nullable DivPageSizeTemplate divPageSizeTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<DivPercentageSizeTemplate> field = divPageSizeTemplate == null ? null : divPageSizeTemplate.f37744a;
        DivPercentageSizeTemplate.Companion companion = DivPercentageSizeTemplate.f38021b;
        this.f37744a = JsonTemplateParser.m17345f(json, "page_width", z, field, DivPercentageSizeTemplate.f38023d, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivPageSize mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        return new DivPageSize((DivPercentageSize) FieldKt.m17383i(this.f37744a, env, "page_width", data, f37743b));
    }
}
