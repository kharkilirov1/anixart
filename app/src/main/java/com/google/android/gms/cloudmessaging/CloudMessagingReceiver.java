package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public abstract class CloudMessagingReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public final ExecutorService f15255a;

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
    public static final class IntentActionKeys {
    }

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
    public static final class IntentKeys {
    }

    public CloudMessagingReceiver() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f15255a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @WorkerThread
    /* renamed from: a */
    public abstract int mo7891a(@NonNull Context context, @NonNull CloudMessage cloudMessage);

    @WorkerThread
    /* renamed from: b */
    public void mo7892b(@NonNull Context context, @NonNull Bundle bundle) {
    }

    @WorkerThread
    /* renamed from: c */
    public final int m7893c(@NonNull Context context, @NonNull Intent intent) {
        int i2;
        Task m7908b;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            m7908b = Tasks.m9723e(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            zzs m7907a = zzs.m7907a(context);
            synchronized (m7907a) {
                i2 = m7907a.f15298d;
                m7907a.f15298d = i2 + 1;
            }
            m7908b = m7907a.m7908b(new zzo(i2, bundle));
        }
        int mo7891a = mo7891a(context, new CloudMessage(intent));
        try {
            Tasks.m9720b(m7908b, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("Message ack failed: ");
            sb.append(valueOf);
            Log.w("CloudMessagingReceiver", sb.toString());
        }
        return mo7891a;
    }

    @WorkerThread
    /* renamed from: d */
    public final int m7894d(@NonNull Context context, @NonNull Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            mo7892b(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull final Context context, @NonNull final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        this.f15255a.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zze
            @Override // java.lang.Runnable
            public final void run() {
                CloudMessagingReceiver cloudMessagingReceiver = CloudMessagingReceiver.this;
                Intent intent2 = intent;
                Context context2 = context;
                boolean z = isOrderedBroadcast;
                BroadcastReceiver.PendingResult pendingResult = goAsync;
                Objects.requireNonNull(cloudMessagingReceiver);
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    Intent intent3 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    int m7894d = intent3 != null ? cloudMessagingReceiver.m7894d(context2, intent3) : cloudMessagingReceiver.m7893c(context2, intent2);
                    if (z) {
                        pendingResult.setResultCode(m7894d);
                    }
                } finally {
                    pendingResult.finish();
                }
            }
        });
    }
}
