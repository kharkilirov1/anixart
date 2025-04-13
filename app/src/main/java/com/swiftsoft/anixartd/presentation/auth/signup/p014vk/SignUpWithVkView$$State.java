package com.swiftsoft.anixartd.presentation.auth.signup.p014vk;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class SignUpWithVkView$$State extends MvpViewState<SignUpWithVkView> implements SignUpWithVkView {

    /* compiled from: SignUpWithVkView$$State.java */
    public class OnCodeAlreadySentCommand extends ViewCommand<SignUpWithVkView> {
        public OnCodeAlreadySentCommand(SignUpWithVkView$$State signUpWithVkView$$State) {
            super("onCodeAlreadySent", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithVkView signUpWithVkView) {
            signUpWithVkView.mo14287I();
        }
    }

    /* compiled from: SignUpWithVkView$$State.java */
    public class OnConfirmCommand extends ViewCommand<SignUpWithVkView> {

        /* renamed from: a */
        public final String f25927a;

        /* renamed from: b */
        public final String f25928b;

        /* renamed from: c */
        public final String f25929c;

        /* renamed from: d */
        public final String f25930d;

        /* renamed from: e */
        public final long f25931e;

        public OnConfirmCommand(SignUpWithVkView$$State signUpWithVkView$$State, String str, String str2, String str3, String str4, long j2) {
            super("onConfirm", OneExecutionStateStrategy.class);
            this.f25927a = str;
            this.f25928b = str2;
            this.f25929c = str3;
            this.f25930d = str4;
            this.f25931e = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithVkView signUpWithVkView) {
            signUpWithVkView.mo14292R(this.f25927a, this.f25928b, this.f25929c, this.f25930d, this.f25931e);
        }
    }

    /* compiled from: SignUpWithVkView$$State.java */
    public class OnEmailAlreadyTakenCommand extends ViewCommand<SignUpWithVkView> {
        public OnEmailAlreadyTakenCommand(SignUpWithVkView$$State signUpWithVkView$$State) {
            super("onEmailAlreadyTaken", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithVkView signUpWithVkView) {
            signUpWithVkView.mo14286C();
        }
    }

    /* compiled from: SignUpWithVkView$$State.java */
    public class OnEmailEmptyCommand extends ViewCommand<SignUpWithVkView> {
        public OnEmailEmptyCommand(SignUpWithVkView$$State signUpWithVkView$$State) {
            super("onEmailEmpty", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithVkView signUpWithVkView) {
            signUpWithVkView.mo14293b0();
        }
    }

    /* compiled from: SignUpWithVkView$$State.java */
    public class OnEmailInvalidCommand extends ViewCommand<SignUpWithVkView> {
        public OnEmailInvalidCommand(SignUpWithVkView$$State signUpWithVkView$$State) {
            super("onEmailInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithVkView signUpWithVkView) {
            signUpWithVkView.mo14298w();
        }
    }

    /* compiled from: SignUpWithVkView$$State.java */
    public class OnEmailServiceDisallowedCommand extends ViewCommand<SignUpWithVkView> {
        public OnEmailServiceDisallowedCommand(SignUpWithVkView$$State signUpWithVkView$$State) {
            super("onEmailServiceDisallowed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithVkView signUpWithVkView) {
            signUpWithVkView.mo14291Q();
        }
    }

    /* compiled from: SignUpWithVkView$$State.java */
    public class OnHideLoadingViewCommand extends ViewCommand<SignUpWithVkView> {
        public OnHideLoadingViewCommand(SignUpWithVkView$$State signUpWithVkView$$State) {
            super("onHideLoadingView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithVkView signUpWithVkView) {
            signUpWithVkView.mo14295j();
        }
    }

    /* compiled from: SignUpWithVkView$$State.java */
    public class OnInvalidRequestCommand extends ViewCommand<SignUpWithVkView> {
        public OnInvalidRequestCommand(SignUpWithVkView$$State signUpWithVkView$$State) {
            super("onInvalidRequest", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithVkView signUpWithVkView) {
            signUpWithVkView.mo14290P();
        }
    }

    /* compiled from: SignUpWithVkView$$State.java */
    public class OnLoginAlreadyTakenCommand extends ViewCommand<SignUpWithVkView> {
        public OnLoginAlreadyTakenCommand(SignUpWithVkView$$State signUpWithVkView$$State) {
            super("onLoginAlreadyTaken", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithVkView signUpWithVkView) {
            signUpWithVkView.mo14299y();
        }
    }

    /* compiled from: SignUpWithVkView$$State.java */
    public class OnLoginEmptyCommand extends ViewCommand<SignUpWithVkView> {
        public OnLoginEmptyCommand(SignUpWithVkView$$State signUpWithVkView$$State) {
            super("onLoginEmpty", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithVkView signUpWithVkView) {
            signUpWithVkView.mo14289L();
        }
    }

    /* compiled from: SignUpWithVkView$$State.java */
    public class OnLoginInvalidCommand extends ViewCommand<SignUpWithVkView> {
        public OnLoginInvalidCommand(SignUpWithVkView$$State signUpWithVkView$$State) {
            super("onLoginInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithVkView signUpWithVkView) {
            signUpWithVkView.mo14296r();
        }
    }

    /* compiled from: SignUpWithVkView$$State.java */
    public class OnMainCommand extends ViewCommand<SignUpWithVkView> {
        public OnMainCommand(SignUpWithVkView$$State signUpWithVkView$$State) {
            super("onMain", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithVkView signUpWithVkView) {
            signUpWithVkView.mo14297t();
        }
    }

    /* compiled from: SignUpWithVkView$$State.java */
    public class OnShowLoadingViewCommand extends ViewCommand<SignUpWithVkView> {
        public OnShowLoadingViewCommand(SignUpWithVkView$$State signUpWithVkView$$State) {
            super("onShowLoadingView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithVkView signUpWithVkView) {
            signUpWithVkView.mo14294h();
        }
    }

    /* compiled from: SignUpWithVkView$$State.java */
    public class OnTooManyRegistrationsCommand extends ViewCommand<SignUpWithVkView> {
        public OnTooManyRegistrationsCommand(SignUpWithVkView$$State signUpWithVkView$$State) {
            super("onTooManyRegistrations", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignUpWithVkView signUpWithVkView) {
            signUpWithVkView.mo14288J();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: C */
    public void mo14286C() {
        OnEmailAlreadyTakenCommand onEmailAlreadyTakenCommand = new OnEmailAlreadyTakenCommand(this);
        this.viewCommands.beforeApply(onEmailAlreadyTakenCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithVkView) it.next()).mo14286C();
        }
        this.viewCommands.afterApply(onEmailAlreadyTakenCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: I */
    public void mo14287I() {
        OnCodeAlreadySentCommand onCodeAlreadySentCommand = new OnCodeAlreadySentCommand(this);
        this.viewCommands.beforeApply(onCodeAlreadySentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithVkView) it.next()).mo14287I();
        }
        this.viewCommands.afterApply(onCodeAlreadySentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: J */
    public void mo14288J() {
        OnTooManyRegistrationsCommand onTooManyRegistrationsCommand = new OnTooManyRegistrationsCommand(this);
        this.viewCommands.beforeApply(onTooManyRegistrationsCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithVkView) it.next()).mo14288J();
        }
        this.viewCommands.afterApply(onTooManyRegistrationsCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: L */
    public void mo14289L() {
        OnLoginEmptyCommand onLoginEmptyCommand = new OnLoginEmptyCommand(this);
        this.viewCommands.beforeApply(onLoginEmptyCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithVkView) it.next()).mo14289L();
        }
        this.viewCommands.afterApply(onLoginEmptyCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: P */
    public void mo14290P() {
        OnInvalidRequestCommand onInvalidRequestCommand = new OnInvalidRequestCommand(this);
        this.viewCommands.beforeApply(onInvalidRequestCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithVkView) it.next()).mo14290P();
        }
        this.viewCommands.afterApply(onInvalidRequestCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: Q */
    public void mo14291Q() {
        OnEmailServiceDisallowedCommand onEmailServiceDisallowedCommand = new OnEmailServiceDisallowedCommand(this);
        this.viewCommands.beforeApply(onEmailServiceDisallowedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithVkView) it.next()).mo14291Q();
        }
        this.viewCommands.afterApply(onEmailServiceDisallowedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: R */
    public void mo14292R(String str, String str2, String str3, String str4, long j2) {
        OnConfirmCommand onConfirmCommand = new OnConfirmCommand(this, str, str2, str3, str4, j2);
        this.viewCommands.beforeApply(onConfirmCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithVkView) it.next()).mo14292R(str, str2, str3, str4, j2);
        }
        this.viewCommands.afterApply(onConfirmCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: b0 */
    public void mo14293b0() {
        OnEmailEmptyCommand onEmailEmptyCommand = new OnEmailEmptyCommand(this);
        this.viewCommands.beforeApply(onEmailEmptyCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithVkView) it.next()).mo14293b0();
        }
        this.viewCommands.afterApply(onEmailEmptyCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: h */
    public void mo14294h() {
        OnShowLoadingViewCommand onShowLoadingViewCommand = new OnShowLoadingViewCommand(this);
        this.viewCommands.beforeApply(onShowLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithVkView) it.next()).mo14294h();
        }
        this.viewCommands.afterApply(onShowLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: j */
    public void mo14295j() {
        OnHideLoadingViewCommand onHideLoadingViewCommand = new OnHideLoadingViewCommand(this);
        this.viewCommands.beforeApply(onHideLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithVkView) it.next()).mo14295j();
        }
        this.viewCommands.afterApply(onHideLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: r */
    public void mo14296r() {
        OnLoginInvalidCommand onLoginInvalidCommand = new OnLoginInvalidCommand(this);
        this.viewCommands.beforeApply(onLoginInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithVkView) it.next()).mo14296r();
        }
        this.viewCommands.afterApply(onLoginInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: t */
    public void mo14297t() {
        OnMainCommand onMainCommand = new OnMainCommand(this);
        this.viewCommands.beforeApply(onMainCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithVkView) it.next()).mo14297t();
        }
        this.viewCommands.afterApply(onMainCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: w */
    public void mo14298w() {
        OnEmailInvalidCommand onEmailInvalidCommand = new OnEmailInvalidCommand(this);
        this.viewCommands.beforeApply(onEmailInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithVkView) it.next()).mo14298w();
        }
        this.viewCommands.afterApply(onEmailInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.p014vk.SignUpWithVkView
    /* renamed from: y */
    public void mo14299y() {
        OnLoginAlreadyTakenCommand onLoginAlreadyTakenCommand = new OnLoginAlreadyTakenCommand(this);
        this.viewCommands.beforeApply(onLoginAlreadyTakenCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignUpWithVkView) it.next()).mo14299y();
        }
        this.viewCommands.afterApply(onLoginAlreadyTakenCommand);
    }
}
