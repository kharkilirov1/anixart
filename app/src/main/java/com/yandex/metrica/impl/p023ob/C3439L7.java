package com.yandex.metrica.impl.p023ob;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.L7 */
/* loaded from: classes2.dex */
public final class C3439L7 {

    /* renamed from: a */
    @NotNull
    private final byte[] f43313a;

    /* renamed from: b */
    @NotNull
    private final C3414K7 f43314b;

    public C3439L7(@NotNull byte[] bArr, @NotNull C3414K7 c3414k7) {
        this.f43313a = bArr;
        this.f43314b = c3414k7;
    }

    @NotNull
    /* renamed from: a */
    public final byte[] m18479a() {
        return this.f43313a;
    }

    @NotNull
    /* renamed from: b */
    public final C3414K7 m18480b() {
        return this.f43314b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3439L7)) {
            return false;
        }
        C3439L7 c3439l7 = (C3439L7) obj;
        return Intrinsics.m32174c(this.f43313a, c3439l7.f43313a) && Intrinsics.m32174c(this.f43314b, c3439l7.f43314b);
    }

    public int hashCode() {
        byte[] bArr = this.f43313a;
        int hashCode = (bArr != null ? Arrays.hashCode(bArr) : 0) * 31;
        C3414K7 c3414k7 = this.f43314b;
        return hashCode + (c3414k7 != null ? c3414k7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("NativeCrashModel(data=");
        m24u.append(Arrays.toString(this.f43313a));
        m24u.append(", handlerDescription=");
        m24u.append(this.f43314b);
        m24u.append(")");
        return m24u.toString();
    }
}
