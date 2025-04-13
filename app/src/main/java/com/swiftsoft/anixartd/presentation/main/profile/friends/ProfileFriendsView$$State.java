package com.swiftsoft.anixartd.presentation.main.profile.friends;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ProfileFriendsView$$State extends MvpViewState<ProfileFriendsView> implements ProfileFriendsView {

    /* compiled from: ProfileFriendsView$$State.java */
    public class OnAcceptFriendRequestFailedCommand extends ViewCommand<ProfileFriendsView> {
        public OnAcceptFriendRequestFailedCommand(ProfileFriendsView$$State profileFriendsView$$State) {
            super("onAcceptFriendRequestFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileFriendsView profileFriendsView) {
            profileFriendsView.mo14897H0();
        }
    }

    /* compiled from: ProfileFriendsView$$State.java */
    public class OnCancelFriendRequestFailedCommand extends ViewCommand<ProfileFriendsView> {
        public OnCancelFriendRequestFailedCommand(ProfileFriendsView$$State profileFriendsView$$State) {
            super("onCancelFriendRequestFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileFriendsView profileFriendsView) {
            profileFriendsView.mo14905s0();
        }
    }

    /* compiled from: ProfileFriendsView$$State.java */
    public class OnFailedCommand extends ViewCommand<ProfileFriendsView> {
        public OnFailedCommand(ProfileFriendsView$$State profileFriendsView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileFriendsView profileFriendsView) {
            profileFriendsView.mo14900c();
        }
    }

    /* compiled from: ProfileFriendsView$$State.java */
    public class OnFriendRequestsCommand extends ViewCommand<ProfileFriendsView> {
        public OnFriendRequestsCommand(ProfileFriendsView$$State profileFriendsView$$State) {
            super("onFriendRequests", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileFriendsView profileFriendsView) {
            profileFriendsView.mo14904f2();
        }
    }

    /* compiled from: ProfileFriendsView$$State.java */
    public class OnHideFriendRequestFailedCommand extends ViewCommand<ProfileFriendsView> {
        public OnHideFriendRequestFailedCommand(ProfileFriendsView$$State profileFriendsView$$State) {
            super("onHideFriendRequestFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileFriendsView profileFriendsView) {
            profileFriendsView.mo14896C0();
        }
    }

    /* compiled from: ProfileFriendsView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ProfileFriendsView> {
        public OnHideProgressViewCommand(ProfileFriendsView$$State profileFriendsView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileFriendsView profileFriendsView) {
            profileFriendsView.mo14898a();
        }
    }

    /* compiled from: ProfileFriendsView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<ProfileFriendsView> {
        public OnHideRefreshViewCommand(ProfileFriendsView$$State profileFriendsView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileFriendsView profileFriendsView) {
            profileFriendsView.mo14902e();
        }
    }

    /* compiled from: ProfileFriendsView$$State.java */
    public class OnNotSocialCommand extends ViewCommand<ProfileFriendsView> {
        public OnNotSocialCommand(ProfileFriendsView$$State profileFriendsView$$State) {
            super("onNotSocial", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileFriendsView profileFriendsView) {
            profileFriendsView.mo14895B3();
        }
    }

    /* compiled from: ProfileFriendsView$$State.java */
    public class OnOutFriendRequestsCommand extends ViewCommand<ProfileFriendsView> {
        public OnOutFriendRequestsCommand(ProfileFriendsView$$State profileFriendsView$$State) {
            super("onOutFriendRequests", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileFriendsView profileFriendsView) {
            profileFriendsView.mo14906z2();
        }
    }

    /* compiled from: ProfileFriendsView$$State.java */
    public class OnProfileCommand extends ViewCommand<ProfileFriendsView> {

        /* renamed from: a */
        public final long f26771a;

        public OnProfileCommand(ProfileFriendsView$$State profileFriendsView$$State, long j2) {
            super("onProfile", OneExecutionStateStrategy.class);
            this.f26771a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileFriendsView profileFriendsView) {
            profileFriendsView.mo14903f(this.f26771a);
        }
    }

    /* compiled from: ProfileFriendsView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ProfileFriendsView> {
        public OnShowProgressViewCommand(ProfileFriendsView$$State profileFriendsView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileFriendsView profileFriendsView) {
            profileFriendsView.mo14899b();
        }
    }

    /* compiled from: ProfileFriendsView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<ProfileFriendsView> {
        public OnShowRefreshViewCommand(ProfileFriendsView$$State profileFriendsView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileFriendsView profileFriendsView) {
            profileFriendsView.mo14901d();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsView
    /* renamed from: B3 */
    public void mo14895B3() {
        OnNotSocialCommand onNotSocialCommand = new OnNotSocialCommand(this);
        this.viewCommands.beforeApply(onNotSocialCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileFriendsView) it.next()).mo14895B3();
        }
        this.viewCommands.afterApply(onNotSocialCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsView
    /* renamed from: C0 */
    public void mo14896C0() {
        OnHideFriendRequestFailedCommand onHideFriendRequestFailedCommand = new OnHideFriendRequestFailedCommand(this);
        this.viewCommands.beforeApply(onHideFriendRequestFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileFriendsView) it.next()).mo14896C0();
        }
        this.viewCommands.afterApply(onHideFriendRequestFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsView
    /* renamed from: H0 */
    public void mo14897H0() {
        OnAcceptFriendRequestFailedCommand onAcceptFriendRequestFailedCommand = new OnAcceptFriendRequestFailedCommand(this);
        this.viewCommands.beforeApply(onAcceptFriendRequestFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileFriendsView) it.next()).mo14897H0();
        }
        this.viewCommands.afterApply(onAcceptFriendRequestFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsView
    /* renamed from: a */
    public void mo14898a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileFriendsView) it.next()).mo14898a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsView
    /* renamed from: b */
    public void mo14899b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileFriendsView) it.next()).mo14899b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsView
    /* renamed from: c */
    public void mo14900c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileFriendsView) it.next()).mo14900c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsView
    /* renamed from: d */
    public void mo14901d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileFriendsView) it.next()).mo14901d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsView
    /* renamed from: e */
    public void mo14902e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileFriendsView) it.next()).mo14902e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsView
    /* renamed from: f */
    public void mo14903f(long j2) {
        OnProfileCommand onProfileCommand = new OnProfileCommand(this, j2);
        this.viewCommands.beforeApply(onProfileCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileFriendsView) it.next()).mo14903f(j2);
        }
        this.viewCommands.afterApply(onProfileCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsView
    /* renamed from: f2 */
    public void mo14904f2() {
        OnFriendRequestsCommand onFriendRequestsCommand = new OnFriendRequestsCommand(this);
        this.viewCommands.beforeApply(onFriendRequestsCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileFriendsView) it.next()).mo14904f2();
        }
        this.viewCommands.afterApply(onFriendRequestsCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsView
    /* renamed from: s0 */
    public void mo14905s0() {
        OnCancelFriendRequestFailedCommand onCancelFriendRequestFailedCommand = new OnCancelFriendRequestFailedCommand(this);
        this.viewCommands.beforeApply(onCancelFriendRequestFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileFriendsView) it.next()).mo14905s0();
        }
        this.viewCommands.afterApply(onCancelFriendRequestFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendsView
    /* renamed from: z2 */
    public void mo14906z2() {
        OnOutFriendRequestsCommand onOutFriendRequestsCommand = new OnOutFriendRequestsCommand(this);
        this.viewCommands.beforeApply(onOutFriendRequestsCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileFriendsView) it.next()).mo14906z2();
        }
        this.viewCommands.afterApply(onOutFriendRequestsCommand);
    }
}
