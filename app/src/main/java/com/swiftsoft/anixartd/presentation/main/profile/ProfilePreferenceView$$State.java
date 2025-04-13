package com.swiftsoft.anixartd.presentation.main.profile;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ProfilePreferenceView$$State extends MvpViewState<ProfilePreferenceView> implements ProfilePreferenceView {

    /* compiled from: ProfilePreferenceView$$State.java */
    public class OnCurrentEmailIncorrectCommand extends ViewCommand<ProfilePreferenceView> {
        public OnCurrentEmailIncorrectCommand(ProfilePreferenceView$$State profilePreferenceView$$State) {
            super("onCurrentEmailIncorrect", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfilePreferenceView profilePreferenceView) {
            profilePreferenceView.mo14808U3();
        }
    }

    /* compiled from: ProfilePreferenceView$$State.java */
    public class OnCurrentPasswordIncorrectCommand extends ViewCommand<ProfilePreferenceView> {
        public OnCurrentPasswordIncorrectCommand(ProfilePreferenceView$$State profilePreferenceView$$State) {
            super("onCurrentPasswordIncorrect", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfilePreferenceView profilePreferenceView) {
            profilePreferenceView.mo14806Q3();
        }
    }

    /* compiled from: ProfilePreferenceView$$State.java */
    public class OnEmailAlreadyTakenCommand extends ViewCommand<ProfilePreferenceView> {
        public OnEmailAlreadyTakenCommand(ProfilePreferenceView$$State profilePreferenceView$$State) {
            super("onEmailAlreadyTaken", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfilePreferenceView profilePreferenceView) {
            profilePreferenceView.mo14802C();
        }
    }

    /* compiled from: ProfilePreferenceView$$State.java */
    public class OnEmailChangeConfirmedCommand extends ViewCommand<ProfilePreferenceView> {

        /* renamed from: a */
        public final String f26626a;

        /* renamed from: b */
        public final String f26627b;

        public OnEmailChangeConfirmedCommand(ProfilePreferenceView$$State profilePreferenceView$$State, String str, String str2) {
            super("onEmailChangeConfirmed", OneExecutionStateStrategy.class);
            this.f26626a = str;
            this.f26627b = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfilePreferenceView profilePreferenceView) {
            profilePreferenceView.mo14803D2(this.f26626a, this.f26627b);
        }
    }

    /* compiled from: ProfilePreferenceView$$State.java */
    public class OnEmailChangedCommand extends ViewCommand<ProfilePreferenceView> {
        public OnEmailChangedCommand(ProfilePreferenceView$$State profilePreferenceView$$State) {
            super("onEmailChanged", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfilePreferenceView profilePreferenceView) {
            profilePreferenceView.mo14804D3();
        }
    }

    /* compiled from: ProfilePreferenceView$$State.java */
    public class OnEmailInvalidCommand extends ViewCommand<ProfilePreferenceView> {
        public OnEmailInvalidCommand(ProfilePreferenceView$$State profilePreferenceView$$State) {
            super("onEmailInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfilePreferenceView profilePreferenceView) {
            profilePreferenceView.mo14817w();
        }
    }

    /* compiled from: ProfilePreferenceView$$State.java */
    public class OnFailedCommand extends ViewCommand<ProfilePreferenceView> {
        public OnFailedCommand(ProfilePreferenceView$$State profilePreferenceView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfilePreferenceView profilePreferenceView) {
            profilePreferenceView.mo14811c();
        }
    }

    /* compiled from: ProfilePreferenceView$$State.java */
    public class OnForgotPasswordCommand extends ViewCommand<ProfilePreferenceView> {
        public OnForgotPasswordCommand(ProfilePreferenceView$$State profilePreferenceView$$State) {
            super("onForgotPassword", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfilePreferenceView profilePreferenceView) {
            profilePreferenceView.mo14813h1();
        }
    }

    /* compiled from: ProfilePreferenceView$$State.java */
    public class OnHideLoadingViewCommand extends ViewCommand<ProfilePreferenceView> {
        public OnHideLoadingViewCommand(ProfilePreferenceView$$State profilePreferenceView$$State) {
            super("onHideLoadingView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfilePreferenceView profilePreferenceView) {
            profilePreferenceView.mo14814j();
        }
    }

    /* compiled from: ProfilePreferenceView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ProfilePreferenceView> {
        public OnHideProgressViewCommand(ProfilePreferenceView$$State profilePreferenceView$$State) {
            super("onHideProgressView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfilePreferenceView profilePreferenceView) {
            profilePreferenceView.mo14809a();
        }
    }

    /* compiled from: ProfilePreferenceView$$State.java */
    public class OnNewPasswordIncorrectCommand extends ViewCommand<ProfilePreferenceView> {
        public OnNewPasswordIncorrectCommand(ProfilePreferenceView$$State profilePreferenceView$$State) {
            super("onNewPasswordIncorrect", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfilePreferenceView profilePreferenceView) {
            profilePreferenceView.mo14816u2();
        }
    }

    /* compiled from: ProfilePreferenceView$$State.java */
    public class OnPasswordChangedCommand extends ViewCommand<ProfilePreferenceView> {
        public OnPasswordChangedCommand(ProfilePreferenceView$$State profilePreferenceView$$State) {
            super("onPasswordChanged", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfilePreferenceView profilePreferenceView) {
            profilePreferenceView.mo14805L2();
        }
    }

    /* compiled from: ProfilePreferenceView$$State.java */
    public class OnPasswordInvalidCommand extends ViewCommand<ProfilePreferenceView> {
        public OnPasswordInvalidCommand(ProfilePreferenceView$$State profilePreferenceView$$State) {
            super("onPasswordInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfilePreferenceView profilePreferenceView) {
            profilePreferenceView.mo14818z();
        }
    }

    /* compiled from: ProfilePreferenceView$$State.java */
    public class OnPasswordNotMatchCommand extends ViewCommand<ProfilePreferenceView> {
        public OnPasswordNotMatchCommand(ProfilePreferenceView$$State profilePreferenceView$$State) {
            super("onPasswordNotMatch", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfilePreferenceView profilePreferenceView) {
            profilePreferenceView.mo14807S();
        }
    }

    /* compiled from: ProfilePreferenceView$$State.java */
    public class OnSettingsLoadedCommand extends ViewCommand<ProfilePreferenceView> {

        /* renamed from: a */
        public final String f26628a;

        /* renamed from: b */
        public final String f26629b;

        /* renamed from: c */
        public final int f26630c;

        /* renamed from: d */
        public final int f26631d;

        /* renamed from: e */
        public final int f26632e;

        /* renamed from: f */
        public final int f26633f;

        /* renamed from: g */
        public final boolean f26634g;

        /* renamed from: h */
        public final boolean f26635h;

        public OnSettingsLoadedCommand(ProfilePreferenceView$$State profilePreferenceView$$State, String str, String str2, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
            super("onSettingsLoaded", OneExecutionStateStrategy.class);
            this.f26628a = str;
            this.f26629b = str2;
            this.f26630c = i2;
            this.f26631d = i3;
            this.f26632e = i4;
            this.f26633f = i5;
            this.f26634g = z;
            this.f26635h = z2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfilePreferenceView profilePreferenceView) {
            profilePreferenceView.mo14815j1(this.f26628a, this.f26629b, this.f26630c, this.f26631d, this.f26632e, this.f26633f, this.f26634g, this.f26635h);
        }
    }

    /* compiled from: ProfilePreferenceView$$State.java */
    public class OnShowLoadingViewCommand extends ViewCommand<ProfilePreferenceView> {
        public OnShowLoadingViewCommand(ProfilePreferenceView$$State profilePreferenceView$$State) {
            super("onShowLoadingView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfilePreferenceView profilePreferenceView) {
            profilePreferenceView.mo14812h();
        }
    }

    /* compiled from: ProfilePreferenceView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ProfilePreferenceView> {
        public OnShowProgressViewCommand(ProfilePreferenceView$$State profilePreferenceView$$State) {
            super("onShowProgressView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfilePreferenceView profilePreferenceView) {
            profilePreferenceView.mo14810b();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: C */
    public void mo14802C() {
        OnEmailAlreadyTakenCommand onEmailAlreadyTakenCommand = new OnEmailAlreadyTakenCommand(this);
        this.viewCommands.beforeApply(onEmailAlreadyTakenCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfilePreferenceView) it.next()).mo14802C();
        }
        this.viewCommands.afterApply(onEmailAlreadyTakenCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: D2 */
    public void mo14803D2(String str, String str2) {
        OnEmailChangeConfirmedCommand onEmailChangeConfirmedCommand = new OnEmailChangeConfirmedCommand(this, str, str2);
        this.viewCommands.beforeApply(onEmailChangeConfirmedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfilePreferenceView) it.next()).mo14803D2(str, str2);
        }
        this.viewCommands.afterApply(onEmailChangeConfirmedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: D3 */
    public void mo14804D3() {
        OnEmailChangedCommand onEmailChangedCommand = new OnEmailChangedCommand(this);
        this.viewCommands.beforeApply(onEmailChangedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfilePreferenceView) it.next()).mo14804D3();
        }
        this.viewCommands.afterApply(onEmailChangedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: L2 */
    public void mo14805L2() {
        OnPasswordChangedCommand onPasswordChangedCommand = new OnPasswordChangedCommand(this);
        this.viewCommands.beforeApply(onPasswordChangedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfilePreferenceView) it.next()).mo14805L2();
        }
        this.viewCommands.afterApply(onPasswordChangedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: Q3 */
    public void mo14806Q3() {
        OnCurrentPasswordIncorrectCommand onCurrentPasswordIncorrectCommand = new OnCurrentPasswordIncorrectCommand(this);
        this.viewCommands.beforeApply(onCurrentPasswordIncorrectCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfilePreferenceView) it.next()).mo14806Q3();
        }
        this.viewCommands.afterApply(onCurrentPasswordIncorrectCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: S */
    public void mo14807S() {
        OnPasswordNotMatchCommand onPasswordNotMatchCommand = new OnPasswordNotMatchCommand(this);
        this.viewCommands.beforeApply(onPasswordNotMatchCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfilePreferenceView) it.next()).mo14807S();
        }
        this.viewCommands.afterApply(onPasswordNotMatchCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: U3 */
    public void mo14808U3() {
        OnCurrentEmailIncorrectCommand onCurrentEmailIncorrectCommand = new OnCurrentEmailIncorrectCommand(this);
        this.viewCommands.beforeApply(onCurrentEmailIncorrectCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfilePreferenceView) it.next()).mo14808U3();
        }
        this.viewCommands.afterApply(onCurrentEmailIncorrectCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: a */
    public void mo14809a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfilePreferenceView) it.next()).mo14809a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: b */
    public void mo14810b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfilePreferenceView) it.next()).mo14810b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: c */
    public void mo14811c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfilePreferenceView) it.next()).mo14811c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: h */
    public void mo14812h() {
        OnShowLoadingViewCommand onShowLoadingViewCommand = new OnShowLoadingViewCommand(this);
        this.viewCommands.beforeApply(onShowLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfilePreferenceView) it.next()).mo14812h();
        }
        this.viewCommands.afterApply(onShowLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: h1 */
    public void mo14813h1() {
        OnForgotPasswordCommand onForgotPasswordCommand = new OnForgotPasswordCommand(this);
        this.viewCommands.beforeApply(onForgotPasswordCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfilePreferenceView) it.next()).mo14813h1();
        }
        this.viewCommands.afterApply(onForgotPasswordCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: j */
    public void mo14814j() {
        OnHideLoadingViewCommand onHideLoadingViewCommand = new OnHideLoadingViewCommand(this);
        this.viewCommands.beforeApply(onHideLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfilePreferenceView) it.next()).mo14814j();
        }
        this.viewCommands.afterApply(onHideLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: j1 */
    public void mo14815j1(String str, String str2, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        OnSettingsLoadedCommand onSettingsLoadedCommand = new OnSettingsLoadedCommand(this, str, str2, i2, i3, i4, i5, z, z2);
        this.viewCommands.beforeApply(onSettingsLoadedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfilePreferenceView) it.next()).mo14815j1(str, str2, i2, i3, i4, i5, z, z2);
        }
        this.viewCommands.afterApply(onSettingsLoadedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: u2 */
    public void mo14816u2() {
        OnNewPasswordIncorrectCommand onNewPasswordIncorrectCommand = new OnNewPasswordIncorrectCommand(this);
        this.viewCommands.beforeApply(onNewPasswordIncorrectCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfilePreferenceView) it.next()).mo14816u2();
        }
        this.viewCommands.afterApply(onNewPasswordIncorrectCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: w */
    public void mo14817w() {
        OnEmailInvalidCommand onEmailInvalidCommand = new OnEmailInvalidCommand(this);
        this.viewCommands.beforeApply(onEmailInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfilePreferenceView) it.next()).mo14817w();
        }
        this.viewCommands.afterApply(onEmailInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: z */
    public void mo14818z() {
        OnPasswordInvalidCommand onPasswordInvalidCommand = new OnPasswordInvalidCommand(this);
        this.viewCommands.beforeApply(onPasswordInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfilePreferenceView) it.next()).mo14818z();
        }
        this.viewCommands.afterApply(onPasswordInvalidCommand);
    }
}
