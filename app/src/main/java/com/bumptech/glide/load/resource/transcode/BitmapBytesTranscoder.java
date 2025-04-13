package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bytes.BytesResource;
import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public class BitmapBytesTranscoder implements ResourceTranscoder<Bitmap, byte[]> {

    /* renamed from: a */
    public final Bitmap.CompressFormat f8641a = Bitmap.CompressFormat.JPEG;

    /* renamed from: b */
    public final int f8642b = 100;

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @Nullable
    /* renamed from: a */
    public Resource<byte[]> mo5212a(@NonNull Resource<Bitmap> resource, @NonNull Options options) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        resource.get().compress(this.f8641a, this.f8642b, byteArrayOutputStream);
        resource.mo5044c();
        return new BytesResource(byteArrayOutputStream.toByteArray());
    }
}
