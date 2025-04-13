package com.swiftsoft.anixartd.network.response.profile;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.swiftsoft.anixartd.network.Response;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfilePreferenceResponse.kt */
@Metadata(m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001e\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001e\u0010\u001b\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001e\u0010\u001d\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020 8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u001e\u0010(\u001a\u00020 8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\u001e\u0010+\u001a\u00020 8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$R\u001a\u0010.\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR\u001a\u00101\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR\u001a\u00104\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0006\"\u0004\b6\u0010\b¨\u00067"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/response/profile/ProfilePreferenceResponse;", "Lcom/swiftsoft/anixartd/network/Response;", "()V", "avatar", "", "getAvatar", "()Ljava/lang/String;", "setAvatar", "(Ljava/lang/String;)V", "banChangeAvatarExpires", "", "getBanChangeAvatarExpires", "()J", "setBanChangeAvatarExpires", "(J)V", "banChangeLoginExpires", "getBanChangeLoginExpires", "setBanChangeLoginExpires", "isChangeAvatarBanned", "", "()Z", "setChangeAvatarBanned", "(Z)V", "isChangeLoginBanned", "setChangeLoginBanned", "isGoogleBound", "setGoogleBound", "isLoginChanged", "setLoginChanged", "isVkBound", "setVkBound", "privacyCounts", "", "getPrivacyCounts", "()I", "setPrivacyCounts", "(I)V", "privacyFriendRequests", "getPrivacyFriendRequests", "setPrivacyFriendRequests", "privacySocial", "getPrivacySocial", "setPrivacySocial", "privacyStats", "getPrivacyStats", "setPrivacyStats", "status", "getStatus", "setStatus", "tgPage", "getTgPage", "setTgPage", "vkPage", "getVkPage", "setVkPage", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ProfilePreferenceResponse extends Response {

    @JsonProperty("ban_change_avatar_expires")
    private long banChangeAvatarExpires;

    @JsonProperty("ban_change_login_expires")
    private long banChangeLoginExpires;

    @JsonProperty("is_change_avatar_banned")
    private boolean isChangeAvatarBanned;

    @JsonProperty("is_change_login_banned")
    private boolean isChangeLoginBanned;

    @JsonProperty("is_google_bound")
    private boolean isGoogleBound;

    @JsonProperty("is_login_changed")
    private boolean isLoginChanged;

    @JsonProperty("is_vk_bound")
    private boolean isVkBound;

    @JsonProperty("privacy_counts")
    private int privacyCounts;

    @JsonProperty("privacy_friend_requests")
    private int privacyFriendRequests;

    @JsonProperty("privacy_social")
    private int privacySocial;

    @JsonProperty("privacy_stats")
    private int privacyStats;

    @NotNull
    private String avatar = "";

    @NotNull
    private String status = "";

    @NotNull
    private String vkPage = "";

    @NotNull
    private String tgPage = "";

    @NotNull
    public final String getAvatar() {
        return this.avatar;
    }

    public final long getBanChangeAvatarExpires() {
        return this.banChangeAvatarExpires;
    }

    public final long getBanChangeLoginExpires() {
        return this.banChangeLoginExpires;
    }

    public final int getPrivacyCounts() {
        return this.privacyCounts;
    }

    public final int getPrivacyFriendRequests() {
        return this.privacyFriendRequests;
    }

    public final int getPrivacySocial() {
        return this.privacySocial;
    }

    public final int getPrivacyStats() {
        return this.privacyStats;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTgPage() {
        return this.tgPage;
    }

    @NotNull
    public final String getVkPage() {
        return this.vkPage;
    }

    /* renamed from: isChangeAvatarBanned, reason: from getter */
    public final boolean getIsChangeAvatarBanned() {
        return this.isChangeAvatarBanned;
    }

    /* renamed from: isChangeLoginBanned, reason: from getter */
    public final boolean getIsChangeLoginBanned() {
        return this.isChangeLoginBanned;
    }

    /* renamed from: isGoogleBound, reason: from getter */
    public final boolean getIsGoogleBound() {
        return this.isGoogleBound;
    }

    /* renamed from: isLoginChanged, reason: from getter */
    public final boolean getIsLoginChanged() {
        return this.isLoginChanged;
    }

    /* renamed from: isVkBound, reason: from getter */
    public final boolean getIsVkBound() {
        return this.isVkBound;
    }

    public final void setAvatar(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.avatar = str;
    }

    public final void setBanChangeAvatarExpires(long j2) {
        this.banChangeAvatarExpires = j2;
    }

    public final void setBanChangeLoginExpires(long j2) {
        this.banChangeLoginExpires = j2;
    }

    public final void setChangeAvatarBanned(boolean z) {
        this.isChangeAvatarBanned = z;
    }

    public final void setChangeLoginBanned(boolean z) {
        this.isChangeLoginBanned = z;
    }

    public final void setGoogleBound(boolean z) {
        this.isGoogleBound = z;
    }

    public final void setLoginChanged(boolean z) {
        this.isLoginChanged = z;
    }

    public final void setPrivacyCounts(int i2) {
        this.privacyCounts = i2;
    }

    public final void setPrivacyFriendRequests(int i2) {
        this.privacyFriendRequests = i2;
    }

    public final void setPrivacySocial(int i2) {
        this.privacySocial = i2;
    }

    public final void setPrivacyStats(int i2) {
        this.privacyStats = i2;
    }

    public final void setStatus(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.status = str;
    }

    public final void setTgPage(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.tgPage = str;
    }

    public final void setVkBound(boolean z) {
        this.isVkBound = z;
    }

    public final void setVkPage(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.vkPage = str;
    }
}
