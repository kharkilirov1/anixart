package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;
import java.util.Objects;

@Deprecated
/* loaded from: classes.dex */
public class BitmapDrawableTransformation implements Transformation<BitmapDrawable> {
    @Override // com.bumptech.glide.load.Key
    /* renamed from: a */
    public void mo4956a(@NonNull MessageDigest messageDigest) {
        throw null;
    }

    @Override // com.bumptech.glide.load.Transformation
    @NonNull
    /* renamed from: b */
    public Resource<BitmapDrawable> mo4957b(@NonNull Context context, @NonNull Resource<BitmapDrawable> resource, int i2, int i3) {
        throw null;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof BitmapDrawableTransformation)) {
            return false;
        }
        Objects.requireNonNull((BitmapDrawableTransformation) obj);
        throw null;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        throw null;
    }
}
