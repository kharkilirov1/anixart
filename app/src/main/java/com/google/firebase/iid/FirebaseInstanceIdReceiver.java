package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.messaging.MessagingAnalytics;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    @WorkerThread
    /* renamed from: a */
    public int mo7891a(@NonNull Context context, @NonNull CloudMessage cloudMessage) {
        try {
            return ((Integer) Tasks.m9719a(new FcmBroadcastProcessor(context).m12642b(cloudMessage.f15254b))).intValue();
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e2);
            return 500;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    @WorkerThread
    /* renamed from: b */
    public void mo7892b(@NonNull Context context, @NonNull Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (MessagingAnalytics.m12664c(putExtras)) {
            MessagingAnalytics.m12663b("_nd", putExtras.getExtras());
        }
    }
}
