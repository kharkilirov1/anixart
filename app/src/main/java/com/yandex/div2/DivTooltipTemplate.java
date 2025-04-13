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
import com.yandex.div2.Div;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivAnimationTemplate;
import com.yandex.div2.DivPoint;
import com.yandex.div2.DivPointTemplate;
import com.yandex.div2.DivTemplate;
import com.yandex.div2.DivTooltip;
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

/* compiled from: DivTooltipTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivTooltipTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivTooltip;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivTooltipTemplate implements JSONSerializable, JsonTemplate<DivTooltip> {

    /* renamed from: h */
    @NotNull
    public static final Companion f40520h = new Companion(null);

    /* renamed from: i */
    @NotNull
    public static final Expression<Long> f40521i = Expression.f34334a.m17539a(5000L);

    /* renamed from: j */
    @NotNull
    public static final TypeHelper<DivTooltip.Position> f40522j;

    /* renamed from: k */
    @NotNull
    public static final ValueValidator<Long> f40523k;

    /* renamed from: l */
    @NotNull
    public static final ValueValidator<Long> f40524l;

    /* renamed from: m */
    @NotNull
    public static final ValueValidator<String> f40525m;

    /* renamed from: n */
    @NotNull
    public static final ValueValidator<String> f40526n;

    /* renamed from: o */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAnimation> f40527o;

    /* renamed from: p */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAnimation> f40528p;

    /* renamed from: q */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Div> f40529q;

    /* renamed from: r */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f40530r;

    /* renamed from: s */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f40531s;

    /* renamed from: t */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivPoint> f40532t;

    /* renamed from: u */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivTooltip.Position>> f40533u;

    /* renamed from: v */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivTooltipTemplate> f40534v;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivAnimationTemplate> f40535a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<DivAnimationTemplate> f40536b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<DivTemplate> f40537c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f40538d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<String> f40539e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<DivPointTemplate> f40540f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Field<Expression<DivTooltip.Position>> f40541g;

    /* compiled from: DivTooltipTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31884d2 = {"Lcom/yandex/div2/DivTooltipTemplate$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "DURATION_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "DURATION_VALIDATOR", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivTooltip$Position;", "TYPE_HELPER_POSITION", "Lcom/yandex/div/internal/parser/TypeHelper;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        int i2 = TypeHelper.f33843a;
        f40522j = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivTooltip.Position.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTooltipTemplate$Companion$TYPE_HELPER_POSITION$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivTooltip.Position);
            }
        });
        f40523k = C3060n0.f41787x;
        f40524l = C3060n0.f41788y;
        f40525m = C3060n0.f41789z;
        f40526n = C3064p0.f41878c;
        f40527o = new Function3<String, JSONObject, ParsingEnvironment, DivAnimation>() { // from class: com.yandex.div2.DivTooltipTemplate$Companion$ANIMATION_IN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAnimation mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAnimation.Companion companion = DivAnimation.f34634h;
                return (DivAnimation) JsonParser.m17322n(jSONObject2, str2, DivAnimation.f34644r, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40528p = new Function3<String, JSONObject, ParsingEnvironment, DivAnimation>() { // from class: com.yandex.div2.DivTooltipTemplate$Companion$ANIMATION_OUT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAnimation mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAnimation.Companion companion = DivAnimation.f34634h;
                return (DivAnimation) JsonParser.m17322n(jSONObject2, str2, DivAnimation.f34644r, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40529q = new Function3<String, JSONObject, ParsingEnvironment, Div>() { // from class: com.yandex.div2.DivTooltipTemplate$Companion$DIV_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Div mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Div.Companion companion = Div.f34418a;
                Function2<ParsingEnvironment, JSONObject, Div> function2 = Div.f34419b;
                parsingEnvironment2.getF34328a();
                return (Div) JsonParser.m17313e(jSONObject2, str2, function2, C2904b.f33858e, parsingEnvironment2);
            }
        };
        f40530r = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivTooltipTemplate$Companion$DURATION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivTooltipTemplate.f40524l;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivTooltipTemplate.f40521i;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f40531s = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivTooltipTemplate$Companion$ID_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17311c(jSONObject2, str2, DivTooltipTemplate.f40526n, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40532t = new Function3<String, JSONObject, ParsingEnvironment, DivPoint>() { // from class: com.yandex.div2.DivTooltipTemplate$Companion$OFFSET_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivPoint mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivPoint.Companion companion = DivPoint.f38064c;
                return (DivPoint) JsonParser.m17322n(jSONObject2, str2, DivPoint.f38065d, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40533u = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivTooltip.Position>>() { // from class: com.yandex.div2.DivTooltipTemplate$Companion$POSITION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivTooltip.Position> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTooltip.Position.Converter converter = DivTooltip.Position.f40507c;
                return JsonParser.m17317i(jSONObject2, str2, DivTooltip.Position.f40508d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivTooltipTemplate.f40522j);
            }
        };
        f40534v = new Function2<ParsingEnvironment, JSONObject, DivTooltipTemplate>() { // from class: com.yandex.div2.DivTooltipTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivTooltipTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivTooltipTemplate(env, null, false, it, 6);
            }
        };
    }

    public DivTooltipTemplate(ParsingEnvironment parsingEnvironment, DivTooltipTemplate divTooltipTemplate, boolean z, JSONObject jSONObject, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
        DivAnimationTemplate.Companion companion = DivAnimationTemplate.f34681i;
        Function2<ParsingEnvironment, JSONObject, DivAnimationTemplate> function2 = DivAnimationTemplate.f34680D;
        this.f40535a = JsonTemplateParser.m17354o(jSONObject, "animation_in", z, null, function2, f34328a, parsingEnvironment);
        this.f40536b = JsonTemplateParser.m17354o(jSONObject, "animation_out", z, null, function2, f34328a, parsingEnvironment);
        DivTemplate.Companion companion2 = DivTemplate.f39864a;
        this.f40537c = JsonTemplateParser.m17345f(jSONObject, "div", z, null, DivTemplate.f39865b, f34328a, parsingEnvironment);
        this.f40538d = JsonTemplateParser.m17357r(jSONObject, "duration", z, null, ParsingConvertersKt.f33831e, f40523k, f34328a, parsingEnvironment, TypeHelpersKt.f33849b);
        this.f40539e = JsonTemplateParser.m17341b(jSONObject, "id", z, null, f40525m, f34328a, parsingEnvironment);
        DivPointTemplate.Companion companion3 = DivPointTemplate.f38069c;
        this.f40540f = JsonTemplateParser.m17354o(jSONObject, "offset", z, null, DivPointTemplate.f38072f, f34328a, parsingEnvironment);
        DivTooltip.Position.Converter converter = DivTooltip.Position.f40507c;
        this.f40541g = JsonTemplateParser.m17349j(jSONObject, "position", z, null, DivTooltip.Position.f40508d, f34328a, parsingEnvironment, f40522j);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivTooltip mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        DivAnimation divAnimation = (DivAnimation) FieldKt.m17381g(this.f40535a, env, "animation_in", data, f40527o);
        DivAnimation divAnimation2 = (DivAnimation) FieldKt.m17381g(this.f40536b, env, "animation_out", data, f40528p);
        Div div = (Div) FieldKt.m17383i(this.f40537c, env, "div", data, f40529q);
        Expression<Long> expression = (Expression) FieldKt.m17378d(this.f40538d, env, "duration", data, f40530r);
        if (expression == null) {
            expression = f40521i;
        }
        return new DivTooltip(divAnimation, divAnimation2, div, expression, (String) FieldKt.m17376b(this.f40539e, env, "id", data, f40531s), (DivPoint) FieldKt.m17381g(this.f40540f, env, "offset", data, f40532t), (Expression) FieldKt.m17376b(this.f40541g, env, "position", data, f40533u));
    }
}
