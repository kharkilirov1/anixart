package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0041b;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentLifecycleCallbacksDispatcher;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import com.swiftsoft.anixartd.C2507R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class FragmentManager implements FragmentResultOwner {

    /* renamed from: A */
    public SpecialEffectsControllerFactory f4322A;

    /* renamed from: B */
    public ActivityResultLauncher<Intent> f4323B;

    /* renamed from: C */
    public ActivityResultLauncher<IntentSenderRequest> f4324C;

    /* renamed from: D */
    public ActivityResultLauncher<String[]> f4325D;

    /* renamed from: E */
    public ArrayDeque<LaunchedFragmentInfo> f4326E;

    /* renamed from: F */
    public boolean f4327F;

    /* renamed from: G */
    public boolean f4328G;

    /* renamed from: H */
    public boolean f4329H;

    /* renamed from: I */
    public boolean f4330I;

    /* renamed from: J */
    public boolean f4331J;

    /* renamed from: K */
    public ArrayList<BackStackRecord> f4332K;

    /* renamed from: L */
    public ArrayList<Boolean> f4333L;

    /* renamed from: M */
    public ArrayList<Fragment> f4334M;

    /* renamed from: N */
    public FragmentManagerViewModel f4335N;

    /* renamed from: O */
    public Runnable f4336O;

    /* renamed from: b */
    public boolean f4338b;

    /* renamed from: d */
    public ArrayList<BackStackRecord> f4340d;

    /* renamed from: e */
    public ArrayList<Fragment> f4341e;

    /* renamed from: g */
    public OnBackPressedDispatcher f4343g;

    /* renamed from: m */
    public ArrayList<OnBackStackChangedListener> f4349m;

    /* renamed from: p */
    public final Consumer<Configuration> f4352p;

    /* renamed from: q */
    public final Consumer<Integer> f4353q;

    /* renamed from: r */
    public final Consumer<MultiWindowModeChangedInfo> f4354r;

    /* renamed from: s */
    public final Consumer<PictureInPictureModeChangedInfo> f4355s;

    /* renamed from: t */
    public final MenuProvider f4356t;

    /* renamed from: u */
    public int f4357u;

    /* renamed from: v */
    public FragmentHostCallback<?> f4358v;

    /* renamed from: w */
    public FragmentContainer f4359w;

    /* renamed from: x */
    public Fragment f4360x;

    /* renamed from: y */
    @Nullable
    public Fragment f4361y;

    /* renamed from: z */
    public FragmentFactory f4362z;

    /* renamed from: a */
    public final ArrayList<OpGenerator> f4337a = new ArrayList<>();

    /* renamed from: c */
    public final FragmentStore f4339c = new FragmentStore();

    /* renamed from: f */
    public final FragmentLayoutInflaterFactory f4342f = new FragmentLayoutInflaterFactory(this);

    /* renamed from: h */
    public final OnBackPressedCallback f4344h = new OnBackPressedCallback(false) { // from class: androidx.fragment.app.FragmentManager.1
        @Override // androidx.activity.OnBackPressedCallback
        /* renamed from: d */
        public void mo308d() {
            FragmentManager fragmentManager = FragmentManager.this;
            fragmentManager.m2994B(true);
            if (fragmentManager.f4344h.f221a) {
                fragmentManager.m3017Z();
            } else {
                fragmentManager.f4343g.m311b();
            }
        }
    };

    /* renamed from: i */
    public final AtomicInteger f4345i = new AtomicInteger();

    /* renamed from: j */
    public final Map<String, BackStackState> f4346j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    public final Map<String, Bundle> f4347k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l */
    public final Map<String, LifecycleAwareResultListener> f4348l = Collections.synchronizedMap(new HashMap());

    /* renamed from: n */
    public final FragmentLifecycleCallbacksDispatcher f4350n = new FragmentLifecycleCallbacksDispatcher(this);

    /* renamed from: o */
    public final CopyOnWriteArrayList<FragmentOnAttachListener> f4351o = new CopyOnWriteArrayList<>();

    /* renamed from: androidx.fragment.app.FragmentManager$6 */
    class C03626 implements LifecycleEventObserver {
        @Override // androidx.lifecycle.LifecycleEventObserver
        /* renamed from: c */
        public void mo304c(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                throw null;
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                throw null;
            }
        }
    }

    public interface BackStackEntry {
        int getId();
    }

    public class ClearBackStackState implements OpGenerator {
        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        /* renamed from: a */
        public boolean mo2935a(@NonNull ArrayList<BackStackRecord> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            throw null;
        }
    }

    public static class FragmentIntentSenderContract extends ActivityResultContract<IntentSenderRequest, ActivityResult> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @NonNull
        /* renamed from: a */
        public Intent mo317a(@NonNull Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequest2 = intentSenderRequest;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = intentSenderRequest2.f265c;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    IntentSender intentSender = intentSenderRequest2.f264b;
                    IntentSenderRequest.Builder builder = new IntentSenderRequest.Builder(intentSender);
                    builder.f269b = null;
                    int i2 = intentSenderRequest2.f267e;
                    int i3 = intentSenderRequest2.f266d;
                    builder.f271d = i2;
                    builder.f270c = i3;
                    intentSenderRequest2 = new IntentSenderRequest(intentSender, null, i3, i2);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest2);
            if (FragmentManager.m2992Q(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NonNull
        /* renamed from: c */
        public ActivityResult mo318c(int i2, @Nullable Intent intent) {
            return new ActivityResult(i2, intent);
        }
    }

    public static abstract class FragmentLifecycleCallbacks {
        @Deprecated
        public void onFragmentActivityCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        public void onFragmentAttached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        public void onFragmentCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        public void onFragmentDestroyed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentDetached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentPaused(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentPreAttached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        public void onFragmentPreCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        public void onFragmentResumed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentSaveInstanceState(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Bundle bundle) {
        }

        public void onFragmentStarted(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentStopped(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentViewCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle) {
        }

        public void onFragmentViewDestroyed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }
    }

    public static class LifecycleAwareResultListener implements FragmentResultListener {
    }

    public interface OnBackStackChangedListener {
        @MainThread
        /* renamed from: a */
        void mo3064a();
    }

    public interface OpGenerator {
        /* renamed from: a */
        boolean mo2935a(@NonNull ArrayList<BackStackRecord> arrayList, @NonNull ArrayList<Boolean> arrayList2);
    }

    public class PopBackStackState implements OpGenerator {

        /* renamed from: a */
        public final String f4373a = null;

        /* renamed from: b */
        public final int f4374b;

        /* renamed from: c */
        public final int f4375c;

        public PopBackStackState(@Nullable String str, int i2, int i3) {
            this.f4374b = i2;
            this.f4375c = i3;
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        /* renamed from: a */
        public boolean mo2935a(@NonNull ArrayList<BackStackRecord> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f4361y;
            if (fragment == null || this.f4374b >= 0 || this.f4373a != null || !fragment.getChildFragmentManager().m3017Z()) {
                return FragmentManager.this.m3021b0(arrayList, arrayList2, this.f4373a, this.f4374b, this.f4375c);
            }
            return false;
        }
    }

    public class RestoreBackStackState implements OpGenerator {
        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        /* renamed from: a */
        public boolean mo2935a(@NonNull ArrayList<BackStackRecord> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            throw null;
        }
    }

    public class SaveBackStackState implements OpGenerator {
        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        /* renamed from: a */
        public boolean mo2935a(@NonNull ArrayList<BackStackRecord> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentManager() {
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f4352p = new Consumer(this) { // from class: androidx.fragment.app.b

            /* renamed from: c */
            public final /* synthetic */ FragmentManager f4519c;

            {
                this.f4519c = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (objArr) {
                    case 0:
                        this.f4519c.m3034i((Configuration) obj);
                        break;
                    case 1:
                        FragmentManager fragmentManager = this.f4519c;
                        Objects.requireNonNull(fragmentManager);
                        if (((Integer) obj).intValue() == 80) {
                            fragmentManager.m3044n();
                            break;
                        }
                        break;
                    case 2:
                        FragmentManager fragmentManager2 = this.f4519c;
                        Objects.requireNonNull(fragmentManager2);
                        fragmentManager2.m3046o(((MultiWindowModeChangedInfo) obj).f3145a);
                        break;
                    default:
                        FragmentManager fragmentManager3 = this.f4519c;
                        Objects.requireNonNull(fragmentManager3);
                        fragmentManager3.m3056t(((PictureInPictureModeChangedInfo) obj).f3262a);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f4353q = new Consumer(this) { // from class: androidx.fragment.app.b

            /* renamed from: c */
            public final /* synthetic */ FragmentManager f4519c;

            {
                this.f4519c = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        this.f4519c.m3034i((Configuration) obj);
                        break;
                    case 1:
                        FragmentManager fragmentManager = this.f4519c;
                        Objects.requireNonNull(fragmentManager);
                        if (((Integer) obj).intValue() == 80) {
                            fragmentManager.m3044n();
                            break;
                        }
                        break;
                    case 2:
                        FragmentManager fragmentManager2 = this.f4519c;
                        Objects.requireNonNull(fragmentManager2);
                        fragmentManager2.m3046o(((MultiWindowModeChangedInfo) obj).f3145a);
                        break;
                    default:
                        FragmentManager fragmentManager3 = this.f4519c;
                        Objects.requireNonNull(fragmentManager3);
                        fragmentManager3.m3056t(((PictureInPictureModeChangedInfo) obj).f3262a);
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f4354r = new Consumer(this) { // from class: androidx.fragment.app.b

            /* renamed from: c */
            public final /* synthetic */ FragmentManager f4519c;

            {
                this.f4519c = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        this.f4519c.m3034i((Configuration) obj);
                        break;
                    case 1:
                        FragmentManager fragmentManager = this.f4519c;
                        Objects.requireNonNull(fragmentManager);
                        if (((Integer) obj).intValue() == 80) {
                            fragmentManager.m3044n();
                            break;
                        }
                        break;
                    case 2:
                        FragmentManager fragmentManager2 = this.f4519c;
                        Objects.requireNonNull(fragmentManager2);
                        fragmentManager2.m3046o(((MultiWindowModeChangedInfo) obj).f3145a);
                        break;
                    default:
                        FragmentManager fragmentManager3 = this.f4519c;
                        Objects.requireNonNull(fragmentManager3);
                        fragmentManager3.m3056t(((PictureInPictureModeChangedInfo) obj).f3262a);
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f4355s = new Consumer(this) { // from class: androidx.fragment.app.b

            /* renamed from: c */
            public final /* synthetic */ FragmentManager f4519c;

            {
                this.f4519c = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        this.f4519c.m3034i((Configuration) obj);
                        break;
                    case 1:
                        FragmentManager fragmentManager = this.f4519c;
                        Objects.requireNonNull(fragmentManager);
                        if (((Integer) obj).intValue() == 80) {
                            fragmentManager.m3044n();
                            break;
                        }
                        break;
                    case 2:
                        FragmentManager fragmentManager2 = this.f4519c;
                        Objects.requireNonNull(fragmentManager2);
                        fragmentManager2.m3046o(((MultiWindowModeChangedInfo) obj).f3145a);
                        break;
                    default:
                        FragmentManager fragmentManager3 = this.f4519c;
                        Objects.requireNonNull(fragmentManager3);
                        fragmentManager3.m3056t(((PictureInPictureModeChangedInfo) obj).f3262a);
                        break;
                }
            }
        };
        this.f4356t = new MenuProvider() { // from class: androidx.fragment.app.FragmentManager.2
            @Override // androidx.core.view.MenuProvider
            /* renamed from: a */
            public boolean mo2130a(@NonNull MenuItem menuItem) {
                return FragmentManager.this.m3050q(menuItem);
            }

            @Override // androidx.core.view.MenuProvider
            /* renamed from: b */
            public void mo2131b(@NonNull Menu menu) {
                FragmentManager.this.m3052r(menu);
            }

            @Override // androidx.core.view.MenuProvider
            /* renamed from: c */
            public void mo2132c(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
                FragmentManager.this.m3040l(menu, menuInflater);
            }

            @Override // androidx.core.view.MenuProvider
            /* renamed from: d */
            public void mo2133d(@NonNull Menu menu) {
                FragmentManager.this.m3057u(menu);
            }
        };
        this.f4357u = -1;
        this.f4362z = new FragmentFactory() { // from class: androidx.fragment.app.FragmentManager.3
            @Override // androidx.fragment.app.FragmentFactory
            @NonNull
            /* renamed from: a */
            public Fragment mo2977a(@NonNull ClassLoader classLoader, @NonNull String str) {
                FragmentHostCallback<?> fragmentHostCallback = FragmentManager.this.f4358v;
                Context context = fragmentHostCallback.f4312c;
                Objects.requireNonNull(fragmentHostCallback);
                return Fragment.instantiate(context, str, null);
            }
        };
        this.f4322A = new SpecialEffectsControllerFactory(this) { // from class: androidx.fragment.app.FragmentManager.4
            @Override // androidx.fragment.app.SpecialEffectsControllerFactory
            @NonNull
            /* renamed from: a */
            public SpecialEffectsController mo3063a(@NonNull ViewGroup viewGroup) {
                return new DefaultSpecialEffectsController(viewGroup);
            }
        };
        this.f4326E = new ArrayDeque<>();
        this.f4336O = new Runnable() { // from class: androidx.fragment.app.FragmentManager.5
            @Override // java.lang.Runnable
            public void run() {
                FragmentManager.this.m2994B(true);
            }
        };
    }

    @RestrictTo
    /* renamed from: Q */
    public static boolean m2992Q(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    /* renamed from: A */
    public final void m2993A(boolean z) {
        if (this.f4338b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f4358v == null) {
            if (!this.f4330I) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f4358v.f4313d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && m3012U()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f4332K == null) {
            this.f4332K = new ArrayList<>();
            this.f4333L = new ArrayList<>();
        }
    }

    /* renamed from: B */
    public boolean m2994B(boolean z) {
        boolean z2;
        m2993A(z);
        boolean z3 = false;
        while (true) {
            ArrayList<BackStackRecord> arrayList = this.f4332K;
            ArrayList<Boolean> arrayList2 = this.f4333L;
            synchronized (this.f4337a) {
                if (this.f4337a.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size = this.f4337a.size();
                        z2 = false;
                        for (int i2 = 0; i2 < size; i2++) {
                            z2 |= this.f4337a.get(i2).mo2935a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z2) {
                m3055s0();
                m3059w();
                this.f4339c.m3103b();
                return z3;
            }
            this.f4338b = true;
            try {
                m3029f0(this.f4332K, this.f4333L);
                m3026e();
                z3 = true;
            } catch (Throwable th) {
                m3026e();
                throw th;
            }
        }
    }

    /* renamed from: C */
    public void m2995C(@NonNull OpGenerator opGenerator, boolean z) {
        if (z && (this.f4358v == null || this.f4330I)) {
            return;
        }
        m2993A(z);
        ((BackStackRecord) opGenerator).mo2935a(this.f4332K, this.f4333L);
        this.f4338b = true;
        try {
            m3029f0(this.f4332K, this.f4333L);
            m3026e();
            m3055s0();
            m3059w();
            this.f4339c.m3103b();
        } catch (Throwable th) {
            m3026e();
            throw th;
        }
    }

    /* renamed from: D */
    public final void m2996D(@NonNull ArrayList<BackStackRecord> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<BackStackRecord> arrayList3;
        int i4;
        ViewGroup viewGroup;
        Fragment fragment;
        int i5;
        int i6;
        boolean z;
        ArrayList<BackStackRecord> arrayList4 = arrayList;
        ArrayList<Boolean> arrayList5 = arrayList2;
        int i7 = i3;
        boolean z2 = arrayList4.get(i2).f4441p;
        ArrayList<Fragment> arrayList6 = this.f4334M;
        if (arrayList6 == null) {
            this.f4334M = new ArrayList<>();
        } else {
            arrayList6.clear();
        }
        this.f4334M.addAll(this.f4339c.m3109h());
        Fragment fragment2 = this.f4361y;
        boolean z3 = false;
        int i8 = i2;
        while (true) {
            int i9 = 1;
            if (i8 >= i7) {
                this.f4334M.clear();
                if (z2 || this.f4357u < 1) {
                    arrayList3 = arrayList;
                    i4 = i3;
                } else {
                    int i10 = i2;
                    i4 = i3;
                    while (true) {
                        arrayList3 = arrayList;
                        if (i10 < i4) {
                            Iterator<FragmentTransaction.C0373Op> it = arrayList3.get(i10).f4426a.iterator();
                            while (it.hasNext()) {
                                Fragment fragment3 = it.next().f4443b;
                                if (fragment3 != null && fragment3.mFragmentManager != null) {
                                    this.f4339c.m3110i(m3030g(fragment3));
                                }
                            }
                            i10++;
                        }
                    }
                }
                for (int i11 = i2; i11 < i4; i11++) {
                    BackStackRecord backStackRecord = arrayList3.get(i11);
                    if (arrayList2.get(i11).booleanValue()) {
                        backStackRecord.m2947r(-1);
                        boolean z4 = true;
                        int size = backStackRecord.f4426a.size() - 1;
                        while (size >= 0) {
                            FragmentTransaction.C0373Op c0373Op = backStackRecord.f4426a.get(size);
                            Fragment fragment4 = c0373Op.f4443b;
                            if (fragment4 != null) {
                                fragment4.mBeingSaved = backStackRecord.f4200t;
                                fragment4.setPopDirection(z4);
                                int i12 = backStackRecord.f4431f;
                                int i13 = 4097;
                                if (i12 == 4097) {
                                    i13 = 8194;
                                } else if (i12 != 8194) {
                                    i13 = i12 != 8197 ? i12 != 4099 ? i12 != 4100 ? 0 : 8197 : 4099 : 4100;
                                }
                                fragment4.setNextTransition(i13);
                                fragment4.setSharedElementNames(backStackRecord.f4440o, backStackRecord.f4439n);
                            }
                            switch (c0373Op.f4442a) {
                                case 1:
                                    fragment4.setAnimations(c0373Op.f4445d, c0373Op.f4446e, c0373Op.f4447f, c0373Op.f4448g);
                                    backStackRecord.f4197q.m3039k0(fragment4, true);
                                    backStackRecord.f4197q.m3027e0(fragment4);
                                    break;
                                case 2:
                                default:
                                    StringBuilder m24u = C0000a.m24u("Unknown cmd: ");
                                    m24u.append(c0373Op.f4442a);
                                    throw new IllegalArgumentException(m24u.toString());
                                case 3:
                                    fragment4.setAnimations(c0373Op.f4445d, c0373Op.f4446e, c0373Op.f4447f, c0373Op.f4448g);
                                    backStackRecord.f4197q.m3018a(fragment4);
                                    break;
                                case 4:
                                    fragment4.setAnimations(c0373Op.f4445d, c0373Op.f4446e, c0373Op.f4447f, c0373Op.f4448g);
                                    backStackRecord.f4197q.m3047o0(fragment4);
                                    break;
                                case 5:
                                    fragment4.setAnimations(c0373Op.f4445d, c0373Op.f4446e, c0373Op.f4447f, c0373Op.f4448g);
                                    backStackRecord.f4197q.m3039k0(fragment4, true);
                                    backStackRecord.f4197q.m3008P(fragment4);
                                    break;
                                case 6:
                                    fragment4.setAnimations(c0373Op.f4445d, c0373Op.f4446e, c0373Op.f4447f, c0373Op.f4448g);
                                    backStackRecord.f4197q.m3022c(fragment4);
                                    break;
                                case 7:
                                    fragment4.setAnimations(c0373Op.f4445d, c0373Op.f4446e, c0373Op.f4447f, c0373Op.f4448g);
                                    backStackRecord.f4197q.m3039k0(fragment4, true);
                                    backStackRecord.f4197q.m3032h(fragment4);
                                    break;
                                case 8:
                                    backStackRecord.f4197q.m3043m0(null);
                                    break;
                                case 9:
                                    backStackRecord.f4197q.m3043m0(fragment4);
                                    break;
                                case 10:
                                    backStackRecord.f4197q.m3041l0(fragment4, c0373Op.f4449h);
                                    break;
                            }
                            size--;
                            z4 = true;
                        }
                    } else {
                        backStackRecord.m2947r(1);
                        int size2 = backStackRecord.f4426a.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            FragmentTransaction.C0373Op c0373Op2 = backStackRecord.f4426a.get(i14);
                            Fragment fragment5 = c0373Op2.f4443b;
                            if (fragment5 != null) {
                                fragment5.mBeingSaved = backStackRecord.f4200t;
                                fragment5.setPopDirection(false);
                                fragment5.setNextTransition(backStackRecord.f4431f);
                                fragment5.setSharedElementNames(backStackRecord.f4439n, backStackRecord.f4440o);
                            }
                            switch (c0373Op2.f4442a) {
                                case 1:
                                    fragment5.setAnimations(c0373Op2.f4445d, c0373Op2.f4446e, c0373Op2.f4447f, c0373Op2.f4448g);
                                    backStackRecord.f4197q.m3039k0(fragment5, false);
                                    backStackRecord.f4197q.m3018a(fragment5);
                                    break;
                                case 2:
                                default:
                                    StringBuilder m24u2 = C0000a.m24u("Unknown cmd: ");
                                    m24u2.append(c0373Op2.f4442a);
                                    throw new IllegalArgumentException(m24u2.toString());
                                case 3:
                                    fragment5.setAnimations(c0373Op2.f4445d, c0373Op2.f4446e, c0373Op2.f4447f, c0373Op2.f4448g);
                                    backStackRecord.f4197q.m3027e0(fragment5);
                                    break;
                                case 4:
                                    fragment5.setAnimations(c0373Op2.f4445d, c0373Op2.f4446e, c0373Op2.f4447f, c0373Op2.f4448g);
                                    backStackRecord.f4197q.m3008P(fragment5);
                                    break;
                                case 5:
                                    fragment5.setAnimations(c0373Op2.f4445d, c0373Op2.f4446e, c0373Op2.f4447f, c0373Op2.f4448g);
                                    backStackRecord.f4197q.m3039k0(fragment5, false);
                                    backStackRecord.f4197q.m3047o0(fragment5);
                                    break;
                                case 6:
                                    fragment5.setAnimations(c0373Op2.f4445d, c0373Op2.f4446e, c0373Op2.f4447f, c0373Op2.f4448g);
                                    backStackRecord.f4197q.m3032h(fragment5);
                                    break;
                                case 7:
                                    fragment5.setAnimations(c0373Op2.f4445d, c0373Op2.f4446e, c0373Op2.f4447f, c0373Op2.f4448g);
                                    backStackRecord.f4197q.m3039k0(fragment5, false);
                                    backStackRecord.f4197q.m3022c(fragment5);
                                    break;
                                case 8:
                                    backStackRecord.f4197q.m3043m0(fragment5);
                                    break;
                                case 9:
                                    backStackRecord.f4197q.m3043m0(null);
                                    break;
                                case 10:
                                    backStackRecord.f4197q.m3041l0(fragment5, c0373Op2.f4450i);
                                    break;
                            }
                        }
                    }
                }
                boolean booleanValue = arrayList2.get(i4 - 1).booleanValue();
                for (int i15 = i2; i15 < i4; i15++) {
                    BackStackRecord backStackRecord2 = arrayList3.get(i15);
                    if (booleanValue) {
                        for (int size3 = backStackRecord2.f4426a.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment6 = backStackRecord2.f4426a.get(size3).f4443b;
                            if (fragment6 != null) {
                                m3030g(fragment6).m3092k();
                            }
                        }
                    } else {
                        Iterator<FragmentTransaction.C0373Op> it2 = backStackRecord2.f4426a.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment7 = it2.next().f4443b;
                            if (fragment7 != null) {
                                m3030g(fragment7).m3092k();
                            }
                        }
                    }
                }
                m3013V(this.f4357u, true);
                HashSet hashSet = new HashSet();
                for (int i16 = i2; i16 < i4; i16++) {
                    Iterator<FragmentTransaction.C0373Op> it3 = arrayList3.get(i16).f4426a.iterator();
                    while (it3.hasNext()) {
                        Fragment fragment8 = it3.next().f4443b;
                        if (fragment8 != null && (viewGroup = fragment8.mContainer) != null) {
                            hashSet.add(SpecialEffectsController.m3149g(viewGroup, m3007O()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    SpecialEffectsController specialEffectsController = (SpecialEffectsController) it4.next();
                    specialEffectsController.f4490d = booleanValue;
                    specialEffectsController.m3154h();
                    specialEffectsController.m3151c();
                }
                for (int i17 = i2; i17 < i4; i17++) {
                    BackStackRecord backStackRecord3 = arrayList3.get(i17);
                    if (arrayList2.get(i17).booleanValue() && backStackRecord3.f4199s >= 0) {
                        backStackRecord3.f4199s = -1;
                    }
                    Objects.requireNonNull(backStackRecord3);
                }
                if (!z3 || this.f4349m == null) {
                    return;
                }
                for (int i18 = 0; i18 < this.f4349m.size(); i18++) {
                    this.f4349m.get(i18).mo3064a();
                }
                return;
            }
            BackStackRecord backStackRecord4 = arrayList4.get(i8);
            int i19 = 3;
            if (arrayList5.get(i8).booleanValue()) {
                int i20 = 1;
                ArrayList<Fragment> arrayList7 = this.f4334M;
                int size4 = backStackRecord4.f4426a.size() - 1;
                while (size4 >= 0) {
                    FragmentTransaction.C0373Op c0373Op3 = backStackRecord4.f4426a.get(size4);
                    int i21 = c0373Op3.f4442a;
                    if (i21 != i20) {
                        if (i21 != 3) {
                            switch (i21) {
                                case 8:
                                    fragment = null;
                                    fragment2 = fragment;
                                    break;
                                case 9:
                                    fragment = c0373Op3.f4443b;
                                    fragment2 = fragment;
                                    break;
                                case 10:
                                    c0373Op3.f4450i = c0373Op3.f4449h;
                                    break;
                            }
                            size4--;
                            i20 = 1;
                        }
                        arrayList7.add(c0373Op3.f4443b);
                        size4--;
                        i20 = 1;
                    }
                    arrayList7.remove(c0373Op3.f4443b);
                    size4--;
                    i20 = 1;
                }
            } else {
                ArrayList<Fragment> arrayList8 = this.f4334M;
                int i22 = 0;
                while (i22 < backStackRecord4.f4426a.size()) {
                    FragmentTransaction.C0373Op c0373Op4 = backStackRecord4.f4426a.get(i22);
                    int i23 = c0373Op4.f4442a;
                    if (i23 != i9) {
                        if (i23 == 2) {
                            Fragment fragment9 = c0373Op4.f4443b;
                            int i24 = fragment9.mContainerId;
                            int size5 = arrayList8.size() - 1;
                            boolean z5 = false;
                            while (size5 >= 0) {
                                Fragment fragment10 = arrayList8.get(size5);
                                if (fragment10.mContainerId != i24) {
                                    i6 = i24;
                                } else if (fragment10 == fragment9) {
                                    i6 = i24;
                                    z5 = true;
                                } else {
                                    if (fragment10 == fragment2) {
                                        i6 = i24;
                                        z = true;
                                        backStackRecord4.f4426a.add(i22, new FragmentTransaction.C0373Op(9, fragment10, true));
                                        i22++;
                                        fragment2 = null;
                                    } else {
                                        i6 = i24;
                                        z = true;
                                    }
                                    FragmentTransaction.C0373Op c0373Op5 = new FragmentTransaction.C0373Op(3, fragment10, z);
                                    c0373Op5.f4445d = c0373Op4.f4445d;
                                    c0373Op5.f4447f = c0373Op4.f4447f;
                                    c0373Op5.f4446e = c0373Op4.f4446e;
                                    c0373Op5.f4448g = c0373Op4.f4448g;
                                    backStackRecord4.f4426a.add(i22, c0373Op5);
                                    arrayList8.remove(fragment10);
                                    i22++;
                                }
                                size5--;
                                i24 = i6;
                            }
                            if (z5) {
                                backStackRecord4.f4426a.remove(i22);
                                i22--;
                            } else {
                                c0373Op4.f4442a = 1;
                                c0373Op4.f4444c = true;
                                arrayList8.add(fragment9);
                            }
                        } else if (i23 == i19 || i23 == 6) {
                            arrayList8.remove(c0373Op4.f4443b);
                            Fragment fragment11 = c0373Op4.f4443b;
                            if (fragment11 == fragment2) {
                                backStackRecord4.f4426a.add(i22, new FragmentTransaction.C0373Op(9, fragment11));
                                i22++;
                                i5 = 1;
                                fragment2 = null;
                                i22 += i5;
                                i9 = 1;
                                i19 = 3;
                            }
                        } else if (i23 != 7) {
                            if (i23 == 8) {
                                backStackRecord4.f4426a.add(i22, new FragmentTransaction.C0373Op(9, fragment2, true));
                                c0373Op4.f4444c = true;
                                i22++;
                                fragment2 = c0373Op4.f4443b;
                            }
                        }
                        i5 = 1;
                        i22 += i5;
                        i9 = 1;
                        i19 = 3;
                    }
                    i5 = 1;
                    arrayList8.add(c0373Op4.f4443b);
                    i22 += i5;
                    i9 = 1;
                    i19 = 3;
                }
            }
            z3 = z3 || backStackRecord4.f4432g;
            i8++;
            arrayList4 = arrayList;
            arrayList5 = arrayList2;
            i7 = i3;
        }
    }

    @Nullable
    /* renamed from: E */
    public Fragment m2997E(@NonNull String str) {
        return this.f4339c.m3104c(str);
    }

    /* renamed from: F */
    public final int m2998F(@Nullable String str, int i2, boolean z) {
        ArrayList<BackStackRecord> arrayList = this.f4340d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i2 < 0) {
            if (z) {
                return 0;
            }
            return this.f4340d.size() - 1;
        }
        int size = this.f4340d.size() - 1;
        while (size >= 0) {
            BackStackRecord backStackRecord = this.f4340d.get(size);
            if ((str != null && str.equals(backStackRecord.f4434i)) || (i2 >= 0 && i2 == backStackRecord.f4199s)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.f4340d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            int i3 = size - 1;
            BackStackRecord backStackRecord2 = this.f4340d.get(i3);
            if ((str == null || !str.equals(backStackRecord2.f4434i)) && (i2 < 0 || i2 != backStackRecord2.f4199s)) {
                return size;
            }
            size = i3;
        }
        return size;
    }

    @Nullable
    /* renamed from: G */
    public Fragment m2999G(@IdRes int i2) {
        FragmentStore fragmentStore = this.f4339c;
        int size = fragmentStore.f4420a.size();
        while (true) {
            size--;
            if (size < 0) {
                for (FragmentStateManager fragmentStateManager : fragmentStore.f4421b.values()) {
                    if (fragmentStateManager != null) {
                        Fragment fragment = fragmentStateManager.f4408c;
                        if (fragment.mFragmentId == i2) {
                            return fragment;
                        }
                    }
                }
                return null;
            }
            Fragment fragment2 = fragmentStore.f4420a.get(size);
            if (fragment2 != null && fragment2.mFragmentId == i2) {
                return fragment2;
            }
        }
    }

    @Nullable
    /* renamed from: H */
    public Fragment m3000H(@Nullable String str) {
        FragmentStore fragmentStore = this.f4339c;
        Objects.requireNonNull(fragmentStore);
        if (str != null) {
            int size = fragmentStore.f4420a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Fragment fragment = fragmentStore.f4420a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (FragmentStateManager fragmentStateManager : fragmentStore.f4421b.values()) {
                if (fragmentStateManager != null) {
                    Fragment fragment2 = fragmentStateManager.f4408c;
                    if (str.equals(fragment2.mTag)) {
                        return fragment2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: I */
    public final void m3001I() {
        Iterator it = ((HashSet) m3028f()).iterator();
        while (it.hasNext()) {
            SpecialEffectsController specialEffectsController = (SpecialEffectsController) it.next();
            if (specialEffectsController.f4491e) {
                if (m2992Q(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                specialEffectsController.f4491e = false;
                specialEffectsController.m3151c();
            }
        }
    }

    /* renamed from: J */
    public int m3002J() {
        ArrayList<BackStackRecord> arrayList = this.f4340d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Nullable
    /* renamed from: K */
    public Fragment m3003K(@NonNull Bundle bundle, @NonNull String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment m3104c = this.f4339c.m3104c(string);
        if (m3104c != null) {
            return m3104c;
        }
        m3051q0(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        throw null;
    }

    /* renamed from: L */
    public final ViewGroup m3004L(@NonNull Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f4359w.mo2961c()) {
            View mo2960b = this.f4359w.mo2960b(fragment.mContainerId);
            if (mo2960b instanceof ViewGroup) {
                return (ViewGroup) mo2960b;
            }
        }
        return null;
    }

    @NonNull
    /* renamed from: M */
    public FragmentFactory m3005M() {
        Fragment fragment = this.f4360x;
        return fragment != null ? fragment.mFragmentManager.m3005M() : this.f4362z;
    }

    @NonNull
    /* renamed from: N */
    public List<Fragment> m3006N() {
        return this.f4339c.m3109h();
    }

    @NonNull
    /* renamed from: O */
    public SpecialEffectsControllerFactory m3007O() {
        Fragment fragment = this.f4360x;
        return fragment != null ? fragment.mFragmentManager.m3007O() : this.f4322A;
    }

    /* renamed from: P */
    public void m3008P(@NonNull Fragment fragment) {
        if (m2992Q(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        m3045n0(fragment);
    }

    /* renamed from: R */
    public final boolean m3009R(@NonNull Fragment fragment) {
        boolean z;
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mChildFragmentManager;
        Iterator it = ((ArrayList) fragmentManager.f4339c.m3107f()).iterator();
        boolean z2 = false;
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null) {
                z2 = fragmentManager.m3009R(fragment2);
            }
            if (z2) {
                z = true;
                break;
            }
        }
        return z;
    }

    /* renamed from: S */
    public boolean m3010S(@Nullable Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* renamed from: T */
    public boolean m3011T(@Nullable Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.f4361y) && m3011T(fragmentManager.f4360x);
    }

    /* renamed from: U */
    public boolean m3012U() {
        return this.f4328G || this.f4329H;
    }

    /* renamed from: V */
    public void m3013V(int i2, boolean z) {
        FragmentHostCallback<?> fragmentHostCallback;
        if (this.f4358v == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.f4357u) {
            this.f4357u = i2;
            FragmentStore fragmentStore = this.f4339c;
            Iterator<Fragment> it = fragmentStore.f4420a.iterator();
            while (it.hasNext()) {
                FragmentStateManager fragmentStateManager = fragmentStore.f4421b.get(it.next().mWho);
                if (fragmentStateManager != null) {
                    fragmentStateManager.m3092k();
                }
            }
            Iterator<FragmentStateManager> it2 = fragmentStore.f4421b.values().iterator();
            while (true) {
                boolean z2 = false;
                if (!it2.hasNext()) {
                    break;
                }
                FragmentStateManager next = it2.next();
                if (next != null) {
                    next.m3092k();
                    Fragment fragment = next.f4408c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        z2 = true;
                    }
                    if (z2) {
                        if (fragment.mBeingSaved && !fragmentStore.f4422c.containsKey(fragment.mWho)) {
                            next.m3097p();
                        }
                        fragmentStore.m3111j(next);
                    }
                }
            }
            m3049p0();
            if (this.f4327F && (fragmentHostCallback = this.f4358v) != null && this.f4357u == 7) {
                fragmentHostCallback.mo2972h();
                this.f4327F = false;
            }
        }
    }

    /* renamed from: W */
    public void m3014W() {
        if (this.f4358v == null) {
            return;
        }
        this.f4328G = false;
        this.f4329H = false;
        this.f4335N.f4391i = false;
        for (Fragment fragment : this.f4339c.m3109h()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* renamed from: X */
    public void m3015X(@NonNull FragmentStateManager fragmentStateManager) {
        Fragment fragment = fragmentStateManager.f4408c;
        if (fragment.mDeferStart) {
            if (this.f4338b) {
                this.f4331J = true;
            } else {
                fragment.mDeferStart = false;
                fragmentStateManager.m3092k();
            }
        }
    }

    /* renamed from: Y */
    public void m3016Y(int i2, int i3, boolean z) {
        if (i2 < 0) {
            throw new IllegalArgumentException(C0000a.m7d("Bad id: ", i2));
        }
        m3062z(new PopBackStackState(null, i2, i3), z);
    }

    /* renamed from: Z */
    public boolean m3017Z() {
        return m3019a0(null, -1, 0);
    }

    /* renamed from: a */
    public FragmentStateManager m3018a(@NonNull Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.m3163d(fragment, str);
        }
        if (m2992Q(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        FragmentStateManager m3030g = m3030g(fragment);
        fragment.mFragmentManager = this;
        this.f4339c.m3110i(m3030g);
        if (!fragment.mDetached) {
            this.f4339c.m3102a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (m3009R(fragment)) {
                this.f4327F = true;
            }
        }
        return m3030g;
    }

    /* renamed from: a0 */
    public final boolean m3019a0(@Nullable String str, int i2, int i3) {
        m2994B(false);
        m2993A(true);
        Fragment fragment = this.f4361y;
        if (fragment != null && i2 < 0 && fragment.getChildFragmentManager().m3017Z()) {
            return true;
        }
        boolean m3021b0 = m3021b0(this.f4332K, this.f4333L, null, i2, i3);
        if (m3021b0) {
            this.f4338b = true;
            try {
                m3029f0(this.f4332K, this.f4333L);
            } finally {
                m3026e();
            }
        }
        m3055s0();
        m3059w();
        this.f4339c.m3103b();
        return m3021b0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint
    /* renamed from: b */
    public void m3020b(@NonNull FragmentHostCallback<?> fragmentHostCallback, @NonNull FragmentContainer fragmentContainer, @Nullable final Fragment fragment) {
        if (this.f4358v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f4358v = fragmentHostCallback;
        this.f4359w = fragmentContainer;
        this.f4360x = fragment;
        if (fragment != null) {
            this.f4351o.add(new FragmentOnAttachListener(this) { // from class: androidx.fragment.app.FragmentManager.7
                @Override // androidx.fragment.app.FragmentOnAttachListener
                /* renamed from: a */
                public void mo2967a(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment2) {
                    fragment.onAttachFragment(fragment2);
                }
            });
        } else if (fragmentHostCallback instanceof FragmentOnAttachListener) {
            this.f4351o.add((FragmentOnAttachListener) fragmentHostCallback);
        }
        if (this.f4360x != null) {
            m3055s0();
        }
        if (fragmentHostCallback instanceof OnBackPressedDispatcherOwner) {
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) fragmentHostCallback;
            OnBackPressedDispatcher f215c = onBackPressedDispatcherOwner.getF215c();
            this.f4343g = f215c;
            LifecycleOwner lifecycleOwner = onBackPressedDispatcherOwner;
            if (fragment != null) {
                lifecycleOwner = fragment;
            }
            f215c.m310a(lifecycleOwner, this.f4344h);
        }
        if (fragment != null) {
            FragmentManagerViewModel fragmentManagerViewModel = fragment.mFragmentManager.f4335N;
            FragmentManagerViewModel fragmentManagerViewModel2 = fragmentManagerViewModel.f4387e.get(fragment.mWho);
            if (fragmentManagerViewModel2 == null) {
                fragmentManagerViewModel2 = new FragmentManagerViewModel(fragmentManagerViewModel.f4389g);
                fragmentManagerViewModel.f4387e.put(fragment.mWho, fragmentManagerViewModel2);
            }
            this.f4335N = fragmentManagerViewModel2;
        } else if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            ViewModelStore store = ((ViewModelStoreOwner) fragmentHostCallback).getViewModelStore();
            ViewModelProvider.Factory factory = FragmentManagerViewModel.f4385j;
            Intrinsics.m32179h(store, "store");
            this.f4335N = (FragmentManagerViewModel) new ViewModelProvider(store, factory, CreationExtras.Empty.f4705b).m3244a(FragmentManagerViewModel.class);
        } else {
            this.f4335N = new FragmentManagerViewModel(false);
        }
        this.f4335N.f4391i = m3012U();
        this.f4339c.f4423d = this.f4335N;
        Object obj = this.f4358v;
        if ((obj instanceof SavedStateRegistryOwner) && fragment == null) {
            SavedStateRegistry savedStateRegistry = ((SavedStateRegistryOwner) obj).getSavedStateRegistry();
            savedStateRegistry.m4132c("android:support:fragments", new C0041b(this, 2));
            Bundle m4130a = savedStateRegistry.m4130a("android:support:fragments");
            if (m4130a != null) {
                m3031g0(m4130a);
            }
        }
        Object obj2 = this.f4358v;
        if (obj2 instanceof ActivityResultRegistryOwner) {
            ActivityResultRegistry activityResultRegistry = ((ActivityResultRegistryOwner) obj2).getActivityResultRegistry();
            String m14k = C0000a.m14k("FragmentManager:", fragment != null ? C0000a.m20q(new StringBuilder(), fragment.mWho, ":") : "");
            this.f4323B = activityResultRegistry.m321d(C0000a.m14k(m14k, "StartActivityForResult"), new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() { // from class: androidx.fragment.app.FragmentManager.8
                @Override // androidx.activity.result.ActivityResultCallback
                /* renamed from: a */
                public void mo314a(ActivityResult activityResult) {
                    ActivityResult activityResult2 = activityResult;
                    LaunchedFragmentInfo pollFirst = FragmentManager.this.f4326E.pollFirst();
                    if (pollFirst == null) {
                        Log.w("FragmentManager", "No Activities were started for result for " + this);
                        return;
                    }
                    String str = pollFirst.f4371b;
                    int i2 = pollFirst.f4372c;
                    Fragment m3105d = FragmentManager.this.f4339c.m3105d(str);
                    if (m3105d != null) {
                        m3105d.onActivityResult(i2, activityResult2.f239b, activityResult2.f240c);
                        return;
                    }
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                }
            });
            this.f4324C = activityResultRegistry.m321d(C0000a.m14k(m14k, "StartIntentSenderForResult"), new FragmentIntentSenderContract(), new ActivityResultCallback<ActivityResult>() { // from class: androidx.fragment.app.FragmentManager.9
                @Override // androidx.activity.result.ActivityResultCallback
                /* renamed from: a */
                public void mo314a(ActivityResult activityResult) {
                    ActivityResult activityResult2 = activityResult;
                    LaunchedFragmentInfo pollFirst = FragmentManager.this.f4326E.pollFirst();
                    if (pollFirst == null) {
                        Log.w("FragmentManager", "No IntentSenders were started for " + this);
                        return;
                    }
                    String str = pollFirst.f4371b;
                    int i2 = pollFirst.f4372c;
                    Fragment m3105d = FragmentManager.this.f4339c.m3105d(str);
                    if (m3105d != null) {
                        m3105d.onActivityResult(i2, activityResult2.f239b, activityResult2.f240c);
                        return;
                    }
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                }
            });
            this.f4325D = activityResultRegistry.m321d(C0000a.m14k(m14k, "RequestPermissions"), new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback<Map<String, Boolean>>() { // from class: androidx.fragment.app.FragmentManager.10
                @Override // androidx.activity.result.ActivityResultCallback
                @SuppressLint
                /* renamed from: a */
                public void mo314a(Map<String, Boolean> map) {
                    Map<String, Boolean> map2 = map;
                    String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
                    ArrayList arrayList = new ArrayList(map2.values());
                    int[] iArr = new int[arrayList.size()];
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                    }
                    LaunchedFragmentInfo pollFirst = FragmentManager.this.f4326E.pollFirst();
                    if (pollFirst == null) {
                        Log.w("FragmentManager", "No permissions were requested for " + this);
                        return;
                    }
                    String str = pollFirst.f4371b;
                    int i3 = pollFirst.f4372c;
                    Fragment m3105d = FragmentManager.this.f4339c.m3105d(str);
                    if (m3105d != null) {
                        m3105d.onRequestPermissionsResult(i3, strArr, iArr);
                        return;
                    }
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                }
            });
        }
        Object obj3 = this.f4358v;
        if (obj3 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider) obj3).addOnConfigurationChangedListener(this.f4352p);
        }
        Object obj4 = this.f4358v;
        if (obj4 instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider) obj4).addOnTrimMemoryListener(this.f4353q);
        }
        Object obj5 = this.f4358v;
        if (obj5 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) obj5).addOnMultiWindowModeChangedListener(this.f4354r);
        }
        Object obj6 = this.f4358v;
        if (obj6 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) obj6).addOnPictureInPictureModeChangedListener(this.f4355s);
        }
        Object obj7 = this.f4358v;
        if ((obj7 instanceof MenuHost) && fragment == null) {
            ((MenuHost) obj7).addMenuProvider(this.f4356t);
        }
    }

    /* renamed from: b0 */
    public boolean m3021b0(@NonNull ArrayList<BackStackRecord> arrayList, @NonNull ArrayList<Boolean> arrayList2, @Nullable String str, int i2, int i3) {
        int m2998F = m2998F(str, i2, (i3 & 1) != 0);
        if (m2998F < 0) {
            return false;
        }
        for (int size = this.f4340d.size() - 1; size >= m2998F; size--) {
            arrayList.add(this.f4340d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* renamed from: c */
    public void m3022c(@NonNull Fragment fragment) {
        if (m2992Q(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f4339c.m3102a(fragment);
            if (m2992Q(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (m3009R(fragment)) {
                this.f4327F = true;
            }
        }
    }

    /* renamed from: c0 */
    public void m3023c0(@NonNull Bundle bundle, @NonNull String str, @NonNull Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
        } else {
            m3051q0(new IllegalStateException(C0000a.m13j("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    @NonNull
    /* renamed from: d */
    public FragmentTransaction m3024d() {
        return new BackStackRecord(this);
    }

    /* renamed from: d0 */
    public void m3025d0(@NonNull FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z) {
        this.f4350n.f4318a.add(new FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder(fragmentLifecycleCallbacks, z));
    }

    /* renamed from: e */
    public final void m3026e() {
        this.f4338b = false;
        this.f4333L.clear();
        this.f4332K.clear();
    }

    /* renamed from: e0 */
    public void m3027e0(@NonNull Fragment fragment) {
        if (m2992Q(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            this.f4339c.m3112k(fragment);
            if (m3009R(fragment)) {
                this.f4327F = true;
            }
            fragment.mRemoving = true;
            m3045n0(fragment);
        }
    }

    /* renamed from: f */
    public final Set<SpecialEffectsController> m3028f() {
        HashSet hashSet = new HashSet();
        Iterator it = ((ArrayList) this.f4339c.m3106e()).iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((FragmentStateManager) it.next()).f4408c.mContainer;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.m3149g(viewGroup, m3007O()));
            }
        }
        return hashSet;
    }

    /* renamed from: f0 */
    public final void m3029f0(@NonNull ArrayList<BackStackRecord> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).f4441p) {
                if (i3 != i2) {
                    m2996D(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).f4441p) {
                        i3++;
                    }
                }
                m2996D(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            m2996D(arrayList, arrayList2, i3, size);
        }
    }

    @NonNull
    /* renamed from: g */
    public FragmentStateManager m3030g(@NonNull Fragment fragment) {
        FragmentStateManager m3108g = this.f4339c.m3108g(fragment.mWho);
        if (m3108g != null) {
            return m3108g;
        }
        FragmentStateManager fragmentStateManager = new FragmentStateManager(this.f4350n, this.f4339c, fragment);
        fragmentStateManager.m3094m(this.f4358v.f4312c.getClassLoader());
        fragmentStateManager.f4410e = this.f4357u;
        return fragmentStateManager;
    }

    /* renamed from: g0 */
    public void m3031g0(@Nullable Parcelable parcelable) {
        int i2;
        FragmentStateManager fragmentStateManager;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f4358v.f4312c.getClassLoader());
                this.f4347k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f4358v.f4312c.getClassLoader());
                arrayList.add((FragmentState) bundle.getParcelable("state"));
            }
        }
        FragmentStore fragmentStore = this.f4339c;
        fragmentStore.f4422c.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FragmentState fragmentState = (FragmentState) it.next();
            fragmentStore.f4422c.put(fragmentState.f4394c, fragmentState);
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.f4339c.f4421b.clear();
        Iterator<String> it2 = fragmentManagerState.f4377b.iterator();
        while (it2.hasNext()) {
            FragmentState m3113l = this.f4339c.m3113l(it2.next(), null);
            if (m3113l != null) {
                Fragment fragment = this.f4335N.f4386d.get(m3113l.f4394c);
                if (fragment != null) {
                    if (m2992Q(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    fragmentStateManager = new FragmentStateManager(this.f4350n, this.f4339c, fragment, m3113l);
                } else {
                    fragmentStateManager = new FragmentStateManager(this.f4350n, this.f4339c, this.f4358v.f4312c.getClassLoader(), m3005M(), m3113l);
                }
                Fragment fragment2 = fragmentStateManager.f4408c;
                fragment2.mFragmentManager = this;
                if (m2992Q(2)) {
                    StringBuilder m24u = C0000a.m24u("restoreSaveState: active (");
                    m24u.append(fragment2.mWho);
                    m24u.append("): ");
                    m24u.append(fragment2);
                    Log.v("FragmentManager", m24u.toString());
                }
                fragmentStateManager.m3094m(this.f4358v.f4312c.getClassLoader());
                this.f4339c.m3110i(fragmentStateManager);
                fragmentStateManager.f4410e = this.f4357u;
            }
        }
        FragmentManagerViewModel fragmentManagerViewModel = this.f4335N;
        Objects.requireNonNull(fragmentManagerViewModel);
        Iterator it3 = new ArrayList(fragmentManagerViewModel.f4386d.values()).iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Fragment fragment3 = (Fragment) it3.next();
            if ((this.f4339c.f4421b.get(fragment3.mWho) != null ? 1 : 0) == 0) {
                if (m2992Q(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.f4377b);
                }
                this.f4335N.m3069g(fragment3);
                fragment3.mFragmentManager = this;
                FragmentStateManager fragmentStateManager2 = new FragmentStateManager(this.f4350n, this.f4339c, fragment3);
                fragmentStateManager2.f4410e = 1;
                fragmentStateManager2.m3092k();
                fragment3.mRemoving = true;
                fragmentStateManager2.m3092k();
            }
        }
        FragmentStore fragmentStore2 = this.f4339c;
        ArrayList<String> arrayList2 = fragmentManagerState.f4378c;
        fragmentStore2.f4420a.clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                Fragment m3104c = fragmentStore2.m3104c(str3);
                if (m3104c == null) {
                    throw new IllegalStateException(C0000a.m16m("No instantiated fragment for (", str3, ")"));
                }
                if (m2992Q(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + m3104c);
                }
                fragmentStore2.m3102a(m3104c);
            }
        }
        if (fragmentManagerState.f4379d != null) {
            this.f4340d = new ArrayList<>(fragmentManagerState.f4379d.length);
            int i3 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f4379d;
                if (i3 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i3];
                Objects.requireNonNull(backStackRecordState);
                BackStackRecord backStackRecord = new BackStackRecord(this);
                backStackRecordState.m2950a(backStackRecord);
                backStackRecord.f4199s = backStackRecordState.f4207h;
                for (int i4 = 0; i4 < backStackRecordState.f4202c.size(); i4++) {
                    String str4 = backStackRecordState.f4202c.get(i4);
                    if (str4 != null) {
                        backStackRecord.f4426a.get(i4).f4443b = this.f4339c.m3104c(str4);
                    }
                }
                backStackRecord.m2947r(1);
                if (m2992Q(2)) {
                    StringBuilder m25v = C0000a.m25v("restoreAllState: back stack #", i3, " (index ");
                    m25v.append(backStackRecord.f4199s);
                    m25v.append("): ");
                    m25v.append(backStackRecord);
                    Log.v("FragmentManager", m25v.toString());
                    PrintWriter printWriter = new PrintWriter(new LogWriter("FragmentManager"));
                    backStackRecord.m2949t("  ", printWriter, false);
                    printWriter.close();
                }
                this.f4340d.add(backStackRecord);
                i3++;
            }
        } else {
            this.f4340d = null;
        }
        this.f4345i.set(fragmentManagerState.f4380e);
        String str5 = fragmentManagerState.f4381f;
        if (str5 != null) {
            Fragment m3104c2 = this.f4339c.m3104c(str5);
            this.f4361y = m3104c2;
            m3054s(m3104c2);
        }
        ArrayList<String> arrayList3 = fragmentManagerState.f4382g;
        if (arrayList3 != null) {
            while (i2 < arrayList3.size()) {
                this.f4346j.put(arrayList3.get(i2), fragmentManagerState.f4383h.get(i2));
                i2++;
            }
        }
        this.f4326E = new ArrayDeque<>(fragmentManagerState.f4384i);
    }

    /* renamed from: h */
    public void m3032h(@NonNull Fragment fragment) {
        if (m2992Q(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (m2992Q(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f4339c.m3112k(fragment);
            if (m3009R(fragment)) {
                this.f4327F = true;
            }
            m3045n0(fragment);
        }
    }

    @NonNull
    /* renamed from: h0 */
    public Bundle m3033h0() {
        BackStackRecordState[] backStackRecordStateArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle = new Bundle();
        m3001I();
        m3061y();
        m2994B(true);
        this.f4328G = true;
        this.f4335N.f4391i = true;
        FragmentStore fragmentStore = this.f4339c;
        Objects.requireNonNull(fragmentStore);
        ArrayList<String> arrayList2 = new ArrayList<>(fragmentStore.f4421b.size());
        for (FragmentStateManager fragmentStateManager : fragmentStore.f4421b.values()) {
            if (fragmentStateManager != null) {
                Fragment fragment = fragmentStateManager.f4408c;
                fragmentStateManager.m3097p();
                arrayList2.add(fragment.mWho);
                if (m2992Q(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        FragmentStore fragmentStore2 = this.f4339c;
        Objects.requireNonNull(fragmentStore2);
        ArrayList arrayList3 = new ArrayList(fragmentStore2.f4422c.values());
        if (!arrayList3.isEmpty()) {
            FragmentStore fragmentStore3 = this.f4339c;
            synchronized (fragmentStore3.f4420a) {
                backStackRecordStateArr = null;
                if (fragmentStore3.f4420a.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(fragmentStore3.f4420a.size());
                    Iterator<Fragment> it = fragmentStore3.f4420a.iterator();
                    while (it.hasNext()) {
                        Fragment next = it.next();
                        arrayList.add(next.mWho);
                        if (m2992Q(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                        }
                    }
                }
            }
            ArrayList<BackStackRecord> arrayList4 = this.f4340d;
            if (arrayList4 != null && (size = arrayList4.size()) > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i2 = 0; i2 < size; i2++) {
                    backStackRecordStateArr[i2] = new BackStackRecordState(this.f4340d.get(i2));
                    if (m2992Q(2)) {
                        StringBuilder m25v = C0000a.m25v("saveAllState: adding back stack #", i2, ": ");
                        m25v.append(this.f4340d.get(i2));
                        Log.v("FragmentManager", m25v.toString());
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f4377b = arrayList2;
            fragmentManagerState.f4378c = arrayList;
            fragmentManagerState.f4379d = backStackRecordStateArr;
            fragmentManagerState.f4380e = this.f4345i.get();
            Fragment fragment2 = this.f4361y;
            if (fragment2 != null) {
                fragmentManagerState.f4381f = fragment2.mWho;
            }
            fragmentManagerState.f4382g.addAll(this.f4346j.keySet());
            fragmentManagerState.f4383h.addAll(this.f4346j.values());
            fragmentManagerState.f4384i = new ArrayList<>(this.f4326E);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f4347k.keySet()) {
                bundle.putBundle(C0000a.m14k("result_", str), this.f4347k.get(str));
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                FragmentState fragmentState = (FragmentState) it2.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", fragmentState);
                StringBuilder m24u = C0000a.m24u("fragment_");
                m24u.append(fragmentState.f4394c);
                bundle.putBundle(m24u.toString(), bundle2);
            }
        } else if (m2992Q(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    /* renamed from: i */
    public void m3034i(@NonNull Configuration configuration) {
        for (Fragment fragment : this.f4339c.m3109h()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    @Nullable
    /* renamed from: i0 */
    public Fragment.SavedState m3035i0(@NonNull Fragment fragment) {
        Bundle m3096o;
        FragmentStateManager m3108g = this.f4339c.m3108g(fragment.mWho);
        if (m3108g == null || !m3108g.f4408c.equals(fragment)) {
            m3051q0(new IllegalStateException(C0000a.m13j("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
        if (m3108g.f4408c.mState <= -1 || (m3096o = m3108g.m3096o()) == null) {
            return null;
        }
        return new Fragment.SavedState(m3096o);
    }

    /* renamed from: j */
    public boolean m3036j(@NonNull MenuItem menuItem) {
        if (this.f4357u < 1) {
            return false;
        }
        for (Fragment fragment : this.f4339c.m3109h()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j0 */
    public void m3037j0() {
        synchronized (this.f4337a) {
            boolean z = true;
            if (this.f4337a.size() != 1) {
                z = false;
            }
            if (z) {
                this.f4358v.f4313d.removeCallbacks(this.f4336O);
                this.f4358v.f4313d.post(this.f4336O);
                m3055s0();
            }
        }
    }

    /* renamed from: k */
    public void m3038k() {
        this.f4328G = false;
        this.f4329H = false;
        this.f4335N.f4391i = false;
        m3058v(1);
    }

    /* renamed from: k0 */
    public void m3039k0(@NonNull Fragment fragment, boolean z) {
        ViewGroup m3004L = m3004L(fragment);
        if (m3004L == null || !(m3004L instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) m3004L).setDrawDisappearingViewsLast(!z);
    }

    /* renamed from: l */
    public boolean m3040l(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (this.f4357u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f4339c.m3109h()) {
            if (fragment != null && m3010S(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f4341e != null) {
            for (int i2 = 0; i2 < this.f4341e.size(); i2++) {
                Fragment fragment2 = this.f4341e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f4341e = arrayList;
        return z;
    }

    /* renamed from: l0 */
    public void m3041l0(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        if (fragment.equals(m2997E(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: m */
    public void m3042m() {
        boolean z = true;
        this.f4330I = true;
        m2994B(true);
        m3061y();
        FragmentHostCallback<?> fragmentHostCallback = this.f4358v;
        if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            z = this.f4339c.f4423d.f4390h;
        } else {
            Context context = fragmentHostCallback.f4312c;
            if (context instanceof Activity) {
                z = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z) {
            Iterator<BackStackState> it = this.f4346j.values().iterator();
            while (it.hasNext()) {
                for (String str : it.next().f4215b) {
                    FragmentManagerViewModel fragmentManagerViewModel = this.f4339c.f4423d;
                    Objects.requireNonNull(fragmentManagerViewModel);
                    if (m2992Q(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    fragmentManagerViewModel.m3068f(str);
                }
            }
        }
        m3058v(-1);
        Object obj = this.f4358v;
        if (obj instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider) obj).removeOnTrimMemoryListener(this.f4353q);
        }
        Object obj2 = this.f4358v;
        if (obj2 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider) obj2).removeOnConfigurationChangedListener(this.f4352p);
        }
        Object obj3 = this.f4358v;
        if (obj3 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) obj3).removeOnMultiWindowModeChangedListener(this.f4354r);
        }
        Object obj4 = this.f4358v;
        if (obj4 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) obj4).removeOnPictureInPictureModeChangedListener(this.f4355s);
        }
        Object obj5 = this.f4358v;
        if (obj5 instanceof MenuHost) {
            ((MenuHost) obj5).removeMenuProvider(this.f4356t);
        }
        this.f4358v = null;
        this.f4359w = null;
        this.f4360x = null;
        if (this.f4343g != null) {
            this.f4344h.m309e();
            this.f4343g = null;
        }
        ActivityResultLauncher<Intent> activityResultLauncher = this.f4323B;
        if (activityResultLauncher != null) {
            activityResultLauncher.mo316b();
            this.f4324C.mo316b();
            this.f4325D.mo316b();
        }
    }

    /* renamed from: m0 */
    public void m3043m0(@Nullable Fragment fragment) {
        if (fragment == null || (fragment.equals(m2997E(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f4361y;
            this.f4361y = fragment;
            m3054s(fragment2);
            m3054s(this.f4361y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: n */
    public void m3044n() {
        for (Fragment fragment : this.f4339c.m3109h()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    /* renamed from: n0 */
    public final void m3045n0(@NonNull Fragment fragment) {
        ViewGroup m3004L = m3004L(fragment);
        if (m3004L != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (m3004L.getTag(C2507R.id.visible_removing_fragment_view_tag) == null) {
                    m3004L.setTag(C2507R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) m3004L.getTag(C2507R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    /* renamed from: o */
    public void m3046o(boolean z) {
        for (Fragment fragment : this.f4339c.m3109h()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    /* renamed from: o0 */
    public void m3047o0(@NonNull Fragment fragment) {
        if (m2992Q(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* renamed from: p */
    public void m3048p() {
        Iterator it = ((ArrayList) this.f4339c.m3107f()).iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.m3048p();
            }
        }
    }

    /* renamed from: p0 */
    public final void m3049p0() {
        Iterator it = ((ArrayList) this.f4339c.m3106e()).iterator();
        while (it.hasNext()) {
            m3015X((FragmentStateManager) it.next());
        }
    }

    /* renamed from: q */
    public boolean m3050q(@NonNull MenuItem menuItem) {
        if (this.f4357u < 1) {
            return false;
        }
        for (Fragment fragment : this.f4339c.m3109h()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q0 */
    public final void m3051q0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new LogWriter("FragmentManager"));
        FragmentHostCallback<?> fragmentHostCallback = this.f4358v;
        if (fragmentHostCallback != null) {
            try {
                fragmentHostCallback.mo2968d("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw runtimeException;
            }
        }
        try {
            m3060x("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw runtimeException;
        }
    }

    /* renamed from: r */
    public void m3052r(@NonNull Menu menu) {
        if (this.f4357u < 1) {
            return;
        }
        for (Fragment fragment : this.f4339c.m3109h()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    /* renamed from: r0 */
    public void m3053r0(@NonNull FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.f4350n;
        synchronized (fragmentLifecycleCallbacksDispatcher.f4318a) {
            int i2 = 0;
            int size = fragmentLifecycleCallbacksDispatcher.f4318a.size();
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (fragmentLifecycleCallbacksDispatcher.f4318a.get(i2).f4320a == fragmentLifecycleCallbacks) {
                    fragmentLifecycleCallbacksDispatcher.f4318a.remove(i2);
                    break;
                }
                i2++;
            }
        }
    }

    /* renamed from: s */
    public final void m3054s(@Nullable Fragment fragment) {
        if (fragment == null || !fragment.equals(m2997E(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    /* renamed from: s0 */
    public final void m3055s0() {
        synchronized (this.f4337a) {
            if (!this.f4337a.isEmpty()) {
                this.f4344h.f221a = true;
            } else {
                this.f4344h.f221a = m3002J() > 0 && m3011T(this.f4360x);
            }
        }
    }

    /* renamed from: t */
    public void m3056t(boolean z) {
        for (Fragment fragment : this.f4339c.m3109h()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f4360x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f4360x)));
            sb.append("}");
        } else {
            FragmentHostCallback<?> fragmentHostCallback = this.f4358v;
            if (fragmentHostCallback != null) {
                sb.append(fragmentHostCallback.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f4358v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public boolean m3057u(@NonNull Menu menu) {
        boolean z = false;
        if (this.f4357u < 1) {
            return false;
        }
        for (Fragment fragment : this.f4339c.m3109h()) {
            if (fragment != null && m3010S(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: v */
    public final void m3058v(int i2) {
        try {
            this.f4338b = true;
            for (FragmentStateManager fragmentStateManager : this.f4339c.f4421b.values()) {
                if (fragmentStateManager != null) {
                    fragmentStateManager.f4410e = i2;
                }
            }
            m3013V(i2, false);
            Iterator it = ((HashSet) m3028f()).iterator();
            while (it.hasNext()) {
                ((SpecialEffectsController) it.next()).m3153e();
            }
            this.f4338b = false;
            m2994B(true);
        } catch (Throwable th) {
            this.f4338b = false;
            throw th;
        }
    }

    /* renamed from: w */
    public final void m3059w() {
        if (this.f4331J) {
            this.f4331J = false;
            m3049p0();
        }
    }

    /* renamed from: x */
    public void m3060x(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        int size;
        int size2;
        String m14k = C0000a.m14k(str, "    ");
        FragmentStore fragmentStore = this.f4339c;
        Objects.requireNonNull(fragmentStore);
        String str2 = str + "    ";
        if (!fragmentStore.f4421b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (FragmentStateManager fragmentStateManager : fragmentStore.f4421b.values()) {
                printWriter.print(str);
                if (fragmentStateManager != null) {
                    Fragment fragment = fragmentStateManager.f4408c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = fragmentStore.f4420a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                Fragment fragment2 = fragmentStore.f4420a.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f4341e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                Fragment fragment3 = this.f4341e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<BackStackRecord> arrayList2 = this.f4340d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                BackStackRecord backStackRecord = this.f4340d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(backStackRecord.toString());
                backStackRecord.m2949t(m14k, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f4345i.get());
        synchronized (this.f4337a) {
            int size4 = this.f4337a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i5 = 0; i5 < size4; i5++) {
                    Object obj = (OpGenerator) this.f4337a.get(i5);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f4358v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f4359w);
        if (this.f4360x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f4360x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f4357u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f4328G);
        printWriter.print(" mStopped=");
        printWriter.print(this.f4329H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f4330I);
        if (this.f4327F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f4327F);
        }
    }

    /* renamed from: y */
    public final void m3061y() {
        Iterator it = ((HashSet) m3028f()).iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).m3153e();
        }
    }

    /* renamed from: z */
    public void m3062z(@NonNull OpGenerator opGenerator, boolean z) {
        if (!z) {
            if (this.f4358v == null) {
                if (!this.f4330I) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (m3012U()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f4337a) {
            if (this.f4358v == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f4337a.add(opGenerator);
                m3037j0();
            }
        }
    }

    @SuppressLint
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new Parcelable.Creator<LaunchedFragmentInfo>() { // from class: androidx.fragment.app.FragmentManager.LaunchedFragmentInfo.1
            @Override // android.os.Parcelable.Creator
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public LaunchedFragmentInfo[] newArray(int i2) {
                return new LaunchedFragmentInfo[i2];
            }
        };

        /* renamed from: b */
        public String f4371b;

        /* renamed from: c */
        public int f4372c;

        public LaunchedFragmentInfo(@NonNull String str, int i2) {
            this.f4371b = str;
            this.f4372c = i2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f4371b);
            parcel.writeInt(this.f4372c);
        }

        public LaunchedFragmentInfo(@NonNull Parcel parcel) {
            this.f4371b = parcel.readString();
            this.f4372c = parcel.readInt();
        }
    }
}
