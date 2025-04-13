package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class FullSegmentEncryptionKeyCache {

    /* renamed from: a */
    public final LinkedHashMap<Uri, byte[]> f13045a;

    public FullSegmentEncryptionKeyCache(final int i2) {
        this.f13045a = new LinkedHashMap<Uri, byte[]>(i2 + 1, 1.0f, false) { // from class: com.google.android.exoplayer2.source.hls.FullSegmentEncryptionKeyCache.1
            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
                return size() > i2;
            }
        };
    }
}
