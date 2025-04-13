package com.swiftsoft.anixartd.p015ui.controller.main.profile.friends;

import com.airbnb.epoxy.Typed4EpoxyController;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.p015ui.model.common.ErrorResourceModel_;
import com.swiftsoft.anixartd.p015ui.model.common.LoadingModel_;
import com.swiftsoft.anixartd.p015ui.model.common.SectionHeaderModel;
import com.swiftsoft.anixartd.p015ui.model.common.SectionHeaderModel_;
import com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRequestModel;
import com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRequestModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p029i.C6284a;

/* compiled from: ProfileOutFriendRequestsUiController.kt */
@Metadata(m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u000f2 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0002\u000f\u0010B\u0005¢\u0006\u0002\u0010\u0007J.\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0006H\u0014J\u0006\u0010\u000e\u001a\u00020\u0005¨\u0006\u0011"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/profile/friends/ProfileOutFriendRequestsUiController;", "Lcom/airbnb/epoxy/Typed4EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/Profile;", "", "", "Lcom/swiftsoft/anixartd/ui/controller/main/profile/friends/ProfileOutFriendRequestsUiController$Listener;", "()V", "buildModels", "", "outFriendRequests", "outFriendRequestsTotalCount", "isLoadable", "listener", "isEmpty", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ProfileOutFriendRequestsUiController extends Typed4EpoxyController<List<? extends Profile>, Long, Boolean, Listener> {
    private static final int ACTION_FRIEND_REQUEST_CANCEL = 1;

    /* compiled from: ProfileOutFriendRequestsUiController.kt */
    @Metadata(m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/profile/friends/ProfileOutFriendRequestsUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/common/SectionHeaderModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/profile/friends/FriendRequestModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends SectionHeaderModel.Listener, FriendRequestModel.Listener {
    }

    public ProfileOutFriendRequestsUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$3$lambda$2$lambda$1(int i2, int i3, int i4) {
        return i2;
    }

    @Override // com.airbnb.epoxy.Typed4EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends Profile> list, Long l2, Boolean bool, Listener listener) {
        buildModels((List<Profile>) list, l2.longValue(), bool.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(@NotNull List<Profile> outFriendRequests, long outFriendRequestsTotalCount, boolean isLoadable, @NotNull Listener listener) {
        Intrinsics.m32179h(outFriendRequests, "outFriendRequests");
        Intrinsics.m32179h(listener, "listener");
        if (!outFriendRequests.isEmpty()) {
            SectionHeaderModel_ sectionHeaderModel_ = new SectionHeaderModel_();
            sectionHeaderModel_.mo15774a("sectionHeader");
            sectionHeaderModel_.mo15775e0(C2507R.string.profile_out_friend_requests);
            sectionHeaderModel_.mo15778w1(String.valueOf(outFriendRequestsTotalCount));
            sectionHeaderModel_.mo15777t0(listener);
            add(sectionHeaderModel_);
            for (Profile profile : outFriendRequests) {
                FriendRequestModel_ friendRequestModel_ = new FriendRequestModel_();
                friendRequestModel_.mo16145b(profile.getId());
                friendRequestModel_.mo16147k(profile.getLogin());
                friendRequestModel_.mo16149l(profile.getAvatar());
                friendRequestModel_.mo16144Q(profile.getIsOnline());
                friendRequestModel_.mo16140B0(profile.getFriendCount());
                friendRequestModel_.mo16141I0(C2507R.string.profile_friend_request_cancel);
                friendRequestModel_.mo16150o0(1);
                friendRequestModel_.mo16152r(profile.getIsSponsor());
                friendRequestModel_.mo16151p(profile.getIsVerified());
                friendRequestModel_.mo16143P0(listener);
                friendRequestModel_.mo16146d(C6284a.f58044x);
                add(friendRequestModel_);
            }
        } else {
            ErrorResourceModel_ errorResourceModel_ = new ErrorResourceModel_();
            errorResourceModel_.mo15727a("errorResource");
            errorResourceModel_.mo15726T0(C2507R.string.error_no_out_friend_requests);
            add(errorResourceModel_);
        }
        if (isLoadable) {
            LoadingModel_ loadingModel_ = new LoadingModel_();
            loadingModel_.mo15729a("loading");
            add(loadingModel_);
        }
    }
}
