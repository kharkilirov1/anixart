package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.cache.DiskCache;
import java.io.File;

/* loaded from: classes.dex */
class DataCacheWriter<DataType> implements DiskCache.Writer {

    /* renamed from: a */
    public final Encoder<DataType> f8124a;

    /* renamed from: b */
    public final DataType f8125b;

    /* renamed from: c */
    public final Options f8126c;

    public DataCacheWriter(Encoder<DataType> encoder, DataType datatype, Options options) {
        this.f8124a = encoder;
        this.f8125b = datatype;
        this.f8126c = options;
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache.Writer
    /* renamed from: a */
    public boolean mo4991a(@NonNull File file) {
        return this.f8124a.mo4950a(this.f8125b, file, this.f8126c);
    }
}
