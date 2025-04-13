package com.bumptech.glide.load.engine.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;

/* loaded from: classes.dex */
public interface MemoryCache {

    public interface ResourceRemovedListener {
        /* renamed from: a */
        void mo5026a(@NonNull Resource<?> resource);
    }

    /* renamed from: a */
    void mo5110a(int i2);

    /* renamed from: b */
    void mo5115b();

    @Nullable
    /* renamed from: c */
    Resource<?> mo5116c(@NonNull Key key, @Nullable Resource<?> resource);

    @Nullable
    /* renamed from: d */
    Resource<?> mo5111d(@NonNull Key key);

    /* renamed from: e */
    void mo5112e(@NonNull ResourceRemovedListener resourceRemovedListener);
}
