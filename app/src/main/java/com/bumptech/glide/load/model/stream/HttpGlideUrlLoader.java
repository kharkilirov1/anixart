package com.bumptech.glide.load.model.stream;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.HttpUrlFetcher;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.ModelCache;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import java.io.InputStream;

/* loaded from: classes.dex */
public class HttpGlideUrlLoader implements ModelLoader<GlideUrl, InputStream> {

    /* renamed from: b */
    public static final Option<Integer> f8501b = Option.m4958a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a */
    @Nullable
    public final ModelCache<GlideUrl, GlideUrl> f8502a;

    public static class Factory implements ModelLoaderFactory<GlideUrl, InputStream> {

        /* renamed from: a */
        public final ModelCache<GlideUrl, GlideUrl> f8503a = new ModelCache<>(500);

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        /* renamed from: b */
        public ModelLoader<GlideUrl, InputStream> mo5130b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new HttpGlideUrlLoader(this.f8503a);
        }
    }

    public HttpGlideUrlLoader() {
        this.f8502a = null;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo5127a(@NonNull GlideUrl glideUrl) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: b */
    public ModelLoader.LoadData<InputStream> mo5128b(@NonNull GlideUrl glideUrl, int i2, int i3, @NonNull Options options) {
        GlideUrl glideUrl2 = glideUrl;
        ModelCache<GlideUrl, GlideUrl> modelCache = this.f8502a;
        if (modelCache != null) {
            GlideUrl m5145a = modelCache.m5145a(glideUrl2, 0, 0);
            if (m5145a == null) {
                this.f8502a.m5146b(glideUrl2, 0, 0, glideUrl2);
            } else {
                glideUrl2 = m5145a;
            }
        }
        return new ModelLoader.LoadData<>(glideUrl2, new HttpUrlFetcher(glideUrl2, ((Integer) options.m4960c(f8501b)).intValue()));
    }

    public HttpGlideUrlLoader(@Nullable ModelCache<GlideUrl, GlideUrl> modelCache) {
        this.f8502a = modelCache;
    }
}
