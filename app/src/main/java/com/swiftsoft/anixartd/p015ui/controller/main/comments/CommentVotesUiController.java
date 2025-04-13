package com.swiftsoft.anixartd.p015ui.controller.main.comments;

import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.epoxy.Typed5EpoxyController;
import com.swiftsoft.anixartd.p015ui.model.common.ErrorResourceModel_;
import com.swiftsoft.anixartd.p015ui.model.main.comments.CommentProfileVoteModel;
import com.swiftsoft.anixartd.p015ui.model.main.comments.CommentProfileVoteModel_;
import com.swiftsoft.anixartd.p015ui.model.main.comments.ExtraCommentVotesModel;
import com.swiftsoft.anixartd.p015ui.model.main.comments.ExtraCommentVotesModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CommentVotesUiController.kt */
@Metadata(m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\bJ6\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\u0014J\u0006\u0010\u0010\u001a\u00020\u0006¨\u0006\u0012"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/comments/CommentVotesUiController;", "Lcom/swiftsoft/anixartd/epoxy/Typed5EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/Profile;", "", "", "", "Lcom/swiftsoft/anixartd/ui/controller/main/comments/CommentVotesUiController$Listener;", "()V", "buildModels", "", "profiles", "totalCount", "selectedSort", "isLoadable", "listener", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class CommentVotesUiController extends Typed5EpoxyController<List<? extends Profile>, Long, Integer, Boolean, Listener> {

    /* compiled from: CommentVotesUiController.kt */
    @Metadata(m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/comments/CommentVotesUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/comments/CommentProfileVoteModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/comments/ExtraCommentVotesModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends CommentProfileVoteModel.Listener, ExtraCommentVotesModel.Listener {
    }

    public CommentVotesUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
    }

    @Override // com.swiftsoft.anixartd.epoxy.Typed5EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends Profile> list, Long l2, Integer num, Boolean bool, Listener listener) {
        buildModels((List<Profile>) list, l2.longValue(), num.intValue(), bool.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(@NotNull List<Profile> profiles, long totalCount, int selectedSort, boolean isLoadable, @NotNull Listener listener) {
        Intrinsics.m32179h(profiles, "profiles");
        Intrinsics.m32179h(listener, "listener");
        if (!(!profiles.isEmpty())) {
            ErrorResourceModel_ errorResourceModel_ = new ErrorResourceModel_();
            errorResourceModel_.mo15727a("errorResource");
            errorResourceModel_.mo15726T0(C2507R.string.error_no_comment_votes);
            add(errorResourceModel_);
            return;
        }
        ExtraCommentVotesModel_ extraCommentVotesModel_ = new ExtraCommentVotesModel_();
        extraCommentVotesModel_.mo15899a("extra");
        extraCommentVotesModel_.mo15897R(C2507R.plurals.comment_votes);
        extraCommentVotesModel_.mo15898V(C2507R.string.comment_votes_zero);
        extraCommentVotesModel_.mo15896M(totalCount);
        extraCommentVotesModel_.mo15895F(selectedSort);
        extraCommentVotesModel_.mo15894D1(listener);
        add(extraCommentVotesModel_);
        for (Profile profile : profiles) {
            CommentProfileVoteModel_ commentProfileVoteModel_ = new CommentProfileVoteModel_();
            commentProfileVoteModel_.mo15888b(profile.getId());
            commentProfileVoteModel_.mo15889k(profile.getLogin());
            commentProfileVoteModel_.mo15890l(profile.getAvatar());
            commentProfileVoteModel_.mo15885Q(profile.getIsOnline());
            commentProfileVoteModel_.mo15892r(profile.getIsSponsor());
            commentProfileVoteModel_.mo15891p(profile.getIsVerified());
            commentProfileVoteModel_.mo15886S(profile.getVote());
            commentProfileVoteModel_.mo15887U0(listener);
            add(commentProfileVoteModel_);
        }
    }
}
