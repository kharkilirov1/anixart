package com.yandex.metrica.impl.p023ob;

import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.yandex.metrica.impl.p023ob.C4082kg;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.O */
/* loaded from: classes2.dex */
public class C3506O<T> {

    /* renamed from: e */
    public static final C4082kg.c f43524e = new C4082kg.c();

    /* renamed from: a */
    private volatile long f43525a;

    /* renamed from: b */
    private volatile long f43526b;

    /* renamed from: c */
    private long f43527c = 0;

    /* renamed from: d */
    @Nullable
    private T f43528d = null;

    public C3506O(long j2, long j3) {
        this.f43525a = j2;
        this.f43526b = j3;
    }

    @Nullable
    /* renamed from: a */
    public T m18647a() {
        return this.f43528d;
    }

    /* renamed from: b */
    public final boolean m18650b() {
        return this.f43528d == null;
    }

    /* renamed from: c */
    public final boolean m18651c() {
        if (this.f43527c == 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f43527c;
        return currentTimeMillis > this.f43526b || currentTimeMillis < 0;
    }

    /* renamed from: d */
    public final boolean m18652d() {
        long currentTimeMillis = System.currentTimeMillis() - this.f43527c;
        return currentTimeMillis > this.f43525a || currentTimeMillis < 0;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("CachedData{refreshTime=");
        m24u.append(this.f43525a);
        m24u.append(", mCachedTime=");
        m24u.append(this.f43527c);
        m24u.append(", expiryTime=");
        m24u.append(this.f43526b);
        m24u.append(", mCachedData=");
        return C0576a.m4117p(m24u, this.f43528d, '}');
    }

    /* renamed from: a */
    public void m18649a(@Nullable T t) {
        this.f43528d = t;
        this.f43527c = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void m18648a(long j2, long j3) {
        this.f43525a = j2;
        this.f43526b = j3;
    }
}
