package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import androidx.window.layout.ExecutorC0688c;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.WithinAppServiceConnection;

/* loaded from: classes2.dex */
class WithinAppServiceBinder extends Binder {

    /* renamed from: b */
    public static final /* synthetic */ int f23356b = 0;

    /* renamed from: a */
    public final IntentHandler f23357a;

    public interface IntentHandler {
        /* renamed from: a */
        Task<Void> mo12640a(Intent intent);
    }

    public WithinAppServiceBinder(IntentHandler intentHandler) {
        this.f23357a = intentHandler;
    }

    /* renamed from: a */
    public void m12708a(WithinAppServiceConnection.BindRequest bindRequest) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f23357a.mo12640a(bindRequest.f23364a).mo9699d(ExecutorC0688c.f6818j, new C2170n(bindRequest, 0));
    }
}
