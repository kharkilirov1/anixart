package com.swiftsoft.anixartd.presentation.main.filter;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;

/* loaded from: classes2.dex */
public class FilterView$$State extends MvpViewState<FilterView> implements FilterView {

    /* compiled from: FilterView$$State.java */
    public class OnFilterLoadedCommand extends ViewCommand<FilterView> {
        public OnFilterLoadedCommand(FilterView$$State filterView$$State) {
            super("onFilterLoaded", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(FilterView filterView) {
            filterView.mo14641e2();
        }
    }

    /* compiled from: FilterView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<FilterView> {
        public OnHideProgressViewCommand(FilterView$$State filterView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(FilterView filterView) {
            filterView.mo14639a();
        }
    }

    /* compiled from: FilterView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<FilterView> {
        public OnShowProgressViewCommand(FilterView$$State filterView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(FilterView filterView) {
            filterView.mo14640b();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.filter.FilterView
    /* renamed from: a */
    public void mo14639a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((FilterView) it.next()).mo14639a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.filter.FilterView
    /* renamed from: b */
    public void mo14640b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((FilterView) it.next()).mo14640b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.filter.FilterView
    /* renamed from: e2 */
    public void mo14641e2() {
        OnFilterLoadedCommand onFilterLoadedCommand = new OnFilterLoadedCommand(this);
        this.viewCommands.beforeApply(onFilterLoadedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((FilterView) it.next()).mo14641e2();
        }
        this.viewCommands.afterApply(onFilterLoadedCommand);
    }
}
