package com.swiftsoft.anixartd.database.entity.notification.episode;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swiftsoft.anixartd.database.entity.episode.Episode;
import com.swiftsoft.anixartd.database.entity.notification.ProfileNotification;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProfileEpisodeNotification.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m31883d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0015"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/notification/episode/ProfileEpisodeNotification;", "Lcom/swiftsoft/anixartd/database/entity/notification/ProfileNotification;", "()V", "episode", "Lcom/swiftsoft/anixartd/database/entity/episode/Episode;", "getEpisode", "()Lcom/swiftsoft/anixartd/database/entity/episode/Episode;", "setEpisode", "(Lcom/swiftsoft/anixartd/database/entity/episode/Episode;)V", "id", "", "getId", "()J", "setId", "(J)V", "equals", "", "other", "", "hashCode", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
@Entity
/* loaded from: classes2.dex */
public final class ProfileEpisodeNotification extends ProfileNotification {

    @Ignore
    public Episode episode;

    @PrimaryKey
    private long id;

    @Override // com.swiftsoft.anixartd.database.entity.notification.ProfileNotification
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m32174c(ProfileEpisodeNotification.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.m32177f(other, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.notification.episode.ProfileEpisodeNotification");
        return getId() == ((ProfileEpisodeNotification) other).getId();
    }

    @NotNull
    public final Episode getEpisode() {
        Episode episode = this.episode;
        if (episode != null) {
            return episode;
        }
        Intrinsics.m32189r("episode");
        throw null;
    }

    @Override // com.swiftsoft.anixartd.database.entity.notification.ProfileNotification
    public long getId() {
        return this.id;
    }

    @Override // com.swiftsoft.anixartd.database.entity.notification.ProfileNotification
    public int hashCode() {
        long id2 = getId();
        return (int) (id2 ^ (id2 >>> 32));
    }

    public final void setEpisode(@NotNull Episode episode) {
        Intrinsics.m32179h(episode, "<set-?>");
        this.episode = episode;
    }

    @Override // com.swiftsoft.anixartd.database.entity.notification.ProfileNotification
    public void setId(long j2) {
        this.id = j2;
    }
}
