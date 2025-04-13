package com.swiftsoft.anixartd.p015ui.fragment.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2625a;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnInnerTab;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonTabsFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/CommonTabsFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "<init>", "()V", "PagerAdapter", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class CommonTabsFragment extends BaseFragment {

    /* renamed from: f */
    public static final /* synthetic */ int f27877f = 0;

    /* renamed from: d */
    public int f27878d;

    /* renamed from: e */
    @NotNull
    public Map<Integer, View> f27879e = new LinkedHashMap();

    /* compiled from: CommonTabsFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/CommonTabsFragment$PagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public final class PagerAdapter extends FragmentStatePagerAdapter {
        public PagerAdapter(@NotNull FragmentManager fragmentManager) {
            super(fragmentManager, 1);
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
        /* renamed from: a */
        public void mo3073a(@NotNull ViewGroup viewGroup, int i2, @NotNull Object object) {
            Intrinsics.m32179h(object, "object");
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* renamed from: c */
        public int mo4336c() {
            return CommonTabsFragment.this.mo15451m4();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @NotNull
        /* renamed from: e */
        public CharSequence mo4338e(int i2) {
            return CommonTabsFragment.this.mo15450e4(i2);
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        @NotNull
        /* renamed from: l */
        public Fragment mo3101l(int i2) {
            return CommonTabsFragment.this.mo15449c4(i2);
        }
    }

    @NotNull
    /* renamed from: A3 */
    public abstract String mo15448A3(int i2);

    @NotNull
    /* renamed from: c4 */
    public abstract Fragment mo15449c4(int i2);

    @NotNull
    /* renamed from: e4 */
    public abstract String mo15450e4(int i2);

    /* renamed from: m4 */
    public abstract int mo15451m4();

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f27879e.clear();
    }

    /* renamed from: n4 */
    public void m15452n4(int i2) {
        EventBusKt.m16327a(new OnInnerTab(mo15448A3(i2)));
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_top_tabs, viewGroup, false);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2625a(this, 9));
        ViewPager viewPager = (ViewPager) inflate.findViewById(C2507R.id.view_pager);
        viewPager.m4348b(new ViewPager.OnPageChangeListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.CommonTabsFragment$onCreateView$2$1
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            /* renamed from: b */
            public void mo4343b(int i2) {
                EventBusKt.m16327a(new OnInnerTab(CommonTabsFragment.this.mo15448A3(i2)));
                CommonTabsFragment.this.f27878d = i2;
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            /* renamed from: c */
            public void mo4344c(int i2, float f2, int i3) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            /* renamed from: d */
            public void mo4345d(int i2) {
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.m32178g(childFragmentManager, "childFragmentManager");
        viewPager.setAdapter(new PagerAdapter(childFragmentManager));
        ((TabLayout) inflate.findViewById(C2507R.id.tabs)).setupWithViewPager(viewPager);
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo15436n3();
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            return;
        }
        m15452n4(this.f27878d);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.m32179h(view, "view");
        m15452n4(0);
    }
}
