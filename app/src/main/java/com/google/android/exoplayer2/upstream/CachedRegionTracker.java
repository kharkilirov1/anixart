package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
public final class CachedRegionTracker implements Cache.Listener {

    public static class Region implements Comparable<Region> {

        /* renamed from: b */
        public long f14343b;

        @Override // java.lang.Comparable
        public int compareTo(Region region) {
            return Util.m7739h(this.f14343b, region.f14343b);
        }
    }
}
