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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivScaleTransitionTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivScaleTransitionTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivScaleTransition;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivScaleTransitionTemplate implements JSONSerializable, JsonTemplate<DivScaleTransition> {

    /* renamed from: A */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f38228A;

    /* renamed from: B */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f38229B;

    /* renamed from: C */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f38230C;

    /* renamed from: g */
    @NotNull
    public static final Expression<Long> f38231g;

    /* renamed from: h */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f38232h;

    /* renamed from: i */
    @NotNull
    public static final Expression<Double> f38233i;

    /* renamed from: j */
    @NotNull
    public static final Expression<Double> f38234j;

    /* renamed from: k */
    @NotNull
    public static final Expression<Double> f38235k;

    /* renamed from: l */
    @NotNull
    public static final Expression<Long> f38236l;

    /* renamed from: m */
    @NotNull
    public static final TypeHelper<DivAnimationInterpolator> f38237m;

    /* renamed from: n */
    @NotNull
    public static final ValueValidator<Long> f38238n;

    /* renamed from: o */
    @NotNull
    public static final ValueValidator<Long> f38239o;

    /* renamed from: p */
    @NotNull
    public static final ValueValidator<Double> f38240p;

    /* renamed from: q */
    @NotNull
    public static final ValueValidator<Double> f38241q;

    /* renamed from: r */
    @NotNull
    public static final ValueValidator<Double> f38242r;

    /* renamed from: s */
    @NotNull
    public static final ValueValidator<Double> f38243s;

    /* renamed from: t */
    @NotNull
    public static final ValueValidator<Double> f38244t;

    /* renamed from: u */
    @NotNull
    public static final ValueValidator<Double> f38245u;

    /* renamed from: v */
    @NotNull
    public static final ValueValidator<Long> f38246v;

    /* renamed from: w */
    @NotNull
    public static final ValueValidator<Long> f38247w;

    /* renamed from: x */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f38248x;

    /* renamed from: y */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAnimationInterpolator>> f38249y;

    /* renamed from: z */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f38250z;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f38251a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<DivAnimationInterpolator>> f38252b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f38253c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f38254d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f38255e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f38256f;

    /* compiled from: DivScaleTransitionTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0005R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\bR\u0014\u0010\u001a\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m31884d2 = {"Lcom/yandex/div2/DivScaleTransitionTemplate$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "DURATION_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "DURATION_VALIDATOR", "Lcom/yandex/div2/DivAnimationInterpolator;", "INTERPOLATOR_DEFAULT_VALUE", "", "PIVOT_X_DEFAULT_VALUE", "PIVOT_X_TEMPLATE_VALIDATOR", "PIVOT_X_VALIDATOR", "PIVOT_Y_DEFAULT_VALUE", "PIVOT_Y_TEMPLATE_VALIDATOR", "PIVOT_Y_VALIDATOR", "SCALE_DEFAULT_VALUE", "SCALE_TEMPLATE_VALIDATOR", "SCALE_VALIDATOR", "START_DELAY_DEFAULT_VALUE", "START_DELAY_TEMPLATE_VALIDATOR", "START_DELAY_VALIDATOR", "", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_INTERPOLATOR", "Lcom/yandex/div/internal/parser/TypeHelper;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f38231g = companion.m17539a(200L);
        f38232h = companion.m17539a(DivAnimationInterpolator.EASE_IN_OUT);
        Double valueOf = Double.valueOf(0.5d);
        f38233i = companion.m17539a(valueOf);
        f38234j = companion.m17539a(valueOf);
        f38235k = companion.m17539a(Double.valueOf(0.0d));
        f38236l = companion.m17539a(0L);
        int i2 = TypeHelper.f33843a;
        f38237m = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivAnimationInterpolator.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivScaleTransitionTemplate$Companion$TYPE_HELPER_INTERPOLATOR$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAnimationInterpolator);
            }
        });
        f38238n = C3034a0.f41087h;
        f38239o = C3034a0.f41088i;
        f38240p = C3034a0.f41089j;
        f38241q = C3034a0.f41090k;
        f38242r = C3034a0.f41091l;
        f38243s = C3034a0.f41092m;
        f38244t = C3034a0.f41093n;
        f38245u = C3034a0.f41094o;
        f38246v = C3034a0.f41095p;
        f38247w = C3034a0.f41096q;
        f38248x = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivScaleTransitionTemplate$Companion$DURATION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivScaleTransitionTemplate.f38239o;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivScaleTransitionTemplate.f38231g;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f38249y = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAnimationInterpolator>>() { // from class: com.yandex.div2.DivScaleTransitionTemplate$Companion$INTERPOLATOR_READER$1
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
                Expression<DivAnimationInterpolator> expression = DivScaleTransitionTemplate.f38232h;
                Expression<DivAnimationInterpolator> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivScaleTransitionTemplate.f38237m);
                return m17330v == null ? expression : m17330v;
            }
        };
        f38250z = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivScaleTransitionTemplate$Companion$PIVOT_X_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ValueValidator<Double> valueValidator = DivScaleTransitionTemplate.f38241q;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression = DivScaleTransitionTemplate.f38233i;
                Expression<Double> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
                return m17328t == null ? expression : m17328t;
            }
        };
        f38228A = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivScaleTransitionTemplate$Companion$PIVOT_Y_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ValueValidator<Double> valueValidator = DivScaleTransitionTemplate.f38243s;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression = DivScaleTransitionTemplate.f38234j;
                Expression<Double> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
                return m17328t == null ? expression : m17328t;
            }
        };
        f38229B = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivScaleTransitionTemplate$Companion$SCALE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ValueValidator<Double> valueValidator = DivScaleTransitionTemplate.f38245u;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression = DivScaleTransitionTemplate.f38235k;
                Expression<Double> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
                return m17328t == null ? expression : m17328t;
            }
        };
        f38230C = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivScaleTransitionTemplate$Companion$START_DELAY_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivScaleTransitionTemplate.f38247w;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivScaleTransitionTemplate.f38236l;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        DivScaleTransitionTemplate$Companion$TYPE_READER$1 divScaleTransitionTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivScaleTransitionTemplate$Companion$TYPE_READER$1
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
        DivScaleTransitionTemplate$Companion$CREATOR$1 divScaleTransitionTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivScaleTransitionTemplate>() { // from class: com.yandex.div2.DivScaleTransitionTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivScaleTransitionTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivScaleTransitionTemplate(env, null, false, it);
            }
        };
    }

    public DivScaleTransitionTemplate(@NotNull ParsingEnvironment env, @Nullable DivScaleTransitionTemplate divScaleTransitionTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<Expression<Long>> field = divScaleTransitionTemplate == null ? null : divScaleTransitionTemplate.f38251a;
        Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator = f38238n;
        TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
        this.f38251a = JsonTemplateParser.m17357r(json, "duration", z, field, function1, valueValidator, f34328a, env, typeHelper);
        Field<Expression<DivAnimationInterpolator>> field2 = divScaleTransitionTemplate == null ? null : divScaleTransitionTemplate.f38252b;
        DivAnimationInterpolator.Converter converter = DivAnimationInterpolator.f34666c;
        this.f38252b = JsonTemplateParser.m17358s(json, "interpolator", z, field2, DivAnimationInterpolator.f34667d, f34328a, env, f38237m);
        Field<Expression<Double>> field3 = divScaleTransitionTemplate == null ? null : divScaleTransitionTemplate.f38253c;
        Function1<Number, Double> function12 = ParsingConvertersKt.f33830d;
        ValueValidator<Double> valueValidator2 = f38240p;
        TypeHelper<Double> typeHelper2 = TypeHelpersKt.f33851d;
        this.f38253c = JsonTemplateParser.m17357r(json, "pivot_x", z, field3, function12, valueValidator2, f34328a, env, typeHelper2);
        this.f38254d = JsonTemplateParser.m17357r(json, "pivot_y", z, divScaleTransitionTemplate == null ? null : divScaleTransitionTemplate.f38254d, function12, f38242r, f34328a, env, typeHelper2);
        this.f38255e = JsonTemplateParser.m17357r(json, "scale", z, divScaleTransitionTemplate == null ? null : divScaleTransitionTemplate.f38255e, function12, f38244t, f34328a, env, typeHelper2);
        this.f38256f = JsonTemplateParser.m17357r(json, "start_delay", z, divScaleTransitionTemplate == null ? null : divScaleTransitionTemplate.f38256f, function1, f38246v, f34328a, env, typeHelper);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivScaleTransition mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        Expression<Long> expression = (Expression) FieldKt.m17378d(this.f38251a, env, "duration", data, f38248x);
        if (expression == null) {
            expression = f38231g;
        }
        Expression<Long> expression2 = expression;
        Expression<DivAnimationInterpolator> expression3 = (Expression) FieldKt.m17378d(this.f38252b, env, "interpolator", data, f38249y);
        if (expression3 == null) {
            expression3 = f38232h;
        }
        Expression<DivAnimationInterpolator> expression4 = expression3;
        Expression<Double> expression5 = (Expression) FieldKt.m17378d(this.f38253c, env, "pivot_x", data, f38250z);
        if (expression5 == null) {
            expression5 = f38233i;
        }
        Expression<Double> expression6 = expression5;
        Expression<Double> expression7 = (Expression) FieldKt.m17378d(this.f38254d, env, "pivot_y", data, f38228A);
        if (expression7 == null) {
            expression7 = f38234j;
        }
        Expression<Double> expression8 = expression7;
        Expression<Double> expression9 = (Expression) FieldKt.m17378d(this.f38255e, env, "scale", data, f38229B);
        if (expression9 == null) {
            expression9 = f38235k;
        }
        Expression<Double> expression10 = expression9;
        Expression<Long> expression11 = (Expression) FieldKt.m17378d(this.f38256f, env, "start_delay", data, f38230C);
        if (expression11 == null) {
            expression11 = f38236l;
        }
        return new DivScaleTransition(expression2, expression4, expression6, expression8, expression10, expression11);
    }
}
