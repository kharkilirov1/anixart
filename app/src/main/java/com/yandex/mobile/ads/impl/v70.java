package com.yandex.mobile.ads.impl;

import java.util.TreeSet;

/* loaded from: classes3.dex */
public final class v70 implements InterfaceC4970dg {

    /* renamed from: a */
    private final long f55772a;

    /* renamed from: b */
    private final TreeSet<C5284jg> f55773b = new TreeSet<>(C4891by.f49024t);

    /* renamed from: c */
    private long f55774c;

    public v70(long j2) {
        this.f55772a = j2;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5970wf.b
    /* renamed from: a */
    public final void mo29190a(InterfaceC5970wf interfaceC5970wf, C5284jg c5284jg) {
        this.f55773b.add(c5284jg);
        this.f55774c += c5284jg.f51599c;
        while (this.f55774c + 0 > this.f55772a && !this.f55773b.isEmpty()) {
            interfaceC5970wf.mo22700a(this.f55773b.first());
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5970wf.b
    /* renamed from: a */
    public final void mo29188a(C5284jg c5284jg) {
        this.f55773b.remove(c5284jg);
        this.f55774c -= c5284jg.f51599c;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5970wf.b
    /* renamed from: a */
    public final void mo29191a(InterfaceC5970wf interfaceC5970wf, C5284jg c5284jg, C5284jg c5284jg2) {
        mo29188a(c5284jg);
        mo29190a(interfaceC5970wf, c5284jg2);
    }

    /* renamed from: a */
    public final void m29189a(InterfaceC5970wf interfaceC5970wf, long j2) {
        if (j2 != -1) {
            while (this.f55774c + j2 > this.f55772a && !this.f55773b.isEmpty()) {
                interfaceC5970wf.mo22700a(this.f55773b.first());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static int m29186a(C5284jg c5284jg, C5284jg c5284jg2) {
        long j2 = c5284jg.f51602f;
        long j3 = c5284jg2.f51602f;
        if (j2 - j3 != 0) {
            return j2 < j3 ? -1 : 1;
        }
        if (!c5284jg.f51597a.equals(c5284jg2.f51597a)) {
            return c5284jg.f51597a.compareTo(c5284jg2.f51597a);
        }
        long j4 = c5284jg.f51598b - c5284jg2.f51598b;
        if (j4 == 0) {
            return 0;
        }
        return j4 < 0 ? -1 : 1;
    }
}
