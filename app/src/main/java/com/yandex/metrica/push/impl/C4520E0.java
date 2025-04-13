package com.yandex.metrica.push.impl;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.metrica.push.common.utils.CoreUtils;
import com.yandex.metrica.push.common.utils.DoNotInline;

@RequiresApi
@DoNotInline
/* renamed from: com.yandex.metrica.push.impl.E0 */
/* loaded from: classes2.dex */
public class C4520E0 {
    @Nullable
    /* renamed from: a */
    public static String m21427a(@NonNull NotificationManager notificationManager, @Nullable String str) {
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
        if (notificationChannel == null) {
            return null;
        }
        return notificationChannel.getGroup();
    }

    /* renamed from: b */
    public static int m21431b(@NonNull NotificationManager notificationManager, @Nullable String str) {
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
        if (notificationChannel != null) {
            return notificationChannel.getImportance();
        }
        return -1000;
    }

    /* renamed from: a */
    public static boolean m21430a(@NonNull Context context, @NonNull Notification notification) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        return notificationManager == null || notificationManager.getNotificationChannel(notification.getChannelId()) != null;
    }

    /* renamed from: b */
    public static void m21432b(@NonNull NotificationManager notificationManager, @Nullable NotificationChannel notificationChannel) {
        if (notificationChannel != null) {
            notificationManager.deleteNotificationChannel("yandex_metrica_push");
        }
    }

    /* renamed from: a */
    public static void m21429a(@NonNull C4596r c4596r, @NonNull Notification notification) {
        if (CoreUtils.isEmpty(c4596r.m21659d())) {
            return;
        }
        C4603u0.m21732a().mo21645b(c4596r.m21659d(), "Notification channel is missing", notification.getChannelId(), c4596r.m21660e(), c4596r.m21664i());
    }

    @NonNull
    /* renamed from: a */
    public static NotificationChannel m21426a(@NonNull NotificationManager notificationManager) {
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("yandex_metrica_push_v2");
        return notificationChannel == null ? new NotificationChannel("yandex_metrica_push_v2", "Default", 2) : notificationChannel;
    }

    /* renamed from: a */
    public static void m21428a(@NonNull NotificationManager notificationManager, @Nullable NotificationChannel notificationChannel) {
        if (notificationChannel != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }
}
