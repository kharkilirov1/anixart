package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.impl.InterfaceC5589pf;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.qf */
/* loaded from: classes3.dex */
public final class C5637qf {
    private C5637qf() {
    }

    /* renamed from: a */
    public static AbstractC4698p m27717a(InterfaceC5589pf.a aVar, ArrayList arrayList) {
        int i2 = AbstractC4698p.f47900c;
        AbstractC4698p.a aVar2 = new AbstractC4698p.a();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Bundle bundle = (Bundle) arrayList.get(i3);
            Objects.requireNonNull(bundle);
            aVar2.m22060b(aVar.fromBundle(bundle));
        }
        return aVar2.m22058a();
    }
}
