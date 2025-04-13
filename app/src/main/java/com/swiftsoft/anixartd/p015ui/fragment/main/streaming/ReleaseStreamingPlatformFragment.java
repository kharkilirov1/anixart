package com.swiftsoft.anixartd.p015ui.fragment.main.streaming;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.room.util.C0576a;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2625a;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.episodes.EpisodesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.streaming.ReleaseStreamingPlatformFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.streaming.ReleaseStreamingPlatformUiLogic;
import com.swiftsoft.anixartd.presentation.main.streaming.ReleaseStreamingPlatformPresenter;
import com.swiftsoft.anixartd.presentation.main.streaming.ReleaseStreamingPlatformView;
import com.swiftsoft.anixartd.utils.Common;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomNavigation;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.yandex.metrica.YandexMetrica;
import dagger.Lazy;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleaseStreamingPlatformFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/streaming/ReleaseStreamingPlatformFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/streaming/ReleaseStreamingPlatformView;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReleaseStreamingPlatformFragment extends BaseFragment implements ReleaseStreamingPlatformView {

    /* renamed from: d */
    @Inject
    public Lazy<ReleaseStreamingPlatformPresenter> f28922d;

    /* renamed from: e */
    @NotNull
    public final MoxyKtxDelegate f28923e;

    /* renamed from: f */
    public long f28924f;

    /* renamed from: g */
    public Release f28925g;

    /* renamed from: h */
    @NotNull
    public Map<Integer, View> f28926h = new LinkedHashMap();

    /* renamed from: j */
    public static final /* synthetic */ KProperty<Object>[] f28921j = {C2052a.m12277l(ReleaseStreamingPlatformFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/streaming/ReleaseStreamingPlatformPresenter;", 0)};

    /* renamed from: i */
    @NotNull
    public static final Companion f28920i = new Companion(null);

    /* compiled from: ReleaseStreamingPlatformFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/streaming/ReleaseStreamingPlatformFragment$Companion;", "", "", "COUNT_SKIP_STREAMING_PLATFORM", "I", "", "ID_VALUE", "Ljava/lang/String;", "RELEASE_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final ReleaseStreamingPlatformFragment m15655a(long j2, @NotNull Release release) {
            Intrinsics.m32179h(release, "release");
            ReleaseStreamingPlatformFragment releaseStreamingPlatformFragment = new ReleaseStreamingPlatformFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("ID_VALUE", j2);
            bundle.putSerializable("RELEASE_VALUE", release);
            releaseStreamingPlatformFragment.setArguments(bundle);
            return releaseStreamingPlatformFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ReleaseStreamingPlatformFragment() {
        Function0<ReleaseStreamingPlatformPresenter> function0 = new Function0<ReleaseStreamingPlatformPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.streaming.ReleaseStreamingPlatformFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public ReleaseStreamingPlatformPresenter invoke() {
                Lazy<ReleaseStreamingPlatformPresenter> lazy = ReleaseStreamingPlatformFragment.this.f28922d;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28923e = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(ReleaseStreamingPlatformPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Nullable
    /* renamed from: A3 */
    public View m15652A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28926h;
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

    @Override // com.swiftsoft.anixartd.presentation.main.streaming.ReleaseStreamingPlatformView
    /* renamed from: K0 */
    public void mo15235K0() {
        HashMap hashMap = new HashMap();
        hashMap.put("third_party", Long.valueOf(this.f28924f));
        YandexMetrica.reportEvent("Открытие стриминг платформы", hashMap);
        if (m15653c4().f27246b.m14058a() == 4 && !m15653c4().f27246b.m14045A() && !m15653c4().f27246b.f25344a.getBoolean("IS_ASKED_SKIP_THIRD_PARTY_PLATFORM", false)) {
            m15653c4().f27246b.f25344a.edit().putBoolean("IS_ASKED_SKIP_THIRD_PARTY_PLATFORM", true).apply();
            Context requireContext = requireContext();
            Intrinsics.m32178g(requireContext, "requireContext()");
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(requireContext);
            builder.f30150b = 3;
            String string = getString(C2507R.string.remembering_skip_third_party_platform_title);
            Intrinsics.m32178g(string, "getString(R.string.remem…ird_party_platform_title)");
            builder.f30151c = string;
            String string2 = getString(C2507R.string.remembering_skip_third_party_platform_desc);
            Intrinsics.m32178g(string2, "getString(R.string.remem…hird_party_platform_desc)");
            builder.f30152d = string2;
            String string3 = getString(C2507R.string.yes);
            Intrinsics.m32178g(string3, "getString(R.string.yes)");
            builder.f30154f = string3;
            String string4 = getString(C2507R.string.cancel);
            Intrinsics.m32178g(string4, "getString(R.string.cancel)");
            builder.f30153e = string4;
            builder.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.streaming.ReleaseStreamingPlatformFragment$onThirdPartyStreamingPlatform$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                    Dialogs.MaterialDialog it = materialDialog;
                    Intrinsics.m32179h(it, "it");
                    ReleaseStreamingPlatformFragment releaseStreamingPlatformFragment = ReleaseStreamingPlatformFragment.this;
                    ReleaseStreamingPlatformFragment.Companion companion = ReleaseStreamingPlatformFragment.f28920i;
                    releaseStreamingPlatformFragment.m15653c4().f27246b.m14055K(true);
                    ReleaseStreamingPlatformFragment.this.m15653c4().f27246b.m14056L(true);
                    ReleaseStreamingPlatformFragment.this.m15437u3().mo15324d2(EpisodesFragment.f28080m.m15500a(ReleaseStreamingPlatformFragment.this.m15654e4().getId(), ReleaseStreamingPlatformFragment.this.m15654e4()), null);
                    return Unit.f63088a;
                }
            });
            builder.m16313e(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.streaming.ReleaseStreamingPlatformFragment$onThirdPartyStreamingPlatform$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                    Dialogs.MaterialDialog it = materialDialog;
                    Intrinsics.m32179h(it, "it");
                    ReleaseStreamingPlatformFragment releaseStreamingPlatformFragment = ReleaseStreamingPlatformFragment.this;
                    ReleaseStreamingPlatformFragment.Companion companion = ReleaseStreamingPlatformFragment.f28920i;
                    releaseStreamingPlatformFragment.m15437u3().mo15324d2(EpisodesFragment.f28080m.m15500a(ReleaseStreamingPlatformFragment.this.m15654e4().getId(), ReleaseStreamingPlatformFragment.this.m15654e4()), null);
                    return Unit.f63088a;
                }
            });
            builder.f30159k = true;
            builder.m16317i();
            return;
        }
        if (m15653c4().f27246b.f25344a.getBoolean("SEARCH_VIDEO_TPP", false)) {
            if (m15653c4().f27246b.m14058a() < 4) {
                Prefs prefs = m15653c4().f27246b;
                C0576a.m4125x(prefs.f25344a, "COUNT_SKIP_STREAMING_PLATFORM", prefs.m14058a() + 1);
            }
            m15437u3().mo15324d2(EpisodesFragment.f28080m.m15500a(m15654e4().getId(), m15654e4()), null);
            return;
        }
        Context requireContext2 = requireContext();
        Intrinsics.m32178g(requireContext2, "requireContext()");
        Dialogs.MaterialDialog.Builder builder2 = new Dialogs.MaterialDialog.Builder(requireContext2);
        builder2.f30150b = 3;
        String string5 = getString(C2507R.string.search_video_title);
        Intrinsics.m32178g(string5, "getString(R.string.search_video_title)");
        builder2.f30151c = string5;
        String string6 = getString(C2507R.string.search_video_desc);
        Intrinsics.m32178g(string6, "getString(R.string.search_video_desc)");
        builder2.f30152d = string6;
        String string7 = getString(C2507R.string.search_video);
        Intrinsics.m32178g(string7, "getString(R.string.search_video)");
        builder2.f30154f = string7;
        String string8 = getString(C2507R.string.cancel);
        Intrinsics.m32178g(string8, "getString(R.string.cancel)");
        builder2.f30153e = string8;
        builder2.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.streaming.ReleaseStreamingPlatformFragment$onThirdPartyStreamingPlatform$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                Dialogs.MaterialDialog it = materialDialog;
                Intrinsics.m32179h(it, "it");
                ReleaseStreamingPlatformFragment releaseStreamingPlatformFragment = ReleaseStreamingPlatformFragment.this;
                ReleaseStreamingPlatformFragment.Companion companion = ReleaseStreamingPlatformFragment.f28920i;
                releaseStreamingPlatformFragment.m15653c4().f27246b.m14056L(true);
                ReleaseStreamingPlatformFragment.this.m15437u3().mo15324d2(EpisodesFragment.f28080m.m15500a(ReleaseStreamingPlatformFragment.this.m15654e4().getId(), ReleaseStreamingPlatformFragment.this.m15654e4()), null);
                Prefs prefs2 = ReleaseStreamingPlatformFragment.this.m15653c4().f27246b;
                C0576a.m4125x(prefs2.f25344a, "COUNT_SKIP_STREAMING_PLATFORM", prefs2.m14058a() + 1);
                return Unit.f63088a;
            }
        });
        builder2.f30159k = true;
        builder2.m16317i();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.streaming.ReleaseStreamingPlatformView
    /* renamed from: T0 */
    public void mo15236T0(@NotNull String url) {
        Intrinsics.m32179h(url, "url");
        String m16296a = new Common().m16296a(url);
        HashMap hashMap = new HashMap();
        hashMap.put(m16296a, Long.valueOf(this.f28924f));
        YandexMetrica.reportEvent("Открытие стриминг платформы", hashMap);
        Common common = new Common();
        Context requireContext = requireContext();
        Intrinsics.m32178g(requireContext, "requireContext()");
        common.m16300e(requireContext, url);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.streaming.ReleaseStreamingPlatformView
    /* renamed from: a */
    public void mo15237a() {
        ProgressBar progress_bar = (ProgressBar) m15652A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.streaming.ReleaseStreamingPlatformView
    /* renamed from: b */
    public void mo15238b() {
        ProgressBar progress_bar = (ProgressBar) m15652A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.streaming.ReleaseStreamingPlatformView
    /* renamed from: c */
    public void mo15239c() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15652A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) m15652A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final ReleaseStreamingPlatformPresenter m15653c4() {
        return (ReleaseStreamingPlatformPresenter) this.f28923e.getValue(this, f28921j[0]);
    }

    @NotNull
    /* renamed from: e4 */
    public final Release m15654e4() {
        Release release = this.f28925g;
        if (release != null) {
            return release;
        }
        Intrinsics.m32189r("release");
        throw null;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28926h.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14105U(this);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f28924f = arguments.getLong("ID_VALUE");
            Serializable serializable = arguments.getSerializable("RELEASE_VALUE");
            Intrinsics.m32177f(serializable, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.Release");
            this.f28925g = (Release) serializable;
        }
        ReleaseStreamingPlatformPresenter m15653c4 = m15653c4();
        long j2 = this.f28924f;
        Release m15654e4 = m15654e4();
        Objects.requireNonNull(m15653c4);
        ReleaseStreamingPlatformUiLogic releaseStreamingPlatformUiLogic = m15653c4.f27248d;
        Objects.requireNonNull(releaseStreamingPlatformUiLogic);
        releaseStreamingPlatformUiLogic.f29360b = j2;
        releaseStreamingPlatformUiLogic.f29361c = m15654e4;
        releaseStreamingPlatformUiLogic.f28956a = true;
        ReleaseStreamingPlatformPresenter presenter = m15653c4();
        Intrinsics.m32178g(presenter, "presenter");
        ReleaseStreamingPlatformPresenter.m15232a(presenter, false, 1);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_streaming_platform, viewGroup, false);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2625a(this, 29));
        ((EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view)).setController(m15653c4().f27249e);
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28926h.clear();
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        EventBusKt.m16327a(new OnBottomNavigation(true));
    }
}
