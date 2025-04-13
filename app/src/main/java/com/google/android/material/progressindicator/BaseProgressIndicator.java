package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.C1195R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class BaseProgressIndicator<S extends BaseProgressIndicatorSpec> extends ProgressBar {

    /* renamed from: n */
    public static final /* synthetic */ int f18484n = 0;

    /* renamed from: b */
    public S f18485b;

    /* renamed from: c */
    public int f18486c;

    /* renamed from: d */
    public boolean f18487d;

    /* renamed from: e */
    public boolean f18488e;

    /* renamed from: f */
    public final int f18489f;

    /* renamed from: g */
    public AnimatorDurationScaleProvider f18490g;

    /* renamed from: h */
    public boolean f18491h;

    /* renamed from: i */
    public int f18492i;

    /* renamed from: j */
    public final Runnable f18493j;

    /* renamed from: k */
    public final Runnable f18494k;

    /* renamed from: l */
    public final Animatable2Compat.AnimationCallback f18495l;

    /* renamed from: m */
    public final Animatable2Compat.AnimationCallback f18496m;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface HideAnimationBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ShowAnimationBehavior {
    }

    public BaseProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
        super(MaterialThemeOverlay.m10534a(context, attributeSet, i2, C2507R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i2);
        this.f18491h = false;
        this.f18492i = 4;
        this.f18493j = new Runnable() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.1
            @Override // java.lang.Runnable
            public void run() {
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                if (baseProgressIndicator.f18489f > 0) {
                    SystemClock.uptimeMillis();
                }
                baseProgressIndicator.setVisibility(0);
            }
        };
        this.f18494k = new Runnable() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.2
            @Override // java.lang.Runnable
            public void run() {
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                int i4 = BaseProgressIndicator.f18484n;
                boolean z = false;
                ((DrawableWithAnimatedVisibilityChange) baseProgressIndicator.getCurrentDrawable()).m10231h(false, false, true);
                if ((baseProgressIndicator.getProgressDrawable() == null || !baseProgressIndicator.getProgressDrawable().isVisible()) && (baseProgressIndicator.getIndeterminateDrawable() == null || !baseProgressIndicator.getIndeterminateDrawable().isVisible())) {
                    z = true;
                }
                if (z) {
                    baseProgressIndicator.setVisibility(4);
                }
                Objects.requireNonNull(BaseProgressIndicator.this);
            }
        };
        this.f18495l = new Animatable2Compat.AnimationCallback() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.3
            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            /* renamed from: a */
            public void mo4292a(Drawable drawable) {
                BaseProgressIndicator.this.setIndeterminate(false);
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                baseProgressIndicator.mo10208b(baseProgressIndicator.f18486c, baseProgressIndicator.f18487d);
            }
        };
        this.f18496m = new Animatable2Compat.AnimationCallback() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.4
            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            /* renamed from: a */
            public void mo4292a(Drawable drawable) {
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                if (baseProgressIndicator.f18491h) {
                    return;
                }
                baseProgressIndicator.setVisibility(baseProgressIndicator.f18492i);
            }
        };
        Context context2 = getContext();
        this.f18485b = new LinearProgressIndicatorSpec(context2, attributeSet);
        int[] iArr = C1195R.styleable.f17319d;
        ThemeEnforcement.m10156a(context2, attributeSet, i2, i3);
        ThemeEnforcement.m10157b(context2, attributeSet, iArr, i2, i3, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i2, i3);
        obtainStyledAttributes.getInt(5, -1);
        this.f18489f = Math.min(obtainStyledAttributes.getInt(3, -1), 1000);
        obtainStyledAttributes.recycle();
        this.f18490g = new AnimatorDurationScaleProvider();
        this.f18488e = true;
    }

    @Nullable
    private DrawingDelegate<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f18550m;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f18527m;
    }

    /* renamed from: a */
    public void m10207a(boolean z) {
        if (this.f18488e) {
            ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).m10231h(m10209c(), false, z);
        }
    }

    /* renamed from: b */
    public void mo10208b(int i2, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i2);
            if (getProgressDrawable() == null || z) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f18486c = i2;
            this.f18487d = z;
            this.f18491h = true;
            if (!getIndeterminateDrawable().isVisible() || this.f18490g.m10206a(getContext().getContentResolver()) == 0.0f) {
                this.f18495l.mo4292a(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().f18551n.mo10220e();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0020, code lost:
    
        if (getWindowVisibility() == 0) goto L14;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m10209c() {
        /*
            r4 = this;
            boolean r0 = androidx.core.view.ViewCompat.m2173M(r4)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L32
            int r0 = r4.getWindowVisibility()
            if (r0 != 0) goto L32
            r0 = r4
        Lf:
            int r3 = r0.getVisibility()
            if (r3 == 0) goto L16
            goto L24
        L16:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L26
            int r0 = r4.getWindowVisibility()
            if (r0 != 0) goto L24
        L22:
            r0 = 1
            goto L2b
        L24:
            r0 = 0
            goto L2b
        L26:
            boolean r3 = r0 instanceof android.view.View
            if (r3 != 0) goto L2f
            goto L22
        L2b:
            if (r0 == 0) goto L32
            r1 = 1
            goto L32
        L2f:
            android.view.View r0 = (android.view.View) r0
            goto Lf
        L32:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.progressindicator.BaseProgressIndicator.m10209c():boolean");
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f18485b.f18506f;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.f18485b.f18503c;
    }

    public int getShowAnimationBehavior() {
        return this.f18485b.f18505e;
    }

    @ColorInt
    public int getTrackColor() {
        return this.f18485b.f18504d;
    }

    @Px
    public int getTrackCornerRadius() {
        return this.f18485b.f18502b;
    }

    @Px
    public int getTrackThickness() {
        return this.f18485b.f18501a;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f18551n.mo10219d(this.f18495l);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().m10230g(this.f18496m);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().m10230g(this.f18496m);
        }
        if (m10209c()) {
            if (this.f18489f > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f18494k);
        removeCallbacks(this.f18493j);
        ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).m10227d();
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().m10232j(this.f18496m);
            getIndeterminateDrawable().f18551n.mo10222g();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().m10232j(this.f18496m);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(@NonNull Canvas canvas) {
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i2, int i3) {
        DrawingDelegate<S> currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate == null) {
            return;
        }
        setMeasuredDimension(currentDrawingDelegate.mo10215e() < 0 ? ProgressBar.getDefaultSize(getSuggestedMinimumWidth(), i2) : currentDrawingDelegate.mo10215e() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.mo10214d() < 0 ? ProgressBar.getDefaultSize(getSuggestedMinimumHeight(), i3) : currentDrawingDelegate.mo10214d() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i2) {
        super.onVisibilityChanged(view, i2);
        m10207a(i2 == 0);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        m10207a(false);
    }

    @RestrictTo
    @VisibleForTesting
    public void setAnimatorDurationScaleProvider(@NonNull AnimatorDurationScaleProvider animatorDurationScaleProvider) {
        this.f18490g = animatorDurationScaleProvider;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f18535d = animatorDurationScaleProvider;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f18535d = animatorDurationScaleProvider;
        }
    }

    public void setHideAnimationBehavior(int i2) {
        this.f18485b.f18506f = i2;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange = (DrawableWithAnimatedVisibilityChange) getCurrentDrawable();
        if (drawableWithAnimatedVisibilityChange != null) {
            drawableWithAnimatedVisibilityChange.m10227d();
        }
        super.setIndeterminate(z);
        DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange2 = (DrawableWithAnimatedVisibilityChange) getCurrentDrawable();
        if (drawableWithAnimatedVisibilityChange2 != null) {
            drawableWithAnimatedVisibilityChange2.m10231h(m10209c(), false, false);
        }
        if ((drawableWithAnimatedVisibilityChange2 instanceof IndeterminateDrawable) && m10209c()) {
            ((IndeterminateDrawable) drawableWithAnimatedVisibilityChange2).f18551n.mo10221f();
        }
        this.f18491h = false;
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof IndeterminateDrawable)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((DrawableWithAnimatedVisibilityChange) drawable).m10227d();
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(@ColorInt int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{MaterialColors.m9969b(getContext(), C2507R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f18485b.f18503c = iArr;
        getIndeterminateDrawable().f18551n.mo10218c();
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i2) {
        if (isIndeterminate()) {
            return;
        }
        mo10208b(i2, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof DeterminateDrawable)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            DeterminateDrawable determinateDrawable = (DeterminateDrawable) drawable;
            determinateDrawable.m10227d();
            super.setProgressDrawable(determinateDrawable);
            determinateDrawable.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i2) {
        this.f18485b.f18505e = i2;
        invalidate();
    }

    public void setTrackColor(@ColorInt int i2) {
        S s = this.f18485b;
        if (s.f18504d != i2) {
            s.f18504d = i2;
            invalidate();
        }
    }

    public void setTrackCornerRadius(@Px int i2) {
        S s = this.f18485b;
        if (s.f18502b != i2) {
            s.f18502b = Math.min(i2, s.f18501a / 2);
        }
    }

    public void setTrackThickness(@Px int i2) {
        S s = this.f18485b;
        if (s.f18501a != i2) {
            s.f18501a = i2;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i2) {
        if (i2 != 0 && i2 != 4 && i2 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f18492i = i2;
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public IndeterminateDrawable<S> getIndeterminateDrawable() {
        return (IndeterminateDrawable) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public DeterminateDrawable<S> getProgressDrawable() {
        return (DeterminateDrawable) super.getProgressDrawable();
    }
}
