package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.contextaware.ContextAware;
import androidx.activity.contextaware.ContextAwareHelper;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnNewIntentProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.tracing.Trace;
import com.swiftsoft.anixartd.C2507R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements ContextAware, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, ActivityResultCaller, OnConfigurationChangedProvider, OnTrimMemoryProvider, OnNewIntentProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, MenuHost {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;

    @LayoutRes
    private int mContentLayoutId;
    public final ContextAwareHelper mContextAwareHelper;
    private ViewModelProvider.Factory mDefaultFactory;
    private final LifecycleRegistry mLifecycleRegistry;
    private final MenuHostHelper mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<Consumer<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<Consumer<MultiWindowModeChangedInfo>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<Consumer<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<Consumer<PictureInPictureModeChangedInfo>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<Consumer<Integer>> mOnTrimMemoryListeners;
    public final SavedStateRegistryController mSavedStateRegistryController;
    private ViewModelStore mViewModelStore;

    @RequiresApi
    public static class Api19Impl {
    }

    public static final class NonConfigurationInstances {

        /* renamed from: a */
        public Object f212a;

        /* renamed from: b */
        public ViewModelStore f213b;
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new ContextAwareHelper();
        int i2 = 0;
        this.mMenuHostHelper = new MenuHostHelper(new RunnableC0042c(this, i2));
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        SavedStateRegistryController m4134a = SavedStateRegistryController.m4134a(this);
        this.mSavedStateRegistryController = m4134a;
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.ComponentActivity.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ComponentActivity.super.onBackPressed();
                } catch (IllegalStateException e2) {
                    if (!TextUtils.equals(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e2;
                    }
                }
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new ActivityResultRegistry() { // from class: androidx.activity.ComponentActivity.2
            @Override // androidx.activity.result.ActivityResultRegistry
            /* renamed from: c */
            public <I, O> void mo303c(final int i3, @NonNull ActivityResultContract<I, O> activityResultContract, I i4, @Nullable ActivityOptionsCompat activityOptionsCompat) {
                ComponentActivity componentActivity = ComponentActivity.this;
                final ActivityResultContract.SynchronousResult<O> mo325b = activityResultContract.mo325b(componentActivity, i4);
                if (mo325b != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.ComponentActivity.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            m320b(i3, mo325b.f272a);
                        }
                    });
                    return;
                }
                Intent mo317a = activityResultContract.mo317a(componentActivity, i4);
                Bundle bundle = null;
                if (mo317a.getExtras() != null && mo317a.getExtras().getClassLoader() == null) {
                    mo317a.setExtrasClassLoader(componentActivity.getClassLoader());
                }
                if (mo317a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                    bundle = mo317a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    mo317a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                } else if (activityOptionsCompat != null) {
                    bundle = activityOptionsCompat.mo1541a();
                }
                Bundle bundle2 = bundle;
                if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(mo317a.getAction())) {
                    String[] stringArrayExtra = mo317a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    if (stringArrayExtra == null) {
                        stringArrayExtra = new String[0];
                    }
                    ActivityCompat.m1518n(componentActivity, stringArrayExtra, i3);
                    return;
                }
                if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(mo317a.getAction())) {
                    ActivityCompat.m1522r(componentActivity, mo317a, i3, bundle2);
                    return;
                }
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) mo317a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    ActivityCompat.m1523s(componentActivity, intentSenderRequest.f264b, i3, intentSenderRequest.f265c, intentSenderRequest.f266d, intentSenderRequest.f267e, 0, bundle2);
                } catch (IntentSender.SendIntentException e2) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.ComponentActivity.2.2
                        @Override // java.lang.Runnable
                        public void run() {
                            m319a(i3, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e2));
                        }
                    });
                }
            }
        };
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i3 = Build.VERSION.SDK_INT;
        getLifecycle().mo3187a(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.LifecycleEventObserver
            /* renamed from: c */
            public void mo304c(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        getLifecycle().mo3187a(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.LifecycleEventObserver
            /* renamed from: c */
            public void mo304c(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ComponentActivity.this.mContextAwareHelper.f238b = null;
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.getViewModelStore().m3247a();
                }
            }
        });
        getLifecycle().mo3187a(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.LifecycleEventObserver
            /* renamed from: c */
            public void mo304c(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().mo3189c(this);
            }
        });
        m4134a.m4135b();
        SavedStateHandleSupport.m3236b(this);
        if (i3 <= 23) {
            getLifecycle().mo3187a(new ImmLeaksCleaner(this));
        }
        getSavedStateRegistry().m4132c(ACTIVITY_RESULT_TAG, new C0041b(this, i2));
        addOnContextAvailableListener(new C0040a(this, i2));
    }

    private void initViewTreeOwners() {
        getWindow().getDecorView().setTag(C2507R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(C2507R.id.view_tree_view_model_store_owner, this);
        ViewTreeSavedStateRegistryOwner.m4138a(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        Intrinsics.m32179h(decorView, "<this>");
        decorView.setTag(C2507R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle lambda$new$0() {
        Bundle bundle = new Bundle();
        ActivityResultRegistry activityResultRegistry = this.mActivityResultRegistry;
        Objects.requireNonNull(activityResultRegistry);
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(activityResultRegistry.f244c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(activityResultRegistry.f244c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(activityResultRegistry.f246e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) activityResultRegistry.f249h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", activityResultRegistry.f242a);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$new$1(Context context) {
        Bundle m4130a = getSavedStateRegistry().m4130a(ACTIVITY_RESULT_TAG);
        if (m4130a != null) {
            ActivityResultRegistry activityResultRegistry = this.mActivityResultRegistry;
            Objects.requireNonNull(activityResultRegistry);
            ArrayList<Integer> integerArrayList = m4130a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = m4130a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            activityResultRegistry.f246e = m4130a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            activityResultRegistry.f242a = (Random) m4130a.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
            activityResultRegistry.f249h.putAll(m4130a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                String str = stringArrayList.get(i2);
                if (activityResultRegistry.f244c.containsKey(str)) {
                    Integer remove = activityResultRegistry.f244c.remove(str);
                    if (!activityResultRegistry.f249h.containsKey(str)) {
                        activityResultRegistry.f243b.remove(remove);
                    }
                }
                int intValue = integerArrayList.get(i2).intValue();
                String str2 = stringArrayList.get(i2);
                activityResultRegistry.f243b.put(Integer.valueOf(intValue), str2);
                activityResultRegistry.f244c.put(str2, Integer.valueOf(intValue));
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint View view, @SuppressLint ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(@NonNull MenuProvider menuProvider) {
        MenuHostHelper menuHostHelper = this.mMenuHostHelper;
        menuHostHelper.f3621b.add(menuProvider);
        menuHostHelper.f3620a.run();
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void addOnConfigurationChangedListener(@NonNull Consumer<Configuration> consumer) {
        this.mOnConfigurationChangedListeners.add(consumer);
    }

    public final void addOnContextAvailableListener(@NonNull OnContextAvailableListener onContextAvailableListener) {
        ContextAwareHelper contextAwareHelper = this.mContextAwareHelper;
        if (contextAwareHelper.f238b != null) {
            onContextAvailableListener.mo312a(contextAwareHelper.f238b);
        }
        contextAwareHelper.f237a.add(onContextAvailableListener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void addOnMultiWindowModeChangedListener(@NonNull Consumer<MultiWindowModeChangedInfo> consumer) {
        this.mOnMultiWindowModeChangedListeners.add(consumer);
    }

    public final void addOnNewIntentListener(@NonNull Consumer<Intent> consumer) {
        this.mOnNewIntentListeners.add(consumer);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void addOnPictureInPictureModeChangedListener(@NonNull Consumer<PictureInPictureModeChangedInfo> consumer) {
        this.mOnPictureInPictureModeChangedListeners.add(consumer);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void addOnTrimMemoryListener(@NonNull Consumer<Integer> consumer) {
        this.mOnTrimMemoryListeners.add(consumer);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance();
            if (nonConfigurationInstances != null) {
                this.mViewModelStore = nonConfigurationInstances.f213b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new ViewModelStore();
            }
        }
    }

    @Override // androidx.activity.result.ActivityResultRegistryOwner
    @NonNull
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NonNull
    @CallSuper
    public CreationExtras getDefaultViewModelCreationExtras() {
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
        if (getApplication() != null) {
            mutableCreationExtras.m3250b(ViewModelProvider.AndroidViewModelFactory.f4693g, getApplication());
        }
        mutableCreationExtras.m3250b(SavedStateHandleSupport.f4666a, this);
        mutableCreationExtras.m3250b(SavedStateHandleSupport.f4667b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            mutableCreationExtras.m3250b(SavedStateHandleSupport.f4668c, getIntent().getExtras());
        }
        return mutableCreationExtras;
    }

    @NonNull
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new SavedStateViewModelFactory(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Nullable
    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance();
        if (nonConfigurationInstances != null) {
            return nonConfigurationInstances.f212a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    @NonNull
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    @NonNull
    /* renamed from: getOnBackPressedDispatcher */
    public final OnBackPressedDispatcher getF215c() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    @NonNull
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f5958b;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @NonNull
    public ViewModelStore getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @CallSuper
    @Deprecated
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        if (this.mActivityResultRegistry.m319a(i2, i3, intent)) {
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    @MainThread
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.m311b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @CallSuper
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<Consumer<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        this.mSavedStateRegistryController.m4136c(bundle);
        ContextAwareHelper contextAwareHelper = this.mContextAwareHelper;
        contextAwareHelper.f238b = this;
        Iterator<OnContextAvailableListener> it = contextAwareHelper.f237a.iterator();
        while (it.hasNext()) {
            it.next().mo312a(this);
        }
        super.onCreate(bundle);
        ReportFragment.m3230c(this);
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, @NonNull Menu menu) {
        if (i2 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i2, menu);
        this.mMenuHostHelper.m2106c(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.mMenuHostHelper.m2107d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    @CallSuper
    public void onMultiWindowModeChanged(boolean z) {
        Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new MultiWindowModeChangedInfo(z));
        }
    }

    @Override // android.app.Activity
    @CallSuper
    public void onNewIntent(@SuppressLint Intent intent) {
        super.onNewIntent(intent);
        Iterator<Consumer<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, @NonNull Menu menu) {
        Iterator<MenuProvider> it = this.mMenuHostHelper.f3621b.iterator();
        while (it.hasNext()) {
            it.next().mo2131b(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z) {
        Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new PictureInPictureModeChangedInfo(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, @Nullable View view, @NonNull Menu menu) {
        if (i2 != 0) {
            return true;
        }
        super.onPreparePanel(i2, view, menu);
        this.mMenuHostHelper.m2108e(menu);
        return true;
    }

    @Override // android.app.Activity
    @CallSuper
    @Deprecated
    public void onRequestPermissionsResult(int i2, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (this.mActivityResultRegistry.m319a(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Nullable
    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    @Nullable
    public final Object onRetainNonConfigurationInstance() {
        NonConfigurationInstances nonConfigurationInstances;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ViewModelStore viewModelStore = this.mViewModelStore;
        if (viewModelStore == null && (nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance()) != null) {
            viewModelStore = nonConfigurationInstances.f213b;
        }
        if (viewModelStore == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        NonConfigurationInstances nonConfigurationInstances2 = new NonConfigurationInstances();
        nonConfigurationInstances2.f212a = onRetainCustomNonConfigurationInstance;
        nonConfigurationInstances2.f213b = viewModelStore;
        return nonConfigurationInstances2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    @CallSuper
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof LifecycleRegistry) {
            LifecycleRegistry lifecycleRegistry = (LifecycleRegistry) lifecycle;
            Lifecycle.State state = Lifecycle.State.CREATED;
            lifecycleRegistry.m3198e("setCurrentState");
            lifecycleRegistry.m3200h(state);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m4137d(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @CallSuper
    public void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        Iterator<Consumer<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i2));
        }
    }

    @Nullable
    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f238b;
    }

    @NonNull
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(@NonNull ActivityResultContract<I, O> activityResultContract, @NonNull ActivityResultRegistry activityResultRegistry, @NonNull ActivityResultCallback<O> activityResultCallback) {
        StringBuilder m24u = C0000a.m24u("activity_rq#");
        m24u.append(this.mNextLocalRequestCode.getAndIncrement());
        return activityResultRegistry.m322e(m24u.toString(), this, activityResultContract, activityResultCallback);
    }

    @Override // androidx.core.view.MenuHost
    public void removeMenuProvider(@NonNull MenuProvider menuProvider) {
        this.mMenuHostHelper.m2109f(menuProvider);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void removeOnConfigurationChangedListener(@NonNull Consumer<Configuration> consumer) {
        this.mOnConfigurationChangedListeners.remove(consumer);
    }

    public final void removeOnContextAvailableListener(@NonNull OnContextAvailableListener onContextAvailableListener) {
        this.mContextAwareHelper.f237a.remove(onContextAvailableListener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void removeOnMultiWindowModeChangedListener(@NonNull Consumer<MultiWindowModeChangedInfo> consumer) {
        this.mOnMultiWindowModeChangedListeners.remove(consumer);
    }

    public final void removeOnNewIntentListener(@NonNull Consumer<Intent> consumer) {
        this.mOnNewIntentListeners.remove(consumer);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void removeOnPictureInPictureModeChangedListener(@NonNull Consumer<PictureInPictureModeChangedInfo> consumer) {
        this.mOnPictureInPictureModeChangedListeners.remove(consumer);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void removeOnTrimMemoryListener(@NonNull Consumer<Integer> consumer) {
        this.mOnTrimMemoryListeners.remove(consumer);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (Trace.m4183a()) {
                android.os.Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            android.os.Trace.endSection();
        } catch (Throwable th) {
            android.os.Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@LayoutRes int i2) {
        initViewTreeOwners();
        super.setContentView(i2);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint Intent intent, int i2) {
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint IntentSender intentSender, int i2, @Nullable Intent intent, int i3, int i4, int i5) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint Intent intent, int i2, @Nullable Bundle bundle) {
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint IntentSender intentSender, int i2, @Nullable Intent intent, int i3, int i4, int i5, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    @Override // android.app.Activity
    @RequiresApi
    @CallSuper
    public void onMultiWindowModeChanged(boolean z, @NonNull Configuration configuration) {
        Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new MultiWindowModeChangedInfo(z, configuration));
        }
    }

    @Override // android.app.Activity
    @RequiresApi
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z, @NonNull Configuration configuration) {
        Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new PictureInPictureModeChangedInfo(z, configuration));
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    public void addMenuProvider(@NonNull MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner) {
        this.mMenuHostHelper.m2104a(menuProvider, lifecycleOwner);
    }

    @NonNull
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(@NonNull ActivityResultContract<I, O> activityResultContract, @NonNull ActivityResultCallback<O> activityResultCallback) {
        return registerForActivityResult(activityResultContract, this.mActivityResultRegistry, activityResultCallback);
    }

    @SuppressLint
    public void addMenuProvider(@NonNull MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.State state) {
        this.mMenuHostHelper.m2105b(menuProvider, lifecycleOwner, state);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint View view, @SuppressLint ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    @ContentView
    public ComponentActivity(@LayoutRes int i2) {
        this();
        this.mContentLayoutId = i2;
    }
}
