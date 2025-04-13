package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.i80;
import com.yandex.mobile.ads.impl.l80;
import java.io.FileNotFoundException;

/* renamed from: com.yandex.mobile.ads.impl.wn */
/* loaded from: classes3.dex */
public final class C5981wn implements i80 {
    public C5981wn() {
        this(0);
    }

    @Override // com.yandex.mobile.ads.impl.i80
    /* renamed from: a */
    public final int mo25458a(int i2) {
        return i2 == 7 ? 6 : 3;
    }

    @Override // com.yandex.mobile.ads.impl.i80
    /* renamed from: a */
    public final long mo25459a(i80.C5217a c5217a) {
        boolean z;
        Throwable th = c5217a.f51240a;
        if (!(th instanceof ep0) && !(th instanceof FileNotFoundException) && !(th instanceof e00) && !(th instanceof l80.C5388g)) {
            int i2 = C5035em.f50012b;
            while (true) {
                if (th == null) {
                    z = false;
                    break;
                }
                if ((th instanceof C5035em) && ((C5035em) th).f50013a == 2008) {
                    z = true;
                    break;
                }
                th = th.getCause();
            }
            if (!z) {
                return Math.min((c5217a.f51241b - 1) * 1000, 5000);
            }
        }
        return -9223372036854775807L;
    }

    public C5981wn(int i2) {
    }
}
