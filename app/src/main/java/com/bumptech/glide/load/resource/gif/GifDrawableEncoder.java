package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class GifDrawableEncoder implements ResourceEncoder<GifDrawable> {
    @Override // com.bumptech.glide.load.Encoder
    /* renamed from: a */
    public boolean mo4950a(@NonNull Object obj, @NonNull File file, @NonNull Options options) {
        try {
            ByteBufferUtil.m5331c(((GifDrawable) ((Resource) obj).get()).f8604b.f8614a.f8616a.mo4927a().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e2) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e2);
            }
            return false;
        }
    }

    @Override // com.bumptech.glide.load.ResourceEncoder
    @NonNull
    /* renamed from: b */
    public EncodeStrategy mo4964b(@NonNull Options options) {
        return EncodeStrategy.SOURCE;
    }
}
