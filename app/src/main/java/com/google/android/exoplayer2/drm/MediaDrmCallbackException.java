package com.google.android.exoplayer2.drm;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class MediaDrmCallbackException extends IOException {

    /* renamed from: b */
    public final DataSpec f10742b;

    /* renamed from: c */
    public final Uri f10743c;

    /* renamed from: d */
    public final Map<String, List<String>> f10744d;

    /* renamed from: e */
    public final long f10745e;

    public MediaDrmCallbackException(DataSpec dataSpec, Uri uri, Map<String, List<String>> map, long j2, Throwable th) {
        super(th);
        this.f10742b = dataSpec;
        this.f10743c = uri;
        this.f10744d = map;
        this.f10745e = j2;
    }
}
