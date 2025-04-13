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
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivChangeBoundsTransition.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div2/DivChangeBoundsTransition;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div2/DivTransitionBase;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivChangeBoundsTransition implements JSONSerializable, DivTransitionBase {

    /* renamed from: d */
    @NotNull
    public static final Companion f34816d = new Companion(null);

    /* renamed from: e */
    @NotNull
    public static final Expression<Long> f34817e;

    /* renamed from: f */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f34818f;

    /* renamed from: g */
    @NotNull
    public static final Expression<Long> f34819g;

    /* renamed from: h */
    @NotNull
    public static final TypeHelper<DivAnimationInterpolator> f34820h;

    /* renamed from: i */
    @NotNull
    public static final ValueValidator<Long> f34821i;

    /* renamed from: j */
    @NotNull
    public static final ValueValidator<Long> f34822j;

    /* renamed from: a */
    @NotNull
    public final Expression<Long> f34823a;

    /* renamed from: b */
    @NotNull
    public final Expression<DivAnimationInterpolator> f34824b;

    /* renamed from: c */
    @NotNull
    public final Expression<Long> f34825c;

    /* compiled from: DivChangeBoundsTransition.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m31884d2 = {"Lcom/yandex/div2/DivChangeBoundsTransition$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "DURATION_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "DURATION_VALIDATOR", "Lcom/yandex/div2/DivAnimationInterpolator;", "INTERPOLATOR_DEFAULT_VALUE", "START_DELAY_DEFAULT_VALUE", "START_DELAY_TEMPLATE_VALIDATOR", "START_DELAY_VALIDATOR", "", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_INTERPOLATOR", "Lcom/yandex/div/internal/parser/TypeHelper;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivChangeBoundsTransition m17592a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator = DivChangeBoundsTransition.f34821i;
            Expression<Long> expression = DivChangeBoundsTransition.f34817e;
            TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
            Expression<Long> m17328t = JsonParser.m17328t(jSONObject, "duration", function1, valueValidator, f34328a, expression, typeHelper);
            if (m17328t != null) {
                expression = m17328t;
            }
            DivAnimationInterpolator.Converter converter = DivAnimationInterpolator.f34666c;
            Function1<String, DivAnimationInterpolator> function12 = DivAnimationInterpolator.f34667d;
            Expression<DivAnimationInterpolator> expression2 = DivChangeBoundsTransition.f34818f;
            Expression<DivAnimationInterpolator> m17330v = JsonParser.m17330v(jSONObject, "interpolator", function12, f34328a, parsingEnvironment, expression2, DivChangeBoundsTransition.f34820h);
            if (m17330v != null) {
                expression2 = m17330v;
            }
            ValueValidator<Long> valueValidator2 = DivChangeBoundsTransition.f34822j;
            Expression<Long> expression3 = DivChangeBoundsTransition.f34819g;
            Expression<Long> m17328t2 = JsonParser.m17328t(jSONObject, "start_delay", function1, valueValidator2, f34328a, expression3, typeHelper);
            if (m17328t2 != null) {
                expression3 = m17328t2;
            }
            return new DivChangeBoundsTransition(expression, expression2, expression3);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f34817e = companion.m17539a(200L);
        f34818f = companion.m17539a(DivAnimationInterpolator.EASE_IN_OUT);
        f34819g = companion.m17539a(0L);
        int i2 = TypeHelper.f33843a;
        f34820h = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivAnimationInterpolator.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivChangeBoundsTransition$Companion$TYPE_HELPER_INTERPOLATOR$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAnimationInterpolator);
            }
        });
        f34821i = C3039d.f41221j;
        f34822j = C3039d.f41222k;
        DivChangeBoundsTransition$Companion$CREATOR$1 divChangeBoundsTransition$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivChangeBoundsTransition>() { // from class: com.yandex.div2.DivChangeBoundsTransition$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivChangeBoundsTransition invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivChangeBoundsTransition.f34816d.m17592a(env, it);
            }
        };
    }

    @DivModelInternalApi
    public DivChangeBoundsTransition(@NotNull Expression<Long> duration, @NotNull Expression<DivAnimationInterpolator> interpolator, @NotNull Expression<Long> startDelay) {
        Intrinsics.m32179h(duration, "duration");
        Intrinsics.m32179h(interpolator, "interpolator");
        Intrinsics.m32179h(startDelay, "startDelay");
        this.f34823a = duration;
        this.f34824b = interpolator;
        this.f34825c = startDelay;
    }

    @DivModelInternalApi
    public DivChangeBoundsTransition() {
        this(f34817e, f34818f, f34819g);
    }
}
