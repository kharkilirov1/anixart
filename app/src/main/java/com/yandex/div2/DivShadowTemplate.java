package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
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
import com.yandex.div2.DivPoint;
import com.yandex.div2.DivPointTemplate;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivShadowTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivShadowTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivShadow;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivShadowTemplate implements JSONSerializable, JsonTemplate<DivShadow> {

    /* renamed from: e */
    @NotNull
    public static final Companion f38785e = new Companion(null);

    /* renamed from: f */
    @NotNull
    public static final Expression<Double> f38786f;

    /* renamed from: g */
    @NotNull
    public static final Expression<Long> f38787g;

    /* renamed from: h */
    @NotNull
    public static final Expression<Integer> f38788h;

    /* renamed from: i */
    @NotNull
    public static final ValueValidator<Double> f38789i;

    /* renamed from: j */
    @NotNull
    public static final ValueValidator<Double> f38790j;

    /* renamed from: k */
    @NotNull
    public static final ValueValidator<Long> f38791k;

    /* renamed from: l */
    @NotNull
    public static final ValueValidator<Long> f38792l;

    /* renamed from: m */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f38793m;

    /* renamed from: n */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f38794n;

    /* renamed from: o */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f38795o;

    /* renamed from: p */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivPoint> f38796p;

    /* renamed from: q */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivShadowTemplate> f38797q;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f38798a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f38799b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<Integer>> f38800c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<DivPointTemplate> f38801d;

    /* compiled from: DivShadowTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005¨\u0006\u0010"}, m31884d2 = {"Lcom/yandex/div2/DivShadowTemplate$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "", "BLUR_DEFAULT_VALUE", "BLUR_TEMPLATE_VALIDATOR", "BLUR_VALIDATOR", "", "COLOR_DEFAULT_VALUE", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f38786f = companion.m17539a(Double.valueOf(0.19d));
        f38787g = companion.m17539a(2L);
        f38788h = companion.m17539a(0);
        f38789i = C3040d0.f41246l;
        f38790j = C3040d0.f41247m;
        f38791k = C3040d0.f41248n;
        f38792l = C3040d0.f41249o;
        f38793m = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivShadowTemplate$Companion$ALPHA_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ValueValidator<Double> valueValidator = DivShadowTemplate.f38790j;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression = DivShadowTemplate.f38786f;
                Expression<Double> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
                return m17328t == null ? expression : m17328t;
            }
        };
        f38794n = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivShadowTemplate$Companion$BLUR_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivShadowTemplate.f38792l;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivShadowTemplate.f38787g;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f38795o = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivShadowTemplate$Companion$COLOR_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Integer> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Integer> function1 = ParsingConvertersKt.f33827a;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Integer> expression = DivShadowTemplate.f38788h;
                Expression<Integer> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33853f);
                return m17330v == null ? expression : m17330v;
            }
        };
        f38796p = new Function3<String, JSONObject, ParsingEnvironment, DivPoint>() { // from class: com.yandex.div2.DivShadowTemplate$Companion$OFFSET_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivPoint mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivPoint.Companion companion2 = DivPoint.f38064c;
                Function2<ParsingEnvironment, JSONObject, DivPoint> function2 = DivPoint.f38065d;
                parsingEnvironment2.getF34328a();
                return (DivPoint) JsonParser.m17313e(jSONObject2, str2, function2, C2904b.f33858e, parsingEnvironment2);
            }
        };
        f38797q = new Function2<ParsingEnvironment, JSONObject, DivShadowTemplate>() { // from class: com.yandex.div2.DivShadowTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivShadowTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivShadowTemplate(env, null, false, it, 6);
            }
        };
    }

    public DivShadowTemplate(ParsingEnvironment parsingEnvironment, DivShadowTemplate divShadowTemplate, boolean z, JSONObject jSONObject, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
        this.f38798a = JsonTemplateParser.m17357r(jSONObject, "alpha", z, null, ParsingConvertersKt.f33830d, f38789i, f34328a, parsingEnvironment, TypeHelpersKt.f33851d);
        this.f38799b = JsonTemplateParser.m17357r(jSONObject, "blur", z, null, ParsingConvertersKt.f33831e, f38791k, f34328a, parsingEnvironment, TypeHelpersKt.f33849b);
        this.f38800c = JsonTemplateParser.m17358s(jSONObject, "color", z, null, ParsingConvertersKt.f33827a, f34328a, parsingEnvironment, TypeHelpersKt.f33853f);
        DivPointTemplate.Companion companion = DivPointTemplate.f38069c;
        this.f38801d = JsonTemplateParser.m17345f(jSONObject, "offset", z, null, DivPointTemplate.f38072f, f34328a, parsingEnvironment);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivShadow mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        Expression<Double> expression = (Expression) FieldKt.m17378d(this.f38798a, env, "alpha", data, f38793m);
        if (expression == null) {
            expression = f38786f;
        }
        Expression<Long> expression2 = (Expression) FieldKt.m17378d(this.f38799b, env, "blur", data, f38794n);
        if (expression2 == null) {
            expression2 = f38787g;
        }
        Expression<Integer> expression3 = (Expression) FieldKt.m17378d(this.f38800c, env, "color", data, f38795o);
        if (expression3 == null) {
            expression3 = f38788h;
        }
        return new DivShadow(expression, expression2, expression3, (DivPoint) FieldKt.m17383i(this.f38801d, env, "offset", data, f38796p));
    }
}
