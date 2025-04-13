package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.kr */
/* loaded from: classes3.dex */
public final class C5353kr {

    /* renamed from: a */
    @NonNull
    private final String f52064a;

    /* renamed from: b */
    private final int f52065b;

    public C5353kr(int i2, @NonNull String str) {
        this.f52064a = str;
        this.f52065b = i2;
    }

    @NonNull
    /* renamed from: a */
    public final String m26177a() {
        return this.f52064a;
    }

    /* renamed from: b */
    public final int m26178b() {
        return this.f52065b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5353kr.class != obj.getClass()) {
            return false;
        }
        C5353kr c5353kr = (C5353kr) obj;
        if (this.f52065b != c5353kr.f52065b) {
            return false;
        }
        return this.f52064a.equals(c5353kr.f52064a);
    }

    public final int hashCode() {
        return (this.f52064a.hashCode() * 31) + this.f52065b;
    }
}
