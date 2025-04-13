package com.swiftsoft.anixartd.p015ui.fragment;

import android.content.Context;
import android.view.View;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnAdVisible;
import com.swiftsoft.anixartd.utils.OnBottomNavigation;
import com.swiftsoft.anixartd.utils.OnRefreshAd;
import com.swiftsoft.anixartd.utils.OnSoftInputMode;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import moxy.MvpAppCompatFragment;
import org.jetbrains.annotations.NotNull;

/* compiled from: BaseFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lmoxy/MvpAppCompatFragment;", "<init>", "()V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class BaseFragment extends MvpAppCompatFragment {

    /* renamed from: b */
    public FragmentNavigation f27785b;

    /* renamed from: c */
    @NotNull
    public Map<Integer, View> f27786c = new LinkedHashMap();

    /* renamed from: n3 */
    public void mo15436n3() {
        this.f27786c.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        super.onAttach(context);
        if (context instanceof FragmentNavigation) {
            this.f27785b = (FragmentNavigation) context;
        }
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo15436n3();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        if (!z) {
            EventBusKt.m16327a(new OnSoftInputMode(32));
            EventBusKt.m16327a(new OnBottomNavigation(true));
            EventBusKt.m16327a(new OnAdVisible(true));
        }
        EventBusKt.m16327a(new OnRefreshAd());
    }

    @NotNull
    /* renamed from: u3 */
    public final FragmentNavigation m15437u3() {
        FragmentNavigation fragmentNavigation = this.f27785b;
        if (fragmentNavigation != null) {
            return fragmentNavigation;
        }
        Intrinsics.m32189r("mFragmentNavigation");
        throw null;
    }
}
