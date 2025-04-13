package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class StreamAssetPathFetcher extends AssetPathFetcher<InputStream> {
    public StreamAssetPathFetcher(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    /* renamed from: a */
    public Class<InputStream> mo4965a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.AssetPathFetcher
    /* renamed from: c */
    public void mo4969c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.AssetPathFetcher
    /* renamed from: f */
    public InputStream mo4972f(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
