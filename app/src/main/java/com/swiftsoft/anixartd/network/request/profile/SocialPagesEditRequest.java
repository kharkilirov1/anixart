package com.swiftsoft.anixartd.network.request.profile;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SocialPagesEditRequest.kt */
@Metadata(m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/request/profile/SocialPagesEditRequest;", "", "vkPage", "", "tgPage", "instPage", "ttPage", "discordPage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDiscordPage", "()Ljava/lang/String;", "getInstPage", "getTgPage", "getTtPage", "getVkPage", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class SocialPagesEditRequest {

    @NotNull
    private final String discordPage;

    @NotNull
    private final String instPage;

    @NotNull
    private final String tgPage;

    @NotNull
    private final String ttPage;

    @NotNull
    private final String vkPage;

    public SocialPagesEditRequest(@NotNull String vkPage, @NotNull String tgPage, @NotNull String instPage, @NotNull String ttPage, @NotNull String discordPage) {
        Intrinsics.m32179h(vkPage, "vkPage");
        Intrinsics.m32179h(tgPage, "tgPage");
        Intrinsics.m32179h(instPage, "instPage");
        Intrinsics.m32179h(ttPage, "ttPage");
        Intrinsics.m32179h(discordPage, "discordPage");
        this.vkPage = vkPage;
        this.tgPage = tgPage;
        this.instPage = instPage;
        this.ttPage = ttPage;
        this.discordPage = discordPage;
    }

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
}
