package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.gifdecoder.GifHeader;
import com.bumptech.glide.gifdecoder.GifHeaderParser;
import com.bumptech.glide.gifdecoder.StandardGifDecoder;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.UnitTransformation;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ByteBufferGifDecoder implements ResourceDecoder<ByteBuffer, GifDrawable> {

    /* renamed from: f */
    public static final GifDecoderFactory f8594f = new GifDecoderFactory();

    /* renamed from: g */
    public static final GifHeaderParserPool f8595g = new GifHeaderParserPool();

    /* renamed from: a */
    public final Context f8596a;

    /* renamed from: b */
    public final List<ImageHeaderParser> f8597b;

    /* renamed from: c */
    public final GifHeaderParserPool f8598c;

    /* renamed from: d */
    public final GifDecoderFactory f8599d;

    /* renamed from: e */
    public final GifBitmapProvider f8600e;

    @VisibleForTesting
    public static class GifDecoderFactory {
    }

    @VisibleForTesting
    public static class GifHeaderParserPool {

        /* renamed from: a */
        public final Queue<GifHeaderParser> f8601a;

        public GifHeaderParserPool() {
            char[] cArr = Util.f8851a;
            this.f8601a = new ArrayDeque(0);
        }

        /* renamed from: a */
        public synchronized void m5201a(GifHeaderParser gifHeaderParser) {
            gifHeaderParser.f8018b = null;
            gifHeaderParser.f8019c = null;
            this.f8601a.offer(gifHeaderParser);
        }
    }

    public ByteBufferGifDecoder(Context context, List<ImageHeaderParser> list, BitmapPool bitmapPool, ArrayPool arrayPool) {
        GifHeaderParserPool gifHeaderParserPool = f8595g;
        GifDecoderFactory gifDecoderFactory = f8594f;
        this.f8596a = context.getApplicationContext();
        this.f8597b = list;
        this.f8599d = gifDecoderFactory;
        this.f8600e = new GifBitmapProvider(bitmapPool, arrayPool);
        this.f8598c = gifHeaderParserPool;
    }

    /* renamed from: d */
    public static int m5199d(GifHeader gifHeader, int i2, int i3) {
        int min = Math.min(gifHeader.f8012g / i3, gifHeader.f8011f / i2);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder m26w = C0000a.m26w("Downsampling GIF, sampleSize: ", max, ", target dimens: [", i2, "x");
            m26w.append(i3);
            m26w.append("], actual dimens: [");
            m26w.append(gifHeader.f8011f);
            m26w.append("x");
            m26w.append(gifHeader.f8012g);
            m26w.append("]");
            Log.v("BufferGifDecoder", m26w.toString());
        }
        return max;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: a */
    public boolean mo4962a(@NonNull ByteBuffer byteBuffer, @NonNull Options options) throws IOException {
        ImageHeaderParser.ImageType imageType;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (((Boolean) options.m4960c(GifOptions.f8637b)).booleanValue()) {
            return false;
        }
        List<ImageHeaderParser> list = this.f8597b;
        if (byteBuffer2 == null) {
            imageType = ImageHeaderParser.ImageType.UNKNOWN;
        } else {
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    imageType = ImageHeaderParser.ImageType.UNKNOWN;
                    break;
                }
                ImageHeaderParser.ImageType mo4951a = list.get(i2).mo4951a(byteBuffer2);
                if (mo4951a != ImageHeaderParser.ImageType.UNKNOWN) {
                    imageType = mo4951a;
                    break;
                }
                i2++;
            }
        }
        return imageType == ImageHeaderParser.ImageType.GIF;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: b */
    public Resource<GifDrawable> mo4963b(@NonNull ByteBuffer byteBuffer, int i2, int i3, @NonNull Options options) throws IOException {
        GifHeaderParser gifHeaderParser;
        ByteBuffer byteBuffer2 = byteBuffer;
        GifHeaderParserPool gifHeaderParserPool = this.f8598c;
        synchronized (gifHeaderParserPool) {
            GifHeaderParser poll = gifHeaderParserPool.f8601a.poll();
            if (poll == null) {
                poll = new GifHeaderParser();
            }
            gifHeaderParser = poll;
            gifHeaderParser.f8018b = null;
            Arrays.fill(gifHeaderParser.f8017a, (byte) 0);
            gifHeaderParser.f8019c = new GifHeader();
            gifHeaderParser.f8020d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
            gifHeaderParser.f8018b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            gifHeaderParser.f8018b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            return m5200c(byteBuffer2, i2, i3, gifHeaderParser, options);
        } finally {
            this.f8598c.m5201a(gifHeaderParser);
        }
    }

    @Nullable
    /* renamed from: c */
    public final GifDrawableResource m5200c(ByteBuffer byteBuffer, int i2, int i3, GifHeaderParser gifHeaderParser, Options options) {
        int i4 = LogTime.f8843b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            GifHeader m4941b = gifHeaderParser.m4941b();
            if (m4941b.f8008c > 0 && m4941b.f8007b == 0) {
                Bitmap.Config config = options.m4960c(GifOptions.f8636a) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int m5199d = m5199d(m4941b, i2, i3);
                GifDecoderFactory gifDecoderFactory = this.f8599d;
                GifBitmapProvider gifBitmapProvider = this.f8600e;
                Objects.requireNonNull(gifDecoderFactory);
                StandardGifDecoder standardGifDecoder = new StandardGifDecoder(gifBitmapProvider, m4941b, byteBuffer, m5199d);
                standardGifDecoder.m4948i(config);
                standardGifDecoder.f8031k = (standardGifDecoder.f8031k + 1) % standardGifDecoder.f8032l.f8008c;
                Bitmap mo4928b = standardGifDecoder.mo4928b();
                if (mo4928b == null) {
                    return null;
                }
                GifDrawableResource gifDrawableResource = new GifDrawableResource(new GifDrawable(this.f8596a, standardGifDecoder, (UnitTransformation) UnitTransformation.f8512b, i2, i3, mo4928b));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    StringBuilder m24u = C0000a.m24u("Decoded GIF from stream in ");
                    m24u.append(LogTime.m5335a(elapsedRealtimeNanos));
                    Log.v("BufferGifDecoder", m24u.toString());
                }
                return gifDrawableResource;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder m24u2 = C0000a.m24u("Decoded GIF from stream in ");
                m24u2.append(LogTime.m5335a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", m24u2.toString());
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder m24u3 = C0000a.m24u("Decoded GIF from stream in ");
                m24u3.append(LogTime.m5335a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", m24u3.toString());
            }
        }
    }
}
