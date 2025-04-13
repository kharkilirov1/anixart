package com.swiftsoft.anixartd.database.entity.episode;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swiftsoft.anixartd.database.util.Identifiable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Source.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m31883d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u001e\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/episode/Source;", "Lcom/swiftsoft/anixartd/database/util/Identifiable;", "", "Ljava/io/Serializable;", "()V", "episodesCount", "getEpisodesCount", "()J", "setEpisodesCount", "(J)V", "id", "getId", "setId", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "type", "Lcom/swiftsoft/anixartd/database/entity/episode/Type;", "getType", "()Lcom/swiftsoft/anixartd/database/entity/episode/Type;", "setType", "(Lcom/swiftsoft/anixartd/database/entity/episode/Type;)V", "equals", "", "other", "", "hashCode", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
@Entity
/* loaded from: classes2.dex */
public final class Source implements Identifiable<Long>, Serializable {

    @JsonProperty("episodes_count")
    private long episodesCount;

    @PrimaryKey
    private long id;

    @JsonProperty("name")
    @NotNull
    private String name = "";

    @Ignore
    public Type type;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m32174c(Source.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.m32177f(other, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.episode.Source");
        Source source = (Source) other;
        return this.id == source.id && Intrinsics.m32174c(this.name, source.name) && Intrinsics.m32174c(getType(), source.getType()) && this.episodesCount == source.episodesCount;
    }

    public final long getEpisodesCount() {
        return this.episodesCount;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Type getType() {
        Type type = this.type;
        if (type != null) {
            return type;
        }
        Intrinsics.m32189r("type");
        throw null;
    }

    public int hashCode() {
        long j2 = this.id;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final void setEpisodesCount(long j2) {
        this.episodesCount = j2;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.name = str;
    }

    public final void setType(@NotNull Type type) {
        Intrinsics.m32179h(type, "<set-?>");
        this.type = type;
    }
}
