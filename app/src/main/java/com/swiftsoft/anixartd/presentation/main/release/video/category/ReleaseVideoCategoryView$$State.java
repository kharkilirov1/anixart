package com.swiftsoft.anixartd.presentation.main.release.video.category;

import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ReleaseVideoCategoryView$$State extends MvpViewState<ReleaseVideoCategoryView> implements ReleaseVideoCategoryView {

    /* compiled from: ReleaseVideoCategoryView$$State.java */
    public class OnFailedCommand extends ViewCommand<ReleaseVideoCategoryView> {
        public OnFailedCommand(ReleaseVideoCategoryView$$State releaseVideoCategoryView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideoCategoryView releaseVideoCategoryView) {
            releaseVideoCategoryView.mo15187c();
        }
    }

    /* compiled from: ReleaseVideoCategoryView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ReleaseVideoCategoryView> {
        public OnHideProgressViewCommand(ReleaseVideoCategoryView$$State releaseVideoCategoryView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideoCategoryView releaseVideoCategoryView) {
            releaseVideoCategoryView.mo15185a();
        }
    }

    /* compiled from: ReleaseVideoCategoryView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<ReleaseVideoCategoryView> {
        public OnHideRefreshViewCommand(ReleaseVideoCategoryView$$State releaseVideoCategoryView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideoCategoryView releaseVideoCategoryView) {
            releaseVideoCategoryView.mo15189e();
        }
    }

    /* compiled from: ReleaseVideoCategoryView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ReleaseVideoCategoryView> {
        public OnShowProgressViewCommand(ReleaseVideoCategoryView$$State releaseVideoCategoryView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideoCategoryView releaseVideoCategoryView) {
            releaseVideoCategoryView.mo15186b();
        }
    }

    /* compiled from: ReleaseVideoCategoryView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<ReleaseVideoCategoryView> {
        public OnShowRefreshViewCommand(ReleaseVideoCategoryView$$State releaseVideoCategoryView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideoCategoryView releaseVideoCategoryView) {
            releaseVideoCategoryView.mo15188d();
        }
    }

    /* compiled from: ReleaseVideoCategoryView$$State.java */
    public class OnVideoCommand extends ViewCommand<ReleaseVideoCategoryView> {

        /* renamed from: a */
        public final ReleaseVideo f27178a;

        public OnVideoCommand(ReleaseVideoCategoryView$$State releaseVideoCategoryView$$State, ReleaseVideo releaseVideo) {
            super("onVideo", OneExecutionStateStrategy.class);
            this.f27178a = releaseVideo;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideoCategoryView releaseVideoCategoryView) {
            releaseVideoCategoryView.mo15184K(this.f27178a);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.category.ReleaseVideoCategoryView
    /* renamed from: K */
    public void mo15184K(ReleaseVideo releaseVideo) {
        OnVideoCommand onVideoCommand = new OnVideoCommand(this, releaseVideo);
        this.viewCommands.beforeApply(onVideoCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideoCategoryView) it.next()).mo15184K(releaseVideo);
        }
        this.viewCommands.afterApply(onVideoCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.category.ReleaseVideoCategoryView
    /* renamed from: a */
    public void mo15185a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideoCategoryView) it.next()).mo15185a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.category.ReleaseVideoCategoryView
    /* renamed from: b */
    public void mo15186b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideoCategoryView) it.next()).mo15186b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.category.ReleaseVideoCategoryView
    /* renamed from: c */
    public void mo15187c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideoCategoryView) it.next()).mo15187c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.category.ReleaseVideoCategoryView
    /* renamed from: d */
    public void mo15188d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideoCategoryView) it.next()).mo15188d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.category.ReleaseVideoCategoryView
    /* renamed from: e */
    public void mo15189e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideoCategoryView) it.next()).mo15189e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }
}
