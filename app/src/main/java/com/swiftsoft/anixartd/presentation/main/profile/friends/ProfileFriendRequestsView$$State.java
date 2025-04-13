package com.swiftsoft.anixartd.presentation.main.profile.friends;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ProfileFriendRequestsView$$State extends MvpViewState<ProfileFriendRequestsView> implements ProfileFriendRequestsView {

    /* compiled from: ProfileFriendRequestsView$$State.java */
    public class OnAcceptFriendRequestCommand extends ViewCommand<ProfileFriendRequestsView> {
        public OnAcceptFriendRequestCommand(ProfileFriendRequestsView$$State profileFriendRequestsView$$State) {
            super("onAcceptFriendRequest", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileFriendRequestsView profileFriendRequestsView) {
            profileFriendRequestsView.mo14883a2();
        }
    }

    /* compiled from: ProfileFriendRequestsView$$State.java */
    public class OnAcceptFriendRequestFailedCommand extends ViewCommand<ProfileFriendRequestsView> {
        public OnAcceptFriendRequestFailedCommand(ProfileFriendRequestsView$$State profileFriendRequestsView$$State) {
            super("onAcceptFriendRequestFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileFriendRequestsView profileFriendRequestsView) {
            profileFriendRequestsView.mo14881H0();
        }
    }

    /* compiled from: ProfileFriendRequestsView$$State.java */
    public class OnFailedCommand extends ViewCommand<ProfileFriendRequestsView> {
        public OnFailedCommand(ProfileFriendRequestsView$$State profileFriendRequestsView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileFriendRequestsView profileFriendRequestsView) {
            profileFriendRequestsView.mo14885c();
        }
    }

    /* compiled from: ProfileFriendRequestsView$$State.java */
    public class OnHideFriendRequestCommand extends ViewCommand<ProfileFriendRequestsView> {
        public OnHideFriendRequestCommand(ProfileFriendRequestsView$$State profileFriendRequestsView$$State) {
            super("onHideFriendRequest", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileFriendRequestsView profileFriendRequestsView) {
            profileFriendRequestsView.mo14889g2();
        }
    }

    /* compiled from: ProfileFriendRequestsView$$State.java */
    public class OnHideFriendRequestFailedCommand extends ViewCommand<ProfileFriendRequestsView> {
        public OnHideFriendRequestFailedCommand(ProfileFriendRequestsView$$State profileFriendRequestsView$$State) {
            super("onHideFriendRequestFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileFriendRequestsView profileFriendRequestsView) {
            profileFriendRequestsView.mo14880C0();
        }
    }

    /* compiled from: ProfileFriendRequestsView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ProfileFriendRequestsView> {
        public OnHideProgressViewCommand(ProfileFriendRequestsView$$State profileFriendRequestsView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileFriendRequestsView profileFriendRequestsView) {
            profileFriendRequestsView.mo14882a();
        }
    }

    /* compiled from: ProfileFriendRequestsView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<ProfileFriendRequestsView> {
        public OnHideRefreshViewCommand(ProfileFriendRequestsView$$State profileFriendRequestsView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileFriendRequestsView profileFriendRequestsView) {
            profileFriendRequestsView.mo14887e();
        }
    }

    /* compiled from: ProfileFriendRequestsView$$State.java */
    public class OnProfileCommand extends ViewCommand<ProfileFriendRequestsView> {

        /* renamed from: a */
        public final long f26744a;

        public OnProfileCommand(ProfileFriendRequestsView$$State profileFriendRequestsView$$State, long j2) {
            super("onProfile", OneExecutionStateStrategy.class);
            this.f26744a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileFriendRequestsView profileFriendRequestsView) {
            profileFriendRequestsView.mo14888f(this.f26744a);
        }
    }

    /* compiled from: ProfileFriendRequestsView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ProfileFriendRequestsView> {
        public OnShowProgressViewCommand(ProfileFriendRequestsView$$State profileFriendRequestsView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileFriendRequestsView profileFriendRequestsView) {
            profileFriendRequestsView.mo14884b();
        }
    }

    /* compiled from: ProfileFriendRequestsView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<ProfileFriendRequestsView> {
        public OnShowRefreshViewCommand(ProfileFriendRequestsView$$State profileFriendRequestsView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileFriendRequestsView profileFriendRequestsView) {
            profileFriendRequestsView.mo14886d();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsView
    /* renamed from: C0 */
    public void mo14880C0() {
        OnHideFriendRequestFailedCommand onHideFriendRequestFailedCommand = new OnHideFriendRequestFailedCommand(this);
        this.viewCommands.beforeApply(onHideFriendRequestFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileFriendRequestsView) it.next()).mo14880C0();
        }
        this.viewCommands.afterApply(onHideFriendRequestFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsView
    /* renamed from: H0 */
    public void mo14881H0() {
        OnAcceptFriendRequestFailedCommand onAcceptFriendRequestFailedCommand = new OnAcceptFriendRequestFailedCommand(this);
        this.viewCommands.beforeApply(onAcceptFriendRequestFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileFriendRequestsView) it.next()).mo14881H0();
        }
        this.viewCommands.afterApply(onAcceptFriendRequestFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsView
    /* renamed from: a */
    public void mo14882a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileFriendRequestsView) it.next()).mo14882a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsView
    /* renamed from: a2 */
    public void mo14883a2() {
        OnAcceptFriendRequestCommand onAcceptFriendRequestCommand = new OnAcceptFriendRequestCommand(this);
        this.viewCommands.beforeApply(onAcceptFriendRequestCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileFriendRequestsView) it.next()).mo14883a2();
        }
        this.viewCommands.afterApply(onAcceptFriendRequestCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsView
    /* renamed from: b */
    public void mo14884b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileFriendRequestsView) it.next()).mo14884b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsView
    /* renamed from: c */
    public void mo14885c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileFriendRequestsView) it.next()).mo14885c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsView
    /* renamed from: d */
    public void mo14886d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileFriendRequestsView) it.next()).mo14886d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsView
    /* renamed from: e */
    public void mo14887e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileFriendRequestsView) it.next()).mo14887e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsView
    /* renamed from: f */
    public void mo14888f(long j2) {
        OnProfileCommand onProfileCommand = new OnProfileCommand(this, j2);
        this.viewCommands.beforeApply(onProfileCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileFriendRequestsView) it.next()).mo14888f(j2);
        }
        this.viewCommands.afterApply(onProfileCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsView
    /* renamed from: g2 */
    public void mo14889g2() {
        OnHideFriendRequestCommand onHideFriendRequestCommand = new OnHideFriendRequestCommand(this);
        this.viewCommands.beforeApply(onHideFriendRequestCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileFriendRequestsView) it.next()).mo14889g2();
        }
        this.viewCommands.afterApply(onHideFriendRequestCommand);
    }
}
