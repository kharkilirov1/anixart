package com.bumptech.glide.signature;

import androidx.annotation.NonNull;
import androidx.room.util.C0576a;
import com.bumptech.glide.load.Key;
import java.security.MessageDigest;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class ObjectKey implements Key {

    /* renamed from: b */
    public final Object f8827b;

    public ObjectKey(@NonNull Object obj) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.f8827b = obj;
    }

    @Override // com.bumptech.glide.load.Key
    /* renamed from: a */
    public void mo4956a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.f8827b.toString().getBytes(Key.f8055a));
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof ObjectKey) {
            return this.f8827b.equals(((ObjectKey) obj).f8827b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.f8827b.hashCode();
    }

    public String toString() {
        return C0576a.m4117p(C0000a.m24u("ObjectKey{object="), this.f8827b, '}');
    }
}
