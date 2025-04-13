package com.airbnb.lottie.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.C0720L;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class Utils {

    /* renamed from: a */
    public static final PathMeasure f7847a = new PathMeasure();

    /* renamed from: b */
    public static final Path f7848b = new Path();

    /* renamed from: c */
    public static final Path f7849c = new Path();

    /* renamed from: d */
    public static final float[] f7850d = new float[4];

    /* renamed from: e */
    public static final float f7851e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* renamed from: f */
    public static float f7852f = -1.0f;

    /* renamed from: a */
    public static void m4851a(Path path, float f2, float f3, float f4) {
        PathMeasure pathMeasure = f7847a;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f2 == 1.0f && f3 == 0.0f) {
            C0720L.m4640a("applyTrimPathIfNeeded");
            return;
        }
        if (length < 1.0f || Math.abs((f3 - f2) - 1.0f) < 0.01d) {
            C0720L.m4640a("applyTrimPathIfNeeded");
            return;
        }
        float f5 = f2 * length;
        float f6 = f3 * length;
        float f7 = f4 * length;
        float min = Math.min(f5, f6) + f7;
        float max = Math.max(f5, f6) + f7;
        if (min >= length && max >= length) {
            min = MiscUtils.m4847d(min, length);
            max = MiscUtils.m4847d(max, length);
        }
        if (min < 0.0f) {
            min = MiscUtils.m4847d(min, length);
        }
        if (max < 0.0f) {
            max = MiscUtils.m4847d(max, length);
        }
        if (min == max) {
            path.reset();
            C0720L.m4640a("applyTrimPathIfNeeded");
            return;
        }
        if (min >= max) {
            min -= length;
        }
        Path path2 = f7848b;
        path2.reset();
        pathMeasure.getSegment(min, max, path2, true);
        if (max > length) {
            Path path3 = f7849c;
            path3.reset();
            pathMeasure.getSegment(0.0f, max % length, path3, true);
            path2.addPath(path3);
        } else if (min < 0.0f) {
            Path path4 = f7849c;
            path4.reset();
            pathMeasure.getSegment(min + length, length, path4, true);
            path2.addPath(path4);
        }
        path.set(path2);
        C0720L.m4640a("applyTrimPathIfNeeded");
    }

    /* renamed from: b */
    public static void m4852b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public static float m4853c() {
        if (f7852f == -1.0f) {
            f7852f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f7852f;
    }

    /* renamed from: d */
    public static float m4854d(Matrix matrix) {
        float[] fArr = f7850d;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f2 = f7851e;
        fArr[2] = f2;
        fArr[3] = f2;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    /* renamed from: e */
    public static Bitmap m4855e(Bitmap bitmap, int i2, int i3) {
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i3, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    /* renamed from: f */
    public static void m4856f(Canvas canvas, RectF rectF, Paint paint, int i2) {
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i2);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        C0720L.m4640a("Utils#saveLayer");
    }
}
