package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;

/* loaded from: classes.dex */
public class BitmapEncoder implements ResourceEncoder<Bitmap> {

    /* renamed from: b */
    public static final Option<Integer> f8517b = Option.m4958a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: c */
    public static final Option<Bitmap.CompressFormat> f8518c = new Option<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, Option.f8057e);

    /* renamed from: a */
    @Nullable
    public final ArrayPool f8519a;

    public BitmapEncoder(@NonNull ArrayPool arrayPool) {
        this.f8519a = arrayPool;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0069, code lost:
    
        if (r6 != null) goto L50;
     */
    @Override // com.bumptech.glide.load.Encoder
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo4950a(@androidx.annotation.NonNull java.lang.Object r9, @androidx.annotation.NonNull java.io.File r10, @androidx.annotation.NonNull com.bumptech.glide.load.Options r11) {
        /*
            r8 = this;
            com.bumptech.glide.load.engine.Resource r9 = (com.bumptech.glide.load.engine.Resource) r9
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            com.bumptech.glide.load.Option<android.graphics.Bitmap$CompressFormat> r1 = com.bumptech.glide.load.resource.bitmap.BitmapEncoder.f8518c
            java.lang.Object r1 = r11.m4960c(r1)
            android.graphics.Bitmap$CompressFormat r1 = (android.graphics.Bitmap.CompressFormat) r1
            if (r1 == 0) goto L15
            goto L20
        L15:
            boolean r1 = r9.hasAlpha()
            if (r1 == 0) goto L1e
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            goto L20
        L1e:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
        L20:
            r9.getWidth()
            r9.getHeight()
            int r2 = com.bumptech.glide.util.LogTime.f8843b     // Catch: java.lang.Throwable -> Lc3
            long r2 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> Lc3
            com.bumptech.glide.load.Option<java.lang.Integer> r4 = com.bumptech.glide.load.resource.bitmap.BitmapEncoder.f8517b     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r4 = r11.m4960c(r4)     // Catch: java.lang.Throwable -> Lc3
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> Lc3
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> Lc3
            r5 = 0
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r10 = r8.f8519a     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            if (r10 == 0) goto L4c
            com.bumptech.glide.load.data.BufferedOutputStream r10 = new com.bumptech.glide.load.data.BufferedOutputStream     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r6 = r8.f8519a     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r10.<init>(r7, r6)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r6 = r10
            goto L4d
        L4c:
            r6 = r7
        L4d:
            r9.compress(r1, r4, r6)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r6.close()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r5 = 1
            goto L6b
        L55:
            r9 = move-exception
            goto Lbd
        L57:
            r10 = move-exception
            r6 = r7
            goto L5d
        L5a:
            r9 = move-exception
            goto Lbc
        L5c:
            r10 = move-exception
        L5d:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L5a
            if (r4 == 0) goto L69
            java.lang.String r4 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r4, r10)     // Catch: java.lang.Throwable -> L5a
        L69:
            if (r6 == 0) goto L6e
        L6b:
            r6.close()     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Lc3
        L6e:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch: java.lang.Throwable -> Lc3
            if (r10 == 0) goto Lbb
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc3
            r10.<init>()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r4 = "Compressed with type: "
            r10.append(r4)     // Catch: java.lang.Throwable -> Lc3
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = " of size "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc3
            int r1 = com.bumptech.glide.util.Util.m5347d(r9)     // Catch: java.lang.Throwable -> Lc3
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = " in "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc3
            double r1 = com.bumptech.glide.util.LogTime.m5335a(r2)     // Catch: java.lang.Throwable -> Lc3
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = ", options format: "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc3
            com.bumptech.glide.load.Option<android.graphics.Bitmap$CompressFormat> r1 = com.bumptech.glide.load.resource.bitmap.BitmapEncoder.f8518c     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r11 = r11.m4960c(r1)     // Catch: java.lang.Throwable -> Lc3
            r10.append(r11)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r11 = ", hasAlpha: "
            r10.append(r11)     // Catch: java.lang.Throwable -> Lc3
            boolean r9 = r9.hasAlpha()     // Catch: java.lang.Throwable -> Lc3
            r10.append(r9)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> Lc3
            android.util.Log.v(r0, r9)     // Catch: java.lang.Throwable -> Lc3
        Lbb:
            return r5
        Lbc:
            r7 = r6
        Lbd:
            if (r7 == 0) goto Lc2
            r7.close()     // Catch: java.io.IOException -> Lc2 java.lang.Throwable -> Lc3
        Lc2:
            throw r9     // Catch: java.lang.Throwable -> Lc3
        Lc3:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.BitmapEncoder.mo4950a(java.lang.Object, java.io.File, com.bumptech.glide.load.Options):boolean");
    }

    @Override // com.bumptech.glide.load.ResourceEncoder
    @NonNull
    /* renamed from: b */
    public EncodeStrategy mo4964b(@NonNull Options options) {
        return EncodeStrategy.TRANSFORMED;
    }

    @Deprecated
    public BitmapEncoder() {
        this.f8519a = null;
    }
}
