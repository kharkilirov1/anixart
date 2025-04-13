package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
abstract class DrawableWithAnimatedVisibilityChange extends Drawable implements Animatable2Compat {

    /* renamed from: l */
    public static final Property<DrawableWithAnimatedVisibilityChange, Float> f18532l = new Property<DrawableWithAnimatedVisibilityChange, Float>(Float.class, "growFraction") { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.3
        @Override // android.util.Property
        public Float get(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
            return Float.valueOf(drawableWithAnimatedVisibilityChange.m10226c());
        }

        @Override // android.util.Property
        public void set(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange, Float f2) {
            DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange2 = drawableWithAnimatedVisibilityChange;
            float floatValue = f2.floatValue();
            if (drawableWithAnimatedVisibilityChange2.f18540i != floatValue) {
                drawableWithAnimatedVisibilityChange2.f18540i = floatValue;
                drawableWithAnimatedVisibilityChange2.invalidateSelf();
            }
        }
    };

    /* renamed from: b */
    public final Context f18533b;

    /* renamed from: c */
    public final BaseProgressIndicatorSpec f18534c;

    /* renamed from: e */
    public ValueAnimator f18536e;

    /* renamed from: f */
    public ValueAnimator f18537f;

    /* renamed from: g */
    public List<Animatable2Compat.AnimationCallback> f18538g;

    /* renamed from: h */
    public boolean f18539h;

    /* renamed from: i */
    public float f18540i;

    /* renamed from: k */
    public int f18542k;

    /* renamed from: j */
    public final Paint f18541j = new Paint();

    /* renamed from: d */
    public AnimatorDurationScaleProvider f18535d = new AnimatorDurationScaleProvider();

    public DrawableWithAnimatedVisibilityChange(@NonNull Context context, @NonNull BaseProgressIndicatorSpec baseProgressIndicatorSpec) {
        this.f18533b = context;
        this.f18534c = baseProgressIndicatorSpec;
        setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: b */
    public final void m10225b(@NonNull ValueAnimator... valueAnimatorArr) {
        boolean z = this.f18539h;
        this.f18539h = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f18539h = z;
    }

    /* renamed from: c */
    public float m10226c() {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f18534c;
        if (!(baseProgressIndicatorSpec.f18505e != 0)) {
            if (!(baseProgressIndicatorSpec.f18506f != 0)) {
                return 1.0f;
            }
        }
        return this.f18540i;
    }

    /* renamed from: d */
    public boolean m10227d() {
        return m10231h(false, false, false);
    }

    /* renamed from: e */
    public boolean m10228e() {
        ValueAnimator valueAnimator = this.f18537f;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* renamed from: f */
    public boolean m10229f() {
        ValueAnimator valueAnimator = this.f18536e;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* renamed from: g */
    public void m10230g(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        if (this.f18538g == null) {
            this.f18538g = new ArrayList();
        }
        if (this.f18538g.contains(animationCallback)) {
            return;
        }
        this.f18538g.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f18542k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public boolean m10231h(boolean z, boolean z2, boolean z3) {
        return mo10223i(z, z2, z3 && this.f18535d.m10206a(this.f18533b.getContentResolver()) > 0.0f);
    }

    /* renamed from: i */
    public boolean mo10223i(boolean z, boolean z2, boolean z3) {
        if (this.f18536e == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f18532l, 0.0f, 1.0f);
            this.f18536e = ofFloat;
            ofFloat.setDuration(500L);
            this.f18536e.setInterpolator(AnimationUtils.f17343b);
            ValueAnimator valueAnimator = this.f18536e;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f18536e = valueAnimator;
            valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange = DrawableWithAnimatedVisibilityChange.this;
                    List<Animatable2Compat.AnimationCallback> list = drawableWithAnimatedVisibilityChange.f18538g;
                    if (list == null || drawableWithAnimatedVisibilityChange.f18539h) {
                        return;
                    }
                    Iterator<Animatable2Compat.AnimationCallback> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().mo4293b(drawableWithAnimatedVisibilityChange);
                    }
                }
            });
        }
        if (this.f18537f == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f18532l, 1.0f, 0.0f);
            this.f18537f = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f18537f.setInterpolator(AnimationUtils.f17343b);
            ValueAnimator valueAnimator2 = this.f18537f;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f18537f = valueAnimator2;
            valueAnimator2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    DrawableWithAnimatedVisibilityChange.super.setVisible(false, false);
                    DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange = DrawableWithAnimatedVisibilityChange.this;
                    List<Animatable2Compat.AnimationCallback> list = drawableWithAnimatedVisibilityChange.f18538g;
                    if (list == null || drawableWithAnimatedVisibilityChange.f18539h) {
                        return;
                    }
                    Iterator<Animatable2Compat.AnimationCallback> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().mo4292a(drawableWithAnimatedVisibilityChange);
                    }
                }
            });
        }
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator3 = z ? this.f18536e : this.f18537f;
        ValueAnimator valueAnimator4 = z ? this.f18537f : this.f18536e;
        if (z3) {
            if (z3 && valueAnimator3.isRunning()) {
                return false;
            }
            boolean z4 = !z || super.setVisible(z, false);
            if (!(!z ? this.f18534c.f18506f == 0 : this.f18534c.f18505e == 0)) {
                m10225b(valueAnimator3);
                return z4;
            }
            if (z2 || !valueAnimator3.isPaused()) {
                valueAnimator3.start();
            } else {
                valueAnimator3.resume();
            }
            return z4;
        }
        if (valueAnimator4.isRunning()) {
            ValueAnimator[] valueAnimatorArr = {valueAnimator4};
            boolean z5 = this.f18539h;
            this.f18539h = true;
            for (int i2 = 0; i2 < 1; i2++) {
                valueAnimatorArr[i2].cancel();
            }
            this.f18539h = z5;
        }
        if (valueAnimator3.isRunning()) {
            valueAnimator3.end();
        } else {
            m10225b(valueAnimator3);
        }
        return super.setVisible(z, false);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return m10229f() || m10228e();
    }

    /* renamed from: j */
    public boolean m10232j(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        List<Animatable2Compat.AnimationCallback> list = this.f18538g;
        if (list == null || !list.contains(animationCallback)) {
            return false;
        }
        this.f18538g.remove(animationCallback);
        if (!this.f18538g.isEmpty()) {
            return true;
        }
        this.f18538g = null;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f18542k = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f18541j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return m10231h(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        mo10223i(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        mo10223i(false, true, false);
    }
}
