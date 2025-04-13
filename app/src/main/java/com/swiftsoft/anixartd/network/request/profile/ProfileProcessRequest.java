package com.swiftsoft.anixartd.network.request.profile;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProfileProcessRequest.kt */
@Metadata(m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/request/profile/ProfileProcessRequest;", "", "banReason", "", "banExpires", "", "isBanned", "", "(Ljava/lang/String;Ljava/lang/Long;Z)V", "getBanExpires", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBanReason", "()Ljava/lang/String;", "()Z", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ProfileProcessRequest {

    @Nullable
    private final Long banExpires;

    @Nullable
    private final String banReason;
    private final boolean isBanned;

    public ProfileProcessRequest(@Nullable String str, @Nullable Long l2, boolean z) {
        this.banReason = str;
        this.banExpires = l2;
        this.isBanned = z;
    }

    @Nullable
    public final Long getBanExpires() {
        return this.banExpires;
    }

    @Nullable
    public final String getBanReason() {
        return this.banReason;
    }

    @JsonProperty("is_banned")
    /* renamed from: isBanned, reason: from getter */
    public final boolean getIsBanned() {
        return this.isBanned;
    }
}
