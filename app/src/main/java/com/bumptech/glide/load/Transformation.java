package com.bumptech.glide.load;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;

/* loaded from: classes.dex */
public interface Transformation<T> extends Key {
    @NonNull
    /* renamed from: b */
    Resource<T> mo4957b(@NonNull Context context, @NonNull Resource<T> resource, int i2, int i3);
}
