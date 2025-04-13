package com.yandex.mobile.ads.impl;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.hv */
/* loaded from: classes3.dex */
public final class C5201hv {

    /* renamed from: a */
    private final SparseBooleanArray f51139a;

    public /* synthetic */ C5201hv(SparseBooleanArray sparseBooleanArray, int i2) {
        this(sparseBooleanArray);
    }

    /* renamed from: a */
    public final boolean m25375a(int i2) {
        return this.f51139a.get(i2);
    }

    /* renamed from: b */
    public final int m25376b(int i2) {
        C5220ia.m25471a(i2, this.f51139a.size());
        return this.f51139a.keyAt(i2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5201hv)) {
            return false;
        }
        C5201hv c5201hv = (C5201hv) obj;
        if (s91.f54530a >= 24) {
            return this.f51139a.equals(c5201hv.f51139a);
        }
        if (this.f51139a.size() != c5201hv.f51139a.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.f51139a.size(); i2++) {
            if (m25376b(i2) != c5201hv.m25376b(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (s91.f54530a >= 24) {
            return this.f51139a.hashCode();
        }
        int size = this.f51139a.size();
        for (int i2 = 0; i2 < this.f51139a.size(); i2++) {
            size = (size * 31) + m25376b(i2);
        }
        return size;
    }

    /* renamed from: com.yandex.mobile.ads.impl.hv$a */
    public static final class a {

        /* renamed from: a */
        private final SparseBooleanArray f51140a = new SparseBooleanArray();

        /* renamed from: b */
        private boolean f51141b;

        /* renamed from: a */
        public final a m25377a(int i2) {
            C5220ia.m25476b(!this.f51141b);
            this.f51140a.append(i2, true);
            return this;
        }

        /* renamed from: a */
        public final C5201hv m25378a() {
            C5220ia.m25476b(!this.f51141b);
            this.f51141b = true;
            return new C5201hv(this.f51140a, 0);
        }
    }

    private C5201hv(SparseBooleanArray sparseBooleanArray) {
        this.f51139a = sparseBooleanArray;
    }

    /* renamed from: a */
    public final int m25374a() {
        return this.f51139a.size();
    }
}
