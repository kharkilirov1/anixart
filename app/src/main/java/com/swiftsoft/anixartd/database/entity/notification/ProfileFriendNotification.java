package com.swiftsoft.anixartd.database.entity.notification;

import androidx.room.Entity;
import androidx.room.Ignore;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swiftsoft.anixartd.database.entity.Profile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProfileFriendNotification.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/notification/ProfileFriendNotification;", "Lcom/swiftsoft/anixartd/database/entity/notification/ProfileNotification;", "()V", "byProfile", "Lcom/swiftsoft/anixartd/database/entity/Profile;", "getByProfile", "()Lcom/swiftsoft/anixartd/database/entity/Profile;", "setByProfile", "(Lcom/swiftsoft/anixartd/database/entity/Profile;)V", "status", "Lcom/swiftsoft/anixartd/database/entity/notification/ProfileFriendNotification$Status;", "getStatus", "()Lcom/swiftsoft/anixartd/database/entity/notification/ProfileFriendNotification$Status;", "setStatus", "(Lcom/swiftsoft/anixartd/database/entity/notification/ProfileFriendNotification$Status;)V", "Status", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
@Entity
/* loaded from: classes2.dex */
public final class ProfileFriendNotification extends ProfileNotification {

    @JsonProperty("by_profile")
    @Ignore
    @Nullable
    private Profile byProfile;

    @Ignore
    @Nullable
    private Status status;

    /* compiled from: ProfileFriendNotification.kt */
    @Metadata(m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/notification/ProfileFriendNotification$Status;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "or", "other", "REQUEST", "ACCEPT", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public enum Status {
        REQUEST(0),
        ACCEPT(1);

        private final int value;

        Status(int i2) {
            this.value = i2;
        }

        public final int getValue() {
            return this.value;
        }

        /* renamed from: or */
        public final int m14165or(@NotNull Status other) {
            Intrinsics.m32179h(other, "other");
            return other.value | this.value;
        }
    }

    @Nullable
    public final Profile getByProfile() {
        return this.byProfile;
    }

    @Nullable
    public final Status getStatus() {
        return this.status;
    }

    public final void setByProfile(@Nullable Profile profile) {
        this.byProfile = profile;
    }

    public final void setStatus(@Nullable Status status) {
        this.status = status;
    }
}
