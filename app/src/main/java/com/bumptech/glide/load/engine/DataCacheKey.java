package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import java.security.MessageDigest;
import p000a.C0000a;

/* loaded from: classes.dex */
final class DataCacheKey implements Key {

    /* renamed from: b */
    public final Key f8122b;

    /* renamed from: c */
    public final Key f8123c;

    public DataCacheKey(Key key, Key key2) {
        this.f8122b = key;
        this.f8123c = key2;
    }

    @Override // com.bumptech.glide.load.Key
    /* renamed from: a */
    public void mo4956a(@NonNull MessageDigest messageDigest) {
        this.f8122b.mo4956a(messageDigest);
        this.f8123c.mo4956a(messageDigest);
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof DataCacheKey)) {
            return false;
        }
        DataCacheKey dataCacheKey = (DataCacheKey) obj;
        return this.f8122b.equals(dataCacheKey.f8122b) && this.f8123c.equals(dataCacheKey.f8123c);
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.f8123c.hashCode() + (this.f8122b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("DataCacheKey{sourceKey=");
        m24u.append(this.f8122b);
        m24u.append(", signature=");
        m24u.append(this.f8123c);
        m24u.append('}');
        return m24u.toString();
    }
}
