package com.swiftsoft.anixartd.presentation.main.release.collections;

import com.swiftsoft.anixartd.database.entity.Collection;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ReleaseCollectionsView$$State extends MvpViewState<ReleaseCollectionsView> implements ReleaseCollectionsView {

    /* compiled from: ReleaseCollectionsView$$State.java */
    public class OnCollectionCommand extends ViewCommand<ReleaseCollectionsView> {

        /* renamed from: a */
        public final Collection f27035a;

        public OnCollectionCommand(ReleaseCollectionsView$$State releaseCollectionsView$$State, Collection collection) {
            super("onCollection", OneExecutionStateStrategy.class);
            this.f27035a = collection;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCollectionsView releaseCollectionsView) {
            releaseCollectionsView.mo15085v(this.f27035a);
        }
    }

    /* compiled from: ReleaseCollectionsView$$State.java */
    public class OnFailedCommand extends ViewCommand<ReleaseCollectionsView> {
        public OnFailedCommand(ReleaseCollectionsView$$State releaseCollectionsView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCollectionsView releaseCollectionsView) {
            releaseCollectionsView.mo15081c();
        }
    }

    /* compiled from: ReleaseCollectionsView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ReleaseCollectionsView> {
        public OnHideProgressViewCommand(ReleaseCollectionsView$$State releaseCollectionsView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCollectionsView releaseCollectionsView) {
            releaseCollectionsView.mo15079a();
        }
    }

    /* compiled from: ReleaseCollectionsView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<ReleaseCollectionsView> {
        public OnHideRefreshViewCommand(ReleaseCollectionsView$$State releaseCollectionsView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCollectionsView releaseCollectionsView) {
            releaseCollectionsView.mo15083e();
        }
    }

    /* compiled from: ReleaseCollectionsView$$State.java */
    public class OnRefreshAfterSortCommand extends ViewCommand<ReleaseCollectionsView> {
        public OnRefreshAfterSortCommand(ReleaseCollectionsView$$State releaseCollectionsView$$State) {
            super("onRefreshAfterSort", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCollectionsView releaseCollectionsView) {
            releaseCollectionsView.mo15084l();
        }
    }

    /* compiled from: ReleaseCollectionsView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ReleaseCollectionsView> {
        public OnShowProgressViewCommand(ReleaseCollectionsView$$State releaseCollectionsView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCollectionsView releaseCollectionsView) {
            releaseCollectionsView.mo15080b();
        }
    }

    /* compiled from: ReleaseCollectionsView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<ReleaseCollectionsView> {
        public OnShowRefreshViewCommand(ReleaseCollectionsView$$State releaseCollectionsView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseCollectionsView releaseCollectionsView) {
            releaseCollectionsView.mo15082d();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.collections.ReleaseCollectionsView
    /* renamed from: a */
    public void mo15079a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCollectionsView) it.next()).mo15079a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.collections.ReleaseCollectionsView
    /* renamed from: b */
    public void mo15080b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCollectionsView) it.next()).mo15080b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.collections.ReleaseCollectionsView
    /* renamed from: c */
    public void mo15081c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCollectionsView) it.next()).mo15081c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.collections.ReleaseCollectionsView
    /* renamed from: d */
    public void mo15082d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCollectionsView) it.next()).mo15082d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.collections.ReleaseCollectionsView
    /* renamed from: e */
    public void mo15083e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCollectionsView) it.next()).mo15083e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.collections.ReleaseCollectionsView
    /* renamed from: l */
    public void mo15084l() {
        OnRefreshAfterSortCommand onRefreshAfterSortCommand = new OnRefreshAfterSortCommand(this);
        this.viewCommands.beforeApply(onRefreshAfterSortCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCollectionsView) it.next()).mo15084l();
        }
        this.viewCommands.afterApply(onRefreshAfterSortCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.collections.ReleaseCollectionsView
    /* renamed from: v */
    public void mo15085v(Collection collection) {
        OnCollectionCommand onCollectionCommand = new OnCollectionCommand(this, collection);
        this.viewCommands.beforeApply(onCollectionCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseCollectionsView) it.next()).mo15085v(collection);
        }
        this.viewCommands.afterApply(onCollectionCommand);
    }
}
