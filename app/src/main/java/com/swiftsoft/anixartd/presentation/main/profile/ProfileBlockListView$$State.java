package com.swiftsoft.anixartd.presentation.main.profile;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ProfileBlockListView$$State extends MvpViewState<ProfileBlockListView> implements ProfileBlockListView {

    /* compiled from: ProfileBlockListView$$State.java */
    public class OnFailedCommand extends ViewCommand<ProfileBlockListView> {
        public OnFailedCommand(ProfileBlockListView$$State profileBlockListView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileBlockListView profileBlockListView) {
            profileBlockListView.mo14781c();
        }
    }

    /* compiled from: ProfileBlockListView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ProfileBlockListView> {
        public OnHideProgressViewCommand(ProfileBlockListView$$State profileBlockListView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileBlockListView profileBlockListView) {
            profileBlockListView.mo14779a();
        }
    }

    /* compiled from: ProfileBlockListView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<ProfileBlockListView> {
        public OnHideRefreshViewCommand(ProfileBlockListView$$State profileBlockListView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileBlockListView profileBlockListView) {
            profileBlockListView.mo14783e();
        }
    }

    /* compiled from: ProfileBlockListView$$State.java */
    public class OnProfileCommand extends ViewCommand<ProfileBlockListView> {

        /* renamed from: a */
        public final long f26582a;

        public OnProfileCommand(ProfileBlockListView$$State profileBlockListView$$State, long j2) {
            super("onProfile", OneExecutionStateStrategy.class);
            this.f26582a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileBlockListView profileBlockListView) {
            profileBlockListView.mo14784f(this.f26582a);
        }
    }

    /* compiled from: ProfileBlockListView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ProfileBlockListView> {
        public OnShowProgressViewCommand(ProfileBlockListView$$State profileBlockListView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileBlockListView profileBlockListView) {
            profileBlockListView.mo14780b();
        }
    }

    /* compiled from: ProfileBlockListView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<ProfileBlockListView> {
        public OnShowRefreshViewCommand(ProfileBlockListView$$State profileBlockListView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileBlockListView profileBlockListView) {
            profileBlockListView.mo14782d();
        }
    }

    /* compiled from: ProfileBlockListView$$State.java */
    public class OnUnblockCommand extends ViewCommand<ProfileBlockListView> {
        public OnUnblockCommand(ProfileBlockListView$$State profileBlockListView$$State) {
            super("onUnblock", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileBlockListView profileBlockListView) {
            profileBlockListView.mo14777A0();
        }
    }

    /* compiled from: ProfileBlockListView$$State.java */
    public class OnUnblockFailedCommand extends ViewCommand<ProfileBlockListView> {
        public OnUnblockFailedCommand(ProfileBlockListView$$State profileBlockListView$$State) {
            super("onUnblockFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileBlockListView profileBlockListView) {
            profileBlockListView.mo14778Z2();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileBlockListView
    /* renamed from: A0 */
    public void mo14777A0() {
        OnUnblockCommand onUnblockCommand = new OnUnblockCommand(this);
        this.viewCommands.beforeApply(onUnblockCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileBlockListView) it.next()).mo14777A0();
        }
        this.viewCommands.afterApply(onUnblockCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileBlockListView
    /* renamed from: Z2 */
    public void mo14778Z2() {
        OnUnblockFailedCommand onUnblockFailedCommand = new OnUnblockFailedCommand(this);
        this.viewCommands.beforeApply(onUnblockFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileBlockListView) it.next()).mo14778Z2();
        }
        this.viewCommands.afterApply(onUnblockFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileBlockListView
    /* renamed from: a */
    public void mo14779a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileBlockListView) it.next()).mo14779a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileBlockListView
    /* renamed from: b */
    public void mo14780b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileBlockListView) it.next()).mo14780b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileBlockListView
    /* renamed from: c */
    public void mo14781c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileBlockListView) it.next()).mo14781c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileBlockListView
    /* renamed from: d */
    public void mo14782d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileBlockListView) it.next()).mo14782d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileBlockListView
    /* renamed from: e */
    public void mo14783e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileBlockListView) it.next()).mo14783e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileBlockListView
    /* renamed from: f */
    public void mo14784f(long j2) {
        OnProfileCommand onProfileCommand = new OnProfileCommand(this, j2);
        this.viewCommands.beforeApply(onProfileCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileBlockListView) it.next()).mo14784f(j2);
        }
        this.viewCommands.afterApply(onProfileCommand);
    }
}
