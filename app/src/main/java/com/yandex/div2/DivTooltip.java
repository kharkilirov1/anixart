package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.Div;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivPoint;
import com.yandex.div2.DivTooltip;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivTooltip.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div2/DivTooltip;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "Position", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivTooltip implements JSONSerializable {

    /* renamed from: h */
    @NotNull
    public static final Companion f40492h = new Companion(null);

    /* renamed from: i */
    @NotNull
    public static final Expression<Long> f40493i = Expression.f34334a.m17539a(5000L);

    /* renamed from: j */
    @NotNull
    public static final TypeHelper<Position> f40494j;

    /* renamed from: k */
    @NotNull
    public static final ValueValidator<Long> f40495k;

    /* renamed from: l */
    @NotNull
    public static final ValueValidator<String> f40496l;

    /* renamed from: m */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivTooltip> f40497m;

    /* renamed from: a */
    @JvmField
    @Nullable
    public final DivAnimation f40498a;

    /* renamed from: b */
    @JvmField
    @Nullable
    public final DivAnimation f40499b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Div f40500c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Expression<Long> f40501d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final String f40502e;

    /* renamed from: f */
    @JvmField
    @Nullable
    public final DivPoint f40503f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Expression<Position> f40504g;

    /* compiled from: DivTooltip.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31884d2 = {"Lcom/yandex/div2/DivTooltip$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "DURATION_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "DURATION_VALIDATOR", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivTooltip$Position;", "TYPE_HELPER_POSITION", "Lcom/yandex/div/internal/parser/TypeHelper;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivTooltip.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m31884d2 = {"Lcom/yandex/div2/DivTooltip$Position;", "", "Converter", "LEFT", "TOP_LEFT", "TOP", "TOP_RIGHT", "RIGHT", "BOTTOM_RIGHT", "BOTTOM", "BOTTOM_LEFT", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum Position {
        LEFT("left"),
        TOP_LEFT("top-left"),
        TOP("top"),
        TOP_RIGHT("top-right"),
        RIGHT("right"),
        BOTTOM_RIGHT("bottom-right"),
        BOTTOM("bottom"),
        BOTTOM_LEFT("bottom-left");


        /* renamed from: c */
        @NotNull
        public static final Converter f40507c = new Converter(null);

        /* renamed from: d */
        @NotNull
        public static final Function1<String, Position> f40508d = new Function1<String, Position>() { // from class: com.yandex.div2.DivTooltip$Position$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            public DivTooltip.Position invoke(String str) {
                String string = str;
                Intrinsics.m32179h(string, "string");
                DivTooltip.Position position = DivTooltip.Position.LEFT;
                if (Intrinsics.m32174c(string, "left")) {
                    return position;
                }
                DivTooltip.Position position2 = DivTooltip.Position.TOP_LEFT;
                if (Intrinsics.m32174c(string, "top-left")) {
                    return position2;
                }
                DivTooltip.Position position3 = DivTooltip.Position.TOP;
                if (Intrinsics.m32174c(string, "top")) {
                    return position3;
                }
                DivTooltip.Position position4 = DivTooltip.Position.TOP_RIGHT;
                if (Intrinsics.m32174c(string, "top-right")) {
                    return position4;
                }
                DivTooltip.Position position5 = DivTooltip.Position.RIGHT;
                if (Intrinsics.m32174c(string, "right")) {
                    return position5;
                }
                DivTooltip.Position position6 = DivTooltip.Position.BOTTOM_RIGHT;
                if (Intrinsics.m32174c(string, "bottom-right")) {
                    return position6;
                }
                DivTooltip.Position position7 = DivTooltip.Position.BOTTOM;
                if (Intrinsics.m32174c(string, "bottom")) {
                    return position7;
                }
                DivTooltip.Position position8 = DivTooltip.Position.BOTTOM_LEFT;
                if (Intrinsics.m32174c(string, "bottom-left")) {
                    return position8;
                }
                return null;
            }
        };

        /* renamed from: b */
        @NotNull
        public final String f40518b;

        /* compiled from: DivTooltip.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTooltip$Position$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Converter {
            public Converter() {
            }

            public Converter(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        Position(String str) {
            this.f40518b = str;
        }
    }

    static {
        int i2 = TypeHelper.f33843a;
        f40494j = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(Position.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTooltip$Companion$TYPE_HELPER_POSITION$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivTooltip.Position);
            }
        });
        f40495k = C3060n0.f41785v;
        f40496l = C3060n0.f41786w;
        f40497m = new Function2<ParsingEnvironment, JSONObject, DivTooltip>() { // from class: com.yandex.div2.DivTooltip$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivTooltip invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivTooltip.Companion companion = DivTooltip.f40492h;
                ParsingErrorLogger f33840b = env.getF33840b();
                DivAnimation.Companion companion2 = DivAnimation.f34634h;
                Function2<ParsingEnvironment, JSONObject, DivAnimation> function2 = DivAnimation.f34644r;
                DivAnimation divAnimation = (DivAnimation) JsonParser.m17322n(it, "animation_in", function2, f33840b, env);
                DivAnimation divAnimation2 = (DivAnimation) JsonParser.m17322n(it, "animation_out", function2, f33840b, env);
                Div.Companion companion3 = Div.f34418a;
                Div div = (Div) JsonParser.m17313e(it, "div", Div.f34419b, C2904b.f33858e, env);
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivTooltip.f40495k;
                Expression<Long> expression = DivTooltip.f40493i;
                Expression<Long> m17328t = JsonParser.m17328t(it, "duration", function1, valueValidator, f33840b, expression, TypeHelpersKt.f33849b);
                Expression<Long> expression2 = m17328t == null ? expression : m17328t;
                String str = (String) JsonParser.m17311c(it, "id", DivTooltip.f40496l, f33840b, env);
                DivPoint.Companion companion4 = DivPoint.f38064c;
                DivPoint divPoint = (DivPoint) JsonParser.m17322n(it, "offset", DivPoint.f38065d, f33840b, env);
                DivTooltip.Position.Converter converter = DivTooltip.Position.f40507c;
                return new DivTooltip(divAnimation, divAnimation2, div, expression2, str, divPoint, JsonParser.m17317i(it, "position", DivTooltip.Position.f40508d, f33840b, env, DivTooltip.f40494j));
            }
        };
    }

    @DivModelInternalApi
    public DivTooltip(@Nullable DivAnimation divAnimation, @Nullable DivAnimation divAnimation2, @NotNull Div div, @NotNull Expression<Long> duration, @NotNull String id2, @Nullable DivPoint divPoint, @NotNull Expression<Position> position) {
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(duration, "duration");
        Intrinsics.m32179h(id2, "id");
        Intrinsics.m32179h(position, "position");
        this.f40498a = divAnimation;
        this.f40499b = divAnimation2;
        this.f40500c = div;
        this.f40501d = duration;
        this.f40502e = id2;
        this.f40503f = divPoint;
        this.f40504g = position;
    }
}
