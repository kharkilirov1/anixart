package com.google.android.material.progressindicator;

import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface IndicatorDirection {
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.f18485b).f18525i;
    }

    @Px
    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.f18485b).f18524h;
    }

    @Px
    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.f18485b).f18523g;
    }

    public void setIndicatorDirection(int i2) {
        ((CircularProgressIndicatorSpec) this.f18485b).f18525i = i2;
        invalidate();
    }

    public void setIndicatorInset(@Px int i2) {
        S s = this.f18485b;
        if (((CircularProgressIndicatorSpec) s).f18524h != i2) {
            ((CircularProgressIndicatorSpec) s).f18524h = i2;
            invalidate();
        }
    }

    public void setIndicatorSize(@Px int i2) {
        int max = Math.max(i2, getTrackThickness() * 2);
        S s = this.f18485b;
        if (((CircularProgressIndicatorSpec) s).f18523g != max) {
            ((CircularProgressIndicatorSpec) s).f18523g = max;
            Objects.requireNonNull((CircularProgressIndicatorSpec) s);
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i2) {
        super.setTrackThickness(i2);
        Objects.requireNonNull((CircularProgressIndicatorSpec) this.f18485b);
    }
}
