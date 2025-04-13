package com.swiftsoft.anixartd.presentation.auth;

import moxy.MvpView;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;

/* loaded from: classes2.dex */
public class AuthPresenter$$ViewStateProvider extends ViewStateProvider {
    @Override // moxy.ViewStateProvider
    public MvpViewState<? extends MvpView> getViewState() {
        return new AuthView$$State();
    }
}
