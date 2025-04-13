package com.yandex.div2;

import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivInputValidatorBaseTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivInputValidatorBaseTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivInputValidatorBase;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivInputValidatorBaseTemplate implements JSONSerializable, JsonTemplate<DivInputValidatorBase> {

    /* renamed from: d */
    @NotNull
    public static final Expression<Boolean> f37609d = Expression.f34334a.m17539a(Boolean.FALSE);

    /* renamed from: e */
    @NotNull
    public static final ValueValidator<String> f37610e = C3073v.f42115z;

    /* renamed from: f */
    @NotNull
    public static final ValueValidator<String> f37611f = C3074w.f42117c;

    /* renamed from: g */
    @NotNull
    public static final ValueValidator<String> f37612g = C3074w.f42118d;

    /* renamed from: h */
    @NotNull
    public static final ValueValidator<String> f37613h = C3074w.f42119e;

    /* renamed from: i */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f37614i = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivInputValidatorBaseTemplate$Companion$ALLOW_EMPTY_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
            ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
            Expression<Boolean> expression = DivInputValidatorBaseTemplate.f37609d;
            Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33848a);
            return m17330v == null ? expression : m17330v;
        }
    };

    /* renamed from: j */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f37615j = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivInputValidatorBaseTemplate$Companion$LABEL_ID_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            return JsonParser.m17325q(jSONObject2, str2, DivInputValidatorBaseTemplate.f37611f, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33850c);
        }
    };

    /* renamed from: k */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f37616k = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivInputValidatorBaseTemplate$Companion$VARIABLE_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            return (String) JsonParser.m17323o(jSONObject2, str2, DivInputValidatorBaseTemplate.f37613h, parsingEnvironment2.getF34328a(), parsingEnvironment2);
        }
    };

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Boolean>> f37617a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<String>> f37618b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<String> f37619c;

    /* compiled from: DivInputValidatorBaseTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\r"}, m31884d2 = {"Lcom/yandex/div2/DivInputValidatorBaseTemplate$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "ALLOW_EMPTY_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "LABEL_ID_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "LABEL_ID_VALIDATOR", "VARIABLE_TEMPLATE_VALIDATOR", "VARIABLE_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        DivInputValidatorBaseTemplate$Companion$CREATOR$1 divInputValidatorBaseTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivInputValidatorBaseTemplate>() { // from class: com.yandex.div2.DivInputValidatorBaseTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivInputValidatorBaseTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivInputValidatorBaseTemplate(env, null, false, it, 6);
            }
        };
    }

    public DivInputValidatorBaseTemplate(ParsingEnvironment parsingEnvironment, DivInputValidatorBaseTemplate divInputValidatorBaseTemplate, boolean z, JSONObject jSONObject, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
        this.f37617a = JsonTemplateParser.m17358s(jSONObject, "allow_empty", z, null, ParsingConvertersKt.f33829c, f34328a, parsingEnvironment, TypeHelpersKt.f33848a);
        this.f37618b = JsonTemplateParser.m17355p(jSONObject, "label_id", z, null, f37610e, f34328a, parsingEnvironment, TypeHelpersKt.f33850c);
        this.f37619c = JsonTemplateParser.m17351l(jSONObject, "variable", z, null, f37612g, f34328a, parsingEnvironment);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivInputValidatorBase mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        Expression<Boolean> expression = (Expression) FieldKt.m17378d(this.f37617a, env, "allow_empty", data, f37614i);
        if (expression == null) {
            expression = f37609d;
        }
        return new DivInputValidatorBase(expression, (Expression) FieldKt.m17378d(this.f37618b, env, "label_id", data, f37615j), (String) FieldKt.m17378d(this.f37619c, env, "variable", data, f37616k));
    }
}
