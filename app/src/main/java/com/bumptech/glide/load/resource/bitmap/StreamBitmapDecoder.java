package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.util.ExceptionCatchingInputStream;
import com.bumptech.glide.util.MarkEnforcingInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

/* loaded from: classes.dex */
public class StreamBitmapDecoder implements ResourceDecoder<InputStream, Bitmap> {

    /* renamed from: a */
    public final Downsampler f8572a;

    /* renamed from: b */
    public final ArrayPool f8573b;

    public static class UntrustedCallbacks implements Downsampler.DecodeCallbacks {

        /* renamed from: a */
        public final RecyclableBufferedInputStream f8574a;

        /* renamed from: b */
        public final ExceptionCatchingInputStream f8575b;

        public UntrustedCallbacks(RecyclableBufferedInputStream recyclableBufferedInputStream, ExceptionCatchingInputStream exceptionCatchingInputStream) {
            this.f8574a = recyclableBufferedInputStream;
            this.f8575b = exceptionCatchingInputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
        /* renamed from: a */
        public void mo5180a(BitmapPool bitmapPool, Bitmap bitmap) throws IOException {
            IOException iOException = this.f8575b.f8838c;
            if (iOException != null) {
                if (bitmap == null) {
                    throw iOException;
                }
                bitmapPool.mo5078c(bitmap);
                throw iOException;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
        /* renamed from: b */
        public void mo5181b() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f8574a;
            synchronized (recyclableBufferedInputStream) {
                recyclableBufferedInputStream.f8563d = recyclableBufferedInputStream.f8561b.length;
            }
        }
    }

    public StreamBitmapDecoder(Downsampler downsampler, ArrayPool arrayPool) {
        this.f8572a = downsampler;
        this.f8573b = arrayPool;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: a */
    public boolean mo4962a(@NonNull InputStream inputStream, @NonNull Options options) throws IOException {
        Objects.requireNonNull(this.f8572a);
        return true;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: b */
    public Resource<Bitmap> mo4963b(@NonNull InputStream inputStream, int i2, int i3, @NonNull Options options) throws IOException {
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        boolean z;
        ExceptionCatchingInputStream exceptionCatchingInputStream;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream2;
            z = false;
        } else {
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream2, this.f8573b);
            z = true;
        }
        Queue<ExceptionCatchingInputStream> queue = ExceptionCatchingInputStream.f8836d;
        synchronized (queue) {
            exceptionCatchingInputStream = (ExceptionCatchingInputStream) ((ArrayDeque) queue).poll();
        }
        if (exceptionCatchingInputStream == null) {
            exceptionCatchingInputStream = new ExceptionCatchingInputStream();
        }
        exceptionCatchingInputStream.f8837b = recyclableBufferedInputStream;
        try {
            return this.f8572a.m5178a(new MarkEnforcingInputStream(exceptionCatchingInputStream), i2, i3, options, new UntrustedCallbacks(recyclableBufferedInputStream, exceptionCatchingInputStream));
        } finally {
            exceptionCatchingInputStream.m5334a();
            if (z) {
                recyclableBufferedInputStream.m5186b();
            }
        }
    }
}
