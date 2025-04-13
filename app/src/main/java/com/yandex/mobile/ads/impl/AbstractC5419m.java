package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.m */
/* loaded from: classes3.dex */
public abstract class AbstractC5419m {

    /* renamed from: a */
    @NonNull
    private final String f52555a;

    public AbstractC5419m(@NonNull String str) {
        this.f52555a = str;
    }

    @NonNull
    /* renamed from: a */
    public final String m26547a() {
        return this.f52555a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f52555a.equals(((AbstractC5419m) obj).f52555a);
    }

    public int hashCode() {
        return this.f52555a.hashCode();
    }
}
