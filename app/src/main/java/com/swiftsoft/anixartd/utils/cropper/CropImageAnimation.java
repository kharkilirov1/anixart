package com.swiftsoft.anixartd.utils.cropper;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import p000a.C0000a;

/* loaded from: classes2.dex */
final class CropImageAnimation extends Animation implements Animation.AnimationListener {

    /* renamed from: b */
    public final ImageView f30307b;

    /* renamed from: c */
    public final CropOverlayView f30308c;

    /* renamed from: d */
    public final float[] f30309d = new float[8];

    /* renamed from: e */
    public final float[] f30310e = new float[8];

    /* renamed from: f */
    public final RectF f30311f = new RectF();

    /* renamed from: g */
    public final RectF f30312g = new RectF();

    /* renamed from: h */
    public final float[] f30313h = new float[9];

    /* renamed from: i */
    public final float[] f30314i = new float[9];

    /* renamed from: j */
    public final RectF f30315j = new RectF();

    /* renamed from: k */
    public final float[] f30316k = new float[8];

    /* renamed from: l */
    public final float[] f30317l = new float[9];

    public CropImageAnimation(ImageView imageView, CropOverlayView cropOverlayView) {
        this.f30307b = imageView;
        this.f30308c = cropOverlayView;
        setDuration(300L);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f2, Transformation transformation) {
        float[] fArr;
        RectF rectF = this.f30315j;
        RectF rectF2 = this.f30311f;
        float f3 = rectF2.left;
        RectF rectF3 = this.f30312g;
        rectF.left = C0000a.m4a(rectF3.left, f3, f2, f3);
        float f4 = rectF2.top;
        rectF.top = C0000a.m4a(rectF3.top, f4, f2, f4);
        float f5 = rectF2.right;
        rectF.right = C0000a.m4a(rectF3.right, f5, f2, f5);
        float f6 = rectF2.bottom;
        rectF.bottom = C0000a.m4a(rectF3.bottom, f6, f2, f6);
        this.f30308c.setCropWindowRect(rectF);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            fArr = this.f30316k;
            if (i3 >= fArr.length) {
                break;
            }
            float[] fArr2 = this.f30309d;
            fArr[i3] = C0000a.m4a(this.f30310e[i3], fArr2[i3], f2, fArr2[i3]);
            i3++;
        }
        this.f30308c.m16437i(fArr, this.f30307b.getWidth(), this.f30307b.getHeight());
        while (true) {
            float[] fArr3 = this.f30317l;
            if (i2 >= fArr3.length) {
                Matrix imageMatrix = this.f30307b.getImageMatrix();
                imageMatrix.setValues(this.f30317l);
                this.f30307b.setImageMatrix(imageMatrix);
                this.f30307b.invalidate();
                this.f30308c.invalidate();
                return;
            }
            float[] fArr4 = this.f30313h;
            fArr3[i2] = C0000a.m4a(this.f30314i[i2], fArr4[i2], f2, fArr4[i2]);
            i2++;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f30307b.clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
