package com.swiftsoft.anixartd.network.response.collection;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.network.Response;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: CollectionResponse.kt */
@Metadata(m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0012\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\n8GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u00020\n8GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u00020\n8GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0015\u001a\u00020\n8GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001c\u0010\u0018\u001a\u00020\n8GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006\u001c"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/response/collection/CollectionResponse;", "Lcom/swiftsoft/anixartd/network/Response;", "()V", "collection", "Lcom/swiftsoft/anixartd/database/entity/Collection;", "getCollection", "()Lcom/swiftsoft/anixartd/database/entity/Collection;", "setCollection", "(Lcom/swiftsoft/anixartd/database/entity/Collection;)V", "completedCount", "", "getCompletedCount", "()J", "setCompletedCount", "(J)V", "droppedCount", "getDroppedCount", "setDroppedCount", "holdOnCount", "getHoldOnCount", "setHoldOnCount", "planCount", "getPlanCount", "setPlanCount", "watchingCount", "getWatchingCount", "setWatchingCount", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class CollectionResponse extends Response {
    public static final int INVALID_ID = 2;
    public static final int IS_DELETED = 4;
    public static final int IS_PRIVATE = 3;

    @Nullable
    private Collection collection;
    private long completedCount;
    private long droppedCount;
    private long holdOnCount;
    private long planCount;
    private long watchingCount;

    @Nullable
    public final Collection getCollection() {
        return this.collection;
    }

    @JsonProperty("completed_count")
    public final long getCompletedCount() {
        return this.completedCount;
    }

    @JsonProperty("dropped_count")
    public final long getDroppedCount() {
        return this.droppedCount;
    }

    @JsonProperty("hold_on_count")
    public final long getHoldOnCount() {
        return this.holdOnCount;
    }

    @JsonProperty("plan_count")
    public final long getPlanCount() {
        return this.planCount;
    }

    @JsonProperty("watching_count")
    public final long getWatchingCount() {
        return this.watchingCount;
    }

    public final void setCollection(@Nullable Collection collection) {
        this.collection = collection;
    }

    public final void setCompletedCount(long j2) {
        this.completedCount = j2;
    }

    public final void setDroppedCount(long j2) {
        this.droppedCount = j2;
    }

    public final void setHoldOnCount(long j2) {
        this.holdOnCount = j2;
    }

    public final void setPlanCount(long j2) {
        this.planCount = j2;
    }

    public final void setWatchingCount(long j2) {
        this.watchingCount = j2;
    }
}
