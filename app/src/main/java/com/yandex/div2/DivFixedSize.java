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

/* compiled from: DivFixedSize.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivFixedSize;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivFixedSize implements JSONSerializable {

    /* renamed from: c */
    @NotNull
    public static final Companion f35789c = new Companion(null);

    /* renamed from: d */
    @NotNull
    public static final Expression<DivSizeUnit> f35790d = Expression.f34334a.m17539a(DivSizeUnit.DP);

    /* renamed from: e */
    @NotNull
    public static final TypeHelper<DivSizeUnit> f35791e;

    /* renamed from: f */
    @NotNull
    public static final ValueValidator<Long> f35792f;

    /* renamed from: g */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivFixedSize> f35793g;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Expression<DivSizeUnit> f35794a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Expression<Long> f35795b;

    /* compiled from: DivFixedSize.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, m31884d2 = {"Lcom/yandex/div2/DivFixedSize$Companion;", "", "", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivSizeUnit;", "TYPE_HELPER_UNIT", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div/json/expressions/Expression;", "UNIT_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "VALUE_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "VALUE_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivFixedSize m17620a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivSizeUnit.Converter converter = DivSizeUnit.f38845c;
            Function1<String, DivSizeUnit> function1 = DivSizeUnit.f38846d;
            Expression<DivSizeUnit> expression = DivFixedSize.f35790d;
            Expression<DivSizeUnit> m17330v = JsonParser.m17330v(jSONObject, "unit", function1, f34328a, parsingEnvironment, expression, DivFixedSize.f35791e);
            if (m17330v != null) {
                expression = m17330v;
            }
            return new DivFixedSize(expression, JsonParser.m17316h(jSONObject, "value", ParsingConvertersKt.f33831e, DivFixedSize.f35792f, f34328a, TypeHelpersKt.f33849b));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        int i2 = TypeHelper.f33843a;
        f35791e = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivSizeUnit.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivFixedSize$Companion$TYPE_HELPER_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivSizeUnit);
            }
        });
        f35792f = C3051j.f41547w;
        f35793g = new Function2<ParsingEnvironment, JSONObject, DivFixedSize>() { // from class: com.yandex.div2.DivFixedSize$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivFixedSize invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivFixedSize.f35789c.m17620a(env, it);
            }
        };
    }

    @DivModelInternalApi
    public DivFixedSize(@NotNull Expression<DivSizeUnit> unit, @NotNull Expression<Long> value) {
        Intrinsics.m32179h(unit, "unit");
        Intrinsics.m32179h(value, "value");
        this.f35794a = unit;
        this.f35795b = value;
    }

    public /* synthetic */ DivFixedSize(Expression expression, Expression expression2, int i2) {
        this((i2 & 1) != 0 ? f35790d : null, expression2);
    }
}
