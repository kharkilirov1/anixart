package com.swiftsoft.anixartd.presentation.main.profile.vote;

import com.swiftsoft.anixartd.database.entity.Release;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ProfileReleaseUnvotedView$$State extends MvpViewState<ProfileReleaseUnvotedView> implements ProfileReleaseUnvotedView {

    /* compiled from: ProfileReleaseUnvotedView$$State.java */
    public class OnFailedCommand extends ViewCommand<ProfileReleaseUnvotedView> {
        public OnFailedCommand(ProfileReleaseUnvotedView$$State profileReleaseUnvotedView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseUnvotedView profileReleaseUnvotedView) {
            profileReleaseUnvotedView.mo14978c();
        }
    }

    /* compiled from: ProfileReleaseUnvotedView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ProfileReleaseUnvotedView> {
        public OnHideProgressViewCommand(ProfileReleaseUnvotedView$$State profileReleaseUnvotedView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseUnvotedView profileReleaseUnvotedView) {
            profileReleaseUnvotedView.mo14976a();
        }
    }

    /* compiled from: ProfileReleaseUnvotedView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<ProfileReleaseUnvotedView> {
        public OnHideRefreshViewCommand(ProfileReleaseUnvotedView$$State profileReleaseUnvotedView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseUnvotedView profileReleaseUnvotedView) {
            profileReleaseUnvotedView.mo14980e();
        }
    }

    /* compiled from: ProfileReleaseUnvotedView$$State.java */
    public class OnReleaseCommand extends ViewCommand<ProfileReleaseUnvotedView> {

        /* renamed from: a */
        public final Release f26888a;

        public OnReleaseCommand(ProfileReleaseUnvotedView$$State profileReleaseUnvotedView$$State, Release release) {
            super("onRelease", OneExecutionStateStrategy.class);
            this.f26888a = release;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseUnvotedView profileReleaseUnvotedView) {
            profileReleaseUnvotedView.mo14981i(this.f26888a);
        }
    }

    /* compiled from: ProfileReleaseUnvotedView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ProfileReleaseUnvotedView> {
        public OnShowProgressViewCommand(ProfileReleaseUnvotedView$$State profileReleaseUnvotedView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseUnvotedView profileReleaseUnvotedView) {
            profileReleaseUnvotedView.mo14977b();
        }
    }

    /* compiled from: ProfileReleaseUnvotedView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<ProfileReleaseUnvotedView> {
        public OnShowRefreshViewCommand(ProfileReleaseUnvotedView$$State profileReleaseUnvotedView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseUnvotedView profileReleaseUnvotedView) {
            profileReleaseUnvotedView.mo14979d();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseUnvotedView
    /* renamed from: a */
    public void mo14976a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseUnvotedView) it.next()).mo14976a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseUnvotedView
    /* renamed from: b */
    public void mo14977b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseUnvotedView) it.next()).mo14977b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseUnvotedView
    /* renamed from: c */
    public void mo14978c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseUnvotedView) it.next()).mo14978c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseUnvotedView
    /* renamed from: d */
    public void mo14979d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseUnvotedView) it.next()).mo14979d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseUnvotedView
    /* renamed from: e */
    public void mo14980e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseUnvotedView) it.next()).mo14980e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseUnvotedView
    /* renamed from: i */
    public void mo14981i(Release release) {
        OnReleaseCommand onReleaseCommand = new OnReleaseCommand(this, release);
        this.viewCommands.beforeApply(onReleaseCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseUnvotedView) it.next()).mo14981i(release);
        }
        this.viewCommands.afterApply(onReleaseCommand);
    }
}
