package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.j3 */
/* loaded from: classes3.dex */
public final class C5264j3 {

    /* renamed from: a */
    private final int f51481a;

    /* renamed from: b */
    private final int f51482b;

    public C5264j3(int i2, int i3) {
        this.f51481a = i2;
        this.f51482b = i3;
    }

    /* renamed from: a */
    public final int m25765a() {
        return this.f51481a;
    }

    /* renamed from: b */
    public final int m25766b() {
        return this.f51482b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5264j3.class != obj.getClass()) {
            return false;
        }
        C5264j3 c5264j3 = (C5264j3) obj;
        return this.f51481a == c5264j3.f51481a && this.f51482b == c5264j3.f51482b;
    }

    public final int hashCode() {
        return (this.f51481a * 31) + this.f51482b;
    }
}
