package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class bu0 extends AbstractC6022xd {

    /* renamed from: e */
    private final Resources f48982e;

    /* renamed from: f */
    private final String f48983f;

    /* renamed from: g */
    @Nullable
    private Uri f48984g;

    /* renamed from: h */
    @Nullable
    private AssetFileDescriptor f48985h;

    /* renamed from: i */
    @Nullable
    private FileInputStream f48986i;

    /* renamed from: j */
    private long f48987j;

    /* renamed from: k */
    private boolean f48988k;

    /* renamed from: com.yandex.mobile.ads.impl.bu0$a */
    public static class C4887a extends C5035em {
        public C4887a(int i2, @Nullable String str, @Nullable Exception exc) {
            super(i2, str, exc);
        }
    }

    public bu0(Context context) {
        super(false);
        this.f48982e = context.getResources();
        this.f48983f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i2) {
        return Uri.parse("rawresource:///" + i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r1.matches("\\d+") != false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014f  */
    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo22487a(com.yandex.mobile.ads.impl.C5192hm r15) throws com.yandex.mobile.ads.impl.bu0.C4887a {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.bu0.mo22487a(com.yandex.mobile.ads.impl.hm):long");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    public final void close() throws C4887a {
        this.f48984g = null;
        try {
            try {
                FileInputStream fileInputStream = this.f48986i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f48986i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f48985h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f48985h = null;
                        if (this.f48988k) {
                            this.f48988k = false;
                            m29741f();
                        }
                    }
                } catch (IOException e2) {
                    throw new C4887a(2000, null, e2);
                }
            } catch (IOException e3) {
                throw new C4887a(2000, null, e3);
            }
        } catch (Throwable th) {
            this.f48986i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f48985h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f48985h = null;
                    if (this.f48988k) {
                        this.f48988k = false;
                        m29741f();
                    }
                    throw th;
                } catch (IOException e4) {
                    throw new C4887a(2000, null, e4);
                }
            } finally {
                this.f48985h = null;
                if (this.f48988k) {
                    this.f48988k = false;
                    m29741f();
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    @Nullable
    /* renamed from: d */
    public final Uri mo22490d() {
        return this.f48984g;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4815am
    public final int read(byte[] bArr, int i2, int i3) throws C4887a {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f48987j;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e2) {
                throw new C4887a(2000, null, e2);
            }
        }
        FileInputStream fileInputStream = this.f48986i;
        int i4 = s91.f54530a;
        int read = fileInputStream.read(bArr, i2, i3);
        if (read == -1) {
            if (this.f48987j == -1) {
                return -1;
            }
            throw new C4887a(2000, "End of stream reached having not read sufficient data.", new EOFException());
        }
        long j3 = this.f48987j;
        if (j3 != -1) {
            this.f48987j = j3 - read;
        }
        m29739c(read);
        return read;
    }
}
