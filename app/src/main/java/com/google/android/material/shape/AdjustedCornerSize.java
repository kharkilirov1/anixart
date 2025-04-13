package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

@RestrictTo
/* loaded from: classes.dex */
public final class AdjustedCornerSize implements CornerSize {

    /* renamed from: a */
    public final CornerSize f18629a;

    /* renamed from: b */
    public final float f18630b;

    public AdjustedCornerSize(float f2, @NonNull CornerSize cornerSize) {
        while (cornerSize instanceof AdjustedCornerSize) {
            cornerSize = ((AdjustedCornerSize) cornerSize).f18629a;
            f2 += ((AdjustedCornerSize) cornerSize).f18630b;
        }
        this.f18629a = cornerSize;
        this.f18630b = f2;
    }

    @Override // com.google.android.material.shape.CornerSize
    /* renamed from: a */
    public float mo10265a(@NonNull RectF rectF) {
        return Math.max(0.0f, this.f18629a.mo10265a(rectF) + this.f18630b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdjustedCornerSize)) {
            return false;
        }
        AdjustedCornerSize adjustedCornerSize = (AdjustedCornerSize) obj;
        return this.f18629a.equals(adjustedCornerSize.f18629a) && this.f18630b == adjustedCornerSize.f18630b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18629a, Float.valueOf(this.f18630b)});
    }
}
