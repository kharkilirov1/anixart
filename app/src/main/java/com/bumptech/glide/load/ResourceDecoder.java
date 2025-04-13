package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;

/* loaded from: classes.dex */
public interface ResourceDecoder<T, Z> {
    /* renamed from: a */
    boolean mo4962a(@NonNull T t, @NonNull Options options) throws IOException;

    @Nullable
    /* renamed from: b */
    Resource<Z> mo4963b(@NonNull T t, int i2, int i3, @NonNull Options options) throws IOException;
}
