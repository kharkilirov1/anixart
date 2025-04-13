package com.swiftsoft.anixartd.database.entity.notification.related;

import androidx.room.Entity;
import androidx.room.Ignore;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.notification.ProfileNotification;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileRelatedReleaseNotification.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/notification/related/ProfileRelatedReleaseNotification;", "Lcom/swiftsoft/anixartd/database/entity/notification/ProfileNotification;", "()V", "release", "Lcom/swiftsoft/anixartd/database/entity/Release;", "getRelease", "()Lcom/swiftsoft/anixartd/database/entity/Release;", "setRelease", "(Lcom/swiftsoft/anixartd/database/entity/Release;)V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
@Entity
/* loaded from: classes2.dex */
public final class ProfileRelatedReleaseNotification extends ProfileNotification {

    @Ignore
    public Release release;

    @NotNull
    public final Release getRelease() {
        Release release = this.release;
        if (release != null) {
            return release;
        }
        Intrinsics.m32189r("release");
        throw null;
    }

    public final void setRelease(@NotNull Release release) {
        Intrinsics.m32179h(release, "<set-?>");
        this.release = release;
    }
}
