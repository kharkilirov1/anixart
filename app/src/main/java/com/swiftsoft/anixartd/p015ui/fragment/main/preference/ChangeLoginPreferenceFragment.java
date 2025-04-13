package com.swiftsoft.anixartd.p015ui.fragment.main.preference;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.preference.ChangeLoginPreferenceUiLogic;
import com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferencePresenter;
import com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferenceView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomNavigation;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChangeLoginPreferenceFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/preference/ChangeLoginPreferenceFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/preference/ChangeLoginPreferenceView;", "<init>", "()V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ChangeLoginPreferenceFragment extends BaseFragment implements ChangeLoginPreferenceView {

    /* renamed from: h */
    public static final /* synthetic */ KProperty<Object>[] f28302h = {C2052a.m12277l(ChangeLoginPreferenceFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/preference/ChangeLoginPreferencePresenter;", 0)};

    /* renamed from: d */
    public EndlessRecyclerViewScrollListener f28303d;

    /* renamed from: e */
    @Inject
    public Lazy<ChangeLoginPreferencePresenter> f28304e;

    /* renamed from: f */
    @NotNull
    public final MoxyKtxDelegate f28305f;

    /* renamed from: g */
    @NotNull
    public Map<Integer, View> f28306g = new LinkedHashMap();

    public ChangeLoginPreferenceFragment() {
        Function0<ChangeLoginPreferencePresenter> function0 = new Function0<ChangeLoginPreferencePresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.ChangeLoginPreferenceFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public ChangeLoginPreferencePresenter invoke() {
                Lazy<ChangeLoginPreferencePresenter> lazy = ChangeLoginPreferenceFragment.this.f28304e;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProviderLogin");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28305f = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(ChangeLoginPreferencePresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Nullable
    /* renamed from: A3 */
    public View m15527A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28306g;
        View view = map.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i2)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferenceView
    /* renamed from: F0 */
    public void mo14736F0() {
        Context context = getContext();
        if (context != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context, C2507R.style.DialogTheme);
            final View inflate = getLayoutInflater().inflate(C2507R.layout.dialog_change_login, (ViewGroup) null);
            builder.setView(inflate);
            final AlertDialog m378l = builder.m378l();
            TextInputEditText onChange$lambda$7$lambda$6 = (TextInputEditText) inflate.findViewById(C2507R.id.login_edit_text);
            Intrinsics.m32178g(onChange$lambda$7$lambda$6, "onChange$lambda$7$lambda$6");
            onChange$lambda$7$lambda$6.addTextChangedListener(new TextWatcher() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.ChangeLoginPreferenceFragment$onChange$lambda$7$lambda$6$$inlined$addTextChangedListener$default$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(@Nullable Editable editable) {
                    String valueOf = String.valueOf(editable);
                    ChangeLoginPreferenceFragment changeLoginPreferenceFragment = ChangeLoginPreferenceFragment.this;
                    KProperty<Object>[] kPropertyArr = ChangeLoginPreferenceFragment.f28302h;
                    ChangeLoginPreferenceUiLogic changeLoginPreferenceUiLogic = changeLoginPreferenceFragment.m15528c4().f26510f;
                    Objects.requireNonNull(changeLoginPreferenceUiLogic);
                    changeLoginPreferenceUiLogic.f29137e = valueOf;
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
                }
            });
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.positive_button);
            Intrinsics.m32178g(materialButton, "view.positive_button");
            ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.ChangeLoginPreferenceFragment$onChange$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(View view) {
                    View it = view;
                    Intrinsics.m32179h(it, "it");
                    ChangeLoginPreferenceFragment changeLoginPreferenceFragment = ChangeLoginPreferenceFragment.this;
                    KProperty<Object>[] kPropertyArr = ChangeLoginPreferenceFragment.f28302h;
                    if (changeLoginPreferenceFragment.m15528c4().f26510f.f29137e.length() == 0) {
                        ((TextInputLayout) inflate.findViewById(C2507R.id.login_input_layout)).setError("Никнейм не указан");
                    } else {
                        ChangeLoginPreferenceFragment.this.m15528c4().m14733a();
                        m378l.dismiss();
                    }
                    return Unit.f63088a;
                }
            });
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.negative_button);
            Intrinsics.m32178g(materialButton2, "view.negative_button");
            ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.ChangeLoginPreferenceFragment$onChange$1$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(View view) {
                    View it = view;
                    Intrinsics.m32179h(it, "it");
                    AlertDialog.this.dismiss();
                    return Unit.f63088a;
                }
            });
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferenceView
    /* renamed from: a */
    public void mo14737a() {
        ProgressBar progress_bar = (ProgressBar) m15527A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferenceView
    /* renamed from: b */
    public void mo14738b() {
        ProgressBar progress_bar = (ProgressBar) m15527A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferenceView
    /* renamed from: c */
    public void mo14739c() {
        ((SwipeRefreshLayout) m15527A3(C2507R.id.refresh)).setEnabled(false);
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15527A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) m15527A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final ChangeLoginPreferencePresenter m15528c4() {
        return (ChangeLoginPreferencePresenter) this.f28305f.getValue(this, f28302h[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferenceView
    /* renamed from: d */
    public void mo14740d() {
        ((SwipeRefreshLayout) m15527A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferenceView
    /* renamed from: e */
    public void mo14741e() {
        ((SwipeRefreshLayout) m15527A3(C2507R.id.refresh)).setRefreshing(false);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28306g.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14101Q(this);
        super.onCreate(bundle);
        m15528c4().f26510f.f28956a = true;
        ChangeLoginPreferencePresenter presenter = m15528c4();
        Intrinsics.m32178g(presenter, "presenter");
        ChangeLoginPreferencePresenter.m14732c(presenter, false, false, 3);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_change_login, viewGroup, false);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2695a(this, 2));
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
        final RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = new EndlessRecyclerViewScrollListener(layoutManager) { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.ChangeLoginPreferenceFragment$onCreateView$2$1
            @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
            /* renamed from: e */
            public void mo15318e(int i2, int i3, @Nullable RecyclerView recyclerView) {
                ChangeLoginPreferenceFragment changeLoginPreferenceFragment = ChangeLoginPreferenceFragment.this;
                KProperty<Object>[] kPropertyArr = ChangeLoginPreferenceFragment.f28302h;
                ChangeLoginPreferencePresenter m15528c4 = changeLoginPreferenceFragment.m15528c4();
                m15528c4.f26510f.f29134b++;
                ChangeLoginPreferencePresenter.m14732c(m15528c4, false, false, 3);
            }
        };
        this.f28303d = endlessRecyclerViewScrollListener;
        epoxyRecyclerView.m3806m(endlessRecyclerViewScrollListener);
        epoxyRecyclerView.setController(m15528c4().f26511g);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh);
        swipeRefreshLayout.setColorSchemeResources(C2507R.color.refresh_progress);
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(C2507R.color.refresh_background);
        swipeRefreshLayout.setOnRefreshListener(new C2696b(this, 1));
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.help);
        Intrinsics.m32178g(materialButton, "view.help");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.ChangeLoginPreferenceFragment$onCreateView$4
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                C2052a.m12281p(view, "it");
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(materialButton2, "view.repeat");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.ChangeLoginPreferenceFragment$onCreateView$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ((SwipeRefreshLayout) ChangeLoginPreferenceFragment.this.m15527A3(C2507R.id.refresh)).setEnabled(true);
                LinearLayout error_layout = (LinearLayout) ChangeLoginPreferenceFragment.this.m15527A3(C2507R.id.error_layout);
                Intrinsics.m32178g(error_layout, "error_layout");
                ViewsKt.m16372e(error_layout);
                ChangeLoginPreferenceFragment.this.m15529u();
                return Unit.f63088a;
            }
        });
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28306g.clear();
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        EventBusKt.m16327a(new OnBottomNavigation(false));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferenceView
    /* renamed from: r */
    public void mo14742r() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_login_invalid);
        Intrinsics.m32178g(string, "getString(R.string.error_login_invalid)");
        dialogs.m16308g(this, string, 0);
    }

    /* renamed from: u */
    public final void m15529u() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15527A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        ((EpoxyRecyclerView) m15527A3(C2507R.id.recycler_view)).m3826w0(0);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28303d;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        ChangeLoginPreferencePresenter m15528c4 = m15528c4();
        ChangeLoginPreferenceUiLogic changeLoginPreferenceUiLogic = m15528c4.f26510f;
        if (changeLoginPreferenceUiLogic.f28956a) {
            changeLoginPreferenceUiLogic.f29134b = 0;
            changeLoginPreferenceUiLogic.f29136d = "";
            changeLoginPreferenceUiLogic.f29138f = false;
            changeLoginPreferenceUiLogic.f29139g = 0L;
            changeLoginPreferenceUiLogic.f29135c.clear();
            m15528c4.m14734b(false, true);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferenceView
    /* renamed from: w2 */
    public void mo14743w2() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.login_changed_successfully);
        Intrinsics.m32178g(string, "getString(R.string.login_changed_successfully)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferenceView
    /* renamed from: y */
    public void mo14744y() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            String string = getString(C2507R.string.error);
            Intrinsics.m32178g(string, "getString(R.string.error)");
            builder.m16319k(string);
            String string2 = getString(C2507R.string.error_login_already_taken);
            Intrinsics.m32178g(string2, "getString(R.string.error_login_already_taken)");
            builder.m16310b(string2);
            builder.m16315g(C2507R.string.ok);
            builder.m16317i();
        }
    }
}
