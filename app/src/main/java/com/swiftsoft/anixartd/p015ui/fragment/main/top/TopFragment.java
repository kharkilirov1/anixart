package com.swiftsoft.anixartd.p015ui.fragment.main.top;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.main.CommonTabsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.top.TopTabFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: TopFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/top/TopFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/main/CommonTabsFragment;", "<init>", "()V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class TopFragment extends CommonTabsFragment {

    /* renamed from: g */
    @NotNull
    public Map<Integer, View> f28931g = new LinkedHashMap();

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.CommonTabsFragment
    @NotNull
    /* renamed from: A3 */
    public String mo15448A3(int i2) {
        return "INNER_TAB_NONE";
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.CommonTabsFragment
    @NotNull
    /* renamed from: c4 */
    public Fragment mo15449c4(int i2) {
        long j2 = i2;
        if (i2 == 0) {
            return TopTabFragment.Companion.m15657a(TopTabFragment.f28932k, j2, null, 2L, 2);
        }
        if (i2 == 1) {
            return TopTabFragment.Companion.m15657a(TopTabFragment.f28932k, j2, null, 1L, 2);
        }
        if (i2 == 2) {
            return TopTabFragment.Companion.m15657a(TopTabFragment.f28932k, j2, 2L, null, 4);
        }
        if (i2 == 3) {
            return TopTabFragment.Companion.m15657a(TopTabFragment.f28932k, j2, 3L, null, 4);
        }
        throw new Exception(C0000a.m7d("Invalid position: ", i2));
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.CommonTabsFragment
    @NotNull
    /* renamed from: e4 */
    public String mo15450e4(int i2) {
        Context context = getContext();
        if (context == null) {
            throw new Exception("invalid state");
        }
        if (i2 == 0) {
            String string = context.getString(C2507R.string.tab_title_ongoing);
            Intrinsics.m32178g(string, "context.getString(R.string.tab_title_ongoing)");
            return string;
        }
        if (i2 == 1) {
            String string2 = context.getString(C2507R.string.tab_title_finished);
            Intrinsics.m32178g(string2, "context.getString(R.string.tab_title_finished)");
            return string2;
        }
        if (i2 == 2) {
            String string3 = context.getString(C2507R.string.tab_title_movies);
            Intrinsics.m32178g(string3, "context.getString(R.string.tab_title_movies)");
            return string3;
        }
        if (i2 != 3) {
            throw new Exception(C0000a.m7d("Invalid position: ", i2));
        }
        String string4 = context.getString(C2507R.string.tab_title_ova);
        Intrinsics.m32178g(string4, "context.getString(R.string.tab_title_ova)");
        return string4;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.CommonTabsFragment
    /* renamed from: m4 */
    public int mo15451m4() {
        return 4;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.CommonTabsFragment, com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28931g.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14095K(this);
        super.onCreate(bundle);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.CommonTabsFragment, com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28931g.clear();
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.CommonTabsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.m32179h(view, "view");
        ((AppCompatTextView) view.findViewById(C2507R.id.tvTitle)).setText(getString(C2507R.string.title_popular));
    }
}
