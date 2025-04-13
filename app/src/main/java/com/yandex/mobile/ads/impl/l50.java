package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.instream.InstreamAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class l50 implements InstreamAd {

    /* renamed from: a */
    @NonNull
    private final List<m50> f52263a;

    public l50(@NonNull ArrayList arrayList) {
        this.f52263a = arrayList;
    }

    /* renamed from: a */
    public final void m26355a() {
        Iterator<m50> it = this.f52263a.iterator();
        while (it.hasNext()) {
            it.next().m26570a(null);
        }
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAd
    @NonNull
    public final List<m50> getAdBreaks() {
        return this.f52263a;
    }
}
