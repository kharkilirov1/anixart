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
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivSizeUnit;
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

/* compiled from: DivEdgeInsetsTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivEdgeInsetsTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivEdgeInsets;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivEdgeInsetsTemplate implements JSONSerializable, JsonTemplate<DivEdgeInsets> {

    /* renamed from: f */
    @NotNull
    public static final Companion f35626f = new Companion(null);

    /* renamed from: g */
    @NotNull
    public static final Expression<Long> f35627g;

    /* renamed from: h */
    @NotNull
    public static final Expression<Long> f35628h;

    /* renamed from: i */
    @NotNull
    public static final Expression<Long> f35629i;

    /* renamed from: j */
    @NotNull
    public static final Expression<Long> f35630j;

    /* renamed from: k */
    @NotNull
    public static final Expression<DivSizeUnit> f35631k;

    /* renamed from: l */
    @NotNull
    public static final TypeHelper<DivSizeUnit> f35632l;

    /* renamed from: m */
    @NotNull
    public static final ValueValidator<Long> f35633m;

    /* renamed from: n */
    @NotNull
    public static final ValueValidator<Long> f35634n;

    /* renamed from: o */
    @NotNull
    public static final ValueValidator<Long> f35635o;

    /* renamed from: p */
    @NotNull
    public static final ValueValidator<Long> f35636p;

    /* renamed from: q */
    @NotNull
    public static final ValueValidator<Long> f35637q;

    /* renamed from: r */
    @NotNull
    public static final ValueValidator<Long> f35638r;

    /* renamed from: s */
    @NotNull
    public static final ValueValidator<Long> f35639s;

    /* renamed from: t */
    @NotNull
    public static final ValueValidator<Long> f35640t;

    /* renamed from: u */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f35641u;

    /* renamed from: v */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f35642v;

    /* renamed from: w */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f35643w;

    /* renamed from: x */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f35644x;

    /* renamed from: y */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivSizeUnit>> f35645y;

    /* renamed from: z */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivEdgeInsetsTemplate> f35646z;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f35647a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f35648b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f35649c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f35650d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<Expression<DivSizeUnit>> f35651e;

    /* compiled from: DivEdgeInsetsTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0005¨\u0006\u0018"}, m31884d2 = {"Lcom/yandex/div2/DivEdgeInsetsTemplate$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "BOTTOM_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "BOTTOM_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "BOTTOM_VALIDATOR", "LEFT_DEFAULT_VALUE", "LEFT_TEMPLATE_VALIDATOR", "LEFT_VALIDATOR", "RIGHT_DEFAULT_VALUE", "RIGHT_TEMPLATE_VALIDATOR", "RIGHT_VALIDATOR", "TOP_DEFAULT_VALUE", "TOP_TEMPLATE_VALIDATOR", "TOP_VALIDATOR", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivSizeUnit;", "TYPE_HELPER_UNIT", "Lcom/yandex/div/internal/parser/TypeHelper;", "UNIT_DEFAULT_VALUE", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f35627g = companion.m17539a(0L);
        f35628h = companion.m17539a(0L);
        f35629i = companion.m17539a(0L);
        f35630j = companion.m17539a(0L);
        f35631k = companion.m17539a(DivSizeUnit.DP);
        int i2 = TypeHelper.f33843a;
        f35632l = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivSizeUnit.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivEdgeInsetsTemplate$Companion$TYPE_HELPER_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivSizeUnit);
            }
        });
        f35633m = C3049i.f41483j;
        f35634n = C3049i.f41484k;
        f35635o = C3049i.f41485l;
        f35636p = C3049i.f41486m;
        f35637q = C3049i.f41487n;
        f35638r = C3049i.f41488o;
        f35639s = C3049i.f41489p;
        f35640t = C3049i.f41490q;
        f35641u = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivEdgeInsetsTemplate$Companion$BOTTOM_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivEdgeInsetsTemplate.f35634n;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivEdgeInsetsTemplate.f35627g;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f35642v = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivEdgeInsetsTemplate$Companion$LEFT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivEdgeInsetsTemplate.f35636p;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivEdgeInsetsTemplate.f35628h;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f35643w = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivEdgeInsetsTemplate$Companion$RIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivEdgeInsetsTemplate.f35638r;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivEdgeInsetsTemplate.f35629i;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f35644x = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivEdgeInsetsTemplate$Companion$TOP_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivEdgeInsetsTemplate.f35640t;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivEdgeInsetsTemplate.f35630j;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f35645y = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivSizeUnit>>() { // from class: com.yandex.div2.DivEdgeInsetsTemplate$Companion$UNIT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivSizeUnit> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSizeUnit.Converter converter = DivSizeUnit.f38845c;
                Function1<String, DivSizeUnit> function1 = DivSizeUnit.f38846d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivSizeUnit> expression = DivEdgeInsetsTemplate.f35631k;
                Expression<DivSizeUnit> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivEdgeInsetsTemplate.f35632l);
                return m17330v == null ? expression : m17330v;
            }
        };
        f35646z = new Function2<ParsingEnvironment, JSONObject, DivEdgeInsetsTemplate>() { // from class: com.yandex.div2.DivEdgeInsetsTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivEdgeInsetsTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivEdgeInsetsTemplate(env, null, false, it, 6);
            }
        };
    }

    public DivEdgeInsetsTemplate(ParsingEnvironment parsingEnvironment, DivEdgeInsetsTemplate divEdgeInsetsTemplate, boolean z, JSONObject jSONObject, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
        Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator = f35633m;
        TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
        this.f35647a = JsonTemplateParser.m17357r(jSONObject, "bottom", z, null, function1, valueValidator, f34328a, parsingEnvironment, typeHelper);
        this.f35648b = JsonTemplateParser.m17357r(jSONObject, "left", z, null, function1, f35635o, f34328a, parsingEnvironment, typeHelper);
        this.f35649c = JsonTemplateParser.m17357r(jSONObject, "right", z, null, function1, f35637q, f34328a, parsingEnvironment, typeHelper);
        this.f35650d = JsonTemplateParser.m17357r(jSONObject, "top", z, null, function1, f35639s, f34328a, parsingEnvironment, typeHelper);
        DivSizeUnit.Converter converter = DivSizeUnit.f38845c;
        this.f35651e = JsonTemplateParser.m17358s(jSONObject, "unit", z, null, DivSizeUnit.f38846d, f34328a, parsingEnvironment, f35632l);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivEdgeInsets mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        Expression<Long> expression = (Expression) FieldKt.m17378d(this.f35647a, env, "bottom", data, f35641u);
        if (expression == null) {
            expression = f35627g;
        }
        Expression<Long> expression2 = expression;
        Expression<Long> expression3 = (Expression) FieldKt.m17378d(this.f35648b, env, "left", data, f35642v);
        if (expression3 == null) {
            expression3 = f35628h;
        }
        Expression<Long> expression4 = expression3;
        Expression<Long> expression5 = (Expression) FieldKt.m17378d(this.f35649c, env, "right", data, f35643w);
        if (expression5 == null) {
            expression5 = f35629i;
        }
        Expression<Long> expression6 = expression5;
        Expression<Long> expression7 = (Expression) FieldKt.m17378d(this.f35650d, env, "top", data, f35644x);
        if (expression7 == null) {
            expression7 = f35630j;
        }
        Expression<Long> expression8 = expression7;
        Expression<DivSizeUnit> expression9 = (Expression) FieldKt.m17378d(this.f35651e, env, "unit", data, f35645y);
        if (expression9 == null) {
            expression9 = f35631k;
        }
        return new DivEdgeInsets(expression2, expression4, expression6, expression8, expression9);
    }
}
