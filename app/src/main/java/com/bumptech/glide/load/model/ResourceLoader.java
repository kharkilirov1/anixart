package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.ModelLoader;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.InputStream;

/* loaded from: classes.dex */
public class ResourceLoader<Data> implements ModelLoader<Integer, Data> {

    /* renamed from: a */
    public final ModelLoader<Uri, Data> f8483a;

    /* renamed from: b */
    public final Resources f8484b;

    public static final class AssetFileDescriptorFactory implements ModelLoaderFactory<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        public final Resources f8485a;

        public AssetFileDescriptorFactory(Resources resources) {
            this.f8485a = resources;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        /* renamed from: b */
        public ModelLoader<Integer, AssetFileDescriptor> mo5130b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceLoader(this.f8485a, multiModelLoaderFactory.m5153b(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class FileDescriptorFactory implements ModelLoaderFactory<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        public final Resources f8486a;

        public FileDescriptorFactory(Resources resources) {
            this.f8486a = resources;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        /* renamed from: b */
        public ModelLoader<Integer, ParcelFileDescriptor> mo5130b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceLoader(this.f8486a, multiModelLoaderFactory.m5153b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class StreamFactory implements ModelLoaderFactory<Integer, InputStream> {

        /* renamed from: a */
        public final Resources f8487a;

        public StreamFactory(Resources resources) {
            this.f8487a = resources;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        /* renamed from: b */
        public ModelLoader<Integer, InputStream> mo5130b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceLoader(this.f8487a, multiModelLoaderFactory.m5153b(Uri.class, InputStream.class));
        }
    }

    public static class UriFactory implements ModelLoaderFactory<Integer, Uri> {

        /* renamed from: a */
        public final Resources f8488a;

        public UriFactory(Resources resources) {
            this.f8488a = resources;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        /* renamed from: b */
        public ModelLoader<Integer, Uri> mo5130b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceLoader(this.f8488a, UnitModelLoader.f8491a);
        }
    }

    public ResourceLoader(Resources resources, ModelLoader<Uri, Data> modelLoader) {
        this.f8484b = resources;
        this.f8483a = modelLoader;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo5127a(@NonNull Integer num) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: b */
    public ModelLoader.LoadData mo5128b(@NonNull Integer num, int i2, int i3, @NonNull Options options) {
        Uri uri;
        Integer num2 = num;
        try {
            uri = Uri.parse("android.resource://" + this.f8484b.getResourcePackageName(num2.intValue()) + JsonPointer.SEPARATOR + this.f8484b.getResourceTypeName(num2.intValue()) + JsonPointer.SEPARATOR + this.f8484b.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException e2) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num2, e2);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f8483a.mo5128b(uri, i2, i3, options);
    }
}
