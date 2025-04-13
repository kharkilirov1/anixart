package com.swiftsoft.anixartd.database.entity;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.swiftsoft.anixartd.database.util.Identifiable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CollectionComment.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m31883d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001>B\u0005¢\u0006\u0002\u0010\u0004J\u0013\u0010:\u001a\u00020\u00112\b\u0010;\u001a\u0004\u0018\u00010<H\u0096\u0002J\b\u0010=\u001a\u000202H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010\u000fR\u001a\u0010.\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\r\"\u0004\b0\u0010\u000fR\u001e\u00101\u001a\u0002028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u00107\u001a\u0002028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00104\"\u0004\b9\u00106¨\u0006?"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/CollectionComment;", "Lcom/swiftsoft/anixartd/database/util/Identifiable;", "", "Ljava/io/Serializable;", "()V", "collection", "Lcom/swiftsoft/anixartd/database/entity/Collection;", "getCollection", "()Lcom/swiftsoft/anixartd/database/entity/Collection;", "setCollection", "(Lcom/swiftsoft/anixartd/database/entity/Collection;)V", "id", "getId", "()J", "setId", "(J)V", "isDeleted", "", "()Z", "setDeleted", "(Z)V", "isEdited", "setEdited", "isSpoiler", "setSpoiler", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "parentCommentId", "getParentCommentId", "()Ljava/lang/Long;", "setParentCommentId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "profile", "Lcom/swiftsoft/anixartd/database/entity/Profile;", "getProfile", "()Lcom/swiftsoft/anixartd/database/entity/Profile;", "setProfile", "(Lcom/swiftsoft/anixartd/database/entity/Profile;)V", "replyCount", "getReplyCount", "setReplyCount", "timestamp", "getTimestamp", "setTimestamp", "vote", "", "getVote", "()I", "setVote", "(I)V", "voteCount", "getVoteCount", "setVoteCount", "equals", "other", "", "hashCode", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
@Entity
/* loaded from: classes2.dex */
public final class CollectionComment implements Identifiable<Long>, Serializable {
    public static final int VOTE_MINUS = 1;
    public static final int VOTE_NONE = 0;
    public static final int VOTE_PLUS = 2;

    @Ignore
    public Collection collection;

    @PrimaryKey
    private long id;

    @JsonProperty("is_deleted")
    private boolean isDeleted;

    @JsonProperty("is_edited")
    private boolean isEdited;

    @JsonProperty("is_spoiler")
    private boolean isSpoiler;
    public String message;

    @JsonProperty("parent_comment_id")
    @Nullable
    private Long parentCommentId = 0L;

    @Ignore
    public Profile profile;

    @JsonProperty("reply_count")
    private long replyCount;
    private long timestamp;

    @JsonProperty("vote")
    private int vote;

    @JsonProperty("vote_count")
    private int voteCount;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m32174c(CollectionComment.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.m32177f(other, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.CollectionComment");
        CollectionComment collectionComment = (CollectionComment) other;
        return this.id == collectionComment.id && Intrinsics.m32174c(getMessage(), collectionComment.getMessage()) && this.voteCount == collectionComment.voteCount && this.vote == collectionComment.vote && this.isSpoiler == collectionComment.isSpoiler && this.isEdited == collectionComment.isEdited && this.replyCount == collectionComment.replyCount && Intrinsics.m32174c(getProfile(), collectionComment.getProfile());
    }

    @NotNull
    public final Collection getCollection() {
        Collection collection = this.collection;
        if (collection != null) {
            return collection;
        }
        Intrinsics.m32189r("collection");
        throw null;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getMessage() {
        String str = this.message;
        if (str != null) {
            return str;
        }
        Intrinsics.m32189r(ThrowableDeserializer.PROP_NAME_MESSAGE);
        throw null;
    }

    @Nullable
    public final Long getParentCommentId() {
        return this.parentCommentId;
    }

    @NotNull
    public final Profile getProfile() {
        Profile profile = this.profile;
        if (profile != null) {
            return profile;
        }
        Intrinsics.m32189r("profile");
        throw null;
    }

    public final long getReplyCount() {
        return this.replyCount;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getVote() {
        return this.vote;
    }

    public final int getVoteCount() {
        return this.voteCount;
    }

    public int hashCode() {
        long j2 = this.id;
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* renamed from: isDeleted, reason: from getter */
    public final boolean getIsDeleted() {
        return this.isDeleted;
    }

    /* renamed from: isEdited, reason: from getter */
    public final boolean getIsEdited() {
        return this.isEdited;
    }

    /* renamed from: isSpoiler, reason: from getter */
    public final boolean getIsSpoiler() {
        return this.isSpoiler;
    }

    public final void setCollection(@NotNull Collection collection) {
        Intrinsics.m32179h(collection, "<set-?>");
        this.collection = collection;
    }

    public final void setDeleted(boolean z) {
        this.isDeleted = z;
    }

    public final void setEdited(boolean z) {
        this.isEdited = z;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setMessage(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.message = str;
    }

    public final void setParentCommentId(@Nullable Long l2) {
        this.parentCommentId = l2;
    }

    public final void setProfile(@NotNull Profile profile) {
        Intrinsics.m32179h(profile, "<set-?>");
        this.profile = profile;
    }

    public final void setReplyCount(long j2) {
        this.replyCount = j2;
    }

    public final void setSpoiler(boolean z) {
        this.isSpoiler = z;
    }

    public final void setTimestamp(long j2) {
        this.timestamp = j2;
    }

    public final void setVote(int i2) {
        this.vote = i2;
    }

    public final void setVoteCount(int i2) {
        this.voteCount = i2;
    }
}
