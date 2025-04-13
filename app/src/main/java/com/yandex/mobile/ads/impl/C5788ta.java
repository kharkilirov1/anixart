package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.ta */
/* loaded from: classes3.dex */
public final class C5788ta extends AbstractC6022xd {

    /* renamed from: e */
    private final AssetManager f54986e;

    /* renamed from: f */
    @Nullable
    private Uri f54987f;

    /* renamed from: g */
    @Nullable
    private InputStream f54988g;

    /* renamed from: h */
    private long f54989h;

    /* renamed from: i */
    private boolean f54990i;

    /* renamed from: com.yandex.mobile.ads.impl.ta$a */
    public static final class a extends C5035em {
        public a(@Nullable IOException iOException, int i2) {
            super(iOException, i2);
        }
    }

    public C5788ta(Context context) {
        super(false);
        this.f54986e = context.getAssets();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: a */
    public final long mo22487a(C5192hm c5192hm) throws a {
        try {
            Uri uri = c5192hm.f50967a;
            this.f54987f = uri;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m29738b(c5192hm);
            InputStream open = this.f54986e.open(path, 1);
            this.f54988g = open;
            if (open.skip(c5192hm.f50972f) < c5192hm.f50972f) {
                throw new a(null, 2008);
            }
            long j2 = c5192hm.f50973g;
            if (j2 != -1) {
                this.f54989h = j2;
            } else {
                long available = this.f54988g.available();
                this.f54989h = available;
                if (available == ParserMinimalBase.MAX_INT_L) {
                    this.f54989h = -1L;
                }
            }
            this.f54990i = true;
            m29740c(c5192hm);
            return this.f54989h;
        } catch (a e2) {
            throw e2;
        } catch (IOException e3) {
            throw new a(e3, e3 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    public final void close() throws a {
        this.f54987f = null;
        try {
            try {
                InputStream inputStream = this.f54988g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e2) {
                throw new a(e2, 2000);
            }
        } finally {
            this.f54988g = null;
            if (this.f54990i) {
                this.f54990i = false;
                m29741f();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    @Nullable
    /* renamed from: d */
    public final Uri mo22490d() {
        return this.f54987f;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4815am
    public final int read(byte[] bArr, int i2, int i3) throws a {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f54989h;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e2) {
                throw new a(e2, 2000);
            }
        }
        InputStream inputStream = this.f54988g;
        int i4 = s91.f54530a;
        int read = inputStream.read(bArr, i2, i3);
        if (read == -1) {
            return -1;
        }
        long j3 = this.f54989h;
        if (j3 != -1) {
            this.f54989h = j3 - read;
        }
        m29739c(read);
        return read;
    }
}
