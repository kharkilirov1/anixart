package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);


        /* renamed from: b */
        public final boolean f8054b;

        ImageType(boolean z) {
            this.f8054b = z;
        }

        public boolean hasAlpha() {
            return this.f8054b;
        }
    }

    @NonNull
    /* renamed from: a */
    ImageType mo4951a(@NonNull ByteBuffer byteBuffer) throws IOException;

    @NonNull
    /* renamed from: b */
    ImageType mo4952b(@NonNull InputStream inputStream) throws IOException;

    /* renamed from: c */
    int mo4953c(@NonNull InputStream inputStream, @NonNull ArrayPool arrayPool) throws IOException;
}
