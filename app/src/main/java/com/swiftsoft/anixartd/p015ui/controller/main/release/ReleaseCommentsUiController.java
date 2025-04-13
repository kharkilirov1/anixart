package com.swiftsoft.anixartd.p015ui.controller.main.release;

import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import com.swiftsoft.anixartd.epoxy.Typed5EpoxyController;
import com.swiftsoft.anixartd.p015ui.model.common.LoadingModel_;
import com.swiftsoft.anixartd.p015ui.model.main.comments.CommentModel;
import com.swiftsoft.anixartd.p015ui.model.main.comments.CommentModel_;
import com.swiftsoft.anixartd.p015ui.model.main.comments.ExtraCommentsModel;
import com.swiftsoft.anixartd.p015ui.model.main.comments.ExtraCommentsModel_;
import com.swiftsoft.anixartd.p015ui.model.main.comments.NoCommentsModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReleaseCommentsUiController.kt */
@Metadata(m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\bJ6\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\u0014J\u0006\u0010\u0010\u001a\u00020\u0006¨\u0006\u0012"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseCommentsUiController;", "Lcom/swiftsoft/anixartd/epoxy/Typed5EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/ReleaseComment;", "", "", "", "Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseCommentsUiController$Listener;", "()V", "buildModels", "", "releaseComments", "totalCount", "selectedSort", "isLoadable", "listener", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ReleaseCommentsUiController extends Typed5EpoxyController<List<? extends ReleaseComment>, Long, Integer, Boolean, Listener> {

    /* compiled from: ReleaseCommentsUiController.kt */
    @Metadata(m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseCommentsUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/comments/CommentModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/comments/ExtraCommentsModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends CommentModel.Listener, ExtraCommentsModel.Listener {
    }

    public ReleaseCommentsUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
    }

    @Override // com.swiftsoft.anixartd.epoxy.Typed5EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends ReleaseComment> list, Long l2, Integer num, Boolean bool, Listener listener) {
        buildModels((List<ReleaseComment>) list, l2.longValue(), num.intValue(), bool.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(@NotNull List<ReleaseComment> releaseComments, long totalCount, int selectedSort, boolean isLoadable, @NotNull Listener listener) {
        Intrinsics.m32179h(releaseComments, "releaseComments");
        Intrinsics.m32179h(listener, "listener");
        ExtraCommentsModel_ extraCommentsModel_ = new ExtraCommentsModel_();
        extraCommentsModel_.mo15905a("extra");
        extraCommentsModel_.mo15903R(C2507R.plurals.comments);
        extraCommentsModel_.mo15904V(C2507R.string.comments_zero);
        extraCommentsModel_.mo15902M(totalCount);
        extraCommentsModel_.mo15901F(selectedSort);
        extraCommentsModel_.mo15906y1(listener);
        add(extraCommentsModel_);
        if (releaseComments.isEmpty()) {
            NoCommentsModel_ noCommentsModel_ = new NoCommentsModel_();
            noCommentsModel_.mo15907a("no_comments");
            add(noCommentsModel_);
        }
        for (ReleaseComment releaseComment : releaseComments) {
            CommentModel_ commentModel_ = new CommentModel_();
            commentModel_.mo15872b(releaseComment.getId());
            commentModel_.mo15868B(releaseComment.getProfile().getId());
            commentModel_.mo15880v(releaseComment.getMessage());
            commentModel_.mo15879u(releaseComment.getIsSpoiler());
            commentModel_.mo15882x(releaseComment.getVoteCount());
            commentModel_.mo15870S(releaseComment.getVote());
            commentModel_.mo15878t(releaseComment.getTimestamp());
            commentModel_.mo15881w(releaseComment.getIsEdited());
            commentModel_.mo15869E(releaseComment.getIsDeleted());
            commentModel_.mo15871Z0(releaseComment.getReplyCount());
            commentModel_.mo15875l(releaseComment.getProfile().getAvatar());
            commentModel_.mo15874k(releaseComment.getProfile().getLogin());
            commentModel_.mo15877r(releaseComment.getProfile().getIsSponsor());
            commentModel_.mo15876p(releaseComment.getProfile().getIsVerified());
            commentModel_.mo15873b1(listener);
            add(commentModel_);
        }
        if (isLoadable) {
            LoadingModel_ loadingModel_ = new LoadingModel_();
            loadingModel_.mo15729a("loading");
            add(loadingModel_);
        }
    }
}
