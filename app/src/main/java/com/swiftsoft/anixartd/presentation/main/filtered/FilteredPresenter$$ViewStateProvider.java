package com.swiftsoft.anixartd.presentation.main.filtered;

import moxy.MvpView;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;

/* loaded from: classes2.dex */
public class FilteredPresenter$$ViewStateProvider extends ViewStateProvider {
    @Override // moxy.ViewStateProvider
    public MvpViewState<? extends MvpView> getViewState() {
        return new FilteredView$$State();
    }
}
