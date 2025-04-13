package com.swiftsoft.anixartd.utils.cropper;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.swiftsoft.anixartd.utils.cropper.CropImageView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import p000a.C0000a;

/* loaded from: classes2.dex */
final class BitmapUtils {

    /* renamed from: a */
    public static final Rect f30291a = new Rect();

    /* renamed from: b */
    public static final RectF f30292b = new RectF();

    /* renamed from: c */
    public static final RectF f30293c = new RectF();

    /* renamed from: d */
    public static final float[] f30294d = new float[6];

    /* renamed from: e */
    public static final float[] f30295e = new float[6];

    /* renamed from: f */
    public static int f30296f;

    /* renamed from: g */
    public static Pair<String, WeakReference<Bitmap>> f30297g;

    public static final class BitmapSampled {

        /* renamed from: a */
        public final Bitmap f30298a;

        /* renamed from: b */
        public final int f30299b;

        public BitmapSampled(Bitmap bitmap, int i2) {
            this.f30298a = bitmap;
            this.f30299b = i2;
        }
    }

    public static final class RotateBitmapResult {

        /* renamed from: a */
        public final Bitmap f30300a;

        /* renamed from: b */
        public final int f30301b;

        public RotateBitmapResult(Bitmap bitmap, int i2) {
            this.f30300a = bitmap;
            this.f30301b = i2;
        }
    }

    /* renamed from: a */
    public static int m16381a(int i2, int i3) {
        int i4 = 1;
        if (f30296f == 0) {
            int i5 = RecyclerView.ViewHolder.FLAG_MOVED;
            try {
                EGL10 egl10 = (EGL10) EGLContext.getEGL();
                EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                egl10.eglInitialize(eglGetDisplay, new int[2]);
                int[] iArr = new int[1];
                egl10.eglGetConfigs(eglGetDisplay, null, 0, iArr);
                EGLConfig[] eGLConfigArr = new EGLConfig[iArr[0]];
                egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, iArr[0], iArr);
                int[] iArr2 = new int[1];
                int i6 = 0;
                for (int i7 = 0; i7 < iArr[0]; i7++) {
                    egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i7], 12332, iArr2);
                    if (i6 < iArr2[0]) {
                        i6 = iArr2[0];
                    }
                }
                egl10.eglTerminate(eglGetDisplay);
                i5 = Math.max(i6, RecyclerView.ViewHolder.FLAG_MOVED);
            } catch (Exception unused) {
            }
            f30296f = i5;
        }
        if (f30296f > 0) {
            while (true) {
                int i8 = i3 / i4;
                int i9 = f30296f;
                if (i8 <= i9 && i2 / i4 <= i9) {
                    break;
                }
                i4 *= 2;
            }
        }
        return i4;
    }

    /* renamed from: b */
    public static int m16382b(int i2, int i3, int i4, int i5) {
        int i6 = 1;
        if (i3 > i5 || i2 > i4) {
            while ((i3 / 2) / i6 > i5 && (i2 / 2) / i6 > i4) {
                i6 *= 2;
            }
        }
        return i6;
    }

    /* renamed from: c */
    public static BitmapSampled m16383c(Context context, Uri uri, float[] fArr, int i2, int i3, int i4, boolean z, int i5, int i6, int i7, int i8, boolean z2, boolean z3) {
        int i9 = 1;
        do {
            try {
                return m16384d(context, uri, fArr, i2, i3, i4, z, i5, i6, i7, i8, z2, z3, i9);
            } catch (OutOfMemoryError e2) {
                i9 *= 2;
            }
        } while (i9 <= 16);
        throw new RuntimeException("Failed to handle OOM by sampling (" + i9 + "): " + uri + "\r\n" + e2.getMessage(), e2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.swiftsoft.anixartd.utils.cropper.BitmapUtils.BitmapSampled m16384d(android.content.Context r18, android.net.Uri r19, float[] r20, int r21, int r22, int r23, boolean r24, int r25, int r26, int r27, int r28, boolean r29, boolean r30, int r31) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.utils.cropper.BitmapUtils.m16384d(android.content.Context, android.net.Uri, float[], int, int, int, boolean, int, int, int, int, boolean, boolean, int):com.swiftsoft.anixartd.utils.cropper.BitmapUtils$BitmapSampled");
    }

    /* renamed from: e */
    public static BitmapSampled m16385e(Bitmap bitmap, float[] fArr, int i2, boolean z, int i3, int i4, boolean z2, boolean z3) {
        int i5 = 1;
        do {
            try {
                return new BitmapSampled(m16386f(bitmap, fArr, i2, z, i3, i4, 1.0f / i5, z2, z3), i5);
            } catch (OutOfMemoryError e2) {
                i5 *= 2;
            }
        } while (i5 <= 8);
        throw e2;
    }

    /* renamed from: f */
    public static Bitmap m16386f(Bitmap bitmap, float[] fArr, int i2, boolean z, int i3, int i4, float f2, boolean z2, boolean z3) {
        float f3 = f2;
        Rect m16395o = m16395o(fArr, bitmap.getWidth(), bitmap.getHeight(), z, i3, i4);
        Matrix matrix = new Matrix();
        matrix.setRotate(i2, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        float f4 = z2 ? -f3 : f3;
        if (z3) {
            f3 = -f3;
        }
        matrix.postScale(f4, f3);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, m16395o.left, m16395o.top, m16395o.width(), m16395o.height(), matrix, true);
        if (createBitmap == bitmap) {
            createBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        return i2 % 90 != 0 ? m16387g(createBitmap, fArr, m16395o, i2, z, i3, i4) : createBitmap;
    }

    /* renamed from: g */
    public static Bitmap m16387g(Bitmap bitmap, float[] fArr, Rect rect, int i2, boolean z, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (i2 % 90 == 0) {
            return bitmap;
        }
        double radians = Math.toRadians(i2);
        int i8 = (i2 < 90 || (i2 > 180 && i2 < 270)) ? rect.left : rect.right;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= fArr.length) {
                i5 = 0;
                i6 = 0;
                i7 = 0;
                break;
            }
            if (fArr[i10] >= i8 - 1 && fArr[i10] <= i8 + 1) {
                int i11 = i10 + 1;
                int abs = (int) Math.abs(Math.sin(radians) * (rect.bottom - fArr[i11]));
                int abs2 = (int) Math.abs(Math.cos(radians) * (fArr[i11] - rect.top));
                int abs3 = (int) Math.abs((fArr[i11] - rect.top) / Math.sin(radians));
                int abs4 = (int) Math.abs((rect.bottom - fArr[i11]) / Math.cos(radians));
                i7 = abs2;
                i6 = abs4;
                i5 = abs;
                i9 = abs3;
                break;
            }
            i10 += 2;
        }
        rect.set(i5, i7, i9 + i5, i6 + i7);
        if (z) {
            m16391k(rect, i3, i4);
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (bitmap != createBitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* renamed from: h */
    public static Bitmap m16388h(ContentResolver contentResolver, Uri uri, BitmapFactory.Options options) throws FileNotFoundException {
        do {
            InputStream inputStream = null;
            try {
                try {
                    inputStream = contentResolver.openInputStream(uri);
                    Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, f30291a, options);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    return decodeStream;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (OutOfMemoryError unused3) {
                options.inSampleSize *= 2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused4) {
                    }
                }
            }
        } while (options.inSampleSize <= 512);
        throw new RuntimeException(C0000a.m12i("Failed to decode image: ", uri));
    }

    /* renamed from: i */
    public static BitmapSampled m16389i(Context context, Uri uri, int i2, int i3) {
        InputStream inputStream;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            try {
                inputStream = contentResolver.openInputStream(uri);
            } catch (Throwable th) {
                th = th;
                inputStream = null;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStream, f30291a, options);
                options.inJustDecodeBounds = false;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                int i4 = options.outWidth;
                if (i4 == -1 && options.outHeight == -1) {
                    throw new RuntimeException("File is not a picture");
                }
                options.inSampleSize = Math.max(m16382b(i4, options.outHeight, i2, i3), m16381a(options.outWidth, options.outHeight));
                return new BitmapSampled(m16388h(contentResolver, uri, options), options.inSampleSize);
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            throw new RuntimeException("Failed to load sampled bitmap: " + uri + "\r\n" + e2.getMessage(), e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.graphics.BitmapRegionDecoder] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.graphics.BitmapRegionDecoder] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.swiftsoft.anixartd.utils.cropper.BitmapUtils.BitmapSampled m16390j(android.content.Context r5, android.net.Uri r6, android.graphics.Rect r7, int r8, int r9, int r10) {
        /*
            r0 = 0
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6a
            r1.<init>()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6a
            int r2 = r7.width()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6a
            int r3 = r7.height()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6a
            int r8 = m16382b(r2, r3, r8, r9)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6a
            int r10 = r10 * r8
            r1.inSampleSize = r10     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6a
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6a
            java.io.InputStream r5 = r5.openInputStream(r6)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6a
            r8 = 0
            android.graphics.BitmapRegionDecoder r8 = android.graphics.BitmapRegionDecoder.newInstance(r5, r8)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L61
        L23:
            com.swiftsoft.anixartd.utils.cropper.BitmapUtils$BitmapSampled r9 = new com.swiftsoft.anixartd.utils.cropper.BitmapUtils$BitmapSampled     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.lang.OutOfMemoryError -> L3b
            android.graphics.Bitmap r10 = r8.decodeRegion(r7, r1)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.lang.OutOfMemoryError -> L3b
            int r2 = r1.inSampleSize     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.lang.OutOfMemoryError -> L3b
            r9.<init>(r10, r2)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.lang.OutOfMemoryError -> L3b
            if (r5 == 0) goto L33
            r5.close()     // Catch: java.io.IOException -> L33
        L33:
            r8.recycle()
            return r9
        L37:
            r6 = move-exception
            goto L58
        L39:
            r7 = move-exception
            goto L5a
        L3b:
            int r9 = r1.inSampleSize     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            int r9 = r9 * 2
            r1.inSampleSize = r9     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            r10 = 512(0x200, float:7.17E-43)
            if (r9 <= r10) goto L23
            if (r5 == 0) goto L4c
            r5.close()     // Catch: java.io.IOException -> L4b
            goto L4c
        L4b:
        L4c:
            if (r8 == 0) goto L51
            r8.recycle()
        L51:
            com.swiftsoft.anixartd.utils.cropper.BitmapUtils$BitmapSampled r5 = new com.swiftsoft.anixartd.utils.cropper.BitmapUtils$BitmapSampled
            r6 = 1
            r5.<init>(r0, r6)
            return r5
        L58:
            r0 = r8
            goto L5d
        L5a:
            r0 = r8
            goto L62
        L5c:
            r6 = move-exception
        L5d:
            r4 = r0
            r0 = r5
            r5 = r4
            goto L91
        L61:
            r7 = move-exception
        L62:
            r4 = r0
            r0 = r5
            r5 = r4
            goto L6d
        L66:
            r5 = move-exception
            r6 = r5
            r5 = r0
            goto L91
        L6a:
            r5 = move-exception
            r7 = r5
            r5 = r0
        L6d:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L90
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            r9.<init>()     // Catch: java.lang.Throwable -> L90
            java.lang.String r10 = "Failed to load sampled bitmap: "
            r9.append(r10)     // Catch: java.lang.Throwable -> L90
            r9.append(r6)     // Catch: java.lang.Throwable -> L90
            java.lang.String r6 = "\r\n"
            r9.append(r6)     // Catch: java.lang.Throwable -> L90
            java.lang.String r6 = r7.getMessage()     // Catch: java.lang.Throwable -> L90
            r9.append(r6)     // Catch: java.lang.Throwable -> L90
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> L90
            r8.<init>(r6, r7)     // Catch: java.lang.Throwable -> L90
            throw r8     // Catch: java.lang.Throwable -> L90
        L90:
            r6 = move-exception
        L91:
            if (r0 == 0) goto L98
            r0.close()     // Catch: java.io.IOException -> L97
            goto L98
        L97:
        L98:
            if (r5 == 0) goto L9d
            r5.recycle()
        L9d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.utils.cropper.BitmapUtils.m16390j(android.content.Context, android.net.Uri, android.graphics.Rect, int, int, int):com.swiftsoft.anixartd.utils.cropper.BitmapUtils$BitmapSampled");
    }

    /* renamed from: k */
    public static void m16391k(Rect rect, int i2, int i3) {
        if (i2 != i3 || rect.width() == rect.height()) {
            return;
        }
        if (rect.height() > rect.width()) {
            rect.bottom -= rect.height() - rect.width();
        } else {
            rect.right -= rect.width() - rect.height();
        }
    }

    /* renamed from: l */
    public static float m16392l(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    /* renamed from: m */
    public static float m16393m(float[] fArr) {
        return (m16398r(fArr) + m16397q(fArr)) / 2.0f;
    }

    /* renamed from: n */
    public static float m16394n(float[] fArr) {
        return (m16392l(fArr) + m16399s(fArr)) / 2.0f;
    }

    /* renamed from: o */
    public static Rect m16395o(float[] fArr, int i2, int i3, boolean z, int i4, int i5) {
        Rect rect = new Rect(Math.round(Math.max(0.0f, m16397q(fArr))), Math.round(Math.max(0.0f, m16399s(fArr))), Math.round(Math.min(i2, m16398r(fArr))), Math.round(Math.min(i3, m16392l(fArr))));
        if (z) {
            m16391k(rect, i4, i5);
        }
        return rect;
    }

    /* renamed from: p */
    public static float m16396p(float[] fArr) {
        return m16392l(fArr) - m16399s(fArr);
    }

    /* renamed from: q */
    public static float m16397q(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    /* renamed from: r */
    public static float m16398r(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    /* renamed from: s */
    public static float m16399s(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    /* renamed from: t */
    public static float m16400t(float[] fArr) {
        return m16398r(fArr) - m16397q(fArr);
    }

    /* renamed from: u */
    public static Bitmap m16401u(Bitmap bitmap, int i2, int i3, CropImageView.RequestSizeOptions requestSizeOptions) {
        CropImageView.RequestSizeOptions requestSizeOptions2 = CropImageView.RequestSizeOptions.RESIZE_EXACT;
        if (i2 > 0 && i3 > 0) {
            try {
                CropImageView.RequestSizeOptions requestSizeOptions3 = CropImageView.RequestSizeOptions.RESIZE_FIT;
                if (requestSizeOptions == requestSizeOptions3 || requestSizeOptions == CropImageView.RequestSizeOptions.RESIZE_INSIDE || requestSizeOptions == requestSizeOptions2) {
                    Bitmap bitmap2 = null;
                    if (requestSizeOptions == requestSizeOptions2) {
                        bitmap2 = Bitmap.createScaledBitmap(bitmap, i2, i3, false);
                    } else {
                        float width = bitmap.getWidth();
                        float height = bitmap.getHeight();
                        float max = Math.max(width / i2, height / i3);
                        if (max > 1.0f || requestSizeOptions == requestSizeOptions3) {
                            bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) (width / max), (int) (height / max), false);
                        }
                    }
                    if (bitmap2 != null) {
                        if (bitmap2 != bitmap) {
                            bitmap.recycle();
                        }
                        return bitmap2;
                    }
                }
            } catch (Exception e2) {
                Log.w("AIC", "Failed to resize cropped image, return bitmap before resize", e2);
            }
        }
        return bitmap;
    }

    /* renamed from: v */
    public static void m16402v(Context context, Bitmap bitmap, Uri uri, Bitmap.CompressFormat compressFormat, int i2) throws FileNotFoundException {
        OutputStream outputStream = null;
        try {
            outputStream = context.getContentResolver().openOutputStream(uri);
            bitmap.compress(compressFormat, i2, outputStream);
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
