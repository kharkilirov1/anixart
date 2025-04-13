package com.yandex.div.internal.widget.tabs;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div.internal.widget.tabs.e */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2920e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f34308a;

    /* renamed from: b */
    public final /* synthetic */ Object f34309b;

    public /* synthetic */ C2920e(ViewGroup viewGroup, int i2) {
        this.f34308a = i2;
        this.f34309b = viewGroup;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34308a) {
            case 0:
                BaseIndicatorTabLayout.OvalIndicators ovalIndicators = (BaseIndicatorTabLayout.OvalIndicators) this.f34309b;
                int i2 = BaseIndicatorTabLayout.OvalIndicators.f34222w;
                Objects.requireNonNull(ovalIndicators);
                ovalIndicators.f34241t = 1.0f - valueAnimator.getAnimatedFraction();
                ViewCompat.m2183W(ovalIndicators);
                break;
            default:
                BaseIndicatorTabLayout baseIndicatorTabLayout = (BaseIndicatorTabLayout) this.f34309b;
                TimeInterpolator timeInterpolator = BaseIndicatorTabLayout.f34185F;
                Objects.requireNonNull(baseIndicatorTabLayout);
                baseIndicatorTabLayout.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
        }
    }
}
