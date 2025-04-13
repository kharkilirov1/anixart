package com.yandex.div2;

import com.yandex.div.internal.C2900a;
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
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivAbsoluteEdgeInsetsTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivAbsoluteEdgeInsetsTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivAbsoluteEdgeInsets;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivAbsoluteEdgeInsetsTemplate implements JSONSerializable, JsonTemplate<DivAbsoluteEdgeInsets> {

    /* renamed from: e */
    @NotNull
    public static final Companion f34452e = new Companion(null);

    /* renamed from: f */
    @NotNull
    public static final Expression<Long> f34453f;

    /* renamed from: g */
    @NotNull
    public static final Expression<Long> f34454g;

    /* renamed from: h */
    @NotNull
    public static final Expression<Long> f34455h;

    /* renamed from: i */
    @NotNull
    public static final Expression<Long> f34456i;

    /* renamed from: j */
    @NotNull
    public static final ValueValidator<Long> f34457j;

    /* renamed from: k */
    @NotNull
    public static final ValueValidator<Long> f34458k;

    /* renamed from: l */
    @NotNull
    public static final ValueValidator<Long> f34459l;

    /* renamed from: m */
    @NotNull
    public static final ValueValidator<Long> f34460m;

    /* renamed from: n */
    @NotNull
    public static final ValueValidator<Long> f34461n;

    /* renamed from: o */
    @NotNull
    public static final ValueValidator<Long> f34462o;

    /* renamed from: p */
    @NotNull
    public static final ValueValidator<Long> f34463p;

    /* renamed from: q */
    @NotNull
    public static final ValueValidator<Long> f34464q;

    /* renamed from: r */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f34465r;

    /* renamed from: s */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f34466s;

    /* renamed from: t */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f34467t;

    /* renamed from: u */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f34468u;

    /* renamed from: v */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivAbsoluteEdgeInsetsTemplate> f34469v;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f34470a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f34471b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f34472c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f34473d;

    /* compiled from: DivAbsoluteEdgeInsetsTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\b¨\u0006\u0013"}, m31884d2 = {"Lcom/yandex/div2/DivAbsoluteEdgeInsetsTemplate$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "BOTTOM_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "BOTTOM_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "BOTTOM_VALIDATOR", "LEFT_DEFAULT_VALUE", "LEFT_TEMPLATE_VALIDATOR", "LEFT_VALIDATOR", "RIGHT_DEFAULT_VALUE", "RIGHT_TEMPLATE_VALIDATOR", "RIGHT_VALIDATOR", "TOP_DEFAULT_VALUE", "TOP_TEMPLATE_VALIDATOR", "TOP_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f34453f = companion.m17539a(0L);
        f34454g = companion.m17539a(0L);
        f34455h = companion.m17539a(0L);
        f34456i = companion.m17539a(0L);
        f34457j = C2900a.f33733q;
        f34458k = C2900a.f33734r;
        f34459l = C2900a.f33735s;
        f34460m = C2900a.f33736t;
        f34461n = C2900a.f33737u;
        f34462o = C2900a.f33738v;
        f34463p = C2900a.f33739w;
        f34464q = C2900a.f33740x;
        f34465r = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivAbsoluteEdgeInsetsTemplate$Companion$BOTTOM_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivAbsoluteEdgeInsetsTemplate.f34458k;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivAbsoluteEdgeInsetsTemplate.f34453f;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f34466s = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivAbsoluteEdgeInsetsTemplate$Companion$LEFT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivAbsoluteEdgeInsetsTemplate.f34460m;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivAbsoluteEdgeInsetsTemplate.f34454g;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f34467t = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivAbsoluteEdgeInsetsTemplate$Companion$RIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivAbsoluteEdgeInsetsTemplate.f34462o;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivAbsoluteEdgeInsetsTemplate.f34455h;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f34468u = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivAbsoluteEdgeInsetsTemplate$Companion$TOP_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivAbsoluteEdgeInsetsTemplate.f34464q;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivAbsoluteEdgeInsetsTemplate.f34456i;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f34469v = new Function2<ParsingEnvironment, JSONObject, DivAbsoluteEdgeInsetsTemplate>() { // from class: com.yandex.div2.DivAbsoluteEdgeInsetsTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivAbsoluteEdgeInsetsTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivAbsoluteEdgeInsetsTemplate(env, null, false, it, 6);
            }
        };
    }

    public DivAbsoluteEdgeInsetsTemplate(ParsingEnvironment parsingEnvironment, DivAbsoluteEdgeInsetsTemplate divAbsoluteEdgeInsetsTemplate, boolean z, JSONObject jSONObject, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
        Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator = f34457j;
        TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
        this.f34470a = JsonTemplateParser.m17357r(jSONObject, "bottom", z, null, function1, valueValidator, f34328a, parsingEnvironment, typeHelper);
        this.f34471b = JsonTemplateParser.m17357r(jSONObject, "left", z, null, function1, f34459l, f34328a, parsingEnvironment, typeHelper);
        this.f34472c = JsonTemplateParser.m17357r(jSONObject, "right", z, null, function1, f34461n, f34328a, parsingEnvironment, typeHelper);
        this.f34473d = JsonTemplateParser.m17357r(jSONObject, "top", z, null, function1, f34463p, f34328a, parsingEnvironment, typeHelper);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivAbsoluteEdgeInsets mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        Expression<Long> expression = (Expression) FieldKt.m17378d(this.f34470a, env, "bottom", data, f34465r);
        if (expression == null) {
            expression = f34453f;
        }
        Expression<Long> expression2 = (Expression) FieldKt.m17378d(this.f34471b, env, "left", data, f34466s);
        if (expression2 == null) {
            expression2 = f34454g;
        }
        Expression<Long> expression3 = (Expression) FieldKt.m17378d(this.f34472c, env, "right", data, f34467t);
        if (expression3 == null) {
            expression3 = f34455h;
        }
        Expression<Long> expression4 = (Expression) FieldKt.m17378d(this.f34473d, env, "top", data, f34468u);
        if (expression4 == null) {
            expression4 = f34456i;
        }
        return new DivAbsoluteEdgeInsets(expression, expression2, expression3, expression4);
    }
}
