package com.swiftsoft.anixartd.database.entity.notification.collection;

import androidx.room.Entity;
import androidx.room.Ignore;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swiftsoft.anixartd.database.entity.CollectionComment;
import com.swiftsoft.anixartd.database.entity.notification.ProfileNotification;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProfileCollectionCommentNotification.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m31883d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u0012"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/notification/collection/ProfileCollectionCommentNotification;", "Lcom/swiftsoft/anixartd/database/entity/notification/ProfileNotification;", "()V", "comment", "Lcom/swiftsoft/anixartd/database/entity/CollectionComment;", "getComment", "()Lcom/swiftsoft/anixartd/database/entity/CollectionComment;", "setComment", "(Lcom/swiftsoft/anixartd/database/entity/CollectionComment;)V", "parentComment", "getParentComment", "setParentComment", "equals", "", "other", "", "hashCode", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
@Entity
/* loaded from: classes2.dex */
public final class ProfileCollectionCommentNotification extends ProfileNotification {

    @Ignore
    public CollectionComment comment;

    @Ignore
    public CollectionComment parentComment;

    @Override // com.swiftsoft.anixartd.database.entity.notification.ProfileNotification
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m32174c(ProfileCollectionCommentNotification.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.m32177f(other, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.notification.collection.ProfileCollectionCommentNotification");
        return getId() == ((ProfileCollectionCommentNotification) other).getId();
    }

    @NotNull
    public final CollectionComment getComment() {
        CollectionComment collectionComment = this.comment;
        if (collectionComment != null) {
            return collectionComment;
        }
        Intrinsics.m32189r("comment");
        throw null;
    }

    @NotNull
    public final CollectionComment getParentComment() {
        CollectionComment collectionComment = this.parentComment;
        if (collectionComment != null) {
            return collectionComment;
        }
        Intrinsics.m32189r("parentComment");
        throw null;
    }

    @Override // com.swiftsoft.anixartd.database.entity.notification.ProfileNotification
    public int hashCode() {
        long id2 = getId();
        return (int) (id2 ^ (id2 >>> 32));
    }

    public final void setComment(@NotNull CollectionComment collectionComment) {
        Intrinsics.m32179h(collectionComment, "<set-?>");
        this.comment = collectionComment;
    }

    public final void setParentComment(@NotNull CollectionComment collectionComment) {
        Intrinsics.m32179h(collectionComment, "<set-?>");
        this.parentComment = collectionComment;
    }
}
