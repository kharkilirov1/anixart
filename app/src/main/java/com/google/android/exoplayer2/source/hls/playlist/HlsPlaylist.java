package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.offline.FilterableManifest;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class HlsPlaylist implements FilterableManifest<HlsPlaylist> {

    /* renamed from: a */
    public final String f13337a;

    /* renamed from: b */
    public final List<String> f13338b;

    /* renamed from: c */
    public final boolean f13339c;

    public HlsPlaylist(String str, List<String> list, boolean z) {
        this.f13337a = str;
        this.f13338b = Collections.unmodifiableList(list);
        this.f13339c = z;
    }
}
