package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivSizeUnit;
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

/* compiled from: DivRadialGradientFixedCenter.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientFixedCenter;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivRadialGradientFixedCenter implements JSONSerializable {

    /* renamed from: c */
    @NotNull
    public static final Companion f38098c = new Companion(null);

    /* renamed from: d */
    @NotNull
    public static final Expression<DivSizeUnit> f38099d = Expression.f34334a.m17539a(DivSizeUnit.DP);

    /* renamed from: e */
    @NotNull
    public static final TypeHelper<DivSizeUnit> f38100e;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Expression<DivSizeUnit> f38101a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Expression<Long> f38102b;

    /* compiled from: DivRadialGradientFixedCenter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientFixedCenter$Companion;", "", "", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivSizeUnit;", "TYPE_HELPER_UNIT", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div/json/expressions/Expression;", "UNIT_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivRadialGradientFixedCenter m17675a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivSizeUnit.Converter converter = DivSizeUnit.f38845c;
            Function1<String, DivSizeUnit> function1 = DivSizeUnit.f38846d;
            Expression<DivSizeUnit> expression = DivRadialGradientFixedCenter.f38099d;
            Expression<DivSizeUnit> m17330v = JsonParser.m17330v(jSONObject, "unit", function1, f34328a, parsingEnvironment, expression, DivRadialGradientFixedCenter.f38100e);
            if (m17330v != null) {
                expression = m17330v;
            }
            return new DivRadialGradientFixedCenter(expression, JsonParser.m17317i(jSONObject, "value", ParsingConvertersKt.f33831e, f34328a, parsingEnvironment, TypeHelpersKt.f33849b));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        int i2 = TypeHelper.f33843a;
        f38100e = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivSizeUnit.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivRadialGradientFixedCenter$Companion$TYPE_HELPER_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivSizeUnit);
            }
        });
        DivRadialGradientFixedCenter$Companion$CREATOR$1 divRadialGradientFixedCenter$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivRadialGradientFixedCenter>() { // from class: com.yandex.div2.DivRadialGradientFixedCenter$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivRadialGradientFixedCenter invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivRadialGradientFixedCenter.f38098c.m17675a(env, it);
            }
        };
    }

    @DivModelInternalApi
    public DivRadialGradientFixedCenter(@NotNull Expression<DivSizeUnit> unit, @NotNull Expression<Long> value) {
        Intrinsics.m32179h(unit, "unit");
        Intrinsics.m32179h(value, "value");
        this.f38101a = unit;
        this.f38102b = value;
    }
}
