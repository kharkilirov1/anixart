package com.swiftsoft.anixartd.presentation.main.home;

import com.swiftsoft.anixartd.database.entity.Release;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class HomeTabView$$State extends MvpViewState<HomeTabView> implements HomeTabView {

    /* compiled from: HomeTabView$$State.java */
    public class OnFailedCommand extends ViewCommand<HomeTabView> {

        /* renamed from: a */
        public final String f26445a;

        public OnFailedCommand(HomeTabView$$State homeTabView$$State, String str) {
            super("onFailed", OneExecutionStateStrategy.class);
            this.f26445a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(HomeTabView homeTabView) {
            homeTabView.mo14686c1(this.f26445a);
        }
    }

    /* compiled from: HomeTabView$$State.java */
    public class OnFullVersionCommand extends ViewCommand<HomeTabView> {
        public OnFullVersionCommand(HomeTabView$$State homeTabView$$State) {
            super("onFullVersion", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(HomeTabView homeTabView) {
            homeTabView.mo14681T();
        }
    }

    /* compiled from: HomeTabView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<HomeTabView> {
        public OnHideProgressViewCommand(HomeTabView$$State homeTabView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(HomeTabView homeTabView) {
            homeTabView.mo14683a();
        }
    }

    /* compiled from: HomeTabView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<HomeTabView> {
        public OnHideRefreshViewCommand(HomeTabView$$State homeTabView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(HomeTabView homeTabView) {
            homeTabView.mo14688e();
        }
    }

    /* compiled from: HomeTabView$$State.java */
    public class OnHomeTabCommand extends ViewCommand<HomeTabView> {
        public OnHomeTabCommand(HomeTabView$$State homeTabView$$State) {
            super("onHomeTab", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(HomeTabView homeTabView) {
            homeTabView.mo14680L1();
        }
    }

    /* compiled from: HomeTabView$$State.java */
    public class OnImpMessageOpenLinkCommand extends ViewCommand<HomeTabView> {

        /* renamed from: a */
        public final String f26446a;

        public OnImpMessageOpenLinkCommand(HomeTabView$$State homeTabView$$State, String str) {
            super("onImpMessageOpenLink", OneExecutionStateStrategy.class);
            this.f26446a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(HomeTabView homeTabView) {
            homeTabView.mo14684a0(this.f26446a);
        }
    }

    /* compiled from: HomeTabView$$State.java */
    public class OnReleaseCommand extends ViewCommand<HomeTabView> {

        /* renamed from: a */
        public final Release f26447a;

        public OnReleaseCommand(HomeTabView$$State homeTabView$$State, Release release) {
            super("onRelease", OneExecutionStateStrategy.class);
            this.f26447a = release;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(HomeTabView homeTabView) {
            homeTabView.mo14689i(this.f26447a);
        }
    }

    /* compiled from: HomeTabView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<HomeTabView> {
        public OnShowProgressViewCommand(HomeTabView$$State homeTabView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(HomeTabView homeTabView) {
            homeTabView.mo14685b();
        }
    }

    /* compiled from: HomeTabView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<HomeTabView> {
        public OnShowRefreshViewCommand(HomeTabView$$State homeTabView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(HomeTabView homeTabView) {
            homeTabView.mo14687d();
        }
    }

    /* compiled from: HomeTabView$$State.java */
    public class OnUpdateCommand extends ViewCommand<HomeTabView> {
        public OnUpdateCommand(HomeTabView$$State homeTabView$$State) {
            super("onUpdate", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(HomeTabView homeTabView) {
            homeTabView.mo14682V();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.HomeTabView
    /* renamed from: L1 */
    public void mo14680L1() {
        OnHomeTabCommand onHomeTabCommand = new OnHomeTabCommand(this);
        this.viewCommands.beforeApply(onHomeTabCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((HomeTabView) it.next()).mo14680L1();
        }
        this.viewCommands.afterApply(onHomeTabCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.HomeTabView
    /* renamed from: T */
    public void mo14681T() {
        OnFullVersionCommand onFullVersionCommand = new OnFullVersionCommand(this);
        this.viewCommands.beforeApply(onFullVersionCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((HomeTabView) it.next()).mo14681T();
        }
        this.viewCommands.afterApply(onFullVersionCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.HomeTabView
    /* renamed from: V */
    public void mo14682V() {
        OnUpdateCommand onUpdateCommand = new OnUpdateCommand(this);
        this.viewCommands.beforeApply(onUpdateCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((HomeTabView) it.next()).mo14682V();
        }
        this.viewCommands.afterApply(onUpdateCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.HomeTabView
    /* renamed from: a */
    public void mo14683a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((HomeTabView) it.next()).mo14683a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.HomeTabView
    /* renamed from: a0 */
    public void mo14684a0(String str) {
        OnImpMessageOpenLinkCommand onImpMessageOpenLinkCommand = new OnImpMessageOpenLinkCommand(this, str);
        this.viewCommands.beforeApply(onImpMessageOpenLinkCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((HomeTabView) it.next()).mo14684a0(str);
        }
        this.viewCommands.afterApply(onImpMessageOpenLinkCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.HomeTabView
    /* renamed from: b */
    public void mo14685b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((HomeTabView) it.next()).mo14685b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.HomeTabView
    /* renamed from: c1 */
    public void mo14686c1(String str) {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this, str);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((HomeTabView) it.next()).mo14686c1(str);
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.HomeTabView
    /* renamed from: d */
    public void mo14687d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((HomeTabView) it.next()).mo14687d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.HomeTabView
    /* renamed from: e */
    public void mo14688e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((HomeTabView) it.next()).mo14688e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.HomeTabView
    /* renamed from: i */
    public void mo14689i(Release release) {
        OnReleaseCommand onReleaseCommand = new OnReleaseCommand(this, release);
        this.viewCommands.beforeApply(onReleaseCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((HomeTabView) it.next()).mo14689i(release);
        }
        this.viewCommands.afterApply(onReleaseCommand);
    }
}
