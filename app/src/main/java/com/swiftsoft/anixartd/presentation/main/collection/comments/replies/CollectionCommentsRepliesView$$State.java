package com.swiftsoft.anixartd.presentation.main.collection.comments.replies;

import com.swiftsoft.anixartd.database.entity.CollectionComment;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class CollectionCommentsRepliesView$$State extends MvpViewState<CollectionCommentsRepliesView> implements CollectionCommentsRepliesView {

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnBannedCommand extends ViewCommand<CollectionCommentsRepliesView> {
        public OnBannedCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State) {
            super("onBanned", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14488o();
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnCollectionCommand extends ViewCommand<CollectionCommentsRepliesView> {

        /* renamed from: a */
        public final long f26168a;

        public OnCollectionCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State, long j2) {
            super("onCollection", AddToEndSingleTagStrategy.class);
            this.f26168a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14480d0(this.f26168a);
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnCommentCommand extends ViewCommand<CollectionCommentsRepliesView> {

        /* renamed from: a */
        public final CollectionComment f26169a;

        public OnCommentCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State, CollectionComment collectionComment) {
            super("onComment", OneExecutionStateStrategy.class);
            this.f26169a = collectionComment;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14474R0(this.f26169a);
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnCommentDeletedCommand extends ViewCommand<CollectionCommentsRepliesView> {
        public OnCommentDeletedCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State) {
            super("onCommentDeleted", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14470F();
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnCommentLimitReachedCommand extends ViewCommand<CollectionCommentsRepliesView> {
        public OnCommentLimitReachedCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State) {
            super("onCommentLimitReached", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14467A();
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnCommentNegativeVoteLimitReachedCommand extends ViewCommand<CollectionCommentsRepliesView> {
        public OnCommentNegativeVoteLimitReachedCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State) {
            super("onCommentNegativeVoteLimitReached", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14493x();
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnCommentSentCommand extends ViewCommand<CollectionCommentsRepliesView> {
        public OnCommentSentCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State) {
            super("onCommentSent", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14468B();
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnCommentVoteBannedCommand extends ViewCommand<CollectionCommentsRepliesView> {
        public OnCommentVoteBannedCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State) {
            super("onCommentVoteBanned", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14471G();
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnFailedCommand extends ViewCommand<CollectionCommentsRepliesView> {
        public OnFailedCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14478c();
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnHideLoadingCommand extends ViewCommand<CollectionCommentsRepliesView> {
        public OnHideLoadingCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State) {
            super("onHideLoading", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14489p();
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<CollectionCommentsRepliesView> {
        public OnHideProgressViewCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14476a();
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<CollectionCommentsRepliesView> {
        public OnHideRefreshViewCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14482e();
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnHideSendingCommentProgressViewCommand extends ViewCommand<CollectionCommentsRepliesView> {
        public OnHideSendingCommentProgressViewCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State) {
            super("onHideSendingCommentProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14469D();
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnInBlockListCommand extends ViewCommand<CollectionCommentsRepliesView> {
        public OnInBlockListCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State) {
            super("onInBlockList", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14472H();
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnLoadingCommand extends ViewCommand<CollectionCommentsRepliesView> {
        public OnLoadingCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State) {
            super("onLoading", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14490q();
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnParentCommentLoadedCommand extends ViewCommand<CollectionCommentsRepliesView> {

        /* renamed from: a */
        public final CollectionComment f26170a;

        public OnParentCommentLoadedCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State, CollectionComment collectionComment) {
            super("onParentCommentLoaded", OneExecutionStateStrategy.class);
            this.f26170a = collectionComment;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14475R3(this.f26170a);
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnParentCommentRemovedCommand extends ViewCommand<CollectionCommentsRepliesView> {
        public OnParentCommentRemovedCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State) {
            super("onParentCommentRemoved", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14492v0();
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnProfileCommand extends ViewCommand<CollectionCommentsRepliesView> {

        /* renamed from: a */
        public final long f26171a;

        public OnProfileCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State, long j2) {
            super("onProfile", OneExecutionStateStrategy.class);
            this.f26171a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14483f(this.f26171a);
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnRefreshAfterSortCommand extends ViewCommand<CollectionCommentsRepliesView> {
        public OnRefreshAfterSortCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State) {
            super("onRefreshAfterSort", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14485l();
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnReplyCommand extends ViewCommand<CollectionCommentsRepliesView> {

        /* renamed from: a */
        public final CollectionComment f26172a;

        public OnReplyCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State, CollectionComment collectionComment) {
            super("onReply", OneExecutionStateStrategy.class);
            this.f26172a = collectionComment;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14473L0(this.f26172a);
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnReportSentCommand extends ViewCommand<CollectionCommentsRepliesView> {
        public OnReportSentCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State) {
            super("onReportSent", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14487n();
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnShowCommentReportFragmentCommand extends ViewCommand<CollectionCommentsRepliesView> {

        /* renamed from: a */
        public final CollectionComment f26173a;

        public OnShowCommentReportFragmentCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State, CollectionComment collectionComment) {
            super("onShowCommentReportFragment", OneExecutionStateStrategy.class);
            this.f26173a = collectionComment;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14484f0(this.f26173a);
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnShowNeedAuthCommand extends ViewCommand<CollectionCommentsRepliesView> {
        public OnShowNeedAuthCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State) {
            super("onShowNeedAuth", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14486m();
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<CollectionCommentsRepliesView> {
        public OnShowProgressViewCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14477b();
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<CollectionCommentsRepliesView> {
        public OnShowRefreshViewCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14479d();
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnShowSendingCommentProgressViewCommand extends ViewCommand<CollectionCommentsRepliesView> {
        public OnShowSendingCommentProgressViewCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State) {
            super("onShowSendingCommentProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14491s();
        }
    }

    /* compiled from: CollectionCommentsRepliesView$$State.java */
    public class OnVoteCommentCommand extends ViewCommand<CollectionCommentsRepliesView> {

        /* renamed from: a */
        public final CollectionComment f26174a;

        /* renamed from: b */
        public final int f26175b;

        public OnVoteCommentCommand(CollectionCommentsRepliesView$$State collectionCommentsRepliesView$$State, CollectionComment collectionComment, int i2) {
            super("onVoteComment", OneExecutionStateStrategy.class);
            this.f26174a = collectionComment;
            this.f26175b = i2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsRepliesView collectionCommentsRepliesView) {
            collectionCommentsRepliesView.mo14481d1(this.f26174a, this.f26175b);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: A */
    public void mo14467A() {
        OnCommentLimitReachedCommand onCommentLimitReachedCommand = new OnCommentLimitReachedCommand(this);
        this.viewCommands.beforeApply(onCommentLimitReachedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14467A();
        }
        this.viewCommands.afterApply(onCommentLimitReachedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: B */
    public void mo14468B() {
        OnCommentSentCommand onCommentSentCommand = new OnCommentSentCommand(this);
        this.viewCommands.beforeApply(onCommentSentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14468B();
        }
        this.viewCommands.afterApply(onCommentSentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: D */
    public void mo14469D() {
        OnHideSendingCommentProgressViewCommand onHideSendingCommentProgressViewCommand = new OnHideSendingCommentProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideSendingCommentProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14469D();
        }
        this.viewCommands.afterApply(onHideSendingCommentProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: F */
    public void mo14470F() {
        OnCommentDeletedCommand onCommentDeletedCommand = new OnCommentDeletedCommand(this);
        this.viewCommands.beforeApply(onCommentDeletedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14470F();
        }
        this.viewCommands.afterApply(onCommentDeletedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: G */
    public void mo14471G() {
        OnCommentVoteBannedCommand onCommentVoteBannedCommand = new OnCommentVoteBannedCommand(this);
        this.viewCommands.beforeApply(onCommentVoteBannedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14471G();
        }
        this.viewCommands.afterApply(onCommentVoteBannedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: H */
    public void mo14472H() {
        OnInBlockListCommand onInBlockListCommand = new OnInBlockListCommand(this);
        this.viewCommands.beforeApply(onInBlockListCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14472H();
        }
        this.viewCommands.afterApply(onInBlockListCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: L0 */
    public void mo14473L0(CollectionComment collectionComment) {
        OnReplyCommand onReplyCommand = new OnReplyCommand(this, collectionComment);
        this.viewCommands.beforeApply(onReplyCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14473L0(collectionComment);
        }
        this.viewCommands.afterApply(onReplyCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: R0 */
    public void mo14474R0(CollectionComment collectionComment) {
        OnCommentCommand onCommentCommand = new OnCommentCommand(this, collectionComment);
        this.viewCommands.beforeApply(onCommentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14474R0(collectionComment);
        }
        this.viewCommands.afterApply(onCommentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: R3 */
    public void mo14475R3(CollectionComment collectionComment) {
        OnParentCommentLoadedCommand onParentCommentLoadedCommand = new OnParentCommentLoadedCommand(this, collectionComment);
        this.viewCommands.beforeApply(onParentCommentLoadedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14475R3(collectionComment);
        }
        this.viewCommands.afterApply(onParentCommentLoadedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: a */
    public void mo14476a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14476a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: b */
    public void mo14477b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14477b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: c */
    public void mo14478c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14478c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: d */
    public void mo14479d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14479d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: d0 */
    public void mo14480d0(long j2) {
        OnCollectionCommand onCollectionCommand = new OnCollectionCommand(this, j2);
        this.viewCommands.beforeApply(onCollectionCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14480d0(j2);
        }
        this.viewCommands.afterApply(onCollectionCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: d1 */
    public void mo14481d1(CollectionComment collectionComment, int i2) {
        OnVoteCommentCommand onVoteCommentCommand = new OnVoteCommentCommand(this, collectionComment, i2);
        this.viewCommands.beforeApply(onVoteCommentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14481d1(collectionComment, i2);
        }
        this.viewCommands.afterApply(onVoteCommentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: e */
    public void mo14482e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14482e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: f */
    public void mo14483f(long j2) {
        OnProfileCommand onProfileCommand = new OnProfileCommand(this, j2);
        this.viewCommands.beforeApply(onProfileCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14483f(j2);
        }
        this.viewCommands.afterApply(onProfileCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: f0 */
    public void mo14484f0(CollectionComment collectionComment) {
        OnShowCommentReportFragmentCommand onShowCommentReportFragmentCommand = new OnShowCommentReportFragmentCommand(this, collectionComment);
        this.viewCommands.beforeApply(onShowCommentReportFragmentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14484f0(collectionComment);
        }
        this.viewCommands.afterApply(onShowCommentReportFragmentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: l */
    public void mo14485l() {
        OnRefreshAfterSortCommand onRefreshAfterSortCommand = new OnRefreshAfterSortCommand(this);
        this.viewCommands.beforeApply(onRefreshAfterSortCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14485l();
        }
        this.viewCommands.afterApply(onRefreshAfterSortCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: m */
    public void mo14486m() {
        OnShowNeedAuthCommand onShowNeedAuthCommand = new OnShowNeedAuthCommand(this);
        this.viewCommands.beforeApply(onShowNeedAuthCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14486m();
        }
        this.viewCommands.afterApply(onShowNeedAuthCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: n */
    public void mo14487n() {
        OnReportSentCommand onReportSentCommand = new OnReportSentCommand(this);
        this.viewCommands.beforeApply(onReportSentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14487n();
        }
        this.viewCommands.afterApply(onReportSentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: o */
    public void mo14488o() {
        OnBannedCommand onBannedCommand = new OnBannedCommand(this);
        this.viewCommands.beforeApply(onBannedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14488o();
        }
        this.viewCommands.afterApply(onBannedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: p */
    public void mo14489p() {
        OnHideLoadingCommand onHideLoadingCommand = new OnHideLoadingCommand(this);
        this.viewCommands.beforeApply(onHideLoadingCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14489p();
        }
        this.viewCommands.afterApply(onHideLoadingCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: q */
    public void mo14490q() {
        OnLoadingCommand onLoadingCommand = new OnLoadingCommand(this);
        this.viewCommands.beforeApply(onLoadingCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14490q();
        }
        this.viewCommands.afterApply(onLoadingCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: s */
    public void mo14491s() {
        OnShowSendingCommentProgressViewCommand onShowSendingCommentProgressViewCommand = new OnShowSendingCommentProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowSendingCommentProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14491s();
        }
        this.viewCommands.afterApply(onShowSendingCommentProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: v0 */
    public void mo14492v0() {
        OnParentCommentRemovedCommand onParentCommentRemovedCommand = new OnParentCommentRemovedCommand(this);
        this.viewCommands.beforeApply(onParentCommentRemovedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14492v0();
        }
        this.viewCommands.afterApply(onParentCommentRemovedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: x */
    public void mo14493x() {
        OnCommentNegativeVoteLimitReachedCommand onCommentNegativeVoteLimitReachedCommand = new OnCommentNegativeVoteLimitReachedCommand(this);
        this.viewCommands.beforeApply(onCommentNegativeVoteLimitReachedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsRepliesView) it.next()).mo14493x();
        }
        this.viewCommands.afterApply(onCommentNegativeVoteLimitReachedCommand);
    }
}
