package com.swiftsoft.anixartd.presentation.main.schedule;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ScheduleView$$State extends MvpViewState<ScheduleView> implements ScheduleView {

    /* compiled from: ScheduleView$$State.java */
    public class OnFailedCommand extends ViewCommand<ScheduleView> {
        public OnFailedCommand(ScheduleView$$State scheduleView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ScheduleView scheduleView) {
            scheduleView.mo15208c();
        }
    }

    /* compiled from: ScheduleView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ScheduleView> {
        public OnHideProgressViewCommand(ScheduleView$$State scheduleView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ScheduleView scheduleView) {
            scheduleView.mo15206a();
        }
    }

    /* compiled from: ScheduleView$$State.java */
    public class OnReleaseCommand extends ViewCommand<ScheduleView> {

        /* renamed from: a */
        public final long f27204a;

        public OnReleaseCommand(ScheduleView$$State scheduleView$$State, long j2) {
            super("onRelease", OneExecutionStateStrategy.class);
            this.f27204a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ScheduleView scheduleView) {
            scheduleView.mo15209g(this.f27204a);
        }
    }

    /* compiled from: ScheduleView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ScheduleView> {
        public OnShowProgressViewCommand(ScheduleView$$State scheduleView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ScheduleView scheduleView) {
            scheduleView.mo15207b();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.schedule.ScheduleView
    /* renamed from: a */
    public void mo15206a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ScheduleView) it.next()).mo15206a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.schedule.ScheduleView
    /* renamed from: b */
    public void mo15207b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ScheduleView) it.next()).mo15207b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.schedule.ScheduleView
    /* renamed from: c */
    public void mo15208c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ScheduleView) it.next()).mo15208c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.schedule.ScheduleView
    /* renamed from: g */
    public void mo15209g(long j2) {
        OnReleaseCommand onReleaseCommand = new OnReleaseCommand(this, j2);
        this.viewCommands.beforeApply(onReleaseCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ScheduleView) it.next()).mo15209g(j2);
        }
        this.viewCommands.afterApply(onReleaseCommand);
    }
}
