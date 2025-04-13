package com.swiftsoft.anixartd.presentation.main.profile.videos;

import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ProfileReleaseVideoAppealsView$$State extends MvpViewState<ProfileReleaseVideoAppealsView> implements ProfileReleaseVideoAppealsView {

    /* compiled from: ProfileReleaseVideoAppealsView$$State.java */
    public class OnFailedCommand extends ViewCommand<ProfileReleaseVideoAppealsView> {
        public OnFailedCommand(ProfileReleaseVideoAppealsView$$State profileReleaseVideoAppealsView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVideoAppealsView profileReleaseVideoAppealsView) {
            profileReleaseVideoAppealsView.mo14941c();
        }
    }

    /* compiled from: ProfileReleaseVideoAppealsView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ProfileReleaseVideoAppealsView> {
        public OnHideProgressViewCommand(ProfileReleaseVideoAppealsView$$State profileReleaseVideoAppealsView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVideoAppealsView profileReleaseVideoAppealsView) {
            profileReleaseVideoAppealsView.mo14939a();
        }
    }

    /* compiled from: ProfileReleaseVideoAppealsView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<ProfileReleaseVideoAppealsView> {
        public OnHideRefreshViewCommand(ProfileReleaseVideoAppealsView$$State profileReleaseVideoAppealsView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVideoAppealsView profileReleaseVideoAppealsView) {
            profileReleaseVideoAppealsView.mo14943e();
        }
    }

    /* compiled from: ProfileReleaseVideoAppealsView$$State.java */
    public class OnReleaseVideoAppealDeleteFailedCommand extends ViewCommand<ProfileReleaseVideoAppealsView> {
        public OnReleaseVideoAppealDeleteFailedCommand(ProfileReleaseVideoAppealsView$$State profileReleaseVideoAppealsView$$State) {
            super("onReleaseVideoAppealDeleteFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVideoAppealsView profileReleaseVideoAppealsView) {
            profileReleaseVideoAppealsView.mo14944u0();
        }
    }

    /* compiled from: ProfileReleaseVideoAppealsView$$State.java */
    public class OnReleaseVideoAppealDeletedCommand extends ViewCommand<ProfileReleaseVideoAppealsView> {

        /* renamed from: a */
        public final ReleaseVideo f26826a;

        public OnReleaseVideoAppealDeletedCommand(ProfileReleaseVideoAppealsView$$State profileReleaseVideoAppealsView$$State, ReleaseVideo releaseVideo) {
            super("onReleaseVideoAppealDeleted", OneExecutionStateStrategy.class);
            this.f26826a = releaseVideo;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVideoAppealsView profileReleaseVideoAppealsView) {
            profileReleaseVideoAppealsView.mo14938U0(this.f26826a);
        }
    }

    /* compiled from: ProfileReleaseVideoAppealsView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ProfileReleaseVideoAppealsView> {
        public OnShowProgressViewCommand(ProfileReleaseVideoAppealsView$$State profileReleaseVideoAppealsView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVideoAppealsView profileReleaseVideoAppealsView) {
            profileReleaseVideoAppealsView.mo14940b();
        }
    }

    /* compiled from: ProfileReleaseVideoAppealsView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<ProfileReleaseVideoAppealsView> {
        public OnShowRefreshViewCommand(ProfileReleaseVideoAppealsView$$State profileReleaseVideoAppealsView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVideoAppealsView profileReleaseVideoAppealsView) {
            profileReleaseVideoAppealsView.mo14942d();
        }
    }

    /* compiled from: ProfileReleaseVideoAppealsView$$State.java */
    public class OnVideoAppealDeleteCommand extends ViewCommand<ProfileReleaseVideoAppealsView> {

        /* renamed from: a */
        public final ReleaseVideo f26827a;

        public OnVideoAppealDeleteCommand(ProfileReleaseVideoAppealsView$$State profileReleaseVideoAppealsView$$State, ReleaseVideo releaseVideo) {
            super("onVideoAppealDelete", OneExecutionStateStrategy.class);
            this.f26827a = releaseVideo;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVideoAppealsView profileReleaseVideoAppealsView) {
            profileReleaseVideoAppealsView.mo14945x0(this.f26827a);
        }
    }

    /* compiled from: ProfileReleaseVideoAppealsView$$State.java */
    public class OnVideoCommand extends ViewCommand<ProfileReleaseVideoAppealsView> {

        /* renamed from: a */
        public final ReleaseVideo f26828a;

        public OnVideoCommand(ProfileReleaseVideoAppealsView$$State profileReleaseVideoAppealsView$$State, ReleaseVideo releaseVideo) {
            super("onVideo", OneExecutionStateStrategy.class);
            this.f26828a = releaseVideo;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseVideoAppealsView profileReleaseVideoAppealsView) {
            profileReleaseVideoAppealsView.mo14937K(this.f26828a);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideoAppealsView
    /* renamed from: K */
    public void mo14937K(ReleaseVideo releaseVideo) {
        OnVideoCommand onVideoCommand = new OnVideoCommand(this, releaseVideo);
        this.viewCommands.beforeApply(onVideoCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVideoAppealsView) it.next()).mo14937K(releaseVideo);
        }
        this.viewCommands.afterApply(onVideoCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideoAppealsView
    /* renamed from: U0 */
    public void mo14938U0(ReleaseVideo releaseVideo) {
        OnReleaseVideoAppealDeletedCommand onReleaseVideoAppealDeletedCommand = new OnReleaseVideoAppealDeletedCommand(this, releaseVideo);
        this.viewCommands.beforeApply(onReleaseVideoAppealDeletedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVideoAppealsView) it.next()).mo14938U0(releaseVideo);
        }
        this.viewCommands.afterApply(onReleaseVideoAppealDeletedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideoAppealsView
    /* renamed from: a */
    public void mo14939a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVideoAppealsView) it.next()).mo14939a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideoAppealsView
    /* renamed from: b */
    public void mo14940b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVideoAppealsView) it.next()).mo14940b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideoAppealsView
    /* renamed from: c */
    public void mo14941c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVideoAppealsView) it.next()).mo14941c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideoAppealsView
    /* renamed from: d */
    public void mo14942d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVideoAppealsView) it.next()).mo14942d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideoAppealsView
    /* renamed from: e */
    public void mo14943e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVideoAppealsView) it.next()).mo14943e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideoAppealsView
    /* renamed from: u0 */
    public void mo14944u0() {
        OnReleaseVideoAppealDeleteFailedCommand onReleaseVideoAppealDeleteFailedCommand = new OnReleaseVideoAppealDeleteFailedCommand(this);
        this.viewCommands.beforeApply(onReleaseVideoAppealDeleteFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVideoAppealsView) it.next()).mo14944u0();
        }
        this.viewCommands.afterApply(onReleaseVideoAppealDeleteFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideoAppealsView
    /* renamed from: x0 */
    public void mo14945x0(ReleaseVideo releaseVideo) {
        OnVideoAppealDeleteCommand onVideoAppealDeleteCommand = new OnVideoAppealDeleteCommand(this, releaseVideo);
        this.viewCommands.beforeApply(onVideoAppealDeleteCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseVideoAppealsView) it.next()).mo14945x0(releaseVideo);
        }
        this.viewCommands.afterApply(onVideoAppealDeleteCommand);
    }
}
