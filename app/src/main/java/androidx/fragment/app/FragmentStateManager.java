package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStoreOwner;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.metrica.push.common.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p000a.C0000a;

/* loaded from: classes.dex */
class FragmentStateManager {

    /* renamed from: a */
    public final FragmentLifecycleCallbacksDispatcher f4406a;

    /* renamed from: b */
    public final FragmentStore f4407b;

    /* renamed from: c */
    @NonNull
    public final Fragment f4408c;

    /* renamed from: d */
    public boolean f4409d = false;

    /* renamed from: e */
    public int f4410e = -1;

    /* renamed from: androidx.fragment.app.FragmentStateManager$2 */
    public static /* synthetic */ class C03712 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4412a;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            f4412a = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4412a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4412a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4412a[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FragmentStateManager(@NonNull FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, @NonNull FragmentStore fragmentStore, @NonNull Fragment fragment) {
        this.f4406a = fragmentLifecycleCallbacksDispatcher;
        this.f4407b = fragmentStore;
        this.f4408c = fragment;
    }

    /* renamed from: a */
    public void m3082a() {
        if (FragmentManager.m2992Q(3)) {
            StringBuilder m24u = C0000a.m24u("moveto ACTIVITY_CREATED: ");
            m24u.append(this.f4408c);
            Log.d("FragmentManager", m24u.toString());
        }
        Fragment fragment = this.f4408c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.f4406a;
        Fragment fragment2 = this.f4408c;
        fragmentLifecycleCallbacksDispatcher.m2978a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* renamed from: b */
    public void m3083b() {
        View view;
        View view2;
        FragmentStore fragmentStore = this.f4407b;
        Fragment fragment = this.f4408c;
        Objects.requireNonNull(fragmentStore);
        ViewGroup viewGroup = fragment.mContainer;
        int i2 = -1;
        if (viewGroup != null) {
            int indexOf = fragmentStore.f4420a.indexOf(fragment);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= fragmentStore.f4420a.size()) {
                            break;
                        }
                        Fragment fragment2 = fragmentStore.f4420a.get(indexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            i2 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = fragmentStore.f4420a.get(i3);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        i2 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        Fragment fragment4 = this.f4408c;
        fragment4.mContainer.addView(fragment4.mView, i2);
    }

    /* renamed from: c */
    public void m3084c() {
        if (FragmentManager.m2992Q(3)) {
            StringBuilder m24u = C0000a.m24u("moveto ATTACHED: ");
            m24u.append(this.f4408c);
            Log.d("FragmentManager", m24u.toString());
        }
        Fragment fragment = this.f4408c;
        Fragment fragment2 = fragment.mTarget;
        FragmentStateManager fragmentStateManager = null;
        if (fragment2 != null) {
            FragmentStateManager m3108g = this.f4407b.m3108g(fragment2.mWho);
            if (m3108g == null) {
                StringBuilder m24u2 = C0000a.m24u("Fragment ");
                m24u2.append(this.f4408c);
                m24u2.append(" declared target fragment ");
                m24u2.append(this.f4408c.mTarget);
                m24u2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(m24u2.toString());
            }
            Fragment fragment3 = this.f4408c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            fragmentStateManager = m3108g;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (fragmentStateManager = this.f4407b.m3108g(str)) == null) {
                StringBuilder m24u3 = C0000a.m24u("Fragment ");
                m24u3.append(this.f4408c);
                m24u3.append(" declared target fragment ");
                throw new IllegalStateException(C0000a.m20q(m24u3, this.f4408c.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (fragmentStateManager != null) {
            fragmentStateManager.m3092k();
        }
        Fragment fragment4 = this.f4408c;
        FragmentManager fragmentManager = fragment4.mFragmentManager;
        fragment4.mHost = fragmentManager.f4358v;
        fragment4.mParentFragment = fragmentManager.f4360x;
        this.f4406a.m2984g(fragment4, false);
        this.f4408c.performAttach();
        this.f4406a.m2979b(this.f4408c, false);
    }

    /* renamed from: d */
    public int m3085d() {
        Fragment fragment = this.f4408c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i2 = this.f4410e;
        int ordinal = fragment.mMaxState.ordinal();
        if (ordinal == 1) {
            i2 = Math.min(i2, 0);
        } else if (ordinal == 2) {
            i2 = Math.min(i2, 1);
        } else if (ordinal == 3) {
            i2 = Math.min(i2, 5);
        } else if (ordinal != 4) {
            i2 = Math.min(i2, -1);
        }
        Fragment fragment2 = this.f4408c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                i2 = Math.max(this.f4410e, 2);
                View view = this.f4408c.mView;
                if (view != null && view.getParent() == null) {
                    i2 = Math.min(i2, 2);
                }
            } else {
                i2 = this.f4410e < 4 ? Math.min(i2, fragment2.mState) : Math.min(i2, 1);
            }
        }
        if (!this.f4408c.mAdded) {
            i2 = Math.min(i2, 1);
        }
        Fragment fragment3 = this.f4408c;
        ViewGroup viewGroup = fragment3.mContainer;
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact = null;
        SpecialEffectsController.Operation operation = null;
        if (viewGroup != null) {
            SpecialEffectsController m3148f = SpecialEffectsController.m3148f(viewGroup, fragment3.getParentFragmentManager());
            Objects.requireNonNull(m3148f);
            SpecialEffectsController.Operation m3152d = m3148f.m3152d(this.f4408c);
            SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact2 = m3152d != null ? m3152d.f4500b : null;
            Fragment fragment4 = this.f4408c;
            Iterator<SpecialEffectsController.Operation> it = m3148f.f4489c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SpecialEffectsController.Operation next = it.next();
                if (next.f4501c.equals(fragment4) && !next.f4504f) {
                    operation = next;
                    break;
                }
            }
            lifecycleImpact = (operation == null || !(lifecycleImpact2 == null || lifecycleImpact2 == SpecialEffectsController.Operation.LifecycleImpact.NONE)) ? lifecycleImpact2 : operation.f4500b;
        }
        if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            i2 = Math.min(i2, 6);
        } else if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
            i2 = Math.max(i2, 3);
        } else {
            Fragment fragment5 = this.f4408c;
            if (fragment5.mRemoving) {
                i2 = fragment5.isInBackStack() ? Math.min(i2, 1) : Math.min(i2, -1);
            }
        }
        Fragment fragment6 = this.f4408c;
        if (fragment6.mDeferStart && fragment6.mState < 5) {
            i2 = Math.min(i2, 4);
        }
        if (FragmentManager.m2992Q(2)) {
            StringBuilder m25v = C0000a.m25v("computeExpectedState() of ", i2, " for ");
            m25v.append(this.f4408c);
            Log.v("FragmentManager", m25v.toString());
        }
        return i2;
    }

    /* renamed from: e */
    public void m3086e() {
        if (FragmentManager.m2992Q(3)) {
            StringBuilder m24u = C0000a.m24u("moveto CREATED: ");
            m24u.append(this.f4408c);
            Log.d("FragmentManager", m24u.toString());
        }
        Fragment fragment = this.f4408c;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.f4408c.mState = 1;
            return;
        }
        this.f4406a.m2985h(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.f4408c;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.f4406a;
        Fragment fragment3 = this.f4408c;
        fragmentLifecycleCallbacksDispatcher.m2980c(fragment3, fragment3.mSavedFragmentState, false);
    }

    /* renamed from: f */
    public void m3087f() {
        String str;
        if (this.f4408c.mFromLayout) {
            return;
        }
        if (FragmentManager.m2992Q(3)) {
            StringBuilder m24u = C0000a.m24u("moveto CREATE_VIEW: ");
            m24u.append(this.f4408c);
            Log.d("FragmentManager", m24u.toString());
        }
        Fragment fragment = this.f4408c;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.f4408c;
        ViewGroup viewGroup2 = fragment2.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i2 = fragment2.mContainerId;
            if (i2 != 0) {
                if (i2 == -1) {
                    StringBuilder m24u2 = C0000a.m24u("Cannot create fragment ");
                    m24u2.append(this.f4408c);
                    m24u2.append(" for a container view with no id");
                    throw new IllegalArgumentException(m24u2.toString());
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.f4359w.mo2960b(i2);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f4408c;
                    if (!fragment3.mRestored) {
                        try {
                            str = fragment3.getResources().getResourceName(this.f4408c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = CoreConstants.Transport.UNKNOWN;
                        }
                        StringBuilder m24u3 = C0000a.m24u("No view found for id 0x");
                        m24u3.append(Integer.toHexString(this.f4408c.mContainerId));
                        m24u3.append(" (");
                        m24u3.append(str);
                        m24u3.append(") for fragment ");
                        m24u3.append(this.f4408c);
                        throw new IllegalArgumentException(m24u3.toString());
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    Fragment fragment4 = this.f4408c;
                    FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f4520a;
                    Intrinsics.m32179h(fragment4, "fragment");
                    Violation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment4, viewGroup);
                    FragmentStrictMode fragmentStrictMode2 = FragmentStrictMode.f4520a;
                    fragmentStrictMode2.m3166c(wrongFragmentContainerViolation);
                    FragmentStrictMode.Policy m3164a = fragmentStrictMode2.m3164a(fragment4);
                    if (m3164a.f4532a.contains(FragmentStrictMode.Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && fragmentStrictMode2.m3168f(m3164a, fragment4.getClass(), WrongFragmentContainerViolation.class)) {
                        fragmentStrictMode2.m3165b(m3164a, wrongFragmentContainerViolation);
                    }
                }
            }
        }
        Fragment fragment5 = this.f4408c;
        fragment5.mContainer = viewGroup;
        fragment5.performCreateView(performGetLayoutInflater, viewGroup, fragment5.mSavedFragmentState);
        View view = this.f4408c.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment6 = this.f4408c;
            fragment6.mView.setTag(C2507R.id.fragment_container_view_tag, fragment6);
            if (viewGroup != null) {
                m3083b();
            }
            Fragment fragment7 = this.f4408c;
            if (fragment7.mHidden) {
                fragment7.mView.setVisibility(8);
            }
            if (ViewCompat.m2173M(this.f4408c.mView)) {
                ViewCompat.m2192c0(this.f4408c.mView);
            } else {
                final View view2 = this.f4408c.mView;
                view2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) { // from class: androidx.fragment.app.FragmentStateManager.1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view3) {
                        view2.removeOnAttachStateChangeListener(this);
                        ViewCompat.m2192c0(view2);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view3) {
                    }
                });
            }
            this.f4408c.performViewCreated();
            FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.f4406a;
            Fragment fragment8 = this.f4408c;
            fragmentLifecycleCallbacksDispatcher.m2990m(fragment8, fragment8.mView, fragment8.mSavedFragmentState, false);
            int visibility = this.f4408c.mView.getVisibility();
            this.f4408c.setPostOnViewCreatedAlpha(this.f4408c.mView.getAlpha());
            Fragment fragment9 = this.f4408c;
            if (fragment9.mContainer != null && visibility == 0) {
                View findFocus = fragment9.mView.findFocus();
                if (findFocus != null) {
                    this.f4408c.setFocusedView(findFocus);
                    if (FragmentManager.m2992Q(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f4408c);
                    }
                }
                this.f4408c.mView.setAlpha(0.0f);
            }
        }
        this.f4408c.mState = 2;
    }

    /* renamed from: g */
    public void m3088g() {
        Fragment m3104c;
        if (FragmentManager.m2992Q(3)) {
            StringBuilder m24u = C0000a.m24u("movefrom CREATED: ");
            m24u.append(this.f4408c);
            Log.d("FragmentManager", m24u.toString());
        }
        Fragment fragment = this.f4408c;
        boolean z = true;
        boolean z2 = fragment.mRemoving && !fragment.isInBackStack();
        if (z2) {
            Fragment fragment2 = this.f4408c;
            if (!fragment2.mBeingSaved) {
                this.f4407b.m3113l(fragment2.mWho, null);
            }
        }
        if (!(z2 || this.f4407b.f4423d.m3070h(this.f4408c))) {
            String str = this.f4408c.mTargetWho;
            if (str != null && (m3104c = this.f4407b.m3104c(str)) != null && m3104c.mRetainInstance) {
                this.f4408c.mTarget = m3104c;
            }
            this.f4408c.mState = 0;
            return;
        }
        FragmentHostCallback<?> fragmentHostCallback = this.f4408c.mHost;
        if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            z = this.f4407b.f4423d.f4390h;
        } else {
            Context context = fragmentHostCallback.f4312c;
            if (context instanceof Activity) {
                z = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if ((z2 && !this.f4408c.mBeingSaved) || z) {
            this.f4407b.f4423d.m3067e(this.f4408c);
        }
        this.f4408c.performDestroy();
        this.f4406a.m2981d(this.f4408c, false);
        Iterator it = ((ArrayList) this.f4407b.m3106e()).iterator();
        while (it.hasNext()) {
            FragmentStateManager fragmentStateManager = (FragmentStateManager) it.next();
            if (fragmentStateManager != null) {
                Fragment fragment3 = fragmentStateManager.f4408c;
                if (this.f4408c.mWho.equals(fragment3.mTargetWho)) {
                    fragment3.mTarget = this.f4408c;
                    fragment3.mTargetWho = null;
                }
            }
        }
        Fragment fragment4 = this.f4408c;
        String str2 = fragment4.mTargetWho;
        if (str2 != null) {
            fragment4.mTarget = this.f4407b.m3104c(str2);
        }
        this.f4407b.m3111j(this);
    }

    /* renamed from: h */
    public void m3089h() {
        View view;
        if (FragmentManager.m2992Q(3)) {
            StringBuilder m24u = C0000a.m24u("movefrom CREATE_VIEW: ");
            m24u.append(this.f4408c);
            Log.d("FragmentManager", m24u.toString());
        }
        Fragment fragment = this.f4408c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f4408c.performDestroyView();
        this.f4406a.m2991n(this.f4408c, false);
        Fragment fragment2 = this.f4408c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.mo3216l(null);
        this.f4408c.mInLayout = false;
    }

    /* renamed from: i */
    public void m3090i() {
        if (FragmentManager.m2992Q(3)) {
            StringBuilder m24u = C0000a.m24u("movefrom ATTACHED: ");
            m24u.append(this.f4408c);
            Log.d("FragmentManager", m24u.toString());
        }
        this.f4408c.performDetach();
        boolean z = false;
        this.f4406a.m2982e(this.f4408c, false);
        Fragment fragment = this.f4408c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (z || this.f4407b.f4423d.m3070h(this.f4408c)) {
            if (FragmentManager.m2992Q(3)) {
                StringBuilder m24u2 = C0000a.m24u("initState called for fragment: ");
                m24u2.append(this.f4408c);
                Log.d("FragmentManager", m24u2.toString());
            }
            this.f4408c.initState();
        }
    }

    /* renamed from: j */
    public void m3091j() {
        Fragment fragment = this.f4408c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.m2992Q(3)) {
                StringBuilder m24u = C0000a.m24u("moveto CREATE_VIEW: ");
                m24u.append(this.f4408c);
                Log.d("FragmentManager", m24u.toString());
            }
            Fragment fragment2 = this.f4408c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f4408c.mSavedFragmentState);
            View view = this.f4408c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f4408c;
                fragment3.mView.setTag(C2507R.id.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f4408c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f4408c.performViewCreated();
                FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.f4406a;
                Fragment fragment5 = this.f4408c;
                fragmentLifecycleCallbacksDispatcher.m2990m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f4408c.mState = 2;
            }
        }
    }

    /* renamed from: k */
    public void m3092k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact = SpecialEffectsController.Operation.LifecycleImpact.NONE;
        if (this.f4409d) {
            if (FragmentManager.m2992Q(2)) {
                StringBuilder m24u = C0000a.m24u("Ignoring re-entrant call to moveToExpectedState() for ");
                m24u.append(this.f4408c);
                Log.v("FragmentManager", m24u.toString());
                return;
            }
            return;
        }
        try {
            this.f4409d = true;
            boolean z = false;
            while (true) {
                int m3085d = m3085d();
                Fragment fragment = this.f4408c;
                int i2 = fragment.mState;
                if (m3085d == i2) {
                    if (!z && i2 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f4408c.mBeingSaved) {
                        if (FragmentManager.m2992Q(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f4408c);
                        }
                        this.f4407b.f4423d.m3067e(this.f4408c);
                        this.f4407b.m3111j(this);
                        if (FragmentManager.m2992Q(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f4408c);
                        }
                        this.f4408c.initState();
                    }
                    Fragment fragment2 = this.f4408c;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            SpecialEffectsController m3148f = SpecialEffectsController.m3148f(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f4408c.mHidden) {
                                Objects.requireNonNull(m3148f);
                                if (FragmentManager.m2992Q(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + this.f4408c);
                                }
                                m3148f.m3150a(SpecialEffectsController.Operation.State.GONE, lifecycleImpact, this);
                            } else {
                                Objects.requireNonNull(m3148f);
                                if (FragmentManager.m2992Q(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + this.f4408c);
                                }
                                m3148f.m3150a(SpecialEffectsController.Operation.State.VISIBLE, lifecycleImpact, this);
                            }
                        }
                        Fragment fragment3 = this.f4408c;
                        FragmentManager fragmentManager = fragment3.mFragmentManager;
                        if (fragmentManager != null) {
                            Objects.requireNonNull(fragmentManager);
                            if (fragment3.mAdded && fragmentManager.m3009R(fragment3)) {
                                fragmentManager.f4327F = true;
                            }
                        }
                        Fragment fragment4 = this.f4408c;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f4408c.mChildFragmentManager.m3048p();
                    }
                    return;
                }
                if (m3085d <= i2) {
                    switch (i2 - 1) {
                        case -1:
                            m3090i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved) {
                                if (this.f4407b.f4422c.get(fragment.mWho) == null) {
                                    m3097p();
                                }
                            }
                            m3088g();
                            break;
                        case 1:
                            m3089h();
                            this.f4408c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.m2992Q(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f4408c);
                            }
                            Fragment fragment5 = this.f4408c;
                            if (fragment5.mBeingSaved) {
                                m3097p();
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                m3098q();
                            }
                            Fragment fragment6 = this.f4408c;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                SpecialEffectsController m3148f2 = SpecialEffectsController.m3148f(viewGroup2, fragment6.getParentFragmentManager());
                                Objects.requireNonNull(m3148f2);
                                if (FragmentManager.m2992Q(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + this.f4408c);
                                }
                                m3148f2.m3150a(SpecialEffectsController.Operation.State.REMOVED, SpecialEffectsController.Operation.LifecycleImpact.REMOVING, this);
                            }
                            this.f4408c.mState = 3;
                            break;
                        case 4:
                            m3100s();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            m3093l();
                            break;
                    }
                } else {
                    switch (i2 + 1) {
                        case 0:
                            m3084c();
                            break;
                        case 1:
                            m3086e();
                            break;
                        case 2:
                            m3091j();
                            m3087f();
                            break;
                        case 3:
                            m3082a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                SpecialEffectsController m3148f3 = SpecialEffectsController.m3148f(viewGroup3, fragment.getParentFragmentManager());
                                SpecialEffectsController.Operation.State m3160b = SpecialEffectsController.Operation.State.m3160b(this.f4408c.mView.getVisibility());
                                Objects.requireNonNull(m3148f3);
                                if (FragmentManager.m2992Q(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + this.f4408c);
                                }
                                m3148f3.m3150a(m3160b, SpecialEffectsController.Operation.LifecycleImpact.ADDING, this);
                            }
                            this.f4408c.mState = 4;
                            break;
                        case 5:
                            m3099r();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            m3095n();
                            break;
                    }
                }
                z = true;
            }
        } finally {
            this.f4409d = false;
        }
    }

    /* renamed from: l */
    public void m3093l() {
        if (FragmentManager.m2992Q(3)) {
            StringBuilder m24u = C0000a.m24u("movefrom RESUMED: ");
            m24u.append(this.f4408c);
            Log.d("FragmentManager", m24u.toString());
        }
        this.f4408c.performPause();
        this.f4406a.m2983f(this.f4408c, false);
    }

    /* renamed from: m */
    public void m3094m(@NonNull ClassLoader classLoader) {
        Bundle bundle = this.f4408c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f4408c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f4408c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f4408c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f4408c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f4408c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f4408c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f4408c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    /* renamed from: n */
    public void m3095n() {
        if (FragmentManager.m2992Q(3)) {
            StringBuilder m24u = C0000a.m24u("moveto RESUMED: ");
            m24u.append(this.f4408c);
            Log.d("FragmentManager", m24u.toString());
        }
        View focusedView = this.f4408c.getFocusedView();
        if (focusedView != null) {
            boolean z = true;
            if (focusedView != this.f4408c.mView) {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent == null) {
                        z = false;
                        break;
                    } else if (parent == this.f4408c.mView) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            if (z) {
                boolean requestFocus = focusedView.requestFocus();
                if (FragmentManager.m2992Q(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("requestFocus: Restoring focused view ");
                    sb.append(focusedView);
                    sb.append(" ");
                    sb.append(requestFocus ? "succeeded" : "failed");
                    sb.append(" on Fragment ");
                    sb.append(this.f4408c);
                    sb.append(" resulting in focused view ");
                    sb.append(this.f4408c.mView.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            }
        }
        this.f4408c.setFocusedView(null);
        this.f4408c.performResume();
        this.f4406a.m2986i(this.f4408c, false);
        Fragment fragment = this.f4408c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* renamed from: o */
    public final Bundle m3096o() {
        Bundle bundle = new Bundle();
        this.f4408c.performSaveInstanceState(bundle);
        this.f4406a.m2987j(this.f4408c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f4408c.mView != null) {
            m3098q();
        }
        if (this.f4408c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f4408c.mSavedViewState);
        }
        if (this.f4408c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f4408c.mSavedViewRegistryState);
        }
        if (!this.f4408c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f4408c.mUserVisibleHint);
        }
        return bundle;
    }

    /* renamed from: p */
    public void m3097p() {
        FragmentState fragmentState = new FragmentState(this.f4408c);
        Fragment fragment = this.f4408c;
        if (fragment.mState <= -1 || fragmentState.f4405n != null) {
            fragmentState.f4405n = fragment.mSavedFragmentState;
        } else {
            Bundle m3096o = m3096o();
            fragmentState.f4405n = m3096o;
            if (this.f4408c.mTargetWho != null) {
                if (m3096o == null) {
                    fragmentState.f4405n = new Bundle();
                }
                fragmentState.f4405n.putString("android:target_state", this.f4408c.mTargetWho);
                int i2 = this.f4408c.mTargetRequestCode;
                if (i2 != 0) {
                    fragmentState.f4405n.putInt("android:target_req_state", i2);
                }
            }
        }
        this.f4407b.m3113l(this.f4408c.mWho, fragmentState);
    }

    /* renamed from: q */
    public void m3098q() {
        if (this.f4408c.mView == null) {
            return;
        }
        if (FragmentManager.m2992Q(2)) {
            StringBuilder m24u = C0000a.m24u("Saving view state for fragment ");
            m24u.append(this.f4408c);
            m24u.append(" with view ");
            m24u.append(this.f4408c.mView);
            Log.v("FragmentManager", m24u.toString());
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f4408c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f4408c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f4408c.mViewLifecycleOwner.f4473e.m4137d(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f4408c.mSavedViewRegistryState = bundle;
    }

    /* renamed from: r */
    public void m3099r() {
        if (FragmentManager.m2992Q(3)) {
            StringBuilder m24u = C0000a.m24u("moveto STARTED: ");
            m24u.append(this.f4408c);
            Log.d("FragmentManager", m24u.toString());
        }
        this.f4408c.performStart();
        this.f4406a.m2988k(this.f4408c, false);
    }

    /* renamed from: s */
    public void m3100s() {
        if (FragmentManager.m2992Q(3)) {
            StringBuilder m24u = C0000a.m24u("movefrom STARTED: ");
            m24u.append(this.f4408c);
            Log.d("FragmentManager", m24u.toString());
        }
        this.f4408c.performStop();
        this.f4406a.m2989l(this.f4408c, false);
    }

    public FragmentStateManager(@NonNull FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, @NonNull FragmentStore fragmentStore, @NonNull ClassLoader classLoader, @NonNull FragmentFactory fragmentFactory, @NonNull FragmentState fragmentState) {
        this.f4406a = fragmentLifecycleCallbacksDispatcher;
        this.f4407b = fragmentStore;
        Fragment m3081a = fragmentState.m3081a(fragmentFactory, classLoader);
        this.f4408c = m3081a;
        if (FragmentManager.m2992Q(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + m3081a);
        }
    }

    public FragmentStateManager(@NonNull FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, @NonNull FragmentStore fragmentStore, @NonNull Fragment fragment, @NonNull FragmentState fragmentState) {
        this.f4406a = fragmentLifecycleCallbacksDispatcher;
        this.f4407b = fragmentStore;
        this.f4408c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f4405n;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
