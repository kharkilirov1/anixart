package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.C0040a;
import androidx.activity.C0041b;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.app.SharedElementCallback;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.app.LoaderManager;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements ActivityCompat.OnRequestPermissionsResultCallback, ActivityCompat.RequestPermissionsRequestCodeValidator {
    public static final String LIFECYCLE_TAG = "android:support:lifecycle";
    public boolean mCreated;
    public final LifecycleRegistry mFragmentLifecycleRegistry;
    public final FragmentController mFragments;
    public boolean mResumed;
    public boolean mStopped;

    public class HostCallbacks extends FragmentHostCallback<FragmentActivity> implements OnConfigurationChangedProvider, OnTrimMemoryProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, ViewModelStoreOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, SavedStateRegistryOwner, FragmentOnAttachListener, MenuHost {
        public HostCallbacks() {
            super(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.FragmentOnAttachListener
        /* renamed from: a */
        public void mo2967a(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // androidx.core.view.MenuHost
        public void addMenuProvider(@NonNull MenuProvider menuProvider) {
            FragmentActivity.this.addMenuProvider(menuProvider);
        }

        @Override // androidx.core.content.OnConfigurationChangedProvider
        public void addOnConfigurationChangedListener(@NonNull Consumer<Configuration> consumer) {
            FragmentActivity.this.addOnConfigurationChangedListener(consumer);
        }

        @Override // androidx.core.app.OnMultiWindowModeChangedProvider
        public void addOnMultiWindowModeChangedListener(@NonNull Consumer<MultiWindowModeChangedInfo> consumer) {
            FragmentActivity.this.addOnMultiWindowModeChangedListener(consumer);
        }

        @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
        public void addOnPictureInPictureModeChangedListener(@NonNull Consumer<PictureInPictureModeChangedInfo> consumer) {
            FragmentActivity.this.addOnPictureInPictureModeChangedListener(consumer);
        }

        @Override // androidx.core.content.OnTrimMemoryProvider
        public void addOnTrimMemoryListener(@NonNull Consumer<Integer> consumer) {
            FragmentActivity.this.addOnTrimMemoryListener(consumer);
        }

        @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
        @Nullable
        /* renamed from: b */
        public View mo2960b(int i2) {
            return FragmentActivity.this.findViewById(i2);
        }

        @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
        /* renamed from: c */
        public boolean mo2961c() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        /* renamed from: d */
        public void mo2968d(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
            FragmentActivity.this.dump(str, null, printWriter, strArr);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        /* renamed from: e */
        public FragmentActivity mo2969e() {
            return FragmentActivity.this;
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        @NonNull
        /* renamed from: f */
        public LayoutInflater mo2970f() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        /* renamed from: g */
        public boolean mo2971g(@NonNull String str) {
            return ActivityCompat.m1521q(FragmentActivity.this, str);
        }

        @Override // androidx.activity.result.ActivityResultRegistryOwner
        @NonNull
        public ActivityResultRegistry getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.LifecycleOwner
        @NonNull
        public Lifecycle getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.OnBackPressedDispatcherOwner
        @NonNull
        /* renamed from: getOnBackPressedDispatcher */
        public OnBackPressedDispatcher getF215c() {
            return FragmentActivity.this.getF215c();
        }

        @Override // androidx.savedstate.SavedStateRegistryOwner
        @NonNull
        public SavedStateRegistry getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.ViewModelStoreOwner
        @NonNull
        public ViewModelStore getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        /* renamed from: h */
        public void mo2972h() {
            FragmentActivity.this.invalidateOptionsMenu();
        }

        @Override // androidx.core.view.MenuHost
        public void removeMenuProvider(@NonNull MenuProvider menuProvider) {
            FragmentActivity.this.removeMenuProvider(menuProvider);
        }

        @Override // androidx.core.content.OnConfigurationChangedProvider
        public void removeOnConfigurationChangedListener(@NonNull Consumer<Configuration> consumer) {
            FragmentActivity.this.removeOnConfigurationChangedListener(consumer);
        }

        @Override // androidx.core.app.OnMultiWindowModeChangedProvider
        public void removeOnMultiWindowModeChangedListener(@NonNull Consumer<MultiWindowModeChangedInfo> consumer) {
            FragmentActivity.this.removeOnMultiWindowModeChangedListener(consumer);
        }

        @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
        public void removeOnPictureInPictureModeChangedListener(@NonNull Consumer<PictureInPictureModeChangedInfo> consumer) {
            FragmentActivity.this.removeOnPictureInPictureModeChangedListener(consumer);
        }

        @Override // androidx.core.content.OnTrimMemoryProvider
        public void removeOnTrimMemoryListener(@NonNull Consumer<Integer> consumer) {
            FragmentActivity.this.removeOnTrimMemoryListener(consumer);
        }
    }

    public FragmentActivity() {
        this.mFragments = new FragmentController(new HostCallbacks());
        this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        final int i2 = 1;
        getSavedStateRegistry().m4132c(LIFECYCLE_TAG, new C0041b(this, i2));
        final int i3 = 0;
        addOnConfigurationChangedListener(new Consumer(this) { // from class: androidx.fragment.app.a

            /* renamed from: c */
            public final /* synthetic */ FragmentActivity f4517c;

            {
                this.f4517c = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        this.f4517c.lambda$init$1((Configuration) obj);
                        break;
                    default:
                        this.f4517c.lambda$init$2((Intent) obj);
                        break;
                }
            }
        });
        addOnNewIntentListener(new Consumer(this) { // from class: androidx.fragment.app.a

            /* renamed from: c */
            public final /* synthetic */ FragmentActivity f4517c;

            {
                this.f4517c = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        this.f4517c.lambda$init$1((Configuration) obj);
                        break;
                    default:
                        this.f4517c.lambda$init$2((Intent) obj);
                        break;
                }
            }
        });
        addOnContextAvailableListener(new C0040a(this, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.m3199f(Lifecycle.Event.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.m2974a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.m2974a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$init$3(Context context) {
        FragmentHostCallback<?> fragmentHostCallback = this.mFragments.f4309a;
        fragmentHostCallback.f4314e.m3020b(fragmentHostCallback, fragmentHostCallback, null);
    }

    private static boolean markState(FragmentManager fragmentManager, Lifecycle.State state) {
        Lifecycle.State state2 = Lifecycle.State.STARTED;
        boolean z = false;
        for (Fragment fragment : fragmentManager.m3006N()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= markState(fragment.getChildFragmentManager(), state);
                }
                FragmentViewLifecycleOwner fragmentViewLifecycleOwner = fragment.mViewLifecycleOwner;
                if (fragmentViewLifecycleOwner != null) {
                    fragmentViewLifecycleOwner.m3144b();
                    if (fragmentViewLifecycleOwner.f4472d.f4601b.compareTo(state2) >= 0) {
                        LifecycleRegistry lifecycleRegistry = fragment.mViewLifecycleOwner.f4472d;
                        lifecycleRegistry.m3198e("setCurrentState");
                        lifecycleRegistry.m3200h(state);
                        z = true;
                    }
                }
                if (fragment.mLifecycleRegistry.f4601b.compareTo(state2) >= 0) {
                    LifecycleRegistry lifecycleRegistry2 = fragment.mLifecycleRegistry;
                    lifecycleRegistry2.m3198e("setCurrentState");
                    lifecycleRegistry2.m3200h(state);
                    z = true;
                }
            }
        }
        return z;
    }

    @Nullable
    public final View dispatchFragmentsOnCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.f4309a.f4314e.f4342f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                LoaderManager.m3251b(this).mo3252a(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.f4309a.f4314e.m3060x(str, fileDescriptor, printWriter, strArr);
        }
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.f4309a.f4314e;
    }

    @NonNull
    @Deprecated
    public LoaderManager getSupportLoaderManager() {
        return LoaderManager.m3251b(this);
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), Lifecycle.State.CREATED)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @CallSuper
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        this.mFragments.m2974a();
        super.onActivityResult(i2, i3, intent);
    }

    @MainThread
    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.m3199f(Lifecycle.Event.ON_CREATE);
        this.mFragments.f4309a.f4314e.m3038k();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @Nullable
    public View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f4309a.f4314e.m3042m();
        this.mFragmentLifecycleRegistry.m3199f(Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 6) {
            return this.mFragments.f4309a.f4314e.m3036j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f4309a.f4314e.m3058v(5);
        this.mFragmentLifecycleRegistry.m3199f(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @CallSuper
    public void onRequestPermissionsResult(int i2, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.m2974a();
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.m2974a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f4309a.f4314e.m2994B(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.m3199f(Lifecycle.Event.ON_RESUME);
        FragmentManager fragmentManager = this.mFragments.f4309a.f4314e;
        fragmentManager.f4328G = false;
        fragmentManager.f4329H = false;
        fragmentManager.f4335N.f4391i = false;
        fragmentManager.m3058v(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.m2974a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            FragmentManager fragmentManager = this.mFragments.f4309a.f4314e;
            fragmentManager.f4328G = false;
            fragmentManager.f4329H = false;
            fragmentManager.f4335N.f4391i = false;
            fragmentManager.m3058v(4);
        }
        this.mFragments.f4309a.f4314e.m2994B(true);
        this.mFragmentLifecycleRegistry.m3199f(Lifecycle.Event.ON_START);
        FragmentManager fragmentManager2 = this.mFragments.f4309a.f4314e;
        fragmentManager2.f4328G = false;
        fragmentManager2.f4329H = false;
        fragmentManager2.f4335N.f4391i = false;
        fragmentManager2.m3058v(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m2974a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        FragmentManager fragmentManager = this.mFragments.f4309a.f4314e;
        fragmentManager.f4329H = true;
        fragmentManager.f4335N.f4391i = true;
        fragmentManager.m3058v(4);
        this.mFragmentLifecycleRegistry.m3199f(Lifecycle.Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(@Nullable SharedElementCallback sharedElementCallback) {
        ActivityCompat.m1519o(this, sharedElementCallback);
    }

    public void setExitSharedElementCallback(@Nullable SharedElementCallback sharedElementCallback) {
        ActivityCompat.m1520p(this, sharedElementCallback);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @SuppressLint Intent intent, int i2) {
        startActivityFromFragment(fragment, intent, i2, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment, @SuppressLint IntentSender intentSender, int i2, @Nullable Intent intent, int i3, int i4, int i5, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (i2 == -1) {
            ActivityCompat.m1523s(this, intentSender, i2, intent, i3, i4, i5, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        ActivityCompat.m1516l(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        ActivityCompat.m1517m(this);
    }

    public void supportStartPostponedEnterTransition() {
        ActivityCompat.m1524t(this);
    }

    @Override // androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i2) {
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @SuppressLint Intent intent, int i2, @Nullable Bundle bundle) {
        if (i2 == -1) {
            ActivityCompat.m1522r(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i2, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @Nullable
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @ContentView
    public FragmentActivity(@LayoutRes int i2) {
        super(i2);
        this.mFragments = new FragmentController(new HostCallbacks());
        this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
        this.mStopped = true;
        init();
    }
}
