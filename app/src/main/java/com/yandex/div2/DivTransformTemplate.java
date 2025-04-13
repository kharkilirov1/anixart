package com.yandex.div2;

import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivPivot;
import com.yandex.div2.DivPivotTemplate;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTransformTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivTransformTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivTransform;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivTransformTemplate implements JSONSerializable, JsonTemplate<DivTransform> {

    /* renamed from: d */
    @NotNull
    public static final Companion f40559d = new Companion(null);

    /* renamed from: e */
    @NotNull
    public static final DivPivot.Percentage f40560e;

    /* renamed from: f */
    @NotNull
    public static final DivPivot.Percentage f40561f;

    /* renamed from: g */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivPivot> f40562g;

    /* renamed from: h */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivPivot> f40563h;

    /* renamed from: i */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f40564i;

    /* renamed from: j */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivTransformTemplate> f40565j;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivPivotTemplate> f40566a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<DivPivotTemplate> f40567b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f40568c;

    /* compiled from: DivTransformTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivTransformTemplate$Companion;", "", "Lcom/yandex/div2/DivPivot$Percentage;", "PIVOT_X_DEFAULT_VALUE", "Lcom/yandex/div2/DivPivot$Percentage;", "PIVOT_Y_DEFAULT_VALUE", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        Double valueOf = Double.valueOf(50.0d);
        f40560e = new DivPivot.Percentage(new DivPivotPercentage(companion.m17539a(valueOf)));
        f40561f = new DivPivot.Percentage(new DivPivotPercentage(companion.m17539a(valueOf)));
        f40562g = new Function3<String, JSONObject, ParsingEnvironment, DivPivot>() { // from class: com.yandex.div2.DivTransformTemplate$Companion$PIVOT_X_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivPivot mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivPivot.Companion companion2 = DivPivot.f38028a;
                DivPivot divPivot = (DivPivot) JsonParser.m17322n(jSONObject2, str2, DivPivot.f38029b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divPivot == null ? DivTransformTemplate.f40560e : divPivot;
            }
        };
        f40563h = new Function3<String, JSONObject, ParsingEnvironment, DivPivot>() { // from class: com.yandex.div2.DivTransformTemplate$Companion$PIVOT_Y_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivPivot mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivPivot.Companion companion2 = DivPivot.f38028a;
                DivPivot divPivot = (DivPivot) JsonParser.m17322n(jSONObject2, str2, DivPivot.f38029b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divPivot == null ? DivTransformTemplate.f40561f : divPivot;
            }
        };
        f40564i = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivTransformTemplate$Companion$ROTATION_READER$1
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
        f40565j = new Function2<ParsingEnvironment, JSONObject, DivTransformTemplate>() { // from class: com.yandex.div2.DivTransformTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivTransformTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivTransformTemplate(env, null, false, it, 6);
            }
        };
    }

    public DivTransformTemplate(ParsingEnvironment parsingEnvironment, DivTransformTemplate divTransformTemplate, boolean z, JSONObject jSONObject, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
        DivPivotTemplate.Companion companion = DivPivotTemplate.f38059a;
        Function2<ParsingEnvironment, JSONObject, DivPivotTemplate> function2 = DivPivotTemplate.f38060b;
        this.f40566a = JsonTemplateParser.m17354o(jSONObject, "pivot_x", z, null, function2, f34328a, parsingEnvironment);
        this.f40567b = JsonTemplateParser.m17354o(jSONObject, "pivot_y", z, null, function2, f34328a, parsingEnvironment);
        this.f40568c = JsonTemplateParser.m17358s(jSONObject, "rotation", z, null, ParsingConvertersKt.f33830d, f34328a, parsingEnvironment, TypeHelpersKt.f33851d);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivTransform mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        DivPivot divPivot = (DivPivot) FieldKt.m17381g(this.f40566a, env, "pivot_x", data, f40562g);
        if (divPivot == null) {
            divPivot = f40560e;
        }
        DivPivot divPivot2 = (DivPivot) FieldKt.m17381g(this.f40567b, env, "pivot_y", data, f40563h);
        if (divPivot2 == null) {
            divPivot2 = f40561f;
        }
        return new DivTransform(divPivot, divPivot2, (Expression) FieldKt.m17378d(this.f40568c, env, "rotation", data, f40564i));
    }
}
