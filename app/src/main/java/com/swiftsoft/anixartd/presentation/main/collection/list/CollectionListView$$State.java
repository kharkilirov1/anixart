package com.swiftsoft.anixartd.presentation.main.collection.list;

import com.swiftsoft.anixartd.database.entity.Collection;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class CollectionListView$$State extends MvpViewState<CollectionListView> implements CollectionListView {

    /* compiled from: CollectionListView$$State.java */
    public class OnCollectionCommand extends ViewCommand<CollectionListView> {

        /* renamed from: a */
        public final Collection f26212a;

        public OnCollectionCommand(CollectionListView$$State collectionListView$$State, Collection collection) {
            super("onCollection", OneExecutionStateStrategy.class);
            this.f26212a = collection;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionListView collectionListView) {
            collectionListView.mo14530v(this.f26212a);
        }
    }

    /* compiled from: CollectionListView$$State.java */
    public class OnCreateCollectionCommand extends ViewCommand<CollectionListView> {
        public OnCreateCollectionCommand(CollectionListView$$State collectionListView$$State) {
            super("onCreateCollection", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionListView collectionListView) {
            collectionListView.mo14521M();
        }
    }

    /* compiled from: CollectionListView$$State.java */
    public class OnFailedCommand extends ViewCommand<CollectionListView> {
        public OnFailedCommand(CollectionListView$$State collectionListView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionListView collectionListView) {
            collectionListView.mo14525c();
        }
    }

    /* compiled from: CollectionListView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<CollectionListView> {
        public OnHideProgressViewCommand(CollectionListView$$State collectionListView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionListView collectionListView) {
            collectionListView.mo14522a();
        }
    }

    /* compiled from: CollectionListView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<CollectionListView> {
        public OnHideRefreshViewCommand(CollectionListView$$State collectionListView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionListView collectionListView) {
            collectionListView.mo14527e();
        }
    }

    /* compiled from: CollectionListView$$State.java */
    public class OnMyListCommand extends ViewCommand<CollectionListView> {
        public OnMyListCommand(CollectionListView$$State collectionListView$$State) {
            super("onMyList", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionListView collectionListView) {
            collectionListView.mo14523a1();
        }
    }

    /* compiled from: CollectionListView$$State.java */
    public class OnRefreshAfterSortCommand extends ViewCommand<CollectionListView> {
        public OnRefreshAfterSortCommand(CollectionListView$$State collectionListView$$State) {
            super("onRefreshAfterSort", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionListView collectionListView) {
            collectionListView.mo14528l();
        }
    }

    /* compiled from: CollectionListView$$State.java */
    public class OnShowNeedAuthCommand extends ViewCommand<CollectionListView> {
        public OnShowNeedAuthCommand(CollectionListView$$State collectionListView$$State) {
            super("onShowNeedAuth", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionListView collectionListView) {
            collectionListView.mo14529m();
        }
    }

    /* compiled from: CollectionListView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<CollectionListView> {
        public OnShowProgressViewCommand(CollectionListView$$State collectionListView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionListView collectionListView) {
            collectionListView.mo14524b();
        }
    }

    /* compiled from: CollectionListView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<CollectionListView> {
        public OnShowRefreshViewCommand(CollectionListView$$State collectionListView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionListView collectionListView) {
            collectionListView.mo14526d();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListView
    /* renamed from: M */
    public void mo14521M() {
        OnCreateCollectionCommand onCreateCollectionCommand = new OnCreateCollectionCommand(this);
        this.viewCommands.beforeApply(onCreateCollectionCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionListView) it.next()).mo14521M();
        }
        this.viewCommands.afterApply(onCreateCollectionCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListView
    /* renamed from: a */
    public void mo14522a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionListView) it.next()).mo14522a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListView
    /* renamed from: a1 */
    public void mo14523a1() {
        OnMyListCommand onMyListCommand = new OnMyListCommand(this);
        this.viewCommands.beforeApply(onMyListCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionListView) it.next()).mo14523a1();
        }
        this.viewCommands.afterApply(onMyListCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListView
    /* renamed from: b */
    public void mo14524b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionListView) it.next()).mo14524b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListView
    /* renamed from: c */
    public void mo14525c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionListView) it.next()).mo14525c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListView
    /* renamed from: d */
    public void mo14526d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionListView) it.next()).mo14526d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListView
    /* renamed from: e */
    public void mo14527e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionListView) it.next()).mo14527e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListView
    /* renamed from: l */
    public void mo14528l() {
        OnRefreshAfterSortCommand onRefreshAfterSortCommand = new OnRefreshAfterSortCommand(this);
        this.viewCommands.beforeApply(onRefreshAfterSortCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionListView) it.next()).mo14528l();
        }
        this.viewCommands.afterApply(onRefreshAfterSortCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListView
    /* renamed from: m */
    public void mo14529m() {
        OnShowNeedAuthCommand onShowNeedAuthCommand = new OnShowNeedAuthCommand(this);
        this.viewCommands.beforeApply(onShowNeedAuthCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionListView) it.next()).mo14529m();
        }
        this.viewCommands.afterApply(onShowNeedAuthCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListView
    /* renamed from: v */
    public void mo14530v(Collection collection) {
        OnCollectionCommand onCollectionCommand = new OnCollectionCommand(this, collection);
        this.viewCommands.beforeApply(onCollectionCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionListView) it.next()).mo14530v(collection);
        }
        this.viewCommands.afterApply(onCollectionCommand);
    }
}
