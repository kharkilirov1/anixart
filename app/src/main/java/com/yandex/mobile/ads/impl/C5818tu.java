package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.tu */
/* loaded from: classes3.dex */
public final class C5818tu {

    /* renamed from: a */
    @NonNull
    private final List<b30> f55197a;

    public C5818tu(@NonNull ArrayList arrayList) {
        this.f55197a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5818tu.class != obj.getClass()) {
            return false;
        }
        return this.f55197a.equals(((C5818tu) obj).f55197a);
    }

    public final int hashCode() {
        return this.f55197a.hashCode();
    }
}
