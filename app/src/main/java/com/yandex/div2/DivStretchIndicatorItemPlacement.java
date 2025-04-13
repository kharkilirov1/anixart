package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivFixedSize;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivStretchIndicatorItemPlacement.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivStretchIndicatorItemPlacement;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivStretchIndicatorItemPlacement implements JSONSerializable {

    /* renamed from: c */
    @NotNull
    public static final Companion f39415c = new Companion(null);

    /* renamed from: d */
    @NotNull
    public static final DivFixedSize f39416d;

    /* renamed from: e */
    @NotNull
    public static final Expression<Long> f39417e;

    /* renamed from: f */
    @NotNull
    public static final ValueValidator<Long> f39418f;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final DivFixedSize f39419a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Expression<Long> f39420b;

    /* compiled from: DivStretchIndicatorItemPlacement.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31884d2 = {"Lcom/yandex/div2/DivStretchIndicatorItemPlacement$Companion;", "", "Lcom/yandex/div2/DivFixedSize;", "ITEM_SPACING_DEFAULT_VALUE", "Lcom/yandex/div2/DivFixedSize;", "Lcom/yandex/div/json/expressions/Expression;", "", "MAX_VISIBLE_ITEMS_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "MAX_VISIBLE_ITEMS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "MAX_VISIBLE_ITEMS_VALIDATOR", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivStretchIndicatorItemPlacement m17709a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivFixedSize.Companion companion = DivFixedSize.f35789c;
            DivFixedSize divFixedSize = (DivFixedSize) JsonParser.m17322n(jSONObject, "item_spacing", DivFixedSize.f35793g, f34328a, parsingEnvironment);
            if (divFixedSize == null) {
                divFixedSize = DivStretchIndicatorItemPlacement.f39416d;
            }
            Intrinsics.m32178g(divFixedSize, "JsonParser.readOptional(…TEM_SPACING_DEFAULT_VALUE");
            Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator = DivStretchIndicatorItemPlacement.f39418f;
            Expression<Long> expression = DivStretchIndicatorItemPlacement.f39417e;
            Expression<Long> m17328t = JsonParser.m17328t(jSONObject, "max_visible_items", function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
            if (m17328t != null) {
                expression = m17328t;
            }
            return new DivStretchIndicatorItemPlacement(divFixedSize, expression);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f39416d = new DivFixedSize(null, companion.m17539a(5L), 1);
        f39417e = companion.m17539a(10L);
        f39418f = C3048h0.f41462j;
        DivStretchIndicatorItemPlacement$Companion$CREATOR$1 divStretchIndicatorItemPlacement$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivStretchIndicatorItemPlacement>() { // from class: com.yandex.div2.DivStretchIndicatorItemPlacement$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivStretchIndicatorItemPlacement invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivStretchIndicatorItemPlacement.f39415c.m17709a(env, it);
            }
        };
    }

    @DivModelInternalApi
    public DivStretchIndicatorItemPlacement(@NotNull DivFixedSize itemSpacing, @NotNull Expression<Long> maxVisibleItems) {
        Intrinsics.m32179h(itemSpacing, "itemSpacing");
        Intrinsics.m32179h(maxVisibleItems, "maxVisibleItems");
        this.f39419a = itemSpacing;
        this.f39420b = maxVisibleItems;
    }

    @DivModelInternalApi
    public DivStretchIndicatorItemPlacement() {
        this(f39416d, f39417e);
    }
}
