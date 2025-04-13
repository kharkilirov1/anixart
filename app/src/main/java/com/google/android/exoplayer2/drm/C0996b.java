package com.google.android.exoplayer2.drm;

import android.media.UnsupportedSchemeException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import java.util.UUID;

/* compiled from: DrmSession.java */
/* renamed from: com.google.android.exoplayer2.drm.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0996b implements ExoMediaDrm.Provider {

    /* renamed from: a */
    public static final /* synthetic */ C0996b f10749a = new C0996b();

    /* renamed from: b */
    public static void m6331b(@Nullable DrmSession drmSession, @Nullable DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.mo6262a(null);
        }
        if (drmSession != null) {
            drmSession.mo6263b(null);
        }
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm.Provider
    /* renamed from: a */
    public ExoMediaDrm mo6326a(UUID uuid) {
        int i2 = FrameworkMediaDrm.f10734d;
        try {
            try {
                return new FrameworkMediaDrm(uuid);
            } catch (UnsupportedDrmException unused) {
                String valueOf = String.valueOf(uuid);
                StringBuilder sb = new StringBuilder(valueOf.length() + 53);
                sb.append("Failed to instantiate a FrameworkMediaDrm for uuid: ");
                sb.append(valueOf);
                sb.append(".");
                Log.e("FrameworkMediaDrm", sb.toString());
                return new DummyExoMediaDrm();
            }
        } catch (UnsupportedSchemeException e2) {
            throw new UnsupportedDrmException(1, e2);
        } catch (Exception e3) {
            throw new UnsupportedDrmException(2, e3);
        }
    }
}
