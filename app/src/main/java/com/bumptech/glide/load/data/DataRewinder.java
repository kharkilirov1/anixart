package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.IOException;

/* loaded from: classes.dex */
public interface DataRewinder<T> {

    public interface Factory<T> {
        @NonNull
        /* renamed from: a */
        Class<T> mo4977a();

        @NonNull
        /* renamed from: b */
        DataRewinder<T> mo4978b(@NonNull T t);
    }

    @NonNull
    /* renamed from: a */
    T mo4975a() throws IOException;

    /* renamed from: b */
    void mo4976b();
}
