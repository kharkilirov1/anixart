package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivLinearGradient.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivLinearGradient;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivLinearGradient implements JSONSerializable {

    /* renamed from: c */
    @NotNull
    public static final Companion f37690c = new Companion(null);

    /* renamed from: d */
    @NotNull
    public static final Expression<Long> f37691d = Expression.f34334a.m17539a(0L);

    /* renamed from: e */
    @NotNull
    public static final ValueValidator<Long> f37692e = C3074w.f42138x;

    /* renamed from: f */
    @NotNull
    public static final ListValidator<Integer> f37693f = C3075x.f42146b;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Expression<Long> f37694a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final ExpressionList<Integer> f37695b;

    /* compiled from: DivLinearGradient.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31884d2 = {"Lcom/yandex/div2/DivLinearGradient$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "ANGLE_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ANGLE_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ANGLE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "", "COLORS_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivLinearGradient m17651a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator = DivLinearGradient.f37692e;
            Expression<Long> expression = DivLinearGradient.f37691d;
            Expression<Long> m17328t = JsonParser.m17328t(jSONObject, "angle", function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
            if (m17328t != null) {
                expression = m17328t;
            }
            return new DivLinearGradient(expression, JsonParser.m17319k(jSONObject, "colors", ParsingConvertersKt.f33827a, DivLinearGradient.f37693f, f34328a, parsingEnvironment, TypeHelpersKt.f33853f));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        DivLinearGradient$Companion$CREATOR$1 divLinearGradient$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivLinearGradient>() { // from class: com.yandex.div2.DivLinearGradient$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivLinearGradient invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivLinearGradient.f37690c.m17651a(env, it);
            }
        };
    }

    @DivModelInternalApi
    public DivLinearGradient(@NotNull Expression<Long> angle, @NotNull ExpressionList<Integer> colors) {
        Intrinsics.m32179h(angle, "angle");
        Intrinsics.m32179h(colors, "colors");
        this.f37694a = angle;
        this.f37695b = colors;
    }
}
