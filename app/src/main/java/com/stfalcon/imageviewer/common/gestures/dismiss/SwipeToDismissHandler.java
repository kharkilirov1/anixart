package com.stfalcon.imageviewer.common.gestures.dismiss;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SwipeToDismissHandler.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/stfalcon/imageviewer/common/gestures/dismiss/SwipeToDismissHandler;", "Landroid/view/View$OnTouchListener;", "Companion", "imageviewer_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class SwipeToDismissHandler implements View.OnTouchListener {

    /* renamed from: b */
    public int f25238b;

    /* renamed from: c */
    public boolean f25239c;

    /* renamed from: d */
    public float f25240d;

    /* renamed from: e */
    public final View f25241e;

    /* renamed from: f */
    public final Function0<Unit> f25242f;

    /* renamed from: g */
    public final Function2<Float, Integer, Unit> f25243g;

    /* renamed from: h */
    public final Function0<Boolean> f25244h;

    /* compiled from: SwipeToDismissHandler.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/stfalcon/imageviewer/common/gestures/dismiss/SwipeToDismissHandler$Companion;", "", "", "ANIMATION_DURATION", "J", "imageviewer_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SwipeToDismissHandler(@NotNull View swipeView, @NotNull Function0<Unit> function0, @NotNull Function2<? super Float, ? super Integer, Unit> function2, @NotNull Function0<Boolean> function02) {
        Intrinsics.m32180i(swipeView, "swipeView");
        this.f25241e = swipeView;
        this.f25242f = function0;
        this.f25243g = function2;
        this.f25244h = function02;
        this.f25238b = swipeView.getHeight() / 4;
    }

    /* renamed from: a */
    public final void m14026a(final float f2) {
        ViewPropertyAnimator updateListener = this.f25241e.animate().translationY(f2).setDuration(200L).setInterpolator(new AccelerateInterpolator()).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.stfalcon.imageviewer.common.gestures.dismiss.SwipeToDismissHandler$animateTranslation$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SwipeToDismissHandler swipeToDismissHandler = SwipeToDismissHandler.this;
                swipeToDismissHandler.f25243g.invoke(Float.valueOf(swipeToDismissHandler.f25241e.getTranslationY()), Integer.valueOf(SwipeToDismissHandler.this.f25238b));
            }
        });
        Intrinsics.m32175d(updateListener, "swipeView.animate()\n    …ionY, translationLimit) }");
        final Function1<Animator, Unit> function1 = new Function1<Animator, Unit>() { // from class: com.stfalcon.imageviewer.common.gestures.dismiss.SwipeToDismissHandler$animateTranslation$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Animator animator) {
                if (f2 != 0.0f) {
                    SwipeToDismissHandler.this.f25242f.invoke();
                }
                SwipeToDismissHandler.this.f25241e.animate().setUpdateListener(null);
                return Unit.f63088a;
            }
        };
        final Function1 function12 = null;
        updateListener.setListener(new AnimatorListenerAdapter() { // from class: com.stfalcon.imageviewer.common.extensions.ViewPropertyAnimatorKt$setAnimatorListener$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@Nullable Animator animator) {
                Function1 function13 = Function1.this;
                if (function13 != null) {
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(@Nullable Animator animator) {
                Function1 function13 = function12;
                if (function13 != null) {
                }
            }
        }).start();
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint
    public boolean onTouch(@NotNull View v, @NotNull MotionEvent event) {
        Intrinsics.m32180i(v, "v");
        Intrinsics.m32180i(event, "event");
        int action = event.getAction();
        if (action == 0) {
            View view = this.f25241e;
            Rect rect = new Rect();
            if (view != null) {
                view.getHitRect(rect);
            }
            if (rect.contains((int) event.getX(), (int) event.getY())) {
                this.f25239c = true;
            }
            this.f25240d = event.getY();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (this.f25239c) {
                    float y = event.getY() - this.f25240d;
                    this.f25241e.setTranslationY(y);
                    this.f25243g.invoke(Float.valueOf(y), Integer.valueOf(this.f25238b));
                }
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        if (this.f25239c) {
            this.f25239c = false;
            int height = v.getHeight();
            float f2 = this.f25241e.getTranslationY() < ((float) (-this.f25238b)) ? -height : this.f25241e.getTranslationY() > ((float) this.f25238b) ? height : 0.0f;
            if (f2 == 0.0f || this.f25244h.invoke().booleanValue()) {
                m14026a(f2);
            } else {
                this.f25242f.invoke();
            }
        }
        return true;
    }
}
