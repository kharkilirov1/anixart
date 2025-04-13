package com.swiftsoft.anixartd.database.entity.episode;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swiftsoft.anixartd.database.util.Identifiable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: LastWatchedEpisode.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m31883d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\u0005\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\t¨\u0006\u001f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/episode/LastWatchedEpisode;", "Lcom/swiftsoft/anixartd/database/util/Identifiable;", "", "Ljava/io/Serializable;", "()V", "episodeId", "getEpisodeId", "()J", "setEpisodeId", "(J)V", "id", "getId", "setId", "releaseId", "getReleaseId", "setReleaseId", "sourceId", "getSourceId", "setSourceId", "timestamp", "getTimestamp", "setTimestamp", "typeId", "getTypeId", "setTypeId", "equals", "", "other", "", "hashCode", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
@Entity
/* loaded from: classes2.dex */
public final class LastWatchedEpisode implements Identifiable<Long>, Serializable {
    private long episodeId;

    @PrimaryKey
    private long id;
    private long releaseId;
    private long sourceId;
    private long timestamp;
    private long typeId;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m32174c(LastWatchedEpisode.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.m32177f(other, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.episode.LastWatchedEpisode");
        LastWatchedEpisode lastWatchedEpisode = (LastWatchedEpisode) other;
        return this.id == lastWatchedEpisode.id && this.typeId == lastWatchedEpisode.typeId && this.sourceId == lastWatchedEpisode.sourceId && this.episodeId == lastWatchedEpisode.episodeId && this.timestamp == lastWatchedEpisode.timestamp;
    }

    public final long getEpisodeId() {
        return this.episodeId;
    }

    public final long getId() {
        return this.id;
    }

    public final long getReleaseId() {
        return this.releaseId;
    }

    public final long getSourceId() {
        return this.sourceId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final long getTypeId() {
        return this.typeId;
    }

    public int hashCode() {
        long j2 = this.id;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final void setEpisodeId(long j2) {
        this.episodeId = j2;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setReleaseId(long j2) {
        this.releaseId = j2;
    }

    public final void setSourceId(long j2) {
        this.sourceId = j2;
    }

    public final void setTimestamp(long j2) {
        this.timestamp = j2;
    }

    public final void setTypeId(long j2) {
        this.typeId = j2;
    }
}
