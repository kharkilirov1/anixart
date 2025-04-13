package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class t51 implements InterfaceC4978dm {

    /* renamed from: a */
    private final InterfaceC4978dm f54951a;

    /* renamed from: b */
    private final InterfaceC4930cm f54952b;

    /* renamed from: c */
    private boolean f54953c;

    /* renamed from: d */
    private long f54954d;

    public t51(InterfaceC4978dm interfaceC4978dm, C6120zf c6120zf) {
        this.f54951a = (InterfaceC4978dm) C5220ia.m25469a(interfaceC4978dm);
        this.f54952b = (InterfaceC4930cm) C5220ia.m25469a(c6120zf);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: a */
    public final long mo22487a(C5192hm c5192hm) throws IOException {
        long mo22487a = this.f54951a.mo22487a(c5192hm);
        this.f54954d = mo22487a;
        if (mo22487a == 0) {
            return 0L;
        }
        if (c5192hm.f50973g == -1 && mo22487a != -1) {
            c5192hm = c5192hm.m25235a(mo22487a);
        }
        this.f54953c = true;
        this.f54952b.mo23313a(c5192hm);
        return this.f54954d;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: b */
    public final Map<String, List<String>> mo22489b() {
        return this.f54951a.mo22489b();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    public final void close() throws IOException {
        try {
            this.f54951a.close();
        } finally {
            if (this.f54953c) {
                this.f54953c = false;
                this.f54952b.close();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    @Nullable
    /* renamed from: d */
    public final Uri mo22490d() {
        return this.f54951a.mo22490d();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4815am
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        if (this.f54954d == 0) {
            return -1;
        }
        int read = this.f54951a.read(bArr, i2, i3);
        if (read > 0) {
            this.f54952b.write(bArr, i2, read);
            long j2 = this.f54954d;
            if (j2 != -1) {
                this.f54954d = j2 - read;
            }
        }
        return read;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: a */
    public final void mo22488a(v71 v71Var) {
        Objects.requireNonNull(v71Var);
        this.f54951a.mo22488a(v71Var);
    }
}
