package com.swiftsoft.anixartd.presentation.main.profile;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ProfileChangeLoginHistoryView$$State extends MvpViewState<ProfileChangeLoginHistoryView> implements ProfileChangeLoginHistoryView {

    /* compiled from: ProfileChangeLoginHistoryView$$State.java */
    public class OnFailedCommand extends ViewCommand<ProfileChangeLoginHistoryView> {
        public OnFailedCommand(ProfileChangeLoginHistoryView$$State profileChangeLoginHistoryView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileChangeLoginHistoryView profileChangeLoginHistoryView) {
            profileChangeLoginHistoryView.mo14788c();
        }
    }

    /* compiled from: ProfileChangeLoginHistoryView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ProfileChangeLoginHistoryView> {
        public OnHideProgressViewCommand(ProfileChangeLoginHistoryView$$State profileChangeLoginHistoryView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileChangeLoginHistoryView profileChangeLoginHistoryView) {
            profileChangeLoginHistoryView.mo14786a();
        }
    }

    /* compiled from: ProfileChangeLoginHistoryView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<ProfileChangeLoginHistoryView> {
        public OnHideRefreshViewCommand(ProfileChangeLoginHistoryView$$State profileChangeLoginHistoryView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileChangeLoginHistoryView profileChangeLoginHistoryView) {
            profileChangeLoginHistoryView.mo14790e();
        }
    }

    /* compiled from: ProfileChangeLoginHistoryView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ProfileChangeLoginHistoryView> {
        public OnShowProgressViewCommand(ProfileChangeLoginHistoryView$$State profileChangeLoginHistoryView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileChangeLoginHistoryView profileChangeLoginHistoryView) {
            profileChangeLoginHistoryView.mo14787b();
        }
    }

    /* compiled from: ProfileChangeLoginHistoryView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<ProfileChangeLoginHistoryView> {
        public OnShowRefreshViewCommand(ProfileChangeLoginHistoryView$$State profileChangeLoginHistoryView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileChangeLoginHistoryView profileChangeLoginHistoryView) {
            profileChangeLoginHistoryView.mo14789d();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileChangeLoginHistoryView
    /* renamed from: a */
    public void mo14786a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileChangeLoginHistoryView) it.next()).mo14786a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileChangeLoginHistoryView
    /* renamed from: b */
    public void mo14787b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileChangeLoginHistoryView) it.next()).mo14787b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileChangeLoginHistoryView
    /* renamed from: c */
    public void mo14788c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileChangeLoginHistoryView) it.next()).mo14788c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileChangeLoginHistoryView
    /* renamed from: d */
    public void mo14789d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileChangeLoginHistoryView) it.next()).mo14789d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileChangeLoginHistoryView
    /* renamed from: e */
    public void mo14790e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileChangeLoginHistoryView) it.next()).mo14790e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }
}
