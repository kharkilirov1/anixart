package com.swiftsoft.anixartd.presentation.main.top;

import com.swiftsoft.anixartd.database.entity.Release;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class TopTabView$$State extends MvpViewState<TopTabView> implements TopTabView {

    /* compiled from: TopTabView$$State.java */
    public class OnFailedCommand extends ViewCommand<TopTabView> {
        public OnFailedCommand(TopTabView$$State topTabView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(TopTabView topTabView) {
            topTabView.mo15246c();
        }
    }

    /* compiled from: TopTabView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<TopTabView> {
        public OnHideProgressViewCommand(TopTabView$$State topTabView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(TopTabView topTabView) {
            topTabView.mo15244a();
        }
    }

    /* compiled from: TopTabView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<TopTabView> {
        public OnHideRefreshViewCommand(TopTabView$$State topTabView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(TopTabView topTabView) {
            topTabView.mo15248e();
        }
    }

    /* compiled from: TopTabView$$State.java */
    public class OnReleaseCommand extends ViewCommand<TopTabView> {

        /* renamed from: a */
        public final Release f27271a;

        public OnReleaseCommand(TopTabView$$State topTabView$$State, Release release) {
            super("onRelease", OneExecutionStateStrategy.class);
            this.f27271a = release;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(TopTabView topTabView) {
            topTabView.mo15249i(this.f27271a);
        }
    }

    /* compiled from: TopTabView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<TopTabView> {
        public OnShowProgressViewCommand(TopTabView$$State topTabView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(TopTabView topTabView) {
            topTabView.mo15245b();
        }
    }

    /* compiled from: TopTabView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<TopTabView> {
        public OnShowRefreshViewCommand(TopTabView$$State topTabView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(TopTabView topTabView) {
            topTabView.mo15247d();
        }
    }

    /* compiled from: TopTabView$$State.java */
    public class OnTopTabCommand extends ViewCommand<TopTabView> {
        public OnTopTabCommand(TopTabView$$State topTabView$$State) {
            super("onTopTab", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(TopTabView topTabView) {
            topTabView.mo15243K3();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.top.TopTabView
    /* renamed from: K3 */
    public void mo15243K3() {
        OnTopTabCommand onTopTabCommand = new OnTopTabCommand(this);
        this.viewCommands.beforeApply(onTopTabCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((TopTabView) it.next()).mo15243K3();
        }
        this.viewCommands.afterApply(onTopTabCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.top.TopTabView
    /* renamed from: a */
    public void mo15244a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((TopTabView) it.next()).mo15244a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.top.TopTabView
    /* renamed from: b */
    public void mo15245b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((TopTabView) it.next()).mo15245b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.top.TopTabView
    /* renamed from: c */
    public void mo15246c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((TopTabView) it.next()).mo15246c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.top.TopTabView
    /* renamed from: d */
    public void mo15247d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((TopTabView) it.next()).mo15247d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.top.TopTabView
    /* renamed from: e */
    public void mo15248e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((TopTabView) it.next()).mo15248e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.top.TopTabView
    /* renamed from: i */
    public void mo15249i(Release release) {
        OnReleaseCommand onReleaseCommand = new OnReleaseCommand(this, release);
        this.viewCommands.beforeApply(onReleaseCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((TopTabView) it.next()).mo15249i(release);
        }
        this.viewCommands.afterApply(onReleaseCommand);
    }
}
