package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* loaded from: classes.dex */
abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {

    /* renamed from: a */
    public S f18545a;

    /* renamed from: b */
    public DrawableWithAnimatedVisibilityChange f18546b;

    public DrawingDelegate(S s) {
        this.f18545a = s;
    }

    /* renamed from: a */
    public abstract void mo10211a(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange float f2);

    /* renamed from: b */
    public abstract void mo10212b(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange float f2, @FloatRange float f3, @ColorInt int i2);

    /* renamed from: c */
    public abstract void mo10213c(@NonNull Canvas canvas, @NonNull Paint paint);

    /* renamed from: d */
    public abstract int mo10214d();

    /* renamed from: e */
    public abstract int mo10215e();
}
