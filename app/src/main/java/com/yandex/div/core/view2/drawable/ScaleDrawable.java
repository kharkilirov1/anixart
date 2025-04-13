package com.yandex.div.core.view2.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ScaleDrawable.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/view2/drawable/ScaleDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Animatable;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ScaleDrawable extends Drawable implements Animatable {

    /* renamed from: b */
    @NotNull
    public final Drawable f32868b;

    /* renamed from: c */
    public final float f32869c;

    /* renamed from: d */
    public final float f32870d;

    public ScaleDrawable(@NotNull Drawable child, float f2) {
        Intrinsics.m32179h(child, "child");
        this.f32868b = child;
        this.f32869c = f2;
        this.f32870d = f2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.m32179h(canvas, "canvas");
        int save = canvas.save();
        try {
            canvas.scale(this.f32869c, this.f32870d);
            this.f32868b.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f32868b.getIntrinsicHeight() == -1) {
            return -1;
        }
        return MathKt.m32223c(this.f32868b.getIntrinsicHeight() * this.f32870d);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f32868b.getIntrinsicWidth() == -1) {
            return -1;
        }
        return MathKt.m32223c(this.f32868b.getIntrinsicWidth() * this.f32869c);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f32868b.getOpacity();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Object obj = this.f32868b;
        return (obj instanceof Animatable) && ((Animatable) obj).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f32868b.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f32868b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Object obj = this.f32868b;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Object obj = this.f32868b;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
    }
}
