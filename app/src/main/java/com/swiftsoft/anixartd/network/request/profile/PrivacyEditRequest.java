package com.swiftsoft.anixartd.network.request.profile;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PrivacyEditRequest.kt */
@Metadata(m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/request/profile/PrivacyEditRequest;", "", "permission", "", "(I)V", "getPermission", "()I", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class PrivacyEditRequest {
    private final int permission;

    public PrivacyEditRequest() {
        this(0, 1, null);
    }

    public PrivacyEditRequest(int i2) {
        this.permission = i2;
    }

    public final int getPermission() {
        return this.permission;
    }

    public /* synthetic */ PrivacyEditRequest(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i2);
    }
}
