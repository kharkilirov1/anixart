package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;

/* loaded from: classes.dex */
public class UnitTranscoder<Z> implements ResourceTranscoder<Z, Z> {

    /* renamed from: a */
    public static final UnitTranscoder<?> f8651a = new UnitTranscoder<>();

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @Nullable
    /* renamed from: a */
    public Resource<Z> mo5212a(@NonNull Resource<Z> resource, @NonNull Options options) {
        return resource;
    }
}
