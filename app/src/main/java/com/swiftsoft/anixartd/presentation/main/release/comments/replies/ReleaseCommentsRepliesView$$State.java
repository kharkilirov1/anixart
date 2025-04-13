package com.swiftsoft.anixartd.presentation.main.release.comments.replies;

import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ReleaseCommentsRepliesView$$State extends MvpViewState<ReleaseCommentsRepliesView> implements ReleaseCommentsRepliesView {

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnBannedCommand extends ViewCommand<ReleaseCommentsRepliesView> {
        public OnBannedCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State) {
            super("onBanned", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15148o();
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnCommentCommand extends ViewCommand<ReleaseCommentsRepliesView> {

        /* renamed from: a */
        public final ReleaseComment f27115a;

        public OnCommentCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State, ReleaseComment releaseComment) {
            super("onComment", OneExecutionStateStrategy.class);
            this.f27115a = releaseComment;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15134U(this.f27115a);
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnCommentDeletedCommand extends ViewCommand<ReleaseCommentsRepliesView> {
        public OnCommentDeletedCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State) {
            super("onCommentDeleted", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15130F();
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnCommentLimitReachedCommand extends ViewCommand<ReleaseCommentsRepliesView> {
        public OnCommentLimitReachedCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State) {
            super("onCommentLimitReached", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15127A();
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnCommentNegativeVoteLimitReachedCommand extends ViewCommand<ReleaseCommentsRepliesView> {
        public OnCommentNegativeVoteLimitReachedCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State) {
            super("onCommentNegativeVoteLimitReached", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15153x();
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnCommentSentCommand extends ViewCommand<ReleaseCommentsRepliesView> {
        public OnCommentSentCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State) {
            super("onCommentSent", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15128B();
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnCommentVoteBannedCommand extends ViewCommand<ReleaseCommentsRepliesView> {
        public OnCommentVoteBannedCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State) {
            super("onCommentVoteBanned", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15131G();
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnFailedCommand extends ViewCommand<ReleaseCommentsRepliesView> {
        public OnFailedCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15139c();
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnHideLoadingCommand extends ViewCommand<ReleaseCommentsRepliesView> {
        public OnHideLoadingCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State) {
            super("onHideLoading", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15149p();
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ReleaseCommentsRepliesView> {
        public OnHideProgressViewCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15137a();
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<ReleaseCommentsRepliesView> {
        public OnHideRefreshViewCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15142e();
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnHideSendingCommentProgressViewCommand extends ViewCommand<ReleaseCommentsRepliesView> {
        public OnHideSendingCommentProgressViewCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State) {
            super("onHideSendingCommentProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15129D();
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnInBlockListCommand extends ViewCommand<ReleaseCommentsRepliesView> {
        public OnInBlockListCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State) {
            super("onInBlockList", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15132H();
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnLoadingCommand extends ViewCommand<ReleaseCommentsRepliesView> {
        public OnLoadingCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State) {
            super("onLoading", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15150q();
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnParentCommentLoadedCommand extends ViewCommand<ReleaseCommentsRepliesView> {

        /* renamed from: a */
        public final ReleaseComment f27116a;

        public OnParentCommentLoadedCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State, ReleaseComment releaseComment) {
            super("onParentCommentLoaded", OneExecutionStateStrategy.class);
            this.f27116a = releaseComment;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15133K2(this.f27116a);
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnParentCommentRemovedCommand extends ViewCommand<ReleaseCommentsRepliesView> {
        public OnParentCommentRemovedCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State) {
            super("onParentCommentRemoved", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15152v0();
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnProfileCommand extends ViewCommand<ReleaseCommentsRepliesView> {

        /* renamed from: a */
        public final long f27117a;

        public OnProfileCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State, long j2) {
            super("onProfile", OneExecutionStateStrategy.class);
            this.f27117a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15143f(this.f27117a);
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnRefreshAfterSortCommand extends ViewCommand<ReleaseCommentsRepliesView> {
        public OnRefreshAfterSortCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State) {
            super("onRefreshAfterSort", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15145l();
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnReleaseCommand extends ViewCommand<ReleaseCommentsRepliesView> {

        /* renamed from: a */
        public final long f27118a;

        public OnReleaseCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State, long j2) {
            super("onRelease", OneExecutionStateStrategy.class);
            this.f27118a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15144g(this.f27118a);
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnReplyCommand extends ViewCommand<ReleaseCommentsRepliesView> {

        /* renamed from: a */
        public final ReleaseComment f27119a;

        public OnReplyCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State, ReleaseComment releaseComment) {
            super("onReply", OneExecutionStateStrategy.class);
            this.f27119a = releaseComment;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15136X(this.f27119a);
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnReportSentCommand extends ViewCommand<ReleaseCommentsRepliesView> {
        public OnReportSentCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State) {
            super("onReportSent", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15147n();
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnShowCommentReportFragmentCommand extends ViewCommand<ReleaseCommentsRepliesView> {

        /* renamed from: a */
        public final ReleaseComment f27120a;

        public OnShowCommentReportFragmentCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State, ReleaseComment releaseComment) {
            super("onShowCommentReportFragment", OneExecutionStateStrategy.class);
            this.f27120a = releaseComment;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15140c0(this.f27120a);
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnShowNeedAuthCommand extends ViewCommand<ReleaseCommentsRepliesView> {
        public OnShowNeedAuthCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State) {
            super("onShowNeedAuth", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15146m();
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ReleaseCommentsRepliesView> {
        public OnShowProgressViewCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15138b();
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<ReleaseCommentsRepliesView> {
        public OnShowRefreshViewCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15141d();
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnShowSendingCommentProgressViewCommand extends ViewCommand<ReleaseCommentsRepliesView> {
        public OnShowSendingCommentProgressViewCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State) {
            super("onShowSendingCommentProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15151s();
        }
    }

    /* compiled from: ReleaseCommentsRepliesView$$State.java */
    public class OnVoteCommentCommand extends ViewCommand<ReleaseCommentsRepliesView> {

        /* renamed from: a */
        public final ReleaseComment f27121a;

        /* renamed from: b */
        public final int f27122b;

        public OnVoteCommentCommand(ReleaseCommentsRepliesView$$State releaseCommentsRepliesView$$State, ReleaseComment releaseComment, int i2) {
            super("onVoteComment", OneExecutionStateStrategy.class);
            this.f27121a = releaseComment;
            this.f27122b = i2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsRepliesView releaseCommentsRepliesView) {
            releaseCommentsRepliesView.mo15135W(this.f27121a, this.f27122b);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: A */
    public void mo15127A() {
        OnCommentLimitReachedCommand onCommentLimitReachedCommand = new OnCommentLimitReachedCommand(this);
        this.viewCommands.beforeApply(onCommentLimitReachedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15127A();
        }
        this.viewCommands.afterApply(onCommentLimitReachedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: B */
    public void mo15128B() {
        OnCommentSentCommand onCommentSentCommand = new OnCommentSentCommand(this);
        this.viewCommands.beforeApply(onCommentSentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15128B();
        }
        this.viewCommands.afterApply(onCommentSentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: D */
    public void mo15129D() {
        OnHideSendingCommentProgressViewCommand onHideSendingCommentProgressViewCommand = new OnHideSendingCommentProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideSendingCommentProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15129D();
        }
        this.viewCommands.afterApply(onHideSendingCommentProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: F */
    public void mo15130F() {
        OnCommentDeletedCommand onCommentDeletedCommand = new OnCommentDeletedCommand(this);
        this.viewCommands.beforeApply(onCommentDeletedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15130F();
        }
        this.viewCommands.afterApply(onCommentDeletedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: G */
    public void mo15131G() {
        OnCommentVoteBannedCommand onCommentVoteBannedCommand = new OnCommentVoteBannedCommand(this);
        this.viewCommands.beforeApply(onCommentVoteBannedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15131G();
        }
        this.viewCommands.afterApply(onCommentVoteBannedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: H */
    public void mo15132H() {
        OnInBlockListCommand onInBlockListCommand = new OnInBlockListCommand(this);
        this.viewCommands.beforeApply(onInBlockListCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15132H();
        }
        this.viewCommands.afterApply(onInBlockListCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: K2 */
    public void mo15133K2(ReleaseComment releaseComment) {
        OnParentCommentLoadedCommand onParentCommentLoadedCommand = new OnParentCommentLoadedCommand(this, releaseComment);
        this.viewCommands.beforeApply(onParentCommentLoadedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15133K2(releaseComment);
        }
        this.viewCommands.afterApply(onParentCommentLoadedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: U */
    public void mo15134U(ReleaseComment releaseComment) {
        OnCommentCommand onCommentCommand = new OnCommentCommand(this, releaseComment);
        this.viewCommands.beforeApply(onCommentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15134U(releaseComment);
        }
        this.viewCommands.afterApply(onCommentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: W */
    public void mo15135W(ReleaseComment releaseComment, int i2) {
        OnVoteCommentCommand onVoteCommentCommand = new OnVoteCommentCommand(this, releaseComment, i2);
        this.viewCommands.beforeApply(onVoteCommentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15135W(releaseComment, i2);
        }
        this.viewCommands.afterApply(onVoteCommentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: X */
    public void mo15136X(ReleaseComment releaseComment) {
        OnReplyCommand onReplyCommand = new OnReplyCommand(this, releaseComment);
        this.viewCommands.beforeApply(onReplyCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15136X(releaseComment);
        }
        this.viewCommands.afterApply(onReplyCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: a */
    public void mo15137a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15137a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: b */
    public void mo15138b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15138b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: c */
    public void mo15139c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15139c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: c0 */
    public void mo15140c0(ReleaseComment releaseComment) {
        OnShowCommentReportFragmentCommand onShowCommentReportFragmentCommand = new OnShowCommentReportFragmentCommand(this, releaseComment);
        this.viewCommands.beforeApply(onShowCommentReportFragmentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15140c0(releaseComment);
        }
        this.viewCommands.afterApply(onShowCommentReportFragmentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: d */
    public void mo15141d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15141d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: e */
    public void mo15142e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15142e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: f */
    public void mo15143f(long j2) {
        OnProfileCommand onProfileCommand = new OnProfileCommand(this, j2);
        this.viewCommands.beforeApply(onProfileCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15143f(j2);
        }
        this.viewCommands.afterApply(onProfileCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: g */
    public void mo15144g(long j2) {
        OnReleaseCommand onReleaseCommand = new OnReleaseCommand(this, j2);
        this.viewCommands.beforeApply(onReleaseCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15144g(j2);
        }
        this.viewCommands.afterApply(onReleaseCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: l */
    public void mo15145l() {
        OnRefreshAfterSortCommand onRefreshAfterSortCommand = new OnRefreshAfterSortCommand(this);
        this.viewCommands.beforeApply(onRefreshAfterSortCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15145l();
        }
        this.viewCommands.afterApply(onRefreshAfterSortCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: m */
    public void mo15146m() {
        OnShowNeedAuthCommand onShowNeedAuthCommand = new OnShowNeedAuthCommand(this);
        this.viewCommands.beforeApply(onShowNeedAuthCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15146m();
        }
        this.viewCommands.afterApply(onShowNeedAuthCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: n */
    public void mo15147n() {
        OnReportSentCommand onReportSentCommand = new OnReportSentCommand(this);
        this.viewCommands.beforeApply(onReportSentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15147n();
        }
        this.viewCommands.afterApply(onReportSentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: o */
    public void mo15148o() {
        OnBannedCommand onBannedCommand = new OnBannedCommand(this);
        this.viewCommands.beforeApply(onBannedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15148o();
        }
        this.viewCommands.afterApply(onBannedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: p */
    public void mo15149p() {
        OnHideLoadingCommand onHideLoadingCommand = new OnHideLoadingCommand(this);
        this.viewCommands.beforeApply(onHideLoadingCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15149p();
        }
        this.viewCommands.afterApply(onHideLoadingCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: q */
    public void mo15150q() {
        OnLoadingCommand onLoadingCommand = new OnLoadingCommand(this);
        this.viewCommands.beforeApply(onLoadingCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15150q();
        }
        this.viewCommands.afterApply(onLoadingCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: s */
    public void mo15151s() {
        OnShowSendingCommentProgressViewCommand onShowSendingCommentProgressViewCommand = new OnShowSendingCommentProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowSendingCommentProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15151s();
        }
        this.viewCommands.afterApply(onShowSendingCommentProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: v0 */
    public void mo15152v0() {
        OnParentCommentRemovedCommand onParentCommentRemovedCommand = new OnParentCommentRemovedCommand(this);
        this.viewCommands.beforeApply(onParentCommentRemovedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15152v0();
        }
        this.viewCommands.afterApply(onParentCommentRemovedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: x */
    public void mo15153x() {
        OnCommentNegativeVoteLimitReachedCommand onCommentNegativeVoteLimitReachedCommand = new OnCommentNegativeVoteLimitReachedCommand(this);
        this.viewCommands.beforeApply(onCommentNegativeVoteLimitReachedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsRepliesView) it.next()).mo15153x();
        }
        this.viewCommands.afterApply(onCommentNegativeVoteLimitReachedCommand);
    }
}
