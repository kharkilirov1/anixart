package com.swiftsoft.anixartd.presentation.main.profile.videos;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.release.video.appeal.ReleaseVideoAppealResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.profile.videos.ProfileReleaseVideoAppealsUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.profile.videos.ProfileReleaseVideoAppealsUiLogic;
import com.swiftsoft.anixartd.presentation.comments.C2553a;
import com.swiftsoft.anixartd.presentation.main.profile.friends.C2604a;
import com.swiftsoft.anixartd.repository.ReleaseVideoAppealRepository;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileReleaseVideoAppealsPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/videos/ProfileReleaseVideoAppealsPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/profile/videos/ProfileReleaseVideoAppealsView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileReleaseVideoAppealsPresenter extends MvpPresenter<ProfileReleaseVideoAppealsView> {

    /* renamed from: a */
    @NotNull
    public ReleaseVideoAppealRepository f26810a;

    /* renamed from: b */
    @NotNull
    public Listener f26811b;

    /* renamed from: c */
    @NotNull
    public ProfileReleaseVideoAppealsUiLogic f26812c;

    /* renamed from: d */
    @NotNull
    public ProfileReleaseVideoAppealsUiController f26813d;

    /* compiled from: ProfileReleaseVideoAppealsPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/videos/ProfileReleaseVideoAppealsPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/profile/videos/ProfileReleaseVideoAppealsUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ProfileReleaseVideoAppealsUiController.Listener {
    }

    @Inject
    public ProfileReleaseVideoAppealsPresenter(@NotNull ReleaseVideoAppealRepository releaseVideoAppealRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(releaseVideoAppealRepository, "releaseVideoAppealRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26810a = releaseVideoAppealRepository;
        this.f26811b = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideoAppealsPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.release.VideoAppealListItemModel.Listener
            /* renamed from: a */
            public void mo14935a(long j2) {
                Object obj;
                Iterator<T> it = ProfileReleaseVideoAppealsPresenter.this.f26812c.f29223c.iterator();
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
                    ProfileReleaseVideoAppealsPresenter.this.getViewState().mo14945x0(releaseVideo);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.ErrorModel.Listener
            /* renamed from: c */
            public void mo14387c() {
                ProfileReleaseVideoAppealsPresenter profileReleaseVideoAppealsPresenter = ProfileReleaseVideoAppealsPresenter.this;
                profileReleaseVideoAppealsPresenter.f26813d.setData(profileReleaseVideoAppealsPresenter.f26812c.f29223c, Boolean.TRUE, Boolean.FALSE, this);
                ProfileReleaseVideoAppealsPresenter.m14932c(ProfileReleaseVideoAppealsPresenter.this, false, false, 3);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.release.VideoAppealListItemModel.Listener
            /* renamed from: d */
            public void mo14936d(long j2) {
                Object obj;
                Iterator<T> it = ProfileReleaseVideoAppealsPresenter.this.f26812c.f29223c.iterator();
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
                    ProfileReleaseVideoAppealsPresenter.this.getViewState().mo14937K(releaseVideo);
                }
            }
        };
        this.f26812c = new ProfileReleaseVideoAppealsUiLogic();
        this.f26813d = new ProfileReleaseVideoAppealsUiController();
    }

    /* renamed from: c */
    public static void m14932c(ProfileReleaseVideoAppealsPresenter profileReleaseVideoAppealsPresenter, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = profileReleaseVideoAppealsPresenter.f26813d.isEmpty();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        profileReleaseVideoAppealsPresenter.m14934b(z, z2);
    }

    /* renamed from: a */
    public final void m14933a(@NotNull final ReleaseVideo releaseVideoAppeal) {
        Intrinsics.m32179h(releaseVideoAppeal, "releaseVideoAppeal");
        this.f26810a.m15315a(releaseVideoAppeal.getId()).m31367i(new C2604a(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideoAppealsPresenter$onDelete$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Disposable disposable) {
                return Unit.f63088a;
            }
        }, 22)).m31368j(C2607a.f26867b).m31370l(new C2604a(new Function1<ReleaseVideoAppealResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideoAppealsPresenter$onDelete$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ReleaseVideoAppealResponse releaseVideoAppealResponse) {
                if (releaseVideoAppealResponse.isSuccess()) {
                    Objects.requireNonNull(ProfileReleaseVideoAppealsPresenter.this);
                    releaseVideoAppeal.setDelete(true);
                    ProfileReleaseVideoAppealsPresenter.this.getViewState().mo14938U0(releaseVideoAppeal);
                } else {
                    ProfileReleaseVideoAppealsPresenter.this.getViewState().mo14944u0();
                }
                return Unit.f63088a;
            }
        }, 23), new C2604a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideoAppealsPresenter$onDelete$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ProfileReleaseVideoAppealsPresenter.this.getViewState().mo14944u0();
                return Unit.f63088a;
            }
        }, 24), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: b */
    public final void m14934b(final boolean z, final boolean z2) {
        ReleaseVideoAppealRepository releaseVideoAppealRepository = this.f26810a;
        releaseVideoAppealRepository.f27385a.appeals(this.f26812c.f29222b, releaseVideoAppealRepository.f27386b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2604a(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideoAppealsPresenter$onReleaseVideoAppeals$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo14940b();
                }
                if (z2) {
                    this.getViewState().mo14942d();
                }
                return Unit.f63088a;
            }
        }, 25)).m31368j(new C2553a(z, this, z2, 13)).m31370l(new C2604a(new Function1<PageableResponse<ReleaseVideo>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideoAppealsPresenter$onReleaseVideoAppeals$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<ReleaseVideo> pageableResponse) {
                PageableResponse<ReleaseVideo> pageableResponse2 = pageableResponse;
                if (pageableResponse2.isSuccess()) {
                    ProfileReleaseVideoAppealsUiLogic profileReleaseVideoAppealsUiLogic = ProfileReleaseVideoAppealsPresenter.this.f26812c;
                    List<ReleaseVideo> releaseVideoAppeals = pageableResponse2.getContent();
                    long totalCount = pageableResponse2.getTotalCount();
                    Objects.requireNonNull(profileReleaseVideoAppealsUiLogic);
                    Intrinsics.m32179h(releaseVideoAppeals, "releaseVideoAppeals");
                    boolean z3 = profileReleaseVideoAppealsUiLogic.f29225e;
                    if (z3) {
                        profileReleaseVideoAppealsUiLogic.f29223c.addAll(releaseVideoAppeals);
                        profileReleaseVideoAppealsUiLogic.f29224d = totalCount;
                    } else {
                        if (z3) {
                            profileReleaseVideoAppealsUiLogic.f29223c.clear();
                        }
                        profileReleaseVideoAppealsUiLogic.f29223c.addAll(releaseVideoAppeals);
                        profileReleaseVideoAppealsUiLogic.f29224d = totalCount;
                        profileReleaseVideoAppealsUiLogic.f29225e = true;
                    }
                    ProfileReleaseVideoAppealsPresenter profileReleaseVideoAppealsPresenter = ProfileReleaseVideoAppealsPresenter.this;
                    profileReleaseVideoAppealsPresenter.f26813d.setData(profileReleaseVideoAppealsPresenter.f26812c.f29223c, Boolean.valueOf(pageableResponse2.getContent().size() >= 25), Boolean.FALSE, ProfileReleaseVideoAppealsPresenter.this.f26811b);
                }
                return Unit.f63088a;
            }
        }, 26), new C2604a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideoAppealsPresenter$onReleaseVideoAppeals$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                if (ProfileReleaseVideoAppealsPresenter.this.f26813d.isEmpty()) {
                    ProfileReleaseVideoAppealsPresenter.this.getViewState().mo14941c();
                } else {
                    ProfileReleaseVideoAppealsPresenter profileReleaseVideoAppealsPresenter = ProfileReleaseVideoAppealsPresenter.this;
                    profileReleaseVideoAppealsPresenter.f26813d.setData(profileReleaseVideoAppealsPresenter.f26812c.f29223c, Boolean.FALSE, Boolean.TRUE, profileReleaseVideoAppealsPresenter.f26811b);
                }
                return Unit.f63088a;
            }
        }, 27), Functions.f59621b, Functions.f59622c);
    }
}
