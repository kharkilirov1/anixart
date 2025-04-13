package com.swiftsoft.anixartd.network.request.profile;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: StatusEditRequest.kt */
@Metadata(m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/request/profile/StatusEditRequest;", "", "status", "", "(Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class StatusEditRequest {

    @NotNull
    private final String status;

    public StatusEditRequest(@NotNull String status) {
        Intrinsics.m32179h(status, "status");
        this.status = status;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }
}
