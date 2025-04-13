package com.swiftsoft.anixartd.presentation.main.profile.friends;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.profile.RemoveFriendRequestResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.profile.friends.ProfileOutFriendRequestsUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.profile.friends.ProfileOutFriendRequestsUiLogic;
import com.swiftsoft.anixartd.presentation.comments.C2553a;
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

/* compiled from: ProfileOutFriendRequestsPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/friends/ProfileOutFriendRequestsPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/profile/friends/ProfileOutFriendRequestsView;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileOutFriendRequestsPresenter extends MvpPresenter<ProfileOutFriendRequestsView> {

    /* renamed from: a */
    @NotNull
    public ProfileRepository f26772a;

    /* renamed from: b */
    @NotNull
    public Listener f26773b;

    /* renamed from: c */
    @NotNull
    public ProfileOutFriendRequestsUiLogic f26774c;

    /* renamed from: d */
    @NotNull
    public ProfileOutFriendRequestsUiController f26775d;

    /* compiled from: ProfileOutFriendRequestsPresenter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/friends/ProfileOutFriendRequestsPresenter$Companion;", "", "", "ACTION_FRIEND_REQUEST_CANCEL", "I", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: ProfileOutFriendRequestsPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/friends/ProfileOutFriendRequestsPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/profile/friends/ProfileOutFriendRequestsUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ProfileOutFriendRequestsUiController.Listener {
    }

    @Inject
    public ProfileOutFriendRequestsPresenter(@NotNull ProfileRepository profileRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(profileRepository, "profileRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26772a = profileRepository;
        this.f26773b = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileOutFriendRequestsPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.profile.friends.FriendRequestModel.Listener
            /* renamed from: a */
            public void mo14773a(long j2, int i2) {
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.profile.friends.FriendRequestModel.Listener
            /* renamed from: b */
            public void mo14774b(long j2, int i2) {
                if (i2 == 1) {
                    final ProfileOutFriendRequestsPresenter profileOutFriendRequestsPresenter = ProfileOutFriendRequestsPresenter.this;
                    profileOutFriendRequestsPresenter.f26772a.m15305e(j2).m31370l(new C2604a(new Function1<RemoveFriendRequestResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileOutFriendRequestsPresenter$onCancelFriendRequest$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(RemoveFriendRequestResponse removeFriendRequestResponse) {
                            if (removeFriendRequestResponse.isFailed()) {
                                ProfileOutFriendRequestsPresenter.this.getViewState().mo14917s0();
                            } else {
                                ProfileOutFriendRequestsPresenter.this.getViewState().mo14910W3();
                            }
                            return Unit.f63088a;
                        }
                    }, 17), new C2604a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileOutFriendRequestsPresenter$onCancelFriendRequest$2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Throwable th) {
                            th.printStackTrace();
                            ProfileOutFriendRequestsPresenter.this.getViewState().mo14917s0();
                            return Unit.f63088a;
                        }
                    }, 18), Functions.f59621b, Functions.f59622c);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.profile.friends.FriendRequestModel.Listener
            /* renamed from: f */
            public void mo14775f(long j2) {
                ProfileOutFriendRequestsPresenter.this.getViewState().mo14916f(j2);
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.SectionHeaderModel.Listener
            /* renamed from: g */
            public void mo14776g(@Nullable Integer num) {
            }
        };
        this.f26774c = new ProfileOutFriendRequestsUiLogic();
        this.f26775d = new ProfileOutFriendRequestsUiController();
    }

    /* renamed from: b */
    public static void m14907b(ProfileOutFriendRequestsPresenter profileOutFriendRequestsPresenter, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = profileOutFriendRequestsPresenter.f26775d.isEmpty();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        profileOutFriendRequestsPresenter.m14908a(z, z2);
    }

    /* renamed from: a */
    public final void m14908a(final boolean z, final boolean z2) {
        ProfileRepository profileRepository = this.f26772a;
        profileRepository.f27375b.requestsOut(this.f26774c.f29210b, profileRepository.f27377d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2604a(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileOutFriendRequestsPresenter$onProfileFriends$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo14912b();
                }
                if (z2) {
                    this.getViewState().mo14914d();
                }
                return Unit.f63088a;
            }
        }, 14)).m31368j(new C2553a(z, this, z2, 12)).m31370l(new C2604a(new Function1<PageableResponse<Profile>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileOutFriendRequestsPresenter$onProfileFriends$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<Profile> pageableResponse) {
                PageableResponse<Profile> outFriendRequestsResponse = pageableResponse;
                Intrinsics.m32179h(outFriendRequestsResponse, "outFriendRequestsResponse");
                ProfileOutFriendRequestsUiLogic profileOutFriendRequestsUiLogic = ProfileOutFriendRequestsPresenter.this.f26774c;
                List<Profile> friendRequests = outFriendRequestsResponse.getContent();
                long totalCount = outFriendRequestsResponse.getTotalCount();
                Objects.requireNonNull(profileOutFriendRequestsUiLogic);
                Intrinsics.m32179h(friendRequests, "friendRequests");
                boolean z3 = profileOutFriendRequestsUiLogic.f29213e;
                if (z3) {
                    profileOutFriendRequestsUiLogic.f29211c.addAll(friendRequests);
                    profileOutFriendRequestsUiLogic.f29212d = totalCount;
                } else {
                    if (z3) {
                        profileOutFriendRequestsUiLogic.f29211c.clear();
                    }
                    profileOutFriendRequestsUiLogic.f29211c.addAll(friendRequests);
                    profileOutFriendRequestsUiLogic.f29212d = totalCount;
                    profileOutFriendRequestsUiLogic.f29213e = true;
                }
                ProfileOutFriendRequestsPresenter profileOutFriendRequestsPresenter = ProfileOutFriendRequestsPresenter.this;
                ProfileOutFriendRequestsUiController profileOutFriendRequestsUiController = profileOutFriendRequestsPresenter.f26775d;
                ProfileOutFriendRequestsUiLogic profileOutFriendRequestsUiLogic2 = profileOutFriendRequestsPresenter.f26774c;
                profileOutFriendRequestsUiController.setData(profileOutFriendRequestsUiLogic2.f29211c, Long.valueOf(profileOutFriendRequestsUiLogic2.f29212d), Boolean.valueOf(outFriendRequestsResponse.getContent().size() >= 25), ProfileOutFriendRequestsPresenter.this.f26773b);
                if (outFriendRequestsResponse.getContent().isEmpty()) {
                    ProfileOutFriendRequestsUiLogic profileOutFriendRequestsUiLogic3 = ProfileOutFriendRequestsPresenter.this.f26774c;
                    profileOutFriendRequestsUiLogic3.f29210b--;
                }
                return Unit.f63088a;
            }
        }, 15), new C2604a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileOutFriendRequestsPresenter$onProfileFriends$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ProfileOutFriendRequestsPresenter.this.getViewState().mo14913c();
                return Unit.f63088a;
            }
        }, 16), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: c */
    public final void m14909c() {
        ProfileOutFriendRequestsUiLogic profileOutFriendRequestsUiLogic = this.f26774c;
        if (profileOutFriendRequestsUiLogic.f28956a) {
            profileOutFriendRequestsUiLogic.f29210b = 0;
            profileOutFriendRequestsUiLogic.f29212d = 0L;
            profileOutFriendRequestsUiLogic.f29211c.clear();
            profileOutFriendRequestsUiLogic.f29213e = false;
            m14907b(this, false, false, 2);
        }
    }
}
