package com.bumptech.glide.load.resource;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class UnitTransformation<T> implements Transformation<T> {

    /* renamed from: b */
    public static final Transformation<?> f8512b = new UnitTransformation();

    @Override // com.bumptech.glide.load.Key
    /* renamed from: a */
    public void mo4956a(@NonNull MessageDigest messageDigest) {
    }

    @Override // com.bumptech.glide.load.Transformation
    @NonNull
    /* renamed from: b */
    public Resource<T> mo4957b(@NonNull Context context, @NonNull Resource<T> resource, int i2, int i3) {
        return resource;
    }
}
