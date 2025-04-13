package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;

/* loaded from: classes.dex */
public class UnitModelLoader<Model> implements ModelLoader<Model, Model> {

    /* renamed from: a */
    public static final UnitModelLoader<?> f8491a = new UnitModelLoader<>();

    public static class Factory<Model> implements ModelLoaderFactory<Model, Model> {

        /* renamed from: a */
        public static final Factory<?> f8492a = new Factory<>();

        @Deprecated
        public Factory() {
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        /* renamed from: b */
        public ModelLoader<Model, Model> mo5130b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return UnitModelLoader.f8491a;
        }
    }

    public static class UnitFetcher<Model> implements DataFetcher<Model> {

        /* renamed from: b */
        public final Model f8493b;

        public UnitFetcher(Model model) {
            this.f8493b = model;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        /* renamed from: a */
        public Class<Model> mo4965a() {
            return (Class<Model>) this.f8493b.getClass();
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
        public void mo4971e(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super Model> dataCallback) {
            dataCallback.mo4974f(this.f8493b);
        }
    }

    @Deprecated
    public UnitModelLoader() {
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: a */
    public boolean mo5127a(@NonNull Model model) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: b */
    public ModelLoader.LoadData<Model> mo5128b(@NonNull Model model, int i2, int i3, @NonNull Options options) {
        return new ModelLoader.LoadData<>(new ObjectKey(model), new UnitFetcher(model));
    }
}
