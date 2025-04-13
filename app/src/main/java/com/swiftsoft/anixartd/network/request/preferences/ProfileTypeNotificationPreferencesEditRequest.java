package com.swiftsoft.anixartd.network.request.preferences;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileTypeNotificationPreferencesEditRequest.kt */
@Metadata(m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/request/preferences/ProfileTypeNotificationPreferencesEditRequest;", "", "profileTypeNotificationPreferences", "", "", "(Ljava/util/Set;)V", "getProfileTypeNotificationPreferences", "()Ljava/util/Set;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ProfileTypeNotificationPreferencesEditRequest {

    @NotNull
    private final Set<Long> profileTypeNotificationPreferences;

    public ProfileTypeNotificationPreferencesEditRequest(@NotNull Set<Long> profileTypeNotificationPreferences) {
        Intrinsics.m32179h(profileTypeNotificationPreferences, "profileTypeNotificationPreferences");
        this.profileTypeNotificationPreferences = profileTypeNotificationPreferences;
    }

    @NotNull
    public final Set<Long> getProfileTypeNotificationPreferences() {
        return this.profileTypeNotificationPreferences;
    }
}
