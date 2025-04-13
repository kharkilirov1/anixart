package com.swiftsoft.anixartd.presentation.main.profile.vote;

import com.swiftsoft.anixartd.database.entity.Release;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ProfileReleaseVoteView$$State extends MvpViewState<ProfileReleaseVoteView> implements ProfileReleaseVoteView {

    /* compiled from: ProfileReleaseVoteView$$State.java */
    public class OnFailedCommand extends ViewCommand<ProfileReleaseVoteView> {
        public OnFailedCommand(ProfileReleaseVoteView$$State profileReleaseVoteView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVoteView profileReleaseVoteView) {
            profileReleaseVoteView.mo14989c();
        }
    }

    /* compiled from: ProfileReleaseVoteView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ProfileReleaseVoteView> {
        public OnHideProgressViewCommand(ProfileReleaseVoteView$$State profileReleaseVoteView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVoteView profileReleaseVoteView) {
            profileReleaseVoteView.mo14987a();
        }
    }

    /* compiled from: ProfileReleaseVoteView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<ProfileReleaseVoteView> {
        public OnHideRefreshViewCommand(ProfileReleaseVoteView$$State profileReleaseVoteView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVoteView profileReleaseVoteView) {
            profileReleaseVoteView.mo14991e();
        }
    }

    /* compiled from: ProfileReleaseVoteView$$State.java */
    public class OnRefreshAfterSortCommand extends ViewCommand<ProfileReleaseVoteView> {
        public OnRefreshAfterSortCommand(ProfileReleaseVoteView$$State profileReleaseVoteView$$State) {
            super("onRefreshAfterSort", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVoteView profileReleaseVoteView) {
            profileReleaseVoteView.mo14994l();
        }
    }

    /* compiled from: ProfileReleaseVoteView$$State.java */
    public class OnReleaseCommand extends ViewCommand<ProfileReleaseVoteView> {

        /* renamed from: a */
        public final Release f26907a;

        public OnReleaseCommand(ProfileReleaseVoteView$$State profileReleaseVoteView$$State, Release release) {
            super("onRelease", OneExecutionStateStrategy.class);
            this.f26907a = release;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVoteView profileReleaseVoteView) {
            profileReleaseVoteView.mo14993i(this.f26907a);
        }
    }

    /* compiled from: ProfileReleaseVoteView$$State.java */
    public class OnReleaseUnvotedCommand extends ViewCommand<ProfileReleaseVoteView> {
        public OnReleaseUnvotedCommand(ProfileReleaseVoteView$$State profileReleaseVoteView$$State) {
            super("onReleaseUnvoted", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVoteView profileReleaseVoteView) {
            profileReleaseVoteView.mo14992h0();
        }
    }

    /* compiled from: ProfileReleaseVoteView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ProfileReleaseVoteView> {
        public OnShowProgressViewCommand(ProfileReleaseVoteView$$State profileReleaseVoteView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVoteView profileReleaseVoteView) {
            profileReleaseVoteView.mo14988b();
        }
    }

    /* compiled from: ProfileReleaseVoteView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<ProfileReleaseVoteView> {
        public OnShowRefreshViewCommand(ProfileReleaseVoteView$$State profileReleaseVoteView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVoteView profileReleaseVoteView) {
            profileReleaseVoteView.mo14990d();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseVoteView
    /* renamed from: a */
    public void mo14987a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVoteView) it.next()).mo14987a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseVoteView
    /* renamed from: b */
    public void mo14988b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVoteView) it.next()).mo14988b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseVoteView
    /* renamed from: c */
    public void mo14989c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVoteView) it.next()).mo14989c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseVoteView
    /* renamed from: d */
    public void mo14990d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVoteView) it.next()).mo14990d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseVoteView
    /* renamed from: e */
    public void mo14991e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVoteView) it.next()).mo14991e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseVoteView
    /* renamed from: h0 */
    public void mo14992h0() {
        OnReleaseUnvotedCommand onReleaseUnvotedCommand = new OnReleaseUnvotedCommand(this);
        this.viewCommands.beforeApply(onReleaseUnvotedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVoteView) it.next()).mo14992h0();
        }
        this.viewCommands.afterApply(onReleaseUnvotedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseVoteView
    /* renamed from: i */
    public void mo14993i(Release release) {
        OnReleaseCommand onReleaseCommand = new OnReleaseCommand(this, release);
        this.viewCommands.beforeApply(onReleaseCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVoteView) it.next()).mo14993i(release);
        }
        this.viewCommands.afterApply(onReleaseCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseVoteView
    /* renamed from: l */
    public void mo14994l() {
        OnRefreshAfterSortCommand onRefreshAfterSortCommand = new OnRefreshAfterSortCommand(this);
        this.viewCommands.beforeApply(onRefreshAfterSortCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVoteView) it.next()).mo14994l();
        }
        this.viewCommands.afterApply(onRefreshAfterSortCommand);
    }
}
