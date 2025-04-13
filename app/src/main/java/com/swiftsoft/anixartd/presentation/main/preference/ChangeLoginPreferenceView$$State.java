package com.swiftsoft.anixartd.presentation.main.preference;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ChangeLoginPreferenceView$$State extends MvpViewState<ChangeLoginPreferenceView> implements ChangeLoginPreferenceView {

    /* compiled from: ChangeLoginPreferenceView$$State.java */
    public class OnChangeCommand extends ViewCommand<ChangeLoginPreferenceView> {
        public OnChangeCommand(ChangeLoginPreferenceView$$State changeLoginPreferenceView$$State) {
            super("onChange", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ChangeLoginPreferenceView changeLoginPreferenceView) {
            changeLoginPreferenceView.mo14736F0();
        }
    }

    /* compiled from: ChangeLoginPreferenceView$$State.java */
    public class OnFailedCommand extends ViewCommand<ChangeLoginPreferenceView> {
        public OnFailedCommand(ChangeLoginPreferenceView$$State changeLoginPreferenceView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ChangeLoginPreferenceView changeLoginPreferenceView) {
            changeLoginPreferenceView.mo14739c();
        }
    }

    /* compiled from: ChangeLoginPreferenceView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ChangeLoginPreferenceView> {
        public OnHideProgressViewCommand(ChangeLoginPreferenceView$$State changeLoginPreferenceView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ChangeLoginPreferenceView changeLoginPreferenceView) {
            changeLoginPreferenceView.mo14737a();
        }
    }

    /* compiled from: ChangeLoginPreferenceView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<ChangeLoginPreferenceView> {
        public OnHideRefreshViewCommand(ChangeLoginPreferenceView$$State changeLoginPreferenceView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ChangeLoginPreferenceView changeLoginPreferenceView) {
            changeLoginPreferenceView.mo14741e();
        }
    }

    /* compiled from: ChangeLoginPreferenceView$$State.java */
    public class OnLoginAlreadyTakenCommand extends ViewCommand<ChangeLoginPreferenceView> {
        public OnLoginAlreadyTakenCommand(ChangeLoginPreferenceView$$State changeLoginPreferenceView$$State) {
            super("onLoginAlreadyTaken", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ChangeLoginPreferenceView changeLoginPreferenceView) {
            changeLoginPreferenceView.mo14744y();
        }
    }

    /* compiled from: ChangeLoginPreferenceView$$State.java */
    public class OnLoginChangedCommand extends ViewCommand<ChangeLoginPreferenceView> {
        public OnLoginChangedCommand(ChangeLoginPreferenceView$$State changeLoginPreferenceView$$State) {
            super("onLoginChanged", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ChangeLoginPreferenceView changeLoginPreferenceView) {
            changeLoginPreferenceView.mo14743w2();
        }
    }

    /* compiled from: ChangeLoginPreferenceView$$State.java */
    public class OnLoginInvalidCommand extends ViewCommand<ChangeLoginPreferenceView> {
        public OnLoginInvalidCommand(ChangeLoginPreferenceView$$State changeLoginPreferenceView$$State) {
            super("onLoginInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ChangeLoginPreferenceView changeLoginPreferenceView) {
            changeLoginPreferenceView.mo14742r();
        }
    }

    /* compiled from: ChangeLoginPreferenceView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ChangeLoginPreferenceView> {
        public OnShowProgressViewCommand(ChangeLoginPreferenceView$$State changeLoginPreferenceView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ChangeLoginPreferenceView changeLoginPreferenceView) {
            changeLoginPreferenceView.mo14738b();
        }
    }

    /* compiled from: ChangeLoginPreferenceView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<ChangeLoginPreferenceView> {
        public OnShowRefreshViewCommand(ChangeLoginPreferenceView$$State changeLoginPreferenceView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ChangeLoginPreferenceView changeLoginPreferenceView) {
            changeLoginPreferenceView.mo14740d();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferenceView
    /* renamed from: F0 */
    public void mo14736F0() {
        OnChangeCommand onChangeCommand = new OnChangeCommand(this);
        this.viewCommands.beforeApply(onChangeCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ChangeLoginPreferenceView) it.next()).mo14736F0();
        }
        this.viewCommands.afterApply(onChangeCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferenceView
    /* renamed from: a */
    public void mo14737a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ChangeLoginPreferenceView) it.next()).mo14737a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferenceView
    /* renamed from: b */
    public void mo14738b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ChangeLoginPreferenceView) it.next()).mo14738b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferenceView
    /* renamed from: c */
    public void mo14739c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ChangeLoginPreferenceView) it.next()).mo14739c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferenceView
    /* renamed from: d */
    public void mo14740d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ChangeLoginPreferenceView) it.next()).mo14740d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferenceView
    /* renamed from: e */
    public void mo14741e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ChangeLoginPreferenceView) it.next()).mo14741e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferenceView
    /* renamed from: r */
    public void mo14742r() {
        OnLoginInvalidCommand onLoginInvalidCommand = new OnLoginInvalidCommand(this);
        this.viewCommands.beforeApply(onLoginInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ChangeLoginPreferenceView) it.next()).mo14742r();
        }
        this.viewCommands.afterApply(onLoginInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferenceView
    /* renamed from: w2 */
    public void mo14743w2() {
        OnLoginChangedCommand onLoginChangedCommand = new OnLoginChangedCommand(this);
        this.viewCommands.beforeApply(onLoginChangedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ChangeLoginPreferenceView) it.next()).mo14743w2();
        }
        this.viewCommands.afterApply(onLoginChangedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferenceView
    /* renamed from: y */
    public void mo14744y() {
        OnLoginAlreadyTakenCommand onLoginAlreadyTakenCommand = new OnLoginAlreadyTakenCommand(this);
        this.viewCommands.beforeApply(onLoginAlreadyTakenCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ChangeLoginPreferenceView) it.next()).mo14744y();
        }
        this.viewCommands.afterApply(onLoginAlreadyTakenCommand);
    }
}
