package com.swiftsoft.anixartd.parser.anilibria.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Player.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/parser/anilibria/entity/Player;", "", "host", "", "playlist", "", "Lcom/swiftsoft/anixartd/parser/anilibria/entity/PlayList;", "(Ljava/lang/String;Ljava/util/List;)V", "getHost", "()Ljava/lang/String;", "getPlaylist", "()Ljava/util/List;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class Player {

    @NotNull
    private final String host;

    @NotNull
    private final List<PlayList> playlist;

    public Player(@JsonProperty("host") @NotNull String host, @JsonProperty("playlist") @NotNull List<PlayList> playlist) {
        Intrinsics.m32179h(host, "host");
        Intrinsics.m32179h(playlist, "playlist");
        this.host = host;
        this.playlist = playlist;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    @NotNull
    public final List<PlayList> getPlaylist() {
        return this.playlist;
    }

    public /* synthetic */ Player(String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? EmptyList.f63144b : list);
    }
}
