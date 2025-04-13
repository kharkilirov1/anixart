package com.swiftsoft.anixartd.presentation.auth.restore;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class RestoreView$$State extends MvpViewState<RestoreView> implements RestoreView {

    /* compiled from: RestoreView$$State.java */
    public class OnCodeAlreadySentCommand extends ViewCommand<RestoreView> {
        public OnCodeAlreadySentCommand(RestoreView$$State restoreView$$State) {
            super("onCodeAlreadySent", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RestoreView restoreView) {
            restoreView.mo14203I();
        }
    }

    /* compiled from: RestoreView$$State.java */
    public class OnCodeCannotSendCommand extends ViewCommand<RestoreView> {
        public OnCodeCannotSendCommand(RestoreView$$State restoreView$$State) {
            super("onCodeCannotSend", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RestoreView restoreView) {
            restoreView.mo14206Z0();
        }
    }

    /* compiled from: RestoreView$$State.java */
    public class OnDataEmptyCommand extends ViewCommand<RestoreView> {
        public OnDataEmptyCommand(RestoreView$$State restoreView$$State) {
            super("onDataEmpty", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RestoreView restoreView) {
            restoreView.mo14207f3();
        }
    }

    /* compiled from: RestoreView$$State.java */
    public class OnHideLoadingViewCommand extends ViewCommand<RestoreView> {
        public OnHideLoadingViewCommand(RestoreView$$State restoreView$$State) {
            super("onHideLoadingView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RestoreView restoreView) {
            restoreView.mo14209j();
        }
    }

    /* compiled from: RestoreView$$State.java */
    public class OnPasswordIncorrectCommand extends ViewCommand<RestoreView> {
        public OnPasswordIncorrectCommand(RestoreView$$State restoreView$$State) {
            super("onPasswordIncorrect", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RestoreView restoreView) {
            restoreView.mo14205Z();
        }
    }

    /* compiled from: RestoreView$$State.java */
    public class OnPasswordNotMatchCommand extends ViewCommand<RestoreView> {
        public OnPasswordNotMatchCommand(RestoreView$$State restoreView$$State) {
            super("onPasswordNotMatch", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RestoreView restoreView) {
            restoreView.mo14204S();
        }
    }

    /* compiled from: RestoreView$$State.java */
    public class OnPasswordRepeatIncorrectCommand extends ViewCommand<RestoreView> {
        public OnPasswordRepeatIncorrectCommand(RestoreView$$State restoreView$$State) {
            super("onPasswordRepeatIncorrect", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RestoreView restoreView) {
            restoreView.mo14202G0();
        }
    }

    /* compiled from: RestoreView$$State.java */
    public class OnProfileNotFoundCommand extends ViewCommand<RestoreView> {
        public OnProfileNotFoundCommand(RestoreView$$State restoreView$$State) {
            super("onProfileNotFound", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RestoreView restoreView) {
            restoreView.mo14210k0();
        }
    }

    /* compiled from: RestoreView$$State.java */
    public class OnRestoreVerifyCommand extends ViewCommand<RestoreView> {

        /* renamed from: a */
        public final String f25844a;

        /* renamed from: b */
        public final String f25845b;

        /* renamed from: c */
        public final String f25846c;

        /* renamed from: d */
        public final long f25847d;

        public OnRestoreVerifyCommand(RestoreView$$State restoreView$$State, String str, String str2, String str3, long j2) {
            super("onRestoreVerify", OneExecutionStateStrategy.class);
            this.f25844a = str;
            this.f25845b = str2;
            this.f25846c = str3;
            this.f25847d = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RestoreView restoreView) {
            restoreView.mo14200C1(this.f25844a, this.f25845b, this.f25846c, this.f25847d);
        }
    }

    /* compiled from: RestoreView$$State.java */
    public class OnShowLoadingViewCommand extends ViewCommand<RestoreView> {
        public OnShowLoadingViewCommand(RestoreView$$State restoreView$$State) {
            super("onShowLoadingView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RestoreView restoreView) {
            restoreView.mo14208h();
        }
    }

    /* compiled from: RestoreView$$State.java */
    public class OnUnknownErrorCommand extends ViewCommand<RestoreView> {

        /* renamed from: a */
        public final String f25848a;

        public OnUnknownErrorCommand(RestoreView$$State restoreView$$State, String str) {
            super("onUnknownError", OneExecutionStateStrategy.class);
            this.f25848a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RestoreView restoreView) {
            restoreView.mo14201E(this.f25848a);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.RestoreView
    /* renamed from: C1 */
    public void mo14200C1(String str, String str2, String str3, long j2) {
        OnRestoreVerifyCommand onRestoreVerifyCommand = new OnRestoreVerifyCommand(this, str, str2, str3, j2);
        this.viewCommands.beforeApply(onRestoreVerifyCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RestoreView) it.next()).mo14200C1(str, str2, str3, j2);
        }
        this.viewCommands.afterApply(onRestoreVerifyCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.RestoreView
    /* renamed from: E */
    public void mo14201E(String str) {
        OnUnknownErrorCommand onUnknownErrorCommand = new OnUnknownErrorCommand(this, str);
        this.viewCommands.beforeApply(onUnknownErrorCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RestoreView) it.next()).mo14201E(str);
        }
        this.viewCommands.afterApply(onUnknownErrorCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.RestoreView
    /* renamed from: G0 */
    public void mo14202G0() {
        OnPasswordRepeatIncorrectCommand onPasswordRepeatIncorrectCommand = new OnPasswordRepeatIncorrectCommand(this);
        this.viewCommands.beforeApply(onPasswordRepeatIncorrectCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RestoreView) it.next()).mo14202G0();
        }
        this.viewCommands.afterApply(onPasswordRepeatIncorrectCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.RestoreView
    /* renamed from: I */
    public void mo14203I() {
        OnCodeAlreadySentCommand onCodeAlreadySentCommand = new OnCodeAlreadySentCommand(this);
        this.viewCommands.beforeApply(onCodeAlreadySentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RestoreView) it.next()).mo14203I();
        }
        this.viewCommands.afterApply(onCodeAlreadySentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.RestoreView
    /* renamed from: S */
    public void mo14204S() {
        OnPasswordNotMatchCommand onPasswordNotMatchCommand = new OnPasswordNotMatchCommand(this);
        this.viewCommands.beforeApply(onPasswordNotMatchCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RestoreView) it.next()).mo14204S();
        }
        this.viewCommands.afterApply(onPasswordNotMatchCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.RestoreView
    /* renamed from: Z */
    public void mo14205Z() {
        OnPasswordIncorrectCommand onPasswordIncorrectCommand = new OnPasswordIncorrectCommand(this);
        this.viewCommands.beforeApply(onPasswordIncorrectCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RestoreView) it.next()).mo14205Z();
        }
        this.viewCommands.afterApply(onPasswordIncorrectCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.RestoreView
    /* renamed from: Z0 */
    public void mo14206Z0() {
        OnCodeCannotSendCommand onCodeCannotSendCommand = new OnCodeCannotSendCommand(this);
        this.viewCommands.beforeApply(onCodeCannotSendCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RestoreView) it.next()).mo14206Z0();
        }
        this.viewCommands.afterApply(onCodeCannotSendCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.RestoreView
    /* renamed from: f3 */
    public void mo14207f3() {
        OnDataEmptyCommand onDataEmptyCommand = new OnDataEmptyCommand(this);
        this.viewCommands.beforeApply(onDataEmptyCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RestoreView) it.next()).mo14207f3();
        }
        this.viewCommands.afterApply(onDataEmptyCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.RestoreView
    /* renamed from: h */
    public void mo14208h() {
        OnShowLoadingViewCommand onShowLoadingViewCommand = new OnShowLoadingViewCommand(this);
        this.viewCommands.beforeApply(onShowLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RestoreView) it.next()).mo14208h();
        }
        this.viewCommands.afterApply(onShowLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.RestoreView
    /* renamed from: j */
    public void mo14209j() {
        OnHideLoadingViewCommand onHideLoadingViewCommand = new OnHideLoadingViewCommand(this);
        this.viewCommands.beforeApply(onHideLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RestoreView) it.next()).mo14209j();
        }
        this.viewCommands.afterApply(onHideLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.RestoreView
    /* renamed from: k0 */
    public void mo14210k0() {
        OnProfileNotFoundCommand onProfileNotFoundCommand = new OnProfileNotFoundCommand(this);
        this.viewCommands.beforeApply(onProfileNotFoundCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RestoreView) it.next()).mo14210k0();
        }
        this.viewCommands.afterApply(onProfileNotFoundCommand);
    }
}
