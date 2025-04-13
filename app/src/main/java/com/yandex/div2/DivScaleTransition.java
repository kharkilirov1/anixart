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

/* compiled from: DivScaleTransition.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div2/DivScaleTransition;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div2/DivTransitionBase;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivScaleTransition implements JSONSerializable, DivTransitionBase {

    /* renamed from: g */
    @NotNull
    public static final Companion f38207g = new Companion(null);

    /* renamed from: h */
    @NotNull
    public static final Expression<Long> f38208h;

    /* renamed from: i */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f38209i;

    /* renamed from: j */
    @NotNull
    public static final Expression<Double> f38210j;

    /* renamed from: k */
    @NotNull
    public static final Expression<Double> f38211k;

    /* renamed from: l */
    @NotNull
    public static final Expression<Double> f38212l;

    /* renamed from: m */
    @NotNull
    public static final Expression<Long> f38213m;

    /* renamed from: n */
    @NotNull
    public static final TypeHelper<DivAnimationInterpolator> f38214n;

    /* renamed from: o */
    @NotNull
    public static final ValueValidator<Long> f38215o;

    /* renamed from: p */
    @NotNull
    public static final ValueValidator<Double> f38216p;

    /* renamed from: q */
    @NotNull
    public static final ValueValidator<Double> f38217q;

    /* renamed from: r */
    @NotNull
    public static final ValueValidator<Double> f38218r;

    /* renamed from: s */
    @NotNull
    public static final ValueValidator<Long> f38219s;

    /* renamed from: a */
    @NotNull
    public final Expression<Long> f38220a;

    /* renamed from: b */
    @NotNull
    public final Expression<DivAnimationInterpolator> f38221b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Expression<Double> f38222c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Expression<Double> f38223d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Expression<Double> f38224e;

    /* renamed from: f */
    @NotNull
    public final Expression<Long> f38225f;

    /* compiled from: DivScaleTransition.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0005R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\bR\u0014\u0010\u001a\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m31884d2 = {"Lcom/yandex/div2/DivScaleTransition$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "DURATION_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "DURATION_VALIDATOR", "Lcom/yandex/div2/DivAnimationInterpolator;", "INTERPOLATOR_DEFAULT_VALUE", "", "PIVOT_X_DEFAULT_VALUE", "PIVOT_X_TEMPLATE_VALIDATOR", "PIVOT_X_VALIDATOR", "PIVOT_Y_DEFAULT_VALUE", "PIVOT_Y_TEMPLATE_VALIDATOR", "PIVOT_Y_VALIDATOR", "SCALE_DEFAULT_VALUE", "SCALE_TEMPLATE_VALIDATOR", "SCALE_VALIDATOR", "START_DELAY_DEFAULT_VALUE", "START_DELAY_TEMPLATE_VALIDATOR", "START_DELAY_VALIDATOR", "", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_INTERPOLATOR", "Lcom/yandex/div/internal/parser/TypeHelper;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivScaleTransition m17687a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator = DivScaleTransition.f38215o;
            Expression<Long> expression = DivScaleTransition.f38208h;
            TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
            Expression<Long> m17328t = JsonParser.m17328t(jSONObject, "duration", function1, valueValidator, f34328a, expression, typeHelper);
            if (m17328t != null) {
                expression = m17328t;
            }
            DivAnimationInterpolator.Converter converter = DivAnimationInterpolator.f34666c;
            Function1<String, DivAnimationInterpolator> function12 = DivAnimationInterpolator.f34667d;
            Expression<DivAnimationInterpolator> expression2 = DivScaleTransition.f38209i;
            Expression<DivAnimationInterpolator> m17330v = JsonParser.m17330v(jSONObject, "interpolator", function12, f34328a, parsingEnvironment, expression2, DivScaleTransition.f38214n);
            if (m17330v != null) {
                expression2 = m17330v;
            }
            Function1<Number, Double> function13 = ParsingConvertersKt.f33830d;
            ValueValidator<Double> valueValidator2 = DivScaleTransition.f38216p;
            Expression<Double> expression3 = DivScaleTransition.f38210j;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.f33851d;
            Expression<Double> m17328t2 = JsonParser.m17328t(jSONObject, "pivot_x", function13, valueValidator2, f34328a, expression3, typeHelper2);
            if (m17328t2 != null) {
                expression3 = m17328t2;
            }
            ValueValidator<Double> valueValidator3 = DivScaleTransition.f38217q;
            Expression<Double> expression4 = DivScaleTransition.f38211k;
            Expression<Double> m17328t3 = JsonParser.m17328t(jSONObject, "pivot_y", function13, valueValidator3, f34328a, expression4, typeHelper2);
            if (m17328t3 != null) {
                expression4 = m17328t3;
            }
            ValueValidator<Double> valueValidator4 = DivScaleTransition.f38218r;
            Expression<Double> expression5 = DivScaleTransition.f38212l;
            Expression<Double> m17328t4 = JsonParser.m17328t(jSONObject, "scale", function13, valueValidator4, f34328a, expression5, typeHelper2);
            if (m17328t4 != null) {
                expression5 = m17328t4;
            }
            ValueValidator<Long> valueValidator5 = DivScaleTransition.f38219s;
            Expression<Long> expression6 = DivScaleTransition.f38213m;
            Expression<Long> m17328t5 = JsonParser.m17328t(jSONObject, "start_delay", function1, valueValidator5, f34328a, expression6, typeHelper);
            return new DivScaleTransition(expression, expression2, expression3, expression4, expression5, m17328t5 == null ? expression6 : m17328t5);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f38208h = companion.m17539a(200L);
        f38209i = companion.m17539a(DivAnimationInterpolator.EASE_IN_OUT);
        Double valueOf = Double.valueOf(0.5d);
        f38210j = companion.m17539a(valueOf);
        f38211k = companion.m17539a(valueOf);
        f38212l = companion.m17539a(Double.valueOf(0.0d));
        f38213m = companion.m17539a(0L);
        int i2 = TypeHelper.f33843a;
        f38214n = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivAnimationInterpolator.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivScaleTransition$Companion$TYPE_HELPER_INTERPOLATOR$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAnimationInterpolator);
            }
        });
        f38215o = C3034a0.f41082c;
        f38216p = C3034a0.f41083d;
        f38217q = C3034a0.f41084e;
        f38218r = C3034a0.f41085f;
        f38219s = C3034a0.f41086g;
        DivScaleTransition$Companion$CREATOR$1 divScaleTransition$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivScaleTransition>() { // from class: com.yandex.div2.DivScaleTransition$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivScaleTransition invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivScaleTransition.f38207g.m17687a(env, it);
            }
        };
    }

    @DivModelInternalApi
    public DivScaleTransition(@NotNull Expression<Long> duration, @NotNull Expression<DivAnimationInterpolator> interpolator, @NotNull Expression<Double> pivotX, @NotNull Expression<Double> pivotY, @NotNull Expression<Double> scale, @NotNull Expression<Long> startDelay) {
        Intrinsics.m32179h(duration, "duration");
        Intrinsics.m32179h(interpolator, "interpolator");
        Intrinsics.m32179h(pivotX, "pivotX");
        Intrinsics.m32179h(pivotY, "pivotY");
        Intrinsics.m32179h(scale, "scale");
        Intrinsics.m32179h(startDelay, "startDelay");
        this.f38220a = duration;
        this.f38221b = interpolator;
        this.f38222c = pivotX;
        this.f38223d = pivotY;
        this.f38224e = scale;
        this.f38225f = startDelay;
    }

    @DivModelInternalApi
    public DivScaleTransition() {
        this(f38208h, f38209i, f38210j, f38211k, f38212l, f38213m);
    }
}
