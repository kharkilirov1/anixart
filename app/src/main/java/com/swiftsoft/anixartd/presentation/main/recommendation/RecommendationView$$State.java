package com.swiftsoft.anixartd.presentation.main.recommendation;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class RecommendationView$$State extends MvpViewState<RecommendationView> implements RecommendationView {

    /* compiled from: RecommendationView$$State.java */
    public class OnFailedCommand extends ViewCommand<RecommendationView> {
        public OnFailedCommand(RecommendationView$$State recommendationView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RecommendationView recommendationView) {
            recommendationView.mo14999c();
        }
    }

    /* compiled from: RecommendationView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<RecommendationView> {
        public OnHideProgressViewCommand(RecommendationView$$State recommendationView$$State) {
            super("onHideProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RecommendationView recommendationView) {
            recommendationView.mo14997a();
        }
    }

    /* compiled from: RecommendationView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<RecommendationView> {
        public OnHideRefreshViewCommand(RecommendationView$$State recommendationView$$State) {
            super("onHideRefreshView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RecommendationView recommendationView) {
            recommendationView.mo15001e();
        }
    }

    /* compiled from: RecommendationView$$State.java */
    public class OnReleaseCommand extends ViewCommand<RecommendationView> {

        /* renamed from: a */
        public final long f26923a;

        public OnReleaseCommand(RecommendationView$$State recommendationView$$State, long j2) {
            super("onRelease", OneExecutionStateStrategy.class);
            this.f26923a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RecommendationView recommendationView) {
            recommendationView.mo15002g(this.f26923a);
        }
    }

    /* compiled from: RecommendationView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<RecommendationView> {
        public OnShowProgressViewCommand(RecommendationView$$State recommendationView$$State) {
            super("onShowProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RecommendationView recommendationView) {
            recommendationView.mo14998b();
        }
    }

    /* compiled from: RecommendationView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<RecommendationView> {
        public OnShowRefreshViewCommand(RecommendationView$$State recommendationView$$State) {
            super("onShowRefreshView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(RecommendationView recommendationView) {
            recommendationView.mo15000d();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.recommendation.RecommendationView
    /* renamed from: a */
    public void mo14997a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RecommendationView) it.next()).mo14997a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.recommendation.RecommendationView
    /* renamed from: b */
    public void mo14998b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RecommendationView) it.next()).mo14998b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.recommendation.RecommendationView
    /* renamed from: c */
    public void mo14999c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RecommendationView) it.next()).mo14999c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.recommendation.RecommendationView
    /* renamed from: d */
    public void mo15000d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RecommendationView) it.next()).mo15000d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.recommendation.RecommendationView
    /* renamed from: e */
    public void mo15001e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RecommendationView) it.next()).mo15001e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.recommendation.RecommendationView
    /* renamed from: g */
    public void mo15002g(long j2) {
        OnReleaseCommand onReleaseCommand = new OnReleaseCommand(this, j2);
        this.viewCommands.beforeApply(onReleaseCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((RecommendationView) it.next()).mo15002g(j2);
        }
        this.viewCommands.afterApply(onReleaseCommand);
    }
}
