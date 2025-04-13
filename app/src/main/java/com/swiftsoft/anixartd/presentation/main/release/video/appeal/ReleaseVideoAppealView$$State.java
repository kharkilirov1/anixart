package com.swiftsoft.anixartd.presentation.main.release.video.appeal;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ReleaseVideoAppealView$$State extends MvpViewState<ReleaseVideoAppealView> implements ReleaseVideoAppealView {

    /* compiled from: ReleaseVideoAppealView$$State.java */
    public class OnAppealAlreadySentCommand extends ViewCommand<ReleaseVideoAppealView> {
        public OnAppealAlreadySentCommand(ReleaseVideoAppealView$$State releaseVideoAppealView$$State) {
            super("onAppealAlreadySent", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideoAppealView releaseVideoAppealView) {
            releaseVideoAppealView.mo15172Q1();
        }
    }

    /* compiled from: ReleaseVideoAppealView$$State.java */
    public class OnAppealCommand extends ViewCommand<ReleaseVideoAppealView> {
        public OnAppealCommand(ReleaseVideoAppealView$$State releaseVideoAppealView$$State) {
            super("onAppeal", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideoAppealView releaseVideoAppealView) {
            releaseVideoAppealView.mo15178d4();
        }
    }

    /* compiled from: ReleaseVideoAppealView$$State.java */
    public class OnCategoriesCommand extends ViewCommand<ReleaseVideoAppealView> {
        public OnCategoriesCommand(ReleaseVideoAppealView$$State releaseVideoAppealView$$State) {
            super("onCategories", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideoAppealView releaseVideoAppealView) {
            releaseVideoAppealView.mo15174V1();
        }
    }

    /* compiled from: ReleaseVideoAppealView$$State.java */
    public class OnFailedCommand extends ViewCommand<ReleaseVideoAppealView> {
        public OnFailedCommand(ReleaseVideoAppealView$$State releaseVideoAppealView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideoAppealView releaseVideoAppealView) {
            releaseVideoAppealView.mo15177c();
        }
    }

    /* compiled from: ReleaseVideoAppealView$$State.java */
    public class OnHideLoadingCommand extends ViewCommand<ReleaseVideoAppealView> {
        public OnHideLoadingCommand(ReleaseVideoAppealView$$State releaseVideoAppealView$$State) {
            super("onHideLoading", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideoAppealView releaseVideoAppealView) {
            releaseVideoAppealView.mo15180p();
        }
    }

    /* compiled from: ReleaseVideoAppealView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ReleaseVideoAppealView> {
        public OnHideProgressViewCommand(ReleaseVideoAppealView$$State releaseVideoAppealView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideoAppealView releaseVideoAppealView) {
            releaseVideoAppealView.mo15175a();
        }
    }

    /* compiled from: ReleaseVideoAppealView$$State.java */
    public class OnLoadingCommand extends ViewCommand<ReleaseVideoAppealView> {
        public OnLoadingCommand(ReleaseVideoAppealView$$State releaseVideoAppealView$$State) {
            super("onLoading", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideoAppealView releaseVideoAppealView) {
            releaseVideoAppealView.mo15181q();
        }
    }

    /* compiled from: ReleaseVideoAppealView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ReleaseVideoAppealView> {
        public OnShowProgressViewCommand(ReleaseVideoAppealView$$State releaseVideoAppealView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideoAppealView releaseVideoAppealView) {
            releaseVideoAppealView.mo15176b();
        }
    }

    /* compiled from: ReleaseVideoAppealView$$State.java */
    public class OnTitleInvalidCommand extends ViewCommand<ReleaseVideoAppealView> {
        public OnTitleInvalidCommand(ReleaseVideoAppealView$$State releaseVideoAppealView$$State) {
            super("onTitleInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideoAppealView releaseVideoAppealView) {
            releaseVideoAppealView.mo15173V0();
        }
    }

    /* compiled from: ReleaseVideoAppealView$$State.java */
    public class OnTooManyAppealsCommand extends ViewCommand<ReleaseVideoAppealView> {
        public OnTooManyAppealsCommand(ReleaseVideoAppealView$$State releaseVideoAppealView$$State) {
            super("onTooManyAppeals", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideoAppealView releaseVideoAppealView) {
            releaseVideoAppealView.mo15171N2();
        }
    }

    /* compiled from: ReleaseVideoAppealView$$State.java */
    public class OnUrlInvalidCommand extends ViewCommand<ReleaseVideoAppealView> {
        public OnUrlInvalidCommand(ReleaseVideoAppealView$$State releaseVideoAppealView$$State) {
            super("onUrlInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideoAppealView releaseVideoAppealView) {
            releaseVideoAppealView.mo15179k4();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealView
    /* renamed from: N2 */
    public void mo15171N2() {
        OnTooManyAppealsCommand onTooManyAppealsCommand = new OnTooManyAppealsCommand(this);
        this.viewCommands.beforeApply(onTooManyAppealsCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideoAppealView) it.next()).mo15171N2();
        }
        this.viewCommands.afterApply(onTooManyAppealsCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealView
    /* renamed from: Q1 */
    public void mo15172Q1() {
        OnAppealAlreadySentCommand onAppealAlreadySentCommand = new OnAppealAlreadySentCommand(this);
        this.viewCommands.beforeApply(onAppealAlreadySentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideoAppealView) it.next()).mo15172Q1();
        }
        this.viewCommands.afterApply(onAppealAlreadySentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealView
    /* renamed from: V0 */
    public void mo15173V0() {
        OnTitleInvalidCommand onTitleInvalidCommand = new OnTitleInvalidCommand(this);
        this.viewCommands.beforeApply(onTitleInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideoAppealView) it.next()).mo15173V0();
        }
        this.viewCommands.afterApply(onTitleInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealView
    /* renamed from: V1 */
    public void mo15174V1() {
        OnCategoriesCommand onCategoriesCommand = new OnCategoriesCommand(this);
        this.viewCommands.beforeApply(onCategoriesCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideoAppealView) it.next()).mo15174V1();
        }
        this.viewCommands.afterApply(onCategoriesCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealView
    /* renamed from: a */
    public void mo15175a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideoAppealView) it.next()).mo15175a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealView
    /* renamed from: b */
    public void mo15176b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideoAppealView) it.next()).mo15176b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealView
    /* renamed from: c */
    public void mo15177c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideoAppealView) it.next()).mo15177c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealView
    /* renamed from: d4 */
    public void mo15178d4() {
        OnAppealCommand onAppealCommand = new OnAppealCommand(this);
        this.viewCommands.beforeApply(onAppealCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideoAppealView) it.next()).mo15178d4();
        }
        this.viewCommands.afterApply(onAppealCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealView
    /* renamed from: k4 */
    public void mo15179k4() {
        OnUrlInvalidCommand onUrlInvalidCommand = new OnUrlInvalidCommand(this);
        this.viewCommands.beforeApply(onUrlInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideoAppealView) it.next()).mo15179k4();
        }
        this.viewCommands.afterApply(onUrlInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealView
    /* renamed from: p */
    public void mo15180p() {
        OnHideLoadingCommand onHideLoadingCommand = new OnHideLoadingCommand(this);
        this.viewCommands.beforeApply(onHideLoadingCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideoAppealView) it.next()).mo15180p();
        }
        this.viewCommands.afterApply(onHideLoadingCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealView
    /* renamed from: q */
    public void mo15181q() {
        OnLoadingCommand onLoadingCommand = new OnLoadingCommand(this);
        this.viewCommands.beforeApply(onLoadingCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideoAppealView) it.next()).mo15181q();
        }
        this.viewCommands.afterApply(onLoadingCommand);
    }
}
