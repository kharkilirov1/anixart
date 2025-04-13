package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.i1 */
/* loaded from: classes3.dex */
public final class C5209i1 {

    /* renamed from: a */
    @NotNull
    private final C5469n1 f51184a;

    public C5209i1(@NotNull Context context, @NotNull C5469n1 adBlockerStatusValidityDurationProvider) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adBlockerStatusValidityDurationProvider, "adBlockerStatusValidityDurationProvider");
        this.f51184a = adBlockerStatusValidityDurationProvider;
    }

    /* renamed from: a */
    public final boolean m25424a(@NotNull C5158h1 adBlockerState) {
        Intrinsics.m32179h(adBlockerState, "adBlockerState");
        return adBlockerState.m25017a() + this.f51184a.m26787a() < i61.m25453a();
    }

    public /* synthetic */ C5209i1(Context context) {
        this(context, new C5469n1(context));
    }
}
