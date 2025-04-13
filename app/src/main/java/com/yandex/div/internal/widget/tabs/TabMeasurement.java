package com.yandex.div.internal.widget.tabs;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
class TabMeasurement {

    /* renamed from: a */
    public final int f34266a;

    /* renamed from: b */
    public int f34267b = -1;

    /* renamed from: c */
    public int f34268c = -1;

    /* renamed from: d */
    public int[] f34269d;

    /* renamed from: e */
    @NonNull
    public final TabMeasurementFunction f34270e;

    public interface TabMeasurementFunction {
        /* renamed from: a */
        int mo17511a(int i2);
    }

    public TabMeasurement(int i2, @NonNull TabMeasurementFunction tabMeasurementFunction) {
        this.f34266a = i2;
        this.f34270e = tabMeasurementFunction;
        this.f34269d = new int[i2];
    }

    /* renamed from: a */
    public int m17508a() {
        if (this.f34267b < 0) {
            this.f34267b = this.f34270e.mo17511a(0);
        }
        return this.f34267b;
    }

    /* renamed from: b */
    public int m17509b() {
        if (this.f34268c < 0) {
            int m17508a = m17508a();
            for (int i2 = 1; i2 < this.f34266a; i2++) {
                m17508a = Math.max(m17508a, this.f34270e.mo17511a(i2));
            }
            this.f34268c = m17508a;
        }
        return this.f34268c;
    }

    /* renamed from: c */
    public int m17510c(int i2) {
        int i3 = this.f34266a;
        if (i3 == 0) {
            return 0;
        }
        if (i2 < 0) {
            return m17510c(0);
        }
        if (i2 >= i3) {
            return m17510c(i3);
        }
        int[] iArr = this.f34269d;
        if (iArr[i2] <= 0) {
            iArr[i2] = this.f34270e.mo17511a(i2);
        }
        return this.f34269d[i2];
    }
}
