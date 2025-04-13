package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.wz0;

/* loaded from: classes3.dex */
final class tz0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ wz0.InterfaceC5998a f55310b;

    /* renamed from: c */
    public final /* synthetic */ wz0 f55311c;

    /* renamed from: com.yandex.mobile.ads.impl.tz0$a */
    public class C5829a implements InterfaceC5170h8 {
        public C5829a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5170h8
        /* renamed from: a */
        public final void mo25074a(@Nullable C4796a8 c4796a8) {
            C5724s3 c5724s3;
            C5961w7 c5961w7;
            C5961w7 c5961w72;
            C5961w7 c5961w73;
            c5724s3 = tz0.this.f55311c.f56305c;
            c5724s3.m28050a(EnumC5668r3.f54169b);
            if (c4796a8 != null) {
                c5961w7 = tz0.this.f55311c.f56311i;
                c5961w7.m29395a(c4796a8.m22397a());
                c5961w72 = tz0.this.f55311c.f56311i;
                c5961w72.m29398b(c4796a8.m22398b());
                c5961w73 = tz0.this.f55311c.f56311i;
                c5961w73.m29396a(c4796a8.m22399c());
            }
            tz0 tz0Var = tz0.this;
            wz0.m29596b(tz0Var.f55311c, tz0Var.f55310b);
        }
    }

    public tz0(wz0 wz0Var, wz0.InterfaceC5998a interfaceC5998a) {
        this.f55311c = wz0Var;
        this.f55310b = interfaceC5998a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4960d8 c4960d8;
        Context context;
        c4960d8 = this.f55311c.f56309g;
        context = this.f55311c.f56303a;
        c4960d8.m23832a(context, new C5829a());
    }
}
