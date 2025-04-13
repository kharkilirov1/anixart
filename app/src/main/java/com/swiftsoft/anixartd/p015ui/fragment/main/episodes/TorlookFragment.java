package com.swiftsoft.anixartd.p015ui.fragment.main.episodes;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.snackbar.ViewOnClickListenerC1394a;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.episode.Type;
import com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment;
import com.swiftsoft.anixartd.p015ui.dialog.TorlookFilterDialog;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.episodes.TorlookFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.episodes.torlook.TorlookUiLogic;
import com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookPresenter;
import com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookView;
import com.swiftsoft.anixartd.utils.Common;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnAdVisible;
import com.swiftsoft.anixartd.utils.OnBottomNavigation;
import com.swiftsoft.anixartd.utils.OnSnackbar;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.yandex.metrica.YandexMetrica;
import dagger.Lazy;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TorlookFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/episodes/TorlookFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/episodes/torlook/TorlookView;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment$BaseDialogListener;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class TorlookFragment extends BaseFragment implements TorlookView, BaseDialogFragment.BaseDialogListener {

    /* renamed from: d */
    @Inject
    public Lazy<TorlookPresenter> f28121d;

    /* renamed from: e */
    @NotNull
    public final MoxyKtxDelegate f28122e;

    /* renamed from: f */
    public Release f28123f;

    /* renamed from: g */
    public ArrayList<Type> f28124g;

    /* renamed from: h */
    @NotNull
    public Map<Integer, View> f28125h = new LinkedHashMap();

    /* renamed from: j */
    public static final /* synthetic */ KProperty<Object>[] f28120j = {C2052a.m12277l(TorlookFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/episodes/torlook/TorlookPresenter;", 0)};

    /* renamed from: i */
    @NotNull
    public static final Companion f28119i = new Companion(null);

    /* compiled from: TorlookFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/episodes/TorlookFragment$Companion;", "", "", "CHOOSE_FILTER_TAG", "Ljava/lang/String;", "RELEASE_VALUE", "TYPES_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final TorlookFragment m15506a(@NotNull Release release, @NotNull List<Type> types) {
            Intrinsics.m32179h(types, "types");
            TorlookFragment torlookFragment = new TorlookFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("RELEASE_VALUE", release);
            bundle.putSerializable("TYPES_VALUE", new ArrayList(types));
            torlookFragment.setArguments(bundle);
            return torlookFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public TorlookFragment() {
        Function0<TorlookPresenter> function0 = new Function0<TorlookPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.episodes.TorlookFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public TorlookPresenter invoke() {
                Lazy<TorlookPresenter> lazy = TorlookFragment.this.f28121d;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28122e = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(TorlookPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Nullable
    /* renamed from: A3 */
    public View m15501A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28125h;
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

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookView
    /* renamed from: N0 */
    public void mo14623N0(@NotNull String link) {
        Intrinsics.m32179h(link, "link");
        Common common = new Common();
        Context requireContext = requireContext();
        Intrinsics.m32178g(requireContext, "requireContext()");
        common.m16300e(requireContext, link);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookView
    /* renamed from: a */
    public void mo14624a() {
        ProgressBar progress_bar = (ProgressBar) m15501A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookView
    /* renamed from: b */
    public void mo14625b() {
        ProgressBar progress_bar = (ProgressBar) m15501A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookView
    /* renamed from: c */
    public void mo14626c() {
        ((SwipeRefreshLayout) m15501A3(C2507R.id.refresh)).setEnabled(false);
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15501A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) m15501A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final TorlookPresenter m15502c4() {
        return (TorlookPresenter) this.f28122e.getValue(this, f28120j[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookView
    /* renamed from: d */
    public void mo14627d() {
        ((SwipeRefreshLayout) m15501A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookView
    /* renamed from: e */
    public void mo14628e() {
        ((SwipeRefreshLayout) m15501A3(C2507R.id.refresh)).setRefreshing(false);
    }

    @NotNull
    /* renamed from: e4 */
    public final Release m15503e4() {
        Release release = this.f28123f;
        if (release != null) {
            return release;
        }
        Intrinsics.m32189r("release");
        throw null;
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookView
    /* renamed from: m2 */
    public void mo14629m2(@NotNull String searchQuery) {
        Intrinsics.m32179h(searchQuery, "searchQuery");
        ((TextView) m15501A3(C2507R.id.search_query)).setText(searchQuery);
    }

    @NotNull
    /* renamed from: m4 */
    public final ArrayList<Type> m15504m4() {
        ArrayList<Type> arrayList = this.f28124g;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.m32189r("types");
        throw null;
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookView
    /* renamed from: n0 */
    public void mo14630n0(@NotNull String magnetLink) {
        Intrinsics.m32179h(magnetLink, "magnetLink");
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(magnetLink));
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Context requireContext = requireContext();
            Intrinsics.m32178g(requireContext, "requireContext()");
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(requireContext);
            builder.f30150b = 3;
            builder.m16318j(C2507R.string.information);
            String string = getString(C2507R.string.error_torlook_magnet_not_supported);
            Intrinsics.m32178g(string, "getString(R.string.error…ook_magnet_not_supported)");
            builder.m16310b(string);
            builder.m16315g(C2507R.string.install);
            builder.m16311c(C2507R.string.cancel);
            builder.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.episodes.TorlookFragment$onMagnetLinkNotSupported$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                    Dialogs.MaterialDialog it = materialDialog;
                    Intrinsics.m32179h(it, "it");
                    Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse("market://search?q=torrent%20client"));
                    Intrinsics.m32178g(data, "Intent(Intent.ACTION_VIE…rch?q=torrent%20client\"))");
                    TorlookFragment.this.startActivity(data);
                    return Unit.f63088a;
                }
            });
            builder.f30159k = true;
            builder.m16317i();
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28125h.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14109Y(this);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.containsKey("RELEASE_VALUE")) {
                Serializable serializable = arguments.getSerializable("RELEASE_VALUE");
                Intrinsics.m32177f(serializable, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.Release");
                this.f28123f = (Release) serializable;
            }
            if (arguments.containsKey("TYPES_VALUE")) {
                Serializable serializable2 = arguments.getSerializable("TYPES_VALUE");
                Intrinsics.m32177f(serializable2, "null cannot be cast to non-null type java.util.ArrayList<com.swiftsoft.anixartd.database.entity.episode.Type>{ kotlin.collections.TypeAliasesKt.ArrayList<com.swiftsoft.anixartd.database.entity.episode.Type> }");
                this.f28124g = (ArrayList) serializable2;
            }
        }
        if (bundle != null) {
            Serializable serializable3 = bundle.getSerializable("RELEASE_VALUE");
            Intrinsics.m32177f(serializable3, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.Release");
            this.f28123f = (Release) serializable3;
            Serializable serializable4 = bundle.getSerializable("TYPES_VALUE");
            Intrinsics.m32177f(serializable4, "null cannot be cast to non-null type java.util.ArrayList<com.swiftsoft.anixartd.database.entity.episode.Type>{ kotlin.collections.TypeAliasesKt.ArrayList<com.swiftsoft.anixartd.database.entity.episode.Type> }");
            this.f28124g = (ArrayList) serializable4;
            return;
        }
        TorlookPresenter m15502c4 = m15502c4();
        m15503e4();
        String titleRu = m15503e4().getTitleRu();
        String titleOriginal = m15503e4().getTitleOriginal();
        String titleAlt = m15503e4().getTitleAlt();
        ArrayList arrayList = new ArrayList();
        if (!(titleRu == null || titleRu.length() == 0)) {
            String titleRu2 = m15503e4().getTitleRu();
            Intrinsics.m32176e(titleRu2);
            arrayList.add(titleRu2);
        }
        if (!(titleOriginal == null || titleOriginal.length() == 0)) {
            String titleOriginal2 = m15503e4().getTitleOriginal();
            Intrinsics.m32176e(titleOriginal2);
            arrayList.add(titleOriginal2);
        }
        List list = EmptyList.f63144b;
        if (!(titleAlt == null || titleAlt.length() == 0)) {
            String titleAlt2 = m15503e4().getTitleAlt();
            Intrinsics.m32176e(titleAlt2);
            list = StringsKt.m33882H(titleAlt2);
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
        }
        Objects.requireNonNull(m15502c4);
        TorlookUiLogic torlookUiLogic = m15502c4.f26352c;
        Objects.requireNonNull(torlookUiLogic);
        torlookUiLogic.f29066g = arrayList;
        torlookUiLogic.f28956a = true;
        TorlookPresenter m15502c42 = m15502c4();
        String title = m15502c4().f26352c.f29066g.get(0);
        Objects.requireNonNull(m15502c42);
        Intrinsics.m32179h(title, "title");
        TorlookUiLogic torlookUiLogic2 = m15502c42.f26352c;
        Objects.requireNonNull(torlookUiLogic2);
        torlookUiLogic2.f29061b = title;
        m15502c42.getViewState().mo14629m2(title);
        TorlookPresenter presenter = m15502c4();
        Intrinsics.m32178g(presenter, "presenter");
        presenter.m14620b(presenter.f26353d.isEmpty(), false);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        final int i2 = 0;
        View inflate = inflater.inflate(C2507R.layout.fragment_torlook, viewGroup, false);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.episodes.d

            /* renamed from: c */
            public final /* synthetic */ TorlookFragment f28136c;

            {
                this.f28136c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        TorlookFragment this$0 = this.f28136c;
                        TorlookFragment.Companion companion = TorlookFragment.f28119i;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        break;
                    case 1:
                        TorlookFragment this$02 = this.f28136c;
                        TorlookFragment.Companion companion2 = TorlookFragment.f28119i;
                        Intrinsics.m32179h(this$02, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Помощь Torlook");
                        Common common = new Common();
                        Context requireContext = this$02.requireContext();
                        Intrinsics.m32178g(requireContext, "requireContext()");
                        StringBuilder sb = new StringBuilder();
                        sb.append(new Common().m16297b("https://anixart.tv", this$02.m15502c4().f26350a.m14082y()));
                        sb.append("/torlook-help?dark=");
                        Common common2 = new Common();
                        Context requireContext2 = this$02.requireContext();
                        Intrinsics.m32178g(requireContext2, "requireContext()");
                        sb.append(common2.m16299d(requireContext2));
                        common.m16300e(requireContext, sb.toString());
                        break;
                    default:
                        TorlookFragment this$03 = this.f28136c;
                        TorlookFragment.Companion companion3 = TorlookFragment.f28119i;
                        Intrinsics.m32179h(this$03, "this$0");
                        Integer valueOf = Integer.valueOf(this$03.m15502c4().f26352c.f29063d);
                        boolean z = this$03.m15502c4().f26352c.f29064e;
                        boolean z2 = this$03.m15502c4().f26352c.f29065f;
                        TorlookFilterDialog torlookFilterDialog = new TorlookFilterDialog();
                        Bundle bundle2 = new Bundle();
                        if (valueOf != null) {
                            bundle2.putInt("SELECTED_SORT_VALUE", valueOf.intValue());
                        }
                        bundle2.putBoolean("FORCED_SEARCH_VALUE", z);
                        bundle2.putBoolean("PROXY_TRACKERS_VALUE", z2);
                        torlookFilterDialog.setArguments(bundle2);
                        torlookFilterDialog.show(this$03.getChildFragmentManager(), "CHOOSE_FILTER_TAG");
                        break;
                }
            }
        });
        ((EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view)).setController(m15502c4().f26353d);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh);
        final int i3 = 1;
        swipeRefreshLayout.setColorSchemeResources(C2507R.color.refresh_progress);
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(C2507R.color.refresh_background);
        swipeRefreshLayout.setOnRefreshListener(new C2682e(this));
        ((RelativeLayout) inflate.findViewById(C2507R.id.bar_help)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.episodes.d

            /* renamed from: c */
            public final /* synthetic */ TorlookFragment f28136c;

            {
                this.f28136c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        TorlookFragment this$0 = this.f28136c;
                        TorlookFragment.Companion companion = TorlookFragment.f28119i;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        break;
                    case 1:
                        TorlookFragment this$02 = this.f28136c;
                        TorlookFragment.Companion companion2 = TorlookFragment.f28119i;
                        Intrinsics.m32179h(this$02, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Помощь Torlook");
                        Common common = new Common();
                        Context requireContext = this$02.requireContext();
                        Intrinsics.m32178g(requireContext, "requireContext()");
                        StringBuilder sb = new StringBuilder();
                        sb.append(new Common().m16297b("https://anixart.tv", this$02.m15502c4().f26350a.m14082y()));
                        sb.append("/torlook-help?dark=");
                        Common common2 = new Common();
                        Context requireContext2 = this$02.requireContext();
                        Intrinsics.m32178g(requireContext2, "requireContext()");
                        sb.append(common2.m16299d(requireContext2));
                        common.m16300e(requireContext, sb.toString());
                        break;
                    default:
                        TorlookFragment this$03 = this.f28136c;
                        TorlookFragment.Companion companion3 = TorlookFragment.f28119i;
                        Intrinsics.m32179h(this$03, "this$0");
                        Integer valueOf = Integer.valueOf(this$03.m15502c4().f26352c.f29063d);
                        boolean z = this$03.m15502c4().f26352c.f29064e;
                        boolean z2 = this$03.m15502c4().f26352c.f29065f;
                        TorlookFilterDialog torlookFilterDialog = new TorlookFilterDialog();
                        Bundle bundle2 = new Bundle();
                        if (valueOf != null) {
                            bundle2.putInt("SELECTED_SORT_VALUE", valueOf.intValue());
                        }
                        bundle2.putBoolean("FORCED_SEARCH_VALUE", z);
                        bundle2.putBoolean("PROXY_TRACKERS_VALUE", z2);
                        torlookFilterDialog.setArguments(bundle2);
                        torlookFilterDialog.show(this$03.getChildFragmentManager(), "CHOOSE_FILTER_TAG");
                        break;
                }
            }
        });
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.help);
        Intrinsics.m32178g(materialButton, "view.help");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.episodes.TorlookFragment$onCreateView$4
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                C2052a.m12281p(view, "it");
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(materialButton2, "view.repeat");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.episodes.TorlookFragment$onCreateView$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ((SwipeRefreshLayout) TorlookFragment.this.m15501A3(C2507R.id.refresh)).setEnabled(true);
                LinearLayout error_layout = (LinearLayout) TorlookFragment.this.m15501A3(C2507R.id.error_layout);
                Intrinsics.m32178g(error_layout, "error_layout");
                ViewsKt.m16372e(error_layout);
                TorlookFragment.this.m15505u();
                return Unit.f63088a;
            }
        });
        ((TextView) inflate.findViewById(C2507R.id.search_query)).setText(m15502c4().f26352c.f29061b);
        int i4 = 0;
        for (Object obj : m15504m4()) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.m32023h0();
                throw null;
            }
            View inflate2 = getLayoutInflater().inflate(C2507R.layout.item_chip, (ViewGroup) null, false);
            Intrinsics.m32177f(inflate2, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
            Chip chip = (Chip) inflate2;
            chip.setId(i4);
            chip.setText(((Type) obj).getName());
            ((ChipGroup) inflate.findViewById(C2507R.id.chip_group)).addView(chip);
            i4 = i5;
        }
        ((ChipGroup) inflate.findViewById(C2507R.id.chip_group)).setOnCheckedStateChangeListener(new C2682e(this));
        final int i6 = 2;
        ((LinearLayout) inflate.findViewById(C2507R.id.search_query_layout)).setOnClickListener(new ViewOnClickListenerC1394a(this, inflate, 2));
        ((RelativeLayout) inflate.findViewById(C2507R.id.search_filter)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.episodes.d

            /* renamed from: c */
            public final /* synthetic */ TorlookFragment f28136c;

            {
                this.f28136c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i6) {
                    case 0:
                        TorlookFragment this$0 = this.f28136c;
                        TorlookFragment.Companion companion = TorlookFragment.f28119i;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        break;
                    case 1:
                        TorlookFragment this$02 = this.f28136c;
                        TorlookFragment.Companion companion2 = TorlookFragment.f28119i;
                        Intrinsics.m32179h(this$02, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Помощь Torlook");
                        Common common = new Common();
                        Context requireContext = this$02.requireContext();
                        Intrinsics.m32178g(requireContext, "requireContext()");
                        StringBuilder sb = new StringBuilder();
                        sb.append(new Common().m16297b("https://anixart.tv", this$02.m15502c4().f26350a.m14082y()));
                        sb.append("/torlook-help?dark=");
                        Common common2 = new Common();
                        Context requireContext2 = this$02.requireContext();
                        Intrinsics.m32178g(requireContext2, "requireContext()");
                        sb.append(common2.m16299d(requireContext2));
                        common.m16300e(requireContext, sb.toString());
                        break;
                    default:
                        TorlookFragment this$03 = this.f28136c;
                        TorlookFragment.Companion companion3 = TorlookFragment.f28119i;
                        Intrinsics.m32179h(this$03, "this$0");
                        Integer valueOf = Integer.valueOf(this$03.m15502c4().f26352c.f29063d);
                        boolean z = this$03.m15502c4().f26352c.f29064e;
                        boolean z2 = this$03.m15502c4().f26352c.f29065f;
                        TorlookFilterDialog torlookFilterDialog = new TorlookFilterDialog();
                        Bundle bundle2 = new Bundle();
                        if (valueOf != null) {
                            bundle2.putInt("SELECTED_SORT_VALUE", valueOf.intValue());
                        }
                        bundle2.putBoolean("FORCED_SEARCH_VALUE", z);
                        bundle2.putBoolean("PROXY_TRACKERS_VALUE", z2);
                        torlookFilterDialog.setArguments(bundle2);
                        torlookFilterDialog.show(this$03.getChildFragmentManager(), "CHOOSE_FILTER_TAG");
                        break;
                }
            }
        });
        EventBusKt.m16327a(new OnBottomNavigation(true));
        EventBusKt.m16327a(new OnAdVisible(true));
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28125h.clear();
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        EventBusKt.m16327a(new OnBottomNavigation(true));
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        outState.putSerializable("RELEASE_VALUE", m15503e4());
        outState.putSerializable("TYPES_VALUE", m15504m4());
        super.onSaveInstanceState(outState);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookView
    /* renamed from: t1 */
    public void mo14631t1() {
        String string = getString(C2507R.string.error_torlook_magnet);
        Intrinsics.m32178g(string, "getString(R.string.error_torlook_magnet)");
        EventBusKt.m16327a(new OnSnackbar(string));
    }

    /* renamed from: u */
    public final void m15505u() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15501A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        ((EpoxyRecyclerView) m15501A3(C2507R.id.recycler_view)).m3826w0(0);
        TorlookPresenter m15502c4 = m15502c4();
        TorlookUiLogic torlookUiLogic = m15502c4.f26352c;
        if (torlookUiLogic.f28956a) {
            torlookUiLogic.f29068i = "";
            torlookUiLogic.f29069j = false;
            torlookUiLogic.f29067h.clear();
            m15502c4.m14620b(false, true);
        }
    }

    @Override // com.swiftsoft.anixartd.ui.dialog.BaseDialogFragment.BaseDialogListener
    /* renamed from: y3 */
    public boolean mo15336y3(@Nullable String str, @NotNull String button, @NotNull Intent intent) {
        Intrinsics.m32179h(button, "button");
        Intrinsics.m32179h(intent, "intent");
        if (!Intrinsics.m32174c(str, "CHOOSE_FILTER_TAG")) {
            return false;
        }
        int intExtra = intent.getIntExtra("SELECTED_SORT_VALUE", 0);
        boolean booleanExtra = intent.getBooleanExtra("FORCED_SEARCH_VALUE", false);
        boolean booleanExtra2 = intent.getBooleanExtra("PROXY_TRACKERS_VALUE", false);
        m15502c4().f26352c.f29063d = intExtra;
        m15502c4().f26352c.f29064e = booleanExtra;
        m15502c4().f26352c.f29065f = booleanExtra2;
        m15505u();
        return true;
    }
}
