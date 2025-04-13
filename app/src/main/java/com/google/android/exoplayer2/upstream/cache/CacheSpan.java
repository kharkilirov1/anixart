package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import java.io.File;
import p000a.C0000a;

/* loaded from: classes.dex */
public class CacheSpan implements Comparable<CacheSpan> {

    /* renamed from: b */
    public final String f14579b;

    /* renamed from: c */
    public final long f14580c;

    /* renamed from: d */
    public final long f14581d;

    /* renamed from: e */
    public final boolean f14582e;

    /* renamed from: f */
    @Nullable
    public final File f14583f;

    @Override // java.lang.Comparable
    public int compareTo(CacheSpan cacheSpan) {
        CacheSpan cacheSpan2 = cacheSpan;
        if (!this.f14579b.equals(cacheSpan2.f14579b)) {
            return this.f14579b.compareTo(cacheSpan2.f14579b);
        }
        long j2 = this.f14580c - cacheSpan2.f14580c;
        if (j2 == 0) {
            return 0;
        }
        return j2 < 0 ? -1 : 1;
    }

    public String toString() {
        long j2 = this.f14580c;
        return C0000a.m19p(C0576a.m4121t(44, "[", j2, ", "), this.f14581d, "]");
    }
}
