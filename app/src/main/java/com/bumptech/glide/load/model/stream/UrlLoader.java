package com.bumptech.glide.load.model.stream;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import java.io.InputStream;
import java.net.URL;

/* loaded from: classes.dex */
public class UrlLoader implements ModelLoader<URL, InputStream> {

    /* renamed from: a */
    public final ModelLoader<GlideUrl, InputStream> f8510a;

    public static class StreamFactory implements ModelLoaderFactory<URL, InputStream> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        /* renamed from: b */
        public ModelLoader<URL, InputStream> mo5130b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new UrlLoader(multiModelLoaderFactory.m5153b(GlideUrl.class, InputStream.class));
        }
    }

    public UrlLoader(ModelLoader<GlideUrl, InputStream> modelLoader) {
        this.f8510a = modelLoader;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo5127a(@NonNull URL url) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: b */
    public ModelLoader.LoadData<InputStream> mo5128b(@NonNull URL url, int i2, int i3, @NonNull Options options) {
        return this.f8510a.mo5128b(new GlideUrl(url), i2, i3, options);
    }
}
