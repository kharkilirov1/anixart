package com.yandex.metrica.push.impl;

import android.app.NotificationManager;
import android.service.notification.StatusBarNotification;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.metrica.push.common.utils.DoNotInline;

@RequiresApi
@DoNotInline
/* renamed from: com.yandex.metrica.push.impl.N0 */
/* loaded from: classes2.dex */
public class C4538N0 {
    /* renamed from: a */
    public static boolean m21462a(@NonNull NotificationManager notificationManager, @Nullable String str, int i2) {
        for (StatusBarNotification statusBarNotification : notificationManager.getActiveNotifications()) {
            if (statusBarNotification.getId() == i2 && ((str == null && statusBarNotification.getTag() == null) || str.equals(statusBarNotification.getTag()))) {
                return true;
            }
        }
        return false;
    }
}
