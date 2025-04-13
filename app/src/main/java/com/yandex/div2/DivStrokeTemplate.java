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

/* compiled from: DivStrokeTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivStrokeTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivStroke;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivStrokeTemplate implements JSONSerializable, JsonTemplate<DivStroke> {

    /* renamed from: d */
    @NotNull
    public static final Companion f39445d = new Companion(null);

    /* renamed from: e */
    @NotNull
    public static final Expression<DivSizeUnit> f39446e;

    /* renamed from: f */
    @NotNull
    public static final Expression<Long> f39447f;

    /* renamed from: g */
    @NotNull
    public static final TypeHelper<DivSizeUnit> f39448g;

    /* renamed from: h */
    @NotNull
    public static final ValueValidator<Long> f39449h;

    /* renamed from: i */
    @NotNull
    public static final ValueValidator<Long> f39450i;

    /* renamed from: j */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f39451j;

    /* renamed from: k */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivSizeUnit>> f39452k;

    /* renamed from: l */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f39453l;

    /* renamed from: m */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivStrokeTemplate> f39454m;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Integer>> f39455a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<DivSizeUnit>> f39456b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f39457c;

    /* compiled from: DivStrokeTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, m31884d2 = {"Lcom/yandex/div2/DivStrokeTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivSizeUnit;", "TYPE_HELPER_UNIT", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div/json/expressions/Expression;", "UNIT_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/ValueValidator;", "WIDTH_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "WIDTH_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f39446e = companion.m17539a(DivSizeUnit.DP);
        f39447f = companion.m17539a(1L);
        int i2 = TypeHelper.f33843a;
        f39448g = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivSizeUnit.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivStrokeTemplate$Companion$TYPE_HELPER_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivSizeUnit);
            }
        });
        f39449h = C3048h0.f41466n;
        f39450i = C3048h0.f41467o;
        f39451j = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivStrokeTemplate$Companion$COLOR_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Integer> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17317i(jSONObject2, str2, ParsingConvertersKt.f33827a, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33853f);
            }
        };
        f39452k = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivSizeUnit>>() { // from class: com.yandex.div2.DivStrokeTemplate$Companion$UNIT_READER$1
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
                Expression<DivSizeUnit> expression = DivStrokeTemplate.f39446e;
                Expression<DivSizeUnit> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivStrokeTemplate.f39448g);
                return m17330v == null ? expression : m17330v;
            }
        };
        f39453l = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivStrokeTemplate$Companion$WIDTH_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivStrokeTemplate.f39450i;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivStrokeTemplate.f39447f;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f39454m = new Function2<ParsingEnvironment, JSONObject, DivStrokeTemplate>() { // from class: com.yandex.div2.DivStrokeTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivStrokeTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivStrokeTemplate(env, null, false, it, 6);
            }
        };
    }

    public DivStrokeTemplate(ParsingEnvironment parsingEnvironment, DivStrokeTemplate divStrokeTemplate, boolean z, JSONObject jSONObject, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
        this.f39455a = JsonTemplateParser.m17349j(jSONObject, "color", z, null, ParsingConvertersKt.f33827a, f34328a, parsingEnvironment, TypeHelpersKt.f33853f);
        DivSizeUnit.Converter converter = DivSizeUnit.f38845c;
        this.f39456b = JsonTemplateParser.m17358s(jSONObject, "unit", z, null, DivSizeUnit.f38846d, f34328a, parsingEnvironment, f39448g);
        this.f39457c = JsonTemplateParser.m17357r(jSONObject, "width", z, null, ParsingConvertersKt.f33831e, f39449h, f34328a, parsingEnvironment, TypeHelpersKt.f33849b);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivStroke mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        Expression expression = (Expression) FieldKt.m17376b(this.f39455a, env, "color", data, f39451j);
        Expression<DivSizeUnit> expression2 = (Expression) FieldKt.m17378d(this.f39456b, env, "unit", data, f39452k);
        if (expression2 == null) {
            expression2 = f39446e;
        }
        Expression<Long> expression3 = (Expression) FieldKt.m17378d(this.f39457c, env, "width", data, f39453l);
        if (expression3 == null) {
            expression3 = f39447f;
        }
        return new DivStroke(expression, expression2, expression3);
    }
}
