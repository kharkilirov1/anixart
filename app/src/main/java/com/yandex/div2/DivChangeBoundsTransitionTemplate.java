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

/* compiled from: DivChangeBoundsTransitionTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivChangeBoundsTransitionTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivChangeBoundsTransition;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivChangeBoundsTransitionTemplate implements JSONSerializable, JsonTemplate<DivChangeBoundsTransition> {

    /* renamed from: d */
    @NotNull
    public static final Expression<Long> f34828d;

    /* renamed from: e */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f34829e;

    /* renamed from: f */
    @NotNull
    public static final Expression<Long> f34830f;

    /* renamed from: g */
    @NotNull
    public static final TypeHelper<DivAnimationInterpolator> f34831g;

    /* renamed from: h */
    @NotNull
    public static final ValueValidator<Long> f34832h;

    /* renamed from: i */
    @NotNull
    public static final ValueValidator<Long> f34833i;

    /* renamed from: j */
    @NotNull
    public static final ValueValidator<Long> f34834j;

    /* renamed from: k */
    @NotNull
    public static final ValueValidator<Long> f34835k;

    /* renamed from: l */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f34836l;

    /* renamed from: m */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAnimationInterpolator>> f34837m;

    /* renamed from: n */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f34838n;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f34839a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<DivAnimationInterpolator>> f34840b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f34841c;

    /* compiled from: DivChangeBoundsTransitionTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m31884d2 = {"Lcom/yandex/div2/DivChangeBoundsTransitionTemplate$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "DURATION_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "DURATION_VALIDATOR", "Lcom/yandex/div2/DivAnimationInterpolator;", "INTERPOLATOR_DEFAULT_VALUE", "START_DELAY_DEFAULT_VALUE", "START_DELAY_TEMPLATE_VALIDATOR", "START_DELAY_VALIDATOR", "", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_INTERPOLATOR", "Lcom/yandex/div/internal/parser/TypeHelper;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f34828d = companion.m17539a(200L);
        f34829e = companion.m17539a(DivAnimationInterpolator.EASE_IN_OUT);
        f34830f = companion.m17539a(0L);
        int i2 = TypeHelper.f33843a;
        f34831g = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivAnimationInterpolator.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivChangeBoundsTransitionTemplate$Companion$TYPE_HELPER_INTERPOLATOR$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAnimationInterpolator);
            }
        });
        f34832h = C3039d.f41223l;
        f34833i = C3039d.f41224m;
        f34834j = C3039d.f41225n;
        f34835k = C3039d.f41226o;
        f34836l = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivChangeBoundsTransitionTemplate$Companion$DURATION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivChangeBoundsTransitionTemplate.f34833i;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivChangeBoundsTransitionTemplate.f34828d;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f34837m = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAnimationInterpolator>>() { // from class: com.yandex.div2.DivChangeBoundsTransitionTemplate$Companion$INTERPOLATOR_READER$1
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
                Expression<DivAnimationInterpolator> expression = DivChangeBoundsTransitionTemplate.f34829e;
                Expression<DivAnimationInterpolator> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivChangeBoundsTransitionTemplate.f34831g);
                return m17330v == null ? expression : m17330v;
            }
        };
        f34838n = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivChangeBoundsTransitionTemplate$Companion$START_DELAY_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivChangeBoundsTransitionTemplate.f34835k;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivChangeBoundsTransitionTemplate.f34830f;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        DivChangeBoundsTransitionTemplate$Companion$TYPE_READER$1 divChangeBoundsTransitionTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivChangeBoundsTransitionTemplate$Companion$TYPE_READER$1
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
        DivChangeBoundsTransitionTemplate$Companion$CREATOR$1 divChangeBoundsTransitionTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivChangeBoundsTransitionTemplate>() { // from class: com.yandex.div2.DivChangeBoundsTransitionTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivChangeBoundsTransitionTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivChangeBoundsTransitionTemplate(env, null, false, it);
            }
        };
    }

    public DivChangeBoundsTransitionTemplate(@NotNull ParsingEnvironment env, @Nullable DivChangeBoundsTransitionTemplate divChangeBoundsTransitionTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<Expression<Long>> field = divChangeBoundsTransitionTemplate == null ? null : divChangeBoundsTransitionTemplate.f34839a;
        Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator = f34832h;
        TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
        this.f34839a = JsonTemplateParser.m17357r(json, "duration", z, field, function1, valueValidator, f34328a, env, typeHelper);
        Field<Expression<DivAnimationInterpolator>> field2 = divChangeBoundsTransitionTemplate == null ? null : divChangeBoundsTransitionTemplate.f34840b;
        DivAnimationInterpolator.Converter converter = DivAnimationInterpolator.f34666c;
        this.f34840b = JsonTemplateParser.m17358s(json, "interpolator", z, field2, DivAnimationInterpolator.f34667d, f34328a, env, f34831g);
        this.f34841c = JsonTemplateParser.m17357r(json, "start_delay", z, divChangeBoundsTransitionTemplate == null ? null : divChangeBoundsTransitionTemplate.f34841c, function1, f34834j, f34328a, env, typeHelper);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivChangeBoundsTransition mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        Expression<Long> expression = (Expression) FieldKt.m17378d(this.f34839a, env, "duration", data, f34836l);
        if (expression == null) {
            expression = f34828d;
        }
        Expression<DivAnimationInterpolator> expression2 = (Expression) FieldKt.m17378d(this.f34840b, env, "interpolator", data, f34837m);
        if (expression2 == null) {
            expression2 = f34829e;
        }
        Expression<Long> expression3 = (Expression) FieldKt.m17378d(this.f34841c, env, "start_delay", data, f34838n);
        if (expression3 == null) {
            expression3 = f34830f;
        }
        return new DivChangeBoundsTransition(expression, expression2, expression3);
    }
}
