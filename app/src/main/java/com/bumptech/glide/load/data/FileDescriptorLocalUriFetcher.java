package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;
import p000a.C0000a;

/* loaded from: classes.dex */
public class FileDescriptorLocalUriFetcher extends LocalUriFetcher<ParcelFileDescriptor> {
    public FileDescriptorLocalUriFetcher(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo4965a() {
        return ParcelFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.LocalUriFetcher
    /* renamed from: c */
    public void mo4966c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.LocalUriFetcher
    /* renamed from: f */
    public ParcelFileDescriptor mo4967f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException(C0000a.m12i("FileDescriptor is null for: ", uri));
    }
}
