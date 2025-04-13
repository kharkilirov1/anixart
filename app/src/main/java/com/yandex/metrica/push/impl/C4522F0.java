package com.yandex.metrica.push.impl;

import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.metrica.push.common.utils.DoNotInline;

@RequiresApi
@DoNotInline
/* renamed from: com.yandex.metrica.push.impl.F0 */
/* loaded from: classes2.dex */
public class C4522F0 {
    /* renamed from: a */
    public static boolean m21434a(@NonNull NotificationManager notificationManager, @Nullable String str) {
        NotificationChannelGroup notificationChannelGroup = notificationManager.getNotificationChannelGroup(C4520E0.m21427a(notificationManager, str));
        return notificationChannelGroup != null && notificationChannelGroup.isBlocked();
    }
}
