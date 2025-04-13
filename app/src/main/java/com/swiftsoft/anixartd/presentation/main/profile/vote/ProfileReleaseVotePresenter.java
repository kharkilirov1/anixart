package com.swiftsoft.anixartd.presentation.main.profile.vote;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.profile.vote.ProfileReleaseVoteUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.profile.vote.ProfileReleaseVoteUiLogic;
import com.swiftsoft.anixartd.presentation.main.profile.videos.C2609c;
import com.swiftsoft.anixartd.repository.ProfileReleaseVoteRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomSheet;
import com.swiftsoft.anixartd.utils.OnReleaseDeleteVote;
import com.swiftsoft.anixartd.utils.OnReleaseVote;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.internal.functions.Functions;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileReleaseVotePresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/vote/ProfileReleaseVotePresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/profile/vote/ProfileReleaseVoteView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileReleaseVotePresenter extends MvpPresenter<ProfileReleaseVoteView> {

    /* renamed from: a */
    @NotNull
    public ProfileReleaseVoteRepository f26889a;

    /* renamed from: b */
    @NotNull
    public Prefs f26890b;

    /* renamed from: c */
    @NotNull
    public ProfileReleaseVoteUiLogic f26891c;

    /* renamed from: d */
    @NotNull
    public ProfileReleaseVoteUiController f26892d;

    /* renamed from: e */
    @NotNull
    public Listener f26893e;

    /* compiled from: ProfileReleaseVotePresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/vote/ProfileReleaseVotePresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/profile/vote/ProfileReleaseVoteUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ProfileReleaseVoteUiController.Listener {
    }

    @Inject
    public ProfileReleaseVotePresenter(@NotNull ProfileReleaseVoteRepository profileReleaseVoteRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(profileReleaseVoteRepository, "profileReleaseVoteRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26889a = profileReleaseVoteRepository;
        this.f26890b = prefs;
        this.f26891c = new ProfileReleaseVoteUiLogic();
        this.f26892d = new ProfileReleaseVoteUiController();
        this.f26893e = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseVotePresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.profile.vote.ExtraReleaseVoteModel.Listener
            /* renamed from: a */
            public void mo14985a(int i2) {
                ProfileReleaseVotePresenter profileReleaseVotePresenter = ProfileReleaseVotePresenter.this;
                profileReleaseVotePresenter.f26891c.f29244e = i2;
                profileReleaseVotePresenter.getViewState().mo14994l();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.profile.vote.ReleaseVoteModel.Listener
            /* renamed from: b */
            public void mo14972b(long j2) {
                Object obj;
                Iterator<T> it = ProfileReleaseVotePresenter.this.f26891c.f29245f.iterator();
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
                Iterator<T> it = ProfileReleaseVotePresenter.this.f26891c.f29245f.iterator();
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
                Iterator<T> it = ProfileReleaseVotePresenter.this.f26891c.f29245f.iterator();
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
                    ProfileReleaseVotePresenter.this.getViewState().mo14993i(release);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.profile.vote.ExtraReleaseUnvotedModel.Listener
            /* renamed from: h0 */
            public void mo14986h0() {
                ProfileReleaseVotePresenter.this.getViewState().mo14992h0();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.profile.vote.ReleaseVoteModel.Listener
            /* renamed from: k */
            public void mo14975k(long j2) {
                Object obj;
                Iterator<T> it = ProfileReleaseVotePresenter.this.f26891c.f29245f.iterator();
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

    /* renamed from: b */
    public static void m14982b(ProfileReleaseVotePresenter profileReleaseVotePresenter, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = profileReleaseVotePresenter.f26892d.isEmpty();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        profileReleaseVotePresenter.m14983a(z, z2);
    }

    /* renamed from: a */
    public final void m14983a(final boolean z, final boolean z2) {
        ProfileReleaseVoteRepository profileReleaseVoteRepository = this.f26889a;
        Observable<PageableResponse<Release>> lastReleaseUnvoted = profileReleaseVoteRepository.f27372a.lastReleaseUnvoted(profileReleaseVoteRepository.f27373b.m14080w());
        Scheduler scheduler = Schedulers.f62901c;
        Observable<PageableResponse<Release>> m31369k = lastReleaseUnvoted.m31372n(scheduler).m31369k(AndroidSchedulers.m31390a());
        ProfileReleaseVoteRepository profileReleaseVoteRepository2 = this.f26889a;
        ProfileReleaseVoteUiLogic profileReleaseVoteUiLogic = this.f26891c;
        Observable<PageableResponse<Release>> m31369k2 = profileReleaseVoteRepository2.f27372a.allReleaseVoted(profileReleaseVoteUiLogic.f29241b, profileReleaseVoteUiLogic.f29242c, Integer.valueOf(profileReleaseVoteUiLogic.f29244e), profileReleaseVoteRepository2.f27373b.m14080w()).m31372n(scheduler).m31369k(AndroidSchedulers.m31390a());
        if (this.f26891c.f29241b == this.f26890b.m14061d()) {
            Observable m31367i = Observables.f62894a.m31860a(m31369k, m31369k2).m31367i(new C2609c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseVotePresenter$onProfileReleaseVote$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Disposable disposable) {
                    if (z) {
                        this.getViewState().mo14988b();
                    }
                    if (z2) {
                        this.getViewState().mo14990d();
                    }
                    return Unit.f63088a;
                }
            }, 13));
            final int i2 = 0;
            m31367i.m31368j(new Action(this) { // from class: com.swiftsoft.anixartd.presentation.main.profile.vote.a

                /* renamed from: c */
                public final /* synthetic */ ProfileReleaseVotePresenter f26909c;

                {
                    this.f26909c = this;
                }

                @Override // io.reactivex.functions.Action
                public final void run() {
                    switch (i2) {
                        case 0:
                            ProfileReleaseVotePresenter this$0 = this.f26909c;
                            Intrinsics.m32179h(this$0, "this$0");
                            this$0.getViewState().mo14987a();
                            this$0.getViewState().mo14991e();
                            break;
                        default:
                            ProfileReleaseVotePresenter this$02 = this.f26909c;
                            Intrinsics.m32179h(this$02, "this$0");
                            this$02.getViewState().mo14987a();
                            this$02.getViewState().mo14991e();
                            break;
                    }
                }
            }).m31370l(new C2609c(new Function1<Pair<? extends PageableResponse<Release>, ? extends PageableResponse<Release>>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseVotePresenter$onProfileReleaseVote$3
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Pair<? extends PageableResponse<Release>, ? extends PageableResponse<Release>> pair) {
                    Pair<? extends PageableResponse<Release>, ? extends PageableResponse<Release>> pair2 = pair;
                    PageableResponse pageableResponse = (PageableResponse) pair2.f63055b;
                    PageableResponse pageableResponse2 = (PageableResponse) pair2.f63056c;
                    ProfileReleaseVotePresenter.this.f26891c.m15694a(pageableResponse2.getContent());
                    ProfileReleaseVotePresenter.this.f26891c.f29243d = pageableResponse2.getTotalCount();
                    ProfileReleaseVotePresenter.this.f26891c.f29248i = pageableResponse.getTotalCount() > 0;
                    ProfileReleaseVotePresenter profileReleaseVotePresenter = ProfileReleaseVotePresenter.this;
                    ProfileReleaseVoteUiController profileReleaseVoteUiController = profileReleaseVotePresenter.f26892d;
                    ProfileReleaseVoteUiLogic profileReleaseVoteUiLogic2 = profileReleaseVotePresenter.f26891c;
                    List<Release> list = profileReleaseVoteUiLogic2.f29245f;
                    Long valueOf = Long.valueOf(profileReleaseVoteUiLogic2.f29243d);
                    Integer valueOf2 = Integer.valueOf(ProfileReleaseVotePresenter.this.f26891c.f29244e);
                    Boolean valueOf3 = Boolean.valueOf(ProfileReleaseVotePresenter.this.f26891c.f29247h);
                    ProfileReleaseVotePresenter profileReleaseVotePresenter2 = ProfileReleaseVotePresenter.this;
                    profileReleaseVoteUiController.setData(list, valueOf, valueOf2, valueOf3, Boolean.valueOf(profileReleaseVotePresenter2.f26891c.f29241b == profileReleaseVotePresenter2.f26890b.m14061d()), Boolean.valueOf(ProfileReleaseVotePresenter.this.f26891c.f29248i), Boolean.valueOf(pageableResponse2.getContent().size() >= 25), ProfileReleaseVotePresenter.this.f26893e);
                    if (pageableResponse2.getContent().isEmpty()) {
                        ProfileReleaseVoteUiLogic profileReleaseVoteUiLogic3 = ProfileReleaseVotePresenter.this.f26891c;
                        profileReleaseVoteUiLogic3.f29242c--;
                    }
                    return Unit.f63088a;
                }
            }, 14), new C2609c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseVotePresenter$onProfileReleaseVote$4
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Throwable th) {
                    th.printStackTrace();
                    if (ProfileReleaseVotePresenter.this.f26892d.isEmpty()) {
                        ProfileReleaseVotePresenter.this.getViewState().mo14989c();
                    }
                    return Unit.f63088a;
                }
            }, 15), Functions.f59621b, Functions.f59622c);
        } else {
            final int i3 = 1;
            m31369k2.m31367i(new C2609c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseVotePresenter$onProfileReleaseVote$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Disposable disposable) {
                    if (z) {
                        this.getViewState().mo14988b();
                    }
                    if (z2) {
                        this.getViewState().mo14990d();
                    }
                    return Unit.f63088a;
                }
            }, 16)).m31368j(new Action(this) { // from class: com.swiftsoft.anixartd.presentation.main.profile.vote.a

                /* renamed from: c */
                public final /* synthetic */ ProfileReleaseVotePresenter f26909c;

                {
                    this.f26909c = this;
                }

                @Override // io.reactivex.functions.Action
                public final void run() {
                    switch (i3) {
                        case 0:
                            ProfileReleaseVotePresenter this$0 = this.f26909c;
                            Intrinsics.m32179h(this$0, "this$0");
                            this$0.getViewState().mo14987a();
                            this$0.getViewState().mo14991e();
                            break;
                        default:
                            ProfileReleaseVotePresenter this$02 = this.f26909c;
                            Intrinsics.m32179h(this$02, "this$0");
                            this$02.getViewState().mo14987a();
                            this$02.getViewState().mo14991e();
                            break;
                    }
                }
            }).m31370l(new C2609c(new Function1<PageableResponse<Release>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseVotePresenter$onProfileReleaseVote$7
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(PageableResponse<Release> pageableResponse) {
                    PageableResponse<Release> pageableResponse2 = pageableResponse;
                    ProfileReleaseVotePresenter.this.f26891c.m15694a(pageableResponse2.getContent());
                    ProfileReleaseVotePresenter.this.f26891c.f29243d = pageableResponse2.getTotalCount();
                    ProfileReleaseVotePresenter profileReleaseVotePresenter = ProfileReleaseVotePresenter.this;
                    ProfileReleaseVoteUiController profileReleaseVoteUiController = profileReleaseVotePresenter.f26892d;
                    ProfileReleaseVoteUiLogic profileReleaseVoteUiLogic2 = profileReleaseVotePresenter.f26891c;
                    List<Release> list = profileReleaseVoteUiLogic2.f29245f;
                    Long valueOf = Long.valueOf(profileReleaseVoteUiLogic2.f29243d);
                    Integer valueOf2 = Integer.valueOf(ProfileReleaseVotePresenter.this.f26891c.f29244e);
                    Boolean valueOf3 = Boolean.valueOf(ProfileReleaseVotePresenter.this.f26891c.f29247h);
                    ProfileReleaseVotePresenter profileReleaseVotePresenter2 = ProfileReleaseVotePresenter.this;
                    profileReleaseVoteUiController.setData(list, valueOf, valueOf2, valueOf3, Boolean.valueOf(profileReleaseVotePresenter2.f26891c.f29241b == profileReleaseVotePresenter2.f26890b.m14061d()), Boolean.FALSE, Boolean.valueOf(pageableResponse2.getContent().size() >= 25), ProfileReleaseVotePresenter.this.f26893e);
                    if (pageableResponse2.getContent().isEmpty()) {
                        ProfileReleaseVoteUiLogic profileReleaseVoteUiLogic3 = ProfileReleaseVotePresenter.this.f26891c;
                        profileReleaseVoteUiLogic3.f29242c--;
                    }
                    return Unit.f63088a;
                }
            }, 17), new C2609c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseVotePresenter$onProfileReleaseVote$8
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Throwable th) {
                    th.printStackTrace();
                    if (ProfileReleaseVotePresenter.this.f26892d.isEmpty()) {
                        ProfileReleaseVotePresenter.this.getViewState().mo14989c();
                    }
                    return Unit.f63088a;
                }
            }, 18), Functions.f59621b, Functions.f59622c);
        }
    }

    /* renamed from: c */
    public final void m14984c() {
        ProfileReleaseVoteUiLogic profileReleaseVoteUiLogic = this.f26891c;
        if (profileReleaseVoteUiLogic.f28956a) {
            profileReleaseVoteUiLogic.f29242c = 0;
            profileReleaseVoteUiLogic.f29245f.clear();
            profileReleaseVoteUiLogic.f29246g = false;
            m14983a(false, true);
        }
    }
}
