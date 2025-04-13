package com.swiftsoft.anixartd.presentation.main.episodes;

import com.swiftsoft.anixartd.database.entity.episode.Episode;
import com.swiftsoft.anixartd.database.entity.episode.Source;
import com.swiftsoft.anixartd.database.entity.episode.Type;
import java.util.Iterator;
import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class EpisodesView$$State extends MvpViewState<EpisodesView> implements EpisodesView {

    /* compiled from: EpisodesView$$State.java */
    public class OnAskWhichDownloaderToUseCommand extends ViewCommand<EpisodesView> {

        /* renamed from: a */
        public final Episode f26311a;

        public OnAskWhichDownloaderToUseCommand(EpisodesView$$State episodesView$$State, Episode episode) {
            super("onAskWhichDownloaderToUse", OneExecutionStateStrategy.class);
            this.f26311a = episode;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14607c3(this.f26311a);
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnAskWhichPlayerToUseCommand extends ViewCommand<EpisodesView> {

        /* renamed from: a */
        public final Episode f26312a;

        /* renamed from: b */
        public final int f26313b;

        /* renamed from: c */
        public final boolean f26314c;

        public OnAskWhichPlayerToUseCommand(EpisodesView$$State episodesView$$State, Episode episode, int i2, boolean z) {
            super("onAskWhichPlayerToUse", OneExecutionStateStrategy.class);
            this.f26312a = episode;
            this.f26313b = i2;
            this.f26314c = z;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14616t2(this.f26312a, this.f26313b, this.f26314c);
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnDownloadEpisode1Command extends ViewCommand<EpisodesView> {

        /* renamed from: a */
        public final Episode f26315a;

        /* renamed from: b */
        public final int f26316b;

        /* renamed from: c */
        public final List<String> f26317c;

        public OnDownloadEpisode1Command(EpisodesView$$State episodesView$$State, Episode episode, int i2, List<String> list) {
            super("onDownloadEpisode", OneExecutionStateStrategy.class);
            this.f26315a = episode;
            this.f26316b = i2;
            this.f26317c = list;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14597N1(this.f26315a, this.f26316b, this.f26317c);
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnDownloadEpisodeCommand extends ViewCommand<EpisodesView> {
        public OnDownloadEpisodeCommand(EpisodesView$$State episodesView$$State) {
            super("onDownloadEpisode", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.onDownloadEpisode();
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnDownloadEpisodeDisclaimerCommand extends ViewCommand<EpisodesView> {

        /* renamed from: a */
        public final Episode f26318a;

        public OnDownloadEpisodeDisclaimerCommand(EpisodesView$$State episodesView$$State, Episode episode) {
            super("onDownloadEpisodeDisclaimer", OneExecutionStateStrategy.class);
            this.f26318a = episode;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14618y2(this.f26318a);
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnDownloadEpisodeFailedCommand extends ViewCommand<EpisodesView> {
        public OnDownloadEpisodeFailedCommand(EpisodesView$$State episodesView$$State) {
            super("onDownloadEpisodeFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14602U1();
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnEpisodeDisclaimerCommand extends ViewCommand<EpisodesView> {

        /* renamed from: a */
        public final Episode f26319a;

        public OnEpisodeDisclaimerCommand(EpisodesView$$State episodesView$$State, Episode episode) {
            super("onEpisodeDisclaimer", OneExecutionStateStrategy.class);
            this.f26319a = episode;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14603Z3(this.f26319a);
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnFailedCommand extends ViewCommand<EpisodesView> {
        public OnFailedCommand(EpisodesView$$State episodesView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14606c();
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnHideParsingProgressViewCommand extends ViewCommand<EpisodesView> {
        public OnHideParsingProgressViewCommand(EpisodesView$$State episodesView$$State) {
            super("onHideParsingProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14608d3();
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<EpisodesView> {
        public OnHideProgressViewCommand(EpisodesView$$State episodesView$$State) {
            super("onHideProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14604a();
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnLastWatchedEpisodeCommand extends ViewCommand<EpisodesView> {

        /* renamed from: a */
        public final int f26320a;

        /* renamed from: b */
        public final int f26321b;

        public OnLastWatchedEpisodeCommand(EpisodesView$$State episodesView$$State, int i2, int i3) {
            super("onLastWatchedEpisode", AddToEndStrategy.class);
            this.f26320a = i2;
            this.f26321b = i3;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14599P2(this.f26320a, this.f26321b);
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnLoadedCommand extends ViewCommand<EpisodesView> {
        public OnLoadedCommand(EpisodesView$$State episodesView$$State) {
            super("onLoaded", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14598O();
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnParsingFailedCommand extends ViewCommand<EpisodesView> {

        /* renamed from: a */
        public final String f26322a;

        public OnParsingFailedCommand(EpisodesView$$State episodesView$$State, String str) {
            super("onParsingFailed", OneExecutionStateStrategy.class);
            this.f26322a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14614r3(this.f26322a);
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnReportSentCommand extends ViewCommand<EpisodesView> {
        public OnReportSentCommand(EpisodesView$$State episodesView$$State) {
            super("onReportSent", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14612n();
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnShowEpisodeReportFragmentCommand extends ViewCommand<EpisodesView> {

        /* renamed from: a */
        public final Episode f26323a;

        public OnShowEpisodeReportFragmentCommand(EpisodesView$$State episodesView$$State, Episode episode) {
            super("onShowEpisodeReportFragment", OneExecutionStateStrategy.class);
            this.f26323a = episode;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14615s2(this.f26323a);
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnShowKodikAdCommand extends ViewCommand<EpisodesView> {

        /* renamed from: a */
        public final Episode f26324a;

        /* renamed from: b */
        public final int f26325b;

        /* renamed from: c */
        public final int f26326c;

        public OnShowKodikAdCommand(EpisodesView$$State episodesView$$State, Episode episode, int i2, int i3) {
            super("onShowKodikAd", OneExecutionStateStrategy.class);
            this.f26324a = episode;
            this.f26325b = i2;
            this.f26326c = i3;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14594G3(this.f26324a, this.f26325b, this.f26326c);
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnShowNeedAuthCommand extends ViewCommand<EpisodesView> {
        public OnShowNeedAuthCommand(EpisodesView$$State episodesView$$State) {
            super("onShowNeedAuth", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14611m();
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnShowParsingProgressViewCommand extends ViewCommand<EpisodesView> {
        public OnShowParsingProgressViewCommand(EpisodesView$$State episodesView$$State) {
            super("onShowParsingProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14613p3();
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<EpisodesView> {
        public OnShowProgressViewCommand(EpisodesView$$State episodesView$$State) {
            super("onShowProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14605b();
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnShowTooltipEpisodeUpdatesCommand extends ViewCommand<EpisodesView> {
        public OnShowTooltipEpisodeUpdatesCommand(EpisodesView$$State episodesView$$State) {
            super("onShowTooltipEpisodeUpdates", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14593A1();
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnSourceCommand extends ViewCommand<EpisodesView> {

        /* renamed from: a */
        public final Source f26327a;

        public OnSourceCommand(EpisodesView$$State episodesView$$State, Source source) {
            super("onSource", AddToEndStrategy.class);
            this.f26327a = source;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14609f4(this.f26327a);
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnSwiftPlayerCommand extends ViewCommand<EpisodesView> {

        /* renamed from: a */
        public final List<String> f26328a;

        /* renamed from: b */
        public final String f26329b;

        /* renamed from: c */
        public final Long f26330c;

        public OnSwiftPlayerCommand(EpisodesView$$State episodesView$$State, List<String> list, String str, Long l2) {
            super("onSwiftPlayer", OneExecutionStateStrategy.class);
            this.f26328a = list;
            this.f26329b = str;
            this.f26330c = l2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14601S3(this.f26328a, this.f26329b, this.f26330c);
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnThirdPartyPlayerCommand extends ViewCommand<EpisodesView> {

        /* renamed from: a */
        public final Episode f26331a;

        /* renamed from: b */
        public final String f26332b;

        /* renamed from: c */
        public final List<String> f26333c;

        /* renamed from: d */
        public final int f26334d;

        public OnThirdPartyPlayerCommand(EpisodesView$$State episodesView$$State, Episode episode, String str, List<String> list, int i2) {
            super("onThirdPartyPlayer", OneExecutionStateStrategy.class);
            this.f26331a = episode;
            this.f26332b = str;
            this.f26333c = list;
            this.f26334d = i2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14596L3(this.f26331a, this.f26332b, this.f26333c, this.f26334d);
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnTorlookDisclaimerCommand extends ViewCommand<EpisodesView> {

        /* renamed from: a */
        public final List<Type> f26335a;

        public OnTorlookDisclaimerCommand(EpisodesView$$State episodesView$$State, List<Type> list) {
            super("onTorlookDisclaimer", OneExecutionStateStrategy.class);
            this.f26335a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14610j4(this.f26335a);
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnTypeCommand extends ViewCommand<EpisodesView> {

        /* renamed from: a */
        public final Type f26336a;

        public OnTypeCommand(EpisodesView$$State episodesView$$State, Type type) {
            super("onType", AddToEndStrategy.class);
            this.f26336a = type;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14595H1(this.f26336a);
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnTypesCommand extends ViewCommand<EpisodesView> {
        public OnTypesCommand(EpisodesView$$State episodesView$$State) {
            super("onTypes", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14600R1();
        }
    }

    /* compiled from: EpisodesView$$State.java */
    public class OnWebPlayerCommand extends ViewCommand<EpisodesView> {

        /* renamed from: a */
        public final String f26337a;

        /* renamed from: b */
        public final boolean f26338b;

        public OnWebPlayerCommand(EpisodesView$$State episodesView$$State, String str, boolean z) {
            super("onWebPlayer", OneExecutionStateStrategy.class);
            this.f26337a = str;
            this.f26338b = z;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(EpisodesView episodesView) {
            episodesView.mo14617v2(this.f26337a, this.f26338b);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: A1 */
    public void mo14593A1() {
        OnShowTooltipEpisodeUpdatesCommand onShowTooltipEpisodeUpdatesCommand = new OnShowTooltipEpisodeUpdatesCommand(this);
        this.viewCommands.beforeApply(onShowTooltipEpisodeUpdatesCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14593A1();
        }
        this.viewCommands.afterApply(onShowTooltipEpisodeUpdatesCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: G3 */
    public void mo14594G3(Episode episode, int i2, int i3) {
        OnShowKodikAdCommand onShowKodikAdCommand = new OnShowKodikAdCommand(this, episode, i2, i3);
        this.viewCommands.beforeApply(onShowKodikAdCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14594G3(episode, i2, i3);
        }
        this.viewCommands.afterApply(onShowKodikAdCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: H1 */
    public void mo14595H1(Type type) {
        OnTypeCommand onTypeCommand = new OnTypeCommand(this, type);
        this.viewCommands.beforeApply(onTypeCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14595H1(type);
        }
        this.viewCommands.afterApply(onTypeCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: L3 */
    public void mo14596L3(Episode episode, String str, List<String> list, int i2) {
        OnThirdPartyPlayerCommand onThirdPartyPlayerCommand = new OnThirdPartyPlayerCommand(this, episode, str, list, i2);
        this.viewCommands.beforeApply(onThirdPartyPlayerCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14596L3(episode, str, list, i2);
        }
        this.viewCommands.afterApply(onThirdPartyPlayerCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: N1 */
    public void mo14597N1(Episode episode, int i2, List<String> list) {
        OnDownloadEpisode1Command onDownloadEpisode1Command = new OnDownloadEpisode1Command(this, episode, i2, list);
        this.viewCommands.beforeApply(onDownloadEpisode1Command);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14597N1(episode, i2, list);
        }
        this.viewCommands.afterApply(onDownloadEpisode1Command);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: O */
    public void mo14598O() {
        OnLoadedCommand onLoadedCommand = new OnLoadedCommand(this);
        this.viewCommands.beforeApply(onLoadedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14598O();
        }
        this.viewCommands.afterApply(onLoadedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: P2 */
    public void mo14599P2(int i2, int i3) {
        OnLastWatchedEpisodeCommand onLastWatchedEpisodeCommand = new OnLastWatchedEpisodeCommand(this, i2, i3);
        this.viewCommands.beforeApply(onLastWatchedEpisodeCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14599P2(i2, i3);
        }
        this.viewCommands.afterApply(onLastWatchedEpisodeCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: R1 */
    public void mo14600R1() {
        OnTypesCommand onTypesCommand = new OnTypesCommand(this);
        this.viewCommands.beforeApply(onTypesCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14600R1();
        }
        this.viewCommands.afterApply(onTypesCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: S3 */
    public void mo14601S3(List<String> list, String str, Long l2) {
        OnSwiftPlayerCommand onSwiftPlayerCommand = new OnSwiftPlayerCommand(this, list, str, l2);
        this.viewCommands.beforeApply(onSwiftPlayerCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14601S3(list, str, l2);
        }
        this.viewCommands.afterApply(onSwiftPlayerCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: U1 */
    public void mo14602U1() {
        OnDownloadEpisodeFailedCommand onDownloadEpisodeFailedCommand = new OnDownloadEpisodeFailedCommand(this);
        this.viewCommands.beforeApply(onDownloadEpisodeFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14602U1();
        }
        this.viewCommands.afterApply(onDownloadEpisodeFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: Z3 */
    public void mo14603Z3(Episode episode) {
        OnEpisodeDisclaimerCommand onEpisodeDisclaimerCommand = new OnEpisodeDisclaimerCommand(this, episode);
        this.viewCommands.beforeApply(onEpisodeDisclaimerCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14603Z3(episode);
        }
        this.viewCommands.afterApply(onEpisodeDisclaimerCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: a */
    public void mo14604a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14604a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: b */
    public void mo14605b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14605b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: c */
    public void mo14606c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14606c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: c3 */
    public void mo14607c3(Episode episode) {
        OnAskWhichDownloaderToUseCommand onAskWhichDownloaderToUseCommand = new OnAskWhichDownloaderToUseCommand(this, episode);
        this.viewCommands.beforeApply(onAskWhichDownloaderToUseCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14607c3(episode);
        }
        this.viewCommands.afterApply(onAskWhichDownloaderToUseCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: d3 */
    public void mo14608d3() {
        OnHideParsingProgressViewCommand onHideParsingProgressViewCommand = new OnHideParsingProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideParsingProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14608d3();
        }
        this.viewCommands.afterApply(onHideParsingProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: f4 */
    public void mo14609f4(Source source) {
        OnSourceCommand onSourceCommand = new OnSourceCommand(this, source);
        this.viewCommands.beforeApply(onSourceCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14609f4(source);
        }
        this.viewCommands.afterApply(onSourceCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: j4 */
    public void mo14610j4(List<Type> list) {
        OnTorlookDisclaimerCommand onTorlookDisclaimerCommand = new OnTorlookDisclaimerCommand(this, list);
        this.viewCommands.beforeApply(onTorlookDisclaimerCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14610j4(list);
        }
        this.viewCommands.afterApply(onTorlookDisclaimerCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: m */
    public void mo14611m() {
        OnShowNeedAuthCommand onShowNeedAuthCommand = new OnShowNeedAuthCommand(this);
        this.viewCommands.beforeApply(onShowNeedAuthCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14611m();
        }
        this.viewCommands.afterApply(onShowNeedAuthCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: n */
    public void mo14612n() {
        OnReportSentCommand onReportSentCommand = new OnReportSentCommand(this);
        this.viewCommands.beforeApply(onReportSentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14612n();
        }
        this.viewCommands.afterApply(onReportSentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    public void onDownloadEpisode() {
        OnDownloadEpisodeCommand onDownloadEpisodeCommand = new OnDownloadEpisodeCommand(this);
        this.viewCommands.beforeApply(onDownloadEpisodeCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).onDownloadEpisode();
        }
        this.viewCommands.afterApply(onDownloadEpisodeCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: p3 */
    public void mo14613p3() {
        OnShowParsingProgressViewCommand onShowParsingProgressViewCommand = new OnShowParsingProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowParsingProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14613p3();
        }
        this.viewCommands.afterApply(onShowParsingProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: r3 */
    public void mo14614r3(String str) {
        OnParsingFailedCommand onParsingFailedCommand = new OnParsingFailedCommand(this, str);
        this.viewCommands.beforeApply(onParsingFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14614r3(str);
        }
        this.viewCommands.afterApply(onParsingFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: s2 */
    public void mo14615s2(Episode episode) {
        OnShowEpisodeReportFragmentCommand onShowEpisodeReportFragmentCommand = new OnShowEpisodeReportFragmentCommand(this, episode);
        this.viewCommands.beforeApply(onShowEpisodeReportFragmentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14615s2(episode);
        }
        this.viewCommands.afterApply(onShowEpisodeReportFragmentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: t2 */
    public void mo14616t2(Episode episode, int i2, boolean z) {
        OnAskWhichPlayerToUseCommand onAskWhichPlayerToUseCommand = new OnAskWhichPlayerToUseCommand(this, episode, i2, z);
        this.viewCommands.beforeApply(onAskWhichPlayerToUseCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14616t2(episode, i2, z);
        }
        this.viewCommands.afterApply(onAskWhichPlayerToUseCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: v2 */
    public void mo14617v2(String str, boolean z) {
        OnWebPlayerCommand onWebPlayerCommand = new OnWebPlayerCommand(this, str, z);
        this.viewCommands.beforeApply(onWebPlayerCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14617v2(str, z);
        }
        this.viewCommands.afterApply(onWebPlayerCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.EpisodesView
    /* renamed from: y2 */
    public void mo14618y2(Episode episode) {
        OnDownloadEpisodeDisclaimerCommand onDownloadEpisodeDisclaimerCommand = new OnDownloadEpisodeDisclaimerCommand(this, episode);
        this.viewCommands.beforeApply(onDownloadEpisodeDisclaimerCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((EpisodesView) it.next()).mo14618y2(episode);
        }
        this.viewCommands.afterApply(onDownloadEpisodeDisclaimerCommand);
    }
}
