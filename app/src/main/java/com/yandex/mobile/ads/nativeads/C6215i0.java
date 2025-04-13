package com.yandex.mobile.ads.nativeads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5445mi;
import com.yandex.mobile.ads.impl.C5782t5;

/* renamed from: com.yandex.mobile.ads.nativeads.i0 */
/* loaded from: classes3.dex */
public final class C6215i0 {

    /* renamed from: a */
    @Nullable
    private final String f57709a;

    /* renamed from: b */
    @NonNull
    private final int f57710b;

    public C6215i0(@NonNull C5445mi c5445mi) {
        this.f57709a = c5445mi.m26676a();
        this.f57710b = c5445mi.m26677b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6215i0.class != obj.getClass()) {
            return false;
        }
        C6215i0 c6215i0 = (C6215i0) obj;
        String str = this.f57709a;
        if (str == null ? c6215i0.f57709a == null : str.equals(c6215i0.f57709a)) {
            return this.f57710b == c6215i0.f57710b;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f57709a;
        return C5782t5.m28463a(this.f57710b) + ((str != null ? str.hashCode() : 0) * 31);
    }
}
