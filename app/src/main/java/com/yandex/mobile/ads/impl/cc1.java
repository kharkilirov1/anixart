package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class cc1 {

    /* renamed from: a */
    @NotNull
    private final List<C5091ft> f49206a;

    /* renamed from: b */
    @NotNull
    private final List<j71> f49207b;

    /* renamed from: com.yandex.mobile.ads.impl.cc1$a */
    public static final class C4915a {

        /* renamed from: a */
        @NotNull
        private List<C5091ft> f49208a;

        /* renamed from: b */
        @NotNull
        private List<j71> f49209b;

        public C4915a() {
            EmptyList emptyList = EmptyList.f63144b;
            this.f49208a = emptyList;
            this.f49209b = emptyList;
        }

        @NotNull
        /* renamed from: a */
        public final C4915a m23221a(@NotNull ArrayList extensions) {
            Intrinsics.m32179h(extensions, "extensions");
            this.f49208a = extensions;
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final C4915a m23223b(@NotNull ArrayList trackingEvents) {
            Intrinsics.m32179h(trackingEvents, "trackingEvents");
            this.f49209b = trackingEvents;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final cc1 m23222a() {
            return new cc1(this.f49208a, this.f49209b, 0);
        }
    }

    private cc1(List<C5091ft> list, List<j71> list2) {
        this.f49206a = list;
        this.f49207b = list2;
    }

    public /* synthetic */ cc1(List list, List list2, int i2) {
        this(list, list2);
    }

    @NotNull
    /* renamed from: a */
    public final List<C5091ft> m23219a() {
        return this.f49206a;
    }

    @NotNull
    /* renamed from: b */
    public final List<j71> m23220b() {
        return this.f49207b;
    }
}
