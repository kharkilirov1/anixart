package com.swiftsoft.anixartd.presentation.main.collection;

import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Release;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class CollectionView$$State extends MvpViewState<CollectionView> implements CollectionView {

    /* compiled from: CollectionView$$State.java */
    public class OnCollectionIsDeletedCommand extends ViewCommand<CollectionView> {
        public OnCollectionIsDeletedCommand(CollectionView$$State collectionView$$State) {
            super("onCollectionIsDeleted", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionView collectionView) {
            collectionView.mo14414s3();
        }
    }

    /* compiled from: CollectionView$$State.java */
    public class OnCollectionIsPrivateCommand extends ViewCommand<CollectionView> {
        public OnCollectionIsPrivateCommand(CollectionView$$State collectionView$$State) {
            super("onCollectionIsPrivate", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionView collectionView) {
            collectionView.mo14408i4();
        }
    }

    /* compiled from: CollectionView$$State.java */
    public class OnCollectionLoadedCommand extends ViewCommand<CollectionView> {

        /* renamed from: a */
        public final Collection f26089a;

        public OnCollectionLoadedCommand(CollectionView$$State collectionView$$State, Collection collection) {
            super("onCollectionLoaded", OneExecutionStateStrategy.class);
            this.f26089a = collection;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionView collectionView) {
            collectionView.mo14398Y3(this.f26089a);
        }
    }

    /* compiled from: CollectionView$$State.java */
    public class OnCommentsShowAllCommand extends ViewCommand<CollectionView> {
        public OnCommentsShowAllCommand(CollectionView$$State collectionView$$State) {
            super("onCommentsShowAll", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionView collectionView) {
            collectionView.mo14406i0();
        }
    }

    /* compiled from: CollectionView$$State.java */
    public class OnDeleteCommand extends ViewCommand<CollectionView> {
        public OnDeleteCommand(CollectionView$$State collectionView$$State) {
            super("onDelete", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionView collectionView) {
            collectionView.mo14391D0();
        }
    }

    /* compiled from: CollectionView$$State.java */
    public class OnDeleteFailedCommand extends ViewCommand<CollectionView> {
        public OnDeleteFailedCommand(CollectionView$$State collectionView$$State) {
            super("onDeleteFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionView collectionView) {
            collectionView.mo14407i3();
        }
    }

    /* compiled from: CollectionView$$State.java */
    public class OnDeletedCommand extends ViewCommand<CollectionView> {
        public OnDeletedCommand(CollectionView$$State collectionView$$State) {
            super("onDeleted", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionView collectionView) {
            collectionView.mo14395T1();
        }
    }

    /* compiled from: CollectionView$$State.java */
    public class OnEditCommand extends ViewCommand<CollectionView> {
        public OnEditCommand(CollectionView$$State collectionView$$State) {
            super("onEdit", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionView collectionView) {
            collectionView.mo14392E0();
        }
    }

    /* compiled from: CollectionView$$State.java */
    public class OnFailedCommand extends ViewCommand<CollectionView> {
        public OnFailedCommand(CollectionView$$State collectionView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionView collectionView) {
            collectionView.mo14401c();
        }
    }

    /* compiled from: CollectionView$$State.java */
    public class OnHideLoadingViewCommand extends ViewCommand<CollectionView> {
        public OnHideLoadingViewCommand(CollectionView$$State collectionView$$State) {
            super("onHideLoadingView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionView collectionView) {
            collectionView.mo14409j();
        }
    }

    /* compiled from: CollectionView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<CollectionView> {
        public OnHideProgressViewCommand(CollectionView$$State collectionView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionView collectionView) {
            collectionView.mo14399a();
        }
    }

    /* compiled from: CollectionView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<CollectionView> {
        public OnHideRefreshViewCommand(CollectionView$$State collectionView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionView collectionView) {
            collectionView.mo14403e();
        }
    }

    /* compiled from: CollectionView$$State.java */
    public class OnImageCommand extends ViewCommand<CollectionView> {
        public OnImageCommand(CollectionView$$State collectionView$$State) {
            super("onImage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionView collectionView) {
            collectionView.mo14413p0();
        }
    }

    /* compiled from: CollectionView$$State.java */
    public class OnRandomCommand extends ViewCommand<CollectionView> {
        public OnRandomCommand(CollectionView$$State collectionView$$State) {
            super("onRandom", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionView collectionView) {
            collectionView.mo14397Y();
        }
    }

    /* compiled from: CollectionView$$State.java */
    public class OnReleaseCommand extends ViewCommand<CollectionView> {

        /* renamed from: a */
        public final Release f26090a;

        public OnReleaseCommand(CollectionView$$State collectionView$$State, Release release) {
            super("onRelease", OneExecutionStateStrategy.class);
            this.f26090a = release;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionView collectionView) {
            collectionView.mo14405i(this.f26090a);
        }
    }

    /* compiled from: CollectionView$$State.java */
    public class OnReportCommand extends ViewCommand<CollectionView> {
        public OnReportCommand(CollectionView$$State collectionView$$State) {
            super("onReport", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionView collectionView) {
            collectionView.mo14396W0();
        }
    }

    /* compiled from: CollectionView$$State.java */
    public class OnReportSentCommand extends ViewCommand<CollectionView> {
        public OnReportSentCommand(CollectionView$$State collectionView$$State) {
            super("onReportSent", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionView collectionView) {
            collectionView.mo14412n();
        }
    }

    /* compiled from: CollectionView$$State.java */
    public class OnShareCommand extends ViewCommand<CollectionView> {
        public OnShareCommand(CollectionView$$State collectionView$$State) {
            super("onShare", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionView collectionView) {
            collectionView.mo14394Q0();
        }
    }

    /* compiled from: CollectionView$$State.java */
    public class OnShortcutCommand extends ViewCommand<CollectionView> {
        public OnShortcutCommand(CollectionView$$State collectionView$$State) {
            super("onShortcut", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionView collectionView) {
            collectionView.mo14410j0();
        }
    }

    /* compiled from: CollectionView$$State.java */
    public class OnShortcutFailedCommand extends ViewCommand<CollectionView> {
        public OnShortcutFailedCommand(CollectionView$$State collectionView$$State) {
            super("onShortcutFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionView collectionView) {
            collectionView.mo14393N3();
        }
    }

    /* compiled from: CollectionView$$State.java */
    public class OnShowLoadingViewCommand extends ViewCommand<CollectionView> {
        public OnShowLoadingViewCommand(CollectionView$$State collectionView$$State) {
            super("onShowLoadingView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionView collectionView) {
            collectionView.mo14404h();
        }
    }

    /* compiled from: CollectionView$$State.java */
    public class OnShowNeedAuthCommand extends ViewCommand<CollectionView> {
        public OnShowNeedAuthCommand(CollectionView$$State collectionView$$State) {
            super("onShowNeedAuth", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionView collectionView) {
            collectionView.mo14411m();
        }
    }

    /* compiled from: CollectionView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<CollectionView> {
        public OnShowProgressViewCommand(CollectionView$$State collectionView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionView collectionView) {
            collectionView.mo14400b();
        }
    }

    /* compiled from: CollectionView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<CollectionView> {
        public OnShowRefreshViewCommand(CollectionView$$State collectionView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionView collectionView) {
            collectionView.mo14402d();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: D0 */
    public void mo14391D0() {
        OnDeleteCommand onDeleteCommand = new OnDeleteCommand(this);
        this.viewCommands.beforeApply(onDeleteCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionView) it.next()).mo14391D0();
        }
        this.viewCommands.afterApply(onDeleteCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: E0 */
    public void mo14392E0() {
        OnEditCommand onEditCommand = new OnEditCommand(this);
        this.viewCommands.beforeApply(onEditCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionView) it.next()).mo14392E0();
        }
        this.viewCommands.afterApply(onEditCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: N3 */
    public void mo14393N3() {
        OnShortcutFailedCommand onShortcutFailedCommand = new OnShortcutFailedCommand(this);
        this.viewCommands.beforeApply(onShortcutFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionView) it.next()).mo14393N3();
        }
        this.viewCommands.afterApply(onShortcutFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: Q0 */
    public void mo14394Q0() {
        OnShareCommand onShareCommand = new OnShareCommand(this);
        this.viewCommands.beforeApply(onShareCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionView) it.next()).mo14394Q0();
        }
        this.viewCommands.afterApply(onShareCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: T1 */
    public void mo14395T1() {
        OnDeletedCommand onDeletedCommand = new OnDeletedCommand(this);
        this.viewCommands.beforeApply(onDeletedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionView) it.next()).mo14395T1();
        }
        this.viewCommands.afterApply(onDeletedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: W0 */
    public void mo14396W0() {
        OnReportCommand onReportCommand = new OnReportCommand(this);
        this.viewCommands.beforeApply(onReportCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionView) it.next()).mo14396W0();
        }
        this.viewCommands.afterApply(onReportCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: Y */
    public void mo14397Y() {
        OnRandomCommand onRandomCommand = new OnRandomCommand(this);
        this.viewCommands.beforeApply(onRandomCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionView) it.next()).mo14397Y();
        }
        this.viewCommands.afterApply(onRandomCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: Y3 */
    public void mo14398Y3(Collection collection) {
        OnCollectionLoadedCommand onCollectionLoadedCommand = new OnCollectionLoadedCommand(this, collection);
        this.viewCommands.beforeApply(onCollectionLoadedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionView) it.next()).mo14398Y3(collection);
        }
        this.viewCommands.afterApply(onCollectionLoadedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: a */
    public void mo14399a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionView) it.next()).mo14399a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: b */
    public void mo14400b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionView) it.next()).mo14400b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: c */
    public void mo14401c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionView) it.next()).mo14401c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: d */
    public void mo14402d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionView) it.next()).mo14402d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: e */
    public void mo14403e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionView) it.next()).mo14403e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: h */
    public void mo14404h() {
        OnShowLoadingViewCommand onShowLoadingViewCommand = new OnShowLoadingViewCommand(this);
        this.viewCommands.beforeApply(onShowLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionView) it.next()).mo14404h();
        }
        this.viewCommands.afterApply(onShowLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: i */
    public void mo14405i(Release release) {
        OnReleaseCommand onReleaseCommand = new OnReleaseCommand(this, release);
        this.viewCommands.beforeApply(onReleaseCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionView) it.next()).mo14405i(release);
        }
        this.viewCommands.afterApply(onReleaseCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: i0 */
    public void mo14406i0() {
        OnCommentsShowAllCommand onCommentsShowAllCommand = new OnCommentsShowAllCommand(this);
        this.viewCommands.beforeApply(onCommentsShowAllCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionView) it.next()).mo14406i0();
        }
        this.viewCommands.afterApply(onCommentsShowAllCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: i3 */
    public void mo14407i3() {
        OnDeleteFailedCommand onDeleteFailedCommand = new OnDeleteFailedCommand(this);
        this.viewCommands.beforeApply(onDeleteFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionView) it.next()).mo14407i3();
        }
        this.viewCommands.afterApply(onDeleteFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: i4 */
    public void mo14408i4() {
        OnCollectionIsPrivateCommand onCollectionIsPrivateCommand = new OnCollectionIsPrivateCommand(this);
        this.viewCommands.beforeApply(onCollectionIsPrivateCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionView) it.next()).mo14408i4();
        }
        this.viewCommands.afterApply(onCollectionIsPrivateCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: j */
    public void mo14409j() {
        OnHideLoadingViewCommand onHideLoadingViewCommand = new OnHideLoadingViewCommand(this);
        this.viewCommands.beforeApply(onHideLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionView) it.next()).mo14409j();
        }
        this.viewCommands.afterApply(onHideLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: j0 */
    public void mo14410j0() {
        OnShortcutCommand onShortcutCommand = new OnShortcutCommand(this);
        this.viewCommands.beforeApply(onShortcutCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionView) it.next()).mo14410j0();
        }
        this.viewCommands.afterApply(onShortcutCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: m */
    public void mo14411m() {
        OnShowNeedAuthCommand onShowNeedAuthCommand = new OnShowNeedAuthCommand(this);
        this.viewCommands.beforeApply(onShowNeedAuthCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionView) it.next()).mo14411m();
        }
        this.viewCommands.afterApply(onShowNeedAuthCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: n */
    public void mo14412n() {
        OnReportSentCommand onReportSentCommand = new OnReportSentCommand(this);
        this.viewCommands.beforeApply(onReportSentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionView) it.next()).mo14412n();
        }
        this.viewCommands.afterApply(onReportSentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: p0 */
    public void mo14413p0() {
        OnImageCommand onImageCommand = new OnImageCommand(this);
        this.viewCommands.beforeApply(onImageCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionView) it.next()).mo14413p0();
        }
        this.viewCommands.afterApply(onImageCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: s3 */
    public void mo14414s3() {
        OnCollectionIsDeletedCommand onCollectionIsDeletedCommand = new OnCollectionIsDeletedCommand(this);
        this.viewCommands.beforeApply(onCollectionIsDeletedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionView) it.next()).mo14414s3();
        }
        this.viewCommands.afterApply(onCollectionIsDeletedCommand);
    }
}
