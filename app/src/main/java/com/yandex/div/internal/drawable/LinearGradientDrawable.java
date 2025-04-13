package com.yandex.div.internal.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LinearGradientDrawable.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/internal/drawable/LinearGradientDrawable;", "Landroid/graphics/drawable/Drawable;", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class LinearGradientDrawable extends Drawable {

    /* renamed from: e */
    @NotNull
    public static final Companion f33750e = new Companion(null);

    /* renamed from: a */
    public final float f33751a;

    /* renamed from: b */
    @NotNull
    public final int[] f33752b;

    /* renamed from: c */
    @NotNull
    public final Paint f33753c = new Paint();

    /* renamed from: d */
    @NotNull
    public RectF f33754d = new RectF();

    /* compiled from: LinearGradientDrawable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/drawable/LinearGradientDrawable$Companion;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        /* renamed from: a */
        public final LinearGradient m17304a(float f2, @NotNull int[] colors, int i2, int i3) {
            Intrinsics.m32179h(colors, "colors");
            float f3 = i2 / 2;
            double d = (float) ((f2 * 3.141592653589793d) / 180.0f);
            float cos = ((float) Math.cos(d)) * f3;
            float f4 = i3 / 2;
            float sin = ((float) Math.sin(d)) * f4;
            return new LinearGradient(f3 - cos, f4 + sin, f3 + cos, f4 - sin, colors, (float[]) null, Shader.TileMode.CLAMP);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public LinearGradientDrawable(float f2, @NotNull int[] iArr) {
        this.f33751a = f2;
        this.f33752b = iArr;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.m32179h(canvas, "canvas");
        canvas.drawRect(this.f33754d, this.f33753c);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f33753c.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.m32179h(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f33753c.setShader(f33750e.m17304a(this.f33751a, this.f33752b, bounds.width(), bounds.height()));
        this.f33754d.set(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f33753c.setAlpha(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
