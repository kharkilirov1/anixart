package com.yandex.div.internal.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NinePatchDrawable.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/internal/drawable/NinePatchDrawable;", "Landroid/graphics/drawable/Drawable;", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class NinePatchDrawable extends Drawable {

    /* renamed from: a */
    public int f33755a;

    /* renamed from: b */
    public int f33756b;

    /* renamed from: c */
    public int f33757c;

    /* renamed from: d */
    public int f33758d;

    /* renamed from: e */
    @Nullable
    public NinePatch f33759e;

    /* renamed from: f */
    @NotNull
    public final Paint f33760f = new Paint(3);

    /* compiled from: NinePatchDrawable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/internal/drawable/NinePatchDrawable$Companion;", "", "", "REGIONS_COLOR", "I", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.m32179h(canvas, "canvas");
        NinePatch ninePatch = this.f33759e;
        if (ninePatch == null) {
            return;
        }
        ninePatch.draw(canvas, new Rect(0, 0, getBounds().width(), getBounds().height()), this.f33760f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f33760f.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.m32179h(bounds, "bounds");
        super.onBoundsChange(bounds);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f33760f.setAlpha(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
