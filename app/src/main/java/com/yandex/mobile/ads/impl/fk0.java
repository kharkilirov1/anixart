package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bk0;
import com.yandex.mobile.ads.impl.gk0;
import com.yandex.mobile.ads.impl.qk0;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class fk0 implements bk0.InterfaceC4873a, qk0.InterfaceC5645b {

    /* renamed from: a */
    @NotNull
    private final gk0.InterfaceC5132a f50280a;

    /* renamed from: b */
    @NotNull
    private final w10 f50281b;

    /* renamed from: c */
    @NotNull
    private final AtomicInteger f50282c;

    public fk0(@NotNull gk0.InterfaceC5132a listener, @NotNull w10 imageProvider, int i2) {
        Intrinsics.m32179h(listener, "listener");
        Intrinsics.m32179h(imageProvider, "imageProvider");
        this.f50280a = listener;
        this.f50281b = imageProvider;
        this.f50282c = new AtomicInteger(i2);
    }

    @Override // com.yandex.mobile.ads.impl.qk0.InterfaceC5645b
    /* renamed from: a */
    public final void mo22855a() {
        if (this.f50282c.decrementAndGet() == 0) {
            this.f50280a.mo24910a(this.f50281b);
        }
    }

    @Override // com.yandex.mobile.ads.impl.bk0.InterfaceC4873a
    /* renamed from: b */
    public final void mo22854b() {
        if (this.f50282c.decrementAndGet() == 0) {
            this.f50280a.mo24910a(this.f50281b);
        }
    }
}
