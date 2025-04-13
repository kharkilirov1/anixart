package androidx.browser.trusted;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
class NotificationApiHelperForO {
    @RequiresApi
    /* renamed from: a */
    public static boolean m1037a(NotificationManager notificationManager, String str) {
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
        return notificationChannel == null || notificationChannel.getImportance() != 0;
    }
}
