package com.swiftsoft.anixartd.presentation.main.notifications;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.notification.ProfileFriendNotification;
import com.swiftsoft.anixartd.database.entity.notification.ProfileMyCollectionCommentNotification;
import com.swiftsoft.anixartd.database.entity.notification.ProfileNotification;
import com.swiftsoft.anixartd.database.entity.notification.collection.ProfileCollectionCommentNotification;
import com.swiftsoft.anixartd.database.entity.notification.episode.ProfileEpisodeNotification;
import com.swiftsoft.anixartd.database.entity.notification.related.ProfileRelatedReleaseNotification;
import com.swiftsoft.anixartd.database.entity.notification.release.ProfileReleaseCommentNotification;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.preferences.NotificationPreferenceResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.notifications.NotificationsUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.notifications.NotificationsUiLogic;
import com.swiftsoft.anixartd.presentation.auth.restore.C2549a;
import com.swiftsoft.anixartd.repository.NotificationPreferenceRepository;
import com.swiftsoft.anixartd.repository.NotificationRepository;
import com.swiftsoft.anixartd.utils.Sixtuple;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function6;
import io.reactivex.internal.functions.Functions;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.schedulers.Schedulers;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NotificationsPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/notifications/NotificationsPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/notifications/NotificationsView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NotificationsPresenter extends MvpPresenter<NotificationsView> {

    /* renamed from: a */
    @NotNull
    public NotificationPreferenceRepository f26476a;

    /* renamed from: b */
    @NotNull
    public NotificationRepository f26477b;

    /* renamed from: c */
    @NotNull
    public Listener f26478c;

    /* renamed from: d */
    @NotNull
    public NotificationsUiLogic f26479d;

    /* renamed from: e */
    @NotNull
    public NotificationsUiController f26480e;

    /* compiled from: NotificationsPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/notifications/NotificationsPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/notifications/NotificationsUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends NotificationsUiController.Listener {
    }

    @Inject
    public NotificationsPresenter(@NotNull NotificationPreferenceRepository notificationPreferenceRepository, @NotNull NotificationRepository notificationRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(notificationPreferenceRepository, "notificationPreferenceRepository");
        Intrinsics.m32179h(notificationRepository, "notificationRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26476a = notificationPreferenceRepository;
        this.f26477b = notificationRepository;
        this.f26478c = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.notifications.NotificationsDisabledModel.Listener
            /* renamed from: M0 */
            public void mo14712M0() {
                NotificationsPresenter.this.getViewState().mo14719M0();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.notifications.NotificationReleaseCommentModel.Listener
            /* renamed from: N */
            public void mo14713N(long j2, long j3, long j4) {
                NotificationsPresenter.this.getViewState().mo14720N(j2, j3, j4);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.notifications.NotificationCollectionCommentModel.Listener
            /* renamed from: S0 */
            public void mo14714S0(long j2, long j3, @Nullable Long l2) {
                NotificationsPresenter.this.getViewState().mo14722S0(j2, j3, l2);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.notifications.ExtraNotificationsModel.Listener
            /* renamed from: a */
            public void mo14715a(int i2) {
                NotificationsPresenter notificationsPresenter = NotificationsPresenter.this;
                notificationsPresenter.f26479d.f29120c = i2;
                notificationsPresenter.getViewState().mo14730h2();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.notifications.NotificationFriendModel.Listener
            /* renamed from: f */
            public void mo14716f(long j2) {
                NotificationsPresenter.this.getViewState().mo14728f(j2);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.notifications.NotificationEpisodeModel.Listener, com.swiftsoft.anixartd.ui.model.main.notifications.NotificationReleaseModel.Listener
            /* renamed from: g */
            public void mo14717g(long j2) {
                NotificationsPresenter.this.getViewState().mo14729g(j2);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.notifications.NotificationFriendModel.Listener, com.swiftsoft.anixartd.ui.model.main.notifications.NotificationEpisodeModel.Listener, com.swiftsoft.anixartd.ui.model.main.notifications.NotificationReleaseCommentModel.Listener, com.swiftsoft.anixartd.ui.model.main.notifications.NotificationCollectionCommentModel.Listener, com.swiftsoft.anixartd.ui.model.main.notifications.NotificationReleaseModel.Listener
            /* renamed from: k */
            public void mo14718k(long j2) {
                NotificationsPresenter.this.getViewState().mo14731k(j2);
            }
        };
        this.f26479d = new NotificationsUiLogic();
        this.f26480e = new NotificationsUiController();
    }

    /* renamed from: e */
    public static void m14706e(final NotificationsPresenter notificationsPresenter, final boolean z, final boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = notificationsPresenter.m14708b();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        Observable<NotificationPreferenceResponse> m15298a = notificationsPresenter.f26476a.m15298a();
        NotificationRepository notificationRepository = notificationsPresenter.f26477b;
        Observable<PageableResponse<ProfileFriendNotification>> friends = notificationRepository.f27368a.friends(notificationsPresenter.f26479d.f29119b, notificationRepository.f27369b.m14080w());
        Scheduler scheduler = Schedulers.f62901c;
        Observable<PageableResponse<ProfileFriendNotification>> m31369k = friends.m31372n(scheduler).m31369k(AndroidSchedulers.m31390a());
        NotificationRepository notificationRepository2 = notificationsPresenter.f26477b;
        Observable<PageableResponse<ProfileFriendNotification>> m31369k2 = notificationRepository2.f27368a.episodes(notificationsPresenter.f26479d.f29119b, notificationRepository2.f27369b.m14080w()).m31372n(scheduler).m31369k(AndroidSchedulers.m31390a());
        NotificationRepository notificationRepository3 = notificationsPresenter.f26477b;
        Observable<PageableResponse<ProfileReleaseCommentNotification>> m31369k3 = notificationRepository3.f27368a.releaseComments(notificationsPresenter.f26479d.f29119b, notificationRepository3.f27369b.m14080w()).m31372n(scheduler).m31369k(AndroidSchedulers.m31390a());
        NotificationRepository notificationRepository4 = notificationsPresenter.f26477b;
        Observable<PageableResponse<ProfileCollectionCommentNotification>> m31369k4 = notificationRepository4.f27368a.collectionComments(notificationsPresenter.f26479d.f29119b, notificationRepository4.f27369b.m14080w()).m31372n(scheduler).m31369k(AndroidSchedulers.m31390a());
        NotificationRepository notificationRepository5 = notificationsPresenter.f26477b;
        Observable<PageableResponse<ProfileMyCollectionCommentNotification>> m31369k5 = notificationRepository5.f27368a.myCollectionComments(notificationsPresenter.f26479d.f29119b, notificationRepository5.f27369b.m14080w()).m31372n(scheduler).m31369k(AndroidSchedulers.m31390a());
        NotificationRepository notificationRepository6 = notificationsPresenter.f26477b;
        Observable<PageableResponse<ProfileFriendNotification>> m31369k6 = notificationRepository6.f27368a.relatedReleases(notificationsPresenter.f26479d.f29119b, notificationRepository6.f27369b.m14080w()).m31372n(scheduler).m31369k(AndroidSchedulers.m31390a());
        int i3 = notificationsPresenter.f26479d.f29120c;
        if (i3 == 2) {
            m31369k = m31369k2;
        } else if (i3 == 3) {
            m31369k = m31369k6;
        } else if (i3 != 4) {
            m31369k = i3 != 5 ? Observable.m31361d(m31369k, m31369k2, m31369k3, m31369k4, m31369k5, m31369k6, new Function6<T1, T2, T3, T4, T5, T6, R>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPresenter$onNotifications$$inlined$combineLatest$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function6
                /* renamed from: a */
                public final R mo14545a(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
                    return (R) new Sixtuple((PageableResponse) t1, (PageableResponse) t2, (PageableResponse) t3, (PageableResponse) t4, (PageableResponse) t5, (PageableResponse) t6);
                }
            }) : Observables.f62894a.m31860a(m31369k3, m31369k4);
        }
        Observables.f62894a.m31860a(m15298a, m31369k).m31367i(new C2588a(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPresenter$onNotifications$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    notificationsPresenter.getViewState().mo14724b();
                }
                if (z2) {
                    notificationsPresenter.getViewState().mo14726d();
                }
                return Unit.f63088a;
            }
        }, 1)).m31365g(new C2549a(notificationsPresenter, 12)).m31370l(new C2588a(new Function1<Pair<? extends NotificationPreferenceResponse, ? extends Object>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPresenter$onNotifications$3
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Pair<? extends NotificationPreferenceResponse, ? extends Object> pair) {
                List content;
                List content2;
                List episodes;
                List relatedReleases;
                List releaseComments;
                List myCollectionComments;
                List collectionComments;
                boolean z3;
                Pair<? extends NotificationPreferenceResponse, ? extends Object> pair2 = pair;
                NotificationPreferenceResponse notificationPreferenceResponse = (NotificationPreferenceResponse) pair2.f63055b;
                B b = pair2.f63056c;
                NotificationsUiLogic notificationsUiLogic = NotificationsPresenter.this.f26479d;
                notificationsUiLogic.f29122e = notificationPreferenceResponse.getIsEpisodeNotificationsEnabled();
                notificationsUiLogic.f29123f = notificationPreferenceResponse.getIsCommentNotificationsEnabled();
                notificationsUiLogic.f29124g = notificationPreferenceResponse.getIsMyCollectionCommentNotificationsEnabled();
                List friends2 = EmptyList.f63144b;
                if (b instanceof Sixtuple) {
                    Sixtuple sixtuple = (Sixtuple) b;
                    A a2 = sixtuple.f30240b;
                    Intrinsics.m32177f(a2, "null cannot be cast to non-null type com.swiftsoft.anixartd.network.response.PageableResponse<com.swiftsoft.anixartd.database.entity.notification.ProfileFriendNotification>");
                    friends2 = ((PageableResponse) a2).getContent();
                    B b2 = sixtuple.f30241c;
                    Intrinsics.m32177f(b2, "null cannot be cast to non-null type com.swiftsoft.anixartd.network.response.PageableResponse<com.swiftsoft.anixartd.database.entity.notification.episode.ProfileEpisodeNotification>");
                    episodes = ((PageableResponse) b2).getContent();
                    C c2 = sixtuple.f30242d;
                    Intrinsics.m32177f(c2, "null cannot be cast to non-null type com.swiftsoft.anixartd.network.response.PageableResponse<com.swiftsoft.anixartd.database.entity.notification.release.ProfileReleaseCommentNotification>");
                    releaseComments = ((PageableResponse) c2).getContent();
                    D d = sixtuple.f30243e;
                    Intrinsics.m32177f(d, "null cannot be cast to non-null type com.swiftsoft.anixartd.network.response.PageableResponse<com.swiftsoft.anixartd.database.entity.notification.collection.ProfileCollectionCommentNotification>");
                    List content3 = ((PageableResponse) d).getContent();
                    E e2 = sixtuple.f30244f;
                    Intrinsics.m32177f(e2, "null cannot be cast to non-null type com.swiftsoft.anixartd.network.response.PageableResponse<com.swiftsoft.anixartd.database.entity.notification.ProfileMyCollectionCommentNotification>");
                    myCollectionComments = ((PageableResponse) e2).getContent();
                    F f2 = sixtuple.f30245g;
                    Intrinsics.m32177f(f2, "null cannot be cast to non-null type com.swiftsoft.anixartd.network.response.PageableResponse<com.swiftsoft.anixartd.database.entity.notification.related.ProfileRelatedReleaseNotification>");
                    relatedReleases = ((PageableResponse) f2).getContent();
                    collectionComments = content3;
                } else {
                    if (b instanceof Pair) {
                        if (NotificationsPresenter.this.f26479d.f29120c == 5) {
                            Pair pair3 = (Pair) b;
                            A a3 = pair3.f63055b;
                            Intrinsics.m32177f(a3, "null cannot be cast to non-null type com.swiftsoft.anixartd.network.response.PageableResponse<com.swiftsoft.anixartd.database.entity.notification.release.ProfileReleaseCommentNotification>");
                            List content4 = ((PageableResponse) a3).getContent();
                            B b3 = pair3.f63056c;
                            Intrinsics.m32177f(b3, "null cannot be cast to non-null type com.swiftsoft.anixartd.network.response.PageableResponse<com.swiftsoft.anixartd.database.entity.notification.collection.ProfileCollectionCommentNotification>");
                            collectionComments = ((PageableResponse) b3).getContent();
                            relatedReleases = friends2;
                            myCollectionComments = relatedReleases;
                            releaseComments = content4;
                            episodes = myCollectionComments;
                        }
                        content = friends2;
                    } else {
                        if (b instanceof PageableResponse) {
                            int i4 = NotificationsPresenter.this.f26479d.f29120c;
                            if (i4 == 2) {
                                Intrinsics.m32177f(b, "null cannot be cast to non-null type com.swiftsoft.anixartd.network.response.PageableResponse<com.swiftsoft.anixartd.database.entity.notification.episode.ProfileEpisodeNotification>");
                                content = ((PageableResponse) b).getContent();
                            } else if (i4 == 3) {
                                Intrinsics.m32177f(b, "null cannot be cast to non-null type com.swiftsoft.anixartd.network.response.PageableResponse<com.swiftsoft.anixartd.database.entity.notification.related.ProfileRelatedReleaseNotification>");
                                content2 = ((PageableResponse) b).getContent();
                                episodes = friends2;
                                relatedReleases = content2;
                                collectionComments = friends2;
                                releaseComments = collectionComments;
                                myCollectionComments = releaseComments;
                            } else if (i4 == 4) {
                                Intrinsics.m32177f(b, "null cannot be cast to non-null type com.swiftsoft.anixartd.network.response.PageableResponse<com.swiftsoft.anixartd.database.entity.notification.ProfileFriendNotification>");
                                episodes = friends2;
                                relatedReleases = episodes;
                                releaseComments = relatedReleases;
                                myCollectionComments = releaseComments;
                                friends2 = ((PageableResponse) b).getContent();
                                collectionComments = myCollectionComments;
                            }
                        }
                        content = friends2;
                    }
                    episodes = content;
                    content2 = friends2;
                    relatedReleases = content2;
                    collectionComments = friends2;
                    releaseComments = collectionComments;
                    myCollectionComments = releaseComments;
                }
                NotificationsUiLogic notificationsUiLogic2 = NotificationsPresenter.this.f26479d;
                Objects.requireNonNull(notificationsUiLogic2);
                Intrinsics.m32179h(friends2, "friends");
                Intrinsics.m32179h(episodes, "episodes");
                Intrinsics.m32179h(releaseComments, "releaseComments");
                Intrinsics.m32179h(collectionComments, "collectionComments");
                Intrinsics.m32179h(myCollectionComments, "myCollectionComments");
                Intrinsics.m32179h(relatedReleases, "relatedReleases");
                boolean z4 = notificationsUiLogic2.f29133p;
                if (z4) {
                    notificationsUiLogic2.f29125h.addAll(friends2);
                    notificationsUiLogic2.f29126i.addAll(episodes);
                    notificationsUiLogic2.f29127j.addAll(releaseComments);
                    notificationsUiLogic2.f29128k.addAll(collectionComments);
                    notificationsUiLogic2.f29129l.addAll(myCollectionComments);
                    notificationsUiLogic2.f29130m.addAll(relatedReleases);
                    notificationsUiLogic2.f29131n.addAll(CollectionsKt.m32017d0(CollectionsKt.m32002O(CollectionsKt.m32002O(CollectionsKt.m32002O(CollectionsKt.m32002O(CollectionsKt.m32002O(friends2, episodes), releaseComments), collectionComments), myCollectionComments), relatedReleases), new Comparator() { // from class: com.swiftsoft.anixartd.ui.logic.main.notifications.NotificationsUiLogic$fetchNotifications$$inlined$sortedByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt.m32109b(Long.valueOf(((ProfileNotification) t2).getTimestamp()), Long.valueOf(((ProfileNotification) t).getTimestamp()));
                        }
                    }));
                } else {
                    if (z4) {
                        notificationsUiLogic2.m15685a();
                    }
                    notificationsUiLogic2.f29125h.addAll(friends2);
                    notificationsUiLogic2.f29126i.addAll(episodes);
                    notificationsUiLogic2.f29127j.addAll(releaseComments);
                    notificationsUiLogic2.f29128k.addAll(collectionComments);
                    notificationsUiLogic2.f29129l.addAll(myCollectionComments);
                    notificationsUiLogic2.f29130m.addAll(relatedReleases);
                    notificationsUiLogic2.f29131n.addAll(CollectionsKt.m32017d0(CollectionsKt.m32002O(CollectionsKt.m32002O(CollectionsKt.m32002O(CollectionsKt.m32002O(CollectionsKt.m32002O(friends2, episodes), releaseComments), collectionComments), myCollectionComments), relatedReleases), new Comparator() { // from class: com.swiftsoft.anixartd.ui.logic.main.notifications.NotificationsUiLogic$fetchHeader$$inlined$sortedByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt.m32109b(Long.valueOf(((ProfileNotification) t2).getTimestamp()), Long.valueOf(((ProfileNotification) t).getTimestamp()));
                        }
                    }));
                    notificationsUiLogic2.f29133p = true;
                }
                List<ProfileNotification> list = notificationsUiLogic2.f29131n;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((ProfileNotification) it.next()).getIsNew()) {
                            z3 = true;
                            break;
                        }
                    }
                }
                z3 = false;
                notificationsUiLogic2.f29132o = z3;
                NotificationsPresenter.this.m14707a(relatedReleases.size() + (myCollectionComments.size() + (collectionComments.size() + (releaseComments.size() + (episodes.size() + friends2.size())))) >= 25);
                NotificationsPresenter.this.getViewState().mo14721O();
                return Unit.f63088a;
            }
        }, 2), new C2588a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPresenter$onNotifications$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                NotificationsPresenter.this.getViewState().mo14725c();
                return Unit.f63088a;
            }
        }, 3), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: a */
    public final void m14707a(boolean z) {
        NotificationsUiController notificationsUiController = this.f26480e;
        NotificationsUiLogic notificationsUiLogic = this.f26479d;
        notificationsUiController.setData(notificationsUiLogic.f29131n, Integer.valueOf(notificationsUiLogic.f29120c), Boolean.valueOf(this.f26479d.f29121d), Boolean.valueOf(this.f26479d.f29122e), Boolean.valueOf(this.f26479d.f29123f), Boolean.valueOf(this.f26479d.f29124g), Boolean.valueOf(z), this.f26478c);
    }

    /* renamed from: b */
    public final boolean m14708b() {
        return this.f26480e.isEmpty();
    }

    /* renamed from: c */
    public final void m14709c() {
        NotificationRepository notificationRepository = this.f26477b;
        notificationRepository.f27368a.deleteAll(notificationRepository.f27369b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2588a(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPresenter$onDeleteAllNotifications$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                NotificationsPresenter.this.m14711f();
                return Unit.f63088a;
            }
        }, 4), new C2588a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPresenter$onDeleteAllNotifications$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 5), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: d */
    public final void m14710d(long j2) {
        Observable<Response> observable;
        Object obj;
        Iterator<T> it = this.f26479d.f29131n.iterator();
        while (true) {
            observable = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((ProfileNotification) obj).getId() == j2) {
                    break;
                }
            }
        }
        ProfileNotification profileNotification = (ProfileNotification) obj;
        if (profileNotification instanceof ProfileFriendNotification) {
            NotificationRepository notificationRepository = this.f26477b;
            observable = notificationRepository.f27368a.deleteFriendNotification(j2, notificationRepository.f27369b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        } else if (profileNotification instanceof ProfileEpisodeNotification) {
            NotificationRepository notificationRepository2 = this.f26477b;
            observable = notificationRepository2.f27368a.deleteEpisodeNotification(j2, notificationRepository2.f27369b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        } else if (profileNotification instanceof ProfileReleaseCommentNotification) {
            NotificationRepository notificationRepository3 = this.f26477b;
            observable = notificationRepository3.f27368a.deleteReleaseCommentNotification(j2, notificationRepository3.f27369b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        } else if (profileNotification instanceof ProfileCollectionCommentNotification) {
            NotificationRepository notificationRepository4 = this.f26477b;
            observable = notificationRepository4.f27368a.deleteCollectionCommentNotification(j2, notificationRepository4.f27369b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        } else if (profileNotification instanceof ProfileMyCollectionCommentNotification) {
            NotificationRepository notificationRepository5 = this.f26477b;
            observable = notificationRepository5.f27368a.deleteMyCollectionCommentNotification(j2, notificationRepository5.f27369b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        } else if (profileNotification instanceof ProfileRelatedReleaseNotification) {
            NotificationRepository notificationRepository6 = this.f26477b;
            observable = notificationRepository6.f27368a.deleteRelatedReleaseNotification(j2, notificationRepository6.f27369b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        }
        if (observable != null) {
            observable.m31370l(new C2588a(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPresenter$onDeleteNotification$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Response response) {
                    NotificationsPresenter.this.m14711f();
                    return Unit.f63088a;
                }
            }, 6), new C2588a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPresenter$onDeleteNotification$2
                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Throwable th) {
                    th.printStackTrace();
                    return Unit.f63088a;
                }
            }, 7), Functions.f59621b, Functions.f59622c);
        }
    }

    /* renamed from: f */
    public final void m14711f() {
        NotificationsUiLogic notificationsUiLogic = this.f26479d;
        if (notificationsUiLogic.f28956a) {
            notificationsUiLogic.m15685a();
            if (m14708b()) {
                m14706e(this, false, false, 3);
            } else {
                m14706e(this, false, false, 2);
            }
        }
    }
}
