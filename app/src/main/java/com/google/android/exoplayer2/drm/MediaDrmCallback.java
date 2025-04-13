package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.ExoMediaDrm;
import java.util.UUID;

/* loaded from: classes.dex */
public interface MediaDrmCallback {
    /* renamed from: a */
    byte[] mo6329a(UUID uuid, ExoMediaDrm.KeyRequest keyRequest) throws MediaDrmCallbackException;

    /* renamed from: b */
    byte[] mo6330b(UUID uuid, ExoMediaDrm.ProvisionRequest provisionRequest) throws MediaDrmCallbackException;
}
