package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.ExoMediaDrm;
import java.util.UUID;

/* loaded from: classes.dex */
public final class LocalMediaDrmCallback implements MediaDrmCallback {
    @Override // com.google.android.exoplayer2.drm.MediaDrmCallback
    /* renamed from: a */
    public byte[] mo6329a(UUID uuid, ExoMediaDrm.KeyRequest keyRequest) {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.MediaDrmCallback
    /* renamed from: b */
    public byte[] mo6330b(UUID uuid, ExoMediaDrm.ProvisionRequest provisionRequest) {
        throw new UnsupportedOperationException();
    }
}
