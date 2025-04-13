package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.ix */
/* loaded from: classes3.dex */
public final class C5254ix {

    /* renamed from: a */
    @NonNull
    private final InterfaceC5541ok f51450a;

    /* renamed from: b */
    @NonNull
    private final List<s70<NativeAdView>> f51451b;

    public C5254ix(@NonNull ArrayList arrayList, @NonNull InterfaceC5541ok interfaceC5541ok) {
        this.f51450a = interfaceC5541ok;
        this.f51451b = arrayList;
    }

    /* renamed from: a */
    public final void m25743a() {
        Iterator<s70<NativeAdView>> it = this.f51451b.iterator();
        while (it.hasNext()) {
            it.next().m28076b();
        }
    }

    /* renamed from: b */
    public final void m25744b() {
        if (this.f51451b.isEmpty() || this.f51451b.get(0).m28075a()) {
            return;
        }
        this.f51450a.mo27088c();
    }
}
