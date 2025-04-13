package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class lg1 {

    /* renamed from: a */
    @NotNull
    private final kg1 f52399a;

    /* renamed from: b */
    @NotNull
    private final u70 f52400b;

    /* renamed from: c */
    @NotNull
    private final ha0 f52401c;

    /* renamed from: d */
    @NotNull
    private final Map<String, String> f52402d;

    public lg1(@NotNull kg1 view, @NotNull u70 layoutParams, @NotNull ha0 measured, @NotNull Map<String, String> additionalInfo) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(layoutParams, "layoutParams");
        Intrinsics.m32179h(measured, "measured");
        Intrinsics.m32179h(additionalInfo, "additionalInfo");
        this.f52399a = view;
        this.f52400b = layoutParams;
        this.f52401c = measured;
        this.f52402d = additionalInfo;
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, String> m26452a() {
        return this.f52402d;
    }

    @NotNull
    /* renamed from: b */
    public final u70 m26453b() {
        return this.f52400b;
    }

    @NotNull
    /* renamed from: c */
    public final ha0 m26454c() {
        return this.f52401c;
    }

    @NotNull
    /* renamed from: d */
    public final kg1 m26455d() {
        return this.f52399a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg1)) {
            return false;
        }
        lg1 lg1Var = (lg1) obj;
        return Intrinsics.m32174c(this.f52399a, lg1Var.f52399a) && Intrinsics.m32174c(this.f52400b, lg1Var.f52400b) && Intrinsics.m32174c(this.f52401c, lg1Var.f52401c) && Intrinsics.m32174c(this.f52402d, lg1Var.f52402d);
    }

    public final int hashCode() {
        return this.f52402d.hashCode() + ((this.f52401c.hashCode() + ((this.f52400b.hashCode() + (this.f52399a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder m26356a = l60.m26356a("ViewSizeInfo(view=");
        m26356a.append(this.f52399a);
        m26356a.append(", layoutParams=");
        m26356a.append(this.f52400b);
        m26356a.append(", measured=");
        m26356a.append(this.f52401c);
        m26356a.append(", additionalInfo=");
        m26356a.append(this.f52402d);
        m26356a.append(')');
        return m26356a.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ lg1(com.yandex.mobile.ads.impl.kg1 r2, com.yandex.mobile.ads.impl.u70 r3, com.yandex.mobile.ads.impl.ha0 r4) {
        /*
            r1 = this;
            java.util.Map r0 = kotlin.collections.MapsKt.m32059d()
            r1.<init>(r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.lg1.<init>(com.yandex.mobile.ads.impl.kg1, com.yandex.mobile.ads.impl.u70, com.yandex.mobile.ads.impl.ha0):void");
    }
}
