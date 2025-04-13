package com.swiftsoft.anixartd.p015ui.controller.main.profile.friends;

import com.airbnb.epoxy.EpoxyModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.epoxy.Typed11EpoxyController;
import com.swiftsoft.anixartd.p015ui.logic.main.profile.friends.ProfileFriendsUiLogic;
import com.swiftsoft.anixartd.p015ui.model.common.ErrorResourceModel_;
import com.swiftsoft.anixartd.p015ui.model.common.ErrorSectionModel_;
import com.swiftsoft.anixartd.p015ui.model.common.LoadingModel_;
import com.swiftsoft.anixartd.p015ui.model.common.SectionHeaderModel;
import com.swiftsoft.anixartd.p015ui.model.common.SectionHeaderModel_;
import com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendModel;
import com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendModel_;
import com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRecommendationModel;
import com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRecommendationModel_;
import com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRequestModel;
import com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRequestModel_;
import com.swiftsoft.anixartd.p015ui.model.main.profile.friends.carousel.RecommendationCarouselModel_;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p029i.C6284a;

/* compiled from: ProfileFriendsUiController.kt */
@Metadata(m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u0000 \u00162\\\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0002\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0007Jx\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\r\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000f\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0006H\u0014J\u0006\u0010\u0015\u001a\u00020\u0005¨\u0006\u0018"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/profile/friends/ProfileFriendsUiController;", "Lcom/swiftsoft/anixartd/epoxy/Typed11EpoxyController;", "", "", "Lcom/swiftsoft/anixartd/database/entity/Profile;", "", "Lcom/swiftsoft/anixartd/ui/controller/main/profile/friends/ProfileFriendsUiController$Listener;", "()V", "buildModels", "", "profileId", "profileFriendRecommendations", "profileFriends", "profileFriendsTotalCount", "friendRequests", "friendRequestsTotalCount", "outFriendRequests", "outFriendRequestsTotalCount", "isMyFriends", "isLoadable", "listener", "isEmpty", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ProfileFriendsUiController extends Typed11EpoxyController<Long, List<? extends Profile>, List<? extends Profile>, Long, List<? extends Profile>, Long, List<? extends Profile>, Long, Boolean, Boolean, Listener> {
    private static final int ACTION_FRIEND_REQUEST_ACCEPT = 1;
    private static final int ACTION_FRIEND_REQUEST_CANCEL = 3;
    private static final int ACTION_FRIEND_REQUEST_HIDE = 2;
    private static final int ACTION_SECTION_FRIEND_REQUEST_MORE = 1;
    private static final int ACTION_SECTION_OUT_FRIEND_REQUEST_MORE = 2;

    /* compiled from: ProfileFriendsUiController.kt */
    @Metadata(m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/profile/friends/ProfileFriendsUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/common/SectionHeaderModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/profile/friends/FriendModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/profile/friends/FriendRecommendationModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/profile/friends/FriendRequestModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends SectionHeaderModel.Listener, FriendModel.Listener, FriendRecommendationModel.Listener, FriendRequestModel.Listener {
    }

    public ProfileFriendsUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$12$lambda$11$lambda$10(int i2, int i3, int i4) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$16$lambda$15$lambda$14(int i2, int i3, int i4) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$4$lambda$3$lambda$2$lambda$1(int i2, int i3, int i4) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$8$lambda$7$lambda$6(int i2, int i3, int i4) {
        return i2;
    }

    @Override // com.swiftsoft.anixartd.epoxy.Typed11EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(Long l2, List<? extends Profile> list, List<? extends Profile> list2, Long l3, List<? extends Profile> list3, Long l4, List<? extends Profile> list4, Long l5, Boolean bool, Boolean bool2, Listener listener) {
        buildModels(l2.longValue(), (List<Profile>) list, (List<Profile>) list2, l3.longValue(), (List<Profile>) list3, l4.longValue(), (List<Profile>) list4, l5.longValue(), bool.booleanValue(), bool2.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(long profileId, @NotNull List<Profile> profileFriendRecommendations, @NotNull List<Profile> profileFriends, long profileFriendsTotalCount, @NotNull List<Profile> friendRequests, long friendRequestsTotalCount, @NotNull List<Profile> outFriendRequests, long outFriendRequestsTotalCount, boolean isMyFriends, boolean isLoadable, @NotNull Listener listener) {
        String str;
        int i2;
        int i3;
        Intrinsics.m32179h(profileFriendRecommendations, "profileFriendRecommendations");
        Intrinsics.m32179h(profileFriends, "profileFriends");
        Intrinsics.m32179h(friendRequests, "friendRequests");
        Intrinsics.m32179h(outFriendRequests, "outFriendRequests");
        Intrinsics.m32179h(listener, "listener");
        int i4 = 2;
        int i5 = 3;
        String str2 = "";
        if (!profileFriendRecommendations.isEmpty()) {
            SectionHeaderModel_ sectionHeaderModel_ = new SectionHeaderModel_();
            sectionHeaderModel_.m4520h2("sectionHeader1");
            sectionHeaderModel_.m4524l2();
            sectionHeaderModel_.f29432k = C2507R.string.profile_friend_recommendations;
            sectionHeaderModel_.m4524l2();
            sectionHeaderModel_.f29434m = "";
            sectionHeaderModel_.m4524l2();
            sectionHeaderModel_.f29435n = false;
            sectionHeaderModel_.m4524l2();
            sectionHeaderModel_.f29436o = 1;
            sectionHeaderModel_.m4524l2();
            sectionHeaderModel_.f29437p = listener;
            add(sectionHeaderModel_);
            RecommendationCarouselModel_ recommendationCarouselModel_ = new RecommendationCarouselModel_();
            recommendationCarouselModel_.m4520h2("recommendationCarousel");
            ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(profileFriendRecommendations, 10));
            for (Profile profile : profileFriendRecommendations) {
                int m15689a = ProfileFriendsUiLogic.f29199l.m15689a(profileId, profile.getId(), profile.getFriendStatus());
                if (m15689a != 0) {
                    if (m15689a == 1) {
                        i2 = C2507R.string.profile_del_friend_short;
                    } else if (m15689a == i4) {
                        i2 = C2507R.string.profile_friend_request_cancel;
                    } else if (m15689a != i5) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        i3 = C2507R.string.profile_friend_request_accept;
                    }
                    i3 = 0;
                } else {
                    i2 = 0;
                    i3 = C2507R.string.profile_add_friend_short;
                }
                FriendRecommendationModel_ friendRecommendationModel_ = new FriendRecommendationModel_();
                friendRecommendationModel_.m16135x2(profile.getId());
                String login = profile.getLogin();
                friendRecommendationModel_.m4524l2();
                Intrinsics.m32179h(login, "<set-?>");
                friendRecommendationModel_.f29910k = login;
                String avatar = profile.getAvatar();
                friendRecommendationModel_.m4524l2();
                friendRecommendationModel_.f29911l = avatar;
                boolean isOnline = profile.getIsOnline();
                friendRecommendationModel_.m4524l2();
                friendRecommendationModel_.f29912m = isOnline;
                friendRecommendationModel_.m4524l2();
                friendRecommendationModel_.f29913n = i3;
                friendRecommendationModel_.m4524l2();
                friendRecommendationModel_.f29915p = 1;
                friendRecommendationModel_.m4524l2();
                friendRecommendationModel_.f29914o = i2;
                friendRecommendationModel_.m4524l2();
                friendRecommendationModel_.f29916q = 3;
                boolean isSponsor = profile.getIsSponsor();
                friendRecommendationModel_.m4524l2();
                friendRecommendationModel_.f29917r = isSponsor;
                boolean isVerified = profile.getIsVerified();
                friendRecommendationModel_.m4524l2();
                friendRecommendationModel_.f29918s = isVerified;
                friendRecommendationModel_.m4524l2();
                friendRecommendationModel_.f29919t = listener;
                friendRecommendationModel_.f6932i = C6284a.f58040t;
                arrayList.add(friendRecommendationModel_);
                str2 = str2;
                i4 = 2;
                i5 = 3;
            }
            str = str2;
            recommendationCarouselModel_.f29936k.set(6);
            recommendationCarouselModel_.m4524l2();
            recommendationCarouselModel_.f29938m = arrayList;
            add(recommendationCarouselModel_);
        } else {
            str = "";
        }
        if (!friendRequests.isEmpty()) {
            SectionHeaderModel_ sectionHeaderModel_2 = new SectionHeaderModel_();
            sectionHeaderModel_2.m4520h2("sectionHeader2");
            sectionHeaderModel_2.m4524l2();
            sectionHeaderModel_2.f29432k = C2507R.string.profile_friend_requests;
            sectionHeaderModel_2.mo15778w1(friendRequestsTotalCount > 3 ? String.valueOf(friendRequestsTotalCount) : str);
            boolean z = friendRequestsTotalCount > 3;
            sectionHeaderModel_2.m4524l2();
            sectionHeaderModel_2.f29435n = z;
            sectionHeaderModel_2.m4524l2();
            sectionHeaderModel_2.f29436o = 1;
            sectionHeaderModel_2.m4524l2();
            sectionHeaderModel_2.f29437p = listener;
            add(sectionHeaderModel_2);
            for (Profile profile2 : friendRequests) {
                FriendRequestModel_ friendRequestModel_ = new FriendRequestModel_();
                friendRequestModel_.mo16145b(profile2.getId());
                friendRequestModel_.mo16147k(profile2.getLogin());
                String avatar2 = profile2.getAvatar();
                friendRequestModel_.m4524l2();
                friendRequestModel_.f29923l = avatar2;
                boolean isOnline2 = profile2.getIsOnline();
                friendRequestModel_.m4524l2();
                friendRequestModel_.f29924m = isOnline2;
                int friendCount = profile2.getFriendCount();
                friendRequestModel_.m4524l2();
                friendRequestModel_.f29925n = friendCount;
                friendRequestModel_.m4524l2();
                friendRequestModel_.f29927p = C2507R.string.profile_friend_request_accept;
                friendRequestModel_.m4524l2();
                friendRequestModel_.f29929r = 1;
                friendRequestModel_.m4524l2();
                friendRequestModel_.f29928q = C2507R.string.profile_friend_request_hide;
                friendRequestModel_.m4524l2();
                friendRequestModel_.f29930s = 2;
                boolean isSponsor2 = profile2.getIsSponsor();
                friendRequestModel_.m4524l2();
                friendRequestModel_.f29931t = isSponsor2;
                boolean isVerified2 = profile2.getIsVerified();
                friendRequestModel_.m4524l2();
                friendRequestModel_.f29932u = isVerified2;
                friendRequestModel_.m4524l2();
                friendRequestModel_.f29933v = listener;
                friendRequestModel_.f6932i = C6284a.f58041u;
                add(friendRequestModel_);
            }
        }
        if (!outFriendRequests.isEmpty()) {
            SectionHeaderModel_ sectionHeaderModel_3 = new SectionHeaderModel_();
            sectionHeaderModel_3.m4520h2("sectionHeader3");
            sectionHeaderModel_3.m4524l2();
            sectionHeaderModel_3.f29436o = 2;
            sectionHeaderModel_3.m4524l2();
            sectionHeaderModel_3.f29432k = C2507R.string.profile_out_friend_requests;
            sectionHeaderModel_3.mo15778w1(outFriendRequestsTotalCount > 3 ? String.valueOf(outFriendRequestsTotalCount) : str);
            boolean z2 = outFriendRequestsTotalCount > 3;
            sectionHeaderModel_3.m4524l2();
            sectionHeaderModel_3.f29435n = z2;
            sectionHeaderModel_3.m4524l2();
            sectionHeaderModel_3.f29437p = listener;
            add(sectionHeaderModel_3);
            for (Profile profile3 : outFriendRequests) {
                FriendRequestModel_ friendRequestModel_2 = new FriendRequestModel_();
                friendRequestModel_2.mo16145b(profile3.getId());
                friendRequestModel_2.mo16147k(profile3.getLogin());
                String avatar3 = profile3.getAvatar();
                friendRequestModel_2.m4524l2();
                friendRequestModel_2.f29923l = avatar3;
                boolean isOnline3 = profile3.getIsOnline();
                friendRequestModel_2.m4524l2();
                friendRequestModel_2.f29924m = isOnline3;
                int friendCount2 = profile3.getFriendCount();
                friendRequestModel_2.m4524l2();
                friendRequestModel_2.f29925n = friendCount2;
                friendRequestModel_2.m4524l2();
                friendRequestModel_2.f29928q = C2507R.string.profile_friend_request_cancel;
                friendRequestModel_2.m4524l2();
                friendRequestModel_2.f29930s = 3;
                boolean isSponsor3 = profile3.getIsSponsor();
                friendRequestModel_2.m4524l2();
                friendRequestModel_2.f29931t = isSponsor3;
                boolean isVerified3 = profile3.getIsVerified();
                friendRequestModel_2.m4524l2();
                friendRequestModel_2.f29932u = isVerified3;
                friendRequestModel_2.m4524l2();
                friendRequestModel_2.f29933v = listener;
                friendRequestModel_2.f6932i = C6284a.f58042v;
                add(friendRequestModel_2);
            }
        }
        if ((!profileFriends.isEmpty()) || (!friendRequests.isEmpty()) || (!outFriendRequests.isEmpty())) {
            SectionHeaderModel_ sectionHeaderModel_4 = new SectionHeaderModel_();
            sectionHeaderModel_4.m4520h2("sectionHeader4");
            int i6 = isMyFriends ? C2507R.string.profile_all_my_friends : C2507R.string.profile_all_friends;
            sectionHeaderModel_4.m4524l2();
            sectionHeaderModel_4.f29432k = i6;
            sectionHeaderModel_4.mo15778w1(String.valueOf(profileFriendsTotalCount));
            sectionHeaderModel_4.m4524l2();
            sectionHeaderModel_4.f29435n = false;
            sectionHeaderModel_4.m4524l2();
            sectionHeaderModel_4.f29437p = listener;
            add(sectionHeaderModel_4);
        }
        if (!profileFriends.isEmpty()) {
            for (Profile profile4 : profileFriends) {
                FriendModel_ friendModel_ = new FriendModel_();
                friendModel_.m16130w2(profile4.getId());
                friendModel_.m16131x2(profile4.getLogin());
                String avatar4 = profile4.getAvatar();
                friendModel_.m4524l2();
                friendModel_.f29902l = avatar4;
                boolean isOnline4 = profile4.getIsOnline();
                friendModel_.m4524l2();
                friendModel_.f29903m = isOnline4;
                int friendCount3 = profile4.getFriendCount();
                friendModel_.m4524l2();
                friendModel_.f29904n = friendCount3;
                boolean isSponsor4 = profile4.getIsSponsor();
                friendModel_.m4524l2();
                friendModel_.f29905o = isSponsor4;
                boolean isVerified4 = profile4.getIsVerified();
                friendModel_.m4524l2();
                friendModel_.f29906p = isVerified4;
                boolean isSocial = profile4.getIsSocial();
                friendModel_.m4524l2();
                friendModel_.f29907q = isSocial;
                friendModel_.m4524l2();
                friendModel_.f29908r = listener;
                friendModel_.f6932i = C6284a.f58043w;
                add(friendModel_);
            }
        } else if (friendRequests.isEmpty() && outFriendRequests.isEmpty()) {
            ErrorResourceModel_ errorResourceModel_ = new ErrorResourceModel_();
            errorResourceModel_.m4520h2("errorResource");
            errorResourceModel_.m4524l2();
            errorResourceModel_.f29385k = C2507R.string.error_no_friends;
            add(errorResourceModel_);
        } else {
            ErrorSectionModel_ errorSectionModel_ = new ErrorSectionModel_();
            errorSectionModel_.m4520h2("errorSection");
            errorSectionModel_.m4524l2();
            errorSectionModel_.f29386k = C2507R.string.error_no_friends;
            add(errorSectionModel_);
        }
        if (isLoadable) {
            EpoxyModel<?> loadingModel_ = new LoadingModel_();
            loadingModel_.m4520h2("loading");
            add(loadingModel_);
        }
    }
}
