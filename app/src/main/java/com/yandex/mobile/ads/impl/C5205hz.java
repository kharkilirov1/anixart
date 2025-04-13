package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.hz */
/* loaded from: classes3.dex */
public final class C5205hz {

    /* renamed from: a */
    @NonNull
    private final C4957d6 f51150a;

    public C5205hz(@NonNull Context context, @NonNull C5101g2 c5101g2) {
        this.f51150a = new C4957d6(context, c5101g2);
    }

    /* renamed from: a */
    public final void m25400a(@NonNull String str, @NonNull AdResponse adResponse, @NonNull C6099z0 c6099z0) {
        List<String> m21830t = adResponse.m21830t();
        if (m21830t != null) {
            Iterator<String> it = m21830t.iterator();
            while (it.hasNext()) {
                this.f51150a.m23816a(it.next());
            }
        }
        this.f51150a.m23817a(str, adResponse, c6099z0);
    }
}
