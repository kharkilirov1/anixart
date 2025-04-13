package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class Downsampler {

    /* renamed from: f */
    public static final Option<DecodeFormat> f8540f = Option.m4958a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.PREFER_ARGB_8888);

    /* renamed from: g */
    public static final Option<Boolean> f8541g;

    /* renamed from: h */
    public static final Option<Boolean> f8542h;

    /* renamed from: i */
    public static final Set<String> f8543i;

    /* renamed from: j */
    public static final DecodeCallbacks f8544j;

    /* renamed from: k */
    public static final Queue<BitmapFactory.Options> f8545k;

    /* renamed from: a */
    public final BitmapPool f8546a;

    /* renamed from: b */
    public final DisplayMetrics f8547b;

    /* renamed from: c */
    public final ArrayPool f8548c;

    /* renamed from: d */
    public final List<ImageHeaderParser> f8549d;

    /* renamed from: e */
    public final HardwareConfigState f8550e;

    public interface DecodeCallbacks {
        /* renamed from: a */
        void mo5180a(BitmapPool bitmapPool, Bitmap bitmap) throws IOException;

        /* renamed from: b */
        void mo5181b();
    }

    static {
        Option<DownsampleStrategy> option = DownsampleStrategy.f8536f;
        Boolean bool = Boolean.FALSE;
        f8541g = Option.m4958a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f8542h = Option.m4958a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f8543i = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f8544j = new DecodeCallbacks() { // from class: com.bumptech.glide.load.resource.bitmap.Downsampler.1
            @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
            /* renamed from: a */
            public void mo5180a(BitmapPool bitmapPool, Bitmap bitmap) {
            }

            @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
            /* renamed from: b */
            public void mo5181b() {
            }
        };
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = Util.f8851a;
        f8545k = new ArrayDeque(0);
    }

    public Downsampler(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, BitmapPool bitmapPool, ArrayPool arrayPool) {
        if (HardwareConfigState.f8556d == null) {
            synchronized (HardwareConfigState.class) {
                if (HardwareConfigState.f8556d == null) {
                    HardwareConfigState.f8556d = new HardwareConfigState();
                }
            }
        }
        this.f8550e = HardwareConfigState.f8556d;
        this.f8549d = list;
        Objects.requireNonNull(displayMetrics, "Argument must not be null");
        this.f8547b = displayMetrics;
        Objects.requireNonNull(bitmapPool, "Argument must not be null");
        this.f8546a = bitmapPool;
        Objects.requireNonNull(arrayPool, "Argument must not be null");
        this.f8548c = arrayPool;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        throw r1;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap m5170c(java.io.InputStream r6, android.graphics.BitmapFactory.Options r7, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks r8, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r9) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r7.inJustDecodeBounds
            if (r1 == 0) goto Lc
            r1 = 10485760(0xa00000, float:1.469368E-38)
            r6.mark(r1)
            goto Lf
        Lc:
            r8.mo5181b()
        Lf:
            int r1 = r7.outWidth
            int r2 = r7.outHeight
            java.lang.String r3 = r7.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.f8579d
            r4.lock()
            r5 = 0
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r6, r5, r7)     // Catch: java.lang.Throwable -> L2a java.lang.IllegalArgumentException -> L2c
            r4.unlock()
            boolean r7 = r7.inJustDecodeBounds
            if (r7 == 0) goto L29
            r6.reset()
        L29:
            return r8
        L2a:
            r6 = move-exception
            goto L57
        L2c:
            r4 = move-exception
            java.io.IOException r1 = m5174g(r4, r1, r2, r3, r7)     // Catch: java.lang.Throwable -> L2a
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L3d
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L2a
        L3d:
            android.graphics.Bitmap r0 = r7.inBitmap     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L56
            r6.reset()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L55
            android.graphics.Bitmap r0 = r7.inBitmap     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L55
            r9.mo5078c(r0)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L55
            r7.inBitmap = r5     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L55
            android.graphics.Bitmap r6 = m5170c(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L55
            java.util.concurrent.locks.Lock r7 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.f8579d
            r7.unlock()
            return r6
        L55:
            throw r1     // Catch: java.lang.Throwable -> L2a
        L56:
            throw r1     // Catch: java.lang.Throwable -> L2a
        L57:
            java.util.concurrent.locks.Lock r7 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.f8579d
            r7.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.Downsampler.m5170c(java.io.InputStream, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool):android.graphics.Bitmap");
    }

    @Nullable
    @TargetApi
    /* renamed from: d */
    public static String m5171d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder m24u = C0000a.m24u(" (");
        m24u.append(bitmap.getAllocationByteCount());
        m24u.append(")");
        String sb = m24u.toString();
        StringBuilder m24u2 = C0000a.m24u("[");
        m24u2.append(bitmap.getWidth());
        m24u2.append("x");
        m24u2.append(bitmap.getHeight());
        m24u2.append("] ");
        m24u2.append(bitmap.getConfig());
        m24u2.append(sb);
        return m24u2.toString();
    }

    /* renamed from: e */
    public static int m5172e(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: f */
    public static int[] m5173f(InputStream inputStream, BitmapFactory.Options options, DecodeCallbacks decodeCallbacks, BitmapPool bitmapPool) throws IOException {
        options.inJustDecodeBounds = true;
        m5170c(inputStream, options, decodeCallbacks, bitmapPool);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: g */
    public static IOException m5174g(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        StringBuilder m26w = C0000a.m26w("Exception decoding bitmap, outWidth: ", i2, ", outHeight: ", i3, ", outMimeType: ");
        m26w.append(str);
        m26w.append(", inBitmap: ");
        m26w.append(m5171d(options.inBitmap));
        return new IOException(m26w.toString(), illegalArgumentException);
    }

    /* renamed from: h */
    public static void m5175h(BitmapFactory.Options options) {
        m5176i(options);
        Queue<BitmapFactory.Options> queue = f8545k;
        synchronized (queue) {
            ((ArrayDeque) queue).offer(options);
        }
    }

    /* renamed from: i */
    public static void m5176i(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: j */
    public static int m5177j(double d) {
        return (int) (d + 0.5d);
    }

    /* renamed from: a */
    public Resource<Bitmap> m5178a(InputStream inputStream, int i2, int i3, Options options, DecodeCallbacks decodeCallbacks) throws IOException {
        BitmapFactory.Options options2;
        BitmapFactory.Options options3;
        Preconditions.m5343a(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        byte[] bArr = (byte[]) this.f8548c.mo5065d(TextBuffer.MAX_SEGMENT_LEN, byte[].class);
        synchronized (Downsampler.class) {
            Queue<BitmapFactory.Options> queue = f8545k;
            synchronized (queue) {
                options2 = (BitmapFactory.Options) ((ArrayDeque) queue).poll();
            }
            if (options2 == null) {
                options2 = new BitmapFactory.Options();
                m5176i(options2);
            }
            options3 = options2;
        }
        options3.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) options.m4960c(f8540f);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) options.m4960c(DownsampleStrategy.f8536f);
        boolean booleanValue = ((Boolean) options.m4960c(f8541g)).booleanValue();
        Option<Boolean> option = f8542h;
        try {
            return BitmapResource.m5158b(m5179b(inputStream, options3, downsampleStrategy, decodeFormat, options.m4960c(option) != null && ((Boolean) options.m4960c(option)).booleanValue(), i2, i3, booleanValue, decodeCallbacks), this.f8546a);
        } finally {
            m5175h(options3);
            this.f8548c.put(bArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02db  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap m5179b(java.io.InputStream r29, android.graphics.BitmapFactory.Options r30, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r31, com.bumptech.glide.load.DecodeFormat r32, boolean r33, int r34, int r35, boolean r36, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks r37) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.Downsampler.m5179b(java.io.InputStream, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.DecodeFormat, boolean, int, int, boolean, com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks):android.graphics.Bitmap");
    }
}
