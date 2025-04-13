package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.InterfaceC6256u;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ay0 implements InterfaceC5755so {

    /* renamed from: a */
    @NonNull
    private final ux0 f48699a;

    public ay0(@NonNull InterfaceC5896v0 interfaceC5896v0, int i2) {
        this.f48699a = new ux0(interfaceC5896v0, i2);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5755so
    @NonNull
    /* renamed from: a */
    public final ArrayList mo22661a(@NonNull Context context, @NonNull AdResponse adResponse, @NonNull InterfaceC6256u interfaceC6256u, @NonNull InterfaceC5541ok interfaceC5541ok, @NonNull C5612q0 c5612q0, @NonNull C5502nm c5502nm, @Nullable C5600pp c5600pp) {
        ArrayList arrayList = new ArrayList();
        C5812tp m29147a = this.f48699a.m29147a(context, adResponse, interfaceC6256u, c5612q0, interfaceC5541ok, c5600pp);
        if (m29147a != null) {
            arrayList.add(m29147a);
        }
        return arrayList;
    }
}
