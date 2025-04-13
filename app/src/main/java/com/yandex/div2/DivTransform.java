package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivPivot;
import com.yandex.div2.DivTransform;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivTransform.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivTransform implements JSONSerializable {

    /* renamed from: d */
    @NotNull
    public static final Companion f40551d = new Companion(null);

    /* renamed from: e */
    @NotNull
    public static final DivPivot.Percentage f40552e;

    /* renamed from: f */
    @NotNull
    public static final DivPivot.Percentage f40553f;

    /* renamed from: g */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivTransform> f40554g;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final DivPivot f40555a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final DivPivot f40556b;

    /* renamed from: c */
    @JvmField
    @Nullable
    public final Expression<Double> f40557c;

    /* compiled from: DivTransform.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivTransform$Companion;", "", "Lcom/yandex/div2/DivPivot$Percentage;", "PIVOT_X_DEFAULT_VALUE", "Lcom/yandex/div2/DivPivot$Percentage;", "PIVOT_Y_DEFAULT_VALUE", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        Double valueOf = Double.valueOf(50.0d);
        f40552e = new DivPivot.Percentage(new DivPivotPercentage(companion.m17539a(valueOf)));
        f40553f = new DivPivot.Percentage(new DivPivotPercentage(companion.m17539a(valueOf)));
        f40554g = new Function2<ParsingEnvironment, JSONObject, DivTransform>() { // from class: com.yandex.div2.DivTransform$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivTransform invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivTransform.Companion companion2 = DivTransform.f40551d;
                ParsingErrorLogger f34328a = env.getF34328a();
                DivPivot.Companion companion3 = DivPivot.f38028a;
                Function2<ParsingEnvironment, JSONObject, DivPivot> function2 = DivPivot.f38029b;
                DivPivot divPivot = (DivPivot) JsonParser.m17322n(it, "pivot_x", function2, f34328a, env);
                if (divPivot == null) {
                    divPivot = DivTransform.f40552e;
                }
                DivPivot divPivot2 = divPivot;
                Intrinsics.m32178g(divPivot2, "JsonParser.readOptional(… ?: PIVOT_X_DEFAULT_VALUE");
                DivPivot divPivot3 = (DivPivot) JsonParser.m17322n(it, "pivot_y", function2, f34328a, env);
                if (divPivot3 == null) {
                    divPivot3 = DivTransform.f40553f;
                }
                Intrinsics.m32178g(divPivot3, "JsonParser.readOptional(… ?: PIVOT_Y_DEFAULT_VALUE");
                return new DivTransform(divPivot2, divPivot3, JsonParser.m17329u(it, "rotation", ParsingConvertersKt.f33830d, f34328a, env, TypeHelpersKt.f33851d));
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivTransform() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
    }

    @DivModelInternalApi
    public DivTransform(@NotNull DivPivot pivotX, @NotNull DivPivot pivotY, @Nullable Expression<Double> expression) {
        Intrinsics.m32179h(pivotX, "pivotX");
        Intrinsics.m32179h(pivotY, "pivotY");
        this.f40555a = pivotX;
        this.f40556b = pivotY;
        this.f40557c = expression;
    }

    public /* synthetic */ DivTransform(DivPivot divPivot, DivPivot divPivot2, Expression expression, int i2) {
        this((i2 & 1) != 0 ? f40552e : null, (i2 & 2) != 0 ? f40553f : null, null);
    }
}
