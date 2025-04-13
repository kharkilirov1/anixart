package com.swiftsoft.anixartd.parser.anilibria.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PlayList.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/parser/anilibria/entity/PlayList;", "", "serie", "", "hls", "Lcom/swiftsoft/anixartd/parser/anilibria/entity/Hls;", "(Ljava/lang/Integer;Lcom/swiftsoft/anixartd/parser/anilibria/entity/Hls;)V", "getHls", "()Lcom/swiftsoft/anixartd/parser/anilibria/entity/Hls;", "getSerie", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class PlayList {

    @NotNull
    private final Hls hls;

    @Nullable
    private final Integer serie;

    public PlayList(@JsonProperty("serie") @Nullable Integer num, @JsonProperty("hls") @NotNull Hls hls) {
        Intrinsics.m32179h(hls, "hls");
        this.serie = num;
        this.hls = hls;
    }

    @NotNull
    public final Hls getHls() {
        return this.hls;
    }

    @Nullable
    public final Integer getSerie() {
        return this.serie;
    }
}
