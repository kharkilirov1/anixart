package com.bumptech.glide.load;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class Option<T> {

    /* renamed from: e */
    public static final CacheKeyUpdater<Object> f8057e = new CacheKeyUpdater<Object>() { // from class: com.bumptech.glide.load.Option.1
        @Override // com.bumptech.glide.load.Option.CacheKeyUpdater
        /* renamed from: a */
        public void mo4959a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    };

    /* renamed from: a */
    public final T f8058a;

    /* renamed from: b */
    public final CacheKeyUpdater<T> f8059b;

    /* renamed from: c */
    public final String f8060c;

    /* renamed from: d */
    public volatile byte[] f8061d;

    public interface CacheKeyUpdater<T> {
        /* renamed from: a */
        void mo4959a(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
    }

    public Option(@NonNull String str, @Nullable T t, @NonNull CacheKeyUpdater<T> cacheKeyUpdater) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f8060c = str;
        this.f8058a = t;
        Objects.requireNonNull(cacheKeyUpdater, "Argument must not be null");
        this.f8059b = cacheKeyUpdater;
    }

    @NonNull
    /* renamed from: a */
    public static <T> Option<T> m4958a(@NonNull String str, @NonNull T t) {
        return new Option<>(str, t, f8057e);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Option) {
            return this.f8060c.equals(((Option) obj).f8060c);
        }
        return false;
    }

    public int hashCode() {
        return this.f8060c.hashCode();
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("Option{key='");
        m24u.append(this.f8060c);
        m24u.append('\'');
        m24u.append('}');
        return m24u.toString();
    }
}
