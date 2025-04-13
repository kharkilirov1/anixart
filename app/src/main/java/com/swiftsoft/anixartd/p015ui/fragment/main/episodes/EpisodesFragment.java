package com.swiftsoft.anixartd.p015ui.fragment.main.episodes;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.RunnableC0042c;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.PopupMenu;
import androidx.core.content.ContextCompat;
import androidx.core.view.MenuCompat;
import androidx.room.util.C0576a;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.C2052a;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.FragmentBalloonLazy;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.episode.Episode;
import com.swiftsoft.anixartd.database.entity.episode.LastWatchedEpisode;
import com.swiftsoft.anixartd.database.entity.episode.Source;
import com.swiftsoft.anixartd.database.entity.episode.Type;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2625a;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2629e;
import com.swiftsoft.anixartd.p015ui.activity.kodik.KodikAdActivity;
import com.swiftsoft.anixartd.p015ui.activity.swiftplayer.SwiftPlayerActivity;
import com.swiftsoft.anixartd.p015ui.activity.webplayer.WebPlayerActivity;
import com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment;
import com.swiftsoft.anixartd.p015ui.dialog.ChooseDownloaderDialogFragment;
import com.swiftsoft.anixartd.p015ui.dialog.ChooseEpisodeQualityDialogFragment;
import com.swiftsoft.anixartd.p015ui.dialog.ChoosePlayerDialogFragment;
import com.swiftsoft.anixartd.p015ui.fragment.BackPressedListener;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.FragmentNavigation;
import com.swiftsoft.anixartd.p015ui.fragment.main.episodes.EpisodesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.episodes.updates.EpisodesUpdatesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.report.ReportFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.episodes.EpisodesUiLogic;
import com.swiftsoft.anixartd.p015ui.tooltip.EpisodeUpdatesBalloonFactory;
import com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter;
import com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.Downloader;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnFetchEpisode;
import com.swiftsoft.anixartd.utils.Quality;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.swiftsoft.anixartd.utils.radiobutton.CustomRadioGroup;
import com.yandex.div2.C3033a;
import com.yandex.metrica.YandexMetrica;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import dagger.Lazy;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;
import pub.devrel.easypermissions.AfterPermissionGranted;
import pub.devrel.easypermissions.EasyPermissions;
import pub.devrel.easypermissions.PermissionRequest;

/* compiled from: EpisodesFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u000b\fB\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0006\u001a\u00020\u0005H\u0017J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\r"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/episodes/EpisodesFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BackPressedListener;", "Lcom/swiftsoft/anixartd/presentation/main/episodes/EpisodesView;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment$BaseDialogListener;", "", "onDownloadEpisode", "Lcom/swiftsoft/anixartd/utils/OnFetchEpisode;", "onFetchEpisode", "<init>", "()V", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class EpisodesFragment extends BaseFragment implements BackPressedListener, EpisodesView, BaseDialogFragment.BaseDialogListener {

    /* renamed from: d */
    public InterstitialAd f28083d;

    /* renamed from: g */
    @Inject
    public Lazy<EpisodesPresenter> f28086g;

    /* renamed from: h */
    @NotNull
    public final MoxyKtxDelegate f28087h;

    /* renamed from: i */
    public long f28088i;

    /* renamed from: j */
    public Release f28089j;

    /* renamed from: k */
    @NotNull
    public final ActivityResultLauncher<Intent> f28090k;

    /* renamed from: n */
    public static final /* synthetic */ KProperty<Object>[] f28081n = {C2052a.m12277l(EpisodesFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/episodes/EpisodesPresenter;", 0)};

    /* renamed from: m */
    @NotNull
    public static final Companion f28080m = new Companion(null);

    /* renamed from: o */
    @NotNull
    public static final String[] f28082o = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    /* renamed from: l */
    @NotNull
    public Map<Integer, View> f28091l = new LinkedHashMap();

    /* renamed from: e */
    @NotNull
    public final kotlin.Lazy f28084e = new FragmentBalloonLazy(this, Reflection.m32193a(EpisodeUpdatesBalloonFactory.class));

    /* renamed from: f */
    @NotNull
    public final kotlin.Lazy f28085f = LazyKt.m31881b(new Function0<Dialogs.MaterialDialog>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.episodes.EpisodesFragment$dialog$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public Dialogs.MaterialDialog invoke() {
            Context context = EpisodesFragment.this.getContext();
            if (context == null) {
                return null;
            }
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 1;
            return new Dialogs.MaterialDialog(builder);
        }
    });

    /* compiled from: EpisodesFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/episodes/EpisodesFragment$Companion;", "", "", "CHOOSE_DOWNLOADER_TAG", "Ljava/lang/String;", "CHOOSE_PLAYER_TAG", "DOWNLOADER_CHOOSE_EPISODE_QUALITY_TAG", "ID_VALUE", "PLAYER_CHOOSE_EPISODE_QUALITY_TAG", "POSITION_VALUE", "", "RC_STORAGE", "I", "RELEASE_VALUE", "SOURCE_ID_VALUE", "", "STORAGE", "[Ljava/lang/String;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final EpisodesFragment m15500a(long j2, @NotNull Release release) {
            Intrinsics.m32179h(release, "release");
            EpisodesFragment episodesFragment = new EpisodesFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("ID_VALUE", j2);
            bundle.putSerializable("RELEASE_VALUE", release);
            episodesFragment.setArguments(bundle);
            return episodesFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: EpisodesFragment.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/episodes/EpisodesFragment$Listener;", "Lcom/swiftsoft/anixartd/utils/radiobutton/CustomRadioGroup$OnRadioButtonListener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends CustomRadioGroup.OnRadioButtonListener {
    }

    public EpisodesFragment() {
        Function0<EpisodesPresenter> function0 = new Function0<EpisodesPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.episodes.EpisodesFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public EpisodesPresenter invoke() {
                Lazy<EpisodesPresenter> lazy = EpisodesFragment.this.f28086g;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28087h = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(EpisodesPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
        ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new C2679b(this));
        Intrinsics.m32178g(registerForActivityResult, "registerForActivityResul…/\n            }\n        }");
        this.f28090k = registerForActivityResult;
    }

    /* renamed from: c4 */
    public static final void m15493c4(EpisodesFragment episodesFragment, String str, String str2) {
        Context context = episodesFragment.getContext();
        if (context != null) {
            View inflate = episodesFragment.getLayoutInflater().inflate(C2507R.layout.bottom_sheet_workers, (ViewGroup) null);
            BottomSheetDialog m12273h = C2052a.m12273h(context, inflate);
            ((TextView) inflate.findViewById(C2507R.id.type_name)).setText(str);
            ((TextView) inflate.findViewById(C2507R.id.workers_names)).setText(str2);
            ((MaterialButton) inflate.findViewById(C2507R.id.close)).setOnClickListener(new ViewOnClickListenerC2629e(m12273h, 3));
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: A1 */
    public void mo14593A1() {
        Balloon balloon = (Balloon) this.f28084e.getValue();
        if (balloon != null) {
            RelativeLayout updates = (RelativeLayout) m15494A3(C2507R.id.updates);
            Intrinsics.m32178g(updates, "updates");
            balloon.m13855s(updates, 0, 0);
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BackPressedListener
    /* renamed from: A2 */
    public boolean mo15435A2() {
        Balloon balloon = (Balloon) this.f28084e.getValue();
        if (balloon != null) {
            balloon.m13846j();
        }
        return m15496m4().m14571e();
    }

    @Nullable
    /* renamed from: A3 */
    public View m15494A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28091l;
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

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: G3 */
    public void mo14594G3(@NotNull Episode episode, int i2, int i3) {
        Intrinsics.m32179h(episode, "episode");
        Context requireContext = requireContext();
        Intrinsics.m32178g(requireContext, "requireContext()");
        KodikAdActivity.Companion companion = KodikAdActivity.f27523i;
        final Intent intent = new Intent(requireContext, (Class<?>) KodikAdActivity.class);
        intent.putExtra("EPISODE_VALUE", episode);
        intent.putExtra("SELECTED_EPISODE_ACTION_VALUE", i2);
        intent.putExtra("SELECTED_PLAYER_OR_DOWNLOADER_VALUE", i3);
        if (m15496m4().f26265b.f25344a.getBoolean("KODIK_AD_DISCLAIMER", false) || m15496m4().f26265b.m14047C()) {
            this.f28090k.mo315a(intent, null);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext, C2507R.style.DialogTheme);
        View inflate = getLayoutInflater().inflate(C2507R.layout.dialog_kodik_ad_disclaimer, (ViewGroup) null);
        builder.setView(inflate);
        final AlertDialog m378l = builder.m378l();
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.positive_button);
        Intrinsics.m32178g(materialButton, "view.positive_button");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.episodes.EpisodesFragment$onShowKodikAd$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                EpisodesFragment episodesFragment = EpisodesFragment.this;
                EpisodesFragment.Companion companion2 = EpisodesFragment.f28080m;
                C3033a.m17749k(episodesFragment.m15496m4().f26265b.f25344a, "KODIK_AD_DISCLAIMER", true);
                EpisodesFragment.this.f28090k.mo315a(intent, null);
                m378l.dismiss();
                return Unit.f63088a;
            }
        });
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: H1 */
    public void mo14595H1(@NotNull final Type type) {
        Intrinsics.m32179h(type, "type");
        ((AppCompatTextView) m15494A3(C2507R.id.title)).setText("Выберите источник");
        AppCompatTextView state = (AppCompatTextView) m15494A3(C2507R.id.state);
        Intrinsics.m32178g(state, "state");
        ViewsKt.m16372e(state);
        RelativeLayout sort = (RelativeLayout) m15494A3(C2507R.id.sort);
        Intrinsics.m32178g(sort, "sort");
        ViewsKt.m16372e(sort);
        RelativeLayout more = (RelativeLayout) m15494A3(C2507R.id.more);
        Intrinsics.m32178g(more, "more");
        ViewsKt.m16372e(more);
        final String workers = type.getWorkers();
        if (workers == null) {
            RelativeLayout workers2 = (RelativeLayout) m15494A3(C2507R.id.workers);
            Intrinsics.m32178g(workers2, "workers");
            ViewsKt.m16372e(workers2);
        } else {
            RelativeLayout workers3 = (RelativeLayout) m15494A3(C2507R.id.workers);
            Intrinsics.m32178g(workers3, "workers");
            ViewsKt.m16377j(workers3, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.episodes.EpisodesFragment$onType$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(View view) {
                    View it = view;
                    Intrinsics.m32179h(it, "it");
                    EpisodesFragment.m15493c4(EpisodesFragment.this, type.getName(), workers);
                    return Unit.f63088a;
                }
            });
            RelativeLayout workers4 = (RelativeLayout) m15494A3(C2507R.id.workers);
            Intrinsics.m32178g(workers4, "workers");
            ViewsKt.m16378k(workers4);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: L3 */
    public void mo14596L3(@NotNull Episode episode, @NotNull String cookie, @NotNull List<String> qualities, int i2) {
        String titleOriginal;
        Intrinsics.m32179h(episode, "episode");
        Intrinsics.m32179h(cookie, "cookie");
        Intrinsics.m32179h(qualities, "qualities");
        Context context = getContext();
        if (context == null) {
            return;
        }
        String str = qualities.get(0);
        if (str == null) {
            Dialogs.f30143a.m16307f(context, "Невозможно открыть выбранный релиз в стороннем плеере :c");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (qualities.get(1) != null) {
            arrayList.add("Default");
        }
        if (qualities.get(2) != null) {
            arrayList.add("360p");
        }
        if (qualities.get(3) != null) {
            arrayList.add("480p");
        }
        if (qualities.get(4) != null) {
            arrayList.add("720p");
        }
        if (qualities.get(5) != null) {
            arrayList.add("1080p");
        }
        String[] strArr = new String[arrayList.size()];
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            strArr[i3] = (String) arrayList.get(i3);
        }
        String titleRu = m15497n4().getTitleRu();
        if (titleRu == null || titleRu.length() == 0) {
            String titleOriginal2 = m15497n4().getTitleOriginal();
            titleOriginal = !(titleOriginal2 == null || titleOriginal2.length() == 0) ? m15497n4().getTitleOriginal() : null;
        } else {
            titleOriginal = m15497n4().getTitleRu();
        }
        if (titleOriginal == null) {
            titleOriginal = "Без названия";
        }
        String name = episode.getName();
        if (name == null) {
            name = "Неизвестная серия";
        }
        String str2 = name;
        try {
            List m32042s = CollectionsKt.m32042s(qualities);
            ArrayList arrayList2 = (ArrayList) m32042s;
            if (arrayList2.size() == 2) {
                m15499p4(str, cookie, (String) arrayList2.get(1), titleOriginal, str2);
            } else if (i2 != 0) {
                int m16353a = Quality.f30236a.m16353a(arrayList, Quality.f30237b.get(i2)) + 1;
                String str3 = (String) arrayList2.get(m16353a);
                System.out.println((Object) ("CHOOSE NEW QUALITY: " + m32042s + " => " + arrayList + " => " + m16353a + " => " + str3));
                m15499p4(str, cookie, str3, titleOriginal, str2);
            } else {
                ChooseEpisodeQualityDialogFragment.f27660k.m15419a(qualities, cookie, titleOriginal, str2, null).show(getChildFragmentManager(), "PLAYER_CHOOSE_EPISODE_QUALITY_TAG");
            }
        } catch (ActivityNotFoundException unused) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context, C2507R.style.DialogTheme);
            AlertController.AlertParams alertParams = builder.f413a;
            alertParams.f377f = "Сторонний плеер не найден";
            DialogInterfaceOnClickListenerC2678a dialogInterfaceOnClickListenerC2678a = new DialogInterface.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.episodes.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    EpisodesFragment.Companion companion = EpisodesFragment.f28080m;
                    dialogInterface.dismiss();
                }
            };
            alertParams.f380i = "ОК";
            alertParams.f381j = dialogInterfaceOnClickListenerC2678a;
            builder.m378l();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: N1 */
    public void mo14597N1(@NotNull Episode episode, int i2, @NotNull List<String> qualities) {
        String titleOriginal;
        Intrinsics.m32179h(episode, "episode");
        Intrinsics.m32179h(qualities, "qualities");
        Context context = getContext();
        if (context == null) {
            return;
        }
        String titleRu = m15497n4().getTitleRu();
        if (titleRu == null || titleRu.length() == 0) {
            String titleOriginal2 = m15497n4().getTitleOriginal();
            titleOriginal = !(titleOriginal2 == null || titleOriginal2.length() == 0) ? m15497n4().getTitleOriginal() : null;
        } else {
            titleOriginal = m15497n4().getTitleRu();
        }
        if (titleOriginal == null) {
            titleOriginal = "Без названия";
        }
        String name = episode.getName();
        if (name == null) {
            name = "Неизвестная серия";
        }
        String str = name;
        String str2 = qualities.get(0);
        ArrayList arrayList = new ArrayList();
        if (qualities.get(1) != null) {
            arrayList.add("Default");
        }
        if (qualities.get(2) != null) {
            arrayList.add("360p");
        }
        if (qualities.get(3) != null) {
            arrayList.add("480p");
        }
        if (qualities.get(4) != null) {
            arrayList.add("720p");
        }
        if (qualities.get(5) != null) {
            arrayList.add("1080p");
        }
        String[] strArr = new String[arrayList.size()];
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            strArr[i3] = (String) arrayList.get(i3);
        }
        List m32042s = CollectionsKt.m32042s(qualities);
        if (((ArrayList) m32042s).size() != 2) {
            ChooseEpisodeQualityDialogFragment.f27660k.m15419a(qualities, "", titleOriginal, str, Integer.valueOf(i2)).show(getChildFragmentManager(), "DOWNLOADER_CHOOSE_EPISODE_QUALITY_TAG");
            return;
        }
        if (str2 != null) {
            String str3 = (String) CollectionsKt.m32048y(m32042s, 1);
            if (str3 != null) {
                str2 = str3;
            }
            String substring = str2.substring(StringsKt.m33881G(str2, ".", 0, false, 6, null));
            Intrinsics.m32178g(substring, "this as java.lang.String).substring(startIndex)");
            MatchResult m33870a = new Regex("(\\.\\w{3,5})($|\\?)").m33870a(substring, 0);
            if (m33870a != null) {
                substring = m33870a.mo33868b().get(1);
            }
            if (i2 == 1) {
                Downloader.f30164a.m16326a(context, str2, titleOriginal + " — " + str + substring);
                return;
            }
            if (i2 == 2) {
                Intent addFlags = new Intent("android.intent.action.VIEW", Uri.parse(str2)).addFlags(268435456);
                Intrinsics.m32178g(addFlags, "Intent(Intent.ACTION_VIE…t.FLAG_ACTIVITY_NEW_TASK)");
                startActivity(Intent.createChooser(addFlags, "Открыть в").addFlags(268435456));
            }
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: O */
    public void mo14598O() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15494A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: P2 */
    public void mo14599P2(final int i2, final int i3) {
        new Handler().postDelayed(new Runnable() { // from class: com.swiftsoft.anixartd.ui.fragment.main.episodes.c
            @Override // java.lang.Runnable
            public final void run() {
                EpisodesFragment this$0 = EpisodesFragment.this;
                int i4 = i2;
                int i5 = i3;
                EpisodesFragment.Companion companion = EpisodesFragment.f28080m;
                Intrinsics.m32179h(this$0, "this$0");
                try {
                    EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) this$0.m15494A3(C2507R.id.recycler_view);
                    if (i4 != i5) {
                        i4++;
                    }
                    if (i4 > 50) {
                        epoxyRecyclerView.m3818s0(i4);
                    } else {
                        epoxyRecyclerView.m3826w0(i4);
                    }
                } catch (Exception unused) {
                }
            }
        }, 100L);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: R1 */
    public void mo14600R1() {
        ((AppCompatTextView) m15494A3(C2507R.id.title)).setText("Выберите вариант");
        AppCompatTextView state = (AppCompatTextView) m15494A3(C2507R.id.state);
        Intrinsics.m32178g(state, "state");
        ViewsKt.m16372e(state);
        RelativeLayout workers = (RelativeLayout) m15494A3(C2507R.id.workers);
        Intrinsics.m32178g(workers, "workers");
        ViewsKt.m16372e(workers);
        RelativeLayout sort = (RelativeLayout) m15494A3(C2507R.id.sort);
        Intrinsics.m32178g(sort, "sort");
        ViewsKt.m16372e(sort);
        RelativeLayout more = (RelativeLayout) m15494A3(C2507R.id.more);
        Intrinsics.m32178g(more, "more");
        ViewsKt.m16372e(more);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: S3 */
    public void mo14601S3(@NotNull List<String> array, @NotNull String cookie, @Nullable Long l2) {
        Intrinsics.m32179h(array, "array");
        Intrinsics.m32179h(cookie, "cookie");
        Context context = getContext();
        if (context == null) {
            throw new Exception("invalid state");
        }
        List<Episode> list = m15496m4().f26266c.f29049i;
        Episode episode = m15496m4().f26266c.f29057q;
        if (episode == null) {
            throw new Exception("invalid state");
        }
        int i2 = m15496m4().f26266c.f29046f;
        Iterator<Episode> it = list.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            } else {
                if (it.next().getPosition() == episode.getPosition()) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        SwiftPlayerActivity.TYPE type = SwiftPlayerActivity.f27540L;
        Release m15497n4 = m15497n4();
        String str = array.get(0);
        String str2 = array.get(1);
        String str3 = array.get(2);
        String str4 = array.get(3);
        String str5 = array.get(4);
        String str6 = array.get(5);
        Objects.requireNonNull(type);
        Intent intent = new Intent(context, (Class<?>) SwiftPlayerActivity.class);
        intent.putExtra("RELEASE_VALUE", m15497n4);
        intent.putExtra("COOKIE", cookie);
        intent.putExtra("URL_VALUE", str);
        intent.putExtra("QUALITY_DEFAULT_VALUE", str2);
        intent.putExtra("QUALITY_LOW_VALUE", str3);
        intent.putExtra("QUALITY_MEDIUM_VALUE", str4);
        intent.putExtra("QUALITY_HIGH_VALUE", str5);
        intent.putExtra("QUALITY_ULTRA_HIGH_VALUE", str6);
        Object[] array2 = list.toArray(new Episode[0]);
        Intrinsics.m32177f(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        intent.putExtra("EPISODES_VALUE", (Serializable) array2);
        intent.putExtra("INDEX_VALUE", i3);
        intent.putExtra("SORT_VALUE", i2);
        intent.putExtra("PLAYBACK_POSITION_VALUE", l2);
        startActivityForResult(intent, 1);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: U1 */
    public void mo14602U1() {
        Dialogs.f30143a.m16308g(this, "Невозможно выполнить скачивание данной серии. Попробуйте выбрать другой источник.", 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: Z3 */
    public void mo14603Z3(@NotNull final Episode episode) {
        Intrinsics.m32179h(episode, "episode");
        if (m15496m4().f26265b.f25344a.getBoolean("ON_EPISODE_DISCLAIMER", false)) {
            m15496m4().m14575i(episode);
            return;
        }
        Context requireContext = requireContext();
        Intrinsics.m32178g(requireContext, "requireContext()");
        Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(requireContext);
        builder.f30150b = 3;
        String string = getString(C2507R.string.warning);
        Intrinsics.m32178g(string, "getString(R.string.warning)");
        builder.m16319k(string);
        String string2 = getString(C2507R.string.on_episode_disclaimer);
        Intrinsics.m32178g(string2, "getString(R.string.on_episode_disclaimer)");
        builder.m16310b(string2);
        String string3 = getString(C2507R.string.understand);
        Intrinsics.m32178g(string3, "getString(R.string.understand)");
        builder.m16316h(string3);
        String string4 = getString(C2507R.string.cancel);
        Intrinsics.m32178g(string4, "getString(R.string.cancel)");
        builder.m16312d(string4);
        builder.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.episodes.EpisodesFragment$onEpisodeDisclaimer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                Dialogs.MaterialDialog it = materialDialog;
                Intrinsics.m32179h(it, "it");
                EpisodesFragment episodesFragment = EpisodesFragment.this;
                EpisodesFragment.Companion companion = EpisodesFragment.f28080m;
                C3033a.m17749k(episodesFragment.m15496m4().f26265b.f25344a, "ON_EPISODE_DISCLAIMER", true);
                EpisodesFragment.this.m15496m4().m14575i(episode);
                return Unit.f63088a;
            }
        });
        builder.m16313e(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.episodes.EpisodesFragment$onEpisodeDisclaimer$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                Dialogs.MaterialDialog it = materialDialog;
                Intrinsics.m32179h(it, "it");
                return Unit.f63088a;
            }
        });
        builder.f30159k = false;
        builder.m16317i();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: a */
    public void mo14604a() {
        ProgressBar progress_bar = (ProgressBar) m15494A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: b */
    public void mo14605b() {
        ProgressBar progress_bar = (ProgressBar) m15494A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: c */
    public void mo14606c() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15494A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) m15494A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: c3 */
    public void mo14607c3(@NotNull Episode episode) {
        Intrinsics.m32179h(episode, "episode");
        ChooseDownloaderDialogFragment chooseDownloaderDialogFragment = new ChooseDownloaderDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("EPISODE_VALUE", episode);
        chooseDownloaderDialogFragment.setArguments(bundle);
        chooseDownloaderDialogFragment.show(getChildFragmentManager(), "CHOOSE_DOWNLOADER_TAG");
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: d3 */
    public void mo14608d3() {
        Dialogs.MaterialDialog m15495e4 = m15495e4();
        if (m15495e4 != null) {
            m15495e4.cancel();
        }
    }

    /* renamed from: e4 */
    public final Dialogs.MaterialDialog m15495e4() {
        return (Dialogs.MaterialDialog) this.f28085f.getValue();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: f4 */
    public void mo14609f4(@NotNull Source source) {
        Intrinsics.m32179h(source, "source");
        final Context context = getContext();
        if (context != null) {
            ((AppCompatTextView) m15494A3(C2507R.id.title)).setText(getString(C2507R.string.choose_episode));
            ((AppCompatTextView) m15494A3(C2507R.id.state)).setSelected(false);
            AppCompatTextView state = (AppCompatTextView) m15494A3(C2507R.id.state);
            Intrinsics.m32178g(state, "state");
            state.setVisibility(0);
            final Type type = m15496m4().f26266c.f29055o;
            if (type == null) {
                return;
            }
            int i2 = m15496m4().f26265b.f25344a.getInt("SORT_EPISODES", 1);
            int i3 = C2507R.drawable.ic_sort_ascending;
            if (i2 != 1 && i2 == 2) {
                i3 = C2507R.drawable.ic_sort_descending;
            }
            ((AppCompatImageView) m15494A3(C2507R.id.sortIcon)).setImageDrawable(ContextCompat.m1671d(context, i3));
            final RelativeLayout onSource$lambda$11$lambda$9 = (RelativeLayout) m15494A3(C2507R.id.sort);
            Intrinsics.m32178g(onSource$lambda$11$lambda$9, "onSource$lambda$11$lambda$9");
            ViewsKt.m16377j(onSource$lambda$11$lambda$9, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.episodes.EpisodesFragment$onSource$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(View view) {
                    View it = view;
                    Intrinsics.m32179h(it, "it");
                    EpisodesFragment episodesFragment = EpisodesFragment.this;
                    EpisodesFragment.Companion companion = EpisodesFragment.f28080m;
                    int i4 = episodesFragment.m15496m4().f26265b.f25344a.getInt("SORT_EPISODES", 1);
                    if (i4 == 1) {
                        EpisodesFragment.this.m15496m4().m14583s(2);
                        ((AppCompatImageView) onSource$lambda$11$lambda$9.findViewById(C2507R.id.sortIcon)).setImageDrawable(ContextCompat.m1671d(context, C2507R.drawable.ic_sort_descending));
                    } else if (i4 == 2) {
                        EpisodesFragment.this.m15496m4().m14583s(1);
                        ((AppCompatImageView) onSource$lambda$11$lambda$9.findViewById(C2507R.id.sortIcon)).setImageDrawable(ContextCompat.m1671d(context, C2507R.drawable.ic_sort_ascending));
                    }
                    return Unit.f63088a;
                }
            });
            onSource$lambda$11$lambda$9.setVisibility(0);
            RelativeLayout more = (RelativeLayout) m15494A3(C2507R.id.more);
            Intrinsics.m32178g(more, "more");
            more.setVisibility(0);
            final String workers = type.getWorkers();
            if (workers != null) {
                RelativeLayout workers2 = (RelativeLayout) m15494A3(C2507R.id.workers);
                Intrinsics.m32178g(workers2, "workers");
                ViewsKt.m16377j(workers2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.episodes.EpisodesFragment$onSource$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(View view) {
                        View it = view;
                        Intrinsics.m32179h(it, "it");
                        EpisodesFragment.m15493c4(EpisodesFragment.this, type.getName(), workers);
                        return Unit.f63088a;
                    }
                });
                RelativeLayout workers3 = (RelativeLayout) m15494A3(C2507R.id.workers);
                Intrinsics.m32178g(workers3, "workers");
                workers3.setVisibility(0);
            } else {
                RelativeLayout workers4 = (RelativeLayout) m15494A3(C2507R.id.workers);
                Intrinsics.m32178g(workers4, "workers");
                ViewsKt.m16372e(workers4);
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) m15494A3(C2507R.id.state);
            StringBuilder m24u = C0000a.m24u("Источник ");
            m24u.append(source.getName());
            appCompatTextView.setText(m24u.toString());
            new Handler().postDelayed(new RunnableC0042c(this, 10), 1000L);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: j4 */
    public void mo14610j4(@NotNull final List<Type> types) {
        Intrinsics.m32179h(types, "types");
        YandexMetrica.reportEvent("Переход в раздел Поиск Torlook");
        if (m15496m4().f26265b.f25344a.getBoolean("ON_TORLOOK_DISCLAIMER", false)) {
            m15437u3().mo15324d2(TorlookFragment.f28119i.m15506a(m15497n4(), types), null);
            return;
        }
        Context requireContext = requireContext();
        Intrinsics.m32178g(requireContext, "requireContext()");
        Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(requireContext);
        builder.f30150b = 3;
        String string = getString(C2507R.string.warning);
        Intrinsics.m32178g(string, "getString(R.string.warning)");
        builder.m16319k(string);
        String string2 = getString(C2507R.string.on_torlook_disclaimer);
        Intrinsics.m32178g(string2, "getString(R.string.on_torlook_disclaimer)");
        builder.m16310b(string2);
        String string3 = getString(C2507R.string.understand);
        Intrinsics.m32178g(string3, "getString(R.string.understand)");
        builder.m16316h(string3);
        String string4 = getString(C2507R.string.cancel);
        Intrinsics.m32178g(string4, "getString(R.string.cancel)");
        builder.m16312d(string4);
        builder.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.episodes.EpisodesFragment$onTorlookDisclaimer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                Dialogs.MaterialDialog it = materialDialog;
                Intrinsics.m32179h(it, "it");
                EpisodesFragment episodesFragment = EpisodesFragment.this;
                EpisodesFragment.Companion companion = EpisodesFragment.f28080m;
                C3033a.m17749k(episodesFragment.m15496m4().f26265b.f25344a, "ON_TORLOOK_DISCLAIMER", true);
                EpisodesFragment.this.m15437u3().mo15324d2(TorlookFragment.f28119i.m15506a(EpisodesFragment.this.m15497n4(), types), null);
                return Unit.f63088a;
            }
        });
        builder.m16313e(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.episodes.EpisodesFragment$onTorlookDisclaimer$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                Dialogs.MaterialDialog it = materialDialog;
                Intrinsics.m32179h(it, "it");
                return Unit.f63088a;
            }
        });
        builder.f30159k = false;
        builder.m16317i();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: m */
    public void mo14611m() {
        Dialogs.f30143a.m16305b(this);
    }

    /* renamed from: m4 */
    public final EpisodesPresenter m15496m4() {
        return (EpisodesPresenter) this.f28087h.getValue(this, f28081n[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: n */
    public void mo14612n() {
        Dialogs.f30143a.m16308g(this, "Спасибо! Жалоба отправлена.", 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28091l.clear();
    }

    @NotNull
    /* renamed from: n4 */
    public final Release m15497n4() {
        Release release = this.f28089j;
        if (release != null) {
            return release;
        }
        Intrinsics.m32189r("release");
        throw null;
    }

    /* renamed from: o4 */
    public final void m15498o4() {
        if (m15496m4().f26265b.f25344a.getLong("AD_INTERSTITIAL_TIME", 0L) < System.currentTimeMillis()) {
            m15496m4().f26265b.f25344a.edit().putLong("AD_INTERSTITIAL_TIME", (m15496m4().f26265b.f25344a.getLong("AD_INTERSTITIAL_DELAY", 0L) * 1000) + System.currentTimeMillis()).apply();
            if (m15496m4().f26265b.m14047C()) {
                return;
            }
            try {
                InterstitialAd interstitialAd = this.f28083d;
                if (interstitialAd == null) {
                    Intrinsics.m32189r("mInterstitialAd");
                    throw null;
                }
                if (interstitialAd.isLoaded()) {
                    InterstitialAd interstitialAd2 = this.f28083d;
                    if (interstitialAd2 == null) {
                        Intrinsics.m32189r("mInterstitialAd");
                        throw null;
                    }
                    interstitialAd2.show();
                }
                InterstitialAd interstitialAd3 = this.f28083d;
                if (interstitialAd3 == null) {
                    Intrinsics.m32189r("mInterstitialAd");
                    throw null;
                }
                interstitialAd3.destroy();
                InterstitialAd interstitialAd4 = new InterstitialAd(requireContext());
                this.f28083d = interstitialAd4;
                String string = m15496m4().f26265b.f25344a.getString("AD_INTERSTITIAL_BLOCK_ID", "R-M-1773808-2");
                if (string == null) {
                    string = "";
                }
                interstitialAd4.setAdUnitId(string);
                interstitialAd4.loadAd(new AdRequest.Builder().build());
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        if (i2 == 1) {
            m15498o4();
        }
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14152u0(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f28088i = arguments.getLong("ID_VALUE");
            Serializable serializable = arguments.getSerializable("RELEASE_VALUE");
            Intrinsics.m32177f(serializable, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.Release");
            this.f28089j = (Release) serializable;
        }
        if (!m15496m4().f26265b.m14047C()) {
            try {
                InterstitialAd interstitialAd = new InterstitialAd(requireContext());
                this.f28083d = interstitialAd;
                String string = m15496m4().f26265b.f25344a.getString("AD_INTERSTITIAL_BLOCK_ID", "R-M-1773808-2");
                if (string == null) {
                    string = "";
                }
                interstitialAd.setAdUnitId(string);
                interstitialAd.loadAd(new AdRequest.Builder().build());
            } catch (IllegalStateException unused) {
            }
        }
        EpisodesPresenter m15496m4 = m15496m4();
        long j2 = this.f28088i;
        Release m15497n4 = m15497n4();
        Objects.requireNonNull(m15496m4);
        EpisodesUiLogic episodesUiLogic = m15496m4.f26266c;
        int i2 = m15496m4.f26265b.f25344a.getInt("SORT_EPISODES", 1);
        Objects.requireNonNull(episodesUiLogic);
        episodesUiLogic.f29042b = j2;
        episodesUiLogic.f29043c = m15497n4;
        episodesUiLogic.f29046f = i2;
        episodesUiLogic.f28956a = true;
        Type type = m15496m4.f26266c.f29055o;
        if (type != null) {
            m15496m4.getViewState().mo14595H1(type);
        }
        Source source = m15496m4.f26266c.f29056p;
        if (source != null) {
            m15496m4.getViewState().mo14609f4(source);
        }
        LastWatchedEpisode findByReleaseIdOrderByTimestamp = m15496m4.f26264a.f27351f.findByReleaseIdOrderByTimestamp(j2);
        EpisodesUiLogic episodesUiLogic2 = m15496m4.f26266c;
        episodesUiLogic2.f29059s = findByReleaseIdOrderByTimestamp;
        String str = episodesUiLogic2.f29044d;
        int hashCode = str.hashCode();
        if (hashCode != 104438218) {
            if (hashCode != 309704459) {
                if (hashCode == 858310118 && str.equals("STATE_EPISODES")) {
                    EpisodesPresenter.m14565j(m15496m4, false, 1);
                }
            } else if (str.equals("STATE_TYPES")) {
                EpisodesPresenter.m14566r(m15496m4, false, 1);
            }
        } else if (str.equals("STATE_SOURCES")) {
            m15496m4.m14581p();
        }
        EpisodesPresenter m15496m42 = m15496m4();
        if (m15496m42.f26265b.f25344a.getBoolean("TOOLTIP_EPISODES_UPDATES", false)) {
            return;
        }
        m15496m42.getViewState().mo14593A1();
        C3033a.m17749k(m15496m42.f26265b.f25344a, "TOOLTIP_EPISODES_UPDATES", true);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_episodes, viewGroup, false);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2625a(this, 12));
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
        epoxyRecyclerView.setItemAnimator(null);
        epoxyRecyclerView.setController(m15496m4().f26267d);
        final PopupMenu popupMenu = new PopupMenu(inflate.getContext(), (RelativeLayout) inflate.findViewById(C2507R.id.more));
        popupMenu.m882a().inflate(C2507R.menu.episodes, popupMenu.f1394b);
        popupMenu.f1395c.m651e(true);
        MenuCompat.m2102a(popupMenu.f1394b, true);
        popupMenu.f1396d = new C2679b(this);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C2507R.id.more);
        Intrinsics.m32178g(relativeLayout, "view.more");
        ViewsKt.m16377j(relativeLayout, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.episodes.EpisodesFragment$onCreateView$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                PopupMenu.this.f1395c.m653g();
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.help);
        Intrinsics.m32178g(materialButton, "view.help");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.episodes.EpisodesFragment$onCreateView$5
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                C2052a.m12281p(view, "it");
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(materialButton2, "view.repeat");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.episodes.EpisodesFragment$onCreateView$6
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                LinearLayout error_layout = (LinearLayout) EpisodesFragment.this.m15494A3(C2507R.id.error_layout);
                Intrinsics.m32178g(error_layout, "error_layout");
                ViewsKt.m16372e(error_layout);
                EpisodesFragment.this.m15496m4().m14577l();
                return Unit.f63088a;
            }
        });
        RelativeLayout relativeLayout2 = (RelativeLayout) inflate.findViewById(C2507R.id.updates);
        Intrinsics.m32178g(relativeLayout2, "view.updates");
        ViewsKt.m16377j(relativeLayout2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.episodes.EpisodesFragment$onCreateView$7
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                EpisodesFragment episodesFragment = EpisodesFragment.this;
                EpisodesFragment.Companion companion = EpisodesFragment.f28080m;
                FragmentNavigation m15437u3 = episodesFragment.m15437u3();
                EpisodesUpdatesFragment.Companion companion2 = EpisodesUpdatesFragment.f28138i;
                long id2 = EpisodesFragment.this.m15497n4().getId();
                Objects.requireNonNull(companion2);
                EpisodesUpdatesFragment episodesUpdatesFragment = new EpisodesUpdatesFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("ID_VALUE", id2);
                episodesUpdatesFragment.setArguments(bundle2);
                m15437u3.mo15324d2(episodesUpdatesFragment, null);
                return Unit.f63088a;
            }
        });
        return inflate;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBusKt.m16329c(this);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28091l.clear();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    @AfterPermissionGranted(C4632R.styleable.AppCompatTheme_windowMinWidthMajor)
    public void onDownloadEpisode() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        m15498o4();
        String[] strArr = f28082o;
        if (!EasyPermissions.m34989a(context, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            EasyPermissions.m34991c(new PermissionRequest.Builder(this, C4632R.styleable.AppCompatTheme_windowMinWidthMajor, (String[]) Arrays.copyOf(strArr, strArr.length)).m34997a());
            return;
        }
        EpisodesPresenter presenter = m15496m4();
        Intrinsics.m32178g(presenter, "presenter");
        presenter.m14572f(presenter.f26265b.f25344a.getInt("SELECTED_DOWNLOADER", 0));
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchEpisode(@NotNull OnFetchEpisode onFetchEpisode) {
        Intrinsics.m32179h(onFetchEpisode, "onFetchEpisode");
        if (onFetchEpisode.f30190a.getReleaseId() == m15496m4().f26266c.f29042b) {
            EpisodesPresenter m15496m4 = m15496m4();
            Episode episode = onFetchEpisode.f30190a;
            Objects.requireNonNull(m15496m4);
            Intrinsics.m32179h(episode, "episode");
            EpisodesUiLogic episodesUiLogic = m15496m4.f26266c;
            if (episodesUiLogic.f28956a) {
                Iterator<Episode> it = episodesUiLogic.f29049i.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    Episode next = it.next();
                    Source source = next.getSource();
                    if (((source != null && (source.getId() > episode.getSourceId() ? 1 : (source.getId() == episode.getSourceId() ? 0 : -1)) == 0) || next.getSourceId() == episode.getSourceId()) && next.getPosition() == episode.getPosition()) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    episodesUiLogic.f29049i.set(i2, episode);
                }
                m15496m4.m14568b();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i2, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.m32179h(permissions, "permissions");
        Intrinsics.m32179h(grantResults, "grantResults");
        super.onRequestPermissionsResult(i2, permissions, grantResults);
        EasyPermissions.m34990b(i2, permissions, grantResults, this);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: p3 */
    public void mo14613p3() {
        Dialogs.MaterialDialog m15495e4 = m15495e4();
        if (m15495e4 != null) {
            m15495e4.show();
        }
    }

    /* renamed from: p4 */
    public final void m15499p4(String str, String str2, String str3, String str4, String str5) throws ActivityNotFoundException {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(Uri.parse(str3), "video/*");
        intent.putExtra("headers", new String[]{"Referer", str, "Cookie", str2});
        intent.putExtra("title", str4 + " — " + str5);
        startActivityForResult(intent, 1);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: r3 */
    public void mo14614r3(@Nullable String str) {
        Dialogs.MaterialDialog m15495e4 = m15495e4();
        if (m15495e4 != null) {
            m15495e4.cancel();
        }
        Dialogs.f30143a.m16308g(this, "Невозможно воспроизвести видео в выбранном плеере. Видео будет открыто в Веб-плеере.", 0);
        Episode episode = m15496m4().f26266c.f29057q;
        if (episode != null) {
            m15496m4().m14574h(episode, 1);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: s2 */
    public void mo14615s2(@NotNull Episode episode) {
        Intrinsics.m32179h(episode, "episode");
        m15437u3().mo15324d2(ReportFragment.f28867m.m15643a(episode, 4), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: t2 */
    public void mo14616t2(@NotNull Episode episode, int i2, boolean z) {
        Intrinsics.m32179h(episode, "episode");
        ChoosePlayerDialogFragment choosePlayerDialogFragment = new ChoosePlayerDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("EPISODE_VALUE", episode);
        bundle.putInt("LAST_SELECTED_PLAYER_VALUE", i2);
        bundle.putBoolean("SHOW_MORE_PLAYERS_VALUE", z);
        choosePlayerDialogFragment.setArguments(bundle);
        choosePlayerDialogFragment.show(getChildFragmentManager(), "CHOOSE_PLAYER_TAG");
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: v2 */
    public void mo14617v2(@NotNull String url, boolean z) {
        Intrinsics.m32179h(url, "url");
        Context context = getContext();
        startActivityForResult(context != null ? WebPlayerActivity.f27600e.m15356a(context, url, z, true) : null, 1);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: y2 */
    public void mo14618y2(@NotNull final Episode episode) {
        Intrinsics.m32179h(episode, "episode");
        if (m15496m4().f26265b.f25344a.getBoolean("ON_DOWNLOAD_EPISODE_DISCLAIMER", false)) {
            EpisodesPresenter m15496m4 = m15496m4();
            Objects.requireNonNull(m15496m4);
            m15496m4.f26266c.f29058r = episode;
            m15496m4.getViewState().onDownloadEpisode();
            return;
        }
        Context requireContext = requireContext();
        Intrinsics.m32178g(requireContext, "requireContext()");
        Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(requireContext);
        builder.f30150b = 3;
        String string = getString(C2507R.string.warning);
        Intrinsics.m32178g(string, "getString(R.string.warning)");
        builder.f30151c = string;
        String string2 = getString(C2507R.string.on_download_episode_disclaimer);
        Intrinsics.m32178g(string2, "getString(R.string.on_download_episode_disclaimer)");
        builder.f30152d = string2;
        String string3 = getString(C2507R.string.understand);
        Intrinsics.m32178g(string3, "getString(R.string.understand)");
        builder.f30154f = string3;
        String string4 = getString(C2507R.string.cancel);
        Intrinsics.m32178g(string4, "getString(R.string.cancel)");
        builder.f30153e = string4;
        builder.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.episodes.EpisodesFragment$onDownloadEpisodeDisclaimer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                Dialogs.MaterialDialog it = materialDialog;
                Intrinsics.m32179h(it, "it");
                EpisodesFragment episodesFragment = EpisodesFragment.this;
                EpisodesFragment.Companion companion = EpisodesFragment.f28080m;
                C3033a.m17749k(episodesFragment.m15496m4().f26265b.f25344a, "ON_DOWNLOAD_EPISODE_DISCLAIMER", true);
                EpisodesPresenter m15496m42 = EpisodesFragment.this.m15496m4();
                Episode episode2 = episode;
                Objects.requireNonNull(m15496m42);
                Intrinsics.m32179h(episode2, "episode");
                m15496m42.f26266c.f29058r = episode2;
                m15496m42.getViewState().onDownloadEpisode();
                return Unit.f63088a;
            }
        });
        builder.m16313e(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.episodes.EpisodesFragment$onDownloadEpisodeDisclaimer$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                Dialogs.MaterialDialog it = materialDialog;
                Intrinsics.m32179h(it, "it");
                return Unit.f63088a;
            }
        });
        builder.f30159k = false;
        builder.m16317i();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.swiftsoft.anixartd.ui.dialog.BaseDialogFragment.BaseDialogListener
    /* renamed from: y3 */
    public boolean mo15336y3(@Nullable String str, @NotNull String button, @NotNull Intent intent) {
        Intrinsics.m32179h(button, "button");
        Intrinsics.m32179h(intent, "intent");
        if (str != null) {
            switch (str.hashCode()) {
                case -1662020392:
                    if (str.equals("DOWNLOADER_CHOOSE_EPISODE_QUALITY_TAG") && Intrinsics.m32174c(button, "CHOOSE_EPISODE_QUALITY_BUTTON")) {
                        String stringExtra = intent.getStringExtra("REFERER_STRING_VALUE");
                        String stringExtra2 = intent.getStringExtra("URI_STRING_VALUE");
                        String stringExtra3 = intent.getStringExtra("RELEASE_TITLE_VALUE");
                        if (!(stringExtra3 == null || stringExtra3.length() == 0)) {
                            stringExtra3 = new Regex("[:\\/*?|<>]").m33873e(stringExtra3, "_");
                        }
                        String stringExtra4 = intent.getStringExtra("EPISODE_TITLE_VALUE");
                        int intExtra = intent.getIntExtra("SELECTED_DOWNLOADER_VALUE", -1);
                        if (stringExtra != null && stringExtra2 != null && intExtra != -1) {
                            String substring = stringExtra2.substring(StringsKt.m33881G(stringExtra2, ".", 0, false, 6, null));
                            Intrinsics.m32178g(substring, "this as java.lang.String).substring(startIndex)");
                            MatchResult m33870a = new Regex("(\\.\\w{3,5})($|\\?)").m33870a(substring, 0);
                            if (m33870a != null) {
                                substring = m33870a.mo33868b().get(1);
                            }
                            if (intExtra == 1) {
                                Downloader downloader = Downloader.f30164a;
                                String str2 = stringExtra3 + " — " + stringExtra4 + substring;
                                Context context = getContext();
                                if (context != null) {
                                    downloader.m16326a(context, stringExtra2, str2);
                                }
                            } else if (intExtra == 2) {
                                Intent addFlags = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra2)).addFlags(268435456);
                                Intrinsics.m32178g(addFlags, "Intent(Intent.ACTION_VIE…t.FLAG_ACTIVITY_NEW_TASK)");
                                startActivity(Intent.createChooser(addFlags, "Открыть в").addFlags(268435456));
                            }
                            return true;
                        }
                        return true;
                    }
                    break;
                case -1593163112:
                    if (str.equals("CHOOSE_DOWNLOADER_TAG")) {
                        Serializable serializableExtra = intent.getSerializableExtra("EPISODE_VALUE");
                        Intrinsics.m32177f(serializableExtra, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.episode.Episode");
                        int intExtra2 = intent.getIntExtra("SELECTED_DOWNLOADER_VALUE", -1);
                        if (!intent.getBooleanExtra("CB_ASK_ALWAYS_VALUE", false)) {
                            C0576a.m4125x(m15496m4().f26265b.f25344a, "SELECTED_DOWNLOADER", intExtra2);
                        }
                        m15496m4().m14572f(intExtra2);
                        return true;
                    }
                    break;
                case 1036464196:
                    if (str.equals("CHOOSE_PLAYER_TAG") && Intrinsics.m32174c(button, "CHOOSE_PLAYER_CONTINUE_BUTTON")) {
                        Serializable serializableExtra2 = intent.getSerializableExtra("EPISODE_VALUE");
                        Intrinsics.m32177f(serializableExtra2, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.episode.Episode");
                        Episode episode = (Episode) serializableExtra2;
                        int intExtra3 = intent.getIntExtra("SELECTED_PLAYER_VALUE", -1);
                        boolean booleanExtra = intent.getBooleanExtra("CB_ASK_ALWAYS_VALUE", false);
                        boolean booleanExtra2 = intent.getBooleanExtra("SHOW_MORE_PLAYERS_VALUE", false);
                        if (!booleanExtra) {
                            C0576a.m4125x(m15496m4().f26265b.f25344a, "SELECTED_PLAYER", intExtra3);
                        }
                        if (booleanExtra2) {
                            C3033a.m17749k(m15496m4().f26265b.f25344a, "SHOW_MORE_PLAYERS", booleanExtra2);
                        }
                        m15496m4().f26265b.f25344a.edit().putInt("LAST_SELECTED_PLAYER", intExtra3).apply();
                        m15496m4().m14574h(episode, intExtra3);
                        return true;
                    }
                    break;
                case 1585076652:
                    if (str.equals("PLAYER_CHOOSE_EPISODE_QUALITY_TAG")) {
                        String stringExtra5 = intent.getStringExtra("REFERER_STRING_VALUE");
                        String stringExtra6 = intent.getStringExtra("COOKIE");
                        String stringExtra7 = intent.getStringExtra("URI_STRING_VALUE");
                        String stringExtra8 = intent.getStringExtra("RELEASE_TITLE_VALUE");
                        String stringExtra9 = intent.getStringExtra("EPISODE_TITLE_VALUE");
                        int intExtra4 = intent.getIntExtra("SELECTED_QUALITY_VALUE", -1);
                        if (!intent.getBooleanExtra("CB_ASK_ALWAYS_VALUE", false)) {
                            C0576a.m4125x(m15496m4().f26265b.f25344a, "SELECTED_THIRD_PARTY_VIDEO_QUALITY", intExtra4);
                        }
                        if (stringExtra5 != null && stringExtra6 != null && stringExtra7 != null && stringExtra8 != null && stringExtra9 != null) {
                            m15499p4(stringExtra5, stringExtra6, stringExtra7, stringExtra8, stringExtra9);
                        }
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
