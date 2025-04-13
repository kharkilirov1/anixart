package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;

/* loaded from: classes.dex */
public interface ResourceTranscoder<Z, R> {
    @Nullable
    /* renamed from: a */
    Resource<R> mo5212a(@NonNull Resource<Z> resource, @NonNull Options options);
}
