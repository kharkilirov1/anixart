package com.swiftsoft.anixartd.utils.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.swiftsoft.anixartd.utils.cropper.BitmapUtils;
import com.swiftsoft.anixartd.utils.cropper.CropImageView;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class BitmapCroppingWorkerTask extends AsyncTask<Void, Void, Result> {

    /* renamed from: a */
    public final WeakReference<CropImageView> f30258a;

    /* renamed from: b */
    public final Bitmap f30259b;

    /* renamed from: c */
    public final Uri f30260c;

    /* renamed from: d */
    public final Context f30261d;

    /* renamed from: e */
    public final float[] f30262e;

    /* renamed from: f */
    public final int f30263f;

    /* renamed from: g */
    public final int f30264g;

    /* renamed from: h */
    public final int f30265h;

    /* renamed from: i */
    public final boolean f30266i;

    /* renamed from: j */
    public final int f30267j;

    /* renamed from: k */
    public final int f30268k;

    /* renamed from: l */
    public final int f30269l;

    /* renamed from: m */
    public final int f30270m;

    /* renamed from: n */
    public final boolean f30271n;

    /* renamed from: o */
    public final boolean f30272o;

    /* renamed from: p */
    public final CropImageView.RequestSizeOptions f30273p;

    /* renamed from: q */
    public final Uri f30274q;

    /* renamed from: r */
    public final Bitmap.CompressFormat f30275r;

    /* renamed from: s */
    public final int f30276s;

    public BitmapCroppingWorkerTask(CropImageView cropImageView, Bitmap bitmap, float[] fArr, int i2, boolean z, int i3, int i4, int i5, int i6, boolean z2, boolean z3, CropImageView.RequestSizeOptions requestSizeOptions, Uri uri, Bitmap.CompressFormat compressFormat, int i7) {
        this.f30258a = new WeakReference<>(cropImageView);
        this.f30261d = cropImageView.getContext();
        this.f30259b = bitmap;
        this.f30262e = fArr;
        this.f30260c = null;
        this.f30263f = i2;
        this.f30266i = z;
        this.f30267j = i3;
        this.f30268k = i4;
        this.f30269l = i5;
        this.f30270m = i6;
        this.f30271n = z2;
        this.f30272o = z3;
        this.f30273p = requestSizeOptions;
        this.f30274q = uri;
        this.f30275r = compressFormat;
        this.f30276s = i7;
        this.f30264g = 0;
        this.f30265h = 0;
    }

    @Override // android.os.AsyncTask
    public Result doInBackground(Void[] voidArr) {
        BitmapUtils.BitmapSampled m16385e;
        try {
            if (isCancelled()) {
                return null;
            }
            Uri uri = this.f30260c;
            if (uri != null) {
                m16385e = BitmapUtils.m16383c(this.f30261d, uri, this.f30262e, this.f30263f, this.f30264g, this.f30265h, this.f30266i, this.f30267j, this.f30268k, this.f30269l, this.f30270m, this.f30271n, this.f30272o);
            } else {
                Bitmap bitmap = this.f30259b;
                if (bitmap == null) {
                    return new Result((Bitmap) null, 1);
                }
                m16385e = BitmapUtils.m16385e(bitmap, this.f30262e, this.f30263f, this.f30266i, this.f30267j, this.f30268k, this.f30271n, this.f30272o);
            }
            Bitmap m16401u = BitmapUtils.m16401u(m16385e.f30298a, this.f30269l, this.f30270m, this.f30273p);
            Uri uri2 = this.f30274q;
            if (uri2 == null) {
                return new Result(m16401u, m16385e.f30299b);
            }
            BitmapUtils.m16402v(this.f30261d, m16401u, uri2, this.f30275r, this.f30276s);
            m16401u.recycle();
            return new Result(this.f30274q, m16385e.f30299b);
        } catch (Exception e2) {
            return new Result(e2, this.f30274q != null);
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Result result) {
        Bitmap bitmap;
        CropImageView cropImageView;
        Result result2 = result;
        if (result2 != null) {
            boolean z = false;
            if (!isCancelled() && (cropImageView = this.f30258a.get()) != null) {
                cropImageView.f30379M = null;
                cropImageView.m16422h();
                CropImageView.OnCropImageCompleteListener onCropImageCompleteListener = cropImageView.f30368B;
                if (onCropImageCompleteListener != null) {
                    onCropImageCompleteListener.mo16410k2(cropImageView, new CropImageView.CropResult(cropImageView.f30388j, cropImageView.f30369C, result2.f30277a, result2.f30278b, result2.f30279c, cropImageView.getCropPoints(), cropImageView.getCropRect(), cropImageView.getWholeImageRect(), cropImageView.getRotatedDegrees(), result2.f30280d));
                }
                z = true;
            }
            if (z || (bitmap = result2.f30277a) == null) {
                return;
            }
            bitmap.recycle();
        }
    }

    public static final class Result {

        /* renamed from: a */
        public final Bitmap f30277a;

        /* renamed from: b */
        public final Uri f30278b;

        /* renamed from: c */
        public final Exception f30279c;

        /* renamed from: d */
        public final int f30280d;

        public Result(Bitmap bitmap, int i2) {
            this.f30277a = bitmap;
            this.f30278b = null;
            this.f30279c = null;
            this.f30280d = i2;
        }

        public Result(Uri uri, int i2) {
            this.f30277a = null;
            this.f30278b = uri;
            this.f30279c = null;
            this.f30280d = i2;
        }

        public Result(Exception exc, boolean z) {
            this.f30277a = null;
            this.f30278b = null;
            this.f30279c = exc;
            this.f30280d = 1;
        }
    }

    public BitmapCroppingWorkerTask(CropImageView cropImageView, Uri uri, float[] fArr, int i2, int i3, int i4, boolean z, int i5, int i6, int i7, int i8, boolean z2, boolean z3, CropImageView.RequestSizeOptions requestSizeOptions, Uri uri2, Bitmap.CompressFormat compressFormat, int i9) {
        this.f30258a = new WeakReference<>(cropImageView);
        this.f30261d = cropImageView.getContext();
        this.f30260c = uri;
        this.f30262e = fArr;
        this.f30263f = i2;
        this.f30266i = z;
        this.f30267j = i5;
        this.f30268k = i6;
        this.f30264g = i3;
        this.f30265h = i4;
        this.f30269l = i7;
        this.f30270m = i8;
        this.f30271n = z2;
        this.f30272o = z3;
        this.f30273p = requestSizeOptions;
        this.f30274q = uri2;
        this.f30275r = compressFormat;
        this.f30276s = i9;
        this.f30259b = null;
    }
}
