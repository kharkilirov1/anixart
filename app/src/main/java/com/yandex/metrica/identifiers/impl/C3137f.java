package com.yandex.metrica.identifiers.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.identifiers.impl.f */
/* loaded from: classes2.dex */
public final class C3137f {

    /* renamed from: a */
    @NotNull
    public final String f42493a;

    /* renamed from: b */
    @Nullable
    public final String f42494b;

    /* renamed from: c */
    @Nullable
    public final Boolean f42495c;

    public C3137f(@NotNull String str, @Nullable String str2, @Nullable Boolean bool) {
        this.f42493a = str;
        this.f42494b = str2;
        this.f42495c = bool;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3137f)) {
            return false;
        }
        C3137f c3137f = (C3137f) obj;
        return Intrinsics.m32174c(this.f42493a, c3137f.f42493a) && Intrinsics.m32174c(this.f42494b, c3137f.f42494b) && Intrinsics.m32174c(this.f42495c, c3137f.f42495c);
    }

    public int hashCode() {
        String str = this.f42493a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f42494b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f42495c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("AdsIdInfo(provider=");
        m24u.append(this.f42493a);
        m24u.append(", advId=");
        m24u.append(this.f42494b);
        m24u.append(", limitedAdTracking=");
        m24u.append(this.f42495c);
        m24u.append(")");
        return m24u.toString();
    }
}
