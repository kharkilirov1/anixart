package com.swiftsoft.anixartd.presentation.comments;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class CommentVotesView$$State extends MvpViewState<CommentVotesView> implements CommentVotesView {

    /* compiled from: CommentVotesView$$State.java */
    public class OnFailedCommand extends ViewCommand<CommentVotesView> {
        public OnFailedCommand(CommentVotesView$$State commentVotesView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CommentVotesView commentVotesView) {
            commentVotesView.mo14307c();
        }
    }

    /* compiled from: CommentVotesView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<CommentVotesView> {
        public OnHideProgressViewCommand(CommentVotesView$$State commentVotesView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CommentVotesView commentVotesView) {
            commentVotesView.mo14305a();
        }
    }

    /* compiled from: CommentVotesView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<CommentVotesView> {
        public OnHideRefreshViewCommand(CommentVotesView$$State commentVotesView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CommentVotesView commentVotesView) {
            commentVotesView.mo14309e();
        }
    }

    /* compiled from: CommentVotesView$$State.java */
    public class OnProfileCommand extends ViewCommand<CommentVotesView> {

        /* renamed from: a */
        public final long f25944a;

        public OnProfileCommand(CommentVotesView$$State commentVotesView$$State, long j2) {
            super("onProfile", OneExecutionStateStrategy.class);
            this.f25944a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CommentVotesView commentVotesView) {
            commentVotesView.mo14310f(this.f25944a);
        }
    }

    /* compiled from: CommentVotesView$$State.java */
    public class OnRefreshAfterSortCommand extends ViewCommand<CommentVotesView> {
        public OnRefreshAfterSortCommand(CommentVotesView$$State commentVotesView$$State) {
            super("onRefreshAfterSort", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CommentVotesView commentVotesView) {
            commentVotesView.mo14311l();
        }
    }

    /* compiled from: CommentVotesView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<CommentVotesView> {
        public OnShowProgressViewCommand(CommentVotesView$$State commentVotesView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CommentVotesView commentVotesView) {
            commentVotesView.mo14306b();
        }
    }

    /* compiled from: CommentVotesView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<CommentVotesView> {
        public OnShowRefreshViewCommand(CommentVotesView$$State commentVotesView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CommentVotesView commentVotesView) {
            commentVotesView.mo14308d();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.comments.CommentVotesView
    /* renamed from: a */
    public void mo14305a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CommentVotesView) it.next()).mo14305a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.comments.CommentVotesView
    /* renamed from: b */
    public void mo14306b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CommentVotesView) it.next()).mo14306b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.comments.CommentVotesView
    /* renamed from: c */
    public void mo14307c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CommentVotesView) it.next()).mo14307c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.comments.CommentVotesView
    /* renamed from: d */
    public void mo14308d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CommentVotesView) it.next()).mo14308d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.comments.CommentVotesView
    /* renamed from: e */
    public void mo14309e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CommentVotesView) it.next()).mo14309e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.comments.CommentVotesView
    /* renamed from: f */
    public void mo14310f(long j2) {
        OnProfileCommand onProfileCommand = new OnProfileCommand(this, j2);
        this.viewCommands.beforeApply(onProfileCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CommentVotesView) it.next()).mo14310f(j2);
        }
        this.viewCommands.afterApply(onProfileCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.comments.CommentVotesView
    /* renamed from: l */
    public void mo14311l() {
        OnRefreshAfterSortCommand onRefreshAfterSortCommand = new OnRefreshAfterSortCommand(this);
        this.viewCommands.beforeApply(onRefreshAfterSortCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CommentVotesView) it.next()).mo14311l();
        }
        this.viewCommands.afterApply(onRefreshAfterSortCommand);
    }
}
