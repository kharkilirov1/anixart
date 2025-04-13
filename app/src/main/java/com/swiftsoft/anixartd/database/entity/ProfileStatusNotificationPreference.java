package com.swiftsoft.anixartd.database.entity;

import androidx.room.Entity;
import androidx.room.Ignore;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProfileStatusNotificationPreference.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/ProfileStatusNotificationPreference;", "Ljava/io/Serializable;", "()V", "status", "Lcom/swiftsoft/anixartd/database/entity/ProfileStatusNotificationPreference$Status;", "getStatus", "()Lcom/swiftsoft/anixartd/database/entity/ProfileStatusNotificationPreference$Status;", "setStatus", "(Lcom/swiftsoft/anixartd/database/entity/ProfileStatusNotificationPreference$Status;)V", "equals", "", "other", "", "hashCode", "", "Status", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
@Entity
/* loaded from: classes2.dex */
public final class ProfileStatusNotificationPreference implements Serializable {

    @Ignore
    public Status status;

    /* compiled from: ProfileStatusNotificationPreference.kt */
    @Metadata(m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/ProfileStatusNotificationPreference$Status;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "or", "other", "FAVORITE_STATUS", "STATUS_WATCHING", "STATUS_PLAN", "STATUS_COMPLETED", "STATUS_HOLD_ON", "STATUS_DROPPED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public enum Status {
        FAVORITE_STATUS(0),
        STATUS_WATCHING(1),
        STATUS_PLAN(2),
        STATUS_COMPLETED(3),
        STATUS_HOLD_ON(4),
        STATUS_DROPPED(5);

        private final int value;

        Status(int i2) {
            this.value = i2;
        }

        public final int getValue() {
            return this.value;
        }

        /* renamed from: or */
        public final int m14164or(@NotNull Status other) {
            Intrinsics.m32179h(other, "other");
            return other.value | this.value;
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m32174c(ProfileStatusNotificationPreference.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.m32177f(other, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.ProfileStatusNotificationPreference");
        return getStatus() == ((ProfileStatusNotificationPreference) other).getStatus();
    }

    @NotNull
    public final Status getStatus() {
        Status status = this.status;
        if (status != null) {
            return status;
        }
        Intrinsics.m32189r("status");
        throw null;
    }

    public int hashCode() {
        return getStatus().hashCode();
    }

    public final void setStatus(@NotNull Status status) {
        Intrinsics.m32179h(status, "<set-?>");
        this.status = status;
    }
}
