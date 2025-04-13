package com.yandex.mobile.ads.impl;

import android.util.SparseArray;

/* loaded from: classes3.dex */
final class k31<V> {

    /* renamed from: c */
    private final InterfaceC5499nk<V> f51832c;

    /* renamed from: b */
    private final SparseArray<V> f51831b = new SparseArray<>();

    /* renamed from: a */
    private int f51830a = -1;

    public k31(InterfaceC5499nk<V> interfaceC5499nk) {
        this.f51832c = interfaceC5499nk;
    }

    /* renamed from: a */
    public final void m26019a(int i2, V v) {
        if (this.f51830a == -1) {
            C5220ia.m25476b(this.f51831b.size() == 0);
            this.f51830a = 0;
        }
        if (this.f51831b.size() > 0) {
            SparseArray<V> sparseArray = this.f51831b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            C5220ia.m25473a(i2 >= keyAt);
            if (keyAt == i2) {
                InterfaceC5499nk<V> interfaceC5499nk = this.f51832c;
                SparseArray<V> sparseArray2 = this.f51831b;
                interfaceC5499nk.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f51831b.append(i2, v);
    }

    /* renamed from: b */
    public final V m26021b(int i2) {
        if (this.f51830a == -1) {
            this.f51830a = 0;
        }
        while (true) {
            int i3 = this.f51830a;
            if (i3 <= 0 || i2 >= this.f51831b.keyAt(i3)) {
                break;
            }
            this.f51830a--;
        }
        while (this.f51830a < this.f51831b.size() - 1 && i2 >= this.f51831b.keyAt(this.f51830a + 1)) {
            this.f51830a++;
        }
        return this.f51831b.valueAt(this.f51830a);
    }

    /* renamed from: c */
    public final boolean m26022c() {
        return this.f51831b.size() == 0;
    }

    /* renamed from: b */
    public final V m26020b() {
        return this.f51831b.valueAt(r0.size() - 1);
    }

    /* renamed from: a */
    public final void m26018a(int i2) {
        int i3 = 0;
        while (i3 < this.f51831b.size() - 1) {
            int i4 = i3 + 1;
            if (i2 < this.f51831b.keyAt(i4)) {
                return;
            }
            this.f51832c.accept(this.f51831b.valueAt(i3));
            this.f51831b.removeAt(i3);
            int i5 = this.f51830a;
            if (i5 > 0) {
                this.f51830a = i5 - 1;
            }
            i3 = i4;
        }
    }

    /* renamed from: a */
    public final void m26017a() {
        for (int i2 = 0; i2 < this.f51831b.size(); i2++) {
            this.f51832c.accept(this.f51831b.valueAt(i2));
        }
        this.f51830a = -1;
        this.f51831b.clear();
    }
}
