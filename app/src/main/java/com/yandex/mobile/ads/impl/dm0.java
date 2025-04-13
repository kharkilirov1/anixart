package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.bk0;
import com.yandex.mobile.ads.impl.eg0;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class dm0 {

    /* renamed from: a */
    @NotNull
    private final ac0 f49680a = new ac0();

    /* renamed from: b */
    @NotNull
    private final eg0 f49681b = new eg0();

    /* renamed from: com.yandex.mobile.ads.impl.dm0$a */
    public interface InterfaceC4979a {
    }

    /* renamed from: com.yandex.mobile.ads.impl.dm0$b */
    public static final class C4980b implements eg0.InterfaceC5025a {

        /* renamed from: a */
        @NotNull
        private final InterfaceC4979a f49682a;

        /* renamed from: b */
        @NotNull
        private final AtomicInteger f49683b;

        public C4980b(@NotNull InterfaceC4979a listener, int i2) {
            Intrinsics.m32179h(listener, "listener");
            this.f49682a = listener;
            this.f49683b = new AtomicInteger(i2);
        }

        @Override // com.yandex.mobile.ads.impl.eg0.InterfaceC5025a
        /* renamed from: a */
        public final void mo23908a() {
            if (this.f49683b.decrementAndGet() == 0) {
                ((bk0.C4874b) this.f49682a).m22858d();
            }
        }
    }

    /* renamed from: a */
    public final void m23907a(@NotNull Context context, @NotNull kh0 nativeAdBlock, @NotNull InterfaceC4979a listener) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(nativeAdBlock, "nativeAdBlock");
        Intrinsics.m32179h(listener, "listener");
        Set<ka0> m22457a = this.f49680a.m22457a(nativeAdBlock);
        cz0 m29824a = xz0.m29823b().m29824a(context);
        int m23606o = m29824a != null ? m29824a.m23606o() : 0;
        if (!C5427m6.m26578a(context) || m23606o == 0 || m22457a.isEmpty()) {
            ((bk0.C4874b) listener).m22858d();
            return;
        }
        C4980b c4980b = new C4980b(listener, m22457a.size());
        Iterator<ka0> it = m22457a.iterator();
        while (it.hasNext()) {
            this.f49681b.m24146a(context, it.next(), c4980b);
        }
    }
}
