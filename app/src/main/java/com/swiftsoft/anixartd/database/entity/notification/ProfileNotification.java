package com.swiftsoft.anixartd.database.entity.notification;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.util.Identifiable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProfileNotification.kt */
@Entity
@Metadata(m31883d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0013\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u001e\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\t¨\u0006\u001f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/notification/ProfileNotification;", "Lcom/swiftsoft/anixartd/database/util/Identifiable;", "", "Ljava/io/Serializable;", "()V", "id", "getId", "()J", "setId", "(J)V", "isNew", "", "()Z", "setNew", "(Z)V", "isPushed", "setPushed", "profile", "Lcom/swiftsoft/anixartd/database/entity/Profile;", "getProfile", "()Lcom/swiftsoft/anixartd/database/entity/Profile;", "setProfile", "(Lcom/swiftsoft/anixartd/database/entity/Profile;)V", "timestamp", "getTimestamp", "setTimestamp", "equals", "other", "", "hashCode", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public class ProfileNotification implements Identifiable<Long>, Serializable {

    @PrimaryKey
    private long id;

    @JsonProperty("is_new")
    private boolean isNew;

    @JsonProperty("is_pushed")
    private boolean isPushed;

    @Ignore
    public Profile profile;
    private long timestamp;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m32174c(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.m32177f(other, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.notification.ProfileMyCollectionCommentNotification");
        return getId() == ((ProfileMyCollectionCommentNotification) other).getId();
    }

    public long getId() {
        return this.id;
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

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        long id2 = getId();
        return (int) (id2 ^ (id2 >>> 32));
    }

    /* renamed from: isNew, reason: from getter */
    public final boolean getIsNew() {
        return this.isNew;
    }

    /* renamed from: isPushed, reason: from getter */
    public final boolean getIsPushed() {
        return this.isPushed;
    }

    public void setId(long j2) {
        this.id = j2;
    }

    public final void setNew(boolean z) {
        this.isNew = z;
    }

    public final void setProfile(@NotNull Profile profile) {
        Intrinsics.m32179h(profile, "<set-?>");
        this.profile = profile;
    }

    public final void setPushed(boolean z) {
        this.isPushed = z;
    }

    public final void setTimestamp(long j2) {
        this.timestamp = j2;
    }
}
