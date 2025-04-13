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

/* compiled from: CircleDrawable.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/internal/drawable/CircleDrawable;", "Landroid/graphics/drawable/Drawable;", "Params", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class CircleDrawable extends Drawable {

    /* renamed from: a */
    @NotNull
    public final Params f33742a;

    /* renamed from: b */
    @NotNull
    public final Paint f33743b;

    /* renamed from: c */
    @Nullable
    public final Paint f33744c;

    /* renamed from: d */
    @NotNull
    public final RectF f33745d;

    /* compiled from: CircleDrawable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/drawable/CircleDrawable$Params;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final /* data */ class Params {

        /* renamed from: a */
        public final float f33746a;

        /* renamed from: b */
        public final int f33747b;

        /* renamed from: c */
        @Nullable
        public final Integer f33748c;

        /* renamed from: d */
        @Nullable
        public final Float f33749d;

        public Params(@Px float f2, int i2, @Nullable Integer num, @Nullable Float f3) {
            this.f33746a = f2;
            this.f33747b = i2;
            this.f33748c = num;
            this.f33749d = f3;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return Intrinsics.m32174c(Float.valueOf(this.f33746a), Float.valueOf(params.f33746a)) && this.f33747b == params.f33747b && Intrinsics.m32174c(this.f33748c, params.f33748c) && Intrinsics.m32174c(this.f33749d, params.f33749d);
        }

        public int hashCode() {
            int floatToIntBits = ((Float.floatToIntBits(this.f33746a) * 31) + this.f33747b) * 31;
            Integer num = this.f33748c;
            int hashCode = (floatToIntBits + (num == null ? 0 : num.hashCode())) * 31;
            Float f2 = this.f33749d;
            return hashCode + (f2 != null ? f2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("Params(radius=");
            m24u.append(this.f33746a);
            m24u.append(", color=");
            m24u.append(this.f33747b);
            m24u.append(", strokeColor=");
            m24u.append(this.f33748c);
            m24u.append(", strokeWidth=");
            m24u.append(this.f33749d);
            m24u.append(')');
            return m24u.toString();
        }
    }

    public CircleDrawable(@NotNull Params params) {
        Paint paint;
        this.f33742a = params;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(params.f33747b);
        this.f33743b = paint2;
        if (params.f33748c == null || params.f33749d == null) {
            paint = null;
        } else {
            paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(params.f33748c.intValue());
            paint.setStrokeWidth(params.f33749d.floatValue());
        }
        this.f33744c = paint;
        float f2 = params.f33746a * 2;
        RectF rectF = new RectF(0.0f, 0.0f, f2, f2);
        this.f33745d = rectF;
        Rect rect = new Rect();
        rectF.roundOut(rect);
        setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.m32179h(canvas, "canvas");
        this.f33743b.setColor(this.f33742a.f33747b);
        this.f33745d.set(getBounds());
        canvas.drawCircle(this.f33745d.centerX(), this.f33745d.centerY(), this.f33742a.f33746a, this.f33743b);
        if (this.f33744c != null) {
            canvas.drawCircle(this.f33745d.centerX(), this.f33745d.centerY(), this.f33742a.f33746a, this.f33744c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return ((int) this.f33742a.f33746a) * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return ((int) this.f33742a.f33746a) * 2;
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
