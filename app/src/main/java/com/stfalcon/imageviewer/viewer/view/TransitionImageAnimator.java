package com.stfalcon.imageviewer.viewer.view;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import com.stfalcon.imageviewer.common.extensions.ViewKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TransitionImageAnimator.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/stfalcon/imageviewer/viewer/view/TransitionImageAnimator;", "", "Companion", "imageviewer_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class TransitionImageAnimator {

    /* renamed from: a */
    public boolean f25321a;

    /* renamed from: b */
    public boolean f25322b;

    /* renamed from: c */
    public final ImageView f25323c;

    /* renamed from: d */
    public final ImageView f25324d;

    /* renamed from: e */
    public final FrameLayout f25325e;

    /* compiled from: TransitionImageAnimator.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/stfalcon/imageviewer/viewer/view/TransitionImageAnimator$Companion;", "", "", "TRANSITION_DURATION_CLOSE", "J", "TRANSITION_DURATION_OPEN", "imageviewer_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    public TransitionImageAnimator(@Nullable ImageView imageView, @NotNull ImageView internalImage, @NotNull FrameLayout internalImageContainer) {
        Intrinsics.m32180i(internalImage, "internalImage");
        Intrinsics.m32180i(internalImageContainer, "internalImageContainer");
        this.f25323c = imageView;
        this.f25324d = internalImage;
        this.f25325e = internalImageContainer;
    }

    /* renamed from: a */
    public final Transition m14039a(final Function0<Unit> function0) {
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.m4266R(this.f25322b ? 250L : 200L);
        autoTransition.m4267S(new DecelerateInterpolator());
        final Function1<Transition, Unit> function1 = new Function1<Transition, Unit>() { // from class: com.stfalcon.imageviewer.viewer.view.TransitionImageAnimator$createTransition$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Transition transition) {
                Transition it = transition;
                Intrinsics.m32180i(it, "it");
                Function0 function02 = Function0.this;
                if (function02 != null) {
                }
                return Unit.f63088a;
            }
        };
        final Function1 function12 = null;
        final Function1 function13 = null;
        final Function1 function14 = null;
        final Function1 function15 = null;
        autoTransition.mo4237a(new Transition.TransitionListener() { // from class: com.stfalcon.imageviewer.common.extensions.TransitionKt$addListener$1
            @Override // androidx.transition.Transition.TransitionListener
            /* renamed from: a */
            public void mo4211a(@NotNull Transition transition) {
                Intrinsics.m32180i(transition, "transition");
                Function1 function16 = function15;
                if (function16 != null) {
                }
            }

            @Override // androidx.transition.Transition.TransitionListener
            /* renamed from: b */
            public void mo4191b(@NotNull Transition transition) {
                Intrinsics.m32180i(transition, "transition");
                Function1 function16 = function13;
                if (function16 != null) {
                }
            }

            @Override // androidx.transition.Transition.TransitionListener
            /* renamed from: c */
            public void mo4192c(@NotNull Transition transition) {
                Intrinsics.m32180i(transition, "transition");
                Function1 function16 = Function1.this;
                if (function16 != null) {
                }
            }

            @Override // androidx.transition.Transition.TransitionListener
            /* renamed from: d */
            public void mo4193d(@NotNull Transition transition) {
                Function1 function16 = function14;
                if (function16 != null) {
                }
            }

            @Override // androidx.transition.Transition.TransitionListener
            /* renamed from: e */
            public void mo4194e(@NotNull Transition transition) {
                Intrinsics.m32180i(transition, "transition");
                Function1 function16 = function12;
                if (function16 != null) {
                }
            }
        });
        return autoTransition;
    }

    /* renamed from: b */
    public final ViewGroup m14040b() {
        ViewParent parent = this.f25325e.getParent();
        if (parent != null) {
            return (ViewGroup) parent;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: c */
    public final void m14041c() {
        ImageView imageView = this.f25323c;
        if (imageView != null) {
            if (ViewKt.m14021c(imageView)) {
                ImageView imageView2 = this.f25323c;
                Rect rect = new Rect();
                if (imageView2 != null) {
                    imageView2.getLocalVisibleRect(rect);
                }
                ViewKt.m14024f(this.f25324d, imageView.getWidth(), imageView.getHeight());
                ViewKt.m14020b(this.f25324d, Integer.valueOf(-rect.left), Integer.valueOf(-rect.top), null, null);
                ImageView imageView3 = this.f25323c;
                Rect rect2 = new Rect();
                if (imageView3 != null) {
                    imageView3.getGlobalVisibleRect(rect2);
                }
                ViewKt.m14024f(this.f25325e, rect2.width(), rect2.height());
                ViewKt.m14020b(this.f25325e, Integer.valueOf(rect2.left), Integer.valueOf(rect2.top), Integer.valueOf(rect2.right), Integer.valueOf(rect2.bottom));
            }
            m14040b().animate().translationY(0.0f).setDuration(this.f25322b ? 250L : 200L).start();
        }
    }
}
