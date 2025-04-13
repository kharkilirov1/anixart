package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.bk0;
import com.yandex.mobile.ads.impl.wj0;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
final class vj0 implements i20 {

    /* renamed from: a */
    public final /* synthetic */ kh0 f55823a;

    /* renamed from: b */
    public final /* synthetic */ w10 f55824b;

    /* renamed from: c */
    public final /* synthetic */ wj0.InterfaceC5975a f55825c;

    /* renamed from: d */
    public final /* synthetic */ wj0 f55826d;

    public vj0(wj0 wj0Var, kh0 kh0Var, sp0 sp0Var, bk0.C4874b c4874b) {
        this.f55826d = wj0Var;
        this.f55823a = kh0Var;
        this.f55824b = sp0Var;
        this.f55825c = c4874b;
    }

    @Override // com.yandex.mobile.ads.impl.i20
    /* renamed from: a */
    public final void mo25427a(@NonNull Map<String, Bitmap> map) {
        C5724s3 c5724s3;
        e20 e20Var;
        C4912cb c4912cb;
        c5724s3 = this.f55826d.f56144a;
        c5724s3.m28050a(EnumC5668r3.f54175h);
        e20Var = this.f55826d.f56146c;
        e20Var.m23989a(this.f55823a, map);
        c4912cb = this.f55826d.f56145b;
        kh0 kh0Var = this.f55823a;
        Objects.requireNonNull(c4912cb);
        for (eh0 eh0Var : kh0Var.m26128c().m27736d()) {
            List<C5276ja<?>> m24163b = eh0Var.m24163b();
            if (m24163b != null && !m24163b.isEmpty()) {
                eh0Var.m24169c(c4912cb.m23088a(m24163b, map));
            }
        }
        this.f55824b.mo24879a(map);
        ((bk0.C4874b) this.f55825c).m22856b();
    }
}
