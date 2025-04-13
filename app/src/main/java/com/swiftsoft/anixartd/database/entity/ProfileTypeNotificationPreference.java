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

/* compiled from: ProfileTypeNotificationPreference.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m31883d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/ProfileTypeNotificationPreference;", "Ljava/io/Serializable;", "()V", "type", "Lcom/swiftsoft/anixartd/database/entity/Type;", "getType", "()Lcom/swiftsoft/anixartd/database/entity/Type;", "setType", "(Lcom/swiftsoft/anixartd/database/entity/Type;)V", "equals", "", "other", "", "hashCode", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
@Entity
/* loaded from: classes2.dex */
public final class ProfileTypeNotificationPreference implements Serializable {

    @Ignore
    public Type type;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m32174c(ProfileTypeNotificationPreference.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.m32177f(other, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.ProfileTypeNotificationPreference");
        return Intrinsics.m32174c(getType(), ((ProfileTypeNotificationPreference) other).getType());
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
        return getType().hashCode();
    }

    public final void setType(@NotNull Type type) {
        Intrinsics.m32179h(type, "<set-?>");
        this.type = type;
    }
}
