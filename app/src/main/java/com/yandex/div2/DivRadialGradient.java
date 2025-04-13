package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivRadialGradient.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradient;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivRadialGradient implements JSONSerializable {

    /* renamed from: e */
    @NotNull
    public static final Companion f38078e = new Companion(null);

    /* renamed from: f */
    @NotNull
    public static final DivRadialGradientCenter.Relative f38079f;

    /* renamed from: g */
    @NotNull
    public static final DivRadialGradientCenter.Relative f38080g;

    /* renamed from: h */
    @NotNull
    public static final DivRadialGradientRadius.Relative f38081h;

    /* renamed from: i */
    @NotNull
    public static final ListValidator<Integer> f38082i;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final DivRadialGradientCenter f38083a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final DivRadialGradientCenter f38084b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final ExpressionList<Integer> f38085c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final DivRadialGradientRadius f38086d;

    /* compiled from: DivRadialGradient.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradient$Companion;", "", "Lcom/yandex/div2/DivRadialGradientCenter$Relative;", "CENTER_X_DEFAULT_VALUE", "Lcom/yandex/div2/DivRadialGradientCenter$Relative;", "CENTER_Y_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/ListValidator;", "", "COLORS_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivRadialGradientRadius$Relative;", "RADIUS_DEFAULT_VALUE", "Lcom/yandex/div2/DivRadialGradientRadius$Relative;", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivRadialGradient m17671a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivRadialGradientCenter.Companion companion = DivRadialGradientCenter.f38088a;
            Function2<ParsingEnvironment, JSONObject, DivRadialGradientCenter> function2 = DivRadialGradientCenter.f38089b;
            DivRadialGradientCenter divRadialGradientCenter = (DivRadialGradientCenter) JsonParser.m17322n(jSONObject, "center_x", function2, f34328a, parsingEnvironment);
            if (divRadialGradientCenter == null) {
                divRadialGradientCenter = DivRadialGradient.f38079f;
            }
            DivRadialGradientCenter divRadialGradientCenter2 = divRadialGradientCenter;
            Intrinsics.m32178g(divRadialGradientCenter2, "JsonParser.readOptional(…?: CENTER_X_DEFAULT_VALUE");
            DivRadialGradientCenter divRadialGradientCenter3 = (DivRadialGradientCenter) JsonParser.m17322n(jSONObject, "center_y", function2, f34328a, parsingEnvironment);
            if (divRadialGradientCenter3 == null) {
                divRadialGradientCenter3 = DivRadialGradient.f38080g;
            }
            DivRadialGradientCenter divRadialGradientCenter4 = divRadialGradientCenter3;
            Intrinsics.m32178g(divRadialGradientCenter4, "JsonParser.readOptional(…?: CENTER_Y_DEFAULT_VALUE");
            ExpressionList m17319k = JsonParser.m17319k(jSONObject, "colors", ParsingConvertersKt.f33827a, DivRadialGradient.f38082i, f34328a, parsingEnvironment, TypeHelpersKt.f33853f);
            DivRadialGradientRadius.Companion companion2 = DivRadialGradientRadius.f38116a;
            DivRadialGradientRadius divRadialGradientRadius = (DivRadialGradientRadius) JsonParser.m17322n(jSONObject, "radius", DivRadialGradientRadius.f38117b, f34328a, parsingEnvironment);
            if (divRadialGradientRadius == null) {
                divRadialGradientRadius = DivRadialGradient.f38081h;
            }
            Intrinsics.m32178g(divRadialGradientRadius, "JsonParser.readOptional(…) ?: RADIUS_DEFAULT_VALUE");
            return new DivRadialGradient(divRadialGradientCenter2, divRadialGradientCenter4, m17319k, divRadialGradientRadius);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        Double valueOf = Double.valueOf(0.5d);
        f38079f = new DivRadialGradientCenter.Relative(new DivRadialGradientRelativeCenter(companion.m17539a(valueOf)));
        f38080g = new DivRadialGradientCenter.Relative(new DivRadialGradientRelativeCenter(companion.m17539a(valueOf)));
        f38081h = new DivRadialGradientRadius.Relative(new DivRadialGradientRelativeRadius(companion.m17539a(DivRadialGradientRelativeRadius.Value.FARTHEST_CORNER)));
        f38082i = C3077z.f42203e;
        DivRadialGradient$Companion$CREATOR$1 divRadialGradient$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivRadialGradient>() { // from class: com.yandex.div2.DivRadialGradient$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivRadialGradient invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivRadialGradient.f38078e.m17671a(env, it);
            }
        };
    }

    @DivModelInternalApi
    public DivRadialGradient(@NotNull DivRadialGradientCenter centerX, @NotNull DivRadialGradientCenter centerY, @NotNull ExpressionList<Integer> colors, @NotNull DivRadialGradientRadius radius) {
        Intrinsics.m32179h(centerX, "centerX");
        Intrinsics.m32179h(centerY, "centerY");
        Intrinsics.m32179h(colors, "colors");
        Intrinsics.m32179h(radius, "radius");
        this.f38083a = centerX;
        this.f38084b = centerY;
        this.f38085c = colors;
        this.f38086d = radius;
    }
}
