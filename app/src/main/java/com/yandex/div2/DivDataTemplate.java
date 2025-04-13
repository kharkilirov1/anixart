package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.Div;
import com.yandex.div2.DivData;
import com.yandex.div2.DivDataTemplate;
import com.yandex.div2.DivTemplate;
import com.yandex.div2.DivTimer;
import com.yandex.div2.DivTimerTemplate;
import com.yandex.div2.DivTransitionSelector;
import com.yandex.div2.DivTrigger;
import com.yandex.div2.DivTriggerTemplate;
import com.yandex.div2.DivVariable;
import com.yandex.div2.DivVariableTemplate;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivDataTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivDataTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivData;", "Companion", "StateTemplate", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivDataTemplate implements JSONSerializable, JsonTemplate<DivData> {

    /* renamed from: g */
    @NotNull
    public static final Expression<DivTransitionSelector> f35466g = Expression.f34334a.m17539a(DivTransitionSelector.NONE);

    /* renamed from: h */
    @NotNull
    public static final TypeHelper<DivTransitionSelector> f35467h;

    /* renamed from: i */
    @NotNull
    public static final ValueValidator<String> f35468i;

    /* renamed from: j */
    @NotNull
    public static final ValueValidator<String> f35469j;

    /* renamed from: k */
    @NotNull
    public static final ListValidator<DivData.State> f35470k;

    /* renamed from: l */
    @NotNull
    public static final ListValidator<StateTemplate> f35471l;

    /* renamed from: m */
    @NotNull
    public static final ListValidator<DivTimer> f35472m;

    /* renamed from: n */
    @NotNull
    public static final ListValidator<DivTimerTemplate> f35473n;

    /* renamed from: o */
    @NotNull
    public static final ListValidator<DivTrigger> f35474o;

    /* renamed from: p */
    @NotNull
    public static final ListValidator<DivTriggerTemplate> f35475p;

    /* renamed from: q */
    @NotNull
    public static final ListValidator<DivVariable> f35476q;

    /* renamed from: r */
    @NotNull
    public static final ListValidator<DivVariableTemplate> f35477r;

    /* renamed from: s */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f35478s;

    /* renamed from: t */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivData.State>> f35479t;

    /* renamed from: u */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTimer>> f35480u;

    /* renamed from: v */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivTransitionSelector>> f35481v;

    /* renamed from: w */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTrigger>> f35482w;

    /* renamed from: x */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivVariable>> f35483x;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<String> f35484a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<List<StateTemplate>> f35485b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<List<DivTimerTemplate>> f35486c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<Expression<DivTransitionSelector>> f35487d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<List<DivTriggerTemplate>> f35488e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<List<DivVariableTemplate>> f35489f;

    /* compiled from: DivDataTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\nR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\nR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\n¨\u0006 "}, m31884d2 = {"Lcom/yandex/div2/DivDataTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "LOG_ID_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "LOG_ID_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivDataTemplate$StateTemplate;", "STATES_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivData$State;", "STATES_VALIDATOR", "Lcom/yandex/div2/DivTimerTemplate;", "TIMERS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivTimer;", "TIMERS_VALIDATOR", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div2/DivTransitionSelector;", "TRANSITION_ANIMATION_SELECTOR_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivVariableTemplate;", "VARIABLES_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivVariable;", "VARIABLES_VALIDATOR", "Lcom/yandex/div2/DivTriggerTemplate;", "VARIABLE_TRIGGERS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivTrigger;", "VARIABLE_TRIGGERS_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: DivDataTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivDataTemplate$StateTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivData$State;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class StateTemplate implements JSONSerializable, JsonTemplate<DivData.State> {

        /* renamed from: c */
        @NotNull
        public static final Companion f35498c = new Companion(null);

        /* renamed from: d */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Div> f35499d = new Function3<String, JSONObject, ParsingEnvironment, Div>() { // from class: com.yandex.div2.DivDataTemplate$StateTemplate$Companion$DIV_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Div mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Div.Companion companion = Div.f34418a;
                Function2<ParsingEnvironment, JSONObject, Div> function2 = Div.f34419b;
                parsingEnvironment2.getF34328a();
                return (Div) JsonParser.m17313e(jSONObject2, str2, function2, C2904b.f33858e, parsingEnvironment2);
            }
        };

        /* renamed from: e */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Long> f35500e = new Function3<String, JSONObject, ParsingEnvironment, Long>() { // from class: com.yandex.div2.DivDataTemplate$StateTemplate$Companion$STATE_ID_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Long mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                parsingEnvironment2.getF34328a();
                return (Long) JsonParser.m17312d(jSONObject2, str2, function1, C2904b.f33858e);
            }
        };

        /* renamed from: f */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, StateTemplate> f35501f = new Function2<ParsingEnvironment, JSONObject, StateTemplate>() { // from class: com.yandex.div2.DivDataTemplate$StateTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivDataTemplate.StateTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivDataTemplate.StateTemplate(env, null, false, it, 6);
            }
        };

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Field<DivTemplate> f35502a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Field<Long> f35503b;

        /* compiled from: DivDataTemplate.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivDataTemplate$StateTemplate$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        public StateTemplate(ParsingEnvironment parsingEnvironment, StateTemplate stateTemplate, boolean z, JSONObject jSONObject, int i2) {
            z = (i2 & 4) != 0 ? false : z;
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivTemplate.Companion companion = DivTemplate.f39864a;
            this.f35502a = JsonTemplateParser.m17345f(jSONObject, "div", z, null, DivTemplate.f39865b, f34328a, parsingEnvironment);
            this.f35503b = JsonTemplateParser.m17344e(jSONObject, "state_id", z, null, ParsingConvertersKt.f33831e, f34328a, parsingEnvironment);
        }

        @Override // com.yandex.div.json.JsonTemplate
        /* renamed from: a */
        public DivData.State mo17514a(ParsingEnvironment env, JSONObject data) {
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(data, "data");
            return new DivData.State((Div) FieldKt.m17383i(this.f35502a, env, "div", data, f35499d), ((Number) FieldKt.m17376b(this.f35503b, env, "state_id", data, f35500e)).longValue());
        }
    }

    static {
        int i2 = TypeHelper.f33843a;
        f35467h = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivTransitionSelector.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivDataTemplate$Companion$TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivTransitionSelector);
            }
        });
        f35468i = C3045g.f41381o;
        f35469j = C3045g.f41382p;
        f35470k = C3047h.f41445r;
        f35471l = C3047h.f41446s;
        f35472m = C3047h.f41447t;
        f35473n = C3047h.f41448u;
        f35474o = C3047h.f41449v;
        f35475p = C3047h.f41450w;
        f35476q = C3047h.f41451x;
        f35477r = C3047h.f41452y;
        f35478s = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivDataTemplate$Companion$LOG_ID_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17311c(jSONObject2, str2, DivDataTemplate.f35469j, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f35479t = new Function3<String, JSONObject, ParsingEnvironment, List<DivData.State>>() { // from class: com.yandex.div2.DivDataTemplate$Companion$STATES_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivData.State> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivData.State.Companion companion = DivData.State.f35461c;
                List<DivData.State> m17308A = JsonParser.m17308A(jSONObject2, str2, DivData.State.f35462d, DivDataTemplate.f35470k, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                Intrinsics.m32178g(m17308A, "readStrictList(json, key…LIDATOR, env.logger, env)");
                return m17308A;
            }
        };
        f35480u = new Function3<String, JSONObject, ParsingEnvironment, List<DivTimer>>() { // from class: com.yandex.div2.DivDataTemplate$Companion$TIMERS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTimer> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTimer.Companion companion = DivTimer.f40442g;
                return JsonParser.m17333y(jSONObject2, str2, DivTimer.f40450o, DivDataTemplate.f35472m, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f35481v = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivTransitionSelector>>() { // from class: com.yandex.div2.DivDataTemplate$Companion$TRANSITION_ANIMATION_SELECTOR_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivTransitionSelector> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransitionSelector.Converter converter = DivTransitionSelector.f40573c;
                Function1<String, DivTransitionSelector> function1 = DivTransitionSelector.f40574d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivTransitionSelector> expression = DivDataTemplate.f35466g;
                Expression<DivTransitionSelector> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivDataTemplate.f35467h);
                return m17330v == null ? expression : m17330v;
            }
        };
        f35482w = new Function3<String, JSONObject, ParsingEnvironment, List<DivTrigger>>() { // from class: com.yandex.div2.DivDataTemplate$Companion$VARIABLE_TRIGGERS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTrigger> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTrigger.Companion companion = DivTrigger.f40590d;
                return JsonParser.m17333y(jSONObject2, str2, DivTrigger.f40594h, DivDataTemplate.f35474o, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f35483x = new Function3<String, JSONObject, ParsingEnvironment, List<DivVariable>>() { // from class: com.yandex.div2.DivDataTemplate$Companion$VARIABLES_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivVariable> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivVariable.Companion companion = DivVariable.f40624a;
                return JsonParser.m17333y(jSONObject2, str2, DivVariable.f40625b, DivDataTemplate.f35476q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        DivDataTemplate$Companion$CREATOR$1 divDataTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivDataTemplate>() { // from class: com.yandex.div2.DivDataTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivDataTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivDataTemplate(env, null, false, it, 6);
            }
        };
    }

    public DivDataTemplate(ParsingEnvironment parsingEnvironment, DivDataTemplate divDataTemplate, boolean z, JSONObject jSONObject, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
        this.f35484a = JsonTemplateParser.m17341b(jSONObject, "log_id", z, null, f35468i, f34328a, parsingEnvironment);
        StateTemplate.Companion companion = StateTemplate.f35498c;
        this.f35485b = JsonTemplateParser.m17362w(jSONObject, "states", z, null, StateTemplate.f35501f, f35471l, f34328a, parsingEnvironment);
        DivTimerTemplate.Companion companion2 = DivTimerTemplate.f40459g;
        this.f35486c = JsonTemplateParser.m17360u(jSONObject, "timers", z, null, DivTimerTemplate.f40458A, f35473n, f34328a, parsingEnvironment);
        DivTransitionSelector.Converter converter = DivTransitionSelector.f40573c;
        this.f35487d = JsonTemplateParser.m17358s(jSONObject, "transition_animation_selector", z, null, DivTransitionSelector.f40574d, f34328a, parsingEnvironment, f35467h);
        DivTriggerTemplate.Companion companion3 = DivTriggerTemplate.f40607d;
        this.f35488e = JsonTemplateParser.m17360u(jSONObject, "variable_triggers", z, null, DivTriggerTemplate.f40615l, f35475p, f34328a, parsingEnvironment);
        DivVariableTemplate.Companion companion4 = DivVariableTemplate.f40634a;
        this.f35489f = JsonTemplateParser.m17360u(jSONObject, "variables", z, null, DivVariableTemplate.f40635b, f35477r, f34328a, parsingEnvironment);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivData mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        String str = (String) FieldKt.m17376b(this.f35484a, env, "log_id", data, f35478s);
        List m17384j = FieldKt.m17384j(this.f35485b, env, "states", data, f35470k, f35479t);
        List m17382h = FieldKt.m17382h(this.f35486c, env, "timers", data, f35472m, f35480u);
        Expression<DivTransitionSelector> expression = (Expression) FieldKt.m17378d(this.f35487d, env, "transition_animation_selector", data, f35481v);
        if (expression == null) {
            expression = f35466g;
        }
        return new DivData(str, m17384j, m17382h, expression, FieldKt.m17382h(this.f35488e, env, "variable_triggers", data, f35474o, f35482w), FieldKt.m17382h(this.f35489f, env, "variables", data, f35476q, f35483x), null);
    }
}
