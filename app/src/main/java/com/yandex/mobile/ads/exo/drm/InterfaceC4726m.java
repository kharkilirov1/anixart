package com.yandex.mobile.ads.exo.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.InterfaceC5646ql;
import com.yandex.mobile.ads.impl.uq0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.yandex.mobile.ads.exo.drm.m */
/* loaded from: classes2.dex */
public interface InterfaceC4726m {

    /* renamed from: com.yandex.mobile.ads.exo.drm.m$a */
    public static final class a {

        /* renamed from: a */
        private final byte[] f48028a;

        /* renamed from: b */
        private final String f48029b;

        public a(String str, byte[] bArr) {
            this.f48028a = bArr;
            this.f48029b = str;
        }

        /* renamed from: a */
        public final byte[] m22204a() {
            return this.f48028a;
        }

        /* renamed from: b */
        public final String m22205b() {
            return this.f48029b;
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.drm.m$b */
    public interface b {
    }

    /* renamed from: com.yandex.mobile.ads.exo.drm.m$c */
    public interface c {
        /* renamed from: a */
        InterfaceC4726m mo17752a(UUID uuid);
    }

    /* renamed from: com.yandex.mobile.ads.exo.drm.m$d */
    public static final class d {

        /* renamed from: a */
        private final byte[] f48030a;

        /* renamed from: b */
        private final String f48031b;

        public d(String str, byte[] bArr) {
            this.f48030a = bArr;
            this.f48031b = str;
        }

        /* renamed from: a */
        public final byte[] m22206a() {
            return this.f48030a;
        }

        /* renamed from: b */
        public final String m22207b() {
            return this.f48031b;
        }
    }

    /* renamed from: a */
    a mo22191a(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i2, @Nullable HashMap<String, String> hashMap) throws NotProvisionedException;

    /* renamed from: a */
    d mo22192a();

    /* renamed from: a */
    Map<String, String> mo22193a(byte[] bArr);

    /* renamed from: a */
    void mo22194a(@Nullable b bVar);

    /* renamed from: a */
    void mo22195a(byte[] bArr, uq0 uq0Var);

    /* renamed from: a */
    void mo22196a(byte[] bArr, byte[] bArr2);

    /* renamed from: a */
    boolean mo22197a(String str, byte[] bArr);

    /* renamed from: b */
    int mo22198b();

    /* renamed from: b */
    void mo22199b(byte[] bArr);

    @Nullable
    /* renamed from: b */
    byte[] mo22200b(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    /* renamed from: c */
    void mo22201c(byte[] bArr) throws DeniedByServerException;

    /* renamed from: c */
    byte[] mo22202c() throws MediaDrmException;

    /* renamed from: d */
    InterfaceC5646ql mo22203d(byte[] bArr) throws MediaCryptoException;

    void release();
}
