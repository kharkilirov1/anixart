package com.swiftsoft.anixartd.presentation.main.profile;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.profile.ProfileBlockListUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.profile.ProfileBlockListUiLogic;
import com.swiftsoft.anixartd.presentation.comments.C2553a;
import com.swiftsoft.anixartd.presentation.main.notifications.C2588a;
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

/* compiled from: ProfileBlockListPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/ProfileBlockListPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/profile/ProfileBlockListView;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileBlockListPresenter extends MvpPresenter<ProfileBlockListView> {

    /* renamed from: a */
    @NotNull
    public ProfileRepository f26568a;

    /* renamed from: b */
    @NotNull
    public Listener f26569b;

    /* renamed from: c */
    @NotNull
    public ProfileBlockListUiLogic f26570c;

    /* renamed from: d */
    @NotNull
    public ProfileBlockListUiController f26571d;

    /* compiled from: ProfileBlockListPresenter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/ProfileBlockListPresenter$Companion;", "", "", "ACTION_UNBLOCK", "I", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: ProfileBlockListPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/ProfileBlockListPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/profile/ProfileBlockListUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ProfileBlockListUiController.Listener {
    }

    @Inject
    public ProfileBlockListPresenter(@NotNull ProfileRepository profileRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(profileRepository, "profileRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26568a = profileRepository;
        this.f26569b = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfileBlockListPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.profile.friends.FriendRequestModel.Listener
            /* renamed from: a */
            public void mo14773a(long j2, int i2) {
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.profile.friends.FriendRequestModel.Listener
            /* renamed from: b */
            public void mo14774b(long j2, int i2) {
                if (i2 == 1) {
                    final ProfileBlockListPresenter profileBlockListPresenter = ProfileBlockListPresenter.this;
                    profileBlockListPresenter.f26568a.m15303c(j2).m31370l(new C2588a(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfileBlockListPresenter$onUnblock$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Response response) {
                            if (response.isFailed()) {
                                ProfileBlockListPresenter.this.getViewState().mo14778Z2();
                            } else {
                                ProfileBlockListPresenter.this.getViewState().mo14777A0();
                            }
                            return Unit.f63088a;
                        }
                    }, 26), new C2588a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfileBlockListPresenter$onUnblock$2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Throwable th) {
                            th.printStackTrace();
                            ProfileBlockListPresenter.this.getViewState().mo14778Z2();
                            return Unit.f63088a;
                        }
                    }, 27), Functions.f59621b, Functions.f59622c);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.profile.friends.FriendRequestModel.Listener
            /* renamed from: f */
            public void mo14775f(long j2) {
                ProfileBlockListPresenter.this.getViewState().mo14784f(j2);
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.SectionHeaderModel.Listener
            /* renamed from: g */
            public void mo14776g(@Nullable Integer num) {
            }
        };
        this.f26570c = new ProfileBlockListUiLogic();
        this.f26571d = new ProfileBlockListUiController();
    }

    /* renamed from: b */
    public static void m14770b(ProfileBlockListPresenter profileBlockListPresenter, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = profileBlockListPresenter.f26571d.isEmpty();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        profileBlockListPresenter.m14771a(z, z2);
    }

    /* renamed from: a */
    public final void m14771a(final boolean z, final boolean z2) {
        ProfileRepository profileRepository = this.f26568a;
        profileRepository.f27376c.blockList(this.f26570c.f29148b, profileRepository.f27377d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2588a(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfileBlockListPresenter$onBlockList$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo14780b();
                }
                if (z2) {
                    this.getViewState().mo14782d();
                }
                return Unit.f63088a;
            }
        }, 28)).m31368j(new C2553a(z, this, z2, 9)).m31370l(new C2588a(new Function1<PageableResponse<Profile>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfileBlockListPresenter$onBlockList$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<Profile> pageableResponse) {
                PageableResponse<Profile> friendRequestsResponse = pageableResponse;
                Intrinsics.m32179h(friendRequestsResponse, "friendRequestsResponse");
                ProfileBlockListUiLogic profileBlockListUiLogic = ProfileBlockListPresenter.this.f26570c;
                List<Profile> blockedProfiles = friendRequestsResponse.getContent();
                long totalCount = friendRequestsResponse.getTotalCount();
                Objects.requireNonNull(profileBlockListUiLogic);
                Intrinsics.m32179h(blockedProfiles, "blockedProfiles");
                boolean z3 = profileBlockListUiLogic.f29151e;
                if (z3) {
                    profileBlockListUiLogic.f29149c.addAll(blockedProfiles);
                    profileBlockListUiLogic.f29150d = totalCount;
                } else {
                    if (z3) {
                        profileBlockListUiLogic.f29149c.clear();
                    }
                    profileBlockListUiLogic.f29149c.addAll(blockedProfiles);
                    profileBlockListUiLogic.f29150d = totalCount;
                    profileBlockListUiLogic.f29151e = true;
                }
                ProfileBlockListPresenter profileBlockListPresenter = ProfileBlockListPresenter.this;
                ProfileBlockListUiController profileBlockListUiController = profileBlockListPresenter.f26571d;
                ProfileBlockListUiLogic profileBlockListUiLogic2 = profileBlockListPresenter.f26570c;
                profileBlockListUiController.setData(profileBlockListUiLogic2.f29149c, Long.valueOf(profileBlockListUiLogic2.f29150d), Boolean.valueOf(friendRequestsResponse.getContent().size() >= 25), ProfileBlockListPresenter.this.f26569b);
                return Unit.f63088a;
            }
        }, 29), new C2598a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfileBlockListPresenter$onBlockList$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ProfileBlockListPresenter.this.getViewState().mo14781c();
                return Unit.f63088a;
            }
        }, 0), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: c */
    public final void m14772c() {
        ProfileBlockListUiLogic profileBlockListUiLogic = this.f26570c;
        if (profileBlockListUiLogic.f28956a) {
            profileBlockListUiLogic.f29148b = 0;
            profileBlockListUiLogic.f29150d = 0L;
            profileBlockListUiLogic.f29149c.clear();
            profileBlockListUiLogic.f29151e = false;
            m14770b(this, false, false, 2);
        }
    }
}
