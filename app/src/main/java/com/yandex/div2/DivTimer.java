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
import com.yandex.div2.DivAction;
import com.yandex.div2.DivTimer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivTimer.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivTimer;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivTimer implements JSONSerializable {

    /* renamed from: g */
    @NotNull
    public static final Companion f40442g = new Companion(null);

    /* renamed from: h */
    @NotNull
    public static final Expression<Long> f40443h = Expression.f34334a.m17539a(0L);

    /* renamed from: i */
    @NotNull
    public static final ValueValidator<Long> f40444i = C3060n0.f41773j;

    /* renamed from: j */
    @NotNull
    public static final ListValidator<DivAction> f40445j = C3062o0.f41821b;

    /* renamed from: k */
    @NotNull
    public static final ValueValidator<String> f40446k = C3060n0.f41774k;

    /* renamed from: l */
    @NotNull
    public static final ListValidator<DivAction> f40447l = C3062o0.f41822c;

    /* renamed from: m */
    @NotNull
    public static final ValueValidator<Long> f40448m = C3060n0.f41775l;

    /* renamed from: n */
    @NotNull
    public static final ValueValidator<String> f40449n = C3060n0.f41776m;

    /* renamed from: o */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivTimer> f40450o = new Function2<ParsingEnvironment, JSONObject, DivTimer>() { // from class: com.yandex.div2.DivTimer$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivTimer invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivTimer.Companion companion = DivTimer.f40442g;
            ParsingErrorLogger f34328a = env.getF34328a();
            Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator = DivTimer.f40444i;
            Expression<Long> expression = DivTimer.f40443h;
            TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
            Expression<Long> m17328t = JsonParser.m17328t(it, "duration", function1, valueValidator, f34328a, expression, typeHelper);
            if (m17328t != null) {
                expression = m17328t;
            }
            DivAction.Companion companion2 = DivAction.f34546g;
            Function2<ParsingEnvironment, JSONObject, DivAction> function2 = DivAction.f34550k;
            return new DivTimer(expression, JsonParser.m17333y(it, "end_actions", function2, DivTimer.f40445j, f34328a, env), (String) JsonParser.m17311c(it, "id", DivTimer.f40446k, f34328a, env), JsonParser.m17333y(it, "tick_actions", function2, DivTimer.f40447l, f34328a, env), JsonParser.m17327s(it, "tick_interval", function1, DivTimer.f40448m, f34328a, env, typeHelper), (String) JsonParser.m17323o(it, "value_variable", DivTimer.f40449n, f34328a, env));
        }
    };

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Expression<Long> f40451a;

    /* renamed from: b */
    @JvmField
    @Nullable
    public final List<DivAction> f40452b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final String f40453c;

    /* renamed from: d */
    @JvmField
    @Nullable
    public final List<DivAction> f40454d;

    /* renamed from: e */
    @JvmField
    @Nullable
    public final Expression<Long> f40455e;

    /* renamed from: f */
    @JvmField
    @Nullable
    public final String f40456f;

    /* compiled from: DivTimer.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\b¨\u0006\u0016"}, m31884d2 = {"Lcom/yandex/div2/DivTimer$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "DURATION_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "DURATION_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "END_ACTIONS_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "TICK_ACTIONS_VALIDATOR", "TICK_INTERVAL_TEMPLATE_VALIDATOR", "TICK_INTERVAL_VALIDATOR", "VALUE_VARIABLE_TEMPLATE_VALIDATOR", "VALUE_VARIABLE_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivTimer(@NotNull Expression<Long> duration, @Nullable List<? extends DivAction> list, @NotNull String id2, @Nullable List<? extends DivAction> list2, @Nullable Expression<Long> expression, @Nullable String str) {
        Intrinsics.m32179h(duration, "duration");
        Intrinsics.m32179h(id2, "id");
        this.f40451a = duration;
        this.f40452b = list;
        this.f40453c = id2;
        this.f40454d = list2;
        this.f40455e = expression;
        this.f40456f = str;
    }
}
