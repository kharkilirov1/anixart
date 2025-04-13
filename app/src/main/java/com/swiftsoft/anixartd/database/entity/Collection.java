package com.swiftsoft.anixartd.database.entity;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swiftsoft.anixartd.database.util.Identifiable;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Collection.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m31883d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0013\u0010<\u001a\u00020\u00142\b\u0010=\u001a\u0004\u0018\u00010>H\u0096\u0002J\b\u0010?\u001a\u00020 H\u0016R\u001e\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR\u001a\u0010(\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\u001e\u0010+\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010\u0018R\u001e\u0010-\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0016\"\u0004\b.\u0010\u0018R\u001e\u0010/\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0007\"\u0004\b1\u0010\tR \u00102\u001a\b\u0012\u0004\u0012\u00020403X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001c\"\u0004\b;\u0010\u001e¨\u0006@"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/Collection;", "Lcom/swiftsoft/anixartd/database/util/Identifiable;", "", "Ljava/io/Serializable;", "()V", "commentCount", "getCommentCount", "()J", "setCommentCount", "(J)V", "creationDate", "getCreationDate", "setCreationDate", "creator", "Lcom/swiftsoft/anixartd/database/entity/Profile;", "getCreator", "()Lcom/swiftsoft/anixartd/database/entity/Profile;", "setCreator", "(Lcom/swiftsoft/anixartd/database/entity/Profile;)V", "delete", "", "getDelete", "()Z", "setDelete", "(Z)V", "description", "", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "favoriteCount", "", "getFavoriteCount", "()I", "setFavoriteCount", "(I)V", "id", "getId", "setId", "image", "getImage", "setImage", "isFavorite", "setFavorite", "isPrivate", "setPrivate", "lastUpdateDate", "getLastUpdateDate", "setLastUpdateDate", "releases", "", "Lcom/swiftsoft/anixartd/database/entity/Release;", "getReleases", "()Ljava/util/List;", "setReleases", "(Ljava/util/List;)V", "title", "getTitle", "setTitle", "equals", "other", "", "hashCode", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
@Entity
/* loaded from: classes2.dex */
public final class Collection implements Identifiable<Long>, Serializable {

    @JsonProperty("comment_count")
    private long commentCount;

    @JsonProperty("creation_date")
    private long creationDate;

    @JsonProperty("creator")
    @Nullable
    private Profile creator;

    @Ignore
    private boolean delete;

    @JsonProperty("favorites_count")
    private int favoriteCount;

    @PrimaryKey
    private long id;

    @JsonProperty("is_favorite")
    private boolean isFavorite;

    @JsonProperty("is_private")
    private boolean isPrivate;

    @JsonProperty("last_update_date")
    private long lastUpdateDate;

    @NotNull
    private String title = "";

    @NotNull
    private String description = "";

    @NotNull
    private String image = "";

    @NotNull
    private List<Release> releases = EmptyList.f63144b;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m32174c(Collection.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.m32177f(other, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.Collection");
        Collection collection = (Collection) other;
        return this.id == collection.id && Intrinsics.m32174c(this.creator, collection.creator) && Intrinsics.m32174c(this.title, collection.title) && Intrinsics.m32174c(this.description, collection.description) && this.isPrivate == collection.isPrivate && this.creationDate == collection.creationDate && this.lastUpdateDate == collection.lastUpdateDate && this.favoriteCount == collection.favoriteCount && Intrinsics.m32174c(this.releases, collection.releases) && this.isFavorite == collection.isFavorite && this.delete == collection.delete;
    }

    public final long getCommentCount() {
        return this.commentCount;
    }

    public final long getCreationDate() {
        return this.creationDate;
    }

    @Nullable
    public final Profile getCreator() {
        return this.creator;
    }

    public final boolean getDelete() {
        return this.delete;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getFavoriteCount() {
        return this.favoriteCount;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final long getLastUpdateDate() {
        return this.lastUpdateDate;
    }

    @NotNull
    public final List<Release> getReleases() {
        return this.releases;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        long j2 = this.id;
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* renamed from: isFavorite, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    /* renamed from: isPrivate, reason: from getter */
    public final boolean getIsPrivate() {
        return this.isPrivate;
    }

    public final void setCommentCount(long j2) {
        this.commentCount = j2;
    }

    public final void setCreationDate(long j2) {
        this.creationDate = j2;
    }

    public final void setCreator(@Nullable Profile profile) {
        this.creator = profile;
    }

    public final void setDelete(boolean z) {
        this.delete = z;
    }

    public final void setDescription(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.description = str;
    }

    public final void setFavorite(boolean z) {
        this.isFavorite = z;
    }

    public final void setFavoriteCount(int i2) {
        this.favoriteCount = i2;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setImage(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.image = str;
    }

    public final void setLastUpdateDate(long j2) {
        this.lastUpdateDate = j2;
    }

    public final void setPrivate(boolean z) {
        this.isPrivate = z;
    }

    public final void setReleases(@NotNull List<Release> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.releases = list;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.title = str;
    }
}
