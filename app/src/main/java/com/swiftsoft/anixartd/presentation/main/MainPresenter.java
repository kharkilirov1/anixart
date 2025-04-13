package com.swiftsoft.anixartd.presentation.main;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.C2052a;
import com.google.firebase.heartbeatinfo.CallableC2138b;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.messaging.C2161e;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Store;
import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.network.response.FavoritesResponse;
import com.swiftsoft.anixartd.network.response.HistoryResponse;
import com.swiftsoft.anixartd.network.response.ProfileListResponse;
import com.swiftsoft.anixartd.network.response.ProfileResponse;
import com.swiftsoft.anixartd.network.response.TogglesResponse;
import com.swiftsoft.anixartd.network.response.auth.FirebaseResponse;
import com.swiftsoft.anixartd.network.response.collection.FavoriteCollectionAddResponse;
import com.swiftsoft.anixartd.network.response.collection.FavoriteCollectionDeleteResponse;
import com.swiftsoft.anixartd.network.response.notifications.NotificationCountResponse;
import com.swiftsoft.anixartd.network.response.profile.GoogleUnbindResponse;
import com.swiftsoft.anixartd.network.response.profile.ProfileSocialResponse;
import com.swiftsoft.anixartd.network.response.profile.VkBindResponse;
import com.swiftsoft.anixartd.network.response.profile.VkUnbindResponse;
import com.swiftsoft.anixartd.network.response.release.DeleteVoteReleaseResponse;
import com.swiftsoft.anixartd.network.response.release.VoteReleaseResponse;
import com.swiftsoft.anixartd.p015ui.logic.main.MainUiLogic;
import com.swiftsoft.anixartd.presentation.auth.signup.verify.C2552b;
import com.swiftsoft.anixartd.repository.AuthRepository;
import com.swiftsoft.anixartd.repository.CollectionRepository;
import com.swiftsoft.anixartd.repository.ConfigRepository;
import com.swiftsoft.anixartd.repository.MainRepository;
import com.swiftsoft.anixartd.repository.NotificationRepository;
import com.swiftsoft.anixartd.repository.ProfilePreferenceRepository;
import com.swiftsoft.anixartd.repository.ProfileRepository;
import com.swiftsoft.anixartd.repository.ReleaseRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomSheetProfileSocial;
import com.swiftsoft.anixartd.utils.OnFetchCollection;
import com.swiftsoft.anixartd.utils.OnFetchRelease;
import com.swiftsoft.anixartd.utils.OnFetchReleaseVideo;
import com.swiftsoft.anixartd.utils.OnGoogleUnbound;
import com.swiftsoft.anixartd.utils.OnVkBound;
import com.swiftsoft.anixartd.utils.OnVkUnbound;
import com.yandex.div2.C3033a;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.observable.ObservableDefer;
import io.reactivex.internal.operators.observable.ObservableJust;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;

/* compiled from: MainPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/MainPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/MainView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class MainPresenter extends MvpPresenter<MainView> {

    /* renamed from: a */
    @NotNull
    public ConfigRepository f25949a;

    /* renamed from: b */
    @NotNull
    public AuthRepository f25950b;

    /* renamed from: c */
    @NotNull
    public MainRepository f25951c;

    /* renamed from: d */
    @NotNull
    public ReleaseRepository f25952d;

    /* renamed from: e */
    @NotNull
    public ProfileRepository f25953e;

    /* renamed from: f */
    @NotNull
    public ProfilePreferenceRepository f25954f;

    /* renamed from: g */
    @NotNull
    public CollectionRepository f25955g;

    /* renamed from: h */
    @NotNull
    public NotificationRepository f25956h;

    /* renamed from: i */
    @NotNull
    public Prefs f25957i;

    /* renamed from: j */
    @NotNull
    public MainUiLogic f25958j;

    @Inject
    public MainPresenter(@NotNull ConfigRepository configRepository, @NotNull AuthRepository authRepository, @NotNull MainRepository mainRepository, @NotNull ReleaseRepository releaseRepository, @NotNull ProfileRepository profileRepository, @NotNull ProfilePreferenceRepository profilePreferenceRepository, @NotNull CollectionRepository collectionRepository, @NotNull NotificationRepository notificationRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(configRepository, "configRepository");
        Intrinsics.m32179h(authRepository, "authRepository");
        Intrinsics.m32179h(mainRepository, "mainRepository");
        Intrinsics.m32179h(releaseRepository, "releaseRepository");
        Intrinsics.m32179h(profileRepository, "profileRepository");
        Intrinsics.m32179h(profilePreferenceRepository, "profilePreferenceRepository");
        Intrinsics.m32179h(collectionRepository, "collectionRepository");
        Intrinsics.m32179h(notificationRepository, "notificationRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f25949a = configRepository;
        this.f25950b = authRepository;
        this.f25951c = mainRepository;
        this.f25952d = releaseRepository;
        this.f25953e = profileRepository;
        this.f25954f = profilePreferenceRepository;
        this.f25955g = collectionRepository;
        this.f25956h = notificationRepository;
        this.f25957i = prefs;
        this.f25958j = new MainUiLogic();
    }

    /* renamed from: a */
    public final boolean m14312a() {
        return this.f25957i.m14083z();
    }

    /* renamed from: b */
    public final boolean m14313b() {
        return this.f25957i.m14047C();
    }

    /* renamed from: c */
    public final void m14314c(@NotNull final Release release) {
        Intrinsics.m32179h(release, "release");
        MainRepository mainRepository = this.f25951c;
        mainRepository.f27362b.add(release.getId(), mainRepository.f27365e.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2558c(new Function1<FavoritesResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onAddFavorite$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(FavoritesResponse favoritesResponse) {
                if (favoritesResponse.isSuccess()) {
                    Release.this.setFavorite(true);
                    EventBusKt.m16327a(new OnFetchRelease(Release.this));
                }
                return Unit.f63088a;
            }
        }, 15), new C2558c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onAddFavorite$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 16), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: d */
    public final void m14315d(@NotNull final Collection collection) {
        Intrinsics.m32179h(collection, "collection");
        CollectionRepository collectionRepository = this.f25955g;
        collectionRepository.f27338c.add(collection.getId(), collectionRepository.f27339d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2552b(new Function1<FavoriteCollectionAddResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onAddFavoriteCollection$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(FavoriteCollectionAddResponse favoriteCollectionAddResponse) {
                if (favoriteCollectionAddResponse.isSuccess()) {
                    Collection.this.setFavorite(true);
                    Collection collection2 = Collection.this;
                    collection2.setFavoriteCount(collection2.getFavoriteCount() + 1);
                    EventBusKt.m16327a(new OnFetchCollection(Collection.this));
                }
                return Unit.f63088a;
            }
        }, 25), new C2552b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onAddFavoriteCollection$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 26), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: e */
    public final void m14316e() {
        final String str = "R-M-1773808-1";
        final long j2 = 0;
        final String str2 = "R-M-1773808-2";
        this.f25949a.m15287a().m31370l(new C2558c(new Function1<TogglesResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onConfigInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x00f6  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x010e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0145  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0153  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0165  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x01c3  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x01c8  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x01e4  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x01e9  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x01ff  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x0203  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0206  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x01ec  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x01e6  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x01cb  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x01c5  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x0147  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x00d8  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.Unit invoke(com.swiftsoft.anixartd.network.response.TogglesResponse r40) {
                /*
                    Method dump skipped, instructions count: 798
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.presentation.main.MainPresenter$onConfigInfo$1.invoke(java.lang.Object):java.lang.Object");
            }
        }, 8), new C2558c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onConfigInfo$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                MainPresenter.this.f25957i.m14054J(0);
                C3033a.m17749k(MainPresenter.this.f25957i.f25344a, "IMP_MESSAGE_ENABLED", false);
                MainPresenter.this.f25957i.m14053I("");
                MainPresenter.this.f25957i.m14053I("");
                Prefs prefs = MainPresenter.this.f25957i;
                Objects.requireNonNull(prefs);
                C2052a.m12278m(prefs.f25344a, "IMP_MESSAGE_BACKGROUND_COLOR", "");
                Prefs prefs2 = MainPresenter.this.f25957i;
                Objects.requireNonNull(prefs2);
                C2052a.m12278m(prefs2.f25344a, "IMP_MESSAGE_TEXT_COLOR", "");
                Prefs prefs3 = MainPresenter.this.f25957i;
                String value = str;
                Objects.requireNonNull(prefs3);
                Intrinsics.m32179h(value, "value");
                C2052a.m12278m(prefs3.f25344a, "AD_BANNER_BLOCK_ID", value);
                Prefs prefs4 = MainPresenter.this.f25957i;
                String value2 = str2;
                Objects.requireNonNull(prefs4);
                Intrinsics.m32179h(value2, "value");
                C2052a.m12278m(prefs4.f25344a, "AD_INTERSTITIAL_BLOCK_ID", value2);
                C3033a.m17748j(MainPresenter.this.f25957i.f25344a, "AD_BANNER_DELAY", 30L);
                C3033a.m17748j(MainPresenter.this.f25957i.f25344a, "AD_INTERSTITIAL_DELAY", 0L);
                Prefs prefs5 = MainPresenter.this.f25957i;
                Objects.requireNonNull(prefs5);
                C2052a.m12278m(prefs5.f25344a, "KODIK_VIDEO_LINKS_URL", "");
                C3033a.m17749k(MainPresenter.this.f25957i.f25344a, "KODIK_IFRAME_AD", false);
                C3033a.m17749k(MainPresenter.this.f25957i.f25344a, "SIBNET_RAND_USER_AGENT", false);
                Prefs prefs6 = MainPresenter.this.f25957i;
                Objects.requireNonNull(prefs6);
                C2052a.m12278m(prefs6.f25344a, "SIBNET_USER_AGENT", "");
                Prefs prefs7 = MainPresenter.this.f25957i;
                Objects.requireNonNull(prefs7);
                C2052a.m12278m(prefs7.f25344a, "TORLOOK_URL", "https://gw2.torlook.info/");
                C3033a.m17749k(MainPresenter.this.f25957i.f25344a, "SNOWFALL", false);
                Prefs prefs8 = MainPresenter.this.f25957i;
                Objects.requireNonNull(prefs8);
                C2052a.m12278m(prefs8.f25344a, "SEARCH_BAR_ICON_URL", "");
                C3033a.m17749k(MainPresenter.this.f25957i.f25344a, "SEARCH_BAR_ICON_TINT", true);
                Prefs prefs9 = MainPresenter.this.f25957i;
                Objects.requireNonNull(prefs9);
                C2052a.m12278m(prefs9.f25344a, "SEARCH_BAR_ICON_ACTION", "");
                Prefs prefs10 = MainPresenter.this.f25957i;
                Objects.requireNonNull(prefs10);
                prefs10.f25344a.edit().putString("SEARCH_BAR_ICON_VALUE", "").apply();
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 9), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: f */
    public final void m14317f(@NotNull final Release release) {
        Intrinsics.m32179h(release, "release");
        MainRepository mainRepository = this.f25951c;
        mainRepository.f27362b.delete(release.getId(), mainRepository.f27365e.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2558c(new Function1<FavoritesResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onDeleteFavorite$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(FavoritesResponse favoritesResponse) {
                if (favoritesResponse.isSuccess()) {
                    Release.this.setFavorite(false);
                    EventBusKt.m16327a(new OnFetchRelease(Release.this));
                }
                return Unit.f63088a;
            }
        }, 1), new C2558c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onDeleteFavorite$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 2), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: g */
    public final void m14318g(@NotNull final Collection collection) {
        Intrinsics.m32179h(collection, "collection");
        CollectionRepository collectionRepository = this.f25955g;
        collectionRepository.f27338c.delete(collection.getId(), collectionRepository.f27339d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2552b(new Function1<FavoriteCollectionDeleteResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onDeleteFavoriteCollection$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(FavoriteCollectionDeleteResponse favoriteCollectionDeleteResponse) {
                if (favoriteCollectionDeleteResponse.isSuccess()) {
                    Collection.this.setFavorite(false);
                    Collection.this.setFavoriteCount(r2.getFavoriteCount() - 1);
                    EventBusKt.m16327a(new OnFetchCollection(Collection.this));
                }
                return Unit.f63088a;
            }
        }, 21), new C2552b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onDeleteFavoriteCollection$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 22), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: h */
    public final void m14319h(@NotNull final Release release) {
        Intrinsics.m32179h(release, "release");
        MainRepository mainRepository = this.f25951c;
        mainRepository.f27361a.delete(release.getId(), mainRepository.f27365e.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2552b(new Function1<HistoryResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onDeleteHistory$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(HistoryResponse historyResponse) {
                if (historyResponse.isSuccess()) {
                    Release.this.setViewed(false);
                    EventBusKt.m16327a(new OnFetchRelease(Release.this));
                }
                return Unit.f63088a;
            }
        }, 29), new C2558c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onDeleteHistory$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 0), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: i */
    public final void m14320i() {
        AuthRepository authRepository = this.f25950b;
        authRepository.f27325a.firebase(authRepository.f27326b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2558c(new Function1<FirebaseResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onFirebase$1
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(FirebaseResponse firebaseResponse) {
                FirebaseMessaging firebaseMessaging;
                String topicName = firebaseResponse.getTopicName();
                if (topicName != null) {
                    Store store = FirebaseMessaging.f23265o;
                    synchronized (FirebaseMessaging.class) {
                        firebaseMessaging = FirebaseMessaging.getInstance(FirebaseApp.m12212c());
                    }
                    firebaseMessaging.f23278k.mo9713r(new C2161e(topicName));
                }
                return Unit.f63088a;
            }
        }, 10), new C2558c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onFirebase$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 11), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: j */
    public final void m14321j() {
        ProfilePreferenceRepository profilePreferenceRepository = this.f25954f;
        profilePreferenceRepository.f27370a.googleUnbind(profilePreferenceRepository.f27371b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2558c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onGoogleUnbind$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                MainPresenter.this.getViewState().mo14345h();
                return Unit.f63088a;
            }
        }, 3)).m31365g(new C2555b(this, 1)).m31370l(new C2558c(new Function1<GoogleUnbindResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onGoogleUnbind$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(GoogleUnbindResponse googleUnbindResponse) {
                GoogleUnbindResponse googleUnbindResponse2 = googleUnbindResponse;
                if (googleUnbindResponse2.isSuccess()) {
                    EventBusKt.m16327a(new OnGoogleUnbound());
                } else if (googleUnbindResponse2.getCode() == 2) {
                    MainPresenter.this.getViewState().mo14340Y1();
                }
                return Unit.f63088a;
            }
        }, 4), new C2558c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onGoogleUnbind$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                MainPresenter.this.getViewState().mo14337P();
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 5), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: k */
    public final void m14322k() {
        NotificationRepository notificationRepository = this.f25956h;
        notificationRepository.f27368a.count(notificationRepository.f27369b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2552b(new Function1<NotificationCountResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onNotificationCount$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(NotificationCountResponse notificationCountResponse) {
                long count = notificationCountResponse.getCount();
                MainPresenter mainPresenter = MainPresenter.this;
                mainPresenter.f25958j.f28961f = count;
                mainPresenter.getViewState().mo14341c2();
                return Unit.f63088a;
            }
        }, 27), new C2552b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onNotificationCount$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 28), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: l */
    public final void m14323l() {
        NotificationRepository notificationRepository = this.f25956h;
        notificationRepository.f27368a.read(notificationRepository.f27369b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2552b(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onNotificationsRead$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                if (response.isSuccess()) {
                    MainPresenter mainPresenter = MainPresenter.this;
                    mainPresenter.f25958j.f28961f = 0L;
                    mainPresenter.getViewState().mo14341c2();
                }
                return Unit.f63088a;
            }
        }, 23), new C2552b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onNotificationsRead$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 24), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: m */
    public final void m14324m() {
        if (m14312a()) {
            return;
        }
        ProfileRepository profileRepository = this.f25953e;
        profileRepository.m15302b(profileRepository.f27377d.m14061d()).m31370l(new C2558c(new Function1<ProfileResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onProfileInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ProfileResponse profileResponse) {
                ProfileResponse profileResponse2 = profileResponse;
                if (profileResponse2.isPermBanned()) {
                    MainPresenter.this.getViewState().mo14339V3();
                } else {
                    Profile profile = profileResponse2.getProfile();
                    if (profile == null || !profileResponse2.getIsMyProfile()) {
                        MainPresenter.this.m14332u();
                    } else {
                        Prefs prefs = MainPresenter.this.f25957i;
                        C3033a.m17748j(prefs.f25344a, "PRIVILEGE_LEVEL_ID", profile.getPrivilegeLevel());
                        Prefs prefs2 = MainPresenter.this.f25957i;
                        C3033a.m17749k(prefs2.f25344a, "IS_SPONSOR", profile.getIsSponsor());
                        Prefs prefs3 = MainPresenter.this.f25957i;
                        prefs3.f25344a.edit().putLong("SPONSORSHIP_EXPIRES", profile.getSponsorshipExpires()).apply();
                        if (profile.getIsPermBanned()) {
                            MainPresenter.this.getViewState().mo14339V3();
                        }
                    }
                }
                return Unit.f63088a;
            }
        }, 17), new C2558c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onProfileInfo$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 18), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: n */
    public final void m14325n(final int i2, @NotNull final Release release) {
        Observable<ProfileListResponse> m31369k;
        if (i2 != 0) {
            MainRepository mainRepository = this.f25951c;
            m31369k = mainRepository.f27364d.add(i2, release.getId(), mainRepository.f27365e.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        } else {
            MainRepository mainRepository2 = this.f25951c;
            m31369k = mainRepository2.f27364d.delete(release.getProfileListStatus(), release.getId(), mainRepository2.f27365e.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        }
        m31369k.m31370l(new C2558c(new Function1<ProfileListResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onProfileList$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ProfileListResponse profileListResponse) {
                if (profileListResponse.isSuccess()) {
                    Release.this.setProfileListStatus(i2);
                    EventBusKt.m16327a(new OnFetchRelease(Release.this));
                }
                return Unit.f63088a;
            }
        }, 19), new C2558c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onProfileList$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 20), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: o */
    public final void m14326o(long j2) {
        ProfileRepository profileRepository = this.f25953e;
        profileRepository.f27374a.social(j2, profileRepository.f27377d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2552b(new Function1<ProfileSocialResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onProfileSocial$1
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ProfileSocialResponse profileSocialResponse) {
                ProfileSocialResponse profileSocialResponse2 = profileSocialResponse;
                EventBusKt.m16327a(new OnBottomSheetProfileSocial(profileSocialResponse2.getVkPage(), profileSocialResponse2.getTgPage(), profileSocialResponse2.getInstPage(), profileSocialResponse2.getTtPage(), profileSocialResponse2.getDiscordPage()));
                return Unit.f63088a;
            }
        }, 15), new C2552b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onProfileSocial$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 16), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: p */
    public final void m14327p(@NotNull final Release release) {
        Intrinsics.m32179h(release, "release");
        this.f25952d.m15313a(release.getId()).m31370l(new C2552b(new Function1<DeleteVoteReleaseResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onReleaseDeleteVote$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DeleteVoteReleaseResponse deleteVoteReleaseResponse) {
                if (deleteVoteReleaseResponse.isSuccess()) {
                    Release.this.setMyVote(null);
                    Release.this.setVotedAt(0L);
                    EventBusKt.m16327a(new OnFetchRelease(Release.this));
                }
                return Unit.f63088a;
            }
        }, 19), new C2552b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onReleaseDeleteVote$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 20), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: q */
    public final void m14328q(@NotNull final ReleaseVideo releaseVideo) {
        Intrinsics.m32179h(releaseVideo, "releaseVideo");
        MainRepository mainRepository = this.f25951c;
        mainRepository.f27363c.add(releaseVideo.getId(), mainRepository.f27365e.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2552b(new Function1<FavoritesResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onReleaseVideoAddFavorite$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(FavoritesResponse favoritesResponse) {
                if (favoritesResponse.isSuccess()) {
                    ReleaseVideo.this.setFavorite(true);
                    EventBusKt.m16327a(new OnFetchReleaseVideo(ReleaseVideo.this));
                }
                return Unit.f63088a;
            }
        }, 17), new C2552b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onReleaseVideoAddFavorite$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 18), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: r */
    public final void m14329r(@NotNull final ReleaseVideo releaseVideo) {
        Intrinsics.m32179h(releaseVideo, "releaseVideo");
        MainRepository mainRepository = this.f25951c;
        mainRepository.f27363c.delete(releaseVideo.getId(), mainRepository.f27365e.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2558c(new Function1<FavoritesResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onReleaseVideoDeleteFavorite$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(FavoritesResponse favoritesResponse) {
                if (favoritesResponse.isSuccess()) {
                    ReleaseVideo.this.setFavorite(false);
                    EventBusKt.m16327a(new OnFetchReleaseVideo(ReleaseVideo.this));
                }
                return Unit.f63088a;
            }
        }, 6), new C2558c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onReleaseVideoDeleteFavorite$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 7), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: s */
    public final void m14330s(@NotNull final Release release, final int i2) {
        Intrinsics.m32179h(release, "release");
        this.f25952d.m15314b(release.getId(), i2).m31370l(new C2552b(new Function1<VoteReleaseResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onReleaseVote$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(VoteReleaseResponse voteReleaseResponse) {
                if (voteReleaseResponse.isSuccess()) {
                    Release.this.setMyVote(Integer.valueOf(i2));
                    Release.this.setVotedAt(System.currentTimeMillis() / 1000);
                    EventBusKt.m16327a(new OnFetchRelease(Release.this));
                }
                return Unit.f63088a;
            }
        }, 11), new C2552b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onReleaseVote$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 12), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: t */
    public final void m14331t() {
        if (this.f25957i.f25344a.getBoolean("TOOLTIP_BOOKMARKS", true)) {
            return;
        }
        getViewState().mo14351o3();
        C3033a.m17749k(this.f25957i.f25344a, "TOOLTIP_BOOKMARKS", true);
    }

    /* renamed from: u */
    public final void m14332u() {
        new ObservableDefer(new Callable() { // from class: com.swiftsoft.anixartd.presentation.main.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj = FirebaseInstallations.f23129m;
                FirebaseInstallations m12559f = FirebaseInstallations.m12559f(FirebaseApp.m12212c());
                return new ObservableJust(Tasks.m9721c(m12559f.f23138h, new CallableC2138b(m12559f, 2)));
            }
        }).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2552b(new Function1<Task<Void>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onSignOut$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Task<Void> task) {
                return Unit.f63088a;
            }
        }, 13), new C2552b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onSignOut$3
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 14), Functions.f59621b, Functions.f59622c);
        AuthRepository authRepository = this.f25950b;
        authRepository.f27326b.f25344a.edit().remove("ID").remove("TOKEN").remove("HASH").remove("IS_GUEST").remove("IS_SPONSOR").remove("SPONSORSHIP_EXPIRES").remove("IS_ADULT").apply();
        authRepository.f27327c.deleteAll();
        authRepository.f27328d.deleteAll();
        authRepository.f27329e.deleteAll();
        getViewState().mo14338S2();
    }

    /* renamed from: v */
    public final void m14333v(@NotNull HashMap<String, Object> hashMap) {
        ProfilePreferenceRepository profilePreferenceRepository = this.f25954f;
        String valueOf = String.valueOf(hashMap.get("accessToken"));
        Objects.requireNonNull(profilePreferenceRepository);
        profilePreferenceRepository.f27370a.vkBind(valueOf, profilePreferenceRepository.f27371b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2558c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onVkBind$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                MainPresenter.this.getViewState().mo14345h();
                return Unit.f63088a;
            }
        }, 12)).m31365g(new C2555b(this, 2)).m31370l(new C2558c(new Function1<VkBindResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onVkBind$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(VkBindResponse vkBindResponse) {
                VkBindResponse vkBindResponse2 = vkBindResponse;
                if (vkBindResponse2.isSuccess()) {
                    EventBusKt.m16327a(new OnVkBound());
                } else {
                    int code = vkBindResponse2.getCode();
                    if (code == 2) {
                        MainPresenter.this.getViewState().mo14337P();
                    } else if (code == 3) {
                        MainPresenter.this.getViewState().mo14335F1();
                    }
                }
                return Unit.f63088a;
            }
        }, 13), new C2558c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onVkBind$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                MainPresenter.this.getViewState().mo14337P();
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 14), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: w */
    public final void m14334w() {
        ProfilePreferenceRepository profilePreferenceRepository = this.f25954f;
        profilePreferenceRepository.f27370a.vkUnbind(profilePreferenceRepository.f27371b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2552b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onVkUnbind$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                MainPresenter.this.getViewState().mo14345h();
                return Unit.f63088a;
            }
        }, 8)).m31365g(new C2555b(this, 0)).m31370l(new C2552b(new Function1<VkUnbindResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onVkUnbind$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(VkUnbindResponse vkUnbindResponse) {
                VkUnbindResponse vkUnbindResponse2 = vkUnbindResponse;
                if (vkUnbindResponse2.isSuccess()) {
                    EventBusKt.m16327a(new OnVkUnbound());
                } else if (vkUnbindResponse2.getCode() == 2) {
                    MainPresenter.this.getViewState().mo14344g1();
                }
                return Unit.f63088a;
            }
        }, 9), new C2552b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.MainPresenter$onVkUnbind$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                MainPresenter.this.getViewState().mo14337P();
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 10), Functions.f59621b, Functions.f59622c);
    }
}
