package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.gl */
/* loaded from: classes3.dex */
public final class C5135gl {
    @NotNull
    /* renamed from: a */
    public static List m24919a(@NotNull C5083fl creative) {
        x70 m25558b;
        Intrinsics.m32179h(creative, "creative");
        C5238il m24613c = creative.m24613c();
        List<C5276ja<?>> m29683a = (m24613c == null || (m25558b = m24613c.m25558b()) == null) ? null : m25558b.m29683a();
        return m29683a == null ? EmptyList.f63144b : m29683a;
    }
}
