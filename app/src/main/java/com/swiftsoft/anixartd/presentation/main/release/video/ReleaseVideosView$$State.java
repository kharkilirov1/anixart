package com.swiftsoft.anixartd.presentation.main.release.video;

import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import com.swiftsoft.anixartd.database.entity.ReleaseVideoCategory;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ReleaseVideosView$$State extends MvpViewState<ReleaseVideosView> implements ReleaseVideosView {

    /* compiled from: ReleaseVideosView$$State.java */
    public class OnCanAppealCommand extends ViewCommand<ReleaseVideosView> {

        /* renamed from: a */
        public final boolean f27143a;

        public OnCanAppealCommand(ReleaseVideosView$$State releaseVideosView$$State, boolean z) {
            super("onCanAppeal", OneExecutionStateStrategy.class);
            this.f27143a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideosView releaseVideosView) {
            releaseVideosView.mo15161K1(this.f27143a);
        }
    }

    /* compiled from: ReleaseVideosView$$State.java */
    public class OnFailedCommand extends ViewCommand<ReleaseVideosView> {
        public OnFailedCommand(ReleaseVideosView$$State releaseVideosView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideosView releaseVideosView) {
            releaseVideosView.mo15165c();
        }
    }

    /* compiled from: ReleaseVideosView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ReleaseVideosView> {
        public OnHideProgressViewCommand(ReleaseVideosView$$State releaseVideosView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideosView releaseVideosView) {
            releaseVideosView.mo15163a();
        }
    }

    /* compiled from: ReleaseVideosView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<ReleaseVideosView> {
        public OnHideRefreshViewCommand(ReleaseVideosView$$State releaseVideosView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideosView releaseVideosView) {
            releaseVideosView.mo15167e();
        }
    }

    /* compiled from: ReleaseVideosView$$State.java */
    public class OnSectionHeaderButtonCommand extends ViewCommand<ReleaseVideosView> {

        /* renamed from: a */
        public final ReleaseVideoCategory f27144a;

        public OnSectionHeaderButtonCommand(ReleaseVideosView$$State releaseVideosView$$State, ReleaseVideoCategory releaseVideoCategory) {
            super("onSectionHeaderButton", OneExecutionStateStrategy.class);
            this.f27144a = releaseVideoCategory;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideosView releaseVideosView) {
            releaseVideosView.mo15168x1(this.f27144a);
        }
    }

    /* compiled from: ReleaseVideosView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ReleaseVideosView> {
        public OnShowProgressViewCommand(ReleaseVideosView$$State releaseVideosView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideosView releaseVideosView) {
            releaseVideosView.mo15164b();
        }
    }

    /* compiled from: ReleaseVideosView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<ReleaseVideosView> {
        public OnShowRefreshViewCommand(ReleaseVideosView$$State releaseVideosView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideosView releaseVideosView) {
            releaseVideosView.mo15166d();
        }
    }

    /* compiled from: ReleaseVideosView$$State.java */
    public class OnStreamingPlatformCommand extends ViewCommand<ReleaseVideosView> {

        /* renamed from: a */
        public final String f27145a;

        public OnStreamingPlatformCommand(ReleaseVideosView$$State releaseVideosView$$State, String str) {
            super("onStreamingPlatform", OneExecutionStateStrategy.class);
            this.f27145a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideosView releaseVideosView) {
            releaseVideosView.mo15162T0(this.f27145a);
        }
    }

    /* compiled from: ReleaseVideosView$$State.java */
    public class OnVideoCommand extends ViewCommand<ReleaseVideosView> {

        /* renamed from: a */
        public final ReleaseVideo f27146a;

        public OnVideoCommand(ReleaseVideosView$$State releaseVideosView$$State, ReleaseVideo releaseVideo) {
            super("onVideo", OneExecutionStateStrategy.class);
            this.f27146a = releaseVideo;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseVideosView releaseVideosView) {
            releaseVideosView.mo15160K(this.f27146a);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosView
    /* renamed from: K */
    public void mo15160K(ReleaseVideo releaseVideo) {
        OnVideoCommand onVideoCommand = new OnVideoCommand(this, releaseVideo);
        this.viewCommands.beforeApply(onVideoCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideosView) it.next()).mo15160K(releaseVideo);
        }
        this.viewCommands.afterApply(onVideoCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosView
    /* renamed from: K1 */
    public void mo15161K1(boolean z) {
        OnCanAppealCommand onCanAppealCommand = new OnCanAppealCommand(this, z);
        this.viewCommands.beforeApply(onCanAppealCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideosView) it.next()).mo15161K1(z);
        }
        this.viewCommands.afterApply(onCanAppealCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosView
    /* renamed from: T0 */
    public void mo15162T0(String str) {
        OnStreamingPlatformCommand onStreamingPlatformCommand = new OnStreamingPlatformCommand(this, str);
        this.viewCommands.beforeApply(onStreamingPlatformCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideosView) it.next()).mo15162T0(str);
        }
        this.viewCommands.afterApply(onStreamingPlatformCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosView
    /* renamed from: a */
    public void mo15163a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideosView) it.next()).mo15163a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosView
    /* renamed from: b */
    public void mo15164b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideosView) it.next()).mo15164b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosView
    /* renamed from: c */
    public void mo15165c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideosView) it.next()).mo15165c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosView
    /* renamed from: d */
    public void mo15166d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideosView) it.next()).mo15166d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosView
    /* renamed from: e */
    public void mo15167e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideosView) it.next()).mo15167e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosView
    /* renamed from: x1 */
    public void mo15168x1(ReleaseVideoCategory releaseVideoCategory) {
        OnSectionHeaderButtonCommand onSectionHeaderButtonCommand = new OnSectionHeaderButtonCommand(this, releaseVideoCategory);
        this.viewCommands.beforeApply(onSectionHeaderButtonCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseVideosView) it.next()).mo15168x1(releaseVideoCategory);
        }
        this.viewCommands.afterApply(onSectionHeaderButtonCommand);
    }
}
