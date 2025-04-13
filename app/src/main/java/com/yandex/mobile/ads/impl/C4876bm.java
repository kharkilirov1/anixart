package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.URLDecoder;

/* renamed from: com.yandex.mobile.ads.impl.bm */
/* loaded from: classes3.dex */
public final class C4876bm extends AbstractC6022xd {

    /* renamed from: e */
    @Nullable
    private C5192hm f48921e;

    /* renamed from: f */
    @Nullable
    private byte[] f48922f;

    /* renamed from: g */
    private int f48923g;

    /* renamed from: h */
    private int f48924h;

    public C4876bm() {
        super(false);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: a */
    public final long mo22487a(C5192hm c5192hm) throws IOException {
        m29738b(c5192hm);
        this.f48921e = c5192hm;
        Uri uri = c5192hm.f50967a;
        String scheme = uri.getScheme();
        C5220ia.m25472a("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i2 = s91.f54530a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw ep0.m24226a("Unexpected URI format: " + uri, (IllegalArgumentException) null);
        }
        String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.f48922f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e2) {
                throw ep0.m24226a("Error while parsing Base64 encoded string: " + str, e2);
            }
        } else {
            this.f48922f = s91.m28124b(URLDecoder.decode(str, C5285jh.f51606a.name()));
        }
        long j2 = c5192hm.f50972f;
        byte[] bArr = this.f48922f;
        if (j2 > bArr.length) {
            this.f48922f = null;
            throw new C5035em(2008);
        }
        int i3 = (int) j2;
        this.f48923g = i3;
        int length = bArr.length - i3;
        this.f48924h = length;
        long j3 = c5192hm.f50973g;
        if (j3 != -1) {
            this.f48924h = (int) Math.min(length, j3);
        }
        m29740c(c5192hm);
        long j4 = c5192hm.f50973g;
        return j4 != -1 ? j4 : this.f48924h;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    public final void close() {
        if (this.f48922f != null) {
            this.f48922f = null;
            m29741f();
        }
        this.f48921e = null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    @Nullable
    /* renamed from: d */
    public final Uri mo22490d() {
        C5192hm c5192hm = this.f48921e;
        if (c5192hm != null) {
            return c5192hm.f50967a;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4815am
    public final int read(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.f48924h;
        if (i4 == 0) {
            return -1;
        }
        int min = Math.min(i3, i4);
        byte[] bArr2 = this.f48922f;
        int i5 = s91.f54530a;
        System.arraycopy(bArr2, this.f48923g, bArr, i2, min);
        this.f48923g += min;
        this.f48924h -= min;
        m29739c(min);
        return min;
    }
}
