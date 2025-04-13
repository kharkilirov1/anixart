package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiresApi
/* loaded from: classes.dex */
public final class DummyExoMediaDrm implements ExoMediaDrm {
    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: a */
    public Map<String, String> mo6314a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: b */
    public ExoMediaDrm.ProvisionRequest mo6315b() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: c */
    public CryptoConfig mo6316c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: d */
    public byte[] mo6317d() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: e */
    public boolean mo6318e(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: f */
    public void mo6319f(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: g */
    public void mo6320g(byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: h */
    public void mo6321h(@Nullable ExoMediaDrm.OnEventListener onEventListener) {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    @Nullable
    /* renamed from: i */
    public byte[] mo6322i(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: j */
    public void mo6323j(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: k */
    public ExoMediaDrm.KeyRequest mo6324k(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i2, @Nullable HashMap<String, String> hashMap) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: l */
    public int mo6325l() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void release() {
    }
}
