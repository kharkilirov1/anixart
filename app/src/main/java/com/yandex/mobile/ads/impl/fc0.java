package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.C4809ag;
import com.yandex.mobile.ads.impl.C5405ln;
import com.yandex.mobile.ads.impl.InterfaceC5589pf;
import com.yandex.mobile.ads.impl.pb0;
import com.yandex.mobile.ads.impl.ws0;

/* loaded from: classes3.dex */
public final class fc0 {

    /* renamed from: a */
    @NonNull
    private final Context f50201a;

    public fc0(@NonNull Context context) {
        this.f50201a = context.getApplicationContext();
    }

    @NonNull
    /* renamed from: a */
    public final ws0 m24542a(@NonNull uc1 uc1Var) {
        ws0.C5988a c5988a = new ws0.C5988a(new C4809ag.b().m22496a(C5709rs.m27980a().m27981a(this.f50201a)).m22495a(new C5405ln.a(this.f50201a, new ok1(ly0.m26544a()).m27090a(this.f50201a))), new C5650qn());
        String url = uc1Var.getUrl();
        InterfaceC5589pf.a<pb0> aVar = pb0.f53427g;
        return c5988a.m29562a(new pb0.C5575a().m27216c(url).m27214a());
    }
}
