package com.yandex.div.core.view2.animations;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAnimation;
import com.yandex.mobile.ads.C4632R;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Utils.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class UtilsKt {

    /* renamed from: a */
    @NotNull
    public static final DivAnimation f31778a;

    /* compiled from: Utils.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[DivAnimation.Name.values().length];
            DivAnimation.Name name = DivAnimation.Name.SET;
            iArr[4] = 1;
            DivAnimation.Name name2 = DivAnimation.Name.SCALE;
            iArr[2] = 2;
            DivAnimation.Name name3 = DivAnimation.Name.NATIVE;
            iArr[3] = 3;
            DivAnimation.Name name4 = DivAnimation.Name.NO_ANIMATION;
            iArr[5] = 4;
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f31778a = new DivAnimation(companion.m17539a(100L), companion.m17539a(Double.valueOf(0.6d)), null, null, companion.m17539a(DivAnimation.Name.FADE), null, null, companion.m17539a(Double.valueOf(1.0d)), C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
    }

    /* renamed from: a */
    public static final Float m16898a(Double d) {
        if (d == null) {
            return null;
        }
        return Float.valueOf(RangesKt.m32238e((float) d.doubleValue(), 0.0f, 1.0f));
    }

    @Nullable
    /* renamed from: b */
    public static final Function2<View, MotionEvent, Unit> m16899b(@NotNull DivAnimation divAnimation, @NotNull ExpressionResolver expressionResolver, @NotNull View view) {
        Intrinsics.m32179h(expressionResolver, "expressionResolver");
        final Animation m16904g = m16904g(divAnimation, expressionResolver, false, view);
        final Animation m16904g2 = m16904g(divAnimation, expressionResolver, true, null);
        if (m16904g == null && m16904g2 == null) {
            return null;
        }
        return new Function2<View, MotionEvent, Unit>() { // from class: com.yandex.div.core.view2.animations.UtilsKt$asTouchListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public Unit invoke(View view2, MotionEvent motionEvent) {
                Animation animation;
                View v = view2;
                MotionEvent event = motionEvent;
                Intrinsics.m32179h(v, "v");
                Intrinsics.m32179h(event, "event");
                if (v.isEnabled() && v.isClickable() && v.hasOnClickListeners()) {
                    int action = event.getAction();
                    if (action == 0) {
                        Animation animation2 = m16904g;
                        if (animation2 != null) {
                            v.startAnimation(animation2);
                        }
                    } else if ((action == 1 || action == 3) && (animation = m16904g2) != null) {
                        v.startAnimation(animation);
                    }
                }
                return Unit.f63088a;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int[], java.lang.Object] */
    /* renamed from: c */
    public static final void m16900c(@NotNull TransitionValues transitionValues, @NotNull Function1<? super int[], Unit> function1) {
        ?? r0 = new int[2];
        transitionValues.f6318b.getLocationOnScreen(r0);
        function1.invoke(r0);
    }

    /* renamed from: d */
    public static final ScaleAnimation m16901d(float f2, float f3) {
        return new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
    }

    @NotNull
    /* renamed from: e */
    public static final View m16902e(@NotNull Transition transition, @NotNull View view, @NotNull ViewGroup viewGroup, @NotNull TransitionValues transitionValues, @NotNull String str) {
        if (!ViewsKt.m16768b(view)) {
            return view;
        }
        Object obj = transitionValues.f6317a.get(str);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        return ViewCopiesKt.m16906a(view, viewGroup, transition, (int[]) obj);
    }

    /* renamed from: f */
    public static final Float m16903f(Double d) {
        if (d == null) {
            return null;
        }
        return Float.valueOf(RangesKt.m32234a((float) d.doubleValue(), 0.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0101  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.view.animation.Animation m16904g(com.yandex.div2.DivAnimation r11, com.yandex.div.json.expressions.ExpressionResolver r12, boolean r13, android.view.View r14) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.animations.UtilsKt.m16904g(com.yandex.div2.DivAnimation, com.yandex.div.json.expressions.ExpressionResolver, boolean, android.view.View):android.view.animation.Animation");
    }
}
