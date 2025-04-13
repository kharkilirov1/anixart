package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.data.ErrorsCollectorEnvironment;
import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.Div;
import com.yandex.div2.DivData;
import com.yandex.div2.DivTimer;
import com.yandex.div2.DivTransitionSelector;
import com.yandex.div2.DivTrigger;
import com.yandex.div2.DivVariable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
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

/* compiled from: DivData.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div2/DivData;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "State", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivData implements JSONSerializable {

    /* renamed from: h */
    @NotNull
    public static final Companion f35444h = new Companion(null);

    /* renamed from: i */
    @NotNull
    public static final Expression<DivTransitionSelector> f35445i = Expression.f34334a.m17539a(DivTransitionSelector.NONE);

    /* renamed from: j */
    @NotNull
    public static final TypeHelper<DivTransitionSelector> f35446j;

    /* renamed from: k */
    @NotNull
    public static final ValueValidator<String> f35447k;

    /* renamed from: l */
    @NotNull
    public static final ListValidator<State> f35448l;

    /* renamed from: m */
    @NotNull
    public static final ListValidator<DivTimer> f35449m;

    /* renamed from: n */
    @NotNull
    public static final ListValidator<DivTrigger> f35450n;

    /* renamed from: o */
    @NotNull
    public static final ListValidator<DivVariable> f35451o;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final String f35452a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final List<State> f35453b;

    /* renamed from: c */
    @JvmField
    @Nullable
    public final List<DivTimer> f35454c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Expression<DivTransitionSelector> f35455d;

    /* renamed from: e */
    @JvmField
    @Nullable
    public final List<DivTrigger> f35456e;

    /* renamed from: f */
    @JvmField
    @Nullable
    public final List<DivVariable> f35457f;

    /* renamed from: g */
    @JvmField
    @Nullable
    public final List<Exception> f35458g;

    /* compiled from: DivData.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\n¨\u0006\u0018"}, m31884d2 = {"Lcom/yandex/div2/DivData$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "LOG_ID_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "LOG_ID_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivData$State;", "STATES_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivTimer;", "TIMERS_VALIDATOR", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div2/DivTransitionSelector;", "TRANSITION_ANIMATION_SELECTOR_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivVariable;", "VARIABLES_VALIDATOR", "Lcom/yandex/div2/DivTrigger;", "VARIABLE_TRIGGERS_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivData m17609a(@NotNull ParsingEnvironment env, @NotNull JSONObject json) {
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(json, "json");
            ErrorsCollectorEnvironment errorsCollectorEnvironment = new ErrorsCollectorEnvironment(env);
            ParsingErrorLogger parsingErrorLogger = errorsCollectorEnvironment.f33097d;
            String str = (String) JsonParser.m17311c(json, "log_id", DivData.f35447k, parsingErrorLogger, errorsCollectorEnvironment);
            State.Companion companion = State.f35461c;
            List m17308A = JsonParser.m17308A(json, "states", State.f35462d, DivData.f35448l, parsingErrorLogger, errorsCollectorEnvironment);
            Intrinsics.m32178g(m17308A, "readStrictList(json, \"st…S_VALIDATOR, logger, env)");
            DivTimer.Companion companion2 = DivTimer.f40442g;
            List m17333y = JsonParser.m17333y(json, "timers", DivTimer.f40450o, DivData.f35449m, parsingErrorLogger, errorsCollectorEnvironment);
            DivTransitionSelector.Converter converter = DivTransitionSelector.f40573c;
            Function1<String, DivTransitionSelector> function1 = DivTransitionSelector.f40574d;
            Expression<DivTransitionSelector> expression = DivData.f35445i;
            Expression<DivTransitionSelector> m17330v = JsonParser.m17330v(json, "transition_animation_selector", function1, parsingErrorLogger, errorsCollectorEnvironment, expression, DivData.f35446j);
            if (m17330v != null) {
                expression = m17330v;
            }
            DivTrigger.Companion companion3 = DivTrigger.f40590d;
            List m17333y2 = JsonParser.m17333y(json, "variable_triggers", DivTrigger.f40594h, DivData.f35450n, parsingErrorLogger, errorsCollectorEnvironment);
            DivVariable.Companion companion4 = DivVariable.f40624a;
            return new DivData(str, m17308A, m17333y, expression, m17333y2, JsonParser.m17333y(json, "variables", DivVariable.f40625b, DivData.f35451o, parsingErrorLogger, errorsCollectorEnvironment), CollectionsKt.m32027j0(errorsCollectorEnvironment.f33095b));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivData.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivData$State;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class State implements JSONSerializable {

        /* renamed from: c */
        @NotNull
        public static final Companion f35461c = new Companion(null);

        /* renamed from: d */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, State> f35462d = new Function2<ParsingEnvironment, JSONObject, State>() { // from class: com.yandex.div2.DivData$State$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivData.State invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivData.State.Companion companion = DivData.State.f35461c;
                env.getF33097d();
                Div.Companion companion2 = Div.f34418a;
                Function2<ParsingEnvironment, JSONObject, Div> function2 = Div.f34419b;
                C2904b c2904b = C2904b.f33858e;
                return new DivData.State((Div) JsonParser.m17313e(it, "div", function2, c2904b, env), ((Number) JsonParser.m17312d(it, "state_id", ParsingConvertersKt.f33831e, c2904b)).longValue());
            }
        };

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Div f35463a;

        /* renamed from: b */
        @JvmField
        public final long f35464b;

        /* compiled from: DivData.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivData$State$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        @DivModelInternalApi
        public State(@NotNull Div div, long j2) {
            Intrinsics.m32179h(div, "div");
            this.f35463a = div;
            this.f35464b = j2;
        }
    }

    static {
        int i2 = TypeHelper.f33843a;
        f35446j = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivTransitionSelector.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivData$Companion$TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivTransitionSelector);
            }
        });
        f35447k = C3045g.f41380n;
        f35448l = C3047h.f41441n;
        f35449m = C3047h.f41442o;
        f35450n = C3047h.f41443p;
        f35451o = C3047h.f41444q;
        DivData$Companion$CREATOR$1 divData$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivData>() { // from class: com.yandex.div2.DivData$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivData invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivData.f35444h.m17609a(env, it);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivData(@NotNull String logId, @NotNull List<? extends State> states, @Nullable List<? extends DivTimer> list, @NotNull Expression<DivTransitionSelector> transitionAnimationSelector, @Nullable List<? extends DivTrigger> list2, @Nullable List<? extends DivVariable> list3, @Nullable List<? extends Exception> list4) {
        Intrinsics.m32179h(logId, "logId");
        Intrinsics.m32179h(states, "states");
        Intrinsics.m32179h(transitionAnimationSelector, "transitionAnimationSelector");
        this.f35452a = logId;
        this.f35453b = states;
        this.f35454c = list;
        this.f35455d = transitionAnimationSelector;
        this.f35456e = list2;
        this.f35457f = list3;
        this.f35458g = list4;
    }
}
