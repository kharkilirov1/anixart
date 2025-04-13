package com.yandex.div.internal.drawable;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ScalingDrawable.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/internal/drawable/ScalingDrawable;", "Landroid/graphics/drawable/Drawable;", "AlignmentHorizontal", "AlignmentVertical", "ScaleType", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ScalingDrawable extends Drawable {

    /* renamed from: d */
    @Nullable
    public Bitmap f33802d;

    /* renamed from: g */
    public boolean f33805g;

    /* renamed from: j */
    public float f33808j;

    /* renamed from: k */
    public float f33809k;

    /* renamed from: a */
    @NotNull
    public ScaleType f33799a = ScaleType.NO_SCALE;

    /* renamed from: b */
    @NotNull
    public AlignmentHorizontal f33800b = AlignmentHorizontal.LEFT;

    /* renamed from: c */
    @NotNull
    public AlignmentVertical f33801c = AlignmentVertical.TOP;

    /* renamed from: e */
    @NotNull
    public final Paint f33803e = new Paint(3);

    /* renamed from: f */
    @NotNull
    public Matrix f33804f = new Matrix();

    /* renamed from: h */
    public float f33806h = 1.0f;

    /* renamed from: i */
    public float f33807i = 1.0f;

    /* compiled from: ScalingDrawable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentHorizontal;", "", "LEFT", "CENTER", "RIGHT", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum AlignmentHorizontal {
        LEFT,
        CENTER,
        RIGHT
    }

    /* compiled from: ScalingDrawable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentVertical;", "", "TOP", "CENTER", "BOTTOM", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum AlignmentVertical {
        TOP,
        CENTER,
        BOTTOM
    }

    /* compiled from: ScalingDrawable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div/internal/drawable/ScalingDrawable$ScaleType;", "", "NO_SCALE", "FIT", "FILL", "STRETCH", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum ScaleType {
        NO_SCALE,
        FIT,
        FILL,
        STRETCH
    }

    /* compiled from: ScalingDrawable.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ScaleType.values().length];
            iArr[2] = 1;
            iArr[1] = 2;
            iArr[0] = 3;
            int[] iArr2 = new int[AlignmentHorizontal.values().length];
            iArr2[1] = 1;
            iArr2[2] = 2;
            int[] iArr3 = new int[AlignmentVertical.values().length];
            iArr3[1] = 1;
            iArr3[2] = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(@org.jetbrains.annotations.NotNull android.graphics.Canvas r10) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.drawable.ScalingDrawable.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f33803e.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.m32179h(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f33805g = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f33803e.setAlpha(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
