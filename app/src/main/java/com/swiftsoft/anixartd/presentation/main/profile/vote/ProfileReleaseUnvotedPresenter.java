package com.swiftsoft.anixartd.presentation.main.profile.vote;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.profile.vote.ProfileReleaseUnvotedUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.profile.vote.ProfileReleaseUnvotedUiLogic;
import com.swiftsoft.anixartd.presentation.auth.restore.C2549a;
import com.swiftsoft.anixartd.presentation.main.profile.videos.C2609c;
import com.swiftsoft.anixartd.repository.ProfileReleaseVoteRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomSheet;
import com.swiftsoft.anixartd.utils.OnReleaseDeleteVote;
import com.swiftsoft.anixartd.utils.OnReleaseVote;
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

/* compiled from: ProfileReleaseUnvotedPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/vote/ProfileReleaseUnvotedPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/profile/vote/ProfileReleaseUnvotedView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileReleaseUnvotedPresenter extends MvpPresenter<ProfileReleaseUnvotedView> {

    /* renamed from: a */
    @NotNull
    public ProfileReleaseVoteRepository f26876a;

    /* renamed from: b */
    @NotNull
    public ProfileReleaseUnvotedUiLogic f26877b;

    /* renamed from: c */
    @NotNull
    public ProfileReleaseUnvotedUiController f26878c;

    /* renamed from: d */
    @NotNull
    public Listener f26879d;

    /* compiled from: ProfileReleaseUnvotedPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/vote/ProfileReleaseUnvotedPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/profile/vote/ProfileReleaseUnvotedUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ProfileReleaseUnvotedUiController.Listener {
    }

    @Inject
    public ProfileReleaseUnvotedPresenter(@NotNull ProfileReleaseVoteRepository profileReleaseVoteRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(profileReleaseVoteRepository, "profileReleaseVoteRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26876a = profileReleaseVoteRepository;
        this.f26877b = new ProfileReleaseUnvotedUiLogic();
        this.f26878c = new ProfileReleaseUnvotedUiController();
        this.f26879d = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseUnvotedPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.profile.vote.ReleaseVoteModel.Listener
            /* renamed from: b */
            public void mo14972b(long j2) {
                Object obj;
                Iterator<T> it = ProfileReleaseUnvotedPresenter.this.f26877b.f29239d.iterator();
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
                Release release = (Release) obj;
                if (release != null) {
                    EventBusKt.m16327a(new OnReleaseDeleteVote(release));
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.profile.vote.ReleaseVoteModel.Listener
            /* renamed from: c */
            public void mo14973c(long j2, int i2) {
                Object obj;
                Iterator<T> it = ProfileReleaseUnvotedPresenter.this.f26877b.f29239d.iterator();
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
                Release release = (Release) obj;
                if (release != null) {
                    EventBusKt.m16327a(new OnReleaseVote(release, i2));
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.profile.vote.ReleaseVoteModel.Listener
            /* renamed from: g */
            public void mo14974g(long j2) {
                Object obj;
                Iterator<T> it = ProfileReleaseUnvotedPresenter.this.f26877b.f29239d.iterator();
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
                Release release = (Release) obj;
                if (release != null) {
                    ProfileReleaseUnvotedPresenter.this.getViewState().mo14981i(release);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.profile.vote.ReleaseVoteModel.Listener
            /* renamed from: k */
            public void mo14975k(long j2) {
                Object obj;
                Iterator<T> it = ProfileReleaseUnvotedPresenter.this.f26877b.f29239d.iterator();
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
                Release release = (Release) obj;
                if (release != null) {
                    EventBusKt.m16327a(new OnBottomSheet(release));
                }
            }
        };
    }

    /* renamed from: a */
    public final void m14970a(final boolean z, final boolean z2) {
        ProfileReleaseVoteRepository profileReleaseVoteRepository = this.f26876a;
        profileReleaseVoteRepository.f27372a.allReleaseUnvoted(this.f26877b.f29237b, profileReleaseVoteRepository.f27373b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2609c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseUnvotedPresenter$onProfileReleaseUnvoted$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo14977b();
                }
                if (z2) {
                    this.getViewState().mo14979d();
                }
                return Unit.f63088a;
            }
        }, 10)).m31368j(new C2549a(this, 16)).m31370l(new C2609c(new Function1<PageableResponse<Release>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseUnvotedPresenter$onProfileReleaseUnvoted$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<Release> pageableResponse) {
                PageableResponse<Release> pageableResponse2 = pageableResponse;
                ProfileReleaseUnvotedUiLogic profileReleaseUnvotedUiLogic = ProfileReleaseUnvotedPresenter.this.f26877b;
                List<Release> releases = pageableResponse2.getContent();
                Objects.requireNonNull(profileReleaseUnvotedUiLogic);
                Intrinsics.m32179h(releases, "releases");
                boolean z3 = profileReleaseUnvotedUiLogic.f29240e;
                if (z3) {
                    profileReleaseUnvotedUiLogic.f29239d.addAll(releases);
                } else {
                    if (z3) {
                        profileReleaseUnvotedUiLogic.f29239d.clear();
                    }
                    profileReleaseUnvotedUiLogic.f29239d.addAll(releases);
                    profileReleaseUnvotedUiLogic.f29240e = true;
                }
                ProfileReleaseUnvotedPresenter.this.f26877b.f29238c = pageableResponse2.getTotalCount();
                ProfileReleaseUnvotedPresenter profileReleaseUnvotedPresenter = ProfileReleaseUnvotedPresenter.this;
                ProfileReleaseUnvotedUiController profileReleaseUnvotedUiController = profileReleaseUnvotedPresenter.f26878c;
                ProfileReleaseUnvotedUiLogic profileReleaseUnvotedUiLogic2 = profileReleaseUnvotedPresenter.f26877b;
                profileReleaseUnvotedUiController.setData(profileReleaseUnvotedUiLogic2.f29239d, Long.valueOf(profileReleaseUnvotedUiLogic2.f29238c), Boolean.valueOf(pageableResponse2.getContent().size() >= 25), ProfileReleaseUnvotedPresenter.this.f26879d);
                if (pageableResponse2.getContent().isEmpty()) {
                    ProfileReleaseUnvotedUiLogic profileReleaseUnvotedUiLogic3 = ProfileReleaseUnvotedPresenter.this.f26877b;
                    profileReleaseUnvotedUiLogic3.f29237b--;
                }
                return Unit.f63088a;
            }
        }, 11), new C2609c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseUnvotedPresenter$onProfileReleaseUnvoted$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                if (ProfileReleaseUnvotedPresenter.this.f26878c.isEmpty()) {
                    ProfileReleaseUnvotedPresenter.this.getViewState().mo14978c();
                }
                return Unit.f63088a;
            }
        }, 12), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: b */
    public final void m14971b() {
        ProfileReleaseUnvotedUiLogic profileReleaseUnvotedUiLogic = this.f26877b;
        if (profileReleaseUnvotedUiLogic.f28956a) {
            profileReleaseUnvotedUiLogic.f29237b = 0;
            profileReleaseUnvotedUiLogic.f29239d.clear();
            profileReleaseUnvotedUiLogic.f29240e = false;
            m14970a(false, true);
        }
    }
}
