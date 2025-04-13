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
import com.yandex.div2.DivEdgeInsets;
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

/* compiled from: DivEdgeInsets.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivEdgeInsets;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivEdgeInsets implements JSONSerializable {

    /* renamed from: f */
    @NotNull
    public static final Companion f35607f = new Companion(null);

    /* renamed from: g */
    @NotNull
    public static final Expression<Long> f35608g;

    /* renamed from: h */
    @NotNull
    public static final Expression<Long> f35609h;

    /* renamed from: i */
    @NotNull
    public static final Expression<Long> f35610i;

    /* renamed from: j */
    @NotNull
    public static final Expression<Long> f35611j;

    /* renamed from: k */
    @NotNull
    public static final Expression<DivSizeUnit> f35612k;

    /* renamed from: l */
    @NotNull
    public static final TypeHelper<DivSizeUnit> f35613l;

    /* renamed from: m */
    @NotNull
    public static final ValueValidator<Long> f35614m;

    /* renamed from: n */
    @NotNull
    public static final ValueValidator<Long> f35615n;

    /* renamed from: o */
    @NotNull
    public static final ValueValidator<Long> f35616o;

    /* renamed from: p */
    @NotNull
    public static final ValueValidator<Long> f35617p;

    /* renamed from: q */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivEdgeInsets> f35618q;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Expression<Long> f35619a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Expression<Long> f35620b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Expression<Long> f35621c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Expression<Long> f35622d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Expression<DivSizeUnit> f35623e;

    /* compiled from: DivEdgeInsets.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0005¨\u0006\u0018"}, m31884d2 = {"Lcom/yandex/div2/DivEdgeInsets$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "BOTTOM_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "BOTTOM_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "BOTTOM_VALIDATOR", "LEFT_DEFAULT_VALUE", "LEFT_TEMPLATE_VALIDATOR", "LEFT_VALIDATOR", "RIGHT_DEFAULT_VALUE", "RIGHT_TEMPLATE_VALIDATOR", "RIGHT_VALIDATOR", "TOP_DEFAULT_VALUE", "TOP_TEMPLATE_VALIDATOR", "TOP_VALIDATOR", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivSizeUnit;", "TYPE_HELPER_UNIT", "Lcom/yandex/div/internal/parser/TypeHelper;", "UNIT_DEFAULT_VALUE", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f35608g = companion.m17539a(0L);
        f35609h = companion.m17539a(0L);
        f35610i = companion.m17539a(0L);
        f35611j = companion.m17539a(0L);
        f35612k = companion.m17539a(DivSizeUnit.DP);
        int i2 = TypeHelper.f33843a;
        f35613l = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivSizeUnit.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivEdgeInsets$Companion$TYPE_HELPER_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivSizeUnit);
            }
        });
        f35614m = C3049i.f41479f;
        f35615n = C3049i.f41480g;
        f35616o = C3049i.f41481h;
        f35617p = C3049i.f41482i;
        f35618q = new Function2<ParsingEnvironment, JSONObject, DivEdgeInsets>() { // from class: com.yandex.div2.DivEdgeInsets$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivEdgeInsets invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivEdgeInsets.Companion companion2 = DivEdgeInsets.f35607f;
                ParsingErrorLogger f34328a = env.getF34328a();
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivEdgeInsets.f35614m;
                Expression<Long> expression = DivEdgeInsets.f35608g;
                TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
                Expression<Long> m17328t = JsonParser.m17328t(it, "bottom", function1, valueValidator, f34328a, expression, typeHelper);
                Expression<Long> expression2 = m17328t == null ? expression : m17328t;
                ValueValidator<Long> valueValidator2 = DivEdgeInsets.f35615n;
                Expression<Long> expression3 = DivEdgeInsets.f35609h;
                Expression<Long> m17328t2 = JsonParser.m17328t(it, "left", function1, valueValidator2, f34328a, expression3, typeHelper);
                Expression<Long> expression4 = m17328t2 == null ? expression3 : m17328t2;
                ValueValidator<Long> valueValidator3 = DivEdgeInsets.f35616o;
                Expression<Long> expression5 = DivEdgeInsets.f35610i;
                Expression<Long> m17328t3 = JsonParser.m17328t(it, "right", function1, valueValidator3, f34328a, expression5, typeHelper);
                Expression<Long> expression6 = m17328t3 == null ? expression5 : m17328t3;
                ValueValidator<Long> valueValidator4 = DivEdgeInsets.f35617p;
                Expression<Long> expression7 = DivEdgeInsets.f35611j;
                Expression<Long> m17328t4 = JsonParser.m17328t(it, "top", function1, valueValidator4, f34328a, expression7, typeHelper);
                Expression<Long> expression8 = m17328t4 == null ? expression7 : m17328t4;
                DivSizeUnit.Converter converter = DivSizeUnit.f38845c;
                Function1<String, DivSizeUnit> function12 = DivSizeUnit.f38846d;
                Expression<DivSizeUnit> expression9 = DivEdgeInsets.f35612k;
                Expression<DivSizeUnit> m17330v = JsonParser.m17330v(it, "unit", function12, f34328a, env, expression9, DivEdgeInsets.f35613l);
                return new DivEdgeInsets(expression2, expression4, expression6, expression8, m17330v == null ? expression9 : m17330v);
            }
        };
    }

    @DivModelInternalApi
    public DivEdgeInsets() {
        this(null, null, null, null, null, 31);
    }

    @DivModelInternalApi
    public DivEdgeInsets(@NotNull Expression<Long> bottom, @NotNull Expression<Long> left, @NotNull Expression<Long> right, @NotNull Expression<Long> top, @NotNull Expression<DivSizeUnit> unit) {
        Intrinsics.m32179h(bottom, "bottom");
        Intrinsics.m32179h(left, "left");
        Intrinsics.m32179h(right, "right");
        Intrinsics.m32179h(top, "top");
        Intrinsics.m32179h(unit, "unit");
        this.f35619a = bottom;
        this.f35620b = left;
        this.f35621c = right;
        this.f35622d = top;
        this.f35623e = unit;
    }

    public /* synthetic */ DivEdgeInsets(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, int i2) {
        this((i2 & 1) != 0 ? f35608g : expression, (i2 & 2) != 0 ? f35609h : expression2, (i2 & 4) != 0 ? f35610i : expression3, (i2 & 8) != 0 ? f35611j : expression4, (i2 & 16) != 0 ? f35612k : null);
    }
}
