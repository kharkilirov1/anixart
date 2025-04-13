package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.Dl */
/* loaded from: classes2.dex */
public class C3253Dl implements InterfaceC3601Rk {

    /* renamed from: a */
    private final int f42747a;

    public C3253Dl(int i2) {
        this.f42747a = i2;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3601Rk
    /* renamed from: a */
    public void mo17981a(@NonNull C3278El c3278El) {
        if (c3278El.f42829h.length() > this.f42747a) {
            int length = c3278El.f42829h.length();
            int i2 = this.f42747a;
            int i3 = length - i2;
            String substring = c3278El.f42829h.substring(0, i2);
            c3278El.f42829h = substring;
            c3278El.f42831j = Integer.valueOf(substring.length() + i3);
        }
    }
}
