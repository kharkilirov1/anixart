package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.d10;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class e10 {

    /* renamed from: a */
    private final ap0 f49778a = new ap0(10);

    @Nullable
    /* renamed from: a */
    public final Metadata m23987a(C5598pn c5598pn, @Nullable d10.InterfaceC4950a interfaceC4950a) throws IOException {
        Metadata metadata = null;
        int i2 = 0;
        while (true) {
            try {
                c5598pn.mo26764b(this.f49778a.m22587c(), 0, 10, false);
                this.f49778a.m22591e(0);
                if (this.f49778a.m22610w() != 4801587) {
                    break;
                }
                this.f49778a.m22593f(3);
                int m22606s = this.f49778a.m22606s();
                int i3 = m22606s + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i3];
                    System.arraycopy(this.f49778a.m22587c(), 0, bArr, 0, 10);
                    c5598pn.mo26764b(bArr, 10, m22606s, false);
                    metadata = new d10(interfaceC4950a).m23778a(i3, bArr);
                } else {
                    c5598pn.m27349a(false, m22606s);
                }
                i2 += i3;
            } catch (EOFException unused) {
            }
        }
        c5598pn.mo26765c();
        c5598pn.m27349a(false, i2);
        return metadata;
    }
}
