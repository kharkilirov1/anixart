package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* loaded from: classes.dex */
public final class DeterminateDrawable<S extends BaseProgressIndicatorSpec> extends DrawableWithAnimatedVisibilityChange {

    /* renamed from: r */
    public static final FloatPropertyCompat<DeterminateDrawable> f18526r = new FloatPropertyCompat<DeterminateDrawable>("indicatorLevel") { // from class: com.google.android.material.progressindicator.DeterminateDrawable.1
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float mo2780a(DeterminateDrawable determinateDrawable) {
            return determinateDrawable.f18530p * 10000.0f;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void mo2781b(DeterminateDrawable determinateDrawable, float f2) {
            DeterminateDrawable determinateDrawable2 = determinateDrawable;
            determinateDrawable2.f18530p = f2 / 10000.0f;
            determinateDrawable2.invalidateSelf();
        }
    };

    /* renamed from: m */
    public DrawingDelegate<S> f18527m;

    /* renamed from: n */
    public final SpringForce f18528n;

    /* renamed from: o */
    public final SpringAnimation f18529o;

    /* renamed from: p */
    public float f18530p;

    /* renamed from: q */
    public boolean f18531q;

    public DeterminateDrawable(@NonNull Context context, @NonNull BaseProgressIndicatorSpec baseProgressIndicatorSpec, @NonNull DrawingDelegate<S> drawingDelegate) {
        super(context, baseProgressIndicatorSpec);
        this.f18531q = false;
        this.f18527m = drawingDelegate;
        drawingDelegate.f18546b = this;
        SpringForce springForce = new SpringForce();
        this.f18528n = springForce;
        springForce.f3991b = 1.0f;
        springForce.f3992c = false;
        springForce.m2786a(50.0f);
        SpringAnimation springAnimation = new SpringAnimation(this, f18526r);
        this.f18529o = springAnimation;
        springAnimation.f3987r = springForce;
        if (this.f18540i != 1.0f) {
            this.f18540i = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            DrawingDelegate<S> drawingDelegate = this.f18527m;
            Rect bounds = getBounds();
            float m10226c = m10226c();
            drawingDelegate.f18545a.mo10210a();
            drawingDelegate.mo10211a(canvas, bounds, m10226c);
            this.f18527m.mo10213c(canvas, this.f18541j);
            this.f18527m.mo10212b(canvas, this.f18541j, 0.0f, this.f18530p, MaterialColors.m9968a(this.f18534c.f18503c[0], this.f18542k));
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f18527m.mo10214d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f18527m.mo10215e();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    /* renamed from: i */
    public boolean mo10223i(boolean z, boolean z2, boolean z3) {
        boolean mo10223i = super.mo10223i(z, z2, z3);
        float m10206a = this.f18535d.m10206a(this.f18533b.getContentResolver());
        if (m10206a == 0.0f) {
            this.f18531q = true;
        } else {
            this.f18531q = false;
            this.f18528n.m2786a(50.0f / m10206a);
        }
        return mo10223i;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f18529o.m2785f();
        this.f18530p = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i2) {
        if (this.f18531q) {
            this.f18529o.m2785f();
            this.f18530p = i2 / 10000.0f;
            invalidateSelf();
        } else {
            SpringAnimation springAnimation = this.f18529o;
            springAnimation.f3973b = this.f18530p * 10000.0f;
            springAnimation.f3974c = true;
            springAnimation.m2784e(i2);
        }
        return true;
    }
}
