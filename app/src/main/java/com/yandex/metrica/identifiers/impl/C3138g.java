package com.yandex.metrica.identifiers.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.identifiers.impl.g */
/* loaded from: classes2.dex */
public final class C3138g {

    /* renamed from: a */
    @NotNull
    public final EnumC3143l f42496a;

    /* renamed from: b */
    @Nullable
    public final C3137f f42497b;

    /* renamed from: c */
    @Nullable
    public final String f42498c;

    public C3138g(@NotNull EnumC3143l status, @Nullable C3137f c3137f, @Nullable String str) {
        Intrinsics.m32179h(status, "status");
        this.f42496a = status;
        this.f42497b = c3137f;
        this.f42498c = str;
    }

    public /* synthetic */ C3138g(EnumC3143l enumC3143l, C3137f c3137f, String str, int i2) {
        this(enumC3143l, (i2 & 2) != 0 ? null : c3137f, (i2 & 4) != 0 ? null : str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3138g)) {
            return false;
        }
        C3138g c3138g = (C3138g) obj;
        return Intrinsics.m32174c(this.f42496a, c3138g.f42496a) && Intrinsics.m32174c(this.f42497b, c3138g.f42497b) && Intrinsics.m32174c(this.f42498c, c3138g.f42498c);
    }

    public int hashCode() {
        EnumC3143l enumC3143l = this.f42496a;
        int hashCode = (enumC3143l != null ? enumC3143l.hashCode() : 0) * 31;
        C3137f c3137f = this.f42497b;
        int hashCode2 = (hashCode + (c3137f != null ? c3137f.hashCode() : 0)) * 31;
        String str = this.f42498c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("AdsIdResult(status=");
        m24u.append(this.f42496a);
        m24u.append(", adsIdInfo=");
        m24u.append(this.f42497b);
        m24u.append(", errorExplanation=");
        return C0000a.m20q(m24u, this.f42498c, ")");
    }
}
