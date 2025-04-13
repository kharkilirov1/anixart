package com.yandex.mobile.ads.nativeads;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5445mi;

/* renamed from: com.yandex.mobile.ads.nativeads.f */
/* loaded from: classes3.dex */
public final class C6208f extends NativeAdAssets {

    /* renamed from: p */
    private C6215i0 f57691p;

    /* renamed from: a */
    public final void m30542a(@Nullable C5445mi c5445mi) {
        this.f57691p = c5445mi != null ? new C6215i0(c5445mi) : null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6208f.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C6215i0 c6215i0 = this.f57691p;
        C6215i0 c6215i02 = ((C6208f) obj).f57691p;
        return c6215i0 != null ? c6215i0.equals(c6215i02) : c6215i02 == null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        C6215i0 c6215i0 = this.f57691p;
        return hashCode + (c6215i0 != null ? c6215i0.hashCode() : 0);
    }
}
