package com.bumptech.glide.load.engine;

import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;

/* loaded from: classes.dex */
interface DataFetcherGenerator {

    public interface FetcherReadyCallback {
        /* renamed from: a */
        void mo4992a(Key key, Exception exc, DataFetcher<?> dataFetcher, DataSource dataSource);

        /* renamed from: d */
        void mo4993d();

        /* renamed from: e */
        void mo4994e(Key key, @Nullable Object obj, DataFetcher<?> dataFetcher, DataSource dataSource, Key key2);
    }

    /* renamed from: b */
    boolean mo4990b();

    void cancel();
}
