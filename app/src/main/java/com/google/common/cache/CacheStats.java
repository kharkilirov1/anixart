package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class CacheStats {

    /* renamed from: a */
    public final long f20628a;

    /* renamed from: b */
    public final long f20629b;

    /* renamed from: c */
    public final long f20630c;

    /* renamed from: d */
    public final long f20631d;

    /* renamed from: e */
    public final long f20632e;

    /* renamed from: f */
    public final long f20633f;

    public CacheStats(long j2, long j3, long j4, long j5, long j6, long j7) {
        Preconditions.m11178b(j2 >= 0);
        Preconditions.m11178b(j3 >= 0);
        Preconditions.m11178b(j4 >= 0);
        Preconditions.m11178b(j5 >= 0);
        Preconditions.m11178b(j6 >= 0);
        Preconditions.m11178b(j7 >= 0);
        this.f20628a = j2;
        this.f20629b = j3;
        this.f20630c = j4;
        this.f20631d = j5;
        this.f20632e = j6;
        this.f20633f = j7;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof CacheStats)) {
            return false;
        }
        CacheStats cacheStats = (CacheStats) obj;
        return this.f20628a == cacheStats.f20628a && this.f20629b == cacheStats.f20629b && this.f20630c == cacheStats.f20630c && this.f20631d == cacheStats.f20631d && this.f20632e == cacheStats.f20632e && this.f20633f == cacheStats.f20633f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f20628a), Long.valueOf(this.f20629b), Long.valueOf(this.f20630c), Long.valueOf(this.f20631d), Long.valueOf(this.f20632e), Long.valueOf(this.f20633f)});
    }

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11169c("hitCount", this.f20628a);
        m11166b.m11169c("missCount", this.f20629b);
        m11166b.m11169c("loadSuccessCount", this.f20630c);
        m11166b.m11169c("loadExceptionCount", this.f20631d);
        m11166b.m11169c("totalLoadTime", this.f20632e);
        m11166b.m11169c("evictionCount", this.f20633f);
        return m11166b.toString();
    }
}
