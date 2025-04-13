package com.bumptech.glide.load;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public class MultiTransformation<T> implements Transformation<T> {

    /* renamed from: b */
    public final Collection<? extends Transformation<T>> f8056b;

    @SafeVarargs
    public MultiTransformation(@NonNull Transformation<T>... transformationArr) {
        if (transformationArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f8056b = Arrays.asList(transformationArr);
    }

    @Override // com.bumptech.glide.load.Key
    /* renamed from: a */
    public void mo4956a(@NonNull MessageDigest messageDigest) {
        Iterator<? extends Transformation<T>> it = this.f8056b.iterator();
        while (it.hasNext()) {
            it.next().mo4956a(messageDigest);
        }
    }

    @Override // com.bumptech.glide.load.Transformation
    @NonNull
    /* renamed from: b */
    public Resource<T> mo4957b(@NonNull Context context, @NonNull Resource<T> resource, int i2, int i3) {
        Iterator<? extends Transformation<T>> it = this.f8056b.iterator();
        Resource<T> resource2 = resource;
        while (it.hasNext()) {
            Resource<T> mo4957b = it.next().mo4957b(context, resource2, i2, i3);
            if (resource2 != null && !resource2.equals(resource) && !resource2.equals(mo4957b)) {
                resource2.mo5044c();
            }
            resource2 = mo4957b;
        }
        return resource2;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof MultiTransformation) {
            return this.f8056b.equals(((MultiTransformation) obj).f8056b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.f8056b.hashCode();
    }
}
