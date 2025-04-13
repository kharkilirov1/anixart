package com.bumptech.glide.load.model;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class ByteBufferFileLoader implements ModelLoader<File, ByteBuffer> {

    public static final class ByteBufferFetcher implements DataFetcher<ByteBuffer> {

        /* renamed from: b */
        public final File f8424b;

        public ByteBufferFetcher(File file) {
            this.f8424b = file;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        /* renamed from: a */
        public Class<ByteBuffer> mo4965a() {
            return ByteBuffer.class;
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
        public void mo4971e(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super ByteBuffer> dataCallback) {
            try {
                dataCallback.mo4974f(ByteBufferUtil.m5329a(this.f8424b));
            } catch (IOException e2) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e2);
                }
                dataCallback.mo4973c(e2);
            }
        }
    }

    public static class Factory implements ModelLoaderFactory<File, ByteBuffer> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        /* renamed from: b */
        public ModelLoader<File, ByteBuffer> mo5130b(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ByteBufferFileLoader();
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo5127a(@NonNull File file) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: b */
    public ModelLoader.LoadData<ByteBuffer> mo5128b(@NonNull File file, int i2, int i3, @NonNull Options options) {
        File file2 = file;
        return new ModelLoader.LoadData<>(new ObjectKey(file2), new ByteBufferFetcher(file2));
    }
}
