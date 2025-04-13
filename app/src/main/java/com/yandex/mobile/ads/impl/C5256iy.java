package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C5204hy;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.iy */
/* loaded from: classes3.dex */
public final class C5256iy {

    /* renamed from: a */
    @NotNull
    private final BufferedSource f51460a;

    /* renamed from: b */
    private long f51461b;

    public C5256iy(@NotNull BufferedSource source) {
        Intrinsics.m32179h(source, "source");
        this.f51460a = source;
        this.f51461b = 262144L;
    }

    @NotNull
    /* renamed from: a */
    public final C5204hy m25746a() {
        C5204hy.a aVar = new C5204hy.a();
        while (true) {
            String m25747b = m25747b();
            if (m25747b.length() == 0) {
                return aVar.m25386a();
            }
            aVar.m25387a(m25747b);
        }
    }

    @NotNull
    /* renamed from: b */
    public final String m25747b() {
        String mo34546h0 = this.f51460a.mo34546h0(this.f51461b);
        this.f51461b -= mo34546h0.length();
        return mo34546h0;
    }
}
