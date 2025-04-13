package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDispatcher;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements Initializer<LifecycleOwner> {
    @Override // androidx.startup.Initializer
    @NonNull
    /* renamed from: a */
    public List<Class<? extends Initializer<?>>> mo2814a() {
        return Collections.emptyList();
    }

    @Override // androidx.startup.Initializer
    @NonNull
    /* renamed from: b */
    public LifecycleOwner mo2815b(@NonNull Context context) {
        if (!AppInitializer.m4160c(context).f6042b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
        }
        if (!LifecycleDispatcher.f4599a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new LifecycleDispatcher.DispatcherActivityCallback());
        }
        ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f4640j;
        Objects.requireNonNull(processLifecycleOwner);
        processLifecycleOwner.f4645f = new Handler();
        processLifecycleOwner.f4646g.m3199f(Lifecycle.Event.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner.3

            /* renamed from: androidx.lifecycle.ProcessLifecycleOwner$3$1 */
            public class AnonymousClass1 extends EmptyActivityLifecycleCallbacks {
                public AnonymousClass1() {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPostResumed(@NonNull Activity activity) {
                    ProcessLifecycleOwner.this.m3224a();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPostStarted(@NonNull Activity activity) {
                    ProcessLifecycleOwner.this.m3225b();
                }
            }

            public C04063() {
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (Build.VERSION.SDK_INT < 29) {
                    int i2 = ReportFragment.f4653c;
                    ((ReportFragment) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f4654b = ProcessLifecycleOwner.this.f4648i;
                }
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                ProcessLifecycleOwner processLifecycleOwner2 = ProcessLifecycleOwner.this;
                int i2 = processLifecycleOwner2.f4642c - 1;
                processLifecycleOwner2.f4642c = i2;
                if (i2 == 0) {
                    processLifecycleOwner2.f4645f.postDelayed(processLifecycleOwner2.f4647h, 700L);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            @RequiresApi
            public void onActivityPreCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
                activity.registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner.3.1
                    public AnonymousClass1() {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostResumed(@NonNull Activity activity2) {
                        ProcessLifecycleOwner.this.m3224a();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostStarted(@NonNull Activity activity2) {
                        ProcessLifecycleOwner.this.m3225b();
                    }
                });
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                ProcessLifecycleOwner processLifecycleOwner2 = ProcessLifecycleOwner.this;
                int i2 = processLifecycleOwner2.f4641b - 1;
                processLifecycleOwner2.f4641b = i2;
                if (i2 == 0 && processLifecycleOwner2.f4643d) {
                    processLifecycleOwner2.f4646g.m3199f(Lifecycle.Event.ON_STOP);
                    processLifecycleOwner2.f4644e = true;
                }
            }
        });
        return processLifecycleOwner;
    }
}
