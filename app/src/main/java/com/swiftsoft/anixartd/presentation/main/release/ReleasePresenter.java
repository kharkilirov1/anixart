package com.swiftsoft.anixartd.presentation.main.release;

import android.widget.ImageView;
import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.ProfileReleaseTypeNotificationPreference;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import com.swiftsoft.anixartd.database.entity.ReleaseVideoBanner;
import com.swiftsoft.anixartd.database.entity.episode.Type;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.network.response.collection.ReleaseAddCollectionResponse;
import com.swiftsoft.anixartd.network.response.common.TypeResponse;
import com.swiftsoft.anixartd.network.response.preferences.ProfileReleaseTypeNotificationPreferencesResponse;
import com.swiftsoft.anixartd.network.response.release.DeleteVoteReleaseResponse;
import com.swiftsoft.anixartd.network.response.release.ReleaseResponse;
import com.swiftsoft.anixartd.network.response.release.VoteReleaseResponse;
import com.swiftsoft.anixartd.network.response.release.comment.ReleaseCommentAddResponse;
import com.swiftsoft.anixartd.network.response.release.comment.ReleaseCommentDeleteResponse;
import com.swiftsoft.anixartd.network.response.release.comment.ReleaseCommentEditResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.release.RelatedUiController;
import com.swiftsoft.anixartd.p015ui.controller.main.release.ReleasePopularCommentsUiController;
import com.swiftsoft.anixartd.p015ui.controller.main.release.ReleaseRecommendedUiController;
import com.swiftsoft.anixartd.p015ui.controller.main.release.ReleaseScreenshotsUiController;
import com.swiftsoft.anixartd.p015ui.controller.main.release.ReleaseVideoBannersUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.release.ReleaseUiLogic;
import com.swiftsoft.anixartd.presentation.main.profile.videos.C2609c;
import com.swiftsoft.anixartd.repository.AuthRepository;
import com.swiftsoft.anixartd.repository.CollectionRepository;
import com.swiftsoft.anixartd.repository.NotificationPreferenceRepository;
import com.swiftsoft.anixartd.repository.ReleaseCommentRepository;
import com.swiftsoft.anixartd.repository.ReleaseRepository;
import com.swiftsoft.anixartd.repository.TypeRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnFetchRelease;
import com.swiftsoft.anixartd.utils.OnFetchReleaseComment;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
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
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleasePresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/release/ReleasePresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/release/ReleaseView;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReleasePresenter extends MvpPresenter<ReleaseView> {

    /* renamed from: a */
    @NotNull
    public AuthRepository f26937a;

    /* renamed from: b */
    @NotNull
    public TypeRepository f26938b;

    /* renamed from: c */
    @NotNull
    public ReleaseRepository f26939c;

    /* renamed from: d */
    @NotNull
    public ReleaseCommentRepository f26940d;

    /* renamed from: e */
    @NotNull
    public CollectionRepository f26941e;

    /* renamed from: f */
    @NotNull
    public NotificationPreferenceRepository f26942f;

    /* renamed from: g */
    @NotNull
    public Prefs f26943g;

    /* renamed from: h */
    @NotNull
    public ReleaseUiLogic f26944h;

    /* renamed from: i */
    @NotNull
    public ReleaseVideoBannersUiController f26945i;

    /* renamed from: j */
    @NotNull
    public ReleaseScreenshotsUiController f26946j;

    /* renamed from: k */
    @NotNull
    public RelatedUiController f26947k;

    /* renamed from: l */
    @NotNull
    public ReleaseRecommendedUiController f26948l;

    /* renamed from: m */
    @NotNull
    public ReleasePopularCommentsUiController f26949m;

    /* renamed from: n */
    @NotNull
    public Listener f26950n;

    /* compiled from: ReleasePresenter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/release/ReleasePresenter$Companion;", "", "", "COMMENT_DELETED", "I", "COMMENT_SENT", "NOTHING", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: ReleasePresenter.kt */
    @Metadata(m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/release/ReleasePresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseVideoBannersUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseScreenshotsUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/release/RelatedUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleasePopularCommentsUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseRecommendedUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ReleaseVideoBannersUiController.Listener, ReleaseScreenshotsUiController.Listener, RelatedUiController.Listener, ReleasePopularCommentsUiController.Listener, ReleaseRecommendedUiController.Listener {
    }

    @Inject
    public ReleasePresenter(@NotNull AuthRepository authRepository, @NotNull TypeRepository typeRepository, @NotNull ReleaseRepository releaseRepository, @NotNull ReleaseCommentRepository releaseCommentRepository, @NotNull CollectionRepository collectionRepository, @NotNull NotificationPreferenceRepository notificationPreferenceRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(authRepository, "authRepository");
        Intrinsics.m32179h(typeRepository, "typeRepository");
        Intrinsics.m32179h(releaseRepository, "releaseRepository");
        Intrinsics.m32179h(releaseCommentRepository, "releaseCommentRepository");
        Intrinsics.m32179h(collectionRepository, "collectionRepository");
        Intrinsics.m32179h(notificationPreferenceRepository, "notificationPreferenceRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26937a = authRepository;
        this.f26938b = typeRepository;
        this.f26939c = releaseRepository;
        this.f26940d = releaseCommentRepository;
        this.f26941e = collectionRepository;
        this.f26942f = notificationPreferenceRepository;
        this.f26943g = prefs;
        this.f26944h = new ReleaseUiLogic();
        this.f26945i = new ReleaseVideoBannersUiController();
        this.f26946j = new ReleaseScreenshotsUiController();
        this.f26947k = new RelatedUiController();
        this.f26948l = new ReleaseRecommendedUiController();
        this.f26949m = new ReleasePopularCommentsUiController();
        this.f26950n = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.release.ReleaseVideoCategoryBannerModel.Listener
            /* renamed from: I0 */
            public void mo15028I0(long j2, long j3, @NotNull String value, @NotNull String name) {
                Intrinsics.m32179h(value, "value");
                Intrinsics.m32179h(name, "name");
                ReleasePresenter.this.getViewState().mo15039I0(j2, j3, value, name);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.release.ScreenshotModel.Listener
            /* renamed from: P0 */
            public void mo15029P0(@NotNull String screenshot, @NotNull ImageView imageView) {
                Intrinsics.m32179h(screenshot, "screenshot");
                ReleasePresenter.this.getViewState().mo15041P0(screenshot, imageView);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.release.ReleaseVideoMoreBannerModel.Listener
            /* renamed from: Y0 */
            public void mo15030Y0(long j2) {
                ReleasePresenter.this.getViewState().mo15047Y0(j2);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.release.RecommendedModel.Listener
            /* renamed from: a */
            public void mo15031a(long j2) {
                Object obj;
                Iterator<T> it = ReleasePresenter.this.f26944h.f29303q.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((Release) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                if (((Release) obj) != null) {
                    ReleasePresenter.this.getViewState().mo15057g(j2);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentModel.Listener
            /* renamed from: b */
            public void mo14426b(long j2) {
                Object obj;
                Iterator<T> it = ReleasePresenter.this.f26944h.f29304r.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((ReleaseComment) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                ReleaseComment releaseComment = (ReleaseComment) obj;
                if (releaseComment == null || releaseComment.getIsDeleted()) {
                    return;
                }
                ReleasePresenter.this.getViewState().mo15044U(releaseComment);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentModel.Listener
            /* renamed from: c */
            public void mo14427c(long j2) {
                Object obj;
                Iterator<T> it = ReleasePresenter.this.f26944h.f29304r.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((ReleaseComment) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                ReleaseComment releaseComment = (ReleaseComment) obj;
                if (releaseComment != null) {
                    ReleasePresenter.this.getViewState().mo15046X(releaseComment);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentModel.Listener
            /* renamed from: e */
            public void mo14428e(long j2) {
                Object obj;
                Iterator<T> it = ReleasePresenter.this.f26944h.f29304r.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((ReleaseComment) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                ReleaseComment releaseComment = (ReleaseComment) obj;
                if (releaseComment != null) {
                    ReleasePresenter.this.getViewState().mo15074z0(releaseComment);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentModel.Listener
            /* renamed from: f */
            public void mo14429f(long j2) {
                ReleasePresenter.this.getViewState().mo15056f(j2);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.release.RelatedCompactModel.Listener
            /* renamed from: g */
            public void mo15032g(long j2) {
                Object obj;
                Iterator<T> it = ReleasePresenter.this.f26944h.f29302p.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((Release) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                if (((Release) obj) != null) {
                    ReleasePresenter.this.getViewState().mo15057g(j2);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentModel.Listener
            /* renamed from: h */
            public void mo14430h(long j2, int i2) {
                Object obj;
                if (ReleasePresenter.this.m15015b()) {
                    ReleasePresenter.this.getViewState().mo15060m();
                    return;
                }
                Iterator<T> it = ReleasePresenter.this.f26944h.f29304r.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((ReleaseComment) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                ReleaseComment releaseComment = (ReleaseComment) obj;
                if (releaseComment != null) {
                    ReleasePresenter.this.getViewState().mo15045W(releaseComment, i2);
                }
            }
        };
    }

    /* renamed from: l */
    public static void m15012l(final ReleasePresenter releasePresenter, final int i2, final boolean z, final boolean z2, int i3) {
        Observable<ReleaseResponse> m31369k;
        if ((i3 & 1) != 0) {
            i2 = 1;
        }
        if ((i3 & 2) != 0) {
            z = releasePresenter.m15014a();
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        ReleaseUiLogic releaseUiLogic = releasePresenter.f26944h;
        int i4 = releaseUiLogic.f29295i;
        if (i4 == 1) {
            ReleaseRepository releaseRepository = releasePresenter.f26939c;
            Boolean EXTENDED_MODE = Boolean.TRUE;
            Intrinsics.m32178g(EXTENDED_MODE, "EXTENDED_MODE");
            m31369k = releaseRepository.f27382a.random(true, releaseRepository.f27383b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        } else if (i4 == 2) {
            ReleaseRepository releaseRepository2 = releasePresenter.f26939c;
            long j2 = releaseUiLogic.f29296j;
            int i5 = releaseUiLogic.f29297k;
            Boolean EXTENDED_MODE2 = Boolean.TRUE;
            Intrinsics.m32178g(EXTENDED_MODE2, "EXTENDED_MODE");
            m31369k = releaseRepository2.f27382a.randomProfileList(j2, i5, true, releaseRepository2.f27383b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        } else if (i4 == 3) {
            ReleaseRepository releaseRepository3 = releasePresenter.f26939c;
            Boolean EXTENDED_MODE3 = Boolean.TRUE;
            Intrinsics.m32178g(EXTENDED_MODE3, "EXTENDED_MODE");
            m31369k = releaseRepository3.f27382a.randomFavorite(true, releaseRepository3.f27383b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        } else if (i4 != 4) {
            ReleaseRepository releaseRepository4 = releasePresenter.f26939c;
            long j3 = releaseUiLogic.f29288b;
            Boolean EXTENDED_MODE4 = Boolean.TRUE;
            Intrinsics.m32178g(EXTENDED_MODE4, "EXTENDED_MODE");
            m31369k = releaseRepository4.f27382a.release(j3, true, releaseRepository4.f27383b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        } else {
            ReleaseRepository releaseRepository5 = releasePresenter.f26939c;
            long j4 = releaseUiLogic.f29298l;
            Boolean EXTENDED_MODE5 = Boolean.TRUE;
            Intrinsics.m32178g(EXTENDED_MODE5, "EXTENDED_MODE");
            m31369k = releaseRepository5.f27382a.randomCollection(j4, true, releaseRepository5.f27383b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        }
        m31369k.m31367i(new C2614b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onRelease$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    releasePresenter.getViewState().mo15050b();
                }
                if (z2) {
                    releasePresenter.getViewState().mo15053d();
                }
                return Unit.f63088a;
            }
        }, 7)).m31368j(new C2613a(releasePresenter, 2)).m31370l(new C2614b(new Function1<ReleaseResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onRelease$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ReleaseResponse releaseResponse) {
                ReleaseResponse releaseResponse2 = releaseResponse;
                if (releaseResponse2.isSuccess()) {
                    Release release = releaseResponse2.getRelease();
                    if (release == null) {
                        ReleasePresenter.this.getViewState().mo15051c();
                    } else {
                        int profileReleaseTypeNotificationPreferenceCount = release.getProfileReleaseTypeNotificationPreferenceCount();
                        ReleaseUiLogic releaseUiLogic2 = ReleasePresenter.this.f26944h;
                        Objects.requireNonNull(releaseUiLogic2);
                        releaseUiLogic2.f29289c = release;
                        releaseUiLogic2.f29293g = profileReleaseTypeNotificationPreferenceCount;
                        releaseUiLogic2.f29294h = release.getIsReleaseTypeNotificationsEnabled();
                        List<ReleaseVideoBanner> videoBanners = release.getVideoBanners();
                        Intrinsics.m32179h(videoBanners, "videoBanners");
                        if (releaseUiLogic2.f29305s) {
                            releaseUiLogic2.f29300n.clear();
                        }
                        releaseUiLogic2.f29300n.addAll(videoBanners);
                        releaseUiLogic2.f29305s = true;
                        List<String> screenshots = release.getScreenshotImages();
                        Intrinsics.m32179h(screenshots, "screenshots");
                        if (releaseUiLogic2.f29306t) {
                            releaseUiLogic2.f29301o.clear();
                        }
                        releaseUiLogic2.f29301o.addAll(screenshots);
                        releaseUiLogic2.f29306t = true;
                        List<Release> relatedReleases = release.getRelatedReleases();
                        Intrinsics.m32179h(relatedReleases, "relatedReleases");
                        if (releaseUiLogic2.f29307u) {
                            releaseUiLogic2.f29302p.clear();
                        }
                        releaseUiLogic2.f29302p.addAll(relatedReleases);
                        releaseUiLogic2.f29307u = true;
                        List<Release> recommendedReleases = release.getRecommendedReleases();
                        Intrinsics.m32179h(recommendedReleases, "recommendedReleases");
                        if (releaseUiLogic2.f29308v) {
                            releaseUiLogic2.f29303q.clear();
                        }
                        releaseUiLogic2.f29303q.addAll(recommendedReleases);
                        releaseUiLogic2.f29308v = true;
                        List<ReleaseComment> releaseComments = release.getComments();
                        Intrinsics.m32179h(releaseComments, "releaseComments");
                        if (releaseUiLogic2.f29309w) {
                            releaseUiLogic2.f29304r.clear();
                        }
                        releaseUiLogic2.f29304r.addAll(releaseComments);
                        releaseUiLogic2.f29309w = true;
                        ReleasePresenter.this.f26944h.f29288b = release.getId();
                        ReleasePresenter releasePresenter2 = ReleasePresenter.this;
                        ReleaseVideoBannersUiController releaseVideoBannersUiController = releasePresenter2.f26945i;
                        ReleaseUiLogic releaseUiLogic3 = releasePresenter2.f26944h;
                        releaseVideoBannersUiController.setData(releaseUiLogic3.f29300n, Long.valueOf(releaseUiLogic3.f29288b), ReleasePresenter.this.f26950n);
                        ReleasePresenter releasePresenter3 = ReleasePresenter.this;
                        releasePresenter3.f26946j.setData(releasePresenter3.f26944h.f29301o, releasePresenter3.f26950n);
                        RelatedUiController relatedUiController = ReleasePresenter.this.f26947k;
                        Long valueOf = Long.valueOf(release.getId());
                        ReleasePresenter releasePresenter4 = ReleasePresenter.this;
                        relatedUiController.setData(valueOf, releasePresenter4.f26944h.f29302p, releasePresenter4.f26950n);
                        ReleaseRecommendedUiController releaseRecommendedUiController = ReleasePresenter.this.f26948l;
                        Long valueOf2 = Long.valueOf(release.getId());
                        ReleasePresenter releasePresenter5 = ReleasePresenter.this;
                        releaseRecommendedUiController.setData(valueOf2, releasePresenter5.f26944h.f29303q, releasePresenter5.f26950n);
                        ReleasePresenter releasePresenter6 = ReleasePresenter.this;
                        releasePresenter6.f26949m.setData(releasePresenter6.f26944h.f29304r, releasePresenter6.f26950n);
                        int i6 = i2;
                        if (i6 == 2) {
                            ReleasePresenter.this.getViewState().mo15034B();
                        } else if (i6 == 3) {
                            ReleasePresenter.this.getViewState().mo15037F();
                        }
                        ReleasePresenter.this.getViewState().mo15072x3(ReleasePresenter.this.f26944h.m15701a());
                    }
                } else {
                    ReleasePresenter.this.getViewState().mo15066q2();
                }
                return Unit.f63088a;
            }
        }, 8), new C2614b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onRelease$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ReleasePresenter.this.getViewState().mo15051c();
                return Unit.f63088a;
            }
        }, 9), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: n */
    public static /* synthetic */ void m15013n(ReleasePresenter releasePresenter, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i2 = 1;
        }
        releasePresenter.m15025m(i2);
    }

    /* renamed from: a */
    public final boolean m15014a() {
        return !this.f26944h.m15702b();
    }

    /* renamed from: b */
    public final boolean m15015b() {
        return this.f26943g.m14083z();
    }

    /* renamed from: c */
    public final void m15016c(@NotNull final Collection collection, @NotNull Release release) {
        Intrinsics.m32179h(collection, "collection");
        CollectionRepository collectionRepository = this.f26941e;
        collectionRepository.f27337b.releaseAdd(collection.getId(), release.getId(), collectionRepository.f27339d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2614b(new Function1<ReleaseAddCollectionResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onAddCollectionRelease$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ReleaseAddCollectionResponse releaseAddCollectionResponse) {
                ReleaseAddCollectionResponse releaseAddCollectionResponse2 = releaseAddCollectionResponse;
                int code = releaseAddCollectionResponse2.getCode();
                if (code == 5) {
                    ReleasePresenter.this.getViewState().mo15061m3();
                } else if (code == 7) {
                    ReleasePresenter.this.getViewState().mo15070w3();
                } else if (releaseAddCollectionResponse2.isSuccess()) {
                    ReleasePresenter.this.getViewState().mo15035C3(collection);
                }
                return Unit.f63088a;
            }
        }, 10), new C2614b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onAddCollectionRelease$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ReleasePresenter.this.getViewState().mo15069u1();
                return Unit.f63088a;
            }
        }, 11), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: d */
    public final void m15017d(@NotNull String str) {
        Observable m15308a;
        ReleaseCommentRepository releaseCommentRepository = this.f26940d;
        ReleaseUiLogic releaseUiLogic = this.f26944h;
        m15308a = releaseCommentRepository.m15308a(releaseUiLogic.f29288b, null, null, str, releaseUiLogic.f29310x);
        m15308a.m31367i(new C2614b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onAddComment$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                ReleasePresenter.this.getViewState().mo15067s();
                return Unit.f63088a;
            }
        }, 17)).m31368j(new C2613a(this, 4)).m31370l(new C2614b(new Function1<ReleaseCommentAddResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onAddComment$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ReleaseCommentAddResponse releaseCommentAddResponse) {
                ReleaseCommentAddResponse releaseCommentAddResponse2 = releaseCommentAddResponse;
                int code = releaseCommentAddResponse2.getCode();
                if (code == 7) {
                    ReleasePresenter.this.getViewState().mo15033A();
                } else if (code == 402) {
                    ReleasePresenter.this.getViewState().mo15063o();
                } else if (releaseCommentAddResponse2.getComment() == null) {
                    ReleasePresenter.this.getViewState().mo15051c();
                } else {
                    ReleasePresenter.this.m15025m(2);
                }
                return Unit.f63088a;
            }
        }, 18), new C2614b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onAddComment$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ReleasePresenter.this.getViewState().mo15051c();
                return Unit.f63088a;
            }
        }, 19), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: e */
    public final void m15018e() {
        Observables.f62894a.m31860a(this.f26938b.m15316a(), this.f26942f.m15299b(this.f26944h.f29288b)).m31367i(new C2614b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onChooseTypeDialog$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                ReleasePresenter.this.getViewState().mo15058h();
                return Unit.f63088a;
            }
        }, 1)).m31368j(new C2613a(this, 0)).m31370l(new C2614b(new Function1<Pair<? extends TypeResponse, ? extends ProfileReleaseTypeNotificationPreferencesResponse>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onChooseTypeDialog$3
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Pair<? extends TypeResponse, ? extends ProfileReleaseTypeNotificationPreferencesResponse> pair) {
                Pair<? extends TypeResponse, ? extends ProfileReleaseTypeNotificationPreferencesResponse> pair2 = pair;
                TypeResponse typeResponse = (TypeResponse) pair2.f63055b;
                ProfileReleaseTypeNotificationPreferencesResponse profileReleaseTypeNotificationPreferencesResponse = (ProfileReleaseTypeNotificationPreferencesResponse) pair2.f63056c;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Type type : typeResponse.getTypes()) {
                    arrayList.add(type.getName());
                    arrayList2.add(String.valueOf(type.getId()));
                }
                List<ProfileReleaseTypeNotificationPreference> profileReleaseTypeNotificationPreferences = profileReleaseTypeNotificationPreferencesResponse.getProfileReleaseTypeNotificationPreferences();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.m32032m(profileReleaseTypeNotificationPreferences, 10));
                Iterator<T> it = profileReleaseTypeNotificationPreferences.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Long.valueOf(((ProfileReleaseTypeNotificationPreference) it.next()).getType().getId()));
                }
                ReleaseUiLogic releaseUiLogic = ReleasePresenter.this.f26944h;
                Object[] array = arrayList.toArray(new String[0]);
                Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                Objects.requireNonNull(releaseUiLogic);
                releaseUiLogic.f29290d = (String[]) array;
                Object[] array2 = arrayList2.toArray(new String[0]);
                Intrinsics.m32177f(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                releaseUiLogic.f29291e = (String[]) array2;
                releaseUiLogic.f29292f.addAll(arrayList3);
                releaseUiLogic.f29299m = true;
                ReleasePresenter.this.getViewState().mo15042P3();
                return Unit.f63088a;
            }
        }, 2), new C2614b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onChooseTypeDialog$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ReleasePresenter.this.getViewState().mo15051c();
                return Unit.f63088a;
            }
        }, 3), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: f */
    public final void m15019f(@NotNull final ReleaseComment releaseComment) {
        this.f26940d.m15309c(releaseComment.getId()).m31370l(new C2614b(new Function1<ReleaseCommentDeleteResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onDeleteComment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ReleaseCommentDeleteResponse releaseCommentDeleteResponse) {
                if (releaseCommentDeleteResponse.isSuccess()) {
                    ReleaseComment.this.setDeleted(true);
                    this.f26944h.m15703c(ReleaseComment.this);
                    this.m15025m(3);
                    EventBusKt.m16327a(new OnFetchReleaseComment(ReleaseComment.this));
                }
                return Unit.f63088a;
            }
        }, 20), new C2614b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onDeleteComment$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 21), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: g */
    public final void m15020g() {
        this.f26939c.m15313a(this.f26944h.f29288b).m31367i(new C2614b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onDeleteVote$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                ReleasePresenter.this.getViewState().mo15068s1();
                return Unit.f63088a;
            }
        }, 12)).m31368j(new C2613a(this, 3)).m31370l(new C2614b(new Function1<DeleteVoteReleaseResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onDeleteVote$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DeleteVoteReleaseResponse deleteVoteReleaseResponse) {
                if (deleteVoteReleaseResponse.isSuccess()) {
                    ReleasePresenter.m15013n(ReleasePresenter.this, 0, 1);
                    Release m15701a = ReleasePresenter.this.f26944h.m15701a();
                    m15701a.setMyVote(null);
                    m15701a.setVotedAt(0L);
                    EventBusKt.m16327a(new OnFetchRelease(m15701a));
                }
                return Unit.f63088a;
            }
        }, 13), new C2614b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onDeleteVote$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ReleasePresenter.this.getViewState().mo15064p1();
                return Unit.f63088a;
            }
        }, 14), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: h */
    public final void m15021h(@NotNull final ReleaseComment releaseComment, @NotNull final String message, boolean z) {
        Intrinsics.m32179h(releaseComment, "releaseComment");
        Intrinsics.m32179h(message, "message");
        this.f26940d.m15310d(releaseComment.getId(), message, z).m31370l(new C2614b(new Function1<ReleaseCommentEditResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onEditComment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ReleaseCommentEditResponse releaseCommentEditResponse) {
                if (releaseCommentEditResponse.isSuccess()) {
                    ReleaseComment.this.setMessage(message);
                    ReleaseComment.this.setEdited(true);
                    this.m15022i(ReleaseComment.this);
                }
                return Unit.f63088a;
            }
        }, 15), new C2614b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onEditComment$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 16), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: i */
    public final void m15022i(@NotNull ReleaseComment releaseComment) {
        boolean z;
        Intrinsics.m32179h(releaseComment, "releaseComment");
        if (this.f26944h.f28956a) {
            if (releaseComment.getIsDeleted()) {
                z = this.f26944h.m15703c(releaseComment);
            } else {
                ReleaseUiLogic releaseUiLogic = this.f26944h;
                Objects.requireNonNull(releaseUiLogic);
                Iterator<ReleaseComment> it = releaseUiLogic.f29304r.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    } else {
                        if (it.next().getId() == releaseComment.getId()) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (i2 >= 0) {
                    releaseUiLogic.f29304r.set(i2, releaseComment);
                }
                z = i2 >= 0;
            }
            if (z) {
                this.f26949m.setData(this.f26944h.f29304r, this.f26950n);
            }
        }
    }

    /* renamed from: j */
    public final void m15023j(long j2, @NotNull final String str, @Nullable String str2, @Nullable Long l2, final boolean z, final boolean z2, boolean z3) {
        Object obj;
        Iterator<T> it = this.f26944h.f29304r.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((ReleaseComment) obj).getId() == j2) {
                    break;
                }
            }
        }
        final ReleaseComment releaseComment = (ReleaseComment) obj;
        if (releaseComment == null) {
            return;
        }
        this.f26940d.m15311e(j2, str, str2, l2, z, z2, z3).m31370l(new C2609c(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onProcessComment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                if (response.isSuccess()) {
                    ReleaseComment.this.setMessage(str);
                    ReleaseComment.this.setSpoiler(z);
                    ReleaseComment.this.setDeleted(z2);
                    ReleaseComment.this.setEdited(true);
                    if (z2) {
                        this.f26944h.m15703c(ReleaseComment.this);
                        this.m15025m(3);
                    }
                    EventBusKt.m16327a(new OnFetchReleaseComment(ReleaseComment.this));
                }
                return Unit.f63088a;
            }
        }, 29), new C2614b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onProcessComment$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 0), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: k */
    public final void m15024k() {
        NotificationPreferenceRepository notificationPreferenceRepository = this.f26942f;
        ReleaseUiLogic releaseUiLogic = this.f26944h;
        notificationPreferenceRepository.m15300c(releaseUiLogic.f29288b, releaseUiLogic.f29292f).m31370l(new C2609c(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onProfileReleaseTypeNotificationPreferencesEdit$1
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                response.isSuccess();
                return Unit.f63088a;
            }
        }, 27), new C2609c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onProfileReleaseTypeNotificationPreferencesEdit$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ReleasePresenter.this.getViewState().mo15051c();
                return Unit.f63088a;
            }
        }, 28), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: m */
    public final void m15025m(int i2) {
        ReleaseUiLogic releaseUiLogic = this.f26944h;
        if (releaseUiLogic.f28956a) {
            releaseUiLogic.f29299m = false;
            releaseUiLogic.f29292f.clear();
            releaseUiLogic.f29301o.clear();
            releaseUiLogic.f29304r.clear();
            if (m15014a()) {
                m15012l(this, i2, false, false, 6);
            } else {
                m15012l(this, i2, false, false, 4);
            }
        }
    }

    /* renamed from: o */
    public final void m15026o(final int i2) {
        this.f26939c.m15314b(this.f26944h.f29288b, i2).m31367i(new C2614b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onVote$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                ReleasePresenter.this.getViewState().mo15073y1();
                return Unit.f63088a;
            }
        }, 4)).m31368j(new C2613a(this, 1)).m31370l(new C2614b(new Function1<VoteReleaseResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onVote$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(VoteReleaseResponse voteReleaseResponse) {
                if (voteReleaseResponse.isSuccess()) {
                    ReleasePresenter.this.f26944h.m15701a().setYourVote(Integer.valueOf(i2));
                    ReleasePresenter.m15013n(ReleasePresenter.this, 0, 1);
                    Release m15701a = ReleasePresenter.this.f26944h.m15701a();
                    m15701a.setMyVote(Integer.valueOf(i2));
                    m15701a.setVotedAt(System.currentTimeMillis() / 1000);
                    EventBusKt.m16327a(new OnFetchRelease(m15701a));
                }
                return Unit.f63088a;
            }
        }, 5), new C2614b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onVote$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ReleasePresenter.this.getViewState().mo15069u1();
                return Unit.f63088a;
            }
        }, 6), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: p */
    public final void m15027p(@NotNull final ReleaseComment releaseComment, final int i2) {
        this.f26940d.m15312f(releaseComment.getId(), i2).m31370l(new C2609c(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onVoteComment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                Response response2 = response;
                int code = response2.getCode();
                if (code == 2) {
                    ReleasePresenter.this.getViewState().mo15071x();
                } else if (code == 402) {
                    ReleasePresenter.this.getViewState().mo15038G();
                } else if (response2.isSuccess()) {
                    int vote = releaseComment.getVote();
                    if (vote == 0) {
                        int i3 = i2;
                        if (i3 == 1) {
                            releaseComment.setVote(1);
                            ReleaseComment releaseComment2 = releaseComment;
                            releaseComment2.setVoteCount(releaseComment2.getVoteCount() - 1);
                        } else if (i3 == 2) {
                            releaseComment.setVote(2);
                            ReleaseComment releaseComment3 = releaseComment;
                            releaseComment3.setVoteCount(releaseComment3.getVoteCount() + 1);
                        }
                    } else if (vote == 1) {
                        int i4 = i2;
                        if (i4 == 1) {
                            releaseComment.setVote(0);
                            ReleaseComment releaseComment4 = releaseComment;
                            releaseComment4.setVoteCount(releaseComment4.getVoteCount() + 1);
                        } else if (i4 == 2) {
                            releaseComment.setVote(2);
                            ReleaseComment releaseComment5 = releaseComment;
                            releaseComment5.setVoteCount(releaseComment5.getVoteCount() + 2);
                        }
                    } else if (vote == 2) {
                        int i5 = i2;
                        if (i5 == 1) {
                            releaseComment.setVote(1);
                            ReleaseComment releaseComment6 = releaseComment;
                            releaseComment6.setVoteCount(releaseComment6.getVoteCount() - 2);
                        } else if (i5 == 2) {
                            releaseComment.setVote(0);
                            ReleaseComment releaseComment7 = releaseComment;
                            releaseComment7.setVoteCount(releaseComment7.getVoteCount() - 1);
                        }
                    }
                    ReleasePresenter.this.m15022i(releaseComment);
                }
                return Unit.f63088a;
            }
        }, 25), new C2609c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter$onVoteComment$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 26), Functions.f59621b, Functions.f59622c);
    }
}
