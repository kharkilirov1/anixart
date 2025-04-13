package com.swiftsoft.anixartd.presentation.main.notifications;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class NotificationsPreferenceView$$State extends MvpViewState<NotificationsPreferenceView> implements NotificationsPreferenceView {

    /* compiled from: NotificationsPreferenceView$$State.java */
    public class OnFailedCommand extends ViewCommand<NotificationsPreferenceView> {
        public OnFailedCommand(NotificationsPreferenceView$$State notificationsPreferenceView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(NotificationsPreferenceView notificationsPreferenceView) {
            notificationsPreferenceView.mo14703c();
        }
    }

    /* compiled from: NotificationsPreferenceView$$State.java */
    public class OnHideLoadingViewCommand extends ViewCommand<NotificationsPreferenceView> {
        public OnHideLoadingViewCommand(NotificationsPreferenceView$$State notificationsPreferenceView$$State) {
            super("onHideLoadingView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(NotificationsPreferenceView notificationsPreferenceView) {
            notificationsPreferenceView.mo14705j();
        }
    }

    /* compiled from: NotificationsPreferenceView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<NotificationsPreferenceView> {
        public OnHideProgressViewCommand(NotificationsPreferenceView$$State notificationsPreferenceView$$State) {
            super("onHideProgressView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(NotificationsPreferenceView notificationsPreferenceView) {
            notificationsPreferenceView.mo14701a();
        }
    }

    /* compiled from: NotificationsPreferenceView$$State.java */
    public class OnPreferenceLoadedCommand extends ViewCommand<NotificationsPreferenceView> {
        public OnPreferenceLoadedCommand(NotificationsPreferenceView$$State notificationsPreferenceView$$State) {
            super("onPreferenceLoaded", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(NotificationsPreferenceView notificationsPreferenceView) {
            notificationsPreferenceView.mo14700X2();
        }
    }

    /* compiled from: NotificationsPreferenceView$$State.java */
    public class OnShowLoadingViewCommand extends ViewCommand<NotificationsPreferenceView> {
        public OnShowLoadingViewCommand(NotificationsPreferenceView$$State notificationsPreferenceView$$State) {
            super("onShowLoadingView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(NotificationsPreferenceView notificationsPreferenceView) {
            notificationsPreferenceView.mo14704h();
        }
    }

    /* compiled from: NotificationsPreferenceView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<NotificationsPreferenceView> {
        public OnShowProgressViewCommand(NotificationsPreferenceView$$State notificationsPreferenceView$$State) {
            super("onShowProgressView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(NotificationsPreferenceView notificationsPreferenceView) {
            notificationsPreferenceView.mo14702b();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferenceView
    /* renamed from: X2 */
    public void mo14700X2() {
        OnPreferenceLoadedCommand onPreferenceLoadedCommand = new OnPreferenceLoadedCommand(this);
        this.viewCommands.beforeApply(onPreferenceLoadedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((NotificationsPreferenceView) it.next()).mo14700X2();
        }
        this.viewCommands.afterApply(onPreferenceLoadedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferenceView
    /* renamed from: a */
    public void mo14701a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((NotificationsPreferenceView) it.next()).mo14701a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferenceView
    /* renamed from: b */
    public void mo14702b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((NotificationsPreferenceView) it.next()).mo14702b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferenceView
    /* renamed from: c */
    public void mo14703c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((NotificationsPreferenceView) it.next()).mo14703c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferenceView
    /* renamed from: h */
    public void mo14704h() {
        OnShowLoadingViewCommand onShowLoadingViewCommand = new OnShowLoadingViewCommand(this);
        this.viewCommands.beforeApply(onShowLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((NotificationsPreferenceView) it.next()).mo14704h();
        }
        this.viewCommands.afterApply(onShowLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferenceView
    /* renamed from: j */
    public void mo14705j() {
        OnHideLoadingViewCommand onHideLoadingViewCommand = new OnHideLoadingViewCommand(this);
        this.viewCommands.beforeApply(onHideLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((NotificationsPreferenceView) it.next()).mo14705j();
        }
        this.viewCommands.afterApply(onHideLoadingViewCommand);
    }
}
