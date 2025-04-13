package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.ud */
/* loaded from: classes3.dex */
final class RunnableC5856ud implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ d91 f55478b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC5794td f55479c;

    public RunnableC5856ud(AbstractC5794td abstractC5794td, d91 d91Var) {
        this.f55479c = abstractC5794td;
        this.f55478b = d91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qw0 qw0Var;
        l01 l01Var;
        if (this.f55479c.mo27086a()) {
            return;
        }
        String mo23845a = this.f55478b.mo23845a(this.f55479c.f55057f);
        if (TextUtils.isEmpty(mo23845a)) {
            this.f55479c.mo21797b(AbstractC5524o4.f53163o);
            return;
        }
        this.f55479c.f55061j.m28055b(EnumC5668r3.f54177j);
        this.f55479c.f55057f.m24780c(this.f55478b.mo23843a());
        AbstractC5794td abstractC5794td = this.f55479c;
        C5101g2 c5101g2 = abstractC5794td.f55057f;
        qw0Var = abstractC5794td.f55067p;
        Context context = this.f55479c.f55053b;
        Objects.requireNonNull(qw0Var);
        c5101g2.m24776b(qw0.m27790a(context));
        d91 d91Var = this.f55478b;
        AbstractC5794td abstractC5794td2 = this.f55479c;
        Context context2 = abstractC5794td2.f55053b;
        C5101g2 c5101g22 = abstractC5794td2.f55057f;
        l01Var = abstractC5794td2.f55059h;
        AbstractC5630qd mo23561a = this.f55479c.mo23561a(mo23845a, d91Var.mo23844a(context2, c5101g22, l01Var));
        int i2 = C5427m6.f52583b;
        mo23561a.m30318b((Object) toString());
        this.f55479c.f55054c.m27603a(mo23561a);
    }
}
