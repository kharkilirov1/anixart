package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class AbsoluteCornerSize implements CornerSize {

    /* renamed from: a */
    public final float f18628a;

    public AbsoluteCornerSize(float f2) {
        this.f18628a = f2;
    }

    @Override // com.google.android.material.shape.CornerSize
    /* renamed from: a */
    public float mo10265a(@NonNull RectF rectF) {
        return this.f18628a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbsoluteCornerSize) && this.f18628a == ((AbsoluteCornerSize) obj).f18628a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f18628a)});
    }
}
