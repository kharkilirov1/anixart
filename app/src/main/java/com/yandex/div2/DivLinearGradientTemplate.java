package com.yandex.div2;

import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivLinearGradientTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivLinearGradientTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivLinearGradient;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivLinearGradientTemplate implements JSONSerializable, JsonTemplate<DivLinearGradient> {

    /* renamed from: c */
    @NotNull
    public static final Expression<Long> f37697c = Expression.f34334a.m17539a(0L);

    /* renamed from: d */
    @NotNull
    public static final ValueValidator<Long> f37698d = C3074w.f42139y;

    /* renamed from: e */
    @NotNull
    public static final ValueValidator<Long> f37699e = C3076y.f42172c;

    /* renamed from: f */
    @NotNull
    public static final ListValidator<Integer> f37700f = C3075x.f42147c;

    /* renamed from: g */
    @NotNull
    public static final ListValidator<Integer> f37701g = C3075x.f42148d;

    /* renamed from: h */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f37702h = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivLinearGradientTemplate$Companion$ANGLE_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator = DivLinearGradientTemplate.f37699e;
            ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
            Expression<Long> expression = DivLinearGradientTemplate.f37697c;
            Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
            return m17328t == null ? expression : m17328t;
        }
    };

    /* renamed from: i */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, ExpressionList<Integer>> f37703i = new Function3<String, JSONObject, ParsingEnvironment, ExpressionList<Integer>>() { // from class: com.yandex.div2.DivLinearGradientTemplate$Companion$COLORS_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public ExpressionList<Integer> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            return JsonParser.m17319k(jSONObject2, str2, ParsingConvertersKt.f33827a, DivLinearGradientTemplate.f37700f, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33853f);
        }
    };

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f37704a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<ExpressionList<Integer>> f37705b;

    /* compiled from: DivLinearGradientTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31884d2 = {"Lcom/yandex/div2/DivLinearGradientTemplate$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "ANGLE_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ANGLE_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ANGLE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "", "COLORS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "COLORS_VALIDATOR", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        DivLinearGradientTemplate$Companion$TYPE_READER$1 divLinearGradientTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivLinearGradientTemplate$Companion$TYPE_READER$1
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
        DivLinearGradientTemplate$Companion$CREATOR$1 divLinearGradientTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivLinearGradientTemplate>() { // from class: com.yandex.div2.DivLinearGradientTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivLinearGradientTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivLinearGradientTemplate(env, null, false, it);
            }
        };
    }

    public DivLinearGradientTemplate(@NotNull ParsingEnvironment env, @Nullable DivLinearGradientTemplate divLinearGradientTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        this.f37704a = JsonTemplateParser.m17357r(json, "angle", z, divLinearGradientTemplate == null ? null : divLinearGradientTemplate.f37704a, ParsingConvertersKt.f33831e, f37698d, f34328a, env, TypeHelpersKt.f33849b);
        this.f37705b = JsonTemplateParser.m17340a(json, "colors", z, divLinearGradientTemplate == null ? null : divLinearGradientTemplate.f37705b, ParsingConvertersKt.f33827a, f37701g, f34328a, env, TypeHelpersKt.f33853f);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivLinearGradient mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        Expression<Long> expression = (Expression) FieldKt.m17378d(this.f37704a, env, "angle", data, f37702h);
        if (expression == null) {
            expression = f37697c;
        }
        return new DivLinearGradient(expression, FieldKt.m17377c(this.f37705b, env, "colors", data, f37703i));
    }
}
