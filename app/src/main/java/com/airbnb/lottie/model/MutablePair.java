package com.airbnb.lottie.model;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
import p000a.C0000a;

@RestrictTo
/* loaded from: classes.dex */
public class MutablePair<T> {

    /* renamed from: a */
    @Nullable
    public T f7498a;

    /* renamed from: b */
    @Nullable
    public T f7499b;

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        F f2 = pair.f3552a;
        Object obj2 = this.f7498a;
        if (!(f2 == obj2 || (f2 != 0 && f2.equals(obj2)))) {
            return false;
        }
        S s = pair.f3553b;
        Object obj3 = this.f7499b;
        return s == obj3 || (s != 0 && s.equals(obj3));
    }

    public int hashCode() {
        T t = this.f7498a;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f7499b;
        return hashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("Pair{");
        m24u.append(String.valueOf(this.f7498a));
        m24u.append(" ");
        m24u.append(String.valueOf(this.f7499b));
        m24u.append("}");
        return m24u.toString();
    }
}
