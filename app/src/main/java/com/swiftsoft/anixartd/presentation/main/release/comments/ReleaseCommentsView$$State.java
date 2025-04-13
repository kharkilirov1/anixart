package com.swiftsoft.anixartd.presentation.main.release.comments;

import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ReleaseCommentsView$$State extends MvpViewState<ReleaseCommentsView> implements ReleaseCommentsView {

    /* compiled from: ReleaseCommentsView$$State.java */
    public class OnBannedCommand extends ViewCommand<ReleaseCommentsView> {
        public OnBannedCommand(ReleaseCommentsView$$State releaseCommentsView$$State) {
            super("onBanned", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsView releaseCommentsView) {
            releaseCommentsView.mo15113o();
        }
    }

    /* compiled from: ReleaseCommentsView$$State.java */
    public class OnCommentCommand extends ViewCommand<ReleaseCommentsView> {

        /* renamed from: a */
        public final ReleaseComment f27070a;

        public OnCommentCommand(ReleaseCommentsView$$State releaseCommentsView$$State, ReleaseComment releaseComment) {
            super("onComment", OneExecutionStateStrategy.class);
            this.f27070a = releaseComment;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsView releaseCommentsView) {
            releaseCommentsView.mo15100U(this.f27070a);
        }
    }

    /* compiled from: ReleaseCommentsView$$State.java */
    public class OnCommentDeletedCommand extends ViewCommand<ReleaseCommentsView> {
        public OnCommentDeletedCommand(ReleaseCommentsView$$State releaseCommentsView$$State) {
            super("onCommentDeleted", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsView releaseCommentsView) {
            releaseCommentsView.mo15097F();
        }
    }

    /* compiled from: ReleaseCommentsView$$State.java */
    public class OnCommentLimitReachedCommand extends ViewCommand<ReleaseCommentsView> {
        public OnCommentLimitReachedCommand(ReleaseCommentsView$$State releaseCommentsView$$State) {
            super("onCommentLimitReached", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsView releaseCommentsView) {
            releaseCommentsView.mo15094A();
        }
    }

    /* compiled from: ReleaseCommentsView$$State.java */
    public class OnCommentNegativeVoteLimitReachedCommand extends ViewCommand<ReleaseCommentsView> {
        public OnCommentNegativeVoteLimitReachedCommand(ReleaseCommentsView$$State releaseCommentsView$$State) {
            super("onCommentNegativeVoteLimitReached", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsView releaseCommentsView) {
            releaseCommentsView.mo15117x();
        }
    }

    /* compiled from: ReleaseCommentsView$$State.java */
    public class OnCommentSentCommand extends ViewCommand<ReleaseCommentsView> {
        public OnCommentSentCommand(ReleaseCommentsView$$State releaseCommentsView$$State) {
            super("onCommentSent", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsView releaseCommentsView) {
            releaseCommentsView.mo15095B();
        }
    }

    /* compiled from: ReleaseCommentsView$$State.java */
    public class OnCommentVoteBannedCommand extends ViewCommand<ReleaseCommentsView> {
        public OnCommentVoteBannedCommand(ReleaseCommentsView$$State releaseCommentsView$$State) {
            super("onCommentVoteBanned", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsView releaseCommentsView) {
            releaseCommentsView.mo15098G();
        }
    }

    /* compiled from: ReleaseCommentsView$$State.java */
    public class OnFailedCommand extends ViewCommand<ReleaseCommentsView> {
        public OnFailedCommand(ReleaseCommentsView$$State releaseCommentsView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsView releaseCommentsView) {
            releaseCommentsView.mo15105c();
        }
    }

    /* compiled from: ReleaseCommentsView$$State.java */
    public class OnHideLoadingCommand extends ViewCommand<ReleaseCommentsView> {
        public OnHideLoadingCommand(ReleaseCommentsView$$State releaseCommentsView$$State) {
            super("onHideLoading", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsView releaseCommentsView) {
            releaseCommentsView.mo15114p();
        }
    }

    /* compiled from: ReleaseCommentsView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ReleaseCommentsView> {
        public OnHideProgressViewCommand(ReleaseCommentsView$$State releaseCommentsView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsView releaseCommentsView) {
            releaseCommentsView.mo15103a();
        }
    }

    /* compiled from: ReleaseCommentsView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<ReleaseCommentsView> {
        public OnHideRefreshViewCommand(ReleaseCommentsView$$State releaseCommentsView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsView releaseCommentsView) {
            releaseCommentsView.mo15108e();
        }
    }

    /* compiled from: ReleaseCommentsView$$State.java */
    public class OnHideSendingCommentProgressViewCommand extends ViewCommand<ReleaseCommentsView> {
        public OnHideSendingCommentProgressViewCommand(ReleaseCommentsView$$State releaseCommentsView$$State) {
            super("onHideSendingCommentProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsView releaseCommentsView) {
            releaseCommentsView.mo15096D();
        }
    }

    /* compiled from: ReleaseCommentsView$$State.java */
    public class OnInBlockListCommand extends ViewCommand<ReleaseCommentsView> {
        public OnInBlockListCommand(ReleaseCommentsView$$State releaseCommentsView$$State) {
            super("onInBlockList", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsView releaseCommentsView) {
            releaseCommentsView.mo15099H();
        }
    }

    /* compiled from: ReleaseCommentsView$$State.java */
    public class OnLoadingCommand extends ViewCommand<ReleaseCommentsView> {
        public OnLoadingCommand(ReleaseCommentsView$$State releaseCommentsView$$State) {
            super("onLoading", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsView releaseCommentsView) {
            releaseCommentsView.mo15115q();
        }
    }

    /* compiled from: ReleaseCommentsView$$State.java */
    public class OnProfileCommand extends ViewCommand<ReleaseCommentsView> {

        /* renamed from: a */
        public final long f27071a;

        public OnProfileCommand(ReleaseCommentsView$$State releaseCommentsView$$State, long j2) {
            super("onProfile", OneExecutionStateStrategy.class);
            this.f27071a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsView releaseCommentsView) {
            releaseCommentsView.mo15109f(this.f27071a);
        }
    }

    /* compiled from: ReleaseCommentsView$$State.java */
    public class OnRefreshAfterSortCommand extends ViewCommand<ReleaseCommentsView> {
        public OnRefreshAfterSortCommand(ReleaseCommentsView$$State releaseCommentsView$$State) {
            super("onRefreshAfterSort", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsView releaseCommentsView) {
            releaseCommentsView.mo15110l();
        }
    }

    /* compiled from: ReleaseCommentsView$$State.java */
    public class OnRepliesCommand extends ViewCommand<ReleaseCommentsView> {

        /* renamed from: a */
        public final ReleaseComment f27072a;

        public OnRepliesCommand(ReleaseCommentsView$$State releaseCommentsView$$State, ReleaseComment releaseComment) {
            super("onReplies", OneExecutionStateStrategy.class);
            this.f27072a = releaseComment;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsView releaseCommentsView) {
            releaseCommentsView.mo15118z0(this.f27072a);
        }
    }

    /* compiled from: ReleaseCommentsView$$State.java */
    public class OnReplyCommand extends ViewCommand<ReleaseCommentsView> {

        /* renamed from: a */
        public final ReleaseComment f27073a;

        public OnReplyCommand(ReleaseCommentsView$$State releaseCommentsView$$State, ReleaseComment releaseComment) {
            super("onReply", OneExecutionStateStrategy.class);
            this.f27073a = releaseComment;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsView releaseCommentsView) {
            releaseCommentsView.mo15102X(this.f27073a);
        }
    }

    /* compiled from: ReleaseCommentsView$$State.java */
    public class OnReportSentCommand extends ViewCommand<ReleaseCommentsView> {
        public OnReportSentCommand(ReleaseCommentsView$$State releaseCommentsView$$State) {
            super("onReportSent", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsView releaseCommentsView) {
            releaseCommentsView.mo15112n();
        }
    }

    /* compiled from: ReleaseCommentsView$$State.java */
    public class OnShowCommentReportFragmentCommand extends ViewCommand<ReleaseCommentsView> {

        /* renamed from: a */
        public final ReleaseComment f27074a;

        public OnShowCommentReportFragmentCommand(ReleaseCommentsView$$State releaseCommentsView$$State, ReleaseComment releaseComment) {
            super("onShowCommentReportFragment", OneExecutionStateStrategy.class);
            this.f27074a = releaseComment;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsView releaseCommentsView) {
            releaseCommentsView.mo15106c0(this.f27074a);
        }
    }

    /* compiled from: ReleaseCommentsView$$State.java */
    public class OnShowNeedAuthCommand extends ViewCommand<ReleaseCommentsView> {
        public OnShowNeedAuthCommand(ReleaseCommentsView$$State releaseCommentsView$$State) {
            super("onShowNeedAuth", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsView releaseCommentsView) {
            releaseCommentsView.mo15111m();
        }
    }

    /* compiled from: ReleaseCommentsView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ReleaseCommentsView> {
        public OnShowProgressViewCommand(ReleaseCommentsView$$State releaseCommentsView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsView releaseCommentsView) {
            releaseCommentsView.mo15104b();
        }
    }

    /* compiled from: ReleaseCommentsView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<ReleaseCommentsView> {
        public OnShowRefreshViewCommand(ReleaseCommentsView$$State releaseCommentsView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsView releaseCommentsView) {
            releaseCommentsView.mo15107d();
        }
    }

    /* compiled from: ReleaseCommentsView$$State.java */
    public class OnShowSendingCommentProgressViewCommand extends ViewCommand<ReleaseCommentsView> {
        public OnShowSendingCommentProgressViewCommand(ReleaseCommentsView$$State releaseCommentsView$$State) {
            super("onShowSendingCommentProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsView releaseCommentsView) {
            releaseCommentsView.mo15116s();
        }
    }

    /* compiled from: ReleaseCommentsView$$State.java */
    public class OnVoteCommentCommand extends ViewCommand<ReleaseCommentsView> {

        /* renamed from: a */
        public final ReleaseComment f27075a;

        /* renamed from: b */
        public final int f27076b;

        public OnVoteCommentCommand(ReleaseCommentsView$$State releaseCommentsView$$State, ReleaseComment releaseComment, int i2) {
            super("onVoteComment", OneExecutionStateStrategy.class);
            this.f27075a = releaseComment;
            this.f27076b = i2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCommentsView releaseCommentsView) {
            releaseCommentsView.mo15101W(this.f27075a, this.f27076b);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: A */
    public void mo15094A() {
        OnCommentLimitReachedCommand onCommentLimitReachedCommand = new OnCommentLimitReachedCommand(this);
        this.viewCommands.beforeApply(onCommentLimitReachedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsView) it.next()).mo15094A();
        }
        this.viewCommands.afterApply(onCommentLimitReachedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: B */
    public void mo15095B() {
        OnCommentSentCommand onCommentSentCommand = new OnCommentSentCommand(this);
        this.viewCommands.beforeApply(onCommentSentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsView) it.next()).mo15095B();
        }
        this.viewCommands.afterApply(onCommentSentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: D */
    public void mo15096D() {
        OnHideSendingCommentProgressViewCommand onHideSendingCommentProgressViewCommand = new OnHideSendingCommentProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideSendingCommentProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsView) it.next()).mo15096D();
        }
        this.viewCommands.afterApply(onHideSendingCommentProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: F */
    public void mo15097F() {
        OnCommentDeletedCommand onCommentDeletedCommand = new OnCommentDeletedCommand(this);
        this.viewCommands.beforeApply(onCommentDeletedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsView) it.next()).mo15097F();
        }
        this.viewCommands.afterApply(onCommentDeletedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: G */
    public void mo15098G() {
        OnCommentVoteBannedCommand onCommentVoteBannedCommand = new OnCommentVoteBannedCommand(this);
        this.viewCommands.beforeApply(onCommentVoteBannedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsView) it.next()).mo15098G();
        }
        this.viewCommands.afterApply(onCommentVoteBannedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: H */
    public void mo15099H() {
        OnInBlockListCommand onInBlockListCommand = new OnInBlockListCommand(this);
        this.viewCommands.beforeApply(onInBlockListCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsView) it.next()).mo15099H();
        }
        this.viewCommands.afterApply(onInBlockListCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: U */
    public void mo15100U(ReleaseComment releaseComment) {
        OnCommentCommand onCommentCommand = new OnCommentCommand(this, releaseComment);
        this.viewCommands.beforeApply(onCommentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsView) it.next()).mo15100U(releaseComment);
        }
        this.viewCommands.afterApply(onCommentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: W */
    public void mo15101W(ReleaseComment releaseComment, int i2) {
        OnVoteCommentCommand onVoteCommentCommand = new OnVoteCommentCommand(this, releaseComment, i2);
        this.viewCommands.beforeApply(onVoteCommentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsView) it.next()).mo15101W(releaseComment, i2);
        }
        this.viewCommands.afterApply(onVoteCommentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: X */
    public void mo15102X(ReleaseComment releaseComment) {
        OnReplyCommand onReplyCommand = new OnReplyCommand(this, releaseComment);
        this.viewCommands.beforeApply(onReplyCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsView) it.next()).mo15102X(releaseComment);
        }
        this.viewCommands.afterApply(onReplyCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: a */
    public void mo15103a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsView) it.next()).mo15103a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: b */
    public void mo15104b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsView) it.next()).mo15104b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: c */
    public void mo15105c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsView) it.next()).mo15105c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: c0 */
    public void mo15106c0(ReleaseComment releaseComment) {
        OnShowCommentReportFragmentCommand onShowCommentReportFragmentCommand = new OnShowCommentReportFragmentCommand(this, releaseComment);
        this.viewCommands.beforeApply(onShowCommentReportFragmentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsView) it.next()).mo15106c0(releaseComment);
        }
        this.viewCommands.afterApply(onShowCommentReportFragmentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: d */
    public void mo15107d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsView) it.next()).mo15107d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: e */
    public void mo15108e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsView) it.next()).mo15108e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: f */
    public void mo15109f(long j2) {
        OnProfileCommand onProfileCommand = new OnProfileCommand(this, j2);
        this.viewCommands.beforeApply(onProfileCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsView) it.next()).mo15109f(j2);
        }
        this.viewCommands.afterApply(onProfileCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: l */
    public void mo15110l() {
        OnRefreshAfterSortCommand onRefreshAfterSortCommand = new OnRefreshAfterSortCommand(this);
        this.viewCommands.beforeApply(onRefreshAfterSortCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsView) it.next()).mo15110l();
        }
        this.viewCommands.afterApply(onRefreshAfterSortCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: m */
    public void mo15111m() {
        OnShowNeedAuthCommand onShowNeedAuthCommand = new OnShowNeedAuthCommand(this);
        this.viewCommands.beforeApply(onShowNeedAuthCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsView) it.next()).mo15111m();
        }
        this.viewCommands.afterApply(onShowNeedAuthCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: n */
    public void mo15112n() {
        OnReportSentCommand onReportSentCommand = new OnReportSentCommand(this);
        this.viewCommands.beforeApply(onReportSentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsView) it.next()).mo15112n();
        }
        this.viewCommands.afterApply(onReportSentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: o */
    public void mo15113o() {
        OnBannedCommand onBannedCommand = new OnBannedCommand(this);
        this.viewCommands.beforeApply(onBannedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsView) it.next()).mo15113o();
        }
        this.viewCommands.afterApply(onBannedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: p */
    public void mo15114p() {
        OnHideLoadingCommand onHideLoadingCommand = new OnHideLoadingCommand(this);
        this.viewCommands.beforeApply(onHideLoadingCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsView) it.next()).mo15114p();
        }
        this.viewCommands.afterApply(onHideLoadingCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: q */
    public void mo15115q() {
        OnLoadingCommand onLoadingCommand = new OnLoadingCommand(this);
        this.viewCommands.beforeApply(onLoadingCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsView) it.next()).mo15115q();
        }
        this.viewCommands.afterApply(onLoadingCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: s */
    public void mo15116s() {
        OnShowSendingCommentProgressViewCommand onShowSendingCommentProgressViewCommand = new OnShowSendingCommentProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowSendingCommentProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsView) it.next()).mo15116s();
        }
        this.viewCommands.afterApply(onShowSendingCommentProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: x */
    public void mo15117x() {
        OnCommentNegativeVoteLimitReachedCommand onCommentNegativeVoteLimitReachedCommand = new OnCommentNegativeVoteLimitReachedCommand(this);
        this.viewCommands.beforeApply(onCommentNegativeVoteLimitReachedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsView) it.next()).mo15117x();
        }
        this.viewCommands.afterApply(onCommentNegativeVoteLimitReachedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: z0 */
    public void mo15118z0(ReleaseComment releaseComment) {
        OnRepliesCommand onRepliesCommand = new OnRepliesCommand(this, releaseComment);
        this.viewCommands.beforeApply(onRepliesCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCommentsView) it.next()).mo15118z0(releaseComment);
        }
        this.viewCommands.afterApply(onRepliesCommand);
    }
}
