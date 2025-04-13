package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import java.security.MessageDigest;
import java.util.Map;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
class EngineKey implements Key {

    /* renamed from: b */
    public final Object f8261b;

    /* renamed from: c */
    public final int f8262c;

    /* renamed from: d */
    public final int f8263d;

    /* renamed from: e */
    public final Class<?> f8264e;

    /* renamed from: f */
    public final Class<?> f8265f;

    /* renamed from: g */
    public final Key f8266g;

    /* renamed from: h */
    public final Map<Class<?>, Transformation<?>> f8267h;

    /* renamed from: i */
    public final Options f8268i;

    /* renamed from: j */
    public int f8269j;

    public EngineKey(Object obj, Key key, int i2, int i3, Map<Class<?>, Transformation<?>> map, Class<?> cls, Class<?> cls2, Options options) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.f8261b = obj;
        Objects.requireNonNull(key, "Signature must not be null");
        this.f8266g = key;
        this.f8262c = i2;
        this.f8263d = i3;
        Objects.requireNonNull(map, "Argument must not be null");
        this.f8267h = map;
        Objects.requireNonNull(cls, "Resource class must not be null");
        this.f8264e = cls;
        Objects.requireNonNull(cls2, "Transcode class must not be null");
        this.f8265f = cls2;
        Objects.requireNonNull(options, "Argument must not be null");
        this.f8268i = options;
    }

    @Override // com.bumptech.glide.load.Key
    /* renamed from: a */
    public void mo4956a(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof EngineKey)) {
            return false;
        }
        EngineKey engineKey = (EngineKey) obj;
        return this.f8261b.equals(engineKey.f8261b) && this.f8266g.equals(engineKey.f8266g) && this.f8263d == engineKey.f8263d && this.f8262c == engineKey.f8262c && this.f8267h.equals(engineKey.f8267h) && this.f8264e.equals(engineKey.f8264e) && this.f8265f.equals(engineKey.f8265f) && this.f8268i.equals(engineKey.f8268i);
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        if (this.f8269j == 0) {
            int hashCode = this.f8261b.hashCode();
            this.f8269j = hashCode;
            int hashCode2 = this.f8266g.hashCode() + (hashCode * 31);
            this.f8269j = hashCode2;
            int i2 = (hashCode2 * 31) + this.f8262c;
            this.f8269j = i2;
            int i3 = (i2 * 31) + this.f8263d;
            this.f8269j = i3;
            int hashCode3 = this.f8267h.hashCode() + (i3 * 31);
            this.f8269j = hashCode3;
            int hashCode4 = this.f8264e.hashCode() + (hashCode3 * 31);
            this.f8269j = hashCode4;
            int hashCode5 = this.f8265f.hashCode() + (hashCode4 * 31);
            this.f8269j = hashCode5;
            this.f8269j = this.f8268i.hashCode() + (hashCode5 * 31);
        }
        return this.f8269j;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("EngineKey{model=");
        m24u.append(this.f8261b);
        m24u.append(", width=");
        m24u.append(this.f8262c);
        m24u.append(", height=");
        m24u.append(this.f8263d);
        m24u.append(", resourceClass=");
        m24u.append(this.f8264e);
        m24u.append(", transcodeClass=");
        m24u.append(this.f8265f);
        m24u.append(", signature=");
        m24u.append(this.f8266g);
        m24u.append(", hashCode=");
        m24u.append(this.f8269j);
        m24u.append(", transformations=");
        m24u.append(this.f8267h);
        m24u.append(", options=");
        m24u.append(this.f8268i);
        m24u.append('}');
        return m24u.toString();
    }
}
