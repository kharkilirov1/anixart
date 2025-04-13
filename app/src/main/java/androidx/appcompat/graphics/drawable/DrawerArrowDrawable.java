package androidx.appcompat.graphics.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000a.C0000a;

/* loaded from: classes.dex */
public class DrawerArrowDrawable extends Drawable {

    /* renamed from: b */
    public static final float f669b = (float) Math.toRadians(45.0d);

    /* renamed from: a */
    public float f670a;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ArrowDirection {
    }

    /* renamed from: a */
    public static float m518a(float f2, float f3, float f4) {
        return C0000a.m4a(f3, f2, f4, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        getBounds();
        float m518a = m518a(0.0f, (float) Math.sqrt(0.0f), this.f670a);
        Math.round(m518a(0.0f, 0.0f, this.f670a));
        double d = m518a;
        double m518a2 = m518a(0.0f, f669b, this.f670a);
        Math.round(Math.cos(m518a2) * d);
        Math.round(Math.sin(m518a2) * d);
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }
}
