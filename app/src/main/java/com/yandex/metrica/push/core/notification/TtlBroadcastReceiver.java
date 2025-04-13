package com.yandex.metrica.push.core.notification;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.yandex.metrica.push.common.CoreConstants;
import com.yandex.metrica.push.common.utils.CoreUtils;
import com.yandex.metrica.push.common.utils.PublicLogger;
import com.yandex.metrica.push.common.utils.TrackersHub;
import com.yandex.metrica.push.impl.C4562a;
import com.yandex.metrica.push.impl.C4603u0;

/* loaded from: classes2.dex */
public class TtlBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: a */
    private void m21387a(@NonNull Context context, @NonNull Bundle bundle) {
        String string = bundle.getString("com.yandex.metrica.push.extra.PUSH_ID");
        int i2 = bundle.getInt("com.yandex.metrica.push.extra.NOTIFICATION_ID");
        String string2 = bundle.getString("com.yandex.metrica.push.extra.NOTIFICATION_TAG");
        String string3 = bundle.getString("com.yandex.metrica.push.extra.PAYLOAD");
        String string4 = bundle.getString(CoreConstants.EXTRA_TRANSPORT);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            PublicLogger.m21385i("Canceling notification with id %d", Integer.valueOf(i2));
            notificationManager.cancel(string2, i2);
            if (!CoreUtils.isEmpty(string)) {
                C4603u0.m21732a().mo21640a(string, "by ttl", string3, string4);
            }
            C4562a.m21488a(context).m21501g().m21533a(string, false);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        Bundle extras;
        try {
            if (!"com.yandex.metrica.push.action.EXPIRED_BY_TTL_ACTION".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
                return;
            }
            m21387a(context, extras);
        } catch (Throwable th) {
            TrackersHub.getInstance().reportError("Failed to handle ttl", th);
        }
    }
}
