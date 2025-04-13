package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class RelativeCornerSize implements CornerSize {

    /* renamed from: a */
    public final float f18682a;

    public RelativeCornerSize(@FloatRange float f2) {
        this.f18682a = f2;
    }

    @NonNull
    @RestrictTo
    /* renamed from: b */
    public static RelativeCornerSize m10310b(@NonNull RectF rectF, @NonNull CornerSize cornerSize) {
        return cornerSize instanceof RelativeCornerSize ? (RelativeCornerSize) cornerSize : new RelativeCornerSize(cornerSize.mo10265a(rectF) / Math.min(rectF.width(), rectF.height()));
    }

    @Override // com.google.android.material.shape.CornerSize
    /* renamed from: a */
    public float mo10265a(@NonNull RectF rectF) {
        return this.f18682a * Math.min(rectF.width(), rectF.height());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RelativeCornerSize) && this.f18682a == ((RelativeCornerSize) obj).f18682a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f18682a)});
    }
}
