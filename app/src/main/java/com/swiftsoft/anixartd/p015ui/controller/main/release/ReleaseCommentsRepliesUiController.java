package com.swiftsoft.anixartd.p015ui.controller.main.release;

import com.airbnb.epoxy.EpoxyModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import com.swiftsoft.anixartd.epoxy.Typed7EpoxyController;
import com.swiftsoft.anixartd.p015ui.model.common.LoadingModel_;
import com.swiftsoft.anixartd.p015ui.model.main.comments.CommentModel;
import com.swiftsoft.anixartd.p015ui.model.main.comments.CommentModel_;
import com.swiftsoft.anixartd.p015ui.model.main.comments.ExtraCommentsModel;
import com.swiftsoft.anixartd.p015ui.model.main.comments.ExtraCommentsModel_;
import com.swiftsoft.anixartd.p015ui.model.main.replies.ExtraRepliesModel;
import com.swiftsoft.anixartd.p015ui.model.main.replies.ExtraRepliesModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReleaseCommentsRepliesUiController.kt */
@Metadata(m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u000022\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\bJF\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0007H\u0014J\u0006\u0010\u0012\u001a\u00020\u0003¨\u0006\u0014"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseCommentsRepliesUiController;", "Lcom/swiftsoft/anixartd/epoxy/Typed7EpoxyController;", "Lcom/swiftsoft/anixartd/database/entity/ReleaseComment;", "", "", "", "", "Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseCommentsRepliesUiController$Listener;", "()V", "buildModels", "", "releaseComment", "isDirectLoad", "replies", "totalCount", "selectedSort", "isLoadable", "listener", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ReleaseCommentsRepliesUiController extends Typed7EpoxyController<ReleaseComment, Boolean, List<? extends ReleaseComment>, Long, Integer, Boolean, Listener> {

    /* compiled from: ReleaseCommentsRepliesUiController.kt */
    @Metadata(m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseCommentsRepliesUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/replies/ExtraRepliesModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/comments/ExtraCommentsModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/comments/CommentModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ExtraRepliesModel.Listener, ExtraCommentsModel.Listener, CommentModel.Listener {
    }

    public ReleaseCommentsRepliesUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
    }

    @Override // com.swiftsoft.anixartd.epoxy.Typed7EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(ReleaseComment releaseComment, Boolean bool, List<? extends ReleaseComment> list, Long l2, Integer num, Boolean bool2, Listener listener) {
        buildModels(releaseComment, bool.booleanValue(), (List<ReleaseComment>) list, l2.longValue(), num.intValue(), bool2.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(@NotNull ReleaseComment releaseComment, boolean isDirectLoad, @NotNull List<ReleaseComment> replies, long totalCount, int selectedSort, boolean isLoadable, @NotNull Listener listener) {
        Intrinsics.m32179h(releaseComment, "releaseComment");
        Intrinsics.m32179h(replies, "replies");
        Intrinsics.m32179h(listener, "listener");
        if (isDirectLoad) {
            Release release = releaseComment.getRelease();
            ExtraRepliesModel_ extraRepliesModel_ = new ExtraRepliesModel_();
            extraRepliesModel_.m4520h2("extra_replies");
            long id2 = release.getId();
            extraRepliesModel_.m4524l2();
            extraRepliesModel_.f30077k = id2;
            extraRepliesModel_.m4524l2();
            extraRepliesModel_.f30078l = C2507R.string.release_comment;
            String titleRu = release.getTitleRu();
            extraRepliesModel_.m4524l2();
            extraRepliesModel_.f30079m = titleRu;
            String image = release.getImage();
            extraRepliesModel_.m4524l2();
            extraRepliesModel_.f30080n = image;
            extraRepliesModel_.m4524l2();
            extraRepliesModel_.f30081o = listener;
            add(extraRepliesModel_);
        }
        ExtraCommentsModel_ extraCommentsModel_ = new ExtraCommentsModel_();
        extraCommentsModel_.m4520h2("extra");
        extraCommentsModel_.m4524l2();
        extraCommentsModel_.f29589l = C2507R.plurals.replies;
        extraCommentsModel_.m4524l2();
        extraCommentsModel_.f29590m = C2507R.string.replies_zero;
        extraCommentsModel_.m4524l2();
        extraCommentsModel_.f29591n = totalCount;
        extraCommentsModel_.m4524l2();
        extraCommentsModel_.f29592o = selectedSort;
        extraCommentsModel_.m4524l2();
        extraCommentsModel_.f29588k = listener;
        add(extraCommentsModel_);
        CommentModel_ commentModel_ = new CommentModel_();
        commentModel_.mo15872b(releaseComment.getId());
        long id3 = releaseComment.getProfile().getId();
        commentModel_.m4524l2();
        commentModel_.f29549k = id3;
        commentModel_.mo15880v(releaseComment.getMessage());
        boolean isSpoiler = releaseComment.getIsSpoiler();
        commentModel_.m4524l2();
        commentModel_.f29551m = isSpoiler;
        int voteCount = releaseComment.getVoteCount();
        commentModel_.m4524l2();
        commentModel_.f29552n = voteCount;
        int vote = releaseComment.getVote();
        commentModel_.m4524l2();
        commentModel_.f29553o = vote;
        long timestamp = releaseComment.getTimestamp();
        commentModel_.m4524l2();
        commentModel_.f29554p = timestamp;
        boolean isEdited = releaseComment.getIsEdited();
        commentModel_.m4524l2();
        commentModel_.f29556r = isEdited;
        boolean isDeleted = releaseComment.getIsDeleted();
        commentModel_.m4524l2();
        commentModel_.f29557s = isDeleted;
        String avatar = releaseComment.getProfile().getAvatar();
        commentModel_.m4524l2();
        commentModel_.f29559u = avatar;
        commentModel_.mo15874k(releaseComment.getProfile().getLogin());
        boolean isSponsor = releaseComment.getProfile().getIsSponsor();
        commentModel_.m4524l2();
        commentModel_.f29560v = isSponsor;
        boolean isVerified = releaseComment.getProfile().getIsVerified();
        commentModel_.m4524l2();
        commentModel_.f29561w = isVerified;
        commentModel_.m4524l2();
        commentModel_.f29562x = false;
        commentModel_.m4524l2();
        commentModel_.f29563y = listener;
        add(commentModel_);
        for (ReleaseComment releaseComment2 : replies) {
            CommentModel_ commentModel_2 = new CommentModel_();
            commentModel_2.mo15872b(releaseComment2.getId());
            long id4 = releaseComment2.getProfile().getId();
            commentModel_2.m4524l2();
            commentModel_2.f29549k = id4;
            commentModel_2.mo15880v(releaseComment2.getMessage());
            boolean isSpoiler2 = releaseComment2.getIsSpoiler();
            commentModel_2.m4524l2();
            commentModel_2.f29551m = isSpoiler2;
            int voteCount2 = releaseComment2.getVoteCount();
            commentModel_2.m4524l2();
            commentModel_2.f29552n = voteCount2;
            int vote2 = releaseComment2.getVote();
            commentModel_2.m4524l2();
            commentModel_2.f29553o = vote2;
            long timestamp2 = releaseComment2.getTimestamp();
            commentModel_2.m4524l2();
            commentModel_2.f29554p = timestamp2;
            boolean isEdited2 = releaseComment2.getIsEdited();
            commentModel_2.m4524l2();
            commentModel_2.f29556r = isEdited2;
            boolean isDeleted2 = releaseComment2.getIsDeleted();
            commentModel_2.m4524l2();
            commentModel_2.f29557s = isDeleted2;
            String avatar2 = releaseComment2.getProfile().getAvatar();
            commentModel_2.m4524l2();
            commentModel_2.f29559u = avatar2;
            commentModel_2.mo15874k(releaseComment2.getProfile().getLogin());
            boolean isSponsor2 = releaseComment2.getProfile().getIsSponsor();
            commentModel_2.m4524l2();
            commentModel_2.f29560v = isSponsor2;
            boolean isVerified2 = releaseComment2.getProfile().getIsVerified();
            commentModel_2.m4524l2();
            commentModel_2.f29561w = isVerified2;
            commentModel_2.m4524l2();
            commentModel_2.f29562x = true;
            commentModel_2.m4524l2();
            commentModel_2.f29563y = listener;
            add(commentModel_2);
        }
        if (isLoadable) {
            EpoxyModel<?> loadingModel_ = new LoadingModel_();
            loadingModel_.m4520h2("loading");
            add(loadingModel_);
        }
    }
}
