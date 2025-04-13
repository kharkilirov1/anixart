package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p000a.C0000a;

/* loaded from: classes.dex */
public class MultiClassKey {

    /* renamed from: a */
    public Class<?> f8848a;

    /* renamed from: b */
    public Class<?> f8849b;

    /* renamed from: c */
    public Class<?> f8850c;

    public MultiClassKey() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MultiClassKey multiClassKey = (MultiClassKey) obj;
        return this.f8848a.equals(multiClassKey.f8848a) && this.f8849b.equals(multiClassKey.f8849b) && Util.m5345b(this.f8850c, multiClassKey.f8850c);
    }

    public int hashCode() {
        int hashCode = (this.f8849b.hashCode() + (this.f8848a.hashCode() * 31)) * 31;
        Class<?> cls = this.f8850c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("MultiClassKey{first=");
        m24u.append(this.f8848a);
        m24u.append(", second=");
        m24u.append(this.f8849b);
        m24u.append('}');
        return m24u.toString();
    }

    public MultiClassKey(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        this.f8848a = cls;
        this.f8849b = cls2;
        this.f8850c = cls3;
    }
}
