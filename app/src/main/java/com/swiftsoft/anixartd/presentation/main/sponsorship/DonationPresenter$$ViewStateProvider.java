package com.swiftsoft.anixartd.presentation.main.sponsorship;

import moxy.MvpView;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;

/* loaded from: classes2.dex */
public class DonationPresenter$$ViewStateProvider extends ViewStateProvider {
    @Override // moxy.ViewStateProvider
    public MvpViewState<? extends MvpView> getViewState() {
        return new SponsorshipView$$State();
    }
}
