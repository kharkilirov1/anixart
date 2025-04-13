package com.swiftsoft.anixartd.presentation.main.profile.friends;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ProfileOutFriendRequestsView$$State extends MvpViewState<ProfileOutFriendRequestsView> implements ProfileOutFriendRequestsView {

    /* compiled from: ProfileOutFriendRequestsView$$State.java */
    public class OnCancelFriendRequestCommand extends ViewCommand<ProfileOutFriendRequestsView> {
        public OnCancelFriendRequestCommand(ProfileOutFriendRequestsView$$State profileOutFriendRequestsView$$State) {
            super("onCancelFriendRequest", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileOutFriendRequestsView profileOutFriendRequestsView) {
            profileOutFriendRequestsView.mo14910W3();
        }
    }

    /* compiled from: ProfileOutFriendRequestsView$$State.java */
    public class OnCancelFriendRequestFailedCommand extends ViewCommand<ProfileOutFriendRequestsView> {
        public OnCancelFriendRequestFailedCommand(ProfileOutFriendRequestsView$$State profileOutFriendRequestsView$$State) {
            super("onCancelFriendRequestFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileOutFriendRequestsView profileOutFriendRequestsView) {
            profileOutFriendRequestsView.mo14917s0();
        }
    }

    /* compiled from: ProfileOutFriendRequestsView$$State.java */
    public class OnFailedCommand extends ViewCommand<ProfileOutFriendRequestsView> {
        public OnFailedCommand(ProfileOutFriendRequestsView$$State profileOutFriendRequestsView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileOutFriendRequestsView profileOutFriendRequestsView) {
            profileOutFriendRequestsView.mo14913c();
        }
    }

    /* compiled from: ProfileOutFriendRequestsView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ProfileOutFriendRequestsView> {
        public OnHideProgressViewCommand(ProfileOutFriendRequestsView$$State profileOutFriendRequestsView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileOutFriendRequestsView profileOutFriendRequestsView) {
            profileOutFriendRequestsView.mo14911a();
        }
    }

    /* compiled from: ProfileOutFriendRequestsView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<ProfileOutFriendRequestsView> {
        public OnHideRefreshViewCommand(ProfileOutFriendRequestsView$$State profileOutFriendRequestsView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileOutFriendRequestsView profileOutFriendRequestsView) {
            profileOutFriendRequestsView.mo14915e();
        }
    }

    /* compiled from: ProfileOutFriendRequestsView$$State.java */
    public class OnProfileCommand extends ViewCommand<ProfileOutFriendRequestsView> {

        /* renamed from: a */
        public final long f26786a;

        public OnProfileCommand(ProfileOutFriendRequestsView$$State profileOutFriendRequestsView$$State, long j2) {
            super("onProfile", OneExecutionStateStrategy.class);
            this.f26786a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileOutFriendRequestsView profileOutFriendRequestsView) {
            profileOutFriendRequestsView.mo14916f(this.f26786a);
        }
    }

    /* compiled from: ProfileOutFriendRequestsView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ProfileOutFriendRequestsView> {
        public OnShowProgressViewCommand(ProfileOutFriendRequestsView$$State profileOutFriendRequestsView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileOutFriendRequestsView profileOutFriendRequestsView) {
            profileOutFriendRequestsView.mo14912b();
        }
    }

    /* compiled from: ProfileOutFriendRequestsView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<ProfileOutFriendRequestsView> {
        public OnShowRefreshViewCommand(ProfileOutFriendRequestsView$$State profileOutFriendRequestsView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileOutFriendRequestsView profileOutFriendRequestsView) {
            profileOutFriendRequestsView.mo14914d();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileOutFriendRequestsView
    /* renamed from: W3 */
    public void mo14910W3() {
        OnCancelFriendRequestCommand onCancelFriendRequestCommand = new OnCancelFriendRequestCommand(this);
        this.viewCommands.beforeApply(onCancelFriendRequestCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileOutFriendRequestsView) it.next()).mo14910W3();
        }
        this.viewCommands.afterApply(onCancelFriendRequestCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileOutFriendRequestsView
    /* renamed from: a */
    public void mo14911a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileOutFriendRequestsView) it.next()).mo14911a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileOutFriendRequestsView
    /* renamed from: b */
    public void mo14912b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileOutFriendRequestsView) it.next()).mo14912b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileOutFriendRequestsView
    /* renamed from: c */
    public void mo14913c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileOutFriendRequestsView) it.next()).mo14913c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileOutFriendRequestsView
    /* renamed from: d */
    public void mo14914d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileOutFriendRequestsView) it.next()).mo14914d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileOutFriendRequestsView
    /* renamed from: e */
    public void mo14915e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileOutFriendRequestsView) it.next()).mo14915e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileOutFriendRequestsView
    /* renamed from: f */
    public void mo14916f(long j2) {
        OnProfileCommand onProfileCommand = new OnProfileCommand(this, j2);
        this.viewCommands.beforeApply(onProfileCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileOutFriendRequestsView) it.next()).mo14916f(j2);
        }
        this.viewCommands.afterApply(onProfileCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileOutFriendRequestsView
    /* renamed from: s0 */
    public void mo14917s0() {
        OnCancelFriendRequestFailedCommand onCancelFriendRequestFailedCommand = new OnCancelFriendRequestFailedCommand(this);
        this.viewCommands.beforeApply(onCancelFriendRequestFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileOutFriendRequestsView) it.next()).mo14917s0();
        }
        this.viewCommands.afterApply(onCancelFriendRequestFailedCommand);
    }
}
