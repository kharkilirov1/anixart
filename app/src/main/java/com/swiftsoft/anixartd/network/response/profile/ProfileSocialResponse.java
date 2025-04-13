package com.swiftsoft.anixartd.network.response.profile;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.swiftsoft.anixartd.network.Response;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileSocialResponse.kt */
@Metadata(m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/response/profile/ProfileSocialResponse;", "Lcom/swiftsoft/anixartd/network/Response;", "()V", "discordPage", "", "getDiscordPage", "()Ljava/lang/String;", "setDiscordPage", "(Ljava/lang/String;)V", "instPage", "getInstPage", "setInstPage", "tgPage", "getTgPage", "setTgPage", "ttPage", "getTtPage", "setTtPage", "vkPage", "getVkPage", "setVkPage", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ProfileSocialResponse extends Response {

    @JsonProperty("vk_page")
    @NotNull
    private String vkPage = "";

    @JsonProperty("tg_page")
    @NotNull
    private String tgPage = "";

    @JsonProperty("inst_page")
    @NotNull
    private String instPage = "";

    @JsonProperty("tt_page")
    @NotNull
    private String ttPage = "";

    @JsonProperty("discord_page")
    @NotNull
    private String discordPage = "";

    @NotNull
    public final String getDiscordPage() {
        return this.discordPage;
    }

    @NotNull
    public final String getInstPage() {
        return this.instPage;
    }

    @NotNull
    public final String getTgPage() {
        return this.tgPage;
    }

    @NotNull
    public final String getTtPage() {
        return this.ttPage;
    }

    @NotNull
    public final String getVkPage() {
        return this.vkPage;
    }

    public final void setDiscordPage(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.discordPage = str;
    }

    public final void setInstPage(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.instPage = str;
    }

    public final void setTgPage(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.tgPage = str;
    }

    public final void setTtPage(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.ttPage = str;
    }

    public final void setVkPage(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.vkPage = str;
    }
}
