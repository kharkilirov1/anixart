package com.yandex.mobile.ads.impl;

import androidx.room.util.C0576a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class n21 {

    /* renamed from: a */
    @Nullable
    private final String f52836a;

    /* renamed from: b */
    @Nullable
    private final String f52837b;

    /* renamed from: c */
    @Nullable
    private final String f52838c;

    /* renamed from: d */
    @Nullable
    private final String f52839d;

    /* renamed from: e */
    @Nullable
    private final C5683rc f52840e;

    /* renamed from: f */
    @Nullable
    private final f21 f52841f;

    /* renamed from: g */
    @Nullable
    private final List<f21> f52842g;

    public n21() {
        this(0);
    }

    public /* synthetic */ n21(int i2) {
        this(null, null, null, null, null, null, null);
    }

    @Nullable
    /* renamed from: a */
    public final C5683rc m26791a() {
        return this.f52840e;
    }

    @Nullable
    /* renamed from: b */
    public final f21 m26792b() {
        return this.f52841f;
    }

    @Nullable
    /* renamed from: c */
    public final List<f21> m26793c() {
        return this.f52842g;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n21)) {
            return false;
        }
        n21 n21Var = (n21) obj;
        return Intrinsics.m32174c(this.f52836a, n21Var.f52836a) && Intrinsics.m32174c(this.f52837b, n21Var.f52837b) && Intrinsics.m32174c(this.f52838c, n21Var.f52838c) && Intrinsics.m32174c(this.f52839d, n21Var.f52839d) && Intrinsics.m32174c(this.f52840e, n21Var.f52840e) && Intrinsics.m32174c(this.f52841f, n21Var.f52841f) && Intrinsics.m32174c(this.f52842g, n21Var.f52842g);
    }

    public final int hashCode() {
        String str = this.f52836a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f52837b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f52838c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f52839d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C5683rc c5683rc = this.f52840e;
        int hashCode5 = (hashCode4 + (c5683rc == null ? 0 : c5683rc.hashCode())) * 31;
        f21 f21Var = this.f52841f;
        int hashCode6 = (hashCode5 + (f21Var == null ? 0 : f21Var.hashCode())) * 31;
        List<f21> list = this.f52842g;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder m26356a = l60.m26356a("SmartCenterSettings(colorWizButton=");
        m26356a.append(this.f52836a);
        m26356a.append(", colorWizButtonText=");
        m26356a.append(this.f52837b);
        m26356a.append(", colorWizBack=");
        m26356a.append(this.f52838c);
        m26356a.append(", colorWizBackRight=");
        m26356a.append(this.f52839d);
        m26356a.append(", backgroundColors=");
        m26356a.append(this.f52840e);
        m26356a.append(", smartCenter=");
        m26356a.append(this.f52841f);
        m26356a.append(", smartCenters=");
        return C0576a.m4119r(m26356a, this.f52842g, ')');
    }

    public n21(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable C5683rc c5683rc, @Nullable f21 f21Var, @Nullable List<f21> list) {
        this.f52836a = str;
        this.f52837b = str2;
        this.f52838c = str3;
        this.f52839d = str4;
        this.f52840e = c5683rc;
        this.f52841f = f21Var;
        this.f52842g = list;
    }
}
