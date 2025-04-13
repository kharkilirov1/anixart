package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class wg1 {

    /* renamed from: a */
    @NonNull
    private final List<String> f56124a;

    public wg1(@NonNull ArrayList arrayList) {
        this.f56124a = arrayList;
    }

    @NonNull
    /* renamed from: a */
    public final List<String> m29482a() {
        return this.f56124a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wg1.class != obj.getClass()) {
            return false;
        }
        return this.f56124a.equals(((wg1) obj).f56124a);
    }

    public final int hashCode() {
        return this.f56124a.hashCode();
    }
}
