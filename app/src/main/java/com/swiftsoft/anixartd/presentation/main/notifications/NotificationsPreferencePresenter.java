package com.swiftsoft.anixartd.presentation.main.notifications;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.ProfileStatusNotificationPreference;
import com.swiftsoft.anixartd.database.entity.ProfileTypeNotificationPreference;
import com.swiftsoft.anixartd.database.entity.episode.Type;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.network.request.preferences.ProfileStatusNotificationPreferencesEditRequest;
import com.swiftsoft.anixartd.network.request.preferences.ProfileTypeNotificationPreferencesEditRequest;
import com.swiftsoft.anixartd.network.response.common.TypeResponse;
import com.swiftsoft.anixartd.network.response.preferences.NotificationPreferenceResponse;
import com.swiftsoft.anixartd.p015ui.logic.main.notifications.NotificationsPreferenceUiLogic;
import com.swiftsoft.anixartd.presentation.auth.restore.C2549a;
import com.swiftsoft.anixartd.presentation.main.filtered.C2573a;
import com.swiftsoft.anixartd.repository.AuthRepository;
import com.swiftsoft.anixartd.repository.NotificationPreferenceRepository;
import com.swiftsoft.anixartd.repository.TypeRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnFetchCommentNotificationsEnabled;
import com.swiftsoft.anixartd.utils.OnFetchEpisodeNotificationsEnabled;
import com.swiftsoft.anixartd.utils.OnFetchMyCollectionCommentNotificationsEnabled;
import com.swiftsoft.anixartd.utils.OnFetchSelectedReleasesNotificationsEnabled;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;

/* compiled from: NotificationsPreferencePresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/notifications/NotificationsPreferencePresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/notifications/NotificationsPreferenceView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NotificationsPreferencePresenter extends MvpPresenter<NotificationsPreferenceView> {

    /* renamed from: a */
    @NotNull
    public TypeRepository f26448a;

    /* renamed from: b */
    @NotNull
    public NotificationPreferenceRepository f26449b;

    /* renamed from: c */
    @NotNull
    public NotificationsPreferenceUiLogic f26450c;

    @Inject
    public NotificationsPreferencePresenter(@NotNull AuthRepository authRepository, @NotNull TypeRepository typeRepository, @NotNull NotificationPreferenceRepository notificationPreferenceRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(authRepository, "authRepository");
        Intrinsics.m32179h(typeRepository, "typeRepository");
        Intrinsics.m32179h(notificationPreferenceRepository, "notificationPreferenceRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26448a = typeRepository;
        this.f26449b = notificationPreferenceRepository;
        this.f26450c = new NotificationsPreferenceUiLogic();
    }

    /* renamed from: a */
    public final void m14690a() {
        final boolean z = this.f26450c.f29117j;
        NotificationPreferenceRepository notificationPreferenceRepository = this.f26449b;
        notificationPreferenceRepository.f27366a.commentNotificationsEdit(notificationPreferenceRepository.f27367b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2573a(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferencePresenter$onCommentNotificationsEdit$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                if (response.isSuccess()) {
                    EventBusKt.m16327a(new OnFetchCommentNotificationsEnabled(z));
                }
                return Unit.f63088a;
            }
        }, 27), new C2573a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferencePresenter$onCommentNotificationsEdit$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                NotificationsPreferencePresenter.this.getViewState().mo14703c();
                return Unit.f63088a;
            }
        }, 28), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: b */
    public final void m14691b() {
        final boolean z = this.f26450c.f29113f;
        NotificationPreferenceRepository notificationPreferenceRepository = this.f26449b;
        notificationPreferenceRepository.f27366a.episodeNotificationsEdit(notificationPreferenceRepository.f27367b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2573a(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferencePresenter$onEpisodeNotificationsEdit$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                if (response.isSuccess()) {
                    EventBusKt.m16327a(new OnFetchEpisodeNotificationsEnabled(z));
                }
                return Unit.f63088a;
            }
        }, 25), new C2573a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferencePresenter$onEpisodeNotificationsEdit$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                NotificationsPreferencePresenter.this.getViewState().mo14703c();
                return Unit.f63088a;
            }
        }, 26), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: c */
    public final void m14692c() {
        NotificationPreferenceRepository notificationPreferenceRepository = this.f26449b;
        notificationPreferenceRepository.f27366a.firstEpisodeNotificationsEdit(notificationPreferenceRepository.f27367b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2573a(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferencePresenter$onFirstEpisodeNotificationsEdit$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Response response) {
                return Unit.f63088a;
            }
        }, 23), new C2573a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferencePresenter$onFirstEpisodeNotificationsEdit$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                NotificationsPreferencePresenter.this.getViewState().mo14703c();
                return Unit.f63088a;
            }
        }, 24), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: d */
    public final void m14693d() {
        final boolean z = this.f26450c.f29118k;
        NotificationPreferenceRepository notificationPreferenceRepository = this.f26449b;
        notificationPreferenceRepository.f27366a.myCollectionCommentNotificationsEdit(notificationPreferenceRepository.f27367b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2573a(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferencePresenter$onMyCollectionCommentNotificationsEdit$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                if (response.isSuccess()) {
                    EventBusKt.m16327a(new OnFetchMyCollectionCommentNotificationsEnabled(z));
                }
                return Unit.f63088a;
            }
        }, 29), new C2588a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferencePresenter$onMyCollectionCommentNotificationsEdit$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                NotificationsPreferencePresenter.this.getViewState().mo14703c();
                return Unit.f63088a;
            }
        }, 0), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: e */
    public final void m14694e() {
        Observables.f62894a.m31860a(this.f26448a.m15316a(), this.f26449b.m15298a()).m31367i(new C2573a(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferencePresenter$onMyPreference$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                NotificationsPreferencePresenter.this.getViewState().mo14702b();
                return Unit.f63088a;
            }
        }, 10)).m31368j(new C2549a(this, 11)).m31370l(new C2573a(new Function1<Pair<? extends TypeResponse, ? extends NotificationPreferenceResponse>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferencePresenter$onMyPreference$3
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Pair<? extends TypeResponse, ? extends NotificationPreferenceResponse> pair) {
                Pair<? extends TypeResponse, ? extends NotificationPreferenceResponse> pair2 = pair;
                TypeResponse typeResponse = (TypeResponse) pair2.f63055b;
                NotificationPreferenceResponse notificationPreferenceResponse = (NotificationPreferenceResponse) pair2.f63056c;
                List<Type> types = typeResponse.getTypes();
                Set<ProfileStatusNotificationPreference> profileStatusNotificationPreferences = notificationPreferenceResponse.getProfileStatusNotificationPreferences();
                ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(profileStatusNotificationPreferences, 10));
                Iterator<T> it = profileStatusNotificationPreferences.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((ProfileStatusNotificationPreference) it.next()).getStatus().getValue()));
                }
                Set m32035n0 = CollectionsKt.m32035n0(arrayList);
                Set<ProfileTypeNotificationPreference> profileTypeNotificationPreferences = notificationPreferenceResponse.getProfileTypeNotificationPreferences();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(profileTypeNotificationPreferences, 10));
                Iterator<T> it2 = profileTypeNotificationPreferences.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Long.valueOf(((ProfileTypeNotificationPreference) it2.next()).getType().getId()));
                }
                Set m32035n02 = CollectionsKt.m32035n0(arrayList2);
                boolean isReleaseTypeNotificationsEnabled = notificationPreferenceResponse.getIsReleaseTypeNotificationsEnabled();
                boolean isEpisodeNotificationsEnabled = notificationPreferenceResponse.getIsEpisodeNotificationsEnabled();
                boolean isFirstEpisodeNotificationEnabled = notificationPreferenceResponse.getIsFirstEpisodeNotificationEnabled();
                boolean isRelatedReleaseNotificationsEnabled = notificationPreferenceResponse.getIsRelatedReleaseNotificationsEnabled();
                boolean isReportProcessNotificationsEnabled = notificationPreferenceResponse.getIsReportProcessNotificationsEnabled();
                boolean isCommentNotificationsEnabled = notificationPreferenceResponse.getIsCommentNotificationsEnabled();
                boolean isMyCollectionCommentNotificationsEnabled = notificationPreferenceResponse.getIsMyCollectionCommentNotificationsEnabled();
                NotificationsPreferenceUiLogic notificationsPreferenceUiLogic = NotificationsPreferencePresenter.this.f26450c;
                Objects.requireNonNull(notificationsPreferenceUiLogic);
                Intrinsics.m32179h(types, "types");
                if (notificationsPreferenceUiLogic.f28956a) {
                    notificationsPreferenceUiLogic.f29109b.clear();
                    notificationsPreferenceUiLogic.f29110c.clear();
                    notificationsPreferenceUiLogic.f29111d.clear();
                }
                notificationsPreferenceUiLogic.f29109b.addAll(types);
                notificationsPreferenceUiLogic.f29110c.addAll(m32035n0);
                notificationsPreferenceUiLogic.f29111d.addAll(m32035n02);
                notificationsPreferenceUiLogic.f29112e = isReleaseTypeNotificationsEnabled;
                notificationsPreferenceUiLogic.f29113f = isEpisodeNotificationsEnabled;
                notificationsPreferenceUiLogic.f29114g = isFirstEpisodeNotificationEnabled;
                notificationsPreferenceUiLogic.f29115h = isRelatedReleaseNotificationsEnabled;
                notificationsPreferenceUiLogic.f29116i = isReportProcessNotificationsEnabled;
                notificationsPreferenceUiLogic.f29117j = isCommentNotificationsEnabled;
                notificationsPreferenceUiLogic.f29118k = isMyCollectionCommentNotificationsEnabled;
                notificationsPreferenceUiLogic.f28956a = true;
                NotificationsPreferencePresenter.this.getViewState().mo14700X2();
                return Unit.f63088a;
            }
        }, 11), new C2573a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferencePresenter$onMyPreference$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                NotificationsPreferencePresenter.this.getViewState().mo14703c();
                return Unit.f63088a;
            }
        }, 12), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: f */
    public final void m14695f() {
        Set<Integer> profileStatusNotificationPreferences = this.f26450c.f29110c;
        NotificationPreferenceRepository notificationPreferenceRepository = this.f26449b;
        Objects.requireNonNull(notificationPreferenceRepository);
        Intrinsics.m32179h(profileStatusNotificationPreferences, "profileStatusNotificationPreferences");
        notificationPreferenceRepository.f27366a.profileStatusNotificationPreferencesEdit(new ProfileStatusNotificationPreferencesEditRequest(profileStatusNotificationPreferences), notificationPreferenceRepository.f27367b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2573a(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferencePresenter$onProfileStatusNotificationPreferencesEdit$1
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                response.isSuccess();
                return Unit.f63088a;
            }
        }, 17), new C2573a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferencePresenter$onProfileStatusNotificationPreferencesEdit$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                NotificationsPreferencePresenter.this.getViewState().mo14703c();
                return Unit.f63088a;
            }
        }, 18), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: g */
    public final void m14696g() {
        Set<Long> profileTypeNotificationPreferences = this.f26450c.f29111d;
        NotificationPreferenceRepository notificationPreferenceRepository = this.f26449b;
        Objects.requireNonNull(notificationPreferenceRepository);
        Intrinsics.m32179h(profileTypeNotificationPreferences, "profileTypeNotificationPreferences");
        notificationPreferenceRepository.f27366a.profileTypeNotificationPreferencesEdit(new ProfileTypeNotificationPreferencesEditRequest(profileTypeNotificationPreferences), notificationPreferenceRepository.f27367b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2573a(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferencePresenter$onProfileTypeNotificationPreferencesEdit$1
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                response.isSuccess();
                return Unit.f63088a;
            }
        }, 15), new C2573a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferencePresenter$onProfileTypeNotificationPreferencesEdit$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                NotificationsPreferencePresenter.this.getViewState().mo14703c();
                return Unit.f63088a;
            }
        }, 16), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: h */
    public final void m14697h() {
        NotificationPreferenceRepository notificationPreferenceRepository = this.f26449b;
        notificationPreferenceRepository.f27366a.relatedReleaseNotificationsEdit(notificationPreferenceRepository.f27367b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2573a(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferencePresenter$onRelatedReleaseNotificationsEdit$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Response response) {
                return Unit.f63088a;
            }
        }, 21), new C2573a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferencePresenter$onRelatedReleaseNotificationsEdit$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                NotificationsPreferencePresenter.this.getViewState().mo14703c();
                return Unit.f63088a;
            }
        }, 22), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: i */
    public final void m14698i() {
        NotificationPreferenceRepository notificationPreferenceRepository = this.f26449b;
        notificationPreferenceRepository.f27366a.reportProcessNotificationsEdit(notificationPreferenceRepository.f27367b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2573a(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferencePresenter$onReportProcessNotificationsEdit$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Response response) {
                return Unit.f63088a;
            }
        }, 19), new C2573a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferencePresenter$onReportProcessNotificationsEdit$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                NotificationsPreferencePresenter.this.getViewState().mo14703c();
                return Unit.f63088a;
            }
        }, 20), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: j */
    public final void m14699j() {
        final boolean z = this.f26450c.f29112e;
        NotificationPreferenceRepository notificationPreferenceRepository = this.f26449b;
        notificationPreferenceRepository.f27366a.selectedReleasesNotificationsEdit(notificationPreferenceRepository.f27367b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2573a(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferencePresenter$onSelectedReleasesNotificationPreferencesEdit$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                if (response.isSuccess()) {
                    EventBusKt.m16327a(new OnFetchSelectedReleasesNotificationsEnabled(z));
                }
                return Unit.f63088a;
            }
        }, 13), new C2573a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferencePresenter$onSelectedReleasesNotificationPreferencesEdit$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                NotificationsPreferencePresenter.this.getViewState().mo14703c();
                return Unit.f63088a;
            }
        }, 14), Functions.f59621b, Functions.f59622c);
    }
}
