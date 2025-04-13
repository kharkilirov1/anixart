package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.Lifecycle;

@RestrictTo
/* loaded from: classes.dex */
public class ReportFragment extends Fragment {

    /* renamed from: c */
    public static final /* synthetic */ int f4653c = 0;

    /* renamed from: b */
    public ActivityInitializationListener f4654b;

    public interface ActivityInitializationListener {
        /* renamed from: a */
        void mo3226a();

        /* renamed from: b */
        void mo3227b();

        /* renamed from: c */
        void mo3228c();
    }

    @RequiresApi
    public static class LifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new LifecycleCallbacks());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
            ReportFragment.m3229a(activity, Lifecycle.Event.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@NonNull Activity activity) {
            ReportFragment.m3229a(activity, Lifecycle.Event.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@NonNull Activity activity) {
            ReportFragment.m3229a(activity, Lifecycle.Event.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(@NonNull Activity activity) {
            ReportFragment.m3229a(activity, Lifecycle.Event.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(@NonNull Activity activity) {
            ReportFragment.m3229a(activity, Lifecycle.Event.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(@NonNull Activity activity) {
            ReportFragment.m3229a(activity, Lifecycle.Event.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m3229a(@NonNull Activity activity, @NonNull Lifecycle.Event event) {
        if (activity instanceof LifecycleRegistryOwner) {
            LifecycleRegistry lifecycle = ((LifecycleRegistryOwner) activity).getLifecycle();
            lifecycle.m3198e("handleLifecycleEvent");
            lifecycle.m3200h(event.m3193b());
        } else if (activity instanceof LifecycleOwner) {
            Lifecycle lifecycle2 = ((LifecycleOwner) activity).getLifecycle();
            if (lifecycle2 instanceof LifecycleRegistry) {
                LifecycleRegistry lifecycleRegistry = (LifecycleRegistry) lifecycle2;
                lifecycleRegistry.m3198e("handleLifecycleEvent");
                lifecycleRegistry.m3200h(event.m3193b());
            }
        }
    }

    /* renamed from: c */
    public static void m3230c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            LifecycleCallbacks.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new ReportFragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: b */
    public final void m3231b(@NonNull Lifecycle.Event event) {
        if (Build.VERSION.SDK_INT < 29) {
            m3229a(getActivity(), event);
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ActivityInitializationListener activityInitializationListener = this.f4654b;
        if (activityInitializationListener != null) {
            activityInitializationListener.mo3226a();
        }
        m3231b(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m3231b(Lifecycle.Event.ON_DESTROY);
        this.f4654b = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m3231b(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        ActivityInitializationListener activityInitializationListener = this.f4654b;
        if (activityInitializationListener != null) {
            activityInitializationListener.mo3228c();
        }
        m3231b(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        ActivityInitializationListener activityInitializationListener = this.f4654b;
        if (activityInitializationListener != null) {
            activityInitializationListener.mo3227b();
        }
        m3231b(Lifecycle.Event.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m3231b(Lifecycle.Event.ON_STOP);
    }
}
