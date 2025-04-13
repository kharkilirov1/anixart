package com.swiftsoft.anixartd.utils.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import androidx.exifinterface.media.ExifInterface;
import com.swiftsoft.anixartd.utils.cropper.BitmapUtils;
import com.swiftsoft.anixartd.utils.cropper.CropImageView;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class BitmapLoadingWorkerTask extends AsyncTask<Void, Void, Result> {

    /* renamed from: a */
    public final WeakReference<CropImageView> f30281a;

    /* renamed from: b */
    public final Uri f30282b;

    /* renamed from: c */
    public final Context f30283c;

    /* renamed from: d */
    public final int f30284d;

    /* renamed from: e */
    public final int f30285e;

    public BitmapLoadingWorkerTask(CropImageView cropImageView, Uri uri) {
        this.f30282b = uri;
        this.f30281a = new WeakReference<>(cropImageView);
        this.f30283c = cropImageView.getContext();
        double d = cropImageView.getResources().getDisplayMetrics().density > 1.0f ? 1.0f / r6 : 1.0d;
        this.f30284d = (int) (r5.widthPixels * d);
        this.f30285e = (int) (r5.heightPixels * d);
    }

    @Override // android.os.AsyncTask
    public Result doInBackground(Void[] voidArr) {
        BitmapUtils.RotateBitmapResult rotateBitmapResult;
        try {
            ExifInterface exifInterface = null;
            if (isCancelled()) {
                return null;
            }
            BitmapUtils.BitmapSampled m16389i = BitmapUtils.m16389i(this.f30283c, this.f30282b, this.f30284d, this.f30285e);
            if (isCancelled()) {
                return null;
            }
            Bitmap bitmap = m16389i.f30298a;
            Context context = this.f30283c;
            try {
                InputStream openInputStream = context.getContentResolver().openInputStream(this.f30282b);
                if (openInputStream != null) {
                    ExifInterface exifInterface2 = new ExifInterface(openInputStream);
                    try {
                        openInputStream.close();
                    } catch (Exception unused) {
                    }
                    exifInterface = exifInterface2;
                }
            } catch (Exception unused2) {
            }
            int i2 = 0;
            if (exifInterface != null) {
                int m2894c = exifInterface.m2894c("Orientation", 1);
                if (m2894c == 3) {
                    i2 = 180;
                } else if (m2894c == 6) {
                    i2 = 90;
                } else if (m2894c == 8) {
                    i2 = 270;
                }
                rotateBitmapResult = new BitmapUtils.RotateBitmapResult(bitmap, i2);
            } else {
                rotateBitmapResult = new BitmapUtils.RotateBitmapResult(bitmap, 0);
            }
            return new Result(this.f30282b, rotateBitmapResult.f30300a, m16389i.f30299b, rotateBitmapResult.f30301b);
        } catch (Exception e2) {
            return new Result(this.f30282b, e2);
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Result result) {
        Bitmap bitmap;
        CropImageView cropImageView;
        Result result2 = result;
        if (result2 != null) {
            boolean z = false;
            if (!isCancelled() && (cropImageView = this.f30281a.get()) != null) {
                z = true;
                cropImageView.f30378L = null;
                cropImageView.m16422h();
                if (result2.f30290e == null) {
                    int i2 = result2.f30289d;
                    cropImageView.f30389k = i2;
                    cropImageView.m16420f(result2.f30287b, 0, result2.f30286a, result2.f30288c, i2);
                }
                CropImageView.OnSetImageUriCompleteListener onSetImageUriCompleteListener = cropImageView.f30367A;
                if (onSetImageUriCompleteListener != null) {
                    onSetImageUriCompleteListener.mo16409E2(cropImageView, result2.f30286a, result2.f30290e);
                }
            }
            if (z || (bitmap = result2.f30287b) == null) {
                return;
            }
            bitmap.recycle();
        }
    }

    public static final class Result {

        /* renamed from: a */
        public final Uri f30286a;

        /* renamed from: b */
        public final Bitmap f30287b;

        /* renamed from: c */
        public final int f30288c;

        /* renamed from: d */
        public final int f30289d;

        /* renamed from: e */
        public final Exception f30290e;

        public Result(Uri uri, Bitmap bitmap, int i2, int i3) {
            this.f30286a = uri;
            this.f30287b = bitmap;
            this.f30288c = i2;
            this.f30289d = i3;
            this.f30290e = null;
        }

        public Result(Uri uri, Exception exc) {
            this.f30286a = uri;
            this.f30287b = null;
            this.f30288c = 0;
            this.f30289d = 0;
            this.f30290e = exc;
        }
    }
}
