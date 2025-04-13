package com.swiftsoft.anixartd.presentation.main.related;

import com.swiftsoft.anixartd.database.entity.Release;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class RelatedView$$State extends MvpViewState<RelatedView> implements RelatedView {

    /* compiled from: RelatedView$$State.java */
    public class OnFailedCommand extends ViewCommand<RelatedView> {
        public OnFailedCommand(RelatedView$$State relatedView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RelatedView relatedView) {
            relatedView.mo15008c();
        }
    }

    /* compiled from: RelatedView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<RelatedView> {
        public OnHideProgressViewCommand(RelatedView$$State relatedView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RelatedView relatedView) {
            relatedView.mo15006a();
        }
    }

    /* compiled from: RelatedView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<RelatedView> {
        public OnHideRefreshViewCommand(RelatedView$$State relatedView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RelatedView relatedView) {
            relatedView.mo15010e();
        }
    }

    /* compiled from: RelatedView$$State.java */
    public class OnReleaseCommand extends ViewCommand<RelatedView> {

        /* renamed from: a */
        public final Release f26936a;

        public OnReleaseCommand(RelatedView$$State relatedView$$State, Release release) {
            super("onRelease", OneExecutionStateStrategy.class);
            this.f26936a = release;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RelatedView relatedView) {
            relatedView.mo15011i(this.f26936a);
        }
    }

    /* compiled from: RelatedView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<RelatedView> {
        public OnShowProgressViewCommand(RelatedView$$State relatedView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RelatedView relatedView) {
            relatedView.mo15007b();
        }
    }

    /* compiled from: RelatedView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<RelatedView> {
        public OnShowRefreshViewCommand(RelatedView$$State relatedView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RelatedView relatedView) {
            relatedView.mo15009d();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.related.RelatedView
    /* renamed from: a */
    public void mo15006a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RelatedView) it.next()).mo15006a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.related.RelatedView
    /* renamed from: b */
    public void mo15007b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RelatedView) it.next()).mo15007b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.related.RelatedView
    /* renamed from: c */
    public void mo15008c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RelatedView) it.next()).mo15008c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.related.RelatedView
    /* renamed from: d */
    public void mo15009d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RelatedView) it.next()).mo15009d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.related.RelatedView
    /* renamed from: e */
    public void mo15010e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RelatedView) it.next()).mo15010e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.related.RelatedView
    /* renamed from: i */
    public void mo15011i(Release release) {
        OnReleaseCommand onReleaseCommand = new OnReleaseCommand(this, release);
        this.viewCommands.beforeApply(onReleaseCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RelatedView) it.next()).mo15011i(release);
        }
        this.viewCommands.afterApply(onReleaseCommand);
    }
}
