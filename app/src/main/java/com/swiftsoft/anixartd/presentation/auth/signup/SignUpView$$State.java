package com.swiftsoft.anixartd.presentation.auth.signup;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class SignUpView$$State extends MvpViewState<SignUpView> implements SignUpView {

    /* compiled from: SignUpView$$State.java */
    public class OnCodeAlreadySentCommand extends ViewCommand<SignUpView> {
        public OnCodeAlreadySentCommand(SignUpView$$State signUpView$$State) {
            super("onCodeAlreadySent", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpView signUpView) {
            signUpView.mo14237I();
        }
    }

    /* compiled from: SignUpView$$State.java */
    public class OnCodeCannotSendCommand extends ViewCommand<SignUpView> {
        public OnCodeCannotSendCommand(SignUpView$$State signUpView$$State) {
            super("onCodeCannotSend", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpView signUpView) {
            signUpView.mo14244Z0();
        }
    }

    /* compiled from: SignUpView$$State.java */
    public class OnConfirmCommand extends ViewCommand<SignUpView> {

        /* renamed from: a */
        public final String f25882a;

        /* renamed from: b */
        public final String f25883b;

        /* renamed from: c */
        public final String f25884c;

        /* renamed from: d */
        public final String f25885d;

        /* renamed from: e */
        public final long f25886e;

        public OnConfirmCommand(SignUpView$$State signUpView$$State, String str, String str2, String str3, String str4, long j2) {
            super("onConfirm", OneExecutionStateStrategy.class);
            this.f25882a = str;
            this.f25883b = str2;
            this.f25884c = str3;
            this.f25885d = str4;
            this.f25886e = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpView signUpView) {
            signUpView.mo14241R(this.f25882a, this.f25883b, this.f25884c, this.f25885d, this.f25886e);
        }
    }

    /* compiled from: SignUpView$$State.java */
    public class OnEmailAlreadyTakenCommand extends ViewCommand<SignUpView> {
        public OnEmailAlreadyTakenCommand(SignUpView$$State signUpView$$State) {
            super("onEmailAlreadyTaken", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpView signUpView) {
            signUpView.mo14234C();
        }
    }

    /* compiled from: SignUpView$$State.java */
    public class OnEmailEmptyCommand extends ViewCommand<SignUpView> {
        public OnEmailEmptyCommand(SignUpView$$State signUpView$$State) {
            super("onEmailEmpty", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpView signUpView) {
            signUpView.mo14245b0();
        }
    }

    /* compiled from: SignUpView$$State.java */
    public class OnEmailInvalidCommand extends ViewCommand<SignUpView> {
        public OnEmailInvalidCommand(SignUpView$$State signUpView$$State) {
            super("onEmailInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpView signUpView) {
            signUpView.mo14249w();
        }
    }

    /* compiled from: SignUpView$$State.java */
    public class OnEmailServiceDisallowedCommand extends ViewCommand<SignUpView> {
        public OnEmailServiceDisallowedCommand(SignUpView$$State signUpView$$State) {
            super("onEmailServiceDisallowed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpView signUpView) {
            signUpView.mo14240Q();
        }
    }

    /* compiled from: SignUpView$$State.java */
    public class OnHideLoadingViewCommand extends ViewCommand<SignUpView> {
        public OnHideLoadingViewCommand(SignUpView$$State signUpView$$State) {
            super("onHideLoadingView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpView signUpView) {
            signUpView.mo14247j();
        }
    }

    /* compiled from: SignUpView$$State.java */
    public class OnLoginAlreadyTakenCommand extends ViewCommand<SignUpView> {
        public OnLoginAlreadyTakenCommand(SignUpView$$State signUpView$$State) {
            super("onLoginAlreadyTaken", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpView signUpView) {
            signUpView.mo14250y();
        }
    }

    /* compiled from: SignUpView$$State.java */
    public class OnLoginEmptyCommand extends ViewCommand<SignUpView> {
        public OnLoginEmptyCommand(SignUpView$$State signUpView$$State) {
            super("onLoginEmpty", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpView signUpView) {
            signUpView.mo14239L();
        }
    }

    /* compiled from: SignUpView$$State.java */
    public class OnLoginInvalidCommand extends ViewCommand<SignUpView> {
        public OnLoginInvalidCommand(SignUpView$$State signUpView$$State) {
            super("onLoginInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpView signUpView) {
            signUpView.mo14248r();
        }
    }

    /* compiled from: SignUpView$$State.java */
    public class OnPasswordIncorrectCommand extends ViewCommand<SignUpView> {
        public OnPasswordIncorrectCommand(SignUpView$$State signUpView$$State) {
            super("onPasswordIncorrect", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpView signUpView) {
            signUpView.mo14243Z();
        }
    }

    /* compiled from: SignUpView$$State.java */
    public class OnPasswordInvalidCommand extends ViewCommand<SignUpView> {
        public OnPasswordInvalidCommand(SignUpView$$State signUpView$$State) {
            super("onPasswordInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpView signUpView) {
            signUpView.mo14251z();
        }
    }

    /* compiled from: SignUpView$$State.java */
    public class OnPasswordNotMatchCommand extends ViewCommand<SignUpView> {
        public OnPasswordNotMatchCommand(SignUpView$$State signUpView$$State) {
            super("onPasswordNotMatch", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpView signUpView) {
            signUpView.mo14242S();
        }
    }

    /* compiled from: SignUpView$$State.java */
    public class OnPasswordRepeatIncorrectCommand extends ViewCommand<SignUpView> {
        public OnPasswordRepeatIncorrectCommand(SignUpView$$State signUpView$$State) {
            super("onPasswordRepeatIncorrect", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpView signUpView) {
            signUpView.mo14236G0();
        }
    }

    /* compiled from: SignUpView$$State.java */
    public class OnShowLoadingViewCommand extends ViewCommand<SignUpView> {
        public OnShowLoadingViewCommand(SignUpView$$State signUpView$$State) {
            super("onShowLoadingView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpView signUpView) {
            signUpView.mo14246h();
        }
    }

    /* compiled from: SignUpView$$State.java */
    public class OnTooManyRegistrationsCommand extends ViewCommand<SignUpView> {
        public OnTooManyRegistrationsCommand(SignUpView$$State signUpView$$State) {
            super("onTooManyRegistrations", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpView signUpView) {
            signUpView.mo14238J();
        }
    }

    /* compiled from: SignUpView$$State.java */
    public class OnUnknownErrorCommand extends ViewCommand<SignUpView> {

        /* renamed from: a */
        public final String f25887a;

        public OnUnknownErrorCommand(SignUpView$$State signUpView$$State, String str) {
            super("onUnknownError", OneExecutionStateStrategy.class);
            this.f25887a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpView signUpView) {
            signUpView.mo14235E(this.f25887a);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: C */
    public void mo14234C() {
        OnEmailAlreadyTakenCommand onEmailAlreadyTakenCommand = new OnEmailAlreadyTakenCommand(this);
        this.viewCommands.beforeApply(onEmailAlreadyTakenCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpView) it.next()).mo14234C();
        }
        this.viewCommands.afterApply(onEmailAlreadyTakenCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: E */
    public void mo14235E(String str) {
        OnUnknownErrorCommand onUnknownErrorCommand = new OnUnknownErrorCommand(this, str);
        this.viewCommands.beforeApply(onUnknownErrorCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpView) it.next()).mo14235E(str);
        }
        this.viewCommands.afterApply(onUnknownErrorCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: G0 */
    public void mo14236G0() {
        OnPasswordRepeatIncorrectCommand onPasswordRepeatIncorrectCommand = new OnPasswordRepeatIncorrectCommand(this);
        this.viewCommands.beforeApply(onPasswordRepeatIncorrectCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpView) it.next()).mo14236G0();
        }
        this.viewCommands.afterApply(onPasswordRepeatIncorrectCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: I */
    public void mo14237I() {
        OnCodeAlreadySentCommand onCodeAlreadySentCommand = new OnCodeAlreadySentCommand(this);
        this.viewCommands.beforeApply(onCodeAlreadySentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpView) it.next()).mo14237I();
        }
        this.viewCommands.afterApply(onCodeAlreadySentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: J */
    public void mo14238J() {
        OnTooManyRegistrationsCommand onTooManyRegistrationsCommand = new OnTooManyRegistrationsCommand(this);
        this.viewCommands.beforeApply(onTooManyRegistrationsCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpView) it.next()).mo14238J();
        }
        this.viewCommands.afterApply(onTooManyRegistrationsCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: L */
    public void mo14239L() {
        OnLoginEmptyCommand onLoginEmptyCommand = new OnLoginEmptyCommand(this);
        this.viewCommands.beforeApply(onLoginEmptyCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpView) it.next()).mo14239L();
        }
        this.viewCommands.afterApply(onLoginEmptyCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: Q */
    public void mo14240Q() {
        OnEmailServiceDisallowedCommand onEmailServiceDisallowedCommand = new OnEmailServiceDisallowedCommand(this);
        this.viewCommands.beforeApply(onEmailServiceDisallowedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpView) it.next()).mo14240Q();
        }
        this.viewCommands.afterApply(onEmailServiceDisallowedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: R */
    public void mo14241R(String str, String str2, String str3, String str4, long j2) {
        OnConfirmCommand onConfirmCommand = new OnConfirmCommand(this, str, str2, str3, str4, j2);
        this.viewCommands.beforeApply(onConfirmCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpView) it.next()).mo14241R(str, str2, str3, str4, j2);
        }
        this.viewCommands.afterApply(onConfirmCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: S */
    public void mo14242S() {
        OnPasswordNotMatchCommand onPasswordNotMatchCommand = new OnPasswordNotMatchCommand(this);
        this.viewCommands.beforeApply(onPasswordNotMatchCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpView) it.next()).mo14242S();
        }
        this.viewCommands.afterApply(onPasswordNotMatchCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: Z */
    public void mo14243Z() {
        OnPasswordIncorrectCommand onPasswordIncorrectCommand = new OnPasswordIncorrectCommand(this);
        this.viewCommands.beforeApply(onPasswordIncorrectCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpView) it.next()).mo14243Z();
        }
        this.viewCommands.afterApply(onPasswordIncorrectCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: Z0 */
    public void mo14244Z0() {
        OnCodeCannotSendCommand onCodeCannotSendCommand = new OnCodeCannotSendCommand(this);
        this.viewCommands.beforeApply(onCodeCannotSendCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpView) it.next()).mo14244Z0();
        }
        this.viewCommands.afterApply(onCodeCannotSendCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: b0 */
    public void mo14245b0() {
        OnEmailEmptyCommand onEmailEmptyCommand = new OnEmailEmptyCommand(this);
        this.viewCommands.beforeApply(onEmailEmptyCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpView) it.next()).mo14245b0();
        }
        this.viewCommands.afterApply(onEmailEmptyCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: h */
    public void mo14246h() {
        OnShowLoadingViewCommand onShowLoadingViewCommand = new OnShowLoadingViewCommand(this);
        this.viewCommands.beforeApply(onShowLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpView) it.next()).mo14246h();
        }
        this.viewCommands.afterApply(onShowLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: j */
    public void mo14247j() {
        OnHideLoadingViewCommand onHideLoadingViewCommand = new OnHideLoadingViewCommand(this);
        this.viewCommands.beforeApply(onHideLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpView) it.next()).mo14247j();
        }
        this.viewCommands.afterApply(onHideLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: r */
    public void mo14248r() {
        OnLoginInvalidCommand onLoginInvalidCommand = new OnLoginInvalidCommand(this);
        this.viewCommands.beforeApply(onLoginInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpView) it.next()).mo14248r();
        }
        this.viewCommands.afterApply(onLoginInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: w */
    public void mo14249w() {
        OnEmailInvalidCommand onEmailInvalidCommand = new OnEmailInvalidCommand(this);
        this.viewCommands.beforeApply(onEmailInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpView) it.next()).mo14249w();
        }
        this.viewCommands.afterApply(onEmailInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: y */
    public void mo14250y() {
        OnLoginAlreadyTakenCommand onLoginAlreadyTakenCommand = new OnLoginAlreadyTakenCommand(this);
        this.viewCommands.beforeApply(onLoginAlreadyTakenCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpView) it.next()).mo14250y();
        }
        this.viewCommands.afterApply(onLoginAlreadyTakenCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.SignUpView
    /* renamed from: z */
    public void mo14251z() {
        OnPasswordInvalidCommand onPasswordInvalidCommand = new OnPasswordInvalidCommand(this);
        this.viewCommands.beforeApply(onPasswordInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpView) it.next()).mo14251z();
        }
        this.viewCommands.afterApply(onPasswordInvalidCommand);
    }
}
