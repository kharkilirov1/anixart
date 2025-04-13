package com.google.android.exoplayer2.drm;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C0932C;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import java.util.UUID;

/* loaded from: classes.dex */
public final class ErrorStateDrmSession implements DrmSession {

    /* renamed from: a */
    public final DrmSession.DrmSessionException f10725a;

    public ErrorStateDrmSession(DrmSession.DrmSessionException drmSessionException) {
        this.f10725a = drmSessionException;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* renamed from: a */
    public void mo6262a(@Nullable DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* renamed from: b */
    public void mo6263b(@Nullable DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* renamed from: c */
    public final UUID mo6264c() {
        return C0932C.f9456a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* renamed from: d */
    public boolean mo6265d() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* renamed from: e */
    public boolean mo6266e(String str) {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    /* renamed from: f */
    public DrmSession.DrmSessionException mo6267f() {
        return this.f10725a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    /* renamed from: g */
    public CryptoConfig mo6268g() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public int getState() {
        return 1;
    }
}
