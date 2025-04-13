package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class BackgroundDetector implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: f */
    public static final BackgroundDetector f15389f = new BackgroundDetector();

    /* renamed from: b */
    public final AtomicBoolean f15390b = new AtomicBoolean();

    /* renamed from: c */
    public final AtomicBoolean f15391c = new AtomicBoolean();

    /* renamed from: d */
    @GuardedBy
    public final ArrayList<BackgroundStateChangeListener> f15392d = new ArrayList<>();

    /* renamed from: e */
    @GuardedBy
    public boolean f15393e = false;

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    @KeepForSdk
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        /* renamed from: a */
        void mo7970a(boolean z);
    }

    @KeepForSdk
    public BackgroundDetector() {
    }

    @KeepForSdk
    /* renamed from: b */
    public static void m7967b(@NonNull Application application) {
        BackgroundDetector backgroundDetector = f15389f;
        synchronized (backgroundDetector) {
            if (!backgroundDetector.f15393e) {
                application.registerActivityLifecycleCallbacks(backgroundDetector);
                application.registerComponentCallbacks(backgroundDetector);
                backgroundDetector.f15393e = true;
            }
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public void m7968a(@NonNull BackgroundStateChangeListener backgroundStateChangeListener) {
        synchronized (f15389f) {
            this.f15392d.add(backgroundStateChangeListener);
        }
    }

    /* renamed from: c */
    public final void m7969c(boolean z) {
        synchronized (f15389f) {
            Iterator<BackgroundStateChangeListener> it = this.f15392d.iterator();
            while (it.hasNext()) {
                it.next().mo7970a(z);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        boolean compareAndSet = this.f15390b.compareAndSet(true, false);
        this.f15391c.set(true);
        if (compareAndSet) {
            m7969c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NonNull Activity activity) {
        boolean compareAndSet = this.f15390b.compareAndSet(true, false);
        this.f15391c.set(true);
        if (compareAndSet) {
            m7969c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.f15390b.compareAndSet(false, true)) {
            this.f15391c.set(true);
            m7969c(true);
        }
    }
}
