package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* loaded from: classes.dex */
public interface DataFetcher<T> {

    public interface DataCallback<T> {
        /* renamed from: c */
        void mo4973c(@NonNull Exception exc);

        /* renamed from: f */
        void mo4974f(@Nullable T t);
    }

    @NonNull
    /* renamed from: a */
    Class<T> mo4965a();

    /* renamed from: b */
    void mo4968b();

    void cancel();

    @NonNull
    /* renamed from: d */
    DataSource mo4970d();

    /* renamed from: e */
    void mo4971e(@NonNull Priority priority, @NonNull DataCallback<? super T> dataCallback);
}
