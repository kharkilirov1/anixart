package com.yandex.div2;

import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
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

/* compiled from: DivDimensionTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivDimensionTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivDimension;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivDimensionTemplate implements JSONSerializable, JsonTemplate<DivDimension> {

    /* renamed from: c */
    @NotNull
    public static final Companion f35525c = new Companion(null);

    /* renamed from: d */
    @NotNull
    public static final Expression<DivSizeUnit> f35526d = Expression.f34334a.m17539a(DivSizeUnit.DP);

    /* renamed from: e */
    @NotNull
    public static final TypeHelper<DivSizeUnit> f35527e;

    /* renamed from: f */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivSizeUnit>> f35528f;

    /* renamed from: g */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f35529g;

    /* renamed from: h */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivDimensionTemplate> f35530h;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<DivSizeUnit>> f35531a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f35532b;

    /* compiled from: DivDimensionTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div2/DivDimensionTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivSizeUnit;", "TYPE_HELPER_UNIT", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div/json/expressions/Expression;", "UNIT_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        int i2 = TypeHelper.f33843a;
        f35527e = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivSizeUnit.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivDimensionTemplate$Companion$TYPE_HELPER_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivSizeUnit);
            }
        });
        f35528f = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivSizeUnit>>() { // from class: com.yandex.div2.DivDimensionTemplate$Companion$UNIT_READER$1
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
                Expression<DivSizeUnit> expression = DivDimensionTemplate.f35526d;
                Expression<DivSizeUnit> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivDimensionTemplate.f35527e);
                return m17330v == null ? expression : m17330v;
            }
        };
        f35529g = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivDimensionTemplate$Companion$VALUE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17317i(jSONObject2, str2, ParsingConvertersKt.f33830d, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33851d);
            }
        };
        f35530h = new Function2<ParsingEnvironment, JSONObject, DivDimensionTemplate>() { // from class: com.yandex.div2.DivDimensionTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivDimensionTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivDimensionTemplate(env, null, false, it, 6);
            }
        };
    }

    public DivDimensionTemplate(ParsingEnvironment parsingEnvironment, DivDimensionTemplate divDimensionTemplate, boolean z, JSONObject jSONObject, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
        DivSizeUnit.Converter converter = DivSizeUnit.f38845c;
        this.f35531a = JsonTemplateParser.m17358s(jSONObject, "unit", z, null, DivSizeUnit.f38846d, f34328a, parsingEnvironment, f35527e);
        this.f35532b = JsonTemplateParser.m17349j(jSONObject, "value", z, null, ParsingConvertersKt.f33830d, f34328a, parsingEnvironment, TypeHelpersKt.f33851d);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivDimension mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        Expression<DivSizeUnit> expression = (Expression) FieldKt.m17378d(this.f35531a, env, "unit", data, f35528f);
        if (expression == null) {
            expression = f35526d;
        }
        return new DivDimension(expression, (Expression) FieldKt.m17376b(this.f35532b, env, "value", data, f35529g));
    }
}
