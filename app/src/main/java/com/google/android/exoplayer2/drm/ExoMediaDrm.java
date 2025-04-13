package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public interface ExoMediaDrm {

    public static final class AppManagedProvider implements Provider {
        @Override // com.google.android.exoplayer2.drm.ExoMediaDrm.Provider
        /* renamed from: a */
        public ExoMediaDrm mo6326a(UUID uuid) {
            throw null;
        }
    }

    public static final class KeyRequest {

        /* renamed from: a */
        public final byte[] f10726a;

        /* renamed from: b */
        public final String f10727b;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface RequestType {
        }

        public KeyRequest(byte[] bArr, String str, int i2) {
            this.f10726a = bArr;
            this.f10727b = str;
        }
    }

    public static final class KeyStatus {
    }

    public interface OnEventListener {
        /* renamed from: a */
        void mo6295a(ExoMediaDrm exoMediaDrm, @Nullable byte[] bArr, int i2, int i3, @Nullable byte[] bArr2);
    }

    public interface OnExpirationUpdateListener {
    }

    public interface OnKeyStatusChangeListener {
    }

    public interface Provider {
        /* renamed from: a */
        ExoMediaDrm mo6326a(UUID uuid);
    }

    public static final class ProvisionRequest {

        /* renamed from: a */
        public final byte[] f10728a;

        /* renamed from: b */
        public final String f10729b;

        public ProvisionRequest(byte[] bArr, String str) {
            this.f10728a = bArr;
            this.f10729b = str;
        }
    }

    /* renamed from: a */
    Map<String, String> mo6314a(byte[] bArr);

    /* renamed from: b */
    ProvisionRequest mo6315b();

    /* renamed from: c */
    CryptoConfig mo6316c(byte[] bArr) throws MediaCryptoException;

    /* renamed from: d */
    byte[] mo6317d() throws MediaDrmException;

    /* renamed from: e */
    boolean mo6318e(byte[] bArr, String str);

    /* renamed from: f */
    void mo6319f(byte[] bArr, byte[] bArr2);

    /* renamed from: g */
    void mo6320g(byte[] bArr);

    /* renamed from: h */
    void mo6321h(@Nullable OnEventListener onEventListener);

    @Nullable
    /* renamed from: i */
    byte[] mo6322i(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    /* renamed from: j */
    void mo6323j(byte[] bArr) throws DeniedByServerException;

    /* renamed from: k */
    KeyRequest mo6324k(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i2, @Nullable HashMap<String, String> hashMap) throws NotProvisionedException;

    /* renamed from: l */
    int mo6325l();

    void release();
}
