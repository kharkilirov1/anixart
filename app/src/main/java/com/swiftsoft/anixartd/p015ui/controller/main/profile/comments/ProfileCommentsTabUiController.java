package com.swiftsoft.anixartd.p015ui.controller.main.profile.comments;

import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.CollectionComment;
import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import com.swiftsoft.anixartd.epoxy.Typed9EpoxyController;
import com.swiftsoft.anixartd.p015ui.model.common.EmptyModel_;
import com.swiftsoft.anixartd.p015ui.model.common.LoadingModel_;
import com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ExtraProfileCommentsModel;
import com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ExtraProfileCommentsModel_;
import com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileCollectionCommentModel;
import com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileCollectionCommentModel_;
import com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileReleaseCommentModel;
import com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileReleaseCommentModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p029i.C6284a;

/* compiled from: ProfileCommentsTabUiController.kt */
@Metadata(m31883d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002D\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\nJ\\\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\tH\u0014J\u0006\u0010\u0016\u001a\u00020\b¨\u0006\u0018"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/profile/comments/ProfileCommentsTabUiController;", "Lcom/swiftsoft/anixartd/epoxy/Typed9EpoxyController;", "", "", "Lcom/swiftsoft/anixartd/database/entity/ReleaseComment;", "Lcom/swiftsoft/anixartd/database/entity/CollectionComment;", "", "", "", "Lcom/swiftsoft/anixartd/ui/controller/main/profile/comments/ProfileCommentsTabUiController$Listener;", "()V", "buildModels", "", "viewType", "releaseComments", "collectionComments", "selectedInnerTab", "totalCount", "selectedSort", "isSortEnabled", "isLoadable", "listener", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ProfileCommentsTabUiController extends Typed9EpoxyController<Integer, List<? extends ReleaseComment>, List<? extends CollectionComment>, String, Long, Integer, Boolean, Boolean, Listener> {

    /* compiled from: ProfileCommentsTabUiController.kt */
    @Metadata(m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/profile/comments/ProfileCommentsTabUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/profile/comments/ProfileReleaseCommentModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/profile/comments/ProfileCollectionCommentModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/profile/comments/ExtraProfileCommentsModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ProfileReleaseCommentModel.Listener, ProfileCollectionCommentModel.Listener, ExtraProfileCommentsModel.Listener {
    }

    public ProfileCommentsTabUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$1$lambda$0(int i2, int i3, int i4) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$3$lambda$2(int i2, int i3, int i4) {
        return i2;
    }

    @Override // com.swiftsoft.anixartd.epoxy.Typed9EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(Integer num, List<? extends ReleaseComment> list, List<? extends CollectionComment> list2, String str, Long l2, Integer num2, Boolean bool, Boolean bool2, Listener listener) {
        buildModels(num.intValue(), (List<ReleaseComment>) list, (List<CollectionComment>) list2, str, l2.longValue(), num2.intValue(), bool.booleanValue(), bool2.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(int viewType, @NotNull List<ReleaseComment> releaseComments, @NotNull List<CollectionComment> collectionComments, @NotNull String selectedInnerTab, long totalCount, int selectedSort, boolean isSortEnabled, boolean isLoadable, @NotNull Listener listener) {
        int i2;
        Intrinsics.m32179h(releaseComments, "releaseComments");
        Intrinsics.m32179h(collectionComments, "collectionComments");
        Intrinsics.m32179h(selectedInnerTab, "selectedInnerTab");
        Intrinsics.m32179h(listener, "listener");
        if (Intrinsics.m32174c(selectedInnerTab, "INNER_TAB_PROFILE_COMMENTS_RELEASE")) {
            i2 = C2507R.string.empty_profile_comments_release;
        } else {
            if (!Intrinsics.m32174c(selectedInnerTab, "INNER_TAB_PROFILE_COMMENTS_COLLECTIONS")) {
                throw new Exception("Invalid inner position");
            }
            i2 = C2507R.string.empty_profile_comments_collection;
        }
        if (releaseComments.isEmpty() && collectionComments.isEmpty()) {
            EmptyModel_ emptyModel_ = new EmptyModel_();
            emptyModel_.mo15721a("empty");
            emptyModel_.mo15723k0(i2);
            emptyModel_.mo15722d(C6284a.f58037q);
            add(emptyModel_);
            return;
        }
        if (isSortEnabled) {
            ExtraProfileCommentsModel_ extraProfileCommentsModel_ = new ExtraProfileCommentsModel_();
            extraProfileCommentsModel_.mo16088a("extraProfileComments");
            extraProfileCommentsModel_.mo16087N(totalCount);
            extraProfileCommentsModel_.mo16086F(selectedSort);
            extraProfileCommentsModel_.mo16085C1(listener);
            extraProfileCommentsModel_.mo16089d(C6284a.f58038r);
            add(extraProfileCommentsModel_);
        }
        if (Intrinsics.m32174c(selectedInnerTab, "INNER_TAB_PROFILE_COMMENTS_RELEASE")) {
            for (ReleaseComment releaseComment : releaseComments) {
                ProfileReleaseCommentModel_ profileReleaseCommentModel_ = new ProfileReleaseCommentModel_();
                profileReleaseCommentModel_.mo16115b(releaseComment.getId());
                profileReleaseCommentModel_.mo16111B(releaseComment.getProfile().getId());
                Long parentCommentId = releaseComment.getParentCommentId();
                profileReleaseCommentModel_.mo16114W(parentCommentId != null ? parentCommentId.longValue() : releaseComment.getId());
                profileReleaseCommentModel_.mo16113K(releaseComment.getId());
                profileReleaseCommentModel_.mo16123v(releaseComment.getMessage());
                profileReleaseCommentModel_.mo16122u(releaseComment.getIsSpoiler());
                profileReleaseCommentModel_.mo16126x(releaseComment.getVoteCount());
                profileReleaseCommentModel_.mo16121t(releaseComment.getTimestamp());
                profileReleaseCommentModel_.mo16124w(releaseComment.getIsEdited());
                profileReleaseCommentModel_.mo16112E(releaseComment.getIsDeleted());
                profileReleaseCommentModel_.mo16118l(releaseComment.getProfile().getAvatar());
                profileReleaseCommentModel_.mo16117k(releaseComment.getProfile().getLogin());
                profileReleaseCommentModel_.mo16120r(releaseComment.getProfile().getIsSponsor());
                profileReleaseCommentModel_.mo16119p(releaseComment.getProfile().getIsVerified());
                profileReleaseCommentModel_.mo16127y(releaseComment.getRelease().getId());
                profileReleaseCommentModel_.mo16125w0(releaseComment.getRelease().getTitleRu());
                profileReleaseCommentModel_.mo16116i1(listener);
                add(profileReleaseCommentModel_);
            }
        } else if (Intrinsics.m32174c(selectedInnerTab, "INNER_TAB_PROFILE_COMMENTS_COLLECTIONS")) {
            for (CollectionComment collectionComment : collectionComments) {
                ProfileCollectionCommentModel_ profileCollectionCommentModel_ = new ProfileCollectionCommentModel_();
                profileCollectionCommentModel_.mo16099b(collectionComment.getId());
                profileCollectionCommentModel_.mo16092B(collectionComment.getProfile().getId());
                Long parentCommentId2 = collectionComment.getParentCommentId();
                profileCollectionCommentModel_.mo16096W(parentCommentId2 != null ? parentCommentId2.longValue() : collectionComment.getId());
                profileCollectionCommentModel_.mo16095K(collectionComment.getId());
                profileCollectionCommentModel_.mo16106v(collectionComment.getMessage());
                profileCollectionCommentModel_.mo16105u(collectionComment.getIsSpoiler());
                profileCollectionCommentModel_.mo16108x(collectionComment.getVoteCount());
                profileCollectionCommentModel_.mo16104t(collectionComment.getTimestamp());
                profileCollectionCommentModel_.mo16107w(collectionComment.getIsEdited());
                profileCollectionCommentModel_.mo16093E(collectionComment.getIsDeleted());
                profileCollectionCommentModel_.mo16101l(collectionComment.getProfile().getAvatar());
                profileCollectionCommentModel_.mo16100k(collectionComment.getProfile().getLogin());
                profileCollectionCommentModel_.mo16103r(collectionComment.getProfile().getIsSponsor());
                profileCollectionCommentModel_.mo16102p(collectionComment.getProfile().getIsVerified());
                profileCollectionCommentModel_.mo16094I1(collectionComment.getCollection().getId());
                profileCollectionCommentModel_.mo16097W0(collectionComment.getCollection().getTitle());
                profileCollectionCommentModel_.mo16098a0(listener);
                add(profileCollectionCommentModel_);
            }
        }
        if (isLoadable) {
            LoadingModel_ loadingModel_ = new LoadingModel_();
            loadingModel_.mo15729a("loading");
            add(loadingModel_);
        }
    }
}
