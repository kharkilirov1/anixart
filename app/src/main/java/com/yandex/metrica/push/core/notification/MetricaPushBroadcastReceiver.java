package com.yandex.metrica.push.core.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.yandex.metrica.push.common.utils.TrackersHub;
import com.yandex.metrica.push.impl.C4562a;
import com.yandex.metrica.push.impl.C4564b;
import com.yandex.metrica.push.impl.C4608x;
import java.util.Objects;

/* loaded from: classes2.dex */
public class MetricaPushBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        try {
            if ("com.yandex.metrica.push.action.NOTIFICATION_ACTION".equals(intent.getAction())) {
                Context applicationContext = context.getApplicationContext();
                Objects.requireNonNull(((C4564b) C4562a.m21488a(applicationContext).m21503i()).m21512d());
                ((C4608x) ((C4564b) C4562a.m21488a(applicationContext).m21503i()).m21513e()).m21740a(applicationContext, intent);
            }
        } catch (Throwable th) {
            TrackersHub.getInstance().reportError("Failed to handle notification action", th);
        }
    }
}
