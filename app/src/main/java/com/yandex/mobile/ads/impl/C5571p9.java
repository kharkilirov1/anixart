package com.yandex.mobile.ads.impl;

import androidx.room.util.C0576a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.p9 */
/* loaded from: classes3.dex */
public final class C5571p9 {

    /* renamed from: a */
    @Nullable
    private final String f53408a;

    /* renamed from: b */
    @Nullable
    private final String f53409b;

    /* renamed from: c */
    @Nullable
    private final String f53410c;

    public C5571p9(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f53408a = str;
        this.f53409b = str2;
        this.f53410c = str3;
    }

    @Nullable
    /* renamed from: a */
    public final String m27191a() {
        return this.f53408a;
    }

    @Nullable
    /* renamed from: b */
    public final String m27192b() {
        return this.f53409b;
    }

    @Nullable
    /* renamed from: c */
    public final String m27193c() {
        return this.f53410c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5571p9)) {
            return false;
        }
        C5571p9 c5571p9 = (C5571p9) obj;
        return Intrinsics.m32174c(this.f53408a, c5571p9.f53408a) && Intrinsics.m32174c(this.f53409b, c5571p9.f53409b) && Intrinsics.m32174c(this.f53410c, c5571p9.f53410c);
    }

    public final int hashCode() {
        String str = this.f53408a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f53409b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f53410c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder m26356a = l60.m26356a("AppMetricaIdentifiers(adGetUrl=");
        m26356a.append(this.f53408a);
        m26356a.append(", deviceId=");
        m26356a.append(this.f53409b);
        m26356a.append(", uuid=");
        return C0576a.m4118q(m26356a, this.f53410c, ')');
    }
}
