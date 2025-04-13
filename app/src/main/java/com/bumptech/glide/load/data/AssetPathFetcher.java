package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class AssetPathFetcher<T> implements DataFetcher<T> {

    /* renamed from: b */
    public final String f8063b;

    /* renamed from: c */
    public final AssetManager f8064c;

    /* renamed from: d */
    public T f8065d;

    public AssetPathFetcher(AssetManager assetManager, String str) {
        this.f8064c = assetManager;
        this.f8063b = str;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    /* renamed from: b */
    public void mo4968b() {
        T t = this.f8065d;
        if (t == null) {
            return;
        }
        try {
            mo4969c(t);
        } catch (IOException unused) {
        }
    }

    /* renamed from: c */
    public abstract void mo4969c(T t) throws IOException;

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
    public void mo4971e(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super T> dataCallback) {
        try {
            T mo4972f = mo4972f(this.f8064c, this.f8063b);
            this.f8065d = mo4972f;
            dataCallback.mo4974f(mo4972f);
        } catch (IOException e2) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e2);
            }
            dataCallback.mo4973c(e2);
        }
    }

    /* renamed from: f */
    public abstract T mo4972f(AssetManager assetManager, String str) throws IOException;
}
