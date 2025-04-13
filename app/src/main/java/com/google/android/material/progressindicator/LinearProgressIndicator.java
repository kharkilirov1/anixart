package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {

    /* renamed from: o */
    public static final /* synthetic */ int f18576o = 0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface IndeterminateAnimationType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface IndicatorDirection {
    }

    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, C2507R.attr.linearProgressIndicatorStyle, C2507R.style.Widget_MaterialComponents_LinearProgressIndicator);
        Context context2 = getContext();
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.f18485b;
        setIndeterminateDrawable(new IndeterminateDrawable(context2, linearProgressIndicatorSpec, new LinearDrawingDelegate(linearProgressIndicatorSpec), linearProgressIndicatorSpec.f18577g == 0 ? new LinearIndeterminateContiguousAnimatorDelegate(linearProgressIndicatorSpec) : new LinearIndeterminateDisjointAnimatorDelegate(context2, linearProgressIndicatorSpec)));
        Context context3 = getContext();
        LinearProgressIndicatorSpec linearProgressIndicatorSpec2 = (LinearProgressIndicatorSpec) this.f18485b;
        setProgressDrawable(new DeterminateDrawable(context3, linearProgressIndicatorSpec2, new LinearDrawingDelegate(linearProgressIndicatorSpec2)));
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* renamed from: b */
    public void mo10208b(int i2, boolean z) {
        S s = this.f18485b;
        if (s != 0 && ((LinearProgressIndicatorSpec) s).f18577g == 0 && isIndeterminate()) {
            return;
        }
        super.mo10208b(i2, z);
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.f18485b).f18577g;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.f18485b).f18578h;
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        S s = this.f18485b;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s;
        boolean z2 = true;
        if (((LinearProgressIndicatorSpec) s).f18578h != 1 && ((ViewCompat.m2231w(this) != 1 || ((LinearProgressIndicatorSpec) this.f18485b).f18578h != 2) && (ViewCompat.m2231w(this) != 0 || ((LinearProgressIndicatorSpec) this.f18485b).f18578h != 3))) {
            z2 = false;
        }
        linearProgressIndicatorSpec.f18579i = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        int paddingRight = i2 - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i3 - (getPaddingBottom() + getPaddingTop());
        IndeterminateDrawable<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        DeterminateDrawable<LinearProgressIndicatorSpec> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i2) {
        if (((LinearProgressIndicatorSpec) this.f18485b).f18577g == i2) {
            return;
        }
        if (m10209c() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.f18485b;
        linearProgressIndicatorSpec.f18577g = i2;
        linearProgressIndicatorSpec.mo10210a();
        if (i2 == 0) {
            IndeterminateDrawable<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
            LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate = new LinearIndeterminateContiguousAnimatorDelegate((LinearProgressIndicatorSpec) this.f18485b);
            indeterminateDrawable.f18551n = linearIndeterminateContiguousAnimatorDelegate;
            linearIndeterminateContiguousAnimatorDelegate.f18547a = indeterminateDrawable;
        } else {
            IndeterminateDrawable<LinearProgressIndicatorSpec> indeterminateDrawable2 = getIndeterminateDrawable();
            LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = new LinearIndeterminateDisjointAnimatorDelegate(getContext(), (LinearProgressIndicatorSpec) this.f18485b);
            indeterminateDrawable2.f18551n = linearIndeterminateDisjointAnimatorDelegate;
            linearIndeterminateDisjointAnimatorDelegate.f18547a = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(@NonNull int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.f18485b).mo10210a();
    }

    public void setIndicatorDirection(int i2) {
        S s = this.f18485b;
        ((LinearProgressIndicatorSpec) s).f18578h = i2;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s;
        boolean z = true;
        if (i2 != 1 && ((ViewCompat.m2231w(this) != 1 || ((LinearProgressIndicatorSpec) this.f18485b).f18578h != 2) && (ViewCompat.m2231w(this) != 0 || i2 != 3))) {
            z = false;
        }
        linearProgressIndicatorSpec.f18579i = z;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i2) {
        super.setTrackCornerRadius(i2);
        ((LinearProgressIndicatorSpec) this.f18485b).mo10210a();
        invalidate();
    }
}
