package com.swiftsoft.anixartd.presentation.main.profile;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ProfileSocialView$$State extends MvpViewState<ProfileSocialView> implements ProfileSocialView {

    /* compiled from: ProfileSocialView$$State.java */
    public class OnChangedCommand extends ViewCommand<ProfileSocialView> {
        public OnChangedCommand(ProfileSocialView$$State profileSocialView$$State) {
            super("onChanged", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileSocialView profileSocialView) {
            profileSocialView.mo14838b3();
        }
    }

    /* compiled from: ProfileSocialView$$State.java */
    public class OnDiscordInvalidCommand extends ViewCommand<ProfileSocialView> {
        public OnDiscordInvalidCommand(ProfileSocialView$$State profileSocialView$$State) {
            super("onDiscordInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileSocialView profileSocialView) {
            profileSocialView.mo14840h3();
        }
    }

    /* compiled from: ProfileSocialView$$State.java */
    public class OnFailedCommand extends ViewCommand<ProfileSocialView> {
        public OnFailedCommand(ProfileSocialView$$State profileSocialView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileSocialView profileSocialView) {
            profileSocialView.mo14839c();
        }
    }

    /* compiled from: ProfileSocialView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ProfileSocialView> {
        public OnHideProgressViewCommand(ProfileSocialView$$State profileSocialView$$State) {
            super("onHideProgressView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileSocialView profileSocialView) {
            profileSocialView.mo14836a();
        }
    }

    /* compiled from: ProfileSocialView$$State.java */
    public class OnInstInvalidCommand extends ViewCommand<ProfileSocialView> {
        public OnInstInvalidCommand(ProfileSocialView$$State profileSocialView$$State) {
            super("onInstInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileSocialView profileSocialView) {
            profileSocialView.mo14833P1();
        }
    }

    /* compiled from: ProfileSocialView$$State.java */
    public class OnLoadedCommand extends ViewCommand<ProfileSocialView> {
        public OnLoadedCommand(ProfileSocialView$$State profileSocialView$$State) {
            super("onLoaded", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileSocialView profileSocialView) {
            profileSocialView.mo14832O();
        }
    }

    /* compiled from: ProfileSocialView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ProfileSocialView> {
        public OnShowProgressViewCommand(ProfileSocialView$$State profileSocialView$$State) {
            super("onShowProgressView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileSocialView profileSocialView) {
            profileSocialView.mo14837b();
        }
    }

    /* compiled from: ProfileSocialView$$State.java */
    public class OnTgInvalidCommand extends ViewCommand<ProfileSocialView> {
        public OnTgInvalidCommand(ProfileSocialView$$State profileSocialView$$State) {
            super("onTgInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileSocialView profileSocialView) {
            profileSocialView.mo14831J3();
        }
    }

    /* compiled from: ProfileSocialView$$State.java */
    public class OnTtInvalidCommand extends ViewCommand<ProfileSocialView> {
        public OnTtInvalidCommand(ProfileSocialView$$State profileSocialView$$State) {
            super("onTtInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileSocialView profileSocialView) {
            profileSocialView.mo14834W2();
        }
    }

    /* compiled from: ProfileSocialView$$State.java */
    public class OnVkInvalidCommand extends ViewCommand<ProfileSocialView> {
        public OnVkInvalidCommand(ProfileSocialView$$State profileSocialView$$State) {
            super("onVkInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileSocialView profileSocialView) {
            profileSocialView.mo14835X1();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialView
    /* renamed from: J3 */
    public void mo14831J3() {
        OnTgInvalidCommand onTgInvalidCommand = new OnTgInvalidCommand(this);
        this.viewCommands.beforeApply(onTgInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileSocialView) it.next()).mo14831J3();
        }
        this.viewCommands.afterApply(onTgInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialView
    /* renamed from: O */
    public void mo14832O() {
        OnLoadedCommand onLoadedCommand = new OnLoadedCommand(this);
        this.viewCommands.beforeApply(onLoadedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileSocialView) it.next()).mo14832O();
        }
        this.viewCommands.afterApply(onLoadedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialView
    /* renamed from: P1 */
    public void mo14833P1() {
        OnInstInvalidCommand onInstInvalidCommand = new OnInstInvalidCommand(this);
        this.viewCommands.beforeApply(onInstInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileSocialView) it.next()).mo14833P1();
        }
        this.viewCommands.afterApply(onInstInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialView
    /* renamed from: W2 */
    public void mo14834W2() {
        OnTtInvalidCommand onTtInvalidCommand = new OnTtInvalidCommand(this);
        this.viewCommands.beforeApply(onTtInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileSocialView) it.next()).mo14834W2();
        }
        this.viewCommands.afterApply(onTtInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialView
    /* renamed from: X1 */
    public void mo14835X1() {
        OnVkInvalidCommand onVkInvalidCommand = new OnVkInvalidCommand(this);
        this.viewCommands.beforeApply(onVkInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileSocialView) it.next()).mo14835X1();
        }
        this.viewCommands.afterApply(onVkInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialView
    /* renamed from: a */
    public void mo14836a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileSocialView) it.next()).mo14836a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialView
    /* renamed from: b */
    public void mo14837b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileSocialView) it.next()).mo14837b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialView
    /* renamed from: b3 */
    public void mo14838b3() {
        OnChangedCommand onChangedCommand = new OnChangedCommand(this);
        this.viewCommands.beforeApply(onChangedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileSocialView) it.next()).mo14838b3();
        }
        this.viewCommands.afterApply(onChangedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialView
    /* renamed from: c */
    public void mo14839c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileSocialView) it.next()).mo14839c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialView
    /* renamed from: h3 */
    public void mo14840h3() {
        OnDiscordInvalidCommand onDiscordInvalidCommand = new OnDiscordInvalidCommand(this);
        this.viewCommands.beforeApply(onDiscordInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileSocialView) it.next()).mo14840h3();
        }
        this.viewCommands.afterApply(onDiscordInvalidCommand);
    }
}
