package com.bumptech.glide.load.model;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class DataUrlLoader<Model, Data> implements ModelLoader<Model, Data> {

    /* renamed from: a */
    public final DataDecoder<Data> f8425a;

    public interface DataDecoder<Data> {
        /* renamed from: a */
        Class<Data> mo5133a();

        /* renamed from: b */
        void mo5134b(Data data) throws IOException;

        /* renamed from: c */
        Data mo5135c(String str) throws IllegalArgumentException;
    }

    public static final class DataUriFetcher<Data> implements DataFetcher<Data> {

        /* renamed from: b */
        public final String f8426b;

        /* renamed from: c */
        public final DataDecoder<Data> f8427c;

        /* renamed from: d */
        public Data f8428d;

        public DataUriFetcher(String str, DataDecoder<Data> dataDecoder) {
            this.f8426b = str;
            this.f8427c = dataDecoder;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        /* renamed from: a */
        public Class<Data> mo4965a() {
            return this.f8427c.mo5133a();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        /* renamed from: b */
        public void mo4968b() {
            try {
                this.f8427c.mo5134b(this.f8428d);
            } catch (IOException unused) {
            }
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

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.DataFetcher
        /* renamed from: e */
        public void mo4971e(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super Data> dataCallback) {
            try {
                Data mo5135c = this.f8427c.mo5135c(this.f8426b);
                this.f8428d = mo5135c;
                dataCallback.mo4974f(mo5135c);
            } catch (IllegalArgumentException e2) {
                dataCallback.mo4973c(e2);
            }
        }
    }

    public static final class StreamFactory<Model> implements ModelLoaderFactory<Model, InputStream> {

        /* renamed from: a */
        public final DataDecoder<InputStream> f8429a = new DataDecoder<InputStream>(this) { // from class: com.bumptech.glide.load.model.DataUrlLoader.StreamFactory.1
            @Override // com.bumptech.glide.load.model.DataUrlLoader.DataDecoder
            /* renamed from: a */
            public Class<InputStream> mo5133a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.model.DataUrlLoader.DataDecoder
            /* renamed from: b */
            public void mo5134b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.bumptech.glide.load.model.DataUrlLoader.DataDecoder
            /* renamed from: c */
            public InputStream mo5135c(String str) throws IllegalArgumentException {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, indexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        };

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        /* renamed from: b */
        public ModelLoader<Model, InputStream> mo5130b(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new DataUrlLoader(this.f8429a);
        }
    }

    public DataUrlLoader(DataDecoder<Data> dataDecoder) {
        this.f8425a = dataDecoder;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: a */
    public boolean mo5127a(@NonNull Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: b */
    public ModelLoader.LoadData<Data> mo5128b(@NonNull Model model, int i2, int i3, @NonNull Options options) {
        return new ModelLoader.LoadData<>(new ObjectKey(model), new DataUriFetcher(model.toString(), this.f8425a));
    }
}
