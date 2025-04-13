package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivSlideTransition;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivSlideTransition.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivSlideTransition;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div2/DivTransitionBase;", "Companion", "Edge", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivSlideTransition implements JSONSerializable, DivTransitionBase {

    /* renamed from: f */
    @NotNull
    public static final Companion f38853f = new Companion(null);

    /* renamed from: g */
    @NotNull
    public static final Expression<Long> f38854g;

    /* renamed from: h */
    @NotNull
    public static final Expression<Edge> f38855h;

    /* renamed from: i */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f38856i;

    /* renamed from: j */
    @NotNull
    public static final Expression<Long> f38857j;

    /* renamed from: k */
    @NotNull
    public static final TypeHelper<Edge> f38858k;

    /* renamed from: l */
    @NotNull
    public static final TypeHelper<DivAnimationInterpolator> f38859l;

    /* renamed from: m */
    @NotNull
    public static final ValueValidator<Long> f38860m;

    /* renamed from: n */
    @NotNull
    public static final ValueValidator<Long> f38861n;

    /* renamed from: a */
    @JvmField
    @Nullable
    public final DivDimension f38862a;

    /* renamed from: b */
    @NotNull
    public final Expression<Long> f38863b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Expression<Edge> f38864c;

    /* renamed from: d */
    @NotNull
    public final Expression<DivAnimationInterpolator> f38865d;

    /* renamed from: e */
    @NotNull
    public final Expression<Long> f38866e;

    /* compiled from: DivSlideTransition.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\bR\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, m31884d2 = {"Lcom/yandex/div2/DivSlideTransition$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "DURATION_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "DURATION_VALIDATOR", "Lcom/yandex/div2/DivSlideTransition$Edge;", "EDGE_DEFAULT_VALUE", "Lcom/yandex/div2/DivAnimationInterpolator;", "INTERPOLATOR_DEFAULT_VALUE", "START_DELAY_DEFAULT_VALUE", "START_DELAY_TEMPLATE_VALIDATOR", "START_DELAY_VALIDATOR", "", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_EDGE", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_INTERPOLATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivSlideTransition m17701a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivDimension.Companion companion = DivDimension.f35517c;
            DivDimension divDimension = (DivDimension) JsonParser.m17322n(jSONObject, "distance", DivDimension.f35520f, f34328a, parsingEnvironment);
            Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator = DivSlideTransition.f38860m;
            Expression<Long> expression = DivSlideTransition.f38854g;
            TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
            Expression<Long> m17328t = JsonParser.m17328t(jSONObject, "duration", function1, valueValidator, f34328a, expression, typeHelper);
            if (m17328t != null) {
                expression = m17328t;
            }
            Edge.Converter converter = Edge.f38870c;
            Function1<String, Edge> function12 = Edge.f38871d;
            Expression<Edge> expression2 = DivSlideTransition.f38855h;
            Expression<Edge> m17330v = JsonParser.m17330v(jSONObject, "edge", function12, f34328a, parsingEnvironment, expression2, DivSlideTransition.f38858k);
            if (m17330v != null) {
                expression2 = m17330v;
            }
            DivAnimationInterpolator.Converter converter2 = DivAnimationInterpolator.f34666c;
            Function1<String, DivAnimationInterpolator> function13 = DivAnimationInterpolator.f34667d;
            Expression<DivAnimationInterpolator> expression3 = DivSlideTransition.f38856i;
            Expression<DivAnimationInterpolator> m17330v2 = JsonParser.m17330v(jSONObject, "interpolator", function13, f34328a, parsingEnvironment, expression3, DivSlideTransition.f38859l);
            if (m17330v2 != null) {
                expression3 = m17330v2;
            }
            ValueValidator<Long> valueValidator2 = DivSlideTransition.f38861n;
            Expression<Long> expression4 = DivSlideTransition.f38857j;
            Expression<Long> m17328t2 = JsonParser.m17328t(jSONObject, "start_delay", function1, valueValidator2, f34328a, expression4, typeHelper);
            return new DivSlideTransition(divDimension, expression, expression2, expression3, m17328t2 == null ? expression4 : m17328t2);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivSlideTransition.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivSlideTransition$Edge;", "", "Converter", "LEFT", "TOP", "RIGHT", "BOTTOM", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum Edge {
        LEFT("left"),
        TOP("top"),
        RIGHT("right"),
        BOTTOM("bottom");


        /* renamed from: c */
        @NotNull
        public static final Converter f38870c = new Converter(null);

        /* renamed from: d */
        @NotNull
        public static final Function1<String, Edge> f38871d = new Function1<String, Edge>() { // from class: com.yandex.div2.DivSlideTransition$Edge$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            public DivSlideTransition.Edge invoke(String str) {
                String string = str;
                Intrinsics.m32179h(string, "string");
                DivSlideTransition.Edge edge = DivSlideTransition.Edge.LEFT;
                if (Intrinsics.m32174c(string, "left")) {
                    return edge;
                }
                DivSlideTransition.Edge edge2 = DivSlideTransition.Edge.TOP;
                if (Intrinsics.m32174c(string, "top")) {
                    return edge2;
                }
                DivSlideTransition.Edge edge3 = DivSlideTransition.Edge.RIGHT;
                if (Intrinsics.m32174c(string, "right")) {
                    return edge3;
                }
                DivSlideTransition.Edge edge4 = DivSlideTransition.Edge.BOTTOM;
                if (Intrinsics.m32174c(string, "bottom")) {
                    return edge4;
                }
                return null;
            }
        };

        /* renamed from: b */
        @NotNull
        public final String f38877b;

        /* compiled from: DivSlideTransition.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivSlideTransition$Edge$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Converter {
            public Converter() {
            }

            public Converter(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        Edge(String str) {
            this.f38877b = str;
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f38854g = companion.m17539a(200L);
        f38855h = companion.m17539a(Edge.BOTTOM);
        f38856i = companion.m17539a(DivAnimationInterpolator.EASE_IN_OUT);
        f38857j = companion.m17539a(0L);
        int i2 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f38858k = companion2.m17372a(ArraysKt.m31926B(Edge.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSlideTransition$Companion$TYPE_HELPER_EDGE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivSlideTransition.Edge);
            }
        });
        f38859l = companion2.m17372a(ArraysKt.m31926B(DivAnimationInterpolator.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSlideTransition$Companion$TYPE_HELPER_INTERPOLATOR$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAnimationInterpolator);
            }
        });
        f38860m = C3040d0.f41250p;
        f38861n = C3040d0.f41251q;
        DivSlideTransition$Companion$CREATOR$1 divSlideTransition$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivSlideTransition>() { // from class: com.yandex.div2.DivSlideTransition$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivSlideTransition invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivSlideTransition.f38853f.m17701a(env, it);
            }
        };
    }

    @DivModelInternalApi
    public DivSlideTransition(@Nullable DivDimension divDimension, @NotNull Expression<Long> duration, @NotNull Expression<Edge> edge, @NotNull Expression<DivAnimationInterpolator> interpolator, @NotNull Expression<Long> startDelay) {
        Intrinsics.m32179h(duration, "duration");
        Intrinsics.m32179h(edge, "edge");
        Intrinsics.m32179h(interpolator, "interpolator");
        Intrinsics.m32179h(startDelay, "startDelay");
        this.f38862a = divDimension;
        this.f38863b = duration;
        this.f38864c = edge;
        this.f38865d = interpolator;
        this.f38866e = startDelay;
    }

    @DivModelInternalApi
    public DivSlideTransition() {
        this(null, f38854g, f38855h, f38856i, f38857j);
    }
}
