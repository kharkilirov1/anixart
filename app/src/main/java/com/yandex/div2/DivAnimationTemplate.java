package com.yandex.div2;

import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.parser.ListValidator;
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
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.DivCount;
import com.yandex.div2.DivCountTemplate;
import java.util.List;
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

/* compiled from: DivAnimationTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivAnimationTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivAnimation;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivAnimationTemplate implements JSONSerializable, JsonTemplate<DivAnimation> {

    /* renamed from: A */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivCount> f34677A;

    /* renamed from: B */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f34678B;

    /* renamed from: C */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f34679C;

    /* renamed from: D */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivAnimationTemplate> f34680D;

    /* renamed from: i */
    @NotNull
    public static final Companion f34681i = new Companion(null);

    /* renamed from: j */
    @NotNull
    public static final Expression<Long> f34682j;

    /* renamed from: k */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f34683k;

    /* renamed from: l */
    @NotNull
    public static final DivCount.Infinity f34684l;

    /* renamed from: m */
    @NotNull
    public static final Expression<Long> f34685m;

    /* renamed from: n */
    @NotNull
    public static final TypeHelper<DivAnimationInterpolator> f34686n;

    /* renamed from: o */
    @NotNull
    public static final TypeHelper<DivAnimation.Name> f34687o;

    /* renamed from: p */
    @NotNull
    public static final ValueValidator<Long> f34688p;

    /* renamed from: q */
    @NotNull
    public static final ValueValidator<Long> f34689q;

    /* renamed from: r */
    @NotNull
    public static final ListValidator<DivAnimation> f34690r;

    /* renamed from: s */
    @NotNull
    public static final ListValidator<DivAnimationTemplate> f34691s;

    /* renamed from: t */
    @NotNull
    public static final ValueValidator<Long> f34692t;

    /* renamed from: u */
    @NotNull
    public static final ValueValidator<Long> f34693u;

    /* renamed from: v */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f34694v;

    /* renamed from: w */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f34695w;

    /* renamed from: x */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAnimationInterpolator>> f34696x;

    /* renamed from: y */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAnimation>> f34697y;

    /* renamed from: z */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAnimation.Name>> f34698z;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f34699a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f34700b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<DivAnimationInterpolator>> f34701c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<List<DivAnimationTemplate>> f34702d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<Expression<DivAnimation.Name>> f34703e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<DivCountTemplate> f34704f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f34705g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f34706h;

    /* compiled from: DivAnimationTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0005R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\bR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, m31884d2 = {"Lcom/yandex/div2/DivAnimationTemplate$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "DURATION_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "DURATION_VALIDATOR", "Lcom/yandex/div2/DivAnimationInterpolator;", "INTERPOLATOR_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAnimationTemplate;", "ITEMS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAnimation;", "ITEMS_VALIDATOR", "Lcom/yandex/div2/DivCount$Infinity;", "REPEAT_DEFAULT_VALUE", "Lcom/yandex/div2/DivCount$Infinity;", "START_DELAY_DEFAULT_VALUE", "START_DELAY_TEMPLATE_VALIDATOR", "START_DELAY_VALIDATOR", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_INTERPOLATOR", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAnimation$Name;", "TYPE_HELPER_NAME", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f34682j = companion.m17539a(300L);
        f34683k = companion.m17539a(DivAnimationInterpolator.SPRING);
        f34684l = new DivCount.Infinity(new DivInfinityCount());
        f34685m = companion.m17539a(0L);
        int i2 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f34686n = companion2.m17372a(ArraysKt.m31926B(DivAnimationInterpolator.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivAnimationTemplate$Companion$TYPE_HELPER_INTERPOLATOR$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAnimationInterpolator);
            }
        });
        f34687o = companion2.m17372a(ArraysKt.m31926B(DivAnimation.Name.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivAnimationTemplate$Companion$TYPE_HELPER_NAME$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAnimation.Name);
            }
        });
        f34688p = C3035b.f41121t;
        f34689q = C3035b.f41122u;
        f34690r = C3037c.f41164i;
        f34691s = C3037c.f41165j;
        f34692t = C3035b.f41123v;
        f34693u = C3035b.f41124w;
        f34694v = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivAnimationTemplate$Companion$DURATION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivAnimationTemplate.f34689q;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivAnimationTemplate.f34682j;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f34695w = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivAnimationTemplate$Companion$END_VALUE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17329u(jSONObject2, str2, ParsingConvertersKt.f33830d, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33851d);
            }
        };
        f34696x = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAnimationInterpolator>>() { // from class: com.yandex.div2.DivAnimationTemplate$Companion$INTERPOLATOR_READER$1
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
                Expression<DivAnimationInterpolator> expression = DivAnimationTemplate.f34683k;
                Expression<DivAnimationInterpolator> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivAnimationTemplate.f34686n);
                return m17330v == null ? expression : m17330v;
            }
        };
        f34697y = new Function3<String, JSONObject, ParsingEnvironment, List<DivAnimation>>() { // from class: com.yandex.div2.DivAnimationTemplate$Companion$ITEMS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAnimation> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAnimation.Companion companion3 = DivAnimation.f34634h;
                return JsonParser.m17333y(jSONObject2, str2, DivAnimation.f34644r, DivAnimationTemplate.f34690r, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f34698z = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAnimation.Name>>() { // from class: com.yandex.div2.DivAnimationTemplate$Companion$NAME_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAnimation.Name> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAnimation.Name.Converter converter = DivAnimation.Name.f34655c;
                return JsonParser.m17317i(jSONObject2, str2, DivAnimation.Name.f34656d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivAnimationTemplate.f34687o);
            }
        };
        f34677A = new Function3<String, JSONObject, ParsingEnvironment, DivCount>() { // from class: com.yandex.div2.DivAnimationTemplate$Companion$REPEAT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivCount mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivCount.Companion companion3 = DivCount.f35238a;
                DivCount divCount = (DivCount) JsonParser.m17322n(jSONObject2, str2, DivCount.f35239b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divCount == null ? DivAnimationTemplate.f34684l : divCount;
            }
        };
        f34678B = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivAnimationTemplate$Companion$START_DELAY_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivAnimationTemplate.f34693u;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivAnimationTemplate.f34685m;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f34679C = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivAnimationTemplate$Companion$START_VALUE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17329u(jSONObject2, str2, ParsingConvertersKt.f33830d, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33851d);
            }
        };
        f34680D = new Function2<ParsingEnvironment, JSONObject, DivAnimationTemplate>() { // from class: com.yandex.div2.DivAnimationTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivAnimationTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivAnimationTemplate(env, null, false, it, 6);
            }
        };
    }

    public DivAnimationTemplate(ParsingEnvironment parsingEnvironment, DivAnimationTemplate divAnimationTemplate, boolean z, JSONObject jSONObject, int i2) {
        boolean z2 = (i2 & 4) != 0 ? false : z;
        ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
        Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator = f34688p;
        TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
        this.f34699a = JsonTemplateParser.m17357r(jSONObject, "duration", z2, null, function1, valueValidator, f34328a, parsingEnvironment, typeHelper);
        Function1<Number, Double> function12 = ParsingConvertersKt.f33830d;
        TypeHelper<Double> typeHelper2 = TypeHelpersKt.f33851d;
        this.f34700b = JsonTemplateParser.m17358s(jSONObject, "end_value", z2, null, function12, f34328a, parsingEnvironment, typeHelper2);
        DivAnimationInterpolator.Converter converter = DivAnimationInterpolator.f34666c;
        this.f34701c = JsonTemplateParser.m17358s(jSONObject, "interpolator", z2, null, DivAnimationInterpolator.f34667d, f34328a, parsingEnvironment, f34686n);
        this.f34702d = JsonTemplateParser.m17360u(jSONObject, "items", z2, null, f34680D, f34691s, f34328a, parsingEnvironment);
        DivAnimation.Name.Converter converter2 = DivAnimation.Name.f34655c;
        this.f34703e = JsonTemplateParser.m17349j(jSONObject, "name", z2, null, DivAnimation.Name.f34656d, f34328a, parsingEnvironment, f34687o);
        DivCountTemplate.Companion companion = DivCountTemplate.f35241a;
        this.f34704f = JsonTemplateParser.m17354o(jSONObject, "repeat", z2, null, DivCountTemplate.f35242b, f34328a, parsingEnvironment);
        this.f34705g = JsonTemplateParser.m17357r(jSONObject, "start_delay", z2, null, function1, f34692t, f34328a, parsingEnvironment, typeHelper);
        this.f34706h = JsonTemplateParser.m17358s(jSONObject, "start_value", z2, null, function12, f34328a, parsingEnvironment, typeHelper2);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivAnimation mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        Expression<Long> expression = (Expression) FieldKt.m17378d(this.f34699a, env, "duration", data, f34694v);
        if (expression == null) {
            expression = f34682j;
        }
        Expression<Long> expression2 = expression;
        Expression expression3 = (Expression) FieldKt.m17378d(this.f34700b, env, "end_value", data, f34695w);
        Expression<DivAnimationInterpolator> expression4 = (Expression) FieldKt.m17378d(this.f34701c, env, "interpolator", data, f34696x);
        if (expression4 == null) {
            expression4 = f34683k;
        }
        Expression<DivAnimationInterpolator> expression5 = expression4;
        List m17382h = FieldKt.m17382h(this.f34702d, env, "items", data, f34690r, f34697y);
        Expression expression6 = (Expression) FieldKt.m17376b(this.f34703e, env, "name", data, f34698z);
        DivCount divCount = (DivCount) FieldKt.m17381g(this.f34704f, env, "repeat", data, f34677A);
        if (divCount == null) {
            divCount = f34684l;
        }
        DivCount divCount2 = divCount;
        Expression<Long> expression7 = (Expression) FieldKt.m17378d(this.f34705g, env, "start_delay", data, f34678B);
        if (expression7 == null) {
            expression7 = f34685m;
        }
        return new DivAnimation(expression2, expression3, expression5, m17382h, expression6, divCount2, expression7, (Expression) FieldKt.m17378d(this.f34706h, env, "start_value", data, f34679C));
    }
}
