package com.yandex.div2;

import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivCurrencyInputMaskTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivCurrencyInputMaskTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivCurrencyInputMask;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivCurrencyInputMaskTemplate implements JSONSerializable, JsonTemplate<DivCurrencyInputMask> {

    /* renamed from: c */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f35250c = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivCurrencyInputMaskTemplate$Companion$LOCALE_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            Function3<String, JSONObject, ParsingEnvironment, Expression<String>> function3 = DivCurrencyInputMaskTemplate.f35250c;
            return JsonParser.m17325q(jSONObject2, str2, C3043f.f41341u, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33850c);
        }
    };

    /* renamed from: d */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f35251d = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivCurrencyInputMaskTemplate$Companion$RAW_TEXT_VARIABLE_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            Function3<String, JSONObject, ParsingEnvironment, Expression<String>> function3 = DivCurrencyInputMaskTemplate.f35250c;
            return (String) JsonParser.m17311c(jSONObject2, str2, C3043f.f41343w, parsingEnvironment2.getF34328a(), parsingEnvironment2);
        }
    };

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<String>> f35252a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<String> f35253b;

    /* compiled from: DivCurrencyInputMaskTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m31884d2 = {"Lcom/yandex/div2/DivCurrencyInputMaskTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "LOCALE_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "LOCALE_VALIDATOR", "RAW_TEXT_VARIABLE_TEMPLATE_VALIDATOR", "RAW_TEXT_VARIABLE_VALIDATOR", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        DivCurrencyInputMaskTemplate$Companion$TYPE_READER$1 divCurrencyInputMaskTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivCurrencyInputMaskTemplate$Companion$TYPE_READER$1
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
        DivCurrencyInputMaskTemplate$Companion$CREATOR$1 divCurrencyInputMaskTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivCurrencyInputMaskTemplate>() { // from class: com.yandex.div2.DivCurrencyInputMaskTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivCurrencyInputMaskTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivCurrencyInputMaskTemplate(env, null, false, it);
            }
        };
    }

    public DivCurrencyInputMaskTemplate(@NotNull ParsingEnvironment env, @Nullable DivCurrencyInputMaskTemplate divCurrencyInputMaskTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        this.f35252a = JsonTemplateParser.m17355p(json, "locale", z, divCurrencyInputMaskTemplate == null ? null : divCurrencyInputMaskTemplate.f35252a, C3043f.f41340t, f34328a, env, TypeHelpersKt.f33850c);
        this.f35253b = JsonTemplateParser.m17341b(json, "raw_text_variable", z, divCurrencyInputMaskTemplate == null ? null : divCurrencyInputMaskTemplate.f35253b, C3043f.f41342v, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivCurrencyInputMask mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        return new DivCurrencyInputMask((Expression) FieldKt.m17378d(this.f35252a, env, "locale", data, f35250c), (String) FieldKt.m17376b(this.f35253b, env, "raw_text_variable", data, f35251d));
    }
}
