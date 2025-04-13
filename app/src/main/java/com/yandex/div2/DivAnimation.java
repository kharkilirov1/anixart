package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.DivCount;
import com.yandex.metrica.plugins.PluginErrorDetails;
import java.util.List;
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

/* compiled from: DivAnimation.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div2/DivAnimation;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "Name", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivAnimation implements JSONSerializable {

    /* renamed from: h */
    @NotNull
    public static final Companion f34634h = new Companion(null);

    /* renamed from: i */
    @NotNull
    public static final Expression<Long> f34635i;

    /* renamed from: j */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f34636j;

    /* renamed from: k */
    @NotNull
    public static final DivCount.Infinity f34637k;

    /* renamed from: l */
    @NotNull
    public static final Expression<Long> f34638l;

    /* renamed from: m */
    @NotNull
    public static final TypeHelper<DivAnimationInterpolator> f34639m;

    /* renamed from: n */
    @NotNull
    public static final TypeHelper<Name> f34640n;

    /* renamed from: o */
    @NotNull
    public static final ValueValidator<Long> f34641o;

    /* renamed from: p */
    @NotNull
    public static final ListValidator<DivAnimation> f34642p;

    /* renamed from: q */
    @NotNull
    public static final ValueValidator<Long> f34643q;

    /* renamed from: r */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivAnimation> f34644r;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Expression<Long> f34645a;

    /* renamed from: b */
    @JvmField
    @Nullable
    public final Expression<Double> f34646b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Expression<DivAnimationInterpolator> f34647c;

    /* renamed from: d */
    @JvmField
    @Nullable
    public final List<DivAnimation> f34648d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Expression<Name> f34649e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Expression<Long> f34650f;

    /* renamed from: g */
    @JvmField
    @Nullable
    public final Expression<Double> f34651g;

    /* compiled from: DivAnimation.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, m31884d2 = {"Lcom/yandex/div2/DivAnimation$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "DURATION_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "DURATION_VALIDATOR", "Lcom/yandex/div2/DivAnimationInterpolator;", "INTERPOLATOR_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAnimation;", "ITEMS_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivCount$Infinity;", "REPEAT_DEFAULT_VALUE", "Lcom/yandex/div2/DivCount$Infinity;", "START_DELAY_DEFAULT_VALUE", "START_DELAY_TEMPLATE_VALIDATOR", "START_DELAY_VALIDATOR", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_INTERPOLATOR", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAnimation$Name;", "TYPE_HELPER_NAME", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivAnimation.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div2/DivAnimation$Name;", "", "Converter", "FADE", "TRANSLATE", "SCALE", "NATIVE", "SET", "NO_ANIMATION", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum Name {
        FADE("fade"),
        TRANSLATE("translate"),
        SCALE("scale"),
        NATIVE(PluginErrorDetails.Platform.NATIVE),
        SET("set"),
        NO_ANIMATION("no_animation");


        /* renamed from: c */
        @NotNull
        public static final Converter f34655c = new Converter(null);

        /* renamed from: d */
        @NotNull
        public static final Function1<String, Name> f34656d = new Function1<String, Name>() { // from class: com.yandex.div2.DivAnimation$Name$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            public DivAnimation.Name invoke(String str) {
                String string = str;
                Intrinsics.m32179h(string, "string");
                DivAnimation.Name name = DivAnimation.Name.FADE;
                if (Intrinsics.m32174c(string, "fade")) {
                    return name;
                }
                DivAnimation.Name name2 = DivAnimation.Name.TRANSLATE;
                if (Intrinsics.m32174c(string, "translate")) {
                    return name2;
                }
                DivAnimation.Name name3 = DivAnimation.Name.SCALE;
                if (Intrinsics.m32174c(string, "scale")) {
                    return name3;
                }
                DivAnimation.Name name4 = DivAnimation.Name.NATIVE;
                if (Intrinsics.m32174c(string, PluginErrorDetails.Platform.NATIVE)) {
                    return name4;
                }
                DivAnimation.Name name5 = DivAnimation.Name.SET;
                if (Intrinsics.m32174c(string, "set")) {
                    return name5;
                }
                DivAnimation.Name name6 = DivAnimation.Name.NO_ANIMATION;
                if (Intrinsics.m32174c(string, "no_animation")) {
                    return name6;
                }
                return null;
            }
        };

        /* renamed from: b */
        @NotNull
        public final String f34664b;

        /* compiled from: DivAnimation.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivAnimation$Name$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Converter {
            public Converter() {
            }

            public Converter(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        Name(String str) {
            this.f34664b = str;
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f34635i = companion.m17539a(300L);
        f34636j = companion.m17539a(DivAnimationInterpolator.SPRING);
        f34637k = new DivCount.Infinity(new DivInfinityCount());
        f34638l = companion.m17539a(0L);
        int i2 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f34639m = companion2.m17372a(ArraysKt.m31926B(DivAnimationInterpolator.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivAnimation$Companion$TYPE_HELPER_INTERPOLATOR$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAnimationInterpolator);
            }
        });
        f34640n = companion2.m17372a(ArraysKt.m31926B(Name.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivAnimation$Companion$TYPE_HELPER_NAME$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAnimation.Name);
            }
        });
        f34641o = C3035b.f41119r;
        f34642p = C3037c.f41163h;
        f34643q = C3035b.f41120s;
        f34644r = new Function2<ParsingEnvironment, JSONObject, DivAnimation>() { // from class: com.yandex.div2.DivAnimation$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivAnimation invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivAnimation.Companion companion3 = DivAnimation.f34634h;
                ParsingErrorLogger f34328a = env.getF34328a();
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivAnimation.f34641o;
                Expression<Long> expression = DivAnimation.f34635i;
                TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
                Expression<Long> m17328t = JsonParser.m17328t(it, "duration", function1, valueValidator, f34328a, expression, typeHelper);
                if (m17328t != null) {
                    expression = m17328t;
                }
                Function1<Number, Double> function12 = ParsingConvertersKt.f33830d;
                TypeHelper<Double> typeHelper2 = TypeHelpersKt.f33851d;
                Expression m17329u = JsonParser.m17329u(it, "end_value", function12, f34328a, env, typeHelper2);
                DivAnimationInterpolator.Converter converter = DivAnimationInterpolator.f34666c;
                Function1<String, DivAnimationInterpolator> function13 = DivAnimationInterpolator.f34667d;
                Expression<DivAnimationInterpolator> expression2 = DivAnimation.f34636j;
                Expression<DivAnimationInterpolator> m17330v = JsonParser.m17330v(it, "interpolator", function13, f34328a, env, expression2, DivAnimation.f34639m);
                if (m17330v != null) {
                    expression2 = m17330v;
                }
                List m17333y = JsonParser.m17333y(it, "items", DivAnimation.f34644r, DivAnimation.f34642p, f34328a, env);
                DivAnimation.Name.Converter converter2 = DivAnimation.Name.f34655c;
                Expression m17317i = JsonParser.m17317i(it, "name", DivAnimation.Name.f34656d, f34328a, env, DivAnimation.f34640n);
                DivCount.Companion companion4 = DivCount.f35238a;
                DivCount divCount = (DivCount) JsonParser.m17322n(it, "repeat", DivCount.f35239b, f34328a, env);
                if (divCount == null) {
                    divCount = DivAnimation.f34637k;
                }
                DivCount divCount2 = divCount;
                Intrinsics.m32178g(divCount2, "JsonParser.readOptional(…) ?: REPEAT_DEFAULT_VALUE");
                ValueValidator<Long> valueValidator2 = DivAnimation.f34643q;
                Expression<Long> expression3 = DivAnimation.f34638l;
                Expression<Long> m17328t2 = JsonParser.m17328t(it, "start_delay", function1, valueValidator2, f34328a, expression3, typeHelper);
                if (m17328t2 != null) {
                    expression3 = m17328t2;
                }
                return new DivAnimation(expression, m17329u, expression2, m17333y, m17317i, divCount2, expression3, JsonParser.m17329u(it, "start_value", function12, f34328a, env, typeHelper2));
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivAnimation(@NotNull Expression<Long> duration, @Nullable Expression<Double> expression, @NotNull Expression<DivAnimationInterpolator> interpolator, @Nullable List<? extends DivAnimation> list, @NotNull Expression<Name> name, @NotNull DivCount repeat, @NotNull Expression<Long> startDelay, @Nullable Expression<Double> expression2) {
        Intrinsics.m32179h(duration, "duration");
        Intrinsics.m32179h(interpolator, "interpolator");
        Intrinsics.m32179h(name, "name");
        Intrinsics.m32179h(repeat, "repeat");
        Intrinsics.m32179h(startDelay, "startDelay");
        this.f34645a = duration;
        this.f34646b = expression;
        this.f34647c = interpolator;
        this.f34648d = list;
        this.f34649e = name;
        this.f34650f = startDelay;
        this.f34651g = expression2;
    }

    public /* synthetic */ DivAnimation(Expression expression, Expression expression2, Expression expression3, List list, Expression expression4, DivCount divCount, Expression expression5, Expression expression6, int i2) {
        this((i2 & 1) != 0 ? f34635i : expression, (i2 & 2) != 0 ? null : expression2, (i2 & 4) != 0 ? f34636j : null, null, expression4, (i2 & 32) != 0 ? f34637k : null, (i2 & 64) != 0 ? f34638l : null, (i2 & 128) != 0 ? null : expression6);
    }
}
