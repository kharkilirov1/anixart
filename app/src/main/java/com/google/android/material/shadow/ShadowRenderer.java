package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import p000a.C0000a;

@RestrictTo
/* loaded from: classes.dex */
public class ShadowRenderer {

    /* renamed from: i */
    public static final int[] f18616i = new int[3];

    /* renamed from: j */
    public static final float[] f18617j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    public static final int[] f18618k = new int[4];

    /* renamed from: l */
    public static final float[] f18619l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    @NonNull
    public final Paint f18620a;

    /* renamed from: b */
    @NonNull
    public final Paint f18621b;

    /* renamed from: c */
    @NonNull
    public final Paint f18622c;

    /* renamed from: d */
    public int f18623d;

    /* renamed from: e */
    public int f18624e;

    /* renamed from: f */
    public int f18625f;

    /* renamed from: g */
    public final Path f18626g = new Path();

    /* renamed from: h */
    public final Paint f18627h;

    public ShadowRenderer() {
        Paint paint = new Paint();
        this.f18627h = paint;
        this.f18620a = new Paint();
        m10264c(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f18621b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f18622c = new Paint(paint2);
    }

    /* renamed from: a */
    public void m10262a(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i2, float f2, float f3) {
        boolean z = f3 < 0.0f;
        Path path = this.f18626g;
        if (z) {
            int[] iArr = f18618k;
            iArr[0] = 0;
            iArr[1] = this.f18625f;
            iArr[2] = this.f18624e;
            iArr[3] = this.f18623d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i2;
            rectF.inset(f4, f4);
            int[] iArr2 = f18618k;
            iArr2[0] = 0;
            iArr2[1] = this.f18623d;
            iArr2[2] = this.f18624e;
            iArr2[3] = this.f18625f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f5 = 1.0f - (i2 / width);
        float m3D = C0000a.m3D(1.0f, f5, 2.0f, f5);
        float[] fArr = f18619l;
        fArr[1] = f5;
        fArr[2] = m3D;
        this.f18621b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f18618k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f18627h);
        }
        canvas.drawArc(rectF, f2, f3, true, this.f18621b);
        canvas.restore();
    }

    /* renamed from: b */
    public void m10263b(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i2) {
        rectF.bottom += i2;
        rectF.offset(0.0f, -i2);
        int[] iArr = f18616i;
        iArr[0] = this.f18625f;
        iArr[1] = this.f18624e;
        iArr[2] = this.f18623d;
        Paint paint = this.f18622c;
        float f2 = rectF.left;
        paint.setShader(new LinearGradient(f2, rectF.top, f2, rectF.bottom, iArr, f18617j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f18622c);
        canvas.restore();
    }

    /* renamed from: c */
    public void m10264c(int i2) {
        this.f18623d = ColorUtils.m1776e(i2, 68);
        this.f18624e = ColorUtils.m1776e(i2, 20);
        this.f18625f = ColorUtils.m1776e(i2, 0);
        this.f18620a.setColor(this.f18623d);
    }
}
