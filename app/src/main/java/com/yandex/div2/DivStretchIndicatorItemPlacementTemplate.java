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
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivFixedSizeTemplate;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivStretchIndicatorItemPlacementTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivStretchIndicatorItemPlacementTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivStretchIndicatorItemPlacement;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivStretchIndicatorItemPlacementTemplate implements JSONSerializable, JsonTemplate<DivStretchIndicatorItemPlacement> {

    /* renamed from: c */
    @NotNull
    public static final DivFixedSize f39422c;

    /* renamed from: d */
    @NotNull
    public static final Expression<Long> f39423d;

    /* renamed from: e */
    @NotNull
    public static final ValueValidator<Long> f39424e;

    /* renamed from: f */
    @NotNull
    public static final ValueValidator<Long> f39425f;

    /* renamed from: g */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFixedSize> f39426g;

    /* renamed from: h */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f39427h;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivFixedSizeTemplate> f39428a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f39429b;

    /* compiled from: DivStretchIndicatorItemPlacementTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31884d2 = {"Lcom/yandex/div2/DivStretchIndicatorItemPlacementTemplate$Companion;", "", "Lcom/yandex/div2/DivFixedSize;", "ITEM_SPACING_DEFAULT_VALUE", "Lcom/yandex/div2/DivFixedSize;", "Lcom/yandex/div/json/expressions/Expression;", "", "MAX_VISIBLE_ITEMS_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "MAX_VISIBLE_ITEMS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "MAX_VISIBLE_ITEMS_VALIDATOR", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f39422c = new DivFixedSize(null, companion.m17539a(5L), 1);
        f39423d = companion.m17539a(10L);
        f39424e = C3048h0.f41463k;
        f39425f = C3048h0.f41464l;
        f39426g = new Function3<String, JSONObject, ParsingEnvironment, DivFixedSize>() { // from class: com.yandex.div2.DivStretchIndicatorItemPlacementTemplate$Companion$ITEM_SPACING_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivFixedSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivFixedSize.Companion companion2 = DivFixedSize.f35789c;
                DivFixedSize divFixedSize = (DivFixedSize) JsonParser.m17322n(jSONObject2, str2, DivFixedSize.f35793g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divFixedSize == null ? DivStretchIndicatorItemPlacementTemplate.f39422c : divFixedSize;
            }
        };
        f39427h = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivStretchIndicatorItemPlacementTemplate$Companion$MAX_VISIBLE_ITEMS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivStretchIndicatorItemPlacementTemplate.f39425f;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivStretchIndicatorItemPlacementTemplate.f39423d;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        DivStretchIndicatorItemPlacementTemplate$Companion$TYPE_READER$1 divStretchIndicatorItemPlacementTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivStretchIndicatorItemPlacementTemplate$Companion$TYPE_READER$1
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
        DivStretchIndicatorItemPlacementTemplate$Companion$CREATOR$1 divStretchIndicatorItemPlacementTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivStretchIndicatorItemPlacementTemplate>() { // from class: com.yandex.div2.DivStretchIndicatorItemPlacementTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivStretchIndicatorItemPlacementTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivStretchIndicatorItemPlacementTemplate(env, null, false, it);
            }
        };
    }

    public DivStretchIndicatorItemPlacementTemplate(@NotNull ParsingEnvironment env, @Nullable DivStretchIndicatorItemPlacementTemplate divStretchIndicatorItemPlacementTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<DivFixedSizeTemplate> field = divStretchIndicatorItemPlacementTemplate == null ? null : divStretchIndicatorItemPlacementTemplate.f39428a;
        DivFixedSizeTemplate.Companion companion = DivFixedSizeTemplate.f35798c;
        this.f39428a = JsonTemplateParser.m17354o(json, "item_spacing", z, field, DivFixedSizeTemplate.f35805j, f34328a, env);
        this.f39429b = JsonTemplateParser.m17357r(json, "max_visible_items", z, divStretchIndicatorItemPlacementTemplate == null ? null : divStretchIndicatorItemPlacementTemplate.f39429b, ParsingConvertersKt.f33831e, f39424e, f34328a, env, TypeHelpersKt.f33849b);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivStretchIndicatorItemPlacement mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        DivFixedSize divFixedSize = (DivFixedSize) FieldKt.m17381g(this.f39428a, env, "item_spacing", data, f39426g);
        if (divFixedSize == null) {
            divFixedSize = f39422c;
        }
        Expression<Long> expression = (Expression) FieldKt.m17378d(this.f39429b, env, "max_visible_items", data, f39427h);
        if (expression == null) {
            expression = f39423d;
        }
        return new DivStretchIndicatorItemPlacement(divFixedSize, expression);
    }
}
