package com.swiftsoft.anixartd.p015ui.activity;

import android.app.AlertDialog;
import android.app.UiModeManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.common.api.ApiException;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.tasks.Task;
import com.google.firebase.auth.C2052a;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GoogleAuthCredential;
import com.ncapdevi.fragnav.FragNavController;
import com.ncapdevi.fragnav.FragNavTransactionOptions;
import com.p017vk.api.sdk.C2786VK;
import com.p017vk.api.sdk.auth.VKAccessToken;
import com.p017vk.api.sdk.auth.VKAuthCallback;
import com.p017vk.api.sdk.auth.VKScope;
import com.skydoves.balloon.ActivityBalloonLazy;
import com.skydoves.balloon.Balloon;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.ReleaseVideoCategory;
import com.swiftsoft.anixartd.p015ui.activity.MainActivity$appUpdatedListener$2;
import com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment;
import com.swiftsoft.anixartd.p015ui.fragment.BackPressedListener;
import com.swiftsoft.anixartd.p015ui.fragment.FragmentNavigation;
import com.swiftsoft.anixartd.p015ui.fragment.main.NeedAuthFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.bookmarks.BookmarksFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.discover.DiscoverFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.filter.FilterFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.home.HomeFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.notifications.NotificationsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.preference.MainPreferenceFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.search.SearchFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.MainUiLogic;
import com.swiftsoft.anixartd.p015ui.tooltip.BookmarksBalloonFactory;
import com.swiftsoft.anixartd.p015ui.tooltip.NewSectionBalloonFactory;
import com.swiftsoft.anixartd.presentation.auth.C2546a;
import com.swiftsoft.anixartd.presentation.main.MainPresenter;
import com.swiftsoft.anixartd.presentation.main.MainView;
import com.swiftsoft.anixartd.presentation.main.search.C2622b;
import com.swiftsoft.anixartd.utils.Common;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.DigitsKt;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnAdVisible;
import com.swiftsoft.anixartd.utils.OnAddFavorite;
import com.swiftsoft.anixartd.utils.OnAddFavoriteCollection;
import com.swiftsoft.anixartd.utils.OnAddToList;
import com.swiftsoft.anixartd.utils.OnAlternativeConnection;
import com.swiftsoft.anixartd.utils.OnBottomNavigation;
import com.swiftsoft.anixartd.utils.OnBottomNavigationCompact;
import com.swiftsoft.anixartd.utils.OnBottomSheet;
import com.swiftsoft.anixartd.utils.OnBottomSheetProfileSocial;
import com.swiftsoft.anixartd.utils.OnBottomSheetReleaseVideo;
import com.swiftsoft.anixartd.utils.OnCollectionRules;
import com.swiftsoft.anixartd.utils.OnCommentingRules;
import com.swiftsoft.anixartd.utils.OnDeleteFavorite;
import com.swiftsoft.anixartd.utils.OnDeleteFavoriteCollection;
import com.swiftsoft.anixartd.utils.OnDeleteHistory;
import com.swiftsoft.anixartd.utils.OnDonate;
import com.swiftsoft.anixartd.utils.OnFetchProfileAvatar;
import com.swiftsoft.anixartd.utils.OnFilter;
import com.swiftsoft.anixartd.utils.OnGlobalSearchByAuthor;
import com.swiftsoft.anixartd.utils.OnGlobalSearchByDirector;
import com.swiftsoft.anixartd.utils.OnGlobalSearchByGenre;
import com.swiftsoft.anixartd.utils.OnGlobalSearchByStudio;
import com.swiftsoft.anixartd.utils.OnGoogleBind;
import com.swiftsoft.anixartd.utils.OnGoogleUnbind;
import com.swiftsoft.anixartd.utils.OnInnerTab;
import com.swiftsoft.anixartd.utils.OnKillActivity;
import com.swiftsoft.anixartd.utils.OnLogOut;
import com.swiftsoft.anixartd.utils.OnNotification;
import com.swiftsoft.anixartd.utils.OnNotificationBarCount;
import com.swiftsoft.anixartd.utils.OnNotificationsRead;
import com.swiftsoft.anixartd.utils.OnOpenNotifications;
import com.swiftsoft.anixartd.utils.OnOpenPreferences;
import com.swiftsoft.anixartd.utils.OnPageNoConnection;
import com.swiftsoft.anixartd.utils.OnProfileSocial;
import com.swiftsoft.anixartd.utils.OnRefreshAd;
import com.swiftsoft.anixartd.utils.OnReleaseDeleteVote;
import com.swiftsoft.anixartd.utils.OnReleaseVideoAddFavorite;
import com.swiftsoft.anixartd.utils.OnReleaseVideoDeleteFavorite;
import com.swiftsoft.anixartd.utils.OnReleaseVideoRules;
import com.swiftsoft.anixartd.utils.OnReleaseVote;
import com.swiftsoft.anixartd.utils.OnSearch;
import com.swiftsoft.anixartd.utils.OnShowTooltipBookmarks;
import com.swiftsoft.anixartd.utils.OnSilentRecalculate;
import com.swiftsoft.anixartd.utils.OnSnackbar;
import com.swiftsoft.anixartd.utils.OnSoftInputMode;
import com.swiftsoft.anixartd.utils.OnVkBind;
import com.swiftsoft.anixartd.utils.OnVkUnbind;
import com.swiftsoft.anixartd.utils.Time;
import com.swiftsoft.anixartd.utils.Views;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.yandex.metrica.YandexMetrica;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdRequest;
import dagger.Lazy;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import moxy.MvpAppCompatActivity;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: MainActivity.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000°\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001eB\u0007¢\u0006\u0004\bc\u0010dJ\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0007J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0007J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007J\u0010\u0010 \u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0007J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!H\u0007J\u0010\u0010$\u001a\u00020\b2\u0006\u0010$\u001a\u00020#H\u0007J\u0010\u0010&\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0007J\u0010\u0010(\u001a\u00020\b2\u0006\u0010(\u001a\u00020'H\u0007J\u0010\u0010*\u001a\u00020\b2\u0006\u0010*\u001a\u00020)H\u0007J\u0010\u0010,\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0007J\u0010\u0010.\u001a\u00020\b2\u0006\u0010.\u001a\u00020-H\u0007J\u0010\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020/H\u0007J\u0010\u00104\u001a\u00020\b2\u0006\u00103\u001a\u000202H\u0007J\u0010\u00106\u001a\u00020\b2\u0006\u00106\u001a\u000205H\u0007J\u0010\u00108\u001a\u00020\b2\u0006\u00108\u001a\u000207H\u0007J\u0010\u0010:\u001a\u00020\b2\u0006\u0010:\u001a\u000209H\u0007J\u0010\u0010<\u001a\u00020\b2\u0006\u0010<\u001a\u00020;H\u0007J\u0010\u0010>\u001a\u00020\b2\u0006\u0010>\u001a\u00020=H\u0007J\u0010\u0010@\u001a\u00020\b2\u0006\u0010@\u001a\u00020?H\u0007J\u0010\u0010B\u001a\u00020\b2\u0006\u0010B\u001a\u00020AH\u0007J\u0010\u0010D\u001a\u00020\b2\u0006\u0010D\u001a\u00020CH\u0007J\u0010\u0010F\u001a\u00020\b2\u0006\u0010F\u001a\u00020EH\u0007J\u0010\u0010H\u001a\u00020\b2\u0006\u0010H\u001a\u00020GH\u0007J\u0010\u0010J\u001a\u00020\b2\u0006\u0010J\u001a\u00020IH\u0007J\u0010\u0010L\u001a\u00020\b2\u0006\u0010L\u001a\u00020KH\u0007J\u0010\u0010N\u001a\u00020\b2\u0006\u0010N\u001a\u00020MH\u0007J\u0010\u0010P\u001a\u00020\b2\u0006\u0010P\u001a\u00020OH\u0007J\u0010\u0010R\u001a\u00020\b2\u0006\u0010R\u001a\u00020QH\u0007J\u0010\u0010T\u001a\u00020\b2\u0006\u0010T\u001a\u00020SH\u0007J\u0010\u0010V\u001a\u00020\b2\u0006\u0010V\u001a\u00020UH\u0007J\u0010\u0010X\u001a\u00020\b2\u0006\u0010X\u001a\u00020WH\u0007J\u0010\u0010Z\u001a\u00020\b2\u0006\u0010Z\u001a\u00020YH\u0007J\u0010\u0010\\\u001a\u00020\b2\u0006\u0010\\\u001a\u00020[H\u0007J\u0010\u0010^\u001a\u00020\b2\u0006\u0010^\u001a\u00020]H\u0007J\u0010\u0010`\u001a\u00020\b2\u0006\u0010`\u001a\u00020_H\u0007J\u0010\u0010b\u001a\u00020\b2\u0006\u0010b\u001a\u00020aH\u0007¨\u0006f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/activity/MainActivity;", "Lmoxy/MvpAppCompatActivity;", "Lcom/swiftsoft/anixartd/presentation/main/MainView;", "Lcom/ncapdevi/fragnav/FragNavController$RootFragmentListener;", "Lcom/swiftsoft/anixartd/ui/fragment/FragmentNavigation;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment$BaseDialogListener;", "Lcom/swiftsoft/anixartd/utils/OnShowTooltipBookmarks;", "onShowTooltipBookmarks", "", "Lcom/swiftsoft/anixartd/utils/OnInnerTab;", "onInnerTab", "Lcom/swiftsoft/anixartd/utils/OnSearch;", "onSearch", "Lcom/swiftsoft/anixartd/utils/OnGlobalSearchByStudio;", "onGlobalSearchByStudio", "Lcom/swiftsoft/anixartd/utils/OnGlobalSearchByDirector;", "onGlobalSearchByDirector", "Lcom/swiftsoft/anixartd/utils/OnGlobalSearchByAuthor;", "onGlobalSearchByAuthor", "Lcom/swiftsoft/anixartd/utils/OnGlobalSearchByGenre;", "onGlobalSearchByGenre", "Lcom/swiftsoft/anixartd/utils/OnFilter;", "onFilter", "Lcom/swiftsoft/anixartd/utils/OnPageNoConnection;", "onPageNoConnection", "Lcom/swiftsoft/anixartd/utils/OnCommentingRules;", "onCommentingRules", "Lcom/swiftsoft/anixartd/utils/OnCollectionRules;", "onCollectionRules", "Lcom/swiftsoft/anixartd/utils/OnReleaseVideoRules;", "onReleaseVideoRules", "Lcom/swiftsoft/anixartd/utils/OnBottomSheet;", "onBottomSheet", "Lcom/swiftsoft/anixartd/utils/OnBottomSheetProfileSocial;", "onBottomSheetProfileSocial", "Lcom/swiftsoft/anixartd/utils/OnBottomSheetReleaseVideo;", "onBottomSheetReleaseVideo", "Lcom/swiftsoft/anixartd/utils/OnProfileSocial;", "onProfileSocial", "Lcom/swiftsoft/anixartd/utils/OnReleaseVote;", "onReleaseVote", "Lcom/swiftsoft/anixartd/utils/OnReleaseDeleteVote;", "onReleaseDeleteVote", "Lcom/swiftsoft/anixartd/utils/OnSnackbar;", "onSnackbar", "Lcom/swiftsoft/anixartd/utils/OnKillActivity;", "onKillActivity", "Lcom/swiftsoft/anixartd/utils/OnBottomNavigation;", "onBottomNavigation", "OnBottomNavigation", "Lcom/swiftsoft/anixartd/utils/OnSoftInputMode;", "onSoftInputMode", "OnSoftInputMode", "Lcom/swiftsoft/anixartd/utils/OnDeleteHistory;", "onDeleteHistory", "Lcom/swiftsoft/anixartd/utils/OnAddFavorite;", "onAddFavorite", "Lcom/swiftsoft/anixartd/utils/OnDeleteFavorite;", "onDeleteFavorite", "Lcom/swiftsoft/anixartd/utils/OnReleaseVideoAddFavorite;", "onReleaseVideoAddFavorite", "Lcom/swiftsoft/anixartd/utils/OnReleaseVideoDeleteFavorite;", "onReleaseVideoDeleteFavorite", "Lcom/swiftsoft/anixartd/utils/OnAddFavoriteCollection;", "onAddFavoriteCollection", "Lcom/swiftsoft/anixartd/utils/OnDeleteFavoriteCollection;", "onDeleteFavoriteCollection", "Lcom/swiftsoft/anixartd/utils/OnAddToList;", "onAddToList", "Lcom/swiftsoft/anixartd/utils/OnLogOut;", "onLogOut", "Lcom/swiftsoft/anixartd/utils/OnFetchProfileAvatar;", "onFetchProfileAvatar", "Lcom/swiftsoft/anixartd/utils/OnVkBind;", "onVkBind", "Lcom/swiftsoft/anixartd/utils/OnGoogleBind;", "onGoogleBind", "Lcom/swiftsoft/anixartd/utils/OnVkUnbind;", "onVkUnbind", "Lcom/swiftsoft/anixartd/utils/OnGoogleUnbind;", "onGoogleUnbind", "Lcom/swiftsoft/anixartd/utils/OnOpenPreferences;", "onOpenPreferences", "Lcom/swiftsoft/anixartd/utils/OnBottomNavigationCompact;", "onBottomNavigationCompact", "Lcom/swiftsoft/anixartd/utils/OnAlternativeConnection;", "onAlternativeConnection", "Lcom/swiftsoft/anixartd/utils/OnOpenNotifications;", "onOpenNotifications", "Lcom/swiftsoft/anixartd/utils/OnRefreshAd;", "onRefreshAd", "Lcom/swiftsoft/anixartd/utils/OnAdVisible;", "onAdVisible", "Lcom/swiftsoft/anixartd/utils/OnNotification;", "onNotification", "Lcom/swiftsoft/anixartd/utils/OnNotificationsRead;", "onNotificationsRead", "Lcom/swiftsoft/anixartd/utils/OnDonate;", "onDonate", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class MainActivity extends MvpAppCompatActivity implements MainView, FragNavController.RootFragmentListener, FragmentNavigation, BaseDialogFragment.BaseDialogListener {

    /* renamed from: n */
    public static final /* synthetic */ KProperty<Object>[] f27425n = {C2052a.m12277l(MainActivity.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/MainPresenter;", 0)};

    /* renamed from: e */
    @Inject
    public Lazy<MainPresenter> f27429e;

    /* renamed from: f */
    @NotNull
    public final MoxyKtxDelegate f27430f;

    /* renamed from: g */
    @NotNull
    public final FragNavController f27431g;

    /* renamed from: h */
    @NotNull
    public BottomNavigationView.OnNavigationItemSelectedListener f27432h;

    /* renamed from: i */
    public GoogleSignInClient f27433i;

    /* renamed from: j */
    public FirebaseAuth f27434j;

    /* renamed from: k */
    @NotNull
    public final kotlin.Lazy f27435k;

    /* renamed from: l */
    @NotNull
    public final kotlin.Lazy f27436l;

    /* renamed from: m */
    @NotNull
    public Map<Integer, View> f27437m = new LinkedHashMap();

    /* renamed from: b */
    @NotNull
    public final kotlin.Lazy f27426b = LazyKt.m31881b(new Function0<AppUpdateManager>() { // from class: com.swiftsoft.anixartd.ui.activity.MainActivity$appUpdateManager$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public AppUpdateManager invoke() {
            AppUpdateManager m10651a = AppUpdateManagerFactory.m10651a(MainActivity.this);
            Intrinsics.m32178g(m10651a, "create(this)");
            return m10651a;
        }
    });

    /* renamed from: c */
    @NotNull
    public final kotlin.Lazy f27427c = LazyKt.m31881b(new Function0<MainActivity$appUpdatedListener$2.C26241>() { // from class: com.swiftsoft.anixartd.ui.activity.MainActivity$appUpdatedListener$2
        {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.swiftsoft.anixartd.ui.activity.MainActivity$appUpdatedListener$2$1] */
        @Override // kotlin.jvm.functions.Function0
        public C26241 invoke() {
            final MainActivity mainActivity = MainActivity.this;
            return new InstallStateUpdatedListener() { // from class: com.swiftsoft.anixartd.ui.activity.MainActivity$appUpdatedListener$2.1
                @Override // com.google.android.play.core.listener.StateUpdatedListener
                /* renamed from: a */
                public void mo10687a(InstallState installState) {
                    InstallState installState2 = installState;
                    Intrinsics.m32179h(installState2, "installState");
                    if (installState2.mo10827c() == 11) {
                        MainActivity.this.m15335w4();
                    } else if (installState2.mo10827c() == 4) {
                        MainActivity mainActivity2 = MainActivity.this;
                        KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                        mainActivity2.m15332t4().mo10650e(this);
                    }
                }
            };
        }
    });

    /* renamed from: d */
    @NotNull
    public final kotlin.Lazy f27428d = LazyKt.m31881b(new Function0<Dialogs.MaterialDialog>() { // from class: com.swiftsoft.anixartd.ui.activity.MainActivity$dialog$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public Dialogs.MaterialDialog invoke() {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(MainActivity.this);
            builder.f30150b = 1;
            return new Dialogs.MaterialDialog(builder);
        }
    });

    /* compiled from: MainActivity.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0007R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004¨\u0006\u001e"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/activity/MainActivity$Companion;", "", "", "APP_UPDATE_REQUEST_CODE", "I", "", "COMMENT_ID_VALUE", "Ljava/lang/String;", "DEEP_LINK_TYPE_COLLECTION", "DEEP_LINK_TYPE_COLLECTION_COMMENT", "DEEP_LINK_TYPE_PROFILE", "DEEP_LINK_TYPE_RELEASE", "DEEP_LINK_TYPE_RELEASE_COMMENT", "GOOGLE_SIGN_IN_REQUEST_CODE", "ID_VALUE", "INDEX_BOOKMARKS", "INDEX_DISCOVER", "INDEX_HOME", "INDEX_NEED_AUTH", "INDEX_PROFILE", "PARENT_COMMENT_ID_VALUE", "SEARCH_BAR_ICON_ACTION_COLLECTION", "SEARCH_BAR_ICON_ACTION_DIALOG", "SEARCH_BAR_ICON_ACTION_LINK", "SEARCH_BAR_ICON_ACTION_NOTHING", "SEARCH_BAR_ICON_ACTION_RELEASE", "SEARCH_BAR_ICON_ACTION_TOAST", "TYPE_VALUE", "VIEW_TYPE_GRID", "VIEW_TYPE_LIST", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public MainActivity() {
        Function0<MainPresenter> function0 = new Function0<MainPresenter>() { // from class: com.swiftsoft.anixartd.ui.activity.MainActivity$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public MainPresenter invoke() {
                Lazy<MainPresenter> lazy = MainActivity.this.f27429e;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f27430f = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(MainPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.m32178g(supportFragmentManager, "supportFragmentManager");
        this.f27431g = new FragNavController(supportFragmentManager, C2507R.id.root_container);
        this.f27432h = new C2626b(this);
        this.f27435k = new ActivityBalloonLazy(this, this, Reflection.m32193a(NewSectionBalloonFactory.class));
        this.f27436l = new ActivityBalloonLazy(this, this, Reflection.m32193a(BookmarksBalloonFactory.class));
    }

    @Override // com.ncapdevi.fragnav.FragNavController.RootFragmentListener
    /* renamed from: A2 */
    public int mo13832A2() {
        return 5;
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: F1 */
    public void mo14335F1() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.auth_vk_already_bound);
        Intrinsics.m32178g(string, "getString(R.string.auth_vk_already_bound)");
        dialogs.m16307f(this, string);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: M3 */
    public void mo14336M3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C2507R.style.DialogTheme);
        View inflate = getLayoutInflater().inflate(C2507R.layout.dialog_rate_app, (ViewGroup) null);
        builder.setView(inflate);
        final AlertDialog m378l = builder.m378l();
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.positive_button);
        Intrinsics.m32178g(materialButton, "view.positive_button");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.MainActivity$onShowRateApp$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                MainActivity mainActivity = MainActivity.this;
                KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                mainActivity.m15333u4().f25957i.f25344a.edit().putBoolean("IS_SHOW_RATE_APP", false).apply();
                YandexMetrica.reportEvent("Переход в Оценить приложение");
                MainActivity mainActivity2 = MainActivity.this;
                StringBuilder m24u = C0000a.m24u("http://play.google.com/store/apps/details?id=");
                m24u.append(MainActivity.this.getPackageName());
                mainActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(m24u.toString())));
                m378l.dismiss();
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.negative_button);
        Intrinsics.m32178g(materialButton2, "view.negative_button");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.MainActivity$onShowRateApp$2
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

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void OnBottomNavigation(@NotNull OnBottomNavigation onBottomNavigation) {
        Intrinsics.m32179h(onBottomNavigation, "onBottomNavigation");
        Animation loadAnimation = AnimationUtils.loadAnimation(getApplicationContext(), C2507R.anim.slide_down);
        Intrinsics.m32178g(loadAnimation, "loadAnimation(\n         …anim.slide_down\n        )");
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getApplicationContext(), C2507R.anim.slide_up);
        if (onBottomNavigation.f30174a) {
            BottomNavigationView navigation = (BottomNavigationView) m15331s4(C2507R.id.navigation);
            Intrinsics.m32178g(navigation, "navigation");
            if (!(navigation.getVisibility() == 0)) {
                ((BottomNavigationView) m15331s4(C2507R.id.navigation)).startAnimation(loadAnimation2);
                BottomNavigationView navigation2 = (BottomNavigationView) m15331s4(C2507R.id.navigation);
                Intrinsics.m32178g(navigation2, "navigation");
                ViewsKt.m16380m(navigation2, onBottomNavigation.f30174a);
            }
        }
        if (!onBottomNavigation.f30174a) {
            BottomNavigationView navigation3 = (BottomNavigationView) m15331s4(C2507R.id.navigation);
            Intrinsics.m32178g(navigation3, "navigation");
            if (navigation3.getVisibility() == 0) {
                ((BottomNavigationView) m15331s4(C2507R.id.navigation)).startAnimation(loadAnimation);
            }
        }
        BottomNavigationView navigation22 = (BottomNavigationView) m15331s4(C2507R.id.navigation);
        Intrinsics.m32178g(navigation22, "navigation");
        ViewsKt.m16380m(navigation22, onBottomNavigation.f30174a);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void OnSoftInputMode(@NotNull OnSoftInputMode onSoftInputMode) {
        Intrinsics.m32179h(onSoftInputMode, "onSoftInputMode");
        getWindow().setSoftInputMode(onSoftInputMode.f30229a);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: P */
    public void mo14337P() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.something_went_wrong);
        Intrinsics.m32178g(string, "getString(R.string.something_went_wrong)");
        dialogs.m16307f(this, string);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: S2 */
    public void mo14338S2() {
        Intent intent = new Intent(this, (Class<?>) AuthActivity.class);
        intent.setFlags(268451840);
        startActivity(intent);
        finish();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: V3 */
    public void mo14339V3() {
        Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(this);
        builder.f30150b = 2;
        builder.m16318j(C2507R.string.error);
        builder.m16310b("Ваш аккаунт был заблокирован навсегда в связи с нарушением правил приложения.");
        builder.m16315g(C2507R.string.understand);
        builder.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.MainActivity$onPermBanned$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                Dialogs.MaterialDialog it = materialDialog;
                Intrinsics.m32179h(it, "it");
                MainActivity mainActivity = MainActivity.this;
                KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                mainActivity.m15333u4().m14332u();
                return Unit.f63088a;
            }
        });
        builder.f30159k = false;
        builder.m16317i();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: Y1 */
    public void mo14340Y1() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.auth_google_not_bound);
        Intrinsics.m32178g(string, "getString(R.string.auth_google_not_bound)");
        dialogs.m16307f(this, string);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.FragmentNavigation
    /* renamed from: a3 */
    public void mo15323a3() {
        FragNavController.m13812j(this.f27431g, null, 1);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: c2 */
    public void mo14341c2() {
        EventBusKt.m16327a(new OnNotificationBarCount((int) m15333u4().f25958j.f28961f));
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.FragmentNavigation
    /* renamed from: d2 */
    public void mo15324d2(@NotNull Fragment fragment, @Nullable List<? extends Pair<? extends View, String>> list) {
        Intrinsics.m32179h(fragment, "fragment");
        FragNavTransactionOptions.Builder builder = new FragNavTransactionOptions.Builder();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Pair<View, String> element = (Pair) it.next();
                Intrinsics.m32180i(element, "element");
                builder.f24575a.add(element);
            }
        }
        this.f27431g.m13824k(fragment, new FragNavTransactionOptions(builder, null));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: e0 */
    public void mo14342e0() {
        startActivity(new Intent(this, (Class<?>) UpdateActivity.class));
        finish();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: f1 */
    public void mo14343f1() {
        if (m15333u4().f25957i.f25344a.getLong("IN_APP_UPDATES_TIME_FOR_RETRY", 0L) < System.currentTimeMillis()) {
            MainPresenter m15333u4 = m15333u4();
            m15333u4.f25957i.f25344a.edit().putLong("IN_APP_UPDATES_TIME_FOR_RETRY", System.currentTimeMillis() + m15333u4().f25958j.f28960e).apply();
            Task<AppUpdateInfo> mo10647b = m15332t4().mo10647b();
            Intrinsics.m32178g(mo10647b, "appUpdateManager.appUpdateInfo");
            mo10647b.mo10999c(new C2622b(new Function1<AppUpdateInfo, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.MainActivity$onCheckForInAppUpdates$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(AppUpdateInfo appUpdateInfo) {
                    AppUpdateInfo appUpdateInfo2 = appUpdateInfo;
                    if (appUpdateInfo2.f19590a == 2) {
                        MainActivity mainActivity = MainActivity.this;
                        KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                        if (mainActivity.m15333u4().f25958j.f28959d == 0) {
                            MainActivity.this.m15332t4().mo10648c((InstallStateUpdatedListener) MainActivity.this.f27427c.getValue());
                        }
                        MainActivity.this.m15332t4().mo10649d(appUpdateInfo2, MainActivity.this.m15333u4().f25958j.f28959d, MainActivity.this, 10101);
                    }
                    return Unit.f63088a;
                }
            }, 29));
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: g1 */
    public void mo14344g1() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.auth_vk_not_bound);
        Intrinsics.m32178g(string, "getString(R.string.auth_vk_not_bound)");
        dialogs.m16307f(this, string);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: h */
    public void mo14345h() {
        ((Dialogs.MaterialDialog) this.f27428d.getValue()).show();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: j */
    public void mo14346j() {
        ((Dialogs.MaterialDialog) this.f27428d.getValue()).dismiss();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: l3 */
    public void mo14347l3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C2507R.style.DialogTheme);
        View inflate = getLayoutInflater().inflate(C2507R.layout.dialog_subscribe_vk, (ViewGroup) null);
        builder.setView(inflate);
        final AlertDialog m378l = builder.m378l();
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.positive_button);
        Intrinsics.m32178g(materialButton, "view.positive_button");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.MainActivity$onShowSubscribeVK$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                MainActivity mainActivity = MainActivity.this;
                KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                mainActivity.m15333u4().f25957i.f25344a.edit().putBoolean("IS_SHOW_SUBSCRIBE_VK", false).apply();
                YandexMetrica.reportEvent("Переход в группу ВКонтакте");
                new Common().m16300e(MainActivity.this, "https://vk.com/public94475547");
                m378l.dismiss();
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.negative_button);
        Intrinsics.m32178g(materialButton2, "view.negative_button");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.MainActivity$onShowSubscribeVK$2
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

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: n1 */
    public void mo14348n1() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.auth_google_already_bound);
        Intrinsics.m32178g(string, "getString(R.string.auth_google_already_bound)");
        dialogs.m16307f(this, string);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: o0 */
    public void mo14349o0() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.auth_vk_login_failed);
        Intrinsics.m32178g(string, "getString(R.string.auth_vk_login_failed)");
        dialogs.m16307f(this, string);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: o1 */
    public void mo14350o1() {
        Object systemService = getSystemService("uimode");
        Intrinsics.m32177f(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
        if (((UiModeManager) systemService).getCurrentModeType() == 4) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(this);
            builder.f30150b = 2;
            String string = getString(C2507R.string.dont_support_android_tv_title);
            Intrinsics.m32178g(string, "getString(R.string.dont_support_android_tv_title)");
            builder.m16319k(string);
            String string2 = getString(C2507R.string.dont_support_android_tv_desc);
            Intrinsics.m32178g(string2, "getString(R.string.dont_support_android_tv_desc)");
            builder.m16310b(string2);
            builder.m16315g(C2507R.string.ok);
            builder.m16317i();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: o3 */
    public void mo14351o3() {
        int m16367a = getResources().getConfiguration().orientation == 1 ? Views.f30250a.m16367a(this, 48.0f) : Views.f30250a.m16367a(this, 48.0f);
        Balloon balloon = (Balloon) this.f27436l.getValue();
        BottomNavigationView navigation = (BottomNavigationView) m15331s4(C2507R.id.navigation);
        Intrinsics.m32178g(navigation, "navigation");
        balloon.m13857u(navigation, m16367a, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        super.onActivityResult(i2, i3, intent);
        final HashMap<String, Object> hashMap = new HashMap<>();
        if (C2786VK.m16485d(i2, i3, intent, new VKAuthCallback() { // from class: com.swiftsoft.anixartd.ui.activity.MainActivity$onActivityResult$callback$1
            @Override // com.p017vk.api.sdk.auth.VKAuthCallback
            /* renamed from: a */
            public void mo15329a(int i4) {
                MainActivity mainActivity = this;
                KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                mainActivity.m15333u4().getViewState().mo14349o0();
            }

            @Override // com.p017vk.api.sdk.auth.VKAuthCallback
            /* renamed from: b */
            public void mo15330b(@NotNull VKAccessToken token) {
                Intrinsics.m32179h(token, "token");
                hashMap.put("accessToken", token.f30662b);
                hashMap.put("userId", Integer.valueOf(token.f30661a));
                hashMap.put("email", token.f30665e);
            }
        }) && (!hashMap.isEmpty())) {
            m15333u4().m14333v(hashMap);
        }
        if (i2 == 9001) {
            com.google.android.gms.tasks.Task<GoogleSignInAccount> m7852a = GoogleSignIn.m7852a(intent);
            try {
                GoogleSignInAccount mo9709n = m7852a.mo9709n(ApiException.class);
                String str = mo9709n != null ? mo9709n.f15175d : null;
                String str2 = mo9709n != null ? mo9709n.f15176e : null;
                if (str == null || str2 == null) {
                    return;
                }
                GoogleAuthCredential googleAuthCredential = new GoogleAuthCredential(str, null);
                FirebaseAuth firebaseAuth = this.f27434j;
                if (firebaseAuth != null) {
                    firebaseAuth.m12234a(googleAuthCredential).mo9697b(this, new C2546a(m7852a, this, 2));
                } else {
                    Intrinsics.m32189r("firebaseAuth");
                    throw null;
                }
            } catch (ApiException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onAdVisible(@NotNull OnAdVisible onAdVisible) {
        Intrinsics.m32179h(onAdVisible, "onAdVisible");
        if (m15333u4().m14313b() || !onAdVisible.f30169a) {
            m15334v4();
            return;
        }
        ((RelativeLayout) m15331s4(C2507R.id.mAdViewLayout)).getLayoutParams().height = Views.f30250a.m16367a(this, 50.0f);
        BannerAdView mAdView = (BannerAdView) m15331s4(C2507R.id.mAdView);
        Intrinsics.m32178g(mAdView, "mAdView");
        ViewsKt.m16378k(mAdView);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onAddFavorite(@NotNull OnAddFavorite onAddFavorite) {
        Intrinsics.m32179h(onAddFavorite, "onAddFavorite");
        Snackbar.m10377j(findViewById(C2507R.id.container), "Добавлено в Избранное", 0).m10380l();
        new Handler().postDelayed(new RunnableC2627c(this, 0), 3000L);
        m15333u4().m14314c(onAddFavorite.f30170a);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onAddFavoriteCollection(@NotNull OnAddFavoriteCollection onAddFavoriteCollection) {
        Intrinsics.m32179h(onAddFavoriteCollection, "onAddFavoriteCollection");
        Snackbar.m10377j(findViewById(C2507R.id.container), getString(C2507R.string.collection_favorite_added), 0).m10380l();
        m15333u4().m14315d(onAddFavoriteCollection.f30171a);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onAddToList(@NotNull OnAddToList onAddToList) {
        Intrinsics.m32179h(onAddToList, "onAddToList");
        final Release release = onAddToList.f30172a;
        final String[] strArr = {"Не смотрю", "Смотрю", "В планах", "Просмотрено", "Отложено", "Брошено"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C2507R.style.DialogTheme);
        builder.setTitle("Выберите статус просмотра ");
        final int profileListStatus = release.getProfileListStatus();
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.f63349b = profileListStatus;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.activity.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                String sb;
                Ref.IntRef checkedItem = Ref.IntRef.this;
                MainActivity this$0 = this;
                Release release2 = release;
                int i3 = profileListStatus;
                String[] lists = strArr;
                KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                Intrinsics.m32179h(checkedItem, "$checkedItem");
                Intrinsics.m32179h(this$0, "this$0");
                Intrinsics.m32179h(release2, "$release");
                Intrinsics.m32179h(lists, "$lists");
                checkedItem.f63349b = i2;
                this$0.m15333u4().m14325n(checkedItem.f63349b, release2);
                EventBusKt.m16327a(new OnSilentRecalculate(release2.getId(), i3, checkedItem.f63349b));
                if (checkedItem.f63349b == 0) {
                    StringBuilder m24u = C0000a.m24u("Удалено из списка ");
                    m24u.append(lists[i3]);
                    sb = m24u.toString();
                } else {
                    StringBuilder m24u2 = C0000a.m24u("Добавлено в список ");
                    m24u2.append(lists[checkedItem.f63349b]);
                    sb = m24u2.toString();
                }
                Snackbar.m10377j(this$0.findViewById(C2507R.id.container), sb, 0).m10380l();
                new Handler().postDelayed(new RunnableC2627c(this$0, 1), 3000L);
                dialogInterface.dismiss();
            }
        };
        AlertController.AlertParams alertParams = builder.f413a;
        alertParams.f388q = strArr;
        alertParams.f390s = onClickListener;
        alertParams.f395x = profileListStatus;
        alertParams.f394w = true;
        alertParams.f380i = "Отмена";
        alertParams.f381j = null;
        AlertDialog create = builder.create();
        Intrinsics.m32178g(create, "builder.create()");
        create.show();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onAlternativeConnection(@NotNull OnAlternativeConnection onAlternativeConnection) {
        String str;
        Intrinsics.m32179h(onAlternativeConnection, "onAlternativeConnection");
        Prefs prefs = m15333u4().f25957i;
        if (onAlternativeConnection.f30173a) {
            str = m15333u4().f25957i.f25344a.getString("API_ALT_URL", "https://api-s2.anixart.tv/");
            if (str == null) {
                str = "";
            }
        } else {
            str = "https://api.anixart.tv/";
        }
        prefs.m14052H(str);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ActivityResultCaller m13819e = this.f27431g.m13819e();
        if ((!(m13819e instanceof BackPressedListener) || ((BackPressedListener) m13819e).mo15435A2()) && !FragNavController.m13812j(this.f27431g, null, 1)) {
            super.onBackPressed();
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onBottomNavigationCompact(@NotNull OnBottomNavigationCompact onBottomNavigationCompact) {
        Intrinsics.m32179h(onBottomNavigationCompact, "onBottomNavigationCompact");
        BottomNavigationView bottomNavigationView = (BottomNavigationView) m15331s4(C2507R.id.navigation);
        if (onBottomNavigationCompact.f30175a) {
            ViewGroup.LayoutParams layoutParams = bottomNavigationView.getLayoutParams();
            Views views = Views.f30250a;
            Context context = ((BottomNavigationView) m15331s4(C2507R.id.navigation)).getContext();
            Intrinsics.m32178g(context, "navigation.context");
            layoutParams.height = views.m16367a(context, 56.0f);
            bottomNavigationView.setLabelVisibilityMode(2);
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = bottomNavigationView.getLayoutParams();
        Views views2 = Views.f30250a;
        Context context2 = ((BottomNavigationView) m15331s4(C2507R.id.navigation)).getContext();
        Intrinsics.m32178g(context2, "navigation.context");
        layoutParams2.height = views2.m16367a(context2, 80.0f);
        bottomNavigationView.setLabelVisibilityMode(1);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onBottomSheet(@NotNull final OnBottomSheet onBottomSheet) {
        Intrinsics.m32179h(onBottomSheet, "onBottomSheet");
        if (m15333u4().m14312a()) {
            Dialogs.f30143a.m16304a(this);
            return;
        }
        View inflate = getLayoutInflater().inflate(C2507R.layout.bottom_sheet_release_info, (ViewGroup) null);
        String[] strArr = {"Не смотрю", "Смотрю", "В планах", "Просмотрено", "Отложено", "Брошено"};
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C2507R.id.rating_layout);
        Intrinsics.m32178g(linearLayout, "view.rating_layout");
        final int i2 = 1;
        final int i3 = 0;
        ViewsKt.m16379l(linearLayout, onBottomSheet.f30176a.getVoteCount() > 50);
        ((TextView) inflate.findViewById(C2507R.id.title)).setText(onBottomSheet.f30176a.getTitleRu());
        ((TextView) inflate.findViewById(C2507R.id.grade)).setText(DigitsKt.m16323d(onBottomSheet.f30176a.getGrade(), 0, 1));
        if (onBottomSheet.f30176a.getEpisodesReleased() != null && onBottomSheet.f30176a.getEpisodesTotal() != null && Intrinsics.m32174c(onBottomSheet.f30176a.getEpisodesReleased(), onBottomSheet.f30176a.getEpisodesTotal())) {
            ((TextView) inflate.findViewById(C2507R.id.episodes)).setText(onBottomSheet.f30176a.getEpisodesTotal() + " эп");
            TextView textView = (TextView) inflate.findViewById(C2507R.id.episodes);
            TextView textView2 = (TextView) C2052a.m12265C(textView, "view.episodes", textView, inflate, C2507R.id.dot);
            Intrinsics.m32178g(textView2, "view.dot");
            ViewsKt.m16378k(textView2);
        } else if (onBottomSheet.f30176a.getEpisodesReleased() != null && onBottomSheet.f30176a.getEpisodesTotal() != null) {
            ((TextView) inflate.findViewById(C2507R.id.episodes)).setText(onBottomSheet.f30176a.getEpisodesReleased() + " из " + onBottomSheet.f30176a.getEpisodesTotal() + " эп");
            TextView textView3 = (TextView) inflate.findViewById(C2507R.id.episodes);
            TextView textView4 = (TextView) C2052a.m12265C(textView3, "view.episodes", textView3, inflate, C2507R.id.dot);
            Intrinsics.m32178g(textView4, "view.dot");
            ViewsKt.m16378k(textView4);
        } else if (onBottomSheet.f30176a.getEpisodesReleased() != null && onBottomSheet.f30176a.getEpisodesTotal() == null) {
            ((TextView) inflate.findViewById(C2507R.id.episodes)).setText(onBottomSheet.f30176a.getEpisodesReleased() + " из ? эп");
            TextView textView5 = (TextView) inflate.findViewById(C2507R.id.episodes);
            TextView textView6 = (TextView) C2052a.m12265C(textView5, "view.episodes", textView5, inflate, C2507R.id.dot);
            Intrinsics.m32178g(textView6, "view.dot");
            ViewsKt.m16378k(textView6);
        } else if (onBottomSheet.f30176a.getEpisodesReleased() != null || onBottomSheet.f30176a.getEpisodesTotal() == null) {
            TextView textView7 = (TextView) inflate.findViewById(C2507R.id.episodes);
            TextView textView8 = (TextView) C2052a.m12271f(textView7, "view.episodes", textView7, inflate, C2507R.id.dot);
            Intrinsics.m32178g(textView8, "view.dot");
            ViewsKt.m16372e(textView8);
        } else {
            TextView textView9 = (TextView) inflate.findViewById(C2507R.id.episodes);
            StringBuilder m24u = C0000a.m24u("? из ");
            m24u.append(onBottomSheet.f30176a.getEpisodesTotal());
            m24u.append(" эп");
            textView9.setText(m24u.toString());
            TextView textView10 = (TextView) inflate.findViewById(C2507R.id.episodes);
            TextView textView11 = (TextView) C2052a.m12265C(textView10, "view.episodes", textView10, inflate, C2507R.id.dot);
            Intrinsics.m32178g(textView11, "view.dot");
            ViewsKt.m16378k(textView11);
        }
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(inflate);
        bottomSheetDialog.show();
        if (onBottomSheet.f30176a.getIsViewed()) {
            ((LinearLayout) inflate.findViewById(C2507R.id.removeFromHistory)).setVisibility(0);
        }
        if (onBottomSheet.f30176a.getIsFavorite()) {
            ((LinearLayout) inflate.findViewById(C2507R.id.removeFromFavorite)).setVisibility(0);
        } else {
            ((LinearLayout) inflate.findViewById(C2507R.id.addToFavorite)).setVisibility(0);
        }
        TextView textView12 = (TextView) inflate.findViewById(C2507R.id.tvList);
        StringBuilder m24u2 = C0000a.m24u("В списке: ");
        String lowerCase = strArr[onBottomSheet.f30176a.getProfileListStatus()].toLowerCase();
        Intrinsics.m32178g(lowerCase, "this as java.lang.String).toLowerCase()");
        m24u2.append(lowerCase);
        textView12.setText(m24u2.toString());
        ((LinearLayout) inflate.findViewById(C2507R.id.addToFavorite)).setOnClickListener(new ViewOnClickListenerC2635k(this, onBottomSheet, bottomSheetDialog, i3));
        ((LinearLayout) inflate.findViewById(C2507R.id.removeFromHistory)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.activity.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        OnBottomSheet onBottomSheet2 = onBottomSheet;
                        BottomSheetDialog dialog = bottomSheetDialog;
                        KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                        Intrinsics.m32179h(onBottomSheet2, "$onBottomSheet");
                        Intrinsics.m32179h(dialog, "$dialog");
                        EventBusKt.m16327a(new OnDeleteHistory(onBottomSheet2.f30176a));
                        dialog.cancel();
                        break;
                    case 1:
                        OnBottomSheet onBottomSheet3 = onBottomSheet;
                        BottomSheetDialog dialog2 = bottomSheetDialog;
                        KProperty<Object>[] kPropertyArr2 = MainActivity.f27425n;
                        Intrinsics.m32179h(onBottomSheet3, "$onBottomSheet");
                        Intrinsics.m32179h(dialog2, "$dialog");
                        EventBusKt.m16327a(new OnAddToList(onBottomSheet3.f30176a));
                        dialog2.cancel();
                        break;
                    default:
                        OnBottomSheet onBottomSheet4 = onBottomSheet;
                        BottomSheetDialog dialog3 = bottomSheetDialog;
                        KProperty<Object>[] kPropertyArr3 = MainActivity.f27425n;
                        Intrinsics.m32179h(onBottomSheet4, "$onBottomSheet");
                        Intrinsics.m32179h(dialog3, "$dialog");
                        EventBusKt.m16327a(new OnDeleteFavorite(onBottomSheet4.f30176a));
                        dialog3.cancel();
                        break;
                }
            }
        });
        ((LinearLayout) inflate.findViewById(C2507R.id.addToList)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.activity.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        OnBottomSheet onBottomSheet2 = onBottomSheet;
                        BottomSheetDialog dialog = bottomSheetDialog;
                        KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                        Intrinsics.m32179h(onBottomSheet2, "$onBottomSheet");
                        Intrinsics.m32179h(dialog, "$dialog");
                        EventBusKt.m16327a(new OnDeleteHistory(onBottomSheet2.f30176a));
                        dialog.cancel();
                        break;
                    case 1:
                        OnBottomSheet onBottomSheet3 = onBottomSheet;
                        BottomSheetDialog dialog2 = bottomSheetDialog;
                        KProperty<Object>[] kPropertyArr2 = MainActivity.f27425n;
                        Intrinsics.m32179h(onBottomSheet3, "$onBottomSheet");
                        Intrinsics.m32179h(dialog2, "$dialog");
                        EventBusKt.m16327a(new OnAddToList(onBottomSheet3.f30176a));
                        dialog2.cancel();
                        break;
                    default:
                        OnBottomSheet onBottomSheet4 = onBottomSheet;
                        BottomSheetDialog dialog3 = bottomSheetDialog;
                        KProperty<Object>[] kPropertyArr3 = MainActivity.f27425n;
                        Intrinsics.m32179h(onBottomSheet4, "$onBottomSheet");
                        Intrinsics.m32179h(dialog3, "$dialog");
                        EventBusKt.m16327a(new OnDeleteFavorite(onBottomSheet4.f30176a));
                        dialog3.cancel();
                        break;
                }
            }
        });
        final int i4 = 2;
        ((LinearLayout) inflate.findViewById(C2507R.id.removeFromFavorite)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.activity.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        OnBottomSheet onBottomSheet2 = onBottomSheet;
                        BottomSheetDialog dialog = bottomSheetDialog;
                        KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                        Intrinsics.m32179h(onBottomSheet2, "$onBottomSheet");
                        Intrinsics.m32179h(dialog, "$dialog");
                        EventBusKt.m16327a(new OnDeleteHistory(onBottomSheet2.f30176a));
                        dialog.cancel();
                        break;
                    case 1:
                        OnBottomSheet onBottomSheet3 = onBottomSheet;
                        BottomSheetDialog dialog2 = bottomSheetDialog;
                        KProperty<Object>[] kPropertyArr2 = MainActivity.f27425n;
                        Intrinsics.m32179h(onBottomSheet3, "$onBottomSheet");
                        Intrinsics.m32179h(dialog2, "$dialog");
                        EventBusKt.m16327a(new OnAddToList(onBottomSheet3.f30176a));
                        dialog2.cancel();
                        break;
                    default:
                        OnBottomSheet onBottomSheet4 = onBottomSheet;
                        BottomSheetDialog dialog3 = bottomSheetDialog;
                        KProperty<Object>[] kPropertyArr3 = MainActivity.f27425n;
                        Intrinsics.m32179h(onBottomSheet4, "$onBottomSheet");
                        Intrinsics.m32179h(dialog3, "$dialog");
                        EventBusKt.m16327a(new OnDeleteFavorite(onBottomSheet4.f30176a));
                        dialog3.cancel();
                        break;
                }
            }
        });
        ((MaterialButton) inflate.findViewById(C2507R.id.close)).setOnClickListener(new ViewOnClickListenerC2629e(bottomSheetDialog, i4));
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onBottomSheetProfileSocial(@NotNull final OnBottomSheetProfileSocial onBottomSheetProfileSocial) {
        boolean z;
        Intrinsics.m32179h(onBottomSheetProfileSocial, "onBottomSheetProfileSocial");
        if (m15333u4().m14312a()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this, C2507R.style.DialogTheme);
            View inflate = getLayoutInflater().inflate(C2507R.layout.dialog_need_auth, (ViewGroup) null);
            builder.setView(inflate);
            final android.app.AlertDialog show = builder.show();
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.auth_button);
            Intrinsics.m32178g(materialButton, "view.auth_button");
            ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.MainActivity$onBottomSheetProfileSocial$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(View view) {
                    View it = view;
                    Intrinsics.m32179h(it, "it");
                    Intent intent = new Intent(MainActivity.this, (Class<?>) AuthActivity.class);
                    intent.setFlags(268451840);
                    MainActivity.this.startActivity(intent);
                    return Unit.f63088a;
                }
            });
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.negative_button);
            Intrinsics.m32178g(materialButton2, "view.negative_button");
            ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.MainActivity$onBottomSheetProfileSocial$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(View view) {
                    View it = view;
                    Intrinsics.m32179h(it, "it");
                    show.dismiss();
                    return Unit.f63088a;
                }
            });
            return;
        }
        View inflate2 = getLayoutInflater().inflate(C2507R.layout.bottom_sheet_social, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) inflate2.findViewById(C2507R.id.socialVk);
        Intrinsics.m32178g(linearLayout, "view.socialVk");
        String str = onBottomSheetProfileSocial.f30177a;
        final int i2 = 1;
        final int i3 = 0;
        ViewsKt.m16373f(linearLayout, str == null || str.length() == 0, false, null, 6);
        LinearLayout linearLayout2 = (LinearLayout) inflate2.findViewById(C2507R.id.socialTelegram);
        Intrinsics.m32178g(linearLayout2, "view.socialTelegram");
        String str2 = onBottomSheetProfileSocial.f30178b;
        ViewsKt.m16373f(linearLayout2, str2 == null || str2.length() == 0, false, null, 6);
        LinearLayout linearLayout3 = (LinearLayout) inflate2.findViewById(C2507R.id.socialInstagram);
        Intrinsics.m32178g(linearLayout3, "view.socialInstagram");
        String str3 = onBottomSheetProfileSocial.f30179c;
        ViewsKt.m16373f(linearLayout3, str3 == null || str3.length() == 0, false, null, 6);
        LinearLayout linearLayout4 = (LinearLayout) inflate2.findViewById(C2507R.id.socialTiktok);
        Intrinsics.m32178g(linearLayout4, "view.socialTiktok");
        String str4 = onBottomSheetProfileSocial.f30180d;
        ViewsKt.m16373f(linearLayout4, str4 == null || str4.length() == 0, false, null, 6);
        LinearLayout linearLayout5 = (LinearLayout) inflate2.findViewById(C2507R.id.socialDiscord);
        Intrinsics.m32178g(linearLayout5, "view.socialDiscord");
        String str5 = onBottomSheetProfileSocial.f30181e;
        ViewsKt.m16373f(linearLayout5, str5 == null || str5.length() == 0, false, null, 6);
        TextView textView = (TextView) inflate2.findViewById(C2507R.id.error);
        Intrinsics.m32178g(textView, "view.error");
        String str6 = onBottomSheetProfileSocial.f30177a;
        if (str6 == null || str6.length() == 0) {
            String str7 = onBottomSheetProfileSocial.f30178b;
            if (str7 == null || str7.length() == 0) {
                String str8 = onBottomSheetProfileSocial.f30179c;
                if (str8 == null || str8.length() == 0) {
                    String str9 = onBottomSheetProfileSocial.f30180d;
                    if (str9 == null || str9.length() == 0) {
                        String str10 = onBottomSheetProfileSocial.f30181e;
                        if (str10 == null || str10.length() == 0) {
                            z = true;
                            ViewsKt.m16379l(textView, z);
                            final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
                            bottomSheetDialog.setContentView(inflate2);
                            bottomSheetDialog.show();
                            ((LinearLayout) inflate2.findViewById(C2507R.id.socialVk)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.activity.g

                                /* renamed from: c */
                                public final /* synthetic */ MainActivity f27506c;

                                {
                                    this.f27506c = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i3) {
                                        case 0:
                                            MainActivity this$0 = this.f27506c;
                                            OnBottomSheetProfileSocial onBottomSheetProfileSocial2 = onBottomSheetProfileSocial;
                                            BottomSheetDialog dialog = bottomSheetDialog;
                                            KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                                            Intrinsics.m32179h(this$0, "this$0");
                                            Intrinsics.m32179h(onBottomSheetProfileSocial2, "$onBottomSheetProfileSocial");
                                            Intrinsics.m32179h(dialog, "$dialog");
                                            new Common().m16300e(this$0, "https://vk.com/" + onBottomSheetProfileSocial2.f30177a);
                                            dialog.cancel();
                                            break;
                                        case 1:
                                            MainActivity this$02 = this.f27506c;
                                            OnBottomSheetProfileSocial onBottomSheetProfileSocial3 = onBottomSheetProfileSocial;
                                            BottomSheetDialog dialog2 = bottomSheetDialog;
                                            KProperty<Object>[] kPropertyArr2 = MainActivity.f27425n;
                                            Intrinsics.m32179h(this$02, "this$0");
                                            Intrinsics.m32179h(onBottomSheetProfileSocial3, "$onBottomSheetProfileSocial");
                                            Intrinsics.m32179h(dialog2, "$dialog");
                                            new Common().m16300e(this$02, "https://t.me/" + onBottomSheetProfileSocial3.f30178b);
                                            dialog2.cancel();
                                            break;
                                        case 2:
                                            MainActivity this$03 = this.f27506c;
                                            OnBottomSheetProfileSocial onBottomSheetProfileSocial4 = onBottomSheetProfileSocial;
                                            BottomSheetDialog dialog3 = bottomSheetDialog;
                                            KProperty<Object>[] kPropertyArr3 = MainActivity.f27425n;
                                            Intrinsics.m32179h(this$03, "this$0");
                                            Intrinsics.m32179h(onBottomSheetProfileSocial4, "$onBottomSheetProfileSocial");
                                            Intrinsics.m32179h(dialog3, "$dialog");
                                            new Common().m16300e(this$03, "https://instagram.com/" + onBottomSheetProfileSocial4.f30179c);
                                            dialog3.cancel();
                                            break;
                                        case 3:
                                            MainActivity this$04 = this.f27506c;
                                            OnBottomSheetProfileSocial onBottomSheetProfileSocial5 = onBottomSheetProfileSocial;
                                            BottomSheetDialog dialog4 = bottomSheetDialog;
                                            KProperty<Object>[] kPropertyArr4 = MainActivity.f27425n;
                                            Intrinsics.m32179h(this$04, "this$0");
                                            Intrinsics.m32179h(onBottomSheetProfileSocial5, "$onBottomSheetProfileSocial");
                                            Intrinsics.m32179h(dialog4, "$dialog");
                                            new Common().m16300e(this$04, "https://tiktok.com/@" + onBottomSheetProfileSocial5.f30180d);
                                            dialog4.cancel();
                                            break;
                                        default:
                                            MainActivity this$05 = this.f27506c;
                                            OnBottomSheetProfileSocial onBottomSheetProfileSocial6 = onBottomSheetProfileSocial;
                                            BottomSheetDialog dialog5 = bottomSheetDialog;
                                            KProperty<Object>[] kPropertyArr5 = MainActivity.f27425n;
                                            Intrinsics.m32179h(this$05, "this$0");
                                            Intrinsics.m32179h(onBottomSheetProfileSocial6, "$onBottomSheetProfileSocial");
                                            Intrinsics.m32179h(dialog5, "$dialog");
                                            Object systemService = this$05.getSystemService("clipboard");
                                            Intrinsics.m32177f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("data", onBottomSheetProfileSocial6.f30181e));
                                            Dialogs.f30143a.m16307f(this$05, "Имя пользователя Discord скопировано " + onBottomSheetProfileSocial6.f30181e);
                                            dialog5.cancel();
                                            break;
                                    }
                                }
                            });
                            ((LinearLayout) inflate2.findViewById(C2507R.id.socialTelegram)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.activity.g

                                /* renamed from: c */
                                public final /* synthetic */ MainActivity f27506c;

                                {
                                    this.f27506c = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i2) {
                                        case 0:
                                            MainActivity this$0 = this.f27506c;
                                            OnBottomSheetProfileSocial onBottomSheetProfileSocial2 = onBottomSheetProfileSocial;
                                            BottomSheetDialog dialog = bottomSheetDialog;
                                            KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                                            Intrinsics.m32179h(this$0, "this$0");
                                            Intrinsics.m32179h(onBottomSheetProfileSocial2, "$onBottomSheetProfileSocial");
                                            Intrinsics.m32179h(dialog, "$dialog");
                                            new Common().m16300e(this$0, "https://vk.com/" + onBottomSheetProfileSocial2.f30177a);
                                            dialog.cancel();
                                            break;
                                        case 1:
                                            MainActivity this$02 = this.f27506c;
                                            OnBottomSheetProfileSocial onBottomSheetProfileSocial3 = onBottomSheetProfileSocial;
                                            BottomSheetDialog dialog2 = bottomSheetDialog;
                                            KProperty<Object>[] kPropertyArr2 = MainActivity.f27425n;
                                            Intrinsics.m32179h(this$02, "this$0");
                                            Intrinsics.m32179h(onBottomSheetProfileSocial3, "$onBottomSheetProfileSocial");
                                            Intrinsics.m32179h(dialog2, "$dialog");
                                            new Common().m16300e(this$02, "https://t.me/" + onBottomSheetProfileSocial3.f30178b);
                                            dialog2.cancel();
                                            break;
                                        case 2:
                                            MainActivity this$03 = this.f27506c;
                                            OnBottomSheetProfileSocial onBottomSheetProfileSocial4 = onBottomSheetProfileSocial;
                                            BottomSheetDialog dialog3 = bottomSheetDialog;
                                            KProperty<Object>[] kPropertyArr3 = MainActivity.f27425n;
                                            Intrinsics.m32179h(this$03, "this$0");
                                            Intrinsics.m32179h(onBottomSheetProfileSocial4, "$onBottomSheetProfileSocial");
                                            Intrinsics.m32179h(dialog3, "$dialog");
                                            new Common().m16300e(this$03, "https://instagram.com/" + onBottomSheetProfileSocial4.f30179c);
                                            dialog3.cancel();
                                            break;
                                        case 3:
                                            MainActivity this$04 = this.f27506c;
                                            OnBottomSheetProfileSocial onBottomSheetProfileSocial5 = onBottomSheetProfileSocial;
                                            BottomSheetDialog dialog4 = bottomSheetDialog;
                                            KProperty<Object>[] kPropertyArr4 = MainActivity.f27425n;
                                            Intrinsics.m32179h(this$04, "this$0");
                                            Intrinsics.m32179h(onBottomSheetProfileSocial5, "$onBottomSheetProfileSocial");
                                            Intrinsics.m32179h(dialog4, "$dialog");
                                            new Common().m16300e(this$04, "https://tiktok.com/@" + onBottomSheetProfileSocial5.f30180d);
                                            dialog4.cancel();
                                            break;
                                        default:
                                            MainActivity this$05 = this.f27506c;
                                            OnBottomSheetProfileSocial onBottomSheetProfileSocial6 = onBottomSheetProfileSocial;
                                            BottomSheetDialog dialog5 = bottomSheetDialog;
                                            KProperty<Object>[] kPropertyArr5 = MainActivity.f27425n;
                                            Intrinsics.m32179h(this$05, "this$0");
                                            Intrinsics.m32179h(onBottomSheetProfileSocial6, "$onBottomSheetProfileSocial");
                                            Intrinsics.m32179h(dialog5, "$dialog");
                                            Object systemService = this$05.getSystemService("clipboard");
                                            Intrinsics.m32177f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("data", onBottomSheetProfileSocial6.f30181e));
                                            Dialogs.f30143a.m16307f(this$05, "Имя пользователя Discord скопировано " + onBottomSheetProfileSocial6.f30181e);
                                            dialog5.cancel();
                                            break;
                                    }
                                }
                            });
                            final int i4 = 2;
                            ((LinearLayout) inflate2.findViewById(C2507R.id.socialInstagram)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.activity.g

                                /* renamed from: c */
                                public final /* synthetic */ MainActivity f27506c;

                                {
                                    this.f27506c = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i4) {
                                        case 0:
                                            MainActivity this$0 = this.f27506c;
                                            OnBottomSheetProfileSocial onBottomSheetProfileSocial2 = onBottomSheetProfileSocial;
                                            BottomSheetDialog dialog = bottomSheetDialog;
                                            KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                                            Intrinsics.m32179h(this$0, "this$0");
                                            Intrinsics.m32179h(onBottomSheetProfileSocial2, "$onBottomSheetProfileSocial");
                                            Intrinsics.m32179h(dialog, "$dialog");
                                            new Common().m16300e(this$0, "https://vk.com/" + onBottomSheetProfileSocial2.f30177a);
                                            dialog.cancel();
                                            break;
                                        case 1:
                                            MainActivity this$02 = this.f27506c;
                                            OnBottomSheetProfileSocial onBottomSheetProfileSocial3 = onBottomSheetProfileSocial;
                                            BottomSheetDialog dialog2 = bottomSheetDialog;
                                            KProperty<Object>[] kPropertyArr2 = MainActivity.f27425n;
                                            Intrinsics.m32179h(this$02, "this$0");
                                            Intrinsics.m32179h(onBottomSheetProfileSocial3, "$onBottomSheetProfileSocial");
                                            Intrinsics.m32179h(dialog2, "$dialog");
                                            new Common().m16300e(this$02, "https://t.me/" + onBottomSheetProfileSocial3.f30178b);
                                            dialog2.cancel();
                                            break;
                                        case 2:
                                            MainActivity this$03 = this.f27506c;
                                            OnBottomSheetProfileSocial onBottomSheetProfileSocial4 = onBottomSheetProfileSocial;
                                            BottomSheetDialog dialog3 = bottomSheetDialog;
                                            KProperty<Object>[] kPropertyArr3 = MainActivity.f27425n;
                                            Intrinsics.m32179h(this$03, "this$0");
                                            Intrinsics.m32179h(onBottomSheetProfileSocial4, "$onBottomSheetProfileSocial");
                                            Intrinsics.m32179h(dialog3, "$dialog");
                                            new Common().m16300e(this$03, "https://instagram.com/" + onBottomSheetProfileSocial4.f30179c);
                                            dialog3.cancel();
                                            break;
                                        case 3:
                                            MainActivity this$04 = this.f27506c;
                                            OnBottomSheetProfileSocial onBottomSheetProfileSocial5 = onBottomSheetProfileSocial;
                                            BottomSheetDialog dialog4 = bottomSheetDialog;
                                            KProperty<Object>[] kPropertyArr4 = MainActivity.f27425n;
                                            Intrinsics.m32179h(this$04, "this$0");
                                            Intrinsics.m32179h(onBottomSheetProfileSocial5, "$onBottomSheetProfileSocial");
                                            Intrinsics.m32179h(dialog4, "$dialog");
                                            new Common().m16300e(this$04, "https://tiktok.com/@" + onBottomSheetProfileSocial5.f30180d);
                                            dialog4.cancel();
                                            break;
                                        default:
                                            MainActivity this$05 = this.f27506c;
                                            OnBottomSheetProfileSocial onBottomSheetProfileSocial6 = onBottomSheetProfileSocial;
                                            BottomSheetDialog dialog5 = bottomSheetDialog;
                                            KProperty<Object>[] kPropertyArr5 = MainActivity.f27425n;
                                            Intrinsics.m32179h(this$05, "this$0");
                                            Intrinsics.m32179h(onBottomSheetProfileSocial6, "$onBottomSheetProfileSocial");
                                            Intrinsics.m32179h(dialog5, "$dialog");
                                            Object systemService = this$05.getSystemService("clipboard");
                                            Intrinsics.m32177f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("data", onBottomSheetProfileSocial6.f30181e));
                                            Dialogs.f30143a.m16307f(this$05, "Имя пользователя Discord скопировано " + onBottomSheetProfileSocial6.f30181e);
                                            dialog5.cancel();
                                            break;
                                    }
                                }
                            });
                            final int i5 = 3;
                            ((LinearLayout) inflate2.findViewById(C2507R.id.socialTiktok)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.activity.g

                                /* renamed from: c */
                                public final /* synthetic */ MainActivity f27506c;

                                {
                                    this.f27506c = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i5) {
                                        case 0:
                                            MainActivity this$0 = this.f27506c;
                                            OnBottomSheetProfileSocial onBottomSheetProfileSocial2 = onBottomSheetProfileSocial;
                                            BottomSheetDialog dialog = bottomSheetDialog;
                                            KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                                            Intrinsics.m32179h(this$0, "this$0");
                                            Intrinsics.m32179h(onBottomSheetProfileSocial2, "$onBottomSheetProfileSocial");
                                            Intrinsics.m32179h(dialog, "$dialog");
                                            new Common().m16300e(this$0, "https://vk.com/" + onBottomSheetProfileSocial2.f30177a);
                                            dialog.cancel();
                                            break;
                                        case 1:
                                            MainActivity this$02 = this.f27506c;
                                            OnBottomSheetProfileSocial onBottomSheetProfileSocial3 = onBottomSheetProfileSocial;
                                            BottomSheetDialog dialog2 = bottomSheetDialog;
                                            KProperty<Object>[] kPropertyArr2 = MainActivity.f27425n;
                                            Intrinsics.m32179h(this$02, "this$0");
                                            Intrinsics.m32179h(onBottomSheetProfileSocial3, "$onBottomSheetProfileSocial");
                                            Intrinsics.m32179h(dialog2, "$dialog");
                                            new Common().m16300e(this$02, "https://t.me/" + onBottomSheetProfileSocial3.f30178b);
                                            dialog2.cancel();
                                            break;
                                        case 2:
                                            MainActivity this$03 = this.f27506c;
                                            OnBottomSheetProfileSocial onBottomSheetProfileSocial4 = onBottomSheetProfileSocial;
                                            BottomSheetDialog dialog3 = bottomSheetDialog;
                                            KProperty<Object>[] kPropertyArr3 = MainActivity.f27425n;
                                            Intrinsics.m32179h(this$03, "this$0");
                                            Intrinsics.m32179h(onBottomSheetProfileSocial4, "$onBottomSheetProfileSocial");
                                            Intrinsics.m32179h(dialog3, "$dialog");
                                            new Common().m16300e(this$03, "https://instagram.com/" + onBottomSheetProfileSocial4.f30179c);
                                            dialog3.cancel();
                                            break;
                                        case 3:
                                            MainActivity this$04 = this.f27506c;
                                            OnBottomSheetProfileSocial onBottomSheetProfileSocial5 = onBottomSheetProfileSocial;
                                            BottomSheetDialog dialog4 = bottomSheetDialog;
                                            KProperty<Object>[] kPropertyArr4 = MainActivity.f27425n;
                                            Intrinsics.m32179h(this$04, "this$0");
                                            Intrinsics.m32179h(onBottomSheetProfileSocial5, "$onBottomSheetProfileSocial");
                                            Intrinsics.m32179h(dialog4, "$dialog");
                                            new Common().m16300e(this$04, "https://tiktok.com/@" + onBottomSheetProfileSocial5.f30180d);
                                            dialog4.cancel();
                                            break;
                                        default:
                                            MainActivity this$05 = this.f27506c;
                                            OnBottomSheetProfileSocial onBottomSheetProfileSocial6 = onBottomSheetProfileSocial;
                                            BottomSheetDialog dialog5 = bottomSheetDialog;
                                            KProperty<Object>[] kPropertyArr5 = MainActivity.f27425n;
                                            Intrinsics.m32179h(this$05, "this$0");
                                            Intrinsics.m32179h(onBottomSheetProfileSocial6, "$onBottomSheetProfileSocial");
                                            Intrinsics.m32179h(dialog5, "$dialog");
                                            Object systemService = this$05.getSystemService("clipboard");
                                            Intrinsics.m32177f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("data", onBottomSheetProfileSocial6.f30181e));
                                            Dialogs.f30143a.m16307f(this$05, "Имя пользователя Discord скопировано " + onBottomSheetProfileSocial6.f30181e);
                                            dialog5.cancel();
                                            break;
                                    }
                                }
                            });
                            final int i6 = 4;
                            ((LinearLayout) inflate2.findViewById(C2507R.id.socialDiscord)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.activity.g

                                /* renamed from: c */
                                public final /* synthetic */ MainActivity f27506c;

                                {
                                    this.f27506c = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i6) {
                                        case 0:
                                            MainActivity this$0 = this.f27506c;
                                            OnBottomSheetProfileSocial onBottomSheetProfileSocial2 = onBottomSheetProfileSocial;
                                            BottomSheetDialog dialog = bottomSheetDialog;
                                            KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                                            Intrinsics.m32179h(this$0, "this$0");
                                            Intrinsics.m32179h(onBottomSheetProfileSocial2, "$onBottomSheetProfileSocial");
                                            Intrinsics.m32179h(dialog, "$dialog");
                                            new Common().m16300e(this$0, "https://vk.com/" + onBottomSheetProfileSocial2.f30177a);
                                            dialog.cancel();
                                            break;
                                        case 1:
                                            MainActivity this$02 = this.f27506c;
                                            OnBottomSheetProfileSocial onBottomSheetProfileSocial3 = onBottomSheetProfileSocial;
                                            BottomSheetDialog dialog2 = bottomSheetDialog;
                                            KProperty<Object>[] kPropertyArr2 = MainActivity.f27425n;
                                            Intrinsics.m32179h(this$02, "this$0");
                                            Intrinsics.m32179h(onBottomSheetProfileSocial3, "$onBottomSheetProfileSocial");
                                            Intrinsics.m32179h(dialog2, "$dialog");
                                            new Common().m16300e(this$02, "https://t.me/" + onBottomSheetProfileSocial3.f30178b);
                                            dialog2.cancel();
                                            break;
                                        case 2:
                                            MainActivity this$03 = this.f27506c;
                                            OnBottomSheetProfileSocial onBottomSheetProfileSocial4 = onBottomSheetProfileSocial;
                                            BottomSheetDialog dialog3 = bottomSheetDialog;
                                            KProperty<Object>[] kPropertyArr3 = MainActivity.f27425n;
                                            Intrinsics.m32179h(this$03, "this$0");
                                            Intrinsics.m32179h(onBottomSheetProfileSocial4, "$onBottomSheetProfileSocial");
                                            Intrinsics.m32179h(dialog3, "$dialog");
                                            new Common().m16300e(this$03, "https://instagram.com/" + onBottomSheetProfileSocial4.f30179c);
                                            dialog3.cancel();
                                            break;
                                        case 3:
                                            MainActivity this$04 = this.f27506c;
                                            OnBottomSheetProfileSocial onBottomSheetProfileSocial5 = onBottomSheetProfileSocial;
                                            BottomSheetDialog dialog4 = bottomSheetDialog;
                                            KProperty<Object>[] kPropertyArr4 = MainActivity.f27425n;
                                            Intrinsics.m32179h(this$04, "this$0");
                                            Intrinsics.m32179h(onBottomSheetProfileSocial5, "$onBottomSheetProfileSocial");
                                            Intrinsics.m32179h(dialog4, "$dialog");
                                            new Common().m16300e(this$04, "https://tiktok.com/@" + onBottomSheetProfileSocial5.f30180d);
                                            dialog4.cancel();
                                            break;
                                        default:
                                            MainActivity this$05 = this.f27506c;
                                            OnBottomSheetProfileSocial onBottomSheetProfileSocial6 = onBottomSheetProfileSocial;
                                            BottomSheetDialog dialog5 = bottomSheetDialog;
                                            KProperty<Object>[] kPropertyArr5 = MainActivity.f27425n;
                                            Intrinsics.m32179h(this$05, "this$0");
                                            Intrinsics.m32179h(onBottomSheetProfileSocial6, "$onBottomSheetProfileSocial");
                                            Intrinsics.m32179h(dialog5, "$dialog");
                                            Object systemService = this$05.getSystemService("clipboard");
                                            Intrinsics.m32177f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("data", onBottomSheetProfileSocial6.f30181e));
                                            Dialogs.f30143a.m16307f(this$05, "Имя пользователя Discord скопировано " + onBottomSheetProfileSocial6.f30181e);
                                            dialog5.cancel();
                                            break;
                                    }
                                }
                            });
                            ((MaterialButton) inflate2.findViewById(C2507R.id.close)).setOnClickListener(new ViewOnClickListenerC2629e(bottomSheetDialog, i3));
                        }
                    }
                }
            }
        }
        z = false;
        ViewsKt.m16379l(textView, z);
        final BottomSheetDialog bottomSheetDialog2 = new BottomSheetDialog(this);
        bottomSheetDialog2.setContentView(inflate2);
        bottomSheetDialog2.show();
        ((LinearLayout) inflate2.findViewById(C2507R.id.socialVk)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.activity.g

            /* renamed from: c */
            public final /* synthetic */ MainActivity f27506c;

            {
                this.f27506c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        MainActivity this$0 = this.f27506c;
                        OnBottomSheetProfileSocial onBottomSheetProfileSocial2 = onBottomSheetProfileSocial;
                        BottomSheetDialog dialog = bottomSheetDialog2;
                        KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                        Intrinsics.m32179h(this$0, "this$0");
                        Intrinsics.m32179h(onBottomSheetProfileSocial2, "$onBottomSheetProfileSocial");
                        Intrinsics.m32179h(dialog, "$dialog");
                        new Common().m16300e(this$0, "https://vk.com/" + onBottomSheetProfileSocial2.f30177a);
                        dialog.cancel();
                        break;
                    case 1:
                        MainActivity this$02 = this.f27506c;
                        OnBottomSheetProfileSocial onBottomSheetProfileSocial3 = onBottomSheetProfileSocial;
                        BottomSheetDialog dialog2 = bottomSheetDialog2;
                        KProperty<Object>[] kPropertyArr2 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$02, "this$0");
                        Intrinsics.m32179h(onBottomSheetProfileSocial3, "$onBottomSheetProfileSocial");
                        Intrinsics.m32179h(dialog2, "$dialog");
                        new Common().m16300e(this$02, "https://t.me/" + onBottomSheetProfileSocial3.f30178b);
                        dialog2.cancel();
                        break;
                    case 2:
                        MainActivity this$03 = this.f27506c;
                        OnBottomSheetProfileSocial onBottomSheetProfileSocial4 = onBottomSheetProfileSocial;
                        BottomSheetDialog dialog3 = bottomSheetDialog2;
                        KProperty<Object>[] kPropertyArr3 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$03, "this$0");
                        Intrinsics.m32179h(onBottomSheetProfileSocial4, "$onBottomSheetProfileSocial");
                        Intrinsics.m32179h(dialog3, "$dialog");
                        new Common().m16300e(this$03, "https://instagram.com/" + onBottomSheetProfileSocial4.f30179c);
                        dialog3.cancel();
                        break;
                    case 3:
                        MainActivity this$04 = this.f27506c;
                        OnBottomSheetProfileSocial onBottomSheetProfileSocial5 = onBottomSheetProfileSocial;
                        BottomSheetDialog dialog4 = bottomSheetDialog2;
                        KProperty<Object>[] kPropertyArr4 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$04, "this$0");
                        Intrinsics.m32179h(onBottomSheetProfileSocial5, "$onBottomSheetProfileSocial");
                        Intrinsics.m32179h(dialog4, "$dialog");
                        new Common().m16300e(this$04, "https://tiktok.com/@" + onBottomSheetProfileSocial5.f30180d);
                        dialog4.cancel();
                        break;
                    default:
                        MainActivity this$05 = this.f27506c;
                        OnBottomSheetProfileSocial onBottomSheetProfileSocial6 = onBottomSheetProfileSocial;
                        BottomSheetDialog dialog5 = bottomSheetDialog2;
                        KProperty<Object>[] kPropertyArr5 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$05, "this$0");
                        Intrinsics.m32179h(onBottomSheetProfileSocial6, "$onBottomSheetProfileSocial");
                        Intrinsics.m32179h(dialog5, "$dialog");
                        Object systemService = this$05.getSystemService("clipboard");
                        Intrinsics.m32177f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("data", onBottomSheetProfileSocial6.f30181e));
                        Dialogs.f30143a.m16307f(this$05, "Имя пользователя Discord скопировано " + onBottomSheetProfileSocial6.f30181e);
                        dialog5.cancel();
                        break;
                }
            }
        });
        ((LinearLayout) inflate2.findViewById(C2507R.id.socialTelegram)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.activity.g

            /* renamed from: c */
            public final /* synthetic */ MainActivity f27506c;

            {
                this.f27506c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        MainActivity this$0 = this.f27506c;
                        OnBottomSheetProfileSocial onBottomSheetProfileSocial2 = onBottomSheetProfileSocial;
                        BottomSheetDialog dialog = bottomSheetDialog2;
                        KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                        Intrinsics.m32179h(this$0, "this$0");
                        Intrinsics.m32179h(onBottomSheetProfileSocial2, "$onBottomSheetProfileSocial");
                        Intrinsics.m32179h(dialog, "$dialog");
                        new Common().m16300e(this$0, "https://vk.com/" + onBottomSheetProfileSocial2.f30177a);
                        dialog.cancel();
                        break;
                    case 1:
                        MainActivity this$02 = this.f27506c;
                        OnBottomSheetProfileSocial onBottomSheetProfileSocial3 = onBottomSheetProfileSocial;
                        BottomSheetDialog dialog2 = bottomSheetDialog2;
                        KProperty<Object>[] kPropertyArr2 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$02, "this$0");
                        Intrinsics.m32179h(onBottomSheetProfileSocial3, "$onBottomSheetProfileSocial");
                        Intrinsics.m32179h(dialog2, "$dialog");
                        new Common().m16300e(this$02, "https://t.me/" + onBottomSheetProfileSocial3.f30178b);
                        dialog2.cancel();
                        break;
                    case 2:
                        MainActivity this$03 = this.f27506c;
                        OnBottomSheetProfileSocial onBottomSheetProfileSocial4 = onBottomSheetProfileSocial;
                        BottomSheetDialog dialog3 = bottomSheetDialog2;
                        KProperty<Object>[] kPropertyArr3 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$03, "this$0");
                        Intrinsics.m32179h(onBottomSheetProfileSocial4, "$onBottomSheetProfileSocial");
                        Intrinsics.m32179h(dialog3, "$dialog");
                        new Common().m16300e(this$03, "https://instagram.com/" + onBottomSheetProfileSocial4.f30179c);
                        dialog3.cancel();
                        break;
                    case 3:
                        MainActivity this$04 = this.f27506c;
                        OnBottomSheetProfileSocial onBottomSheetProfileSocial5 = onBottomSheetProfileSocial;
                        BottomSheetDialog dialog4 = bottomSheetDialog2;
                        KProperty<Object>[] kPropertyArr4 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$04, "this$0");
                        Intrinsics.m32179h(onBottomSheetProfileSocial5, "$onBottomSheetProfileSocial");
                        Intrinsics.m32179h(dialog4, "$dialog");
                        new Common().m16300e(this$04, "https://tiktok.com/@" + onBottomSheetProfileSocial5.f30180d);
                        dialog4.cancel();
                        break;
                    default:
                        MainActivity this$05 = this.f27506c;
                        OnBottomSheetProfileSocial onBottomSheetProfileSocial6 = onBottomSheetProfileSocial;
                        BottomSheetDialog dialog5 = bottomSheetDialog2;
                        KProperty<Object>[] kPropertyArr5 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$05, "this$0");
                        Intrinsics.m32179h(onBottomSheetProfileSocial6, "$onBottomSheetProfileSocial");
                        Intrinsics.m32179h(dialog5, "$dialog");
                        Object systemService = this$05.getSystemService("clipboard");
                        Intrinsics.m32177f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("data", onBottomSheetProfileSocial6.f30181e));
                        Dialogs.f30143a.m16307f(this$05, "Имя пользователя Discord скопировано " + onBottomSheetProfileSocial6.f30181e);
                        dialog5.cancel();
                        break;
                }
            }
        });
        final int i42 = 2;
        ((LinearLayout) inflate2.findViewById(C2507R.id.socialInstagram)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.activity.g

            /* renamed from: c */
            public final /* synthetic */ MainActivity f27506c;

            {
                this.f27506c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i42) {
                    case 0:
                        MainActivity this$0 = this.f27506c;
                        OnBottomSheetProfileSocial onBottomSheetProfileSocial2 = onBottomSheetProfileSocial;
                        BottomSheetDialog dialog = bottomSheetDialog2;
                        KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                        Intrinsics.m32179h(this$0, "this$0");
                        Intrinsics.m32179h(onBottomSheetProfileSocial2, "$onBottomSheetProfileSocial");
                        Intrinsics.m32179h(dialog, "$dialog");
                        new Common().m16300e(this$0, "https://vk.com/" + onBottomSheetProfileSocial2.f30177a);
                        dialog.cancel();
                        break;
                    case 1:
                        MainActivity this$02 = this.f27506c;
                        OnBottomSheetProfileSocial onBottomSheetProfileSocial3 = onBottomSheetProfileSocial;
                        BottomSheetDialog dialog2 = bottomSheetDialog2;
                        KProperty<Object>[] kPropertyArr2 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$02, "this$0");
                        Intrinsics.m32179h(onBottomSheetProfileSocial3, "$onBottomSheetProfileSocial");
                        Intrinsics.m32179h(dialog2, "$dialog");
                        new Common().m16300e(this$02, "https://t.me/" + onBottomSheetProfileSocial3.f30178b);
                        dialog2.cancel();
                        break;
                    case 2:
                        MainActivity this$03 = this.f27506c;
                        OnBottomSheetProfileSocial onBottomSheetProfileSocial4 = onBottomSheetProfileSocial;
                        BottomSheetDialog dialog3 = bottomSheetDialog2;
                        KProperty<Object>[] kPropertyArr3 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$03, "this$0");
                        Intrinsics.m32179h(onBottomSheetProfileSocial4, "$onBottomSheetProfileSocial");
                        Intrinsics.m32179h(dialog3, "$dialog");
                        new Common().m16300e(this$03, "https://instagram.com/" + onBottomSheetProfileSocial4.f30179c);
                        dialog3.cancel();
                        break;
                    case 3:
                        MainActivity this$04 = this.f27506c;
                        OnBottomSheetProfileSocial onBottomSheetProfileSocial5 = onBottomSheetProfileSocial;
                        BottomSheetDialog dialog4 = bottomSheetDialog2;
                        KProperty<Object>[] kPropertyArr4 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$04, "this$0");
                        Intrinsics.m32179h(onBottomSheetProfileSocial5, "$onBottomSheetProfileSocial");
                        Intrinsics.m32179h(dialog4, "$dialog");
                        new Common().m16300e(this$04, "https://tiktok.com/@" + onBottomSheetProfileSocial5.f30180d);
                        dialog4.cancel();
                        break;
                    default:
                        MainActivity this$05 = this.f27506c;
                        OnBottomSheetProfileSocial onBottomSheetProfileSocial6 = onBottomSheetProfileSocial;
                        BottomSheetDialog dialog5 = bottomSheetDialog2;
                        KProperty<Object>[] kPropertyArr5 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$05, "this$0");
                        Intrinsics.m32179h(onBottomSheetProfileSocial6, "$onBottomSheetProfileSocial");
                        Intrinsics.m32179h(dialog5, "$dialog");
                        Object systemService = this$05.getSystemService("clipboard");
                        Intrinsics.m32177f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("data", onBottomSheetProfileSocial6.f30181e));
                        Dialogs.f30143a.m16307f(this$05, "Имя пользователя Discord скопировано " + onBottomSheetProfileSocial6.f30181e);
                        dialog5.cancel();
                        break;
                }
            }
        });
        final int i52 = 3;
        ((LinearLayout) inflate2.findViewById(C2507R.id.socialTiktok)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.activity.g

            /* renamed from: c */
            public final /* synthetic */ MainActivity f27506c;

            {
                this.f27506c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i52) {
                    case 0:
                        MainActivity this$0 = this.f27506c;
                        OnBottomSheetProfileSocial onBottomSheetProfileSocial2 = onBottomSheetProfileSocial;
                        BottomSheetDialog dialog = bottomSheetDialog2;
                        KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                        Intrinsics.m32179h(this$0, "this$0");
                        Intrinsics.m32179h(onBottomSheetProfileSocial2, "$onBottomSheetProfileSocial");
                        Intrinsics.m32179h(dialog, "$dialog");
                        new Common().m16300e(this$0, "https://vk.com/" + onBottomSheetProfileSocial2.f30177a);
                        dialog.cancel();
                        break;
                    case 1:
                        MainActivity this$02 = this.f27506c;
                        OnBottomSheetProfileSocial onBottomSheetProfileSocial3 = onBottomSheetProfileSocial;
                        BottomSheetDialog dialog2 = bottomSheetDialog2;
                        KProperty<Object>[] kPropertyArr2 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$02, "this$0");
                        Intrinsics.m32179h(onBottomSheetProfileSocial3, "$onBottomSheetProfileSocial");
                        Intrinsics.m32179h(dialog2, "$dialog");
                        new Common().m16300e(this$02, "https://t.me/" + onBottomSheetProfileSocial3.f30178b);
                        dialog2.cancel();
                        break;
                    case 2:
                        MainActivity this$03 = this.f27506c;
                        OnBottomSheetProfileSocial onBottomSheetProfileSocial4 = onBottomSheetProfileSocial;
                        BottomSheetDialog dialog3 = bottomSheetDialog2;
                        KProperty<Object>[] kPropertyArr3 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$03, "this$0");
                        Intrinsics.m32179h(onBottomSheetProfileSocial4, "$onBottomSheetProfileSocial");
                        Intrinsics.m32179h(dialog3, "$dialog");
                        new Common().m16300e(this$03, "https://instagram.com/" + onBottomSheetProfileSocial4.f30179c);
                        dialog3.cancel();
                        break;
                    case 3:
                        MainActivity this$04 = this.f27506c;
                        OnBottomSheetProfileSocial onBottomSheetProfileSocial5 = onBottomSheetProfileSocial;
                        BottomSheetDialog dialog4 = bottomSheetDialog2;
                        KProperty<Object>[] kPropertyArr4 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$04, "this$0");
                        Intrinsics.m32179h(onBottomSheetProfileSocial5, "$onBottomSheetProfileSocial");
                        Intrinsics.m32179h(dialog4, "$dialog");
                        new Common().m16300e(this$04, "https://tiktok.com/@" + onBottomSheetProfileSocial5.f30180d);
                        dialog4.cancel();
                        break;
                    default:
                        MainActivity this$05 = this.f27506c;
                        OnBottomSheetProfileSocial onBottomSheetProfileSocial6 = onBottomSheetProfileSocial;
                        BottomSheetDialog dialog5 = bottomSheetDialog2;
                        KProperty<Object>[] kPropertyArr5 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$05, "this$0");
                        Intrinsics.m32179h(onBottomSheetProfileSocial6, "$onBottomSheetProfileSocial");
                        Intrinsics.m32179h(dialog5, "$dialog");
                        Object systemService = this$05.getSystemService("clipboard");
                        Intrinsics.m32177f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("data", onBottomSheetProfileSocial6.f30181e));
                        Dialogs.f30143a.m16307f(this$05, "Имя пользователя Discord скопировано " + onBottomSheetProfileSocial6.f30181e);
                        dialog5.cancel();
                        break;
                }
            }
        });
        final int i62 = 4;
        ((LinearLayout) inflate2.findViewById(C2507R.id.socialDiscord)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.activity.g

            /* renamed from: c */
            public final /* synthetic */ MainActivity f27506c;

            {
                this.f27506c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i62) {
                    case 0:
                        MainActivity this$0 = this.f27506c;
                        OnBottomSheetProfileSocial onBottomSheetProfileSocial2 = onBottomSheetProfileSocial;
                        BottomSheetDialog dialog = bottomSheetDialog2;
                        KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                        Intrinsics.m32179h(this$0, "this$0");
                        Intrinsics.m32179h(onBottomSheetProfileSocial2, "$onBottomSheetProfileSocial");
                        Intrinsics.m32179h(dialog, "$dialog");
                        new Common().m16300e(this$0, "https://vk.com/" + onBottomSheetProfileSocial2.f30177a);
                        dialog.cancel();
                        break;
                    case 1:
                        MainActivity this$02 = this.f27506c;
                        OnBottomSheetProfileSocial onBottomSheetProfileSocial3 = onBottomSheetProfileSocial;
                        BottomSheetDialog dialog2 = bottomSheetDialog2;
                        KProperty<Object>[] kPropertyArr2 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$02, "this$0");
                        Intrinsics.m32179h(onBottomSheetProfileSocial3, "$onBottomSheetProfileSocial");
                        Intrinsics.m32179h(dialog2, "$dialog");
                        new Common().m16300e(this$02, "https://t.me/" + onBottomSheetProfileSocial3.f30178b);
                        dialog2.cancel();
                        break;
                    case 2:
                        MainActivity this$03 = this.f27506c;
                        OnBottomSheetProfileSocial onBottomSheetProfileSocial4 = onBottomSheetProfileSocial;
                        BottomSheetDialog dialog3 = bottomSheetDialog2;
                        KProperty<Object>[] kPropertyArr3 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$03, "this$0");
                        Intrinsics.m32179h(onBottomSheetProfileSocial4, "$onBottomSheetProfileSocial");
                        Intrinsics.m32179h(dialog3, "$dialog");
                        new Common().m16300e(this$03, "https://instagram.com/" + onBottomSheetProfileSocial4.f30179c);
                        dialog3.cancel();
                        break;
                    case 3:
                        MainActivity this$04 = this.f27506c;
                        OnBottomSheetProfileSocial onBottomSheetProfileSocial5 = onBottomSheetProfileSocial;
                        BottomSheetDialog dialog4 = bottomSheetDialog2;
                        KProperty<Object>[] kPropertyArr4 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$04, "this$0");
                        Intrinsics.m32179h(onBottomSheetProfileSocial5, "$onBottomSheetProfileSocial");
                        Intrinsics.m32179h(dialog4, "$dialog");
                        new Common().m16300e(this$04, "https://tiktok.com/@" + onBottomSheetProfileSocial5.f30180d);
                        dialog4.cancel();
                        break;
                    default:
                        MainActivity this$05 = this.f27506c;
                        OnBottomSheetProfileSocial onBottomSheetProfileSocial6 = onBottomSheetProfileSocial;
                        BottomSheetDialog dialog5 = bottomSheetDialog2;
                        KProperty<Object>[] kPropertyArr5 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$05, "this$0");
                        Intrinsics.m32179h(onBottomSheetProfileSocial6, "$onBottomSheetProfileSocial");
                        Intrinsics.m32179h(dialog5, "$dialog");
                        Object systemService = this$05.getSystemService("clipboard");
                        Intrinsics.m32177f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("data", onBottomSheetProfileSocial6.f30181e));
                        Dialogs.f30143a.m16307f(this$05, "Имя пользователя Discord скопировано " + onBottomSheetProfileSocial6.f30181e);
                        dialog5.cancel();
                        break;
                }
            }
        });
        ((MaterialButton) inflate2.findViewById(C2507R.id.close)).setOnClickListener(new ViewOnClickListenerC2629e(bottomSheetDialog2, i3));
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onBottomSheetReleaseVideo(@NotNull final OnBottomSheetReleaseVideo onBottomSheetReleaseVideo) {
        Intrinsics.m32179h(onBottomSheetReleaseVideo, "onBottomSheetReleaseVideo");
        View inflate = getLayoutInflater().inflate(C2507R.layout.bottom_sheet_release_video, (ViewGroup) null);
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(inflate);
        bottomSheetDialog.show();
        TextView textView = (TextView) inflate.findViewById(C2507R.id.release_video_title);
        String title = onBottomSheetReleaseVideo.f30182a.getTitle();
        final int i2 = 0;
        final int i3 = 1;
        textView.setText(!(title == null || title.length() == 0) ? onBottomSheetReleaseVideo.f30182a.getTitle() : inflate.getContext().getString(C2507R.string.unnamed));
        ((TextView) inflate.findViewById(C2507R.id.release_video_nickname)).setText(onBottomSheetReleaseVideo.f30182a.getProfile().getLogin());
        TextView textView2 = (TextView) inflate.findViewById(C2507R.id.release_video_timestamp);
        Time time = Time.f30247a;
        Context context = inflate.getContext();
        Intrinsics.m32178g(context, "view.context");
        textView2.setText(time.m16361g(context, onBottomSheetReleaseVideo.f30182a.getTimestamp()));
        ((TextView) inflate.findViewById(C2507R.id.release_title)).setText(onBottomSheetReleaseVideo.f30182a.getRelease().getTitleRu());
        TextView textView3 = (TextView) inflate.findViewById(C2507R.id.release_video_category);
        ReleaseVideoCategory category = onBottomSheetReleaseVideo.f30182a.getCategory();
        textView3.setText(category != null ? category.getName() : null);
        TextView textView4 = (TextView) inflate.findViewById(C2507R.id.release_title);
        Intrinsics.m32178g(textView4, "view.release_title");
        String titleRu = onBottomSheetReleaseVideo.f30182a.getRelease().getTitleRu();
        ViewsKt.m16373f(textView4, titleRu == null || titleRu.length() == 0, false, null, 6);
        TextView textView5 = (TextView) inflate.findViewById(C2507R.id.release_video_timestamp);
        Intrinsics.m32178g(textView5, "view.release_video_timestamp");
        ViewsKt.m16379l(textView5, onBottomSheetReleaseVideo.f30182a.getTimestamp() > 0);
        TextView textView6 = (TextView) inflate.findViewById(C2507R.id.release_video_dot);
        Intrinsics.m32178g(textView6, "view.release_video_dot");
        ViewsKt.m16379l(textView6, onBottomSheetReleaseVideo.f30182a.getTimestamp() > 0);
        if (onBottomSheetReleaseVideo.f30182a.getIsFavorite()) {
            ((LinearLayout) inflate.findViewById(C2507R.id.release_video_remove_from_favorite)).setVisibility(0);
        } else {
            ((LinearLayout) inflate.findViewById(C2507R.id.release_video_add_to_favorite)).setVisibility(0);
        }
        ((LinearLayout) inflate.findViewById(C2507R.id.release_video_add_to_favorite)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.activity.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        OnBottomSheetReleaseVideo onBottomSheetReleaseVideo2 = onBottomSheetReleaseVideo;
                        BottomSheetDialog dialog = bottomSheetDialog;
                        KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                        Intrinsics.m32179h(onBottomSheetReleaseVideo2, "$onBottomSheetReleaseVideo");
                        Intrinsics.m32179h(dialog, "$dialog");
                        EventBusKt.m16327a(new OnReleaseVideoAddFavorite(onBottomSheetReleaseVideo2.f30182a));
                        dialog.cancel();
                        break;
                    default:
                        OnBottomSheetReleaseVideo onBottomSheetReleaseVideo3 = onBottomSheetReleaseVideo;
                        BottomSheetDialog dialog2 = bottomSheetDialog;
                        KProperty<Object>[] kPropertyArr2 = MainActivity.f27425n;
                        Intrinsics.m32179h(onBottomSheetReleaseVideo3, "$onBottomSheetReleaseVideo");
                        Intrinsics.m32179h(dialog2, "$dialog");
                        EventBusKt.m16327a(new OnReleaseVideoDeleteFavorite(onBottomSheetReleaseVideo3.f30182a));
                        dialog2.cancel();
                        break;
                }
            }
        });
        ((LinearLayout) inflate.findViewById(C2507R.id.release_video_remove_from_favorite)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.activity.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        OnBottomSheetReleaseVideo onBottomSheetReleaseVideo2 = onBottomSheetReleaseVideo;
                        BottomSheetDialog dialog = bottomSheetDialog;
                        KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                        Intrinsics.m32179h(onBottomSheetReleaseVideo2, "$onBottomSheetReleaseVideo");
                        Intrinsics.m32179h(dialog, "$dialog");
                        EventBusKt.m16327a(new OnReleaseVideoAddFavorite(onBottomSheetReleaseVideo2.f30182a));
                        dialog.cancel();
                        break;
                    default:
                        OnBottomSheetReleaseVideo onBottomSheetReleaseVideo3 = onBottomSheetReleaseVideo;
                        BottomSheetDialog dialog2 = bottomSheetDialog;
                        KProperty<Object>[] kPropertyArr2 = MainActivity.f27425n;
                        Intrinsics.m32179h(onBottomSheetReleaseVideo3, "$onBottomSheetReleaseVideo");
                        Intrinsics.m32179h(dialog2, "$dialog");
                        EventBusKt.m16327a(new OnReleaseVideoDeleteFavorite(onBottomSheetReleaseVideo3.f30182a));
                        dialog2.cancel();
                        break;
                }
            }
        });
        ((LinearLayout) inflate.findViewById(C2507R.id.release_video_open_release)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.activity.h

            /* renamed from: c */
            public final /* synthetic */ MainActivity f27510c;

            {
                this.f27510c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        MainActivity this$0 = this.f27510c;
                        OnBottomSheetReleaseVideo onBottomSheetReleaseVideo2 = onBottomSheetReleaseVideo;
                        BottomSheetDialog dialog = bottomSheetDialog;
                        KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                        Intrinsics.m32179h(this$0, "this$0");
                        Intrinsics.m32179h(onBottomSheetReleaseVideo2, "$onBottomSheetReleaseVideo");
                        Intrinsics.m32179h(dialog, "$dialog");
                        FragNavController.m13813l(this$0.f27431g, ReleaseFragment.f28714t.m15625a(onBottomSheetReleaseVideo2.f30182a.getRelease().getId()), null, 2);
                        dialog.cancel();
                        break;
                    case 1:
                        MainActivity this$02 = this.f27510c;
                        OnBottomSheetReleaseVideo onBottomSheetReleaseVideo3 = onBottomSheetReleaseVideo;
                        BottomSheetDialog dialog2 = bottomSheetDialog;
                        KProperty<Object>[] kPropertyArr2 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$02, "this$0");
                        Intrinsics.m32179h(onBottomSheetReleaseVideo3, "$onBottomSheetReleaseVideo");
                        Intrinsics.m32179h(dialog2, "$dialog");
                        this$02.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(onBottomSheetReleaseVideo3.f30182a.getUrl())));
                        dialog2.cancel();
                        break;
                    default:
                        MainActivity this$03 = this.f27510c;
                        OnBottomSheetReleaseVideo onBottomSheetReleaseVideo4 = onBottomSheetReleaseVideo;
                        BottomSheetDialog dialog3 = bottomSheetDialog;
                        KProperty<Object>[] kPropertyArr3 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$03, "this$0");
                        Intrinsics.m32179h(onBottomSheetReleaseVideo4, "$onBottomSheetReleaseVideo");
                        Intrinsics.m32179h(dialog3, "$dialog");
                        Object systemService = this$03.getSystemService("clipboard");
                        Intrinsics.m32177f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("data", onBottomSheetReleaseVideo4.f30182a.getUrl()));
                        Dialogs dialogs = Dialogs.f30143a;
                        String string = this$03.getString(C2507R.string.copied);
                        Intrinsics.m32178g(string, "getString(R.string.copied)");
                        dialogs.m16307f(this$03, string);
                        dialog3.cancel();
                        break;
                }
            }
        });
        ((LinearLayout) inflate.findViewById(C2507R.id.release_video_open_link)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.activity.h

            /* renamed from: c */
            public final /* synthetic */ MainActivity f27510c;

            {
                this.f27510c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        MainActivity this$0 = this.f27510c;
                        OnBottomSheetReleaseVideo onBottomSheetReleaseVideo2 = onBottomSheetReleaseVideo;
                        BottomSheetDialog dialog = bottomSheetDialog;
                        KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                        Intrinsics.m32179h(this$0, "this$0");
                        Intrinsics.m32179h(onBottomSheetReleaseVideo2, "$onBottomSheetReleaseVideo");
                        Intrinsics.m32179h(dialog, "$dialog");
                        FragNavController.m13813l(this$0.f27431g, ReleaseFragment.f28714t.m15625a(onBottomSheetReleaseVideo2.f30182a.getRelease().getId()), null, 2);
                        dialog.cancel();
                        break;
                    case 1:
                        MainActivity this$02 = this.f27510c;
                        OnBottomSheetReleaseVideo onBottomSheetReleaseVideo3 = onBottomSheetReleaseVideo;
                        BottomSheetDialog dialog2 = bottomSheetDialog;
                        KProperty<Object>[] kPropertyArr2 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$02, "this$0");
                        Intrinsics.m32179h(onBottomSheetReleaseVideo3, "$onBottomSheetReleaseVideo");
                        Intrinsics.m32179h(dialog2, "$dialog");
                        this$02.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(onBottomSheetReleaseVideo3.f30182a.getUrl())));
                        dialog2.cancel();
                        break;
                    default:
                        MainActivity this$03 = this.f27510c;
                        OnBottomSheetReleaseVideo onBottomSheetReleaseVideo4 = onBottomSheetReleaseVideo;
                        BottomSheetDialog dialog3 = bottomSheetDialog;
                        KProperty<Object>[] kPropertyArr3 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$03, "this$0");
                        Intrinsics.m32179h(onBottomSheetReleaseVideo4, "$onBottomSheetReleaseVideo");
                        Intrinsics.m32179h(dialog3, "$dialog");
                        Object systemService = this$03.getSystemService("clipboard");
                        Intrinsics.m32177f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("data", onBottomSheetReleaseVideo4.f30182a.getUrl()));
                        Dialogs dialogs = Dialogs.f30143a;
                        String string = this$03.getString(C2507R.string.copied);
                        Intrinsics.m32178g(string, "getString(R.string.copied)");
                        dialogs.m16307f(this$03, string);
                        dialog3.cancel();
                        break;
                }
            }
        });
        final int i4 = 2;
        ((LinearLayout) inflate.findViewById(C2507R.id.release_video_copy_link)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.activity.h

            /* renamed from: c */
            public final /* synthetic */ MainActivity f27510c;

            {
                this.f27510c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        MainActivity this$0 = this.f27510c;
                        OnBottomSheetReleaseVideo onBottomSheetReleaseVideo2 = onBottomSheetReleaseVideo;
                        BottomSheetDialog dialog = bottomSheetDialog;
                        KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                        Intrinsics.m32179h(this$0, "this$0");
                        Intrinsics.m32179h(onBottomSheetReleaseVideo2, "$onBottomSheetReleaseVideo");
                        Intrinsics.m32179h(dialog, "$dialog");
                        FragNavController.m13813l(this$0.f27431g, ReleaseFragment.f28714t.m15625a(onBottomSheetReleaseVideo2.f30182a.getRelease().getId()), null, 2);
                        dialog.cancel();
                        break;
                    case 1:
                        MainActivity this$02 = this.f27510c;
                        OnBottomSheetReleaseVideo onBottomSheetReleaseVideo3 = onBottomSheetReleaseVideo;
                        BottomSheetDialog dialog2 = bottomSheetDialog;
                        KProperty<Object>[] kPropertyArr2 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$02, "this$0");
                        Intrinsics.m32179h(onBottomSheetReleaseVideo3, "$onBottomSheetReleaseVideo");
                        Intrinsics.m32179h(dialog2, "$dialog");
                        this$02.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(onBottomSheetReleaseVideo3.f30182a.getUrl())));
                        dialog2.cancel();
                        break;
                    default:
                        MainActivity this$03 = this.f27510c;
                        OnBottomSheetReleaseVideo onBottomSheetReleaseVideo4 = onBottomSheetReleaseVideo;
                        BottomSheetDialog dialog3 = bottomSheetDialog;
                        KProperty<Object>[] kPropertyArr3 = MainActivity.f27425n;
                        Intrinsics.m32179h(this$03, "this$0");
                        Intrinsics.m32179h(onBottomSheetReleaseVideo4, "$onBottomSheetReleaseVideo");
                        Intrinsics.m32179h(dialog3, "$dialog");
                        Object systemService = this$03.getSystemService("clipboard");
                        Intrinsics.m32177f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("data", onBottomSheetReleaseVideo4.f30182a.getUrl()));
                        Dialogs dialogs = Dialogs.f30143a;
                        String string = this$03.getString(C2507R.string.copied);
                        Intrinsics.m32178g(string, "getString(R.string.copied)");
                        dialogs.m16307f(this$03, string);
                        dialog3.cancel();
                        break;
                }
            }
        });
        ((MaterialButton) inflate.findViewById(C2507R.id.close)).setOnClickListener(new ViewOnClickListenerC2629e(bottomSheetDialog, i3));
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onCollectionRules(@NotNull OnCollectionRules onCollectionRules) {
        Intrinsics.m32179h(onCollectionRules, "onCollectionRules");
        final View inflate = getLayoutInflater().inflate(C2507R.layout.dialog_webview, (ViewGroup) null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C2507R.style.DialogTheme);
        builder.setView(inflate);
        builder.f413a.f384m = false;
        final androidx.appcompat.app.AlertDialog m378l = builder.m378l();
        ((TextView) inflate.findViewById(C2507R.id.dialog_title)).setText(getString(C2507R.string.rules));
        final WebView webView = (WebView) inflate.findViewById(C2507R.id.webView);
        webView.setWebViewClient(new WebViewClient() { // from class: com.swiftsoft.anixartd.ui.activity.MainActivity$onCollectionRules$1$1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(@NotNull WebView v, @Nullable String str) {
                Intrinsics.m32179h(v, "v");
                ProgressBar progressBar = (ProgressBar) inflate.findViewById(C2507R.id.progress_bar);
                Intrinsics.m32178g(progressBar, "view.progress_bar");
                ViewsKt.m16372e(progressBar);
                ((MaterialButton) inflate.findViewById(C2507R.id.negative_button)).setText(webView.getResources().getString(C2507R.string.understand));
                super.onPageFinished(v, str);
            }
        });
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setMixedContentMode(0);
        settings.setAllowFileAccess(true);
        StringBuilder sb = new StringBuilder();
        sb.append(new Common().m16297b("https://anixart.tv", m15333u4().f25957i.m14082y()));
        sb.append("/rules/collection?dark=");
        Common common = new Common();
        Context context = webView.getContext();
        Intrinsics.m32178g(context, "context");
        sb.append(common.m16299d(context));
        webView.loadUrl(sb.toString());
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.negative_button);
        Intrinsics.m32178g(materialButton, "view.negative_button");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.MainActivity$onCollectionRules$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                androidx.appcompat.app.AlertDialog.this.dismiss();
                return Unit.f63088a;
            }
        });
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onCommentingRules(@NotNull OnCommentingRules onCommentingRules) {
        Intrinsics.m32179h(onCommentingRules, "onCommentingRules");
        final View inflate = getLayoutInflater().inflate(C2507R.layout.dialog_webview, (ViewGroup) null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C2507R.style.DialogTheme);
        builder.setView(inflate);
        builder.f413a.f384m = false;
        final androidx.appcompat.app.AlertDialog m378l = builder.m378l();
        ((TextView) inflate.findViewById(C2507R.id.dialog_title)).setText(getString(C2507R.string.rules));
        final WebView webView = (WebView) inflate.findViewById(C2507R.id.webView);
        webView.setWebViewClient(new WebViewClient() { // from class: com.swiftsoft.anixartd.ui.activity.MainActivity$onCommentingRules$1$1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(@NotNull WebView v, @Nullable String str) {
                Intrinsics.m32179h(v, "v");
                ProgressBar progressBar = (ProgressBar) inflate.findViewById(C2507R.id.progress_bar);
                Intrinsics.m32178g(progressBar, "view.progress_bar");
                ViewsKt.m16372e(progressBar);
                ((MaterialButton) inflate.findViewById(C2507R.id.negative_button)).setText(webView.getResources().getString(C2507R.string.understand));
                super.onPageFinished(v, str);
            }
        });
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setMixedContentMode(0);
        settings.setAllowFileAccess(true);
        StringBuilder sb = new StringBuilder();
        sb.append(new Common().m16297b("https://anixart.tv", m15333u4().f25957i.m14082y()));
        sb.append("/rules/commenting?dark=");
        Common common = new Common();
        Context context = webView.getContext();
        Intrinsics.m32178g(context, "context");
        sb.append(common.m16299d(context));
        webView.loadUrl(sb.toString());
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.negative_button);
        Intrinsics.m32178g(materialButton, "view.negative_button");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.MainActivity$onCommentingRules$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                androidx.appcompat.app.AlertDialog.this.dismiss();
                return Unit.f63088a;
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // moxy.MvpAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.p015ui.activity.MainActivity.onCreate(android.os.Bundle):void");
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onDeleteFavorite(@NotNull OnDeleteFavorite onDeleteFavorite) {
        Intrinsics.m32179h(onDeleteFavorite, "onDeleteFavorite");
        Snackbar.m10377j(findViewById(C2507R.id.container), "Удалено из Избранного", 0).m10380l();
        m15333u4().m14317f(onDeleteFavorite.f30183a);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onDeleteFavoriteCollection(@NotNull OnDeleteFavoriteCollection onDeleteFavoriteCollection) {
        Intrinsics.m32179h(onDeleteFavoriteCollection, "onDeleteFavoriteCollection");
        Snackbar.m10377j(findViewById(C2507R.id.container), getString(C2507R.string.collection_favorite_deleted), 0).m10380l();
        m15333u4().m14318g(onDeleteFavoriteCollection.f30184a);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onDeleteHistory(@NotNull OnDeleteHistory onDeleteHistory) {
        Intrinsics.m32179h(onDeleteHistory, "onDeleteHistory");
        Snackbar.m10377j(findViewById(C2507R.id.container), "Удалено из истории просмотра", 0).m10380l();
        m15333u4().m14319h(onDeleteHistory.f30185a);
    }

    @Override // moxy.MvpAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBusKt.m16329c(this);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onDonate(@NotNull OnDonate onDonate) {
        Intrinsics.m32179h(onDonate, "onDonate");
        Common common = new Common();
        StringBuilder sb = new StringBuilder();
        sb.append(new Common().m16297b("https://anixart.tv", m15333u4().f25957i.m14082y()));
        sb.append("/donate?login=");
        String login = m15333u4().f25950b.f27327c.getLogin();
        if (login == null) {
            login = "Гость";
        }
        sb.append(URLEncoder.encode(login, "UTF-8"));
        sb.append("&dark=");
        sb.append(new Common().m16299d(this));
        sb.append("&vc=24111318");
        common.m16300e(this, sb.toString());
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchProfileAvatar(@NotNull OnFetchProfileAvatar onFetchProfileAvatar) {
        Intrinsics.m32179h(onFetchProfileAvatar, "onFetchProfileAvatar");
        m15333u4().f25957i.m14061d();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFilter(@NotNull OnFilter onFilter) {
        Intrinsics.m32179h(onFilter, "onFilter");
        FragNavController.m13813l(this.f27431g, new FilterFragment(), null, 2);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onGlobalSearchByAuthor(@NotNull OnGlobalSearchByAuthor onGlobalSearchByAuthor) {
        Intrinsics.m32179h(onGlobalSearchByAuthor, "onGlobalSearchByAuthor");
        FragNavController.m13813l(this.f27431g, SearchFragment.Companion.m15651a(SearchFragment.f28894p, onGlobalSearchByAuthor.f30209a, 3, "TAB_HOME", "INNER_TAB_NONE", null, null, null, null, 240), null, 2);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onGlobalSearchByDirector(@NotNull OnGlobalSearchByDirector onGlobalSearchByDirector) {
        Intrinsics.m32179h(onGlobalSearchByDirector, "onGlobalSearchByDirector");
        FragNavController.m13813l(this.f27431g, SearchFragment.Companion.m15651a(SearchFragment.f28894p, onGlobalSearchByDirector.f30210a, 2, "TAB_HOME", "INNER_TAB_NONE", null, null, null, null, 240), null, 2);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onGlobalSearchByGenre(@NotNull OnGlobalSearchByGenre onGlobalSearchByGenre) {
        Intrinsics.m32179h(onGlobalSearchByGenre, "onGlobalSearchByGenre");
        FragNavController.m13813l(this.f27431g, SearchFragment.Companion.m15651a(SearchFragment.f28894p, onGlobalSearchByGenre.f30211a, 4, "TAB_HOME", "INNER_TAB_NONE", null, null, null, null, 240), null, 2);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onGlobalSearchByStudio(@NotNull OnGlobalSearchByStudio onGlobalSearchByStudio) {
        Intrinsics.m32179h(onGlobalSearchByStudio, "onGlobalSearchByStudio");
        FragNavController.m13813l(this.f27431g, SearchFragment.Companion.m15651a(SearchFragment.f28894p, onGlobalSearchByStudio.f30212a, 1, "TAB_HOME", "INNER_TAB_NONE", null, null, null, null, 240), null, 2);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onGoogleBind(@NotNull OnGoogleBind onGoogleBind) {
        Intrinsics.m32179h(onGoogleBind, "onGoogleBind");
        GoogleSignInClient googleSignInClient = this.f27433i;
        if (googleSignInClient != null) {
            startActivityForResult(googleSignInClient.m7855e(), 9001);
        } else {
            Intrinsics.m32189r("googleSignInClient");
            throw null;
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onGoogleUnbind(@NotNull OnGoogleUnbind onGoogleUnbind) {
        Intrinsics.m32179h(onGoogleUnbind, "onGoogleUnbind");
        m15333u4().m14321j();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onInnerTab(@NotNull OnInnerTab onInnerTab) {
        Intrinsics.m32179h(onInnerTab, "onInnerTab");
        MainUiLogic mainUiLogic = m15333u4().f25958j;
        String str = onInnerTab.f30213a;
        Objects.requireNonNull(mainUiLogic);
        Intrinsics.m32179h(str, "<set-?>");
        mainUiLogic.f28958c = str;
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onKillActivity(@NotNull OnKillActivity onKillActivity) {
        Intrinsics.m32179h(onKillActivity, "onKillActivity");
        finish();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onLogOut(@NotNull OnLogOut onLogOut) {
        Intrinsics.m32179h(onLogOut, "onLogOut");
        FirebaseAuth.getInstance().m12235b();
        m15333u4().m14332u();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onNotification(@NotNull OnNotification onNotification) {
        Intrinsics.m32179h(onNotification, "onNotification");
        m15333u4().m14322k();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onNotificationsRead(@NotNull OnNotificationsRead onNotificationsRead) {
        Intrinsics.m32179h(onNotificationsRead, "onNotificationsRead");
        m15333u4().m14323l();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onOpenNotifications(@NotNull OnOpenNotifications onOpenNotifications) {
        Intrinsics.m32179h(onOpenNotifications, "onOpenNotifications");
        if (m15333u4().m14312a()) {
            Dialogs.f30143a.m16304a(this);
        } else {
            FragNavController.m13813l(this.f27431g, new NotificationsFragment(), null, 2);
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onOpenPreferences(@NotNull OnOpenPreferences onOpenPreferences) {
        Intrinsics.m32179h(onOpenPreferences, "onOpenPreferences");
        FragNavController.m13813l(this.f27431g, new MainPreferenceFragment(), null, 2);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onPageNoConnection(@NotNull OnPageNoConnection onPageNoConnection) {
        Intrinsics.m32179h(onPageNoConnection, "onPageNoConnection");
        final View inflate = getLayoutInflater().inflate(C2507R.layout.dialog_webview, (ViewGroup) null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C2507R.style.DialogTheme);
        builder.setView(inflate);
        final androidx.appcompat.app.AlertDialog m378l = builder.m378l();
        ((TextView) inflate.findViewById(C2507R.id.dialog_title)).setText(getString(C2507R.string.help));
        final WebView webView = (WebView) inflate.findViewById(C2507R.id.webView);
        webView.setBackgroundColor(0);
        webView.setWebViewClient(new WebViewClient() { // from class: com.swiftsoft.anixartd.ui.activity.MainActivity$onPageNoConnection$1$1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(@NotNull WebView v, @Nullable String str) {
                Intrinsics.m32179h(v, "v");
                ProgressBar progressBar = (ProgressBar) inflate.findViewById(C2507R.id.progress_bar);
                Intrinsics.m32178g(progressBar, "view.progress_bar");
                ViewsKt.m16372e(progressBar);
                ((MaterialButton) inflate.findViewById(C2507R.id.negative_button)).setText(webView.getResources().getString(C2507R.string.understand));
                super.onPageFinished(v, str);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(@NotNull WebView v, @NotNull WebResourceRequest request, @NotNull WebResourceError error) {
                Intrinsics.m32179h(v, "v");
                Intrinsics.m32179h(request, "request");
                Intrinsics.m32179h(error, "error");
                WebView webView2 = (WebView) webView.findViewById(C2507R.id.webView);
                StringBuilder m24u = C0000a.m24u("file:///android_asset/no_connection.html?dark=");
                Common common = new Common();
                Context context = webView.getContext();
                Intrinsics.m32178g(context, "context");
                m24u.append(common.m16299d(context));
                webView2.loadUrl(m24u.toString());
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull String url) {
                Intrinsics.m32179h(view, "view");
                Intrinsics.m32179h(url, "url");
                MainActivity mainActivity = this;
                KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                String string = mainActivity.m15333u4().f25957i.f25344a.getString("PAGE_NO_CONNECTION_URL", "https://anixhelper.github.io/pages/no_connection.html");
                if (string == null) {
                    string = "";
                }
                if (StringsKt.m33922t(url, string, false, 2, null)) {
                    view.loadUrl(url);
                    return true;
                }
                this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
                return true;
            }
        });
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setMixedContentMode(0);
        settings.setAllowFileAccess(true);
        settings.setCacheMode(2);
        StringBuilder sb = new StringBuilder();
        String string = m15333u4().f25957i.f25344a.getString("PAGE_NO_CONNECTION_URL", "https://anixhelper.github.io/pages/no_connection.html");
        if (string == null) {
            string = "";
        }
        sb.append(string);
        sb.append("?dark=");
        Common common = new Common();
        Context context = webView.getContext();
        Intrinsics.m32178g(context, "context");
        sb.append(common.m16299d(context));
        webView.loadUrl(sb.toString());
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.negative_button);
        Intrinsics.m32178g(materialButton, "view.negative_button");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.MainActivity$onPageNoConnection$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                androidx.appcompat.app.AlertDialog.this.dismiss();
                return Unit.f63088a;
            }
        });
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onProfileSocial(@NotNull OnProfileSocial onProfileSocial) {
        Intrinsics.m32179h(onProfileSocial, "onProfileSocial");
        m15333u4().m14326o(onProfileSocial.f30216a);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onRefreshAd(@NotNull OnRefreshAd onRefreshAd) {
        Intrinsics.m32179h(onRefreshAd, "onRefreshAd");
        if (m15333u4().f25957i.f25344a.getLong("AD_BANNER_TIME", 0L) < System.currentTimeMillis()) {
            m15333u4().f25957i.f25344a.edit().putLong("AD_BANNER_TIME", (m15333u4().f25957i.f25344a.getLong("AD_BANNER_DELAY", 30L) * 1000) + System.currentTimeMillis()).apply();
            if (m15333u4().m14313b()) {
                return;
            }
            ((BannerAdView) m15331s4(C2507R.id.mAdView)).loadAd(new AdRequest.Builder().build());
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onReleaseDeleteVote(@NotNull OnReleaseDeleteVote onReleaseDeleteVote) {
        Intrinsics.m32179h(onReleaseDeleteVote, "onReleaseDeleteVote");
        m15333u4().m14327p(onReleaseDeleteVote.f30217a);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onReleaseVideoAddFavorite(@NotNull OnReleaseVideoAddFavorite onReleaseVideoAddFavorite) {
        Intrinsics.m32179h(onReleaseVideoAddFavorite, "onReleaseVideoAddFavorite");
        Snackbar.m10377j(findViewById(C2507R.id.container), "Добавлено в свои видео", 0).m10380l();
        m15333u4().m14328q(onReleaseVideoAddFavorite.f30218a);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onReleaseVideoDeleteFavorite(@NotNull OnReleaseVideoDeleteFavorite onReleaseVideoDeleteFavorite) {
        Intrinsics.m32179h(onReleaseVideoDeleteFavorite, "onReleaseVideoDeleteFavorite");
        Snackbar.m10377j(findViewById(C2507R.id.container), "Удалено из своих видео", 0).m10380l();
        m15333u4().m14329r(onReleaseVideoDeleteFavorite.f30219a);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onReleaseVideoRules(@NotNull OnReleaseVideoRules onReleaseVideoRules) {
        Intrinsics.m32179h(onReleaseVideoRules, "onReleaseVideoRules");
        final View inflate = getLayoutInflater().inflate(C2507R.layout.dialog_webview, (ViewGroup) null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C2507R.style.DialogTheme);
        builder.setView(inflate);
        builder.f413a.f384m = false;
        final androidx.appcompat.app.AlertDialog m378l = builder.m378l();
        ((TextView) inflate.findViewById(C2507R.id.dialog_title)).setText(getString(C2507R.string.rules));
        final WebView webView = (WebView) inflate.findViewById(C2507R.id.webView);
        webView.setWebViewClient(new WebViewClient() { // from class: com.swiftsoft.anixartd.ui.activity.MainActivity$onReleaseVideoRules$1$1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(@NotNull WebView v, @Nullable String str) {
                Intrinsics.m32179h(v, "v");
                ProgressBar progressBar = (ProgressBar) inflate.findViewById(C2507R.id.progress_bar);
                Intrinsics.m32178g(progressBar, "view.progress_bar");
                ViewsKt.m16372e(progressBar);
                ((MaterialButton) inflate.findViewById(C2507R.id.negative_button)).setText(webView.getResources().getString(C2507R.string.understand));
                super.onPageFinished(v, str);
            }
        });
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setMixedContentMode(0);
        settings.setAllowFileAccess(true);
        StringBuilder sb = new StringBuilder();
        sb.append(new Common().m16297b("https://anixart.tv", m15333u4().f25957i.m14082y()));
        sb.append("/rules/video?dark=");
        Common common = new Common();
        Context context = webView.getContext();
        Intrinsics.m32178g(context, "context");
        sb.append(common.m16299d(context));
        webView.loadUrl(sb.toString());
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.negative_button);
        Intrinsics.m32178g(materialButton, "view.negative_button");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.MainActivity$onReleaseVideoRules$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                androidx.appcompat.app.AlertDialog.this.dismiss();
                return Unit.f63088a;
            }
        });
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onReleaseVote(@NotNull OnReleaseVote onReleaseVote) {
        Intrinsics.m32179h(onReleaseVote, "onReleaseVote");
        m15333u4().m14330s(onReleaseVote.f30220a, onReleaseVote.f30221b);
    }

    @Override // moxy.MvpAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (m15333u4().f25958j.f28959d == 1) {
            m15332t4().mo10647b().mo10999c(new C2622b(new Function1<AppUpdateInfo, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.MainActivity$onResume$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(AppUpdateInfo appUpdateInfo) {
                    AppUpdateInfo appUpdateInfo2 = appUpdateInfo;
                    if (appUpdateInfo2.f19590a == 3) {
                        MainActivity mainActivity = MainActivity.this;
                        KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                        mainActivity.m15332t4().mo10649d(appUpdateInfo2, 1, MainActivity.this, 10101);
                    }
                    return Unit.f63088a;
                }
            }, 27));
        } else {
            m15332t4().mo10647b().mo10999c(new C2622b(new Function1<AppUpdateInfo, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.MainActivity$onResume$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(AppUpdateInfo appUpdateInfo) {
                    if (appUpdateInfo.f19591b == 11) {
                        MainActivity.this.m15335w4();
                    }
                    return Unit.f63088a;
                }
            }, 28));
        }
    }

    @Override // moxy.MvpAppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        super.onSaveInstanceState(outState);
        this.f27431g.m13823i(outState);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onSearch(@NotNull OnSearch onSearch) {
        Intrinsics.m32179h(onSearch, "onSearch");
        FragNavController.m13813l(this.f27431g, SearchFragment.Companion.m15651a(SearchFragment.f28894p, onSearch.f30222a, 0, m15333u4().f25958j.f28957b, m15333u4().f25958j.f28958c, null, null, null, null, 240), null, 2);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onShowTooltipBookmarks(@NotNull OnShowTooltipBookmarks onShowTooltipBookmarks) {
        Intrinsics.m32179h(onShowTooltipBookmarks, "onShowTooltipBookmarks");
        mo14351o3();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onSnackbar(@NotNull OnSnackbar onSnackbar) {
        Intrinsics.m32179h(onSnackbar, "onSnackbar");
        Snackbar.m10377j(findViewById(C2507R.id.container), onSnackbar.f30228a, 0).m10380l();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onVkBind(@NotNull OnVkBind onVkBind) {
        Intrinsics.m32179h(onVkBind, "onVkBind");
        C2786VK.m16484c(this, CollectionsKt.m32024i(VKScope.EMAIL));
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onVkUnbind(@NotNull OnVkUnbind onVkUnbind) {
        Intrinsics.m32179h(onVkUnbind, "onVkUnbind");
        m15333u4().m14334w();
    }

    @Nullable
    /* renamed from: s4 */
    public View m15331s4(int i2) {
        Map<Integer, View> map = this.f27437m;
        View view = map.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @Override // com.swiftsoft.anixartd.p015ui.fragment.FragmentNavigation
    /* renamed from: t0 */
    public void mo15326t0(int i2) {
        int i3;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) m15331s4(C2507R.id.navigation);
        this.f27432h.mo10203a(bottomNavigationView.getMenu().getItem(i2));
        String str = m15333u4().f25958j.f28957b;
        switch (str.hashCode()) {
            case -1818334861:
                if (str.equals("TAB_DISCOVER")) {
                    i3 = C2507R.id.tab_discover;
                    bottomNavigationView.setSelectedItemId(i3);
                    return;
                }
                break;
            case -1069630785:
                if (str.equals("TAB_PROFILE")) {
                    i3 = C2507R.id.tab_profile;
                    bottomNavigationView.setSelectedItemId(i3);
                    return;
                }
                break;
            case -95141015:
                if (str.equals("TAB_HOME")) {
                    i3 = C2507R.id.tab_home;
                    bottomNavigationView.setSelectedItemId(i3);
                    return;
                }
                break;
            case 1624588691:
                if (str.equals("TAB_BOOKMARKS")) {
                    i3 = C2507R.id.tab_bookmarks;
                    bottomNavigationView.setSelectedItemId(i3);
                    return;
                }
                break;
        }
        StringBuilder m24u = C0000a.m24u("Invalid tab: ");
        m24u.append(m15333u4().f25958j.f28957b);
        throw new Exception(m24u.toString());
    }

    /* renamed from: t4 */
    public final AppUpdateManager m15332t4() {
        return (AppUpdateManager) this.f27426b.getValue();
    }

    @Override // com.ncapdevi.fragnav.FragNavController.RootFragmentListener
    @NotNull
    /* renamed from: u3 */
    public Fragment mo13833u3(int i2) {
        if (i2 == 0) {
            return new HomeFragment();
        }
        if (i2 == 1) {
            return new DiscoverFragment();
        }
        if (i2 == 2) {
            return new BookmarksFragment();
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return new NeedAuthFragment();
            }
            throw new Exception("Need to send an index that we know");
        }
        ProfileFragment.Companion companion = ProfileFragment.f28458k;
        long m14061d = m15333u4().f25957i.m14061d();
        Objects.requireNonNull(companion);
        ProfileFragment profileFragment = new ProfileFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("ID_VALUE", m14061d);
        bundle.putBoolean("FROM_MAIN", true);
        profileFragment.setArguments(bundle);
        return profileFragment;
    }

    /* renamed from: u4 */
    public final MainPresenter m15333u4() {
        return (MainPresenter) this.f27430f.getValue(this, f27425n[0]);
    }

    /* renamed from: v4 */
    public final void m15334v4() {
        ((RelativeLayout) m15331s4(C2507R.id.mAdViewLayout)).getLayoutParams().height = 0;
        BannerAdView mAdView = (BannerAdView) m15331s4(C2507R.id.mAdView);
        Intrinsics.m32178g(mAdView, "mAdView");
        ViewsKt.m16372e(mAdView);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: w0 */
    public void mo14352w0() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.auth_google_login_failed);
        Intrinsics.m32178g(string, "getString(R.string.auth_google_login_failed)");
        dialogs.m16307f(this, string);
    }

    /* renamed from: w4 */
    public final void m15335w4() {
        Snackbar m10377j = Snackbar.m10377j(findViewById(C2507R.id.container), getString(C2507R.string.update_downloaded), -2);
        m10377j.m10379k(getString(C2507R.string.update_install), new ViewOnClickListenerC2630f(this, 0));
        BaseTransientBottomBar.SnackbarBaseLayout view = m10377j.f18817i;
        Intrinsics.m32178g(view, "view");
        ((SnackbarContentLayout) m10377j.f18817i.getChildAt(0)).getMessageView().setTextColor(ViewsKt.m16370c(view, C2507R.attr.primaryTextColor));
        ((SnackbarContentLayout) m10377j.f18817i.getChildAt(0)).getActionView().setTextColor(getResources().getColor(C2507R.color.carmine));
        BaseTransientBottomBar.SnackbarBaseLayout view2 = m10377j.f18817i;
        Intrinsics.m32178g(view2, "view");
        m10377j.f18817i.setBackgroundTintList(ColorStateList.valueOf(ViewsKt.m16370c(view2, C2507R.attr.backgroundColorSecondary)));
        m10377j.m10380l();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: x2 */
    public void mo14353x2() {
        int m16367a = getResources().getConfiguration().orientation == 1 ? Views.f30250a.m16367a(this, -48.0f) : Views.f30250a.m16367a(this, -48.0f);
        Balloon balloon = (Balloon) this.f27435k.getValue();
        BottomNavigationView navigation = (BottomNavigationView) m15331s4(C2507R.id.navigation);
        Intrinsics.m32178g(navigation, "navigation");
        balloon.m13857u(navigation, m16367a, 0);
    }

    @Override // com.swiftsoft.anixartd.ui.dialog.BaseDialogFragment.BaseDialogListener
    /* renamed from: y3 */
    public boolean mo15336y3(@Nullable String str, @NotNull String button, @NotNull Intent intent) {
        Intrinsics.m32179h(button, "button");
        Intrinsics.m32179h(intent, "intent");
        ActivityResultCaller m13819e = this.f27431g.m13819e();
        if (m13819e instanceof BaseDialogFragment.BaseDialogListener) {
            return ((BaseDialogFragment.BaseDialogListener) m13819e).mo15336y3(str, button, intent);
        }
        return false;
    }
}
