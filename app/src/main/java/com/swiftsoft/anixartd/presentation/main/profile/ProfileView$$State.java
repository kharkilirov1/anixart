package com.swiftsoft.anixartd.presentation.main.profile;

import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.Release;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ProfileView$$State extends MvpViewState<ProfileView> implements ProfileView {

    /* compiled from: ProfileView$$State.java */
    public class OnBlockCommand extends ViewCommand<ProfileView> {
        public OnBlockCommand(ProfileView$$State profileView$$State) {
            super("onBlock", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileView profileView) {
            profileView.mo14845G2();
        }
    }

    /* compiled from: ProfileView$$State.java */
    public class OnBlockConfirmCommand extends ViewCommand<ProfileView> {
        public OnBlockConfirmCommand(ProfileView$$State profileView$$State) {
            super("onBlockConfirm", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileView profileView) {
            profileView.mo14846H2();
        }
    }

    /* compiled from: ProfileView$$State.java */
    public class OnBlockFailedCommand extends ViewCommand<ProfileView> {
        public OnBlockFailedCommand(ProfileView$$State profileView$$State) {
            super("onBlockFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileView profileView) {
            profileView.mo14857l4();
        }
    }

    /* compiled from: ProfileView$$State.java */
    public class OnDisableFriendButtonCommand extends ViewCommand<ProfileView> {
        public OnDisableFriendButtonCommand(ProfileView$$State profileView$$State) {
            super("onDisableFriendButton", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileView profileView) {
            profileView.mo14843F2();
        }
    }

    /* compiled from: ProfileView$$State.java */
    public class OnFailedCommand extends ViewCommand<ProfileView> {
        public OnFailedCommand(ProfileView$$State profileView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileView profileView) {
            profileView.mo14852c();
        }
    }

    /* compiled from: ProfileView$$State.java */
    public class OnFriendCommand extends ViewCommand<ProfileView> {
        public OnFriendCommand(ProfileView$$State profileView$$State) {
            super("onFriend", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileView profileView) {
            profileView.mo14849Y2();
        }
    }

    /* compiled from: ProfileView$$State.java */
    public class OnFriendFailedCommand extends ViewCommand<ProfileView> {
        public OnFriendFailedCommand(ProfileView$$State profileView$$State) {
            super("onFriendFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileView profileView) {
            profileView.mo14855g3();
        }
    }

    /* compiled from: ProfileView$$State.java */
    public class OnFriendLimitReachedCommand extends ViewCommand<ProfileView> {
        public OnFriendLimitReachedCommand(ProfileView$$State profileView$$State) {
            super("onFriendLimitReached", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileView profileView) {
            profileView.mo14847T3();
        }
    }

    /* compiled from: ProfileView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ProfileView> {
        public OnHideProgressViewCommand(ProfileView$$State profileView$$State) {
            super("onHideProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileView profileView) {
            profileView.mo14850a();
        }
    }

    /* compiled from: ProfileView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<ProfileView> {
        public OnHideRefreshViewCommand(ProfileView$$State profileView$$State) {
            super("onHideRefreshView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileView profileView) {
            profileView.mo14854e();
        }
    }

    /* compiled from: ProfileView$$State.java */
    public class OnPrepareViewCommand extends ViewCommand<ProfileView> {

        /* renamed from: a */
        public final boolean f26684a;

        /* renamed from: b */
        public final boolean f26685b;

        public OnPrepareViewCommand(ProfileView$$State profileView$$State, boolean z, boolean z2) {
            super("onPrepareView", AddToEndStrategy.class);
            this.f26684a = z;
            this.f26685b = z2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileView profileView) {
            profileView.mo14844G1(this.f26684a, this.f26685b);
        }
    }

    /* compiled from: ProfileView$$State.java */
    public class OnProfileCommand extends ViewCommand<ProfileView> {

        /* renamed from: a */
        public final Profile f26686a;

        /* renamed from: b */
        public final boolean f26687b;

        public OnProfileCommand(ProfileView$$State profileView$$State, Profile profile, boolean z) {
            super("onProfile", AddToEndStrategy.class);
            this.f26686a = profile;
            this.f26687b = z;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileView profileView) {
            profileView.mo14842D1(this.f26686a, this.f26687b);
        }
    }

    /* compiled from: ProfileView$$State.java */
    public class OnRecalculateCommand extends ViewCommand<ProfileView> {

        /* renamed from: a */
        public final int f26688a;

        /* renamed from: b */
        public final int f26689b;

        public OnRecalculateCommand(ProfileView$$State profileView$$State, int i2, int i3) {
            super("onRecalculate", OneExecutionStateStrategy.class);
            this.f26688a = i2;
            this.f26689b = i3;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileView profileView) {
            profileView.mo14858t3(this.f26688a, this.f26689b);
        }
    }

    /* compiled from: ProfileView$$State.java */
    public class OnReleaseCommand extends ViewCommand<ProfileView> {

        /* renamed from: a */
        public final Release f26690a;

        public OnReleaseCommand(ProfileView$$State profileView$$State, Release release) {
            super("onRelease", OneExecutionStateStrategy.class);
            this.f26690a = release;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileView profileView) {
            profileView.mo14856i(this.f26690a);
        }
    }

    /* compiled from: ProfileView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ProfileView> {
        public OnShowProgressViewCommand(ProfileView$$State profileView$$State) {
            super("onShowProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileView profileView) {
            profileView.mo14851b();
        }
    }

    /* compiled from: ProfileView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<ProfileView> {
        public OnShowRefreshViewCommand(ProfileView$$State profileView$$State) {
            super("onShowRefreshView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileView profileView) {
            profileView.mo14853d();
        }
    }

    /* compiled from: ProfileView$$State.java */
    public class OnTargetFriendLimitReachedCommand extends ViewCommand<ProfileView> {
        public OnTargetFriendLimitReachedCommand(ProfileView$$State profileView$$State) {
            super("onTargetFriendLimitReached", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileView profileView) {
            profileView.mo14848X3();
        }
    }

    /* compiled from: ProfileView$$State.java */
    public class OnUnblockCommand extends ViewCommand<ProfileView> {
        public OnUnblockCommand(ProfileView$$State profileView$$State) {
            super("onUnblock", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileView profileView) {
            profileView.mo14841A0();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: A0 */
    public void mo14841A0() {
        OnUnblockCommand onUnblockCommand = new OnUnblockCommand(this);
        this.viewCommands.beforeApply(onUnblockCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileView) it.next()).mo14841A0();
        }
        this.viewCommands.afterApply(onUnblockCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: D1 */
    public void mo14842D1(Profile profile, boolean z) {
        OnProfileCommand onProfileCommand = new OnProfileCommand(this, profile, z);
        this.viewCommands.beforeApply(onProfileCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileView) it.next()).mo14842D1(profile, z);
        }
        this.viewCommands.afterApply(onProfileCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: F2 */
    public void mo14843F2() {
        OnDisableFriendButtonCommand onDisableFriendButtonCommand = new OnDisableFriendButtonCommand(this);
        this.viewCommands.beforeApply(onDisableFriendButtonCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileView) it.next()).mo14843F2();
        }
        this.viewCommands.afterApply(onDisableFriendButtonCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: G1 */
    public void mo14844G1(boolean z, boolean z2) {
        OnPrepareViewCommand onPrepareViewCommand = new OnPrepareViewCommand(this, z, z2);
        this.viewCommands.beforeApply(onPrepareViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileView) it.next()).mo14844G1(z, z2);
        }
        this.viewCommands.afterApply(onPrepareViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: G2 */
    public void mo14845G2() {
        OnBlockCommand onBlockCommand = new OnBlockCommand(this);
        this.viewCommands.beforeApply(onBlockCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileView) it.next()).mo14845G2();
        }
        this.viewCommands.afterApply(onBlockCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: H2 */
    public void mo14846H2() {
        OnBlockConfirmCommand onBlockConfirmCommand = new OnBlockConfirmCommand(this);
        this.viewCommands.beforeApply(onBlockConfirmCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileView) it.next()).mo14846H2();
        }
        this.viewCommands.afterApply(onBlockConfirmCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: T3 */
    public void mo14847T3() {
        OnFriendLimitReachedCommand onFriendLimitReachedCommand = new OnFriendLimitReachedCommand(this);
        this.viewCommands.beforeApply(onFriendLimitReachedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileView) it.next()).mo14847T3();
        }
        this.viewCommands.afterApply(onFriendLimitReachedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: X3 */
    public void mo14848X3() {
        OnTargetFriendLimitReachedCommand onTargetFriendLimitReachedCommand = new OnTargetFriendLimitReachedCommand(this);
        this.viewCommands.beforeApply(onTargetFriendLimitReachedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileView) it.next()).mo14848X3();
        }
        this.viewCommands.afterApply(onTargetFriendLimitReachedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: Y2 */
    public void mo14849Y2() {
        OnFriendCommand onFriendCommand = new OnFriendCommand(this);
        this.viewCommands.beforeApply(onFriendCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileView) it.next()).mo14849Y2();
        }
        this.viewCommands.afterApply(onFriendCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: a */
    public void mo14850a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileView) it.next()).mo14850a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: b */
    public void mo14851b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileView) it.next()).mo14851b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: c */
    public void mo14852c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileView) it.next()).mo14852c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: d */
    public void mo14853d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileView) it.next()).mo14853d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: e */
    public void mo14854e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileView) it.next()).mo14854e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: g3 */
    public void mo14855g3() {
        OnFriendFailedCommand onFriendFailedCommand = new OnFriendFailedCommand(this);
        this.viewCommands.beforeApply(onFriendFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileView) it.next()).mo14855g3();
        }
        this.viewCommands.afterApply(onFriendFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: i */
    public void mo14856i(Release release) {
        OnReleaseCommand onReleaseCommand = new OnReleaseCommand(this, release);
        this.viewCommands.beforeApply(onReleaseCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileView) it.next()).mo14856i(release);
        }
        this.viewCommands.afterApply(onReleaseCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: l4 */
    public void mo14857l4() {
        OnBlockFailedCommand onBlockFailedCommand = new OnBlockFailedCommand(this);
        this.viewCommands.beforeApply(onBlockFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileView) it.next()).mo14857l4();
        }
        this.viewCommands.afterApply(onBlockFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: t3 */
    public void mo14858t3(int i2, int i3) {
        OnRecalculateCommand onRecalculateCommand = new OnRecalculateCommand(this, i2, i3);
        this.viewCommands.beforeApply(onRecalculateCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileView) it.next()).mo14858t3(i2, i3);
        }
        this.viewCommands.afterApply(onRecalculateCommand);
    }
}
