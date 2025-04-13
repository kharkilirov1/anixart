package com.swiftsoft.anixartd.network.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: HistoryRequest.kt */
@Metadata(m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/request/HistoryRequest;", "Lcom/swiftsoft/anixartd/network/request/UserRequest;", "()V", "episodeId", "", "getEpisodeId", "()J", "setEpisodeId", "(J)V", "fill", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class HistoryRequest extends UserRequest {

    @JsonProperty("episode_id")
    private long episodeId;

    @NotNull
    public final HistoryRequest fill(long episodeId) {
        this.episodeId = episodeId;
        return this;
    }

    public final long getEpisodeId() {
        return this.episodeId;
    }

    public final void setEpisodeId(long j2) {
        this.episodeId = j2;
    }
}
