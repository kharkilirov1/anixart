package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.hc */
/* loaded from: classes3.dex */
public final class C5174hc {

    /* renamed from: a */
    public final int f50897a = 0;

    /* renamed from: b */
    public final float f50898b = 0.0f;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5174hc.class != obj.getClass()) {
            return false;
        }
        C5174hc c5174hc = (C5174hc) obj;
        return this.f50897a == c5174hc.f50897a && Float.compare(c5174hc.f50898b, this.f50898b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f50898b) + ((this.f50897a + 527) * 31);
    }
}
