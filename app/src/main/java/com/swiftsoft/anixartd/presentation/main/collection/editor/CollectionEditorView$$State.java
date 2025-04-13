package com.swiftsoft.anixartd.presentation.main.collection.editor;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class CollectionEditorView$$State extends MvpViewState<CollectionEditorView> implements CollectionEditorView {

    /* compiled from: CollectionEditorView$$State.java */
    public class OnAddReleaseCommand extends ViewCommand<CollectionEditorView> {
        public OnAddReleaseCommand(CollectionEditorView$$State collectionEditorView$$State) {
            super("onAddRelease", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionEditorView collectionEditorView) {
            collectionEditorView.mo14513m0();
        }
    }

    /* compiled from: CollectionEditorView$$State.java */
    public class OnBannedCommand extends ViewCommand<CollectionEditorView> {
        public OnBannedCommand(CollectionEditorView$$State collectionEditorView$$State) {
            super("onBanned", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionEditorView collectionEditorView) {
            collectionEditorView.mo14514o();
        }
    }

    /* compiled from: CollectionEditorView$$State.java */
    public class OnChooseImageCommand extends ViewCommand<CollectionEditorView> {
        public OnChooseImageCommand(CollectionEditorView$$State collectionEditorView$$State) {
            super("onChooseImage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionEditorView collectionEditorView) {
            collectionEditorView.onChooseImage();
        }
    }

    /* compiled from: CollectionEditorView$$State.java */
    public class OnCollectionCreateCommand extends ViewCommand<CollectionEditorView> {
        public OnCollectionCreateCommand(CollectionEditorView$$State collectionEditorView$$State) {
            super("onCollectionCreate", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionEditorView collectionEditorView) {
            collectionEditorView.mo14511b2();
        }
    }

    /* compiled from: CollectionEditorView$$State.java */
    public class OnCollectionEditCommand extends ViewCommand<CollectionEditorView> {
        public OnCollectionEditCommand(CollectionEditorView$$State collectionEditorView$$State) {
            super("onCollectionEdit", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionEditorView collectionEditorView) {
            collectionEditorView.mo14506O3();
        }
    }

    /* compiled from: CollectionEditorView$$State.java */
    public class OnCollectionLimitReachedCommand extends ViewCommand<CollectionEditorView> {
        public OnCollectionLimitReachedCommand(CollectionEditorView$$State collectionEditorView$$State) {
            super("onCollectionLimitReached", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionEditorView collectionEditorView) {
            collectionEditorView.mo14515v3();
        }
    }

    /* compiled from: CollectionEditorView$$State.java */
    public class OnDescriptionInvalidCommand extends ViewCommand<CollectionEditorView> {
        public OnDescriptionInvalidCommand(CollectionEditorView$$State collectionEditorView$$State) {
            super("onDescriptionInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionEditorView collectionEditorView) {
            collectionEditorView.mo14503E1();
        }
    }

    /* compiled from: CollectionEditorView$$State.java */
    public class OnFailedCommand extends ViewCommand<CollectionEditorView> {
        public OnFailedCommand(CollectionEditorView$$State collectionEditorView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionEditorView collectionEditorView) {
            collectionEditorView.mo14512c();
        }
    }

    /* compiled from: CollectionEditorView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<CollectionEditorView> {
        public OnHideProgressViewCommand(CollectionEditorView$$State collectionEditorView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionEditorView collectionEditorView) {
            collectionEditorView.mo14509a();
        }
    }

    /* compiled from: CollectionEditorView$$State.java */
    public class OnImageInvalidCommand extends ViewCommand<CollectionEditorView> {
        public OnImageInvalidCommand(CollectionEditorView$$State collectionEditorView$$State) {
            super("onImageInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionEditorView collectionEditorView) {
            collectionEditorView.mo14507U2();
        }
    }

    /* compiled from: CollectionEditorView$$State.java */
    public class OnReleaseLimitReachedCommand extends ViewCommand<CollectionEditorView> {
        public OnReleaseLimitReachedCommand(CollectionEditorView$$State collectionEditorView$$State) {
            super("onReleaseLimitReached", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionEditorView collectionEditorView) {
            collectionEditorView.mo14505O1();
        }
    }

    /* compiled from: CollectionEditorView$$State.java */
    public class OnReleasesInvalidCommand extends ViewCommand<CollectionEditorView> {
        public OnReleasesInvalidCommand(CollectionEditorView$$State collectionEditorView$$State) {
            super("onReleasesInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionEditorView collectionEditorView) {
            collectionEditorView.mo14504I2();
        }
    }

    /* compiled from: CollectionEditorView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<CollectionEditorView> {
        public OnShowProgressViewCommand(CollectionEditorView$$State collectionEditorView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionEditorView collectionEditorView) {
            collectionEditorView.mo14510b();
        }
    }

    /* compiled from: CollectionEditorView$$State.java */
    public class OnTitleInvalidCommand extends ViewCommand<CollectionEditorView> {
        public OnTitleInvalidCommand(CollectionEditorView$$State collectionEditorView$$State) {
            super("onTitleInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CollectionEditorView collectionEditorView) {
            collectionEditorView.mo14508V0();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: E1 */
    public void mo14503E1() {
        OnDescriptionInvalidCommand onDescriptionInvalidCommand = new OnDescriptionInvalidCommand(this);
        this.viewCommands.beforeApply(onDescriptionInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionEditorView) it.next()).mo14503E1();
        }
        this.viewCommands.afterApply(onDescriptionInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: I2 */
    public void mo14504I2() {
        OnReleasesInvalidCommand onReleasesInvalidCommand = new OnReleasesInvalidCommand(this);
        this.viewCommands.beforeApply(onReleasesInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionEditorView) it.next()).mo14504I2();
        }
        this.viewCommands.afterApply(onReleasesInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: O1 */
    public void mo14505O1() {
        OnReleaseLimitReachedCommand onReleaseLimitReachedCommand = new OnReleaseLimitReachedCommand(this);
        this.viewCommands.beforeApply(onReleaseLimitReachedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionEditorView) it.next()).mo14505O1();
        }
        this.viewCommands.afterApply(onReleaseLimitReachedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: O3 */
    public void mo14506O3() {
        OnCollectionEditCommand onCollectionEditCommand = new OnCollectionEditCommand(this);
        this.viewCommands.beforeApply(onCollectionEditCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionEditorView) it.next()).mo14506O3();
        }
        this.viewCommands.afterApply(onCollectionEditCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: U2 */
    public void mo14507U2() {
        OnImageInvalidCommand onImageInvalidCommand = new OnImageInvalidCommand(this);
        this.viewCommands.beforeApply(onImageInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionEditorView) it.next()).mo14507U2();
        }
        this.viewCommands.afterApply(onImageInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: V0 */
    public void mo14508V0() {
        OnTitleInvalidCommand onTitleInvalidCommand = new OnTitleInvalidCommand(this);
        this.viewCommands.beforeApply(onTitleInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionEditorView) it.next()).mo14508V0();
        }
        this.viewCommands.afterApply(onTitleInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: a */
    public void mo14509a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionEditorView) it.next()).mo14509a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: b */
    public void mo14510b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionEditorView) it.next()).mo14510b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: b2 */
    public void mo14511b2() {
        OnCollectionCreateCommand onCollectionCreateCommand = new OnCollectionCreateCommand(this);
        this.viewCommands.beforeApply(onCollectionCreateCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionEditorView) it.next()).mo14511b2();
        }
        this.viewCommands.afterApply(onCollectionCreateCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: c */
    public void mo14512c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionEditorView) it.next()).mo14512c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: m0 */
    public void mo14513m0() {
        OnAddReleaseCommand onAddReleaseCommand = new OnAddReleaseCommand(this);
        this.viewCommands.beforeApply(onAddReleaseCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionEditorView) it.next()).mo14513m0();
        }
        this.viewCommands.afterApply(onAddReleaseCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: o */
    public void mo14514o() {
        OnBannedCommand onBannedCommand = new OnBannedCommand(this);
        this.viewCommands.beforeApply(onBannedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionEditorView) it.next()).mo14514o();
        }
        this.viewCommands.afterApply(onBannedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    public void onChooseImage() {
        OnChooseImageCommand onChooseImageCommand = new OnChooseImageCommand(this);
        this.viewCommands.beforeApply(onChooseImageCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionEditorView) it.next()).onChooseImage();
        }
        this.viewCommands.afterApply(onChooseImageCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: v3 */
    public void mo14515v3() {
        OnCollectionLimitReachedCommand onCollectionLimitReachedCommand = new OnCollectionLimitReachedCommand(this);
        this.viewCommands.beforeApply(onCollectionLimitReachedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CollectionEditorView) it.next()).mo14515v3();
        }
        this.viewCommands.afterApply(onCollectionLimitReachedCommand);
    }
}
