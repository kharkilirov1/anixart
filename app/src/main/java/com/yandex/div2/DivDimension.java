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
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivSizeUnit;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivDimension.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivDimension;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivDimension implements JSONSerializable {

    /* renamed from: c */
    @NotNull
    public static final Companion f35517c = new Companion(null);

    /* renamed from: d */
    @NotNull
    public static final Expression<DivSizeUnit> f35518d = Expression.f34334a.m17539a(DivSizeUnit.DP);

    /* renamed from: e */
    @NotNull
    public static final TypeHelper<DivSizeUnit> f35519e;

    /* renamed from: f */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivDimension> f35520f;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Expression<DivSizeUnit> f35521a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Expression<Double> f35522b;

    /* compiled from: DivDimension.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div2/DivDimension$Companion;", "", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivSizeUnit;", "TYPE_HELPER_UNIT", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div/json/expressions/Expression;", "UNIT_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        int i2 = TypeHelper.f33843a;
        f35519e = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivSizeUnit.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivDimension$Companion$TYPE_HELPER_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivSizeUnit);
            }
        });
        f35520f = new Function2<ParsingEnvironment, JSONObject, DivDimension>() { // from class: com.yandex.div2.DivDimension$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivDimension invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivDimension.Companion companion = DivDimension.f35517c;
                ParsingErrorLogger f33840b = env.getF33840b();
                DivSizeUnit.Converter converter = DivSizeUnit.f38845c;
                Function1<String, DivSizeUnit> function1 = DivSizeUnit.f38846d;
                Expression<DivSizeUnit> expression = DivDimension.f35518d;
                Expression<DivSizeUnit> m17330v = JsonParser.m17330v(it, "unit", function1, f33840b, env, expression, DivDimension.f35519e);
                if (m17330v != null) {
                    expression = m17330v;
                }
                return new DivDimension(expression, JsonParser.m17317i(it, "value", ParsingConvertersKt.f33830d, f33840b, env, TypeHelpersKt.f33851d));
            }
        };
    }

    @DivModelInternalApi
    public DivDimension(@NotNull Expression<DivSizeUnit> unit, @NotNull Expression<Double> value) {
        Intrinsics.m32179h(unit, "unit");
        Intrinsics.m32179h(value, "value");
        this.f35521a = unit;
        this.f35522b = value;
    }
}
