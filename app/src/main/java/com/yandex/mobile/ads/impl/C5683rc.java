package com.yandex.mobile.ads.impl;

import androidx.room.util.C0576a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.rc */
/* loaded from: classes3.dex */
public final class C5683rc {

    /* renamed from: a */
    @Nullable
    private final String f54261a;

    /* renamed from: b */
    @Nullable
    private final String f54262b;

    /* renamed from: c */
    @Nullable
    private final String f54263c;

    /* renamed from: d */
    @Nullable
    private final String f54264d;

    public C5683rc(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.f54261a = str;
        this.f54262b = str2;
        this.f54263c = str3;
        this.f54264d = str4;
    }

    @Nullable
    /* renamed from: a */
    public final String m27901a() {
        return this.f54264d;
    }

    @Nullable
    /* renamed from: b */
    public final String m27902b() {
        return this.f54263c;
    }

    @Nullable
    /* renamed from: c */
    public final String m27903c() {
        return this.f54262b;
    }

    @Nullable
    /* renamed from: d */
    public final String m27904d() {
        return this.f54261a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5683rc)) {
            return false;
        }
        C5683rc c5683rc = (C5683rc) obj;
        return Intrinsics.m32174c(this.f54261a, c5683rc.f54261a) && Intrinsics.m32174c(this.f54262b, c5683rc.f54262b) && Intrinsics.m32174c(this.f54263c, c5683rc.f54263c) && Intrinsics.m32174c(this.f54264d, c5683rc.f54264d);
    }

    public final int hashCode() {
        String str = this.f54261a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f54262b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f54263c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f54264d;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder m26356a = l60.m26356a("BackgroundColors(top=");
        m26356a.append(this.f54261a);
        m26356a.append(", right=");
        m26356a.append(this.f54262b);
        m26356a.append(", left=");
        m26356a.append(this.f54263c);
        m26356a.append(", bottom=");
        return C0576a.m4118q(m26356a, this.f54264d, ')');
    }
}
