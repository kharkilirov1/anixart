package com.yandex.metrica.impl.p023ob;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.K7 */
/* loaded from: classes2.dex */
public final class C3414K7 {

    /* renamed from: a */
    @NotNull
    private final EnumC3514O7 f43267a;

    /* renamed from: b */
    @Nullable
    private final String f43268b;

    /* JADX WARN: Multi-variable type inference failed */
    public C3414K7() {
        this(null, 0 == true ? 1 : 0, 3);
    }

    public C3414K7(@NotNull EnumC3514O7 enumC3514O7, @Nullable String str) {
        this.f43267a = enumC3514O7;
        this.f43268b = str;
    }

    @Nullable
    /* renamed from: a */
    public final String m18437a() {
        return this.f43268b;
    }

    @NotNull
    /* renamed from: b */
    public final EnumC3514O7 m18438b() {
        return this.f43267a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3414K7)) {
            return false;
        }
        C3414K7 c3414k7 = (C3414K7) obj;
        return Intrinsics.m32174c(this.f43267a, c3414k7.f43267a) && Intrinsics.m32174c(this.f43268b, c3414k7.f43268b);
    }

    public int hashCode() {
        EnumC3514O7 enumC3514O7 = this.f43267a;
        int hashCode = (enumC3514O7 != null ? enumC3514O7.hashCode() : 0) * 31;
        String str = this.f43268b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("NativeCrashHandlerDescription(source=");
        m24u.append(this.f43267a);
        m24u.append(", handlerVersion=");
        return C0000a.m20q(m24u, this.f43268b, ")");
    }

    public /* synthetic */ C3414K7(EnumC3514O7 enumC3514O7, String str, int i2) {
        this((i2 & 1) != 0 ? EnumC3514O7.UNKNOWN : null, null);
    }
}
