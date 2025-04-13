package com.yandex.div.core.view2.divs;

import android.graphics.Typeface;
import android.util.DisplayMetrics;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.internal.widget.slider.SliderTextStyle;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivPoint;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivSlider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DivSliderBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivSliderBinderKt {
    /* renamed from: a */
    public static final SliderTextStyle m17033a(DivSlider.TextStyle textStyle, DisplayMetrics displayMetrics, DivTypefaceProvider divTypefaceProvider, ExpressionResolver expressionResolver) {
        Number valueOf;
        DivDimension divDimension;
        DivDimension divDimension2;
        long longValue = textStyle.f38987a.mo17535b(expressionResolver).longValue();
        DivSizeUnit unit = textStyle.f38988b.mo17535b(expressionResolver);
        Intrinsics.m32179h(unit, "unit");
        int ordinal = unit.ordinal();
        if (ordinal == 0) {
            valueOf = Integer.valueOf(BaseDivViewExtensionsKt.m16961u(Long.valueOf(longValue), displayMetrics));
        } else if (ordinal == 1) {
            valueOf = Integer.valueOf(BaseDivViewExtensionsKt.m16927Q(Long.valueOf(longValue), displayMetrics));
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            valueOf = Long.valueOf(longValue);
        }
        float floatValue = valueOf.floatValue();
        Typeface m16914D = BaseDivViewExtensionsKt.m16914D(textStyle.f38989c.mo17535b(expressionResolver), divTypefaceProvider);
        DivPoint divPoint = textStyle.f38990d;
        float m16934X = (divPoint == null || (divDimension2 = divPoint.f38066a) == null) ? 0.0f : BaseDivViewExtensionsKt.m16934X(divDimension2, displayMetrics, expressionResolver);
        DivPoint divPoint2 = textStyle.f38990d;
        return new SliderTextStyle(floatValue, m16914D, m16934X, (divPoint2 == null || (divDimension = divPoint2.f38067b) == null) ? 0.0f : BaseDivViewExtensionsKt.m16934X(divDimension, displayMetrics, expressionResolver), textStyle.f38991e.mo17535b(expressionResolver).intValue());
    }
}
