package com.swiftsoft.anixartd.presentation.main.collection.list;

import com.swiftsoft.anixartd.database.entity.Collection;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class CollectionProfileListView$$State extends MvpViewState<CollectionProfileListView> implements CollectionProfileListView {

    /* compiled from: CollectionProfileListView$$State.java */
    public class OnCollectionCommand extends ViewCommand<CollectionProfileListView> {

        /* renamed from: a */
        public final Collection f26226a;

        public OnCollectionCommand(CollectionProfileListView$$State collectionProfileListView$$State, Collection collection) {
            super("onCollection", OneExecutionStateStrategy.class);
            this.f26226a = collection;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionProfileListView collectionProfileListView) {
            collectionProfileListView.mo14541v(this.f26226a);
        }
    }

    /* compiled from: CollectionProfileListView$$State.java */
    public class OnCreateCollectionCommand extends ViewCommand<CollectionProfileListView> {
        public OnCreateCollectionCommand(CollectionProfileListView$$State collectionProfileListView$$State) {
            super("onCreateCollection", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionProfileListView collectionProfileListView) {
            collectionProfileListView.mo14534M();
        }
    }

    /* compiled from: CollectionProfileListView$$State.java */
    public class OnFailedCommand extends ViewCommand<CollectionProfileListView> {
        public OnFailedCommand(CollectionProfileListView$$State collectionProfileListView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionProfileListView collectionProfileListView) {
            collectionProfileListView.mo14537c();
        }
    }

    /* compiled from: CollectionProfileListView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<CollectionProfileListView> {
        public OnHideProgressViewCommand(CollectionProfileListView$$State collectionProfileListView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionProfileListView collectionProfileListView) {
            collectionProfileListView.mo14535a();
        }
    }

    /* compiled from: CollectionProfileListView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<CollectionProfileListView> {
        public OnHideRefreshViewCommand(CollectionProfileListView$$State collectionProfileListView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionProfileListView collectionProfileListView) {
            collectionProfileListView.mo14539e();
        }
    }

    /* compiled from: CollectionProfileListView$$State.java */
    public class OnRefreshAfterSortCommand extends ViewCommand<CollectionProfileListView> {
        public OnRefreshAfterSortCommand(CollectionProfileListView$$State collectionProfileListView$$State) {
            super("onRefreshAfterSort", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionProfileListView collectionProfileListView) {
            collectionProfileListView.mo14540l();
        }
    }

    /* compiled from: CollectionProfileListView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<CollectionProfileListView> {
        public OnShowProgressViewCommand(CollectionProfileListView$$State collectionProfileListView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionProfileListView collectionProfileListView) {
            collectionProfileListView.mo14536b();
        }
    }

    /* compiled from: CollectionProfileListView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<CollectionProfileListView> {
        public OnShowRefreshViewCommand(CollectionProfileListView$$State collectionProfileListView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionProfileListView collectionProfileListView) {
            collectionProfileListView.mo14538d();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionProfileListView
    /* renamed from: M */
    public void mo14534M() {
        OnCreateCollectionCommand onCreateCollectionCommand = new OnCreateCollectionCommand(this);
        this.viewCommands.beforeApply(onCreateCollectionCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionProfileListView) it.next()).mo14534M();
        }
        this.viewCommands.afterApply(onCreateCollectionCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionProfileListView
    /* renamed from: a */
    public void mo14535a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionProfileListView) it.next()).mo14535a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionProfileListView
    /* renamed from: b */
    public void mo14536b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionProfileListView) it.next()).mo14536b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionProfileListView
    /* renamed from: c */
    public void mo14537c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionProfileListView) it.next()).mo14537c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionProfileListView
    /* renamed from: d */
    public void mo14538d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionProfileListView) it.next()).mo14538d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionProfileListView
    /* renamed from: e */
    public void mo14539e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionProfileListView) it.next()).mo14539e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionProfileListView
    /* renamed from: l */
    public void mo14540l() {
        OnRefreshAfterSortCommand onRefreshAfterSortCommand = new OnRefreshAfterSortCommand(this);
        this.viewCommands.beforeApply(onRefreshAfterSortCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionProfileListView) it.next()).mo14540l();
        }
        this.viewCommands.afterApply(onRefreshAfterSortCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionProfileListView
    /* renamed from: v */
    public void mo14541v(Collection collection) {
        OnCollectionCommand onCollectionCommand = new OnCollectionCommand(this, collection);
        this.viewCommands.beforeApply(onCollectionCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionProfileListView) it.next()).mo14541v(collection);
        }
        this.viewCommands.afterApply(onCollectionCommand);
    }
}
