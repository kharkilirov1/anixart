package com.swiftsoft.anixartd.parser.anilibria.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Response.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m31883d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, m31884d2 = {"Lcom/swiftsoft/anixartd/parser/anilibria/entity/Response;", "", "player", "Lcom/swiftsoft/anixartd/parser/anilibria/entity/Player;", "(Lcom/swiftsoft/anixartd/parser/anilibria/entity/Player;)V", "getPlayer", "()Lcom/swiftsoft/anixartd/parser/anilibria/entity/Player;", "setPlayer", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Response {

    @NotNull
    private Player player;

    public Response(@JsonProperty("player") @NotNull Player player) {
        Intrinsics.m32179h(player, "player");
        this.player = player;
    }

    public static /* synthetic */ Response copy$default(Response response, Player player, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            player = response.player;
        }
        return response.copy(player);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @NotNull
    public final Response copy(@JsonProperty("player") @NotNull Player player) {
        Intrinsics.m32179h(player, "player");
        return new Response(player);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Response) && Intrinsics.m32174c(this.player, ((Response) other).player);
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    public int hashCode() {
        return this.player.hashCode();
    }

    public final void setPlayer(@NotNull Player player) {
        Intrinsics.m32179h(player, "<set-?>");
        this.player = player;
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("Response(player=");
        m24u.append(this.player);
        m24u.append(')');
        return m24u.toString();
    }
}
