package com.bumptech.glide.load.resource.bytes;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.DataRewinder;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class ByteBufferRewinder implements DataRewinder<ByteBuffer> {

    /* renamed from: a */
    public final ByteBuffer f8589a;

    public static class Factory implements DataRewinder.Factory<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @NonNull
        /* renamed from: a */
        public Class<ByteBuffer> mo4977a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @NonNull
        /* renamed from: b */
        public DataRewinder<ByteBuffer> mo4978b(ByteBuffer byteBuffer) {
            return new ByteBufferRewinder(byteBuffer);
        }
    }

    public ByteBufferRewinder(ByteBuffer byteBuffer) {
        this.f8589a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    @NonNull
    /* renamed from: a */
    public ByteBuffer mo4975a() throws IOException {
        this.f8589a.position(0);
        return this.f8589a;
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    /* renamed from: b */
    public void mo4976b() {
    }
}
