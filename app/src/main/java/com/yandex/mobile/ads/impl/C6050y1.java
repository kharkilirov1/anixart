package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.y1 */
/* loaded from: classes3.dex */
public final class C6050y1 {

    /* renamed from: a */
    @NotNull
    private final C5519o1 f56631a;

    /* renamed from: b */
    @NotNull
    private final rf1 f56632b;

    public C6050y1(@NotNull Context context, @NotNull C5519o1 adBreak) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adBreak, "adBreak");
        this.f56631a = adBreak;
        this.f56632b = new rf1(context);
    }

    /* renamed from: a */
    public final void m29841a() {
        this.f56632b.m27919a(this.f56631a, "breakEnd");
    }

    /* renamed from: b */
    public final void m29842b() {
        this.f56632b.m27919a(this.f56631a, "error");
    }

    /* renamed from: c */
    public final void m29843c() {
        this.f56632b.m27919a(this.f56631a, "breakStart");
    }
}
