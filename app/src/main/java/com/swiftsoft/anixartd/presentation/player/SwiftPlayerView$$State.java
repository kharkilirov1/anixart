package com.swiftsoft.anixartd.presentation.player;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class SwiftPlayerView$$State extends MvpViewState<SwiftPlayerView> implements SwiftPlayerView {

    /* compiled from: SwiftPlayerView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<SwiftPlayerView> {
        public OnHideProgressViewCommand(SwiftPlayerView$$State swiftPlayerView$$State) {
            super("onHideProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SwiftPlayerView swiftPlayerView) {
            swiftPlayerView.mo15268a();
        }
    }

    /* compiled from: SwiftPlayerView$$State.java */
    public class OnParsingFailedCommand extends ViewCommand<SwiftPlayerView> {
        public OnParsingFailedCommand(SwiftPlayerView$$State swiftPlayerView$$State) {
            super("onParsingFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SwiftPlayerView swiftPlayerView) {
            swiftPlayerView.mo15271h4();
        }
    }

    /* compiled from: SwiftPlayerView$$State.java */
    public class OnQualitiesCommand extends ViewCommand<SwiftPlayerView> {

        /* renamed from: a */
        public final String f27315a;

        /* renamed from: b */
        public final String f27316b;

        /* renamed from: c */
        public final String f27317c;

        /* renamed from: d */
        public final String f27318d;

        /* renamed from: e */
        public final String f27319e;

        /* renamed from: f */
        public final long f27320f;

        /* renamed from: g */
        public final boolean f27321g;

        /* renamed from: h */
        public final boolean f27322h;

        public OnQualitiesCommand(SwiftPlayerView$$State swiftPlayerView$$State, String str, String str2, String str3, String str4, String str5, long j2, boolean z, boolean z2) {
            super("onQualities", OneExecutionStateStrategy.class);
            this.f27315a = str;
            this.f27316b = str2;
            this.f27317c = str3;
            this.f27318d = str4;
            this.f27319e = str5;
            this.f27320f = j2;
            this.f27321g = z;
            this.f27322h = z2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SwiftPlayerView swiftPlayerView) {
            swiftPlayerView.mo15273l2(this.f27315a, this.f27316b, this.f27317c, this.f27318d, this.f27319e, this.f27320f, this.f27321g, this.f27322h);
        }
    }

    /* compiled from: SwiftPlayerView$$State.java */
    public class OnSetupEpisodeNameCommand extends ViewCommand<SwiftPlayerView> {
        public OnSetupEpisodeNameCommand(SwiftPlayerView$$State swiftPlayerView$$State) {
            super("onSetupEpisodeName", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SwiftPlayerView swiftPlayerView) {
            swiftPlayerView.mo15269a4();
        }
    }

    /* compiled from: SwiftPlayerView$$State.java */
    public class OnSetupReleaseTitleCommand extends ViewCommand<SwiftPlayerView> {
        public OnSetupReleaseTitleCommand(SwiftPlayerView$$State swiftPlayerView$$State) {
            super("onSetupReleaseTitle", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SwiftPlayerView swiftPlayerView) {
            swiftPlayerView.mo15272l1();
        }
    }

    /* compiled from: SwiftPlayerView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<SwiftPlayerView> {
        public OnShowProgressViewCommand(SwiftPlayerView$$State swiftPlayerView$$State) {
            super("onShowProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SwiftPlayerView swiftPlayerView) {
            swiftPlayerView.mo15270b();
        }
    }

    /* compiled from: SwiftPlayerView$$State.java */
    public class OnShowTooltipPlayerSkipOpeningCommand extends ViewCommand<SwiftPlayerView> {
        public OnShowTooltipPlayerSkipOpeningCommand(SwiftPlayerView$$State swiftPlayerView$$State) {
            super("onShowTooltipPlayerSkipOpening", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SwiftPlayerView swiftPlayerView) {
            swiftPlayerView.mo15267S1();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.player.SwiftPlayerView
    /* renamed from: S1 */
    public void mo15267S1() {
        OnShowTooltipPlayerSkipOpeningCommand onShowTooltipPlayerSkipOpeningCommand = new OnShowTooltipPlayerSkipOpeningCommand(this);
        this.viewCommands.beforeApply(onShowTooltipPlayerSkipOpeningCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SwiftPlayerView) it.next()).mo15267S1();
        }
        this.viewCommands.afterApply(onShowTooltipPlayerSkipOpeningCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.player.SwiftPlayerView
    /* renamed from: a */
    public void mo15268a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SwiftPlayerView) it.next()).mo15268a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.player.SwiftPlayerView
    /* renamed from: a4 */
    public void mo15269a4() {
        OnSetupEpisodeNameCommand onSetupEpisodeNameCommand = new OnSetupEpisodeNameCommand(this);
        this.viewCommands.beforeApply(onSetupEpisodeNameCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SwiftPlayerView) it.next()).mo15269a4();
        }
        this.viewCommands.afterApply(onSetupEpisodeNameCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.player.SwiftPlayerView
    /* renamed from: b */
    public void mo15270b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SwiftPlayerView) it.next()).mo15270b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.player.SwiftPlayerView
    /* renamed from: h4 */
    public void mo15271h4() {
        OnParsingFailedCommand onParsingFailedCommand = new OnParsingFailedCommand(this);
        this.viewCommands.beforeApply(onParsingFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SwiftPlayerView) it.next()).mo15271h4();
        }
        this.viewCommands.afterApply(onParsingFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.player.SwiftPlayerView
    /* renamed from: l1 */
    public void mo15272l1() {
        OnSetupReleaseTitleCommand onSetupReleaseTitleCommand = new OnSetupReleaseTitleCommand(this);
        this.viewCommands.beforeApply(onSetupReleaseTitleCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SwiftPlayerView) it.next()).mo15272l1();
        }
        this.viewCommands.afterApply(onSetupReleaseTitleCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.player.SwiftPlayerView
    /* renamed from: l2 */
    public void mo15273l2(String str, String str2, String str3, String str4, String str5, long j2, boolean z, boolean z2) {
        OnQualitiesCommand onQualitiesCommand = new OnQualitiesCommand(this, str, str2, str3, str4, str5, j2, z, z2);
        this.viewCommands.beforeApply(onQualitiesCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SwiftPlayerView) it.next()).mo15273l2(str, str2, str3, str4, str5, j2, z, z2);
        }
        this.viewCommands.afterApply(onQualitiesCommand);
    }
}
