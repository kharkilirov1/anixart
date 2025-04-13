package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.video.parser.offset.VastTimeOffset;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class j71 {

    /* renamed from: a */
    @NonNull
    private final String f51527a;

    /* renamed from: b */
    @NonNull
    private final String f51528b;

    /* renamed from: c */
    @Nullable
    private final VastTimeOffset f51529c;

    public j71(@NonNull String str, @NonNull String str2, @Nullable VastTimeOffset vastTimeOffset) {
        this.f51527a = str;
        this.f51528b = str2;
        this.f51529c = vastTimeOffset;
    }

    @NonNull
    /* renamed from: a */
    public final String m25813a() {
        return this.f51527a;
    }

    @Nullable
    /* renamed from: b */
    public final VastTimeOffset m25814b() {
        return this.f51529c;
    }

    @NonNull
    /* renamed from: c */
    public final String m25815c() {
        return this.f51528b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j71.class != obj.getClass()) {
            return false;
        }
        j71 j71Var = (j71) obj;
        if (!this.f51527a.equals(j71Var.f51527a) || !this.f51528b.equals(j71Var.f51528b)) {
            return false;
        }
        VastTimeOffset vastTimeOffset = this.f51529c;
        VastTimeOffset vastTimeOffset2 = j71Var.f51529c;
        return vastTimeOffset == null ? vastTimeOffset2 == null : vastTimeOffset.equals(vastTimeOffset2);
    }

    public final int hashCode() {
        int m26984a = o11.m26984a(this.f51528b, this.f51527a.hashCode() * 31, 31);
        VastTimeOffset vastTimeOffset = this.f51529c;
        return m26984a + (vastTimeOffset != null ? vastTimeOffset.hashCode() : 0);
    }
}
