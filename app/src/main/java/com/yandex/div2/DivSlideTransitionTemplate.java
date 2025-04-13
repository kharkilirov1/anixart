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
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivDimensionTemplate;
import com.yandex.div2.DivSlideTransition;
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

/* compiled from: DivSlideTransitionTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivSlideTransitionTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivSlideTransition;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivSlideTransitionTemplate implements JSONSerializable, JsonTemplate<DivSlideTransition> {

    /* renamed from: f */
    @NotNull
    public static final Expression<Long> f38879f;

    /* renamed from: g */
    @NotNull
    public static final Expression<DivSlideTransition.Edge> f38880g;

    /* renamed from: h */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f38881h;

    /* renamed from: i */
    @NotNull
    public static final Expression<Long> f38882i;

    /* renamed from: j */
    @NotNull
    public static final TypeHelper<DivSlideTransition.Edge> f38883j;

    /* renamed from: k */
    @NotNull
    public static final TypeHelper<DivAnimationInterpolator> f38884k;

    /* renamed from: l */
    @NotNull
    public static final ValueValidator<Long> f38885l;

    /* renamed from: m */
    @NotNull
    public static final ValueValidator<Long> f38886m;

    /* renamed from: n */
    @NotNull
    public static final ValueValidator<Long> f38887n;

    /* renamed from: o */
    @NotNull
    public static final ValueValidator<Long> f38888o;

    /* renamed from: p */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivDimension> f38889p;

    /* renamed from: q */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f38890q;

    /* renamed from: r */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivSlideTransition.Edge>> f38891r;

    /* renamed from: s */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAnimationInterpolator>> f38892s;

    /* renamed from: t */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f38893t;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivDimensionTemplate> f38894a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f38895b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<DivSlideTransition.Edge>> f38896c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<Expression<DivAnimationInterpolator>> f38897d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f38898e;

    /* compiled from: DivSlideTransitionTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\bR\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, m31884d2 = {"Lcom/yandex/div2/DivSlideTransitionTemplate$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "DURATION_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "DURATION_VALIDATOR", "Lcom/yandex/div2/DivSlideTransition$Edge;", "EDGE_DEFAULT_VALUE", "Lcom/yandex/div2/DivAnimationInterpolator;", "INTERPOLATOR_DEFAULT_VALUE", "START_DELAY_DEFAULT_VALUE", "START_DELAY_TEMPLATE_VALIDATOR", "START_DELAY_VALIDATOR", "", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_EDGE", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_INTERPOLATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f38879f = companion.m17539a(200L);
        f38880g = companion.m17539a(DivSlideTransition.Edge.BOTTOM);
        f38881h = companion.m17539a(DivAnimationInterpolator.EASE_IN_OUT);
        f38882i = companion.m17539a(0L);
        int i2 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f38883j = companion2.m17372a(ArraysKt.m31926B(DivSlideTransition.Edge.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSlideTransitionTemplate$Companion$TYPE_HELPER_EDGE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivSlideTransition.Edge);
            }
        });
        f38884k = companion2.m17372a(ArraysKt.m31926B(DivAnimationInterpolator.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSlideTransitionTemplate$Companion$TYPE_HELPER_INTERPOLATOR$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAnimationInterpolator);
            }
        });
        f38885l = C3040d0.f41252r;
        f38886m = C3040d0.f41253s;
        f38887n = C3040d0.f41254t;
        f38888o = C3040d0.f41255u;
        f38889p = new Function3<String, JSONObject, ParsingEnvironment, DivDimension>() { // from class: com.yandex.div2.DivSlideTransitionTemplate$Companion$DISTANCE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivDimension mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivDimension.Companion companion3 = DivDimension.f35517c;
                return (DivDimension) JsonParser.m17322n(jSONObject2, str2, DivDimension.f35520f, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f38890q = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivSlideTransitionTemplate$Companion$DURATION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivSlideTransitionTemplate.f38886m;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivSlideTransitionTemplate.f38879f;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f38891r = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivSlideTransition.Edge>>() { // from class: com.yandex.div2.DivSlideTransitionTemplate$Companion$EDGE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivSlideTransition.Edge> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSlideTransition.Edge.Converter converter = DivSlideTransition.Edge.f38870c;
                Function1<String, DivSlideTransition.Edge> function1 = DivSlideTransition.Edge.f38871d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivSlideTransition.Edge> expression = DivSlideTransitionTemplate.f38880g;
                Expression<DivSlideTransition.Edge> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivSlideTransitionTemplate.f38883j);
                return m17330v == null ? expression : m17330v;
            }
        };
        f38892s = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAnimationInterpolator>>() { // from class: com.yandex.div2.DivSlideTransitionTemplate$Companion$INTERPOLATOR_READER$1
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
                Expression<DivAnimationInterpolator> expression = DivSlideTransitionTemplate.f38881h;
                Expression<DivAnimationInterpolator> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivSlideTransitionTemplate.f38884k);
                return m17330v == null ? expression : m17330v;
            }
        };
        f38893t = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivSlideTransitionTemplate$Companion$START_DELAY_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivSlideTransitionTemplate.f38888o;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivSlideTransitionTemplate.f38882i;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        DivSlideTransitionTemplate$Companion$TYPE_READER$1 divSlideTransitionTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivSlideTransitionTemplate$Companion$TYPE_READER$1
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
        DivSlideTransitionTemplate$Companion$CREATOR$1 divSlideTransitionTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivSlideTransitionTemplate>() { // from class: com.yandex.div2.DivSlideTransitionTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivSlideTransitionTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivSlideTransitionTemplate(env, null, false, it);
            }
        };
    }

    public DivSlideTransitionTemplate(@NotNull ParsingEnvironment env, @Nullable DivSlideTransitionTemplate divSlideTransitionTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<DivDimensionTemplate> field = divSlideTransitionTemplate == null ? null : divSlideTransitionTemplate.f38894a;
        DivDimensionTemplate.Companion companion = DivDimensionTemplate.f35525c;
        this.f38894a = JsonTemplateParser.m17354o(json, "distance", z, field, DivDimensionTemplate.f35530h, f34328a, env);
        Field<Expression<Long>> field2 = divSlideTransitionTemplate == null ? null : divSlideTransitionTemplate.f38895b;
        Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator = f38885l;
        TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
        this.f38895b = JsonTemplateParser.m17357r(json, "duration", z, field2, function1, valueValidator, f34328a, env, typeHelper);
        Field<Expression<DivSlideTransition.Edge>> field3 = divSlideTransitionTemplate == null ? null : divSlideTransitionTemplate.f38896c;
        DivSlideTransition.Edge.Converter converter = DivSlideTransition.Edge.f38870c;
        this.f38896c = JsonTemplateParser.m17358s(json, "edge", z, field3, DivSlideTransition.Edge.f38871d, f34328a, env, f38883j);
        Field<Expression<DivAnimationInterpolator>> field4 = divSlideTransitionTemplate == null ? null : divSlideTransitionTemplate.f38897d;
        DivAnimationInterpolator.Converter converter2 = DivAnimationInterpolator.f34666c;
        this.f38897d = JsonTemplateParser.m17358s(json, "interpolator", z, field4, DivAnimationInterpolator.f34667d, f34328a, env, f38884k);
        this.f38898e = JsonTemplateParser.m17357r(json, "start_delay", z, divSlideTransitionTemplate == null ? null : divSlideTransitionTemplate.f38898e, function1, f38887n, f34328a, env, typeHelper);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivSlideTransition mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        DivDimension divDimension = (DivDimension) FieldKt.m17381g(this.f38894a, env, "distance", data, f38889p);
        Expression<Long> expression = (Expression) FieldKt.m17378d(this.f38895b, env, "duration", data, f38890q);
        if (expression == null) {
            expression = f38879f;
        }
        Expression<Long> expression2 = expression;
        Expression<DivSlideTransition.Edge> expression3 = (Expression) FieldKt.m17378d(this.f38896c, env, "edge", data, f38891r);
        if (expression3 == null) {
            expression3 = f38880g;
        }
        Expression<DivSlideTransition.Edge> expression4 = expression3;
        Expression<DivAnimationInterpolator> expression5 = (Expression) FieldKt.m17378d(this.f38897d, env, "interpolator", data, f38892s);
        if (expression5 == null) {
            expression5 = f38881h;
        }
        Expression<DivAnimationInterpolator> expression6 = expression5;
        Expression<Long> expression7 = (Expression) FieldKt.m17378d(this.f38898e, env, "start_delay", data, f38893t);
        if (expression7 == null) {
            expression7 = f38882i;
        }
        return new DivSlideTransition(divDimension, expression2, expression4, expression6, expression7);
    }
}
