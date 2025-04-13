package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.base.AdResultReceiver;
import java.util.Objects;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.uw */
/* loaded from: classes3.dex */
public final class C5890uw {

    /* renamed from: a */
    @NotNull
    private final C5820tw f55693a;

    @JvmOverloads
    public C5890uw() {
        this(0);
    }

    @JvmOverloads
    public C5890uw(@NotNull C5820tw intentCreator) {
        Intrinsics.m32179h(intentCreator, "intentCreator");
        this.f55693a = intentCreator;
    }

    /* renamed from: a */
    public final void m29144a(@NotNull Context context, @NotNull C5518o0 adActivityData, @NotNull AdResultReceiver receiver) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adActivityData, "adActivityData");
        Intrinsics.m32179h(receiver, "receiver");
        long m24763a = g10.m24763a();
        Objects.requireNonNull(this.f55693a);
        Intent m28762a = C5820tw.m28762a(context, m24763a, receiver);
        C5561p0 m27132a = C5561p0.m27132a();
        Intrinsics.m32178g(m27132a, "getInstance()");
        m27132a.m27134a(m24763a, adActivityData);
        try {
            context.startActivity(m28762a);
        } catch (Exception e2) {
            m27132a.m27133a(m24763a);
            e60.m24034a("Failed to show Interstitial Ad. Exception: " + e2, new Object[0]);
        }
    }

    public /* synthetic */ C5890uw(int i2) {
        this(new C5820tw());
    }
}
