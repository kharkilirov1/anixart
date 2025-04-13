package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;

/* loaded from: classes2.dex */
public interface IReporter {
    @NonNull
    IPluginReporter getPluginExtension();

    void pauseSession();

    void reportECommerce(@NonNull ECommerceEvent eCommerceEvent);

    void reportError(@NonNull String str, @Nullable String str2);

    void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th);

    void reportError(@NonNull String str, @Nullable Throwable th);

    void reportEvent(@NonNull String str);

    void reportEvent(@NonNull String str, @Nullable String str2);

    void reportEvent(@NonNull String str, @Nullable Map<String, Object> map);

    void reportRevenue(@NonNull Revenue revenue);

    void reportUnhandledException(@NonNull Throwable th);

    void reportUserProfile(@NonNull UserProfile userProfile);

    void resumeSession();

    void sendEventsBuffer();

    void setStatisticsSending(boolean z);

    void setUserProfileID(@Nullable String str);
}
