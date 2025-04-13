package com.yandex.div.core.player;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: DivVideoResolution.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/player/DivVideoResolution;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final /* data */ class DivVideoResolution {

    /* renamed from: a */
    public final int f31307a;

    /* renamed from: b */
    public final int f31308b;

    public DivVideoResolution(int i2, int i3) {
        this.f31307a = i2;
        this.f31308b = i3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivVideoResolution)) {
            return false;
        }
        DivVideoResolution divVideoResolution = (DivVideoResolution) obj;
        return this.f31307a == divVideoResolution.f31307a && this.f31308b == divVideoResolution.f31308b;
    }

    public int hashCode() {
        return (this.f31307a * 31) + this.f31308b;
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("DivVideoResolution(width=");
        m24u.append(this.f31307a);
        m24u.append(", height=");
        return C0000a.m17n(m24u, this.f31308b, ')');
    }
}
