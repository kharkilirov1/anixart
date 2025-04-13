package com.yandex.metrica.impl.p023ob;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.G0 */
/* loaded from: classes2.dex */
public final class C3307G0 {

    /* renamed from: a */
    private final long f42932a;

    public C3307G0(long j2) {
        this.f42932a = j2;
    }

    /* renamed from: a */
    public final long m18118a() {
        return this.f42932a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof C3307G0) && this.f42932a == ((C3307G0) obj).f42932a;
        }
        return true;
    }

    public int hashCode() {
        long j2 = this.f42932a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    @NotNull
    public String toString() {
        return C0000a.m19p(C0000a.m24u("EasyCollectingConfig(firstLaunchDelaySeconds="), this.f42932a, ")");
    }
}
