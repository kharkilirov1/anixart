package com.bumptech.glide.load.model;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.FileDescriptorAssetPathFetcher;
import com.bumptech.glide.load.data.StreamAssetPathFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import java.io.InputStream;

/* loaded from: classes.dex */
public class AssetUriLoader<Data> implements ModelLoader<Uri, Data> {

    /* renamed from: a */
    public final AssetManager f8417a;

    /* renamed from: b */
    public final AssetFetcherFactory<Data> f8418b;

    public interface AssetFetcherFactory<Data> {
        /* renamed from: a */
        DataFetcher<Data> mo5129a(AssetManager assetManager, String str);
    }

    public static class FileDescriptorFactory implements ModelLoaderFactory<Uri, ParcelFileDescriptor>, AssetFetcherFactory<ParcelFileDescriptor> {

        /* renamed from: a */
        public final AssetManager f8419a;

        public FileDescriptorFactory(AssetManager assetManager) {
            this.f8419a = assetManager;
        }

        @Override // com.bumptech.glide.load.model.AssetUriLoader.AssetFetcherFactory
        /* renamed from: a */
        public DataFetcher<ParcelFileDescriptor> mo5129a(AssetManager assetManager, String str) {
            return new FileDescriptorAssetPathFetcher(assetManager, str);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        /* renamed from: b */
        public ModelLoader<Uri, ParcelFileDescriptor> mo5130b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new AssetUriLoader(this.f8419a, this);
        }
    }

    public static class StreamFactory implements ModelLoaderFactory<Uri, InputStream>, AssetFetcherFactory<InputStream> {

        /* renamed from: a */
        public final AssetManager f8420a;

        public StreamFactory(AssetManager assetManager) {
            this.f8420a = assetManager;
        }

        @Override // com.bumptech.glide.load.model.AssetUriLoader.AssetFetcherFactory
        /* renamed from: a */
        public DataFetcher<InputStream> mo5129a(AssetManager assetManager, String str) {
            return new StreamAssetPathFetcher(assetManager, str);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        /* renamed from: b */
        public ModelLoader<Uri, InputStream> mo5130b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new AssetUriLoader(this.f8420a, this);
        }
    }

    public AssetUriLoader(AssetManager assetManager, AssetFetcherFactory<Data> assetFetcherFactory) {
        this.f8417a = assetManager;
        this.f8418b = assetFetcherFactory;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: a */
    public boolean mo5127a(@NonNull Uri uri) {
        Uri uri2 = uri;
        return "file".equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: b */
    public ModelLoader.LoadData mo5128b(@NonNull Uri uri, int i2, int i3, @NonNull Options options) {
        Uri uri2 = uri;
        return new ModelLoader.LoadData(new ObjectKey(uri2), this.f8418b.mo5129a(this.f8417a, uri2.toString().substring(22)));
    }
}
