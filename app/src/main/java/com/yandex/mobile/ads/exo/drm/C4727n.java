package com.yandex.mobile.ads.exo.drm;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.div2.C3070s0;
import com.yandex.mobile.ads.exo.drm.C4716c;
import com.yandex.mobile.ads.exo.drm.InterfaceC4726m;
import com.yandex.mobile.ads.impl.C5220ia;
import com.yandex.mobile.ads.impl.C5915vf;
import com.yandex.mobile.ads.impl.C5942vv;
import com.yandex.mobile.ads.impl.C5993wv;
import com.yandex.mobile.ads.impl.InterfaceC5646ql;
import com.yandex.mobile.ads.impl.a91;
import com.yandex.mobile.ads.impl.ct0;
import com.yandex.mobile.ads.impl.d90;
import com.yandex.mobile.ads.impl.s91;
import com.yandex.mobile.ads.impl.uq0;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

@RequiresApi
/* renamed from: com.yandex.mobile.ads.exo.drm.n */
/* loaded from: classes2.dex */
public final class C4727n implements InterfaceC4726m {

    /* renamed from: d */
    private static final C5993wv f48032d = ct0.m23510b();

    /* renamed from: e */
    public static final InterfaceC4726m.c f48033e = C3070s0.f42036k;

    /* renamed from: a */
    private final UUID f48034a;

    /* renamed from: b */
    private final MediaDrm f48035b;

    /* renamed from: c */
    private int f48036c;

    @RequiresApi
    /* renamed from: com.yandex.mobile.ads.exo.drm.n$a */
    public static class a {
        @DoNotInline
        /* renamed from: a */
        public static boolean m22217a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        @DoNotInline
        /* renamed from: a */
        public static void m22216a(MediaDrm mediaDrm, byte[] bArr, uq0 uq0Var) {
            LogSessionId m29096a = uq0Var.m29096a();
            if (m29096a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            Objects.requireNonNull(playbackComponent);
            playbackComponent.setLogSessionId(m29096a);
        }
    }

    private C4727n(UUID uuid) throws UnsupportedSchemeException {
        C5220ia.m25469a(uuid);
        C5220ia.m25472a("Use C.CLEARKEY_UUID instead", !C5915vf.f55808b.equals(uuid));
        this.f48034a = uuid;
        MediaDrm mediaDrm = new MediaDrm(m22208a(uuid));
        this.f48035b = mediaDrm;
        this.f48036c = 1;
        if (C5915vf.f55810d.equals(uuid) && m22214d()) {
            m22209a(mediaDrm);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ InterfaceC4726m m22211b(UUID uuid) {
        try {
            return m22212c(uuid);
        } catch (a91 unused) {
            d90.m23839b("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new C4724k();
        }
    }

    /* renamed from: c */
    public static C4727n m22212c(UUID uuid) throws a91 {
        try {
            return new C4727n(uuid);
        } catch (UnsupportedSchemeException e2) {
            throw new a91(e2);
        } catch (Exception e3) {
            throw new a91(e3);
        }
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    /* renamed from: a */
    public final void mo22194a(@Nullable final InterfaceC4726m.b bVar) {
        this.f48035b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: com.yandex.mobile.ads.exo.drm.x
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i2, int i3, byte[] bArr2) {
                C4727n.this.m22210a(bVar, mediaDrm, bArr, i2, i3, bArr2);
            }
        });
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    /* renamed from: b */
    public final int mo22198b() {
        return 2;
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    /* renamed from: d */
    public final InterfaceC5646ql mo22203d(byte[] bArr) throws MediaCryptoException {
        return new C5942vv(m22208a(this.f48034a), bArr, s91.f54530a < 21 && C5915vf.f55810d.equals(this.f48034a) && "L3".equals(this.f48035b.getPropertyString("securityLevel")));
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    public final synchronized void release() {
        int i2 = this.f48036c - 1;
        this.f48036c = i2;
        if (i2 == 0) {
            this.f48035b.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m22210a(InterfaceC4726m.b bVar, MediaDrm mediaDrm, byte[] bArr, int i2, int i3, byte[] bArr2) {
        C4716c.c cVar = C4716c.this.f47998y;
        Objects.requireNonNull(cVar);
        cVar.obtainMessage(i2, bArr).sendToTarget();
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    /* renamed from: b */
    public final void mo22199b(byte[] bArr) {
        this.f48035b.closeSession(bArr);
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    /* renamed from: c */
    public final byte[] mo22202c() throws MediaDrmException {
        return this.f48035b.openSession();
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    @Nullable
    /* renamed from: b */
    public final byte[] mo22200b(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException {
        if (C5915vf.f55809c.equals(this.f48034a)) {
            bArr2 = C4714a.m22091a(bArr2);
        }
        return this.f48035b.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    /* renamed from: c */
    public final void mo22201c(byte[] bArr) throws DeniedByServerException {
        this.f48035b.provideProvisionResponse(bArr);
    }

    /* renamed from: d */
    private static boolean m22214d() {
        return f48032d.m29578f().equals(s91.f54533d);
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    /* renamed from: a */
    public final void mo22195a(byte[] bArr, uq0 uq0Var) {
        if (s91.f54530a >= 31) {
            try {
                a.m22216a(this.f48035b, bArr, uq0Var);
            } catch (UnsupportedOperationException unused) {
                d90.m23842d("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x01dd, code lost:
    
        if (r1 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01d7, code lost:
    
        if (r5.m29576d().equals(r8) == false) goto L88;
     */
    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    @android.annotation.SuppressLint
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.exo.drm.InterfaceC4726m.a mo22191a(byte[] r15, @androidx.annotation.Nullable java.util.List<com.yandex.mobile.ads.exo.drm.DrmInitData.SchemeData> r16, int r17, @androidx.annotation.Nullable java.util.HashMap<java.lang.String, java.lang.String> r18) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.drm.C4727n.mo22191a(byte[], java.util.List, int, java.util.HashMap):com.yandex.mobile.ads.exo.drm.m$a");
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    /* renamed from: a */
    public final InterfaceC4726m.d mo22192a() {
        MediaDrm.ProvisionRequest provisionRequest = this.f48035b.getProvisionRequest();
        return new InterfaceC4726m.d(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    /* renamed from: a */
    public final Map<String, String> mo22193a(byte[] bArr) {
        return this.f48035b.queryKeyStatus(bArr);
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    /* renamed from: a */
    public final boolean mo22197a(String str, byte[] bArr) {
        if (s91.f54530a >= 31) {
            return a.m22217a(this.f48035b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f48034a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m
    /* renamed from: a */
    public final void mo22196a(byte[] bArr, byte[] bArr2) {
        this.f48035b.restoreKeys(bArr, bArr2);
    }

    /* renamed from: a */
    private static UUID m22208a(UUID uuid) {
        return (s91.f54530a >= 27 || !C5915vf.f55809c.equals(uuid)) ? uuid : C5915vf.f55808b;
    }

    /* renamed from: a */
    private static void m22209a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }
}
