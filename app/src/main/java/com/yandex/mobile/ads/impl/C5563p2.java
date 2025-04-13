package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.Locale;

/* renamed from: com.yandex.mobile.ads.impl.p2 */
/* loaded from: classes3.dex */
public final class C5563p2 {

    /* renamed from: a */
    @NonNull
    private final String f53369a;

    /* renamed from: b */
    private final int f53370b;

    public C5563p2(int i2, @NonNull String str) {
        this.f53370b = i2;
        this.f53369a = str;
    }

    /* renamed from: a */
    public final int m27144a() {
        return this.f53370b;
    }

    @NonNull
    /* renamed from: b */
    public final String m27145b() {
        return this.f53369a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5563p2.class != obj.getClass()) {
            return false;
        }
        C5563p2 c5563p2 = (C5563p2) obj;
        if (this.f53370b != c5563p2.f53370b) {
            return false;
        }
        return this.f53369a.equals(c5563p2.f53369a);
    }

    public final int hashCode() {
        return (this.f53369a.hashCode() * 31) + this.f53370b;
    }

    @NonNull
    public final String toString() {
        return String.format(Locale.US, "AdFetchRequestError (code: %d, description: %s)", Integer.valueOf(this.f53370b), this.f53369a);
    }
}
