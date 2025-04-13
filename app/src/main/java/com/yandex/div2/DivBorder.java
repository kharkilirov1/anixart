package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivCornersRadius;
import com.yandex.div2.DivShadow;
import com.yandex.div2.DivStroke;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivBorder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivBorder;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivBorder implements JSONSerializable {

    /* renamed from: f */
    @NotNull
    public static final Companion f34785f = new Companion(null);

    /* renamed from: g */
    @NotNull
    public static final Expression<Boolean> f34786g = Expression.f34334a.m17539a(Boolean.FALSE);

    /* renamed from: h */
    @NotNull
    public static final ValueValidator<Long> f34787h = C3039d.f41218g;

    /* renamed from: i */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivBorder> f34788i = new Function2<ParsingEnvironment, JSONObject, DivBorder>() { // from class: com.yandex.div2.DivBorder$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivBorder invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivBorder.Companion companion = DivBorder.f34785f;
            ParsingErrorLogger f34328a = env.getF34328a();
            Expression m17327s = JsonParser.m17327s(it, "corner_radius", ParsingConvertersKt.f33831e, DivBorder.f34787h, f34328a, env, TypeHelpersKt.f33849b);
            DivCornersRadius.Companion companion2 = DivCornersRadius.f35216e;
            DivCornersRadius divCornersRadius = (DivCornersRadius) JsonParser.m17322n(it, "corners_radius", DivCornersRadius.f35217f, f34328a, env);
            Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
            Expression<Boolean> expression = DivBorder.f34786g;
            Expression<Boolean> m17330v = JsonParser.m17330v(it, "has_shadow", function1, f34328a, env, expression, TypeHelpersKt.f33848a);
            Expression<Boolean> expression2 = m17330v == null ? expression : m17330v;
            DivShadow.Companion companion3 = DivShadow.f38773e;
            DivShadow divShadow = (DivShadow) JsonParser.m17322n(it, "shadow", DivShadow.f38779k, f34328a, env);
            DivStroke.Companion companion4 = DivStroke.f39434d;
            return new DivBorder(m17327s, divCornersRadius, expression2, divShadow, (DivStroke) JsonParser.m17322n(it, "stroke", DivStroke.f39439i, f34328a, env));
        }
    };

    /* renamed from: a */
    @JvmField
    @Nullable
    public final Expression<Long> f34789a;

    /* renamed from: b */
    @JvmField
    @Nullable
    public final DivCornersRadius f34790b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Expression<Boolean> f34791c;

    /* renamed from: d */
    @JvmField
    @Nullable
    public final DivShadow f34792d;

    /* renamed from: e */
    @JvmField
    @Nullable
    public final DivStroke f34793e;

    /* compiled from: DivBorder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m31884d2 = {"Lcom/yandex/div2/DivBorder$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "CORNER_RADIUS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "CORNER_RADIUS_VALIDATOR", "Lcom/yandex/div/json/expressions/Expression;", "", "HAS_SHADOW_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @DivModelInternalApi
    public DivBorder() {
        this(null, null, null, null, null, 31);
    }

    @DivModelInternalApi
    public DivBorder(@Nullable Expression<Long> expression, @Nullable DivCornersRadius divCornersRadius, @NotNull Expression<Boolean> hasShadow, @Nullable DivShadow divShadow, @Nullable DivStroke divStroke) {
        Intrinsics.m32179h(hasShadow, "hasShadow");
        this.f34789a = expression;
        this.f34790b = divCornersRadius;
        this.f34791c = hasShadow;
        this.f34792d = divShadow;
        this.f34793e = divStroke;
    }

    public /* synthetic */ DivBorder(Expression expression, DivCornersRadius divCornersRadius, Expression expression2, DivShadow divShadow, DivStroke divStroke, int i2) {
        this(null, null, (i2 & 4) != 0 ? f34786g : null, null, null);
    }
}
