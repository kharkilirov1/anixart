package com.swiftsoft.anixartd.network.response.preferences;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.swiftsoft.anixartd.database.entity.ProfileStatusNotificationPreference;
import com.swiftsoft.anixartd.database.entity.ProfileTypeNotificationPreference;
import com.swiftsoft.anixartd.network.Response;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: NotificationPreferenceResponse.kt */
@Metadata(m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007R\u001e\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0005\"\u0004\b\u000b\u0010\u0007R\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u001e\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0005\"\u0004\b\u000f\u0010\u0007R\u001e\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0005\"\u0004\b\u0011\u0010\u0007R\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0015X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001a¨\u0006\u001f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/response/preferences/NotificationPreferenceResponse;", "Lcom/swiftsoft/anixartd/network/Response;", "()V", "isCommentNotificationsEnabled", "", "()Z", "setCommentNotificationsEnabled", "(Z)V", "isEpisodeNotificationsEnabled", "setEpisodeNotificationsEnabled", "isFirstEpisodeNotificationEnabled", "setFirstEpisodeNotificationEnabled", "isMyCollectionCommentNotificationsEnabled", "setMyCollectionCommentNotificationsEnabled", "isRelatedReleaseNotificationsEnabled", "setRelatedReleaseNotificationsEnabled", "isReleaseTypeNotificationsEnabled", "setReleaseTypeNotificationsEnabled", "isReportProcessNotificationsEnabled", "setReportProcessNotificationsEnabled", "profileStatusNotificationPreferences", "", "Lcom/swiftsoft/anixartd/database/entity/ProfileStatusNotificationPreference;", "getProfileStatusNotificationPreferences", "()Ljava/util/Set;", "setProfileStatusNotificationPreferences", "(Ljava/util/Set;)V", "profileTypeNotificationPreferences", "Lcom/swiftsoft/anixartd/database/entity/ProfileTypeNotificationPreference;", "getProfileTypeNotificationPreferences", "setProfileTypeNotificationPreferences", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class NotificationPreferenceResponse extends Response {

    @JsonProperty("is_comment_notifications_enabled")
    private boolean isCommentNotificationsEnabled;

    @JsonProperty("is_episode_notifications_enabled")
    private boolean isEpisodeNotificationsEnabled;

    @JsonProperty("is_first_episode_notification_enabled")
    private boolean isFirstEpisodeNotificationEnabled;

    @JsonProperty("is_my_collection_comment_notifications_enabled")
    private boolean isMyCollectionCommentNotificationsEnabled;

    @JsonProperty("is_related_release_notifications_enabled")
    private boolean isRelatedReleaseNotificationsEnabled;

    @JsonProperty("is_release_type_notifications_enabled")
    private boolean isReleaseTypeNotificationsEnabled;

    @JsonProperty("is_report_process_notifications_enabled")
    private boolean isReportProcessNotificationsEnabled;
    public Set<ProfileStatusNotificationPreference> profileStatusNotificationPreferences;
    public Set<ProfileTypeNotificationPreference> profileTypeNotificationPreferences;

    @NotNull
    public final Set<ProfileStatusNotificationPreference> getProfileStatusNotificationPreferences() {
        Set<ProfileStatusNotificationPreference> set = this.profileStatusNotificationPreferences;
        if (set != null) {
            return set;
        }
        Intrinsics.m32189r("profileStatusNotificationPreferences");
        throw null;
    }

    @NotNull
    public final Set<ProfileTypeNotificationPreference> getProfileTypeNotificationPreferences() {
        Set<ProfileTypeNotificationPreference> set = this.profileTypeNotificationPreferences;
        if (set != null) {
            return set;
        }
        Intrinsics.m32189r("profileTypeNotificationPreferences");
        throw null;
    }

    /* renamed from: isCommentNotificationsEnabled, reason: from getter */
    public final boolean getIsCommentNotificationsEnabled() {
        return this.isCommentNotificationsEnabled;
    }

    /* renamed from: isEpisodeNotificationsEnabled, reason: from getter */
    public final boolean getIsEpisodeNotificationsEnabled() {
        return this.isEpisodeNotificationsEnabled;
    }

    /* renamed from: isFirstEpisodeNotificationEnabled, reason: from getter */
    public final boolean getIsFirstEpisodeNotificationEnabled() {
        return this.isFirstEpisodeNotificationEnabled;
    }

    /* renamed from: isMyCollectionCommentNotificationsEnabled, reason: from getter */
    public final boolean getIsMyCollectionCommentNotificationsEnabled() {
        return this.isMyCollectionCommentNotificationsEnabled;
    }

    /* renamed from: isRelatedReleaseNotificationsEnabled, reason: from getter */
    public final boolean getIsRelatedReleaseNotificationsEnabled() {
        return this.isRelatedReleaseNotificationsEnabled;
    }

    /* renamed from: isReleaseTypeNotificationsEnabled, reason: from getter */
    public final boolean getIsReleaseTypeNotificationsEnabled() {
        return this.isReleaseTypeNotificationsEnabled;
    }

    /* renamed from: isReportProcessNotificationsEnabled, reason: from getter */
    public final boolean getIsReportProcessNotificationsEnabled() {
        return this.isReportProcessNotificationsEnabled;
    }

    public final void setCommentNotificationsEnabled(boolean z) {
        this.isCommentNotificationsEnabled = z;
    }

    public final void setEpisodeNotificationsEnabled(boolean z) {
        this.isEpisodeNotificationsEnabled = z;
    }

    public final void setFirstEpisodeNotificationEnabled(boolean z) {
        this.isFirstEpisodeNotificationEnabled = z;
    }

    public final void setMyCollectionCommentNotificationsEnabled(boolean z) {
        this.isMyCollectionCommentNotificationsEnabled = z;
    }

    public final void setProfileStatusNotificationPreferences(@NotNull Set<ProfileStatusNotificationPreference> set) {
        Intrinsics.m32179h(set, "<set-?>");
        this.profileStatusNotificationPreferences = set;
    }

    public final void setProfileTypeNotificationPreferences(@NotNull Set<ProfileTypeNotificationPreference> set) {
        Intrinsics.m32179h(set, "<set-?>");
        this.profileTypeNotificationPreferences = set;
    }

    public final void setRelatedReleaseNotificationsEnabled(boolean z) {
        this.isRelatedReleaseNotificationsEnabled = z;
    }

    public final void setReleaseTypeNotificationsEnabled(boolean z) {
        this.isReleaseTypeNotificationsEnabled = z;
    }

    public final void setReportProcessNotificationsEnabled(boolean z) {
        this.isReportProcessNotificationsEnabled = z;
    }
}
