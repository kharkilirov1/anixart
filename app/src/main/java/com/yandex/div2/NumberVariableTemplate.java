package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: NumberVariableTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/NumberVariableTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/NumberVariable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class NumberVariableTemplate implements JSONSerializable, JsonTemplate<NumberVariable> {

    /* renamed from: c */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f41049c = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.NumberVariableTemplate$Companion$NAME_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            Function3<String, JSONObject, ParsingEnvironment, String> function3 = NumberVariableTemplate.f41049c;
            return (String) JsonParser.m17311c(jSONObject2, str2, C3070s0.f42028c, parsingEnvironment2.getF34328a(), parsingEnvironment2);
        }
    };

    /* renamed from: d */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Double> f41050d;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<String> f41051a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Double> f41052b;

    /* compiled from: NumberVariableTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div2/NumberVariableTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "NAME_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "NAME_VALIDATOR", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        NumberVariableTemplate$Companion$TYPE_READER$1 numberVariableTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.NumberVariableTemplate$Companion$TYPE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                Object m17742d = C3033a.m17742d(str2, "key", jSONObject2, "json", parsingEnvironment, "env", jSONObject2, str2);
                if (m17742d == null) {
                    m17742d = null;
                }
                return (String) m17742d;
            }
        };
        f41050d = new Function3<String, JSONObject, ParsingEnvironment, Double>() { // from class: com.yandex.div2.NumberVariableTemplate$Companion$VALUE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Double mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                parsingEnvironment2.getF34328a();
                return (Double) JsonParser.m17312d(jSONObject2, str2, function1, C2904b.f33858e);
            }
        };
        NumberVariableTemplate$Companion$CREATOR$1 numberVariableTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, NumberVariableTemplate>() { // from class: com.yandex.div2.NumberVariableTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public NumberVariableTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new NumberVariableTemplate(env, null, false, it);
            }
        };
    }

    public NumberVariableTemplate(@NotNull ParsingEnvironment env, @Nullable NumberVariableTemplate numberVariableTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        this.f41051a = JsonTemplateParser.m17341b(json, "name", z, numberVariableTemplate == null ? null : numberVariableTemplate.f41051a, C3068r0.f41995y, f34328a, env);
        this.f41052b = JsonTemplateParser.m17344e(json, "value", z, numberVariableTemplate == null ? null : numberVariableTemplate.f41052b, ParsingConvertersKt.f33830d, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public NumberVariable mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        return new NumberVariable((String) FieldKt.m17376b(this.f41051a, env, "name", data, f41049c), ((Number) FieldKt.m17376b(this.f41052b, env, "value", data, f41050d)).doubleValue());
    }
}
