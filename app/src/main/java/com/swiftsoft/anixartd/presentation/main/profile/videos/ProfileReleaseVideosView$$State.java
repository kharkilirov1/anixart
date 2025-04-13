package com.swiftsoft.anixartd.presentation.main.profile.videos;

import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ProfileReleaseVideosView$$State extends MvpViewState<ProfileReleaseVideosView> implements ProfileReleaseVideosView {

    /* compiled from: ProfileReleaseVideosView$$State.java */
    public class OnFailedCommand extends ViewCommand<ProfileReleaseVideosView> {
        public OnFailedCommand(ProfileReleaseVideosView$$State profileReleaseVideosView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVideosView profileReleaseVideosView) {
            profileReleaseVideosView.mo14961c();
        }
    }

    /* compiled from: ProfileReleaseVideosView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ProfileReleaseVideosView> {
        public OnHideProgressViewCommand(ProfileReleaseVideosView$$State profileReleaseVideosView$$State) {
            super("onHideProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVideosView profileReleaseVideosView) {
            profileReleaseVideosView.mo14959a();
        }
    }

    /* compiled from: ProfileReleaseVideosView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<ProfileReleaseVideosView> {
        public OnHideRefreshViewCommand(ProfileReleaseVideosView$$State profileReleaseVideosView$$State) {
            super("onHideRefreshView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVideosView profileReleaseVideosView) {
            profileReleaseVideosView.mo14963e();
        }
    }

    /* compiled from: ProfileReleaseVideosView$$State.java */
    public class OnProfileCommand extends ViewCommand<ProfileReleaseVideosView> {

        /* renamed from: a */
        public final long f26859a;

        public OnProfileCommand(ProfileReleaseVideosView$$State profileReleaseVideosView$$State, long j2) {
            super("onProfile", OneExecutionStateStrategy.class);
            this.f26859a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVideosView profileReleaseVideosView) {
            profileReleaseVideosView.mo14964f(this.f26859a);
        }
    }

    /* compiled from: ProfileReleaseVideosView$$State.java */
    public class OnRefreshAfterSortCommand extends ViewCommand<ProfileReleaseVideosView> {
        public OnRefreshAfterSortCommand(ProfileReleaseVideosView$$State profileReleaseVideosView$$State) {
            super("onRefreshAfterSort", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVideosView profileReleaseVideosView) {
            profileReleaseVideosView.mo14966l();
        }
    }

    /* compiled from: ProfileReleaseVideosView$$State.java */
    public class OnReleaseVideoAppealDeleteFailedCommand extends ViewCommand<ProfileReleaseVideosView> {
        public OnReleaseVideoAppealDeleteFailedCommand(ProfileReleaseVideosView$$State profileReleaseVideosView$$State) {
            super("onReleaseVideoAppealDeleteFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVideosView profileReleaseVideosView) {
            profileReleaseVideosView.mo14967u0();
        }
    }

    /* compiled from: ProfileReleaseVideosView$$State.java */
    public class OnReleaseVideoAppealDeletedCommand extends ViewCommand<ProfileReleaseVideosView> {

        /* renamed from: a */
        public final ReleaseVideo f26860a;

        public OnReleaseVideoAppealDeletedCommand(ProfileReleaseVideosView$$State profileReleaseVideosView$$State, ReleaseVideo releaseVideo) {
            super("onReleaseVideoAppealDeleted", OneExecutionStateStrategy.class);
            this.f26860a = releaseVideo;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVideosView profileReleaseVideosView) {
            profileReleaseVideosView.mo14957U0(this.f26860a);
        }
    }

    /* compiled from: ProfileReleaseVideosView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ProfileReleaseVideosView> {
        public OnShowProgressViewCommand(ProfileReleaseVideosView$$State profileReleaseVideosView$$State) {
            super("onShowProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVideosView profileReleaseVideosView) {
            profileReleaseVideosView.mo14960b();
        }
    }

    /* compiled from: ProfileReleaseVideosView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<ProfileReleaseVideosView> {
        public OnShowRefreshViewCommand(ProfileReleaseVideosView$$State profileReleaseVideosView$$State) {
            super("onShowRefreshView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVideosView profileReleaseVideosView) {
            profileReleaseVideosView.mo14962d();
        }
    }

    /* compiled from: ProfileReleaseVideosView$$State.java */
    public class OnVideoAppealDeleteCommand extends ViewCommand<ProfileReleaseVideosView> {

        /* renamed from: a */
        public final ReleaseVideo f26861a;

        public OnVideoAppealDeleteCommand(ProfileReleaseVideosView$$State profileReleaseVideosView$$State, ReleaseVideo releaseVideo) {
            super("onVideoAppealDelete", OneExecutionStateStrategy.class);
            this.f26861a = releaseVideo;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVideosView profileReleaseVideosView) {
            profileReleaseVideosView.mo14969x0(this.f26861a);
        }
    }

    /* compiled from: ProfileReleaseVideosView$$State.java */
    public class OnVideoAppealsCommand extends ViewCommand<ProfileReleaseVideosView> {
        public OnVideoAppealsCommand(ProfileReleaseVideosView$$State profileReleaseVideosView$$State) {
            super("onVideoAppeals", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVideosView profileReleaseVideosView) {
            profileReleaseVideosView.mo14958V2();
        }
    }

    /* compiled from: ProfileReleaseVideosView$$State.java */
    public class OnVideoCommand extends ViewCommand<ProfileReleaseVideosView> {

        /* renamed from: a */
        public final ReleaseVideo f26862a;

        public OnVideoCommand(ProfileReleaseVideosView$$State profileReleaseVideosView$$State, ReleaseVideo releaseVideo) {
            super("onVideo", OneExecutionStateStrategy.class);
            this.f26862a = releaseVideo;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVideosView profileReleaseVideosView) {
            profileReleaseVideosView.mo14956K(this.f26862a);
        }
    }

    /* compiled from: ProfileReleaseVideosView$$State.java */
    public class OnVideoUploadsCommand extends ViewCommand<ProfileReleaseVideosView> {

        /* renamed from: a */
        public final long f26863a;

        /* renamed from: b */
        public final long f26864b;

        public OnVideoUploadsCommand(ProfileReleaseVideosView$$State profileReleaseVideosView$$State, long j2, long j3) {
            super("onVideoUploads", OneExecutionStateStrategy.class);
            this.f26863a = j2;
            this.f26864b = j3;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVideosView profileReleaseVideosView) {
            profileReleaseVideosView.mo14965k3(this.f26863a, this.f26864b);
        }
    }

    /* compiled from: ProfileReleaseVideosView$$State.java */
    public class OnVideosCommand extends ViewCommand<ProfileReleaseVideosView> {

        /* renamed from: a */
        public final long f26865a;

        /* renamed from: b */
        public final long f26866b;

        public OnVideosCommand(ProfileReleaseVideosView$$State profileReleaseVideosView$$State, long j2, long j3) {
            super("onVideos", OneExecutionStateStrategy.class);
            this.f26865a = j2;
            this.f26866b = j3;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVideosView profileReleaseVideosView) {
            profileReleaseVideosView.mo14968w1(this.f26865a, this.f26866b);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: K */
    public void mo14956K(ReleaseVideo releaseVideo) {
        OnVideoCommand onVideoCommand = new OnVideoCommand(this, releaseVideo);
        this.viewCommands.beforeApply(onVideoCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVideosView) it.next()).mo14956K(releaseVideo);
        }
        this.viewCommands.afterApply(onVideoCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: U0 */
    public void mo14957U0(ReleaseVideo releaseVideo) {
        OnReleaseVideoAppealDeletedCommand onReleaseVideoAppealDeletedCommand = new OnReleaseVideoAppealDeletedCommand(this, releaseVideo);
        this.viewCommands.beforeApply(onReleaseVideoAppealDeletedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVideosView) it.next()).mo14957U0(releaseVideo);
        }
        this.viewCommands.afterApply(onReleaseVideoAppealDeletedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: V2 */
    public void mo14958V2() {
        OnVideoAppealsCommand onVideoAppealsCommand = new OnVideoAppealsCommand(this);
        this.viewCommands.beforeApply(onVideoAppealsCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVideosView) it.next()).mo14958V2();
        }
        this.viewCommands.afterApply(onVideoAppealsCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: a */
    public void mo14959a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVideosView) it.next()).mo14959a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: b */
    public void mo14960b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVideosView) it.next()).mo14960b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: c */
    public void mo14961c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVideosView) it.next()).mo14961c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: d */
    public void mo14962d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVideosView) it.next()).mo14962d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: e */
    public void mo14963e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVideosView) it.next()).mo14963e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: f */
    public void mo14964f(long j2) {
        OnProfileCommand onProfileCommand = new OnProfileCommand(this, j2);
        this.viewCommands.beforeApply(onProfileCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVideosView) it.next()).mo14964f(j2);
        }
        this.viewCommands.afterApply(onProfileCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: k3 */
    public void mo14965k3(long j2, long j3) {
        OnVideoUploadsCommand onVideoUploadsCommand = new OnVideoUploadsCommand(this, j2, j3);
        this.viewCommands.beforeApply(onVideoUploadsCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVideosView) it.next()).mo14965k3(j2, j3);
        }
        this.viewCommands.afterApply(onVideoUploadsCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: l */
    public void mo14966l() {
        OnRefreshAfterSortCommand onRefreshAfterSortCommand = new OnRefreshAfterSortCommand(this);
        this.viewCommands.beforeApply(onRefreshAfterSortCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVideosView) it.next()).mo14966l();
        }
        this.viewCommands.afterApply(onRefreshAfterSortCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: u0 */
    public void mo14967u0() {
        OnReleaseVideoAppealDeleteFailedCommand onReleaseVideoAppealDeleteFailedCommand = new OnReleaseVideoAppealDeleteFailedCommand(this);
        this.viewCommands.beforeApply(onReleaseVideoAppealDeleteFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVideosView) it.next()).mo14967u0();
        }
        this.viewCommands.afterApply(onReleaseVideoAppealDeleteFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: w1 */
    public void mo14968w1(long j2, long j3) {
        OnVideosCommand onVideosCommand = new OnVideosCommand(this, j2, j3);
        this.viewCommands.beforeApply(onVideosCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVideosView) it.next()).mo14968w1(j2, j3);
        }
        this.viewCommands.afterApply(onVideosCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: x0 */
    public void mo14969x0(ReleaseVideo releaseVideo) {
        OnVideoAppealDeleteCommand onVideoAppealDeleteCommand = new OnVideoAppealDeleteCommand(this, releaseVideo);
        this.viewCommands.beforeApply(onVideoAppealDeleteCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVideosView) it.next()).mo14969x0(releaseVideo);
        }
        this.viewCommands.afterApply(onVideoAppealDeleteCommand);
    }
}
