package com.swiftsoft.anixartd.p015ui.fragment.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnInnerTab;
import com.swiftsoft.anixartd.utils.OnOpenNotifications;
import com.swiftsoft.anixartd.utils.OnOpenPreferences;
import com.swiftsoft.anixartd.utils.OnSearch;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TabsFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/TabsFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "<init>", "()V", "PagerAdapter", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class TabsFragment extends BaseFragment {

    /* renamed from: d */
    public int f27888d;

    /* renamed from: e */
    @NotNull
    public Map<Integer, View> f27889e = new LinkedHashMap();

    /* compiled from: TabsFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/TabsFragment$PagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
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
            return TabsFragment.this.mo15457m4();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @NotNull
        /* renamed from: e */
        public CharSequence mo4338e(int i2) {
            return TabsFragment.this.mo15456e4(i2);
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        @NotNull
        /* renamed from: l */
        public Fragment mo3101l(int i2) {
            return TabsFragment.this.mo15455c4(i2);
        }
    }

    @NotNull
    /* renamed from: A3 */
    public abstract String mo15454A3(int i2);

    @NotNull
    /* renamed from: c4 */
    public abstract Fragment mo15455c4(int i2);

    @NotNull
    /* renamed from: e4 */
    public abstract String mo15456e4(int i2);

    /* renamed from: m4 */
    public abstract int mo15457m4();

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f27889e.clear();
    }

    /* renamed from: n4 */
    public void mo15458n4(int i2) {
        EventBusKt.m16327a(new OnInnerTab(mo15454A3(i2)));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 100 && i3 == -1 && intent != null) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
            Intrinsics.m32176e(stringArrayListExtra);
            String str = stringArrayListExtra.get(0);
            Intrinsics.m32178g(str, "result!![0]");
            EventBusKt.m16327a(new OnSearch(str));
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_tabs, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(C2507R.id.settings);
        Intrinsics.m32178g(imageView, "view.settings");
        ViewsKt.m16377j(imageView, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.TabsFragment$onCreateView$1
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                EventBusKt.m16327a(new OnOpenPreferences());
                return Unit.f63088a;
            }
        });
        ImageView imageView2 = (ImageView) inflate.findViewById(C2507R.id.search_btn);
        Intrinsics.m32178g(imageView2, "view.search_btn");
        ViewsKt.m16377j(imageView2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.TabsFragment$onCreateView$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                EventBusKt.m16327a(new OnSearch(null, 1));
                return Unit.f63088a;
            }
        });
        TextView textView = (TextView) inflate.findViewById(C2507R.id.search);
        Intrinsics.m32178g(textView, "view.search");
        ViewsKt.m16377j(textView, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.TabsFragment$onCreateView$3
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                EventBusKt.m16327a(new OnSearch(null, 1));
                return Unit.f63088a;
            }
        });
        ImageView imageView3 = (ImageView) inflate.findViewById(C2507R.id.notifications);
        Intrinsics.m32178g(imageView3, "view.notifications");
        ViewsKt.m16377j(imageView3, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.TabsFragment$onCreateView$4
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                EventBusKt.m16327a(new OnOpenNotifications());
                return Unit.f63088a;
            }
        });
        ViewPager viewPager = (ViewPager) inflate.findViewById(C2507R.id.view_pager);
        viewPager.m4348b(new ViewPager.OnPageChangeListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.TabsFragment$onCreateView$5$1
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            /* renamed from: b */
            public void mo4343b(int i2) {
                TabsFragment.this.mo15458n4(i2);
                TabsFragment.this.f27888d = i2;
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
        mo15458n4(this.f27888d);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.m32179h(view, "view");
        mo15458n4(0);
    }
}
