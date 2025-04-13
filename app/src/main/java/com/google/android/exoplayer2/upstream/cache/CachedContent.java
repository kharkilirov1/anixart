package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import java.util.TreeSet;

/* loaded from: classes.dex */
final class CachedContent {

    /* renamed from: a */
    public final int f14594a;

    /* renamed from: b */
    public final String f14595b;

    /* renamed from: c */
    public final TreeSet<SimpleCacheSpan> f14596c;

    /* renamed from: d */
    public DefaultContentMetadata f14597d;

    public static final class Range {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CachedContent.class != obj.getClass()) {
            return false;
        }
        CachedContent cachedContent = (CachedContent) obj;
        return this.f14594a == cachedContent.f14594a && this.f14595b.equals(cachedContent.f14595b) && this.f14596c.equals(cachedContent.f14596c) && this.f14597d.equals(cachedContent.f14597d);
    }

    public int hashCode() {
        return this.f14597d.hashCode() + C0576a.m4107f(this.f14595b, this.f14594a * 31, 31);
    }
}
