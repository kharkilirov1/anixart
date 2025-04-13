package com.swiftsoft.anixartd.p015ui.fragment.main.preference;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.BasePreferenceFragment;
import com.swiftsoft.anixartd.presentation.main.preference.AdditionalPreferenceView;
import com.swiftsoft.anixartd.presentation.main.preference.MainPreferencePresenter;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdditionalPreferenceFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/preference/AdditionalPreferenceFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BasePreferenceFragment;", "Lcom/swiftsoft/anixartd/presentation/main/preference/AdditionalPreferenceView;", "<init>", "()V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class AdditionalPreferenceFragment extends BasePreferenceFragment implements AdditionalPreferenceView {

    /* renamed from: r */
    public static final /* synthetic */ KProperty<Object>[] f28289r = {C2052a.m12277l(AdditionalPreferenceFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/preference/MainPreferencePresenter;", 0)};

    /* renamed from: o */
    @Inject
    public Lazy<MainPreferencePresenter> f28290o;

    /* renamed from: p */
    @NotNull
    public final MoxyKtxDelegate f28291p;

    /* renamed from: q */
    @NotNull
    public Map<Integer, View> f28292q = new LinkedHashMap();

    public AdditionalPreferenceFragment() {
        Function0<MainPreferencePresenter> function0 = new Function0<MainPreferencePresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.AdditionalPreferenceFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public MainPreferencePresenter invoke() {
                Lazy<MainPreferencePresenter> lazy = AdditionalPreferenceFragment.this.f28290o;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28291p = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(MainPreferencePresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BasePreferenceFragment, com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment
    /* renamed from: A3 */
    public void mo14168A3() {
        this.f28292q.clear();
    }

    @Override // com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment, androidx.preference.PreferenceFragmentCompat
    /* renamed from: n3 */
    public void mo3417n3(@Nullable Bundle bundle, @Nullable String str) {
        App.f25340b.m14043a().mo14154v0(this);
        getMvpDelegate().onCreate(bundle);
        m3418u3(C2507R.xml.preference_additional, str);
        Preference mo3340t0 = mo3340t0("alternative_connection");
        Intrinsics.m32176e(mo3340t0);
        SwitchPreference switchPreference = (SwitchPreference) mo3340t0;
        switchPreference.m3461R(((MainPreferencePresenter) this.f28291p.getValue(this, f28289r[0])).f26543a.m14082y());
        switchPreference.f4968f = new C2696b(this, 0);
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_preference, viewGroup, false);
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        ((AppCompatTextView) inflate.findViewById(C2507R.id.title)).setText(getResources().getString(C2507R.string.settings_additional));
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C2507R.id.resultLayout);
        Intrinsics.m32178g(relativeLayout, "rootView.resultLayout");
        ViewsKt.m16378k(relativeLayout);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2695a(this, 0));
        ((FrameLayout) inflate.findViewById(C2507R.id.fragment_container)).addView(onCreateView);
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BasePreferenceFragment, com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment, androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28292q.clear();
    }
}
