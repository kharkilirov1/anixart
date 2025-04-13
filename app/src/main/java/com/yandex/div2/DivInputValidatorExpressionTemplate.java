package com.yandex.div2;

import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
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
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivInputValidatorExpressionTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivInputValidatorExpressionTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivInputValidatorExpression;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivInputValidatorExpressionTemplate implements JSONSerializable, JsonTemplate<DivInputValidatorExpression> {

    /* renamed from: e */
    @NotNull
    public static final Expression<Boolean> f37630e = Expression.f34334a.m17539a(Boolean.FALSE);

    /* renamed from: f */
    @NotNull
    public static final ValueValidator<String> f37631f = C3074w.f42123i;

    /* renamed from: g */
    @NotNull
    public static final ValueValidator<String> f37632g = C3074w.f42124j;

    /* renamed from: h */
    @NotNull
    public static final ValueValidator<String> f37633h = C3074w.f42125k;

    /* renamed from: i */
    @NotNull
    public static final ValueValidator<String> f37634i = C3074w.f42126l;

    /* renamed from: j */
    @NotNull
    public static final ValueValidator<String> f37635j = C3074w.f42127m;

    /* renamed from: k */
    @NotNull
    public static final ValueValidator<String> f37636k = C3074w.f42128n;

    /* renamed from: l */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f37637l = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivInputValidatorExpressionTemplate$Companion$ALLOW_EMPTY_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
            ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
            Expression<Boolean> expression = DivInputValidatorExpressionTemplate.f37630e;
            Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33848a);
            return m17330v == null ? expression : m17330v;
        }
    };

    /* renamed from: m */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f37638m = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivInputValidatorExpressionTemplate$Companion$CONDITION_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            return JsonParser.m17314f(jSONObject2, str2, DivInputValidatorExpressionTemplate.f37632g, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33850c);
        }
    };

    /* renamed from: n */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f37639n = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivInputValidatorExpressionTemplate$Companion$LABEL_ID_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            return JsonParser.m17314f(jSONObject2, str2, DivInputValidatorExpressionTemplate.f37634i, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33850c);
        }
    };

    /* renamed from: o */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f37640o;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Boolean>> f37641a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<String>> f37642b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<String>> f37643c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<String> f37644d;

    /* compiled from: DivInputValidatorExpressionTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\t¨\u0006\u0011"}, m31884d2 = {"Lcom/yandex/div2/DivInputValidatorExpressionTemplate$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "ALLOW_EMPTY_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "CONDITION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "CONDITION_VALIDATOR", "LABEL_ID_TEMPLATE_VALIDATOR", "LABEL_ID_VALIDATOR", "TYPE", "Ljava/lang/String;", "VARIABLE_TEMPLATE_VALIDATOR", "VARIABLE_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        DivInputValidatorExpressionTemplate$Companion$TYPE_READER$1 divInputValidatorExpressionTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivInputValidatorExpressionTemplate$Companion$TYPE_READER$1
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
        f37640o = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivInputValidatorExpressionTemplate$Companion$VARIABLE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17311c(jSONObject2, str2, DivInputValidatorExpressionTemplate.f37636k, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        DivInputValidatorExpressionTemplate$Companion$CREATOR$1 divInputValidatorExpressionTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivInputValidatorExpressionTemplate>() { // from class: com.yandex.div2.DivInputValidatorExpressionTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivInputValidatorExpressionTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivInputValidatorExpressionTemplate(env, null, false, it);
            }
        };
    }

    public DivInputValidatorExpressionTemplate(@NotNull ParsingEnvironment env, @Nullable DivInputValidatorExpressionTemplate divInputValidatorExpressionTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        this.f37641a = JsonTemplateParser.m17358s(json, "allow_empty", z, divInputValidatorExpressionTemplate == null ? null : divInputValidatorExpressionTemplate.f37641a, ParsingConvertersKt.f33829c, f34328a, env, TypeHelpersKt.f33848a);
        Field<Expression<String>> field = divInputValidatorExpressionTemplate == null ? null : divInputValidatorExpressionTemplate.f37642b;
        ValueValidator<String> valueValidator = f37631f;
        TypeHelper<String> typeHelper = TypeHelpersKt.f33850c;
        this.f37642b = JsonTemplateParser.m17346g(json, "condition", z, field, valueValidator, f34328a, env, typeHelper);
        this.f37643c = JsonTemplateParser.m17346g(json, "label_id", z, divInputValidatorExpressionTemplate == null ? null : divInputValidatorExpressionTemplate.f37643c, f37633h, f34328a, env, typeHelper);
        this.f37644d = JsonTemplateParser.m17341b(json, "variable", z, divInputValidatorExpressionTemplate == null ? null : divInputValidatorExpressionTemplate.f37644d, f37635j, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivInputValidatorExpression mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        Expression<Boolean> expression = (Expression) FieldKt.m17378d(this.f37641a, env, "allow_empty", data, f37637l);
        if (expression == null) {
            expression = f37630e;
        }
        return new DivInputValidatorExpression(expression, (Expression) FieldKt.m17376b(this.f37642b, env, "condition", data, f37638m), (Expression) FieldKt.m17376b(this.f37643c, env, "label_id", data, f37639n), (String) FieldKt.m17376b(this.f37644d, env, "variable", data, f37640o));
    }
}
