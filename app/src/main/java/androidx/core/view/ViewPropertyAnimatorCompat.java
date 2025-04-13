package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ViewPropertyAnimatorCompat {

    /* renamed from: a */
    public final WeakReference<View> f3672a;

    /* renamed from: b */
    public int f3673b = -1;

    @RequiresApi
    public static class Api16Impl {
        @DoNotInline
        /* renamed from: a */
        public static ViewPropertyAnimator m2395a(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withEndAction(runnable);
        }

        @DoNotInline
        /* renamed from: b */
        public static ViewPropertyAnimator m2396b(ViewPropertyAnimator viewPropertyAnimator) {
            return viewPropertyAnimator.withLayer();
        }

        @DoNotInline
        /* renamed from: c */
        public static ViewPropertyAnimator m2397c(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withStartAction(runnable);
        }
    }

    @RequiresApi
    public static class Api18Impl {
        @DoNotInline
        /* renamed from: a */
        public static Interpolator m2398a(ViewPropertyAnimator viewPropertyAnimator) {
            return (Interpolator) viewPropertyAnimator.getInterpolator();
        }
    }

    @RequiresApi
    public static class Api19Impl {
        @DoNotInline
        /* renamed from: a */
        public static ViewPropertyAnimator m2399a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static ViewPropertyAnimator m2400a(ViewPropertyAnimator viewPropertyAnimator, float f2) {
            return viewPropertyAnimator.translationZ(f2);
        }

        @DoNotInline
        /* renamed from: b */
        public static ViewPropertyAnimator m2401b(ViewPropertyAnimator viewPropertyAnimator, float f2) {
            return viewPropertyAnimator.translationZBy(f2);
        }

        @DoNotInline
        /* renamed from: c */
        public static ViewPropertyAnimator m2402c(ViewPropertyAnimator viewPropertyAnimator, float f2) {
            return viewPropertyAnimator.z(f2);
        }

        @DoNotInline
        /* renamed from: d */
        public static ViewPropertyAnimator m2403d(ViewPropertyAnimator viewPropertyAnimator, float f2) {
            return viewPropertyAnimator.zBy(f2);
        }
    }

    public static class ViewPropertyAnimatorListenerApi14 implements ViewPropertyAnimatorListener {

        /* renamed from: a */
        public ViewPropertyAnimatorCompat f3676a;

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        /* renamed from: a */
        public void mo661a(@NonNull View view) {
            Object tag = view.getTag(2113929216);
            ViewPropertyAnimatorListener viewPropertyAnimatorListener = tag instanceof ViewPropertyAnimatorListener ? (ViewPropertyAnimatorListener) tag : null;
            if (viewPropertyAnimatorListener != null) {
                viewPropertyAnimatorListener.mo661a(view);
            }
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        @SuppressLint
        /* renamed from: b */
        public void mo436b(@NonNull View view) {
            int i2 = this.f3676a.f3673b;
            if (i2 > -1) {
                view.setLayerType(i2, null);
                this.f3676a.f3673b = -1;
            }
            Objects.requireNonNull(this.f3676a);
            Object tag = view.getTag(2113929216);
            ViewPropertyAnimatorListener viewPropertyAnimatorListener = tag instanceof ViewPropertyAnimatorListener ? (ViewPropertyAnimatorListener) tag : null;
            if (viewPropertyAnimatorListener != null) {
                viewPropertyAnimatorListener.mo436b(view);
            }
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        /* renamed from: c */
        public void mo437c(@NonNull View view) {
            if (this.f3676a.f3673b > -1) {
                view.setLayerType(2, null);
            }
            Objects.requireNonNull(this.f3676a);
            Object tag = view.getTag(2113929216);
            ViewPropertyAnimatorListener viewPropertyAnimatorListener = tag instanceof ViewPropertyAnimatorListener ? (ViewPropertyAnimatorListener) tag : null;
            if (viewPropertyAnimatorListener != null) {
                viewPropertyAnimatorListener.mo437c(view);
            }
        }
    }

    public ViewPropertyAnimatorCompat(View view) {
        this.f3672a = new WeakReference<>(view);
    }

    @NonNull
    /* renamed from: a */
    public ViewPropertyAnimatorCompat m2388a(float f2) {
        View view = this.f3672a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    /* renamed from: b */
    public void m2389b() {
        View view = this.f3672a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    @NonNull
    /* renamed from: c */
    public ViewPropertyAnimatorCompat m2390c(long j2) {
        View view = this.f3672a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
        return this;
    }

    @NonNull
    /* renamed from: d */
    public ViewPropertyAnimatorCompat m2391d(@Nullable ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        View view = this.f3672a.get();
        if (view != null) {
            m2392e(view, viewPropertyAnimatorListener);
        }
        return this;
    }

    /* renamed from: e */
    public final void m2392e(final View view, final ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (viewPropertyAnimatorListener != null) {
            view.animate().setListener(new AnimatorListenerAdapter(this) { // from class: androidx.core.view.ViewPropertyAnimatorCompat.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    viewPropertyAnimatorListener.mo661a(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    viewPropertyAnimatorListener.mo436b(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    viewPropertyAnimatorListener.mo437c(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }

    @NonNull
    /* renamed from: f */
    public ViewPropertyAnimatorCompat m2393f(@Nullable final ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener) {
        final View view = this.f3672a.get();
        if (view != null) {
            Api19Impl.m2399a(view.animate(), viewPropertyAnimatorUpdateListener != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.e
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ViewPropertyAnimatorUpdateListener.this.mo481a(view);
                }
            } : null);
        }
        return this;
    }

    @NonNull
    /* renamed from: g */
    public ViewPropertyAnimatorCompat m2394g(float f2) {
        View view = this.f3672a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }
}
