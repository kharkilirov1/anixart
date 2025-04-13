package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.firebase.messaging.WithinAppServiceConnection;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.firebase.messaging.l */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2168l implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f23396b;

    /* renamed from: c */
    public final /* synthetic */ Object f23397c;

    public /* synthetic */ RunnableC2168l(Object obj, int i2) {
        this.f23396b = i2;
        this.f23397c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23396b) {
            case 0:
                SharedPreferencesQueue sharedPreferencesQueue = (SharedPreferencesQueue) this.f23397c;
                synchronized (sharedPreferencesQueue.f23314d) {
                    SharedPreferences.Editor edit = sharedPreferencesQueue.f23311a.edit();
                    String str = sharedPreferencesQueue.f23312b;
                    StringBuilder sb = new StringBuilder();
                    Iterator<String> it = sharedPreferencesQueue.f23314d.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next());
                        sb.append(sharedPreferencesQueue.f23313c);
                    }
                    edit.putString(str, sb.toString()).commit();
                }
                return;
            default:
                WithinAppServiceConnection.BindRequest bindRequest = (WithinAppServiceConnection.BindRequest) this.f23397c;
                Objects.requireNonNull(bindRequest);
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + bindRequest.f23364a.getAction() + " App may get closed.");
                bindRequest.m12712a();
                return;
        }
    }
}
