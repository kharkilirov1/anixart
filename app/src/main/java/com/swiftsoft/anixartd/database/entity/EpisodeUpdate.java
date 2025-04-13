package com.swiftsoft.anixartd.database.entity;

import androidx.room.Entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EpisodeUpdate.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Metadata(m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR \u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/EpisodeUpdate;", "Ljava/io/Serializable;", "()V", "lastEpisodeSourceUpdateId", "", "getLastEpisodeSourceUpdateId", "()J", "setLastEpisodeSourceUpdateId", "(J)V", "lastEpisodeSourceUpdateName", "", "getLastEpisodeSourceUpdateName", "()Ljava/lang/String;", "setLastEpisodeSourceUpdateName", "(Ljava/lang/String;)V", "lastEpisodeTypeUpdateId", "getLastEpisodeTypeUpdateId", "setLastEpisodeTypeUpdateId", "lastEpisodeTypeUpdateName", "getLastEpisodeTypeUpdateName", "setLastEpisodeTypeUpdateName", "lastEpisodeUpdateDate", "getLastEpisodeUpdateDate", "setLastEpisodeUpdateDate", "lastEpisodeUpdateName", "getLastEpisodeUpdateName", "setLastEpisodeUpdateName", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class EpisodeUpdate implements Serializable {

    @JsonProperty("last_episode_source_update_id")
    private long lastEpisodeSourceUpdateId;

    @JsonProperty("last_episode_type_update_id")
    private long lastEpisodeTypeUpdateId;

    @JsonProperty("last_episode_update_date")
    private long lastEpisodeUpdateDate;

    @JsonProperty("last_episode_update_name")
    @Nullable
    private String lastEpisodeUpdateName = "";

    @JsonProperty("last_episode_source_update_name")
    @NotNull
    private String lastEpisodeSourceUpdateName = "";

    @JsonProperty("lastEpisodeTypeUpdateName")
    @NotNull
    private String lastEpisodeTypeUpdateName = "";

    public final long getLastEpisodeSourceUpdateId() {
        return this.lastEpisodeSourceUpdateId;
    }

    @NotNull
    public final String getLastEpisodeSourceUpdateName() {
        return this.lastEpisodeSourceUpdateName;
    }

    public final long getLastEpisodeTypeUpdateId() {
        return this.lastEpisodeTypeUpdateId;
    }

    @NotNull
    public final String getLastEpisodeTypeUpdateName() {
        return this.lastEpisodeTypeUpdateName;
    }

    public final long getLastEpisodeUpdateDate() {
        return this.lastEpisodeUpdateDate;
    }

    @Nullable
    public final String getLastEpisodeUpdateName() {
        return this.lastEpisodeUpdateName;
    }

    public final void setLastEpisodeSourceUpdateId(long j2) {
        this.lastEpisodeSourceUpdateId = j2;
    }

    public final void setLastEpisodeSourceUpdateName(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.lastEpisodeSourceUpdateName = str;
    }

    public final void setLastEpisodeTypeUpdateId(long j2) {
        this.lastEpisodeTypeUpdateId = j2;
    }

    public final void setLastEpisodeTypeUpdateName(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.lastEpisodeTypeUpdateName = str;
    }

    public final void setLastEpisodeUpdateDate(long j2) {
        this.lastEpisodeUpdateDate = j2;
    }

    public final void setLastEpisodeUpdateName(@Nullable String str) {
        this.lastEpisodeUpdateName = str;
    }
}
