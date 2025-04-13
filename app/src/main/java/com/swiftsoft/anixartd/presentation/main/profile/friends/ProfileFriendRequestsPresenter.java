package com.swiftsoft.anixartd.presentation.main.profile.friends;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.profile.SendFriendRequestResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.profile.friends.ProfileFriendRequestsUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.profile.friends.ProfileFriendRequestsUiLogic;
import com.swiftsoft.anixartd.presentation.comments.C2553a;
import com.swiftsoft.anixartd.presentation.main.profile.C2600c;
import com.swiftsoft.anixartd.repository.ProfileRepository;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
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
import org.jetbrains.annotations.Nullable;

/* compiled from: ProfileFriendRequestsPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/friends/ProfileFriendRequestsPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/profile/friends/ProfileFriendRequestsView;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileFriendRequestsPresenter extends MvpPresenter<ProfileFriendRequestsView> {

    /* renamed from: a */
    @NotNull
    public ProfileRepository f26728a;

    /* renamed from: b */
    @NotNull
    public Listener f26729b;

    /* renamed from: c */
    @NotNull
    public ProfileFriendRequestsUiLogic f26730c;

    /* renamed from: d */
    @NotNull
    public ProfileFriendRequestsUiController f26731d;

    /* compiled from: ProfileFriendRequestsPresenter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/friends/ProfileFriendRequestsPresenter$Companion;", "", "", "ACTION_FRIEND_REQUEST_ACCEPT", "I", "ACTION_FRIEND_REQUEST_HIDE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: ProfileFriendRequestsPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/friends/ProfileFriendRequestsPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/profile/friends/ProfileFriendRequestsUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ProfileFriendRequestsUiController.Listener {
    }

    @Inject
    public ProfileFriendRequestsPresenter(@NotNull ProfileRepository profileRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(profileRepository, "profileRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26728a = profileRepository;
        this.f26729b = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.profile.friends.FriendRequestModel.Listener
            /* renamed from: a */
            public void mo14773a(long j2, int i2) {
                if (i2 == 1) {
                    final ProfileFriendRequestsPresenter profileFriendRequestsPresenter = ProfileFriendRequestsPresenter.this;
                    profileFriendRequestsPresenter.f26728a.m15306f(j2).m31370l(new C2604a(new Function1<SendFriendRequestResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsPresenter$onAcceptFriendRequest$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(SendFriendRequestResponse sendFriendRequestResponse) {
                            if (sendFriendRequestResponse.isFailed()) {
                                ProfileFriendRequestsPresenter.this.getViewState().mo14881H0();
                            } else {
                                ProfileFriendRequestsPresenter.this.getViewState().mo14883a2();
                            }
                            return Unit.f63088a;
                        }
                    }, 0), new C2604a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsPresenter$onAcceptFriendRequest$2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Throwable th) {
                            th.printStackTrace();
                            ProfileFriendRequestsPresenter.this.getViewState().mo14881H0();
                            return Unit.f63088a;
                        }
                    }, 1), Functions.f59621b, Functions.f59622c);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.profile.friends.FriendRequestModel.Listener
            /* renamed from: b */
            public void mo14774b(long j2, int i2) {
                if (i2 == 2) {
                    final ProfileFriendRequestsPresenter profileFriendRequestsPresenter = ProfileFriendRequestsPresenter.this;
                    profileFriendRequestsPresenter.f26728a.m15304d(j2).m31370l(new C2600c(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsPresenter$onHideFriendRequest$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Response response) {
                            if (response.isFailed()) {
                                ProfileFriendRequestsPresenter.this.getViewState().mo14880C0();
                            } else {
                                ProfileFriendRequestsPresenter.this.getViewState().mo14889g2();
                            }
                            return Unit.f63088a;
                        }
                    }, 28), new C2600c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsPresenter$onHideFriendRequest$2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Throwable th) {
                            th.printStackTrace();
                            ProfileFriendRequestsPresenter.this.getViewState().mo14880C0();
                            return Unit.f63088a;
                        }
                    }, 29), Functions.f59621b, Functions.f59622c);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.profile.friends.FriendRequestModel.Listener
            /* renamed from: f */
            public void mo14775f(long j2) {
                ProfileFriendRequestsPresenter.this.getViewState().mo14888f(j2);
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.SectionHeaderModel.Listener
            /* renamed from: g */
            public void mo14776g(@Nullable Integer num) {
            }
        };
        this.f26730c = new ProfileFriendRequestsUiLogic();
        this.f26731d = new ProfileFriendRequestsUiController();
    }

    /* renamed from: b */
    public static void m14877b(ProfileFriendRequestsPresenter profileFriendRequestsPresenter, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = profileFriendRequestsPresenter.f26731d.isEmpty();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        profileFriendRequestsPresenter.m14878a(z, z2);
    }

    /* renamed from: a */
    public final void m14878a(final boolean z, final boolean z2) {
        ProfileRepository profileRepository = this.f26728a;
        profileRepository.f27375b.requestsIn(this.f26730c.f29195b, profileRepository.f27377d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2600c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsPresenter$onProfileFriends$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo14884b();
                }
                if (z2) {
                    this.getViewState().mo14886d();
                }
                return Unit.f63088a;
            }
        }, 25)).m31368j(new C2553a(z, this, z2, 11)).m31370l(new C2600c(new Function1<PageableResponse<Profile>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsPresenter$onProfileFriends$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<Profile> pageableResponse) {
                PageableResponse<Profile> friendRequestsResponse = pageableResponse;
                Intrinsics.m32179h(friendRequestsResponse, "friendRequestsResponse");
                ProfileFriendRequestsUiLogic profileFriendRequestsUiLogic = ProfileFriendRequestsPresenter.this.f26730c;
                List<Profile> friendRequests = friendRequestsResponse.getContent();
                long totalCount = friendRequestsResponse.getTotalCount();
                Objects.requireNonNull(profileFriendRequestsUiLogic);
                Intrinsics.m32179h(friendRequests, "friendRequests");
                boolean z3 = profileFriendRequestsUiLogic.f29198e;
                if (z3) {
                    profileFriendRequestsUiLogic.f29196c.addAll(friendRequests);
                    profileFriendRequestsUiLogic.f29197d = totalCount;
                } else {
                    if (z3) {
                        profileFriendRequestsUiLogic.f29196c.clear();
                    }
                    profileFriendRequestsUiLogic.f29196c.addAll(friendRequests);
                    profileFriendRequestsUiLogic.f29197d = totalCount;
                    profileFriendRequestsUiLogic.f29198e = true;
                }
                ProfileFriendRequestsPresenter profileFriendRequestsPresenter = ProfileFriendRequestsPresenter.this;
                ProfileFriendRequestsUiController profileFriendRequestsUiController = profileFriendRequestsPresenter.f26731d;
                ProfileFriendRequestsUiLogic profileFriendRequestsUiLogic2 = profileFriendRequestsPresenter.f26730c;
                profileFriendRequestsUiController.setData(profileFriendRequestsUiLogic2.f29196c, Long.valueOf(profileFriendRequestsUiLogic2.f29197d), Boolean.valueOf(friendRequestsResponse.getContent().size() >= 25), ProfileFriendRequestsPresenter.this.f26729b);
                if (friendRequestsResponse.getContent().isEmpty()) {
                    ProfileFriendRequestsUiLogic profileFriendRequestsUiLogic3 = ProfileFriendRequestsPresenter.this.f26730c;
                    profileFriendRequestsUiLogic3.f29195b--;
                }
                return Unit.f63088a;
            }
        }, 26), new C2600c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsPresenter$onProfileFriends$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ProfileFriendRequestsPresenter.this.getViewState().mo14885c();
                return Unit.f63088a;
            }
        }, 27), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: c */
    public final void m14879c() {
        ProfileFriendRequestsUiLogic profileFriendRequestsUiLogic = this.f26730c;
        if (profileFriendRequestsUiLogic.f28956a) {
            profileFriendRequestsUiLogic.f29195b = 0;
            profileFriendRequestsUiLogic.f29197d = 0L;
            profileFriendRequestsUiLogic.f29196c.clear();
            profileFriendRequestsUiLogic.f29198e = false;
            m14877b(this, false, false, 2);
        }
    }
}
