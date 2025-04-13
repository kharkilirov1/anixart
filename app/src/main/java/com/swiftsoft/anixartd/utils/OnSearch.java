package com.swiftsoft.anixartd.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: EventBus.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/OnSearch;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class OnSearch {

    /* renamed from: a */
    @NotNull
    public final String f30222a;

    public OnSearch() {
        this(null, 1);
    }

    public OnSearch(@NotNull String query) {
        Intrinsics.m32179h(query, "query");
        this.f30222a = query;
    }

    public /* synthetic */ OnSearch(String str, int i2) {
        this((i2 & 1) != 0 ? "" : null);
    }
}
