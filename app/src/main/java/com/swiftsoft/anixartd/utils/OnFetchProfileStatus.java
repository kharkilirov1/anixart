package com.swiftsoft.anixartd.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: EventBus.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/OnFetchProfileStatus;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class OnFetchProfileStatus {

    /* renamed from: a */
    public final long f30203a;

    /* renamed from: b */
    @NotNull
    public final String f30204b;

    public OnFetchProfileStatus(long j2, @NotNull String status) {
        Intrinsics.m32179h(status, "status");
        this.f30203a = j2;
        this.f30204b = status;
    }
}
