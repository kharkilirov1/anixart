package com.swiftsoft.anixartd.utils;

import com.swiftsoft.anixartd.database.entity.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: EventBus.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/OnFetchCollection;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class OnFetchCollection {

    /* renamed from: a */
    @NotNull
    public final Collection f30187a;

    public OnFetchCollection(@NotNull Collection collection) {
        Intrinsics.m32179h(collection, "collection");
        this.f30187a = collection;
    }
}
