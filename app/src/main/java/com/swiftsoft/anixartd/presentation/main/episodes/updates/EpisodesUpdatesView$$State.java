package com.swiftsoft.anixartd.presentation.main.episodes.updates;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class EpisodesUpdatesView$$State extends MvpViewState<EpisodesUpdatesView> implements EpisodesUpdatesView {

    /* compiled from: EpisodesUpdatesView$$State.java */
    public class OnFailedCommand extends ViewCommand<EpisodesUpdatesView> {
        public OnFailedCommand(EpisodesUpdatesView$$State episodesUpdatesView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesUpdatesView episodesUpdatesView) {
            episodesUpdatesView.mo14635c();
        }
    }

    /* compiled from: EpisodesUpdatesView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<EpisodesUpdatesView> {
        public OnHideProgressViewCommand(EpisodesUpdatesView$$State episodesUpdatesView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesUpdatesView episodesUpdatesView) {
            episodesUpdatesView.mo14633a();
        }
    }

    /* compiled from: EpisodesUpdatesView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<EpisodesUpdatesView> {
        public OnHideRefreshViewCommand(EpisodesUpdatesView$$State episodesUpdatesView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesUpdatesView episodesUpdatesView) {
            episodesUpdatesView.mo14637e();
        }
    }

    /* compiled from: EpisodesUpdatesView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<EpisodesUpdatesView> {
        public OnShowProgressViewCommand(EpisodesUpdatesView$$State episodesUpdatesView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesUpdatesView episodesUpdatesView) {
            episodesUpdatesView.mo14634b();
        }
    }

    /* compiled from: EpisodesUpdatesView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<EpisodesUpdatesView> {
        public OnShowRefreshViewCommand(EpisodesUpdatesView$$State episodesUpdatesView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesUpdatesView episodesUpdatesView) {
            episodesUpdatesView.mo14636d();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.updates.EpisodesUpdatesView
    /* renamed from: a */
    public void mo14633a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesUpdatesView) it.next()).mo14633a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.updates.EpisodesUpdatesView
    /* renamed from: b */
    public void mo14634b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesUpdatesView) it.next()).mo14634b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.updates.EpisodesUpdatesView
    /* renamed from: c */
    public void mo14635c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesUpdatesView) it.next()).mo14635c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.updates.EpisodesUpdatesView
    /* renamed from: d */
    public void mo14636d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesUpdatesView) it.next()).mo14636d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.updates.EpisodesUpdatesView
    /* renamed from: e */
    public void mo14637e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesUpdatesView) it.next()).mo14637e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }
}
