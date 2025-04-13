package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public class StreamGifDecoder implements ResourceDecoder<InputStream, GifDrawable> {

    /* renamed from: a */
    public final List<ImageHeaderParser> f8638a;

    /* renamed from: b */
    public final ResourceDecoder<ByteBuffer, GifDrawable> f8639b;

    /* renamed from: c */
    public final ArrayPool f8640c;

    public StreamGifDecoder(List<ImageHeaderParser> list, ResourceDecoder<ByteBuffer, GifDrawable> resourceDecoder, ArrayPool arrayPool) {
        this.f8638a = list;
        this.f8639b = resourceDecoder;
        this.f8640c = arrayPool;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: a */
    public boolean mo4962a(@NonNull InputStream inputStream, @NonNull Options options) throws IOException {
        return !((Boolean) options.m4960c(GifOptions.f8637b)).booleanValue() && ImageHeaderParserUtils.m4955b(this.f8638a, inputStream, this.f8640c) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: b */
    public Resource<GifDrawable> mo4963b(@NonNull InputStream inputStream, int i2, int i3, @NonNull Options options) throws IOException {
        byte[] bArr;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream2.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e2);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f8639b.mo4963b(ByteBuffer.wrap(bArr), i2, i3, options);
    }
}
