package com.yandex.div2;

import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div2.DivExtensionTemplate;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivExtensionTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivExtensionTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivExtension;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivExtensionTemplate implements JSONSerializable, JsonTemplate<DivExtension> {

    /* renamed from: c */
    @NotNull
    public static final Companion f35664c = new Companion(null);

    /* renamed from: d */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f35665d = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivExtensionTemplate$Companion$ID_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivExtensionTemplate.Companion companion = DivExtensionTemplate.f35664c;
            return (String) JsonParser.m17311c(jSONObject2, str2, C3049i.f41493t, parsingEnvironment2.getF34328a(), parsingEnvironment2);
        }
    };

    /* renamed from: e */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, JSONObject> f35666e = new Function3<String, JSONObject, ParsingEnvironment, JSONObject>() { // from class: com.yandex.div2.DivExtensionTemplate$Companion$PARAMS_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public JSONObject mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            Object m17742d = C3033a.m17742d(str2, "key", jSONObject2, "json", parsingEnvironment, "env", jSONObject2, str2);
            if (m17742d == null) {
                m17742d = null;
            }
            return (JSONObject) m17742d;
        }
    };

    /* renamed from: f */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivExtensionTemplate> f35667f = new Function2<ParsingEnvironment, JSONObject, DivExtensionTemplate>() { // from class: com.yandex.div2.DivExtensionTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivExtensionTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            return new DivExtensionTemplate(env, null, false, it, 6);
        }
    };

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<String> f35668a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<JSONObject> f35669b;

    /* compiled from: DivExtensionTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivExtensionTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "ID_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ID_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public DivExtensionTemplate(ParsingEnvironment parsingEnvironment, DivExtensionTemplate divExtensionTemplate, boolean z, JSONObject jSONObject, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
        this.f35668a = JsonTemplateParser.m17341b(jSONObject, "id", z, null, C3049i.f41492s, f34328a, parsingEnvironment);
        this.f35669b = JsonTemplateParser.m17352m(jSONObject, "params", z, null, f34328a, parsingEnvironment);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivExtension mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        return new DivExtension((String) FieldKt.m17376b(this.f35668a, env, "id", data, f35665d), (JSONObject) FieldKt.m17378d(this.f35669b, env, "params", data, f35666e));
    }
}
