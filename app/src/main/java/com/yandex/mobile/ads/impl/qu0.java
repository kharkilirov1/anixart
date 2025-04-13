package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.hc0;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class qu0 extends vw0 {

    /* renamed from: a */
    @Nullable
    private final String f54136a;

    /* renamed from: b */
    private final long f54137b;

    /* renamed from: c */
    @NotNull
    private final BufferedSource f54138c;

    public qu0(@Nullable String str, long j2, @NotNull BufferedSource source) {
        Intrinsics.m32179h(source, "source");
        this.f54136a = str;
        this.f54137b = j2;
        this.f54138c = source;
    }

    @Override // com.yandex.mobile.ads.impl.vw0
    /* renamed from: b */
    public final long mo27787b() {
        return this.f54137b;
    }

    @Override // com.yandex.mobile.ads.impl.vw0
    @Nullable
    /* renamed from: c */
    public final hc0 mo27788c() {
        String str = this.f54136a;
        if (str == null) {
            return null;
        }
        int i2 = hc0.f50901d;
        return hc0.C5175a.m25115b(str);
    }

    @Override // com.yandex.mobile.ads.impl.vw0
    @NotNull
    /* renamed from: d */
    public final BufferedSource mo27789d() {
        return this.f54138c;
    }
}
