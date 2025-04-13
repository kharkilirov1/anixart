package com.yandex.metrica.impl.p023ob;

import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.En */
/* loaded from: classes2.dex */
public class C3280En implements InterfaceC3305Fn {

    /* renamed from: a */
    public final int f42851a;

    public C3280En(int i2) {
        this.f42851a = i2;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3305Fn
    /* renamed from: a */
    public int mo18020a() {
        return this.f42851a;
    }

    public String toString() {
        return C0000a.m17n(C0000a.m24u("BytesTruncatedInfo{bytesTruncated="), this.f42851a, '}');
    }

    /* renamed from: a */
    public static InterfaceC3305Fn m18019a(InterfaceC3305Fn... interfaceC3305FnArr) {
        int i2 = 0;
        for (InterfaceC3305Fn interfaceC3305Fn : interfaceC3305FnArr) {
            if (interfaceC3305Fn != null) {
                i2 = interfaceC3305Fn.mo18020a() + i2;
            }
        }
        return new C3280En(i2);
    }
}
