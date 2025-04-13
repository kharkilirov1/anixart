package com.yandex.metrica.push.firebase;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.yandex.metrica.push.common.CoreConstants;
import com.yandex.metrica.push.common.PushServiceFacade;
import com.yandex.metrica.push.common.utils.CoreUtils;
import com.yandex.metrica.push.common.utils.PublicLogger;
import com.yandex.metrica.push.common.utils.TrackersHub;

/* loaded from: classes2.dex */
public class MetricaMessagingService extends FirebaseMessagingService {
    public static boolean isNotificationRelatedToSDK(@NonNull RemoteMessage remoteMessage) {
        return CoreUtils.isNotificationRelatedToSDK(CoreUtils.fromMapToBundle(remoteMessage.m12679m()));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        processPush(this, remoteMessage);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(@NonNull String str) {
        super.onNewToken(str);
        processToken(this, str);
    }

    public void processPush(@NonNull Context context, @NonNull RemoteMessage remoteMessage) {
        try {
            processPush(context, CoreUtils.fromMapToBundle(remoteMessage.m12679m()));
        } catch (Throwable th) {
            TrackersHub.getInstance().reportError("Failed to process firebase push", th);
        }
    }

    public void processToken(@NonNull Context context, @NonNull String str) {
        try {
            TrackersHub.getInstance().reportEvent("FirebaseInstanceIdService refresh token");
            PushServiceFacade.refreshToken(context);
        } catch (Throwable th) {
            TrackersHub.getInstance().reportError("Failed to refresh firebase token", th);
        }
    }

    public void processPush(@NonNull Context context, @NonNull Bundle bundle) {
        try {
            PublicLogger.m21382d("Receive\nfullData: %s", bundle);
            TrackersHub.getInstance().reportEvent("FirebaseMessagingService receive push");
            PushServiceFacade.processPush(context, bundle, CoreConstants.Transport.FIREBASE);
        } catch (Throwable th) {
            TrackersHub.getInstance().reportError("Failed to process firebase push", th);
        }
    }
}
