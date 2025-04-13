package com.swiftsoft.anixartd.presentation.auth.restore.verify;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class RestoreVerifyView$$State extends MvpViewState<RestoreVerifyView> implements RestoreVerifyView {

    /* compiled from: RestoreVerifyView$$State.java */
    public class OnCodeExpiredCommand extends ViewCommand<RestoreVerifyView> {
        public OnCodeExpiredCommand(RestoreVerifyView$$State restoreVerifyView$$State) {
            super("onCodeExpired", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RestoreVerifyView restoreVerifyView) {
            restoreVerifyView.mo14217b1();
        }
    }

    /* compiled from: RestoreVerifyView$$State.java */
    public class OnCodeInvalidCommand extends ViewCommand<RestoreVerifyView> {
        public OnCodeInvalidCommand(RestoreVerifyView$$State restoreVerifyView$$State) {
            super("onCodeInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RestoreVerifyView restoreVerifyView) {
            restoreVerifyView.mo14221r0();
        }
    }

    /* compiled from: RestoreVerifyView$$State.java */
    public class OnCodeStillActualCommand extends ViewCommand<RestoreVerifyView> {

        /* renamed from: a */
        public final long f25861a;

        public OnCodeStillActualCommand(RestoreVerifyView$$State restoreVerifyView$$State, long j2) {
            super("onCodeStillActual", OneExecutionStateStrategy.class);
            this.f25861a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RestoreVerifyView restoreVerifyView) {
            restoreVerifyView.mo14213B0(this.f25861a);
        }
    }

    /* compiled from: RestoreVerifyView$$State.java */
    public class OnCodeSuccessfullyResentCommand extends ViewCommand<RestoreVerifyView> {
        public OnCodeSuccessfullyResentCommand(RestoreVerifyView$$State restoreVerifyView$$State) {
            super("onCodeSuccessfullyResent", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RestoreVerifyView restoreVerifyView) {
            restoreVerifyView.mo14216X0();
        }
    }

    /* compiled from: RestoreVerifyView$$State.java */
    public class OnHashInvalidCommand extends ViewCommand<RestoreVerifyView> {
        public OnHashInvalidCommand(RestoreVerifyView$$State restoreVerifyView$$State) {
            super("onHashInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RestoreVerifyView restoreVerifyView) {
            restoreVerifyView.mo14215O0();
        }
    }

    /* compiled from: RestoreVerifyView$$State.java */
    public class OnHideLoadingViewCommand extends ViewCommand<RestoreVerifyView> {
        public OnHideLoadingViewCommand(RestoreVerifyView$$State restoreVerifyView$$State) {
            super("onHideLoadingView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RestoreVerifyView restoreVerifyView) {
            restoreVerifyView.mo14219j();
        }
    }

    /* compiled from: RestoreVerifyView$$State.java */
    public class OnMainCommand extends ViewCommand<RestoreVerifyView> {
        public OnMainCommand(RestoreVerifyView$$State restoreVerifyView$$State) {
            super("onMain", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RestoreVerifyView restoreVerifyView) {
            restoreVerifyView.mo14222t();
        }
    }

    /* compiled from: RestoreVerifyView$$State.java */
    public class OnPasswordInvalidCommand extends ViewCommand<RestoreVerifyView> {
        public OnPasswordInvalidCommand(RestoreVerifyView$$State restoreVerifyView$$State) {
            super("onPasswordInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RestoreVerifyView restoreVerifyView) {
            restoreVerifyView.mo14223z();
        }
    }

    /* compiled from: RestoreVerifyView$$State.java */
    public class OnProfileNotFoundCommand extends ViewCommand<RestoreVerifyView> {
        public OnProfileNotFoundCommand(RestoreVerifyView$$State restoreVerifyView$$State) {
            super("onProfileNotFound", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RestoreVerifyView restoreVerifyView) {
            restoreVerifyView.mo14220k0();
        }
    }

    /* compiled from: RestoreVerifyView$$State.java */
    public class OnShowLoadingViewCommand extends ViewCommand<RestoreVerifyView> {
        public OnShowLoadingViewCommand(RestoreVerifyView$$State restoreVerifyView$$State) {
            super("onShowLoadingView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RestoreVerifyView restoreVerifyView) {
            restoreVerifyView.mo14218h();
        }
    }

    /* compiled from: RestoreVerifyView$$State.java */
    public class OnUnknownErrorCommand extends ViewCommand<RestoreVerifyView> {

        /* renamed from: a */
        public final String f25862a;

        public OnUnknownErrorCommand(RestoreVerifyView$$State restoreVerifyView$$State, String str) {
            super("onUnknownError", OneExecutionStateStrategy.class);
            this.f25862a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RestoreVerifyView restoreVerifyView) {
            restoreVerifyView.mo14214E(this.f25862a);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyView
    /* renamed from: B0 */
    public void mo14213B0(long j2) {
        OnCodeStillActualCommand onCodeStillActualCommand = new OnCodeStillActualCommand(this, j2);
        this.viewCommands.beforeApply(onCodeStillActualCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RestoreVerifyView) it.next()).mo14213B0(j2);
        }
        this.viewCommands.afterApply(onCodeStillActualCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyView
    /* renamed from: E */
    public void mo14214E(String str) {
        OnUnknownErrorCommand onUnknownErrorCommand = new OnUnknownErrorCommand(this, str);
        this.viewCommands.beforeApply(onUnknownErrorCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RestoreVerifyView) it.next()).mo14214E(str);
        }
        this.viewCommands.afterApply(onUnknownErrorCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyView
    /* renamed from: O0 */
    public void mo14215O0() {
        OnHashInvalidCommand onHashInvalidCommand = new OnHashInvalidCommand(this);
        this.viewCommands.beforeApply(onHashInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RestoreVerifyView) it.next()).mo14215O0();
        }
        this.viewCommands.afterApply(onHashInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyView
    /* renamed from: X0 */
    public void mo14216X0() {
        OnCodeSuccessfullyResentCommand onCodeSuccessfullyResentCommand = new OnCodeSuccessfullyResentCommand(this);
        this.viewCommands.beforeApply(onCodeSuccessfullyResentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RestoreVerifyView) it.next()).mo14216X0();
        }
        this.viewCommands.afterApply(onCodeSuccessfullyResentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyView
    /* renamed from: b1 */
    public void mo14217b1() {
        OnCodeExpiredCommand onCodeExpiredCommand = new OnCodeExpiredCommand(this);
        this.viewCommands.beforeApply(onCodeExpiredCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RestoreVerifyView) it.next()).mo14217b1();
        }
        this.viewCommands.afterApply(onCodeExpiredCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyView
    /* renamed from: h */
    public void mo14218h() {
        OnShowLoadingViewCommand onShowLoadingViewCommand = new OnShowLoadingViewCommand(this);
        this.viewCommands.beforeApply(onShowLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RestoreVerifyView) it.next()).mo14218h();
        }
        this.viewCommands.afterApply(onShowLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyView
    /* renamed from: j */
    public void mo14219j() {
        OnHideLoadingViewCommand onHideLoadingViewCommand = new OnHideLoadingViewCommand(this);
        this.viewCommands.beforeApply(onHideLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RestoreVerifyView) it.next()).mo14219j();
        }
        this.viewCommands.afterApply(onHideLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyView
    /* renamed from: k0 */
    public void mo14220k0() {
        OnProfileNotFoundCommand onProfileNotFoundCommand = new OnProfileNotFoundCommand(this);
        this.viewCommands.beforeApply(onProfileNotFoundCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RestoreVerifyView) it.next()).mo14220k0();
        }
        this.viewCommands.afterApply(onProfileNotFoundCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyView
    /* renamed from: r0 */
    public void mo14221r0() {
        OnCodeInvalidCommand onCodeInvalidCommand = new OnCodeInvalidCommand(this);
        this.viewCommands.beforeApply(onCodeInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RestoreVerifyView) it.next()).mo14221r0();
        }
        this.viewCommands.afterApply(onCodeInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyView
    /* renamed from: t */
    public void mo14222t() {
        OnMainCommand onMainCommand = new OnMainCommand(this);
        this.viewCommands.beforeApply(onMainCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RestoreVerifyView) it.next()).mo14222t();
        }
        this.viewCommands.afterApply(onMainCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyView
    /* renamed from: z */
    public void mo14223z() {
        OnPasswordInvalidCommand onPasswordInvalidCommand = new OnPasswordInvalidCommand(this);
        this.viewCommands.beforeApply(onPasswordInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RestoreVerifyView) it.next()).mo14223z();
        }
        this.viewCommands.afterApply(onPasswordInvalidCommand);
    }
}
