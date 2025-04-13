package com.swiftsoft.anixartd.p015ui.fragment;

import android.content.Context;
import android.view.View;
import com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomNavigation;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BasePreferenceFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/BasePreferenceFragment;", "Lcom/swiftsoft/anixartd/mvp/MvpAppCompatPreferenceFragment;", "<init>", "()V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class BasePreferenceFragment extends MvpAppCompatPreferenceFragment {

    /* renamed from: m */
    public FragmentNavigation f27787m;

    /* renamed from: n */
    @NotNull
    public Map<Integer, View> f27788n = new LinkedHashMap();

    @Override // com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment
    /* renamed from: A3 */
    public void mo14168A3() {
        this.f27788n.clear();
    }

    @NotNull
    /* renamed from: c4 */
    public final FragmentNavigation m15438c4() {
        FragmentNavigation fragmentNavigation = this.f27787m;
        if (fragmentNavigation != null) {
            return fragmentNavigation;
        }
        Intrinsics.m32189r("mFragmentNavigation");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        super.onAttach(context);
        if (context instanceof FragmentNavigation) {
            this.f27787m = (FragmentNavigation) context;
        }
    }

    @Override // com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment, androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo14168A3();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        if (z) {
            return;
        }
        EventBusKt.m16327a(new OnBottomNavigation(true));
    }
}
