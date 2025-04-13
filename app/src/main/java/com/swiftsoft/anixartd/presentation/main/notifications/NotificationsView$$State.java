package com.swiftsoft.anixartd.presentation.main.notifications;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class NotificationsView$$State extends MvpViewState<NotificationsView> implements NotificationsView {

    /* compiled from: NotificationsView$$State.java */
    public class OnCollectionCommentCommand extends ViewCommand<NotificationsView> {

        /* renamed from: a */
        public final long f26494a;

        /* renamed from: b */
        public final long f26495b;

        /* renamed from: c */
        public final Long f26496c;

        public OnCollectionCommentCommand(NotificationsView$$State notificationsView$$State, long j2, long j3, Long l2) {
            super("onCollectionComment", OneExecutionStateStrategy.class);
            this.f26494a = j2;
            this.f26495b = j3;
            this.f26496c = l2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(NotificationsView notificationsView) {
            notificationsView.mo14722S0(this.f26494a, this.f26495b, this.f26496c);
        }
    }

    /* compiled from: NotificationsView$$State.java */
    public class OnFailedCommand extends ViewCommand<NotificationsView> {
        public OnFailedCommand(NotificationsView$$State notificationsView$$State) {
            super("onFailed", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(NotificationsView notificationsView) {
            notificationsView.mo14725c();
        }
    }

    /* compiled from: NotificationsView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<NotificationsView> {
        public OnHideProgressViewCommand(NotificationsView$$State notificationsView$$State) {
            super("onHideProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(NotificationsView notificationsView) {
            notificationsView.mo14723a();
        }
    }

    /* compiled from: NotificationsView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<NotificationsView> {
        public OnHideRefreshViewCommand(NotificationsView$$State notificationsView$$State) {
            super("onHideRefreshView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(NotificationsView notificationsView) {
            notificationsView.mo14727e();
        }
    }

    /* compiled from: NotificationsView$$State.java */
    public class OnLoadedCommand extends ViewCommand<NotificationsView> {
        public OnLoadedCommand(NotificationsView$$State notificationsView$$State) {
            super("onLoaded", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(NotificationsView notificationsView) {
            notificationsView.mo14721O();
        }
    }

    /* compiled from: NotificationsView$$State.java */
    public class OnMoreCommand extends ViewCommand<NotificationsView> {

        /* renamed from: a */
        public final long f26497a;

        public OnMoreCommand(NotificationsView$$State notificationsView$$State, long j2) {
            super("onMore", OneExecutionStateStrategy.class);
            this.f26497a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(NotificationsView notificationsView) {
            notificationsView.mo14731k(this.f26497a);
        }
    }

    /* compiled from: NotificationsView$$State.java */
    public class OnNotificationsPreferenceCommand extends ViewCommand<NotificationsView> {
        public OnNotificationsPreferenceCommand(NotificationsView$$State notificationsView$$State) {
            super("onNotificationsPreference", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(NotificationsView notificationsView) {
            notificationsView.mo14719M0();
        }
    }

    /* compiled from: NotificationsView$$State.java */
    public class OnProfileCommand extends ViewCommand<NotificationsView> {

        /* renamed from: a */
        public final long f26498a;

        public OnProfileCommand(NotificationsView$$State notificationsView$$State, long j2) {
            super("onProfile", OneExecutionStateStrategy.class);
            this.f26498a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(NotificationsView notificationsView) {
            notificationsView.mo14728f(this.f26498a);
        }
    }

    /* compiled from: NotificationsView$$State.java */
    public class OnRefreshAfterFilterCommand extends ViewCommand<NotificationsView> {
        public OnRefreshAfterFilterCommand(NotificationsView$$State notificationsView$$State) {
            super("onRefreshAfterFilter", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(NotificationsView notificationsView) {
            notificationsView.mo14730h2();
        }
    }

    /* compiled from: NotificationsView$$State.java */
    public class OnReleaseCommand extends ViewCommand<NotificationsView> {

        /* renamed from: a */
        public final long f26499a;

        public OnReleaseCommand(NotificationsView$$State notificationsView$$State, long j2) {
            super("onRelease", OneExecutionStateStrategy.class);
            this.f26499a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(NotificationsView notificationsView) {
            notificationsView.mo14729g(this.f26499a);
        }
    }

    /* compiled from: NotificationsView$$State.java */
    public class OnReleaseCommentCommand extends ViewCommand<NotificationsView> {

        /* renamed from: a */
        public final long f26500a;

        /* renamed from: b */
        public final long f26501b;

        /* renamed from: c */
        public final long f26502c;

        public OnReleaseCommentCommand(NotificationsView$$State notificationsView$$State, long j2, long j3, long j4) {
            super("onReleaseComment", OneExecutionStateStrategy.class);
            this.f26500a = j2;
            this.f26501b = j3;
            this.f26502c = j4;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(NotificationsView notificationsView) {
            notificationsView.mo14720N(this.f26500a, this.f26501b, this.f26502c);
        }
    }

    /* compiled from: NotificationsView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<NotificationsView> {
        public OnShowProgressViewCommand(NotificationsView$$State notificationsView$$State) {
            super("onShowProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(NotificationsView notificationsView) {
            notificationsView.mo14724b();
        }
    }

    /* compiled from: NotificationsView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<NotificationsView> {
        public OnShowRefreshViewCommand(NotificationsView$$State notificationsView$$State) {
            super("onShowRefreshView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(NotificationsView notificationsView) {
            notificationsView.mo14726d();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: M0 */
    public void mo14719M0() {
        OnNotificationsPreferenceCommand onNotificationsPreferenceCommand = new OnNotificationsPreferenceCommand(this);
        this.viewCommands.beforeApply(onNotificationsPreferenceCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((NotificationsView) it.next()).mo14719M0();
        }
        this.viewCommands.afterApply(onNotificationsPreferenceCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: N */
    public void mo14720N(long j2, long j3, long j4) {
        OnReleaseCommentCommand onReleaseCommentCommand = new OnReleaseCommentCommand(this, j2, j3, j4);
        this.viewCommands.beforeApply(onReleaseCommentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((NotificationsView) it.next()).mo14720N(j2, j3, j4);
        }
        this.viewCommands.afterApply(onReleaseCommentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: O */
    public void mo14721O() {
        OnLoadedCommand onLoadedCommand = new OnLoadedCommand(this);
        this.viewCommands.beforeApply(onLoadedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((NotificationsView) it.next()).mo14721O();
        }
        this.viewCommands.afterApply(onLoadedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: S0 */
    public void mo14722S0(long j2, long j3, Long l2) {
        OnCollectionCommentCommand onCollectionCommentCommand = new OnCollectionCommentCommand(this, j2, j3, l2);
        this.viewCommands.beforeApply(onCollectionCommentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((NotificationsView) it.next()).mo14722S0(j2, j3, l2);
        }
        this.viewCommands.afterApply(onCollectionCommentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: a */
    public void mo14723a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((NotificationsView) it.next()).mo14723a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: b */
    public void mo14724b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((NotificationsView) it.next()).mo14724b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: c */
    public void mo14725c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((NotificationsView) it.next()).mo14725c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: d */
    public void mo14726d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((NotificationsView) it.next()).mo14726d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: e */
    public void mo14727e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((NotificationsView) it.next()).mo14727e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: f */
    public void mo14728f(long j2) {
        OnProfileCommand onProfileCommand = new OnProfileCommand(this, j2);
        this.viewCommands.beforeApply(onProfileCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((NotificationsView) it.next()).mo14728f(j2);
        }
        this.viewCommands.afterApply(onProfileCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: g */
    public void mo14729g(long j2) {
        OnReleaseCommand onReleaseCommand = new OnReleaseCommand(this, j2);
        this.viewCommands.beforeApply(onReleaseCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((NotificationsView) it.next()).mo14729g(j2);
        }
        this.viewCommands.afterApply(onReleaseCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: h2 */
    public void mo14730h2() {
        OnRefreshAfterFilterCommand onRefreshAfterFilterCommand = new OnRefreshAfterFilterCommand(this);
        this.viewCommands.beforeApply(onRefreshAfterFilterCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((NotificationsView) it.next()).mo14730h2();
        }
        this.viewCommands.afterApply(onRefreshAfterFilterCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: k */
    public void mo14731k(long j2) {
        OnMoreCommand onMoreCommand = new OnMoreCommand(this, j2);
        this.viewCommands.beforeApply(onMoreCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((NotificationsView) it.next()).mo14731k(j2);
        }
        this.viewCommands.afterApply(onMoreCommand);
    }
}
