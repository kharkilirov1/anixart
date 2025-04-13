package com.yandex.metrica.impl.p023ob;

import java.util.LinkedList;

/* renamed from: com.yandex.metrica.impl.ob.e5 */
/* loaded from: classes2.dex */
public class C3915e5 extends AbstractC3941f5<AbstractC4279s5> {

    /* renamed from: a */
    private final C3212C5 f45017a;

    /* renamed from: b */
    private final C3916e6 f45018b;

    /* renamed from: c */
    private final C4435y5 f45019c;

    public C3915e5(C3940f4 c3940f4) {
        this.f45017a = new C3212C5(c3940f4);
        this.f45018b = new C3916e6(c3940f4);
        this.f45019c = new C4435y5(c3940f4);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3941f5
    /* renamed from: a */
    public C3863c5 mo19647a(int i2) {
        LinkedList linkedList = new LinkedList();
        int ordinal = EnumC4067k1.m20216a(i2).ordinal();
        if (ordinal == 1) {
            linkedList.add(this.f45017a);
        } else if (ordinal == 3) {
            linkedList.add(this.f45019c);
        } else if (ordinal == 40) {
            linkedList.add(this.f45018b);
            linkedList.add(this.f45017a);
        }
        return new C3863c5(linkedList);
    }
}
