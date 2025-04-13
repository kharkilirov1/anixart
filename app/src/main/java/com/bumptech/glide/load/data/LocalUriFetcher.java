package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class LocalUriFetcher<T> implements DataFetcher<T> {

    /* renamed from: b */
    public final Uri f8086b;

    /* renamed from: c */
    public final ContentResolver f8087c;

    /* renamed from: d */
    public T f8088d;

    public LocalUriFetcher(ContentResolver contentResolver, Uri uri) {
        this.f8087c = contentResolver;
        this.f8086b = uri;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    /* renamed from: b */
    public void mo4968b() {
        T t = this.f8088d;
        if (t != null) {
            try {
                mo4966c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public abstract void mo4966c(T t) throws IOException;

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
    public final void mo4971e(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super T> dataCallback) {
        try {
            T mo4967f = mo4967f(this.f8086b, this.f8087c);
            this.f8088d = mo4967f;
            dataCallback.mo4974f(mo4967f);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e2);
            }
            dataCallback.mo4973c(e2);
        }
    }

    /* renamed from: f */
    public abstract T mo4967f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;
}
