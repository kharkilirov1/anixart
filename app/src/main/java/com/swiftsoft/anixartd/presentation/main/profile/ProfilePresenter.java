package com.swiftsoft.anixartd.presentation.main.profile;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.ProfileWatchDynamics;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.Role;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.network.request.profile.ProfileProcessRequest;
import com.swiftsoft.anixartd.network.response.BlockProfileListAddResponse;
import com.swiftsoft.anixartd.network.response.ProfileResponse;
import com.swiftsoft.anixartd.network.response.profile.RemoveFriendRequestResponse;
import com.swiftsoft.anixartd.network.response.profile.SendFriendRequestResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.profile.ProfileHistoryUiController;
import com.swiftsoft.anixartd.p015ui.controller.main.profile.ProfileReleaseVoteUiController;
import com.swiftsoft.anixartd.p015ui.controller.main.profile.ProfileRolesUiController;
import com.swiftsoft.anixartd.p015ui.controller.main.profile.ProfileWatchDynamicsUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.profile.ProfileUiLogic;
import com.swiftsoft.anixartd.presentation.auth.restore.C2549a;
import com.swiftsoft.anixartd.repository.ProfileRepository;
import com.swiftsoft.anixartd.utils.Time;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
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
import org.jetbrains.annotations.Nullable;

/* compiled from: ProfilePresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/ProfilePresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/profile/ProfileView;", "HistoryListener", "RolesListener", "VotesListener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfilePresenter extends MvpPresenter<ProfileView> {

    /* renamed from: a */
    @NotNull
    public ProfileRepository f26636a;

    /* renamed from: b */
    @NotNull
    public Prefs f26637b;

    /* renamed from: c */
    @NotNull
    public ProfileUiLogic f26638c;

    /* renamed from: d */
    @NotNull
    public ProfileWatchDynamicsUiController f26639d;

    /* renamed from: e */
    @NotNull
    public ProfileHistoryUiController f26640e;

    /* renamed from: f */
    @NotNull
    public ProfileReleaseVoteUiController f26641f;

    /* renamed from: g */
    @NotNull
    public ProfileRolesUiController f26642g;

    /* renamed from: h */
    @NotNull
    public HistoryListener f26643h;

    /* renamed from: i */
    @NotNull
    public VotesListener f26644i;

    /* renamed from: j */
    @NotNull
    public RolesListener f26645j;

    /* compiled from: ProfilePresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/ProfilePresenter$HistoryListener;", "Lcom/swiftsoft/anixartd/ui/controller/main/profile/ProfileHistoryUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface HistoryListener extends ProfileHistoryUiController.Listener {
    }

    /* compiled from: ProfilePresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/ProfilePresenter$RolesListener;", "Lcom/swiftsoft/anixartd/ui/controller/main/profile/ProfileRolesUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface RolesListener extends ProfileRolesUiController.Listener {
    }

    /* compiled from: ProfilePresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/ProfilePresenter$VotesListener;", "Lcom/swiftsoft/anixartd/ui/controller/main/profile/ProfileReleaseVoteUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface VotesListener extends ProfileReleaseVoteUiController.Listener {
    }

    @Inject
    public ProfilePresenter(@NotNull ProfileRepository profileRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(profileRepository, "profileRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26636a = profileRepository;
        this.f26637b = prefs;
        this.f26638c = new ProfileUiLogic();
        this.f26639d = new ProfileWatchDynamicsUiController();
        this.f26640e = new ProfileHistoryUiController();
        this.f26641f = new ProfileReleaseVoteUiController();
        this.f26642g = new ProfileRolesUiController();
        this.f26643h = new HistoryListener() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePresenter$historyListener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.profile.ReleaseHistoryCompactModel.Listener
            /* renamed from: g */
            public void mo14828g(long j2) {
                Object obj;
                Iterator<T> it = ProfilePresenter.this.f26638c.f29177f.iterator();
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
                    ProfilePresenter.this.getViewState().mo14856i(release);
                }
            }
        };
        this.f26644i = new VotesListener() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePresenter$votesListener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.profile.ReleaseHistoryCompactModel.Listener
            /* renamed from: g */
            public void mo14828g(long j2) {
                Object obj;
                Iterator<T> it = ProfilePresenter.this.f26638c.f29178g.iterator();
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
                    ProfilePresenter.this.getViewState().mo14856i(release);
                }
            }
        };
        this.f26645j = new RolesListener() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePresenter$rolesListener$1
        };
    }

    /* renamed from: g */
    public static /* synthetic */ void m14819g(ProfilePresenter profilePresenter, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = profilePresenter.m14820a();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        profilePresenter.m14825f(z, z2);
    }

    /* renamed from: a */
    public final boolean m14820a() {
        return !(this.f26638c.f29175d != null);
    }

    /* renamed from: b */
    public final void m14821b() {
        this.f26636a.m15306f(this.f26638c.f29173b).m31367i(new C2600c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePresenter$onAddFriend$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                ProfilePresenter.this.getViewState().mo14843F2();
                return Unit.f63088a;
            }
        }, 3)).m31370l(new C2600c(new Function1<SendFriendRequestResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePresenter$onAddFriend$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SendFriendRequestResponse sendFriendRequestResponse) {
                SendFriendRequestResponse sendFriendRequestResponse2 = sendFriendRequestResponse;
                if (sendFriendRequestResponse2.isFailed()) {
                    ProfilePresenter.this.getViewState().mo14855g3();
                } else {
                    int code = sendFriendRequestResponse2.getCode();
                    if (code == 6) {
                        ProfilePresenter.this.getViewState().mo14847T3();
                    } else if (code == 7) {
                        ProfilePresenter.this.getViewState().mo14848X3();
                    }
                    ProfilePresenter.this.getViewState().mo14849Y2();
                }
                return Unit.f63088a;
            }
        }, 4), new C2600c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePresenter$onAddFriend$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                if (ProfilePresenter.this.m14820a()) {
                    ProfilePresenter.this.getViewState().mo14855g3();
                }
                return Unit.f63088a;
            }
        }, 5), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: c */
    public final void m14822c() {
        ProfileRepository profileRepository = this.f26636a;
        profileRepository.f27376c.addToBlockList(this.f26638c.f29173b, profileRepository.f27377d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2600c(new Function1<BlockProfileListAddResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePresenter$onBlock$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(BlockProfileListAddResponse blockProfileListAddResponse) {
                if (blockProfileListAddResponse.isSuccess()) {
                    ProfilePresenter.this.getViewState().mo14845G2();
                } else {
                    ProfilePresenter.this.getViewState().mo14857l4();
                }
                return Unit.f63088a;
            }
        }, 1), new C2600c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePresenter$onBlock$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                if (ProfilePresenter.this.m14820a()) {
                    ProfilePresenter.this.getViewState().mo14852c();
                }
                return Unit.f63088a;
            }
        }, 2), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: d */
    public final void m14823d() {
        this.f26636a.m15305e(this.f26638c.f29173b).m31367i(new C2600c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePresenter$onDeleteFriend$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                ProfilePresenter.this.getViewState().mo14843F2();
                return Unit.f63088a;
            }
        }, 8)).m31370l(new C2600c(new Function1<RemoveFriendRequestResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePresenter$onDeleteFriend$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(RemoveFriendRequestResponse removeFriendRequestResponse) {
                if (removeFriendRequestResponse.isFailed()) {
                    ProfilePresenter.this.getViewState().mo14855g3();
                } else {
                    ProfilePresenter.this.getViewState().mo14849Y2();
                }
                return Unit.f63088a;
            }
        }, 9), new C2600c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePresenter$onDeleteFriend$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                if (ProfilePresenter.this.m14820a()) {
                    ProfilePresenter.this.getViewState().mo14852c();
                }
                return Unit.f63088a;
            }
        }, 10), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: e */
    public final void m14824e(long j2, @Nullable String str, @Nullable Long l2, boolean z) {
        ProfileRepository profileRepository = this.f26636a;
        profileRepository.f27374a.process(j2, new ProfileProcessRequest(str, l2, z), profileRepository.f27377d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2600c(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePresenter$onProcessProfile$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                if (response.isSuccess()) {
                    ProfilePresenter.this.m14826h();
                }
                return Unit.f63088a;
            }
        }, 6), new C2600c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePresenter$onProcessProfile$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 7), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: f */
    public final void m14825f(final boolean z, final boolean z2) {
        this.f26636a.m15302b(this.f26638c.f29173b).m31367i(new C2598a(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePresenter$onProfile$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo14851b();
                }
                if (z2) {
                    this.getViewState().mo14853d();
                }
                return Unit.f63088a;
            }
        }, 28)).m31368j(new C2549a(this, 13)).m31370l(new C2598a(new Function1<ProfileResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePresenter$onProfile$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ProfileResponse profileResponse) {
                ProfileWatchDynamics profileWatchDynamics;
                Profile profile = profileResponse.getProfile();
                if (profile == null) {
                    ProfilePresenter.this.getViewState().mo14852c();
                } else {
                    ProfileUiLogic profileUiLogic = ProfilePresenter.this.f26638c;
                    Objects.requireNonNull(profileUiLogic);
                    profileUiLogic.f29175d = profile;
                    ProfileWatchDynamics profileWatchDynamics2 = (ProfileWatchDynamics) CollectionsKt.m31992E(profile.getWatchDynamics());
                    Integer num = null;
                    if (profileWatchDynamics2 != null) {
                        int size = profile.getWatchDynamics().size() - 1;
                        for (int i2 = 10; i2 > 0; i2--) {
                            long timestamp = profileWatchDynamics2.getTimestamp() - ((10 - i2) * 86400);
                            List<ProfileWatchDynamics> watchDynamics = profile.getWatchDynamics();
                            ListIterator<ProfileWatchDynamics> listIterator = watchDynamics.listIterator(watchDynamics.size());
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    profileWatchDynamics = null;
                                    break;
                                }
                                profileWatchDynamics = listIterator.previous();
                                if (Time.f30247a.m16364j(profileWatchDynamics.getTimestamp(), timestamp)) {
                                    break;
                                }
                            }
                            if (profileWatchDynamics == null) {
                                ProfileWatchDynamics profileWatchDynamics3 = new ProfileWatchDynamics();
                                profileWatchDynamics3.setCount(0);
                                profileWatchDynamics3.setDay(i2);
                                profileWatchDynamics3.setTimestamp(timestamp);
                                profile.getWatchDynamics().add(size + 1, profileWatchDynamics3);
                            } else {
                                size--;
                            }
                        }
                    }
                    ProfileUiLogic profileUiLogic2 = ProfilePresenter.this.f26638c;
                    List m32019f0 = CollectionsKt.m32019f0(profile.getWatchDynamics(), 10);
                    Objects.requireNonNull(profileUiLogic2);
                    if (profileUiLogic2.f29180i) {
                        profileUiLogic2.f29176e.clear();
                    }
                    profileUiLogic2.f29176e.addAll(m32019f0);
                    profileUiLogic2.f29180i = true;
                    ProfileUiLogic profileUiLogic3 = ProfilePresenter.this.f26638c;
                    List<Release> historyReleases = profile.getHistory();
                    Objects.requireNonNull(profileUiLogic3);
                    Intrinsics.m32179h(historyReleases, "historyReleases");
                    if (profileUiLogic3.f29181j) {
                        profileUiLogic3.f29177f.clear();
                    }
                    profileUiLogic3.f29177f.addAll(historyReleases);
                    profileUiLogic3.f29181j = true;
                    ProfileUiLogic profileUiLogic4 = ProfilePresenter.this.f26638c;
                    List<Release> votedReleases = profile.getVotes();
                    Objects.requireNonNull(profileUiLogic4);
                    Intrinsics.m32179h(votedReleases, "votedReleases");
                    if (profileUiLogic4.f29182k) {
                        profileUiLogic4.f29178g.clear();
                    }
                    profileUiLogic4.f29178g.addAll(votedReleases);
                    profileUiLogic4.f29182k = true;
                    ProfileUiLogic profileUiLogic5 = ProfilePresenter.this.f26638c;
                    List<Role> roles = profile.getRoles();
                    Objects.requireNonNull(profileUiLogic5);
                    Intrinsics.m32179h(roles, "roles");
                    if (profileUiLogic5.f29183l) {
                        profileUiLogic5.f29179h.clear();
                    }
                    profileUiLogic5.f29179h.addAll(roles);
                    profileUiLogic5.f29183l = true;
                    ProfilePresenter profilePresenter = ProfilePresenter.this;
                    ProfileUiLogic profileUiLogic6 = profilePresenter.f26638c;
                    profileUiLogic6.f29184m = true;
                    ProfileWatchDynamicsUiController profileWatchDynamicsUiController = profilePresenter.f26639d;
                    List<ProfileWatchDynamics> list = profileUiLogic6.f29176e;
                    Iterator<T> it = list.iterator();
                    if (it.hasNext()) {
                        num = Integer.valueOf(((ProfileWatchDynamics) it.next()).getCount());
                        while (it.hasNext()) {
                            Integer valueOf = Integer.valueOf(((ProfileWatchDynamics) it.next()).getCount());
                            if (num.compareTo(valueOf) < 0) {
                                num = valueOf;
                            }
                        }
                    }
                    profileWatchDynamicsUiController.setData(list, num);
                    profilePresenter.f26640e.setData(profilePresenter.f26638c.f29177f, profilePresenter.f26643h);
                    profilePresenter.f26641f.setData(profilePresenter.f26638c.f29178g, profilePresenter.f26644i);
                    profilePresenter.f26642g.setData(profilePresenter.f26638c.f29179h, profilePresenter.f26645j);
                    ProfilePresenter.this.getViewState().mo14842D1(profile, ProfilePresenter.this.f26638c.f29174c);
                }
                return Unit.f63088a;
            }
        }, 29), new C2600c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePresenter$onProfile$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                if (ProfilePresenter.this.m14820a()) {
                    ProfilePresenter.this.getViewState().mo14852c();
                }
                return Unit.f63088a;
            }
        }, 0), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: h */
    public final void m14826h() {
        ProfileUiLogic profileUiLogic = this.f26638c;
        if (profileUiLogic.f28956a) {
            profileUiLogic.f29177f.clear();
            profileUiLogic.f29178g.clear();
            profileUiLogic.f29179h.clear();
            profileUiLogic.f29181j = false;
            profileUiLogic.f29182k = false;
            profileUiLogic.f29183l = false;
            if (m14820a()) {
                m14819g(this, false, false, 3);
            } else {
                m14819g(this, false, false, 2);
            }
        }
    }

    /* renamed from: i */
    public final void m14827i() {
        this.f26636a.m15303c(this.f26638c.f29173b).m31370l(new C2600c(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePresenter$onUnblock$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                if (response.isFailed()) {
                    ProfilePresenter.this.getViewState().mo14857l4();
                } else {
                    ProfilePresenter.this.getViewState().mo14841A0();
                }
                return Unit.f63088a;
            }
        }, 11), new C2600c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePresenter$onUnblock$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                if (ProfilePresenter.this.m14820a()) {
                    ProfilePresenter.this.getViewState().mo14852c();
                }
                return Unit.f63088a;
            }
        }, 12), Functions.f59621b, Functions.f59622c);
    }
}
