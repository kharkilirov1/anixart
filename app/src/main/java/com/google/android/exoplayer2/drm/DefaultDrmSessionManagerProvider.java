package com.google.android.exoplayer2.drm;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Ints;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class DefaultDrmSessionManagerProvider implements DrmSessionManagerProvider {

    /* renamed from: b */
    public final Object f10703b = new Object();

    /* renamed from: c */
    @GuardedBy
    public MediaItem.DrmConfiguration f10704c;

    /* renamed from: d */
    @GuardedBy
    public DrmSessionManager f10705d;

    /* renamed from: e */
    @Nullable
    public HttpDataSource.Factory f10706e;

    /* renamed from: f */
    @Nullable
    public String f10707f;

    @RequiresApi
    /* renamed from: a */
    public final DrmSessionManager m6296a(MediaItem.DrmConfiguration drmConfiguration) {
        HttpDataSource.Factory factory = this.f10706e;
        HttpDataSource.Factory factory2 = factory;
        if (factory == null) {
            DefaultHttpDataSource.Factory factory3 = new DefaultHttpDataSource.Factory();
            factory3.f14447b = this.f10707f;
            factory2 = factory3;
        }
        Uri uri = drmConfiguration.f9743b;
        HttpMediaDrmCallback httpMediaDrmCallback = new HttpMediaDrmCallback(uri == null ? null : uri.toString(), drmConfiguration.f9747f, factory2);
        UnmodifiableIterator<Map.Entry<String, String>> it = drmConfiguration.f9744c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            Objects.requireNonNull(key);
            Objects.requireNonNull(value);
            synchronized (httpMediaDrmCallback.f10741d) {
                httpMediaDrmCallback.f10741d.put(key, value);
            }
        }
        DefaultDrmSessionManager.Builder builder = new DefaultDrmSessionManager.Builder();
        UUID uuid = drmConfiguration.f9742a;
        C0996b c0996b = C0996b.f10749a;
        Objects.requireNonNull(uuid);
        builder.f10687b = uuid;
        builder.f10688c = c0996b;
        builder.f10689d = drmConfiguration.f9745d;
        builder.f10691f = drmConfiguration.f9746e;
        int[] m12085g = Ints.m12085g(drmConfiguration.f9748g);
        for (int i2 : m12085g) {
            boolean z = true;
            if (i2 != 2 && i2 != 1) {
                z = false;
            }
            Assertions.m7513a(z);
        }
        int[] iArr = (int[]) m12085g.clone();
        builder.f10690e = iArr;
        DefaultDrmSessionManager defaultDrmSessionManager = new DefaultDrmSessionManager(builder.f10687b, builder.f10688c, httpMediaDrmCallback, builder.f10686a, builder.f10689d, iArr, builder.f10691f, builder.f10692g, builder.f10693h, null);
        byte[] bArr = drmConfiguration.f9749h;
        byte[] copyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        Assertions.m7516d(defaultDrmSessionManager.f10674m.isEmpty());
        defaultDrmSessionManager.f10683v = 0;
        defaultDrmSessionManager.f10684w = copyOf;
        return defaultDrmSessionManager;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManagerProvider
    /* renamed from: b */
    public DrmSessionManager mo2562b(MediaItem mediaItem) {
        DrmSessionManager drmSessionManager;
        Objects.requireNonNull(mediaItem.f9714c);
        MediaItem.DrmConfiguration drmConfiguration = mediaItem.f9714c.f9772c;
        if (drmConfiguration == null || Util.f14736a < 18) {
            return DrmSessionManager.f10723a;
        }
        synchronized (this.f10703b) {
            if (!Util.m7728a(drmConfiguration, this.f10704c)) {
                this.f10704c = drmConfiguration;
                this.f10705d = m6296a(drmConfiguration);
            }
            drmSessionManager = this.f10705d;
            Objects.requireNonNull(drmSessionManager);
        }
        return drmSessionManager;
    }
}
