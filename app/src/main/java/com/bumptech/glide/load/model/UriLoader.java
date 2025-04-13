package com.bumptech.glide.load.model;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.AssetFileDescriptorLocalUriFetcher;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.FileDescriptorLocalUriFetcher;
import com.bumptech.glide.load.data.StreamLocalUriFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class UriLoader<Data> implements ModelLoader<Uri, Data> {

    /* renamed from: b */
    public static final Set<String> f8494b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: a */
    public final LocalUriFetcherFactory<Data> f8495a;

    public static final class AssetFileDescriptorFactory implements ModelLoaderFactory<Uri, AssetFileDescriptor>, LocalUriFetcherFactory<AssetFileDescriptor> {

        /* renamed from: a */
        public final ContentResolver f8496a;

        public AssetFileDescriptorFactory(ContentResolver contentResolver) {
            this.f8496a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory
        /* renamed from: a */
        public DataFetcher<AssetFileDescriptor> mo5156a(Uri uri) {
            return new AssetFileDescriptorLocalUriFetcher(this.f8496a, uri);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        /* renamed from: b */
        public ModelLoader<Uri, AssetFileDescriptor> mo5130b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new UriLoader(this);
        }
    }

    public static class FileDescriptorFactory implements ModelLoaderFactory<Uri, ParcelFileDescriptor>, LocalUriFetcherFactory<ParcelFileDescriptor> {

        /* renamed from: a */
        public final ContentResolver f8497a;

        public FileDescriptorFactory(ContentResolver contentResolver) {
            this.f8497a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory
        /* renamed from: a */
        public DataFetcher<ParcelFileDescriptor> mo5156a(Uri uri) {
            return new FileDescriptorLocalUriFetcher(this.f8497a, uri);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        /* renamed from: b */
        public ModelLoader<Uri, ParcelFileDescriptor> mo5130b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new UriLoader(this);
        }
    }

    public interface LocalUriFetcherFactory<Data> {
        /* renamed from: a */
        DataFetcher<Data> mo5156a(Uri uri);
    }

    public static class StreamFactory implements ModelLoaderFactory<Uri, InputStream>, LocalUriFetcherFactory<InputStream> {

        /* renamed from: a */
        public final ContentResolver f8498a;

        public StreamFactory(ContentResolver contentResolver) {
            this.f8498a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory
        /* renamed from: a */
        public DataFetcher<InputStream> mo5156a(Uri uri) {
            return new StreamLocalUriFetcher(this.f8498a, uri);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        /* renamed from: b */
        public ModelLoader<Uri, InputStream> mo5130b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new UriLoader(this);
        }
    }

    public UriLoader(LocalUriFetcherFactory<Data> localUriFetcherFactory) {
        this.f8495a = localUriFetcherFactory;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: a */
    public boolean mo5127a(@NonNull Uri uri) {
        return f8494b.contains(uri.getScheme());
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: b */
    public ModelLoader.LoadData mo5128b(@NonNull Uri uri, int i2, int i3, @NonNull Options options) {
        Uri uri2 = uri;
        return new ModelLoader.LoadData(new ObjectKey(uri2), this.f8495a.mo5156a(uri2));
    }
}
