package com.swiftsoft.anixartd.network.request.preferences;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileReleaseTypeNotificationPreferencesEditRequest.kt */
@Metadata(m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/request/preferences/ProfileReleaseTypeNotificationPreferencesEditRequest;", "", "releaseId", "", "profileReleaseTypeNotificationPreferences", "", "(JLjava/util/Set;)V", "getProfileReleaseTypeNotificationPreferences", "()Ljava/util/Set;", "getReleaseId", "()J", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ProfileReleaseTypeNotificationPreferencesEditRequest {

    @NotNull
    private final Set<Long> profileReleaseTypeNotificationPreferences;
    private final long releaseId;

    public ProfileReleaseTypeNotificationPreferencesEditRequest(long j2, @NotNull Set<Long> profileReleaseTypeNotificationPreferences) {
        Intrinsics.m32179h(profileReleaseTypeNotificationPreferences, "profileReleaseTypeNotificationPreferences");
        this.releaseId = j2;
        this.profileReleaseTypeNotificationPreferences = profileReleaseTypeNotificationPreferences;
    }

    @JsonProperty("profile_release_type_notification_preferences")
    @NotNull
    public final Set<Long> getProfileReleaseTypeNotificationPreferences() {
        return this.profileReleaseTypeNotificationPreferences;
    }

    @JsonProperty("release_id")
    public final long getReleaseId() {
        return this.releaseId;
    }
}
