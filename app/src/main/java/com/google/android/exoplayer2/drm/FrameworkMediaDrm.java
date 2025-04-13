package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.android.exoplayer2.C0932C;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@RequiresApi
/* loaded from: classes.dex */
public final class FrameworkMediaDrm implements ExoMediaDrm {

    /* renamed from: d */
    public static final /* synthetic */ int f10734d = 0;

    /* renamed from: a */
    public final UUID f10735a;

    /* renamed from: b */
    public final MediaDrm f10736b;

    /* renamed from: c */
    public int f10737c;

    @RequiresApi
    public static class Api31 {
        @DoNotInline
        /* renamed from: a */
        public static boolean m6327a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }
    }

    public FrameworkMediaDrm(UUID uuid) throws UnsupportedSchemeException {
        Objects.requireNonNull(uuid);
        UUID uuid2 = C0932C.f9457b;
        Assertions.m7514b(!uuid2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f10735a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Util.f14736a >= 27 || !C0932C.f9458c.equals(uuid)) ? uuid : uuid2);
        this.f10736b = mediaDrm;
        this.f10737c = 1;
        if (C0932C.f9459d.equals(uuid) && "ASUS_Z00AD".equals(Util.f14739d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: a */
    public Map<String, String> mo6314a(byte[] bArr) {
        return this.f10736b.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: b */
    public ExoMediaDrm.ProvisionRequest mo6315b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f10736b.getProvisionRequest();
        return new ExoMediaDrm.ProvisionRequest(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: c */
    public CryptoConfig mo6316c(byte[] bArr) throws MediaCryptoException {
        int i2 = Util.f14736a;
        boolean z = i2 < 21 && C0932C.f9459d.equals(this.f10735a) && "L3".equals(this.f10736b.getPropertyString("securityLevel"));
        UUID uuid = this.f10735a;
        if (i2 < 27 && C0932C.f9458c.equals(uuid)) {
            uuid = C0932C.f9457b;
        }
        return new FrameworkCryptoConfig(uuid, bArr, z);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: d */
    public byte[] mo6317d() throws MediaDrmException {
        return this.f10736b.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: e */
    public boolean mo6318e(byte[] bArr, String str) {
        if (Util.f14736a >= 31) {
            return Api31.m6327a(this.f10736b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f10735a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: f */
    public void mo6319f(byte[] bArr, byte[] bArr2) {
        this.f10736b.restoreKeys(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: g */
    public void mo6320g(byte[] bArr) {
        this.f10736b.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: h */
    public void mo6321h(@Nullable final ExoMediaDrm.OnEventListener onEventListener) {
        this.f10736b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: com.google.android.exoplayer2.drm.f
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i2, int i3, byte[] bArr2) {
                FrameworkMediaDrm frameworkMediaDrm = FrameworkMediaDrm.this;
                ExoMediaDrm.OnEventListener onEventListener2 = onEventListener;
                int i4 = FrameworkMediaDrm.f10734d;
                Objects.requireNonNull(frameworkMediaDrm);
                onEventListener2.mo6295a(frameworkMediaDrm, bArr, i2, i3, bArr2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    @Nullable
    /* renamed from: i */
    public byte[] mo6322i(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException {
        if (C0932C.f9458c.equals(this.f10735a) && Util.f14736a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(Util.m7748q(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    if (i2 != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', JsonPointer.SEPARATOR));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', JsonPointer.SEPARATOR));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = Util.m7708G(sb.toString());
            } catch (JSONException e2) {
                String m7748q = Util.m7748q(bArr2);
                Log.m7585b("ClearKeyUtil", m7748q.length() != 0 ? "Failed to adjust response data: ".concat(m7748q) : new String("Failed to adjust response data: "), e2);
            }
        }
        return this.f10736b.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: j */
    public void mo6323j(byte[] bArr) throws DeniedByServerException {
        this.f10736b.provideProvisionResponse(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x019f, code lost:
    
        if (r1 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0199, code lost:
    
        if ("AFTT".equals(r5) == false) goto L83;
     */
    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    @android.annotation.SuppressLint
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.drm.ExoMediaDrm.KeyRequest mo6324k(byte[] r16, @androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> r17, int r18, @androidx.annotation.Nullable java.util.HashMap<java.lang.String, java.lang.String> r19) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.FrameworkMediaDrm.mo6324k(byte[], java.util.List, int, java.util.HashMap):com.google.android.exoplayer2.drm.ExoMediaDrm$KeyRequest");
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: l */
    public int mo6325l() {
        return 2;
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public synchronized void release() {
        int i2 = this.f10737c - 1;
        this.f10737c = i2;
        if (i2 == 0) {
            this.f10736b.release();
        }
    }
}
