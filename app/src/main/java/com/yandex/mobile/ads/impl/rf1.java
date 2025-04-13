package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class rf1 {

    /* renamed from: a */
    @NotNull
    private final le1 f54304a;

    public rf1(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        this.f54304a = new le1(context);
    }

    /* renamed from: a */
    public final void m27919a(@NotNull qf1 trackable, @NotNull String eventName) {
        Intrinsics.m32179h(trackable, "trackable");
        Intrinsics.m32179h(eventName, "eventName");
        List<String> list = trackable.mo22451a().get(eventName);
        Objects.toString(list);
        Objects.requireNonNull(System.out);
        if (list != null) {
            this.f54304a.m26442a((List<String>) list, (Map<String, String>) null);
        }
    }

    /* renamed from: a */
    public final void m27920a(@NotNull qf1 trackable, @NotNull String eventName, @NotNull Map<String, String> macros) {
        Intrinsics.m32179h(trackable, "trackable");
        Intrinsics.m32179h(eventName, "eventName");
        Intrinsics.m32179h(macros, "macros");
        List<String> list = trackable.mo22451a().get(eventName);
        Objects.toString(list);
        Objects.requireNonNull(System.out);
        if (list != null) {
            this.f54304a.m26442a(list, macros);
        }
    }
}
