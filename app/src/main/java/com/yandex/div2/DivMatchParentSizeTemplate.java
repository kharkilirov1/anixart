package com.yandex.div2;

import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivMatchParentSizeTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivMatchParentSizeTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivMatchParentSize;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivMatchParentSizeTemplate implements JSONSerializable, JsonTemplate<DivMatchParentSize> {

    /* renamed from: b */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f37713b;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f37714a;

    /* compiled from: DivMatchParentSizeTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, m31884d2 = {"Lcom/yandex/div2/DivMatchParentSizeTemplate$Companion;", "", "", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "WEIGHT_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "WEIGHT_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        DivMatchParentSizeTemplate$Companion$TYPE_READER$1 divMatchParentSizeTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivMatchParentSizeTemplate$Companion$TYPE_READER$1
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
        f37713b = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivMatchParentSizeTemplate$Companion$WEIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> function3 = DivMatchParentSizeTemplate.f37713b;
                return JsonParser.m17327s(jSONObject2, str2, function1, C3076y.f42175f, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33851d);
            }
        };
        DivMatchParentSizeTemplate$Companion$CREATOR$1 divMatchParentSizeTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivMatchParentSizeTemplate>() { // from class: com.yandex.div2.DivMatchParentSizeTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivMatchParentSizeTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivMatchParentSizeTemplate(env, null, false, it);
            }
        };
    }

    public DivMatchParentSizeTemplate(@NotNull ParsingEnvironment env, @Nullable DivMatchParentSizeTemplate divMatchParentSizeTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        this.f37714a = JsonTemplateParser.m17357r(json, "weight", z, divMatchParentSizeTemplate == null ? null : divMatchParentSizeTemplate.f37714a, ParsingConvertersKt.f33830d, C3076y.f42174e, env.getF34328a(), env, TypeHelpersKt.f33851d);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivMatchParentSize mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        return new DivMatchParentSize((Expression) FieldKt.m17378d(this.f37714a, env, "weight", data, f37713b));
    }
}
