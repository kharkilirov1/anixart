package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public interface ModelLoader<Model, Data> {

    public static class LoadData<Data> {

        /* renamed from: a */
        public final Key f8458a;

        /* renamed from: b */
        public final List<Key> f8459b;

        /* renamed from: c */
        public final DataFetcher<Data> f8460c;

        public LoadData(@NonNull Key key, @NonNull DataFetcher<Data> dataFetcher) {
            List<Key> emptyList = Collections.emptyList();
            Objects.requireNonNull(key, "Argument must not be null");
            this.f8458a = key;
            Objects.requireNonNull(emptyList, "Argument must not be null");
            this.f8459b = emptyList;
            Objects.requireNonNull(dataFetcher, "Argument must not be null");
            this.f8460c = dataFetcher;
        }
    }

    /* renamed from: a */
    boolean mo5127a(@NonNull Model model);

    @Nullable
    /* renamed from: b */
    LoadData<Data> mo5128b(@NonNull Model model, int i2, int i3, @NonNull Options options);
}
