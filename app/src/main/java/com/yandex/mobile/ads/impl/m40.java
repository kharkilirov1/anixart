package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class m40 {

    /* renamed from: a */
    @Nullable
    private final List<C5276ja<?>> f52576a;

    /* JADX WARN: Multi-variable type inference failed */
    public m40(@Nullable List<? extends C5276ja<?>> list) {
        this.f52576a = list;
    }

    @Nullable
    /* renamed from: a */
    public final C5276ja<?> m26567a(@NotNull String assetName) {
        Intrinsics.m32179h(assetName, "assetName");
        List<C5276ja<?>> list = this.f52576a;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.m32174c(((C5276ja) next).m25824b(), assetName)) {
                obj = next;
                break;
            }
        }
        return (C5276ja) obj;
    }
}
