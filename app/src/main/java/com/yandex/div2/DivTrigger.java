package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivTrigger;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTrigger.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div2/DivTrigger;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "Mode", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivTrigger implements JSONSerializable {

    /* renamed from: d */
    @NotNull
    public static final Companion f40590d = new Companion(null);

    /* renamed from: e */
    @NotNull
    public static final Expression<Mode> f40591e = Expression.f34334a.m17539a(Mode.ON_CONDITION);

    /* renamed from: f */
    @NotNull
    public static final TypeHelper<Mode> f40592f;

    /* renamed from: g */
    @NotNull
    public static final ListValidator<DivAction> f40593g;

    /* renamed from: h */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivTrigger> f40594h;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final List<DivAction> f40595a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Expression<Boolean> f40596b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Expression<Mode> f40597c;

    /* compiled from: DivTrigger.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m31884d2 = {"Lcom/yandex/div2/DivTrigger$Companion;", "", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div2/DivTrigger$Mode;", "MODE_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_MODE", "Lcom/yandex/div/internal/parser/TypeHelper;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivTrigger.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivTrigger$Mode;", "", "Converter", "ON_CONDITION", "ON_VARIABLE", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum Mode {
        ON_CONDITION("on_condition"),
        ON_VARIABLE("on_variable");


        /* renamed from: c */
        @NotNull
        public static final Converter f40600c = new Converter(null);

        /* renamed from: d */
        @NotNull
        public static final Function1<String, Mode> f40601d = new Function1<String, Mode>() { // from class: com.yandex.div2.DivTrigger$Mode$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            public DivTrigger.Mode invoke(String str) {
                String string = str;
                Intrinsics.m32179h(string, "string");
                DivTrigger.Mode mode = DivTrigger.Mode.ON_CONDITION;
                if (Intrinsics.m32174c(string, "on_condition")) {
                    return mode;
                }
                DivTrigger.Mode mode2 = DivTrigger.Mode.ON_VARIABLE;
                if (Intrinsics.m32174c(string, "on_variable")) {
                    return mode2;
                }
                return null;
            }
        };

        /* renamed from: b */
        @NotNull
        public final String f40605b;

        /* compiled from: DivTrigger.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTrigger$Mode$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Converter {
            public Converter() {
            }

            public Converter(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        Mode(String str) {
            this.f40605b = str;
        }
    }

    static {
        int i2 = TypeHelper.f33843a;
        f40592f = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(Mode.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTrigger$Companion$TYPE_HELPER_MODE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivTrigger.Mode);
            }
        });
        f40593g = C3062o0.f41827h;
        f40594h = new Function2<ParsingEnvironment, JSONObject, DivTrigger>() { // from class: com.yandex.div2.DivTrigger$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivTrigger invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivTrigger.Companion companion = DivTrigger.f40590d;
                ParsingErrorLogger f33097d = env.getF33097d();
                DivAction.Companion companion2 = DivAction.f34546g;
                List m17321m = JsonParser.m17321m(it, "actions", DivAction.f34550k, DivTrigger.f40593g, f33097d, env);
                Intrinsics.m32178g(m17321m, "readList(json, \"actions\"…S_VALIDATOR, logger, env)");
                Expression m17317i = JsonParser.m17317i(it, "condition", ParsingConvertersKt.f33829c, f33097d, env, TypeHelpersKt.f33848a);
                DivTrigger.Mode.Converter converter = DivTrigger.Mode.f40600c;
                Function1<String, DivTrigger.Mode> function1 = DivTrigger.Mode.f40601d;
                Expression<DivTrigger.Mode> expression = DivTrigger.f40591e;
                Expression<DivTrigger.Mode> m17330v = JsonParser.m17330v(it, "mode", function1, f33097d, env, expression, DivTrigger.f40592f);
                if (m17330v != null) {
                    expression = m17330v;
                }
                return new DivTrigger(m17321m, m17317i, expression);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivTrigger(@NotNull List<? extends DivAction> actions, @NotNull Expression<Boolean> condition, @NotNull Expression<Mode> mode) {
        Intrinsics.m32179h(actions, "actions");
        Intrinsics.m32179h(condition, "condition");
        Intrinsics.m32179h(mode, "mode");
        this.f40595a = actions;
        this.f40596b = condition;
        this.f40597c = mode;
    }
}
