package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivStroke;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivRoundedRectangleShape.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivRoundedRectangleShape;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivRoundedRectangleShape implements JSONSerializable {

    /* renamed from: f */
    @NotNull
    public static final Companion f38174f = new Companion(null);

    /* renamed from: g */
    @NotNull
    public static final DivFixedSize f38175g;

    /* renamed from: h */
    @NotNull
    public static final DivFixedSize f38176h;

    /* renamed from: i */
    @NotNull
    public static final DivFixedSize f38177i;

    /* renamed from: j */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivRoundedRectangleShape> f38178j;

    /* renamed from: a */
    @JvmField
    @Nullable
    public final Expression<Integer> f38179a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final DivFixedSize f38180b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final DivFixedSize f38181c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final DivFixedSize f38182d;

    /* renamed from: e */
    @JvmField
    @Nullable
    public final DivStroke f38183e;

    /* compiled from: DivRoundedRectangleShape.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, m31884d2 = {"Lcom/yandex/div2/DivRoundedRectangleShape$Companion;", "", "Lcom/yandex/div2/DivFixedSize;", "CORNER_RADIUS_DEFAULT_VALUE", "Lcom/yandex/div2/DivFixedSize;", "ITEM_HEIGHT_DEFAULT_VALUE", "ITEM_WIDTH_DEFAULT_VALUE", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivRoundedRectangleShape m17685a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            Expression m17329u = JsonParser.m17329u(jSONObject, "background_color", ParsingConvertersKt.f33827a, f34328a, parsingEnvironment, TypeHelpersKt.f33853f);
            DivFixedSize.Companion companion = DivFixedSize.f35789c;
            Function2<ParsingEnvironment, JSONObject, DivFixedSize> function2 = DivFixedSize.f35793g;
            DivFixedSize divFixedSize = (DivFixedSize) JsonParser.m17322n(jSONObject, "corner_radius", function2, f34328a, parsingEnvironment);
            if (divFixedSize == null) {
                divFixedSize = DivRoundedRectangleShape.f38175g;
            }
            Intrinsics.m32178g(divFixedSize, "JsonParser.readOptional(…RNER_RADIUS_DEFAULT_VALUE");
            DivFixedSize divFixedSize2 = (DivFixedSize) JsonParser.m17322n(jSONObject, "item_height", function2, f34328a, parsingEnvironment);
            if (divFixedSize2 == null) {
                divFixedSize2 = DivRoundedRectangleShape.f38176h;
            }
            Intrinsics.m32178g(divFixedSize2, "JsonParser.readOptional(…ITEM_HEIGHT_DEFAULT_VALUE");
            DivFixedSize divFixedSize3 = (DivFixedSize) JsonParser.m17322n(jSONObject, "item_width", function2, f34328a, parsingEnvironment);
            if (divFixedSize3 == null) {
                divFixedSize3 = DivRoundedRectangleShape.f38177i;
            }
            DivFixedSize divFixedSize4 = divFixedSize3;
            Intrinsics.m32178g(divFixedSize4, "JsonParser.readOptional(… ITEM_WIDTH_DEFAULT_VALUE");
            DivStroke.Companion companion2 = DivStroke.f39434d;
            return new DivRoundedRectangleShape(m17329u, divFixedSize, divFixedSize2, divFixedSize4, (DivStroke) JsonParser.m17322n(jSONObject, "stroke", DivStroke.f39439i, f34328a, parsingEnvironment));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f38175g = new DivFixedSize(null, companion.m17539a(5L), 1);
        f38176h = new DivFixedSize(null, companion.m17539a(10L), 1);
        f38177i = new DivFixedSize(null, companion.m17539a(10L), 1);
        f38178j = new Function2<ParsingEnvironment, JSONObject, DivRoundedRectangleShape>() { // from class: com.yandex.div2.DivRoundedRectangleShape$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivRoundedRectangleShape invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivRoundedRectangleShape.f38174f.m17685a(env, it);
            }
        };
    }

    @DivModelInternalApi
    public DivRoundedRectangleShape() {
        this(null, null, null, null, null, 31);
    }

    @DivModelInternalApi
    public DivRoundedRectangleShape(@Nullable Expression<Integer> expression, @NotNull DivFixedSize cornerRadius, @NotNull DivFixedSize itemHeight, @NotNull DivFixedSize itemWidth, @Nullable DivStroke divStroke) {
        Intrinsics.m32179h(cornerRadius, "cornerRadius");
        Intrinsics.m32179h(itemHeight, "itemHeight");
        Intrinsics.m32179h(itemWidth, "itemWidth");
        this.f38179a = expression;
        this.f38180b = cornerRadius;
        this.f38181c = itemHeight;
        this.f38182d = itemWidth;
        this.f38183e = divStroke;
    }

    public /* synthetic */ DivRoundedRectangleShape(Expression expression, DivFixedSize divFixedSize, DivFixedSize divFixedSize2, DivFixedSize divFixedSize3, DivStroke divStroke, int i2) {
        this(null, (i2 & 2) != 0 ? f38175g : null, (i2 & 4) != 0 ? f38176h : null, (i2 & 8) != 0 ? f38177i : null, null);
    }
}
