package com.google.android.exoplayer2.source;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Consumer;

/* loaded from: classes.dex */
final class SpannedData<V> {

    /* renamed from: a */
    public int f12585a;

    /* renamed from: b */
    public final SparseArray<V> f12586b;

    /* renamed from: c */
    public final Consumer<V> f12587c;

    public SpannedData() {
        C1123j c1123j = C1123j.f13402d;
        this.f12586b = new SparseArray<>();
        this.f12587c = c1123j;
        this.f12585a = -1;
    }

    /* renamed from: a */
    public void m6918a(int i2, V v) {
        if (this.f12585a == -1) {
            Assertions.m7516d(this.f12586b.size() == 0);
            this.f12585a = 0;
        }
        if (this.f12586b.size() > 0) {
            SparseArray<V> sparseArray = this.f12586b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            Assertions.m7513a(i2 >= keyAt);
            if (keyAt == i2) {
                Consumer<V> consumer = this.f12587c;
                SparseArray<V> sparseArray2 = this.f12586b;
                consumer.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f12586b.append(i2, v);
    }

    /* renamed from: b */
    public V m6919b(int i2) {
        if (this.f12585a == -1) {
            this.f12585a = 0;
        }
        while (true) {
            int i3 = this.f12585a;
            if (i3 <= 0 || i2 >= this.f12586b.keyAt(i3)) {
                break;
            }
            this.f12585a--;
        }
        while (this.f12585a < this.f12586b.size() - 1 && i2 >= this.f12586b.keyAt(this.f12585a + 1)) {
            this.f12585a++;
        }
        return this.f12586b.valueAt(this.f12585a);
    }

    /* renamed from: c */
    public V m6920c() {
        return this.f12586b.valueAt(r0.size() - 1);
    }

    public SpannedData(Consumer<V> consumer) {
        this.f12586b = new SparseArray<>();
        this.f12587c = consumer;
        this.f12585a = -1;
    }
}
