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
import com.yandex.div2.DivCornersRadius;
import com.yandex.div2.DivCornersRadiusTemplate;
import com.yandex.div2.DivShadow;
import com.yandex.div2.DivShadowTemplate;
import com.yandex.div2.DivStroke;
import com.yandex.div2.DivStrokeTemplate;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivBorderTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivBorderTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivBorder;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivBorderTemplate implements JSONSerializable, JsonTemplate<DivBorder> {

    /* renamed from: f */
    @NotNull
    public static final Companion f34795f = new Companion(null);

    /* renamed from: g */
    @NotNull
    public static final Expression<Boolean> f34796g = Expression.f34334a.m17539a(Boolean.FALSE);

    /* renamed from: h */
    @NotNull
    public static final ValueValidator<Long> f34797h = C3039d.f41219h;

    /* renamed from: i */
    @NotNull
    public static final ValueValidator<Long> f34798i = C3039d.f41220i;

    /* renamed from: j */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f34799j = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivBorderTemplate$Companion$CORNER_RADIUS_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivBorderTemplate.f34798i, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
        }
    };

    /* renamed from: k */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivCornersRadius> f34800k = new Function3<String, JSONObject, ParsingEnvironment, DivCornersRadius>() { // from class: com.yandex.div2.DivBorderTemplate$Companion$CORNERS_RADIUS_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public DivCornersRadius mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivCornersRadius.Companion companion = DivCornersRadius.f35216e;
            return (DivCornersRadius) JsonParser.m17322n(jSONObject2, str2, DivCornersRadius.f35217f, parsingEnvironment2.getF34328a(), parsingEnvironment2);
        }
    };

    /* renamed from: l */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f34801l = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivBorderTemplate$Companion$HAS_SHADOW_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
            ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
            Expression<Boolean> expression = DivBorderTemplate.f34796g;
            Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33848a);
            return m17330v == null ? expression : m17330v;
        }
    };

    /* renamed from: m */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivShadow> f34802m = new Function3<String, JSONObject, ParsingEnvironment, DivShadow>() { // from class: com.yandex.div2.DivBorderTemplate$Companion$SHADOW_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public DivShadow mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivShadow.Companion companion = DivShadow.f38773e;
            return (DivShadow) JsonParser.m17322n(jSONObject2, str2, DivShadow.f38779k, parsingEnvironment2.getF34328a(), parsingEnvironment2);
        }
    };

    /* renamed from: n */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivStroke> f34803n = new Function3<String, JSONObject, ParsingEnvironment, DivStroke>() { // from class: com.yandex.div2.DivBorderTemplate$Companion$STROKE_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public DivStroke mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivStroke.Companion companion = DivStroke.f39434d;
            return (DivStroke) JsonParser.m17322n(jSONObject2, str2, DivStroke.f39439i, parsingEnvironment2.getF34328a(), parsingEnvironment2);
        }
    };

    /* renamed from: o */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivBorderTemplate> f34804o = new Function2<ParsingEnvironment, JSONObject, DivBorderTemplate>() { // from class: com.yandex.div2.DivBorderTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivBorderTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            return new DivBorderTemplate(env, null, false, it, 6);
        }
    };

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f34805a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<DivCornersRadiusTemplate> f34806b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<Boolean>> f34807c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<DivShadowTemplate> f34808d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<DivStrokeTemplate> f34809e;

    /* compiled from: DivBorderTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m31884d2 = {"Lcom/yandex/div2/DivBorderTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "CORNER_RADIUS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "CORNER_RADIUS_VALIDATOR", "Lcom/yandex/div/json/expressions/Expression;", "", "HAS_SHADOW_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public DivBorderTemplate(ParsingEnvironment parsingEnvironment, DivBorderTemplate divBorderTemplate, boolean z, JSONObject jSONObject, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
        this.f34805a = JsonTemplateParser.m17357r(jSONObject, "corner_radius", z, null, ParsingConvertersKt.f33831e, f34797h, f34328a, parsingEnvironment, TypeHelpersKt.f33849b);
        DivCornersRadiusTemplate.Companion companion = DivCornersRadiusTemplate.f35223e;
        this.f34806b = JsonTemplateParser.m17354o(jSONObject, "corners_radius", z, null, DivCornersRadiusTemplate.f35228j, f34328a, parsingEnvironment);
        this.f34807c = JsonTemplateParser.m17358s(jSONObject, "has_shadow", z, null, ParsingConvertersKt.f33829c, f34328a, parsingEnvironment, TypeHelpersKt.f33848a);
        DivShadowTemplate.Companion companion2 = DivShadowTemplate.f38785e;
        this.f34808d = JsonTemplateParser.m17354o(jSONObject, "shadow", z, null, DivShadowTemplate.f38797q, f34328a, parsingEnvironment);
        DivStrokeTemplate.Companion companion3 = DivStrokeTemplate.f39445d;
        this.f34809e = JsonTemplateParser.m17354o(jSONObject, "stroke", z, null, DivStrokeTemplate.f39454m, f34328a, parsingEnvironment);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivBorder mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        Expression expression = (Expression) FieldKt.m17378d(this.f34805a, env, "corner_radius", data, f34799j);
        DivCornersRadius divCornersRadius = (DivCornersRadius) FieldKt.m17381g(this.f34806b, env, "corners_radius", data, f34800k);
        Expression<Boolean> expression2 = (Expression) FieldKt.m17378d(this.f34807c, env, "has_shadow", data, f34801l);
        if (expression2 == null) {
            expression2 = f34796g;
        }
        return new DivBorder(expression, divCornersRadius, expression2, (DivShadow) FieldKt.m17381g(this.f34808d, env, "shadow", data, f34802m), (DivStroke) FieldKt.m17381g(this.f34809e, env, "stroke", data, f34803n));
    }
}
