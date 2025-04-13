package com.yandex.metrica.impl.p023ob;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.ui */
/* loaded from: classes2.dex */
public final class C4344ui {

    /* renamed from: a */
    @NotNull
    private final String f46622a;

    /* renamed from: b */
    private final int f46623b;

    /* renamed from: c */
    private final int f46624c;

    /* renamed from: d */
    private final boolean f46625d;

    /* renamed from: e */
    private final boolean f46626e;

    public C4344ui(@NotNull String str, int i2, int i3, boolean z, boolean z2) {
        this.f46622a = str;
        this.f46623b = i2;
        this.f46624c = i3;
        this.f46625d = z;
        this.f46626e = z2;
    }

    /* renamed from: a */
    public final int m20892a() {
        return this.f46624c;
    }

    /* renamed from: b */
    public final int m20893b() {
        return this.f46623b;
    }

    @NotNull
    /* renamed from: c */
    public final String m20894c() {
        return this.f46622a;
    }

    /* renamed from: d */
    public final boolean m20895d() {
        return this.f46625d;
    }

    /* renamed from: e */
    public final boolean m20896e() {
        return this.f46626e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4344ui)) {
            return false;
        }
        C4344ui c4344ui = (C4344ui) obj;
        return Intrinsics.m32174c(this.f46622a, c4344ui.f46622a) && this.f46623b == c4344ui.f46623b && this.f46624c == c4344ui.f46624c && this.f46625d == c4344ui.f46625d && this.f46626e == c4344ui.f46626e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f46622a;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.f46623b) * 31) + this.f46624c) * 31;
        boolean z = this.f46625d;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        boolean z2 = this.f46626e;
        return i3 + (z2 ? 1 : z2 ? 1 : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("EgressConfig(url=");
        m24u.append(this.f46622a);
        m24u.append(", repeatedDelay=");
        m24u.append(this.f46623b);
        m24u.append(", randomDelayWindow=");
        m24u.append(this.f46624c);
        m24u.append(", isBackgroundAllowed=");
        m24u.append(this.f46625d);
        m24u.append(", isDiagnosticsEnabled=");
        m24u.append(this.f46626e);
        m24u.append(")");
        return m24u.toString();
    }
}
