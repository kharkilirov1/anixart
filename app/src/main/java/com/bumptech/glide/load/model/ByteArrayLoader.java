package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class ByteArrayLoader<Data> implements ModelLoader<byte[], Data> {

    /* renamed from: a */
    public final Converter<Data> f8421a;

    public static class ByteBufferFactory implements ModelLoaderFactory<byte[], ByteBuffer> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        /* renamed from: b */
        public ModelLoader<byte[], ByteBuffer> mo5130b(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ByteArrayLoader(new Converter<ByteBuffer>(this) { // from class: com.bumptech.glide.load.model.ByteArrayLoader.ByteBufferFactory.1
                @Override // com.bumptech.glide.load.model.ByteArrayLoader.Converter
                /* renamed from: a */
                public Class<ByteBuffer> mo5131a() {
                    return ByteBuffer.class;
                }

                @Override // com.bumptech.glide.load.model.ByteArrayLoader.Converter
                /* renamed from: b */
                public ByteBuffer mo5132b(byte[] bArr) {
                    return ByteBuffer.wrap(bArr);
                }
            });
        }
    }

    public interface Converter<Data> {
        /* renamed from: a */
        Class<Data> mo5131a();

        /* renamed from: b */
        Data mo5132b(byte[] bArr);
    }

    public static class Fetcher<Data> implements DataFetcher<Data> {

        /* renamed from: b */
        public final byte[] f8422b;

        /* renamed from: c */
        public final Converter<Data> f8423c;

        public Fetcher(byte[] bArr, Converter<Data> converter) {
            this.f8422b = bArr;
            this.f8423c = converter;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        /* renamed from: a */
        public Class<Data> mo4965a() {
            return this.f8423c.mo5131a();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        /* renamed from: b */
        public void mo4968b() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        /* renamed from: d */
        public DataSource mo4970d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        /* renamed from: e */
        public void mo4971e(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super Data> dataCallback) {
            dataCallback.mo4974f(this.f8423c.mo5132b(this.f8422b));
        }
    }

    public static class StreamFactory implements ModelLoaderFactory<byte[], InputStream> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        /* renamed from: b */
        public ModelLoader<byte[], InputStream> mo5130b(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ByteArrayLoader(new Converter<InputStream>(this) { // from class: com.bumptech.glide.load.model.ByteArrayLoader.StreamFactory.1
                @Override // com.bumptech.glide.load.model.ByteArrayLoader.Converter
                /* renamed from: a */
                public Class<InputStream> mo5131a() {
                    return InputStream.class;
                }

                @Override // com.bumptech.glide.load.model.ByteArrayLoader.Converter
                /* renamed from: b */
                public InputStream mo5132b(byte[] bArr) {
                    return new ByteArrayInputStream(bArr);
                }
            });
        }
    }

    public ByteArrayLoader(Converter<Data> converter) {
        this.f8421a = converter;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo5127a(@NonNull byte[] bArr) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: b */
    public ModelLoader.LoadData mo5128b(@NonNull byte[] bArr, int i2, int i3, @NonNull Options options) {
        byte[] bArr2 = bArr;
        return new ModelLoader.LoadData(new ObjectKey(bArr2), new Fetcher(bArr2, this.f8421a));
    }
}
