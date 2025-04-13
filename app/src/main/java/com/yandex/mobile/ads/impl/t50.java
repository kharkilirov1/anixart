package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class t50 {

    /* renamed from: a */
    @NotNull
    private final C5135gl f54950a;

    public t50(@NotNull C5135gl creativeAssetsProvider) {
        Intrinsics.m32179h(creativeAssetsProvider, "creativeAssetsProvider");
        this.f54950a = creativeAssetsProvider;
    }

    @NotNull
    /* renamed from: a */
    public final ee1 m28466a(@NotNull C5083fl creative, @Nullable String str) {
        Object obj;
        Intrinsics.m32179h(creative, "creative");
        Objects.requireNonNull(this.f54950a);
        Iterator it = C5135gl.m24919a(creative).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.m32174c(((C5276ja) obj).m25824b(), str)) {
                break;
            }
        }
        C5276ja c5276ja = (C5276ja) obj;
        a80 m25823a = c5276ja != null ? c5276ja.m25823a() : null;
        if (m25823a != null) {
            return new ee1(m25823a.m22404e(), CollectionsKt.m31995H(m25823a.m22403d()));
        }
        String m24612b = creative.m24612b();
        List<String> list = creative.mo22451a().get("clickTracking");
        return new ee1(m24612b, list != null ? CollectionsKt.m32042s(list) : EmptyList.f63144b);
    }
}
