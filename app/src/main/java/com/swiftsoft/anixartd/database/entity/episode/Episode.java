package com.swiftsoft.anixartd.database.entity.episode;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.util.Identifiable;
import com.swiftsoft.anixartd.parser.Parser;
import com.swiftsoft.anixartd.utils.Common;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Episode.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m31883d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0013\u0010;\u001a\u00020\u000e2\b\u0010<\u001a\u0004\u0018\u00010=H\u0096\u0002J\b\u0010>\u001a\u00020!H\u0016J\u0006\u0010?\u001a\u00020\u000eR\u001a\u0010\u0005\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR\u001a\u0010 \u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010&\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0007\"\u0004\b.\u0010\tR \u0010/\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0007\"\u0004\b7\u0010\tR\u001a\u00108\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001a\"\u0004\b:\u0010\u001c¨\u0006@"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/episode/Episode;", "Lcom/swiftsoft/anixartd/database/util/Identifiable;", "", "Ljava/io/Serializable;", "()V", "addedDate", "getAddedDate", "()J", "setAddedDate", "(J)V", "id", "getId", "setId", "iframe", "", "getIframe", "()Z", "setIframe", "(Z)V", "isFiller", "setFiller", "isWatched", "setWatched", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "playbackPosition", "getPlaybackPosition", "setPlaybackPosition", "position", "", "getPosition", "()I", "setPosition", "(I)V", "release", "Lcom/swiftsoft/anixartd/database/entity/Release;", "getRelease", "()Lcom/swiftsoft/anixartd/database/entity/Release;", "setRelease", "(Lcom/swiftsoft/anixartd/database/entity/Release;)V", "releaseId", "getReleaseId", "setReleaseId", "source", "Lcom/swiftsoft/anixartd/database/entity/episode/Source;", "getSource", "()Lcom/swiftsoft/anixartd/database/entity/episode/Source;", "setSource", "(Lcom/swiftsoft/anixartd/database/entity/episode/Source;)V", "sourceId", "getSourceId", "setSourceId", "url", "getUrl", "setUrl", "equals", "other", "", "hashCode", "isDownloadAvailable", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
@Entity
/* loaded from: classes2.dex */
public final class Episode implements Identifiable<Long>, Serializable {
    private long addedDate;

    @PrimaryKey
    private long id;
    private boolean iframe;

    @JsonProperty("is_filler")
    private boolean isFiller;

    @JsonProperty("is_watched")
    private boolean isWatched;

    @Nullable
    private String name;
    private long playbackPosition;
    private int position;

    @Ignore
    @Nullable
    private Release release;
    private long releaseId;

    @Ignore
    @Nullable
    private Source source;
    private long sourceId;

    @NotNull
    private String url = "";

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m32174c(Episode.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.m32177f(other, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.episode.Episode");
        Episode episode = (Episode) other;
        return this.id == episode.id && Intrinsics.m32174c(this.release, episode.release) && Intrinsics.m32174c(this.source, episode.source) && this.releaseId == episode.releaseId && this.sourceId == episode.sourceId && Intrinsics.m32174c(this.name, episode.name) && Intrinsics.m32174c(this.url, episode.url) && this.isFiller == episode.isFiller && this.iframe == episode.iframe && this.position == episode.position && this.playbackPosition == episode.playbackPosition && this.isWatched == episode.isWatched;
    }

    public final long getAddedDate() {
        return this.addedDate;
    }

    public final long getId() {
        return this.id;
    }

    public final boolean getIframe() {
        return this.iframe;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final long getPlaybackPosition() {
        return this.playbackPosition;
    }

    public final int getPosition() {
        return this.position;
    }

    @Nullable
    public final Release getRelease() {
        return this.release;
    }

    public final long getReleaseId() {
        return this.releaseId;
    }

    @Nullable
    public final Source getSource() {
        return this.source;
    }

    public final long getSourceId() {
        return this.sourceId;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int i2;
        int i3;
        long j2 = this.id;
        int i4 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        Release release = this.release;
        if (release != null) {
            i2 = release.hashCode();
        } else {
            long j3 = this.releaseId;
            i2 = (int) (j3 ^ (j3 >>> 32));
        }
        int i5 = (i4 + i2) * 31;
        Source source = this.source;
        if (source != null) {
            i3 = source.hashCode();
        } else {
            long j4 = this.sourceId;
            i3 = (int) (j4 ^ (j4 >>> 32));
        }
        return ((i5 + i3) * 31) + this.position;
    }

    public final boolean isDownloadAvailable() {
        String m16296a = new Common().m16296a(this.url);
        if (!Parser.f25796e.m14182a(m16296a) && !Intrinsics.m32174c(m16296a, "video.sibnet.ru") && !Intrinsics.m32174c(m16296a, "sovetromantica.com")) {
            if (!Intrinsics.m32174c(m16296a, "my.mail.ru")) {
                if (!ArraysKt.m31963m(Parser.f25798g, m16296a) && !ArraysKt.m31963m(Parser.f25799h, m16296a)) {
                    ArraysKt.m31963m(Parser.f25800i, m16296a);
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: isFiller, reason: from getter */
    public final boolean getIsFiller() {
        return this.isFiller;
    }

    /* renamed from: isWatched, reason: from getter */
    public final boolean getIsWatched() {
        return this.isWatched;
    }

    public final void setAddedDate(long j2) {
        this.addedDate = j2;
    }

    public final void setFiller(boolean z) {
        this.isFiller = z;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setIframe(boolean z) {
        this.iframe = z;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPlaybackPosition(long j2) {
        this.playbackPosition = j2;
    }

    public final void setPosition(int i2) {
        this.position = i2;
    }

    public final void setRelease(@Nullable Release release) {
        this.release = release;
    }

    public final void setReleaseId(long j2) {
        this.releaseId = j2;
    }

    public final void setSource(@Nullable Source source) {
        this.source = source;
    }

    public final void setSourceId(long j2) {
        this.sourceId = j2;
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.url = str;
    }

    public final void setWatched(boolean z) {
        this.isWatched = z;
    }
}
