package com.yandex.mobile.ads.impl;

import androidx.room.util.C0576a;
import com.yandex.mobile.ads.common.AdError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class z01 implements AdError {

    /* renamed from: a */
    @NotNull
    private final String f57010a = "Fullscreen ad was already presented. Fullscreen can be presented just once.";

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z01) && Intrinsics.m32174c(this.f57010a, ((z01) obj).f57010a);
    }

    @Override // com.yandex.mobile.ads.common.AdError
    @NotNull
    public final String getDescription() {
        return this.f57010a;
    }

    public final int hashCode() {
        return this.f57010a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C0576a.m4118q(l60.m26356a("SimpleAdError(errorDescription="), this.f57010a, ')');
    }
}
