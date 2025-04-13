package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.InstreamAd;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class p90<T> {

    /* renamed from: a */
    @NotNull
    private final q90 f53411a;

    public p90(@NotNull Context context, @NotNull InstreamAd instreamAd) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(instreamAd, "instreamAd");
        this.f53411a = new q90(context, instreamAd);
    }

    @NotNull
    /* renamed from: a */
    public final o90 m27194a(@NotNull j90 manualAdBreakFactory, @Nullable String str) {
        Intrinsics.m32179h(manualAdBreakFactory, "manualAdBreakFactory");
        ArrayList m27662a = this.f53411a.m27662a(str);
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = m27662a.iterator();
        while (it.hasNext()) {
            arrayDeque.add(manualAdBreakFactory.mo22370a((k90) it.next()));
        }
        return new o90(arrayDeque);
    }
}
