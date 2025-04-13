package com.swiftsoft.anixartd.presentation.comments;

import moxy.MvpView;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;

/* loaded from: classes2.dex */
public class CommentVotesPresenter$$ViewStateProvider extends ViewStateProvider {
    @Override // moxy.ViewStateProvider
    public MvpViewState<? extends MvpView> getViewState() {
        return new CommentVotesView$$State();
    }
}
