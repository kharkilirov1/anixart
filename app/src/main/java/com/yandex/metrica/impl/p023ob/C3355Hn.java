package com.yandex.metrica.impl.p023ob;

import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Hn */
/* loaded from: classes2.dex */
public class C3355Hn extends C3280En {

    /* renamed from: b */
    public final int f43074b;

    public C3355Hn(int i2, int i3) {
        super(i3);
        this.f43074b = i2;
    }

    @Override // com.yandex.metrica.impl.p023ob.C3280En
    public String toString() {
        StringBuilder m24u = C0000a.m24u("CollectionTrimInfo{itemsDropped=");
        m24u.append(this.f43074b);
        m24u.append(", bytesTruncated=");
        return C0000a.m17n(m24u, this.f42851a, '}');
    }
}
