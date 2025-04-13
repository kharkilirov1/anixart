package com.swiftsoft.anixartd.presentation.main.preference;

import com.swiftsoft.anixartd.database.entity.Release;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ProfileReleaseNotificationPreferencesView$$State extends MvpViewState<ProfileReleaseNotificationPreferencesView> implements ProfileReleaseNotificationPreferencesView {

    /* compiled from: ProfileReleaseNotificationPreferencesView$$State.java */
    public class OnFailedCommand extends ViewCommand<ProfileReleaseNotificationPreferencesView> {
        public OnFailedCommand(ProfileReleaseNotificationPreferencesView$$State profileReleaseNotificationPreferencesView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseNotificationPreferencesView profileReleaseNotificationPreferencesView) {
            profileReleaseNotificationPreferencesView.mo14763c();
        }
    }

    /* compiled from: ProfileReleaseNotificationPreferencesView$$State.java */
    public class OnHideLoadingViewCommand extends ViewCommand<ProfileReleaseNotificationPreferencesView> {
        public OnHideLoadingViewCommand(ProfileReleaseNotificationPreferencesView$$State profileReleaseNotificationPreferencesView$$State) {
            super("onHideLoadingView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseNotificationPreferencesView profileReleaseNotificationPreferencesView) {
            profileReleaseNotificationPreferencesView.mo14769j();
        }
    }

    /* compiled from: ProfileReleaseNotificationPreferencesView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ProfileReleaseNotificationPreferencesView> {
        public OnHideProgressViewCommand(ProfileReleaseNotificationPreferencesView$$State profileReleaseNotificationPreferencesView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseNotificationPreferencesView profileReleaseNotificationPreferencesView) {
            profileReleaseNotificationPreferencesView.mo14761a();
        }
    }

    /* compiled from: ProfileReleaseNotificationPreferencesView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<ProfileReleaseNotificationPreferencesView> {
        public OnHideRefreshViewCommand(ProfileReleaseNotificationPreferencesView$$State profileReleaseNotificationPreferencesView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseNotificationPreferencesView profileReleaseNotificationPreferencesView) {
            profileReleaseNotificationPreferencesView.mo14765e();
        }
    }

    /* compiled from: ProfileReleaseNotificationPreferencesView$$State.java */
    public class OnReleaseCommand extends ViewCommand<ProfileReleaseNotificationPreferencesView> {

        /* renamed from: a */
        public final Release f26564a;

        public OnReleaseCommand(ProfileReleaseNotificationPreferencesView$$State profileReleaseNotificationPreferencesView$$State, Release release) {
            super("onRelease", OneExecutionStateStrategy.class);
            this.f26564a = release;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseNotificationPreferencesView profileReleaseNotificationPreferencesView) {
            profileReleaseNotificationPreferencesView.mo14768i(this.f26564a);
        }
    }

    /* compiled from: ProfileReleaseNotificationPreferencesView$$State.java */
    public class OnReleaseTypeNotificationPreferencesCommand extends ViewCommand<ProfileReleaseNotificationPreferencesView> {

        /* renamed from: a */
        public final long f26565a;

        public OnReleaseTypeNotificationPreferencesCommand(ProfileReleaseNotificationPreferencesView$$State profileReleaseNotificationPreferencesView$$State, long j2) {
            super("onReleaseTypeNotificationPreferences", OneExecutionStateStrategy.class);
            this.f26565a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseNotificationPreferencesView profileReleaseNotificationPreferencesView) {
            profileReleaseNotificationPreferencesView.mo14766e1(this.f26565a);
        }
    }

    /* compiled from: ProfileReleaseNotificationPreferencesView$$State.java */
    public class OnShowLoadingViewCommand extends ViewCommand<ProfileReleaseNotificationPreferencesView> {
        public OnShowLoadingViewCommand(ProfileReleaseNotificationPreferencesView$$State profileReleaseNotificationPreferencesView$$State) {
            super("onShowLoadingView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseNotificationPreferencesView profileReleaseNotificationPreferencesView) {
            profileReleaseNotificationPreferencesView.mo14767h();
        }
    }

    /* compiled from: ProfileReleaseNotificationPreferencesView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ProfileReleaseNotificationPreferencesView> {
        public OnShowProgressViewCommand(ProfileReleaseNotificationPreferencesView$$State profileReleaseNotificationPreferencesView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseNotificationPreferencesView profileReleaseNotificationPreferencesView) {
            profileReleaseNotificationPreferencesView.mo14762b();
        }
    }

    /* compiled from: ProfileReleaseNotificationPreferencesView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<ProfileReleaseNotificationPreferencesView> {
        public OnShowRefreshViewCommand(ProfileReleaseNotificationPreferencesView$$State profileReleaseNotificationPreferencesView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileReleaseNotificationPreferencesView profileReleaseNotificationPreferencesView) {
            profileReleaseNotificationPreferencesView.mo14764d();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesView
    /* renamed from: a */
    public void mo14761a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseNotificationPreferencesView) it.next()).mo14761a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesView
    /* renamed from: b */
    public void mo14762b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseNotificationPreferencesView) it.next()).mo14762b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesView
    /* renamed from: c */
    public void mo14763c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseNotificationPreferencesView) it.next()).mo14763c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesView
    /* renamed from: d */
    public void mo14764d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseNotificationPreferencesView) it.next()).mo14764d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesView
    /* renamed from: e */
    public void mo14765e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseNotificationPreferencesView) it.next()).mo14765e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesView
    /* renamed from: e1 */
    public void mo14766e1(long j2) {
        OnReleaseTypeNotificationPreferencesCommand onReleaseTypeNotificationPreferencesCommand = new OnReleaseTypeNotificationPreferencesCommand(this, j2);
        this.viewCommands.beforeApply(onReleaseTypeNotificationPreferencesCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseNotificationPreferencesView) it.next()).mo14766e1(j2);
        }
        this.viewCommands.afterApply(onReleaseTypeNotificationPreferencesCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesView
    /* renamed from: h */
    public void mo14767h() {
        OnShowLoadingViewCommand onShowLoadingViewCommand = new OnShowLoadingViewCommand(this);
        this.viewCommands.beforeApply(onShowLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseNotificationPreferencesView) it.next()).mo14767h();
        }
        this.viewCommands.afterApply(onShowLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesView
    /* renamed from: i */
    public void mo14768i(Release release) {
        OnReleaseCommand onReleaseCommand = new OnReleaseCommand(this, release);
        this.viewCommands.beforeApply(onReleaseCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseNotificationPreferencesView) it.next()).mo14768i(release);
        }
        this.viewCommands.afterApply(onReleaseCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesView
    /* renamed from: j */
    public void mo14769j() {
        OnHideLoadingViewCommand onHideLoadingViewCommand = new OnHideLoadingViewCommand(this);
        this.viewCommands.beforeApply(onHideLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileReleaseNotificationPreferencesView) it.next()).mo14769j();
        }
        this.viewCommands.afterApply(onHideLoadingViewCommand);
    }
}
