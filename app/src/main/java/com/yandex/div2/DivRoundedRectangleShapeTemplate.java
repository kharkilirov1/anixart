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
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivFixedSizeTemplate;
import com.yandex.div2.DivStroke;
import com.yandex.div2.DivStrokeTemplate;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivRoundedRectangleShapeTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivRoundedRectangleShapeTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivRoundedRectangleShape;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivRoundedRectangleShapeTemplate implements JSONSerializable, JsonTemplate<DivRoundedRectangleShape> {

    /* renamed from: f */
    @NotNull
    public static final Companion f38185f = new Companion(null);

    /* renamed from: g */
    @NotNull
    public static final DivFixedSize f38186g;

    /* renamed from: h */
    @NotNull
    public static final DivFixedSize f38187h;

    /* renamed from: i */
    @NotNull
    public static final DivFixedSize f38188i;

    /* renamed from: j */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f38189j;

    /* renamed from: k */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFixedSize> f38190k;

    /* renamed from: l */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFixedSize> f38191l;

    /* renamed from: m */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFixedSize> f38192m;

    /* renamed from: n */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivStroke> f38193n;

    /* renamed from: o */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivRoundedRectangleShapeTemplate> f38194o;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Integer>> f38195a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<DivFixedSizeTemplate> f38196b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<DivFixedSizeTemplate> f38197c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<DivFixedSizeTemplate> f38198d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<DivStrokeTemplate> f38199e;

    /* compiled from: DivRoundedRectangleShapeTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, m31884d2 = {"Lcom/yandex/div2/DivRoundedRectangleShapeTemplate$Companion;", "", "Lcom/yandex/div2/DivFixedSize;", "CORNER_RADIUS_DEFAULT_VALUE", "Lcom/yandex/div2/DivFixedSize;", "ITEM_HEIGHT_DEFAULT_VALUE", "ITEM_WIDTH_DEFAULT_VALUE", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f38186g = new DivFixedSize(null, companion.m17539a(5L), 1);
        f38187h = new DivFixedSize(null, companion.m17539a(10L), 1);
        f38188i = new DivFixedSize(null, companion.m17539a(10L), 1);
        f38189j = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivRoundedRectangleShapeTemplate$Companion$BACKGROUND_COLOR_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Integer> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17329u(jSONObject2, str2, ParsingConvertersKt.f33827a, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33853f);
            }
        };
        f38190k = new Function3<String, JSONObject, ParsingEnvironment, DivFixedSize>() { // from class: com.yandex.div2.DivRoundedRectangleShapeTemplate$Companion$CORNER_RADIUS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivFixedSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivFixedSize.Companion companion2 = DivFixedSize.f35789c;
                DivFixedSize divFixedSize = (DivFixedSize) JsonParser.m17322n(jSONObject2, str2, DivFixedSize.f35793g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divFixedSize == null ? DivRoundedRectangleShapeTemplate.f38186g : divFixedSize;
            }
        };
        f38191l = new Function3<String, JSONObject, ParsingEnvironment, DivFixedSize>() { // from class: com.yandex.div2.DivRoundedRectangleShapeTemplate$Companion$ITEM_HEIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivFixedSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivFixedSize.Companion companion2 = DivFixedSize.f35789c;
                DivFixedSize divFixedSize = (DivFixedSize) JsonParser.m17322n(jSONObject2, str2, DivFixedSize.f35793g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divFixedSize == null ? DivRoundedRectangleShapeTemplate.f38187h : divFixedSize;
            }
        };
        f38192m = new Function3<String, JSONObject, ParsingEnvironment, DivFixedSize>() { // from class: com.yandex.div2.DivRoundedRectangleShapeTemplate$Companion$ITEM_WIDTH_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivFixedSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivFixedSize.Companion companion2 = DivFixedSize.f35789c;
                DivFixedSize divFixedSize = (DivFixedSize) JsonParser.m17322n(jSONObject2, str2, DivFixedSize.f35793g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divFixedSize == null ? DivRoundedRectangleShapeTemplate.f38188i : divFixedSize;
            }
        };
        f38193n = new Function3<String, JSONObject, ParsingEnvironment, DivStroke>() { // from class: com.yandex.div2.DivRoundedRectangleShapeTemplate$Companion$STROKE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivStroke mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivStroke.Companion companion2 = DivStroke.f39434d;
                return (DivStroke) JsonParser.m17322n(jSONObject2, str2, DivStroke.f39439i, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        DivRoundedRectangleShapeTemplate$Companion$TYPE_READER$1 divRoundedRectangleShapeTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivRoundedRectangleShapeTemplate$Companion$TYPE_READER$1
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
        f38194o = new Function2<ParsingEnvironment, JSONObject, DivRoundedRectangleShapeTemplate>() { // from class: com.yandex.div2.DivRoundedRectangleShapeTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivRoundedRectangleShapeTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivRoundedRectangleShapeTemplate(env, null, false, it);
            }
        };
    }

    public DivRoundedRectangleShapeTemplate(@NotNull ParsingEnvironment env, @Nullable DivRoundedRectangleShapeTemplate divRoundedRectangleShapeTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        this.f38195a = JsonTemplateParser.m17358s(json, "background_color", z, divRoundedRectangleShapeTemplate == null ? null : divRoundedRectangleShapeTemplate.f38195a, ParsingConvertersKt.f33827a, f34328a, env, TypeHelpersKt.f33853f);
        Field<DivFixedSizeTemplate> field = divRoundedRectangleShapeTemplate == null ? null : divRoundedRectangleShapeTemplate.f38196b;
        DivFixedSizeTemplate.Companion companion = DivFixedSizeTemplate.f35798c;
        Function2<ParsingEnvironment, JSONObject, DivFixedSizeTemplate> function2 = DivFixedSizeTemplate.f35805j;
        this.f38196b = JsonTemplateParser.m17354o(json, "corner_radius", z, field, function2, f34328a, env);
        this.f38197c = JsonTemplateParser.m17354o(json, "item_height", z, divRoundedRectangleShapeTemplate == null ? null : divRoundedRectangleShapeTemplate.f38197c, function2, f34328a, env);
        this.f38198d = JsonTemplateParser.m17354o(json, "item_width", z, divRoundedRectangleShapeTemplate == null ? null : divRoundedRectangleShapeTemplate.f38198d, function2, f34328a, env);
        Field<DivStrokeTemplate> field2 = divRoundedRectangleShapeTemplate == null ? null : divRoundedRectangleShapeTemplate.f38199e;
        DivStrokeTemplate.Companion companion2 = DivStrokeTemplate.f39445d;
        this.f38199e = JsonTemplateParser.m17354o(json, "stroke", z, field2, DivStrokeTemplate.f39454m, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivRoundedRectangleShape mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        Expression expression = (Expression) FieldKt.m17378d(this.f38195a, env, "background_color", data, f38189j);
        DivFixedSize divFixedSize = (DivFixedSize) FieldKt.m17381g(this.f38196b, env, "corner_radius", data, f38190k);
        if (divFixedSize == null) {
            divFixedSize = f38186g;
        }
        DivFixedSize divFixedSize2 = divFixedSize;
        DivFixedSize divFixedSize3 = (DivFixedSize) FieldKt.m17381g(this.f38197c, env, "item_height", data, f38191l);
        if (divFixedSize3 == null) {
            divFixedSize3 = f38187h;
        }
        DivFixedSize divFixedSize4 = divFixedSize3;
        DivFixedSize divFixedSize5 = (DivFixedSize) FieldKt.m17381g(this.f38198d, env, "item_width", data, f38192m);
        if (divFixedSize5 == null) {
            divFixedSize5 = f38188i;
        }
        return new DivRoundedRectangleShape(expression, divFixedSize2, divFixedSize4, divFixedSize5, (DivStroke) FieldKt.m17381g(this.f38199e, env, "stroke", data, f38193n));
    }
}
