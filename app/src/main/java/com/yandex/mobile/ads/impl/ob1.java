package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ob1 {

    /* renamed from: a */
    @NonNull
    private final List<hc1<il0>> f53238a;

    public ob1(@NonNull ArrayList arrayList) {
        this.f53238a = arrayList;
    }

    @NonNull
    /* renamed from: a */
    public final hc1<il0> m27065a() {
        return this.f53238a.get(0);
    }

    @NonNull
    /* renamed from: b */
    public final List<hc1<il0>> m27066b() {
        return this.f53238a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ob1.class != obj.getClass()) {
            return false;
        }
        return this.f53238a.equals(((ob1) obj).f53238a);
    }

    public final int hashCode() {
        return this.f53238a.hashCode();
    }
}
