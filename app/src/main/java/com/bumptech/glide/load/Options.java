package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.security.MessageDigest;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class Options implements Key {

    /* renamed from: b */
    public final ArrayMap<Option<?>, Object> f8062b = new CachedHashCodeArrayMap();

    @Override // com.bumptech.glide.load.Key
    /* renamed from: a */
    public void mo4956a(@NonNull MessageDigest messageDigest) {
        for (int i2 = 0; i2 < this.f8062b.size(); i2++) {
            Option<?> m1122i = this.f8062b.m1122i(i2);
            Object m1126m = this.f8062b.m1126m(i2);
            Option.CacheKeyUpdater<?> cacheKeyUpdater = m1122i.f8059b;
            if (m1122i.f8061d == null) {
                m1122i.f8061d = m1122i.f8060c.getBytes(Key.f8055a);
            }
            cacheKeyUpdater.mo4959a(m1122i.f8061d, m1126m, messageDigest);
        }
    }

    @Nullable
    /* renamed from: c */
    public <T> T m4960c(@NonNull Option<T> option) {
        return this.f8062b.containsKey(option) ? (T) this.f8062b.get(option) : option.f8058a;
    }

    /* renamed from: d */
    public void m4961d(@NonNull Options options) {
        this.f8062b.mo1123j(options.f8062b);
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof Options) {
            return this.f8062b.equals(((Options) obj).f8062b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.f8062b.hashCode();
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("Options{values=");
        m24u.append(this.f8062b);
        m24u.append('}');
        return m24u.toString();
    }
}
