package com.swiftsoft.anixartd.presentation.auth.signin;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class SignInView$$State extends MvpViewState<SignInView> implements SignInView {

    /* compiled from: SignInView$$State.java */
    public class OnHideLoadingViewCommand extends ViewCommand<SignInView> {
        public OnHideLoadingViewCommand(SignInView$$State signInView$$State) {
            super("onHideLoadingView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignInView signInView) {
            signInView.mo14229j();
        }
    }

    /* compiled from: SignInView$$State.java */
    public class OnLoginEmptyCommand extends ViewCommand<SignInView> {
        public OnLoginEmptyCommand(SignInView$$State signInView$$State) {
            super("onLoginEmpty", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignInView signInView) {
            signInView.mo14226L();
        }
    }

    /* compiled from: SignInView$$State.java */
    public class OnLoginInvalidCommand extends ViewCommand<SignInView> {
        public OnLoginInvalidCommand(SignInView$$State signInView$$State) {
            super("onLoginInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignInView signInView) {
            signInView.mo14230r();
        }
    }

    /* compiled from: SignInView$$State.java */
    public class OnMainCommand extends ViewCommand<SignInView> {

        /* renamed from: a */
        public final boolean f25872a;

        public OnMainCommand(SignInView$$State signInView$$State, boolean z) {
            super("onMain", OneExecutionStateStrategy.class);
            this.f25872a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignInView signInView) {
            signInView.mo14232z3(this.f25872a);
        }
    }

    /* compiled from: SignInView$$State.java */
    public class OnPasswordIncorrectCommand extends ViewCommand<SignInView> {
        public OnPasswordIncorrectCommand(SignInView$$State signInView$$State) {
            super("onPasswordIncorrect", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignInView signInView) {
            signInView.mo14227Z();
        }
    }

    /* compiled from: SignInView$$State.java */
    public class OnPasswordInvalidCommand extends ViewCommand<SignInView> {
        public OnPasswordInvalidCommand(SignInView$$State signInView$$State) {
            super("onPasswordInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignInView signInView) {
            signInView.mo14231z();
        }
    }

    /* compiled from: SignInView$$State.java */
    public class OnShowLoadingViewCommand extends ViewCommand<SignInView> {
        public OnShowLoadingViewCommand(SignInView$$State signInView$$State) {
            super("onShowLoadingView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignInView signInView) {
            signInView.mo14228h();
        }
    }

    /* compiled from: SignInView$$State.java */
    public class OnUnknownErrorCommand extends ViewCommand<SignInView> {

        /* renamed from: a */
        public final String f25873a;

        public OnUnknownErrorCommand(SignInView$$State signInView$$State, String str) {
            super("onUnknownError", OneExecutionStateStrategy.class);
            this.f25873a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SignInView signInView) {
            signInView.mo14225E(this.f25873a);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signin.SignInView
    /* renamed from: E */
    public void mo14225E(String str) {
        OnUnknownErrorCommand onUnknownErrorCommand = new OnUnknownErrorCommand(this, str);
        this.viewCommands.beforeApply(onUnknownErrorCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignInView) it.next()).mo14225E(str);
        }
        this.viewCommands.afterApply(onUnknownErrorCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signin.SignInView
    /* renamed from: L */
    public void mo14226L() {
        OnLoginEmptyCommand onLoginEmptyCommand = new OnLoginEmptyCommand(this);
        this.viewCommands.beforeApply(onLoginEmptyCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignInView) it.next()).mo14226L();
        }
        this.viewCommands.afterApply(onLoginEmptyCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signin.SignInView
    /* renamed from: Z */
    public void mo14227Z() {
        OnPasswordIncorrectCommand onPasswordIncorrectCommand = new OnPasswordIncorrectCommand(this);
        this.viewCommands.beforeApply(onPasswordIncorrectCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignInView) it.next()).mo14227Z();
        }
        this.viewCommands.afterApply(onPasswordIncorrectCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signin.SignInView
    /* renamed from: h */
    public void mo14228h() {
        OnShowLoadingViewCommand onShowLoadingViewCommand = new OnShowLoadingViewCommand(this);
        this.viewCommands.beforeApply(onShowLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignInView) it.next()).mo14228h();
        }
        this.viewCommands.afterApply(onShowLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signin.SignInView
    /* renamed from: j */
    public void mo14229j() {
        OnHideLoadingViewCommand onHideLoadingViewCommand = new OnHideLoadingViewCommand(this);
        this.viewCommands.beforeApply(onHideLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignInView) it.next()).mo14229j();
        }
        this.viewCommands.afterApply(onHideLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signin.SignInView
    /* renamed from: r */
    public void mo14230r() {
        OnLoginInvalidCommand onLoginInvalidCommand = new OnLoginInvalidCommand(this);
        this.viewCommands.beforeApply(onLoginInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignInView) it.next()).mo14230r();
        }
        this.viewCommands.afterApply(onLoginInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signin.SignInView
    /* renamed from: z */
    public void mo14231z() {
        OnPasswordInvalidCommand onPasswordInvalidCommand = new OnPasswordInvalidCommand(this);
        this.viewCommands.beforeApply(onPasswordInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignInView) it.next()).mo14231z();
        }
        this.viewCommands.afterApply(onPasswordInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signin.SignInView
    /* renamed from: z3 */
    public void mo14232z3(boolean z) {
        OnMainCommand onMainCommand = new OnMainCommand(this, z);
        this.viewCommands.beforeApply(onMainCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SignInView) it.next()).mo14232z3(z);
        }
        this.viewCommands.afterApply(onMainCommand);
    }
}
