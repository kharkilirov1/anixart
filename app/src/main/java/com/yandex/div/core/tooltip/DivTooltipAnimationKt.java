package com.yandex.div.core.tooltip;

import android.animation.TimeInterpolator;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionSet;
import com.yandex.div.core.animation.SpringInterpolator;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivTooltip;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DivTooltipAnimation.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivTooltipAnimationKt {

    /* compiled from: DivTooltipAnimation.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[DivAnimation.Name.values().length];
            DivAnimation.Name name = DivAnimation.Name.FADE;
            iArr[0] = 1;
            DivAnimation.Name name2 = DivAnimation.Name.TRANSLATE;
            iArr[1] = 2;
            DivAnimation.Name name3 = DivAnimation.Name.SCALE;
            iArr[2] = 3;
            DivAnimation.Name name4 = DivAnimation.Name.SET;
            iArr[4] = 4;
            DivAnimation.Name name5 = DivAnimation.Name.NATIVE;
            iArr[3] = 5;
            DivAnimation.Name name6 = DivAnimation.Name.NO_ANIMATION;
            iArr[5] = 6;
        }
    }

    /* renamed from: a */
    public static final TransitionSet m16740a(DivTooltip divTooltip, ExpressionResolver expressionResolver) {
        return new TransitionSet().addTransition(new Fade()).addTransition(new TranslateAnimation(divTooltip.f40504g.mo17535b(expressionResolver), null, 2)).setInterpolator((TimeInterpolator) new SpringInterpolator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.transition.Fade] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.transition.Transition] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.yandex.div.core.tooltip.TranslateAnimation] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.yandex.div.core.tooltip.Scale] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.transition.TransitionSet] */
    /* renamed from: b */
    public static final Transition m16741b(DivAnimation divAnimation, DivTooltip.Position position, boolean z, ExpressionResolver expressionResolver) {
        ?? fade;
        Transition duration;
        Double mo17535b;
        Double mo17535b2;
        int ordinal = divAnimation.f34649e.mo17535b(expressionResolver).ordinal();
        if (ordinal == 0) {
            fade = new Fade();
        } else if (ordinal == 1) {
            Expression<Double> expression = z ? divAnimation.f34651g : divAnimation.f34646b;
            fade = new TranslateAnimation(position, (expression == null || (mo17535b = expression.mo17535b(expressionResolver)) == null) ? null : Float.valueOf((float) mo17535b.doubleValue()));
        } else if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal == 4) {
                    fade = new TransitionSet();
                    List<DivAnimation> list = divAnimation.f34648d;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            fade.addTransition(m16741b((DivAnimation) it.next(), position, z, expressionResolver));
                        }
                    }
                } else if (ordinal != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            fade = 0;
        } else {
            Expression<Double> expression2 = z ? divAnimation.f34651g : divAnimation.f34646b;
            float f2 = 1.0f;
            if (expression2 != null && (mo17535b2 = expression2.mo17535b(expressionResolver)) != null) {
                f2 = (float) mo17535b2.doubleValue();
            }
            fade = new Scale(f2);
        }
        if (fade == 0 || (duration = fade.setDuration(divAnimation.f34645a.mo17535b(expressionResolver).longValue())) == null) {
            return null;
        }
        return duration.setInterpolator(DivUtilKt.m16759b(divAnimation.f34647c.mo17535b(expressionResolver)));
    }
}
