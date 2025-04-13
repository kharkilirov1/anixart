package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.C2900a;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAbsoluteEdgeInsets;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivAbsoluteEdgeInsets.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivAbsoluteEdgeInsets;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivAbsoluteEdgeInsets implements JSONSerializable {

    /* renamed from: e */
    @NotNull
    public static final Companion f34437e = new Companion(null);

    /* renamed from: f */
    @NotNull
    public static final Expression<Long> f34438f;

    /* renamed from: g */
    @NotNull
    public static final Expression<Long> f34439g;

    /* renamed from: h */
    @NotNull
    public static final Expression<Long> f34440h;

    /* renamed from: i */
    @NotNull
    public static final Expression<Long> f34441i;

    /* renamed from: j */
    @NotNull
    public static final ValueValidator<Long> f34442j;

    /* renamed from: k */
    @NotNull
    public static final ValueValidator<Long> f34443k;

    /* renamed from: l */
    @NotNull
    public static final ValueValidator<Long> f34444l;

    /* renamed from: m */
    @NotNull
    public static final ValueValidator<Long> f34445m;

    /* renamed from: n */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivAbsoluteEdgeInsets> f34446n;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Expression<Long> f34447a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Expression<Long> f34448b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Expression<Long> f34449c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Expression<Long> f34450d;

    /* compiled from: DivAbsoluteEdgeInsets.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\b¨\u0006\u0013"}, m31884d2 = {"Lcom/yandex/div2/DivAbsoluteEdgeInsets$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "BOTTOM_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "BOTTOM_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "BOTTOM_VALIDATOR", "LEFT_DEFAULT_VALUE", "LEFT_TEMPLATE_VALIDATOR", "LEFT_VALIDATOR", "RIGHT_DEFAULT_VALUE", "RIGHT_TEMPLATE_VALIDATOR", "RIGHT_VALIDATOR", "TOP_DEFAULT_VALUE", "TOP_TEMPLATE_VALIDATOR", "TOP_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f34438f = companion.m17539a(0L);
        f34439g = companion.m17539a(0L);
        f34440h = companion.m17539a(0L);
        f34441i = companion.m17539a(0L);
        f34442j = C2900a.f33729m;
        f34443k = C2900a.f33730n;
        f34444l = C2900a.f33731o;
        f34445m = C2900a.f33732p;
        f34446n = new Function2<ParsingEnvironment, JSONObject, DivAbsoluteEdgeInsets>() { // from class: com.yandex.div2.DivAbsoluteEdgeInsets$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivAbsoluteEdgeInsets invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivAbsoluteEdgeInsets.Companion companion2 = DivAbsoluteEdgeInsets.f34437e;
                ParsingErrorLogger f34328a = env.getF34328a();
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivAbsoluteEdgeInsets.f34442j;
                Expression<Long> expression = DivAbsoluteEdgeInsets.f34438f;
                TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
                Expression<Long> m17328t = JsonParser.m17328t(it, "bottom", function1, valueValidator, f34328a, expression, typeHelper);
                if (m17328t != null) {
                    expression = m17328t;
                }
                ValueValidator<Long> valueValidator2 = DivAbsoluteEdgeInsets.f34443k;
                Expression<Long> expression2 = DivAbsoluteEdgeInsets.f34439g;
                Expression<Long> m17328t2 = JsonParser.m17328t(it, "left", function1, valueValidator2, f34328a, expression2, typeHelper);
                if (m17328t2 != null) {
                    expression2 = m17328t2;
                }
                ValueValidator<Long> valueValidator3 = DivAbsoluteEdgeInsets.f34444l;
                Expression<Long> expression3 = DivAbsoluteEdgeInsets.f34440h;
                Expression<Long> m17328t3 = JsonParser.m17328t(it, "right", function1, valueValidator3, f34328a, expression3, typeHelper);
                if (m17328t3 != null) {
                    expression3 = m17328t3;
                }
                ValueValidator<Long> valueValidator4 = DivAbsoluteEdgeInsets.f34445m;
                Expression<Long> expression4 = DivAbsoluteEdgeInsets.f34441i;
                Expression<Long> m17328t4 = JsonParser.m17328t(it, "top", function1, valueValidator4, f34328a, expression4, typeHelper);
                if (m17328t4 != null) {
                    expression4 = m17328t4;
                }
                return new DivAbsoluteEdgeInsets(expression, expression2, expression3, expression4);
            }
        };
    }

    @DivModelInternalApi
    public DivAbsoluteEdgeInsets() {
        this(null, null, null, null, 15);
    }

    @DivModelInternalApi
    public DivAbsoluteEdgeInsets(@NotNull Expression<Long> bottom, @NotNull Expression<Long> left, @NotNull Expression<Long> right, @NotNull Expression<Long> top) {
        Intrinsics.m32179h(bottom, "bottom");
        Intrinsics.m32179h(left, "left");
        Intrinsics.m32179h(right, "right");
        Intrinsics.m32179h(top, "top");
        this.f34447a = bottom;
        this.f34448b = left;
        this.f34449c = right;
        this.f34450d = top;
    }

    public /* synthetic */ DivAbsoluteEdgeInsets(Expression expression, Expression expression2, Expression expression3, Expression expression4, int i2) {
        this((i2 & 1) != 0 ? f34438f : null, (i2 & 2) != 0 ? f34439g : null, (i2 & 4) != 0 ? f34440h : null, (i2 & 8) != 0 ? f34441i : null);
    }
}
