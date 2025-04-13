package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import androidx.window.layout.ExecutorC0688c;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.WithinAppServiceBinder;
import com.google.firebase.messaging.threads.PoolableExecutors;
import com.google.firebase.messaging.threads.ThreadPriority;
import java.util.concurrent.ExecutorService;

@SuppressLint
/* loaded from: classes2.dex */
public abstract class EnhancedIntentService extends Service {
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    private int lastStartId;

    @VisibleForTesting
    public final ExecutorService executor = PoolableExecutors.f23449b.mo12715a(new NamedThreadFactory("Firebase-Messaging-Intent-Handle"), ThreadPriority.HIGH_SPEED);
    private final Object lock = new Object();
    private int runningTasks = 0;

    private void finishTask(Intent intent) {
        if (intent != null) {
            synchronized (WakeLockHolder.f23354b) {
                if (WakeLockHolder.f23355c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    WakeLockHolder.f23355c.m9692c();
                }
            }
        }
        synchronized (this.lock) {
            int i2 = this.runningTasks - 1;
            this.runningTasks = i2;
            if (i2 == 0) {
                stopSelfResultHook(this.lastStartId);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartCommand$1(Intent intent, Task task) {
        finishTask(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processIntent$0(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            handleIntent(intent);
        } finally {
            taskCompletionSource.m9716b(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public Task<Void> processIntent(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return Tasks.m9723e(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.executor.execute(new Runnable() { // from class: com.google.firebase.messaging.b
            @Override // java.lang.Runnable
            public final void run() {
                EnhancedIntentService.this.lambda$processIntent$0(intent, taskCompletionSource);
            }
        });
        return taskCompletionSource.f17240a;
    }

    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "Service received bind request");
        }
        if (this.binder == null) {
            this.binder = new WithinAppServiceBinder(new WithinAppServiceBinder.IntentHandler() { // from class: com.google.firebase.messaging.EnhancedIntentService.1
                @Override // com.google.firebase.messaging.WithinAppServiceBinder.IntentHandler
                @KeepForSdk
                /* renamed from: a */
                public Task<Void> mo12640a(Intent intent2) {
                    return EnhancedIntentService.this.processIntent(intent2);
                }
            });
        }
        return this.binder;
    }

    @Override // android.app.Service
    @CallSuper
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i2, int i3) {
        synchronized (this.lock) {
            this.lastStartId = i3;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        Task<Void> processIntent = processIntent(startCommandIntent);
        if (processIntent.mo9711p()) {
            finishTask(intent);
            return 2;
        }
        processIntent.mo9699d(ExecutorC0688c.f6813e, new OnCompleteListener() { // from class: com.google.firebase.messaging.a
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                EnhancedIntentService.this.lambda$onStartCommand$1(intent, task);
            }
        });
        return 3;
    }

    public boolean stopSelfResultHook(int i2) {
        return stopSelfResult(i2);
    }
}
