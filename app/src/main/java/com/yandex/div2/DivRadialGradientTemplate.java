package com.yandex.div2;

import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientCenterTemplate;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivRadialGradientRadiusTemplate;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivRadialGradientTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivRadialGradient;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivRadialGradientTemplate implements JSONSerializable, JsonTemplate<DivRadialGradient> {

    /* renamed from: e */
    @NotNull
    public static final DivRadialGradientCenter.Relative f38155e;

    /* renamed from: f */
    @NotNull
    public static final DivRadialGradientCenter.Relative f38156f;

    /* renamed from: g */
    @NotNull
    public static final DivRadialGradientRadius.Relative f38157g;

    /* renamed from: h */
    @NotNull
    public static final ListValidator<Integer> f38158h;

    /* renamed from: i */
    @NotNull
    public static final ListValidator<Integer> f38159i;

    /* renamed from: j */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivRadialGradientCenter> f38160j;

    /* renamed from: k */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivRadialGradientCenter> f38161k;

    /* renamed from: l */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, ExpressionList<Integer>> f38162l;

    /* renamed from: m */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivRadialGradientRadius> f38163m;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivRadialGradientCenterTemplate> f38164a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<DivRadialGradientCenterTemplate> f38165b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<ExpressionList<Integer>> f38166c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<DivRadialGradientRadiusTemplate> f38167d;

    /* compiled from: DivRadialGradientTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientTemplate$Companion;", "", "Lcom/yandex/div2/DivRadialGradientCenter$Relative;", "CENTER_X_DEFAULT_VALUE", "Lcom/yandex/div2/DivRadialGradientCenter$Relative;", "CENTER_Y_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/ListValidator;", "", "COLORS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "COLORS_VALIDATOR", "Lcom/yandex/div2/DivRadialGradientRadius$Relative;", "RADIUS_DEFAULT_VALUE", "Lcom/yandex/div2/DivRadialGradientRadius$Relative;", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        Double valueOf = Double.valueOf(0.5d);
        f38155e = new DivRadialGradientCenter.Relative(new DivRadialGradientRelativeCenter(companion.m17539a(valueOf)));
        f38156f = new DivRadialGradientCenter.Relative(new DivRadialGradientRelativeCenter(companion.m17539a(valueOf)));
        f38157g = new DivRadialGradientRadius.Relative(new DivRadialGradientRelativeRadius(companion.m17539a(DivRadialGradientRelativeRadius.Value.FARTHEST_CORNER)));
        f38158h = C3077z.f42204f;
        f38159i = C3077z.f42205g;
        f38160j = new Function3<String, JSONObject, ParsingEnvironment, DivRadialGradientCenter>() { // from class: com.yandex.div2.DivRadialGradientTemplate$Companion$CENTER_X_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivRadialGradientCenter mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivRadialGradientCenter.Companion companion2 = DivRadialGradientCenter.f38088a;
                DivRadialGradientCenter divRadialGradientCenter = (DivRadialGradientCenter) JsonParser.m17322n(jSONObject2, str2, DivRadialGradientCenter.f38089b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divRadialGradientCenter == null ? DivRadialGradientTemplate.f38155e : divRadialGradientCenter;
            }
        };
        f38161k = new Function3<String, JSONObject, ParsingEnvironment, DivRadialGradientCenter>() { // from class: com.yandex.div2.DivRadialGradientTemplate$Companion$CENTER_Y_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivRadialGradientCenter mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivRadialGradientCenter.Companion companion2 = DivRadialGradientCenter.f38088a;
                DivRadialGradientCenter divRadialGradientCenter = (DivRadialGradientCenter) JsonParser.m17322n(jSONObject2, str2, DivRadialGradientCenter.f38089b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divRadialGradientCenter == null ? DivRadialGradientTemplate.f38156f : divRadialGradientCenter;
            }
        };
        f38162l = new Function3<String, JSONObject, ParsingEnvironment, ExpressionList<Integer>>() { // from class: com.yandex.div2.DivRadialGradientTemplate$Companion$COLORS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public ExpressionList<Integer> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17319k(jSONObject2, str2, ParsingConvertersKt.f33827a, DivRadialGradientTemplate.f38158h, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33853f);
            }
        };
        f38163m = new Function3<String, JSONObject, ParsingEnvironment, DivRadialGradientRadius>() { // from class: com.yandex.div2.DivRadialGradientTemplate$Companion$RADIUS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivRadialGradientRadius mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivRadialGradientRadius.Companion companion2 = DivRadialGradientRadius.f38116a;
                DivRadialGradientRadius divRadialGradientRadius = (DivRadialGradientRadius) JsonParser.m17322n(jSONObject2, str2, DivRadialGradientRadius.f38117b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divRadialGradientRadius == null ? DivRadialGradientTemplate.f38157g : divRadialGradientRadius;
            }
        };
        DivRadialGradientTemplate$Companion$TYPE_READER$1 divRadialGradientTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivRadialGradientTemplate$Companion$TYPE_READER$1
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
        DivRadialGradientTemplate$Companion$CREATOR$1 divRadialGradientTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivRadialGradientTemplate>() { // from class: com.yandex.div2.DivRadialGradientTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivRadialGradientTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivRadialGradientTemplate(env, null, false, it);
            }
        };
    }

    public DivRadialGradientTemplate(@NotNull ParsingEnvironment env, @Nullable DivRadialGradientTemplate divRadialGradientTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<DivRadialGradientCenterTemplate> field = divRadialGradientTemplate == null ? null : divRadialGradientTemplate.f38164a;
        DivRadialGradientCenterTemplate.Companion companion = DivRadialGradientCenterTemplate.f38093a;
        Function2<ParsingEnvironment, JSONObject, DivRadialGradientCenterTemplate> function2 = DivRadialGradientCenterTemplate.f38094b;
        this.f38164a = JsonTemplateParser.m17354o(json, "center_x", z, field, function2, f34328a, env);
        this.f38165b = JsonTemplateParser.m17354o(json, "center_y", z, divRadialGradientTemplate == null ? null : divRadialGradientTemplate.f38165b, function2, f34328a, env);
        this.f38166c = JsonTemplateParser.m17340a(json, "colors", z, divRadialGradientTemplate == null ? null : divRadialGradientTemplate.f38166c, ParsingConvertersKt.f33827a, f38159i, f34328a, env, TypeHelpersKt.f33853f);
        Field<DivRadialGradientRadiusTemplate> field2 = divRadialGradientTemplate == null ? null : divRadialGradientTemplate.f38167d;
        DivRadialGradientRadiusTemplate.Companion companion2 = DivRadialGradientRadiusTemplate.f38121a;
        this.f38167d = JsonTemplateParser.m17354o(json, "radius", z, field2, DivRadialGradientRadiusTemplate.f38122b, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivRadialGradient mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        DivRadialGradientCenter divRadialGradientCenter = (DivRadialGradientCenter) FieldKt.m17381g(this.f38164a, env, "center_x", data, f38160j);
        if (divRadialGradientCenter == null) {
            divRadialGradientCenter = f38155e;
        }
        DivRadialGradientCenter divRadialGradientCenter2 = (DivRadialGradientCenter) FieldKt.m17381g(this.f38165b, env, "center_y", data, f38161k);
        if (divRadialGradientCenter2 == null) {
            divRadialGradientCenter2 = f38156f;
        }
        ExpressionList m17377c = FieldKt.m17377c(this.f38166c, env, "colors", data, f38162l);
        DivRadialGradientRadius divRadialGradientRadius = (DivRadialGradientRadius) FieldKt.m17381g(this.f38167d, env, "radius", data, f38163m);
        if (divRadialGradientRadius == null) {
            divRadialGradientRadius = f38157g;
        }
        return new DivRadialGradient(divRadialGradientCenter, divRadialGradientCenter2, m17377c, divRadialGradientRadius);
    }
}
