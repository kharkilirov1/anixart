package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
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
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div2.DivAccessibility;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivAccessibilityTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivAccessibilityTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivAccessibility;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivAccessibilityTemplate implements JSONSerializable, JsonTemplate<DivAccessibility> {

    /* renamed from: g */
    @NotNull
    public static final Companion f34515g = new Companion(null);

    /* renamed from: h */
    @NotNull
    public static final Expression<DivAccessibility.Mode> f34516h;

    /* renamed from: i */
    @NotNull
    public static final Expression<Boolean> f34517i;

    /* renamed from: j */
    @NotNull
    public static final TypeHelper<DivAccessibility.Mode> f34518j;

    /* renamed from: k */
    @NotNull
    public static final ValueValidator<String> f34519k;

    /* renamed from: l */
    @NotNull
    public static final ValueValidator<String> f34520l;

    /* renamed from: m */
    @NotNull
    public static final ValueValidator<String> f34521m;

    /* renamed from: n */
    @NotNull
    public static final ValueValidator<String> f34522n;

    /* renamed from: o */
    @NotNull
    public static final ValueValidator<String> f34523o;

    /* renamed from: p */
    @NotNull
    public static final ValueValidator<String> f34524p;

    /* renamed from: q */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f34525q;

    /* renamed from: r */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f34526r;

    /* renamed from: s */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAccessibility.Mode>> f34527s;

    /* renamed from: t */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f34528t;

    /* renamed from: u */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f34529u;

    /* renamed from: v */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAccessibility.Type> f34530v;

    /* renamed from: w */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivAccessibilityTemplate> f34531w;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<String>> f34532a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<String>> f34533b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<DivAccessibility.Mode>> f34534c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<Expression<Boolean>> f34535d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<Expression<String>> f34536e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<DivAccessibility.Type> f34537f;

    /* compiled from: DivAccessibilityTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m31884d2 = {"Lcom/yandex/div2/DivAccessibilityTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "DESCRIPTION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "DESCRIPTION_VALIDATOR", "HINT_TEMPLATE_VALIDATOR", "HINT_VALIDATOR", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div2/DivAccessibility$Mode;", "MODE_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "", "MUTE_AFTER_ACTION_DEFAULT_VALUE", "STATE_DESCRIPTION_TEMPLATE_VALIDATOR", "STATE_DESCRIPTION_VALIDATOR", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_MODE", "Lcom/yandex/div/internal/parser/TypeHelper;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f34516h = companion.m17539a(DivAccessibility.Mode.DEFAULT);
        f34517i = companion.m17539a(Boolean.FALSE);
        int i2 = TypeHelper.f33843a;
        f34518j = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivAccessibility.Mode.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivAccessibilityTemplate$Companion$TYPE_HELPER_MODE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAccessibility.Mode);
            }
        });
        f34519k = C3035b.f41107f;
        f34520l = C3035b.f41108g;
        f34521m = C3035b.f41109h;
        f34522n = C3035b.f41110i;
        f34523o = C3035b.f41111j;
        f34524p = C3035b.f41112k;
        f34525q = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivAccessibilityTemplate$Companion$DESCRIPTION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17325q(jSONObject2, str2, DivAccessibilityTemplate.f34520l, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33850c);
            }
        };
        f34526r = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivAccessibilityTemplate$Companion$HINT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17325q(jSONObject2, str2, DivAccessibilityTemplate.f34522n, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33850c);
            }
        };
        f34527s = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAccessibility.Mode>>() { // from class: com.yandex.div2.DivAccessibilityTemplate$Companion$MODE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAccessibility.Mode> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAccessibility.Mode.Converter converter = DivAccessibility.Mode.f34494c;
                Function1<String, DivAccessibility.Mode> function1 = DivAccessibility.Mode.f34495d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivAccessibility.Mode> expression = DivAccessibilityTemplate.f34516h;
                Expression<DivAccessibility.Mode> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivAccessibilityTemplate.f34518j);
                return m17330v == null ? expression : m17330v;
            }
        };
        f34528t = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivAccessibilityTemplate$Companion$MUTE_AFTER_ACTION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Boolean> expression = DivAccessibilityTemplate.f34517i;
                Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33848a);
                return m17330v == null ? expression : m17330v;
            }
        };
        f34529u = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivAccessibilityTemplate$Companion$STATE_DESCRIPTION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17325q(jSONObject2, str2, DivAccessibilityTemplate.f34524p, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33850c);
            }
        };
        f34530v = new Function3<String, JSONObject, ParsingEnvironment, DivAccessibility.Type>() { // from class: com.yandex.div2.DivAccessibilityTemplate$Companion$TYPE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAccessibility.Type mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAccessibility.Type.Converter converter = DivAccessibility.Type.f34502c;
                return (DivAccessibility.Type) JsonParser.m17324p(jSONObject2, str2, DivAccessibility.Type.f34503d, C2904b.f33858e, parsingEnvironment2.getF34328a());
            }
        };
        f34531w = new Function2<ParsingEnvironment, JSONObject, DivAccessibilityTemplate>() { // from class: com.yandex.div2.DivAccessibilityTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivAccessibilityTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivAccessibilityTemplate(env, null, false, it, 6);
            }
        };
    }

    public DivAccessibilityTemplate(ParsingEnvironment parsingEnvironment, DivAccessibilityTemplate divAccessibilityTemplate, boolean z, JSONObject jSONObject, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
        ValueValidator<String> valueValidator = f34519k;
        TypeHelper<String> typeHelper = TypeHelpersKt.f33850c;
        this.f34532a = JsonTemplateParser.m17355p(jSONObject, "description", z, null, valueValidator, f34328a, parsingEnvironment, typeHelper);
        this.f34533b = JsonTemplateParser.m17355p(jSONObject, "hint", z, null, f34521m, f34328a, parsingEnvironment, typeHelper);
        DivAccessibility.Mode.Converter converter = DivAccessibility.Mode.f34494c;
        this.f34534c = JsonTemplateParser.m17358s(jSONObject, "mode", z, null, DivAccessibility.Mode.f34495d, f34328a, parsingEnvironment, f34518j);
        this.f34535d = JsonTemplateParser.m17358s(jSONObject, "mute_after_action", z, null, ParsingConvertersKt.f33829c, f34328a, parsingEnvironment, TypeHelpersKt.f33848a);
        this.f34536e = JsonTemplateParser.m17355p(jSONObject, "state_description", z, null, f34523o, f34328a, parsingEnvironment, typeHelper);
        DivAccessibility.Type.Converter converter2 = DivAccessibility.Type.f34502c;
        Function1<String, DivAccessibility.Type> function1 = DivAccessibility.Type.f34503d;
        ExpressionList<?> expressionList = JsonParser.f33823a;
        this.f34537f = JsonTemplateParser.m17353n(jSONObject, "type", z, null, function1, C2904b.f33858e, f34328a, parsingEnvironment);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivAccessibility mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        Expression expression = (Expression) FieldKt.m17378d(this.f34532a, env, "description", data, f34525q);
        Expression expression2 = (Expression) FieldKt.m17378d(this.f34533b, env, "hint", data, f34526r);
        Expression<DivAccessibility.Mode> expression3 = (Expression) FieldKt.m17378d(this.f34534c, env, "mode", data, f34527s);
        if (expression3 == null) {
            expression3 = f34516h;
        }
        Expression<DivAccessibility.Mode> expression4 = expression3;
        Expression<Boolean> expression5 = (Expression) FieldKt.m17378d(this.f34535d, env, "mute_after_action", data, f34528t);
        if (expression5 == null) {
            expression5 = f34517i;
        }
        return new DivAccessibility(expression, expression2, expression4, expression5, (Expression) FieldKt.m17378d(this.f34536e, env, "state_description", data, f34529u), (DivAccessibility.Type) FieldKt.m17378d(this.f34537f, env, "type", data, f34530v));
    }
}
