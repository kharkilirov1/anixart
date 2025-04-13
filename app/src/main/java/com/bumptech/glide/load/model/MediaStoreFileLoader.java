package com.bumptech.glide.load.model;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import java.io.File;
import java.io.FileNotFoundException;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class MediaStoreFileLoader implements ModelLoader<Uri, File> {

    /* renamed from: a */
    public final Context f8448a;

    public static final class Factory implements ModelLoaderFactory<Uri, File> {

        /* renamed from: a */
        public final Context f8449a;

        public Factory(Context context) {
            this.f8449a = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        /* renamed from: b */
        public ModelLoader<Uri, File> mo5130b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new MediaStoreFileLoader(this.f8449a);
        }
    }

    public static class FilePathFetcher implements DataFetcher<File> {

        /* renamed from: d */
        public static final String[] f8450d = {"_data"};

        /* renamed from: b */
        public final Context f8451b;

        /* renamed from: c */
        public final Uri f8452c;

        public FilePathFetcher(Context context, Uri uri) {
            this.f8451b = context;
            this.f8452c = uri;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        /* renamed from: a */
        public Class<File> mo4965a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        /* renamed from: b */
        public void mo4968b() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        /* renamed from: d */
        public DataSource mo4970d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        /* renamed from: e */
        public void mo4971e(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super File> dataCallback) {
            Cursor query = this.f8451b.getContentResolver().query(this.f8452c, f8450d, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    query.close();
                }
            }
            if (!TextUtils.isEmpty(r0)) {
                dataCallback.mo4974f(new File(r0));
                return;
            }
            StringBuilder m24u = C0000a.m24u("Failed to find file path for: ");
            m24u.append(this.f8452c);
            dataCallback.mo4973c(new FileNotFoundException(m24u.toString()));
        }
    }

    public MediaStoreFileLoader(Context context) {
        this.f8448a = context;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: a */
    public boolean mo5127a(@NonNull Uri uri) {
        return MediaStoreUtil.m4981a(uri);
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: b */
    public ModelLoader.LoadData<File> mo5128b(@NonNull Uri uri, int i2, int i3, @NonNull Options options) {
        Uri uri2 = uri;
        return new ModelLoader.LoadData<>(new ObjectKey(uri2), new FilePathFetcher(this.f8448a, uri2));
    }
}
