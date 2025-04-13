package com.swiftsoft.anixartd.presentation.main.collection.comments;

import com.swiftsoft.anixartd.database.entity.CollectionComment;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class CollectionCommentsView$$State extends MvpViewState<CollectionCommentsView> implements CollectionCommentsView {

    /* compiled from: CollectionCommentsView$$State.java */
    public class OnBannedCommand extends ViewCommand<CollectionCommentsView> {
        public OnBannedCommand(CollectionCommentsView$$State collectionCommentsView$$State) {
            super("onBanned", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsView collectionCommentsView) {
            collectionCommentsView.mo14451o();
        }
    }

    /* compiled from: CollectionCommentsView$$State.java */
    public class OnCommentCommand extends ViewCommand<CollectionCommentsView> {

        /* renamed from: a */
        public final CollectionComment f26125a;

        public OnCommentCommand(CollectionCommentsView$$State collectionCommentsView$$State, CollectionComment collectionComment) {
            super("onComment", OneExecutionStateStrategy.class);
            this.f26125a = collectionComment;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsView collectionCommentsView) {
            collectionCommentsView.mo14439R0(this.f26125a);
        }
    }

    /* compiled from: CollectionCommentsView$$State.java */
    public class OnCommentDeletedCommand extends ViewCommand<CollectionCommentsView> {
        public OnCommentDeletedCommand(CollectionCommentsView$$State collectionCommentsView$$State) {
            super("onCommentDeleted", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsView collectionCommentsView) {
            collectionCommentsView.mo14434F();
        }
    }

    /* compiled from: CollectionCommentsView$$State.java */
    public class OnCommentLimitReachedCommand extends ViewCommand<CollectionCommentsView> {
        public OnCommentLimitReachedCommand(CollectionCommentsView$$State collectionCommentsView$$State) {
            super("onCommentLimitReached", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsView collectionCommentsView) {
            collectionCommentsView.mo14431A();
        }
    }

    /* compiled from: CollectionCommentsView$$State.java */
    public class OnCommentNegativeVoteLimitReachedCommand extends ViewCommand<CollectionCommentsView> {
        public OnCommentNegativeVoteLimitReachedCommand(CollectionCommentsView$$State collectionCommentsView$$State) {
            super("onCommentNegativeVoteLimitReached", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsView collectionCommentsView) {
            collectionCommentsView.mo14455x();
        }
    }

    /* compiled from: CollectionCommentsView$$State.java */
    public class OnCommentSentCommand extends ViewCommand<CollectionCommentsView> {
        public OnCommentSentCommand(CollectionCommentsView$$State collectionCommentsView$$State) {
            super("onCommentSent", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsView collectionCommentsView) {
            collectionCommentsView.mo14432B();
        }
    }

    /* compiled from: CollectionCommentsView$$State.java */
    public class OnCommentVoteBannedCommand extends ViewCommand<CollectionCommentsView> {
        public OnCommentVoteBannedCommand(CollectionCommentsView$$State collectionCommentsView$$State) {
            super("onCommentVoteBanned", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsView collectionCommentsView) {
            collectionCommentsView.mo14435G();
        }
    }

    /* compiled from: CollectionCommentsView$$State.java */
    public class OnFailedCommand extends ViewCommand<CollectionCommentsView> {
        public OnFailedCommand(CollectionCommentsView$$State collectionCommentsView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsView collectionCommentsView) {
            collectionCommentsView.mo14442c();
        }
    }

    /* compiled from: CollectionCommentsView$$State.java */
    public class OnHideLoadingCommand extends ViewCommand<CollectionCommentsView> {
        public OnHideLoadingCommand(CollectionCommentsView$$State collectionCommentsView$$State) {
            super("onHideLoading", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsView collectionCommentsView) {
            collectionCommentsView.mo14452p();
        }
    }

    /* compiled from: CollectionCommentsView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<CollectionCommentsView> {
        public OnHideProgressViewCommand(CollectionCommentsView$$State collectionCommentsView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsView collectionCommentsView) {
            collectionCommentsView.mo14440a();
        }
    }

    /* compiled from: CollectionCommentsView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<CollectionCommentsView> {
        public OnHideRefreshViewCommand(CollectionCommentsView$$State collectionCommentsView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsView collectionCommentsView) {
            collectionCommentsView.mo14445e();
        }
    }

    /* compiled from: CollectionCommentsView$$State.java */
    public class OnHideSendingCommentProgressViewCommand extends ViewCommand<CollectionCommentsView> {
        public OnHideSendingCommentProgressViewCommand(CollectionCommentsView$$State collectionCommentsView$$State) {
            super("onHideSendingCommentProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsView collectionCommentsView) {
            collectionCommentsView.mo14433D();
        }
    }

    /* compiled from: CollectionCommentsView$$State.java */
    public class OnInBlockListCommand extends ViewCommand<CollectionCommentsView> {
        public OnInBlockListCommand(CollectionCommentsView$$State collectionCommentsView$$State) {
            super("onInBlockList", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsView collectionCommentsView) {
            collectionCommentsView.mo14436H();
        }
    }

    /* compiled from: CollectionCommentsView$$State.java */
    public class OnLoadingCommand extends ViewCommand<CollectionCommentsView> {
        public OnLoadingCommand(CollectionCommentsView$$State collectionCommentsView$$State) {
            super("onLoading", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsView collectionCommentsView) {
            collectionCommentsView.mo14453q();
        }
    }

    /* compiled from: CollectionCommentsView$$State.java */
    public class OnProfileCommand extends ViewCommand<CollectionCommentsView> {

        /* renamed from: a */
        public final long f26126a;

        public OnProfileCommand(CollectionCommentsView$$State collectionCommentsView$$State, long j2) {
            super("onProfile", OneExecutionStateStrategy.class);
            this.f26126a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsView collectionCommentsView) {
            collectionCommentsView.mo14446f(this.f26126a);
        }
    }

    /* compiled from: CollectionCommentsView$$State.java */
    public class OnRefreshAfterSortCommand extends ViewCommand<CollectionCommentsView> {
        public OnRefreshAfterSortCommand(CollectionCommentsView$$State collectionCommentsView$$State) {
            super("onRefreshAfterSort", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsView collectionCommentsView) {
            collectionCommentsView.mo14448l();
        }
    }

    /* compiled from: CollectionCommentsView$$State.java */
    public class OnRepliesCommand extends ViewCommand<CollectionCommentsView> {

        /* renamed from: a */
        public final CollectionComment f26127a;

        public OnRepliesCommand(CollectionCommentsView$$State collectionCommentsView$$State, CollectionComment collectionComment) {
            super("onReplies", OneExecutionStateStrategy.class);
            this.f26127a = collectionComment;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsView collectionCommentsView) {
            collectionCommentsView.mo14438O2(this.f26127a);
        }
    }

    /* compiled from: CollectionCommentsView$$State.java */
    public class OnReplyCommand extends ViewCommand<CollectionCommentsView> {

        /* renamed from: a */
        public final CollectionComment f26128a;

        public OnReplyCommand(CollectionCommentsView$$State collectionCommentsView$$State, CollectionComment collectionComment) {
            super("onReply", OneExecutionStateStrategy.class);
            this.f26128a = collectionComment;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsView collectionCommentsView) {
            collectionCommentsView.mo14437L0(this.f26128a);
        }
    }

    /* compiled from: CollectionCommentsView$$State.java */
    public class OnReportSentCommand extends ViewCommand<CollectionCommentsView> {
        public OnReportSentCommand(CollectionCommentsView$$State collectionCommentsView$$State) {
            super("onReportSent", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsView collectionCommentsView) {
            collectionCommentsView.mo14450n();
        }
    }

    /* compiled from: CollectionCommentsView$$State.java */
    public class OnShowCommentReportFragmentCommand extends ViewCommand<CollectionCommentsView> {

        /* renamed from: a */
        public final CollectionComment f26129a;

        public OnShowCommentReportFragmentCommand(CollectionCommentsView$$State collectionCommentsView$$State, CollectionComment collectionComment) {
            super("onShowCommentReportFragment", OneExecutionStateStrategy.class);
            this.f26129a = collectionComment;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsView collectionCommentsView) {
            collectionCommentsView.mo14447f0(this.f26129a);
        }
    }

    /* compiled from: CollectionCommentsView$$State.java */
    public class OnShowNeedAuthCommand extends ViewCommand<CollectionCommentsView> {
        public OnShowNeedAuthCommand(CollectionCommentsView$$State collectionCommentsView$$State) {
            super("onShowNeedAuth", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsView collectionCommentsView) {
            collectionCommentsView.mo14449m();
        }
    }

    /* compiled from: CollectionCommentsView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<CollectionCommentsView> {
        public OnShowProgressViewCommand(CollectionCommentsView$$State collectionCommentsView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsView collectionCommentsView) {
            collectionCommentsView.mo14441b();
        }
    }

    /* compiled from: CollectionCommentsView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<CollectionCommentsView> {
        public OnShowRefreshViewCommand(CollectionCommentsView$$State collectionCommentsView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsView collectionCommentsView) {
            collectionCommentsView.mo14443d();
        }
    }

    /* compiled from: CollectionCommentsView$$State.java */
    public class OnShowSendingCommentProgressViewCommand extends ViewCommand<CollectionCommentsView> {
        public OnShowSendingCommentProgressViewCommand(CollectionCommentsView$$State collectionCommentsView$$State) {
            super("onShowSendingCommentProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsView collectionCommentsView) {
            collectionCommentsView.mo14454s();
        }
    }

    /* compiled from: CollectionCommentsView$$State.java */
    public class OnVoteCommentCommand extends ViewCommand<CollectionCommentsView> {

        /* renamed from: a */
        public final CollectionComment f26130a;

        /* renamed from: b */
        public final int f26131b;

        public OnVoteCommentCommand(CollectionCommentsView$$State collectionCommentsView$$State, CollectionComment collectionComment, int i2) {
            super("onVoteComment", OneExecutionStateStrategy.class);
            this.f26130a = collectionComment;
            this.f26131b = i2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionCommentsView collectionCommentsView) {
            collectionCommentsView.mo14444d1(this.f26130a, this.f26131b);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: A */
    public void mo14431A() {
        OnCommentLimitReachedCommand onCommentLimitReachedCommand = new OnCommentLimitReachedCommand(this);
        this.viewCommands.beforeApply(onCommentLimitReachedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsView) it.next()).mo14431A();
        }
        this.viewCommands.afterApply(onCommentLimitReachedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: B */
    public void mo14432B() {
        OnCommentSentCommand onCommentSentCommand = new OnCommentSentCommand(this);
        this.viewCommands.beforeApply(onCommentSentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsView) it.next()).mo14432B();
        }
        this.viewCommands.afterApply(onCommentSentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: D */
    public void mo14433D() {
        OnHideSendingCommentProgressViewCommand onHideSendingCommentProgressViewCommand = new OnHideSendingCommentProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideSendingCommentProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsView) it.next()).mo14433D();
        }
        this.viewCommands.afterApply(onHideSendingCommentProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: F */
    public void mo14434F() {
        OnCommentDeletedCommand onCommentDeletedCommand = new OnCommentDeletedCommand(this);
        this.viewCommands.beforeApply(onCommentDeletedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsView) it.next()).mo14434F();
        }
        this.viewCommands.afterApply(onCommentDeletedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: G */
    public void mo14435G() {
        OnCommentVoteBannedCommand onCommentVoteBannedCommand = new OnCommentVoteBannedCommand(this);
        this.viewCommands.beforeApply(onCommentVoteBannedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsView) it.next()).mo14435G();
        }
        this.viewCommands.afterApply(onCommentVoteBannedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: H */
    public void mo14436H() {
        OnInBlockListCommand onInBlockListCommand = new OnInBlockListCommand(this);
        this.viewCommands.beforeApply(onInBlockListCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsView) it.next()).mo14436H();
        }
        this.viewCommands.afterApply(onInBlockListCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: L0 */
    public void mo14437L0(CollectionComment collectionComment) {
        OnReplyCommand onReplyCommand = new OnReplyCommand(this, collectionComment);
        this.viewCommands.beforeApply(onReplyCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsView) it.next()).mo14437L0(collectionComment);
        }
        this.viewCommands.afterApply(onReplyCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: O2 */
    public void mo14438O2(CollectionComment collectionComment) {
        OnRepliesCommand onRepliesCommand = new OnRepliesCommand(this, collectionComment);
        this.viewCommands.beforeApply(onRepliesCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsView) it.next()).mo14438O2(collectionComment);
        }
        this.viewCommands.afterApply(onRepliesCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: R0 */
    public void mo14439R0(CollectionComment collectionComment) {
        OnCommentCommand onCommentCommand = new OnCommentCommand(this, collectionComment);
        this.viewCommands.beforeApply(onCommentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsView) it.next()).mo14439R0(collectionComment);
        }
        this.viewCommands.afterApply(onCommentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: a */
    public void mo14440a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsView) it.next()).mo14440a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: b */
    public void mo14441b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsView) it.next()).mo14441b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: c */
    public void mo14442c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsView) it.next()).mo14442c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: d */
    public void mo14443d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsView) it.next()).mo14443d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: d1 */
    public void mo14444d1(CollectionComment collectionComment, int i2) {
        OnVoteCommentCommand onVoteCommentCommand = new OnVoteCommentCommand(this, collectionComment, i2);
        this.viewCommands.beforeApply(onVoteCommentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsView) it.next()).mo14444d1(collectionComment, i2);
        }
        this.viewCommands.afterApply(onVoteCommentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: e */
    public void mo14445e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsView) it.next()).mo14445e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: f */
    public void mo14446f(long j2) {
        OnProfileCommand onProfileCommand = new OnProfileCommand(this, j2);
        this.viewCommands.beforeApply(onProfileCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsView) it.next()).mo14446f(j2);
        }
        this.viewCommands.afterApply(onProfileCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: f0 */
    public void mo14447f0(CollectionComment collectionComment) {
        OnShowCommentReportFragmentCommand onShowCommentReportFragmentCommand = new OnShowCommentReportFragmentCommand(this, collectionComment);
        this.viewCommands.beforeApply(onShowCommentReportFragmentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsView) it.next()).mo14447f0(collectionComment);
        }
        this.viewCommands.afterApply(onShowCommentReportFragmentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: l */
    public void mo14448l() {
        OnRefreshAfterSortCommand onRefreshAfterSortCommand = new OnRefreshAfterSortCommand(this);
        this.viewCommands.beforeApply(onRefreshAfterSortCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsView) it.next()).mo14448l();
        }
        this.viewCommands.afterApply(onRefreshAfterSortCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: m */
    public void mo14449m() {
        OnShowNeedAuthCommand onShowNeedAuthCommand = new OnShowNeedAuthCommand(this);
        this.viewCommands.beforeApply(onShowNeedAuthCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsView) it.next()).mo14449m();
        }
        this.viewCommands.afterApply(onShowNeedAuthCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: n */
    public void mo14450n() {
        OnReportSentCommand onReportSentCommand = new OnReportSentCommand(this);
        this.viewCommands.beforeApply(onReportSentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsView) it.next()).mo14450n();
        }
        this.viewCommands.afterApply(onReportSentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: o */
    public void mo14451o() {
        OnBannedCommand onBannedCommand = new OnBannedCommand(this);
        this.viewCommands.beforeApply(onBannedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsView) it.next()).mo14451o();
        }
        this.viewCommands.afterApply(onBannedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: p */
    public void mo14452p() {
        OnHideLoadingCommand onHideLoadingCommand = new OnHideLoadingCommand(this);
        this.viewCommands.beforeApply(onHideLoadingCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsView) it.next()).mo14452p();
        }
        this.viewCommands.afterApply(onHideLoadingCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: q */
    public void mo14453q() {
        OnLoadingCommand onLoadingCommand = new OnLoadingCommand(this);
        this.viewCommands.beforeApply(onLoadingCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsView) it.next()).mo14453q();
        }
        this.viewCommands.afterApply(onLoadingCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: s */
    public void mo14454s() {
        OnShowSendingCommentProgressViewCommand onShowSendingCommentProgressViewCommand = new OnShowSendingCommentProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowSendingCommentProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsView) it.next()).mo14454s();
        }
        this.viewCommands.afterApply(onShowSendingCommentProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: x */
    public void mo14455x() {
        OnCommentNegativeVoteLimitReachedCommand onCommentNegativeVoteLimitReachedCommand = new OnCommentNegativeVoteLimitReachedCommand(this);
        this.viewCommands.beforeApply(onCommentNegativeVoteLimitReachedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionCommentsView) it.next()).mo14455x();
        }
        this.viewCommands.afterApply(onCommentNegativeVoteLimitReachedCommand);
    }
}
