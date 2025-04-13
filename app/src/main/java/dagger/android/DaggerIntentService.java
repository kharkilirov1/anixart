package dagger.android;

import android.app.IntentService;

/* loaded from: classes3.dex */
public abstract class DaggerIntentService extends IntentService {
    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        AndroidInjection.m30780c(this);
        super.onCreate();
    }
}
