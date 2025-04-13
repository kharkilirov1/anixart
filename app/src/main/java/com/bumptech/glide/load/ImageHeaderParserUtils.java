package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class ImageHeaderParserUtils {
    /* renamed from: a */
    public static int m4954a(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull ArrayPool arrayPool) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, arrayPool);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                int mo4953c = list.get(i2).mo4953c(inputStream, arrayPool);
                if (mo4953c != -1) {
                    return mo4953c;
                }
                inputStream.reset();
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    @NonNull
    /* renamed from: b */
    public static ImageHeaderParser.ImageType m4955b(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull ArrayPool arrayPool) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, arrayPool);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                ImageHeaderParser.ImageType mo4952b = list.get(i2).mo4952b(inputStream);
                if (mo4952b != ImageHeaderParser.ImageType.UNKNOWN) {
                    return mo4952b;
                }
                inputStream.reset();
            } finally {
                inputStream.reset();
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
