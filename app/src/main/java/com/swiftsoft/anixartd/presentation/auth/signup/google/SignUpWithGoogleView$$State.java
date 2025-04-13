package com.swiftsoft.anixartd.presentation.auth.signup.google;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class SignUpWithGoogleView$$State extends MvpViewState<SignUpWithGoogleView> implements SignUpWithGoogleView {

    /* compiled from: SignUpWithGoogleView$$State.java */
    public class OnCodeAlreadySentCommand extends ViewCommand<SignUpWithGoogleView> {
        public OnCodeAlreadySentCommand(SignUpWithGoogleView$$State signUpWithGoogleView$$State) {
            super("onCodeAlreadySent", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithGoogleView signUpWithGoogleView) {
            signUpWithGoogleView.mo14254I();
        }
    }

    /* compiled from: SignUpWithGoogleView$$State.java */
    public class OnConfirmCommand extends ViewCommand<SignUpWithGoogleView> {

        /* renamed from: a */
        public final String f25897a;

        /* renamed from: b */
        public final String f25898b;

        /* renamed from: c */
        public final String f25899c;

        /* renamed from: d */
        public final String f25900d;

        /* renamed from: e */
        public final long f25901e;

        public OnConfirmCommand(SignUpWithGoogleView$$State signUpWithGoogleView$$State, String str, String str2, String str3, String str4, long j2) {
            super("onConfirm", OneExecutionStateStrategy.class);
            this.f25897a = str;
            this.f25898b = str2;
            this.f25899c = str3;
            this.f25900d = str4;
            this.f25901e = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithGoogleView signUpWithGoogleView) {
            signUpWithGoogleView.mo14259R(this.f25897a, this.f25898b, this.f25899c, this.f25900d, this.f25901e);
        }
    }

    /* compiled from: SignUpWithGoogleView$$State.java */
    public class OnEmailAlreadyTakenCommand extends ViewCommand<SignUpWithGoogleView> {
        public OnEmailAlreadyTakenCommand(SignUpWithGoogleView$$State signUpWithGoogleView$$State) {
            super("onEmailAlreadyTaken", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithGoogleView signUpWithGoogleView) {
            signUpWithGoogleView.mo14253C();
        }
    }

    /* compiled from: SignUpWithGoogleView$$State.java */
    public class OnEmailEmptyCommand extends ViewCommand<SignUpWithGoogleView> {
        public OnEmailEmptyCommand(SignUpWithGoogleView$$State signUpWithGoogleView$$State) {
            super("onEmailEmpty", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithGoogleView signUpWithGoogleView) {
            signUpWithGoogleView.mo14260b0();
        }
    }

    /* compiled from: SignUpWithGoogleView$$State.java */
    public class OnEmailInvalidCommand extends ViewCommand<SignUpWithGoogleView> {
        public OnEmailInvalidCommand(SignUpWithGoogleView$$State signUpWithGoogleView$$State) {
            super("onEmailInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithGoogleView signUpWithGoogleView) {
            signUpWithGoogleView.mo14265w();
        }
    }

    /* compiled from: SignUpWithGoogleView$$State.java */
    public class OnEmailServiceDisallowedCommand extends ViewCommand<SignUpWithGoogleView> {
        public OnEmailServiceDisallowedCommand(SignUpWithGoogleView$$State signUpWithGoogleView$$State) {
            super("onEmailServiceDisallowed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithGoogleView signUpWithGoogleView) {
            signUpWithGoogleView.mo14258Q();
        }
    }

    /* compiled from: SignUpWithGoogleView$$State.java */
    public class OnHideLoadingViewCommand extends ViewCommand<SignUpWithGoogleView> {
        public OnHideLoadingViewCommand(SignUpWithGoogleView$$State signUpWithGoogleView$$State) {
            super("onHideLoadingView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithGoogleView signUpWithGoogleView) {
            signUpWithGoogleView.mo14262j();
        }
    }

    /* compiled from: SignUpWithGoogleView$$State.java */
    public class OnInvalidRequestCommand extends ViewCommand<SignUpWithGoogleView> {
        public OnInvalidRequestCommand(SignUpWithGoogleView$$State signUpWithGoogleView$$State) {
            super("onInvalidRequest", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithGoogleView signUpWithGoogleView) {
            signUpWithGoogleView.mo14257P();
        }
    }

    /* compiled from: SignUpWithGoogleView$$State.java */
    public class OnLoginAlreadyTakenCommand extends ViewCommand<SignUpWithGoogleView> {
        public OnLoginAlreadyTakenCommand(SignUpWithGoogleView$$State signUpWithGoogleView$$State) {
            super("onLoginAlreadyTaken", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithGoogleView signUpWithGoogleView) {
            signUpWithGoogleView.mo14266y();
        }
    }

    /* compiled from: SignUpWithGoogleView$$State.java */
    public class OnLoginEmptyCommand extends ViewCommand<SignUpWithGoogleView> {
        public OnLoginEmptyCommand(SignUpWithGoogleView$$State signUpWithGoogleView$$State) {
            super("onLoginEmpty", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithGoogleView signUpWithGoogleView) {
            signUpWithGoogleView.mo14256L();
        }
    }

    /* compiled from: SignUpWithGoogleView$$State.java */
    public class OnLoginInvalidCommand extends ViewCommand<SignUpWithGoogleView> {
        public OnLoginInvalidCommand(SignUpWithGoogleView$$State signUpWithGoogleView$$State) {
            super("onLoginInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithGoogleView signUpWithGoogleView) {
            signUpWithGoogleView.mo14263r();
        }
    }

    /* compiled from: SignUpWithGoogleView$$State.java */
    public class OnMainCommand extends ViewCommand<SignUpWithGoogleView> {
        public OnMainCommand(SignUpWithGoogleView$$State signUpWithGoogleView$$State) {
            super("onMain", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithGoogleView signUpWithGoogleView) {
            signUpWithGoogleView.mo14264t();
        }
    }

    /* compiled from: SignUpWithGoogleView$$State.java */
    public class OnShowLoadingViewCommand extends ViewCommand<SignUpWithGoogleView> {
        public OnShowLoadingViewCommand(SignUpWithGoogleView$$State signUpWithGoogleView$$State) {
            super("onShowLoadingView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithGoogleView signUpWithGoogleView) {
            signUpWithGoogleView.mo14261h();
        }
    }

    /* compiled from: SignUpWithGoogleView$$State.java */
    public class OnTooManyRegistrationsCommand extends ViewCommand<SignUpWithGoogleView> {
        public OnTooManyRegistrationsCommand(SignUpWithGoogleView$$State signUpWithGoogleView$$State) {
            super("onTooManyRegistrations", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithGoogleView signUpWithGoogleView) {
            signUpWithGoogleView.mo14255J();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: C */
    public void mo14253C() {
        OnEmailAlreadyTakenCommand onEmailAlreadyTakenCommand = new OnEmailAlreadyTakenCommand(this);
        this.viewCommands.beforeApply(onEmailAlreadyTakenCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithGoogleView) it.next()).mo14253C();
        }
        this.viewCommands.afterApply(onEmailAlreadyTakenCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: I */
    public void mo14254I() {
        OnCodeAlreadySentCommand onCodeAlreadySentCommand = new OnCodeAlreadySentCommand(this);
        this.viewCommands.beforeApply(onCodeAlreadySentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithGoogleView) it.next()).mo14254I();
        }
        this.viewCommands.afterApply(onCodeAlreadySentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: J */
    public void mo14255J() {
        OnTooManyRegistrationsCommand onTooManyRegistrationsCommand = new OnTooManyRegistrationsCommand(this);
        this.viewCommands.beforeApply(onTooManyRegistrationsCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithGoogleView) it.next()).mo14255J();
        }
        this.viewCommands.afterApply(onTooManyRegistrationsCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: L */
    public void mo14256L() {
        OnLoginEmptyCommand onLoginEmptyCommand = new OnLoginEmptyCommand(this);
        this.viewCommands.beforeApply(onLoginEmptyCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithGoogleView) it.next()).mo14256L();
        }
        this.viewCommands.afterApply(onLoginEmptyCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: P */
    public void mo14257P() {
        OnInvalidRequestCommand onInvalidRequestCommand = new OnInvalidRequestCommand(this);
        this.viewCommands.beforeApply(onInvalidRequestCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithGoogleView) it.next()).mo14257P();
        }
        this.viewCommands.afterApply(onInvalidRequestCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: Q */
    public void mo14258Q() {
        OnEmailServiceDisallowedCommand onEmailServiceDisallowedCommand = new OnEmailServiceDisallowedCommand(this);
        this.viewCommands.beforeApply(onEmailServiceDisallowedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithGoogleView) it.next()).mo14258Q();
        }
        this.viewCommands.afterApply(onEmailServiceDisallowedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: R */
    public void mo14259R(String str, String str2, String str3, String str4, long j2) {
        OnConfirmCommand onConfirmCommand = new OnConfirmCommand(this, str, str2, str3, str4, j2);
        this.viewCommands.beforeApply(onConfirmCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithGoogleView) it.next()).mo14259R(str, str2, str3, str4, j2);
        }
        this.viewCommands.afterApply(onConfirmCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: b0 */
    public void mo14260b0() {
        OnEmailEmptyCommand onEmailEmptyCommand = new OnEmailEmptyCommand(this);
        this.viewCommands.beforeApply(onEmailEmptyCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithGoogleView) it.next()).mo14260b0();
        }
        this.viewCommands.afterApply(onEmailEmptyCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: h */
    public void mo14261h() {
        OnShowLoadingViewCommand onShowLoadingViewCommand = new OnShowLoadingViewCommand(this);
        this.viewCommands.beforeApply(onShowLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithGoogleView) it.next()).mo14261h();
        }
        this.viewCommands.afterApply(onShowLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: j */
    public void mo14262j() {
        OnHideLoadingViewCommand onHideLoadingViewCommand = new OnHideLoadingViewCommand(this);
        this.viewCommands.beforeApply(onHideLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithGoogleView) it.next()).mo14262j();
        }
        this.viewCommands.afterApply(onHideLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: r */
    public void mo14263r() {
        OnLoginInvalidCommand onLoginInvalidCommand = new OnLoginInvalidCommand(this);
        this.viewCommands.beforeApply(onLoginInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithGoogleView) it.next()).mo14263r();
        }
        this.viewCommands.afterApply(onLoginInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: t */
    public void mo14264t() {
        OnMainCommand onMainCommand = new OnMainCommand(this);
        this.viewCommands.beforeApply(onMainCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithGoogleView) it.next()).mo14264t();
        }
        this.viewCommands.afterApply(onMainCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: w */
    public void mo14265w() {
        OnEmailInvalidCommand onEmailInvalidCommand = new OnEmailInvalidCommand(this);
        this.viewCommands.beforeApply(onEmailInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithGoogleView) it.next()).mo14265w();
        }
        this.viewCommands.afterApply(onEmailInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGoogleView
    /* renamed from: y */
    public void mo14266y() {
        OnLoginAlreadyTakenCommand onLoginAlreadyTakenCommand = new OnLoginAlreadyTakenCommand(this);
        this.viewCommands.beforeApply(onLoginAlreadyTakenCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithGoogleView) it.next()).mo14266y();
        }
        this.viewCommands.afterApply(onLoginAlreadyTakenCommand);
    }
}
