package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class AssetFileDescriptorLocalUriFetcher extends LocalUriFetcher<AssetFileDescriptor> {
    public AssetFileDescriptorLocalUriFetcher(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    /* renamed from: a */
    public Class<AssetFileDescriptor> mo4965a() {
        return AssetFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.LocalUriFetcher
    /* renamed from: c */
    public void mo4966c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.LocalUriFetcher
    /* renamed from: f */
    public AssetFileDescriptor mo4967f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException(C0000a.m12i("FileDescriptor is null for: ", uri));
    }
}
