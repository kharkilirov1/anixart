package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p000a.C0000a;

/* loaded from: classes.dex */
final class ResourceCacheKey implements Key {

    /* renamed from: j */
    public static final LruCache<Class<?>, byte[]> f8305j = new LruCache<>(50);

    /* renamed from: b */
    public final ArrayPool f8306b;

    /* renamed from: c */
    public final Key f8307c;

    /* renamed from: d */
    public final Key f8308d;

    /* renamed from: e */
    public final int f8309e;

    /* renamed from: f */
    public final int f8310f;

    /* renamed from: g */
    public final Class<?> f8311g;

    /* renamed from: h */
    public final Options f8312h;

    /* renamed from: i */
    public final Transformation<?> f8313i;

    public ResourceCacheKey(ArrayPool arrayPool, Key key, Key key2, int i2, int i3, Transformation<?> transformation, Class<?> cls, Options options) {
        this.f8306b = arrayPool;
        this.f8307c = key;
        this.f8308d = key2;
        this.f8309e = i2;
        this.f8310f = i3;
        this.f8313i = transformation;
        this.f8311g = cls;
        this.f8312h = options;
    }

    @Override // com.bumptech.glide.load.Key
    /* renamed from: a */
    public void mo4956a(@NonNull MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f8306b.mo5064c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f8309e).putInt(this.f8310f).array();
        this.f8308d.mo4956a(messageDigest);
        this.f8307c.mo4956a(messageDigest);
        messageDigest.update(bArr);
        Transformation<?> transformation = this.f8313i;
        if (transformation != null) {
            transformation.mo4956a(messageDigest);
        }
        this.f8312h.mo4956a(messageDigest);
        LruCache<Class<?>, byte[]> lruCache = f8305j;
        byte[] m5338f = lruCache.m5338f(this.f8311g);
        if (m5338f == null) {
            m5338f = this.f8311g.getName().getBytes(Key.f8055a);
            lruCache.m5339i(this.f8311g, m5338f);
        }
        messageDigest.update(m5338f);
        this.f8306b.put(bArr);
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof ResourceCacheKey)) {
            return false;
        }
        ResourceCacheKey resourceCacheKey = (ResourceCacheKey) obj;
        return this.f8310f == resourceCacheKey.f8310f && this.f8309e == resourceCacheKey.f8309e && Util.m5345b(this.f8313i, resourceCacheKey.f8313i) && this.f8311g.equals(resourceCacheKey.f8311g) && this.f8307c.equals(resourceCacheKey.f8307c) && this.f8308d.equals(resourceCacheKey.f8308d) && this.f8312h.equals(resourceCacheKey.f8312h);
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        int hashCode = ((((this.f8308d.hashCode() + (this.f8307c.hashCode() * 31)) * 31) + this.f8309e) * 31) + this.f8310f;
        Transformation<?> transformation = this.f8313i;
        if (transformation != null) {
            hashCode = (hashCode * 31) + transformation.hashCode();
        }
        return this.f8312h.hashCode() + ((this.f8311g.hashCode() + (hashCode * 31)) * 31);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ResourceCacheKey{sourceKey=");
        m24u.append(this.f8307c);
        m24u.append(", signature=");
        m24u.append(this.f8308d);
        m24u.append(", width=");
        m24u.append(this.f8309e);
        m24u.append(", height=");
        m24u.append(this.f8310f);
        m24u.append(", decodedResourceClass=");
        m24u.append(this.f8311g);
        m24u.append(", transformation='");
        m24u.append(this.f8313i);
        m24u.append('\'');
        m24u.append(", options=");
        m24u.append(this.f8312h);
        m24u.append('}');
        return m24u.toString();
    }
}
