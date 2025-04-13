package com.yandex.metrica.push.common;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class RefreshTokenInfo {
    public final boolean force;

    @Nullable
    public final Long notificationStatusChangedTime;

    public RefreshTokenInfo(boolean z) {
        this(z, null);
    }

    @NonNull
    public static RefreshTokenInfo fromBundle(@Nullable Bundle bundle) {
        if (bundle == null) {
            return new RefreshTokenInfo(false);
        }
        return new RefreshTokenInfo(bundle.getBoolean("FORCE", false), bundle.containsKey("NOTIFICATION_STATUS_CHANGED_TIME_KEY") ? Long.valueOf(bundle.getLong("NOTIFICATION_STATUS_CHANGED_TIME_KEY")) : null);
    }

    @NonNull
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("FORCE", this.force);
        Long l2 = this.notificationStatusChangedTime;
        if (l2 != null) {
            bundle.putLong("NOTIFICATION_STATUS_CHANGED_TIME_KEY", l2.longValue());
        }
        return bundle;
    }

    public RefreshTokenInfo(boolean z, @Nullable Long l2) {
        this.force = z;
        this.notificationStatusChangedTime = l2;
    }
}
