package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivPoint;
import com.yandex.div2.DivShadow;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivShadow.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivShadow;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivShadow implements JSONSerializable {

    /* renamed from: e */
    @NotNull
    public static final Companion f38773e = new Companion(null);

    /* renamed from: f */
    @NotNull
    public static final Expression<Double> f38774f;

    /* renamed from: g */
    @NotNull
    public static final Expression<Long> f38775g;

    /* renamed from: h */
    @NotNull
    public static final Expression<Integer> f38776h;

    /* renamed from: i */
    @NotNull
    public static final ValueValidator<Double> f38777i;

    /* renamed from: j */
    @NotNull
    public static final ValueValidator<Long> f38778j;

    /* renamed from: k */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivShadow> f38779k;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Expression<Double> f38780a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Expression<Long> f38781b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Expression<Integer> f38782c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final DivPoint f38783d;

    /* compiled from: DivShadow.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005¨\u0006\u0010"}, m31884d2 = {"Lcom/yandex/div2/DivShadow$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "", "BLUR_DEFAULT_VALUE", "BLUR_TEMPLATE_VALIDATOR", "BLUR_VALIDATOR", "", "COLOR_DEFAULT_VALUE", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f38774f = companion.m17539a(Double.valueOf(0.19d));
        f38775g = companion.m17539a(2L);
        f38776h = companion.m17539a(0);
        f38777i = C3040d0.f41244j;
        f38778j = C3040d0.f41245k;
        f38779k = new Function2<ParsingEnvironment, JSONObject, DivShadow>() { // from class: com.yandex.div2.DivShadow$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivShadow invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivShadow.Companion companion2 = DivShadow.f38773e;
                ParsingErrorLogger f34328a = env.getF34328a();
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ValueValidator<Double> valueValidator = DivShadow.f38777i;
                Expression<Double> expression = DivShadow.f38774f;
                Expression<Double> m17328t = JsonParser.m17328t(it, "alpha", function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
                if (m17328t != null) {
                    expression = m17328t;
                }
                Function1<Number, Long> function12 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator2 = DivShadow.f38778j;
                Expression<Long> expression2 = DivShadow.f38775g;
                Expression<Long> m17328t2 = JsonParser.m17328t(it, "blur", function12, valueValidator2, f34328a, expression2, TypeHelpersKt.f33849b);
                if (m17328t2 != null) {
                    expression2 = m17328t2;
                }
                Function1<Object, Integer> function13 = ParsingConvertersKt.f33827a;
                Expression<Integer> expression3 = DivShadow.f38776h;
                Expression<Integer> m17330v = JsonParser.m17330v(it, "color", function13, f34328a, env, expression3, TypeHelpersKt.f33853f);
                if (m17330v != null) {
                    expression3 = m17330v;
                }
                DivPoint.Companion companion3 = DivPoint.f38064c;
                return new DivShadow(expression, expression2, expression3, (DivPoint) JsonParser.m17313e(it, "offset", DivPoint.f38065d, C2904b.f33858e, env));
            }
        };
    }

    @DivModelInternalApi
    public DivShadow(@NotNull Expression<Double> alpha, @NotNull Expression<Long> blur, @NotNull Expression<Integer> color, @NotNull DivPoint offset) {
        Intrinsics.m32179h(alpha, "alpha");
        Intrinsics.m32179h(blur, "blur");
        Intrinsics.m32179h(color, "color");
        Intrinsics.m32179h(offset, "offset");
        this.f38780a = alpha;
        this.f38781b = blur;
        this.f38782c = color;
        this.f38783d = offset;
    }
}
