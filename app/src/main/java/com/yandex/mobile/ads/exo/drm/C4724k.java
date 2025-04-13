package com.yandex.mobile.ads.exo.drm;

import android.media.MediaDrmException;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.exo.drm.InterfaceC4726m;
import com.yandex.mobile.ads.impl.InterfaceC5646ql;
import com.yandex.mobile.ads.impl.uq0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiresApi
/* renamed from: com.yandex.mobile.ads.exo.drm.k */
/* loaded from: classes2.dex */
public final class C4724k implements InterfaceC4726m {
    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    /* renamed from: a */
    public final InterfaceC4726m.a mo22191a(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i2, @Nullable HashMap<String, String> hashMap) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    /* renamed from: a */
    public final void mo22194a(@Nullable InterfaceC4726m.b bVar) {
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    /* renamed from: a */
    public /* synthetic */ void mo22195a(byte[] bArr, uq0 uq0Var) {
        C4736w.m22233a(this, bArr, uq0Var);
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    /* renamed from: b */
    public final int mo22198b() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    /* renamed from: b */
    public final void mo22199b(byte[] bArr) {
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    @Nullable
    /* renamed from: b */
    public final byte[] mo22200b(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    /* renamed from: c */
    public final byte[] mo22202c() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    /* renamed from: d */
    public final InterfaceC5646ql mo22203d(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    /* renamed from: a */
    public final InterfaceC4726m.d mo22192a() {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    /* renamed from: c */
    public final void mo22201c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    /* renamed from: a */
    public final Map<String, String> mo22193a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    /* renamed from: a */
    public final boolean mo22197a(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    /* renamed from: a */
    public final void mo22196a(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }
}
