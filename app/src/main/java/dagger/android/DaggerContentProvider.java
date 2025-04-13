package dagger.android;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.ContentProvider;
import androidx.annotation.CallSuper;

/* loaded from: classes3.dex */
public abstract class DaggerContentProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    @CallSuper
    public boolean onCreate() {
        ComponentCallbacks2 componentCallbacks2 = (Application) getContext().getApplicationContext();
        if (!(componentCallbacks2 instanceof HasAndroidInjector)) {
            throw new RuntimeException(String.format("%s does not implement %s", componentCallbacks2.getClass().getCanonicalName(), HasAndroidInjector.class.getCanonicalName()));
        }
        AndroidInjection.m30781d(this, (HasAndroidInjector) componentCallbacks2);
        return true;
    }
}
