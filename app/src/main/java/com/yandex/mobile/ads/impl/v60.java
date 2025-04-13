package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.InterfaceC6256u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class v60 implements InterfaceC5755so {

    /* renamed from: a */
    @NonNull
    private final u60 f55753a;

    public v60(@NonNull InterfaceC5896v0 interfaceC5896v0, int i2) {
        this.f55753a = new u60(interfaceC5896v0, i2);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5755so
    @NonNull
    /* renamed from: a */
    public final ArrayList mo22661a(@NonNull Context context, @NonNull AdResponse adResponse, @NonNull InterfaceC6256u interfaceC6256u, @NonNull InterfaceC5541ok interfaceC5541ok, @NonNull C5612q0 c5612q0, @NonNull C5502nm c5502nm, @Nullable C5600pp c5600pp) {
        C5973wi m27855a = new r60(adResponse, c5612q0, interfaceC5541ok).m27855a(new rh0(), c5502nm);
        ArrayList arrayList = new ArrayList();
        List asList = Arrays.asList(new or0(m27855a), new l70(m27855a), new k70(m27855a));
        C5812tp m28905a = this.f55753a.m28905a(context, adResponse, c5612q0, interfaceC5541ok, c5502nm, c5600pp);
        if (m28905a != null) {
            arrayList.add(m28905a);
        }
        arrayList.addAll(asList);
        return arrayList;
    }
}
