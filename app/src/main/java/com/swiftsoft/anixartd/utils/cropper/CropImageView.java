package com.swiftsoft.anixartd.utils.cropper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.cropper.CropOverlayView;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* loaded from: classes2.dex */
public class CropImageView extends FrameLayout {

    /* renamed from: N */
    public static final /* synthetic */ int f30366N = 0;

    /* renamed from: A */
    public OnSetImageUriCompleteListener f30367A;

    /* renamed from: B */
    public OnCropImageCompleteListener f30368B;

    /* renamed from: C */
    public Uri f30369C;

    /* renamed from: D */
    public int f30370D;

    /* renamed from: E */
    public float f30371E;

    /* renamed from: F */
    public float f30372F;

    /* renamed from: G */
    public float f30373G;

    /* renamed from: H */
    public RectF f30374H;

    /* renamed from: I */
    public int f30375I;

    /* renamed from: J */
    public boolean f30376J;

    /* renamed from: K */
    public Uri f30377K;

    /* renamed from: L */
    public WeakReference<BitmapLoadingWorkerTask> f30378L;

    /* renamed from: M */
    public WeakReference<BitmapCroppingWorkerTask> f30379M;

    /* renamed from: b */
    public final ImageView f30380b;

    /* renamed from: c */
    public final CropOverlayView f30381c;

    /* renamed from: d */
    public final Matrix f30382d;

    /* renamed from: e */
    public final Matrix f30383e;

    /* renamed from: f */
    public final ProgressBar f30384f;

    /* renamed from: g */
    public final float[] f30385g;

    /* renamed from: h */
    public final float[] f30386h;

    /* renamed from: i */
    public CropImageAnimation f30387i;

    /* renamed from: j */
    public Bitmap f30388j;

    /* renamed from: k */
    public int f30389k;

    /* renamed from: l */
    public int f30390l;

    /* renamed from: m */
    public boolean f30391m;

    /* renamed from: n */
    public boolean f30392n;

    /* renamed from: o */
    public int f30393o;

    /* renamed from: p */
    public int f30394p;

    /* renamed from: q */
    public int f30395q;

    /* renamed from: r */
    public ScaleType f30396r;

    /* renamed from: s */
    public boolean f30397s;

    /* renamed from: t */
    public boolean f30398t;

    /* renamed from: u */
    public boolean f30399u;

    /* renamed from: v */
    public boolean f30400v;

    /* renamed from: w */
    public int f30401w;

    /* renamed from: x */
    public OnSetCropOverlayReleasedListener f30402x;

    /* renamed from: y */
    public OnSetCropOverlayMovedListener f30403y;

    /* renamed from: z */
    public OnSetCropWindowChangeListener f30404z;

    public static class CropResult {

        /* renamed from: b */
        public final Uri f30406b;

        /* renamed from: c */
        public final Uri f30407c;

        /* renamed from: d */
        public final Exception f30408d;

        /* renamed from: e */
        public final float[] f30409e;

        /* renamed from: f */
        public final Rect f30410f;

        /* renamed from: g */
        public final Rect f30411g;

        /* renamed from: h */
        public final int f30412h;

        /* renamed from: i */
        public final int f30413i;

        public CropResult(Bitmap bitmap, Uri uri, Bitmap bitmap2, Uri uri2, Exception exc, float[] fArr, Rect rect, Rect rect2, int i2, int i3) {
            this.f30406b = uri;
            this.f30407c = uri2;
            this.f30408d = exc;
            this.f30409e = fArr;
            this.f30410f = rect;
            this.f30411g = rect2;
            this.f30412h = i2;
            this.f30413i = i3;
        }
    }

    public enum CropShape {
        RECTANGLE,
        OVAL
    }

    public enum Guidelines {
        /* JADX INFO: Fake field, exist only in values array */
        OFF,
        ON_TOUCH,
        ON
    }

    public interface OnCropImageCompleteListener {
        /* renamed from: k2 */
        void mo16410k2(CropImageView cropImageView, CropResult cropResult);
    }

    public interface OnSetCropOverlayMovedListener {
        /* renamed from: a */
        void m16426a(Rect rect);
    }

    public interface OnSetCropOverlayReleasedListener {
        /* renamed from: a */
        void m16427a(Rect rect);
    }

    public interface OnSetCropWindowChangeListener {
        /* renamed from: a */
        void m16428a();
    }

    public interface OnSetImageUriCompleteListener {
        /* renamed from: E2 */
        void mo16409E2(CropImageView cropImageView, Uri uri, Exception exc);
    }

    public enum RequestSizeOptions {
        NONE,
        SAMPLING,
        RESIZE_INSIDE,
        RESIZE_FIT,
        RESIZE_EXACT
    }

    public enum ScaleType {
        FIT_CENTER,
        /* JADX INFO: Fake field, exist only in values array */
        CENTER,
        /* JADX INFO: Fake field, exist only in values array */
        CENTER_CROP,
        CENTER_INSIDE
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Bundle bundleExtra;
        this.f30382d = new Matrix();
        this.f30383e = new Matrix();
        this.f30385g = new float[8];
        this.f30386h = new float[8];
        this.f30397s = false;
        this.f30398t = true;
        this.f30399u = true;
        this.f30400v = true;
        this.f30370D = 1;
        this.f30371E = 1.0f;
        CropImageOptions cropImageOptions = null;
        Intent intent = context instanceof Activity ? ((Activity) context).getIntent() : null;
        if (intent != null && (bundleExtra = intent.getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE")) != null) {
            cropImageOptions = (CropImageOptions) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
        }
        if (cropImageOptions == null) {
            cropImageOptions = new CropImageOptions();
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2507R.styleable.f25395a, 0, 0);
                try {
                    cropImageOptions.f30352m = obtainStyledAttributes.getBoolean(10, cropImageOptions.f30352m);
                    cropImageOptions.f30353n = obtainStyledAttributes.getInteger(0, cropImageOptions.f30353n);
                    cropImageOptions.f30354o = obtainStyledAttributes.getInteger(1, cropImageOptions.f30354o);
                    cropImageOptions.f30345f = ScaleType.values()[obtainStyledAttributes.getInt(26, cropImageOptions.f30345f.ordinal())];
                    cropImageOptions.f30348i = obtainStyledAttributes.getBoolean(2, cropImageOptions.f30348i);
                    cropImageOptions.f30349j = obtainStyledAttributes.getBoolean(24, cropImageOptions.f30349j);
                    cropImageOptions.f30350k = obtainStyledAttributes.getInteger(19, cropImageOptions.f30350k);
                    cropImageOptions.f30341b = CropShape.values()[obtainStyledAttributes.getInt(27, cropImageOptions.f30341b.ordinal())];
                    cropImageOptions.f30344e = Guidelines.values()[obtainStyledAttributes.getInt(13, cropImageOptions.f30344e.ordinal())];
                    cropImageOptions.f30342c = obtainStyledAttributes.getDimension(30, cropImageOptions.f30342c);
                    cropImageOptions.f30343d = obtainStyledAttributes.getDimension(31, cropImageOptions.f30343d);
                    cropImageOptions.f30351l = obtainStyledAttributes.getFloat(16, cropImageOptions.f30351l);
                    cropImageOptions.f30355p = obtainStyledAttributes.getDimension(9, cropImageOptions.f30355p);
                    cropImageOptions.f30356q = obtainStyledAttributes.getInteger(8, cropImageOptions.f30356q);
                    cropImageOptions.f30357r = obtainStyledAttributes.getDimension(7, cropImageOptions.f30357r);
                    cropImageOptions.f30358s = obtainStyledAttributes.getDimension(6, cropImageOptions.f30358s);
                    cropImageOptions.f30359t = obtainStyledAttributes.getDimension(5, cropImageOptions.f30359t);
                    cropImageOptions.f30360u = obtainStyledAttributes.getInteger(4, cropImageOptions.f30360u);
                    cropImageOptions.f30361v = obtainStyledAttributes.getDimension(15, cropImageOptions.f30361v);
                    cropImageOptions.f30362w = obtainStyledAttributes.getInteger(14, cropImageOptions.f30362w);
                    cropImageOptions.f30363x = obtainStyledAttributes.getInteger(3, cropImageOptions.f30363x);
                    cropImageOptions.f30346g = obtainStyledAttributes.getBoolean(28, this.f30398t);
                    cropImageOptions.f30347h = obtainStyledAttributes.getBoolean(29, this.f30399u);
                    cropImageOptions.f30357r = obtainStyledAttributes.getDimension(7, cropImageOptions.f30357r);
                    cropImageOptions.f30364y = (int) obtainStyledAttributes.getDimension(23, cropImageOptions.f30364y);
                    cropImageOptions.f30365z = (int) obtainStyledAttributes.getDimension(22, cropImageOptions.f30365z);
                    cropImageOptions.f30318A = (int) obtainStyledAttributes.getFloat(21, cropImageOptions.f30318A);
                    cropImageOptions.f30319B = (int) obtainStyledAttributes.getFloat(20, cropImageOptions.f30319B);
                    cropImageOptions.f30320C = (int) obtainStyledAttributes.getFloat(18, cropImageOptions.f30320C);
                    cropImageOptions.f30321D = (int) obtainStyledAttributes.getFloat(17, cropImageOptions.f30321D);
                    cropImageOptions.f30337T = obtainStyledAttributes.getBoolean(11, cropImageOptions.f30337T);
                    cropImageOptions.f30338U = obtainStyledAttributes.getBoolean(11, cropImageOptions.f30338U);
                    this.f30397s = obtainStyledAttributes.getBoolean(25, this.f30397s);
                    if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.hasValue(0) && !obtainStyledAttributes.hasValue(10)) {
                        cropImageOptions.f30352m = true;
                    }
                } finally {
                    obtainStyledAttributes.recycle();
                }
            }
        }
        cropImageOptions.m16414c();
        this.f30396r = cropImageOptions.f30345f;
        this.f30400v = cropImageOptions.f30348i;
        this.f30401w = cropImageOptions.f30350k;
        this.f30398t = cropImageOptions.f30346g;
        this.f30399u = cropImageOptions.f30347h;
        this.f30391m = cropImageOptions.f30337T;
        this.f30392n = cropImageOptions.f30338U;
        View inflate = LayoutInflater.from(context).inflate(C2507R.layout.crop_image_view, (ViewGroup) this, true);
        ImageView imageView = (ImageView) inflate.findViewById(C2507R.id.ImageView_image);
        this.f30380b = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        CropOverlayView cropOverlayView = (CropOverlayView) inflate.findViewById(C2507R.id.CropOverlayView);
        this.f30381c = cropOverlayView;
        cropOverlayView.setCropWindowChangeListener(new CropOverlayView.CropWindowChangeListener() { // from class: com.swiftsoft.anixartd.utils.cropper.CropImageView.1
            @Override // com.swiftsoft.anixartd.utils.cropper.CropOverlayView.CropWindowChangeListener
            /* renamed from: a */
            public void mo16425a(boolean z) {
                CropImageView cropImageView = CropImageView.this;
                int i2 = CropImageView.f30366N;
                cropImageView.m16417c(z, true);
                CropImageView cropImageView2 = CropImageView.this;
                OnSetCropOverlayReleasedListener onSetCropOverlayReleasedListener = cropImageView2.f30402x;
                if (onSetCropOverlayReleasedListener != null && !z) {
                    onSetCropOverlayReleasedListener.m16427a(cropImageView2.getCropRect());
                }
                CropImageView cropImageView3 = CropImageView.this;
                OnSetCropOverlayMovedListener onSetCropOverlayMovedListener = cropImageView3.f30403y;
                if (onSetCropOverlayMovedListener == null || !z) {
                    return;
                }
                onSetCropOverlayMovedListener.m16426a(cropImageView3.getCropRect());
            }
        });
        cropOverlayView.setInitialAttributeValues(cropImageOptions);
        this.f30384f = (ProgressBar) inflate.findViewById(C2507R.id.CropProgressBar);
        m16422h();
    }

    /* renamed from: a */
    public final void m16415a(float f2, float f3, boolean z, boolean z2) {
        if (this.f30388j != null) {
            if (f2 <= 0.0f || f3 <= 0.0f) {
                return;
            }
            this.f30382d.invert(this.f30383e);
            RectF cropWindowRect = this.f30381c.getCropWindowRect();
            this.f30383e.mapRect(cropWindowRect);
            this.f30382d.reset();
            this.f30382d.postTranslate((f2 - this.f30388j.getWidth()) / 2.0f, (f3 - this.f30388j.getHeight()) / 2.0f);
            m16418d();
            int i2 = this.f30390l;
            if (i2 > 0) {
                this.f30382d.postRotate(i2, BitmapUtils.m16393m(this.f30385g), BitmapUtils.m16394n(this.f30385g));
                m16418d();
            }
            float min = Math.min(f2 / BitmapUtils.m16400t(this.f30385g), f3 / BitmapUtils.m16396p(this.f30385g));
            ScaleType scaleType = this.f30396r;
            if (scaleType == ScaleType.FIT_CENTER || ((scaleType == ScaleType.CENTER_INSIDE && min < 1.0f) || (min > 1.0f && this.f30400v))) {
                this.f30382d.postScale(min, min, BitmapUtils.m16393m(this.f30385g), BitmapUtils.m16394n(this.f30385g));
                m16418d();
            }
            float f4 = this.f30391m ? -this.f30371E : this.f30371E;
            float f5 = this.f30392n ? -this.f30371E : this.f30371E;
            this.f30382d.postScale(f4, f5, BitmapUtils.m16393m(this.f30385g), BitmapUtils.m16394n(this.f30385g));
            m16418d();
            this.f30382d.mapRect(cropWindowRect);
            if (z) {
                this.f30372F = f2 > BitmapUtils.m16400t(this.f30385g) ? 0.0f : Math.max(Math.min((f2 / 2.0f) - cropWindowRect.centerX(), -BitmapUtils.m16397q(this.f30385g)), getWidth() - BitmapUtils.m16398r(this.f30385g)) / f4;
                this.f30373G = f3 <= BitmapUtils.m16396p(this.f30385g) ? Math.max(Math.min((f3 / 2.0f) - cropWindowRect.centerY(), -BitmapUtils.m16399s(this.f30385g)), getHeight() - BitmapUtils.m16392l(this.f30385g)) / f5 : 0.0f;
            } else {
                this.f30372F = Math.min(Math.max(this.f30372F * f4, -cropWindowRect.left), (-cropWindowRect.right) + f2) / f4;
                this.f30373G = Math.min(Math.max(this.f30373G * f5, -cropWindowRect.top), (-cropWindowRect.bottom) + f3) / f5;
            }
            this.f30382d.postTranslate(this.f30372F * f4, this.f30373G * f5);
            cropWindowRect.offset(this.f30372F * f4, this.f30373G * f5);
            this.f30381c.setCropWindowRect(cropWindowRect);
            m16418d();
            this.f30381c.invalidate();
            if (z2) {
                CropImageAnimation cropImageAnimation = this.f30387i;
                float[] fArr = this.f30385g;
                Matrix matrix = this.f30382d;
                System.arraycopy(fArr, 0, cropImageAnimation.f30310e, 0, 8);
                cropImageAnimation.f30312g.set(cropImageAnimation.f30308c.getCropWindowRect());
                matrix.getValues(cropImageAnimation.f30314i);
                this.f30380b.startAnimation(this.f30387i);
            } else {
                this.f30380b.setImageMatrix(this.f30382d);
            }
            m16424j(false);
        }
    }

    /* renamed from: b */
    public final void m16416b() {
        Bitmap bitmap = this.f30388j;
        if (bitmap != null && (this.f30395q > 0 || this.f30369C != null)) {
            bitmap.recycle();
        }
        this.f30388j = null;
        this.f30395q = 0;
        this.f30369C = null;
        this.f30370D = 1;
        this.f30390l = 0;
        this.f30371E = 1.0f;
        this.f30372F = 0.0f;
        this.f30373G = 0.0f;
        this.f30382d.reset();
        this.f30377K = null;
        this.f30380b.setImageBitmap(null);
        m16421g();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m16417c(boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.utils.cropper.CropImageView.m16417c(boolean, boolean):void");
    }

    /* renamed from: d */
    public final void m16418d() {
        float[] fArr = this.f30385g;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = this.f30388j.getWidth();
        float[] fArr2 = this.f30385g;
        fArr2[3] = 0.0f;
        fArr2[4] = this.f30388j.getWidth();
        this.f30385g[5] = this.f30388j.getHeight();
        float[] fArr3 = this.f30385g;
        fArr3[6] = 0.0f;
        fArr3[7] = this.f30388j.getHeight();
        this.f30382d.mapPoints(this.f30385g);
        float[] fArr4 = this.f30386h;
        fArr4[0] = 0.0f;
        fArr4[1] = 0.0f;
        fArr4[2] = 100.0f;
        fArr4[3] = 0.0f;
        fArr4[4] = 100.0f;
        fArr4[5] = 100.0f;
        fArr4[6] = 0.0f;
        fArr4[7] = 100.0f;
        this.f30382d.mapPoints(fArr4);
    }

    /* renamed from: e */
    public void m16419e(int i2) {
        if (this.f30388j != null) {
            int i3 = i2 < 0 ? (i2 % 360) + 360 : i2 % 360;
            CropOverlayView cropOverlayView = this.f30381c;
            boolean z = !cropOverlayView.f30452v && ((i3 > 45 && i3 < 135) || (i3 > 215 && i3 < 305));
            RectF rectF = BitmapUtils.f30293c;
            rectF.set(cropOverlayView.getCropWindowRect());
            float height = (z ? rectF.height() : rectF.width()) / 2.0f;
            float width = (z ? rectF.width() : rectF.height()) / 2.0f;
            if (z) {
                boolean z2 = this.f30391m;
                this.f30391m = this.f30392n;
                this.f30392n = z2;
            }
            this.f30382d.invert(this.f30383e);
            float[] fArr = BitmapUtils.f30294d;
            fArr[0] = rectF.centerX();
            fArr[1] = rectF.centerY();
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 1.0f;
            fArr[5] = 0.0f;
            this.f30383e.mapPoints(fArr);
            this.f30390l = (this.f30390l + i3) % 360;
            m16415a(getWidth(), getHeight(), true, false);
            Matrix matrix = this.f30382d;
            float[] fArr2 = BitmapUtils.f30295e;
            matrix.mapPoints(fArr2, fArr);
            float sqrt = (float) (this.f30371E / Math.sqrt(Math.pow(fArr2[5] - fArr2[3], 2.0d) + Math.pow(fArr2[4] - fArr2[2], 2.0d)));
            this.f30371E = sqrt;
            this.f30371E = Math.max(sqrt, 1.0f);
            m16415a(getWidth(), getHeight(), true, false);
            this.f30382d.mapPoints(fArr2, fArr);
            double sqrt2 = Math.sqrt(Math.pow(fArr2[5] - fArr2[3], 2.0d) + Math.pow(fArr2[4] - fArr2[2], 2.0d));
            float f2 = (float) (height * sqrt2);
            float f3 = (float) (width * sqrt2);
            rectF.set(fArr2[0] - f2, fArr2[1] - f3, fArr2[0] + f2, fArr2[1] + f3);
            this.f30381c.m16436h();
            this.f30381c.setCropWindowRect(rectF);
            m16415a(getWidth(), getHeight(), true, false);
            m16417c(false, false);
            CropOverlayView cropOverlayView2 = this.f30381c;
            RectF cropWindowRect = cropOverlayView2.getCropWindowRect();
            cropOverlayView2.m16433d(cropWindowRect);
            cropOverlayView2.f30434d.f30458a.set(cropWindowRect);
        }
    }

    /* renamed from: f */
    public final void m16420f(Bitmap bitmap, int i2, Uri uri, int i3, int i4) {
        Bitmap bitmap2 = this.f30388j;
        if (bitmap2 == null || !bitmap2.equals(bitmap)) {
            this.f30380b.clearAnimation();
            m16416b();
            this.f30388j = bitmap;
            this.f30380b.setImageBitmap(bitmap);
            this.f30369C = uri;
            this.f30395q = i2;
            this.f30370D = i3;
            this.f30390l = i4;
            m16415a(getWidth(), getHeight(), true, false);
            CropOverlayView cropOverlayView = this.f30381c;
            if (cropOverlayView != null) {
                cropOverlayView.m16436h();
                m16421g();
            }
        }
    }

    /* renamed from: g */
    public final void m16421g() {
        CropOverlayView cropOverlayView = this.f30381c;
        if (cropOverlayView != null) {
            cropOverlayView.setVisibility((!this.f30398t || this.f30388j == null) ? 4 : 0);
        }
    }

    public Pair<Integer, Integer> getAspectRatio() {
        return new Pair<>(Integer.valueOf(this.f30381c.getAspectRatioX()), Integer.valueOf(this.f30381c.getAspectRatioY()));
    }

    public float[] getCropPoints() {
        RectF cropWindowRect = this.f30381c.getCropWindowRect();
        float[] fArr = new float[8];
        float f2 = cropWindowRect.left;
        fArr[0] = f2;
        float f3 = cropWindowRect.top;
        fArr[1] = f3;
        float f4 = cropWindowRect.right;
        fArr[2] = f4;
        fArr[3] = f3;
        fArr[4] = f4;
        float f5 = cropWindowRect.bottom;
        fArr[5] = f5;
        fArr[6] = f2;
        fArr[7] = f5;
        this.f30382d.invert(this.f30383e);
        this.f30383e.mapPoints(fArr);
        for (int i2 = 0; i2 < 8; i2++) {
            fArr[i2] = fArr[i2] * this.f30370D;
        }
        return fArr;
    }

    public Rect getCropRect() {
        int i2 = this.f30370D;
        Bitmap bitmap = this.f30388j;
        if (bitmap == null) {
            return null;
        }
        float[] cropPoints = getCropPoints();
        int width = bitmap.getWidth() * i2;
        int height = i2 * bitmap.getHeight();
        CropOverlayView cropOverlayView = this.f30381c;
        return BitmapUtils.m16395o(cropPoints, width, height, cropOverlayView.f30452v, cropOverlayView.getAspectRatioX(), this.f30381c.getAspectRatioY());
    }

    public CropShape getCropShape() {
        return this.f30381c.getCropShape();
    }

    public RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.f30381c;
        if (cropOverlayView == null) {
            return null;
        }
        return cropOverlayView.getCropWindowRect();
    }

    public Bitmap getCroppedImage() {
        int i2;
        Bitmap bitmap;
        RequestSizeOptions requestSizeOptions = RequestSizeOptions.NONE;
        if (this.f30388j == null) {
            return null;
        }
        this.f30380b.clearAnimation();
        if (this.f30369C == null || this.f30370D <= 1) {
            i2 = 0;
            Bitmap bitmap2 = this.f30388j;
            float[] cropPoints = getCropPoints();
            int i3 = this.f30390l;
            CropOverlayView cropOverlayView = this.f30381c;
            bitmap = BitmapUtils.m16385e(bitmap2, cropPoints, i3, cropOverlayView.f30452v, cropOverlayView.getAspectRatioX(), this.f30381c.getAspectRatioY(), this.f30391m, this.f30392n).f30298a;
        } else {
            int width = this.f30388j.getWidth() * this.f30370D;
            int height = this.f30388j.getHeight() * this.f30370D;
            Context context = getContext();
            Uri uri = this.f30369C;
            float[] cropPoints2 = getCropPoints();
            int i4 = this.f30390l;
            CropOverlayView cropOverlayView2 = this.f30381c;
            i2 = 0;
            bitmap = BitmapUtils.m16383c(context, uri, cropPoints2, i4, width, height, cropOverlayView2.f30452v, cropOverlayView2.getAspectRatioX(), this.f30381c.getAspectRatioY(), 0, 0, this.f30391m, this.f30392n).f30298a;
        }
        return BitmapUtils.m16401u(bitmap, 0, i2, requestSizeOptions);
    }

    public void getCroppedImageAsync() {
        RequestSizeOptions requestSizeOptions = RequestSizeOptions.NONE;
        if (this.f30368B == null) {
            throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
        }
        m16423i(0, 0, requestSizeOptions, null, null, 0);
    }

    public Guidelines getGuidelines() {
        return this.f30381c.getGuidelines();
    }

    public int getImageResource() {
        return this.f30395q;
    }

    public Uri getImageUri() {
        return this.f30369C;
    }

    public int getMaxZoom() {
        return this.f30401w;
    }

    public int getRotatedDegrees() {
        return this.f30390l;
    }

    public ScaleType getScaleType() {
        return this.f30396r;
    }

    public Rect getWholeImageRect() {
        int i2 = this.f30370D;
        Bitmap bitmap = this.f30388j;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i2, bitmap.getHeight() * i2);
    }

    /* renamed from: h */
    public final void m16422h() {
        this.f30384f.setVisibility(this.f30399u && ((this.f30388j == null && this.f30378L != null) || this.f30379M != null) ? 0 : 4);
    }

    /* renamed from: i */
    public void m16423i(int i2, int i3, RequestSizeOptions requestSizeOptions, Uri uri, Bitmap.CompressFormat compressFormat, int i4) {
        CropImageView cropImageView;
        Bitmap bitmap = this.f30388j;
        if (bitmap != null) {
            this.f30380b.clearAnimation();
            WeakReference<BitmapCroppingWorkerTask> weakReference = this.f30379M;
            BitmapCroppingWorkerTask bitmapCroppingWorkerTask = weakReference != null ? weakReference.get() : null;
            if (bitmapCroppingWorkerTask != null) {
                bitmapCroppingWorkerTask.cancel(true);
            }
            RequestSizeOptions requestSizeOptions2 = RequestSizeOptions.NONE;
            int i5 = requestSizeOptions != requestSizeOptions2 ? i2 : 0;
            int i6 = requestSizeOptions != requestSizeOptions2 ? i3 : 0;
            int width = bitmap.getWidth() * this.f30370D;
            int height = bitmap.getHeight();
            int i7 = this.f30370D;
            int i8 = height * i7;
            if (this.f30369C == null || (i7 <= 1 && requestSizeOptions != RequestSizeOptions.SAMPLING)) {
                float[] cropPoints = getCropPoints();
                int i9 = this.f30390l;
                CropOverlayView cropOverlayView = this.f30381c;
                cropImageView = this;
                cropImageView.f30379M = new WeakReference<>(new BitmapCroppingWorkerTask(this, bitmap, cropPoints, i9, cropOverlayView.f30452v, cropOverlayView.getAspectRatioX(), this.f30381c.getAspectRatioY(), i5, i6, this.f30391m, this.f30392n, requestSizeOptions, uri, compressFormat, i4));
            } else {
                Uri uri2 = this.f30369C;
                float[] cropPoints2 = getCropPoints();
                int i10 = this.f30390l;
                CropOverlayView cropOverlayView2 = this.f30381c;
                this.f30379M = new WeakReference<>(new BitmapCroppingWorkerTask(this, uri2, cropPoints2, i10, width, i8, cropOverlayView2.f30452v, cropOverlayView2.getAspectRatioX(), this.f30381c.getAspectRatioY(), i5, i6, this.f30391m, this.f30392n, requestSizeOptions, uri, compressFormat, i4));
                cropImageView = this;
            }
            cropImageView.f30379M.get().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            m16422h();
        }
    }

    /* renamed from: j */
    public final void m16424j(boolean z) {
        if (this.f30388j != null && !z) {
            float m16400t = (this.f30370D * 100.0f) / BitmapUtils.m16400t(this.f30386h);
            float m16396p = (this.f30370D * 100.0f) / BitmapUtils.m16396p(this.f30386h);
            CropOverlayView cropOverlayView = this.f30381c;
            float width = getWidth();
            float height = getHeight();
            CropWindowHandler cropWindowHandler = cropOverlayView.f30434d;
            cropWindowHandler.f30462e = width;
            cropWindowHandler.f30463f = height;
            cropWindowHandler.f30468k = m16400t;
            cropWindowHandler.f30469l = m16396p;
        }
        this.f30381c.m16437i(z ? null : this.f30385g, getWidth(), getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (this.f30393o <= 0 || this.f30394p <= 0) {
            m16424j(true);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.f30393o;
        layoutParams.height = this.f30394p;
        setLayoutParams(layoutParams);
        if (this.f30388j == null) {
            m16424j(true);
            return;
        }
        float f2 = i4 - i2;
        float f3 = i5 - i3;
        m16415a(f2, f3, true, false);
        if (this.f30374H == null) {
            if (this.f30376J) {
                this.f30376J = false;
                m16417c(false, false);
                return;
            }
            return;
        }
        int i6 = this.f30375I;
        if (i6 != this.f30389k) {
            this.f30390l = i6;
            m16415a(f2, f3, true, false);
        }
        this.f30382d.mapRect(this.f30374H);
        this.f30381c.setCropWindowRect(this.f30374H);
        m16417c(false, false);
        CropOverlayView cropOverlayView = this.f30381c;
        RectF cropWindowRect = cropOverlayView.getCropWindowRect();
        cropOverlayView.m16433d(cropWindowRect);
        cropOverlayView.f30434d.f30458a.set(cropWindowRect);
        this.f30374H = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int width;
        int i4;
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        Bitmap bitmap = this.f30388j;
        if (bitmap == null) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (size2 == 0) {
            size2 = bitmap.getHeight();
        }
        double width2 = size < this.f30388j.getWidth() ? size / this.f30388j.getWidth() : Double.POSITIVE_INFINITY;
        double height = size2 < this.f30388j.getHeight() ? size2 / this.f30388j.getHeight() : Double.POSITIVE_INFINITY;
        if (width2 == Double.POSITIVE_INFINITY && height == Double.POSITIVE_INFINITY) {
            width = this.f30388j.getWidth();
            i4 = this.f30388j.getHeight();
        } else if (width2 <= height) {
            i4 = (int) (this.f30388j.getHeight() * width2);
            width = size;
        } else {
            width = (int) (this.f30388j.getWidth() * height);
            i4 = size2;
        }
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(width, size) : width;
        }
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(i4, size2) : i4;
        }
        this.f30393o = size;
        this.f30394p = size2;
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        if (this.f30378L == null && this.f30369C == null && this.f30388j == null && this.f30395q == 0) {
            Uri uri = (Uri) bundle.getParcelable("LOADED_IMAGE_URI");
            if (uri != null) {
                String string = bundle.getString("LOADED_IMAGE_STATE_BITMAP_KEY");
                if (string != null) {
                    Pair<String, WeakReference<Bitmap>> pair = BitmapUtils.f30297g;
                    Bitmap bitmap = (pair == null || !((String) pair.first).equals(string)) ? null : (Bitmap) ((WeakReference) BitmapUtils.f30297g.second).get();
                    BitmapUtils.f30297g = null;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        m16420f(bitmap, 0, uri, bundle.getInt("LOADED_SAMPLE_SIZE"), 0);
                    }
                }
                if (this.f30369C == null) {
                    setImageUriAsync(uri);
                }
            } else {
                int i2 = bundle.getInt("LOADED_IMAGE_RESOURCE");
                if (i2 > 0) {
                    setImageResource(i2);
                } else {
                    Uri uri2 = (Uri) bundle.getParcelable("LOADING_IMAGE_URI");
                    if (uri2 != null) {
                        setImageUriAsync(uri2);
                    }
                }
            }
            int i3 = bundle.getInt("DEGREES_ROTATED");
            this.f30375I = i3;
            this.f30390l = i3;
            Rect rect = (Rect) bundle.getParcelable("INITIAL_CROP_RECT");
            if (rect != null && (rect.width() > 0 || rect.height() > 0)) {
                this.f30381c.setInitialCropWindowRect(rect);
            }
            RectF rectF = (RectF) bundle.getParcelable("CROP_WINDOW_RECT");
            if (rectF != null && (rectF.width() > 0.0f || rectF.height() > 0.0f)) {
                this.f30374H = rectF;
            }
            this.f30381c.setCropShape(CropShape.valueOf(bundle.getString("CROP_SHAPE")));
            this.f30400v = bundle.getBoolean("CROP_AUTO_ZOOM_ENABLED");
            this.f30401w = bundle.getInt("CROP_MAX_ZOOM");
            this.f30391m = bundle.getBoolean("CROP_FLIP_HORIZONTALLY");
            this.f30392n = bundle.getBoolean("CROP_FLIP_VERTICALLY");
        }
        super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        BitmapLoadingWorkerTask bitmapLoadingWorkerTask;
        boolean z = true;
        if (this.f30369C == null && this.f30388j == null && this.f30395q < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        Uri uri = this.f30369C;
        if (this.f30397s && uri == null && this.f30395q < 1) {
            Context context = getContext();
            Bitmap bitmap = this.f30388j;
            Uri uri2 = this.f30377K;
            Rect rect = BitmapUtils.f30291a;
            try {
                if (uri2 == null) {
                    uri2 = Uri.fromFile(File.createTempFile("aic_state_store_temp", ".jpg", context.getCacheDir()));
                } else if (new File(uri2.getPath()).exists()) {
                    z = false;
                }
                if (z) {
                    BitmapUtils.m16402v(context, bitmap, uri2, Bitmap.CompressFormat.JPEG, 95);
                }
                uri = uri2;
            } catch (Exception e2) {
                Log.w("AIC", "Failed to write bitmap to temp file for image-cropper save instance state", e2);
                uri = null;
            }
            this.f30377K = uri;
        }
        if (uri != null && this.f30388j != null) {
            String uuid = UUID.randomUUID().toString();
            BitmapUtils.f30297g = new Pair<>(uuid, new WeakReference(this.f30388j));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", uuid);
        }
        WeakReference<BitmapLoadingWorkerTask> weakReference = this.f30378L;
        if (weakReference != null && (bitmapLoadingWorkerTask = weakReference.get()) != null) {
            bundle.putParcelable("LOADING_IMAGE_URI", bitmapLoadingWorkerTask.f30282b);
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uri);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.f30395q);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.f30370D);
        bundle.putInt("DEGREES_ROTATED", this.f30390l);
        bundle.putParcelable("INITIAL_CROP_RECT", this.f30381c.getInitialCropWindowRect());
        RectF rectF = BitmapUtils.f30293c;
        rectF.set(this.f30381c.getCropWindowRect());
        this.f30382d.invert(this.f30383e);
        this.f30383e.mapRect(rectF);
        bundle.putParcelable("CROP_WINDOW_RECT", rectF);
        bundle.putString("CROP_SHAPE", this.f30381c.getCropShape().name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.f30400v);
        bundle.putInt("CROP_MAX_ZOOM", this.f30401w);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.f30391m);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.f30392n);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f30376J = i4 > 0 && i5 > 0;
    }

    public void setAutoZoomEnabled(boolean z) {
        if (this.f30400v != z) {
            this.f30400v = z;
            m16417c(false, false);
            this.f30381c.invalidate();
        }
    }

    public void setCropRect(Rect rect) {
        this.f30381c.setInitialCropWindowRect(rect);
    }

    public void setCropShape(CropShape cropShape) {
        this.f30381c.setCropShape(cropShape);
    }

    public void setFixedAspectRatio(boolean z) {
        this.f30381c.setFixedAspectRatio(z);
    }

    public void setFlippedHorizontally(boolean z) {
        if (this.f30391m != z) {
            this.f30391m = z;
            m16415a(getWidth(), getHeight(), true, false);
        }
    }

    public void setFlippedVertically(boolean z) {
        if (this.f30392n != z) {
            this.f30392n = z;
            m16415a(getWidth(), getHeight(), true, false);
        }
    }

    public void setGuidelines(Guidelines guidelines) {
        this.f30381c.setGuidelines(guidelines);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f30381c.setInitialCropWindowRect(null);
        m16420f(bitmap, 0, null, 1, 0);
    }

    public void setImageResource(int i2) {
        if (i2 != 0) {
            this.f30381c.setInitialCropWindowRect(null);
            m16420f(BitmapFactory.decodeResource(getResources(), i2), i2, null, 1, 0);
        }
    }

    public void setImageUriAsync(Uri uri) {
        if (uri != null) {
            WeakReference<BitmapLoadingWorkerTask> weakReference = this.f30378L;
            BitmapLoadingWorkerTask bitmapLoadingWorkerTask = weakReference != null ? weakReference.get() : null;
            if (bitmapLoadingWorkerTask != null) {
                bitmapLoadingWorkerTask.cancel(true);
            }
            m16416b();
            this.f30374H = null;
            this.f30375I = 0;
            this.f30381c.setInitialCropWindowRect(null);
            WeakReference<BitmapLoadingWorkerTask> weakReference2 = new WeakReference<>(new BitmapLoadingWorkerTask(this, uri));
            this.f30378L = weakReference2;
            weakReference2.get().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            m16422h();
        }
    }

    public void setMaxZoom(int i2) {
        if (this.f30401w == i2 || i2 <= 0) {
            return;
        }
        this.f30401w = i2;
        m16417c(false, false);
        this.f30381c.invalidate();
    }

    public void setMultiTouchEnabled(boolean z) {
        if (this.f30381c.m16438j(z)) {
            m16417c(false, false);
            this.f30381c.invalidate();
        }
    }

    public void setOnCropImageCompleteListener(OnCropImageCompleteListener onCropImageCompleteListener) {
        this.f30368B = onCropImageCompleteListener;
    }

    public void setOnCropWindowChangedListener(OnSetCropWindowChangeListener onSetCropWindowChangeListener) {
        this.f30404z = onSetCropWindowChangeListener;
    }

    public void setOnSetCropOverlayMovedListener(OnSetCropOverlayMovedListener onSetCropOverlayMovedListener) {
        this.f30403y = onSetCropOverlayMovedListener;
    }

    public void setOnSetCropOverlayReleasedListener(OnSetCropOverlayReleasedListener onSetCropOverlayReleasedListener) {
        this.f30402x = onSetCropOverlayReleasedListener;
    }

    public void setOnSetImageUriCompleteListener(OnSetImageUriCompleteListener onSetImageUriCompleteListener) {
        this.f30367A = onSetImageUriCompleteListener;
    }

    public void setRotatedDegrees(int i2) {
        int i3 = this.f30390l;
        if (i3 != i2) {
            m16419e(i2 - i3);
        }
    }

    public void setSaveBitmapToInstanceState(boolean z) {
        this.f30397s = z;
    }

    public void setScaleType(ScaleType scaleType) {
        if (scaleType != this.f30396r) {
            this.f30396r = scaleType;
            this.f30371E = 1.0f;
            this.f30373G = 0.0f;
            this.f30372F = 0.0f;
            this.f30381c.m16436h();
            requestLayout();
        }
    }

    public void setShowCropOverlay(boolean z) {
        if (this.f30398t != z) {
            this.f30398t = z;
            m16421g();
        }
    }

    public void setShowProgressBar(boolean z) {
        if (this.f30399u != z) {
            this.f30399u = z;
            m16422h();
        }
    }

    public void setSnapRadius(float f2) {
        if (f2 >= 0.0f) {
            this.f30381c.setSnapRadius(f2);
        }
    }
}
