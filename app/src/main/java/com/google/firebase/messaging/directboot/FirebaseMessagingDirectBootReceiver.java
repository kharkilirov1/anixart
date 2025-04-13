package com.google.firebase.messaging.directboot;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FcmBroadcastProcessor;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.directboot.FirebaseMessagingDirectBootReceiver;
import com.google.firebase.messaging.directboot.threads.PoolableExecutors;
import com.google.firebase.messaging.directboot.threads.ThreadPriority;
import java.util.concurrent.ExecutorService;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class FirebaseMessagingDirectBootReceiver extends WakefulBroadcastReceiver {

    /* renamed from: b */
    public static final /* synthetic */ int f23376b = 0;

    /* renamed from: a */
    public final ExecutorService f23377a = PoolableExecutors.f23379b.mo12713a(new NamedThreadFactory("fcm-db-intent-handle"), ThreadPriority.LOW_POWER);

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        if (!FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction())) {
            StringBuilder m24u = C0000a.m24u("Unexpected intent: ");
            m24u.append(intent.getAction());
            Log.d("FCM", m24u.toString());
        } else {
            intent.setComponent(null);
            intent.setPackage(context.getPackageName());
            final boolean isOrderedBroadcast = isOrderedBroadcast();
            final BroadcastReceiver.PendingResult goAsync = goAsync();
            new FcmBroadcastProcessor(context, this.f23377a).process(intent).mo9699d(this.f23377a, new OnCompleteListener() { // from class: f.a
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    boolean z = isOrderedBroadcast;
                    BroadcastReceiver.PendingResult pendingResult = goAsync;
                    int i2 = FirebaseMessagingDirectBootReceiver.f23376b;
                    if (z) {
                        pendingResult.setResultCode(task.mo9712q() ? ((Integer) task.mo9708m()).intValue() : 500);
                    }
                    pendingResult.finish();
                }
            });
        }
    }
}
