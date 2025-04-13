package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.AnimRes;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.UiThread;
import androidx.arch.core.util.Function;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.SharedElementCallback;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.loader.app.LoaderManager;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.swiftsoft.anixartd.C2507R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p000a.C0000a;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, ActivityResultCaller {
    public static final int ACTIVITY_CREATED = 4;
    public static final int ATTACHED = 0;
    public static final int AWAITING_ENTER_EFFECTS = 6;
    public static final int AWAITING_EXIT_EFFECTS = 3;
    public static final int CREATED = 1;
    public static final int INITIALIZING = -1;
    public static final int RESUMED = 7;
    public static final int STARTED = 5;
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public static final int VIEW_CREATED = 2;
    public boolean mAdded;
    public AnimationInfo mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mBeingSaved;
    private boolean mCalled;

    @NonNull
    public FragmentManager mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;

    @LayoutRes
    private int mContentLayoutId;
    public ViewModelProvider.Factory mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public FragmentManager mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public FragmentHostCallback<?> mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public LifecycleRegistry mLifecycleRegistry;
    public Lifecycle.State mMaxState;
    public boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<OnPreAttachedListener> mOnPreAttachedListeners;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public Runnable mPostponedDurationRunnable;

    @Nullable
    @RestrictTo
    public String mPreviousWho;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    private final OnPreAttachedListener mSavedStateAttachListener;
    public SavedStateRegistryController mSavedStateRegistryController;

    @Nullable
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;

    @Nullable
    public FragmentViewLifecycleOwner mViewLifecycleOwner;
    public MutableLiveData<LifecycleOwner> mViewLifecycleOwnerLiveData;

    @NonNull
    public String mWho;

    public static class AnimationInfo {

        /* renamed from: a */
        public boolean f4275a;

        /* renamed from: b */
        @AnimRes
        public int f4276b;

        /* renamed from: c */
        @AnimRes
        public int f4277c;

        /* renamed from: d */
        @AnimRes
        public int f4278d;

        /* renamed from: e */
        @AnimRes
        public int f4279e;

        /* renamed from: f */
        public int f4280f;

        /* renamed from: g */
        public ArrayList<String> f4281g;

        /* renamed from: h */
        public ArrayList<String> f4282h;

        /* renamed from: i */
        public Object f4283i = null;

        /* renamed from: j */
        public Object f4284j;

        /* renamed from: k */
        public Object f4285k;

        /* renamed from: l */
        public Object f4286l;

        /* renamed from: m */
        public Object f4287m;

        /* renamed from: n */
        public Object f4288n;

        /* renamed from: o */
        public Boolean f4289o;

        /* renamed from: p */
        public Boolean f4290p;

        /* renamed from: q */
        public SharedElementCallback f4291q;

        /* renamed from: r */
        public SharedElementCallback f4292r;

        /* renamed from: s */
        public float f4293s;

        /* renamed from: t */
        public View f4294t;

        /* renamed from: u */
        public boolean f4295u;

        public AnimationInfo() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f4284j = obj;
            this.f4285k = null;
            this.f4286l = obj;
            this.f4287m = null;
            this.f4288n = obj;
            this.f4291q = null;
            this.f4292r = null;
            this.f4293s = 1.0f;
            this.f4294t = null;
        }
    }

    @RequiresApi
    public static class Api19Impl {
    }

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(@NonNull String str, @Nullable Exception exc) {
            super(str, exc);
        }
    }

    public static abstract class OnPreAttachedListener {
        public OnPreAttachedListener() {
        }

        /* renamed from: a */
        public abstract void mo2962a();

        public OnPreAttachedListener(RunnableC03441 runnableC03441) {
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new FragmentManagerImpl();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new Runnable() { // from class: androidx.fragment.app.Fragment.1
            @Override // java.lang.Runnable
            public void run() {
                Fragment.this.startPostponedEnterTransition();
            }
        };
        this.mMaxState = Lifecycle.State.RESUMED;
        this.mViewLifecycleOwnerLiveData = new MutableLiveData<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new OnPreAttachedListener() { // from class: androidx.fragment.app.Fragment.2
            @Override // androidx.fragment.app.Fragment.OnPreAttachedListener
            /* renamed from: a */
            public void mo2962a() {
                Fragment.this.mSavedStateRegistryController.m4135b();
                SavedStateHandleSupport.m3236b(Fragment.this);
            }
        };
        initLifecycle();
    }

    private AnimationInfo ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new AnimationInfo();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        Lifecycle.State state = this.mMaxState;
        return (state == Lifecycle.State.INITIALIZED || this.mParentFragment == null) ? state.ordinal() : Math.min(state.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        this.mSavedStateRegistryController = SavedStateRegistryController.m4134a(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str) {
        return instantiate(context, str, null);
    }

    @NonNull
    private <I, O> ActivityResultLauncher<I> prepareCallInternal(@NonNull final ActivityResultContract<I, O> activityResultContract, @NonNull final Function<Void, ActivityResultRegistry> function, @NonNull final ActivityResultCallback<O> activityResultCallback) {
        if (this.mState > 1) {
            throw new IllegalStateException(C0000a.m13j("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        final AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new OnPreAttachedListener() { // from class: androidx.fragment.app.Fragment.9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(null);
            }

            @Override // androidx.fragment.app.Fragment.OnPreAttachedListener
            /* renamed from: a */
            public void mo2962a() {
                String generateActivityResultKey = Fragment.this.generateActivityResultKey();
                atomicReference.set(((ActivityResultRegistry) function.apply(null)).m322e(generateActivityResultKey, Fragment.this, activityResultContract, activityResultCallback));
            }
        });
        return new ActivityResultLauncher<I>(this, atomicReference, activityResultContract) { // from class: androidx.fragment.app.Fragment.10

            /* renamed from: a */
            public final /* synthetic */ AtomicReference f4262a;

            @Override // androidx.activity.result.ActivityResultLauncher
            /* renamed from: a */
            public void mo315a(I i2, @Nullable ActivityOptionsCompat activityOptionsCompat) {
                ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) this.f4262a.get();
                if (activityResultLauncher == null) {
                    throw new IllegalStateException("Operation cannot be started before fragment is in created state");
                }
                activityResultLauncher.mo315a(i2, activityOptionsCompat);
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            /* renamed from: b */
            public void mo316b() {
                ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) this.f4262a.getAndSet(null);
                if (activityResultLauncher != null) {
                    activityResultLauncher.mo316b();
                }
            }
        };
    }

    private void registerOnPreAttachListener(@NonNull OnPreAttachedListener onPreAttachedListener) {
        if (this.mState >= 0) {
            onPreAttachedListener.mo2962a();
        } else {
            this.mOnPreAttachedListeners.add(onPreAttachedListener);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo != null) {
            animationInfo.f4295u = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        final SpecialEffectsController m3148f = SpecialEffectsController.m3148f(viewGroup, fragmentManager);
        m3148f.m3154h();
        if (z) {
            this.mHost.f4313d.post(new Runnable(this) { // from class: androidx.fragment.app.Fragment.4
                @Override // java.lang.Runnable
                public void run() {
                    m3148f.m3151c();
                }
            });
        } else {
            m3148f.m3151c();
        }
    }

    @NonNull
    public FragmentContainer createFragmentContainer() {
        return new FragmentContainer() { // from class: androidx.fragment.app.Fragment.5
            @Override // androidx.fragment.app.FragmentContainer
            @Nullable
            /* renamed from: b */
            public View mo2960b(int i2) {
                View view = Fragment.this.mView;
                if (view != null) {
                    return view.findViewById(i2);
                }
                StringBuilder m24u = C0000a.m24u("Fragment ");
                m24u.append(Fragment.this);
                m24u.append(" does not have a view");
                throw new IllegalStateException(m24u.toString());
            }

            @Override // androidx.fragment.app.FragmentContainer
            /* renamed from: c */
            public boolean mo2961c() {
                return Fragment.this.mView != null;
            }
        };
    }

    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            LoaderManager.m3251b(this).mo3252a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.m3060x(C0000a.m14k(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(@Nullable Object obj) {
        return super.equals(obj);
    }

    @Nullable
    public Fragment findFragmentByWho(@NonNull String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f4339c.m3105d(str);
    }

    @NonNull
    public String generateActivityResultKey() {
        StringBuilder m24u = C0000a.m24u("fragment_");
        m24u.append(this.mWho);
        m24u.append("_rq#");
        m24u.append(this.mNextLocalRequestCode.getAndIncrement());
        return m24u.toString();
    }

    @Nullable
    public final FragmentActivity getActivity() {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback == null) {
            return null;
        }
        return (FragmentActivity) fragmentHostCallback.f4311b;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null || (bool = animationInfo.f4290p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null || (bool = animationInfo.f4289o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        Objects.requireNonNull(animationInfo);
        return null;
    }

    @Nullable
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @NonNull
    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(C0000a.m13j("Fragment ", this, " has not been attached yet."));
    }

    @Nullable
    public Context getContext() {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback == null) {
            return null;
        }
        return fragmentHostCallback.f4312c;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NonNull
    @CallSuper
    public CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && FragmentManager.m2992Q(3)) {
            StringBuilder m24u = C0000a.m24u("Could not find Application instance from Context ");
            m24u.append(requireContext().getApplicationContext());
            m24u.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
            Log.d("FragmentManager", m24u.toString());
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
        if (application != null) {
            mutableCreationExtras.m3250b(ViewModelProvider.AndroidViewModelFactory.f4693g, application);
        }
        mutableCreationExtras.m3250b(SavedStateHandleSupport.f4666a, this);
        mutableCreationExtras.m3250b(SavedStateHandleSupport.f4667b, this);
        if (getArguments() != null) {
            mutableCreationExtras.m3250b(SavedStateHandleSupport.f4668c, getArguments());
        }
        return mutableCreationExtras;
    }

    @NonNull
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Application application = null;
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && FragmentManager.m2992Q(3)) {
                StringBuilder m24u = C0000a.m24u("Could not find Application instance from Context ");
                m24u.append(requireContext().getApplicationContext());
                m24u.append(", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                Log.d("FragmentManager", m24u.toString());
            }
            this.mDefaultFactory = new SavedStateViewModelFactory(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    @AnimRes
    public int getEnterAnim() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.f4276b;
    }

    @Nullable
    public Object getEnterTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.f4283i;
    }

    public SharedElementCallback getEnterTransitionCallback() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.f4291q;
    }

    @AnimRes
    public int getExitAnim() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.f4277c;
    }

    @Nullable
    public Object getExitTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.f4285k;
    }

    public SharedElementCallback getExitTransitionCallback() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.f4292r;
    }

    public View getFocusedView() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.f4294t;
    }

    @Nullable
    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    @Nullable
    public final Object getHost() {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback == null) {
            return null;
        }
        return fragmentHostCallback.mo2969e();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @NonNull
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NonNull
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @NonNull
    @Deprecated
    public LoaderManager getLoaderManager() {
        return LoaderManager.m3251b(this);
    }

    public int getNextTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.f4280f;
    }

    @Nullable
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @NonNull
    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException(C0000a.m13j("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return false;
        }
        return animationInfo.f4275a;
    }

    @AnimRes
    public int getPopEnterAnim() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.f4278d;
    }

    @AnimRes
    public int getPopExitAnim() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.f4279e;
    }

    public float getPostOnViewCreatedAlpha() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 1.0f;
        }
        return animationInfo.f4293s;
    }

    @Nullable
    public Object getReenterTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        Object obj = animationInfo.f4286l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @NonNull
    public final Resources getResources() {
        return requireContext().getResources();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public final boolean getRetainInstance() {
        FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f4520a;
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(this);
        FragmentStrictMode fragmentStrictMode2 = FragmentStrictMode.f4520a;
        fragmentStrictMode2.m3166c(getRetainInstanceUsageViolation);
        FragmentStrictMode.Policy m3164a = fragmentStrictMode2.m3164a(this);
        if (m3164a.f4532a.contains(FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode2.m3168f(m3164a, getClass(), GetRetainInstanceUsageViolation.class)) {
            fragmentStrictMode2.m3165b(m3164a, getRetainInstanceUsageViolation);
        }
        return this.mRetainInstance;
    }

    @Nullable
    public Object getReturnTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        Object obj = animationInfo.f4284j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    @NonNull
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f5958b;
    }

    @Nullable
    public Object getSharedElementEnterTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.f4287m;
    }

    @Nullable
    public Object getSharedElementReturnTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        Object obj = animationInfo.f4288n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @NonNull
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        AnimationInfo animationInfo = this.mAnimationInfo;
        return (animationInfo == null || (arrayList = animationInfo.f4281g) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        AnimationInfo animationInfo = this.mAnimationInfo;
        return (animationInfo == null || (arrayList = animationInfo.f4282h) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public final String getString(@StringRes int i2) {
        return getResources().getString(i2);
    }

    @Nullable
    public final String getTag() {
        return this.mTag;
    }

    @Nullable
    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public final int getTargetRequestCode() {
        FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f4520a;
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(this);
        FragmentStrictMode fragmentStrictMode2 = FragmentStrictMode.f4520a;
        fragmentStrictMode2.m3166c(getTargetFragmentRequestCodeUsageViolation);
        FragmentStrictMode.Policy m3164a = fragmentStrictMode2.m3164a(this);
        if (m3164a.f4532a.contains(FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode2.m3168f(m3164a, getClass(), GetTargetFragmentRequestCodeUsageViolation.class)) {
            fragmentStrictMode2.m3165b(m3164a, getTargetFragmentRequestCodeUsageViolation);
        }
        return this.mTargetRequestCode;
    }

    @NonNull
    public final CharSequence getText(@StringRes int i2) {
        return getResources().getText(i2);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @Nullable
    public View getView() {
        return this.mView;
    }

    @NonNull
    @MainThread
    public LifecycleOwner getViewLifecycleOwner() {
        FragmentViewLifecycleOwner fragmentViewLifecycleOwner = this.mViewLifecycleOwner;
        if (fragmentViewLifecycleOwner != null) {
            return fragmentViewLifecycleOwner;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @NonNull
    public LiveData<LifecycleOwner> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @NonNull
    public ViewModelStore getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        FragmentManagerViewModel fragmentManagerViewModel = this.mFragmentManager.f4335N;
        ViewModelStore viewModelStore = fragmentManagerViewModel.f4388f.get(this.mWho);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        fragmentManagerViewModel.f4388f.put(this.mWho, viewModelStore2);
        return viewModelStore2;
    }

    @SuppressLint
    @RestrictTo
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new FragmentManagerImpl();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (!this.mHidden) {
            FragmentManager fragmentManager = this.mFragmentManager;
            if (fragmentManager == null) {
                return false;
            }
            Fragment fragment = this.mParentFragment;
            Objects.requireNonNull(fragmentManager);
            if (!(fragment == null ? false : fragment.isHidden())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    @RestrictTo
    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        return this.mMenuVisible && ((fragmentManager = this.mFragmentManager) == null || fragmentManager.m3010S(this.mParentFragment));
    }

    public boolean isPostponed() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return false;
        }
        return animationInfo.f4295u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.m3012U();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.m3014W();
    }

    @CallSuper
    @MainThread
    @Deprecated
    public void onActivityCreated(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        if (FragmentManager.m2992Q(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i3 + " data: " + intent);
        }
    }

    @CallSuper
    @MainThread
    public void onAttach(@NonNull Context context) {
        this.mCalled = true;
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        Activity activity = fragmentHostCallback == null ? null : fragmentHostCallback.f4311b;
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @MainThread
    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    @CallSuper
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        this.mCalled = true;
    }

    @MainThread
    public boolean onContextItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @CallSuper
    @MainThread
    public void onCreate(@Nullable Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (fragmentManager.f4357u >= 1) {
            return;
        }
        fragmentManager.m3038k();
    }

    @Nullable
    @MainThread
    public Animation onCreateAnimation(int i2, boolean z, int i3) {
        return null;
    }

    @Nullable
    @MainThread
    public Animator onCreateAnimator(int i2, boolean z, int i3) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    @MainThread
    public void onCreateContextMenu(@NonNull ContextMenu contextMenu, @NonNull View view, @Nullable ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @MainThread
    @Deprecated
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
    }

    @Nullable
    @MainThread
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    @CallSuper
    @MainThread
    public void onDestroy() {
        this.mCalled = true;
    }

    @MainThread
    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @CallSuper
    @MainThread
    public void onDestroyView() {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onDetach() {
        this.mCalled = true;
    }

    @NonNull
    public LayoutInflater onGetLayoutInflater(@Nullable Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    @MainThread
    public void onHiddenChanged(boolean z) {
    }

    @CallSuper
    @UiThread
    public void onInflate(@NonNull Context context, @NonNull AttributeSet attributeSet, @Nullable Bundle bundle) {
        this.mCalled = true;
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        Activity activity = fragmentHostCallback == null ? null : fragmentHostCallback.f4311b;
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    @CallSuper
    @MainThread
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @MainThread
    @Deprecated
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @MainThread
    @Deprecated
    public void onOptionsMenuClosed(@NonNull Menu menu) {
    }

    @CallSuper
    @MainThread
    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @MainThread
    @Deprecated
    public void onPrepareOptionsMenu(@NonNull Menu menu) {
    }

    @MainThread
    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i2, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    @CallSuper
    @MainThread
    public void onResume() {
        this.mCalled = true;
    }

    @MainThread
    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    @CallSuper
    @MainThread
    public void onStart() {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onStop() {
        this.mCalled = true;
    }

    @MainThread
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
    }

    @CallSuper
    @MainThread
    public void onViewStateRestored(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.m3014W();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new SuperNotCalledException(C0000a.m13j("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f4328G = false;
        fragmentManager.f4329H = false;
        fragmentManager.f4335N.f4391i = false;
        fragmentManager.m3058v(4);
    }

    public void performAttach() {
        Iterator<OnPreAttachedListener> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo2962a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.m3020b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f4312c);
        if (!this.mCalled) {
            throw new SuperNotCalledException(C0000a.m13j("Fragment ", this, " did not call through to super.onAttach()"));
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        Iterator<FragmentOnAttachListener> it2 = fragmentManager.f4351o.iterator();
        while (it2.hasNext()) {
            it2.next().mo2967a(fragmentManager, this);
        }
        FragmentManager fragmentManager2 = this.mChildFragmentManager;
        fragmentManager2.f4328G = false;
        fragmentManager2.f4329H = false;
        fragmentManager2.f4335N.f4391i = false;
        fragmentManager2.m3058v(0);
    }

    public void performConfigurationChanged(@NonNull Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.m3034i(configuration);
    }

    public boolean performContextItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m3036j(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.m3014W();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo3187a(new LifecycleEventObserver() { // from class: androidx.fragment.app.Fragment.6
            @Override // androidx.lifecycle.LifecycleEventObserver
            /* renamed from: c */
            public void mo304c(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
                View view;
                if (event != Lifecycle.Event.ON_STOP || (view = Fragment.this.mView) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.mSavedStateRegistryController.m4136c(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new SuperNotCalledException(C0000a.m13j("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.m3199f(Lifecycle.Event.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z | this.mChildFragmentManager.m3040l(menu, menuInflater);
    }

    public void performCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.mChildFragmentManager.m3014W();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new FragmentViewLifecycleOwner(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView == null) {
            if (this.mViewLifecycleOwner.f4472d != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
        } else {
            this.mViewLifecycleOwner.m3144b();
            this.mView.setTag(C2507R.id.view_tree_lifecycle_owner, this.mViewLifecycleOwner);
            this.mView.setTag(C2507R.id.view_tree_view_model_store_owner, this.mViewLifecycleOwner);
            ViewTreeSavedStateRegistryOwner.m4138a(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.mo3216l(this.mViewLifecycleOwner);
        }
    }

    public void performDestroy() {
        this.mChildFragmentManager.m3042m();
        this.mLifecycleRegistry.m3199f(Lifecycle.Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new SuperNotCalledException(C0000a.m13j("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.m3058v(1);
        if (this.mView != null) {
            FragmentViewLifecycleOwner fragmentViewLifecycleOwner = this.mViewLifecycleOwner;
            fragmentViewLifecycleOwner.m3144b();
            if (fragmentViewLifecycleOwner.f4472d.f4601b.compareTo(Lifecycle.State.CREATED) >= 0) {
                this.mViewLifecycleOwner.m3143a(Lifecycle.Event.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new SuperNotCalledException(C0000a.m13j("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        LoaderManager.m3251b(this).mo3254d();
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new SuperNotCalledException(C0000a.m13j("Fragment ", this, " did not call through to super.onDetach()"));
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (fragmentManager.f4330I) {
            return;
        }
        fragmentManager.m3042m();
        this.mChildFragmentManager = new FragmentManagerImpl();
    }

    @NonNull
    public LayoutInflater performGetLayoutInflater(@Nullable Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.m3044n();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.m3046o(z);
    }

    public boolean performOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m3050q(menuItem);
    }

    public void performOptionsMenuClosed(@NonNull Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.m3052r(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.m3058v(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m3143a(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.m3199f(Lifecycle.Event.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new SuperNotCalledException(C0000a.m13j("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.m3056t(z);
    }

    public boolean performPrepareOptionsMenu(@NonNull Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        return z | this.mChildFragmentManager.m3057u(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean m3011T = this.mFragmentManager.m3011T(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != m3011T) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(m3011T);
            onPrimaryNavigationFragmentChanged(m3011T);
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.m3055s0();
            fragmentManager.m3054s(fragmentManager.f4361y);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.m3014W();
        this.mChildFragmentManager.m2994B(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new SuperNotCalledException(C0000a.m13j("Fragment ", this, " did not call through to super.onResume()"));
        }
        LifecycleRegistry lifecycleRegistry = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
        lifecycleRegistry.m3199f(event);
        if (this.mView != null) {
            LifecycleRegistry lifecycleRegistry2 = this.mViewLifecycleOwner.f4472d;
            lifecycleRegistry2.m3198e("handleLifecycleEvent");
            lifecycleRegistry2.m3200h(event.m3193b());
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f4328G = false;
        fragmentManager.f4329H = false;
        fragmentManager.f4335N.f4391i = false;
        fragmentManager.m3058v(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m4137d(bundle);
        bundle.putParcelable("android:support:fragments", this.mChildFragmentManager.m3033h0());
    }

    public void performStart() {
        this.mChildFragmentManager.m3014W();
        this.mChildFragmentManager.m2994B(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new SuperNotCalledException(C0000a.m13j("Fragment ", this, " did not call through to super.onStart()"));
        }
        LifecycleRegistry lifecycleRegistry = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_START;
        lifecycleRegistry.m3199f(event);
        if (this.mView != null) {
            LifecycleRegistry lifecycleRegistry2 = this.mViewLifecycleOwner.f4472d;
            lifecycleRegistry2.m3198e("handleLifecycleEvent");
            lifecycleRegistry2.m3200h(event.m3193b());
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f4328G = false;
        fragmentManager.f4329H = false;
        fragmentManager.f4335N.f4391i = false;
        fragmentManager.m3058v(5);
    }

    public void performStop() {
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f4329H = true;
        fragmentManager.f4335N.f4391i = true;
        fragmentManager.m3058v(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m3143a(Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.m3199f(Lifecycle.Event.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new SuperNotCalledException(C0000a.m13j("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.m3058v(2);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f4295u = true;
    }

    @NonNull
    @MainThread
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(@NonNull ActivityResultContract<I, O> activityResultContract, @NonNull ActivityResultCallback<O> activityResultCallback) {
        return prepareCallInternal(activityResultContract, new Function<Void, ActivityResultRegistry>() { // from class: androidx.fragment.app.Fragment.7
            @Override // androidx.arch.core.util.Function
            public ActivityResultRegistry apply(Void r3) {
                Fragment fragment = Fragment.this;
                Object obj = fragment.mHost;
                return obj instanceof ActivityResultRegistryOwner ? ((ActivityResultRegistryOwner) obj).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
            }
        }, activityResultCallback);
    }

    public void registerForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@NonNull String[] strArr, int i2) {
        if (this.mHost == null) {
            throw new IllegalStateException(C0000a.m13j("Fragment ", this, " not attached to Activity"));
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f4325D == null) {
            Objects.requireNonNull(parentFragmentManager.f4358v);
            return;
        }
        parentFragmentManager.f4326E.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i2));
        parentFragmentManager.f4325D.mo315a(strArr, null);
    }

    @NonNull
    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(C0000a.m13j("Fragment ", this, " not attached to an activity."));
    }

    @NonNull
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(C0000a.m13j("Fragment ", this, " does not have any arguments."));
    }

    @NonNull
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(C0000a.m13j("Fragment ", this, " not attached to a context."));
    }

    @NonNull
    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    @NonNull
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(C0000a.m13j("Fragment ", this, " not attached to a host."));
    }

    @NonNull
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(C0000a.m13j("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    @NonNull
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(C0000a.m13j("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState(@Nullable Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.m3031g0(parcelable);
        this.mChildFragmentManager.m3038k();
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            FragmentViewLifecycleOwner fragmentViewLifecycleOwner = this.mViewLifecycleOwner;
            fragmentViewLifecycleOwner.f4473e.m4136c(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new SuperNotCalledException(C0000a.m13j("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.m3143a(Lifecycle.Event.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f4290p = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f4289o = Boolean.valueOf(z);
    }

    public void setAnimations(@AnimRes int i2, @AnimRes int i3, @AnimRes int i4, @AnimRes int i5) {
        if (this.mAnimationInfo == null && i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            return;
        }
        ensureAnimationInfo().f4276b = i2;
        ensureAnimationInfo().f4277c = i3;
        ensureAnimationInfo().f4278d = i4;
        ensureAnimationInfo().f4279e = i5;
    }

    public void setArguments(@Nullable Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(@Nullable SharedElementCallback sharedElementCallback) {
        ensureAnimationInfo().f4291q = sharedElementCallback;
    }

    public void setEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().f4283i = obj;
    }

    public void setExitSharedElementCallback(@Nullable SharedElementCallback sharedElementCallback) {
        ensureAnimationInfo().f4292r = sharedElementCallback;
    }

    public void setExitTransition(@Nullable Object obj) {
        ensureAnimationInfo().f4285k = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f4294t = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.mo2972h();
        }
    }

    public void setInitialSavedState(@Nullable SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (savedState == null || (bundle = savedState.f4296b) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo2972h();
            }
        }
    }

    public void setNextTransition(int i2) {
        if (this.mAnimationInfo == null && i2 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f4280f = i2;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f4275a = z;
    }

    public void setPostOnViewCreatedAlpha(float f2) {
        ensureAnimationInfo().f4293s = f2;
    }

    public void setReenterTransition(@Nullable Object obj) {
        ensureAnimationInfo().f4286l = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void setRetainInstance(boolean z) {
        FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f4520a;
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(this);
        FragmentStrictMode fragmentStrictMode2 = FragmentStrictMode.f4520a;
        fragmentStrictMode2.m3166c(setRetainInstanceUsageViolation);
        FragmentStrictMode.Policy m3164a = fragmentStrictMode2.m3164a(this);
        if (m3164a.f4532a.contains(FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode2.m3168f(m3164a, getClass(), SetRetainInstanceUsageViolation.class)) {
            fragmentStrictMode2.m3165b(m3164a, setRetainInstanceUsageViolation);
        }
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            fragmentManager.f4335N.m3066d(this);
        } else {
            fragmentManager.f4335N.m3069g(this);
        }
    }

    public void setReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().f4284j = obj;
    }

    public void setSharedElementEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().f4287m = obj;
    }

    public void setSharedElementNames(@Nullable ArrayList<String> arrayList, @Nullable ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        AnimationInfo animationInfo = this.mAnimationInfo;
        animationInfo.f4281g = arrayList;
        animationInfo.f4282h = arrayList2;
    }

    public void setSharedElementReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().f4288n = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void setTargetFragment(@Nullable Fragment fragment, int i2) {
        if (fragment != null) {
            FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f4520a;
            SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(this, fragment, i2);
            FragmentStrictMode fragmentStrictMode2 = FragmentStrictMode.f4520a;
            fragmentStrictMode2.m3166c(setTargetFragmentUsageViolation);
            FragmentStrictMode.Policy m3164a = fragmentStrictMode2.m3164a(this);
            if (m3164a.f4532a.contains(FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode2.m3168f(m3164a, getClass(), SetTargetFragmentUsageViolation.class)) {
                fragmentStrictMode2.m3165b(m3164a, setTargetFragmentUsageViolation);
            }
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException(C0000a.m13j("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment(false)) {
            if (fragment2.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void setUserVisibleHint(boolean z) {
        FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f4520a;
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(this, z);
        FragmentStrictMode fragmentStrictMode2 = FragmentStrictMode.f4520a;
        fragmentStrictMode2.m3166c(setUserVisibleHintViolation);
        FragmentStrictMode.Policy m3164a = fragmentStrictMode2.m3164a(this);
        if (m3164a.f4532a.contains(FragmentStrictMode.Flag.DETECT_SET_USER_VISIBLE_HINT) && fragmentStrictMode2.m3168f(m3164a, getClass(), SetUserVisibleHintViolation.class)) {
            fragmentStrictMode2.m3165b(m3164a, setUserVisibleHintViolation);
        }
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.m3015X(fragmentManager.m3030g(this));
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 5 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback != null) {
            return fragmentHostCallback.mo2971g(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint Intent intent, int i2) {
        startActivityForResult(intent, i2, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint IntentSender intentSender, int i2, @Nullable Intent intent, int i3, int i4, int i5, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2 = intent;
        if (this.mHost == null) {
            throw new IllegalStateException(C0000a.m13j("Fragment ", this, " not attached to Activity"));
        }
        if (FragmentManager.m2992Q(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i2 + " IntentSender: " + intentSender + " fillInIntent: " + intent2 + " options: " + bundle);
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f4324C == null) {
            FragmentHostCallback<?> fragmentHostCallback = parentFragmentManager.f4358v;
            Objects.requireNonNull(fragmentHostCallback);
            if (i2 != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            ActivityCompat.m1523s(fragmentHostCallback.f4311b, intentSender, i2, intent, i3, i4, i5, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (FragmentManager.m2992Q(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        IntentSenderRequest.Builder builder = new IntentSenderRequest.Builder(intentSender);
        builder.f269b = intent2;
        builder.f271d = i4;
        builder.f270c = i3;
        IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intentSender, intent2, i3, i4);
        parentFragmentManager.f4326E.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i2));
        if (FragmentManager.m2992Q(2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        parentFragmentManager.f4324C.mo315a(intentSenderRequest, null);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f4295u) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f4295u = false;
        } else if (Looper.myLooper() != this.mHost.f4313d.getLooper()) {
            this.mHost.f4313d.postAtFrontOfQueue(new Runnable() { // from class: androidx.fragment.app.Fragment.3
                @Override // java.lang.Runnable
                public void run() {
                    Fragment.this.callStartTransitionListener(false);
                }
            });
        } else {
            callStartTransitionListener(true);
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @SuppressLint
    public static class SavedState implements Parcelable {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.fragment.app.Fragment.SavedState.1
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: b */
        public final Bundle f4296b;

        public SavedState(Bundle bundle) {
            this.f4296b = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i2) {
            parcel.writeBundle(this.f4296b);
        }

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f4296b = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    private Fragment getTargetFragment(boolean z) {
        String str;
        if (z) {
            FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f4520a;
            GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(this);
            FragmentStrictMode fragmentStrictMode2 = FragmentStrictMode.f4520a;
            fragmentStrictMode2.m3166c(getTargetFragmentUsageViolation);
            FragmentStrictMode.Policy m3164a = fragmentStrictMode2.m3164a(this);
            if (m3164a.f4532a.contains(FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode2.m3168f(m3164a, getClass(), GetTargetFragmentUsageViolation.class)) {
                fragmentStrictMode2.m3165b(m3164a, getTargetFragmentUsageViolation);
            }
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.m2997E(str);
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str, @Nullable Bundle bundle) {
        try {
            Fragment newInstance = FragmentFactory.m2976c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.setArguments(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e2) {
            throw new InstantiationException(C0000a.m16m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (java.lang.InstantiationException e3) {
            throw new InstantiationException(C0000a.m16m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (NoSuchMethodException e4) {
            throw new InstantiationException(C0000a.m16m("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e4);
        } catch (InvocationTargetException e5) {
            throw new InstantiationException(C0000a.m16m("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e5);
        }
    }

    @NonNull
    public final String getString(@StringRes int i2, @Nullable Object... objArr) {
        return getResources().getString(i2, objArr);
    }

    public final void postponeEnterTransition(long j2, @NonNull TimeUnit timeUnit) {
        ensureAnimationInfo().f4295u = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        Handler handler = fragmentManager != null ? fragmentManager.f4358v.f4313d : new Handler(Looper.getMainLooper());
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j2));
    }

    @NonNull
    @MainThread
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(@NonNull ActivityResultContract<I, O> activityResultContract, @NonNull final ActivityResultRegistry activityResultRegistry, @NonNull ActivityResultCallback<O> activityResultCallback) {
        return prepareCallInternal(activityResultContract, new Function<Void, ActivityResultRegistry>(this) { // from class: androidx.fragment.app.Fragment.8
            @Override // androidx.arch.core.util.Function
            public ActivityResultRegistry apply(Void r1) {
                return activityResultRegistry;
            }
        }, activityResultCallback);
    }

    public void startActivity(@SuppressLint Intent intent, @Nullable Bundle bundle) {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback == null) {
            throw new IllegalStateException(C0000a.m13j("Fragment ", this, " not attached to Activity"));
        }
        ContextCompat.m1676i(fragmentHostCallback.f4312c, intent, bundle);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint Intent intent, int i2, @Nullable Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(C0000a.m13j("Fragment ", this, " not attached to Activity"));
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f4323B == null) {
            FragmentHostCallback<?> fragmentHostCallback = parentFragmentManager.f4358v;
            Objects.requireNonNull(fragmentHostCallback);
            if (i2 != -1) {
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
            ContextCompat.m1676i(fragmentHostCallback.f4312c, intent, bundle);
            return;
        }
        parentFragmentManager.f4326E.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i2));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        parentFragmentManager.f4323B.mo315a(intent, null);
    }

    @NonNull
    @RestrictTo
    @Deprecated
    public LayoutInflater getLayoutInflater(@Nullable Bundle bundle) {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback != null) {
            LayoutInflater mo2970f = fragmentHostCallback.mo2970f();
            mo2970f.setFactory2(this.mChildFragmentManager.f4342f);
            return mo2970f;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @CallSuper
    @MainThread
    @Deprecated
    public void onAttach(@NonNull Activity activity) {
        this.mCalled = true;
    }

    @CallSuper
    @UiThread
    @Deprecated
    public void onInflate(@NonNull Activity activity, @NonNull AttributeSet attributeSet, @Nullable Bundle bundle) {
        this.mCalled = true;
    }

    private void restoreViewState() {
        if (FragmentManager.m2992Q(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    @ContentView
    public Fragment(@LayoutRes int i2) {
        this();
        this.mContentLayoutId = i2;
    }
}
