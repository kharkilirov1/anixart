package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class x70 {

    /* renamed from: a */
    @NotNull
    private final List<C5276ja<?>> f56388a;

    /* renamed from: com.yandex.mobile.ads.impl.x70$a */
    public static final class C6010a {

        /* renamed from: a */
        @NotNull
        private List<? extends C5276ja<?>> f56389a = EmptyList.f63144b;

        /* renamed from: a */
        public final void m29685a(@NotNull a80 link) {
            Intrinsics.m32179h(link, "link");
        }

        /* renamed from: a */
        public final void m29686a(@NotNull List<? extends C5276ja<?>> assets) {
            Intrinsics.m32179h(assets, "assets");
            this.f56389a = assets;
        }

        @NotNull
        /* renamed from: a */
        public final x70 m29684a() {
            return new x70(this.f56389a, 0);
        }
    }

    private x70(List list) {
        this.f56388a = list;
    }

    public /* synthetic */ x70(List list, int i2) {
        this(list);
    }

    @NotNull
    /* renamed from: a */
    public final List<C5276ja<?>> m29683a() {
        return this.f56388a;
    }
}
