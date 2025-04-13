package com.swiftsoft.anixartd.presentation.main.genres;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ChooseGenresView$$State extends MvpViewState<ChooseGenresView> implements ChooseGenresView {

    /* compiled from: ChooseGenresView$$State.java */
    public class OnCheckOrUncheckCommand extends ViewCommand<ChooseGenresView> {
        public OnCheckOrUncheckCommand(ChooseGenresView$$State chooseGenresView$$State) {
            super("onCheckOrUncheck", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ChooseGenresView chooseGenresView) {
            chooseGenresView.mo14650W1();
        }
    }

    /* compiled from: ChooseGenresView$$State.java */
    public class OnFailedCommand extends ViewCommand<ChooseGenresView> {
        public OnFailedCommand(ChooseGenresView$$State chooseGenresView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ChooseGenresView chooseGenresView) {
            chooseGenresView.mo14651c();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.genres.ChooseGenresView
    /* renamed from: W1 */
    public void mo14650W1() {
        OnCheckOrUncheckCommand onCheckOrUncheckCommand = new OnCheckOrUncheckCommand(this);
        this.viewCommands.beforeApply(onCheckOrUncheckCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ChooseGenresView) it.next()).mo14650W1();
        }
        this.viewCommands.afterApply(onCheckOrUncheckCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.genres.ChooseGenresView
    /* renamed from: c */
    public void mo14651c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ChooseGenresView) it.next()).mo14651c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }
}
