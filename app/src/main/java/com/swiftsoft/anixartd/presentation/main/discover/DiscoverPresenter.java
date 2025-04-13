package com.swiftsoft.anixartd.presentation.main.discover;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Interesting;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.discover.CollectionWeekUiController;
import com.swiftsoft.anixartd.p015ui.controller.main.discover.CommentWeekUiController;
import com.swiftsoft.anixartd.p015ui.controller.main.discover.DiscussingUiController;
import com.swiftsoft.anixartd.p015ui.controller.main.discover.InterestingUiController;
import com.swiftsoft.anixartd.p015ui.controller.main.discover.RecommendationsUiController;
import com.swiftsoft.anixartd.p015ui.controller.main.discover.SocialSuperMenuUiController;
import com.swiftsoft.anixartd.p015ui.controller.main.discover.SuperMenuUiController;
import com.swiftsoft.anixartd.p015ui.controller.main.discover.WatchingUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.discover.DiscoverUiLogic;
import com.swiftsoft.anixartd.presentation.auth.restore.C2549a;
import com.swiftsoft.anixartd.presentation.main.collection.comments.replies.C2561b;
import com.swiftsoft.anixartd.repository.CollectionRepository;
import com.swiftsoft.anixartd.repository.DiscoverRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomSheet;
import com.swiftsoft.anixartd.utils.Sixtuple;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function6;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;

/* compiled from: DiscoverPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/discover/DiscoverPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/discover/DiscoverView;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DiscoverPresenter extends MvpPresenter<DiscoverView> {

    /* renamed from: a */
    @NotNull
    public DiscoverRepository f26228a;

    /* renamed from: b */
    @NotNull
    public CollectionRepository f26229b;

    /* renamed from: c */
    @NotNull
    public Prefs f26230c;

    /* renamed from: d */
    @NotNull
    public Listener f26231d;

    /* renamed from: e */
    @NotNull
    public DiscoverUiLogic f26232e;

    /* renamed from: f */
    @NotNull
    public SuperMenuUiController f26233f;

    /* renamed from: g */
    @NotNull
    public SocialSuperMenuUiController f26234g;

    /* renamed from: h */
    @NotNull
    public InterestingUiController f26235h;

    /* renamed from: i */
    @NotNull
    public RecommendationsUiController f26236i;

    /* renamed from: j */
    @NotNull
    public WatchingUiController f26237j;

    /* renamed from: k */
    @NotNull
    public DiscussingUiController f26238k;

    /* renamed from: l */
    @NotNull
    public CollectionWeekUiController f26239l;

    /* renamed from: m */
    @NotNull
    public CommentWeekUiController f26240m;

    /* compiled from: DiscoverPresenter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/discover/DiscoverPresenter$Companion;", "", "", "INTEREST_TYPE_LINK", "I", "INTEREST_TYPE_RELEASE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: DiscoverPresenter.kt */
    @Metadata(m31883d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/discover/DiscoverPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/discover/SuperMenuUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/discover/SocialSuperMenuUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/discover/InterestingUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/discover/RecommendationsUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/discover/WatchingUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/discover/DiscussingUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/discover/CommentWeekUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/discover/CollectionWeekUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends SuperMenuUiController.Listener, SocialSuperMenuUiController.Listener, InterestingUiController.Listener, RecommendationsUiController.Listener, WatchingUiController.Listener, DiscussingUiController.Listener, CommentWeekUiController.Listener, CollectionWeekUiController.Listener {
    }

    @Inject
    public DiscoverPresenter(@NotNull DiscoverRepository discoverRepository, @NotNull CollectionRepository collectionRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(discoverRepository, "discoverRepository");
        Intrinsics.m32179h(collectionRepository, "collectionRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26228a = discoverRepository;
        this.f26229b = collectionRepository;
        this.f26230c = prefs;
        this.f26231d = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.discover.DiscoverPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.discover.SuperMenuModel.Listener
            /* renamed from: a */
            public void mo14546a(long j2) {
                DiscoverPresenter.this.getViewState().mo14564r2(j2);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.discover.CommentModel.Listener
            /* renamed from: b */
            public void mo14547b(long j2) {
                DiscoverPresenter.this.getViewState().mo14555M2(j2);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.collections.CollectionCompactModel.Listener
            /* renamed from: d0 */
            public void mo14548d0(long j2) {
                DiscoverPresenter.this.getViewState().mo14553I1(j2);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.discover.CommentModel.Listener
            /* renamed from: f */
            public void mo14549f(long j2) {
                DiscoverPresenter.this.getViewState().mo14561f(j2);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.discover.ReleaseCardModel.Listener, com.swiftsoft.anixartd.ui.model.main.discover.DiscussModel.Listener
            /* renamed from: g */
            public void mo14550g(long j2) {
                Object obj;
                Object obj2;
                Object obj3;
                Iterator<T> it = DiscoverPresenter.this.f26232e.f29035d.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (((Release) obj2).getId() == j2) {
                            break;
                        }
                    }
                }
                Release release = (Release) obj2;
                if (release == null) {
                    Iterator<T> it2 = DiscoverPresenter.this.f26232e.f29037f.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj3 = null;
                            break;
                        } else {
                            obj3 = it2.next();
                            if (((Release) obj3).getId() == j2) {
                                break;
                            }
                        }
                    }
                    release = (Release) obj3;
                    if (release == null) {
                        Iterator<T> it3 = DiscoverPresenter.this.f26232e.f29038g.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            Object next = it3.next();
                            if (((Release) next).getId() == j2) {
                                obj = next;
                                break;
                            }
                        }
                        release = (Release) obj;
                    }
                }
                if (release != null) {
                    DiscoverPresenter.this.getViewState().mo14562i(release);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.discover.ReleaseCardModel.Listener, com.swiftsoft.anixartd.ui.model.main.discover.DiscussModel.Listener
            /* renamed from: k */
            public void mo14551k(long j2) {
                Object obj;
                Object obj2;
                Object obj3;
                Iterator<T> it = DiscoverPresenter.this.f26232e.f29035d.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (((Release) obj2).getId() == j2) {
                            break;
                        }
                    }
                }
                Release release = (Release) obj2;
                if (release == null) {
                    Iterator<T> it2 = DiscoverPresenter.this.f26232e.f29037f.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj3 = null;
                            break;
                        } else {
                            obj3 = it2.next();
                            if (((Release) obj3).getId() == j2) {
                                break;
                            }
                        }
                    }
                    release = (Release) obj3;
                    if (release == null) {
                        Iterator<T> it3 = DiscoverPresenter.this.f26232e.f29038g.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            Object next = it3.next();
                            if (((Release) next).getId() == j2) {
                                obj = next;
                                break;
                            }
                        }
                        release = (Release) obj;
                    }
                }
                if (release != null) {
                    EventBusKt.m16327a(new OnBottomSheet(release));
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.discover.InterestingModel.Listener
            /* renamed from: q0 */
            public void mo14552q0(long j2, int i2, @NotNull String action) {
                Intrinsics.m32179h(action, "action");
                DiscoverPresenter.this.getViewState().mo14563q0(j2, i2, action);
            }
        };
        this.f26232e = new DiscoverUiLogic();
        this.f26233f = new SuperMenuUiController();
        this.f26234g = new SocialSuperMenuUiController();
        this.f26235h = new InterestingUiController();
        this.f26236i = new RecommendationsUiController();
        this.f26237j = new WatchingUiController();
        this.f26238k = new DiscussingUiController();
        this.f26239l = new CollectionWeekUiController();
        this.f26240m = new CommentWeekUiController();
    }

    /* renamed from: c */
    public static void m14542c(final DiscoverPresenter discoverPresenter, final boolean z, final boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = discoverPresenter.m14544b();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        Observable<PageableResponse<Release>> m15288a = discoverPresenter.f26228a.m15288a(-1, discoverPresenter.f26232e.f29033b);
        Observable<PageableResponse<Interesting>> interesting = discoverPresenter.f26228a.f27344a.interesting();
        Scheduler scheduler = Schedulers.f62901c;
        Observable<PageableResponse<Interesting>> m31369k = interesting.m31372n(scheduler).m31369k(AndroidSchedulers.m31390a());
        Observable<PageableResponse<Release>> m15289b = discoverPresenter.f26228a.m15289b(0);
        DiscoverRepository discoverRepository = discoverPresenter.f26228a;
        Observable.m31361d(m15288a, m31369k, m15289b, discoverRepository.f27344a.discussing(discoverRepository.f27345b.m14080w()).m31372n(scheduler).m31369k(AndroidSchedulers.m31390a()), discoverPresenter.f26229b.m15285b(-1, discoverPresenter.f26232e.f29034c, 2, 4), discoverPresenter.f26228a.f27344a.commentsWeek().m31372n(scheduler).m31369k(AndroidSchedulers.m31390a()), new Function6<T1, T2, T3, T4, T5, T6, R>() { // from class: com.swiftsoft.anixartd.presentation.main.discover.DiscoverPresenter$onDiscover$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function6
            /* renamed from: a */
            public final R mo14545a(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
                return (R) new Sixtuple((PageableResponse) t1, (PageableResponse) t2, (PageableResponse) t3, (PageableResponse) t4, (PageableResponse) t5, (PageableResponse) t6);
            }
        }).m31367i(new C2561b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.discover.DiscoverPresenter$onDiscover$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    discoverPresenter.getViewState().mo14557b();
                }
                if (z2) {
                    discoverPresenter.getViewState().mo14559d();
                }
                return Unit.f63088a;
            }
        }, 20)).m31365g(new C2549a(discoverPresenter, 6)).m31370l(new C2561b(new Function1<Sixtuple<? extends PageableResponse<Release>, ? extends PageableResponse<Interesting>, ? extends PageableResponse<Release>, ? extends PageableResponse<Release>, ? extends PageableResponse<Collection>, ? extends PageableResponse<ReleaseComment>>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.discover.DiscoverPresenter$onDiscover$4
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Sixtuple<? extends PageableResponse<Release>, ? extends PageableResponse<Interesting>, ? extends PageableResponse<Release>, ? extends PageableResponse<Release>, ? extends PageableResponse<Collection>, ? extends PageableResponse<ReleaseComment>> sixtuple) {
                Sixtuple<? extends PageableResponse<Release>, ? extends PageableResponse<Interesting>, ? extends PageableResponse<Release>, ? extends PageableResponse<Release>, ? extends PageableResponse<Collection>, ? extends PageableResponse<ReleaseComment>> sixtuple2 = sixtuple;
                PageableResponse pageableResponse = (PageableResponse) sixtuple2.f30240b;
                PageableResponse pageableResponse2 = (PageableResponse) sixtuple2.f30241c;
                PageableResponse pageableResponse3 = (PageableResponse) sixtuple2.f30242d;
                PageableResponse pageableResponse4 = (PageableResponse) sixtuple2.f30243e;
                PageableResponse pageableResponse5 = (PageableResponse) sixtuple2.f30244f;
                PageableResponse pageableResponse6 = (PageableResponse) sixtuple2.f30245g;
                DiscoverPresenter.this.f26232e.f29033b = pageableResponse.getCurrentPage();
                DiscoverPresenter.this.f26232e.f29034c = pageableResponse5.getCurrentPage();
                List m32009V = CollectionsKt.m32009V(pageableResponse.getContent());
                List collectionsWeek = pageableResponse5.getTotalPageCount() > 1 ? CollectionsKt.m32009V(pageableResponse5.getContent()) : pageableResponse5.getContent();
                DiscoverUiLogic discoverUiLogic = DiscoverPresenter.this.f26232e;
                List interestings = pageableResponse2.getContent();
                List watching = pageableResponse3.getContent();
                List discussing = pageableResponse4.getContent();
                List commentsWeek = pageableResponse6.getContent();
                Objects.requireNonNull(discoverUiLogic);
                Intrinsics.m32179h(interestings, "interestings");
                Intrinsics.m32179h(watching, "watching");
                Intrinsics.m32179h(discussing, "discussing");
                Intrinsics.m32179h(collectionsWeek, "collectionsWeek");
                Intrinsics.m32179h(commentsWeek, "commentsWeek");
                if (discoverUiLogic.f29041j) {
                    discoverUiLogic.f29036e.clear();
                    discoverUiLogic.f29035d.clear();
                    discoverUiLogic.f29037f.clear();
                    discoverUiLogic.f29038g.clear();
                    discoverUiLogic.f29039h.clear();
                    discoverUiLogic.f29040i.clear();
                    discoverUiLogic.f29041j = false;
                }
                discoverUiLogic.f29036e.addAll(interestings);
                discoverUiLogic.f29035d.addAll(m32009V);
                discoverUiLogic.f29037f.addAll(watching);
                discoverUiLogic.f29038g.addAll(discussing);
                discoverUiLogic.f29039h.addAll(collectionsWeek);
                discoverUiLogic.f29040i.addAll(commentsWeek);
                discoverUiLogic.f29041j = true;
                DiscoverPresenter.this.m14543a();
                DiscoverPresenter.this.getViewState().mo14554J2(pageableResponse.getContent().size(), pageableResponse2.getContent().size(), pageableResponse3.getContent().size(), pageableResponse4.getContent().size(), pageableResponse5.getContent().size(), pageableResponse6.getContent().size());
                return Unit.f63088a;
            }
        }, 21), new C2561b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.discover.DiscoverPresenter$onDiscover$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                DiscoverPresenter.this.getViewState().mo14558c();
                return Unit.f63088a;
            }
        }, 22), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: a */
    public final void m14543a() {
        this.f26236i.setData(this.f26232e.f29035d, this.f26231d);
        this.f26235h.setData(this.f26232e.f29036e, this.f26231d);
        this.f26237j.setData(this.f26232e.f29037f, this.f26231d);
        this.f26238k.setData(this.f26232e.f29038g, this.f26231d);
        this.f26239l.setData(this.f26232e.f29039h, this.f26231d);
        this.f26240m.setData(this.f26232e.f29040i, this.f26231d);
    }

    /* renamed from: b */
    public final boolean m14544b() {
        return this.f26235h.isEmpty() && this.f26236i.isEmpty() && this.f26237j.isEmpty() && this.f26238k.isEmpty() && this.f26240m.isEmpty();
    }
}
