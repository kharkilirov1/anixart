package com.swiftsoft.anixartd.presentation.main.streaming;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ReleaseStreamingPlatformView$$State extends MvpViewState<ReleaseStreamingPlatformView> implements ReleaseStreamingPlatformView {

    /* compiled from: ReleaseStreamingPlatformView$$State.java */
    public class OnFailedCommand extends ViewCommand<ReleaseStreamingPlatformView> {
        public OnFailedCommand(ReleaseStreamingPlatformView$$State releaseStreamingPlatformView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseStreamingPlatformView releaseStreamingPlatformView) {
            releaseStreamingPlatformView.mo15239c();
        }
    }

    /* compiled from: ReleaseStreamingPlatformView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ReleaseStreamingPlatformView> {
        public OnHideProgressViewCommand(ReleaseStreamingPlatformView$$State releaseStreamingPlatformView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseStreamingPlatformView releaseStreamingPlatformView) {
            releaseStreamingPlatformView.mo15237a();
        }
    }

    /* compiled from: ReleaseStreamingPlatformView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ReleaseStreamingPlatformView> {
        public OnShowProgressViewCommand(ReleaseStreamingPlatformView$$State releaseStreamingPlatformView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseStreamingPlatformView releaseStreamingPlatformView) {
            releaseStreamingPlatformView.mo15238b();
        }
    }

    /* compiled from: ReleaseStreamingPlatformView$$State.java */
    public class OnStreamingPlatformCommand extends ViewCommand<ReleaseStreamingPlatformView> {

        /* renamed from: a */
        public final String f27257a;

        public OnStreamingPlatformCommand(ReleaseStreamingPlatformView$$State releaseStreamingPlatformView$$State, String str) {
            super("onStreamingPlatform", OneExecutionStateStrategy.class);
            this.f27257a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseStreamingPlatformView releaseStreamingPlatformView) {
            releaseStreamingPlatformView.mo15236T0(this.f27257a);
        }
    }

    /* compiled from: ReleaseStreamingPlatformView$$State.java */
    public class OnThirdPartyStreamingPlatformCommand extends ViewCommand<ReleaseStreamingPlatformView> {
        public OnThirdPartyStreamingPlatformCommand(ReleaseStreamingPlatformView$$State releaseStreamingPlatformView$$State) {
            super("onThirdPartyStreamingPlatform", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseStreamingPlatformView releaseStreamingPlatformView) {
            releaseStreamingPlatformView.mo15235K0();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.streaming.ReleaseStreamingPlatformView
    /* renamed from: K0 */
    public void mo15235K0() {
        OnThirdPartyStreamingPlatformCommand onThirdPartyStreamingPlatformCommand = new OnThirdPartyStreamingPlatformCommand(this);
        this.viewCommands.beforeApply(onThirdPartyStreamingPlatformCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseStreamingPlatformView) it.next()).mo15235K0();
        }
        this.viewCommands.afterApply(onThirdPartyStreamingPlatformCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.streaming.ReleaseStreamingPlatformView
    /* renamed from: T0 */
    public void mo15236T0(String str) {
        OnStreamingPlatformCommand onStreamingPlatformCommand = new OnStreamingPlatformCommand(this, str);
        this.viewCommands.beforeApply(onStreamingPlatformCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseStreamingPlatformView) it.next()).mo15236T0(str);
        }
        this.viewCommands.afterApply(onStreamingPlatformCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.streaming.ReleaseStreamingPlatformView
    /* renamed from: a */
    public void mo15237a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseStreamingPlatformView) it.next()).mo15237a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.streaming.ReleaseStreamingPlatformView
    /* renamed from: b */
    public void mo15238b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseStreamingPlatformView) it.next()).mo15238b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.streaming.ReleaseStreamingPlatformView
    /* renamed from: c */
    public void mo15239c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseStreamingPlatformView) it.next()).mo15239c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }
}
