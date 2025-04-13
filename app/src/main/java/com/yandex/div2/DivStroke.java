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
import com.yandex.div2.DivStroke;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivStroke.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivStroke;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivStroke implements JSONSerializable {

    /* renamed from: d */
    @NotNull
    public static final Companion f39434d = new Companion(null);

    /* renamed from: e */
    @NotNull
    public static final Expression<DivSizeUnit> f39435e;

    /* renamed from: f */
    @NotNull
    public static final Expression<Long> f39436f;

    /* renamed from: g */
    @NotNull
    public static final TypeHelper<DivSizeUnit> f39437g;

    /* renamed from: h */
    @NotNull
    public static final ValueValidator<Long> f39438h;

    /* renamed from: i */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivStroke> f39439i;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Expression<Integer> f39440a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Expression<DivSizeUnit> f39441b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Expression<Long> f39442c;

    /* compiled from: DivStroke.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, m31884d2 = {"Lcom/yandex/div2/DivStroke$Companion;", "", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivSizeUnit;", "TYPE_HELPER_UNIT", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div/json/expressions/Expression;", "UNIT_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/ValueValidator;", "WIDTH_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "WIDTH_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f39435e = companion.m17539a(DivSizeUnit.DP);
        f39436f = companion.m17539a(1L);
        int i2 = TypeHelper.f33843a;
        f39437g = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivSizeUnit.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivStroke$Companion$TYPE_HELPER_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivSizeUnit);
            }
        });
        f39438h = C3048h0.f41465m;
        f39439i = new Function2<ParsingEnvironment, JSONObject, DivStroke>() { // from class: com.yandex.div2.DivStroke$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivStroke invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivStroke.Companion companion2 = DivStroke.f39434d;
                ParsingErrorLogger f34328a = env.getF34328a();
                Expression m17317i = JsonParser.m17317i(it, "color", ParsingConvertersKt.f33827a, f34328a, env, TypeHelpersKt.f33853f);
                DivSizeUnit.Converter converter = DivSizeUnit.f38845c;
                Function1<String, DivSizeUnit> function1 = DivSizeUnit.f38846d;
                Expression<DivSizeUnit> expression = DivStroke.f39435e;
                Expression<DivSizeUnit> m17330v = JsonParser.m17330v(it, "unit", function1, f34328a, env, expression, DivStroke.f39437g);
                if (m17330v != null) {
                    expression = m17330v;
                }
                Function1<Number, Long> function12 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivStroke.f39438h;
                Expression<Long> expression2 = DivStroke.f39436f;
                Expression<Long> m17328t = JsonParser.m17328t(it, "width", function12, valueValidator, f34328a, expression2, TypeHelpersKt.f33849b);
                if (m17328t != null) {
                    expression2 = m17328t;
                }
                return new DivStroke(m17317i, expression, expression2);
            }
        };
    }

    @DivModelInternalApi
    public DivStroke(@NotNull Expression<Integer> color, @NotNull Expression<DivSizeUnit> unit, @NotNull Expression<Long> width) {
        Intrinsics.m32179h(color, "color");
        Intrinsics.m32179h(unit, "unit");
        Intrinsics.m32179h(width, "width");
        this.f39440a = color;
        this.f39441b = unit;
        this.f39442c = width;
    }
}
