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
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivWrapContentSize;
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

/* compiled from: DivWrapContentSize.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div2/DivWrapContentSize;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "ConstraintSize", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivWrapContentSize implements JSONSerializable {

    /* renamed from: d */
    @NotNull
    public static final Companion f40994d = new Companion(null);

    /* renamed from: a */
    @JvmField
    @Nullable
    public final Expression<Boolean> f40995a;

    /* renamed from: b */
    @JvmField
    @Nullable
    public final ConstraintSize f40996b;

    /* renamed from: c */
    @JvmField
    @Nullable
    public final ConstraintSize f40997c;

    /* compiled from: DivWrapContentSize.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivWrapContentSize$Companion;", "", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivWrapContentSize m17729a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            Expression m17329u = JsonParser.m17329u(jSONObject, "constrained", ParsingConvertersKt.f33829c, f34328a, parsingEnvironment, TypeHelpersKt.f33848a);
            ConstraintSize.Companion companion = ConstraintSize.f40999c;
            Function2<ParsingEnvironment, JSONObject, ConstraintSize> function2 = ConstraintSize.f41003g;
            return new DivWrapContentSize(m17329u, (ConstraintSize) JsonParser.m17322n(jSONObject, "max_size", function2, f34328a, parsingEnvironment), (ConstraintSize) JsonParser.m17322n(jSONObject, "min_size", function2, f34328a, parsingEnvironment));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivWrapContentSize.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivWrapContentSize$ConstraintSize;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class ConstraintSize implements JSONSerializable {

        /* renamed from: c */
        @NotNull
        public static final Companion f40999c = new Companion(null);

        /* renamed from: d */
        @NotNull
        public static final Expression<DivSizeUnit> f41000d = Expression.f34334a.m17539a(DivSizeUnit.DP);

        /* renamed from: e */
        @NotNull
        public static final TypeHelper<DivSizeUnit> f41001e;

        /* renamed from: f */
        @NotNull
        public static final ValueValidator<Long> f41002f;

        /* renamed from: g */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, ConstraintSize> f41003g;

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Expression<DivSizeUnit> f41004a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Expression<Long> f41005b;

        /* compiled from: DivWrapContentSize.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, m31884d2 = {"Lcom/yandex/div2/DivWrapContentSize$ConstraintSize$Companion;", "", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivSizeUnit;", "TYPE_HELPER_UNIT", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div/json/expressions/Expression;", "UNIT_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "VALUE_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "VALUE_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        static {
            int i2 = TypeHelper.f33843a;
            f41001e = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivSizeUnit.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivWrapContentSize$ConstraintSize$Companion$TYPE_HELPER_UNIT$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivSizeUnit);
                }
            });
            f41002f = C3068r0.f41988r;
            f41003g = new Function2<ParsingEnvironment, JSONObject, ConstraintSize>() { // from class: com.yandex.div2.DivWrapContentSize$ConstraintSize$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                public DivWrapContentSize.ConstraintSize invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    ParsingEnvironment env = parsingEnvironment;
                    JSONObject it = jSONObject;
                    Intrinsics.m32179h(env, "env");
                    Intrinsics.m32179h(it, "it");
                    DivWrapContentSize.ConstraintSize.Companion companion = DivWrapContentSize.ConstraintSize.f40999c;
                    ParsingErrorLogger f34328a = env.getF34328a();
                    DivSizeUnit.Converter converter = DivSizeUnit.f38845c;
                    Function1<String, DivSizeUnit> function1 = DivSizeUnit.f38846d;
                    Expression<DivSizeUnit> expression = DivWrapContentSize.ConstraintSize.f41000d;
                    Expression<DivSizeUnit> m17330v = JsonParser.m17330v(it, "unit", function1, f34328a, env, expression, DivWrapContentSize.ConstraintSize.f41001e);
                    if (m17330v == null) {
                        m17330v = expression;
                    }
                    return new DivWrapContentSize.ConstraintSize(m17330v, JsonParser.m17316h(it, "value", ParsingConvertersKt.f33831e, DivWrapContentSize.ConstraintSize.f41002f, f34328a, TypeHelpersKt.f33849b));
                }
            };
        }

        @DivModelInternalApi
        public ConstraintSize(@NotNull Expression<DivSizeUnit> unit, @NotNull Expression<Long> value) {
            Intrinsics.m32179h(unit, "unit");
            Intrinsics.m32179h(value, "value");
            this.f41004a = unit;
            this.f41005b = value;
        }
    }

    static {
        DivWrapContentSize$Companion$CREATOR$1 divWrapContentSize$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivWrapContentSize>() { // from class: com.yandex.div2.DivWrapContentSize$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivWrapContentSize invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivWrapContentSize.f40994d.m17729a(env, it);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivWrapContentSize() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
    }

    @DivModelInternalApi
    public DivWrapContentSize(@Nullable Expression<Boolean> expression, @Nullable ConstraintSize constraintSize, @Nullable ConstraintSize constraintSize2) {
        this.f40995a = expression;
        this.f40996b = constraintSize;
        this.f40997c = constraintSize2;
    }

    public /* synthetic */ DivWrapContentSize(Expression expression, ConstraintSize constraintSize, ConstraintSize constraintSize2, int i2) {
        this(null, null, null);
    }
}
