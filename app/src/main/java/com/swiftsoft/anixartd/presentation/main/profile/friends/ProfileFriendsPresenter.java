package com.swiftsoft.anixartd.presentation.main.profile.friends;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.profile.RemoveFriendRequestResponse;
import com.swiftsoft.anixartd.network.response.profile.SendFriendRequestResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.profile.friends.ProfileFriendsUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.profile.friends.ProfileFriendsUiLogic;
import com.swiftsoft.anixartd.repository.ProfileRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnProfileSocial;
import com.swiftsoft.anixartd.utils.Quadruple;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function4;
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

/* compiled from: ProfileFriendsPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/friends/ProfileFriendsPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/profile/friends/ProfileFriendsView;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileFriendsPresenter extends MvpPresenter<ProfileFriendsView> {

    /* renamed from: a */
    @NotNull
    public ProfileRepository f26745a;

    /* renamed from: b */
    @NotNull
    public Prefs f26746b;

    /* renamed from: c */
    @NotNull
    public Listener f26747c;

    /* renamed from: d */
    @NotNull
    public ProfileFriendsUiLogic f26748d;

    /* renamed from: e */
    @NotNull
    public ProfileFriendsUiController f26749e;

    /* compiled from: ProfileFriendsPresenter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/friends/ProfileFriendsPresenter$Companion;", "", "", "ACTION_FRIEND_REQUEST_ACCEPT", "I", "ACTION_FRIEND_REQUEST_CANCEL", "ACTION_FRIEND_REQUEST_HIDE", "ACTION_SECTION_FRIEND_REQUEST_MORE", "ACTION_SECTION_OUT_FRIEND_REQUEST_MORE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: ProfileFriendsPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/friends/ProfileFriendsPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/profile/friends/ProfileFriendsUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ProfileFriendsUiController.Listener {
    }

    @Inject
    public ProfileFriendsPresenter(@NotNull ProfileRepository profileRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(profileRepository, "profileRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26745a = profileRepository;
        this.f26746b = prefs;
        this.f26747c = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.profile.friends.FriendRecommendationModel.Listener, com.swiftsoft.anixartd.ui.model.main.profile.friends.FriendRequestModel.Listener
            /* renamed from: a */
            public void mo14773a(long j2, int i2) {
                if (i2 == 1) {
                    final ProfileFriendsPresenter profileFriendsPresenter = ProfileFriendsPresenter.this;
                    profileFriendsPresenter.f26745a.m15306f(j2).m31370l(new C2604a(new Function1<SendFriendRequestResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsPresenter$onSendOrAcceptFriendRequest$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(SendFriendRequestResponse sendFriendRequestResponse) {
                            if (sendFriendRequestResponse.isFailed()) {
                                ProfileFriendsPresenter.this.getViewState().mo14897H0();
                            } else {
                                ProfileFriendsPresenter.this.m14892c();
                            }
                            return Unit.f63088a;
                        }
                    }, 10), new C2604a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsPresenter$onSendOrAcceptFriendRequest$2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Throwable th) {
                            th.printStackTrace();
                            ProfileFriendsPresenter.this.getViewState().mo14897H0();
                            return Unit.f63088a;
                        }
                    }, 11), Functions.f59621b, Functions.f59622c);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.profile.friends.FriendRecommendationModel.Listener, com.swiftsoft.anixartd.ui.model.main.profile.friends.FriendRequestModel.Listener
            /* renamed from: b */
            public void mo14774b(long j2, int i2) {
                if (i2 == 2) {
                    final ProfileFriendsPresenter profileFriendsPresenter = ProfileFriendsPresenter.this;
                    profileFriendsPresenter.f26745a.m15304d(j2).m31370l(new C2604a(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsPresenter$onHideFriendRequest$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Response response) {
                            if (response.isFailed()) {
                                ProfileFriendsPresenter.this.getViewState().mo14896C0();
                            } else {
                                ProfileFriendsPresenter.this.m14892c();
                            }
                            return Unit.f63088a;
                        }
                    }, 8), new C2604a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsPresenter$onHideFriendRequest$2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Throwable th) {
                            th.printStackTrace();
                            ProfileFriendsPresenter.this.getViewState().mo14896C0();
                            return Unit.f63088a;
                        }
                    }, 9), Functions.f59621b, Functions.f59622c);
                } else {
                    if (i2 != 3) {
                        return;
                    }
                    final ProfileFriendsPresenter profileFriendsPresenter2 = ProfileFriendsPresenter.this;
                    profileFriendsPresenter2.f26745a.m15305e(j2).m31370l(new C2604a(new Function1<RemoveFriendRequestResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsPresenter$onRemoveFriendRequest$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(RemoveFriendRequestResponse removeFriendRequestResponse) {
                            if (removeFriendRequestResponse.isFailed()) {
                                ProfileFriendsPresenter.this.getViewState().mo14905s0();
                            } else {
                                ProfileFriendsPresenter.this.m14892c();
                            }
                            return Unit.f63088a;
                        }
                    }, 12), new C2604a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsPresenter$onRemoveFriendRequest$2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Throwable th) {
                            th.printStackTrace();
                            ProfileFriendsPresenter.this.getViewState().mo14905s0();
                            return Unit.f63088a;
                        }
                    }, 13), Functions.f59621b, Functions.f59622c);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.profile.friends.FriendModel.Listener
            /* renamed from: c */
            public void mo14894c(long j2, boolean z) {
                if (z) {
                    EventBusKt.m16327a(new OnProfileSocial(j2));
                } else {
                    ProfileFriendsPresenter.this.getViewState().mo14895B3();
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.profile.friends.FriendModel.Listener, com.swiftsoft.anixartd.ui.model.main.profile.friends.FriendRecommendationModel.Listener, com.swiftsoft.anixartd.ui.model.main.profile.friends.FriendRequestModel.Listener
            /* renamed from: f */
            public void mo14775f(long j2) {
                ProfileFriendsPresenter.this.getViewState().mo14903f(j2);
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.SectionHeaderModel.Listener
            /* renamed from: g */
            public void mo14776g(@Nullable Integer num) {
                if (num != null && num.intValue() == 1) {
                    ProfileFriendsPresenter.this.getViewState().mo14904f2();
                } else if (num != null && num.intValue() == 2) {
                    ProfileFriendsPresenter.this.getViewState().mo14906z2();
                }
            }
        };
        this.f26748d = new ProfileFriendsUiLogic();
        this.f26749e = new ProfileFriendsUiController();
    }

    /* renamed from: b */
    public static void m14890b(ProfileFriendsPresenter profileFriendsPresenter, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = profileFriendsPresenter.f26749e.isEmpty();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        profileFriendsPresenter.m14891a(z, z2);
    }

    /* renamed from: a */
    public final void m14891a(final boolean z, final boolean z2) {
        ProfileRepository profileRepository = this.f26745a;
        ProfileFriendsUiLogic profileFriendsUiLogic = this.f26748d;
        Observable<PageableResponse<Profile>> friends = profileRepository.f27375b.friends(profileFriendsUiLogic.f29200b, profileFriendsUiLogic.f29201c, profileRepository.f27377d.m14080w());
        Scheduler scheduler = Schedulers.f62901c;
        Observable<PageableResponse<Profile>> m31369k = friends.m31372n(scheduler).m31369k(AndroidSchedulers.m31390a());
        ProfileRepository profileRepository2 = this.f26745a;
        Observable<PageableResponse<Profile>> m31369k2 = profileRepository2.f27375b.recommendations(profileRepository2.f27377d.m14080w()).m31372n(scheduler).m31369k(AndroidSchedulers.m31390a());
        ProfileRepository profileRepository3 = this.f26745a;
        Observable<PageableResponse<Profile>> m31369k3 = profileRepository3.f27375b.requestsInLast(profileRepository3.f27377d.m14080w()).m31372n(scheduler).m31369k(AndroidSchedulers.m31390a());
        ProfileRepository profileRepository4 = this.f26745a;
        Observable<PageableResponse<Profile>> m31369k4 = profileRepository4.f27375b.requestsOutLast(profileRepository4.f27377d.m14080w()).m31372n(scheduler).m31369k(AndroidSchedulers.m31390a());
        final int i2 = 0;
        final int i3 = 1;
        final boolean z3 = this.f26748d.f29200b == this.f26746b.m14061d();
        if (z3 && this.f26748d.f29201c == 0) {
            Observable.m31363f(Functions.m31423c(new Function4<T1, T2, T3, T4, R>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsPresenter$onProfileFriends$$inlined$combineLatest$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function4
                /* renamed from: a */
                public final R mo14893a(T1 t1, T2 t2, T3 t3, T4 t4) {
                    return (R) new Quadruple((PageableResponse) t1, (PageableResponse) t2, (PageableResponse) t3, (PageableResponse) t4);
                }
            }), Flowable.f59569b, m31369k2, m31369k, m31369k3, m31369k4).m31367i(new C2604a(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsPresenter$onProfileFriends$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Disposable disposable) {
                    if (z) {
                        this.getViewState().mo14899b();
                    }
                    if (z2) {
                        this.getViewState().mo14901d();
                    }
                    return Unit.f63088a;
                }
            }, 2)).m31368j(new Action() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.b
                @Override // io.reactivex.functions.Action
                public final void run() {
                    switch (i2) {
                        case 0:
                            boolean z4 = z;
                            ProfileFriendsPresenter this$0 = this;
                            boolean z5 = z2;
                            Intrinsics.m32179h(this$0, "this$0");
                            if (z4) {
                                this$0.getViewState().mo14898a();
                            }
                            if (z5) {
                                this$0.getViewState().mo14902e();
                                break;
                            }
                            break;
                        default:
                            boolean z6 = z;
                            ProfileFriendsPresenter this$02 = this;
                            boolean z7 = z2;
                            Intrinsics.m32179h(this$02, "this$0");
                            if (z6) {
                                this$02.getViewState().mo14898a();
                            }
                            if (z7) {
                                this$02.getViewState().mo14902e();
                                break;
                            }
                            break;
                    }
                }
            }).m31370l(new C2604a(new Function1<Quadruple<? extends PageableResponse<Profile>, ? extends PageableResponse<Profile>, ? extends PageableResponse<Profile>, ? extends PageableResponse<Profile>>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsPresenter$onProfileFriends$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Quadruple<? extends PageableResponse<Profile>, ? extends PageableResponse<Profile>, ? extends PageableResponse<Profile>, ? extends PageableResponse<Profile>> quadruple) {
                    Quadruple<? extends PageableResponse<Profile>, ? extends PageableResponse<Profile>, ? extends PageableResponse<Profile>, ? extends PageableResponse<Profile>> quadruple2 = quadruple;
                    PageableResponse pageableResponse = (PageableResponse) quadruple2.f30232b;
                    PageableResponse pageableResponse2 = (PageableResponse) quadruple2.f30233c;
                    PageableResponse pageableResponse3 = (PageableResponse) quadruple2.f30234d;
                    PageableResponse pageableResponse4 = (PageableResponse) quadruple2.f30235e;
                    ProfileFriendsUiLogic profileFriendsUiLogic2 = ProfileFriendsPresenter.this.f26748d;
                    List profileFriendRecommendations = pageableResponse.getContent();
                    List profileFriends = pageableResponse2.getContent();
                    long totalCount = pageableResponse2.getTotalCount();
                    List friendRequests = pageableResponse3.getContent();
                    long totalCount2 = pageableResponse3.getTotalCount();
                    List outFriendRequests = pageableResponse4.getContent();
                    long totalCount3 = pageableResponse4.getTotalCount();
                    Objects.requireNonNull(profileFriendsUiLogic2);
                    Intrinsics.m32179h(profileFriendRecommendations, "profileFriendRecommendations");
                    Intrinsics.m32179h(profileFriends, "profileFriends");
                    Intrinsics.m32179h(friendRequests, "friendRequests");
                    Intrinsics.m32179h(outFriendRequests, "outFriendRequests");
                    boolean z4 = profileFriendsUiLogic2.f29209k;
                    if (z4) {
                        profileFriendsUiLogic2.f29202d.addAll(profileFriendRecommendations);
                        profileFriendsUiLogic2.f29203e.addAll(profileFriends);
                        profileFriendsUiLogic2.f29204f = totalCount;
                        profileFriendsUiLogic2.f29205g.addAll(friendRequests);
                        profileFriendsUiLogic2.f29206h = totalCount2;
                        profileFriendsUiLogic2.f29207i.addAll(outFriendRequests);
                        profileFriendsUiLogic2.f29208j = totalCount3;
                    } else {
                        if (z4) {
                            profileFriendsUiLogic2.m15688a();
                        }
                        profileFriendsUiLogic2.f29202d.addAll(profileFriendRecommendations);
                        profileFriendsUiLogic2.f29203e.addAll(profileFriends);
                        profileFriendsUiLogic2.f29204f = totalCount;
                        profileFriendsUiLogic2.f29205g.addAll(friendRequests);
                        profileFriendsUiLogic2.f29206h = totalCount2;
                        profileFriendsUiLogic2.f29207i.addAll(outFriendRequests);
                        profileFriendsUiLogic2.f29208j = totalCount3;
                        profileFriendsUiLogic2.f29209k = true;
                    }
                    ProfileFriendsPresenter profileFriendsPresenter = ProfileFriendsPresenter.this;
                    ProfileFriendsUiController profileFriendsUiController = profileFriendsPresenter.f26749e;
                    Long valueOf = Long.valueOf(profileFriendsPresenter.f26748d.f29200b);
                    ProfileFriendsUiLogic profileFriendsUiLogic3 = ProfileFriendsPresenter.this.f26748d;
                    List<Profile> list = profileFriendsUiLogic3.f29202d;
                    List<Profile> list2 = profileFriendsUiLogic3.f29203e;
                    Long valueOf2 = Long.valueOf(profileFriendsUiLogic3.f29204f);
                    ProfileFriendsUiLogic profileFriendsUiLogic4 = ProfileFriendsPresenter.this.f26748d;
                    List<Profile> list3 = profileFriendsUiLogic4.f29205g;
                    Long valueOf3 = Long.valueOf(profileFriendsUiLogic4.f29206h);
                    ProfileFriendsUiLogic profileFriendsUiLogic5 = ProfileFriendsPresenter.this.f26748d;
                    profileFriendsUiController.setData(valueOf, list, list2, valueOf2, list3, valueOf3, profileFriendsUiLogic5.f29207i, Long.valueOf(profileFriendsUiLogic5.f29208j), Boolean.valueOf(z3), Boolean.valueOf(pageableResponse2.getContent().size() >= 25), ProfileFriendsPresenter.this.f26747c);
                    return Unit.f63088a;
                }
            }, 3), new C2604a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsPresenter$onProfileFriends$5
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Throwable th) {
                    th.printStackTrace();
                    ProfileFriendsPresenter.this.getViewState().mo14900c();
                    return Unit.f63088a;
                }
            }, 4), Functions.f59621b, Functions.f59622c);
        } else {
            m31369k.m31367i(new C2604a(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsPresenter$onProfileFriends$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Disposable disposable) {
                    if (z) {
                        this.getViewState().mo14899b();
                    }
                    if (z2) {
                        this.getViewState().mo14901d();
                    }
                    return Unit.f63088a;
                }
            }, 5)).m31368j(new Action() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.b
                @Override // io.reactivex.functions.Action
                public final void run() {
                    switch (i3) {
                        case 0:
                            boolean z4 = z;
                            ProfileFriendsPresenter this$0 = this;
                            boolean z5 = z2;
                            Intrinsics.m32179h(this$0, "this$0");
                            if (z4) {
                                this$0.getViewState().mo14898a();
                            }
                            if (z5) {
                                this$0.getViewState().mo14902e();
                                break;
                            }
                            break;
                        default:
                            boolean z6 = z;
                            ProfileFriendsPresenter this$02 = this;
                            boolean z7 = z2;
                            Intrinsics.m32179h(this$02, "this$0");
                            if (z6) {
                                this$02.getViewState().mo14898a();
                            }
                            if (z7) {
                                this$02.getViewState().mo14902e();
                                break;
                            }
                            break;
                    }
                }
            }).m31370l(new C2604a(new Function1<PageableResponse<Profile>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsPresenter$onProfileFriends$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(PageableResponse<Profile> pageableResponse) {
                    PageableResponse<Profile> friends2 = pageableResponse;
                    Intrinsics.m32179h(friends2, "friends");
                    ProfileFriendsUiLogic profileFriendsUiLogic2 = ProfileFriendsPresenter.this.f26748d;
                    List<Profile> profileFriends = friends2.getContent();
                    long totalCount = friends2.getTotalCount();
                    Objects.requireNonNull(profileFriendsUiLogic2);
                    Intrinsics.m32179h(profileFriends, "profileFriends");
                    boolean z4 = profileFriendsUiLogic2.f29209k;
                    if (z4) {
                        profileFriendsUiLogic2.f29203e.addAll(profileFriends);
                        profileFriendsUiLogic2.f29204f = totalCount;
                    } else {
                        if (z4) {
                            profileFriendsUiLogic2.m15688a();
                        }
                        profileFriendsUiLogic2.f29203e.addAll(profileFriends);
                        profileFriendsUiLogic2.f29204f = totalCount;
                        profileFriendsUiLogic2.f29209k = true;
                    }
                    ProfileFriendsPresenter profileFriendsPresenter = ProfileFriendsPresenter.this;
                    ProfileFriendsUiController profileFriendsUiController = profileFriendsPresenter.f26749e;
                    Long valueOf = Long.valueOf(profileFriendsPresenter.f26748d.f29200b);
                    ProfileFriendsUiLogic profileFriendsUiLogic3 = ProfileFriendsPresenter.this.f26748d;
                    List<Profile> list = profileFriendsUiLogic3.f29202d;
                    List<Profile> list2 = profileFriendsUiLogic3.f29203e;
                    Long valueOf2 = Long.valueOf(profileFriendsUiLogic3.f29204f);
                    ProfileFriendsUiLogic profileFriendsUiLogic4 = ProfileFriendsPresenter.this.f26748d;
                    List<Profile> list3 = profileFriendsUiLogic4.f29205g;
                    Long valueOf3 = Long.valueOf(profileFriendsUiLogic4.f29206h);
                    ProfileFriendsUiLogic profileFriendsUiLogic5 = ProfileFriendsPresenter.this.f26748d;
                    profileFriendsUiController.setData(valueOf, list, list2, valueOf2, list3, valueOf3, profileFriendsUiLogic5.f29207i, Long.valueOf(profileFriendsUiLogic5.f29208j), Boolean.valueOf(z3), Boolean.valueOf(friends2.getContent().size() >= 25), ProfileFriendsPresenter.this.f26747c);
                    return Unit.f63088a;
                }
            }, 6), new C2604a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsPresenter$onProfileFriends$9
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Throwable th) {
                    th.printStackTrace();
                    ProfileFriendsPresenter.this.getViewState().mo14900c();
                    return Unit.f63088a;
                }
            }, 7), Functions.f59621b, Functions.f59622c);
        }
    }

    /* renamed from: c */
    public final void m14892c() {
        ProfileFriendsUiLogic profileFriendsUiLogic = this.f26748d;
        if (profileFriendsUiLogic.f28956a) {
            profileFriendsUiLogic.m15688a();
            m14890b(this, false, false, 2);
        }
    }
}
