package com.yandex.metrica.impl.p023ob;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Ti */
/* loaded from: classes2.dex */
public final class C3649Ti {

    /* renamed from: a */
    private final int f44103a;

    public C3649Ti(int i2) {
        this.f44103a = i2;
    }

    /* renamed from: a */
    public final int m19166a() {
        return this.f44103a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof C3649Ti) && this.f44103a == ((C3649Ti) obj).f44103a;
        }
        return true;
    }

    public int hashCode() {
        return this.f44103a;
    }

    @NotNull
    public String toString() {
        return C0000a.m18o(C0000a.m24u("StartupUpdateConfig(intervalSeconds="), this.f44103a, ")");
    }
}
