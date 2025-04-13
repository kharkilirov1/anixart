package com.yandex.div.core.view2.divs.widgets;

import android.util.DisplayMetrics;
import androidx.annotation.Px;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivStroke;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivBorderDrawer.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivBorderDrawerKt {

    /* compiled from: DivBorderDrawer.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32749a;

        static {
            int[] iArr = new int[DivSizeUnit.values().length];
            DivSizeUnit divSizeUnit = DivSizeUnit.DP;
            iArr[0] = 1;
            DivSizeUnit divSizeUnit2 = DivSizeUnit.SP;
            iArr[1] = 2;
            DivSizeUnit divSizeUnit3 = DivSizeUnit.PX;
            iArr[2] = 3;
            f32749a = iArr;
        }
    }

    @Px
    /* renamed from: a */
    public static final int m17097a(@Nullable DivStroke divStroke, @NotNull ExpressionResolver expressionResolver, @NotNull DisplayMetrics metrics) {
        Expression<Long> expression;
        Long mo17535b;
        Expression<DivSizeUnit> expression2;
        Intrinsics.m32179h(expressionResolver, "expressionResolver");
        Intrinsics.m32179h(metrics, "metrics");
        DivSizeUnit divSizeUnit = null;
        if (divStroke != null && (expression2 = divStroke.f39441b) != null) {
            divSizeUnit = expression2.mo17535b(expressionResolver);
        }
        int i2 = divSizeUnit == null ? -1 : WhenMappings.f32749a[divSizeUnit.ordinal()];
        if (i2 == 1) {
            return BaseDivViewExtensionsKt.m16961u(divStroke.f39442c.mo17535b(expressionResolver), metrics);
        }
        if (i2 == 2) {
            return BaseDivViewExtensionsKt.m16927Q(divStroke.f39442c.mo17535b(expressionResolver), metrics);
        }
        if (i2 == 3) {
            long longValue = divStroke.f39442c.mo17535b(expressionResolver).longValue();
            long j2 = longValue >> 31;
            if (j2 == 0 || j2 == -1) {
                return (int) longValue;
            }
            int i3 = Assert.f33709a;
            return longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        if (divStroke == null || (expression = divStroke.f39442c) == null || (mo17535b = expression.mo17535b(expressionResolver)) == null) {
            return 0;
        }
        long longValue2 = mo17535b.longValue();
        long j3 = longValue2 >> 31;
        if (j3 == 0 || j3 == -1) {
            return (int) longValue2;
        }
        int i4 = Assert.f33709a;
        return longValue2 <= 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
    }
}
