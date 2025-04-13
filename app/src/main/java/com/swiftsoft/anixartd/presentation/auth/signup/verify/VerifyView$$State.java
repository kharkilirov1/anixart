package com.swiftsoft.anixartd.presentation.auth.signup.verify;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class VerifyView$$State extends MvpViewState<VerifyView> implements VerifyView {

    /* compiled from: VerifyView$$State.java */
    public class OnCodeExpiredCommand extends ViewCommand<VerifyView> {
        public OnCodeExpiredCommand(VerifyView$$State verifyView$$State) {
            super("onCodeExpired", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(VerifyView verifyView) {
            verifyView.mo14276b1();
        }
    }

    /* compiled from: VerifyView$$State.java */
    public class OnCodeInvalidCommand extends ViewCommand<VerifyView> {
        public OnCodeInvalidCommand(VerifyView$$State verifyView$$State) {
            super("onCodeInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(VerifyView verifyView) {
            verifyView.mo14280r0();
        }
    }

    /* compiled from: VerifyView$$State.java */
    public class OnCodeStillActualCommand extends ViewCommand<VerifyView> {

        /* renamed from: a */
        public final long f25912a;

        public OnCodeStillActualCommand(VerifyView$$State verifyView$$State, long j2) {
            super("onCodeStillActual", OneExecutionStateStrategy.class);
            this.f25912a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(VerifyView verifyView) {
            verifyView.mo14269B0(this.f25912a);
        }
    }

    /* compiled from: VerifyView$$State.java */
    public class OnCodeSuccessfullyResentCommand extends ViewCommand<VerifyView> {
        public OnCodeSuccessfullyResentCommand(VerifyView$$State verifyView$$State) {
            super("onCodeSuccessfullyResent", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(VerifyView verifyView) {
            verifyView.mo14275X0();
        }
    }

    /* compiled from: VerifyView$$State.java */
    public class OnEmailAlreadyTakenCommand extends ViewCommand<VerifyView> {
        public OnEmailAlreadyTakenCommand(VerifyView$$State verifyView$$State) {
            super("onEmailAlreadyTaken", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(VerifyView verifyView) {
            verifyView.mo14270C();
        }
    }

    /* compiled from: VerifyView$$State.java */
    public class OnEmailInvalidCommand extends ViewCommand<VerifyView> {
        public OnEmailInvalidCommand(VerifyView$$State verifyView$$State) {
            super("onEmailInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(VerifyView verifyView) {
            verifyView.mo14282w();
        }
    }

    /* compiled from: VerifyView$$State.java */
    public class OnEmailServiceDisallowedCommand extends ViewCommand<VerifyView> {
        public OnEmailServiceDisallowedCommand(VerifyView$$State verifyView$$State) {
            super("onEmailServiceDisallowed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(VerifyView verifyView) {
            verifyView.mo14274Q();
        }
    }

    /* compiled from: VerifyView$$State.java */
    public class OnHashInvalidCommand extends ViewCommand<VerifyView> {
        public OnHashInvalidCommand(VerifyView$$State verifyView$$State) {
            super("onHashInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(VerifyView verifyView) {
            verifyView.mo14273O0();
        }
    }

    /* compiled from: VerifyView$$State.java */
    public class OnHideLoadingViewCommand extends ViewCommand<VerifyView> {
        public OnHideLoadingViewCommand(VerifyView$$State verifyView$$State) {
            super("onHideLoadingView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(VerifyView verifyView) {
            verifyView.mo14278j();
        }
    }

    /* compiled from: VerifyView$$State.java */
    public class OnLoginAlreadyTakenCommand extends ViewCommand<VerifyView> {
        public OnLoginAlreadyTakenCommand(VerifyView$$State verifyView$$State) {
            super("onLoginAlreadyTaken", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(VerifyView verifyView) {
            verifyView.mo14283y();
        }
    }

    /* compiled from: VerifyView$$State.java */
    public class OnLoginInvalidCommand extends ViewCommand<VerifyView> {
        public OnLoginInvalidCommand(VerifyView$$State verifyView$$State) {
            super("onLoginInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(VerifyView verifyView) {
            verifyView.mo14279r();
        }
    }

    /* compiled from: VerifyView$$State.java */
    public class OnMainCommand extends ViewCommand<VerifyView> {
        public OnMainCommand(VerifyView$$State verifyView$$State) {
            super("onMain", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(VerifyView verifyView) {
            verifyView.mo14281t();
        }
    }

    /* compiled from: VerifyView$$State.java */
    public class OnPasswordInvalidCommand extends ViewCommand<VerifyView> {
        public OnPasswordInvalidCommand(VerifyView$$State verifyView$$State) {
            super("onPasswordInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(VerifyView verifyView) {
            verifyView.mo14284z();
        }
    }

    /* compiled from: VerifyView$$State.java */
    public class OnShowLoadingViewCommand extends ViewCommand<VerifyView> {
        public OnShowLoadingViewCommand(VerifyView$$State verifyView$$State) {
            super("onShowLoadingView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(VerifyView verifyView) {
            verifyView.mo14277h();
        }
    }

    /* compiled from: VerifyView$$State.java */
    public class OnTooManyRegistrationsCommand extends ViewCommand<VerifyView> {
        public OnTooManyRegistrationsCommand(VerifyView$$State verifyView$$State) {
            super("onTooManyRegistrations", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(VerifyView verifyView) {
            verifyView.mo14272J();
        }
    }

    /* compiled from: VerifyView$$State.java */
    public class OnUnknownErrorCommand extends ViewCommand<VerifyView> {

        /* renamed from: a */
        public final String f25913a;

        public OnUnknownErrorCommand(VerifyView$$State verifyView$$State, String str) {
            super("onUnknownError", OneExecutionStateStrategy.class);
            this.f25913a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(VerifyView verifyView) {
            verifyView.mo14271E(this.f25913a);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: B0 */
    public void mo14269B0(long j2) {
        OnCodeStillActualCommand onCodeStillActualCommand = new OnCodeStillActualCommand(this, j2);
        this.viewCommands.beforeApply(onCodeStillActualCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((VerifyView) it.next()).mo14269B0(j2);
        }
        this.viewCommands.afterApply(onCodeStillActualCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: C */
    public void mo14270C() {
        OnEmailAlreadyTakenCommand onEmailAlreadyTakenCommand = new OnEmailAlreadyTakenCommand(this);
        this.viewCommands.beforeApply(onEmailAlreadyTakenCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((VerifyView) it.next()).mo14270C();
        }
        this.viewCommands.afterApply(onEmailAlreadyTakenCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: E */
    public void mo14271E(String str) {
        OnUnknownErrorCommand onUnknownErrorCommand = new OnUnknownErrorCommand(this, str);
        this.viewCommands.beforeApply(onUnknownErrorCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((VerifyView) it.next()).mo14271E(str);
        }
        this.viewCommands.afterApply(onUnknownErrorCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: J */
    public void mo14272J() {
        OnTooManyRegistrationsCommand onTooManyRegistrationsCommand = new OnTooManyRegistrationsCommand(this);
        this.viewCommands.beforeApply(onTooManyRegistrationsCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((VerifyView) it.next()).mo14272J();
        }
        this.viewCommands.afterApply(onTooManyRegistrationsCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: O0 */
    public void mo14273O0() {
        OnHashInvalidCommand onHashInvalidCommand = new OnHashInvalidCommand(this);
        this.viewCommands.beforeApply(onHashInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((VerifyView) it.next()).mo14273O0();
        }
        this.viewCommands.afterApply(onHashInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: Q */
    public void mo14274Q() {
        OnEmailServiceDisallowedCommand onEmailServiceDisallowedCommand = new OnEmailServiceDisallowedCommand(this);
        this.viewCommands.beforeApply(onEmailServiceDisallowedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((VerifyView) it.next()).mo14274Q();
        }
        this.viewCommands.afterApply(onEmailServiceDisallowedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: X0 */
    public void mo14275X0() {
        OnCodeSuccessfullyResentCommand onCodeSuccessfullyResentCommand = new OnCodeSuccessfullyResentCommand(this);
        this.viewCommands.beforeApply(onCodeSuccessfullyResentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((VerifyView) it.next()).mo14275X0();
        }
        this.viewCommands.afterApply(onCodeSuccessfullyResentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: b1 */
    public void mo14276b1() {
        OnCodeExpiredCommand onCodeExpiredCommand = new OnCodeExpiredCommand(this);
        this.viewCommands.beforeApply(onCodeExpiredCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((VerifyView) it.next()).mo14276b1();
        }
        this.viewCommands.afterApply(onCodeExpiredCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: h */
    public void mo14277h() {
        OnShowLoadingViewCommand onShowLoadingViewCommand = new OnShowLoadingViewCommand(this);
        this.viewCommands.beforeApply(onShowLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((VerifyView) it.next()).mo14277h();
        }
        this.viewCommands.afterApply(onShowLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: j */
    public void mo14278j() {
        OnHideLoadingViewCommand onHideLoadingViewCommand = new OnHideLoadingViewCommand(this);
        this.viewCommands.beforeApply(onHideLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((VerifyView) it.next()).mo14278j();
        }
        this.viewCommands.afterApply(onHideLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: r */
    public void mo14279r() {
        OnLoginInvalidCommand onLoginInvalidCommand = new OnLoginInvalidCommand(this);
        this.viewCommands.beforeApply(onLoginInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((VerifyView) it.next()).mo14279r();
        }
        this.viewCommands.afterApply(onLoginInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: r0 */
    public void mo14280r0() {
        OnCodeInvalidCommand onCodeInvalidCommand = new OnCodeInvalidCommand(this);
        this.viewCommands.beforeApply(onCodeInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((VerifyView) it.next()).mo14280r0();
        }
        this.viewCommands.afterApply(onCodeInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: t */
    public void mo14281t() {
        OnMainCommand onMainCommand = new OnMainCommand(this);
        this.viewCommands.beforeApply(onMainCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((VerifyView) it.next()).mo14281t();
        }
        this.viewCommands.afterApply(onMainCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: w */
    public void mo14282w() {
        OnEmailInvalidCommand onEmailInvalidCommand = new OnEmailInvalidCommand(this);
        this.viewCommands.beforeApply(onEmailInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((VerifyView) it.next()).mo14282w();
        }
        this.viewCommands.afterApply(onEmailInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: y */
    public void mo14283y() {
        OnLoginAlreadyTakenCommand onLoginAlreadyTakenCommand = new OnLoginAlreadyTakenCommand(this);
        this.viewCommands.beforeApply(onLoginAlreadyTakenCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((VerifyView) it.next()).mo14283y();
        }
        this.viewCommands.afterApply(onLoginAlreadyTakenCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: z */
    public void mo14284z() {
        OnPasswordInvalidCommand onPasswordInvalidCommand = new OnPasswordInvalidCommand(this);
        this.viewCommands.beforeApply(onPasswordInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((VerifyView) it.next()).mo14284z();
        }
        this.viewCommands.afterApply(onPasswordInvalidCommand);
    }
}
