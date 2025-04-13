package com.yandex.metrica.impl.p023ob;

/* renamed from: com.yandex.metrica.impl.ob.oc */
/* loaded from: classes2.dex */
public class C4182oc implements InterfaceC4156nc {

    /* renamed from: a */
    private final int f46067a;

    /* renamed from: b */
    private final int f46068b;

    /* renamed from: c */
    private int f46069c = 0;

    public C4182oc(int i2, int i3) {
        this.f46067a = i2;
        this.f46068b = i3;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4156nc
    /* renamed from: a */
    public int mo20454a() {
        return this.f46068b;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4156nc
    /* renamed from: b */
    public boolean mo20455b() {
        int i2 = this.f46069c;
        this.f46069c = i2 + 1;
        return i2 < this.f46067a;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4156nc
    /* renamed from: c */
    public void mo20456c() {
        this.f46069c = 0;
    }
}
