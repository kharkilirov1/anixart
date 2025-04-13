package com.swiftsoft.anixartd.network.response.release.video;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.ReleaseStreamingPlatform;
import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import com.swiftsoft.anixartd.database.entity.ReleaseVideoBlock;
import com.swiftsoft.anixartd.network.Response;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleaseVideosResponse.kt */
@Metadata(m31883d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u00020\u000b8GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00048GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00048GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\t¨\u0006\u001f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/response/release/video/ReleaseVideosResponse;", "Lcom/swiftsoft/anixartd/network/Response;", "()V", "blocks", "", "Lcom/swiftsoft/anixartd/database/entity/ReleaseVideoBlock;", "getBlocks", "()Ljava/util/List;", "setBlocks", "(Ljava/util/List;)V", "canAppeal", "", "getCanAppeal", "()Z", "setCanAppeal", "(Z)V", "lastVideos", "Lcom/swiftsoft/anixartd/database/entity/ReleaseVideo;", "getLastVideos", "setLastVideos", "release", "Lcom/swiftsoft/anixartd/database/entity/Release;", "getRelease", "()Lcom/swiftsoft/anixartd/database/entity/Release;", "setRelease", "(Lcom/swiftsoft/anixartd/database/entity/Release;)V", "streamingPlatforms", "Lcom/swiftsoft/anixartd/database/entity/ReleaseStreamingPlatform;", "getStreamingPlatforms", "setStreamingPlatforms", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ReleaseVideosResponse extends Response {
    public static final int INVALID_RELEASE_ID = 2;

    @NotNull
    private List<ReleaseVideoBlock> blocks;
    private boolean canAppeal;

    @NotNull
    private List<? extends ReleaseVideo> lastVideos;

    @Nullable
    private Release release;

    @NotNull
    private List<ReleaseStreamingPlatform> streamingPlatforms;

    public ReleaseVideosResponse() {
        EmptyList emptyList = EmptyList.f63144b;
        this.blocks = emptyList;
        this.streamingPlatforms = emptyList;
        this.lastVideos = emptyList;
    }

    @NotNull
    public final List<ReleaseVideoBlock> getBlocks() {
        return this.blocks;
    }

    @JsonProperty("can_appeal")
    public final boolean getCanAppeal() {
        return this.canAppeal;
    }

    @JsonProperty("last_videos")
    @NotNull
    public final List<ReleaseVideo> getLastVideos() {
        return this.lastVideos;
    }

    @Nullable
    public final Release getRelease() {
        return this.release;
    }

    @JsonProperty("streaming_platforms")
    @NotNull
    public final List<ReleaseStreamingPlatform> getStreamingPlatforms() {
        return this.streamingPlatforms;
    }

    public final void setBlocks(@NotNull List<ReleaseVideoBlock> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.blocks = list;
    }

    public final void setCanAppeal(boolean z) {
        this.canAppeal = z;
    }

    public final void setLastVideos(@NotNull List<? extends ReleaseVideo> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.lastVideos = list;
    }

    public final void setRelease(@Nullable Release release) {
        this.release = release;
    }

    public final void setStreamingPlatforms(@NotNull List<ReleaseStreamingPlatform> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.streamingPlatforms = list;
    }
}
