package com.bumptech.glide.load.model.stream;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.Headers;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class HttpUriLoader implements ModelLoader<Uri, InputStream> {

    /* renamed from: b */
    public static final Set<String> f8504b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a */
    public final ModelLoader<GlideUrl, InputStream> f8505a;

    public static class Factory implements ModelLoaderFactory<Uri, InputStream> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        /* renamed from: b */
        public ModelLoader<Uri, InputStream> mo5130b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new HttpUriLoader(multiModelLoaderFactory.m5153b(GlideUrl.class, InputStream.class));
        }
    }

    public HttpUriLoader(ModelLoader<GlideUrl, InputStream> modelLoader) {
        this.f8505a = modelLoader;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: a */
    public boolean mo5127a(@NonNull Uri uri) {
        return f8504b.contains(uri.getScheme());
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: b */
    public ModelLoader.LoadData<InputStream> mo5128b(@NonNull Uri uri, int i2, int i3, @NonNull Options options) {
        return this.f8505a.mo5128b(new GlideUrl(uri.toString(), Headers.f8442a), i2, i3, options);
    }
}
