package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* loaded from: classes.dex */
public final class IndeterminateDrawable<S extends BaseProgressIndicatorSpec> extends DrawableWithAnimatedVisibilityChange {

    /* renamed from: m */
    public DrawingDelegate<S> f18550m;

    /* renamed from: n */
    public IndeterminateAnimatorDelegate<ObjectAnimator> f18551n;

    public IndeterminateDrawable(@NonNull Context context, @NonNull BaseProgressIndicatorSpec baseProgressIndicatorSpec, @NonNull DrawingDelegate<S> drawingDelegate, @NonNull IndeterminateAnimatorDelegate<ObjectAnimator> indeterminateAnimatorDelegate) {
        super(context, baseProgressIndicatorSpec);
        this.f18550m = drawingDelegate;
        drawingDelegate.f18546b = this;
        this.f18551n = indeterminateAnimatorDelegate;
        indeterminateAnimatorDelegate.f18547a = this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        DrawingDelegate<S> drawingDelegate = this.f18550m;
        Rect bounds = getBounds();
        float m10226c = m10226c();
        drawingDelegate.f18545a.mo10210a();
        drawingDelegate.mo10211a(canvas, bounds, m10226c);
        this.f18550m.mo10213c(canvas, this.f18541j);
        int i2 = 0;
        while (true) {
            IndeterminateAnimatorDelegate<ObjectAnimator> indeterminateAnimatorDelegate = this.f18551n;
            int[] iArr = indeterminateAnimatorDelegate.f18549c;
            if (i2 >= iArr.length) {
                canvas.restore();
                return;
            }
            DrawingDelegate<S> drawingDelegate2 = this.f18550m;
            Paint paint = this.f18541j;
            float[] fArr = indeterminateAnimatorDelegate.f18548b;
            int i3 = i2 * 2;
            drawingDelegate2.mo10212b(canvas, paint, fArr[i3], fArr[i3 + 1], iArr[i2]);
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f18550m.mo10214d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f18550m.mo10215e();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    /* renamed from: i */
    public boolean mo10223i(boolean z, boolean z2, boolean z3) {
        boolean mo10223i = super.mo10223i(z, z2, z3);
        if (!isRunning()) {
            this.f18551n.mo10217a();
        }
        float m10206a = this.f18535d.m10206a(this.f18533b.getContentResolver());
        if (z && (z3 || (Build.VERSION.SDK_INT <= 22 && m10206a > 0.0f))) {
            this.f18551n.mo10221f();
        }
        return mo10223i;
    }
}
