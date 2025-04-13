package com.swiftsoft.anixartd.network.response.profile;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.swiftsoft.anixartd.network.Response;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ChangeLoginInfoResponse.kt */
@Metadata(m31883d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\u001e\u0010\u0017\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013¨\u0006\u001a"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/response/profile/ChangeLoginInfoResponse;", "Lcom/swiftsoft/anixartd/network/Response;", "()V", "avatar", "", "getAvatar", "()Ljava/lang/String;", "setAvatar", "(Ljava/lang/String;)V", "isChangeAvailable", "", "()Z", "setChangeAvailable", "(Z)V", "lastChangeAt", "", "getLastChangeAt", "()J", "setLastChangeAt", "(J)V", "login", "getLogin", "setLogin", "nextChangeAvailableAt", "getNextChangeAvailableAt", "setNextChangeAvailableAt", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ChangeLoginInfoResponse extends Response {

    @JsonProperty("is_change_available")
    private boolean isChangeAvailable;

    @JsonProperty("last_change_at")
    private long lastChangeAt;

    @JsonProperty("next_change_available_at")
    private long nextChangeAvailableAt;

    @NotNull
    private String login = "";

    @NotNull
    private String avatar = "";

    @NotNull
    public final String getAvatar() {
        return this.avatar;
    }

    public final long getLastChangeAt() {
        return this.lastChangeAt;
    }

    @NotNull
    public final String getLogin() {
        return this.login;
    }

    public final long getNextChangeAvailableAt() {
        return this.nextChangeAvailableAt;
    }

    /* renamed from: isChangeAvailable, reason: from getter */
    public final boolean getIsChangeAvailable() {
        return this.isChangeAvailable;
    }

    public final void setAvatar(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.avatar = str;
    }

    public final void setChangeAvailable(boolean z) {
        this.isChangeAvailable = z;
    }

    public final void setLastChangeAt(long j2) {
        this.lastChangeAt = j2;
    }

    public final void setLogin(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.login = str;
    }

    public final void setNextChangeAvailableAt(long j2) {
        this.nextChangeAvailableAt = j2;
    }
}
