package com.bumptech.glide.load.model;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class UrlUriLoader<Data> implements ModelLoader<Uri, Data> {

    /* renamed from: b */
    public static final Set<String> f8499b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a */
    public final ModelLoader<GlideUrl, Data> f8500a;

    public static class StreamFactory implements ModelLoaderFactory<Uri, InputStream> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        /* renamed from: b */
        public ModelLoader<Uri, InputStream> mo5130b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new UrlUriLoader(multiModelLoaderFactory.m5153b(GlideUrl.class, InputStream.class));
        }
    }

    public UrlUriLoader(ModelLoader<GlideUrl, Data> modelLoader) {
        this.f8500a = modelLoader;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: a */
    public boolean mo5127a(@NonNull Uri uri) {
        return f8499b.contains(uri.getScheme());
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: b */
    public ModelLoader.LoadData mo5128b(@NonNull Uri uri, int i2, int i3, @NonNull Options options) {
        return this.f8500a.mo5128b(new GlideUrl(uri.toString(), Headers.f8442a), i2, i3, options);
    }
}
