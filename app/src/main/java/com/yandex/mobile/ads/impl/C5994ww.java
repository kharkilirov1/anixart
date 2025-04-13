package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdRequest;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.mobile.ads.impl.ww */
/* loaded from: classes3.dex */
public final class C5994ww {

    /* renamed from: a */
    @Nullable
    private final String f56280a;

    /* renamed from: b */
    @NotNull
    private final AdRequest f56281b;

    /* renamed from: c */
    private final int f56282c;

    public C5994ww(@Nullable String str, @NotNull AdRequest adRequest, int i2) {
        Intrinsics.m32179h(adRequest, "adRequest");
        this.f56280a = str;
        this.f56281b = adRequest;
        this.f56282c = i2;
    }

    /* renamed from: a */
    public static C5994ww m29579a(C5994ww c5994ww, String str, AdRequest adRequest, int i2, int i3) {
        if ((i3 & 1) != 0) {
            str = c5994ww.f56280a;
        }
        if ((i3 & 2) != 0) {
            adRequest = c5994ww.f56281b;
        }
        if ((i3 & 4) != 0) {
            i2 = c5994ww.f56282c;
        }
        Objects.requireNonNull(c5994ww);
        Intrinsics.m32179h(adRequest, "adRequest");
        return new C5994ww(str, adRequest, i2);
    }

    @Nullable
    /* renamed from: b */
    public final String m29581b() {
        return this.f56280a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5994ww)) {
            return false;
        }
        C5994ww c5994ww = (C5994ww) obj;
        return Intrinsics.m32174c(this.f56280a, c5994ww.f56280a) && Intrinsics.m32174c(this.f56281b, c5994ww.f56281b) && this.f56282c == c5994ww.f56282c;
    }

    public final int hashCode() {
        String str = this.f56280a;
        return this.f56282c + ((this.f56281b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder m26356a = l60.m26356a("FullscreenAdItem(adUnitId=");
        m26356a.append(this.f56280a);
        m26356a.append(", adRequest=");
        m26356a.append(this.f56281b);
        m26356a.append(", screenOrientation=");
        return C0000a.m17n(m26356a, this.f56282c, ')');
    }

    @NotNull
    /* renamed from: a */
    public final AdRequest m29580a() {
        return this.f56281b;
    }
}
