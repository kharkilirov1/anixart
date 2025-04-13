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
import org.json.JSONObject;

/* compiled from: DivFadeTransition.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div2/DivFadeTransition;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div2/DivTransitionBase;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivFadeTransition implements JSONSerializable, DivTransitionBase {

    /* renamed from: e */
    @NotNull
    public static final Companion f35673e = new Companion(null);

    /* renamed from: f */
    @NotNull
    public static final Expression<Double> f35674f;

    /* renamed from: g */
    @NotNull
    public static final Expression<Long> f35675g;

    /* renamed from: h */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f35676h;

    /* renamed from: i */
    @NotNull
    public static final Expression<Long> f35677i;

    /* renamed from: j */
    @NotNull
    public static final TypeHelper<DivAnimationInterpolator> f35678j;

    /* renamed from: k */
    @NotNull
    public static final ValueValidator<Double> f35679k;

    /* renamed from: l */
    @NotNull
    public static final ValueValidator<Long> f35680l;

    /* renamed from: m */
    @NotNull
    public static final ValueValidator<Long> f35681m;

    /* renamed from: n */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivFadeTransition> f35682n;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Expression<Double> f35683a;

    /* renamed from: b */
    @NotNull
    public final Expression<Long> f35684b;

    /* renamed from: c */
    @NotNull
    public final Expression<DivAnimationInterpolator> f35685c;

    /* renamed from: d */
    @NotNull
    public final Expression<Long> f35686d;

    /* compiled from: DivFadeTransition.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m31884d2 = {"Lcom/yandex/div2/DivFadeTransition$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "", "DURATION_DEFAULT_VALUE", "DURATION_TEMPLATE_VALIDATOR", "DURATION_VALIDATOR", "Lcom/yandex/div2/DivAnimationInterpolator;", "INTERPOLATOR_DEFAULT_VALUE", "START_DELAY_DEFAULT_VALUE", "START_DELAY_TEMPLATE_VALIDATOR", "START_DELAY_VALIDATOR", "", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_INTERPOLATOR", "Lcom/yandex/div/internal/parser/TypeHelper;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivFadeTransition m17613a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
            ValueValidator<Double> valueValidator = DivFadeTransition.f35679k;
            Expression<Double> expression = DivFadeTransition.f35674f;
            Expression<Double> m17328t = JsonParser.m17328t(jSONObject, "alpha", function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
            if (m17328t != null) {
                expression = m17328t;
            }
            Function1<Number, Long> function12 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator2 = DivFadeTransition.f35680l;
            Expression<Long> expression2 = DivFadeTransition.f35675g;
            TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
            Expression<Long> m17328t2 = JsonParser.m17328t(jSONObject, "duration", function12, valueValidator2, f34328a, expression2, typeHelper);
            if (m17328t2 != null) {
                expression2 = m17328t2;
            }
            DivAnimationInterpolator.Converter converter = DivAnimationInterpolator.f34666c;
            Function1<String, DivAnimationInterpolator> function13 = DivAnimationInterpolator.f34667d;
            Expression<DivAnimationInterpolator> expression3 = DivFadeTransition.f35676h;
            Expression<DivAnimationInterpolator> m17330v = JsonParser.m17330v(jSONObject, "interpolator", function13, f34328a, parsingEnvironment, expression3, DivFadeTransition.f35678j);
            if (m17330v != null) {
                expression3 = m17330v;
            }
            ValueValidator<Long> valueValidator3 = DivFadeTransition.f35681m;
            Expression<Long> expression4 = DivFadeTransition.f35677i;
            Expression<Long> m17328t3 = JsonParser.m17328t(jSONObject, "start_delay", function12, valueValidator3, f34328a, expression4, typeHelper);
            if (m17328t3 != null) {
                expression4 = m17328t3;
            }
            return new DivFadeTransition(expression, expression2, expression3, expression4);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f35674f = companion.m17539a(Double.valueOf(0.0d));
        f35675g = companion.m17539a(200L);
        f35676h = companion.m17539a(DivAnimationInterpolator.EASE_IN_OUT);
        f35677i = companion.m17539a(0L);
        int i2 = TypeHelper.f33843a;
        f35678j = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivAnimationInterpolator.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivFadeTransition$Companion$TYPE_HELPER_INTERPOLATOR$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAnimationInterpolator);
            }
        });
        f35679k = C3049i.f41494u;
        f35680l = C3049i.f41495v;
        f35681m = C3049i.f41496w;
        f35682n = new Function2<ParsingEnvironment, JSONObject, DivFadeTransition>() { // from class: com.yandex.div2.DivFadeTransition$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivFadeTransition invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivFadeTransition.f35673e.m17613a(env, it);
            }
        };
    }

    @DivModelInternalApi
    public DivFadeTransition(@NotNull Expression<Double> alpha, @NotNull Expression<Long> duration, @NotNull Expression<DivAnimationInterpolator> interpolator, @NotNull Expression<Long> startDelay) {
        Intrinsics.m32179h(alpha, "alpha");
        Intrinsics.m32179h(duration, "duration");
        Intrinsics.m32179h(interpolator, "interpolator");
        Intrinsics.m32179h(startDelay, "startDelay");
        this.f35683a = alpha;
        this.f35684b = duration;
        this.f35685c = interpolator;
        this.f35686d = startDelay;
    }

    @DivModelInternalApi
    public DivFadeTransition() {
        this(f35674f, f35675g, f35676h, f35677i);
    }
}
