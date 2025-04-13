package com.yandex.div.internal.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Px;
import com.yandex.div.internal.Assert;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: RoundedRectDrawable.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/internal/drawable/RoundedRectDrawable;", "Landroid/graphics/drawable/Drawable;", "Params", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class RoundedRectDrawable extends Drawable {

    /* renamed from: a */
    @NotNull
    public final Params f33789a;

    /* renamed from: b */
    @NotNull
    public final Paint f33790b;

    /* renamed from: c */
    @Nullable
    public final Paint f33791c;

    /* renamed from: d */
    @NotNull
    public final RectF f33792d;

    /* compiled from: RoundedRectDrawable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/drawable/RoundedRectDrawable$Params;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final /* data */ class Params {

        /* renamed from: a */
        public final float f33793a;

        /* renamed from: b */
        public final float f33794b;

        /* renamed from: c */
        public final int f33795c;

        /* renamed from: d */
        public final float f33796d;

        /* renamed from: e */
        @Nullable
        public final Integer f33797e;

        /* renamed from: f */
        @Nullable
        public final Float f33798f;

        public Params(@Px float f2, @Px float f3, int i2, @Px float f4, @Nullable Integer num, @Nullable Float f5) {
            this.f33793a = f2;
            this.f33794b = f3;
            this.f33795c = i2;
            this.f33796d = f4;
            this.f33797e = num;
            this.f33798f = f5;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return Intrinsics.m32174c(Float.valueOf(this.f33793a), Float.valueOf(params.f33793a)) && Intrinsics.m32174c(Float.valueOf(this.f33794b), Float.valueOf(params.f33794b)) && this.f33795c == params.f33795c && Intrinsics.m32174c(Float.valueOf(this.f33796d), Float.valueOf(params.f33796d)) && Intrinsics.m32174c(this.f33797e, params.f33797e) && Intrinsics.m32174c(this.f33798f, params.f33798f);
        }

        public int hashCode() {
            int floatToIntBits = (Float.floatToIntBits(this.f33796d) + ((((Float.floatToIntBits(this.f33794b) + (Float.floatToIntBits(this.f33793a) * 31)) * 31) + this.f33795c) * 31)) * 31;
            Integer num = this.f33797e;
            int hashCode = (floatToIntBits + (num == null ? 0 : num.hashCode())) * 31;
            Float f2 = this.f33798f;
            return hashCode + (f2 != null ? f2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("Params(width=");
            m24u.append(this.f33793a);
            m24u.append(", height=");
            m24u.append(this.f33794b);
            m24u.append(", color=");
            m24u.append(this.f33795c);
            m24u.append(", radius=");
            m24u.append(this.f33796d);
            m24u.append(", strokeColor=");
            m24u.append(this.f33797e);
            m24u.append(", strokeWidth=");
            m24u.append(this.f33798f);
            m24u.append(')');
            return m24u.toString();
        }
    }

    public RoundedRectDrawable(@NotNull Params params) {
        Paint paint;
        this.f33789a = params;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(params.f33795c);
        this.f33790b = paint2;
        if (params.f33797e == null || params.f33798f == null) {
            paint = null;
        } else {
            paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(params.f33797e.intValue());
            paint.setStrokeWidth(params.f33798f.floatValue());
        }
        this.f33791c = paint;
        RectF rectF = new RectF(0.0f, 0.0f, params.f33793a, params.f33794b);
        this.f33792d = rectF;
        Rect rect = new Rect();
        rectF.roundOut(rect);
        setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.m32179h(canvas, "canvas");
        this.f33790b.setColor(this.f33789a.f33795c);
        this.f33792d.set(getBounds());
        RectF rectF = this.f33792d;
        float f2 = this.f33789a.f33796d;
        canvas.drawRoundRect(rectF, f2, f2, this.f33790b);
        Paint paint = this.f33791c;
        if (paint != null) {
            RectF rectF2 = this.f33792d;
            float f3 = this.f33789a.f33796d;
            canvas.drawRoundRect(rectF2, f3, f3, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f33789a.f33794b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) this.f33789a.f33793a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        int i3 = Assert.f33709a;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        int i2 = Assert.f33709a;
    }
}
