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
import com.yandex.div2.DivAnimationInterpolator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivFadeTransitionTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivFadeTransitionTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivFadeTransition;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivFadeTransitionTemplate implements JSONSerializable, JsonTemplate<DivFadeTransition> {

    /* renamed from: e */
    @NotNull
    public static final Companion f35689e = new Companion(null);

    /* renamed from: f */
    @NotNull
    public static final Expression<Double> f35690f;

    /* renamed from: g */
    @NotNull
    public static final Expression<Long> f35691g;

    /* renamed from: h */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f35692h;

    /* renamed from: i */
    @NotNull
    public static final Expression<Long> f35693i;

    /* renamed from: j */
    @NotNull
    public static final TypeHelper<DivAnimationInterpolator> f35694j;

    /* renamed from: k */
    @NotNull
    public static final ValueValidator<Double> f35695k;

    /* renamed from: l */
    @NotNull
    public static final ValueValidator<Double> f35696l;

    /* renamed from: m */
    @NotNull
    public static final ValueValidator<Long> f35697m;

    /* renamed from: n */
    @NotNull
    public static final ValueValidator<Long> f35698n;

    /* renamed from: o */
    @NotNull
    public static final ValueValidator<Long> f35699o;

    /* renamed from: p */
    @NotNull
    public static final ValueValidator<Long> f35700p;

    /* renamed from: q */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f35701q;

    /* renamed from: r */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f35702r;

    /* renamed from: s */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAnimationInterpolator>> f35703s;

    /* renamed from: t */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f35704t;

    /* renamed from: u */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivFadeTransitionTemplate> f35705u;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f35706a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f35707b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<DivAnimationInterpolator>> f35708c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f35709d;

    /* compiled from: DivFadeTransitionTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m31884d2 = {"Lcom/yandex/div2/DivFadeTransitionTemplate$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "", "DURATION_DEFAULT_VALUE", "DURATION_TEMPLATE_VALIDATOR", "DURATION_VALIDATOR", "Lcom/yandex/div2/DivAnimationInterpolator;", "INTERPOLATOR_DEFAULT_VALUE", "START_DELAY_DEFAULT_VALUE", "START_DELAY_TEMPLATE_VALIDATOR", "START_DELAY_VALIDATOR", "", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_INTERPOLATOR", "Lcom/yandex/div/internal/parser/TypeHelper;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f35690f = companion.m17539a(Double.valueOf(0.0d));
        f35691g = companion.m17539a(200L);
        f35692h = companion.m17539a(DivAnimationInterpolator.EASE_IN_OUT);
        f35693i = companion.m17539a(0L);
        int i2 = TypeHelper.f33843a;
        f35694j = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivAnimationInterpolator.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivFadeTransitionTemplate$Companion$TYPE_HELPER_INTERPOLATOR$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAnimationInterpolator);
            }
        });
        f35695k = C3049i.f41497x;
        f35696l = C3051j.f41527c;
        f35697m = C3051j.f41528d;
        f35698n = C3051j.f41529e;
        f35699o = C3051j.f41530f;
        f35700p = C3051j.f41531g;
        f35701q = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivFadeTransitionTemplate$Companion$ALPHA_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ValueValidator<Double> valueValidator = DivFadeTransitionTemplate.f35696l;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression = DivFadeTransitionTemplate.f35690f;
                Expression<Double> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
                return m17328t == null ? expression : m17328t;
            }
        };
        f35702r = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivFadeTransitionTemplate$Companion$DURATION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivFadeTransitionTemplate.f35698n;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivFadeTransitionTemplate.f35691g;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f35703s = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAnimationInterpolator>>() { // from class: com.yandex.div2.DivFadeTransitionTemplate$Companion$INTERPOLATOR_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAnimationInterpolator> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAnimationInterpolator.Converter converter = DivAnimationInterpolator.f34666c;
                Function1<String, DivAnimationInterpolator> function1 = DivAnimationInterpolator.f34667d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivAnimationInterpolator> expression = DivFadeTransitionTemplate.f35692h;
                Expression<DivAnimationInterpolator> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivFadeTransitionTemplate.f35694j);
                return m17330v == null ? expression : m17330v;
            }
        };
        f35704t = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivFadeTransitionTemplate$Companion$START_DELAY_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivFadeTransitionTemplate.f35700p;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivFadeTransitionTemplate.f35693i;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        DivFadeTransitionTemplate$Companion$TYPE_READER$1 divFadeTransitionTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivFadeTransitionTemplate$Companion$TYPE_READER$1
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
        f35705u = new Function2<ParsingEnvironment, JSONObject, DivFadeTransitionTemplate>() { // from class: com.yandex.div2.DivFadeTransitionTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivFadeTransitionTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivFadeTransitionTemplate(env, null, false, it);
            }
        };
    }

    public DivFadeTransitionTemplate(@NotNull ParsingEnvironment env, @Nullable DivFadeTransitionTemplate divFadeTransitionTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        this.f35706a = JsonTemplateParser.m17357r(json, "alpha", z, divFadeTransitionTemplate == null ? null : divFadeTransitionTemplate.f35706a, ParsingConvertersKt.f33830d, f35695k, f34328a, env, TypeHelpersKt.f33851d);
        Field<Expression<Long>> field = divFadeTransitionTemplate == null ? null : divFadeTransitionTemplate.f35707b;
        Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator = f35697m;
        TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
        this.f35707b = JsonTemplateParser.m17357r(json, "duration", z, field, function1, valueValidator, f34328a, env, typeHelper);
        Field<Expression<DivAnimationInterpolator>> field2 = divFadeTransitionTemplate == null ? null : divFadeTransitionTemplate.f35708c;
        DivAnimationInterpolator.Converter converter = DivAnimationInterpolator.f34666c;
        this.f35708c = JsonTemplateParser.m17358s(json, "interpolator", z, field2, DivAnimationInterpolator.f34667d, f34328a, env, f35694j);
        this.f35709d = JsonTemplateParser.m17357r(json, "start_delay", z, divFadeTransitionTemplate == null ? null : divFadeTransitionTemplate.f35709d, function1, f35699o, f34328a, env, typeHelper);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivFadeTransition mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        Expression<Double> expression = (Expression) FieldKt.m17378d(this.f35706a, env, "alpha", data, f35701q);
        if (expression == null) {
            expression = f35690f;
        }
        Expression<Long> expression2 = (Expression) FieldKt.m17378d(this.f35707b, env, "duration", data, f35702r);
        if (expression2 == null) {
            expression2 = f35691g;
        }
        Expression<DivAnimationInterpolator> expression3 = (Expression) FieldKt.m17378d(this.f35708c, env, "interpolator", data, f35703s);
        if (expression3 == null) {
            expression3 = f35692h;
        }
        Expression<Long> expression4 = (Expression) FieldKt.m17378d(this.f35709d, env, "start_delay", data, f35704t);
        if (expression4 == null) {
            expression4 = f35693i;
        }
        return new DivFadeTransition(expression, expression2, expression3, expression4);
    }
}
