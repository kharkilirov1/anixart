package com.swiftsoft.anixartd.presentation.main.filtered;

import com.swiftsoft.anixartd.database.entity.Release;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class FilteredView$$State extends MvpViewState<FilteredView> implements FilteredView {

    /* compiled from: FilteredView$$State.java */
    public class OnFailedCommand extends ViewCommand<FilteredView> {
        public OnFailedCommand(FilteredView$$State filteredView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(FilteredView filteredView) {
            filteredView.mo14646c();
        }
    }

    /* compiled from: FilteredView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<FilteredView> {
        public OnHideProgressViewCommand(FilteredView$$State filteredView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(FilteredView filteredView) {
            filteredView.mo14644a();
        }
    }

    /* compiled from: FilteredView$$State.java */
    public class OnReleaseCommand extends ViewCommand<FilteredView> {

        /* renamed from: a */
        public final Release f26400a;

        public OnReleaseCommand(FilteredView$$State filteredView$$State, Release release) {
            super("onRelease", OneExecutionStateStrategy.class);
            this.f26400a = release;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(FilteredView filteredView) {
            filteredView.mo14647i(this.f26400a);
        }
    }

    /* compiled from: FilteredView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<FilteredView> {
        public OnShowProgressViewCommand(FilteredView$$State filteredView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(FilteredView filteredView) {
            filteredView.mo14645b();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.filtered.FilteredView
    /* renamed from: a */
    public void mo14644a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((FilteredView) it.next()).mo14644a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.filtered.FilteredView
    /* renamed from: b */
    public void mo14645b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((FilteredView) it.next()).mo14645b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.filtered.FilteredView
    /* renamed from: c */
    public void mo14646c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((FilteredView) it.next()).mo14646c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.filtered.FilteredView
    /* renamed from: i */
    public void mo14647i(Release release) {
        OnReleaseCommand onReleaseCommand = new OnReleaseCommand(this, release);
        this.viewCommands.beforeApply(onReleaseCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((FilteredView) it.next()).mo14647i(release);
        }
        this.viewCommands.afterApply(onReleaseCommand);
    }
}
