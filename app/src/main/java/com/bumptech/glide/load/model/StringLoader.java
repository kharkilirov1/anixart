package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.File;
import java.io.InputStream;

/* loaded from: classes.dex */
public class StringLoader<Data> implements ModelLoader<String, Data> {

    /* renamed from: a */
    public final ModelLoader<Uri, Data> f8490a;

    public static final class AssetFileDescriptorFactory implements ModelLoaderFactory<String, AssetFileDescriptor> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        /* renamed from: b */
        public ModelLoader<String, AssetFileDescriptor> mo5130b(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new StringLoader(multiModelLoaderFactory.m5153b(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class FileDescriptorFactory implements ModelLoaderFactory<String, ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        /* renamed from: b */
        public ModelLoader<String, ParcelFileDescriptor> mo5130b(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new StringLoader(multiModelLoaderFactory.m5153b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class StreamFactory implements ModelLoaderFactory<String, InputStream> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        /* renamed from: b */
        public ModelLoader<String, InputStream> mo5130b(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new StringLoader(multiModelLoaderFactory.m5153b(Uri.class, InputStream.class));
        }
    }

    public StringLoader(ModelLoader<Uri, Data> modelLoader) {
        this.f8490a = modelLoader;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo5127a(@NonNull String str) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: b */
    public ModelLoader.LoadData mo5128b(@NonNull String str, int i2, int i3, @NonNull Options options) {
        Uri fromFile;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            fromFile = null;
        } else if (str2.charAt(0) == '/') {
            fromFile = Uri.fromFile(new File(str2));
        } else {
            Uri parse = Uri.parse(str2);
            fromFile = parse.getScheme() == null ? Uri.fromFile(new File(str2)) : parse;
        }
        if (fromFile == null || !this.f8490a.mo5127a(fromFile)) {
            return null;
        }
        return this.f8490a.mo5128b(fromFile, i2, i3, options);
    }
}
