package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class LoadEventInfo {

    /* renamed from: c */
    public static final AtomicLong f12316c = new AtomicLong();

    /* renamed from: a */
    public final long f12317a;

    /* renamed from: b */
    public final Map<String, List<String>> f12318b;

    public LoadEventInfo(long j2, DataSpec dataSpec, long j3) {
        Uri uri = dataSpec.f14362a;
        Map<String, List<String>> emptyMap = Collections.emptyMap();
        this.f12317a = j2;
        this.f12318b = emptyMap;
    }

    /* renamed from: a */
    public static long m6820a() {
        return f12316c.getAndIncrement();
    }

    public LoadEventInfo(long j2, DataSpec dataSpec, Uri uri, Map<String, List<String>> map, long j3, long j4, long j5) {
        this.f12317a = j2;
        this.f12318b = map;
    }
}
