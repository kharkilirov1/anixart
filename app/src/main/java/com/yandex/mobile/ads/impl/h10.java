package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class h10 {

    /* renamed from: a */
    @NotNull
    private final C5571p9 f50791a;

    /* renamed from: b */
    @NotNull
    private final String f50792b;

    /* renamed from: c */
    @NotNull
    private final l10 f50793c;

    public h10(@NotNull C5571p9 appMetricaIdentifiers, @NotNull String mauid, @NotNull l10 identifiersType) {
        Intrinsics.m32179h(appMetricaIdentifiers, "appMetricaIdentifiers");
        Intrinsics.m32179h(mauid, "mauid");
        Intrinsics.m32179h(identifiersType, "identifiersType");
        this.f50791a = appMetricaIdentifiers;
        this.f50792b = mauid;
        this.f50793c = identifiersType;
    }

    @NotNull
    /* renamed from: a */
    public final C5571p9 m25019a() {
        return this.f50791a;
    }

    @NotNull
    /* renamed from: b */
    public final l10 m25020b() {
        return this.f50793c;
    }

    @NotNull
    /* renamed from: c */
    public final String m25021c() {
        return this.f50792b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h10)) {
            return false;
        }
        h10 h10Var = (h10) obj;
        return Intrinsics.m32174c(this.f50791a, h10Var.f50791a) && Intrinsics.m32174c(this.f50792b, h10Var.f50792b) && this.f50793c == h10Var.f50793c;
    }

    public final int hashCode() {
        return this.f50793c.hashCode() + o11.m26984a(this.f50792b, this.f50791a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder m26356a = l60.m26356a("Identifiers(appMetricaIdentifiers=");
        m26356a.append(this.f50791a);
        m26356a.append(", mauid=");
        m26356a.append(this.f50792b);
        m26356a.append(", identifiersType=");
        m26356a.append(this.f50793c);
        m26356a.append(')');
        return m26356a.toString();
    }
}
