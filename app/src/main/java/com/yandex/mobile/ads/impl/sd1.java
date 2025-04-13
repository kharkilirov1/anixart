package com.yandex.mobile.ads.impl;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sd1 {

    /* renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f54627c = {Reflection.m32195c(new MutablePropertyReference1Impl(sd1.class, "status", "getStatus()Lcom/yandex/mobile/ads/instream/status/VideoAdStatus;", 0))};

    /* renamed from: a */
    @NotNull
    private final Set<rd1> f54628a = SetsKt.m32075b(rd1.f54284a);

    /* renamed from: b */
    @NotNull
    private final C5741a f54629b = new C5741a(this);

    /* renamed from: com.yandex.mobile.ads.impl.sd1$a */
    public static final class C5741a extends ObservableProperty<rd1> {

        /* renamed from: a */
        public final /* synthetic */ sd1 f54630a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C5741a(com.yandex.mobile.ads.impl.sd1 r2) {
            /*
                r1 = this;
                com.yandex.mobile.ads.impl.rd1 r0 = com.yandex.mobile.ads.impl.rd1.f54284a
                r1.f54630a = r2
                r1.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.sd1.C5741a.<init>(com.yandex.mobile.ads.impl.sd1):void");
        }

        @Override // kotlin.properties.ObservableProperty
        public final void afterChange(@NotNull KProperty<?> property, rd1 rd1Var, rd1 rd1Var2) {
            Intrinsics.m32179h(property, "property");
            this.f54630a.f54628a.add(rd1Var2);
        }
    }

    /* renamed from: b */
    public final void m28210b(@NotNull rd1 rd1Var) {
        Intrinsics.m32179h(rd1Var, "<set-?>");
        this.f54629b.setValue(this, f54627c[0], rd1Var);
    }

    @NotNull
    /* renamed from: a */
    public final rd1 m28207a() {
        return this.f54629b.getValue(this, f54627c[0]);
    }

    /* renamed from: b */
    public final void m28209b() {
        this.f54628a.clear();
        m28210b(rd1.f54284a);
    }

    /* renamed from: a */
    public final boolean m28208a(@NotNull rd1 videoAdStatus) {
        Intrinsics.m32179h(videoAdStatus, "videoAdStatus");
        return this.f54628a.contains(videoAdStatus);
    }
}
