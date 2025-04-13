package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.load.data.mediastore.ThumbFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.signature.ObjectKey;
import java.io.InputStream;

/* loaded from: classes.dex */
public class MediaStoreVideoThumbLoader implements ModelLoader<Uri, InputStream> {

    /* renamed from: a */
    public final Context f8508a;

    public static class Factory implements ModelLoaderFactory<Uri, InputStream> {

        /* renamed from: a */
        public final Context f8509a;

        public Factory(Context context) {
            this.f8509a = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        /* renamed from: b */
        public ModelLoader<Uri, InputStream> mo5130b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new MediaStoreVideoThumbLoader(this.f8509a);
        }
    }

    public MediaStoreVideoThumbLoader(Context context) {
        this.f8508a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: a */
    public boolean mo5127a(@NonNull Uri uri) {
        Uri uri2 = uri;
        return MediaStoreUtil.m4981a(uri2) && uri2.getPathSegments().contains("video");
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    @Nullable
    /* renamed from: b */
    public ModelLoader.LoadData<InputStream> mo5128b(@NonNull Uri uri, int i2, int i3, @NonNull Options options) {
        Uri uri2 = uri;
        if (MediaStoreUtil.m4982b(i2, i3)) {
            Long l2 = (Long) options.m4960c(VideoDecoder.f8581d);
            if (l2 != null && l2.longValue() == -1) {
                return new ModelLoader.LoadData<>(new ObjectKey(uri2), ThumbFetcher.m4985g(this.f8508a, uri2));
            }
        }
        return null;
    }
}
