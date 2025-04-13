package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public class VideoDecoder<T> implements ResourceDecoder<T, Bitmap> {

    /* renamed from: d */
    public static final Option<Long> f8581d = new Option<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new Option.CacheKeyUpdater<Long>() { // from class: com.bumptech.glide.load.resource.bitmap.VideoDecoder.1

        /* renamed from: a */
        public final ByteBuffer f8587a = ByteBuffer.allocate(8);

        @Override // com.bumptech.glide.load.Option.CacheKeyUpdater
        /* renamed from: a */
        public void mo4959a(@NonNull byte[] bArr, @NonNull Long l2, @NonNull MessageDigest messageDigest) {
            Long l3 = l2;
            messageDigest.update(bArr);
            synchronized (this.f8587a) {
                this.f8587a.position(0);
                messageDigest.update(this.f8587a.putLong(l3.longValue()).array());
            }
        }
    });

    /* renamed from: e */
    public static final Option<Integer> f8582e = new Option<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new Option.CacheKeyUpdater<Integer>() { // from class: com.bumptech.glide.load.resource.bitmap.VideoDecoder.2

        /* renamed from: a */
        public final ByteBuffer f8588a = ByteBuffer.allocate(4);

        @Override // com.bumptech.glide.load.Option.CacheKeyUpdater
        /* renamed from: a */
        public void mo4959a(@NonNull byte[] bArr, @NonNull Integer num, @NonNull MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f8588a) {
                this.f8588a.position(0);
                messageDigest.update(this.f8588a.putInt(num2.intValue()).array());
            }
        }
    });

    /* renamed from: f */
    public static final MediaMetadataRetrieverFactory f8583f = new MediaMetadataRetrieverFactory();

    /* renamed from: a */
    public final MediaMetadataRetrieverInitializer<T> f8584a;

    /* renamed from: b */
    public final BitmapPool f8585b;

    /* renamed from: c */
    public final MediaMetadataRetrieverFactory f8586c;

    public static final class AssetFileDescriptorInitializer implements MediaMetadataRetrieverInitializer<AssetFileDescriptor> {
        public AssetFileDescriptorInitializer() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverInitializer
        /* renamed from: a */
        public void mo5195a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }

        public AssetFileDescriptorInitializer(C08181 c08181) {
        }
    }

    @VisibleForTesting
    public static class MediaMetadataRetrieverFactory {
    }

    @VisibleForTesting
    public interface MediaMetadataRetrieverInitializer<T> {
        /* renamed from: a */
        void mo5195a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    public static final class ParcelFileDescriptorInitializer implements MediaMetadataRetrieverInitializer<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverInitializer
        /* renamed from: a */
        public void mo5195a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public VideoDecoder(BitmapPool bitmapPool, MediaMetadataRetrieverInitializer<T> mediaMetadataRetrieverInitializer) {
        MediaMetadataRetrieverFactory mediaMetadataRetrieverFactory = f8583f;
        this.f8585b = bitmapPool;
        this.f8584a = mediaMetadataRetrieverInitializer;
        this.f8586c = mediaMetadataRetrieverFactory;
    }

    /* renamed from: c */
    public static ResourceDecoder<AssetFileDescriptor, Bitmap> m5192c(BitmapPool bitmapPool) {
        return new VideoDecoder(bitmapPool, new AssetFileDescriptorInitializer(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.Nullable
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap m5193d(android.media.MediaMetadataRetriever r9, long r10, int r12, int r13, int r14, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r15) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L62
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L62
            if (r14 == r0) goto L62
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.f8534d
            if (r15 == r0) goto L62
            r0 = 18
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch: java.lang.Throwable -> L53
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L53
            r1 = 19
            java.lang.String r1 = r9.extractMetadata(r1)     // Catch: java.lang.Throwable -> L53
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L53
            r2 = 24
            java.lang.String r2 = r9.extractMetadata(r2)     // Catch: java.lang.Throwable -> L53
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L53
            r3 = 90
            if (r2 == r3) goto L36
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L39
        L36:
            r8 = r1
            r1 = r0
            r0 = r8
        L39:
            float r13 = r15.mo5169b(r0, r1, r13, r14)     // Catch: java.lang.Throwable -> L53
            float r14 = (float) r0     // Catch: java.lang.Throwable -> L53
            float r14 = r14 * r13
            int r6 = java.lang.Math.round(r14)     // Catch: java.lang.Throwable -> L53
            float r14 = (float) r1     // Catch: java.lang.Throwable -> L53
            float r13 = r13 * r14
            int r7 = java.lang.Math.round(r13)     // Catch: java.lang.Throwable -> L53
            r2 = r9
            r3 = r10
            r5 = r12
            android.graphics.Bitmap r13 = r2.getScaledFrameAtTime(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L53
            goto L63
        L53:
            r13 = move-exception
            r14 = 3
            java.lang.String r15 = "VideoDecoder"
            boolean r14 = android.util.Log.isLoggable(r15, r14)
            if (r14 == 0) goto L62
            java.lang.String r14 = "Exception trying to decode frame on oreo+"
            android.util.Log.d(r15, r14, r13)
        L62:
            r13 = 0
        L63:
            if (r13 != 0) goto L69
            android.graphics.Bitmap r13 = r9.getFrameAtTime(r10, r12)
        L69:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.VideoDecoder.m5193d(android.media.MediaMetadataRetriever, long, int, int, int, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy):android.graphics.Bitmap");
    }

    /* renamed from: e */
    public static ResourceDecoder<ParcelFileDescriptor, Bitmap> m5194e(BitmapPool bitmapPool) {
        return new VideoDecoder(bitmapPool, new ParcelFileDescriptorInitializer());
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: a */
    public boolean mo4962a(@NonNull T t, @NonNull Options options) {
        return true;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: b */
    public Resource<Bitmap> mo4963b(@NonNull T t, int i2, int i3, @NonNull Options options) throws IOException {
        long longValue = ((Long) options.m4960c(f8581d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException(C0000a.m11h("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
        Integer num = (Integer) options.m4960c(f8582e);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) options.m4960c(DownsampleStrategy.f8536f);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.f8535e;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        Objects.requireNonNull(this.f8586c);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                this.f8584a.mo5195a(mediaMetadataRetriever, t);
                Bitmap m5193d = m5193d(mediaMetadataRetriever, longValue, num.intValue(), i2, i3, downsampleStrategy2);
                mediaMetadataRetriever.release();
                return BitmapResource.m5158b(m5193d, this.f8585b);
            } catch (RuntimeException e2) {
                throw new IOException(e2);
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }
}
