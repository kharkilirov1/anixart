package dagger.android;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.CallSuper;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class DaggerBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    @CallSuper
    public void onReceive(Context context, Intent intent) {
        Objects.requireNonNull(context, "context");
        ComponentCallbacks2 componentCallbacks2 = (Application) context.getApplicationContext();
        if (!(componentCallbacks2 instanceof HasAndroidInjector)) {
            throw new RuntimeException(String.format("%s does not implement %s", componentCallbacks2.getClass().getCanonicalName(), HasAndroidInjector.class.getCanonicalName()));
        }
        AndroidInjection.m30781d(this, (HasAndroidInjector) componentCallbacks2);
    }
}
