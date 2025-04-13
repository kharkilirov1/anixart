package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.drm.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0995a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f10747b;

    /* renamed from: c */
    public final /* synthetic */ Object f10748c;

    public /* synthetic */ RunnableC0995a(Object obj, int i2) {
        this.f10747b = i2;
        this.f10748c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10747b) {
            case 0:
                DefaultDrmSessionManager.PreacquiredSessionReference preacquiredSessionReference = (DefaultDrmSessionManager.PreacquiredSessionReference) this.f10748c;
                if (!preacquiredSessionReference.f10698d) {
                    DrmSession drmSession = preacquiredSessionReference.f10697c;
                    if (drmSession != null) {
                        drmSession.mo6263b(preacquiredSessionReference.f10696b);
                    }
                    DefaultDrmSessionManager.this.f10675n.remove(preacquiredSessionReference);
                    preacquiredSessionReference.f10698d = true;
                    break;
                }
                break;
            default:
                ((DefaultDrmSession) this.f10748c).mo6263b(null);
                break;
        }
    }
}
