package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.pj */
/* loaded from: classes3.dex */
public final class C5593pj implements InterfaceC5701ro {

    /* renamed from: a */
    @NonNull
    private final InterfaceC5701ro[] f53562a;

    public C5593pj(@NonNull InterfaceC5701ro... interfaceC5701roArr) {
        this.f53562a = interfaceC5701roArr;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5701ro
    /* renamed from: a */
    public final boolean mo27335a(@NonNull Context context) {
        for (InterfaceC5701ro interfaceC5701ro : this.f53562a) {
            if (!interfaceC5701ro.mo27335a(context)) {
                return false;
            }
        }
        return true;
    }
}
