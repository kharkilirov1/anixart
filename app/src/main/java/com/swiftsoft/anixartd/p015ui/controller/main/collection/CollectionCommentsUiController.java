package com.swiftsoft.anixartd.p015ui.controller.main.collection;

import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.CollectionComment;
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

/* compiled from: CollectionCommentsUiController.kt */
@Metadata(m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\bJ6\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\u0014J\u0006\u0010\u0010\u001a\u00020\u0006¨\u0006\u0012"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/collection/CollectionCommentsUiController;", "Lcom/swiftsoft/anixartd/epoxy/Typed5EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/CollectionComment;", "", "", "", "Lcom/swiftsoft/anixartd/ui/controller/main/collection/CollectionCommentsUiController$Listener;", "()V", "buildModels", "", "collectionComments", "totalCount", "selectedSort", "isLoadable", "listener", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class CollectionCommentsUiController extends Typed5EpoxyController<List<? extends CollectionComment>, Long, Integer, Boolean, Listener> {

    /* compiled from: CollectionCommentsUiController.kt */
    @Metadata(m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/collection/CollectionCommentsUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/comments/CommentModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/comments/ExtraCommentsModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends CommentModel.Listener, ExtraCommentsModel.Listener {
    }

    public CollectionCommentsUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
    }

    @Override // com.swiftsoft.anixartd.epoxy.Typed5EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends CollectionComment> list, Long l2, Integer num, Boolean bool, Listener listener) {
        buildModels((List<CollectionComment>) list, l2.longValue(), num.intValue(), bool.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(@NotNull List<CollectionComment> collectionComments, long totalCount, int selectedSort, boolean isLoadable, @NotNull Listener listener) {
        Intrinsics.m32179h(collectionComments, "collectionComments");
        Intrinsics.m32179h(listener, "listener");
        ExtraCommentsModel_ extraCommentsModel_ = new ExtraCommentsModel_();
        extraCommentsModel_.mo15905a("extra");
        extraCommentsModel_.mo15903R(C2507R.plurals.comments);
        extraCommentsModel_.mo15904V(C2507R.string.comments_zero);
        extraCommentsModel_.mo15902M(totalCount);
        extraCommentsModel_.mo15901F(selectedSort);
        extraCommentsModel_.mo15906y1(listener);
        add(extraCommentsModel_);
        if (collectionComments.isEmpty()) {
            NoCommentsModel_ noCommentsModel_ = new NoCommentsModel_();
            noCommentsModel_.mo15907a("no_comments");
            add(noCommentsModel_);
        }
        for (CollectionComment collectionComment : collectionComments) {
            CommentModel_ commentModel_ = new CommentModel_();
            commentModel_.mo15872b(collectionComment.getId());
            commentModel_.mo15868B(collectionComment.getProfile().getId());
            commentModel_.mo15880v(collectionComment.getMessage());
            commentModel_.mo15879u(collectionComment.getIsSpoiler());
            commentModel_.mo15882x(collectionComment.getVoteCount());
            commentModel_.mo15870S(collectionComment.getVote());
            commentModel_.mo15878t(collectionComment.getTimestamp());
            commentModel_.mo15881w(collectionComment.getIsEdited());
            commentModel_.mo15869E(collectionComment.getIsDeleted());
            commentModel_.mo15871Z0(collectionComment.getReplyCount());
            commentModel_.mo15875l(collectionComment.getProfile().getAvatar());
            commentModel_.mo15874k(collectionComment.getProfile().getLogin());
            commentModel_.mo15877r(collectionComment.getProfile().getIsSponsor());
            commentModel_.mo15876p(collectionComment.getProfile().getIsVerified());
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
