package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.annotation.AnimRes;
import androidx.annotation.NonNull;
import androidx.core.view.OneShotPreDrawListener;

/* loaded from: classes.dex */
class FragmentAnim {
    @AnimRes
    /* renamed from: a */
    public static int m2973a(@NonNull Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i2});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static class AnimationOrAnimator {

        /* renamed from: a */
        public final Animation f4298a;

        /* renamed from: b */
        public final Animator f4299b;

        public AnimationOrAnimator(Animation animation) {
            this.f4298a = animation;
            this.f4299b = null;
        }

        public AnimationOrAnimator(Animator animator) {
            this.f4298a = null;
            this.f4299b = animator;
        }
    }

    public static class EndViewTransitionAnimation extends AnimationSet implements Runnable {

        /* renamed from: b */
        public final ViewGroup f4300b;

        /* renamed from: c */
        public final View f4301c;

        /* renamed from: d */
        public boolean f4302d;

        /* renamed from: e */
        public boolean f4303e;

        /* renamed from: f */
        public boolean f4304f;

        public EndViewTransitionAnimation(@NonNull Animation animation, @NonNull ViewGroup viewGroup, @NonNull View view) {
            super(false);
            this.f4304f = true;
            this.f4300b = viewGroup;
            this.f4301c = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j2, @NonNull Transformation transformation) {
            this.f4304f = true;
            if (this.f4302d) {
                return !this.f4303e;
            }
            if (!super.getTransformation(j2, transformation)) {
                this.f4302d = true;
                OneShotPreDrawListener.m2149a(this.f4300b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4302d || !this.f4304f) {
                this.f4300b.endViewTransition(this.f4301c);
                this.f4303e = true;
            } else {
                this.f4304f = false;
                this.f4300b.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j2, @NonNull Transformation transformation, float f2) {
            this.f4304f = true;
            if (this.f4302d) {
                return !this.f4303e;
            }
            if (!super.getTransformation(j2, transformation, f2)) {
                this.f4302d = true;
                OneShotPreDrawListener.m2149a(this.f4300b, this);
            }
            return true;
        }
    }
}
