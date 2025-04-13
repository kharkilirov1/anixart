package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class InputStreamRewinder implements DataRewinder<InputStream> {

    /* renamed from: a */
    public final RecyclableBufferedInputStream f8084a;

    public static final class Factory implements DataRewinder.Factory<InputStream> {

        /* renamed from: a */
        public final ArrayPool f8085a;

        public Factory(ArrayPool arrayPool) {
            this.f8085a = arrayPool;
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @NonNull
        /* renamed from: a */
        public Class<InputStream> mo4977a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @NonNull
        /* renamed from: b */
        public DataRewinder<InputStream> mo4978b(InputStream inputStream) {
            return new InputStreamRewinder(inputStream, this.f8085a);
        }
    }

    public InputStreamRewinder(InputStream inputStream, ArrayPool arrayPool) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, arrayPool);
        this.f8084a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    @NonNull
    /* renamed from: a */
    public InputStream mo4975a() throws IOException {
        this.f8084a.reset();
        return this.f8084a;
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    /* renamed from: b */
    public void mo4976b() {
        this.f8084a.m5186b();
    }
}
