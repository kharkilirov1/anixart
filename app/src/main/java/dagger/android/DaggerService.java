package dagger.android;

import android.app.Service;

/* loaded from: classes3.dex */
public abstract class DaggerService extends Service {
    @Override // android.app.Service
    public void onCreate() {
        AndroidInjection.m30780c(this);
        super.onCreate();
    }
}
