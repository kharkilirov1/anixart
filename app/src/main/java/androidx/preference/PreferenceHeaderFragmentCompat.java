package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.annotation.CallSuper;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.BackStackRecord;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.preference.PreferenceFragmentCompat;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import com.swiftsoft.anixartd.C2507R;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PreferenceHeaderFragmentCompat.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Landroidx/preference/PreferenceHeaderFragmentCompat;", "Landroidx/fragment/app/Fragment;", "Landroidx/preference/PreferenceFragmentCompat$OnPreferenceStartFragmentCallback;", "<init>", "()V", "InnerOnBackPressedCallback", "preference_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class PreferenceHeaderFragmentCompat extends Fragment implements PreferenceFragmentCompat.OnPreferenceStartFragmentCallback {

    /* renamed from: c */
    public static final /* synthetic */ int f5069c = 0;

    /* renamed from: b */
    @Nullable
    public OnBackPressedCallback f5070b;

    /* compiled from: PreferenceHeaderFragmentCompat.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Landroidx/preference/PreferenceHeaderFragmentCompat$InnerOnBackPressedCallback;", "Landroidx/activity/OnBackPressedCallback;", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout$PanelSlideListener;", "preference_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class InnerOnBackPressedCallback extends OnBackPressedCallback implements SlidingPaneLayout.PanelSlideListener {

        /* renamed from: c */
        @NotNull
        public final PreferenceHeaderFragmentCompat f5072c;

        public InnerOnBackPressedCallback(@NotNull PreferenceHeaderFragmentCompat preferenceHeaderFragmentCompat) {
            super(true);
            this.f5072c = preferenceHeaderFragmentCompat;
            preferenceHeaderFragmentCompat.m3441n3().f5990o.add(this);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        /* renamed from: a */
        public void mo3443a(@NotNull View panel, float f2) {
            Intrinsics.m32179h(panel, "panel");
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        /* renamed from: b */
        public void mo3444b(@NotNull View panel) {
            Intrinsics.m32179h(panel, "panel");
            this.f221a = true;
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        /* renamed from: c */
        public void mo3445c(@NotNull View panel) {
            Intrinsics.m32179h(panel, "panel");
            this.f221a = false;
        }

        @Override // androidx.activity.OnBackPressedCallback
        /* renamed from: d */
        public void mo308d() {
            this.f5072c.m3441n3().m4143a(0);
        }
    }

    @Override // androidx.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback
    @CallSuper
    /* renamed from: d2 */
    public boolean mo3421d2(@NotNull PreferenceFragmentCompat preferenceFragmentCompat, @NotNull Preference preference) {
        if (preferenceFragmentCompat.getId() != C2507R.id.preferences_header) {
            if (preferenceFragmentCompat.getId() != C2507R.id.preferences_detail) {
                return false;
            }
            FragmentFactory m3005M = getChildFragmentManager().m3005M();
            ClassLoader classLoader = requireContext().getClassLoader();
            String str = preference.f4977o;
            Intrinsics.m32176e(str);
            Fragment mo2977a = m3005M.mo2977a(classLoader, str);
            Intrinsics.m32178g(mo2977a, "childFragmentManager.fra….fragment!!\n            )");
            mo2977a.setArguments(preference.m3379d());
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.m32178g(childFragmentManager, "childFragmentManager");
            FragmentTransaction m3024d = childFragmentManager.m3024d();
            m3024d.f4441p = true;
            m3024d.m3118n(C2507R.id.preferences_detail, mo2977a);
            m3024d.f4431f = 4099;
            if (!m3024d.f4433h) {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            m3024d.f4432g = true;
            m3024d.f4434i = null;
            m3024d.mo2936e();
            return true;
        }
        String str2 = preference.f4977o;
        if (str2 == null) {
            Intent intent = preference.f4976n;
            if (intent != null) {
                startActivity(intent);
            }
        } else {
            Fragment mo2977a2 = getChildFragmentManager().m3005M().mo2977a(requireContext().getClassLoader(), str2);
            if (mo2977a2 != null) {
                mo2977a2.setArguments(preference.m3379d());
            }
            if (getChildFragmentManager().m3002J() > 0) {
                BackStackRecord backStackRecord = getChildFragmentManager().f4340d.get(0);
                Intrinsics.m32178g(backStackRecord, "childFragmentManager.getBackStackEntryAt(0)");
                getChildFragmentManager().m3016Y(backStackRecord.getId(), 1, false);
            }
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.m32178g(childFragmentManager2, "childFragmentManager");
            FragmentTransaction m3024d2 = childFragmentManager2.m3024d();
            m3024d2.f4441p = true;
            Intrinsics.m32176e(mo2977a2);
            m3024d2.m3118n(C2507R.id.preferences_detail, mo2977a2);
            if (m3441n3().m4146e()) {
                m3024d2.f4431f = 4099;
            }
            m3441n3().m4147f();
            m3024d2.mo2936e();
        }
        return true;
    }

    @NotNull
    /* renamed from: n3 */
    public final SlidingPaneLayout m3441n3() {
        return (SlidingPaneLayout) requireView();
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onAttach(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        super.onAttach(context);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.m32178g(parentFragmentManager, "parentFragmentManager");
        FragmentTransaction m3024d = parentFragmentManager.m3024d();
        m3024d.mo2945p(this);
        m3024d.mo2936e();
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(inflater.getContext());
        slidingPaneLayout.setId(C2507R.id.preferences_sliding_pane_layout);
        FragmentContainerView fragmentContainerView = new FragmentContainerView(inflater.getContext());
        fragmentContainerView.setId(C2507R.id.preferences_header);
        SlidingPaneLayout.LayoutParams layoutParams = new SlidingPaneLayout.LayoutParams(getResources().getDimensionPixelSize(C2507R.dimen.preferences_header_width), -1);
        layoutParams.f6006a = getResources().getInteger(C2507R.integer.preferences_header_pane_weight);
        slidingPaneLayout.addView(fragmentContainerView, layoutParams);
        FragmentContainerView fragmentContainerView2 = new FragmentContainerView(inflater.getContext());
        fragmentContainerView2.setId(C2507R.id.preferences_detail);
        SlidingPaneLayout.LayoutParams layoutParams2 = new SlidingPaneLayout.LayoutParams(getResources().getDimensionPixelSize(C2507R.dimen.preferences_detail_width), -1);
        layoutParams2.f6006a = getResources().getInteger(C2507R.integer.preferences_detail_pane_weight);
        slidingPaneLayout.addView(fragmentContainerView2, layoutParams2);
        if (getChildFragmentManager().m2999G(C2507R.id.preferences_header) == null) {
            PreferenceFragmentCompat m3442u3 = m3442u3();
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.m32178g(childFragmentManager, "childFragmentManager");
            FragmentTransaction m3024d = childFragmentManager.m3024d();
            m3024d.f4441p = true;
            m3024d.mo2941k(C2507R.id.preferences_header, m3442u3, null, 1);
            m3024d.mo2936e();
        }
        slidingPaneLayout.setLockMode(3);
        return slidingPaneLayout;
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.m32179h(view, "view");
        super.onViewCreated(view, bundle);
        this.f5070b = new InnerOnBackPressedCallback(this);
        SlidingPaneLayout m3441n3 = m3441n3();
        if (!ViewCompat.m2174N(m3441n3) || m3441n3.isLayoutRequested()) {
            m3441n3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.preference.PreferenceHeaderFragmentCompat$onViewCreated$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    Intrinsics.m32180i(view2, "view");
                    view2.removeOnLayoutChangeListener(this);
                    OnBackPressedCallback onBackPressedCallback = PreferenceHeaderFragmentCompat.this.f5070b;
                    Intrinsics.m32176e(onBackPressedCallback);
                    onBackPressedCallback.f221a = PreferenceHeaderFragmentCompat.this.m3441n3().f5981f && PreferenceHeaderFragmentCompat.this.m3441n3().m4146e();
                }
            });
        } else {
            OnBackPressedCallback onBackPressedCallback = this.f5070b;
            Intrinsics.m32176e(onBackPressedCallback);
            onBackPressedCallback.f221a = m3441n3().f5981f && m3441n3().m4146e();
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        FragmentManager.OnBackStackChangedListener onBackStackChangedListener = new FragmentManager.OnBackStackChangedListener() { // from class: androidx.preference.a
            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            /* renamed from: a */
            public final void mo3064a() {
                PreferenceHeaderFragmentCompat this$0 = PreferenceHeaderFragmentCompat.this;
                int i2 = PreferenceHeaderFragmentCompat.f5069c;
                Intrinsics.m32179h(this$0, "this$0");
                OnBackPressedCallback onBackPressedCallback2 = this$0.f5070b;
                Intrinsics.m32176e(onBackPressedCallback2);
                onBackPressedCallback2.f221a = this$0.getChildFragmentManager().m3002J() == 0;
            }
        };
        if (childFragmentManager.f4349m == null) {
            childFragmentManager.f4349m = new ArrayList<>();
        }
        childFragmentManager.f4349m.add(onBackStackChangedListener);
        Object requireContext = requireContext();
        OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = requireContext instanceof OnBackPressedDispatcherOwner ? (OnBackPressedDispatcherOwner) requireContext : null;
        if (onBackPressedDispatcherOwner == null) {
            return;
        }
        OnBackPressedDispatcher f215c = onBackPressedDispatcherOwner.getF215c();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        OnBackPressedCallback onBackPressedCallback2 = this.f5070b;
        Intrinsics.m32176e(onBackPressedCallback2);
        f215c.m310a(viewLifecycleOwner, onBackPressedCallback2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(@Nullable Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle == null) {
            Fragment m2999G = getChildFragmentManager().m2999G(C2507R.id.preferences_header);
            Objects.requireNonNull(m2999G, "null cannot be cast to non-null type androidx.preference.PreferenceFragmentCompat");
            PreferenceFragmentCompat preferenceFragmentCompat = (PreferenceFragmentCompat) m2999G;
            Fragment fragment = null;
            if (preferenceFragmentCompat.f5025c.f5085g.m3427U() > 0) {
                int i2 = 0;
                int m3427U = preferenceFragmentCompat.f5025c.f5085g.m3427U();
                while (true) {
                    if (i2 >= m3427U) {
                        break;
                    }
                    int i3 = i2 + 1;
                    Preference m3426T = preferenceFragmentCompat.f5025c.f5085g.m3426T(i2);
                    Intrinsics.m32178g(m3426T, "headerFragment.preferenc…reen.getPreference(index)");
                    String str = m3426T.f4977o;
                    if (str != null) {
                        fragment = getChildFragmentManager().m3005M().mo2977a(requireContext().getClassLoader(), str);
                        break;
                    }
                    i2 = i3;
                }
            }
            if (fragment == null) {
                return;
            }
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.m32178g(childFragmentManager, "childFragmentManager");
            FragmentTransaction m3024d = childFragmentManager.m3024d();
            m3024d.f4441p = true;
            m3024d.m3118n(C2507R.id.preferences_detail, fragment);
            m3024d.mo2936e();
        }
    }

    @NotNull
    /* renamed from: u3 */
    public abstract PreferenceFragmentCompat m3442u3();
}
