package com.swiftsoft.anixartd.presentation.main.watching;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class WatchingView$$State extends MvpViewState<WatchingView> implements WatchingView {

    /* compiled from: WatchingView$$State.java */
    public class OnFailedCommand extends ViewCommand<WatchingView> {
        public OnFailedCommand(WatchingView$$State watchingView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(WatchingView watchingView) {
            watchingView.mo15259c();
        }
    }

    /* compiled from: WatchingView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<WatchingView> {
        public OnHideProgressViewCommand(WatchingView$$State watchingView$$State) {
            super("onHideProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(WatchingView watchingView) {
            watchingView.mo15257a();
        }
    }

    /* compiled from: WatchingView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<WatchingView> {
        public OnHideRefreshViewCommand(WatchingView$$State watchingView$$State) {
            super("onHideRefreshView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(WatchingView watchingView) {
            watchingView.mo15261e();
        }
    }

    /* compiled from: WatchingView$$State.java */
    public class OnReleaseCommand extends ViewCommand<WatchingView> {

        /* renamed from: a */
        public final long f27297a;

        public OnReleaseCommand(WatchingView$$State watchingView$$State, long j2) {
            super("onRelease", OneExecutionStateStrategy.class);
            this.f27297a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(WatchingView watchingView) {
            watchingView.mo15262g(this.f27297a);
        }
    }

    /* compiled from: WatchingView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<WatchingView> {
        public OnShowProgressViewCommand(WatchingView$$State watchingView$$State) {
            super("onShowProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(WatchingView watchingView) {
            watchingView.mo15258b();
        }
    }

    /* compiled from: WatchingView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<WatchingView> {
        public OnShowRefreshViewCommand(WatchingView$$State watchingView$$State) {
            super("onShowRefreshView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(WatchingView watchingView) {
            watchingView.mo15260d();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.watching.WatchingView
    /* renamed from: a */
    public void mo15257a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((WatchingView) it.next()).mo15257a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.watching.WatchingView
    /* renamed from: b */
    public void mo15258b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((WatchingView) it.next()).mo15258b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.watching.WatchingView
    /* renamed from: c */
    public void mo15259c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((WatchingView) it.next()).mo15259c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.watching.WatchingView
    /* renamed from: d */
    public void mo15260d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((WatchingView) it.next()).mo15260d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.watching.WatchingView
    /* renamed from: e */
    public void mo15261e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((WatchingView) it.next()).mo15261e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.watching.WatchingView
    /* renamed from: g */
    public void mo15262g(long j2) {
        OnReleaseCommand onReleaseCommand = new OnReleaseCommand(this, j2);
        this.viewCommands.beforeApply(onReleaseCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((WatchingView) it.next()).mo15262g(j2);
        }
        this.viewCommands.afterApply(onReleaseCommand);
    }
}
