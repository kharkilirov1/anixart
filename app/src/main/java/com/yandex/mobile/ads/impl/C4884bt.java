package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.bt */
/* loaded from: classes3.dex */
public final class C4884bt {

    /* renamed from: a */
    @Nullable
    private final RectF f48971a;

    /* renamed from: b */
    private final int f48972b;

    public C4884bt(int i2, @Nullable RectF rectF) {
        this.f48972b = i2;
        this.f48971a = rectF;
    }

    /* renamed from: a */
    public final int m22931a() {
        return this.f48972b;
    }

    @Nullable
    /* renamed from: b */
    public final RectF m22932b() {
        return this.f48971a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4884bt.class != obj.getClass()) {
            return false;
        }
        C4884bt c4884bt = (C4884bt) obj;
        if (this.f48972b != c4884bt.f48972b) {
            return false;
        }
        RectF rectF = this.f48971a;
        return rectF != null ? rectF.equals(c4884bt.f48971a) : c4884bt.f48971a == null;
    }

    public final int hashCode() {
        RectF rectF = this.f48971a;
        return ((rectF != null ? rectF.hashCode() : 0) * 31) + this.f48972b;
    }
}
