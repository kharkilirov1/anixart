package com.swiftsoft.anixartd.presentation.main.profile.videos;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.release.video.appeal.ReleaseVideoAppealResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.profile.videos.ProfileReleaseVideosTabUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.profile.videos.ProfileReleaseVideosTabUiLogic;
import com.swiftsoft.anixartd.presentation.auth.restore.C2549a;
import com.swiftsoft.anixartd.presentation.main.profile.friends.C2604a;
import com.swiftsoft.anixartd.repository.ReleaseVideoAppealRepository;
import com.swiftsoft.anixartd.repository.ReleaseVideoRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomSheetReleaseVideo;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collection;
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

/* compiled from: ProfileReleaseVideosTabPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/videos/ProfileReleaseVideosTabPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/profile/videos/ProfileReleaseVideosView;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileReleaseVideosTabPresenter extends MvpPresenter<ProfileReleaseVideosView> {

    /* renamed from: a */
    @NotNull
    public ReleaseVideoRepository f26829a;

    /* renamed from: b */
    @NotNull
    public ReleaseVideoAppealRepository f26830b;

    /* renamed from: c */
    @NotNull
    public Prefs f26831c;

    /* renamed from: d */
    @NotNull
    public ProfileReleaseVideosTabUiLogic f26832d;

    /* renamed from: e */
    @NotNull
    public ProfileReleaseVideosTabUiController f26833e;

    /* renamed from: f */
    @NotNull
    public Listener f26834f;

    /* compiled from: ProfileReleaseVideosTabPresenter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/videos/ProfileReleaseVideosTabPresenter$Companion;", "", "", "ACTION_SECTION_VIDEO_APPEALS_MORE", "I", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: ProfileReleaseVideosTabPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/videos/ProfileReleaseVideosTabPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/profile/videos/ProfileReleaseVideosTabUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ProfileReleaseVideosTabUiController.Listener {
    }

    @Inject
    public ProfileReleaseVideosTabPresenter(@NotNull ReleaseVideoRepository releaseVideoRepository, @NotNull ReleaseVideoAppealRepository releaseVideoAppealRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(releaseVideoRepository, "releaseVideoRepository");
        Intrinsics.m32179h(releaseVideoAppealRepository, "releaseVideoAppealRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26829a = releaseVideoRepository;
        this.f26830b = releaseVideoAppealRepository;
        this.f26831c = prefs;
        this.f26832d = new ProfileReleaseVideosTabUiLogic();
        this.f26833e = new ProfileReleaseVideosTabUiController();
        this.f26834f = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosTabPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.release.VideoAppealListItemModel.Listener
            /* renamed from: a */
            public void mo14935a(long j2) {
                Object obj;
                Iterator<T> it = ProfileReleaseVideosTabPresenter.this.f26832d.f29234i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((ReleaseVideo) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                ReleaseVideo releaseVideo = (ReleaseVideo) obj;
                if (releaseVideo != null) {
                    ProfileReleaseVideosTabPresenter.this.getViewState().mo14969x0(releaseVideo);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.release.VideoListItemModel.Listener
            /* renamed from: b */
            public void mo14954b(long j2) {
                Object obj;
                Object obj2;
                Iterator<T> it = ProfileReleaseVideosTabPresenter.this.f26832d.f29232g.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (((ReleaseVideo) obj2).getId() == j2) {
                            break;
                        }
                    }
                }
                ReleaseVideo releaseVideo = (ReleaseVideo) obj2;
                Iterator<T> it2 = ProfileReleaseVideosTabPresenter.this.f26832d.f29233h.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((ReleaseVideo) next).getId() == j2) {
                        obj = next;
                        break;
                    }
                }
                ReleaseVideo releaseVideo2 = (ReleaseVideo) obj;
                if (releaseVideo != null) {
                    EventBusKt.m16327a(new OnBottomSheetReleaseVideo(releaseVideo));
                } else if (releaseVideo2 != null) {
                    EventBusKt.m16327a(new OnBottomSheetReleaseVideo(releaseVideo2));
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.release.VideoAppealListItemModel.Listener
            /* renamed from: d */
            public void mo14936d(long j2) {
                Object obj;
                Iterator<T> it = ProfileReleaseVideosTabPresenter.this.f26832d.f29234i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((ReleaseVideo) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                ReleaseVideo releaseVideo = (ReleaseVideo) obj;
                if (releaseVideo != null) {
                    ProfileReleaseVideosTabPresenter.this.getViewState().mo14956K(releaseVideo);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.release.VideoListItemModel.Listener
            /* renamed from: e */
            public void mo14955e(long j2) {
                Object obj;
                Object obj2;
                Iterator<T> it = ProfileReleaseVideosTabPresenter.this.f26832d.f29232g.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (((ReleaseVideo) obj2).getId() == j2) {
                            break;
                        }
                    }
                }
                ReleaseVideo releaseVideo = (ReleaseVideo) obj2;
                Iterator<T> it2 = ProfileReleaseVideosTabPresenter.this.f26832d.f29233h.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((ReleaseVideo) next).getId() == j2) {
                        obj = next;
                        break;
                    }
                }
                ReleaseVideo releaseVideo2 = (ReleaseVideo) obj;
                if (releaseVideo != null) {
                    ProfileReleaseVideosTabPresenter.this.getViewState().mo14956K(releaseVideo);
                } else if (releaseVideo2 != null) {
                    ProfileReleaseVideosTabPresenter.this.getViewState().mo14956K(releaseVideo2);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.SectionHeaderModel.Listener
            /* renamed from: g */
            public void mo14776g(@Nullable Integer num) {
                if (num != null && num.intValue() == 1) {
                    ProfileReleaseVideosTabPresenter.this.getViewState().mo14958V2();
                }
            }
        };
    }

    /* renamed from: f */
    public static /* synthetic */ void m14946f(ProfileReleaseVideosTabPresenter profileReleaseVideosTabPresenter, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = profileReleaseVideosTabPresenter.m14947a();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        profileReleaseVideosTabPresenter.m14951e(z, z2);
    }

    /* renamed from: a */
    public final boolean m14947a() {
        return this.f26833e.isEmpty();
    }

    /* renamed from: b */
    public final void m14948b(@NotNull final ReleaseVideo releaseVideoAppeal) {
        Intrinsics.m32179h(releaseVideoAppeal, "releaseVideoAppeal");
        this.f26830b.m15315a(releaseVideoAppeal.getId()).m31367i(new C2604a(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosTabPresenter$onDelete$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Disposable disposable) {
                return Unit.f63088a;
            }
        }, 28)).m31368j(C2607a.f26868c).m31370l(new C2604a(new Function1<ReleaseVideoAppealResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosTabPresenter$onDelete$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ReleaseVideoAppealResponse releaseVideoAppealResponse) {
                if (releaseVideoAppealResponse.isSuccess()) {
                    Objects.requireNonNull(ProfileReleaseVideosTabPresenter.this);
                    releaseVideoAppeal.setDelete(true);
                    ProfileReleaseVideosTabPresenter.this.getViewState().mo14957U0(releaseVideoAppeal);
                } else {
                    ProfileReleaseVideosTabPresenter.this.getViewState().mo14967u0();
                }
                return Unit.f63088a;
            }
        }, 29), new C2609c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosTabPresenter$onDelete$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ProfileReleaseVideosTabPresenter.this.getViewState().mo14967u0();
                return Unit.f63088a;
            }
        }, 0), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: c */
    public final void m14949c(@NotNull final ReleaseVideo releaseVideo) {
        Intrinsics.m32179h(releaseVideo, "releaseVideo");
        ProfileReleaseVideosTabUiLogic profileReleaseVideosTabUiLogic = this.f26832d;
        if (profileReleaseVideosTabUiLogic.f28956a) {
            if (Intrinsics.m32174c(profileReleaseVideosTabUiLogic.f29228c, "INNER_TAB_PROFILE_VIDEOS_ALL")) {
                int i2 = 0;
                if (releaseVideo.getIsFavorite()) {
                    ProfileReleaseVideosTabUiLogic profileReleaseVideosTabUiLogic2 = this.f26832d;
                    profileReleaseVideosTabUiLogic2.f29230e++;
                    Objects.requireNonNull(profileReleaseVideosTabUiLogic2);
                    Iterator<ReleaseVideo> it = profileReleaseVideosTabUiLogic2.f29232g.iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i3 = -1;
                            break;
                        } else {
                            if (it.next().getId() == releaseVideo.getId()) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                    if (i3 < 0) {
                        profileReleaseVideosTabUiLogic2.f29232g.add(0, releaseVideo);
                    } else {
                        profileReleaseVideosTabUiLogic2.f29232g.set(i3, releaseVideo);
                    }
                } else {
                    List<ReleaseVideo> list = this.f26832d.f29232g;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it2 = list.iterator();
                        int i4 = 0;
                        while (it2.hasNext()) {
                            if ((((ReleaseVideo) it2.next()).getId() == releaseVideo.getId()) && (i4 = i4 + 1) < 0) {
                                CollectionsKt.m32021g0();
                                throw null;
                            }
                        }
                        i2 = i4;
                    }
                    ProfileReleaseVideosTabUiLogic profileReleaseVideosTabUiLogic3 = this.f26832d;
                    profileReleaseVideosTabUiLogic3.f29230e -= i2;
                    CollectionsKt.m32005R(profileReleaseVideosTabUiLogic3.f29232g, new Function1<ReleaseVideo, Boolean>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosTabPresenter$onFetchReleaseVideo$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Boolean invoke(ReleaseVideo releaseVideo2) {
                            ReleaseVideo it3 = releaseVideo2;
                            Intrinsics.m32179h(it3, "it");
                            return Boolean.valueOf(it3.getId() == ReleaseVideo.this.getId());
                        }
                    });
                }
            }
            ProfileReleaseVideosTabUiController profileReleaseVideosTabUiController = this.f26833e;
            ProfileReleaseVideosTabUiLogic profileReleaseVideosTabUiLogic4 = this.f26832d;
            profileReleaseVideosTabUiController.setData(profileReleaseVideosTabUiLogic4.f29232g, profileReleaseVideosTabUiLogic4.f29233h, profileReleaseVideosTabUiLogic4.f29234i, profileReleaseVideosTabUiLogic4.f29228c, Long.valueOf(profileReleaseVideosTabUiLogic4.f29230e), Long.valueOf(this.f26832d.f29231f), Boolean.FALSE, this.f26834f);
        }
    }

    /* renamed from: d */
    public final void m14950d(long j2, @NotNull String selectedInnerTab) {
        Intrinsics.m32179h(selectedInnerTab, "selectedInnerTab");
        ProfileReleaseVideosTabUiLogic profileReleaseVideosTabUiLogic = this.f26832d;
        Objects.requireNonNull(profileReleaseVideosTabUiLogic);
        profileReleaseVideosTabUiLogic.f29227b = j2;
        profileReleaseVideosTabUiLogic.f29228c = selectedInnerTab;
        profileReleaseVideosTabUiLogic.f28956a = true;
        if (this.f26832d.f29235j) {
            return;
        }
        m14946f(this, false, false, 3);
    }

    /* renamed from: e */
    public final void m14951e(final boolean z, final boolean z2) {
        String str = this.f26832d.f29228c;
        final int i2 = 1;
        if (Intrinsics.m32174c(str, "INNER_TAB_PROFILE_VIDEOS_ALL")) {
            ReleaseVideoRepository releaseVideoRepository = this.f26829a;
            ProfileReleaseVideosTabUiLogic profileReleaseVideosTabUiLogic = this.f26832d;
            releaseVideoRepository.f27388b.favorites(profileReleaseVideosTabUiLogic.f29227b, profileReleaseVideosTabUiLogic.f29229d, releaseVideoRepository.f27389c.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2609c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosTabPresenter$onVideos$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Disposable disposable) {
                    if (z) {
                        this.getViewState().mo14960b();
                    }
                    if (z2) {
                        this.getViewState().mo14962d();
                    }
                    return Unit.f63088a;
                }
            }, 1)).m31368j(new C2549a(this, 15)).m31370l(new C2609c(new Function1<PageableResponse<ReleaseVideo>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosTabPresenter$onVideos$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(PageableResponse<ReleaseVideo> pageableResponse) {
                    PageableResponse<ReleaseVideo> pageableResponse2 = pageableResponse;
                    ProfileReleaseVideosTabUiLogic profileReleaseVideosTabUiLogic2 = ProfileReleaseVideosTabPresenter.this.f26832d;
                    List<ReleaseVideo> videos = pageableResponse2.getContent();
                    Objects.requireNonNull(profileReleaseVideosTabUiLogic2);
                    Intrinsics.m32179h(videos, "videos");
                    boolean z3 = profileReleaseVideosTabUiLogic2.f29235j;
                    if (z3) {
                        profileReleaseVideosTabUiLogic2.f29232g.addAll(videos);
                    } else {
                        if (z3) {
                            profileReleaseVideosTabUiLogic2.m15692a();
                        }
                        profileReleaseVideosTabUiLogic2.f29232g.addAll(videos);
                        profileReleaseVideosTabUiLogic2.f29235j = true;
                    }
                    ProfileReleaseVideosTabPresenter.this.f26832d.f29230e = pageableResponse2.getTotalCount();
                    ProfileReleaseVideosTabPresenter profileReleaseVideosTabPresenter = ProfileReleaseVideosTabPresenter.this;
                    ProfileReleaseVideosTabUiController profileReleaseVideosTabUiController = profileReleaseVideosTabPresenter.f26833e;
                    ProfileReleaseVideosTabUiLogic profileReleaseVideosTabUiLogic3 = profileReleaseVideosTabPresenter.f26832d;
                    profileReleaseVideosTabUiController.setData(profileReleaseVideosTabUiLogic3.f29232g, profileReleaseVideosTabUiLogic3.f29233h, profileReleaseVideosTabUiLogic3.f29234i, profileReleaseVideosTabUiLogic3.f29228c, Long.valueOf(profileReleaseVideosTabUiLogic3.f29230e), Long.valueOf(ProfileReleaseVideosTabPresenter.this.f26832d.f29231f), Boolean.valueOf(pageableResponse2.getContent().size() >= 25), ProfileReleaseVideosTabPresenter.this.f26834f);
                    if (pageableResponse2.getContent().isEmpty()) {
                        ProfileReleaseVideosTabUiLogic profileReleaseVideosTabUiLogic4 = ProfileReleaseVideosTabPresenter.this.f26832d;
                        profileReleaseVideosTabUiLogic4.f29229d--;
                    }
                    return Unit.f63088a;
                }
            }, 2), new C2609c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosTabPresenter$onVideos$4
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Throwable th) {
                    th.printStackTrace();
                    if (ProfileReleaseVideosTabPresenter.this.m14947a()) {
                        ProfileReleaseVideosTabPresenter.this.getViewState().mo14961c();
                    }
                    return Unit.f63088a;
                }
            }, 3), Functions.f59621b, Functions.f59622c);
            return;
        }
        if (Intrinsics.m32174c(str, "INNER_TAB_PROFILE_VIDEOS_UPLOADED")) {
            ReleaseVideoRepository releaseVideoRepository2 = this.f26829a;
            ProfileReleaseVideosTabUiLogic profileReleaseVideosTabUiLogic2 = this.f26832d;
            Observable<PageableResponse<ReleaseVideo>> profileVideo = releaseVideoRepository2.f27387a.profileVideo(profileReleaseVideosTabUiLogic2.f29227b, profileReleaseVideosTabUiLogic2.f29229d, releaseVideoRepository2.f27389c.m14080w());
            Scheduler scheduler = Schedulers.f62901c;
            Observable<PageableResponse<ReleaseVideo>> m31369k = profileVideo.m31372n(scheduler).m31369k(AndroidSchedulers.m31390a());
            ReleaseVideoAppealRepository releaseVideoAppealRepository = this.f26830b;
            Observable<PageableResponse<ReleaseVideo>> m31369k2 = releaseVideoAppealRepository.f27385a.appeals(releaseVideoAppealRepository.f27386b.m14080w()).m31372n(scheduler).m31369k(AndroidSchedulers.m31390a());
            final int i3 = 0;
            if ((this.f26832d.f29227b == this.f26831c.m14061d()) && this.f26832d.f29229d == 0) {
                Observable.m31362e(m31369k, m31369k2, new BiFunction<T1, T2, R>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosTabPresenter$onVideoUploads$$inlined$combineLatest$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // io.reactivex.functions.BiFunction
                    public final R apply(T1 t1, T2 t2) {
                        return (R) new Pair((PageableResponse) t1, (PageableResponse) t2);
                    }
                }).m31367i(new C2609c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosTabPresenter$onVideoUploads$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(Disposable disposable) {
                        if (z) {
                            this.getViewState().mo14960b();
                        }
                        if (z2) {
                            this.getViewState().mo14962d();
                        }
                        return Unit.f63088a;
                    }
                }, 4)).m31368j(new Action() { // from class: com.swiftsoft.anixartd.presentation.main.profile.videos.b
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        switch (i3) {
                            case 0:
                                boolean z3 = z;
                                ProfileReleaseVideosTabPresenter this$0 = this;
                                boolean z4 = z2;
                                Intrinsics.m32179h(this$0, "this$0");
                                if (z3) {
                                    this$0.getViewState().mo14959a();
                                }
                                if (z4) {
                                    this$0.getViewState().mo14963e();
                                    break;
                                }
                                break;
                            default:
                                boolean z5 = z;
                                ProfileReleaseVideosTabPresenter this$02 = this;
                                boolean z6 = z2;
                                Intrinsics.m32179h(this$02, "this$0");
                                if (z5) {
                                    this$02.getViewState().mo14959a();
                                }
                                if (z6) {
                                    this$02.getViewState().mo14963e();
                                    break;
                                }
                                break;
                        }
                    }
                }).m31370l(new C2609c(new Function1<Pair<? extends PageableResponse<ReleaseVideo>, ? extends PageableResponse<ReleaseVideo>>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosTabPresenter$onVideoUploads$4
                    {
                        super(1);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(Pair<? extends PageableResponse<ReleaseVideo>, ? extends PageableResponse<ReleaseVideo>> pair) {
                        Pair<? extends PageableResponse<ReleaseVideo>, ? extends PageableResponse<ReleaseVideo>> pair2 = pair;
                        PageableResponse pageableResponse = (PageableResponse) pair2.f63055b;
                        PageableResponse pageableResponse2 = (PageableResponse) pair2.f63056c;
                        ProfileReleaseVideosTabPresenter.this.f26832d.m15693b(pageableResponse.getContent(), pageableResponse2.getContent());
                        ProfileReleaseVideosTabPresenter.this.f26832d.f29230e = pageableResponse.getTotalCount();
                        ProfileReleaseVideosTabPresenter.this.f26832d.f29231f = pageableResponse2.getTotalCount();
                        ProfileReleaseVideosTabPresenter profileReleaseVideosTabPresenter = ProfileReleaseVideosTabPresenter.this;
                        ProfileReleaseVideosTabUiController profileReleaseVideosTabUiController = profileReleaseVideosTabPresenter.f26833e;
                        ProfileReleaseVideosTabUiLogic profileReleaseVideosTabUiLogic3 = profileReleaseVideosTabPresenter.f26832d;
                        profileReleaseVideosTabUiController.setData(profileReleaseVideosTabUiLogic3.f29232g, profileReleaseVideosTabUiLogic3.f29233h, profileReleaseVideosTabUiLogic3.f29234i, profileReleaseVideosTabUiLogic3.f29228c, Long.valueOf(profileReleaseVideosTabUiLogic3.f29230e), Long.valueOf(ProfileReleaseVideosTabPresenter.this.f26832d.f29231f), Boolean.valueOf(pageableResponse.getContent().size() >= 25), ProfileReleaseVideosTabPresenter.this.f26834f);
                        return Unit.f63088a;
                    }
                }, 5), new C2609c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosTabPresenter$onVideoUploads$5
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(Throwable th) {
                        th.printStackTrace();
                        ProfileReleaseVideosTabPresenter.this.getViewState().mo14961c();
                        return Unit.f63088a;
                    }
                }, 6), Functions.f59621b, Functions.f59622c);
            } else {
                m31369k.m31367i(new C2609c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosTabPresenter$onVideoUploads$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(Disposable disposable) {
                        if (z) {
                            this.getViewState().mo14960b();
                        }
                        if (z2) {
                            this.getViewState().mo14962d();
                        }
                        return Unit.f63088a;
                    }
                }, 7)).m31368j(new Action() { // from class: com.swiftsoft.anixartd.presentation.main.profile.videos.b
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        switch (i2) {
                            case 0:
                                boolean z3 = z;
                                ProfileReleaseVideosTabPresenter this$0 = this;
                                boolean z4 = z2;
                                Intrinsics.m32179h(this$0, "this$0");
                                if (z3) {
                                    this$0.getViewState().mo14959a();
                                }
                                if (z4) {
                                    this$0.getViewState().mo14963e();
                                    break;
                                }
                                break;
                            default:
                                boolean z5 = z;
                                ProfileReleaseVideosTabPresenter this$02 = this;
                                boolean z6 = z2;
                                Intrinsics.m32179h(this$02, "this$0");
                                if (z5) {
                                    this$02.getViewState().mo14959a();
                                }
                                if (z6) {
                                    this$02.getViewState().mo14963e();
                                    break;
                                }
                                break;
                        }
                    }
                }).m31370l(new C2609c(new Function1<PageableResponse<ReleaseVideo>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosTabPresenter$onVideoUploads$8
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(PageableResponse<ReleaseVideo> pageableResponse) {
                        PageableResponse<ReleaseVideo> videoUploads = pageableResponse;
                        Intrinsics.m32179h(videoUploads, "videoUploads");
                        ProfileReleaseVideosTabPresenter.this.f26832d.m15693b(videoUploads.getContent(), new ArrayList());
                        ProfileReleaseVideosTabPresenter.this.f26832d.f29230e = videoUploads.getTotalCount();
                        ProfileReleaseVideosTabPresenter profileReleaseVideosTabPresenter = ProfileReleaseVideosTabPresenter.this;
                        ProfileReleaseVideosTabUiController profileReleaseVideosTabUiController = profileReleaseVideosTabPresenter.f26833e;
                        ProfileReleaseVideosTabUiLogic profileReleaseVideosTabUiLogic3 = profileReleaseVideosTabPresenter.f26832d;
                        profileReleaseVideosTabUiController.setData(profileReleaseVideosTabUiLogic3.f29232g, profileReleaseVideosTabUiLogic3.f29233h, profileReleaseVideosTabUiLogic3.f29234i, profileReleaseVideosTabUiLogic3.f29228c, Long.valueOf(profileReleaseVideosTabUiLogic3.f29230e), Long.valueOf(ProfileReleaseVideosTabPresenter.this.f26832d.f29231f), Boolean.valueOf(videoUploads.getContent().size() >= 25), ProfileReleaseVideosTabPresenter.this.f26834f);
                        return Unit.f63088a;
                    }
                }, 8), new C2609c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosTabPresenter$onVideoUploads$9
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(Throwable th) {
                        th.printStackTrace();
                        ProfileReleaseVideosTabPresenter.this.getViewState().mo14961c();
                        return Unit.f63088a;
                    }
                }, 9), Functions.f59621b, Functions.f59622c);
            }
        }
    }

    /* renamed from: g */
    public final void m14952g() {
        ProfileReleaseVideosTabUiLogic profileReleaseVideosTabUiLogic = this.f26832d;
        if (profileReleaseVideosTabUiLogic.f28956a) {
            profileReleaseVideosTabUiLogic.m15692a();
            if (m14947a()) {
                m14946f(this, false, false, 3);
            } else {
                m14951e(false, true);
            }
        }
    }

    /* renamed from: h */
    public final void m14953h() {
        ProfileReleaseVideosTabUiLogic profileReleaseVideosTabUiLogic = this.f26832d;
        if (profileReleaseVideosTabUiLogic.f28956a) {
            profileReleaseVideosTabUiLogic.m15692a();
            if (m14947a()) {
                m14946f(this, false, false, 3);
            } else {
                m14946f(this, false, false, 2);
            }
        }
    }
}
